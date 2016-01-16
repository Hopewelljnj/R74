package com.jagex;

import java.util.Random;

public class AudioInstrument {

    static int[] fieldU = new int['\u8000'];
    static int[] sine;
    static int[] phaseStarts;
    static int[] phases;
    static int[] volumeSteps;
    static int[] delays;
    static int[] results;
    static int[] phaseDiffs;
    AudioEnvelope volumeEnvelope;
    AudioEnvelope pitchOffEnvelope;
    AudioEnvelope gatingSignalEnvelope;
    AudioEnvelope volumeOffEnvelope;
    AudioEnvelope volumeAmpEnvelope;
    AudioEnvelope gatingEnvelope;
    int[] oscillatorPitches = new int[]{0, 0, 0, 0, 0};
    int[] oscillatorDelays = new int[]{0, 0, 0, 0, 0};
    int delayTime = 0;
    AudioFilter filter;
    int start = 0;
    AudioEnvelope filterEnvelope;
    int duration = 500;
    int[] oscillatorVolumes = new int[]{0, 0, 0, 0, 0};
    AudioEnvelope pitchEnvelope;
    AudioEnvelope pitchAmpEnvelope;
    int delayResponseTime = 100;


    final int forward(int index, int state, int amp) {
        return amp == 1 ? ((index & 32767) < 16384 ? state : -state) : (amp == 2 ? sine[index & 32767] * state >> 14 : (amp == 3 ? ((index & 32767) * state >> 14) - state : (amp == 4 ? fieldU[index / 2607 & 32767] * state : 0)));
    }

    final void decode(Buffer var1) {
        this.pitchEnvelope = new AudioEnvelope();
        this.pitchEnvelope.decode(var1);
        this.volumeEnvelope = new AudioEnvelope();
        this.volumeEnvelope.decode(var1);
        int var2 = var1.readUByte();
        if (var2 != 0) {
            var1.caret -= -99503879;
            this.pitchOffEnvelope = new AudioEnvelope();
            this.pitchOffEnvelope.decode(var1);
            this.pitchAmpEnvelope = new AudioEnvelope();
            this.pitchAmpEnvelope.decode(var1);
        }

        var2 = var1.readUByte();
        if (var2 != 0) {
            var1.caret -= -99503879;
            this.volumeOffEnvelope = new AudioEnvelope();
            this.volumeOffEnvelope.decode(var1);
            this.volumeAmpEnvelope = new AudioEnvelope();
            this.volumeAmpEnvelope.decode(var1);
        }

        var2 = var1.readUByte();
        if (var2 != 0) {
            var1.caret -= -99503879;
            this.gatingEnvelope = new AudioEnvelope();
            this.gatingEnvelope.decode(var1);
            this.gatingSignalEnvelope = new AudioEnvelope();
            this.gatingSignalEnvelope.decode(var1);
        }

        for (int var3 = 0; var3 < 10; ++var3) {
            int var4 = var1.readImmediateSmart(2100209409);
            if (var4 == 0) {
                break;
            }

            this.oscillatorVolumes[var3] = var4;
            this.oscillatorPitches[var3] = var1.ah(2014036485);
            this.oscillatorDelays[var3] = var1.readImmediateSmart(2053053300);
        }

        this.delayTime = var1.readImmediateSmart(2018479115);
        this.delayResponseTime = var1.readImmediateSmart(2096811117);
        this.duration = var1.readUShort();
        this.start = var1.readUShort();
        this.filter = new AudioFilter();
        this.filterEnvelope = new AudioEnvelope();
        this.filter.decode(var1, this.filterEnvelope);
    }

