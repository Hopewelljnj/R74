package com.jagex;

public final class UtilClass12 {

    static classCm fieldE = new classCm();


    UtilClass12() throws Throwable {
        throw new Error();
    }

    public static int method38(byte[] var0, int var1, byte[] var2, int var3, int var4) {
        classCm var5 = fieldE;
        synchronized (fieldE) {
            fieldE.fieldW = var2;
            fieldE.fieldE = var4 * -323452097;
            fieldE.fieldS = var0;
            fieldE.fieldK = 0;
            fieldE.fieldF = var1 * 193320453;
            fieldE.fieldT = 0;
            fieldE.fieldQ = 0;
            fieldE.fieldN = 0;
            fieldE.fieldD = 0;
            method40(fieldE);
            var1 -= fieldE.fieldF * 2099873485;
            fieldE.fieldW = null;
            fieldE.fieldS = null;
            return var1;
        }
    }

    static void method39(classCm var0) {
        byte var2 = var0.fieldX;
        int var3 = var0.fieldO * -25441905;
        int var4 = var0.fieldP * 2021635209;
        int var5 = var0.fieldG * -518295715;
        int[] var6 = Varpbit.fieldZ;
        int var7 = var0.fieldJ * 2001071471;
        byte[] var8 = var0.fieldS;
        int var9 = var0.fieldK * -1081422241;
        int var10 = var0.fieldF * 2099873485;
        int var12 = var0.fieldAa * 2146959249 + 1;

        label121:
        while (true) {
            if (var3 > 0) {
                while (true) {
                    if (var10 == 0) {
                        break label121;
                    }

                    if (var3 == 1) {
                        if (var10 == 0) {
                            var3 = 1;
                            break label121;
                        }

                        var8[var9] = var2;
                        ++var9;
                        --var10;
                        break;
                    }

                    var8[var9] = var2;
                    --var3;
                    ++var9;
                    --var10;
                }
            }

            boolean var14 = true;

            byte var1;
            while (var14) {
                var14 = false;
                if (var4 == var12) {
                    var3 = 0;
                    break label121;
                }

                var2 = (byte) var5;
                var7 = var6[var7];
                var1 = (byte) (var7 & 255);
                var7 >>= 8;
                ++var4;
                if (var1 != var5) {
                    var5 = var1;
                    if (var10 == 0) {
                        var3 = 1;
                        break label121;
                    }

                    var8[var9] = var2;
                    ++var9;
                    --var10;
                    var14 = true;
                } else if (var4 == var12) {
                    if (var10 == 0) {
                        var3 = 1;
                        break label121;
                    }

                    var8[var9] = var2;
                    ++var9;
                    --var10;
                    var14 = true;
                }
            }

            var3 = 2;
            var7 = var6[var7];
            var1 = (byte) (var7 & 255);
            var7 >>= 8;
            ++var4;
            if (var4 != var12) {
                if (var1 != var5) {
                    var5 = var1;
                } else {
                    var3 = 3;
                    var7 = var6[var7];
                    var1 = (byte) (var7 & 255);
                    var7 >>= 8;
                    ++var4;
                    if (var4 != var12) {
                        if (var1 != var5) {
                            var5 = var1;
                        } else {
                            var7 = var6[var7];
                            var1 = (byte) (var7 & 255);
                            var7 >>= 8;
                            ++var4;
                            var3 = (var1 & 255) + 4;
                            var7 = var6[var7];
                            var5 = (byte) (var7 & 255);
                            var7 >>= 8;
                            ++var4;
                        }
                    }
                }
            }
        }

        int var13 = var0.fieldD * -2114004163;
        var0.fieldD += (var10 - var10) * 289952789;
        if (var0.fieldD * -2114004163 < var13) {
            ;
        }

        var0.fieldX = var2;
        var0.fieldO = var3 * -128502417;
        var0.fieldP = var4 * 259129785;
        var0.fieldG = var5 * 1896701173;
        Varpbit.fieldZ = var6;
        var0.fieldJ = var7 * 2039746959;
        var0.fieldS = var8;
        var0.fieldK = var9 * -1206841953;
        var0.fieldF = var10 * 193320453;
    }

