package com.jagex;

public class classBw extends classBz {

    int fieldO;
    int fieldV;
    int fieldI;
    int fieldE;
    int fieldL;
    int fieldA;
    int fieldQ;
    int fieldN;
    int fieldS;
    int fieldK;
    int fieldB;
    int fieldD;
    int fieldX;
    boolean fieldF;
    int fieldM;


    classBw(classBl var1, int var2, int var3) {
        this.fieldU = var1;
        this.fieldS = var1.fieldI;
        this.fieldK = var1.fieldB;
        this.fieldF = var1.fieldL;
        this.fieldV = var2;
        this.fieldI = var3;
        this.fieldB = 8192;
        this.fieldA = 0;
        this.l();
    }

    classBw(classBl var1, int var2, int var3, int var4) {
        this.fieldU = var1;
        this.fieldS = var1.fieldI;
        this.fieldK = var1.fieldB;
        this.fieldF = var1.fieldL;
        this.fieldV = var2;
        this.fieldI = var3;
        this.fieldB = var4;
        this.fieldA = 0;
        this.l();
    }

    public static classBw method209(classBl var0, int var1, int var2) {
        return var0.fieldV != null && var0.fieldV.length != 0 ? new classBw(var0, (int) ((long) var0.fieldA * 256L * (long) var1 / (long) (classAp.audioSampleRate * -567707004)), var2 << 6) : null;
    }

    public static classBw method210(classBl var0, int var1, int var2, int var3) {
        return var0.fieldV != null && var0.fieldV.length != 0 ? new classBw(var0, var1, var2, var3) : null;
    }

    static int method211(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, classBw var8) {
        var2 >>= 8;
        var7 >>= 8;
        var4 <<= 2;
        if ((var5 = var3 + var7 - var2) > var6) {
            var5 = var6;
        }

        int var10001;
        for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
            var10001 = var3++;
        }

        for (var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
            var10001 = var3++;
        }

