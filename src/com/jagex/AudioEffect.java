package com.jagex;

public class AudioEffect {

    AudioInstrument[] instruments = new AudioInstrument[10];
    int start;
    int end;


    AudioEffect(Buffer var1) {
        for (int var2 = 0; var2 < 10; ++var2) {
            int var3 = var1.readUByte();
            if (var3 != 0) {
                var1.caret -= -99503879;
                this.instruments[var2] = new AudioInstrument();
                this.instruments[var2].decode(var1);
            }
        }

        this.start = var1.readUShort();
        this.end = var1.readUShort();
    }

    public static AudioEffect get(ReferenceTable var0, int var1, int var2) {
        byte[] buff = var0.getFile(var1, var2, (short) 15074);
        return buff == null ? null : new AudioEffect(new Buffer(buff));
    }

    public final int i() {
        int var1 = 9999999;

        int var2;
        for (var2 = 0; var2 < 10; ++var2) {
            if (this.instruments[var2] != null && this.instruments[var2].start / 20 < var1) {
                var1 = this.instruments[var2].start / 20;
            }
        }

        if (this.start < this.end && this.start / 20 < var1) {
            var1 = this.start / 20;
        }

        if (var1 != 9999999 && var1 != 0) {
            for (var2 = 0; var2 < 10; ++var2) {
                if (this.instruments[var2] != null) {
                    this.instruments[var2].start -= var1 * 20;
                }
            }

            if (this.start < this.end) {
                this.start -= var1 * 20;
                this.end -= var1 * 20;
            }

            return var1;
        }
        return 0;
    }

    public classBl v() {
        byte[] var1 = this.createMix();
        return new classBl(22050, var1, this.start * 22050 / 1000, this.end * 22050 / 1000);
    }

    final byte[] createMix() {
        int var1 = 0;

        int var2;
        for (var2 = 0; var2 < 10; ++var2) {
            if (this.instruments[var2] != null && this.instruments[var2].duration + this.instruments[var2].start > var1) {
                var1 = this.instruments[var2].duration + this.instruments[var2].start;
            }
        }

        if (var1 == 0) {
            return new byte[0];
        }
        var2 = 22050 * var1 / 1000;
        byte[] var3 = new byte[var2];

        for (int var4 = 0; var4 < 10; ++var4) {
            if (this.instruments[var4] != null) {
                int var5 = this.instruments[var4].duration * 22050 / 1000;
                int var6 = this.instruments[var4].start * 22050 / 1000;
                int[] var7 = this.instruments[var4].synthesize(var5, this.instruments[var4].duration);

                for (int var8 = 0; var8 < var5; ++var8) {
                    int var9 = var3[var8 + var6] + (var7[var8] >> 8);
                    if ((var9 + 128 & -256) != 0) {
                        var9 = var9 >> 31 ^ 127;
                    }

                    var3[var8 + var6] = (byte) var9;
                }
            }
        }

        return var3;
    }
}
