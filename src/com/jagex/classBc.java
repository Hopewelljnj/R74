package com.jagex;

public class classBc extends Node {

    static classBe[] fieldO;
    static classBg[] fieldF;
    static byte[] fieldW;
    static int fieldE;
    static int fieldN;
    static int fieldS;
    static float[] fieldAh;
    static classBr[] fieldD;
    static classBi[] fieldX;
    static boolean[] fieldQ;
    static int[] fieldT;
    static float[] fieldC;
    static float[] fieldR;
    static float[] fieldZ;
    static int[] fieldAr;
    static float[] fieldAn;
    static float[] fieldAs;
    static boolean fieldH = false;
    static int fieldK;
    static int[] fieldAe;
    static float[] fieldP;
    int fieldG;
    int fieldI;
    int fieldB;
    boolean fieldM;
    boolean fieldY;
    int fieldV;
    byte[][] fieldA;
    int fieldJ;
    int fieldAq;
    float[] fieldU;
    int fieldL;
    byte[] fieldAv;
    int fieldAl;


    classBc(byte[] var1) {
        this.l(var1);
    }

    static void method268(byte[] var0, int var1) {
        fieldW = var0;
        fieldE = var1;
        fieldN = 0;
    }

    static classBc method269(ReferenceTable var0, int var1, int var2) {
        if (!method274(var0)) {
            var0.l(var1, var2, -417085762);
            return null;
        } else {
            byte[] var3 = var0.getFile(var1, var2, (short) 28592);
            return var3 == null ? null : new classBc(var3);
        }
    }

    static void method270(byte[] var0) {
        method268(var0, 0);
        fieldS = 1 << method271(4);
        fieldK = 1 << method271(4);
        fieldP = new float[fieldK];

        int var1;
        int var2;
        int var3;
        int var4;
        int var5;
        for (var1 = 0; var1 < 2; ++var1) {
            var2 = var1 != 0 ? fieldK : fieldS;
            var3 = var2 >> 1;
            var4 = var2 >> 2;
            var5 = var2 >> 3;
            float[] var6 = new float[var3];

            for (int var7 = 0; var7 < var4; ++var7) {
                var6[2 * var7] = (float) Math.cos((double) (4 * var7) * Math.PI / (double) var2);
                var6[2 * var7 + 1] = -((float) Math.sin((double) (4 * var7) * Math.PI / (double) var2));
            }

            float[] var19 = new float[var3];

            for (int var8 = 0; var8 < var4; ++var8) {
                var19[2 * var8] = (float) Math.cos((double) (2 * var8 + 1) * Math.PI / (double) (2 * var2));
                var19[2 * var8 + 1] = (float) Math.sin((double) (2 * var8 + 1) * Math.PI / (double) (2 * var2));
            }

            float[] var20 = new float[var4];

            for (int var9 = 0; var9 < var5; ++var9) {
                var20[2 * var9] = (float) Math.cos((double) (4 * var9 + 2) * Math.PI / (double) var2);
                var20[2 * var9 + 1] = -((float) Math.sin((double) (4 * var9 + 2) * Math.PI/ (double) var2));
            }

            int[] var21 = new int[var5];
            int var10 = ScriptEvent.method110(var5 - 1, 522576155);

            for (int var11 = 0; var11 < var5; ++var11) {
                int var15 = var11;
                int var16 = var10;

                int var17;
                for (var17 = 0; var16 > 0; --var16) {
                    var17 = var17 << 1 | var15 & 1;
                    var15 >>>= 1;
                }

                var21[var11] = var17;
            }

            if (var1 != 0) {
                fieldAn = var6;
                fieldAs = var19;
                fieldAh = var20;
                fieldAe = var21;
            } else {
                fieldR = var6;
                fieldZ = var19;
                fieldC = var20;
                fieldAr = var21;
            }
        }

        var1 = method271(8) + 1;
        fieldF = new classBg[var1];

        for (var2 = 0; var2 < var1; ++var2) {
            fieldF[var2] = new classBg();
        }

        var2 = method271(6) + 1;

        for (var3 = 0; var3 < var2; ++var3) {
            method271(16);
        }

        var2 = method271(6) + 1;
        fieldD = new classBr[var2];

        for (var3 = 0; var3 < var2; ++var3) {
            fieldD[var3] = new classBr();
        }

        var3 = method271(6) + 1;
        fieldX = new classBi[var3];

        for (var4 = 0; var4 < var3; ++var4) {
            fieldX[var4] = new classBi();
        }

        var4 = method271(6) + 1;
        fieldO = new classBe[var4];

        for (var5 = 0; var5 < var4; ++var5) {
            fieldO[var5] = new classBe();
        }

        var5 = method271(6) + 1;
        fieldQ = new boolean[var5];
        fieldT = new int[var5];

        for (int var18 = 0; var18 < var5; ++var18) {
            fieldQ[var18] = method272() != 0;
            method271(16);
            method271(16);
            fieldT[var18] = method271(8);
        }

    }

