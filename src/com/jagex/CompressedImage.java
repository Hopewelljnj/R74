package com.jagex;

public final class CompressedImage extends RSGraphics {

    public int fieldM;
    public int[] fieldV;
    public int fieldB;
    public int fieldI;
    public int fieldL;
    public int fieldE;
    public int fieldW;
    public byte[] fieldA;

    static void method275(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
        int var9 = -(var5 >> 2);
        var5 = -(var5 & 3);

        for (int var10 = -var6; var10 < 0; ++var10) {
            int var11;
            byte var12;
            for (var11 = var9; var11 < 0; ++var11) {
                var12 = var1[var3++];
                if (var12 != 0) {
                    var0[var4++] = var2[var12 & 255];
                } else {
                    ++var4;
                }

                var12 = var1[var3++];
                if (var12 != 0) {
                    var0[var4++] = var2[var12 & 255];
                } else {
                    ++var4;
                }

                var12 = var1[var3++];
                if (var12 != 0) {
                    var0[var4++] = var2[var12 & 255];
                } else {
                    ++var4;
                }

                var12 = var1[var3++];
                if (var12 != 0) {
                    var0[var4++] = var2[var12 & 255];
                } else {
                    ++var4;
                }
            }

            for (var11 = var5; var11 < 0; ++var11) {
                var12 = var1[var3++];
                if (var12 != 0) {
                    var0[var4++] = var2[var12 & 255];
                } else {
                    ++var4;
                }
            }

            var4 += var7;
            var3 += var8;
        }

    }

    public void v(int var1, int var2, int var3) {
        for (int var4 = 0; var4 < this.fieldV.length; ++var4) {
            int var5 = this.fieldV[var4] >> 16 & 255;
            var5 += var1;
            if (var5 < 0) {
                var5 = 0;
            } else if (var5 > 255) {
                var5 = 255;
            }

            int var6 = this.fieldV[var4] >> 8 & 255;
            var6 += var2;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }

            int var7 = this.fieldV[var4] & 255;
            var7 += var3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }

            this.fieldV[var4] = (var5 << 16) + (var6 << 8) + var7;
        }

    }

    public void a() {
        if (this.fieldI != this.fieldW || this.fieldB != this.fieldE) {
            byte[] var1 = new byte[this.fieldW * this.fieldE];
            int var2 = 0;

            for (int var3 = 0; var3 < this.fieldB; ++var3) {
                for (int var4 = 0; var4 < this.fieldI; ++var4) {
                    var1[var4 + this.fieldL + (var3 + this.fieldM) * this.fieldW] = this.fieldA[var2++];
                }
            }

            this.fieldA = var1;
            this.fieldI = this.fieldW;
            this.fieldB = this.fieldE;
            this.fieldL = 0;
            this.fieldM = 0;
        }
    }

    public void i(int var1, int var2) {
        var1 += this.fieldL;
        var2 += this.fieldM;
        int var3 = var1 + var2 * fieldX;
        int var4 = 0;
        int var5 = this.fieldB;
        int var6 = this.fieldI;
        int var7 = fieldX - var6;
        int var8 = 0;
        int var9;
        if (var2 < fieldQ) {
            var9 = fieldQ - var2;
            var5 -= var9;
            var2 = fieldQ;
            var4 += var9 * var6;
            var3 += var9 * fieldX;
        }

        if (var2 + var5 > fieldT) {
            var5 -= var2 + var5 - fieldT;
        }

        if (var1 < fieldH) {
            var9 = fieldH - var1;
            var6 -= var9;
            var1 = fieldH;
            var4 += var9;
            var3 += var9;
            var8 += var9;
            var7 += var9;
        }

        if (var1 + var6 > fieldU) {
            var9 = var1 + var6 - fieldU;
            var6 -= var9;
            var8 += var9;
            var7 += var9;
        }

        if (var6 > 0 && var5 > 0) {
            method275(fieldD, this.fieldA, this.fieldV, var4, var3, var6, var5, var7, var8);
        }
    }

}
