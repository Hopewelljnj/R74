package com.jagex;

public class classCy extends Renderable {

    static int[] fieldAk = RSGraphics2D.SIN_TABLE;
    static int[] fieldAd = new int[10000];
    static int fieldAu = 0;
    static int[] fieldAg = new int[10000];
    static int[] fieldAj = RSGraphics2D.COS_TABLE;
    public short fieldAm;
    public short fieldAx;
    int[] fieldB;
    int[] fieldV;
    int[] fieldAs;
    short[] fieldY;
    int fieldL = 0;
    short[] fieldJ;
    int[] fieldW;
    int fieldQ;
    byte[] fieldN;
    byte[] fieldS;
    byte[] fieldK;
    byte[] fieldF;
    short[] fieldD;
    short[] fieldX;
    byte fieldO = 0;
    short[] fieldH;
    int fieldAa;
    classCn[] fieldAq;
    short[] fieldG;
    short[] fieldU;
    short[] fieldP;
    short[] fieldR;
    short[] fieldZ;
    byte[] fieldT;
    byte[] fieldAn;
    int[] fieldI;
    int[] fieldAh;
    int[][] fieldAe;
    classBy[] fieldAv;
    classCn[] fieldAl;
    short[] fieldC;
    boolean fieldAz = false;
    int fieldAi;
    int[][] fieldAr;
    int fieldAt;
    int fieldAw;
    int fieldAo;
    int[] fieldM;
    int fieldA = 0;
    int[] fieldE;


    classCy(byte[] var1) {
        if (var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
            this.i(var1);
        } else {
            this.b(var1);
        }

    }

    public classCy(classCy[] var1, int var2) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.fieldA = 0;
        this.fieldL = 0;
        this.fieldQ = 0;
        this.fieldO = -1;

        int var9;
        classCy var10;
        for (var9 = 0; var9 < var2; ++var9) {
            var10 = var1[var9];
            if (var10 != null) {
                this.fieldA += var10.fieldA;
                this.fieldL += var10.fieldL;
                this.fieldQ += var10.fieldQ;
                if (var10.fieldS != null) {
                    var4 = true;
                } else {
                    if (this.fieldO == -1) {
                        this.fieldO = var10.fieldO;
                    }

                    if (this.fieldO != var10.fieldO) {
                        var4 = true;
                    }
                }

                var3 |= var10.fieldN != null;
                var5 |= var10.fieldK != null;
                var6 |= var10.fieldAh != null;
                var7 |= var10.fieldX != null;
                var8 |= var10.fieldF != null;
            }
        }

        this.fieldV = new int[this.fieldA];
        this.fieldI = new int[this.fieldA];
        this.fieldB = new int[this.fieldA];
        this.fieldAs = new int[this.fieldA];
        this.fieldM = new int[this.fieldL];
        this.fieldW = new int[this.fieldL];
        this.fieldE = new int[this.fieldL];
        if (var3) {
            this.fieldN = new byte[this.fieldL];
        }

        if (var4) {
            this.fieldS = new byte[this.fieldL];
        }

        if (var5) {
            this.fieldK = new byte[this.fieldL];
        }

        if (var6) {
            this.fieldAh = new int[this.fieldL];
        }

        if (var7) {
            this.fieldX = new short[this.fieldL];
        }

        if (var8) {
            this.fieldF = new byte[this.fieldL];
        }

        this.fieldD = new short[this.fieldL];
        if (this.fieldQ > 0) {
            this.fieldT = new byte[this.fieldQ];
            this.fieldH = new short[this.fieldQ];
            this.fieldU = new short[this.fieldQ];
            this.fieldJ = new short[this.fieldQ];
            this.fieldG = new short[this.fieldQ];
            this.fieldY = new short[this.fieldQ];
            this.fieldP = new short[this.fieldQ];
            this.fieldR = new short[this.fieldQ];
            this.fieldAn = new byte[this.fieldQ];
            this.fieldZ = new short[this.fieldQ];
            this.fieldC = new short[this.fieldQ];
        }

        this.fieldA = 0;
        this.fieldL = 0;
        this.fieldQ = 0;

