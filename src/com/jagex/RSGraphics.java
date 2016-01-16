package com.jagex;

public class RSGraphics extends DualNode {

    public static int[] fieldD;
    public static int fieldT = 0;
    public static int fieldO;
    public static int fieldQ = 0;
    public static int fieldX;
    protected static int fieldH = 0;
    protected static int fieldU = 0;


    public static void method229(int[] var0, int var1, int var2) {
        fieldD = var0;
        fieldX = var1;
        fieldO = var2;
        method231(0, 0, var1, var2);
    }

    public static void method230() {
        fieldH = 0;
        fieldQ = 0;
        fieldU = fieldX;
        fieldT = fieldO;
    }

    public static void method231(int var0, int var1, int var2, int var3) {
        if (var0 < 0) {
            var0 = 0;
        }

        if (var1 < 0) {
            var1 = 0;
        }

        if (var2 > fieldX) {
            var2 = fieldX;
        }

        if (var3 > fieldO) {
            var3 = fieldO;
        }

        fieldH = var0;
        fieldQ = var1;
        fieldU = var2;
        fieldT = var3;
    }

    public static void method232(int var0, int var1, int var2, int var3) {
        if (fieldH < var0) {
            fieldH = var0;
        }

        if (fieldQ < var1) {
            fieldQ = var1;
        }

        if (fieldU > var2) {
            fieldU = var2;
        }

        if (fieldT > var3) {
            fieldT = var3;
        }

    }

    public static void method233(int[] var0) {
        var0[0] = fieldH;
        var0[1] = fieldQ;
        var0[2] = fieldU;
        var0[3] = fieldT;
    }

    public static void method234(int var0, int var1, int var2, int var3, int var4, int var5) {
        if (var0 < fieldH) {
            var2 -= fieldH - var0;
            var0 = fieldH;
        }

        if (var1 < fieldQ) {
            var3 -= fieldQ - var1;
            var1 = fieldQ;
        }

        if (var0 + var2 > fieldU) {
            var2 = fieldU - var0;
        }

        if (var1 + var3 > fieldT) {
            var3 = fieldT - var1;
        }

        var4 = ((var4 & 16711935) * var5 >> 8 & 16711935) + ((var4 & '\uff00') * var5 >> 8 & '\uff00');
        int var6 = 256 - var5;
        int var7 = fieldX - var2;
        int var8 = var0 + var1 * fieldX;

        for (int var9 = 0; var9 < var3; ++var9) {
            for (int var10 = -var2; var10 < 0; ++var10) {
                int var11 = fieldD[var8];
                var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + ((var11 & '\uff00') * var6 >> 8 & '\uff00');
                fieldD[var8++] = var4 + var11;
            }

            var8 += var7;
        }

    }

    public static void method235(int var0, int var1, int var2, int var3, int var4) {
        if (var0 < fieldH) {
            var2 -= fieldH - var0;
            var0 = fieldH;
        }

        if (var1 < fieldQ) {
            var3 -= fieldQ - var1;
            var1 = fieldQ;
        }

        if (var0 + var2 > fieldU) {
            var2 = fieldU - var0;
        }

        if (var1 + var3 > fieldT) {
            var3 = fieldT - var1;
        }

        int var5 = fieldX - var2;
        int var6 = var0 + var1 * fieldX;

        for (int var7 = -var3; var7 < 0; ++var7) {
            for (int var8 = -var2; var8 < 0; ++var8) {
                fieldD[var6++] = var4;
            }

            var6 += var5;
        }

    }

