package com.jagex;

public class classBi {

    int fieldM = classBc.method271(8);
    int fieldB = classBc.method271(24) + 1;
    int fieldI = classBc.method271(24);
    int fieldA = classBc.method271(16);
    int fieldL = classBc.method271(6) + 1;
    int fieldV = classBc.method271(24);
    int[] fieldW;


    classBi() {
        int[] var1 = new int[this.fieldL];

        int var2;
        for (var2 = 0; var2 < this.fieldL; ++var2) {
            int var3 = 0;
            int var4 = classBc.method271(3);
            boolean var5 = classBc.method272() != 0;
            if (var5) {
                var3 = classBc.method271(5);
            }

            var1[var2] = var3 << 3 | var4;
        }

        this.fieldW = new int[this.fieldL * 8];

        for (var2 = 0; var2 < this.fieldL * 8; ++var2) {
            this.fieldW[var2] = (var1[var2 >> 3] & 1 << (var2 & 7)) != 0 ? classBc.method271(8) : -1;
        }

    }

    void a(float[] var1, int var2, boolean var3) {
        int var4;
        for (var4 = 0; var4 < var2; ++var4) {
            var1[var4] = 0.0F;
        }

        if (!var3) {
            var4 = classBc.fieldF[this.fieldM].fieldA;
            int var5 = this.fieldI - this.fieldV;
            int var6 = var5 / this.fieldB;
            int[] var7 = new int[var6];

            for (int var8 = 0; var8 < 8; ++var8) {
                int var9 = 0;

                while (var9 < var6) {
                    int var10;
                    int var11;
                    if (var8 == 0) {
                        var10 = classBc.fieldF[this.fieldM].i();

                        for (var11 = var4 - 1; var11 >= 0; --var11) {
                            if (var9 + var11 < var6) {
                                var7[var9 + var11] = var10 % this.fieldL;
                            }

                            var10 /= this.fieldL;
                        }
                    }

                    for (var10 = 0; var10 < var4; ++var10) {
                        var11 = var7[var9];
                        int var12 = this.fieldW[var11 * 8 + var8];
                        if (var12 >= 0) {
                            int var13 = this.fieldV + var9 * this.fieldB;
                            classBg var14 = classBc.fieldF[var12];
                            int var15;
                            if (this.fieldA == 0) {
                                var15 = this.fieldB / var14.fieldA;

                                for (int var19 = 0; var19 < var15; ++var19) {
                                    float[] var20 = var14.b();

                                    for (int var18 = 0; var18 < var14.fieldA; ++var18) {
                                        var1[var13 + var19 + var18 * var15] += var20[var18];
                                    }
                                }
                            } else {
                                var15 = 0;

                                while (var15 < this.fieldB) {
                                    float[] var16 = var14.b();

                                    for (int var17 = 0; var17 < var14.fieldA; ++var17) {
                                        var1[var13 + var15] += var16[var17];
                                        ++var15;
                                    }
                                }
                            }
                        }

                        ++var9;
                        if (var9 >= var6) {
                            break;
                        }
                    }
                }
            }

        }
    }
}
