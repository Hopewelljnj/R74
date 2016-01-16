package com.jagex;

import java.util.Calendar;

public class UtilClass0 {

    static final String[] fieldX = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    static Calendar fieldD = Calendar.getInstance();
    static String[] stringStack;
    static int[] fieldL = new int[5];
    static int[][] fieldM = new int[5][5000];
    static int[] intstack = new int[1000];
    static int[] intStack;
    static int fieldN = 0;
    static ScriptStackElement[] scriptstackelement = new ScriptStackElement[50];
    static String[] stringstack = new String[1000];
    static Task fieldAt;


    UtilClass0() throws Throwable {
        throw new Error();
    }

    public static void method388(int var0) {
        try {
            classAo.fieldV.clear();
        } catch (RuntimeException var1) {
            throw ClanMate.error(var1, "al.l(" + ')');
        }
    }

    public static final Sprite getItemSprite(int itemId, int quantity, int borderThickness, int var3, int var4, boolean noted, int var6) {
        try {
            if (quantity == -1) {
                var4 = 0;
            } else if (2 == var4 && 1 != quantity) {
                var4 = 1;
            }
            long hash = ((long) var3 << 42) + (long) itemId + ((long) quantity << 16) + ((long) borderThickness << 38) + ((long) var4 << 40);
            Sprite sprite;
            if (!noted) {
                sprite = (Sprite) ItemDefinition.spriteCache.get(hash);
                if (null != sprite) {
                    return sprite;
                }
            }

            ItemDefinition var10 = Client.getItemDefinition(itemId, -1698058264);
            if (quantity > 1 && null != var10.fieldAo) {
                int var11 = -1;
                for (int var12 = 0; var12 < 10; ++var12) {
                    if (quantity >= var10.fieldAg[var12] && var10.fieldAg[var12] != 0) {
                        var11 = var10.fieldAo[var12];
                    }
                }

                if (-1 != var11) {
                    var10 = Client.getItemDefinition(var11, -664328297);
                }
            }

            Model var21 = var10.e(1, 2037340464);
            if (var21 == null) {
                return null;
            } else {
                Sprite var22 = null;
                if (var10.fieldAu * -1133001085 != -1) {
                    var22 = getItemSprite(var10.fieldAd * -349199001, 10, 1, 0, 0, true, -1528999135);
                    if (var22 == null) {
                        return null;
                    }
                }

                int[] var13 = RSGraphics.fieldD;
                int var14 = RSGraphics.fieldX;
                int var15 = RSGraphics.fieldO;
                int[] var16 = new int[4];
                RSGraphics.method233(var16);
                sprite = new Sprite(36, 32);
                RSGraphics.method229(sprite.pixels, 36, 32);
                RSGraphics.method244();
                RSGraphics2D.method309();
                RSGraphics2D.method323(16, 16);
                RSGraphics2D.fieldB = false;
                int var17 = var10.fieldU * -1373167125;
                if (noted) {
                    var17 = (int) ((double) var17 * 1.5D);
                } else if (borderThickness == 2) {
                    var17 = (int) ((double) var17 * 1.04D);
                }

                int var18 = var17 * RSGraphics2D.SIN_TABLE[var10.fieldJ * -1189275871] >> 16;
                int var19 = RSGraphics2D.COS_TABLE[var10.fieldJ * -1189275871] * var17 >> 16;
                var21.m();
                var21.u(
                        0,
                        var10.fieldG * 592569827,
                        var10.fieldY * 1814623209,
                        var10.fieldJ * -1189275871,
                        var10.fieldP * -2015029361,
                        var21.modelHeight * 1802750145 / 2 + var18 + var10.fieldR * 1117986731,
                        var10.fieldR * 1117986731 + var19);
                if (borderThickness >= 1) {
                    sprite.e(1);
                }

                if (borderThickness >= 2) {
                    sprite.e(16777215);
                }

                if (var3 != 0) {
                    sprite.n(var3);
                }

                RSGraphics.method229(sprite.pixels, 36, 32);
                if (var10.fieldAu * -1133001085 != -1) {
                    var22.f(0, 0);
                }

                label178:
                {
                    if (1 != var4 && (2 != var4 || 1 != var10.stackable * 1977514217)) {
                        break label178;
                    }
                    WidgetStrings.fieldK.n(Packet.formatItemQuantityColor(quantity, -1446036158), 0, 9, 16776960, 1);
                }

                if (!noted) {
                    ItemDefinition.spriteCache.put(sprite, hash);
                }

                RSGraphics.method229(var13, var14, var15);
                RSGraphics.method242(var16);
                RSGraphics2D.method309();
                RSGraphics2D.fieldB = true;
                return sprite;
            }
        } catch (RuntimeException var20) {
            throw ClanMate.error(var20, "al.s(" + ')');
        }
    }