        var8.fieldA = var2 << 8;
        return var3;
    }

    static int method212(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, classBw var10) {
        var3 >>= 8;
        var9 >>= 8;
        var5 <<= 2;
        var6 <<= 2;
        if ((var7 = var4 + var9 - var3) > var8) {
            var7 = var8;
        }

        var4 <<= 1;
        var7 <<= 1;

        int var10001;
        byte var11;
        for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
            var11 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
            var2[var10001] += var11 * var6;
            var11 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
            var2[var10001] += var11 * var6;
            var11 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
            var2[var10001] += var11 * var6;
            var11 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
        }

        for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
            var11 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
        }

        var10.fieldA = var3 << 8;
        return var4 >> 1;
    }

    static int method213(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, classBw var8) {
        var2 >>= 8;
        var7 >>= 8;
        var4 <<= 2;
        if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
            var5 = var6;
        }

        int var10001;
        for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
            var10001 = var3++;
        }

        for (var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
            var10001 = var3++;
        }

        var8.fieldA = var2 << 8;
        return var3;
    }

    static int method214(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, classBw var10) {
        var3 >>= 8;
        var9 >>= 8;
        var5 <<= 2;
        var6 <<= 2;
        if ((var7 = var4 + var3 - (var9 - 1)) > var8) {
            var7 = var8;
        }

        var4 <<= 1;
        var7 <<= 1;

        int var10001;
        byte var11;
        for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
            var11 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
            var2[var10001] += var11 * var6;
            var11 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
            var2[var10001] += var11 * var6;
            var11 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
            var2[var10001] += var11 * var6;
            var11 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
        }

        for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
            var11 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
        }

        var10.fieldA = var3 << 8;
        return var4 >> 1;
    }

    static int method215(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, classBw var11, int var12, int var13) {
        if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
            var8 = var9;
        }

        var5 <<= 1;

        byte var14;
        int var10001;
        for (var8 <<= 1; var5 < var8; var4 += var12) {
            var1 = var4 >> 8;
            var14 = var2[var1];
            var0 = (var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
        }

        if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
            var8 = var9;
        }

        var8 <<= 1;

        for (var1 = var13; var5 < var8; var4 += var12) {
            var14 = var2[var4 >> 8];
            var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
        }

        var11.fieldA = var4;
        return var5 >> 1;
    }

    static int method216(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, classBw var9) {
        var2 >>= 8;
        var8 >>= 8;
        var4 <<= 2;
        var5 <<= 2;
        if ((var6 = var3 + var8 - var2) > var7) {
            var6 = var7;
        }

        var9.fieldM += var9.fieldO * (var6 - var3);
        var9.fieldE += var9.fieldQ * (var6 - var3);

        int var10001;
        for (var6 -= 3; var3 < var6; var4 += var5) {
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
            var4 += var5;
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
            var4 += var5;
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
            var4 += var5;
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
        }

        for (var6 += 3; var3 < var6; var4 += var5) {
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
        }

        var9.fieldL = var4 >> 2;
        var9.fieldA = var2 << 8;
        return var3;
    }

    static int method217(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, classBw var11, int var12, int var13) {
        var11.fieldM -= var11.fieldO * var5;
        var11.fieldE -= var11.fieldQ * var5;
        if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
            var8 = var9;
        }

        byte var14;
        int var10001;
        while (var5 < var8) {
            var1 = var4 >> 8;
            var14 = var2[var1];
            var10001 = var5++;
            var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
            var6 += var7;
            var4 += var12;
        }

        if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
            var8 = var9;
        }

        for (var1 = var13; var5 < var8; var4 += var12) {
            var14 = var2[var4 >> 8];
            var10001 = var5++;
            var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
            var6 += var7;
        }

        var11.fieldM += var11.fieldO * var5;
        var11.fieldE += var11.fieldQ * var5;
        var11.fieldL = var6;
        var11.fieldA = var4;
        return var5;
    }

    static int method218(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, classBw var11, int var12, int var13) {
        var11.fieldM -= var11.fieldO * var5;
        var11.fieldE -= var11.fieldQ * var5;
        if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
            var8 = var9;
        }

        int var10001;
        while (var5 < var8) {
            var1 = var4 >> 8;
            byte var14 = var2[var1 - 1];
            var10001 = var5++;
            var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
            var6 += var7;
            var4 += var12;
        }

        if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
            var8 = var9;
        }

        var0 = var13;

        for (var1 = var12; var5 < var8; var4 += var1) {
            var10001 = var5++;
            var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
            var6 += var7;
        }

        var11.fieldM += var11.fieldO * var5;
        var11.fieldE += var11.fieldQ * var5;
        var11.fieldL = var6;
        var11.fieldA = var4;
        return var5;
    }

    static int method219(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, classBw var11, int var12, int var13) {
        if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
            var8 = var9;
        }

        var5 <<= 1;

        int var10001;
        for (var8 <<= 1; var5 < var8; var4 += var12) {
            var1 = var4 >> 8;
            byte var14 = var2[var1 - 1];
            var0 = (var14 << 8) + (var2[var1] - var14) * (var4 & 255);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
        }

        if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
            var8 = var9;
        }

        var8 <<= 1;

        for (var1 = var13; var5 < var8; var4 += var12) {
            var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
        }

        var11.fieldA = var4;
        return var5 >> 1;
    }

    static int method220(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, classBw var10, int var11, int var12) {
        if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
            var7 = var8;
        }

        byte var13;
        int var10001;
        while (var5 < var7) {
            var1 = var4 >> 8;
            var13 = var2[var1];
            var10001 = var5++;
            var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
            var4 += var11;
        }

        if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
            var7 = var8;
        }

        for (var1 = var12; var5 < var7; var4 += var11) {
            var13 = var2[var4 >> 8];
            var10001 = var5++;
            var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
        }

        var10.fieldA = var4;
        return var5;
    }

    static int method221(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, classBw var13, int var14, int var15) {
        var13.fieldL -= var13.fieldX * var5;
        if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
            var10 = var11;
        }

        var5 <<= 1;

        byte var16;
        int var10001;
        for (var10 <<= 1; var5 < var10; var4 += var14) {
            var1 = var4 >> 8;
            var16 = var2[var1];
            var0 = (var16 << 8) + (var2[var1 + 1] - var16) * (var4 & 255);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var6 += var8;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
            var7 += var9;
        }

        if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
            var10 = var11;
        }

        var10 <<= 1;

        for (var1 = var15; var5 < var10; var4 += var14) {
            var16 = var2[var4 >> 8];
            var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var6 += var8;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
            var7 += var9;
        }

        var5 >>= 1;
        var13.fieldL += var13.fieldX * var5;
        var13.fieldM = var6;
        var13.fieldE = var7;
        var13.fieldA = var4;
        return var5;
    }

    static int method222(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, classBw var13, int var14, int var15) {
        var13.fieldL -= var13.fieldX * var5;
        if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
            var10 = var11;
        }

        var5 <<= 1;

        int var10001;
        for (var10 <<= 1; var5 < var10; var4 += var14) {
            var1 = var4 >> 8;
            byte var16 = var2[var1 - 1];
            var0 = (var16 << 8) + (var2[var1] - var16) * (var4 & 255);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var6 += var8;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
            var7 += var9;
        }

        if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
            var10 = var11;
        }

        var10 <<= 1;

        for (var1 = var15; var5 < var10; var4 += var14) {
            var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var6 += var8;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
            var7 += var9;
        }

        var5 >>= 1;
        var13.fieldL += var13.fieldX * var5;
        var13.fieldM = var6;
        var13.fieldE = var7;
        var13.fieldA = var4;
        return var5;
    }

    static int method223(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, classBw var10, int var11, int var12) {
        if (var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
            var7 = var8;
        }

        int var10001;
        while (var5 < var7) {
            var1 = var4 >> 8;
            byte var13 = var2[var1 - 1];
            var10001 = var5++;
            var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
            var4 += var11;
        }

        if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
            var7 = var8;
        }

        var0 = var12;

        for (var1 = var11; var5 < var7; var4 += var1) {
            var10001 = var5++;
            var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
        }

        var10.fieldA = var4;
        return var5;
    }

    static int method224(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, classBw var12) {
        var3 >>= 8;
        var11 >>= 8;
        var5 <<= 2;
        var6 <<= 2;
        var7 <<= 2;
        var8 <<= 2;
        if ((var9 = var4 + var11 - var3) > var10) {
            var9 = var10;
        }

        var12.fieldL += var12.fieldX * (var9 - var4);
        var4 <<= 1;
        var9 <<= 1;

        byte var13;
        int var10001;
        for (var9 -= 6; var4 < var9; var6 += var8) {
            var13 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
            var6 += var8;
            var13 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
            var6 += var8;
            var13 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
            var6 += var8;
            var13 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
        }

        for (var9 += 6; var4 < var9; var6 += var8) {
            var13 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
        }

        var12.fieldM = var5 >> 2;
        var12.fieldE = var6 >> 2;
        var12.fieldA = var3 << 8;
        return var4 >> 1;
    }

    static int method225(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, classBw var12) {
        var3 >>= 8;
        var11 >>= 8;
        var5 <<= 2;
        var6 <<= 2;
        var7 <<= 2;
        var8 <<= 2;
        if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
            var9 = var10;
        }

        var12.fieldL += var12.fieldX * (var9 - var4);
        var4 <<= 1;
        var9 <<= 1;

        byte var13;
        int var10001;
        for (var9 -= 6; var4 < var9; var6 += var8) {
            var13 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
            var6 += var8;
            var13 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
            var6 += var8;
            var13 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
            var6 += var8;
            var13 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
        }

        for (var9 += 6; var4 < var9; var6 += var8) {
            var13 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
        }

        var12.fieldM = var5 >> 2;
        var12.fieldE = var6 >> 2;
        var12.fieldA = var3 << 8;
        return var4 >> 1;
    }

    static int method226(int var0, int var1) {
        return var1 < 0 ? var0 : (int) ((double) var0 * Math.sqrt((double) (16384 - var1) * 1.220703125E-4D) + 0.5D);
    }

    static int method227(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, classBw var9) {
        var2 >>= 8;
        var8 >>= 8;
        var4 <<= 2;
        var5 <<= 2;
        if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
            var6 = var7;
        }

        var9.fieldM += var9.fieldO * (var6 - var3);
        var9.fieldE += var9.fieldQ * (var6 - var3);

        int var10001;
        for (var6 -= 3; var3 < var6; var4 += var5) {
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
            var4 += var5;
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
            var4 += var5;
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
            var4 += var5;
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
        }

        for (var6 += 3; var3 < var6; var4 += var5) {
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
        }

        var9.fieldL = var4 >> 2;
        var9.fieldA = var2 << 8;
        return var3;
    }

    static int method228(int var0, int var1) {
        return var1 < 0 ? -var0 : (int) ((double) var0 * Math.sqrt((double) var1 * 1.220703125E-4D) + 0.5D);
    }

    synchronized void d(int var1) {
        this.x(var1, this.q());
    }

    public synchronized void s(int var1) {
        this.fieldN = var1;
    }

    public synchronized int av() {
        return this.fieldV < 0 ? -this.fieldV : this.fieldV;
    }

    public synchronized void h(boolean var1) {
        this.fieldV = (this.fieldV ^ this.fieldV >> 31) + (this.fieldV >>> 31);
        if (var1) {
            this.fieldV = -this.fieldV;
        }

    }

    void u() {
        if (this.fieldD != 0) {
            if (this.fieldI == Integer.MIN_VALUE) {
                this.fieldI = 0;
            }

            this.fieldD = 0;
            this.l();
        }

    }

    public synchronized void j(int var1, int var2) {
        this.g(var1, var2, this.q());
    }

    public synchronized void g(int var1, int var2, int var3) {
        if (var1 == 0) {
            this.x(var2, var3);
        } else {
            int var4 = method226(var2, var3);
            int var5 = method228(var2, var3);
            if (this.fieldM == var4 && this.fieldE == var5) {
                this.fieldD = 0;
            } else {
                int var6 = var2 - this.fieldL;
                if (this.fieldL - var2 > var6) {
                    var6 = this.fieldL - var2;
                }

                if (var4 - this.fieldM > var6) {
                    var6 = var4 - this.fieldM;
                }

                if (this.fieldM - var4 > var6) {
                    var6 = this.fieldM - var4;
                }

                if (var5 - this.fieldE > var6) {
                    var6 = var5 - this.fieldE;
                }

                if (this.fieldE - var5 > var6) {
                    var6 = this.fieldE - var5;
                }

                if (var1 > var6) {
                    var1 = var6;
                }

                this.fieldD = var1;
                this.fieldI = var2;
                this.fieldB = var3;
                this.fieldX = (var2 - this.fieldL) / var1;
                this.fieldO = (var4 - this.fieldM) / var1;
                this.fieldQ = (var5 - this.fieldE) / var1;
            }
        }
    }

    public synchronized void y(int var1) {
        if (var1 == 0) {
            this.d(0);
            this.delete();
        } else if (this.fieldM == 0 && this.fieldE == 0) {
            this.fieldD = 0;
            this.fieldI = 0;
            this.fieldL = 0;
            this.delete();
        } else {
            int var2 = -this.fieldL;
            if (this.fieldL > var2) {
                var2 = this.fieldL;
            }

            if (-this.fieldM > var2) {
                var2 = -this.fieldM;
            }

            if (this.fieldM > var2) {
                var2 = this.fieldM;
            }

            if (-this.fieldE > var2) {
                var2 = -this.fieldE;
            }

            if (this.fieldE > var2) {
                var2 = this.fieldE;
            }

            if (var1 > var2) {
                var1 = var2;
            }

            this.fieldD = var1;
            this.fieldI = Integer.MIN_VALUE;
            this.fieldX = -this.fieldL / var1;
            this.fieldO = -this.fieldM / var1;
            this.fieldQ = -this.fieldE / var1;
        }
    }

    public synchronized void ae(int var1) {
        if (this.fieldV < 0) {
            this.fieldV = -var1;
        } else {
            this.fieldV = var1;
        }

    }

    public synchronized int q() {
        return this.fieldB < 0 ? -1 : this.fieldB;
    }

    public boolean al() {
        return this.fieldA < 0 || this.fieldA >= ((classBl) this.fieldU).fieldV.length << 8;
    }

    public boolean ax() {
        return this.fieldD != 0;
    }

    @Override
    protected classBz m() {
        return null;
    }

    @Override
    protected classBz w() {
        return null;
    }

    @Override
    protected int e() {
        return this.fieldI == 0 && this.fieldD == 0 ? 0 : 1;
    }

    @Override
    public synchronized void n(int[] var1, int var2, int var3) {
        if (this.fieldI == 0 && this.fieldD == 0) {
            this.k(var3);
        } else {
            classBl var4 = (classBl) this.fieldU;
            int var5 = this.fieldS << 8;
            int var6 = this.fieldK << 8;
            int var7 = var4.fieldV.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.fieldN = 0;
            }

            int var9 = var2;
            var3 += var2;
            if (this.fieldA < 0) {
                if (this.fieldV <= 0) {
                    this.u();
                    this.delete();
                    return;
                }

                this.fieldA = 0;
            }

            if (this.fieldA >= var7) {
                if (this.fieldV >= 0) {
                    this.u();
                    this.delete();
                    return;
                }

                this.fieldA = var7 - 1;
            }

            if (this.fieldN < 0) {
                if (this.fieldF) {
                    if (this.fieldV < 0) {
                        var9 = this.aa(var1, var2, var5, var3, var4.fieldV[this.fieldS]);
                        if (this.fieldA >= var5) {
                            return;
                        }

                        this.fieldA = var5 + var5 - 1 - this.fieldA;
                        this.fieldV = -this.fieldV;
                    }

                    while (true) {
                        var9 = this.az(var1, var9, var6, var3, var4.fieldV[this.fieldK - 1]);
                        if (this.fieldA < var6) {
                            return;
                        }

                        this.fieldA = var6 + var6 - 1 - this.fieldA;
                        this.fieldV = -this.fieldV;
                        var9 = this.aa(var1, var9, var5, var3, var4.fieldV[this.fieldS]);
                        if (this.fieldA >= var5) {
                            return;
                        }

                        this.fieldA = var5 + var5 - 1 - this.fieldA;
                        this.fieldV = -this.fieldV;
                    }
                } else if (this.fieldV < 0) {
                    while (true) {
                        var9 = this.aa(var1, var9, var5, var3, var4.fieldV[this.fieldK - 1]);
                        if (this.fieldA >= var5) {
                            return;
                        }

                        this.fieldA = var6 - 1 - (var6 - 1 - this.fieldA) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.az(var1, var9, var6, var3, var4.fieldV[this.fieldS]);
                        if (this.fieldA < var6) {
                            return;
                        }

                        this.fieldA = var5 + (this.fieldA - var5) % var8;
                    }
                }
            } else {
                if (this.fieldN > 0) {
                    if (this.fieldF) {
                        label183:
                        {
                            if (this.fieldV < 0) {
                                var9 = this.aa(var1, var2, var5, var3, var4.fieldV[this.fieldS]);
                                if (this.fieldA >= var5) {
                                    return;
                                }

                                this.fieldA = var5 + var5 - 1 - this.fieldA;
                                this.fieldV = -this.fieldV;
                                if (--this.fieldN == 0) {
                                    break label183;
                                }
                            }

                            do {
                                var9 = this.az(var1, var9, var6, var3, var4.fieldV[this.fieldK - 1]);
                                if (this.fieldA < var6) {
                                    return;
                                }

                                this.fieldA = var6 + var6 - 1 - this.fieldA;
                                this.fieldV = -this.fieldV;
                                if (--this.fieldN == 0) {
                                    break;
                                }

                                var9 = this.aa(var1, var9, var5, var3, var4.fieldV[this.fieldS]);
                                if (this.fieldA >= var5) {
                                    return;
                                }

                                this.fieldA = var5 + var5 - 1 - this.fieldA;
                                this.fieldV = -this.fieldV;
                            } while (--this.fieldN != 0);
                        }
                    } else {
                        int var10;
                        if (this.fieldV < 0) {
                            while (true) {
                                var9 = this.aa(var1, var9, var5, var3, var4.fieldV[this.fieldK - 1]);
                                if (this.fieldA >= var5) {
                                    return;
                                }

                                var10 = (var6 - 1 - this.fieldA) / var8;
                                if (var10 >= this.fieldN) {
                                    this.fieldA += var8 * this.fieldN;
                                    this.fieldN = 0;
                                    break;
                                }

                                this.fieldA += var8 * var10;
                                this.fieldN -= var10;
                            }
                        } else {
                            while (true) {
                                var9 = this.az(var1, var9, var6, var3, var4.fieldV[this.fieldS]);
                                if (this.fieldA < var6) {
                                    return;
                                }

                                var10 = (this.fieldA - var5) / var8;
                                if (var10 >= this.fieldN) {
                                    this.fieldA -= var8 * this.fieldN;
                                    this.fieldN = 0;
                                    break;
                                }

                                this.fieldA -= var8 * var10;
                                this.fieldN -= var10;
                            }
                        }
                    }
                }

                if (this.fieldV < 0) {
                    this.aa(var1, var9, 0, var3, 0);
                    if (this.fieldA < 0) {
                        this.fieldA = -1;
                        this.u();
                        this.delete();
                    }
                } else {
                    this.az(var1, var9, var7, var3, 0);
                    if (this.fieldA >= var7) {
                        this.fieldA = var7;
                        this.u();
                        this.delete();
                    }
                }

            }
        }
    }

    @Override
    public synchronized void k(int var1) {
        if (this.fieldD > 0) {
            if (var1 >= this.fieldD) {
                if (this.fieldI == Integer.MIN_VALUE) {
                    this.fieldI = 0;
                    this.fieldE = 0;
                    this.fieldM = 0;
                    this.fieldL = 0;
                    this.delete();
                    var1 = this.fieldD;
                }

                this.fieldD = 0;
                this.l();
            } else {
                this.fieldL += this.fieldX * var1;
                this.fieldM += this.fieldO * var1;
                this.fieldE += this.fieldQ * var1;
                this.fieldD -= var1;
            }
        }

        classBl var2 = (classBl) this.fieldU;
        int var3 = this.fieldS << 8;
        int var4 = this.fieldK << 8;
        int var5 = var2.fieldV.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.fieldN = 0;
        }

        if (this.fieldA < 0) {
            if (this.fieldV <= 0) {
                this.u();
                this.delete();
                return;
            }

            this.fieldA = 0;
        }

        if (this.fieldA >= var5) {
            if (this.fieldV >= 0) {
                this.u();
                this.delete();
                return;
            }

            this.fieldA = var5 - 1;
        }

        this.fieldA += this.fieldV * var1;
        if (this.fieldN < 0) {
            if (!this.fieldF) {
                if (this.fieldV < 0) {
                    if (this.fieldA >= var3) {
                        return;
                    }

                    this.fieldA = var4 - 1 - (var4 - 1 - this.fieldA) % var6;
                } else {
                    if (this.fieldA < var4) {
                        return;
                    }

                    this.fieldA = var3 + (this.fieldA - var3) % var6;
                }

            } else {
                if (this.fieldV < 0) {
                    if (this.fieldA >= var3) {
                        return;
                    }

                    this.fieldA = var3 + var3 - 1 - this.fieldA;
                    this.fieldV = -this.fieldV;
                }

                while (this.fieldA >= var4) {
                    this.fieldA = var4 + var4 - 1 - this.fieldA;
                    this.fieldV = -this.fieldV;
                    if (this.fieldA >= var3) {
                        return;
                    }

                    this.fieldA = var3 + var3 - 1 - this.fieldA;
                    this.fieldV = -this.fieldV;
                }

            }
        } else {
            if (this.fieldN > 0) {
                if (this.fieldF) {
                    label171:
                    {
                        if (this.fieldV < 0) {
                            if (this.fieldA >= var3) {
                                return;
                            }

                            this.fieldA = var3 + var3 - 1 - this.fieldA;
                            this.fieldV = -this.fieldV;
                            if (--this.fieldN == 0) {
                                break label171;
                            }
                        }

                        do {
                            if (this.fieldA < var4) {
                                return;
                            }

                            this.fieldA = var4 + var4 - 1 - this.fieldA;
                            this.fieldV = -this.fieldV;
                            if (--this.fieldN == 0) {
                                break;
                            }

                            if (this.fieldA >= var3) {
                                return;
                            }

                            this.fieldA = var3 + var3 - 1 - this.fieldA;
                            this.fieldV = -this.fieldV;
                        } while (--this.fieldN != 0);
                    }
                } else {
                    label181:
                    {
                        int var7;
                        if (this.fieldV < 0) {
                            if (this.fieldA >= var3) {
                                return;
                            }

                            var7 = (var4 - 1 - this.fieldA) / var6;
                            if (var7 >= this.fieldN) {
                                this.fieldA += var6 * this.fieldN;
                                this.fieldN = 0;
                                break label181;
                            }

                            this.fieldA += var6 * var7;
                            this.fieldN -= var7;
                        } else {
                            if (this.fieldA < var4) {
                                return;
                            }

                            var7 = (this.fieldA - var3) / var6;
                            if (var7 >= this.fieldN) {
                                this.fieldA -= var6 * this.fieldN;
                                this.fieldN = 0;
                                break label181;
                            }

                            this.fieldA -= var6 * var7;
                            this.fieldN -= var7;
                        }

                        return;
                    }
                }
            }

            if (this.fieldV < 0) {
                if (this.fieldA < 0) {
                    this.fieldA = -1;
                    this.u();
                    this.delete();
                }
            } else if (this.fieldA >= var5) {
                this.fieldA = var5;
                this.u();
                this.delete();
            }

        }
    }

    int az(int[] var1, int var2, int var3, int var4, int var5) {
        while (true) {
            if (this.fieldD > 0) {
                int var6 = var2 + this.fieldD;
                if (var6 > var4) {
                    var6 = var4;
                }

                this.fieldD += var2;
                if (this.fieldV == 256 && (this.fieldA & 255) == 0) {
                    if (classAp.twoChannels) {
                        var2 = method224(0, ((classBl) this.fieldU).fieldV, var1, this.fieldA, var2, this.fieldM, this.fieldE, this.fieldO, this.fieldQ, 0, var6, var3, this);
                    } else {
                        var2 = method216(((classBl) this.fieldU).fieldV, var1, this.fieldA, var2, this.fieldL, this.fieldX, 0, var6, var3, this);
                    }
                } else if (classAp.twoChannels) {
                    var2 = method221(0, 0, ((classBl) this.fieldU).fieldV, var1, this.fieldA, var2, this.fieldM, this.fieldE, this.fieldO, this.fieldQ, 0, var6, var3, this, this.fieldV, var5);
                } else {
                    var2 = method217(0, 0, ((classBl) this.fieldU).fieldV, var1, this.fieldA, var2, this.fieldL, this.fieldX, 0, var6, var3, this, this.fieldV, var5);
                }

                this.fieldD -= var2;
                if (this.fieldD != 0) {
                    return var2;
                }

                if (!this.at()) {
                    continue;
                }

                return var4;
            }

            if (this.fieldV == 256 && (this.fieldA & 255) == 0) {
                if (classAp.twoChannels) {
                    return method212(0, ((classBl) this.fieldU).fieldV, var1, this.fieldA, var2, this.fieldM, this.fieldE, 0, var4, var3, this);
                }

                return method211(((classBl) this.fieldU).fieldV, var1, this.fieldA, var2, this.fieldL, 0, var4, var3, this);
            }

            if (classAp.twoChannels) {
                return method215(0, 0, ((classBl) this.fieldU).fieldV, var1, this.fieldA, var2, this.fieldM, this.fieldE, 0, var4, var3, this, this.fieldV, var5);
            }

            return method220(0, 0, ((classBl) this.fieldU).fieldV, var1, this.fieldA, var2, this.fieldL, 0, var4, var3, this, this.fieldV, var5);
        }
    }

    boolean at() {
        int var1 = this.fieldI;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var3 = 0;
            var2 = 0;
            var1 = 0;
        } else {
            var2 = method226(var1, this.fieldB);
            var3 = method228(var1, this.fieldB);
        }

        if (this.fieldL == var1 && this.fieldM == var2 && this.fieldE == var3) {
            if (this.fieldI == Integer.MIN_VALUE) {
                this.fieldI = 0;
                this.fieldE = 0;
                this.fieldM = 0;
                this.fieldL = 0;
                this.delete();
                return true;
            } else {
                this.l();
                return false;
            }
        } else {
            if (this.fieldL < var1) {
                this.fieldX = 1;
                this.fieldD = var1 - this.fieldL;
            } else if (this.fieldL > var1) {
                this.fieldX = -1;
                this.fieldD = this.fieldL - var1;
            } else {
                this.fieldX = 0;
            }

            if (this.fieldM < var2) {
                this.fieldO = 1;
                if (this.fieldD == 0 || this.fieldD > var2 - this.fieldM) {
                    this.fieldD = var2 - this.fieldM;
                }
            } else if (this.fieldM > var2) {
                this.fieldO = -1;
                if (this.fieldD == 0 || this.fieldD > this.fieldM - var2) {
                    this.fieldD = this.fieldM - var2;
                }
            } else {
                this.fieldO = 0;
            }

            if (this.fieldE < var3) {
                this.fieldQ = 1;
                if (this.fieldD == 0 || this.fieldD > var3 - this.fieldE) {
                    this.fieldD = var3 - this.fieldE;
                }
            } else if (this.fieldE > var3) {
                this.fieldQ = -1;
                if (this.fieldD == 0 || this.fieldD > this.fieldE - var3) {
                    this.fieldD = this.fieldE - var3;
                }
            } else {
                this.fieldQ = 0;
            }

            return false;
        }
    }

    synchronized void x(int var1, int var2) {
        this.fieldI = var1;
        this.fieldB = var2;
        this.fieldD = 0;
        this.l();
    }

    int aa(int[] var1, int var2, int var3, int var4, int var5) {
        while (true) {
            if (this.fieldD > 0) {
                int var6 = var2 + this.fieldD;
                if (var6 > var4) {
                    var6 = var4;
                }

                this.fieldD += var2;
                if (this.fieldV == -256 && (this.fieldA & 255) == 0) {
                    if (classAp.twoChannels) {
                        var2 = method225(0, ((classBl) this.fieldU).fieldV, var1, this.fieldA, var2, this.fieldM, this.fieldE, this.fieldO, this.fieldQ, 0, var6, var3, this);
                    } else {
                        var2 = method227(((classBl) this.fieldU).fieldV, var1, this.fieldA, var2, this.fieldL, this.fieldX, 0, var6, var3, this);
                    }
                } else if (classAp.twoChannels) {
                    var2 = method222(0, 0, ((classBl) this.fieldU).fieldV, var1, this.fieldA, var2, this.fieldM, this.fieldE, this.fieldO, this.fieldQ, 0, var6, var3, this, this.fieldV, var5);
                } else {
                    var2 = method218(0, 0, ((classBl) this.fieldU).fieldV, var1, this.fieldA, var2, this.fieldL, this.fieldX, 0, var6, var3, this, this.fieldV, var5);
                }

                this.fieldD -= var2;
                if (this.fieldD != 0) {
                    return var2;
                }

                if (!this.at()) {
                    continue;
                }

                return var4;
            }

            if (this.fieldV == -256 && (this.fieldA & 255) == 0) {
                if (classAp.twoChannels) {
                    return method214(0, ((classBl) this.fieldU).fieldV, var1, this.fieldA, var2, this.fieldM, this.fieldE, 0, var4, var3, this);
                }

                return method213(((classBl) this.fieldU).fieldV, var1, this.fieldA, var2, this.fieldL, 0, var4, var3, this);
            }

            if (classAp.twoChannels) {
                return method219(0, 0, ((classBl) this.fieldU).fieldV, var1, this.fieldA, var2, this.fieldM, this.fieldE, 0, var4, var3, this, this.fieldV, var5);
            }

            return method223(0, 0, ((classBl) this.fieldU).fieldV, var1, this.fieldA, var2, this.fieldL, 0, var4, var3, this, this.fieldV, var5);
        }
    }

    public synchronized void t(int var1) {
        int var2 = ((classBl) this.fieldU).fieldV.length << 8;
        if (var1 < -1) {
            var1 = -1;
        }

        if (var1 > var2) {
            var1 = var2;
        }

        this.fieldA = var1;
    }

    public synchronized int o() {
        return this.fieldI == Integer.MIN_VALUE ? 0 : this.fieldI;
    }

    public synchronized void f(int var1) {
        this.x(var1 << 6, this.q());
    }

    @Override
    int ai() {
        int var1 = this.fieldL * 3 >> 6;
        var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
        if (this.fieldN == 0) {
            var1 -= var1 * this.fieldA / (((classBl) this.fieldU).fieldV.length << 8);
        } else if (this.fieldN >= 0) {
            var1 -= var1 * this.fieldS / ((classBl) this.fieldU).fieldV.length;
        }

        return var1 > 255 ? 255 : var1;
    }

    void l() {
        this.fieldL = this.fieldI;
        this.fieldM = method226(this.fieldI, this.fieldB);
        this.fieldE = method228(this.fieldI, this.fieldB);
    }
}