    static int method271(int var0) {
        int var1 = 0;

        int var2;
        int var3;
        for (var2 = 0; var0 >= 8 - fieldN; var0 -= var3) {
            var3 = 8 - fieldN;
            int var4 = (1 << var3) - 1;
            var1 += (fieldW[fieldE] >> fieldN & var4) << var2;
            fieldN = 0;
            ++fieldE;
            var2 += var3;
        }

        if (var0 > 0) {
            var3 = (1 << var0) - 1;
            var1 += (fieldW[fieldE] >> fieldN & var3) << var2;
            fieldN += var0;
        }

        return var1;
    }

    static int method272() {
        int var0 = fieldW[fieldE] >> fieldN & 1;
        ++fieldN;
        fieldE += fieldN >> 3;
        fieldN &= 7;
        return var0;
    }

    static float method273(int var0) {
        int var1 = var0 & 2097151;
        int var2 = var0 & Integer.MIN_VALUE;
        int var3 = (var0 & 2145386496) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }

        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    static boolean method274(ReferenceTable var0) {
        if (!fieldH) {
            byte[] var1 = var0.getFile(0, 0, (short) 31479);
            if (var1 == null) {
                return false;
            }

            method270(var1);
            fieldH = true;
        }

        return true;
    }

    float[] w(int var1) {
        method268(this.fieldA[var1], 0);
        method272();
        int var2 = method271(ScriptEvent.method110(fieldT.length - 1, 522576155));
        boolean var3 = fieldQ[var2];
        int var4 = var3 ? fieldK : fieldS;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method272() != 0;
            var6 = method272() != 0;
        }

        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (fieldS >> 2);
            var9 = (var4 >> 2) + (fieldS >> 2);
            var10 = fieldS >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }

        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (fieldS >> 2);
            var12 = var4 - (var4 >> 2) + (fieldS >> 2);
            var13 = fieldS >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }

        classBe var14 = fieldO[fieldT[var2]];
        int var16 = var14.fieldV;
        int var17 = var14.fieldI[var16];
        boolean var15 = !fieldD[var17].m();
        boolean var40 = var15;

        for (var17 = 0; var17 < var14.fieldA; ++var17) {
            classBi var18 = fieldX[var14.fieldB[var17]];
            float[] var19 = fieldP;
            var18.a(var19, var4 >> 1, var40);
        }

        int var41;
        if (!var15) {
            var17 = var14.fieldV;
            var41 = var14.fieldI[var17];
            fieldD[var41].w(fieldP, var4 >> 1);
        }

        int var42;
        if (var15) {
            for (var17 = var4 >> 1; var17 < var4; ++var17) {
                fieldP[var17] = 0.0F;
            }
        } else {
            var17 = var4 >> 1;
            var41 = var4 >> 2;
            var42 = var4 >> 3;
            float[] var20 = fieldP;

            int var21;
            for (var21 = 0; var21 < var17; ++var21) {
                var20[var21] *= 0.5F;
            }

            for (var21 = var17; var21 < var4; ++var21) {
                var20[var21] = -var20[var4 - var21 - 1];
            }

            float[] var46 = var3 ? fieldAn : fieldR;
            float[] var22 = var3 ? fieldAs : fieldZ;
            float[] var23 = var3 ? fieldAh : fieldC;
            int[] var24 = var3 ? fieldAe : fieldAr;

            int var25;
            float var26;
            float var27;
            float var28;
            float var29;
            for (var25 = 0; var25 < var41; ++var25) {
                var26 = var20[4 * var25] - var20[var4 - 4 * var25 - 1];
                var27 = var20[4 * var25 + 2] - var20[var4 - 4 * var25 - 3];
                var28 = var46[2 * var25];
                var29 = var46[2 * var25 + 1];
                var20[var4 - 4 * var25 - 1] = var26 * var28 - var27 * var29;
                var20[var4 - 4 * var25 - 3] = var26 * var29 + var27 * var28;
            }

            float var30;
            float var31;
            for (var25 = 0; var25 < var42; ++var25) {
                var26 = var20[var17 + 3 + 4 * var25];
                var27 = var20[var17 + 1 + 4 * var25];
                var28 = var20[4 * var25 + 3];
                var29 = var20[4 * var25 + 1];
                var20[var17 + 3 + 4 * var25] = var26 + var28;
                var20[var17 + 1 + 4 * var25] = var27 + var29;
                var30 = var46[var17 - 4 - 4 * var25];
                var31 = var46[var17 - 3 - 4 * var25];
                var20[4 * var25 + 3] = (var26 - var28) * var30 - (var27 - var29) * var31;
                var20[4 * var25 + 1] = (var27 - var29) * var30 + (var26 - var28) * var31;
            }

            var25 = ScriptEvent.method110(var4 - 1, 522576155);

            int var47;
            int var48;
            int var49;
            int var50;
            for (var47 = 0; var47 < var25 - 3; ++var47) {
                var48 = var4 >> var47 + 2;
                var49 = 8 << var47;

                for (var50 = 0; var50 < 2 << var47; ++var50) {
                    int var51 = var4 - var48 * 2 * var50;
                    int var52 = var4 - var48 * (2 * var50 + 1);

                    for (int var32 = 0; var32 < var4 >> var47 + 4; ++var32) {
                        int var33 = 4 * var32;
                        float var34 = var20[var51 - 1 - var33];
                        float var35 = var20[var51 - 3 - var33];
                        float var36 = var20[var52 - 1 - var33];
                        float var37 = var20[var52 - 3 - var33];
                        var20[var51 - 1 - var33] = var34 + var36;
                        var20[var51 - 3 - var33] = var35 + var37;
                        float var38 = var46[var32 * var49];
                        float var39 = var46[var32 * var49 + 1];
                        var20[var52 - 1 - var33] = (var34 - var36) * var38 - (var35 - var37) * var39;
                        var20[var52 - 3 - var33] = (var35 - var37) * var38 + (var34 - var36) * var39;
                    }
                }
            }

            for (var47 = 1; var47 < var42 - 1; ++var47) {
                var48 = var24[var47];
                if (var47 < var48) {
                    var49 = 8 * var47;
                    var50 = 8 * var48;
                    var30 = var20[var49 + 1];
                    var20[var49 + 1] = var20[var50 + 1];
                    var20[var50 + 1] = var30;
                    var30 = var20[var49 + 3];
                    var20[var49 + 3] = var20[var50 + 3];
                    var20[var50 + 3] = var30;
                    var30 = var20[var49 + 5];
                    var20[var49 + 5] = var20[var50 + 5];
                    var20[var50 + 5] = var30;
                    var30 = var20[var49 + 7];
                    var20[var49 + 7] = var20[var50 + 7];
                    var20[var50 + 7] = var30;
                }
            }

            for (var47 = 0; var47 < var17; ++var47) {
                var20[var47] = var20[2 * var47 + 1];
            }

            for (var47 = 0; var47 < var42; ++var47) {
                var20[var4 - 1 - 2 * var47] = var20[4 * var47];
                var20[var4 - 2 - 2 * var47] = var20[4 * var47 + 1];
                var20[var4 - var41 - 1 - 2 * var47] = var20[4 * var47 + 2];
                var20[var4 - var41 - 2 - 2 * var47] = var20[4 * var47 + 3];
            }

            for (var47 = 0; var47 < var42; ++var47) {
                var27 = var23[2 * var47];
                var28 = var23[2 * var47 + 1];
                var29 = var20[var17 + 2 * var47];
                var30 = var20[var17 + 2 * var47 + 1];
                var31 = var20[var4 - 2 - 2 * var47];
                float var53 = var20[var4 - 1 - 2 * var47];
                float var54 = var28 * (var29 - var31) + var27 * (var30 + var53);
                var20[var17 + 2 * var47] = (var29 + var31 + var54) * 0.5F;
                var20[var4 - 2 - 2 * var47] = (var29 + var31 - var54) * 0.5F;
                var54 = var28 * (var30 + var53) - var27 * (var29 - var31);
                var20[var17 + 2 * var47 + 1] = (var30 - var53 + var54) * 0.5F;
                var20[var4 - 1 - 2 * var47] = (-var30 + var53 + var54) * 0.5F;
            }

            for (var47 = 0; var47 < var41; ++var47) {
                var20[var47] = var20[2 * var47 + var17] * var22[2 * var47] + var20[2 * var47 + 1 + var17] * var22[2 * var47 + 1];
                var20[var17 - 1 - var47] = var20[2 * var47 + var17] * var22[2 * var47 + 1] - var20[2 * var47 + 1 + var17] * var22[2 * var47];
            }

            for (var47 = 0; var47 < var41; ++var47) {
                var20[var4 - var41 + var47] = -var20[var47];
            }

            for (var47 = 0; var47 < var41; ++var47) {
                var20[var47] = var20[var41 + var47];
            }

            for (var47 = 0; var47 < var41; ++var47) {
                var20[var41 + var47] = -var20[var41 - var47 - 1];
            }

            for (var47 = 0; var47 < var41; ++var47) {
                var20[var17 + var47] = var20[var4 - var47 - 1];
            }

            for (var47 = var8; var47 < var9; ++var47) {
                var27 = (float) Math.sin(((double) (var47 - var8) + 0.5D) / (double) var10 * 0.5D * 3.141592653589793D);
                fieldP[var47] *= (float) Math.sin(1.5707963267948966D * (double) var27 * (double) var27);
            }

            for (var47 = var11; var47 < var12; ++var47) {
                var27 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                fieldP[var47] *= (float) Math.sin(1.5707963267948966D * (double) var27 * (double) var27);
            }
        }

        float[] var43 = null;
        if (this.fieldJ > 0) {
            var41 = this.fieldJ + var4 >> 2;
            var43 = new float[var41];
            int var45;
            if (!this.fieldY) {
                for (var42 = 0; var42 < this.fieldG; ++var42) {
                    var45 = (this.fieldJ >> 1) + var42;
                    var43[var42] += this.fieldU[var45];
                }
            }

            if (!var15) {
                for (var42 = var8; var42 < var4 >> 1; ++var42) {
                    var45 = var43.length - (var4 >> 1) + var42;
                    var43[var45] += fieldP[var42];
                }
            }
        }

        float[] var44 = this.fieldU;
        this.fieldU = fieldP;
        fieldP = var44;
        this.fieldJ = var4;
        this.fieldG = var12 - (var4 >> 1);
        this.fieldY = var15;
        return var43;
    }

    void l(byte[] var1) {
        Buffer var2 = new Buffer(var1);
        this.fieldV = var2.readInt((byte) -34);
        this.fieldI = var2.readInt((byte) 64);
        this.fieldB = var2.readInt((byte) 0);
        this.fieldL = var2.readInt((byte) 42);
        if (this.fieldL < 0) {
            this.fieldL = ~this.fieldL;
            this.fieldM = true;
        }

        int var3 = var2.readInt((byte) -56);
        this.fieldA = new byte[var3][];

        for (int var4 = 0; var4 < var3; ++var4) {
            int var5 = 0;

            int var6;
            do {
                var6 = var2.readUByte();
                var5 += var6;
            } while (var6 >= 255);

            byte[] var7 = new byte[var5];
            var2.read(var7, 0, var5, (byte) 29);
            this.fieldA[var4] = var7;
        }

    }

    classBl s(int[] var1) {
        if (var1 != null && var1[0] <= 0) {
            return null;
        } else {
            if (this.fieldAv == null) {
                this.fieldJ = 0;
                this.fieldU = new float[fieldK];
                this.fieldAv = new byte[this.fieldI];
                this.fieldAl = 0;
                this.fieldAq = 0;
            }

            for (; this.fieldAq < this.fieldA.length; ++this.fieldAq) {
                if (var1 != null && var1[0] <= 0) {
                    return null;
                }

                float[] var2 = this.w(this.fieldAq);
                if (var2 != null) {
                    int var3 = this.fieldAl;
                    int var4 = var2.length;
                    if (var4 > this.fieldI - var3) {
                        var4 = this.fieldI - var3;
                    }

                    for (int var5 = 0; var5 < var4; ++var5) {
                        int var6 = (int) (128.0F + var2[var5] * 128.0F);
                        if ((var6 & -256) != 0) {
                            var6 = ~var6 >> 31;
                        }

                        this.fieldAv[var3++] = (byte) (var6 - 128);
                    }

                    if (var1 != null) {
                        var1[0] -= var3 - this.fieldAl;
                    }

                    this.fieldAl = var3;
                }
            }

            this.fieldU = null;
            byte[] var7 = this.fieldAv;
            this.fieldAv = null;
            return new classBl(this.fieldV, var7, this.fieldB, this.fieldL, this.fieldM);
        }
    }
}
