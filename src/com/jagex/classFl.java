package com.jagex;

public class classFl extends Node {

    byte[] fieldW = new byte[128];
    short[] fieldI = new short[128];
    int fieldA;
    byte[] fieldL = new byte[128];
    classFa[] fieldM = new classFa[128];
    byte[] fieldB = new byte[128];
    int[] fieldE = new int[128];
    classBl[] fieldV = new classBl[128];


    classFl(byte[] var1) {
        Buffer var2 = new Buffer(var1);

        int var3;
        for (var3 = 0; var2.payload[var2.caret * 651432265 + var3] != 0; ++var3) {
            ;
        }

        byte[] var4 = new byte[var3];

        int var5;
        for (var5 = 0; var5 < var3; ++var5) {
            var4[var5] = var2.readByte();
        }

        var2.caret += -99503879;
        ++var3;
        var5 = var2.caret * 651432265;
        var2.caret += -99503879 * var3;

        int var6;
        for (var6 = 0; 0 != var2.payload[var2.caret * 651432265 + var6]; ++var6) {
            ;
        }

        byte[] var7 = new byte[var6];

        int var8;
        for (var8 = 0; var8 < var6; ++var8) {
            var7[var8] = var2.readByte();
        }

        var2.caret += -99503879;
        ++var6;
        var8 = var2.caret * 651432265;
        var2.caret += var6 * -99503879;

        int var9;
        for (var9 = 0; var2.payload[var2.caret * 651432265 + var9] != 0; ++var9) {
            ;
        }

        byte[] var10 = new byte[var9];

        for (int var11 = 0; var11 < var9; ++var11) {
            var10[var11] = var2.readByte();
        }

        var2.caret += -99503879;
        ++var9;
        byte[] var38 = new byte[var9];
        int var12;
        int var14;
        if (var9 > 1) {
            var38[1] = 1;
            int var13 = 1;
            var12 = 2;

            for (var14 = 2; var14 < var9; ++var14) {
                int var15 = var2.readUByte();
                if (var15 == 0) {
                    var13 = var12++;
                } else {
                    if (var15 <= var13) {
                        --var15;
                    }

                    var13 = var15;
                }

                var38[var14] = (byte) var13;
            }
        } else {
            var12 = var9;
        }

        classFa[] var39 = new classFa[var12];

        classFa var40;
        for (var14 = 0; var14 < var39.length; ++var14) {
            var40 = var39[var14] = new classFa();
            int var16 = var2.readUByte();
            if (var16 > 0) {
                var40.fieldA = new byte[var16 * 2];
            }

            var16 = var2.readUByte();
            if (var16 > 0) {
                var40.fieldV = new byte[2 + var16 * 2];
                var40.fieldV[1] = 64;
            }
        }

        var14 = var2.readUByte();
        byte[] var41 = var14 > 0 ? new byte[var14 * 2] : null;
        var14 = var2.readUByte();
        byte[] var42 = var14 > 0 ? new byte[var14 * 2] : null;

        int var17;
        for (var17 = 0; 0 != var2.payload[var2.caret * 651432265 + var17]; ++var17) {
            ;
        }

        byte[] var18 = new byte[var17];

        int var19;
        for (var19 = 0; var19 < var17; ++var19) {
            var18[var19] = var2.readByte();
        }

        var2.caret += -99503879;
        ++var17;
        var19 = 0;

        int var20;
        for (var20 = 0; var20 < 128; ++var20) {
            var19 += var2.readUByte();
            this.fieldI[var20] = (short) var19;
        }

        var19 = 0;

        for (var20 = 0; var20 < 128; ++var20) {
            var19 += var2.readUByte();
            this.fieldI[var20] = (short) (this.fieldI[var20] + (var19 << 8));
        }

        var20 = 0;
        int var21 = 0;
        int var22 = 0;

        int var23;
        for (var23 = 0; var23 < 128; ++var23) {
            if (0 == var20) {
                if (var21 < var18.length) {
                    var20 = var18[var21++];
                } else {
                    var20 = -1;
                }

                var22 = var2.av((short) -2887);
            }

            this.fieldI[var23] = (short) (this.fieldI[var23] + ((var22 - 1 & 2) << 14));
            this.fieldE[var23] = var22;
            --var20;
        }

        var20 = 0;
        var21 = 0;
        var23 = 0;

        int var24;
        for (var24 = 0; var24 < 128; ++var24) {
            if (this.fieldE[var24] != 0) {
                if (0 == var20) {
                    if (var21 < var4.length) {
                        var20 = var4[var21++];
                    } else {
                        var20 = -1;
                    }

                    var23 = var2.payload[var5++] - 1;
                }

                this.fieldW[var24] = (byte) var23;
                --var20;
            }
        }

        var20 = 0;
        var21 = 0;
        var24 = 0;

        for (int var25 = 0; var25 < 128; ++var25) {
            if (0 != this.fieldE[var25]) {
                if (var20 == 0) {
                    if (var21 < var7.length) {
                        var20 = var7[var21++];
                    } else {
                        var20 = -1;
                    }

                    var24 = var2.payload[var8++] + 16 << 2;
                }

                this.fieldL[var25] = (byte) var24;
                --var20;
            }
        }

        var20 = 0;
        var21 = 0;
        classFa var44 = null;

        int var26;
        for (var26 = 0; var26 < 128; ++var26) {
            if (0 != this.fieldE[var26]) {
                if (var20 == 0) {
                    var44 = var39[var38[var21]];
                    if (var21 < var10.length) {
                        var20 = var10[var21++];
                    } else {
                        var20 = -1;
                    }
                }

                this.fieldM[var26] = var44;
                --var20;
            }
        }

        var20 = 0;
        var21 = 0;
        var26 = 0;

        int var27;
        for (var27 = 0; var27 < 128; ++var27) {
            if (0 == var20) {
                if (var21 < var18.length) {
                    var20 = var18[var21++];
                } else {
                    var20 = -1;
                }

                if (this.fieldE[var27] > 0) {
                    var26 = var2.readUByte() + 1;
                }
            }

            this.fieldB[var27] = (byte) var26;
            --var20;
        }

        this.fieldA = (var2.readUByte() + 1) * 1560261833;

        classFa var28;
        int var29;
        for (var27 = 0; var27 < var12; ++var27) {
            var28 = var39[var27];
            if (null != var28.fieldA) {
                for (var29 = 1; var29 < var28.fieldA.length; var29 += 2) {
                    var28.fieldA[var29] = var2.readByte();
                }
            }

            if (var28.fieldV != null) {
                for (var29 = 3; var29 < var28.fieldV.length - 2; var29 += 2) {
                    var28.fieldV[var29] = var2.readByte();
                }
            }
        }

        if (var41 != null) {
            for (var27 = 1; var27 < var41.length; var27 += 2) {
                var41[var27] = var2.readByte();
            }
        }

        if (null != var42) {
            for (var27 = 1; var27 < var42.length; var27 += 2) {
                var42[var27] = var2.readByte();
            }
        }

        for (var27 = 0; var27 < var12; ++var27) {
            var28 = var39[var27];
            if (var28.fieldV != null) {
                var19 = 0;

                for (var29 = 2; var29 < var28.fieldV.length; var29 += 2) {
                    var19 = 1 + var19 + var2.readUByte();
                    var28.fieldV[var29] = (byte) var19;
                }
            }
        }

        for (var27 = 0; var27 < var12; ++var27) {
            var28 = var39[var27];
            if (null != var28.fieldA) {
                var19 = 0;

                for (var29 = 2; var29 < var28.fieldA.length; var29 += 2) {
                    var19 = var19 + 1 + var2.readUByte();
                    var28.fieldA[var29] = (byte) var19;
                }
            }
        }

        byte var30;
        int var32;
        int var33;
        int var34;
        int var35;
        int var36;
        int var47;
        byte var49;
        if (var41 != null) {
            var19 = var2.readUByte();
            var41[0] = (byte) var19;

            for (var27 = 2; var27 < var41.length; var27 += 2) {
                var19 = 1 + var19 + var2.readUByte();
                var41[var27] = (byte) var19;
            }

            var49 = var41[0];
            byte var45 = var41[1];

            for (var29 = 0; var29 < var49; ++var29) {
                this.fieldB[var29] = (byte) (this.fieldB[var29] * var45 + 32 >> 6);
            }

            for (var29 = 2; var29 < var41.length; var29 += 2) {
                var30 = var41[var29];
                byte var31 = var41[var29 + 1];
                var32 = var45 * (var30 - var49) + (var30 - var49) / 2;

                for (var33 = var49; var33 < var30; ++var33) {
                    var35 = var30 - var49;
                    var36 = var32 >>> 31;
                    var34 = (var36 + var32) / var35 - var36;
                    this.fieldB[var33] = (byte) (32 + this.fieldB[var33] * var34 >> 6);
                    var32 += var31 - var45;
                }

                var49 = var30;
                var45 = var31;
            }

            for (var47 = var49; var47 < 128; ++var47) {
                this.fieldB[var47] = (byte) (32 + var45 * this.fieldB[var47] >> 6);
            }

            var40 = null;
        }

        if (null != var42) {
            var19 = var2.readUByte();
            var42[0] = (byte) var19;

            for (var27 = 2; var27 < var42.length; var27 += 2) {
                var19 = var19 + 1 + var2.readUByte();
                var42[var27] = (byte) var19;
            }

            var49 = var42[0];
            int var46 = var42[1] << 1;

            for (var29 = 0; var29 < var49; ++var29) {
                var47 = var46 + (this.fieldL[var29] & 255);
                if (var47 < 0) {
                    var47 = 0;
                }

                if (var47 > 128) {
                    var47 = 128;
                }

                this.fieldL[var29] = (byte) var47;
            }

            int var48;
            for (var29 = 2; var29 < var42.length; var29 += 2) {
                var30 = var42[var29];
                var48 = var42[var29 + 1] << 1;
                var32 = (var30 - var49) / 2 + (var30 - var49) * var46;

                for (var33 = var49; var33 < var30; ++var33) {
                    var35 = var30 - var49;
                    var36 = var32 >>> 31;
                    var34 = (var32 + var36) / var35 - var36;
                    int var37 = (this.fieldL[var33] & 255) + var34;
                    if (var37 < 0) {
                        var37 = 0;
                    }

                    if (var37 > 128) {
                        var37 = 128;
                    }

                    this.fieldL[var33] = (byte) var37;
                    var32 += var48 - var46;
                }

                var49 = var30;
                var46 = var48;
            }

            for (var47 = var49; var47 < 128; ++var47) {
                var48 = (this.fieldL[var47] & 255) + var46;
                if (var48 < 0) {
                    var48 = 0;
                }

                if (var48 > 128) {
                    var48 = 128;
                }

                this.fieldL[var47] = (byte) var48;
            }

            Object var43 = null;
        }

        for (var27 = 0; var27 < var12; ++var27) {
            var39[var27].fieldI = var2.readUByte() * 946821579;
        }

        for (var27 = 0; var27 < var12; ++var27) {
            var28 = var39[var27];
            if (null != var28.fieldA) {
                var28.fieldB = var2.readUByte() * -1314356775;
            }

            if (var28.fieldV != null) {
                var28.fieldL = var2.readUByte() * 2008563407;
            }

            if (var28.fieldI * -421395485 > 0) {
                var28.fieldM = var2.readUByte() * -352136291;
            }
        }

        for (var27 = 0; var27 < var12; ++var27) {
            var39[var27].fieldE = var2.readUByte() * 2085780947;
        }

        for (var27 = 0; var27 < var12; ++var27) {
            var28 = var39[var27];
            if (var28.fieldE * -2124160421 > 0) {
                var28.fieldW = var2.readUByte() * -1015781209;
            }
        }

        for (var27 = 0; var27 < var12; ++var27) {
            var28 = var39[var27];
            if (var28.fieldW * -1902461161 > 0) {
                var28.fieldN = var2.readUByte() * -1110188891;
            }
        }

    }

