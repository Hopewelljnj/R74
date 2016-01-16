package com.jagex;

public class classCq {

    static int[] fieldV = new int[500];
    static int[] fieldI = new int[500];
    static int[] fieldB = new int[500];
    static int[] fieldA = new int[500];
    int[] fieldW;
    int[] fieldS;
    int fieldM = -1;
    int[] fieldN;
    int[] fieldE;
    classCc fieldL = null;
    boolean fieldK = false;


    classCq(byte[] var1, classCc var2) {
        this.fieldL = var2;
        Buffer var3 = new Buffer(var1);
        Buffer var4 = new Buffer(var1);
        var3.caret = -199007758;
        int var5 = var3.readUByte();
        int var6 = -1;
        int var7 = 0;
        var4.caret = (var3.caret * 651432265 + var5) * -99503879;

        int var8;
        for (var8 = 0; var8 < var5; ++var8) {
            int var9 = var3.readUByte();
            if (var9 > 0) {
                if (this.fieldL.fieldI[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; --var10) {
                        if (this.fieldL.fieldI[var10] == 0) {
                            fieldA[var7] = var10;
                            fieldV[var7] = 0;
                            fieldI[var7] = 0;
                            fieldB[var7] = 0;
                            ++var7;
                            break;
                        }
                    }
                }

                fieldA[var7] = var8;
                short var11 = 0;
                if (this.fieldL.fieldI[var8] == 3) {
                    var11 = 128;
                }

                if ((var9 & 1) != 0) {
                    fieldV[var7] = var4.ah(198759848);
                } else {
                    fieldV[var7] = var11;
                }

                if ((var9 & 2) != 0) {
                    fieldI[var7] = var4.ah(1021573368);
                } else {
                    fieldI[var7] = var11;
                }

                if ((var9 & 4) != 0) {
                    fieldB[var7] = var4.ah(2064277038);
                } else {
                    fieldB[var7] = var11;
                }

                var6 = var8;
                ++var7;
                if (this.fieldL.fieldI[var8] == 5) {
                    this.fieldK = true;
                }
            }
        }

        if (var4.caret * 651432265 != var1.length) {
            throw new RuntimeException();
        } else {
            this.fieldM = var7;
            this.fieldW = new int[var7];
            this.fieldE = new int[var7];
            this.fieldN = new int[var7];
            this.fieldS = new int[var7];

            for (var8 = 0; var8 < var7; ++var8) {
                this.fieldW[var8] = fieldA[var8];
                this.fieldE[var8] = fieldV[var8];
                this.fieldN[var8] = fieldI[var8];
                this.fieldS[var8] = fieldB[var8];
            }

        }
    }
}
