package com.jagex;

import java.awt.*;

public class classAi extends DualNode {

    public static Cache fieldV = new Cache(64);
    public static ReferenceTable fieldA;
    static String fieldAw;

    public int fieldB;
    public int fieldL;
    public int fieldM;
    public int fieldW;


    int fieldI = 0;

    static void method391(classGm var0, classGm var1, int DUMMY) {
        try {
            byte var3;
            short var23;
            short var25;
            short var26;
            int var27;
            int var31;
            int var32;
            int var34;
            int var35;
            int var37;
            int var38;
            int var39;
            Graphics var40;
            byte var43;
            if (ClientData.isWorldSelectorOpen) {

                if (ClientData.worldSelectorBack == null) {
                    if (DUMMY <= -576862858) {
                        throw new IllegalStateException();
                    }

                    ClientData.worldSelectorBack = UtilClass24.method4(UtilClass5.fieldBp, "sl_back", "", (byte) 88);
                }

                if (null == ClientData.worldSelectorFlags) {
                    if (DUMMY <= -576862858) {
                        throw new IllegalStateException();
                    }

                    ClientData.worldSelectorFlags = classDs.method82(UtilClass5.fieldBp, "sl_flags", "", 383993922);
                }

                if (null == DynamicObject.worldSelectorArrows) {
                    if (DUMMY <= -576862858) {
                        throw new IllegalStateException();
                    }

                    DynamicObject.worldSelectorArrows = classDs.method82(UtilClass5.fieldBp, "sl_arrows", "", 383993922);
                }

                if (RuneScript.worldSelectorStars == null) {
                    if (DUMMY <= -576862858) {
                        throw new IllegalStateException();
                    }

                    RuneScript.worldSelectorStars = classDs.method82(UtilClass5.fieldBp, "sl_stars", "", 383993922);
                }

                RSGraphics.method235(0, 23, 765, 480, 0);
                RSGraphics.method236(0, 0, 125, 23, 12425273, 9135624);
                RSGraphics.method236(125, 0, 640, 23, 5197647, 2697513);
                var0.k(StringConstants.fieldIt, 62, 15, 0, -1);

                if (null != RuneScript.worldSelectorStars) {
                    RuneScript.worldSelectorStars[1].i(140, 1);
                    var1.n(StringConstants.fieldIs, 152, 10, 16777215, -1);
                    RuneScript.worldSelectorStars[0].i(140, 12);
                    var1.n(StringConstants.fieldIv, 152, 21, 16777215, -1);
                }

                if (null != DynamicObject.worldSelectorArrows) {

                    label720:
                    {
                        var23 = 280;
                        if (ClientData.fieldBm[0] == 0) {

                            if (ClientData.fieldBz[0] == 0) {


                                DynamicObject.worldSelectorArrows[2].i(var23, 4);
                                break label720;
                            }
                        }

                        DynamicObject.worldSelectorArrows[0].i(var23, 4);
                    }

                    label714:
                    {
                        if (ClientData.fieldBm[0] == 0) {


                            if (1 == ClientData.fieldBz[0]) {
                                if (DUMMY <= -576862858) {
                                    return;
                                }

                                DynamicObject.worldSelectorArrows[3].i(var23 + 15, 4);
                                break label714;
                            }
                        }

                        DynamicObject.worldSelectorArrows[1].i(var23 + 15, 4);
                    }

                    label708:
                    {
                        var0.n(StringConstants.fieldIh, 32 + var23, 17, 16777215, -1);
                        var25 = 390;
                        if (ClientData.fieldBm[0] == 1) {
                            if (DUMMY <= -576862858) {
                                throw new IllegalStateException();
                            }

                            if (0 == ClientData.fieldBz[0]) {
                                if (DUMMY <= -576862858) {
                                    throw new IllegalStateException();
                                }

                                DynamicObject.worldSelectorArrows[2].i(var25, 4);
                                break label708;
                            }
                        }

                        DynamicObject.worldSelectorArrows[0].i(var25, 4);
                    }

                    label702:
                    {
                        if (ClientData.fieldBm[0] == 1) {
                            if (DUMMY <= -576862858) {
                                throw new IllegalStateException();
                            }

                            if (1 == ClientData.fieldBz[0]) {
                                DynamicObject.worldSelectorArrows[3].i(15 + var25, 4);
                                break label702;
                            }
                        }

                        DynamicObject.worldSelectorArrows[1].i(15 + var25, 4);
                    }

                    label696:
                    {
                        var0.n(StringConstants.fieldIk, var25 + 32, 17, 16777215, -1);
                        var26 = 500;
                        if (2 == ClientData.fieldBm[0]) {
                            if (DUMMY <= -576862858) {
                                throw new IllegalStateException();
                            }

                            if (ClientData.fieldBz[0] == 0) {
                                if (DUMMY <= -576862858) {
                                    return;
                                }

                                DynamicObject.worldSelectorArrows[2].i(var26, 4);
                                break label696;
                            }
                        }

                        DynamicObject.worldSelectorArrows[0].i(var26, 4);
                    }

                    label690:
                    {
                        if (2 == ClientData.fieldBm[0]) {
                            if (DUMMY <= -576862858) {
                                return;
                            }

                            if (1 == ClientData.fieldBz[0]) {
                                if (DUMMY <= -576862858) {
                                    throw new IllegalStateException();
                                }

                                DynamicObject.worldSelectorArrows[3].i(15 + var26, 4);
                                break label690;
                            }
                        }

                        DynamicObject.worldSelectorArrows[1].i(var26 + 15, 4);
                    }

                    short var29;
                    label684:
                    {
                        var0.n(StringConstants.fieldIc, var26 + 32, 17, 16777215, -1);
                        var29 = 610;
                        if (3 == ClientData.fieldBm[0]) {
                            if (DUMMY <= -576862858) {
                                throw new IllegalStateException();
                            }

                            if (0 == ClientData.fieldBz[0]) {
                                if (DUMMY <= -576862858) {
                                    throw new IllegalStateException();
                                }

                                DynamicObject.worldSelectorArrows[2].i(var29, 4);
                                break label684;
                            }
                        }

                        DynamicObject.worldSelectorArrows[0].i(var29, 4);
                    }

                    label678:
                    {
                        if (ClientData.fieldBm[0] == 3) {
                            if (DUMMY <= -576862858) {
                                throw new IllegalStateException();
                            }

                            if (ClientData.fieldBz[0] == 1) {
                                if (DUMMY <= -576862858) {
                                    return;
                                }

                                DynamicObject.worldSelectorArrows[3].i(var29 + 15, 4);
                                break label678;
                            }
                        }

                        DynamicObject.worldSelectorArrows[1].i(15 + var29, 4);
                    }

                    var0.n(StringConstants.fieldId, 32 + var29, 17, 16777215, -1);
                }

                RSGraphics.method235(708, 4, 50, 16, 0);
                var1.k(StringConstants.cancel, 733, 16, 16777215, -1);
                ClientData.fieldBr = -222258127;
                if (ClientData.worldSelectorBack != null) {
                    if (DUMMY <= -576862858) {
                        return;
                    }

                    var3 = 88;
                    byte var30 = 19;
                    var31 = 765 / (1 + var3);
                    var27 = 480 / (var30 + 1);

                    do {
                        do {
                            var32 = var27;
                            var34 = var31;
                            if (var27 * (var31 - 1) >= ClientData.fieldBo * -136563763) {
                                if (DUMMY <= -576862858) {
                                    return;
                                }

                                --var31;
                            }

                            if (var31 * (var27 - 1) >= ClientData.fieldBo * -136563763) {
                                if (DUMMY <= -576862858) {
                                    throw new IllegalStateException();
                                }

                                --var27;
                            }

                            if ((var27 - 1) * var31 >= ClientData.fieldBo * -136563763) {
                                if (DUMMY <= -576862858) {
                                    throw new IllegalStateException();
                                }

                                --var27;
                            }
                        } while (var32 != var27);

                        if (DUMMY <= -576862858) {
                            return;
                        }
                    } while (var34 != var31);

                    var32 = (765 - var31 * var3) / (1 + var31);
                    if (var32 > 5) {
                        if (DUMMY <= -576862858) {
                            return;
                        }

                        var32 = 5;
                    }

                    var34 = (480 - var27 * var30) / (1 + var27);
                    if (var34 > 5) {
                        if (DUMMY <= -576862858) {
                            throw new IllegalStateException();
                        }

                        var34 = 5;
                    }

                    var35 = (765 - var31 * var3 - (var31 - 1) * var32) / 2;
                    var37 = (480 - var30 * var27 - (var27 - 1) * var34) / 2;
                    var38 = var37 + 23;
                    var39 = var35;
                    int var13 = 0;
                    boolean var14 = false;

                    int var15;
                    for (var15 = 0; var15 < ClientData.fieldBo * -136563763; ++var15) {
                        if (DUMMY <= -576862858) {
                            throw new IllegalStateException();
                        }

                        World var16 = ExchangeOfferQuantityComparator.fieldBi[var15];
                        boolean var17 = true;
                        String var18 = Integer.toString(var16.fieldI * -1182340995);
                        if (var16.fieldI * -1182340995 == -1) {
                            if (DUMMY <= -576862858) {
                                throw new IllegalStateException();
                            }

                            var18 = StringConstants.fieldIz;
                            var17 = false;
                        } else if (var16.fieldI * -1182340995 > 1980) {
                            if (DUMMY <= -576862858) {
                                return;
                            }

                            var18 = StringConstants.fieldIy;
                            var17 = false;
                        }

                        byte var19;
                        if (var16.v((byte) 90)) {
                            if (DUMMY <= -576862858) {
                                return;
                            }

                            if (var16.a(30492126)) {
                                var19 = 3;
                            } else {
                                var19 = 2;
                            }
                        } else if (var16.a(-1612400074)) {
                            if (DUMMY <= -576862858) {
                                throw new IllegalStateException();
                            }

                            var19 = 1;
                        } else {
                            var19 = 0;
                        }

                        label661:
                        {
                            if (Mouse.fieldW * 518596439 >= var39) {
                                if (DUMMY <= -576862858) {
                                    throw new IllegalStateException();
                                }

                                if (Mouse.fieldE * 1747296693 >= var38) {
                                    if (DUMMY <= -576862858) {
                                        throw new IllegalStateException();
                                    }

                                    if (Mouse.fieldW * 518596439 < var39 + var3) {
                                        if (DUMMY <= -576862858) {
                                            throw new IllegalStateException();
                                        }

                                        if (Mouse.fieldE * 1747296693 < var38 + var30) {
                                            if (DUMMY <= -576862858) {
                                                return;
                                            }

                                            if (var17) {
                                                if (DUMMY <= -576862858) {
                                                    throw new IllegalStateException();
                                                }

                                                ClientData.fieldBr = 222258127 * var15;
                                                ClientData.worldSelectorBack[var19].q(var39, var38, 128, 16777215);
                                                var14 = true;
                                                break label661;
                                            }
                                        }
                                    }
                                }
                            }

                            ClientData.worldSelectorBack[var19].s(var39, var38);
                        }

                        if (ClientData.worldSelectorFlags != null) {
                            if (DUMMY <= -576862858) {
                                return;
                            }

                            CompressedImage[] var10000 = ClientData.worldSelectorFlags;
                            if (var16.a(-83502419)) {
                                if (DUMMY <= -576862858) {
                                    throw new IllegalStateException();
                                }

                                var43 = 8;
                            } else {
                                var43 = 0;
                            }

                            var10000[var43 + var16.fieldM * 470766207].i(var39 + 29, var38);
                        }

                        var0.k(Integer.toString(var16.fieldA * 282778565), 15 + var39, var38 + var30 / 2 + 5, 0, -1);
                        var1.k(var18, var39 + 60, 5 + var30 / 2 + var38, 268435455, -1);
                        var38 += var30 + var34;
                        ++var13;
                        if (var13 >= var27) {
                            if (DUMMY <= -576862858) {
                                throw new IllegalStateException();
                            }

                            var38 = 23 + var37;
                            var39 += var32 + var3;
                            var13 = 0;
                        }
                    }

                    if (var14) {
                        var15 = var1.b(ExchangeOfferQuantityComparator.fieldBi[ClientData.fieldBr * -909458641].fieldL) + 6;
                        int var41 = var1.fieldW + 8;
                        RSGraphics.method235(Mouse.fieldW * 518596439 - var15 / 2, 5 + 20 + Mouse.fieldE * 1747296693, var15, var41, 16777120);
                        RSGraphics.drawRectangle(Mouse.fieldW * 518596439 - var15 / 2, 20 + Mouse.fieldE * 1747296693 + 5, var15, var41, 0);
                        var1.k(ExchangeOfferQuantityComparator.fieldBi[ClientData.fieldBr * -909458641].fieldL, Mouse.fieldW * 518596439, 5 + Mouse.fieldE * 1747296693 + 20 + var1.fieldW + 4, 0, -1);
                    }
                }

                try {
                    var40 = UtilClass22.canvas.getGraphics();
                    Projectile.fieldPt.v(var40, 0, 0, 796343669);
                } catch (Exception var20) {
                    UtilClass22.canvas.repaint();
                }

            } else {
                label835:
                {
                    if (0 != Client.connectionState * -214882771) {
                        if (Client.connectionState * -214882771 != 5) {
                            break label835;
                        }
                    }

                    var3 = 20;
                    var0.k(StringConstants.fieldHb, 382, 245 - var3, 16777215, -1);
                    int var4 = 253 - var3;
                    RSGraphics.drawRectangle(230, var4, 304, 34, 9179409);
                    RSGraphics.drawRectangle(231, var4 + 1, 302, 32, 0);
                    RSGraphics.method235(232, var4 + 2, ClientData.fieldAe * -1295378635, 30, 9179409);
                    RSGraphics.method235(232 + ClientData.fieldAe * -1295378635, 2 + var4, 300 - ClientData.fieldAe * -1295378635, 30, 0);
                    var0.k(ClientData.loadStatusString, 382, 276 - var3, 16777215, -1);
                }

                String var5;
                String var7;
                String var8;
                String var9;
                int var24;
                if (20 == Client.connectionState * -214882771) {
                    Client.fieldV.i(382 - Client.fieldV.fieldI / 2, 271 - Client.fieldV.fieldB / 2);
                    var23 = 211;
                    var0.k(ClientData.fieldAq, 382, var23, 16776960, 0);
                    var24 = var23 + 15;
                    var0.k(ClientData.fieldAm, 382, var24, 16776960, 0);
                    var24 += 15;
                    var0.k(ClientData.fieldAx, 382, var24, 16776960, 0);
                    var24 += 15;
                    var24 += 10;
                    if (ClientData.fieldAl * -250617745 != 4) {
                        var0.n(StringConstants.fieldHa, 272, var24, 16777215, 0);
                        var25 = 200;
                        var5 = ClientData.username;
                        while (var0.b(var5) > var25) {
                            var5 = var5.substring(0, var5.length() - 1);
                        }
                        var0.n(classGs.method32(var5), 312, var24, 16777215, 0);
                        var24 += 15;
                        var7 = StringConstants.fieldHo;
                        var9 = ClientData.password;
                        var8 = TextureManagerImpl.method346('*', var9.length(), -1303950509);
                        var0.n(var7 + var8, 274, var24, 16777215, 0);
                        var24 += 15;
                    }
                }

                label818:
                {
                    if (10 != Client.connectionState * -214882771) {
                        if (DUMMY <= -576862858) {
                            throw new IllegalStateException();
                        }

                        if (11 != Client.connectionState * -214882771) {
                            break label818;
                        }
                    }

                    Client.fieldV.i(202, 171);
                    if (0 == ClientData.fieldAl * -250617745) {
                        var23 = 251;
                        var0.k(StringConstants.fieldHw, 382, var23, 16776960, 0);
                        var24 = var23 + 30;
                        var25 = 302;
                        var26 = 291;
                        ClientData.fieldI.i(var25 - 73, var26 - 20);
                        var0.f(StringConstants.fieldHc, var25 - 73, var26 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                        var25 = 462;
                        ClientData.fieldI.i(var25 - 73, var26 - 20);
                        var0.f(StringConstants.fieldIl, var25 - 73, var26 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                    } else if (1 == ClientData.fieldAl * -250617745) {
                        if (DUMMY <= -576862858) {
                            return;
                        }

                        var0.k(StringConstants.fieldHe, 382, 211, 16776960, 0);
                        var23 = 236;
                        var0.k(ClientData.fieldAq, 382, var23, 16777215, 0);
                        var24 = var23 + 15;
                        var0.k(ClientData.fieldAm, 382, var24, 16777215, 0);
                        var24 += 15;
                        var0.k(ClientData.fieldAx, 382, var24, 16777215, 0);
                        var24 += 15;
                        var25 = 302;
                        var26 = 321;
                        ClientData.fieldI.i(var25 - 73, var26 - 20);
                        var0.k(StringConstants.fieldW, var25, var26 + 5, 16777215, 0);
                        var25 = 462;
                        ClientData.fieldI.i(var25 - 73, var26 - 20);
                        var0.k(StringConstants.cancel, var25, var26 + 5, 16777215, 0);
                    } else {
                        short var11;
                        StringBuilder var10001;
                        String var44;
                        if (2 == ClientData.fieldAl * -250617745) {
                            var23 = 211;
                            var0.k(ClientData.fieldAq, 382, var23, 16776960, 0);
                            var24 = var23 + 15;
                            var0.k(ClientData.fieldAm, 382, var24, 16776960, 0);
                            var24 += 15;
                            var0.k(ClientData.fieldAx, 382, var24, 16776960, 0);
                            var24 += 15;
                            var24 += 10;
                            var0.n(StringConstants.fieldHa, 272, var24, 16777215, 0);
                            var25 = 200;

                            for (var5 = ClientData.username; var0.b(var5) > var25; var5 = var5.substring(1)) {
                                if (DUMMY <= -576862858) {
                                    throw new IllegalStateException();
                                }
                            }

                            var10001 = (new StringBuilder()).append(classGs.method32(var5));
                            boolean var10002;
                            if (0 == ClientData.fieldAg * 2079314379) {
                                if (DUMMY <= -576862858) {
                                    throw new IllegalStateException();
                                }

                                var10002 = true;
                            } else {
                                var10002 = false;
                            }

                            boolean var10003;
                            if (Client.engineCycle * -1223223371 % 40 < 20) {
                                if (DUMMY <= -576862858) {
                                    throw new IllegalStateException();
                                }

                                var10003 = true;
                            } else {
                                var10003 = false;
                            }

                            if (var10002 & var10003) {
                                if (DUMMY <= -576862858) {
                                    throw new IllegalStateException();
                                }

                                var44 = Buffer.getColorTags(16776960, 258425332) + UtilClass41.fieldI;
                            } else {
                                var44 = "";
                            }

                            var0.n(var10001.append(var44).toString(), 312, var24, 16777215, 0);
                            var24 += 15;
                            var7 = StringConstants.fieldHo;
                            var9 = ClientData.password;
                            var8 = TextureManagerImpl.method346('*', var9.length(), -1303950509);
                            var10001 = (new StringBuilder()).append(var7).append(var8);
                            if (ClientData.fieldAg * 2079314379 == 1) {
                                if (DUMMY <= -576862858) {
                                    throw new IllegalStateException();
                                }

                                var10002 = true;
                            } else {
                                var10002 = false;
                            }

                            if (Client.engineCycle * -1223223371 % 40 < 20) {
                                if (DUMMY <= -576862858) {
                                    return;
                                }

                                var10003 = true;
                            } else {
                                var10003 = false;
                            }

                            if (var10002 & var10003) {
                                if (DUMMY <= -576862858) {
                                    return;
                                }

                                var44 = Buffer.getColorTags(16776960, -2001183345) + UtilClass41.fieldI;
                            } else {
                                var44 = "";
                            }

                            var0.n(var10001.append(var44).toString(), 274, var24, 16777215, 0);
                            var24 += 15;
                            short var10 = 302;
                            var11 = 321;
                            ClientData.fieldI.i(var10 - 73, var11 - 20);
                            var0.k(StringConstants.fieldIf, var10, var11 + 5, 16777215, 0);
                            var10 = 462;
                            ClientData.fieldI.i(var10 - 73, var11 - 20);
                            var0.k(StringConstants.cancel, var10, 5 + var11, 16777215, 0);
                        } else if (4 == ClientData.fieldAl * -250617745) {
                            if (DUMMY <= -576862858) {
                                throw new IllegalStateException();
                            }

                            var0.k(StringConstants.fieldHg, 382, 211, 16776960, 0);
                            var23 = 236;
                            var0.k(ClientData.fieldAq, 382, var23, 16777215, 0);
                            var24 = var23 + 15;
                            var0.k(ClientData.fieldAm, 382, var24, 16777215, 0);
                            var24 += 15;
                            var0.k(ClientData.fieldAx, 382, var24, 16777215, 0);
                            var24 += 15;
                            var5 = StringConstants.fieldHl;
                            var7 = fieldAw;
                            String var6 = TextureManagerImpl.method346('*', var7.length(), -1303950509);
                            var10001 = (new StringBuilder()).append(var5).append(var6);
                            if (Client.engineCycle * -1223223371 % 40 < 20) {
                                if (DUMMY <= -576862858) {
                                    throw new IllegalStateException();
                                }

                                var44 = Buffer.getColorTags(16776960, 666803706) + UtilClass41.fieldI;
                            } else {
                                var44 = "";
                            }

                            var0.n(var10001.append(var44).toString(), 274, var24, 16777215, 0);
                            var24 -= 8;
                            var0.n(StringConstants.fieldE, 373, var24, 16776960, 0);
                            var24 += 15;
                            var0.n(StringConstants.fieldN, 373, var24, 16776960, 0);
                            var34 = 373 + var0.b(StringConstants.fieldN) + 15;
                            var35 = var24 - var0.fieldW;
                            CompressedImage var36;
                            if (ClientData.fieldAo) {
                                if (DUMMY <= -576862858) {
                                    throw new IllegalStateException();
                                }

                                var36 = ClientData.fieldS;
                            } else {
                                var36 = UtilClass5.fieldN;
                            }

                            var36.i(var34, var35);
                            var24 += 15;
                            var11 = 302;
                            short var12 = 321;
                            ClientData.fieldI.i(var11 - 73, var12 - 20);
                            var0.k(StringConstants.fieldW, var11, var12 + 5, 16777215, 0);
                            var11 = 462;
                            ClientData.fieldI.i(var11 - 73, var12 - 20);
                            var0.k(StringConstants.cancel, var11, var12 + 5, 16777215, 0);
                            var1.k(StringConstants.fieldHy, 382, 36 + var12, 255, 0);
                        }
                    }
                }

                if (ClientData.fieldAh * -1215804047 > 0) {
                    if (DUMMY <= -576862858) {
                        throw new IllegalStateException();
                    }

                    var24 = ClientData.fieldAh * -1215804047;
                    var25 = 256;
                    ClientData.fieldAn += -116190080 * var24;
                    if (ClientData.fieldAn * -531311079 > IgnoredPlayer.fieldP.length) {
                        ClientData.fieldAn -= -1343085015 * IgnoredPlayer.fieldP.length;
                        var31 = (int) (Math.random() * 12.0D);
                        RuneScript.method163(ItemTable.fieldB[var31], (byte) 74);
                    }

                    var31 = 0;
                    var24 = 100;
                    var27 = 128 * var24;
                    var32 = 128 * (var25 - var24);

                    for (var34 = 0; var34 < var32; ++var34) {
                        var35 = classJ.fieldZ[var31 + var27] - var24 * IgnoredPlayer.fieldP[ClientData.fieldAn * -531311079 + var31 & IgnoredPlayer.fieldP.length - 1] / 6;
                        if (var35 < 0) {
                            var35 = 0;
                        }

                        classJ.fieldZ[var31++] = var35;
                    }

                    for (var34 = var25 - var24; var34 < var25; ++var34) {
                        var35 = var34 * 128;
                        for (var37 = 0; var37 < 128; ++var37) {
                            var38 = (int) (Math.random() * 100.0D);
                            if (var38 < 50) {
                                if (var37 > 10) {
                                    if (var37 < 118) {
                                        classJ.fieldZ[var35 + var37] = 255;
                                        continue;
                                    }
                                }
                            }
                            classJ.fieldZ[var35 + var37] = 0;
                        }
                    }

                    if (ClientData.fieldG * -215109029 > 0) {
                        if (DUMMY <= -576862858) {
                            throw new IllegalStateException();
                        }

                        ClientData.fieldG -= -825182388 * var24;
                    }

                    if (ClientData.fieldY * 2110475095 > 0) {
                        if (DUMMY <= -576862858) {
                            throw new IllegalStateException();
                        }

                        ClientData.fieldY -= 1691042204 * var24;
                    }

                    if (0 == ClientData.fieldG * -215109029) {
                        if (DUMMY <= -576862858) {
                            throw new IllegalStateException();
                        }

                        if (0 == ClientData.fieldY * 2110475095) {
                            if (DUMMY <= -576862858) {
                                return;
                            }

                            var34 = (int) (Math.random() * (double) (2000 / var24));
                            if (var34 == 0) {
                                if (DUMMY <= -576862858) {
                                    throw new IllegalStateException();
                                }

                                ClientData.fieldG = -793293824;
                            }

                            if (var34 == 1) {
                                ClientData.fieldY = -884892672;
                            }
                        }
                    }

                    for (var34 = 0; var34 < var25 - var24; ++var34) {
                        if (DUMMY <= -576862858) {
                            throw new IllegalStateException();
                        }

                        ClientData.fieldQ[var34] = ClientData.fieldQ[var24 + var34];
                    }

                    for (var34 = var25 - var24; var34 < var25; ++var34) {
                        if (DUMMY <= -576862858) {
                            throw new IllegalStateException();
                        }

                        ClientData.fieldQ[var34] = (int) (Math.sin((double) (ClientData.fieldAr * -512256017) / 14.0D) * 16.0D + Math.sin((double) (ClientData.fieldAr * -512256017) / 15.0D) * 14.0D + Math.sin((double) (ClientData.fieldAr * -512256017) / 16.0D) * 12.0D);
                        ClientData.fieldAr += -1518176497;
                    }

                    ClientData.fieldAs += -1587648019 * var24;
                    var34 = (var24 + (Client.engineCycle * -1223223371 & 1)) / 2;
                    if (var34 > 0) {
                        for (var35 = 0; var35 < ClientData.fieldAs * 1400104308; ++var35) {
                            if (DUMMY <= -576862858) {
                                throw new IllegalStateException();
                            }

                            var37 = (int) (Math.random() * 124.0D) + 2;
                            var38 = (int) (Math.random() * 128.0D) + 128;
                            classJ.fieldZ[(var38 << 7) + var37] = 192;
                        }

                        ClientData.fieldAs = 0;

                        for (var35 = 0; var35 < var25; ++var35) {
                            if (DUMMY <= -576862858) {
                                throw new IllegalStateException();
                            }

                            var37 = 0;
                            var38 = var35 * 128;

                            for (var39 = -var34; var39 < 128; ++var39) {
                                if (var39 + var34 < 128) {
                                    if (DUMMY <= -576862858) {
                                        throw new IllegalStateException();
                                    }

                                    var37 += classJ.fieldZ[var34 + var39 + var38];
                                }

                                if (var39 - (var34 + 1) >= 0) {
                                    if (DUMMY <= -576862858) {
                                        return;
                                    }

                                    var37 -= classJ.fieldZ[var38 + var39 - (1 + var34)];
                                }

                                if (var39 >= 0) {
                                    if (DUMMY <= -576862858) {
                                        return;
                                    }

                                    ClientData.fieldC[var38 + var39] = var37 / (var34 * 2 + 1);
                                }
                            }
                        }

                        for (var35 = 0; var35 < 128; ++var35) {
                            if (DUMMY <= -576862858) {
                                throw new IllegalStateException();
                            }

                            var37 = 0;

                            for (var38 = -var34; var38 < var25; ++var38) {
                                if (DUMMY <= -576862858) {
                                    throw new IllegalStateException();
                                }

                                var39 = 128 * var38;
                                if (var34 + var38 < var25) {
                                    if (DUMMY <= -576862858) {
                                        return;
                                    }

                                    var37 += ClientData.fieldC[var39 + var35 + var34 * 128];
                                }

                                if (var38 - (var34 + 1) >= 0) {
                                    if (DUMMY <= -576862858) {
                                        return;
                                    }

                                    var37 -= ClientData.fieldC[var35 + var39 - 128 * (var34 + 1)];
                                }

                                if (var38 >= 0) {
                                    if (DUMMY <= -576862858) {
                                        throw new IllegalStateException();
                                    }

                                    classJ.fieldZ[var39 + var35] = var37 / (1 + 2 * var34);
                                }
                            }
                        }
                    }

                    ClientData.fieldAh = 0;
                }

                ItemPile.method341((byte) 29);
                if (Projectile.preferences.audioEnabled) {
                    if (DUMMY <= -576862858) {
                        return;
                    }

                    var43 = 1;
                } else {
                    var43 = 0;
                }

                Client.cfieldE[var43].i(725, 463);
                if (Client.connectionState * -214882771 > 5) {
                    if (DUMMY <= -576862858) {
                        throw new IllegalStateException();
                    }

                    if (Client.fieldD * -925892703 == 0) {
                        if (null != UtilClass19.fieldBu) {
                            if (DUMMY <= -576862858) {
                                throw new IllegalStateException();
                            }

                            var3 = 5;
                            var25 = 463;
                            byte var33 = 100;
                            byte var28 = 35;
                            UtilClass19.fieldBu.i(var3, var25);
                            var0.k(StringConstants.fieldFe + " " + Client.currentWorld * -1276662997, var33 / 2 + var3, var28 / 2 + var25 - 2, 16777215, 0);
                            if (classCs.fieldAf != null) {
                                if (DUMMY <= -576862858) {
                                    throw new IllegalStateException();
                                }

                                var1.k(StringConstants.fieldIj, var3 + var33 / 2, var25 + var28 / 2 + 12, 16777215, 0);
                            } else {
                                var1.k(StringConstants.fieldIn, var33 / 2 + var3, 12 + var28 / 2 + var25, 16777215, 0);
                            }
                        } else {
                            UtilClass19.fieldBu = DynamicObject.method137(UtilClass5.fieldBp, "sl_button", "", -218444278);
                        }
                    }
                }

                try {
                    var40 = UtilClass22.canvas.getGraphics();
                    Projectile.fieldPt.v(var40, 0, 0, 1472324248);
                } catch (Exception var21) {
                    UtilClass22.canvas.repaint();
                }

            }
        } catch (RuntimeException var22) {
            throw ClanMate.error(var22, "ai.i(" + ')');
        }
    }

    public static void method392(int var0) {
        try {
            Keyboard var1 = Keyboard.instance;
            synchronized (Keyboard.instance) {
                Keyboard.keyboardIdleTime += -1046296509;
                Keyboard.fieldCx = Keyboard.fieldCl * 1085430023;
                Keyboard.fieldCc = 0;
                int var2;
                if (Keyboard.fieldCk * 274440079 < 0) {
                    for (var2 = 0; var2 < 112; ++var2) {
                        Keyboard.someWeirdSettings[var2] = false;
                    }
                    Keyboard.fieldCk = Keyboard.fieldCp * 812250055;
                } else {
                    while (Keyboard.fieldCp * -246102743 != Keyboard.fieldCk * 274440079) {
                        var2 = Keyboard.fieldCn[Keyboard.fieldCp * -246102743];
                        Keyboard.fieldCp = (1 + Keyboard.fieldCp * -246102743 & 127) * -240933095;
                        if (var2 < 0) {
                            Keyboard.someWeirdSettings[~var2] = false;
                        } else {
                            if (!Keyboard.someWeirdSettings[var2] && Keyboard.fieldCc * -1601902227 < Keyboard.fieldCv.length - 1) {
                                Keyboard.fieldCv[(Keyboard.fieldCc += -1828288411) * -1601902227 - 1] = var2;
                            }
                            Keyboard.someWeirdSettings[var2] = true;
                        }
                    }
                }
                Keyboard.fieldCl = Keyboard.fieldCe * 1072774065;
            }
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "ai.b(" + ')');
        }
    }

    public void v(int var1) {
        try {
            this.l(this.fieldI * -796821659, -601541939);
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "ai.v(" + ')');
        }
    }