    static final void method12(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, CollisionMap[] var8, int var9) {
        try {
            int var11;
            for (int var10 = 0; var10 < 8; ++var10) {
                if (var9 <= -1420731557) {
                    throw new IllegalStateException();
                }

                for (var11 = 0; var11 < 8; ++var11) {
                    if (var10 + var2 > 0) {
                        if (var9 <= -1420731557) {
                            throw new IllegalStateException();
                        }

                        if (var2 + var10 < 103) {
                            if (var9 <= -1420731557) {
                                return;
                            }

                            if (var11 + var3 > 0) {
                                if (var9 <= -1420731557) {
                                    throw new IllegalStateException();
                                }

                                if (var3 + var11 < 103) {
                                    if (var9 <= -1420731557) {
                                        throw new IllegalStateException();
                                    }

                                    var8[var1].flags[var2 + var10][var3 + var11] &= -16777217;
                                }
                            }
                        }
                    }
                }
            }

            Buffer var30 = new Buffer(var0);

            for (var11 = 0; var11 < 4; ++var11) {
                if (var9 <= -1420731557) {
                    return;
                }

                for (int var12 = 0; var12 < 64; ++var12) {
                    if (var9 <= -1420731557) {
                        throw new IllegalStateException();
                    }

                    for (int var13 = 0; var13 < 64; ++var13) {
                        if (var9 <= -1420731557) {
                            throw new IllegalStateException();
                        }

                        if (var11 == var4) {
                            if (var9 <= -1420731557) {
                                return;
                            }

                            if (var12 >= var5 && var12 < 8 + var5) {
                                if (var9 <= -1420731557) {
                                    return;
                                }

                                if (var13 >= var6) {
                                    if (var9 <= -1420731557) {
                                        return;
                                    }

                                    if (var13 < var6 + 8) {
                                        if (var9 <= -1420731557) {
                                            throw new IllegalStateException();
                                        }

                                        int var18 = var12 & 7;
                                        int var19 = var13 & 7;
                                        int var20 = var7 & 3;
                                        int var17;
                                        if (0 == var20) {
                                            if (var9 <= -1420731557) {
                                                throw new IllegalStateException();
                                            }

                                            var17 = var18;
                                        } else if (1 == var20) {
                                            if (var9 <= -1420731557) {
                                                return;
                                            }

                                            var17 = var19;
                                        } else if (2 == var20) {
                                            if (var9 <= -1420731557) {
                                                throw new IllegalStateException();
                                            }

                                            var17 = 7 - var18;
                                        } else {
                                            var17 = 7 - var19;
                                        }

                                        int var23 = var2 + var17;
                                        int var26 = var12 & 7;
                                        int var27 = var13 & 7;
                                        int var28 = var7 & 3;
                                        int var25;
                                        if (0 == var28) {
                                            var25 = var27;
                                        } else if (var28 == 1) {
                                            if (var9 <= -1420731557) {
                                                throw new IllegalStateException();
                                            }

                                            var25 = 7 - var26;
                                        } else if (var28 == 2) {
                                            if (var9 <= -1420731557) {
                                                throw new IllegalStateException();
                                            }

                                            var25 = 7 - var27;
                                        } else {
                                            var25 = var26;
                                        }

                                        classBt.method255(var30, var1, var23, var3 + var25, 0, 0, var7, (byte) 24);
                                        continue;
                                    }
                                }
                            }
                        }

                        classBt.method255(var30, 0, -1, -1, 0, 0, 0, (byte) 55);
                    }
                }
            }

        } catch (RuntimeException var29) {
            throw ClanMate.error(var29, "fl.i(" + ')');
        }
    }

