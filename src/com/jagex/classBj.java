package com.jagex;

public class classBj extends Node {

    static int[] fieldO;
    boolean fieldX = false;
    int[] fieldD;
    boolean fieldM;
    int[] fieldW;
    int fieldF;
    int[] fieldN;
    int[] fieldS;
    int fieldK;
    int[] fieldE;
    int fieldL;


    classBj(Buffer var1) {
        this.fieldL = var1.readUShort();
        this.fieldM = var1.readUByte() == 1;
        int var2 = var1.readUByte();
        if (var2 >= 1 && var2 <= 4) {
            this.fieldW = new int[var2];

            int var3;
            for (var3 = 0; var3 < var2; ++var3) {
                this.fieldW[var3] = var1.readUShort();
            }

            if (var2 > 1) {
                this.fieldE = new int[var2 - 1];

                for (var3 = 0; var3 < var2 - 1; ++var3) {
                    this.fieldE[var3] = var1.readUByte();
                }
            }

            if (var2 > 1) {
                this.fieldN = new int[var2 - 1];

                for (var3 = 0; var3 < var2 - 1; ++var3) {
                    this.fieldN[var3] = var1.readUByte();
                }
            }

            this.fieldS = new int[var2];

            for (var3 = 0; var3 < var2; ++var3) {
                this.fieldS[var3] = var1.readInt((byte) -70);
            }

            this.fieldK = var1.readUByte();
            this.fieldF = var1.readUByte();
            this.fieldD = null;
        } else {
            throw new RuntimeException();
        }
    }

    void i(int var1) {
        if (this.fieldD != null) {
            short var2;
            int var3;
            int var4;
            int var5;
            int var6;
            int var7;
            int[] var10;
            if (this.fieldK == 1 || this.fieldK == 3) {
                if (fieldO == null || fieldO.length < this.fieldD.length) {
                    fieldO = new int[this.fieldD.length];
                }

                if (this.fieldD.length == 4096) {
                    var2 = 64;
                } else {
                    var2 = 128;
                }

                var3 = this.fieldD.length;
                var4 = var2 * var1 * this.fieldF;
                var5 = var3 - 1;
                if (this.fieldK == 1) {
                    var4 = -var4;
                }

                for (var6 = 0; var6 < var3; ++var6) {
                    var7 = var6 + var4 & var5;
                    fieldO[var6] = this.fieldD[var7];
                }

                var10 = this.fieldD;
                this.fieldD = fieldO;
                fieldO = var10;
            }

            if (this.fieldK == 2 || this.fieldK == 4) {
                if (fieldO == null || fieldO.length < this.fieldD.length) {
                    fieldO = new int[this.fieldD.length];
                }

                if (this.fieldD.length == 4096) {
                    var2 = 64;
                } else {
                    var2 = 128;
                }

                var3 = this.fieldD.length;
                var4 = var1 * this.fieldF;
                var5 = var2 - 1;
                if (this.fieldK == 2) {
                    var4 = -var4;
                }

                for (var6 = 0; var6 < var3; var6 += var2) {
                    for (var7 = 0; var7 < var2; ++var7) {
                        int var8 = var6 + var7;
                        int var9 = var6 + (var7 + var4 & var5);
                        fieldO[var8] = this.fieldD[var9];
                    }
                }

                var10 = this.fieldD;
                this.fieldD = fieldO;
                fieldO = var10;
            }

        }
    }

    void v() {
        this.fieldD = null;
    }

    boolean a(double var1, int var3, ReferenceTable var4) {
        int var5;
        for (var5 = 0; var5 < this.fieldW.length; ++var5) {
            if (var4.s(this.fieldW[var5], (byte) -44) == null) {
                return false;
            }
        }

        var5 = var3 * var3;
        this.fieldD = new int[var5];

        for (int var6 = 0; var6 < this.fieldW.length; ++var6) {
            int var8 = this.fieldW[var6];
            byte[] var10 = var4.e(var8, (short) 145);
            boolean var9;
            if (null == var10) {
                var9 = false;
            } else {
                UtilClass0.method390(var10, 1589530047);
                var9 = true;
            }

            CompressedImage var7;
            if (!var9) {
                var7 = null;
            } else {
                var7 = ItemPile.method342();
            }

            var7.a();
            var10 = var7.fieldA;
            int[] var11 = var7.fieldV;
            int var12 = this.fieldS[var6];
            if ((var12 & -16777216) == 16777216) {
                ;
            }

            if ((var12 & -16777216) == 33554432) {
                ;
            }

            int var13;
            int var14;
            int var15;
            int var16;
            if ((var12 & -16777216) == 50331648) {
                var13 = var12 & 16711935;
                var14 = var12 >> 8 & 255;

                for (var15 = 0; var15 < var11.length; ++var15) {
                    var16 = var11[var15];
                    if ((var16 & '\uffff') == var16 >> 8) {
                        var16 &= 255;
                        var11[var15] = var13 * var16 >> 8 & 16711935 | var14 * var16 & '\uff00';
                    }
                }
            }

            for (var13 = 0; var13 < var11.length; ++var13) {
                var11[var13] = RSGraphics2D.method314(var11[var13], var1);
            }

            if (var6 == 0) {
                var13 = 0;
            } else {
                var13 = this.fieldE[var6 - 1];
            }

            if (var6 == 0) {
                ;
            }

            if (var13 == 0) {
                if (var7.fieldI == var3) {
                    for (var14 = 0; var14 < var5; ++var14) {
                        this.fieldD[var14] = var11[var10[var14] & 255];
                    }
                } else if (var7.fieldI == 64 && var3 == 128) {
                    var14 = 0;

                    for (var15 = 0; var15 < var3; ++var15) {
                        for (var16 = 0; var16 < var3; ++var16) {
                            this.fieldD[var14++] = var11[var10[(var16 >> 1) + (var15 >> 1 << 6)] & 255];
                        }
                    }
                } else {
                    if (var7.fieldI != 128 || var3 != 64) {
                        throw new RuntimeException();
                    }

                    var14 = 0;

                    for (var15 = 0; var15 < var3; ++var15) {
                        for (var16 = 0; var16 < var3; ++var16) {
                            this.fieldD[var14++] = var11[var10[(var16 << 1) + (var15 << 1 << 7)] & 255];
                        }
                    }
                }
            }

            if (var13 == 1) {
                ;
            }

            if (var13 == 2) {
                ;
            }

            if (var13 == 3) {
                ;
            }
        }

        return true;
    }
}