    public void i(Buffer var1, int var2, byte var3) {
        try {
            while (true) {
                int var4 = var1.readUByte();
                if (0 == var4) {
                    if (var3 != 0) {
                        throw new IllegalStateException();
                    }

                    return;
                }

                this.b(var1, var4, var2, 1363523583);
            }
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "ai.i(" + ')');
        }
    }

    void l(int var1, int var2) {
        try {
            double var3 = (double) (var1 >> 16 & 255) / 256.0D;
            double var5 = (double) (var1 >> 8 & 255) / 256.0D;
            double var7 = (double) (var1 & 255) / 256.0D;
            double var9 = var3;
            if (var5 < var3) {
                if (var2 <= -2033817908) {
                    throw new IllegalStateException();
                }

                var9 = var5;
            }

            if (var7 < var9) {
                var9 = var7;
            }

            double var11 = var3;
            if (var5 > var3) {
                if (var2 <= -2033817908) {
                    return;
                }

                var11 = var5;
            }

            if (var7 > var11) {
                if (var2 <= -2033817908) {
                    return;
                }

                var11 = var7;
            }

            double var13 = 0.0D;
            double var15 = 0.0D;
            double var17 = (var11 + var9) / 2.0D;
            if (var11 != var9) {
                if (var2 <= -2033817908) {
                    return;
                }

                if (var17 < 0.5D) {
                    if (var2 <= -2033817908) {
                        throw new IllegalStateException();
                    }

                    var15 = (var11 - var9) / (var9 + var11);
                }

                if (var17 >= 0.5D) {
                    var15 = (var11 - var9) / (2.0D - var11 - var9);
                }

                if (var3 == var11) {
                    if (var2 <= -2033817908) {
                        throw new IllegalStateException();
                    }

                    var13 = (var5 - var7) / (var11 - var9);
                } else if (var11 == var5) {
                    var13 = (var7 - var3) / (var11 - var9) + 2.0D;
                } else if (var7 == var11) {
                    if (var2 <= -2033817908) {
                        throw new IllegalStateException();
                    }

                    var13 = 4.0D + (var3 - var5) / (var11 - var9);
                }
            }

            var13 /= 6.0D;
            this.fieldL = -1211276353 * (int) (256.0D * var15);
            this.fieldM = (int) (var17 * 256.0D) * 520084911;
            if (this.fieldL * -401044417 < 0) {
                if (var2 <= -2033817908) {
                    throw new IllegalStateException();
                }

                this.fieldL = 0;
            } else if (this.fieldL * -401044417 > 255) {
                if (var2 <= -2033817908) {
                    throw new IllegalStateException();
                }

                this.fieldL = 362175297;
            }

            if (this.fieldM * -578578097 < 0) {
                if (var2 <= -2033817908) {
                    throw new IllegalStateException();
                }

                this.fieldM = 0;
            } else if (this.fieldM * -578578097 > 255) {
                if (var2 <= -2033817908) {
                    return;
                }

                this.fieldM = -522333871;
            }

            if (var17 > 0.5D) {
                if (var2 <= -2033817908) {
                    throw new IllegalStateException();
                }

                this.fieldW = (int) (var15 * (1.0D - var17) * 512.0D) * 1863209119;
            } else {
                this.fieldW = (int) (512.0D * var15 * var17) * 1863209119;
            }

            if (this.fieldW * 1325321055 < 1) {
                if (var2 <= -2033817908) {
                    throw new IllegalStateException();
                }

                this.fieldW = 1863209119;
            }

            this.fieldB = 895504097 * (int) ((double) (this.fieldW * 1325321055) * var13);
        } catch (RuntimeException var19) {
            throw ClanMate.error(var19, "ai.l(" + ')');
        }
    }

    void b(Buffer var1, int var2, int var3, int var4) {
        try {
            if (var2 == 1) {
                this.fieldI = var1.g(-1031456744) * -293215635;
            }

        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "ai.b(" + ')');
        }
    }

}
