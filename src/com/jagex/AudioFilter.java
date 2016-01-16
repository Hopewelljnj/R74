package com.jagex;

public class AudioFilter {

    static float fieldE;
    static int[][] coefficients = new int[2][8];
    static int fieldN;
    static float[][] coeficients = new float[2][8];
    int[][][] phasePairs = new int[2][2][4];
    int[][][] directionPairs = new int[2][2][4];
    int[] unity = new int[2];
    int[] pairCounts = new int[2];

    static float method262(float var0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) var0);
        return var1 * 3.1415927F / 11025.0F;
    }

    float forDirection(int dir, int var2, float var3) {
        float var4 = (float) this.directionPairs[dir][0][var2] + var3 * (float) (this.directionPairs[dir][1][var2] - this.directionPairs[dir][0][var2]);
        var4 *= 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var4 / 20.0F));
    }

    float i(int var1, int var2, float var3) {
        float var4 = (float) this.phasePairs[var1][0][var2] + var3 * (float) (this.phasePairs[var1][1][var2] - this.phasePairs[var1][0][var2]);
        var4 *= 1.2207031E-4F;
        return method262(var4);
    }

    int calculate(int var1, float var2) {
        float var3;
        if (var1 == 0) {
            var3 = (float) this.unity[0] + (float) (this.unity[1] - this.unity[0]) * var2;
            var3 *= 0.0030517578F;
            fieldE = (float) Math.pow(0.1D, (double) (var3 / 20.0F));
            fieldN = (int) (fieldE * 65536.0F);
        }

        if (this.pairCounts[var1] == 0) {
            return 0;
        }
        var3 = this.forDirection(var1, 0, var2);
        coeficients[var1][0] = -2.0F * var3 * (float) Math.cos((double) this.i(var1, 0, var2));
        coeficients[var1][1] = var3 * var3;

        int var4;
        for (var4 = 1; var4 < this.pairCounts[var1]; ++var4) {
            var3 = this.forDirection(var1, var4, var2);
            float var5 = -2.0F * var3 * (float) Math.cos((double) this.i(var1, var4, var2));
            float var6 = var3 * var3;
            coeficients[var1][var4 * 2 + 1] = coeficients[var1][var4 * 2 - 1] * var6;
            coeficients[var1][var4 * 2] = coeficients[var1][var4 * 2 - 1] * var5 + coeficients[var1][var4 * 2 - 2] * var6;

            for (int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
                coeficients[var1][var7] += coeficients[var1][var7 - 1] * var5 + coeficients[var1][var7 - 2] * var6;
            }

            coeficients[var1][1] += coeficients[var1][0] * var5 + var6;
            coeficients[var1][0] += var5;
        }

        if (var1 == 0) {
            for (var4 = 0; var4 < this.pairCounts[0] * 2; ++var4) {
                coeficients[0][var4] *= fieldE;
            }
        }

        for (var4 = 0; var4 < this.pairCounts[var1] * 2; ++var4) {
            coefficients[var1][var4] = (int) (coeficients[var1][var4] * 65536.0F);
        }

        return this.pairCounts[var1] * 2;
    }

    final void decode(Buffer var1, AudioEnvelope var2) {
        int var3 = var1.readUByte();
        this.pairCounts[0] = var3 >> 4;
        this.pairCounts[1] = var3 & 15;
        if (var3 != 0) {
            this.unity[0] = var1.readUShort();
            this.unity[1] = var1.readUShort();
            int var4 = var1.readUByte();

            int var5;
            int var6;
            for (var5 = 0; var5 < 2; ++var5) {
                for (var6 = 0; var6 < this.pairCounts[var5]; ++var6) {
                    this.phasePairs[var5][0][var6] = var1.readUShort();
                    this.directionPairs[var5][0][var6] = var1.readUShort();
                }
            }

            for (var5 = 0; var5 < 2; ++var5) {
                for (var6 = 0; var6 < this.pairCounts[var5]; ++var6) {
                    if ((var4 & 1 << var5 * 4 << var6) != 0) {
                        this.phasePairs[var5][1][var6] = var1.readUShort();
                        this.directionPairs[var5][1][var6] = var1.readUShort();
                    } else {
                        this.phasePairs[var5][1][var6] = this.phasePairs[var5][0][var6];
                        this.directionPairs[var5][1][var6] = this.directionPairs[var5][0][var6];
                    }
                }
            }

            if (var4 != 0 || this.unity[1] != this.unity[0]) {
                var2.v(var1);
            }
        } else {
            int[] var7 = this.unity;
            this.unity[1] = 0;
            var7[0] = 0;
        }

    }
}