        for (var9 = 0; var9 < var2; ++var9) {
            var10 = var1[var9];
            if (var10 != null) {
                int var11;
                for (var11 = 0; var11 < var10.fieldL; ++var11) {
                    if (var3 && var10.fieldN != null) {
                        this.fieldN[this.fieldL] = var10.fieldN[var11];
                    }

                    if (var4) {
                        if (var10.fieldS != null) {
                            this.fieldS[this.fieldL] = var10.fieldS[var11];
                        } else {
                            this.fieldS[this.fieldL] = var10.fieldO;
                        }
                    }

                    if (var5 && var10.fieldK != null) {
                        this.fieldK[this.fieldL] = var10.fieldK[var11];
                    }

                    if (var6 && var10.fieldAh != null) {
                        this.fieldAh[this.fieldL] = var10.fieldAh[var11];
                    }

                    if (var7) {
                        if (var10.fieldX != null) {
                            this.fieldX[this.fieldL] = var10.fieldX[var11];
                        } else {
                            this.fieldX[this.fieldL] = -1;
                        }
                    }

                    if (var8) {
                        if (var10.fieldF != null && var10.fieldF[var11] != -1) {
                            this.fieldF[this.fieldL] = (byte) (var10.fieldF[var11] + this.fieldQ);
                        } else {
                            this.fieldF[this.fieldL] = -1;
                        }
                    }

                    this.fieldD[this.fieldL] = var10.fieldD[var11];
                    this.fieldM[this.fieldL] = this.l(var10, var10.fieldM[var11]);
                    this.fieldW[this.fieldL] = this.l(var10, var10.fieldW[var11]);
                    this.fieldE[this.fieldL] = this.l(var10, var10.fieldE[var11]);
                    ++this.fieldL;
                }

                for (var11 = 0; var11 < var10.fieldQ; ++var11) {
                    byte var12 = this.fieldT[this.fieldQ] = var10.fieldT[var11];
                    if (var12 == 0) {
                        this.fieldH[this.fieldQ] = (short) this.l(var10, var10.fieldH[var11]);
                        this.fieldU[this.fieldQ] = (short) this.l(var10, var10.fieldU[var11]);
                        this.fieldJ[this.fieldQ] = (short) this.l(var10, var10.fieldJ[var11]);
                    }

                    if (var12 >= 1 && var12 <= 3) {
                        this.fieldH[this.fieldQ] = var10.fieldH[var11];
                        this.fieldU[this.fieldQ] = var10.fieldU[var11];
                        this.fieldJ[this.fieldQ] = var10.fieldJ[var11];
                        this.fieldG[this.fieldQ] = var10.fieldG[var11];
                        this.fieldY[this.fieldQ] = var10.fieldY[var11];
                        this.fieldP[this.fieldQ] = var10.fieldP[var11];
                        this.fieldR[this.fieldQ] = var10.fieldR[var11];
                        this.fieldAn[this.fieldQ] = var10.fieldAn[var11];
                        this.fieldZ[this.fieldQ] = var10.fieldZ[var11];
                    }

                    if (var12 == 2) {
                        this.fieldC[this.fieldQ] = var10.fieldC[var11];
                    }

                    ++this.fieldQ;
                }
            }
        }

    }

    public classCy(classCy var1, boolean var2, boolean var3, boolean var4, boolean var5) {
        this.fieldA = var1.fieldA;
        this.fieldL = var1.fieldL;
        this.fieldQ = var1.fieldQ;
        int var6;
        if (var2) {
            this.fieldV = var1.fieldV;
            this.fieldI = var1.fieldI;
            this.fieldB = var1.fieldB;
        } else {
            this.fieldV = new int[this.fieldA];
            this.fieldI = new int[this.fieldA];
            this.fieldB = new int[this.fieldA];

            for (var6 = 0; var6 < this.fieldA; ++var6) {
                this.fieldV[var6] = var1.fieldV[var6];
                this.fieldI[var6] = var1.fieldI[var6];
                this.fieldB[var6] = var1.fieldB[var6];
            }
        }

        if (var3) {
            this.fieldD = var1.fieldD;
        } else {
            this.fieldD = new short[this.fieldL];

            for (var6 = 0; var6 < this.fieldL; ++var6) {
                this.fieldD[var6] = var1.fieldD[var6];
            }
        }

        if (!var4 && var1.fieldX != null) {
            this.fieldX = new short[this.fieldL];

            for (var6 = 0; var6 < this.fieldL; ++var6) {
                this.fieldX[var6] = var1.fieldX[var6];
            }
        } else {
            this.fieldX = var1.fieldX;
        }

        if (var5) {
            this.fieldK = var1.fieldK;
        } else {
            this.fieldK = new byte[this.fieldL];
            if (var1.fieldK == null) {
                for (var6 = 0; var6 < this.fieldL; ++var6) {
                    this.fieldK[var6] = 0;
                }
            } else {
                for (var6 = 0; var6 < this.fieldL; ++var6) {
                    this.fieldK[var6] = var1.fieldK[var6];
                }
            }
        }

        this.fieldM = var1.fieldM;
        this.fieldW = var1.fieldW;
        this.fieldE = var1.fieldE;
        this.fieldN = var1.fieldN;
        this.fieldS = var1.fieldS;
        this.fieldF = var1.fieldF;
        this.fieldO = var1.fieldO;
        this.fieldT = var1.fieldT;
        this.fieldH = var1.fieldH;
        this.fieldU = var1.fieldU;
        this.fieldJ = var1.fieldJ;
        this.fieldG = var1.fieldG;
        this.fieldY = var1.fieldY;
        this.fieldP = var1.fieldP;
        this.fieldR = var1.fieldR;
        this.fieldAn = var1.fieldAn;
        this.fieldZ = var1.fieldZ;
        this.fieldC = var1.fieldC;
        this.fieldAs = var1.fieldAs;
        this.fieldAh = var1.fieldAh;
        this.fieldAr = var1.fieldAr;
        this.fieldAe = var1.fieldAe;
        this.fieldAl = var1.fieldAl;
        this.fieldAv = var1.fieldAv;
        this.fieldAq = var1.fieldAq;
        this.fieldAm = var1.fieldAm;
        this.fieldAx = var1.fieldAx;
    }

    classCy() {
    }

    public static classCy method285(ReferenceTable var0, int var1, int var2) {
        byte[] var3 = var0.getFile(var1, var2, (short) 26423);
        return var3 == null ? null : new classCy(var3);
    }

    static void merge(classCy var0, classCy var1, int var2, int var3, int var4, boolean var5) {
        var0.g();
        var0.u();
        var1.g();
        var1.u();
        ++fieldAu;
        int var6 = 0;
        int[] var7 = var1.fieldV;
        int var8 = var1.fieldA;

        int var9;
        for (var9 = 0; var9 < var0.fieldA; ++var9) {
            classCn var10 = var0.fieldAl[var9];
            if (var10.fieldB * 1143703131 != 0) {
                int var11 = var0.fieldI[var9] - var3;
                if (var11 <= var1.fieldAi) {
                    int var12 = var0.fieldV[var9] - var2;
                    if (var12 >= var1.fieldAa && var12 <= var1.fieldAt) {
                        int var13 = var0.fieldB[var9] - var4;
                        if (var13 >= var1.fieldAo && var13 <= var1.fieldAw) {
                            for (int var14 = 0; var14 < var8; ++var14) {
                                classCn var15 = var1.fieldAl[var14];
                                if (var12 == var7[var14] && var13 == var1.fieldB[var14] && var11 == var1.fieldI[var14] && var15.fieldB * 1143703131 != 0) {
                                    if (var0.fieldAq == null) {
                                        var0.fieldAq = new classCn[var0.fieldA];
                                    }

                                    if (var1.fieldAq == null) {
                                        var1.fieldAq = new classCn[var8];
                                    }

                                    classCn var16 = var0.fieldAq[var9];
                                    if (var16 == null) {
                                        var16 = var0.fieldAq[var9] = new classCn(var10);
                                    }

                                    classCn var17 = var1.fieldAq[var14];
                                    if (var17 == null) {
                                        var17 = var1.fieldAq[var14] = new classCn(var15);
                                    }

                                    var16.fieldA += var15.fieldA * 1;
                                    var16.fieldV += var15.fieldV * 1;
                                    var16.fieldI += var15.fieldI * 1;
                                    var16.fieldB += var15.fieldB * 1;
                                    var17.fieldA += var10.fieldA * 1;
                                    var17.fieldV += var10.fieldV * 1;
                                    var17.fieldI += var10.fieldI * 1;
                                    var17.fieldB += var10.fieldB * 1;
                                    ++var6;
                                    fieldAg[var9] = fieldAu;
                                    fieldAd[var14] = fieldAu;
                                }
                            }
                        }
                    }
                }
            }
        }

        if (var6 >= 3 && var5) {
            for (var9 = 0; var9 < var0.fieldL; ++var9) {
                if (fieldAg[var0.fieldM[var9]] == fieldAu && fieldAg[var0.fieldW[var9]] == fieldAu && fieldAg[var0.fieldE[var9]] == fieldAu) {
                    if (var0.fieldN == null) {
                        var0.fieldN = new byte[var0.fieldL];
                    }

                    var0.fieldN[var9] = 2;
                }
            }

            for (var9 = 0; var9 < var1.fieldL; ++var9) {
                if (fieldAd[var1.fieldM[var9]] == fieldAu && fieldAd[var1.fieldW[var9]] == fieldAu && fieldAd[var1.fieldE[var9]] == fieldAu) {
                    if (var1.fieldN == null) {
                        var1.fieldN = new byte[var1.fieldL];
                    }

                    var1.fieldN[var9] = 2;
                }
            }

        }
    }

    static final int method287(int var0, int var1) {
        var1 = var1 * (var0 & 127) >> 7;
        if (var1 < 2) {
            var1 = 2;
        } else if (var1 > 126) {
            var1 = 126;
        }

        return (var0 & '\uff80') + var1;
    }

    static final int method288(int var0) {
        if (var0 < 2) {
            var0 = 2;
        } else if (var0 > 126) {
            var0 = 126;
        }

        return var0;
    }

    public final Model p(int var1, int var2, int var3, int var4, int var5) {
        this.u();
        int var6 = (int) Math.sqrt((double) (var3 * var3 + var4 * var4 + var5 * var5));
        int var7 = var2 * var6 >> 8;
        Model var8 = new Model();
        var8.fieldD = new int[this.fieldL];
        var8.fieldX = new int[this.fieldL];
        var8.fieldO = new int[this.fieldL];
        if (this.fieldQ > 0 && this.fieldF != null) {
            int[] var9 = new int[this.fieldQ];

            int var10;
            for (var10 = 0; var10 < this.fieldL; ++var10) {
                if (this.fieldF[var10] != -1) {
                    ++var9[this.fieldF[var10] & 255];
                }
            }

            var8.fieldG = 0;

            for (var10 = 0; var10 < this.fieldQ; ++var10) {
                if (var9[var10] > 0 && this.fieldT[var10] == 0) {
                    ++var8.fieldG;
                }
            }

            var8.fieldY = new int[var8.fieldG];
            var8.fieldP = new int[var8.fieldG];
            var8.fieldR = new int[var8.fieldG];
            var10 = 0;

            int var11;
            for (var11 = 0; var11 < this.fieldQ; ++var11) {
                if (var9[var11] > 0 && this.fieldT[var11] == 0) {
                    var8.fieldY[var10] = this.fieldH[var11] & '\uffff';
                    var8.fieldP[var10] = this.fieldU[var11] & '\uffff';
                    var8.fieldR[var10] = this.fieldJ[var11] & '\uffff';
                    var9[var11] = var10++;
                } else {
                    var9[var11] = -1;
                }
            }

            var8.fieldH = new byte[this.fieldL];

            for (var11 = 0; var11 < this.fieldL; ++var11) {
                if (this.fieldF[var11] != -1) {
                    var8.fieldH[var11] = (byte) var9[this.fieldF[var11] & 255];
                } else {
                    var8.fieldH[var11] = -1;
                }
            }
        }

        for (int var16 = 0; var16 < this.fieldL; ++var16) {
            byte var17;
            var17 = this.fieldN == null ? 0 : this.fieldN[var16];
            byte var18 = this.fieldK == null ? 0 : this.fieldK[var16];
            short var12 = this.fieldX == null ? -1 : this.fieldX[var16];
            if (var18 == -2) {
                var17 = 3;
            }
            if (var18 == -1) {
                var17 = 2;
            }
            classCn var13;
            int var14;
            classBy var19;
            if (var12 == -1) {
                if (var17 == 0) {
                    int var15 = this.fieldD[var16] & '\uffff';
                    if (this.fieldAq != null && this.fieldAq[this.fieldM[var16]] != null) {
                        var13 = this.fieldAq[this.fieldM[var16]];
                    } else {
                        var13 = this.fieldAl[this.fieldM[var16]];
                    }

                    var14 = var1 + (var3 * var13.fieldA * 473489935 + var4 * var13.fieldV * 202166475 + var5 * var13.fieldI * -87676039) / (var7 * var13.fieldB * 1143703131);
                    var8.fieldD[var16] = method287(var15, var14);
                    if (this.fieldAq != null && this.fieldAq[this.fieldW[var16]] != null) {
                        var13 = this.fieldAq[this.fieldW[var16]];
                    } else {
                        var13 = this.fieldAl[this.fieldW[var16]];
                    }

                    var14 = var1 + (var3 * var13.fieldA * 473489935 + var4 * var13.fieldV * 202166475 + var5 * var13.fieldI * -87676039) / (var7 * var13.fieldB * 1143703131);
                    var8.fieldX[var16] = method287(var15, var14);
                    if (this.fieldAq != null && this.fieldAq[this.fieldE[var16]] != null) {
                        var13 = this.fieldAq[this.fieldE[var16]];
                    } else {
                        var13 = this.fieldAl[this.fieldE[var16]];
                    }

                    var14 = var1 + (var3 * var13.fieldA * 473489935 + var4 * var13.fieldV * 202166475 + var5 * var13.fieldI * -87676039) / (var7 * var13.fieldB * 1143703131);
                    var8.fieldO[var16] = method287(var15, var14);
                } else if (var17 == 1) {
                    var19 = this.fieldAv[var16];
                    var14 = var1 + (var3 * var19.fieldA * 98595973 + var4 * var19.fieldV * 1114899739 + var5 * var19.fieldI * 1089880927) / (var7 + var7 / 2);
                    var8.fieldD[var16] = method287(this.fieldD[var16] & '\uffff', var14);
                    var8.fieldO[var16] = -1;
                } else if (var17 == 3) {
                    var8.fieldD[var16] = 128;
                    var8.fieldO[var16] = -1;
                } else {
                    var8.fieldO[var16] = -2;
                }
            } else if (var17 == 0) {
                if (this.fieldAq != null && this.fieldAq[this.fieldM[var16]] != null) {
                    var13 = this.fieldAq[this.fieldM[var16]];
                } else {
                    var13 = this.fieldAl[this.fieldM[var16]];
                }

                var14 = var1 + (var3 * var13.fieldA * 473489935 + var4 * var13.fieldV * 202166475 + var5 * var13.fieldI * -87676039) / (var7 * var13.fieldB * 1143703131);
                var8.fieldD[var16] = method288(var14);
                if (this.fieldAq != null && this.fieldAq[this.fieldW[var16]] != null) {
                    var13 = this.fieldAq[this.fieldW[var16]];
                } else {
                    var13 = this.fieldAl[this.fieldW[var16]];
                }

                var14 = var1 + (var3 * var13.fieldA * 473489935 + var4 * var13.fieldV * 202166475 + var5 * var13.fieldI * -87676039) / (var7 * var13.fieldB * 1143703131);
                var8.fieldX[var16] = method288(var14);
                if (this.fieldAq != null && this.fieldAq[this.fieldE[var16]] != null) {
                    var13 = this.fieldAq[this.fieldE[var16]];
                } else {
                    var13 = this.fieldAl[this.fieldE[var16]];
                }

                var14 = var1 + (var3 * var13.fieldA * 473489935 + var4 * var13.fieldV * 202166475 + var5 * var13.fieldI * -87676039) / (var7 * var13.fieldB * 1143703131);
                var8.fieldO[var16] = method288(var14);
            } else if (var17 == 1) {
                var19 = this.fieldAv[var16];
                var14 = var1 + (var3 * var19.fieldA * 98595973 + var4 * var19.fieldV * 1114899739 + var5 * var19.fieldI * 1089880927) / (var7 + var7 / 2);
                var8.fieldD[var16] = method288(var14);
                var8.fieldO[var16] = -1;
            } else {
                var8.fieldO[var16] = -2;
            }
        }

        this.n();
        var8.fieldL = this.fieldA;
        var8.fieldM = this.fieldV;
        var8.fieldW = this.fieldI;
        var8.fieldE = this.fieldB;
        var8.fieldN = this.fieldL;
        var8.fieldS = this.fieldM;
        var8.fieldK = this.fieldW;
        var8.fieldF = this.fieldE;
        var8.fieldQ = this.fieldS;
        var8.fieldT = this.fieldK;
        var8.fieldJ = this.fieldO;
        var8.fieldZ = this.fieldAr;
        var8.fieldC = this.fieldAe;
        var8.fieldU = this.fieldX;
        return var8;
    }

    void i(byte[] var1) {
        Buffer var2 = new Buffer(var1);
        Buffer var3 = new Buffer(var1);
        Buffer var4 = new Buffer(var1);
        Buffer var5 = new Buffer(var1);
        Buffer var6 = new Buffer(var1);
        Buffer var7 = new Buffer(var1);
        Buffer var8 = new Buffer(var1);
        var2.caret = (var1.length - 23) * -99503879;
        int var9 = var2.readUShort();
        int var10 = var2.readUShort();
        int var11 = var2.readUByte();
        int var12 = var2.readUByte();
        int var13 = var2.readUByte();
        int var14 = var2.readUByte();
        int var15 = var2.readUByte();
        int var16 = var2.readUByte();
        int var17 = var2.readUByte();
        int var18 = var2.readUShort();
        int var19 = var2.readUShort();
        int var20 = var2.readUShort();
        int var21 = var2.readUShort();
        int var22 = var2.readUShort();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26;
        if (var11 > 0) {
            this.fieldT = new byte[var11];
            var2.caret = 0;

            for (var26 = 0; var26 < var11; ++var26) {
                byte var27 = this.fieldT[var26] = var2.readByte();
                if (var27 == 0) {
                    ++var23;
                }

                if (var27 >= 1 && var27 <= 3) {
                    ++var24;
                }

                if (var27 == 2) {
                    ++var25;
                }
            }
        }

        var26 = var11 + var9;
        int var28 = var26;
        if (var12 == 1) {
            var26 += var10;
        }

        int var29 = var26;
        var26 += var10;
        int var30 = var26;
        if (var13 == 255) {
            var26 += var10;
        }

        int var31 = var26;
        if (var15 == 1) {
            var26 += var10;
        }

        int var32 = var26;
        if (var17 == 1) {
            var26 += var9;
        }

        int var33 = var26;
        if (var14 == 1) {
            var26 += var10;
        }

        int var34 = var26;
        var26 += var21;
        int var35 = var26;
        if (var16 == 1) {
            var26 += var10 * 2;
        }

        int var36 = var26;
        var26 += var22;
        int var37 = var26;
        var26 += var10 * 2;
        int var38 = var26;
        var26 += var18;
        int var39 = var26;
        var26 += var19;
        int var40 = var26;
        var26 += var20;
        int var41 = var26;
        var26 += var23 * 6;
        int var42 = var26;
        var26 += var24 * 6;
        int var43 = var26;
        var26 += var24 * 6;
        int var44 = var26;
        var26 += var24 * 2;
        int var45 = var26;
        var26 += var24;
        int var46 = var26;
        var26 += var24 * 2 + var25 * 2;
        this.fieldA = var9;
        this.fieldL = var10;
        this.fieldQ = var11;
        this.fieldV = new int[var9];
        this.fieldI = new int[var9];
        this.fieldB = new int[var9];
        this.fieldM = new int[var10];
        this.fieldW = new int[var10];
        this.fieldE = new int[var10];
        if (var17 == 1) {
            this.fieldAs = new int[var9];
        }

        if (var12 == 1) {
            this.fieldN = new byte[var10];
        }

        if (var13 == 255) {
            this.fieldS = new byte[var10];
        } else {
            this.fieldO = (byte) var13;
        }

        if (var14 == 1) {
            this.fieldK = new byte[var10];
        }

        if (var15 == 1) {
            this.fieldAh = new int[var10];
        }

        if (var16 == 1) {
            this.fieldX = new short[var10];
        }

        if (var16 == 1 && var11 > 0) {
            this.fieldF = new byte[var10];
        }

        this.fieldD = new short[var10];
        if (var11 > 0) {
            this.fieldH = new short[var11];
            this.fieldU = new short[var11];
            this.fieldJ = new short[var11];
            if (var24 > 0) {
                this.fieldG = new short[var24];
                this.fieldY = new short[var24];
                this.fieldP = new short[var24];
                this.fieldR = new short[var24];
                this.fieldAn = new byte[var24];
                this.fieldZ = new short[var24];
            }

            if (var25 > 0) {
                this.fieldC = new short[var25];
            }
        }

        var2.caret = var11 * -99503879;
        var3.caret = var38 * -99503879;
        var4.caret = var39 * -99503879;
        var5.caret = var40 * -99503879;
        var6.caret = var32 * -99503879;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;

        int var51;
        int var52;
        int var53;
        int var54;
        int var55;
        for (var51 = 0; var51 < var9; ++var51) {
            var52 = var2.readUByte();
            var53 = 0;
            if ((var52 & 1) != 0) {
                var53 = var3.ah(2072898308);
            }

            var54 = 0;
            if ((var52 & 2) != 0) {
                var54 = var4.ah(1699498899);
            }

            var55 = 0;
            if ((var52 & 4) != 0) {
                var55 = var5.ah(-195878049);
            }

            this.fieldV[var51] = var48 + var53;
            this.fieldI[var51] = var49 + var54;
            this.fieldB[var51] = var50 + var55;
            var48 = this.fieldV[var51];
            var49 = this.fieldI[var51];
            var50 = this.fieldB[var51];
            if (var17 == 1) {
                this.fieldAs[var51] = var6.readUByte();
            }
        }

        var2.caret = var37 * -99503879;
        var3.caret = var28 * -99503879;
        var4.caret = var30 * -99503879;
        var5.caret = var33 * -99503879;
        var6.caret = var31 * -99503879;
        var7.caret = var35 * -99503879;
        var8.caret = var36 * -99503879;

        for (var51 = 0; var51 < var10; ++var51) {
            this.fieldD[var51] = (short) var2.readUShort();
            if (var12 == 1) {
                this.fieldN[var51] = var3.readByte();
            }

            if (var13 == 255) {
                this.fieldS[var51] = var4.readByte();
            }

            if (var14 == 1) {
                this.fieldK[var51] = var5.readByte();
            }

            if (var15 == 1) {
                this.fieldAh[var51] = var6.readUByte();
            }

            if (var16 == 1) {
                this.fieldX[var51] = (short) (var7.readUShort() - 1);
            }

            if (this.fieldF != null && this.fieldX[var51] != -1) {
                this.fieldF[var51] = (byte) (var8.readUByte() - 1);
            }
        }

        var2.caret = var34 * -99503879;
        var3.caret = var29 * -99503879;
        var51 = 0;
        var52 = 0;
        var53 = 0;
        var54 = 0;

        int var56;
        for (var55 = 0; var55 < var10; ++var55) {
            var56 = var3.readUByte();
            if (var56 == 1) {
                var51 = var2.ah(649810839) + var54;
                var52 = var2.ah(1996097301) + var51;
                var53 = var2.ah(923569203) + var52;
                var54 = var53;
                this.fieldM[var55] = var51;
                this.fieldW[var55] = var52;
                this.fieldE[var55] = var53;
            }

            if (var56 == 2) {
                var52 = var53;
                var53 = var2.ah(888011591) + var54;
                var54 = var53;
                this.fieldM[var55] = var51;
                this.fieldW[var55] = var52;
                this.fieldE[var55] = var53;
            }

            if (var56 == 3) {
                var51 = var53;
                var53 = var2.ah(130263732) + var54;
                var54 = var53;
                this.fieldM[var55] = var51;
                this.fieldW[var55] = var52;
                this.fieldE[var55] = var53;
            }

            if (var56 == 4) {
                int var57 = var51;
                var51 = var52;
                var52 = var57;
                var53 = var2.ah(539891090) + var54;
                var54 = var53;
                this.fieldM[var55] = var51;
                this.fieldW[var55] = var57;
                this.fieldE[var55] = var53;
            }
        }

        var2.caret = var41 * -99503879;
        var3.caret = var42 * -99503879;
        var4.caret = var43 * -99503879;
        var5.caret = var44 * -99503879;
        var6.caret = var45 * -99503879;
        var7.caret = var46 * -99503879;

        for (var55 = 0; var55 < var11; ++var55) {
            var56 = this.fieldT[var55] & 255;
            if (var56 == 0) {
                this.fieldH[var55] = (short) var2.readUShort();
                this.fieldU[var55] = (short) var2.readUShort();
                this.fieldJ[var55] = (short) var2.readUShort();
            }

            if (var56 == 1) {
                this.fieldH[var55] = (short) var3.readUShort();
                this.fieldU[var55] = (short) var3.readUShort();
                this.fieldJ[var55] = (short) var3.readUShort();
                this.fieldG[var55] = (short) var4.readUShort();
                this.fieldY[var55] = (short) var4.readUShort();
                this.fieldP[var55] = (short) var4.readUShort();
                this.fieldR[var55] = (short) var5.readUShort();
                this.fieldAn[var55] = var6.readByte();
                this.fieldZ[var55] = (short) var7.readUShort();
            }

            if (var56 == 2) {
                this.fieldH[var55] = (short) var3.readUShort();
                this.fieldU[var55] = (short) var3.readUShort();
                this.fieldJ[var55] = (short) var3.readUShort();
                this.fieldG[var55] = (short) var4.readUShort();
                this.fieldY[var55] = (short) var4.readUShort();
                this.fieldP[var55] = (short) var4.readUShort();
                this.fieldR[var55] = (short) var5.readUShort();
                this.fieldAn[var55] = var6.readByte();
                this.fieldZ[var55] = (short) var7.readUShort();
                this.fieldC[var55] = (short) var7.readUShort();
            }

            if (var56 == 3) {
                this.fieldH[var55] = (short) var3.readUShort();
                this.fieldU[var55] = (short) var3.readUShort();
                this.fieldJ[var55] = (short) var3.readUShort();
                this.fieldG[var55] = (short) var4.readUShort();
                this.fieldY[var55] = (short) var4.readUShort();
                this.fieldP[var55] = (short) var4.readUShort();
                this.fieldR[var55] = (short) var5.readUShort();
                this.fieldAn[var55] = var6.readByte();
                this.fieldZ[var55] = (short) var7.readUShort();
            }
        }

        var2.caret = var26 * -99503879;
        var55 = var2.readUByte();
        if (var55 != 0) {
            new classCf();
            var2.readUShort();
            var2.readUShort();
            var2.readUShort();
            var2.readInt((byte) -45);
        }

    }

    final int l(classCy var1, int var2) {
        int var3 = -1;
        int var4 = var1.fieldV[var2];
        int var5 = var1.fieldI[var2];
        int var6 = var1.fieldB[var2];

        for (int var7 = 0; var7 < this.fieldA; ++var7) {
            if (var4 == this.fieldV[var7] && var5 == this.fieldI[var7] && var6 == this.fieldB[var7]) {
                var3 = var7;
                break;
            }
        }

        if (var3 == -1) {
            this.fieldV[this.fieldA] = var4;
            this.fieldI[this.fieldA] = var5;
            this.fieldB[this.fieldA] = var6;
            if (var1.fieldAs != null) {
                this.fieldAs[this.fieldA] = var1.fieldAs[var2];
            }

            var3 = this.fieldA++;
        }

        return var3;
    }

    public classCy m() {
        classCy var1 = new classCy();
        if (this.fieldN != null) {
            var1.fieldN = new byte[this.fieldL];
            for (int var2 = 0; var2 < this.fieldL; ++var2) {
                var1.fieldN[var2] = this.fieldN[var2];
            }
        }

        var1.fieldA = this.fieldA;
        var1.fieldL = this.fieldL;
        var1.fieldQ = this.fieldQ;
        var1.fieldV = this.fieldV;
        var1.fieldI = this.fieldI;
        var1.fieldB = this.fieldB;
        var1.fieldM = this.fieldM;
        var1.fieldW = this.fieldW;
        var1.fieldE = this.fieldE;
        var1.fieldS = this.fieldS;
        var1.fieldK = this.fieldK;
        var1.fieldF = this.fieldF;
        var1.fieldD = this.fieldD;
        var1.fieldX = this.fieldX;
        var1.fieldO = this.fieldO;
        var1.fieldT = this.fieldT;
        var1.fieldH = this.fieldH;
        var1.fieldU = this.fieldU;
        var1.fieldJ = this.fieldJ;
        var1.fieldG = this.fieldG;
        var1.fieldY = this.fieldY;
        var1.fieldP = this.fieldP;
        var1.fieldR = this.fieldR;
        var1.fieldAn = this.fieldAn;
        var1.fieldZ = this.fieldZ;
        var1.fieldC = this.fieldC;
        var1.fieldAs = this.fieldAs;
        var1.fieldAh = this.fieldAh;
        var1.fieldAr = this.fieldAr;
        var1.fieldAe = this.fieldAe;
        var1.fieldAl = this.fieldAl;
        var1.fieldAv = this.fieldAv;
        var1.fieldAm = this.fieldAm;
        var1.fieldAx = this.fieldAx;
        return var1;
    }

    public classCy e(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
        this.g();
        int var7 = var2 + this.fieldAa;
        int var8 = var2 + this.fieldAt;
        int var9 = var4 + this.fieldAo;
        int var10 = var4 + this.fieldAw;
        if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
            var7 >>= 7;
            var8 = var8 + 127 >> 7;
            var9 >>= 7;
            var10 = var10 + 127 >> 7;
            if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
                return this;
            } else {
                classCy var11;
                if (var5) {
                    var11 = new classCy();
                    var11.fieldA = this.fieldA;
                    var11.fieldL = this.fieldL;
                    var11.fieldQ = this.fieldQ;
                    var11.fieldV = this.fieldV;
                    var11.fieldB = this.fieldB;
                    var11.fieldM = this.fieldM;
                    var11.fieldW = this.fieldW;
                    var11.fieldE = this.fieldE;
                    var11.fieldN = this.fieldN;
                    var11.fieldS = this.fieldS;
                    var11.fieldK = this.fieldK;
                    var11.fieldF = this.fieldF;
                    var11.fieldD = this.fieldD;
                    var11.fieldX = this.fieldX;
                    var11.fieldO = this.fieldO;
                    var11.fieldT = this.fieldT;
                    var11.fieldH = this.fieldH;
                    var11.fieldU = this.fieldU;
                    var11.fieldJ = this.fieldJ;
                    var11.fieldG = this.fieldG;
                    var11.fieldY = this.fieldY;
                    var11.fieldP = this.fieldP;
                    var11.fieldR = this.fieldR;
                    var11.fieldAn = this.fieldAn;
                    var11.fieldZ = this.fieldZ;
                    var11.fieldC = this.fieldC;
                    var11.fieldAs = this.fieldAs;
                    var11.fieldAh = this.fieldAh;
                    var11.fieldAr = this.fieldAr;
                    var11.fieldAe = this.fieldAe;
                    var11.fieldAm = this.fieldAm;
                    var11.fieldAx = this.fieldAx;
                    var11.fieldI = new int[var11.fieldA];
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
                    for (var12 = 0; var12 < var11.fieldA; ++var12) {
                        var13 = this.fieldV[var12] + var2;
                        var14 = this.fieldB[var12] + var4;
                        var15 = var13 & 127;
                        var16 = var14 & 127;
                        var17 = var13 >> 7;
                        var18 = var14 >> 7;
                        var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                        var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                        var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                        var11.fieldI[var12] = this.fieldI[var12] + var21 - var3;
                    }
                } else {
                    for (var12 = 0; var12 < var11.fieldA; ++var12) {
                        var13 = (-this.fieldI[var12] << 16) / (this.modelHeight * 1802750145);
                        if (var13 < var6) {
                            var14 = this.fieldV[var12] + var2;
                            var15 = this.fieldB[var12] + var4;
                            var16 = var14 & 127;
                            var17 = var15 & 127;
                            var18 = var14 >> 7;
                            var19 = var15 >> 7;
                            var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                            var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
                            int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                            var11.fieldI[var12] = this.fieldI[var12] + (var22 - var3) * (var6 - var13) / var6;
                        }
                    }
                }

                var11.j();
                return var11;
            }
        } else {
            return this;
        }
    }

    public void s() {
        for (int var1 = 0; var1 < this.fieldA; ++var1) {
            int var2 = this.fieldV[var1];
            this.fieldV[var1] = this.fieldB[var1];
            this.fieldB[var1] = -var2;
        }

        this.j();
    }

    public void k() {
        for (int var1 = 0; var1 < this.fieldA; ++var1) {
            this.fieldV[var1] = -this.fieldV[var1];
            this.fieldB[var1] = -this.fieldB[var1];
        }

        this.j();
    }

    public void f() {
        for (int var1 = 0; var1 < this.fieldA; ++var1) {
            int var2 = this.fieldB[var1];
            this.fieldB[var1] = this.fieldV[var1];
            this.fieldV[var1] = -var2;
        }

        this.j();
    }

    public void d(int var1) {
        int var2 = fieldAk[var1];
        int var3 = fieldAj[var1];

        for (int var4 = 0; var4 < this.fieldA; ++var4) {
            int var5 = this.fieldB[var4] * var2 + this.fieldV[var4] * var3 >> 16;
            this.fieldB[var4] = this.fieldB[var4] * var3 - this.fieldV[var4] * var2 >> 16;
            this.fieldV[var4] = var5;
        }

        this.j();
    }

    public void o(short var1, short var2) {
        for (int var3 = 0; var3 < this.fieldL; ++var3) {
            if (this.fieldD[var3] == var1) {
                this.fieldD[var3] = var2;
            }
        }

    }

    public void t() {
        int var1;
        for (var1 = 0; var1 < this.fieldA; ++var1) {
            this.fieldB[var1] = -this.fieldB[var1];
        }

        for (var1 = 0; var1 < this.fieldL; ++var1) {
            int var2 = this.fieldM[var1];
            this.fieldM[var1] = this.fieldE[var1];
            this.fieldE[var1] = var2;
        }

        this.j();
    }

    public void u() {
        if (this.fieldAl == null) {
            this.fieldAl = new classCn[this.fieldA];

            int var1;
            for (var1 = 0; var1 < this.fieldA; ++var1) {
                this.fieldAl[var1] = new classCn();
            }

            for (var1 = 0; var1 < this.fieldL; ++var1) {
                int var2 = this.fieldM[var1];
                int var3 = this.fieldW[var1];
                int var4 = this.fieldE[var1];
                int var5 = this.fieldV[var3] - this.fieldV[var2];
                int var6 = this.fieldI[var3] - this.fieldI[var2];
                int var7 = this.fieldB[var3] - this.fieldB[var2];
                int var8 = this.fieldV[var4] - this.fieldV[var2];
                int var9 = this.fieldI[var4] - this.fieldI[var2];
                int var10 = this.fieldB[var4] - this.fieldB[var2];
                int var11 = var6 * var10 - var9 * var7;
                int var12 = var7 * var8 - var10 * var5;

                int var13;
                for (var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
                    var11 >>= 1;
                    var12 >>= 1;
                }

                int var14 = (int) Math.sqrt((double) (var11 * var11 + var12 * var12 + var13 * var13));
                if (var14 <= 0) {
                    var14 = 1;
                }

                var11 = var11 * 256 / var14;
                var12 = var12 * 256 / var14;
                var13 = var13 * 256 / var14;
                byte var15;
                if (this.fieldN == null) {
                    var15 = 0;
                } else {
                    var15 = this.fieldN[var1];
                }

                if (var15 == 0) {
                    classCn var16 = this.fieldAl[var2];
                    var16.fieldA += var11 * 238013679;
                    var16.fieldV += var12 * -1248258845;
                    var16.fieldI += var13 * -550416695;
                    var16.fieldB += -1081984557;
                    var16 = this.fieldAl[var3];
                    var16.fieldA += var11 * 238013679;
                    var16.fieldV += var12 * -1248258845;
                    var16.fieldI += var13 * -550416695;
                    var16.fieldB += -1081984557;
                    var16 = this.fieldAl[var4];
                    var16.fieldA += var11 * 238013679;
                    var16.fieldV += var12 * -1248258845;
                    var16.fieldI += var13 * -550416695;
                    var16.fieldB += -1081984557;
                } else if (var15 == 1) {
                    if (this.fieldAv == null) {
                        this.fieldAv = new classBy[this.fieldL];
                    }

                    classBy var17 = this.fieldAv[var1] = new classBy();
                    var17.fieldA = var11 * -135961523;
                    var17.fieldV = var12 * -1179136749;
                    var17.fieldI = var13 * -498280289;
                }
            }

        }
    }

    void j() {
        this.fieldAl = null;
        this.fieldAq = null;
        this.fieldAv = null;
        this.fieldAz = false;
    }

    void n() {
        int[] var1;
        int var2;
        int var3;
        int var4;
        if (this.fieldAs != null) {
            var1 = new int[256];
            var2 = 0;

            for (var3 = 0; var3 < this.fieldA; ++var3) {
                var4 = this.fieldAs[var3];
                ++var1[var4];
                if (var4 > var2) {
                    var2 = var4;
                }
            }

            this.fieldAr = new int[var2 + 1][];

            for (var3 = 0; var3 <= var2; ++var3) {
                this.fieldAr[var3] = new int[var1[var3]];
                var1[var3] = 0;
            }

            for (var3 = 0; var3 < this.fieldA; this.fieldAr[var4][var1[var4]++] = var3++) {
                var4 = this.fieldAs[var3];
            }

            this.fieldAs = null;
        }

        if (this.fieldAh != null) {
            var1 = new int[256];
            var2 = 0;

            for (var3 = 0; var3 < this.fieldL; ++var3) {
                var4 = this.fieldAh[var3];
                ++var1[var4];
                if (var4 > var2) {
                    var2 = var4;
                }
            }

            this.fieldAe = new int[var2 + 1][];

            for (var3 = 0; var3 <= var2; ++var3) {
                this.fieldAe[var3] = new int[var1[var3]];
                var1[var3] = 0;
            }

            for (var3 = 0; var3 < this.fieldL; this.fieldAe[var4][var1[var4]++] = var3++) {
                var4 = this.fieldAh[var3];
            }

            this.fieldAh = null;
        }

    }

    public void q(short var1, short var2) {
        if (this.fieldX != null) {
            for (int var3 = 0; var3 < this.fieldL; ++var3) {
                if (this.fieldX[var3] == var1) {
                    this.fieldX[var3] = var2;
                }
            }

        }
    }

    public void h(int var1, int var2, int var3) {
        for (int var4 = 0; var4 < this.fieldA; ++var4) {
            this.fieldV[var4] = this.fieldV[var4] * var1 / 128;
            this.fieldI[var4] = this.fieldI[var4] * var2 / 128;
            this.fieldB[var4] = this.fieldB[var4] * var3 / 128;
        }

        this.j();
    }

    public void x(int var1, int var2, int var3) {
        for (int var4 = 0; var4 < this.fieldA; ++var4) {
            this.fieldV[var4] += var1;
            this.fieldI[var4] += var2;
            this.fieldB[var4] += var3;
        }

        this.j();
    }

    void b(byte[] var1) {
        boolean var2 = false;
        boolean var3 = false;
        Buffer var4 = new Buffer(var1);
        Buffer var5 = new Buffer(var1);
        Buffer var6 = new Buffer(var1);
        Buffer var7 = new Buffer(var1);
        Buffer var8 = new Buffer(var1);
        var4.caret = (var1.length - 18) * -99503879;
        int var9 = var4.readUShort();
        int var10 = var4.readUShort();
        int var11 = var4.readUByte();
        int var12 = var4.readUByte();
        int var13 = var4.readUByte();
        int var14 = var4.readUByte();
        int var15 = var4.readUByte();
        int var16 = var4.readUByte();
        int var17 = var4.readUShort();
        int var18 = var4.readUShort();
        int var19 = var4.readUShort();
        int var20 = var4.readUShort();
        byte var21 = 0;
        int var45 = var21 + var9;
        int var23 = var45;
        var45 += var10;
        int var24 = var45;
        if (var13 == 255) {
            var45 += var10;
        }

        int var25 = var45;
        if (var15 == 1) {
            var45 += var10;
        }

        int var26 = var45;
        if (var12 == 1) {
            var45 += var10;
        }

        int var27 = var45;
        if (var16 == 1) {
            var45 += var9;
        }

        int var28 = var45;
        if (var14 == 1) {
            var45 += var10;
        }

        int var29 = var45;
        var45 += var20;
        int var30 = var45;
        var45 += var10 * 2;
        int var31 = var45;
        var45 += var11 * 6;
        int var32 = var45;
        var45 += var17;
        int var33 = var45;
        var45 += var18;
        int var10000 = var45 + var19;
        this.fieldA = var9;
        this.fieldL = var10;
        this.fieldQ = var11;
        this.fieldV = new int[var9];
        this.fieldI = new int[var9];
        this.fieldB = new int[var9];
        this.fieldM = new int[var10];
        this.fieldW = new int[var10];
        this.fieldE = new int[var10];
        if (var11 > 0) {
            this.fieldT = new byte[var11];
            this.fieldH = new short[var11];
            this.fieldU = new short[var11];
            this.fieldJ = new short[var11];
        }

        if (var16 == 1) {
            this.fieldAs = new int[var9];
        }

        if (var12 == 1) {
            this.fieldN = new byte[var10];
            this.fieldF = new byte[var10];
            this.fieldX = new short[var10];
        }

        if (var13 == 255) {
            this.fieldS = new byte[var10];
        } else {
            this.fieldO = (byte) var13;
        }

        if (var14 == 1) {
            this.fieldK = new byte[var10];
        }

        if (var15 == 1) {
            this.fieldAh = new int[var10];
        }

        this.fieldD = new short[var10];
        var4.caret = var21 * -99503879;
        var5.caret = var32 * -99503879;
        var6.caret = var33 * -99503879;
        var7.caret = var45 * -99503879;
        var8.caret = var27 * -99503879;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;

        int var38;
        int var39;
        int var40;
        int var41;
        int var42;
        for (var38 = 0; var38 < var9; ++var38) {
            var39 = var4.readUByte();
            var40 = 0;
            if ((var39 & 1) != 0) {
                var40 = var5.ah(2082525792);
            }

            var41 = 0;
            if ((var39 & 2) != 0) {
                var41 = var6.ah(118735480);
            }

            var42 = 0;
            if ((var39 & 4) != 0) {
                var42 = var7.ah(1174435330);
            }

            this.fieldV[var38] = var35 + var40;
            this.fieldI[var38] = var36 + var41;
            this.fieldB[var38] = var37 + var42;
            var35 = this.fieldV[var38];
            var36 = this.fieldI[var38];
            var37 = this.fieldB[var38];
            if (var16 == 1) {
                this.fieldAs[var38] = var8.readUByte();
            }
        }

        var4.caret = var30 * -99503879;
        var5.caret = var26 * -99503879;
        var6.caret = var24 * -99503879;
        var7.caret = var28 * -99503879;
        var8.caret = var25 * -99503879;

        for (var38 = 0; var38 < var10; ++var38) {
            this.fieldD[var38] = (short) var4.readUShort();
            if (var12 == 1) {
                var39 = var5.readUByte();
                if ((var39 & 1) == 1) {
                    this.fieldN[var38] = 1;
                    var2 = true;
                } else {
                    this.fieldN[var38] = 0;
                }

                if ((var39 & 2) == 2) {
                    this.fieldF[var38] = (byte) (var39 >> 2);
                    this.fieldX[var38] = this.fieldD[var38];
                    this.fieldD[var38] = 127;
                    if (this.fieldX[var38] != -1) {
                        var3 = true;
                    }
                } else {
                    this.fieldF[var38] = -1;
                    this.fieldX[var38] = -1;
                }
            }

            if (var13 == 255) {
                this.fieldS[var38] = var6.readByte();
            }

            if (var14 == 1) {
                this.fieldK[var38] = var7.readByte();
            }

            if (var15 == 1) {
                this.fieldAh[var38] = var8.readUByte();
            }
        }

        var4.caret = var29 * -99503879;
        var5.caret = var23 * -99503879;
        var38 = 0;
        var39 = 0;
        var40 = 0;
        var41 = 0;

        int var43;
        int var44;
        for (var42 = 0; var42 < var10; ++var42) {
            var43 = var5.readUByte();
            if (var43 == 1) {
                var38 = var4.ah(770119941) + var41;
                var39 = var4.ah(1027492940) + var38;
                var40 = var4.ah(1621571112) + var39;
                var41 = var40;
                this.fieldM[var42] = var38;
                this.fieldW[var42] = var39;
                this.fieldE[var42] = var40;
            }

            if (var43 == 2) {
                var39 = var40;
                var40 = var4.ah(153966624) + var41;
                var41 = var40;
                this.fieldM[var42] = var38;
                this.fieldW[var42] = var39;
                this.fieldE[var42] = var40;
            }

            if (var43 == 3) {
                var38 = var40;
                var40 = var4.ah(-132024674) + var41;
                var41 = var40;
                this.fieldM[var42] = var38;
                this.fieldW[var42] = var39;
                this.fieldE[var42] = var40;
            }

            if (var43 == 4) {
                var44 = var38;
                var38 = var39;
                var39 = var44;
                var40 = var4.ah(-53334583) + var41;
                var41 = var40;
                this.fieldM[var42] = var38;
                this.fieldW[var42] = var44;
                this.fieldE[var42] = var40;
            }
        }

        var4.caret = var31 * -99503879;

        for (var42 = 0; var42 < var11; ++var42) {
            this.fieldT[var42] = 0;
            this.fieldH[var42] = (short) var4.readUShort();
            this.fieldU[var42] = (short) var4.readUShort();
            this.fieldJ[var42] = (short) var4.readUShort();
        }

        if (this.fieldF != null) {
            boolean var46 = false;

            for (var43 = 0; var43 < var10; ++var43) {
                var44 = this.fieldF[var43] & 255;
                if (var44 != 255) {
                    if ((this.fieldH[var44] & '\uffff') == this.fieldM[var43] && (this.fieldU[var44] & '\uffff') == this.fieldW[var43] && (this.fieldJ[var44] & '\uffff') == this.fieldE[var43]) {
                        this.fieldF[var43] = -1;
                    } else {
                        var46 = true;
                    }
                }
            }

            if (!var46) {
                this.fieldF = null;
            }
        }

        if (!var3) {
            this.fieldX = null;
        }

        if (!var2) {
            this.fieldN = null;
        }

    }

    void g() {
        if (!this.fieldAz) {
            this.modelHeight = 0;
            this.fieldAi = 0;
            this.fieldAa = 999999;
            this.fieldAt = -999999;
            this.fieldAw = -99999;
            this.fieldAo = 99999;

            for (int var1 = 0; var1 < this.fieldA; ++var1) {
                int var2 = this.fieldV[var1];
                int var3 = this.fieldI[var1];
                int var4 = this.fieldB[var1];
                if (var2 < this.fieldAa) {
                    this.fieldAa = var2;
                }

                if (var2 > this.fieldAt) {
                    this.fieldAt = var2;
                }

                if (var4 < this.fieldAo) {
                    this.fieldAo = var4;
                }

                if (var4 > this.fieldAw) {
                    this.fieldAw = var4;
                }

                if (-var3 > this.modelHeight * 1802750145) {
                    this.modelHeight = -var3 * 764200769;
                }

                if (var3 > this.fieldAi) {
                    this.fieldAi = var3;
                }
            }

            this.fieldAz = true;
        }
    }
}