    static char method13(char var0, int var1, byte var2) {
        try {
            if (var0 >= 192) {
                if (var2 == 0) {
                    throw new IllegalStateException();
                }

                if (var0 <= 255) {
                    label253:
                    {
                        if (var2 == 0) {
                            throw new IllegalStateException();
                        }

                        if (var0 >= 192) {
                            if (var2 == 0) {
                                throw new IllegalStateException();
                            }

                            if (var0 <= 198) {
                                if (var2 == 0) {
                                    throw new IllegalStateException();
                                }

                                return 'A';
                            }
                        }

                        if (var0 == 199) {
                            if (var2 == 0) {
                                throw new IllegalStateException();
                            }

                            return 'C';
                        }

                        if (var0 >= 200) {
                            if (var2 == 0) {
                                throw new IllegalStateException();
                            }

                            if (var0 <= 203) {
                                if (var2 == 0) {
                                    throw new IllegalStateException();
                                }

                                return 'E';
                            }
                        }

                        if (var0 >= 204) {
                            if (var2 == 0) {
                                throw new IllegalStateException();
                            }

                            if (var0 <= 207) {
                                if (var2 == 0) {
                                    throw new IllegalStateException();
                                }

                                return 'I';
                            }
                        }

                        if (var0 >= 210) {
                            if (var2 == 0) {
                                throw new IllegalStateException();
                            }

                            if (var0 <= 214) {
                                if (var2 == 0) {
                                    throw new IllegalStateException();
                                }

                                return 'O';
                            }
                        }

                        if (var0 >= 217) {
                            if (var2 == 0) {
                                throw new IllegalStateException();
                            }

                            if (var0 <= 220) {
                                if (var2 == 0) {
                                    throw new IllegalStateException();
                                }

                                return 'U';
                            }
                        }

                        if (var0 == 221) {
                            if (var2 == 0) {
                                throw new IllegalStateException();
                            }

                            return 'Y';
                        }

                        if (223 == var0) {
                            if (var2 == 0) {
                                throw new IllegalStateException();
                            }

                            return 's';
                        }

                        if (var0 >= 224) {
                            if (var2 == 0) {
                                throw new IllegalStateException();
                            }

                            if (var0 <= 230) {
                                return 'a';
                            }
                        }

                        if (var0 == 231) {
                            if (var2 == 0) {
                                throw new IllegalStateException();
                            }

                            return 'c';
                        }

                        if (var0 >= 232) {
                            if (var2 == 0) {
                                throw new IllegalStateException();
                            }

                            if (var0 <= 235) {
                                if (var2 == 0) {
                                    throw new IllegalStateException();
                                }

                                return 'e';
                            }
                        }

                        if (var0 >= 236) {
                            if (var2 == 0) {
                                throw new IllegalStateException();
                            }

                            if (var0 <= 239) {
                                return 'i';
                            }
                        }

                        if (var0 >= 242) {
                            if (var2 == 0) {
                                throw new IllegalStateException();
                            }

                            if (var0 <= 246) {
                                if (var2 == 0) {
                                    throw new IllegalStateException();
                                }

                                return 'o';
                            }
                        }

                        if (var0 >= 249) {
                            if (var2 == 0) {
                                throw new IllegalStateException();
                            }

                            if (var0 <= 252) {
                                return 'u';
                            }
                        }

                        if (253 != var0) {
                            if (var2 == 0) {
                                throw new IllegalStateException();
                            }

                            if (var0 != 255) {
                                break label253;
                            }

                            if (var2 == 0) {
                                throw new IllegalStateException();
                            }
                        }

                        return 'y';
                    }
                }
            }

            if (338 == var0) {
                if (var2 == 0) {
                    throw new IllegalStateException();
                } else {
                    return 'O';
                }
            } else if (339 == var0) {
                if (var2 == 0) {
                    throw new IllegalStateException();
                } else {
                    return 'o';
                }
            } else if (376 == var0) {
                if (var2 == 0) {
                    throw new IllegalStateException();
                } else {
                    return 'Y';
                }
            } else {
                return var0;
            }
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "fl.v(" + ')');
        }
    }

    boolean a(classBo var1, byte[] var2, int[] var3, byte var4) {
        try {
            boolean var5 = true;
            int var6 = 0;
            classBl var7 = null;

            for (int var8 = 0; var8 < 128; ++var8) {
                if (var4 <= 0) {
                    throw new IllegalStateException();
                }

                if (null != var2) {
                    if (var4 <= 0) {
                        throw new IllegalStateException();
                    }

                    if (0 == var2[var8]) {
                        continue;
                    }
                }

                int var9 = this.fieldE[var8];
                if (0 == var9) {
                    if (var4 <= 0) {
                        throw new IllegalStateException();
                    }
                } else {
                    if (var9 != var6) {
                        if (var4 <= 0) {
                            throw new IllegalStateException();
                        }

                        var6 = var9--;
                        if (0 == (var9 & 1)) {
                            var7 = var1.i(var9 >> 2, var3, (byte) 112);
                        } else {
                            var7 = var1.b(var9 >> 2, var3, 1396957121);
                        }

                        if (var7 == null) {
                            var5 = false;
                        }
                    }

                    if (var7 != null) {
                        this.fieldV[var8] = var7;
                        this.fieldE[var8] = 0;
                    }
                }
            }

            return var5;
        } catch (RuntimeException var10) {
            throw ClanMate.error(var10, "fl.a(" + ')');
        }
    }

    void v(int var1) {
        try {
            this.fieldE = null;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "fl.v(" + ')');
        }
    }
}