    public static void method390(byte[] var0, int var1) {
        try {
            Buffer var2 = new Buffer(var0);
            var2.caret = -99503879 * (var0.length - 2);
            UtilClass18.fieldA = var2.readUShort() * -385670545;
            IgnoredPlayer.fieldB = new int[UtilClass18.fieldA * -678527857];
            ExchangeOfferPriceComparator.fieldL = new int[UtilClass18.fieldA * -678527857];
            ExchangeOfferQuantityComparator.fieldM = new int[UtilClass18.fieldA * -678527857];
            UtilClass1.fieldW = new int[UtilClass18.fieldA * -678527857];
            classEp.fieldN = new byte[UtilClass18.fieldA * -678527857][];
            var2.caret = (var0.length - 7 - UtilClass18.fieldA * -1133255560) * -99503879;
            UtilClass2.fieldV = var2.readUShort() * 1037252263;
            UtilClass1.fieldI = var2.readUShort() * -2100773205;
            int var3 = (var2.readUByte() & 255) + 1;

            int var4;
            for (var4 = 0; var4 < UtilClass18.fieldA * -678527857; ++var4) {
                if (var1 <= 1338527427) {
                    return;
                }

                IgnoredPlayer.fieldB[var4] = var2.readUShort();
            }

            for (var4 = 0; var4 < UtilClass18.fieldA * -678527857; ++var4) {
                ExchangeOfferPriceComparator.fieldL[var4] = var2.readUShort();
            }

            for (var4 = 0; var4 < UtilClass18.fieldA * -678527857; ++var4) {
                if (var1 <= 1338527427) {
                    return;
                }

                ExchangeOfferQuantityComparator.fieldM[var4] = var2.readUShort();
            }

            for (var4 = 0; var4 < UtilClass18.fieldA * -678527857; ++var4) {
                if (var1 <= 1338527427) {
                    throw new IllegalStateException();
                }

                UtilClass1.fieldW[var4] = var2.readUShort();
            }

            var2.caret = (var0.length - 7 - UtilClass18.fieldA * -1133255560 - (var3 - 1) * 3) * -99503879;
            UtilClass1.fieldE = new int[var3];

            for (var4 = 1; var4 < var3; ++var4) {
                if (var1 <= 1338527427) {
                    return;
                }

                UtilClass1.fieldE[var4] = var2.g(-973471276);
                if (0 == UtilClass1.fieldE[var4]) {
                    if (var1 <= 1338527427) {
                        throw new IllegalStateException();
                    }

                    UtilClass1.fieldE[var4] = 1;
                }
            }

            var2.caret = 0;

            for (var4 = 0; var4 < UtilClass18.fieldA * -678527857; ++var4) {
                if (var1 <= 1338527427) {
                    throw new IllegalStateException();
                }

                int var5 = ExchangeOfferQuantityComparator.fieldM[var4];
                int var6 = UtilClass1.fieldW[var4];
                int var7 = var5 * var6;
                byte[] var8 = new byte[var7];
                classEp.fieldN[var4] = var8;
                int var9 = var2.readUByte();
                int var10;
                if (var9 == 0) {
                    for (var10 = 0; var10 < var7; ++var10) {
                        if (var1 <= 1338527427) {
                            throw new IllegalStateException();
                        }

                        var8[var10] = var2.readByte();
                    }
                } else if (1 == var9) {
                    if (var1 <= 1338527427) {
                        throw new IllegalStateException();
                    }

                    for (var10 = 0; var10 < var5; ++var10) {
                        if (var1 <= 1338527427) {
                            throw new IllegalStateException();
                        }

                        for (int var11 = 0; var11 < var6; ++var11) {
                            var8[var10 + var11 * var5] = var2.readByte();
                        }
                    }
                }
            }

        } catch (RuntimeException var12) {
            throw ClanMate.error(var12, "al.d(" + ')');
        }
    }
}
