package com.jagex;

public class Model extends Renderable {

    public static int fieldBp = 0;
    public static boolean mouseInViewport = false;
    public static int fieldBl = 0;
    public static int totalHoveredUids = 0;
    public static int[] hoveredUids = new int[1000];
    static int fieldBu;
    static int[] fieldBr = RSGraphics2D.COS_TABLE;
    static Model fieldI = new Model();
    static byte[] fieldB = new byte[1];
    static int[] fieldAj = new int[2000];
    static int[] fieldAy = new int[10];
    static boolean[] fieldAm = new boolean[4096];
    static int[] fieldAc = new int[10];
    static int[] fieldAf = new int[2000];
    static boolean[] fieldAq = new boolean[4096];
    static int[] fieldAu = new int[12];
    static int[] fieldAx = new int[4096];
    static int[] fieldAz = new int[4096];
    static int[] fieldAi = new int[4096];
    static int[] fieldAa = new int[4096];
    static int[] fieldAt = new int[4096];
    static int[] fieldAw = new int[4096];
    static int[] fieldAg = new int[1600];
    static int[][] fieldAd = new int[1600][512];
    static int[][] fieldAk = new int[12][2000];
    static int[] fieldBe = RSGraphics2D.fieldAn;
    static int[] fieldAb = new int[12];
    static Model fieldA = new Model();
    static byte[] fieldV = new byte[1];
    static int fieldBo;
    static int fieldBi;
    static int[] fieldAp = new int[10];
    static int[] fieldBz = RSGraphics2D.SIN_TABLE;
    static int[] fieldBb = RSGraphics2D.fieldAr;
    public boolean fieldAn = false;
    int fieldL = 0;
    int[] fieldM;
    int[] fieldW;
    int[] fieldE;
    int fieldN = 0;
    int[] fieldS;
    int[] fieldK;
    int fieldAe;
    byte[] fieldQ;
    short[] fieldU;
    int[] fieldX;
    int[] fieldY;
    int[] fieldP;
    int[] fieldR;
    int[][] fieldZ;
    int fieldAs;
    int fieldAh;
    int fieldAr;
    int fieldAv;
    int[] fieldD;
    byte[] fieldH;
    byte fieldJ = 0;
    int[] fieldO;
    int[][] fieldC;
    int[] fieldF;
    byte[] fieldT;
    int fieldG = 0;


    public Model(Model[] var1, int var2) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.fieldL = 0;
        this.fieldN = 0;
        this.fieldG = 0;
        this.fieldJ = -1;

        int var7;
        Model var8;
        for (var7 = 0; var7 < var2; ++var7) {
            var8 = var1[var7];
            if (var8 != null) {
                this.fieldL += var8.fieldL;
                this.fieldN += var8.fieldN;
                this.fieldG += var8.fieldG;
                if (var8.fieldQ != null) {
                    var3 = true;
                } else {
                    if (this.fieldJ == -1) {
                        this.fieldJ = var8.fieldJ;
                    }

                    if (this.fieldJ != var8.fieldJ) {
                        var3 = true;
                    }
                }

                var4 |= var8.fieldT != null;
                var5 |= var8.fieldU != null;
                var6 |= var8.fieldH != null;
            }
        }

        this.fieldM = new int[this.fieldL];
        this.fieldW = new int[this.fieldL];
        this.fieldE = new int[this.fieldL];
        this.fieldS = new int[this.fieldN];
        this.fieldK = new int[this.fieldN];
        this.fieldF = new int[this.fieldN];
        this.fieldD = new int[this.fieldN];
        this.fieldX = new int[this.fieldN];
        this.fieldO = new int[this.fieldN];
        if (var3) {
            this.fieldQ = new byte[this.fieldN];
        }

        if (var4) {
            this.fieldT = new byte[this.fieldN];
        }

        if (var5) {
            this.fieldU = new short[this.fieldN];
        }

        if (var6) {
            this.fieldH = new byte[this.fieldN];
        }

        if (this.fieldG > 0) {
            this.fieldY = new int[this.fieldG];
            this.fieldP = new int[this.fieldG];
            this.fieldR = new int[this.fieldG];
        }

        this.fieldL = 0;
        this.fieldN = 0;
        this.fieldG = 0;