    final int[] synthesize(int samples, int var2) {
        UtilClass9.method73(results, 0, samples);
        if (var2 < 10) {
            return results;
        }
        double var3 = (double) samples / ((double) var2 + 0.0D);
        this.pitchEnvelope.reset();
        this.volumeEnvelope.reset();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.pitchOffEnvelope != null) {
            this.pitchOffEnvelope.reset();
            this.pitchAmpEnvelope.reset();
            var5 = (int) ((double) (this.pitchOffEnvelope.end - this.pitchOffEnvelope.start) * 32.768D / var3);
            var6 = (int) ((double) this.pitchOffEnvelope.start * 32.768D / var3);
        }

        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.volumeOffEnvelope != null) {
            this.volumeOffEnvelope.reset();
            this.volumeAmpEnvelope.reset();
            var8 = (int) ((double) (this.volumeOffEnvelope.end - this.volumeOffEnvelope.start) * 32.768D / var3);
            var9 = (int) ((double) this.volumeOffEnvelope.start * 32.768D / var3);
        }

        int var11;
        for (var11 = 0; var11 < 5; ++var11) {
            if (this.oscillatorVolumes[var11] != 0) {
                phases[var11] = 0;
                delays[var11] = (int) ((double) this.oscillatorDelays[var11] * var3);
                volumeSteps[var11] = (this.oscillatorVolumes[var11] << 14) / 100;
                phaseDiffs[var11] = (int) ((double) (this.pitchEnvelope.end - this.pitchEnvelope.start) * 32.768D * Math.pow(1.0057929410678534D, (double) this.oscillatorPitches[var11]) / var3);
                phaseStarts[var11] = (int) ((double) this.pitchEnvelope.start * 32.768D / var3);
            }
        }

        int var12;
        int var13;
        int var14;
        int var15;
        for (var11 = 0; var11 < samples; ++var11) {
            var12 = this.pitchEnvelope.forward(samples);
            var13 = this.volumeEnvelope.forward(samples);
            if (this.pitchOffEnvelope != null) {
                var14 = this.pitchOffEnvelope.forward(samples);
                var15 = this.pitchAmpEnvelope.forward(samples);
                var12 += this.forward(var7, var15, this.pitchOffEnvelope.fieldM) >> 1;
                var7 += (var14 * var5 >> 16) + var6;
            }

            if (this.volumeOffEnvelope != null) {
                var14 = this.volumeOffEnvelope.forward(samples);
                var15 = this.volumeAmpEnvelope.forward(samples);
                var13 = var13 * ((this.forward(var10, var15, this.volumeOffEnvelope.fieldM) >> 1) + '\u8000') >> 15;
                var10 += (var14 * var8 >> 16) + var9;
            }

            for (var14 = 0; var14 < 5; ++var14) {
                if (this.oscillatorVolumes[var14] != 0) {
                    var15 = var11 + delays[var14];
                    if (var15 < samples) {
                        results[var15] += this.forward(phases[var14], var13 * volumeSteps[var14] >> 15, this.pitchEnvelope.fieldM);
                        phases[var14] += (var12 * phaseDiffs[var14] >> 16) + phaseStarts[var14];
                    }
                }
            }
        }

        int var16;
        if (this.gatingEnvelope != null) {
            this.gatingEnvelope.reset();
            this.gatingSignalEnvelope.reset();
            var11 = 0;
            boolean var19 = false;
            boolean var20 = true;

            for (var14 = 0; var14 < samples; ++var14) {
                var15 = this.gatingEnvelope.forward(samples);
                var16 = this.gatingSignalEnvelope.forward(samples);
                if (var20) {
                    var12 = this.gatingEnvelope.start + ((this.gatingEnvelope.end - this.gatingEnvelope.start) * var15 >> 8);
                } else {
                    var12 = this.gatingEnvelope.start + ((this.gatingEnvelope.end - this.gatingEnvelope.start) * var16 >> 8);
                }

                var11 += 256;
                if (var11 >= var12) {
                    var11 = 0;
                    var20 = !var20;
                }

                if (var20) {
                    results[var14] = 0;
                }
            }
        }

        if (this.delayTime > 0 && this.delayResponseTime > 0) {
            var11 = (int) ((double) this.delayTime * var3);

            for (var12 = var11; var12 < samples; ++var12) {
                results[var12] += results[var12 - var11] * this.delayResponseTime / 100;
            }
        }

        if (this.filter.pairCounts[0] > 0 || this.filter.pairCounts[1] > 0) {
            this.filterEnvelope.reset();
            var11 = this.filterEnvelope.forward(samples + 1);
            var12 = this.filter.calculate(0, (float) var11 / 65536.0F);
            var13 = this.filter.calculate(1, (float) var11 / 65536.0F);
            if (samples >= var12 + var13) {
                var14 = 0;
                var15 = var13;
                if (var13 > samples - var12) {
                    var15 = samples - var12;
                }

                int var17;
                while (var14 < var15) {
                    var16 = (int) ((long) results[var14 + var12] * (long) AudioFilter.fieldN >> 16);

                    for (var17 = 0; var17 < var12; ++var17) {
                        var16 += (int) ((long) results[var14 + var12 - 1 - var17] * (long) AudioFilter.coefficients[0][var17] >> 16);
                    }

                    for (var17 = 0; var17 < var14; ++var17) {
                        var16 -= (int) ((long) results[var14 - 1 - var17] * (long) AudioFilter.coefficients[1][var17] >> 16);
                    }

                    results[var14] = var16;
                    var11 = this.filterEnvelope.forward(samples + 1);
                    ++var14;
                }

                var15 = 128;

                while (true) {
                    if (var15 > samples - var12) {
                        var15 = samples - var12;
                    }

                    int var18;
                    while (var14 < var15) {
                        var17 = (int) ((long) results[var14 + var12] * (long) AudioFilter.fieldN >> 16);

                        for (var18 = 0; var18 < var12; ++var18) {
                            var17 += (int) ((long) results[var14 + var12 - 1 - var18] * (long) AudioFilter.coefficients[0][var18] >> 16);
                        }

                        for (var18 = 0; var18 < var13; ++var18) {
                            var17 -= (int) ((long) results[var14 - 1 - var18] * (long) AudioFilter.coefficients[1][var18] >> 16);
                        }

                        results[var14] = var17;
                        var11 = this.filterEnvelope.forward(samples + 1);
                        ++var14;
                    }

                    if (var14 >= samples - var12) {
                        while (var14 < samples) {
                            var17 = 0;

                            for (var18 = var14 + var12 - samples; var18 < var12; ++var18) {
                                var17 += (int) ((long) results[var14 + var12 - 1 - var18] * (long) AudioFilter.coefficients[0][var18] >> 16);
                            }

                            for (var18 = 0; var18 < var13; ++var18) {
                                var17 -= (int) ((long) results[var14 - 1 - var18] * (long) AudioFilter.coefficients[1][var18] >> 16);
                            }

                            results[var14] = var17;
                            this.filterEnvelope.forward(samples + 1);
                            ++var14;
                        }
                        break;
                    }

                    var12 = this.filter.calculate(0, (float) var11 / 65536.0F);
                    var13 = this.filter.calculate(1, (float) var11 / 65536.0F);
                    var15 += 128;
                }
            }
        }

        for (var11 = 0; var11 < samples; ++var11) {
            if (results[var11] < -32768) {
                results[var11] = -32768;
            }

            if (results[var11] > 32767) {
                results[var11] = 32767;
            }
        }

        return results;
    }

    static {
        Random var0 = new Random(0L);

        int var1;
        for (var1 = 0; var1 < '\u8000'; ++var1) {
            fieldU[var1] = (var0.nextInt() & 2) - 1;
        }

        sine = new int['\u8000'];

        for (var1 = 0; var1 < '\u8000'; ++var1) {
            sine[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }

        results = new int[220500];
        phases = new int[5];
        delays = new int[5];
        volumeSteps = new int[5];
        phaseDiffs = new int[5];
        phaseStarts = new int[5];
    }
}
