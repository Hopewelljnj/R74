package com.jagex;

public class classBg {

    int[] fieldM;
    int fieldV;
    int[] fieldI;
    int fieldA;
    float[][] fieldL;
    int[] fieldB;


    classBg() {
        classBc.method271(24);
        this.fieldA = classBc.method271(16);
        this.fieldV = classBc.method271(24);
        this.fieldI = new int[this.fieldV];
        boolean var1 = classBc.method272() != 0;
        int var2;
        int var3;
        int var5;
        if (var1) {
            var2 = 0;

            for (var3 = classBc.method271(5) + 1; var2 < this.fieldV; ++var3) {
                int var4 = classBc.method271(ScriptEvent.method110(this.fieldV - var2, 522576155));

                for (var5 = 0; var5 < var4; ++var5) {
                    this.fieldI[var2++] = var3;
                }
            }
        } else {
            boolean var14 = classBc.method272() != 0;

            for (var3 = 0; var3 < this.fieldV; ++var3) {
                if (var14 && classBc.method272() == 0) {
                    this.fieldI[var3] = 0;
                } else {
                    this.fieldI[var3] = classBc.method271(5) + 1;
                }
            }
        }

        this.v();
        var2 = classBc.method271(4);
        if (var2 > 0) {
            float var15 = classBc.method273(classBc.method271(32));
            float var16 = classBc.method273(classBc.method271(32));
            var5 = classBc.method271(4) + 1;
            boolean var6 = classBc.method272() != 0;
            int var7;
            if (var2 == 1) {
                var7 = method267(this.fieldV, this.fieldA);
            } else {
                var7 = this.fieldV * this.fieldA;
            }

            this.fieldB = new int[var7];

            int var8;
            for (var8 = 0; var8 < var7; ++var8) {
                this.fieldB[var8] = classBc.method271(var5);
            }

            this.fieldL = new float[this.fieldV][this.fieldA];
            float var9;
            int var10;
            int var11;
            if (var2 == 1) {
                for (var8 = 0; var8 < this.fieldV; ++var8) {
                    var9 = 0.0F;
                    var10 = 1;

                    for (var11 = 0; var11 < this.fieldA; ++var11) {
                        int var12 = var8 / var10 % var7;
                        float var13 = (float) this.fieldB[var12] * var16 + var15 + var9;
                        this.fieldL[var8][var11] = var13;
                        if (var6) {
                            var9 = var13;
                        }

                        var10 *= var7;
                    }
                }
            } else {
                for (var8 = 0; var8 < this.fieldV; ++var8) {
                    var9 = 0.0F;
                    var10 = var8 * this.fieldA;

                    for (var11 = 0; var11 < this.fieldA; ++var11) {
                        float var17 = (float) this.fieldB[var10] * var16 + var15 + var9;
                        this.fieldL[var8][var11] = var17;
                        if (var6) {
                            var9 = var17;
                        }

                        ++var10;
                    }
                }
            }
        }

    }

    static int method267(int var0, int var1) {
        int var2;
        for (var2 = (int) Math.pow((double) var0, 1.0D / (double) var1) + 1; UtilClass19.method169(var2, var1, (byte) 32) > var0; --var2) {
            ;
        }

        return var2;
    }

    void v() {
        int[] var1 = new int[this.fieldV];
        int[] var2 = new int[33];

        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var10;
        for (var3 = 0; var3 < this.fieldV; ++var3) {
            var4 = this.fieldI[var3];
            if (var4 != 0) {
                var5 = 1 << 32 - var4;
                var6 = var2[var4];
                var1[var3] = var6;
                int var9;
                if ((var6 & var5) != 0) {
                    var7 = var2[var4 - 1];
                } else {
                    var7 = var6 | var5;

                    for (var8 = var4 - 1; var8 >= 1; --var8) {
                        var9 = var2[var8];
                        if (var9 != var6) {
                            break;
                        }

                        var10 = 1 << 32 - var8;
                        if ((var9 & var10) != 0) {
                            var2[var8] = var2[var8 - 1];
                            break;
                        }

                        var2[var8] = var9 | var10;
                    }
                }

                var2[var4] = var7;

                for (var8 = var4 + 1; var8 <= 32; ++var8) {
                    var9 = var2[var8];
                    if (var9 == var6) {
                        var2[var8] = var7;
                    }
                }
            }
        }

        this.fieldM = new int[8];
        int var11 = 0;

        for (var3 = 0; var3 < this.fieldV; ++var3) {
            var4 = this.fieldI[var3];
            if (var4 != 0) {
                var5 = var1[var3];
                var6 = 0;

                for (var7 = 0; var7 < var4; ++var7) {
                    var8 = Integer.MIN_VALUE >>> var7;
                    if ((var5 & var8) != 0) {
                        if (this.fieldM[var6] == 0) {
                            this.fieldM[var6] = var11;
                        }

                        var6 = this.fieldM[var6];
                    } else {
                        ++var6;
                    }

                    if (var6 >= this.fieldM.length) {
                        int[] var12 = new int[this.fieldM.length * 2];

                        for (var10 = 0; var10 < this.fieldM.length; ++var10) {
                            var12[var10] = this.fieldM[var10];
                        }

                        this.fieldM = var12;
                    }

                    var8 >>>= 1;
                }

                this.fieldM[var6] = ~var3;
                if (var6 >= var11) {
                    var11 = var6 + 1;
                }
            }
        }

    }

    int i() {
        int var1;
        for (var1 = 0; this.fieldM[var1] >= 0; var1 = classBc.method272() != 0 ? this.fieldM[var1] : var1 + 1) {
            ;
        }

        return ~this.fieldM[var1];
    }

    float[] b() {
        return this.fieldL[this.i()];
    }
}