        for (var7 = 0; var7 < var2; ++var7) {
            var8 = var1[var7];
            if (var8 != null) {
                int var9;
                for (var9 = 0; var9 < var8.fieldN; ++var9) {
                    this.fieldS[this.fieldN] = var8.fieldS[var9] + this.fieldL;
                    this.fieldK[this.fieldN] = var8.fieldK[var9] + this.fieldL;
                    this.fieldF[this.fieldN] = var8.fieldF[var9] + this.fieldL;
                    this.fieldD[this.fieldN] = var8.fieldD[var9];
                    this.fieldX[this.fieldN] = var8.fieldX[var9];
                    this.fieldO[this.fieldN] = var8.fieldO[var9];
                    if (var3) {
                        if (var8.fieldQ != null) {
                            this.fieldQ[this.fieldN] = var8.fieldQ[var9];
                        } else {
                            this.fieldQ[this.fieldN] = var8.fieldJ;
                        }
                    }

                    if (var4 && var8.fieldT != null) {
                        this.fieldT[this.fieldN] = var8.fieldT[var9];
                    }

                    if (var5) {
                        if (var8.fieldU != null) {
                            this.fieldU[this.fieldN] = var8.fieldU[var9];
                        } else {
                            this.fieldU[this.fieldN] = -1;
                        }
                    }

                    if (var6) {
                        if (var8.fieldH != null && var8.fieldH[var9] != -1) {
                            this.fieldH[this.fieldN] = (byte) (var8.fieldH[var9] + this.fieldG);
                        } else {
                            this.fieldH[this.fieldN] = -1;
                        }
                    }

                    ++this.fieldN;
                }

                for (var9 = 0; var9 < var8.fieldG; ++var9) {
                    this.fieldY[this.fieldG] = var8.fieldY[var9] + this.fieldL;
                    this.fieldP[this.fieldG] = var8.fieldP[var9] + this.fieldL;
                    this.fieldR[this.fieldG] = var8.fieldR[var9] + this.fieldL;
                    ++this.fieldG;
                }

                for (var9 = 0; var9 < var8.fieldL; ++var9) {
                    this.fieldM[this.fieldL] = var8.fieldM[var9];
                    this.fieldW[this.fieldL] = var8.fieldW[var9];
                    this.fieldE[this.fieldL] = var8.fieldE[var9];
                    ++this.fieldL;
                }
            }
        }

    }

    Model() {
    }

    public void o() {
        for (int var1 = 0; var1 < this.fieldL; ++var1) {
            int var2 = this.fieldE[var1];
            this.fieldE[var1] = this.fieldM[var1];
            this.fieldM[var1] = -var2;
        }

        this.fieldAs = 0;
    }

    /**
     *
     * @param XRotation  Rotation Along the X-Axis
     * @param ZRotation
     * @param YRotation
     * @param var4
     * @param distX //Distance within the XPlane
     * @param distZ
     * @param distY
     */
    public final void u(int XRotation, int ZRotation, int YRotation, int var4, int distX, int distZ, int distY) {
        fieldAg[0] = -1;
        if (this.fieldAs != 2 && this.fieldAs != 1) {
            this.e();
        }

        int var8 = RSGraphics2D.screenCenterX;
        int var9 = RSGraphics2D.screenCenterY;
        int var10 = fieldBz[XRotation];
        int var11 = fieldBr[XRotation];
        int var12 = fieldBz[ZRotation];
        int var13 = fieldBr[ZRotation];
        int var14 = fieldBz[YRotation];
        int var15 = fieldBr[YRotation];
        int var16 = fieldBz[var4];
        int var17 = fieldBr[var4];
        int var18 = distZ * var16 + distY * var17 >> 16;

        for (int var19 = 0; var19 < this.fieldL; ++var19) {
            int var20 = this.fieldM[var19];
            int var21 = this.fieldW[var19];
            int var22 = this.fieldE[var19];
            int var23;
            if (YRotation != 0) {
                var23 = var21 * var14 + var20 * var15 >> 16;
                var21 = var21 * var15 - var20 * var14 >> 16;
                var20 = var23;
            }

            if (XRotation != 0) {
                var23 = var21 * var11 - var22 * var10 >> 16;
                var22 = var21 * var10 + var22 * var11 >> 16;
                var21 = var23;
            }

            if (ZRotation != 0) {
                var23 = var22 * var12 + var20 * var13 >> 16;
                var22 = var22 * var13 - var20 * var12 >> 16;
                var20 = var23;
            }

            var20 += distX;
            var21 += distZ;
            var22 += distY;
            var23 = var21 * var17 - var22 * var16 >> 16;
            var22 = var21 * var16 + var22 * var17 >> 16;
            fieldAi[var19] = var22 - var18;
            fieldAx[var19] = var8 + (var20 << 9) / var22;
            fieldAz[var19] = var9 + (var23 << 9) / var22;
            if (this.fieldG > 0) {
                fieldAa[var19] = var20;
                fieldAt[var19] = var23;
                fieldAw[var19] = var22;
            }
        }

        try {
            this.g(false, false, 0);
        } catch (Exception var24) {
            ;
        }

    }

    public Model i(boolean var1) {
        if (!var1 && fieldV.length < this.fieldN) {
            fieldV = new byte[this.fieldN + 100];
        }

        return this.l(var1, fieldA, fieldV);
    }

    Model l(boolean var1, Model var2, byte[] var3) {
        var2.fieldL = this.fieldL;
        var2.fieldN = this.fieldN;
        var2.fieldG = this.fieldG;
        if (var2.fieldM == null || var2.fieldM.length < this.fieldL) {
            var2.fieldM = new int[this.fieldL + 100];
            var2.fieldW = new int[this.fieldL + 100];
            var2.fieldE = new int[this.fieldL + 100];
        }

        int var4;
        for (var4 = 0; var4 < this.fieldL; ++var4) {
            var2.fieldM[var4] = this.fieldM[var4];
            var2.fieldW[var4] = this.fieldW[var4];
            var2.fieldE[var4] = this.fieldE[var4];
        }

        if (var1) {
            var2.fieldT = this.fieldT;
        } else {
            var2.fieldT = var3;
            if (this.fieldT == null) {
                for (var4 = 0; var4 < this.fieldN; ++var4) {
                    var2.fieldT[var4] = 0;
                }
            } else {
                for (var4 = 0; var4 < this.fieldN; ++var4) {
                    var2.fieldT[var4] = this.fieldT[var4];
                }
            }
        }

        var2.fieldS = this.fieldS;
        var2.fieldK = this.fieldK;
        var2.fieldF = this.fieldF;
        var2.fieldD = this.fieldD;
        var2.fieldX = this.fieldX;
        var2.fieldO = this.fieldO;
        var2.fieldQ = this.fieldQ;
        var2.fieldH = this.fieldH;
        var2.fieldU = this.fieldU;
        var2.fieldJ = this.fieldJ;
        var2.fieldY = this.fieldY;
        var2.fieldP = this.fieldP;
        var2.fieldR = this.fieldR;
        var2.fieldZ = this.fieldZ;
        var2.fieldC = this.fieldC;
        var2.fieldAn = this.fieldAn;
        var2.fieldAs = 0;
        return var2;
    }

    public void m() {
        if (this.fieldAs != 1) {
            this.fieldAs = 1;
            this.modelHeight = 0;
            this.fieldAh = 0;
            this.fieldAr = 0;

            for (int var1 = 0; var1 < this.fieldL; ++var1) {
                int var2 = this.fieldM[var1];
                int var3 = this.fieldW[var1];
                int var4 = this.fieldE[var1];
                if (-var3 > this.modelHeight * 1802750145) {
                    this.modelHeight = -var3 * 764200769;
                }

                if (var3 > this.fieldAh) {
                    this.fieldAh = var3;
                }

                int var5 = var2 * var2 + var4 * var4;
                if (var5 > this.fieldAr) {
                    this.fieldAr = var5;
                }
            }

            this.fieldAr = (int) (Math.sqrt((double) this.fieldAr) + 0.99D);
            this.fieldAv = (int) (Math.sqrt((double) (this.fieldAr * this.fieldAr + this.modelHeight * 1802750145 * this.modelHeight * 1802750145)) + 0.99D);
            this.fieldAe = this.fieldAv + (int) (Math.sqrt((double) (this.fieldAr * this.fieldAr + this.fieldAh * this.fieldAh)) + 0.99D);
        }
    }

    void e() {
        if (this.fieldAs != 2) {
            this.fieldAs = 2;
            this.fieldAr = 0;

            for (int var1 = 0; var1 < this.fieldL; ++var1) {
                int var2 = this.fieldM[var1];
                int var3 = this.fieldW[var1];
                int var4 = this.fieldE[var1];
                int var5 = var2 * var2 + var4 * var4 + var3 * var3;
                if (var5 > this.fieldAr) {
                    this.fieldAr = var5;
                }
            }

            this.fieldAr = (int) (Math.sqrt((double) this.fieldAr) + 0.99D);
            this.fieldAv = this.fieldAr;
            this.fieldAe = this.fieldAr + this.fieldAr;
        }
    }

    public void s(classCx var1, int var2) {
        if (this.fieldZ != null) {
            if (var2 != -1) {
                classCq var3 = var1.fieldA[var2];
                classCc var4 = var3.fieldL;
                fieldBu = 0;
                fieldBo = 0;
                fieldBi = 0;

                for (int var5 = 0; var5 < var3.fieldM; ++var5) {
                    int var6 = var3.fieldW[var5];
                    this.f(var4.fieldI[var6], var4.fieldB[var6], var3.fieldE[var5], var3.fieldN[var5], var3.fieldS[var5]);
                }

                this.fieldAs = 0;
            }
        }
    }

    public void d() {
        for (int var1 = 0; var1 < this.fieldL; ++var1) {
            int var2 = this.fieldM[var1];
            this.fieldM[var1] = this.fieldE[var1];
            this.fieldE[var1] = -var2;
        }

        this.fieldAs = 0;
    }

    public void x() {
        for (int var1 = 0; var1 < this.fieldL; ++var1) {
            this.fieldM[var1] = -this.fieldM[var1];
            this.fieldE[var1] = -this.fieldE[var1];
        }

        this.fieldAs = 0;
    }

    public void q(int var1) {
        int var2 = fieldBz[var1];
        int var3 = fieldBr[var1];

        for (int var4 = 0; var4 < this.fieldL; ++var4) {
            int var5 = this.fieldW[var4] * var3 - this.fieldE[var4] * var2 >> 16;
            this.fieldE[var4] = this.fieldW[var4] * var2 + this.fieldE[var4] * var3 >> 16;
            this.fieldW[var4] = var5;
        }

        this.fieldAs = 0;
    }

    void f(int var1, int[] var2, int var3, int var4, int var5) {
        int var6 = var2.length;
        int var7;
        int var8;
        int var11;
        int var12;
        if (var1 == 0) {
            var7 = 0;
            fieldBu = 0;
            fieldBo = 0;
            fieldBi = 0;

            for (var8 = 0; var8 < var6; ++var8) {
                int var18 = var2[var8];
                if (var18 < this.fieldZ.length) {
                    int[] var19 = this.fieldZ[var18];

                    for (var11 = 0; var11 < var19.length; ++var11) {
                        var12 = var19[var11];
                        fieldBu += this.fieldM[var12];
                        fieldBo += this.fieldW[var12];
                        fieldBi += this.fieldE[var12];
                        ++var7;
                    }
                }
            }

            if (var7 > 0) {
                fieldBu = fieldBu / var7 + var3;
                fieldBo = fieldBo / var7 + var4;
                fieldBi = fieldBi / var7 + var5;
            } else {
                fieldBu = var3;
                fieldBo = var4;
                fieldBi = var5;
            }

        } else {
            int[] var9;
            int var10;
            if (var1 == 1) {
                for (var7 = 0; var7 < var6; ++var7) {
                    var8 = var2[var7];
                    if (var8 < this.fieldZ.length) {
                        var9 = this.fieldZ[var8];

                        for (var10 = 0; var10 < var9.length; ++var10) {
                            var11 = var9[var10];
                            this.fieldM[var11] += var3;
                            this.fieldW[var11] += var4;
                            this.fieldE[var11] += var5;
                        }
                    }
                }

            } else if (var1 == 2) {
                for (var7 = 0; var7 < var6; ++var7) {
                    var8 = var2[var7];
                    if (var8 < this.fieldZ.length) {
                        var9 = this.fieldZ[var8];

                        for (var10 = 0; var10 < var9.length; ++var10) {
                            var11 = var9[var10];
                            this.fieldM[var11] -= fieldBu;
                            this.fieldW[var11] -= fieldBo;
                            this.fieldE[var11] -= fieldBi;
                            var12 = (var3 & 255) * 8;
                            int var13 = (var4 & 255) * 8;
                            int var14 = (var5 & 255) * 8;
                            int var15;
                            int var16;
                            int var17;
                            if (var14 != 0) {
                                var15 = fieldBz[var14];
                                var16 = fieldBr[var14];
                                var17 = this.fieldW[var11] * var15 + this.fieldM[var11] * var16 >> 16;
                                this.fieldW[var11] = this.fieldW[var11] * var16 - this.fieldM[var11] * var15 >> 16;
                                this.fieldM[var11] = var17;
                            }

                            if (var12 != 0) {
                                var15 = fieldBz[var12];
                                var16 = fieldBr[var12];
                                var17 = this.fieldW[var11] * var16 - this.fieldE[var11] * var15 >> 16;
                                this.fieldE[var11] = this.fieldW[var11] * var15 + this.fieldE[var11] * var16 >> 16;
                                this.fieldW[var11] = var17;
                            }

                            if (var13 != 0) {
                                var15 = fieldBz[var13];
                                var16 = fieldBr[var13];
                                var17 = this.fieldE[var11] * var15 + this.fieldM[var11] * var16 >> 16;
                                this.fieldE[var11] = this.fieldE[var11] * var16 - this.fieldM[var11] * var15 >> 16;
                                this.fieldM[var11] = var17;
                            }

                            this.fieldM[var11] += fieldBu;
                            this.fieldW[var11] += fieldBo;
                            this.fieldE[var11] += fieldBi;
                        }
                    }
                }

            } else if (var1 == 3) {
                for (var7 = 0; var7 < var6; ++var7) {
                    var8 = var2[var7];
                    if (var8 < this.fieldZ.length) {
                        var9 = this.fieldZ[var8];

                        for (var10 = 0; var10 < var9.length; ++var10) {
                            var11 = var9[var10];
                            this.fieldM[var11] -= fieldBu;
                            this.fieldW[var11] -= fieldBo;
                            this.fieldE[var11] -= fieldBi;
                            this.fieldM[var11] = this.fieldM[var11] * var3 / 128;
                            this.fieldW[var11] = this.fieldW[var11] * var4 / 128;
                            this.fieldE[var11] = this.fieldE[var11] * var5 / 128;
                            this.fieldM[var11] += fieldBu;
                            this.fieldW[var11] += fieldBo;
                            this.fieldE[var11] += fieldBi;
                        }
                    }
                }

            } else if (var1 == 5) {
                if (this.fieldC != null && this.fieldT != null) {
                    for (var7 = 0; var7 < var6; ++var7) {
                        var8 = var2[var7];
                        if (var8 < this.fieldC.length) {
                            var9 = this.fieldC[var8];

                            for (var10 = 0; var10 < var9.length; ++var10) {
                                var11 = var9[var10];
                                var12 = (this.fieldT[var11] & 255) + var3 * 8;
                                if (var12 < 0) {
                                    var12 = 0;
                                } else if (var12 > 255) {
                                    var12 = 255;
                                }

                                this.fieldT[var11] = (byte) var12;
                            }
                        }
                    }
                }

            }
        }
    }

    boolean hovered = false;
    int x,y,w,h;



    @Override
    void render(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int uid) {
        if(hardColor)
            forceColor = true;
        hovered = false;
        fieldAg[0] = -1;
        if (this.fieldAs != 1)
            this.m();
        int var10 = var8 * var5 - var6 * var4 >> 16;
        int var11 = var7 * var2 + var10 * var3 >> 16;
        int var12 = this.fieldAr * var3 >> 16;
        int var13 = var11 + var12;
        if (var13 > 50 && var11 < 3500) {
            int var14 = var8 * var4 + var6 * var5 >> 16;
            int var15 = var14 - this.fieldAr << 9;
            if (var15 / var13 < RSGraphics2D.fieldP) {
                int var16 = var14 + this.fieldAr << 9;
                if (var16 / var13 > RSGraphics2D.fieldY) {
                    int var17 = var7 * var3 - var10 * var2 >> 16;
                    int var18 = this.fieldAr * var2 >> 16;
                    int var19 = var17 + var18 << 9;
                    if (var19 / var13 > RSGraphics2D.fieldR) {
                        int var20 = var18 + (this.modelHeight * 1802750145 * var3 >> 16);
                        int var21 = var17 - var20 << 9;
                        if (var21 / var13 < RSGraphics2D.fieldZ) {
                            int var22 = var12 + (this.modelHeight * 1802750145 * var2 >> 16);
                            boolean var23 = false;
                            boolean var24 = false;
                            if (var11 - var22 <= 50) {
                                var24 = true;
                            }

                            boolean var25 = var24 || this.fieldG > 0;
                            boolean var26 = false;
                            int var27;
                            int var28;
                            int var29;
                            if (uid > 0 && mouseInViewport) {
                                var27 = var11 - var12;
                                if (var27 <= 50) {
                                    var27 = 50;
                                }

                                if (var14 > 0) {
                                    var15 /= var13;
                                    var16 /= var27;
                                } else {
                                    var16 /= var13;
                                    var15 /= var27;
                                }

                                if (var17 > 0) {
                                    var21 /= var13;
                                    var19 /= var27;
                                } else {
                                    var19 /= var13;
                                    var21 /= var27;
                                }



                            //    System.out.println(var15 + "," + var16 + "," + var21 + "," + var19);
                                var28 = fieldBl - RSGraphics2D.screenCenterX;
                                var29 = fieldBp - RSGraphics2D.screenCenterY;

                                x = var15 + RSGraphics2D.screenCenterX - 4;
                                y = var16 + RSGraphics2D.screenCenterY - 4;
                                w = var21 - var15;
                                h = var19 - var16;

                                if (var28 > var15 && var28 < var16 && var29 > var21 && var29 < var19) {
                                    hovered = true;
                                    if (this.fieldAn) {
                                       hoveredUids[totalHoveredUids++] = uid;
                                    } else {
                                        var26 = true;
                                    }
                                }
                            }

                            var27 = RSGraphics2D.screenCenterX;
                            var28 = RSGraphics2D.screenCenterY;
                            var29 = 0;
                            int var30 = 0;
                            if (var1 != 0) {
                                var29 = fieldBz[var1];
                                var30 = fieldBr[var1];
                            }

                            for (int var31 = 0; var31 < this.fieldL; ++var31) {
                                int var32 = this.fieldM[var31];
                                int var33 = this.fieldW[var31];
                                int var34 = this.fieldE[var31];
                                int var35;
                                if (var1 != 0) {
                                    var35 = var34 * var29 + var32 * var30 >> 16;
                                    var34 = var34 * var30 - var32 * var29 >> 16;
                                    var32 = var35;
                                }

                                var32 += var6;
                                var33 += var7;
                                var34 += var8;
                                var35 = var34 * var4 + var32 * var5 >> 16;
                                var34 = var34 * var5 - var32 * var4 >> 16;
                                var32 = var35;
                                var35 = var33 * var3 - var34 * var2 >> 16;
                                var34 = var33 * var2 + var34 * var3 >> 16;
                                fieldAi[var31] = var34 - var11;
                                if (var34 >= 50) {
                                    fieldAx[var31] = var27 + (var32 << 9) / var34;
                                    fieldAz[var31] = var28 + (var35 << 9) / var34;
                                } else {
                                    fieldAx[var31] = -5000;
                                    var23 = true;
                                }

                                if (var25) {
                                    fieldAa[var31] = var32;
                                    fieldAt[var31] = var35;
                                    fieldAw[var31] = var34;
                                }
                            }

                            try {
                                this.g(var23, var26, uid);
                            } catch (Exception var36) {
                                ;
                            }

                        }
                    }
                }
            }
        }

        forceColor = false;

    }

    final void g(boolean var1, boolean var2, int var3) {
        if (this.fieldAe < 1600) {
            int var4;
            for (var4 = 0; var4 < this.fieldAe; ++var4) {
                fieldAg[var4] = 0;
            }

            int var5;
            int var6;
            int var7;
            int var8;
            int var9;
            int var10;
            int var12;
            int var13;
            int var15;
            for (var4 = 0; var4 < this.fieldN; ++var4) {
                if (this.fieldO[var4] != -2) {
                    var5 = this.fieldS[var4];
                    var6 = this.fieldK[var4];
                    var7 = this.fieldF[var4];
                    var8 = fieldAx[var5];
                    var9 = fieldAx[var6];
                    var10 = fieldAx[var7];
                    int var11;
                    if (var1 && (var8 == -5000 || var9 == -5000 || var10 == -5000)) {
                        var11 = fieldAa[var5];
                        var12 = fieldAa[var6];
                        var13 = fieldAa[var7];
                        int var14 = fieldAt[var5];
                        var15 = fieldAt[var6];
                        int var16 = fieldAt[var7];
                        int var17 = fieldAw[var5];
                        int var18 = fieldAw[var6];
                        int var19 = fieldAw[var7];
                        var11 -= var12;
                        var13 -= var12;
                        var14 -= var15;
                        var16 -= var15;
                        var17 -= var18;
                        var19 -= var18;
                        int var20 = var14 * var19 - var17 * var16;
                        int var21 = var17 * var13 - var11 * var19;
                        int var22 = var11 * var16 - var14 * var13;
                        if (var12 * var20 + var15 * var21 + var18 * var22 > 0) {
                            fieldAm[var4] = true;
                            int var23 = (fieldAi[var5] + fieldAi[var6] + fieldAi[var7]) / 3 + this.fieldAv;
                            fieldAd[var23][fieldAg[var23]++] = var4;
                        }
                    } else {
                        if (var2 && this.as(fieldBl, fieldBp, fieldAz[var5], fieldAz[var6], fieldAz[var7], var8, var9, var10)) {
                            hoveredUids[totalHoveredUids++] = var3;
                            var2 = false;
                            hovered = true;
                        }

                        if ((var8 - var9) * (fieldAz[var7] - fieldAz[var6]) - (fieldAz[var5] - fieldAz[var6]) * (var10 - var9) > 0) {
                            fieldAm[var4] = false;
                            if (var8 >= 0 && var9 >= 0 && var10 >= 0 && var8 <= RSGraphics2D.fieldJ && var9 <= RSGraphics2D.fieldJ && var10 <= RSGraphics2D.fieldJ) {
                                fieldAq[var4] = false;
                            } else {
                                fieldAq[var4] = true;
                            }

                            var11 = (fieldAi[var5] + fieldAi[var6] + fieldAi[var7]) / 3 + this.fieldAv;
                            fieldAd[var11][fieldAg[var11]++] = var4;
                        }
                    }
                }
            }



            int[] var24;
            if (this.fieldQ == null) {
                for (var4 = this.fieldAe - 1; var4 >= 0; --var4) {
                    var5 = fieldAg[var4];
                    if (var5 > 0) {
                        var24 = fieldAd[var4];

                        for (var7 = 0; var7 < var5; ++var7) {
                            this.y(var24[var7]);
                        }
                    }
                }

            } else {
                for (var4 = 0; var4 < 12; ++var4) {
                    fieldAu[var4] = 0;
                    fieldAb[var4] = 0;
                }

                for (var4 = this.fieldAe - 1; var4 >= 0; --var4) {
                    var5 = fieldAg[var4];
                    if (var5 > 0) {
                        var24 = fieldAd[var4];

                        for (var7 = 0; var7 < var5; ++var7) {
                            var8 = var24[var7];
                            byte var25 = this.fieldQ[var8];
                            var10 = fieldAu[var25]++;
                            fieldAk[var25][var10] = var8;
                            if (var25 < 10) {
                                fieldAb[var25] += var4;
                            } else if (var25 == 10) {
                                fieldAj[var10] = var4;
                            } else {
                                fieldAf[var10] = var4;
                            }
                        }
                    }
                }

                var4 = 0;
                if (fieldAu[1] > 0 || fieldAu[2] > 0) {
                    var4 = (fieldAb[1] + fieldAb[2]) / (fieldAu[1] + fieldAu[2]);
                }

                var5 = 0;
                if (fieldAu[3] > 0 || fieldAu[4] > 0) {
                    var5 = (fieldAb[3] + fieldAb[4]) / (fieldAu[3] + fieldAu[4]);
                }

                var6 = 0;
                if (fieldAu[6] > 0 || fieldAu[8] > 0) {
                    var6 = (fieldAb[6] + fieldAb[8]) / (fieldAu[6] + fieldAu[8]);
                }

                var8 = 0;
                var9 = fieldAu[10];
                int[] var26 = fieldAk[10];
                int[] var27 = fieldAj;
                if (var8 == var9) {
                    var8 = 0;
                    var9 = fieldAu[11];
                    var26 = fieldAk[11];
                    var27 = fieldAf;
                }

                if (var8 < var9) {
                    var7 = var27[var8];
                } else {
                    var7 = -1000;
                }

                for (var12 = 0; var12 < 10; ++var12) {
                    while (var12 == 0 && var7 > var4) {
                        this.y(var26[var8++]);
                        if (var8 == var9 && var26 != fieldAk[11]) {
                            var8 = 0;
                            var9 = fieldAu[11];
                            var26 = fieldAk[11];
                            var27 = fieldAf;
                        }

                        if (var8 < var9) {
                            var7 = var27[var8];
                        } else {
                            var7 = -1000;
                        }
                    }

                    while (var12 == 3 && var7 > var5) {
                        this.y(var26[var8++]);
                        if (var8 == var9 && var26 != fieldAk[11]) {
                            var8 = 0;
                            var9 = fieldAu[11];
                            var26 = fieldAk[11];
                            var27 = fieldAf;
                        }

                        if (var8 < var9) {
                            var7 = var27[var8];
                        } else {
                            var7 = -1000;
                        }
                    }

                    while (var12 == 5 && var7 > var6) {
                        this.y(var26[var8++]);
                        if (var8 == var9 && var26 != fieldAk[11]) {
                            var8 = 0;
                            var9 = fieldAu[11];
                            var26 = fieldAk[11];
                            var27 = fieldAf;
                        }

                        if (var8 < var9) {
                            var7 = var27[var8];
                        } else {
                            var7 = -1000;
                        }
                    }

                    var13 = fieldAu[var12];
                    int[] var28 = fieldAk[var12];

                    for (var15 = 0; var15 < var13; ++var15) {
                        this.y(var28[var15]);
                    }
                }

                while (var7 != -1000) {
                    this.y(var26[var8++]);
                    if (var8 == var9 && var26 != fieldAk[11]) {
                        var8 = 0;
                        var26 = fieldAk[11];
                        var9 = fieldAu[11];
                        var27 = fieldAf;
                    }

                    if (var8 < var9) {
                        var7 = var27[var8];
                    } else {
                        var7 = -1000;
                    }
                }

            }
        }
    }

    final void y(int var1) {
        if (fieldAm[var1]) {
            this.p(var1);
        } else {
            int var2 = this.fieldS[var1];
            int var3 = this.fieldK[var1];
            int var4 = this.fieldF[var1];
            RSGraphics2D.offscreen = fieldAq[var1];
            if (this.fieldT == null) {
                RSGraphics2D.alpha = 0;
            } else {
                RSGraphics2D.alpha = this.fieldT[var1] & 255;
            }

            if (this.fieldU != null && this.fieldU[var1] != -1) {
                int var5;
                int var6;
                int var7;
                if (this.fieldH != null && this.fieldH[var1] != -1) {
                    int var8 = this.fieldH[var1] & 255;
                    var5 = this.fieldY[var8];
                    var6 = this.fieldP[var8];
                    var7 = this.fieldR[var8];
                } else {
                    var5 = var2;
                    var6 = var3;
                    var7 = var4;
                }

                if (this.fieldO[var1] == -1) {
                    RSGraphics2D.method312(fieldAz[var2], fieldAz[var3], fieldAz[var4], fieldAx[var2], fieldAx[var3], fieldAx[var4], this.fieldD[var1], this.fieldD[var1], this.fieldD[var1], fieldAa[var5], fieldAa[var6], fieldAa[var7], fieldAt[var5], fieldAt[var6], fieldAt[var7], fieldAw[var5], fieldAw[var6], fieldAw[var7], this.fieldU[var1]);
                } else {
                    RSGraphics2D.method312(fieldAz[var2], fieldAz[var3], fieldAz[var4], fieldAx[var2], fieldAx[var3], fieldAx[var4], this.fieldD[var1], this.fieldX[var1], this.fieldO[var1], fieldAa[var5], fieldAa[var6], fieldAa[var7], fieldAt[var5], fieldAt[var6], fieldAt[var7], fieldAw[var5], fieldAw[var6], fieldAw[var7], this.fieldU[var1]);
                }
            } else if (forceColor||this.fieldO[var1] == -1) {
                int color = fieldBe[this.fieldD[var1]];
                if(forceColor) color = this.color;
                RSGraphics2D.fillTriangle(fieldAz[var2], fieldAz[var3], fieldAz[var4], fieldAx[var2], fieldAx[var3], fieldAx[var4], color);
            } else {
                RSGraphics2D.method316(fieldAz[var2], fieldAz[var3], fieldAz[var4], fieldAx[var2], fieldAx[var3], fieldAx[var4], this.fieldD[var1], this.fieldX[var1], this.fieldO[var1]);
            }

        }
    }

    final void p(int var1) {
        int var2 = RSGraphics2D.screenCenterX;
        int var3 = RSGraphics2D.screenCenterY;
        int var4 = 0;
        int var5 = this.fieldS[var1];
        int var6 = this.fieldK[var1];
        int var7 = this.fieldF[var1];
        int var8 = fieldAw[var5];
        int var9 = fieldAw[var6];
        int var10 = fieldAw[var7];
        if (this.fieldT == null) {
            RSGraphics2D.alpha = 0;
        } else {
            RSGraphics2D.alpha = this.fieldT[var1] & 255;
        }

        int var11;
        int var12;
        int var13;
        int var14;
        if (var8 >= 50) {
            fieldAc[var4] = fieldAx[var5];
            fieldAp[var4] = fieldAz[var5];
            fieldAy[var4++] = this.fieldD[var1];
        } else {
            var11 = fieldAa[var5];
            var12 = fieldAt[var5];
            var13 = this.fieldD[var1];
            if (var10 >= 50) {
                var14 = (50 - var8) * fieldBb[var10 - var8];
                fieldAc[var4] = var2 + (var11 + ((fieldAa[var7] - var11) * var14 >> 16) << 9) / 50;
                fieldAp[var4] = var3 + (var12 + ((fieldAt[var7] - var12) * var14 >> 16) << 9) / 50;
                fieldAy[var4++] = var13 + ((this.fieldO[var1] - var13) * var14 >> 16);
            }

            if (var9 >= 50) {
                var14 = (50 - var8) * fieldBb[var9 - var8];
                fieldAc[var4] = var2 + (var11 + ((fieldAa[var6] - var11) * var14 >> 16) << 9) / 50;
                fieldAp[var4] = var3 + (var12 + ((fieldAt[var6] - var12) * var14 >> 16) << 9) / 50;
                fieldAy[var4++] = var13 + ((this.fieldX[var1] - var13) * var14 >> 16);
            }
        }

        if (var9 >= 50) {
            fieldAc[var4] = fieldAx[var6];
            fieldAp[var4] = fieldAz[var6];
            fieldAy[var4++] = this.fieldX[var1];
        } else {
            var11 = fieldAa[var6];
            var12 = fieldAt[var6];
            var13 = this.fieldX[var1];
            if (var8 >= 50) {
                var14 = (50 - var9) * fieldBb[var8 - var9];
                fieldAc[var4] = var2 + (var11 + ((fieldAa[var5] - var11) * var14 >> 16) << 9) / 50;
                fieldAp[var4] = var3 + (var12 + ((fieldAt[var5] - var12) * var14 >> 16) << 9) / 50;
                fieldAy[var4++] = var13 + ((this.fieldD[var1] - var13) * var14 >> 16);
            }

            if (var10 >= 50) {
                var14 = (50 - var9) * fieldBb[var10 - var9];
                fieldAc[var4] = var2 + (var11 + ((fieldAa[var7] - var11) * var14 >> 16) << 9) / 50;
                fieldAp[var4] = var3 + (var12 + ((fieldAt[var7] - var12) * var14 >> 16) << 9) / 50;
                fieldAy[var4++] = var13 + ((this.fieldO[var1] - var13) * var14 >> 16);
            }
        }

        if (var10 >= 50) {
            fieldAc[var4] = fieldAx[var7];
            fieldAp[var4] = fieldAz[var7];
            fieldAy[var4++] = this.fieldO[var1];
        } else {
            var11 = fieldAa[var7];
            var12 = fieldAt[var7];
            var13 = this.fieldO[var1];
            if (var9 >= 50) {
                var14 = (50 - var10) * fieldBb[var9 - var10];
                fieldAc[var4] = var2 + (var11 + ((fieldAa[var6] - var11) * var14 >> 16) << 9) / 50;
                fieldAp[var4] = var3 + (var12 + ((fieldAt[var6] - var12) * var14 >> 16) << 9) / 50;
                fieldAy[var4++] = var13 + ((this.fieldX[var1] - var13) * var14 >> 16);
            }

            if (var8 >= 50) {
                var14 = (50 - var10) * fieldBb[var8 - var10];
                fieldAc[var4] = var2 + (var11 + ((fieldAa[var5] - var11) * var14 >> 16) << 9) / 50;
                fieldAp[var4] = var3 + (var12 + ((fieldAt[var5] - var12) * var14 >> 16) << 9) / 50;
                fieldAy[var4++] = var13 + ((this.fieldD[var1] - var13) * var14 >> 16);
            }
        }

        var11 = fieldAc[0];
        var12 = fieldAc[1];
        var13 = fieldAc[2];
        var14 = fieldAp[0];
        int var15 = fieldAp[1];
        int var16 = fieldAp[2];
        RSGraphics2D.offscreen = false;
        int var17;
        int var18;
        int var19;
        int var20;
        if (var4 == 3) {
            if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > RSGraphics2D.fieldJ || var12 > RSGraphics2D.fieldJ || var13 > RSGraphics2D.fieldJ) {
                RSGraphics2D.offscreen = true;
            }

            if (!forceColor && this.fieldU != null && this.fieldU[var1] != -1) {
                if (this.fieldH != null && this.fieldH[var1] != -1) {
                    var20 = this.fieldH[var1] & 255;
                    var17 = this.fieldY[var20];
                    var18 = this.fieldP[var20];
                    var19 = this.fieldR[var20];
                } else {
                    var17 = var5;
                    var18 = var6;
                    var19 = var7;
                }

                if (this.fieldO[var1] == -1) {
                    RSGraphics2D.method312(var14, var15, var16, var11, var12, var13, this.fieldD[var1], this.fieldD[var1], this.fieldD[var1], fieldAa[var17], fieldAa[var18], fieldAa[var19], fieldAt[var17], fieldAt[var18], fieldAt[var19], fieldAw[var17], fieldAw[var18], fieldAw[var19], this.fieldU[var1]);
                } else {
                    RSGraphics2D.method312(var14, var15, var16, var11, var12, var13, fieldAy[0], fieldAy[1], fieldAy[2], fieldAa[var17], fieldAa[var18], fieldAa[var19], fieldAt[var17], fieldAt[var18], fieldAt[var19], fieldAw[var17], fieldAw[var18], fieldAw[var19], this.fieldU[var1]);
                }
            } else if (forceColor||this.fieldO[var1] == -1) {
                int color = fieldBe[this.fieldD[var1]];
                if(forceColor) color = this.color;

                RSGraphics2D.fillTriangle(var14, var15, var16, var11, var12, var13, color);
            } else {
                RSGraphics2D.method316(var14, var15, var16, var11, var12, var13, fieldAy[0], fieldAy[1], fieldAy[2]);
            }
        }

        if (var4 == 4) {
            if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > RSGraphics2D.fieldJ || var12 > RSGraphics2D.fieldJ || var13 > RSGraphics2D.fieldJ || fieldAc[3] < 0 || fieldAc[3] > RSGraphics2D.fieldJ) {
                RSGraphics2D.offscreen = true;
            }

            if (!forceColor && this.fieldU != null && this.fieldU[var1] != -1) {
                if (this.fieldH != null && this.fieldH[var1] != -1) {
                    var20 = this.fieldH[var1] & 255;
                    var17 = this.fieldY[var20];
                    var18 = this.fieldP[var20];
                    var19 = this.fieldR[var20];
                } else {
                    var17 = var5;
                    var18 = var6;
                    var19 = var7;
                }

                short var21 = this.fieldU[var1];
                if (this.fieldO[var1] == -1) {
                    RSGraphics2D.method312(var14, var15, var16, var11, var12, var13, this.fieldD[var1], this.fieldD[var1], this.fieldD[var1], fieldAa[var17], fieldAa[var18], fieldAa[var19], fieldAt[var17], fieldAt[var18], fieldAt[var19], fieldAw[var17], fieldAw[var18], fieldAw[var19], var21);
                    RSGraphics2D.method312(var14, var16, fieldAp[3], var11, var13, fieldAc[3], this.fieldD[var1], this.fieldD[var1], this.fieldD[var1], fieldAa[var17], fieldAa[var18], fieldAa[var19], fieldAt[var17], fieldAt[var18], fieldAt[var19], fieldAw[var17], fieldAw[var18], fieldAw[var19], var21);
                } else {
                    RSGraphics2D.method312(var14, var15, var16, var11, var12, var13, fieldAy[0], fieldAy[1], fieldAy[2], fieldAa[var17], fieldAa[var18], fieldAa[var19], fieldAt[var17], fieldAt[var18], fieldAt[var19], fieldAw[var17], fieldAw[var18], fieldAw[var19], var21);
                    RSGraphics2D.method312(var14, var16, fieldAp[3], var11, var13, fieldAc[3], fieldAy[0], fieldAy[2], fieldAy[3], fieldAa[var17], fieldAa[var18], fieldAa[var19], fieldAt[var17], fieldAt[var18], fieldAt[var19], fieldAw[var17], fieldAw[var18], fieldAw[var19], var21);
                }
            } else if (forceColor||this.fieldO[var1] == -1) {
                var17 = fieldBe[this.fieldD[var1]];
                if(forceColor) var17 = this.color;
                RSGraphics2D.fillTriangle(var14, var15, var16, var11, var12, var13, var17);
                RSGraphics2D.fillTriangle(var14, var16, fieldAp[3], var11, var13, fieldAc[3], var17);
            } else {
                RSGraphics2D.method316(var14, var15, var16, var11, var12, var13, fieldAy[0], fieldAy[1], fieldAy[2]);
                RSGraphics2D.method316(var14, var16, fieldAp[3], var11, var13, fieldAc[3], fieldAy[0], fieldAy[2], fieldAy[3]);
            }
        }

    }

    final boolean as(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
        return var2 < var3 && var2 < var4 && var2 < var5 ? false : (var2 > var3 && var2 > var4 && var2 > var5 ? false : (var1 < var6 && var1 < var7 && var1 < var8 ? false : var1 <= var6 || var1 <= var7 || var1 <= var8));
    }

    public Model b(boolean var1) {
        if (!var1 && fieldB.length < this.fieldN) {
            fieldB = new byte[this.fieldN + 100];
        }

        return this.l(var1, fieldI, fieldB);
    }

    public void translate(int var1, int var2, int var3) {
        for (int var4 = 0; var4 < this.fieldL; ++var4) {
            this.fieldM[var4] += var1;
            this.fieldW[var4] += var2;
            this.fieldE[var4] += var3;
        }

        this.fieldAs = 0;
    }

    public final void j(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int radius) {
        fieldAg[0] = -1;
        if (this.fieldAs != 2 && this.fieldAs != 1) {
            this.e();
        }

        int var9 = RSGraphics2D.screenCenterX;
        int var10 = RSGraphics2D.screenCenterY;
        int var11 = fieldBz[var1];
        int var12 = fieldBr[var1];
        int var13 = fieldBz[var2];
        int var14 = fieldBr[var2];
        int var15 = fieldBz[var3];
        int var16 = fieldBr[var3];
        int var17 = fieldBz[var4];
        int var18 = fieldBr[var4];
        int var19 = var6 * var17 + var7 * var18 >> 16;

        for (int var20 = 0; var20 < this.fieldL; ++var20) {
            int var21 = this.fieldM[var20];
            int var22 = this.fieldW[var20];
            int var23 = this.fieldE[var20];
            int var24;
            if (var3 != 0) {
                var24 = var22 * var15 + var21 * var16 >> 16;
                var22 = var22 * var16 - var21 * var15 >> 16;
                var21 = var24;
            }

            if (var1 != 0) {
                var24 = var22 * var12 - var23 * var11 >> 16;
                var23 = var22 * var11 + var23 * var12 >> 16;
                var22 = var24;
            }

            if (var2 != 0) {
                var24 = var23 * var13 + var21 * var14 >> 16;
                var23 = var23 * var14 - var21 * var13 >> 16;
                var21 = var24;
            }

            var21 += var5;
            var22 += var6;
            var23 += var7;
            var24 = var22 * var18 - var23 * var17 >> 16;
            var23 = var22 * var17 + var23 * var18 >> 16;
            fieldAi[var20] = var23 - var19;
            fieldAx[var20] = var9 + (var21 << 9) / radius;
            fieldAz[var20] = var10 + (var24 << 9) / radius;
            if (this.fieldG > 0) {
                fieldAa[var20] = var21;
                fieldAt[var20] = var24;
                fieldAw[var20] = var23;
            }
        }

        try {
            this.g(false, false, 0);
        } catch (Exception var25) {
            ;
        }

    }

    public int n() {
        this.m();
        return this.fieldAr;
    }

    public void k(classCx var1, int var2, classCx var3, int var4, int[] var5) {
        if (var2 != -1) {
            if (var5 != null && var4 != -1) {
                classCq var6 = var1.fieldA[var2];
                classCq var7 = var3.fieldA[var4];
                classCc var8 = var6.fieldL;
                fieldBu = 0;
                fieldBo = 0;
                fieldBi = 0;
                byte var9 = 0;
                int var13 = var9 + 1;
                int var10 = var5[var9];

                int var11;
                int var12;
                for (var11 = 0; var11 < var6.fieldM; ++var11) {
                    for (var12 = var6.fieldW[var11]; var12 > var10; var10 = var5[var13++]) {
                        ;
                    }

                    if (var12 != var10 || var8.fieldI[var12] == 0) {
                        this.f(var8.fieldI[var12], var8.fieldB[var12], var6.fieldE[var11], var6.fieldN[var11], var6.fieldS[var11]);
                    }
                }

                fieldBu = 0;
                fieldBo = 0;
                fieldBi = 0;
                var9 = 0;
                var13 = var9 + 1;
                var10 = var5[var9];

                for (var11 = 0; var11 < var7.fieldM; ++var11) {
                    for (var12 = var7.fieldW[var11]; var12 > var10; var10 = var5[var13++]) {
                        ;
                    }

                    if (var12 == var10 || var8.fieldI[var12] == 0) {
                        this.f(var8.fieldI[var12], var8.fieldB[var12], var7.fieldE[var11], var7.fieldN[var11], var7.fieldS[var11]);
                    }
                }

                this.fieldAs = 0;
            } else {
                this.s(var1, var2);
            }
        }
    }

    public Model a(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
        this.m();
        int var7 = var2 - this.fieldAr;
        int var8 = var2 + this.fieldAr;
        int var9 = var4 - this.fieldAr;
        int var10 = var4 + this.fieldAr;
        if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
            var7 >>= 7;
            var8 = var8 + 127 >> 7;
            var9 >>= 7;
            var10 = var10 + 127 >> 7;
            if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
                return this;
            } else {
                Model var11;
                if (var5) {
                    var11 = new Model();
                    var11.fieldL = this.fieldL;
                    var11.fieldN = this.fieldN;
                    var11.fieldG = this.fieldG;
                    var11.fieldM = this.fieldM;
                    var11.fieldE = this.fieldE;
                    var11.fieldS = this.fieldS;
                    var11.fieldK = this.fieldK;
                    var11.fieldF = this.fieldF;
                    var11.fieldD = this.fieldD;
                    var11.fieldX = this.fieldX;
                    var11.fieldO = this.fieldO;
                    var11.fieldQ = this.fieldQ;
                    var11.fieldT = this.fieldT;
                    var11.fieldH = this.fieldH;
                    var11.fieldU = this.fieldU;
                    var11.fieldJ = this.fieldJ;
                    var11.fieldY = this.fieldY;
                    var11.fieldP = this.fieldP;
                    var11.fieldR = this.fieldR;
                    var11.fieldZ = this.fieldZ;
                    var11.fieldC = this.fieldC;
                    var11.fieldAn = this.fieldAn;
                    var11.fieldW = new int[var11.fieldL];
                } else {
                    var11 = this;
                }

                int var12;
                int var13;
                int var14;
                int var15;
                int var16;
                int var17;
                int var18;
                int var19;
                int var20;
                int var21;
                if (var6 == 0) {
                    for (var12 = 0; var12 < var11.fieldL; ++var12) {
                        var13 = this.fieldM[var12] + var2;
                        var14 = this.fieldE[var12] + var4;
                        var15 = var13 & 127;
                        var16 = var14 & 127;
                        var17 = var13 >> 7;
                        var18 = var14 >> 7;
                        var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                        var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                        var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                        var11.fieldW[var12] = this.fieldW[var12] + var21 - var3;
                    }
                } else {
                    for (var12 = 0; var12 < var11.fieldL; ++var12) {
                        var13 = (-this.fieldW[var12] << 16) / (this.modelHeight * 1802750145);
                        if (var13 < var6) {
                            var14 = this.fieldM[var12] + var2;
                            var15 = this.fieldE[var12] + var4;
                            var16 = var14 & 127;
                            var17 = var15 & 127;
                            var18 = var14 >> 7;
                            var19 = var15 >> 7;
                            var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                            var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
                            int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                            var11.fieldW[var12] = this.fieldW[var12] + (var22 - var3) * (var6 - var13) / var6;
                        }
                    }
                }

                var11.fieldAs = 0;
                return var11;
            }
        } else {
            return this;
        }
    }

    public void h(int var1, int var2, int var3) {
        for (int var4 = 0; var4 < this.fieldL; ++var4) {
            this.fieldM[var4] = this.fieldM[var4] * var1 / 128;
            this.fieldW[var4] = this.fieldW[var4] * var2 / 128;
            this.fieldE[var4] = this.fieldE[var4] * var3 / 128;
        }

        this.fieldAs = 0;
    }
}
