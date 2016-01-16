package com.jagex;

import java.awt.*;

public final class ItemPile {

    int counterHeight;
    int regionX;
    int regionY;
    Renderable topItem;
    Renderable bottomItem;
    Renderable midItem;
    int uid;
    int height;


    static final void method337(Widget widget) {
        try {
            int contentType = widget.contentType * 481950881;
            if (contentType == 324) {
                if (Client.fieldOc * -867061671 == -1) {
                    Client.fieldOc = widget.textureId * -2077405295;
                    Client.fieldOk = widget.enabledTextureId * 360964603; //??
                }
                if (Client.aPlayerConfig.male) {
                    widget.textureId = Client.fieldOc * -517779087;
                } else {
                    widget.textureId = Client.fieldOk * -2143914485;
                }
            } else if (contentType == 325) {
                if (Client.fieldOc * -867061671 == -1) {
                    Client.fieldOc = widget.textureId * -2077405295;
                    Client.fieldOk = widget.enabledTextureId * 360964603;
                }
                if (Client.aPlayerConfig.male) {
                    widget.textureId = Client.fieldOk * -2143914485;
                } else {
                    widget.textureId = Client.fieldOc * -517779087;
                }
            } else if (327 == contentType) {
                widget.fieldAy = 473621438;
                widget.fieldBu = ((int) (Math.sin((double) (Client.engineCycle * -1223223371) / 40.0D) * 256.0D) & 2047) * -1385890543;
                widget.fieldAd = 296716889;
                widget.fieldAu = 0;
            } else if (328 == contentType) {
                widget.fieldAy = 473621438;
                widget.fieldBu = ((int) (Math.sin((double) (Client.engineCycle * -1223223371) / 40.0D) * 256.0D) & 2047) * -1385890543;
                widget.fieldAd = 296716889;
                widget.fieldAu = -858091143;
            }
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "cg.dg(" + ')');
        }
    }

    static final void insertMenuAction(String var0, String var1, int var2, int var3, int var4, int var5) {
        try {
            if (!Client.menuOpen && Client.menuRowCount * 445599935 < 500) {
                Client.menuOptions[Client.menuRowCount * 445599935] = var0;
                Client.menuNouns[Client.menuRowCount * 445599935] = var1;
                Client.menuOpcodes[Client.menuRowCount * 445599935] = var2;
                Client.menuArg0[Client.menuRowCount * 445599935] = var3;
                Client.menuArg1[Client.menuRowCount * 445599935] = var4;
                Client.menuArg2[Client.menuRowCount * 445599935] = var5;
                Client.menuRowCount += 1829510975;
            }
        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "cg.bj(" + ')');
        }
    }

    static final void method339(String var0, boolean var1, int var2) {
        try {
            byte var3 = 4;
            int var4 = 6 + var3;
            int var5 = 6 + var3;
            int var6 = ScriptEvent.font_p12full.m(var0, 250);
            int var7 = ScriptEvent.font_p12full.w(var0, 250) * 13;
            RSGraphics.method235(var4 - var3, var5 - var3, var3 + var3 + var6, var3 + var7 + var3, 0);
            RSGraphics.drawRectangle(var4 - var3, var5 - var3, var3 + var6 + var3, var3 + var3 + var7, 16777215);
            ScriptEvent.font_p12full.f(var0, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
            classCc.method351(var4 - var3, var5 - var3, var6 + var3 + var3, var3 + var7 + var3, 697443259);
            if (var1) {
                if (var2 >= -103937905) {
                    throw new IllegalStateException();
                }

                try {
                    Graphics var8 = UtilClass22.canvas.getGraphics();
                    Projectile.fieldPt.v(var8, 0, 0, 826737303);
                } catch (Exception var9) {
                    UtilClass22.canvas.repaint();
                }
            } else {
                classCs.method303(var4, var5, var6, var7, -931245798);
            }

        } catch (RuntimeException var10) {
            throw ClanMate.error(var10, "cg.aq(" + ')');
        }
    }

    static final void method341(byte var0) {
        try {
            short var1 = 256;
            int var2;
            if (ClientData.fieldG * -215109029 > 0) {
                for (var2 = 0; var2 < 256; ++var2) {
                    if (var0 <= 0) {
                        return;
                    }

                    if (ClientData.fieldG * -215109029 > 768) {
                        if (var0 <= 0) {
                            throw new IllegalStateException();
                        }

                        UtilClass41.fieldT[var2] = com.jagex.MenuItem.method370(BoundaryDecoration.fieldH[var2], classDp.fieldU[var2], 1024 - ClientData.fieldG * -215109029, 2125350841);
                    } else if (ClientData.fieldG * -215109029 > 256) {
                        UtilClass41.fieldT[var2] = classDp.fieldU[var2];
                    } else {
                        UtilClass41.fieldT[var2] = com.jagex.MenuItem.method370(classDp.fieldU[var2], BoundaryDecoration.fieldH[var2], 256 - ClientData.fieldG * -215109029, 1968996674);
                    }
                }
            } else if (ClientData.fieldY * 2110475095 > 0) {
                if (var0 <= 0) {
                    return;
                }

                for (var2 = 0; var2 < 256; ++var2) {
                    if (ClientData.fieldY * 2110475095 > 768) {
                        if (var0 <= 0) {
                            throw new IllegalStateException();
                        }

                        UtilClass41.fieldT[var2] = com.jagex.MenuItem.method370(BoundaryDecoration.fieldH[var2], classBy.fieldJ[var2], 1024 - ClientData.fieldY * 2110475095, 1866260049);
                    } else if (ClientData.fieldY * 2110475095 > 256) {
                        if (var0 <= 0) {
                            throw new IllegalStateException();
                        }

                        UtilClass41.fieldT[var2] = classBy.fieldJ[var2];
                    } else {
                        UtilClass41.fieldT[var2] = com.jagex.MenuItem.method370(classBy.fieldJ[var2], BoundaryDecoration.fieldH[var2], 256 - ClientData.fieldY * 2110475095, 1997775619);
                    }
                }
            } else {
                for (var2 = 0; var2 < 256; ++var2) {
                    UtilClass41.fieldT[var2] = BoundaryDecoration.fieldH[var2];
                }
            }

            RSGraphics.method231(0, 9, 128, 7 + var1);
            UtilClass7.fieldL.s(0, 0);
            RSGraphics.method230();
            var2 = 0;
            int var3 = 6885;

            int var4;
            int var5;
            int var6;
            int var7;
            int var8;
            int var9;
            int var10;
            int var11;
            for (var4 = 1; var4 < var1 - 1; ++var4) {
                if (var0 <= 0) {
                    throw new IllegalStateException();
                }

                var5 = ClientData.fieldQ[var4] * (var1 - var4) / var1;
                var6 = 22 + var5;
                if (var6 < 0) {
                    if (var0 <= 0) {
                        throw new IllegalStateException();
                    }

                    var6 = 0;
                }

                var2 += var6;

                for (var7 = var6; var7 < 128; ++var7) {
                    if (var0 <= 0) {
                        throw new IllegalStateException();
                    }

                    var8 = classJ.fieldZ[var2++];
                    if (var8 != 0) {
                        if (var0 <= 0) {
                            throw new IllegalStateException();
                        }

                        var9 = var8;
                        var10 = 256 - var8;
                        var8 = UtilClass41.fieldT[var8];
                        var11 = Projectile.fieldPt.fieldI[var3];
                        Projectile.fieldPt.fieldI[var3++] = (var9 * (var8 & 16711935) + var10 * (var11 & 16711935) & -16711936) + (var10 * (var11 & '\uff00') + (var8 & '\uff00') * var9 & 16711680) >> 8;
                    } else {
                        ++var3;
                    }
                }

                var3 += var6 + 765 - 128;
            }

            RSGraphics.method231(637, 9, 765, var1 + 7);
            ClientData.fieldM.s(382, 0);
            RSGraphics.method230();
            var2 = 0;
            var3 = 7546;

            for (var4 = 1; var4 < var1 - 1; ++var4) {
                if (var0 <= 0) {
                    throw new IllegalStateException();
                }

                var5 = ClientData.fieldQ[var4] * (var1 - var4) / var1;
                var6 = 103 - var5;
                var3 += var5;

                for (var7 = 0; var7 < var6; ++var7) {
                    if (var0 <= 0) {
                        throw new IllegalStateException();
                    }

                    var8 = classJ.fieldZ[var2++];
                    if (var8 != 0) {
                        if (var0 <= 0) {
                            throw new IllegalStateException();
                        }

                        var9 = var8;
                        var10 = 256 - var8;
                        var8 = UtilClass41.fieldT[var8];
                        var11 = Projectile.fieldPt.fieldI[var3];
                        Projectile.fieldPt.fieldI[var3++] = (var10 * (var11 & '\uff00') + var9 * (var8 & '\uff00') & 16711680) + ((var11 & 16711935) * var10 + var9 * (var8 & 16711935) & -16711936) >> 8;
                    } else {
                        ++var3;
                    }
                }

                var2 += 128 - var6;
                var3 += 765 - var6 - var5;
            }

        } catch (RuntimeException var12) {
            throw ClanMate.error(var12, "cg.w(" + ')');
        }
    }

    public static CompressedImage method342() {
        try {
            CompressedImage var1 = new CompressedImage();
            var1.fieldW = UtilClass2.fieldV * 1527976215;
            var1.fieldE = UtilClass1.fieldI * -517911549;
            var1.fieldL = IgnoredPlayer.fieldB[0];
            var1.fieldM = ExchangeOfferPriceComparator.fieldL[0];
            var1.fieldI = ExchangeOfferQuantityComparator.fieldM[0];
            var1.fieldB = UtilClass1.fieldW[0];
            var1.fieldV = UtilClass1.fieldE;
            var1.fieldA = classEp.fieldN[0];
            classAo.method399(-1660842325);
            return var1;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "cg.s(" + ')');
        }
    }

    static int method343() {
        try {
            return (UtilClass40.fieldB += 1593234307) * 360534827 - 1;
        } catch (RuntimeException var1) {
            throw ClanMate.error(var1, "cg.a(" + ')');
        }
    }
}