    public static void method236(int var0, int var1, int var2, int var3, int var4, int var5) {
        int var6 = 0;
        int var7 = 65536 / var3;
        if (var0 < fieldH) {
            var2 -= fieldH - var0;
            var0 = fieldH;
        }

        if (var1 < fieldQ) {
            var6 += (fieldQ - var1) * var7;
            var3 -= fieldQ - var1;
            var1 = fieldQ;
        }

        if (var0 + var2 > fieldU) {
            var2 = fieldU - var0;
        }

        if (var1 + var3 > fieldT) {
            var3 = fieldT - var1;
        }

        int var8 = fieldX - var2;
        int var9 = var0 + var1 * fieldX;

        for (int var10 = -var3; var10 < 0; ++var10) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((var4 & 16711935) * var11 + (var5 & 16711935) * var12 & -16711936) + ((var4 & '\uff00') * var11 + (var5 & '\uff00') * var12 & 16711680) >>> 8;

            for (int var14 = -var2; var14 < 0; ++var14) {
                fieldD[var9++] = var13;
            }

            var9 += var8;
            var6 += var7;
        }

    }

    public static void drawRectangle(int var0, int var1, int var2, int var3, int var4) {
        method238(var0, var1, var2, var4);
        method238(var0, var1 + var3 - 1, var2, var4);
        method240(var0, var1, var3, var4);
        method240(var0 + var2 - 1, var1, var3, var4);
    }

    public static void method238(int var0, int var1, int var2, int var3) {
        if (var1 >= fieldQ && var1 < fieldT) {
            if (var0 < fieldH) {
                var2 -= fieldH - var0;
                var0 = fieldH;
            }

            if (var0 + var2 > fieldU) {
                var2 = fieldU - var0;
            }

            int var4 = var0 + var1 * fieldX;

            for (int var5 = 0; var5 < var2; ++var5) {
                fieldD[var4 + var5] = var3;
            }

        }
    }

    static void method239(int var0, int var1, int var2, int var3, int var4) {
        if (var1 >= fieldQ && var1 < fieldT) {
            if (var0 < fieldH) {
                var2 -= fieldH - var0;
                var0 = fieldH;
            }

            if (var0 + var2 > fieldU) {
                var2 = fieldU - var0;
            }

            int var5 = 256 - var4;
            int var6 = (var3 >> 16 & 255) * var4;
            int var7 = (var3 >> 8 & 255) * var4;
            int var8 = (var3 & 255) * var4;
            int var12 = var0 + var1 * fieldX;

            for (int var13 = 0; var13 < var2; ++var13) {
                int var9 = (fieldD[var12] >> 16 & 255) * var5;
                int var10 = (fieldD[var12] >> 8 & 255) * var5;
                int var11 = (fieldD[var12] & 255) * var5;
                int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                fieldD[var12++] = var14;
            }

        }
    }

    public static void method240(int var0, int var1, int var2, int var3) {
        if (var0 >= fieldH && var0 < fieldU) {
            if (var1 < fieldQ) {
                var2 -= fieldQ - var1;
                var1 = fieldQ;
            }

            if (var1 + var2 > fieldT) {
                var2 = fieldT - var1;
            }

            int var4 = var0 + var1 * fieldX;

            for (int var5 = 0; var5 < var2; ++var5) {
                fieldD[var4 + var5 * fieldX] = var3;
            }

        }
    }

    public static void method241(int var0, int var1, int var2, int var3, int var4) {
        var2 -= var0;
        var3 -= var1;
        if (var3 == 0) {
            if (var2 >= 0) {
                method238(var0, var1, var2 + 1, var4);
            } else {
                method238(var0 + var2, var1, -var2 + 1, var4);
            }

        } else if (var2 == 0) {
            if (var3 >= 0) {
                method240(var0, var1, var3 + 1, var4);
            } else {
                method240(var0, var1 + var3, -var3 + 1, var4);
            }

        } else {
            if (var2 + var3 < 0) {
                var0 += var2;
                var2 = -var2;
                var1 += var3;
                var3 = -var3;
            }

            int var5;
            int var6;
            if (var2 > var3) {
                var1 <<= 16;
                var1 += '\u8000';
                var3 <<= 16;
                var5 = (int) Math.floor((double) var3 / (double) var2 + 0.5D);
                var2 += var0;
                if (var0 < fieldH) {
                    var1 += var5 * (fieldH - var0);
                    var0 = fieldH;
                }

                if (var2 >= fieldU) {
                    var2 = fieldU - 1;
                }

                while (var0 <= var2) {
                    var6 = var1 >> 16;
                    if (var6 >= fieldQ && var6 < fieldT) {
                        fieldD[var0 + var6 * fieldX] = var4;
                    }

                    var1 += var5;
                    ++var0;
                }
            } else {
                var0 <<= 16;
                var0 += '\u8000';
                var2 <<= 16;
                var5 = (int) Math.floor((double) var2 / (double) var3 + 0.5D);
                var3 += var1;
                if (var1 < fieldQ) {
                    var0 += var5 * (fieldQ - var1);
                    var1 = fieldQ;
                }

                if (var3 >= fieldT) {
                    var3 = fieldT - 1;
                }

                while (var1 <= var3) {
                    var6 = var0 >> 16;
                    if (var6 >= fieldH && var6 < fieldU) {
                        fieldD[var6 + var1 * fieldX] = var4;
                    }

                    var0 += var5;
                    ++var1;
                }
            }

        }
    }

    public static void method242(int[] var0) {
        fieldH = var0[0];
        fieldQ = var0[1];
        fieldU = var0[2];
        fieldT = var0[3];
    }

    static void method243(int var0, int var1, int var2, int var3, int var4) {
        if (var0 >= fieldH && var0 < fieldU) {
            if (var1 < fieldQ) {
                var2 -= fieldQ - var1;
                var1 = fieldQ;
            }

            if (var1 + var2 > fieldT) {
                var2 = fieldT - var1;
            }

            int var5 = 256 - var4;
            int var6 = (var3 >> 16 & 255) * var4;
            int var7 = (var3 >> 8 & 255) * var4;
            int var8 = (var3 & 255) * var4;
            int var12 = var0 + var1 * fieldX;

            for (int var13 = 0; var13 < var2; ++var13) {
                int var9 = (fieldD[var12] >> 16 & 255) * var5;
                int var10 = (fieldD[var12] >> 8 & 255) * var5;
                int var11 = (fieldD[var12] & 255) * var5;
                int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                fieldD[var12] = var14;
                var12 += fieldX;
            }

        }
    }

    public static void method244() {
        int var0 = 0;

        int var1;
        for (var1 = fieldX * fieldO - 7; var0 < var1; fieldD[var0++] = 0) {
            fieldD[var0++] = 0;
            fieldD[var0++] = 0;
            fieldD[var0++] = 0;
            fieldD[var0++] = 0;
            fieldD[var0++] = 0;
            fieldD[var0++] = 0;
            fieldD[var0++] = 0;
        }

        for (var1 += 7; var0 < var1; fieldD[var0++] = 0) {
            ;
        }

    }

    public static void method245(int var0, int var1, int var2, int var3, int var4, int var5) {
        method239(var0, var1, var2, var4, var5);
        method239(var0, var1 + var3 - 1, var2, var4, var5);
        if (var3 >= 3) {
            method243(var0, var1 + 1, var3 - 2, var4, var5);
            method243(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
        }

    }

    public static void method246(int var0, int var1, int var2, int[] var3, int[] var4) {
        int var5 = var0 + var1 * fieldX;

        for (var1 = 0; var1 < var3.length; ++var1) {
            int var6 = var5 + var3[var1];

            for (var0 = -var4[var1]; var0 < 0; ++var0) {
                fieldD[var6++] = var2;
            }

            var5 += fieldX;
        }

    }
}