    static void method40(classCm var0) {
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        boolean var13 = false;
        boolean var14 = false;
        boolean var15 = false;
        boolean var16 = false;
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        boolean var20 = false;
        boolean var21 = false;
        int var22 = 0;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        var0.fieldH = -73763139;
        if (Varpbit.fieldZ == null) {
            Varpbit.fieldZ = new int[var0.fieldH * -83109088];
        }

        boolean var26 = true;

        while (var26) {
            byte var1 = method41(var0);
            if (var1 == 23) {
                return;
            }

            var1 = method41(var0);
            var1 = method41(var0);
            var1 = method41(var0);
            var1 = method41(var0);
            var1 = method41(var0);
            var1 = method41(var0);
            var1 = method41(var0);
            var1 = method41(var0);
            var1 = method41(var0);
            var1 = method42(var0);
            if (var1 != 0) {
                ;
            }

            var0.fieldU = 0;
            var1 = method41(var0);
            var0.fieldU = (var0.fieldU * 59179793 << 8 | var1 & 255) * 509234673;
            var1 = method41(var0);
            var0.fieldU = (var0.fieldU * 59179793 << 8 | var1 & 255) * 509234673;
            var1 = method41(var0);
            var0.fieldU = (var0.fieldU * 59179793 << 8 | var1 & 255) * 509234673;

            int var35;
            for (var35 = 0; var35 < 16; ++var35) {
                var1 = method42(var0);
                if (var1 == 1) {
                    var0.fieldAs[var35] = true;
                } else {
                    var0.fieldAs[var35] = false;
                }
            }

            for (var35 = 0; var35 < 256; ++var35) {
                var0.fieldAn[var35] = false;
            }

            int var36;
            for (var35 = 0; var35 < 16; ++var35) {
                if (var0.fieldAs[var35]) {
                    for (var36 = 0; var36 < 16; ++var36) {
                        var1 = method42(var0);
                        if (var1 == 1) {
                            var0.fieldAn[var35 * 16 + var36] = true;
                        }
                    }
                }
            }

            method45(var0);
            int var38 = var0.fieldC * 551061207 + 2;
            int var39 = method44(3, var0);
            int var40 = method44(15, var0);
            var35 = 0;

            while (var35 < var40) {
                var36 = 0;

                while (true) {
                    var1 = method42(var0);
                    if (var1 == 0) {
                        var0.fieldAl[var35] = (byte) var36;
                        ++var35;
                        break;
                    }

                    ++var36;
                }
            }

            byte[] var27 = new byte[6];

            byte var29;
            for (var29 = 0; var29 < var39; var27[var29] = var29++) {
                ;
            }

            for (var35 = 0; var35 < var40; ++var35) {
                var29 = var0.fieldAl[var35];

                byte var28;
                for (var28 = var27[var29]; var29 > 0; --var29) {
                    var27[var29] = var27[var29 - 1];
                }

                var27[0] = var28;
                var0.fieldAv[var35] = var28;
            }

            int var37;
            for (var37 = 0; var37 < var39; ++var37) {
                int var49 = method44(5, var0);
                var35 = 0;

                while (var35 < var38) {
                    while (true) {
                        var1 = method42(var0);
                        if (var1 == 0) {
                            var0.fieldAq[var37][var35] = (byte) var49;
                            ++var35;
                            break;
                        }

                        var1 = method42(var0);
                        if (var1 == 0) {
                            ++var49;
                        } else {
                            --var49;
                        }
                    }
                }
            }

            for (var37 = 0; var37 < var39; ++var37) {
                byte var2 = 32;
                byte var3 = 0;

                for (var35 = 0; var35 < var38; ++var35) {
                    if (var0.fieldAq[var37][var35] > var3) {
                        var3 = var0.fieldAq[var37][var35];
                    }

                    if (var0.fieldAq[var37][var35] < var2) {
                        var2 = var0.fieldAq[var37][var35];
                    }
                }

                method43(var0.fieldAm[var37], var0.fieldAx[var37], var0.fieldAz[var37], var0.fieldAq[var37], var2, var3, var38);
                var0.fieldAi[var37] = var2;
            }

            int var41 = var0.fieldC * 551061207 + 1;
            int var42 = -1;
            byte var43 = 0;

            for (var35 = 0; var35 <= 255; ++var35) {
                var0.fieldY[var35] = 0;
            }

            int var56 = 4095;

            int var54;
            int var55;
            for (var54 = 15; var54 >= 0; --var54) {
                for (var55 = 15; var55 >= 0; --var55) {
                    var0.fieldAr[var56] = (byte) (var54 * 16 + var55);
                    --var56;
                }

                var0.fieldAe[var54] = var56 + 1;
            }

            int var46 = 0;
            byte var53;
            if (var43 == 0) {
                ++var42;
                var43 = 50;
                var53 = var0.fieldAv[var42];
                var22 = var0.fieldAi[var53];
                var23 = var0.fieldAm[var53];
                var25 = var0.fieldAz[var53];
                var24 = var0.fieldAx[var53];
            }

            int var44 = var43 - 1;
            int var50 = var22;

            int var51;
            byte var52;
            for (var51 = method44(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
                ++var50;
                var52 = method42(var0);
            }

            int var45 = var25[var51 - var24[var50]];

            while (var45 != var41) {
                if (var45 != 0 && var45 != 1) {
                    int var33 = var45 - 1;
                    int var30;
                    if (var33 < 16) {
                        var30 = var0.fieldAe[0];

                        for (var1 = var0.fieldAr[var30 + var33]; var33 > 3; var33 -= 4) {
                            int var34 = var30 + var33;
                            var0.fieldAr[var34] = var0.fieldAr[var34 - 1];
                            var0.fieldAr[var34 - 1] = var0.fieldAr[var34 - 2];
                            var0.fieldAr[var34 - 2] = var0.fieldAr[var34 - 3];
                            var0.fieldAr[var34 - 3] = var0.fieldAr[var34 - 4];
                        }

                        while (var33 > 0) {
                            var0.fieldAr[var30 + var33] = var0.fieldAr[var30 + var33 - 1];
                            --var33;
                        }

                        var0.fieldAr[var30] = var1;
                    } else {
                        int var31 = var33 / 16;
                        int var32 = var33 % 16;
                        var30 = var0.fieldAe[var31] + var32;

                        for (var1 = var0.fieldAr[var30]; var30 > var0.fieldAe[var31]; --var30) {
                            var0.fieldAr[var30] = var0.fieldAr[var30 - 1];
                        }

                        ++var0.fieldAe[var31];

                        while (var31 > 0) {
                            --var0.fieldAe[var31];
                            var0.fieldAr[var0.fieldAe[var31]] = var0.fieldAr[var0.fieldAe[var31 - 1] + 16 - 1];
                            --var31;
                        }

                        --var0.fieldAe[0];
                        var0.fieldAr[var0.fieldAe[0]] = var1;
                        if (var0.fieldAe[0] == 0) {
                            var56 = 4095;

                            for (var54 = 15; var54 >= 0; --var54) {
                                for (var55 = 15; var55 >= 0; --var55) {
                                    var0.fieldAr[var56] = var0.fieldAr[var0.fieldAe[var54] + var55];
                                    --var56;
                                }

                                var0.fieldAe[var54] = var56 + 1;
                            }
                        }
                    }

                    ++var0.fieldY[var0.fieldAh[var1 & 255] & 255];
                    Varpbit.fieldZ[var46] = var0.fieldAh[var1 & 255] & 255;
                    ++var46;
                    if (var44 == 0) {
                        ++var42;
                        var44 = 50;
                        var53 = var0.fieldAv[var42];
                        var22 = var0.fieldAi[var53];
                        var23 = var0.fieldAm[var53];
                        var25 = var0.fieldAz[var53];
                        var24 = var0.fieldAx[var53];
                    }

                    --var44;
                    var50 = var22;

                    for (var51 = method44(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
                        ++var50;
                        var52 = method42(var0);
                    }

                    var45 = var25[var51 - var24[var50]];
                } else {
                    int var47 = -1;
                    int var48 = 1;

                    do {
                        if (var45 == 0) {
                            var47 += 1 * var48;
                        } else if (var45 == 1) {
                            var47 += 2 * var48;
                        }

                        var48 *= 2;
                        if (var44 == 0) {
                            ++var42;
                            var44 = 50;
                            var53 = var0.fieldAv[var42];
                            var22 = var0.fieldAi[var53];
                            var23 = var0.fieldAm[var53];
                            var25 = var0.fieldAz[var53];
                            var24 = var0.fieldAx[var53];
                        }

                        --var44;
                        var50 = var22;

                        for (var51 = method44(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
                            ++var50;
                            var52 = method42(var0);
                        }

                        var45 = var25[var51 - var24[var50]];
                    } while (var45 == 0 || var45 == 1);

                    ++var47;
                    var1 = var0.fieldAh[var0.fieldAr[var0.fieldAe[0]] & 255];

                    for (var0.fieldY[var1 & 255] += var47; var47 > 0; --var47) {
                        Varpbit.fieldZ[var46] = var1 & 255;
                        ++var46;
                    }
                }
            }

            var0.fieldO = 0;
            var0.fieldX = 0;
            var0.fieldR[0] = 0;

            for (var35 = 1; var35 <= 256; ++var35) {
                var0.fieldR[var35] = var0.fieldY[var35 - 1];
            }

            for (var35 = 1; var35 <= 256; ++var35) {
                var0.fieldR[var35] += var0.fieldR[var35 - 1];
            }

            for (var35 = 0; var35 < var46; ++var35) {
                var1 = (byte) (Varpbit.fieldZ[var35] & 255);
                Varpbit.fieldZ[var0.fieldR[var1 & 255]] |= var35 << 8;
                ++var0.fieldR[var1 & 255];
            }

            var0.fieldJ = (Varpbit.fieldZ[var0.fieldU * 59179793] >> 8) * 2039746959;
            var0.fieldP = 0;
            var0.fieldJ = Varpbit.fieldZ[var0.fieldJ * 2001071471] * 2039746959;
            var0.fieldG = (byte) (var0.fieldJ * 2001071471 & 255) * 1896701173;
            var0.fieldJ = (var0.fieldJ * 2001071471 >> 8) * 2039746959;
            var0.fieldP += 259129785;
            var0.fieldAa = var46 * 1139712369;
            method39(var0);
            if (var0.fieldP * 2021635209 == var0.fieldAa * 2146959249 + 1 && var0.fieldO * -25441905 == 0) {
                var26 = true;
            } else {
                var26 = false;
            }
        }

    }

    static byte method41(classCm var0) {
        return (byte) method44(8, var0);
    }

    static byte method42(classCm var0) {
        return (byte) method44(1, var0);
    }

    static void method43(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
        int var7 = 0;

        int var8;
        for (var8 = var4; var8 <= var5; ++var8) {
            for (int var9 = 0; var9 < var6; ++var9) {
                if (var3[var9] == var8) {
                    var2[var7] = var9;
                    ++var7;
                }
            }
        }

        for (var8 = 0; var8 < 23; ++var8) {
            var1[var8] = 0;
        }

        for (var8 = 0; var8 < var6; ++var8) {
            ++var1[var3[var8] + 1];
        }

        for (var8 = 1; var8 < 23; ++var8) {
            var1[var8] += var1[var8 - 1];
        }

        for (var8 = 0; var8 < 23; ++var8) {
            var0[var8] = 0;
        }

        int var10 = 0;

        for (var8 = var4; var8 <= var5; ++var8) {
            var10 += var1[var8 + 1] - var1[var8];
            var0[var8] = var10 - 1;
            var10 <<= 1;
        }

        for (var8 = var4 + 1; var8 <= var5; ++var8) {
            var1[var8] = (var0[var8 - 1] + 1 << 1) - var1[var8];
        }

    }

    static int method44(int var0, classCm var1) {
        while (var1.fieldT * -1815216559 < var0) {
            var1.fieldQ = (var1.fieldQ * 583720315 << 8 | var1.fieldW[var1.fieldE * -660017985] & 255) * -1763149389;
            var1.fieldT += -618637944;
            var1.fieldE += -323452097;
            var1.fieldN += -401384345;
            if (var1.fieldN * 670564183 == 0) {
                ;
            }
        }

        int var3 = var1.fieldQ * 583720315 >> var1.fieldT * -1815216559 - var0 & (1 << var0) - 1;
        var1.fieldT -= var0 * -77329743;
        return var3;
    }

    static void method45(classCm var0) {
        var0.fieldC = 0;

        for (int var1 = 0; var1 < 256; ++var1) {
            if (var0.fieldAn[var1]) {
                var0.fieldAh[var0.fieldC * 551061207] = (byte) var1;
                var0.fieldC += 30264551;
            }
        }

    }
}
