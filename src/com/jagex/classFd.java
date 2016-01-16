package com.jagex;

public class classFd {

    static final byte[] fieldS = new byte[]{(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    int[] fieldB;
    int fieldV;
    int[] fieldI;
    int[] fieldL;
    int[] fieldM;
    int fieldW;
    Buffer fieldA = new Buffer((byte[]) null);
    long fieldN;


    classFd(byte[] var1) {
        this.a(var1);
    }

    classFd() {
    }

    boolean i() {
        return this.fieldA.payload != null;
    }

    boolean x() {
        int var1 = this.fieldB.length;

        for (int var2 = 0; var2 < var1; ++var2) {
            if (this.fieldB[var2] >= 0) {
                return false;
            }
        }

        return true;
    }

    void m(int var1) {
        this.fieldB[var1] = this.fieldA.caret * 651432265;
    }

    void w() {
        this.fieldA.caret = 99503879;
    }

    void e(int var1) {
        int var2 = this.fieldA.av((short) -1916);
        this.fieldL[var1] += var2;
    }

    int s(int var1) {
        byte var2 = this.fieldA.payload[this.fieldA.caret * 651432265];
        int var5;
        if (var2 < 0) {
            var5 = var2 & 255;
            this.fieldM[var1] = var5;
            this.fieldA.caret += -99503879;
        } else {
            var5 = this.fieldM[var1];
        }

        if (var5 != 240 && var5 != 247) {
            return this.k(var1, var5);
        } else {
            int var3 = this.fieldA.av((short) -4867);
            if (var5 == 247 && var3 > 0) {
                int var4 = this.fieldA.payload[this.fieldA.caret * 651432265] & 255;
                if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
                    this.fieldA.caret += -99503879;
                    this.fieldM[var1] = var4;
                    return this.k(var1, var4);
                }
            }

            this.fieldA.caret += var3 * -99503879;
            return 0;
        }
    }

    int k(int var1, int var2) {
        int var4;
        if (var2 == 255) {
            int var7 = this.fieldA.readUByte();
            var4 = this.fieldA.av((short) -6463);
            if (var7 == 47) {
                this.fieldA.caret += var4 * -99503879;
                return 1;
            } else if (var7 == 81) {
                int var5 = this.fieldA.g(-1807906596);
                var4 -= 3;
                int var6 = this.fieldL[var1];
                this.fieldN += (long) var6 * (long) (this.fieldW - var5);
                this.fieldW = var5;
                this.fieldA.caret += var4 * -99503879;
                return 2;
            } else {
                this.fieldA.caret += var4 * -99503879;
                return 3;
            }
        } else {
            byte var3 = fieldS[var2 - 128];
            var4 = var2;
            if (var3 >= 1) {
                var4 = var2 | this.fieldA.readUByte() << 8;
            }

            if (var3 >= 2) {
                var4 |= this.fieldA.readUByte() << 16;
            }

            return var4;
        }
    }

    long f(int var1) {
        return this.fieldN + (long) var1 * (long) this.fieldW;
    }

    int d() {
        int var1 = this.fieldB.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;

        for (int var4 = 0; var4 < var1; ++var4) {
            if (this.fieldB[var4] >= 0 && this.fieldL[var4] < var3) {
                var2 = var4;
                var3 = this.fieldL[var4];
            }
        }

        return var2;
    }

    void o(long var1) {
        this.fieldN = var1;
        int var3 = this.fieldB.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            this.fieldL[var4] = 0;
            this.fieldM[var4] = 0;
            this.fieldA.caret = this.fieldI[var4] * -99503879;
            this.e(var4);
            this.fieldB[var4] = this.fieldA.caret * 651432265;
        }

    }

    int n(int var1) {
        int var2 = this.s(var1);
        return var2;
    }

    void a(byte[] var1) {
        this.fieldA.payload = var1;
        this.fieldA.caret = -995038790;
        int var2 = this.fieldA.readUShort();
        this.fieldV = this.fieldA.readUShort();
        this.fieldW = 500000;
        this.fieldI = new int[var2];

        int var3;
        int var5;
        for (var3 = 0; var3 < var2; this.fieldA.caret += var5 * -99503879) {
            int var4 = this.fieldA.readInt((byte) 88);
            var5 = this.fieldA.readInt((byte) -47);
            if (var4 == 1297379947) {
                this.fieldI[var3] = this.fieldA.caret * 651432265;
                ++var3;
            }
        }

        this.fieldN = 0L;
        this.fieldB = new int[var2];

        for (var3 = 0; var3 < var2; ++var3) {
            this.fieldB[var3] = this.fieldI[var3];
        }

        this.fieldL = new int[var2];
        this.fieldM = new int[var2];
    }

    void v() {
        this.fieldA.payload = null;
        this.fieldI = null;
        this.fieldB = null;
        this.fieldL = null;
        this.fieldM = null;
    }

    int b() {
        return this.fieldB.length;
    }

    void l(int var1) {
        this.fieldA.caret = this.fieldB[var1] * -99503879;
    }
}
