package com.jagex;

import java.lang.*;

public class WidgetStrings extends DualNode {

    public static ReferenceTable fieldA;
    static Cache fieldV = new Cache(64);
    static classGm fieldK;
    static int fieldIf;
    public int fieldM;
    public char fieldI;
    public char fieldB;
    public String fieldL = "null";
    public String[] fieldS;
    public int fieldW = 0;
    public int[] fieldN;
    public int[] fieldE;

    static Sprite[] method407(int var0) {
        try {
            Sprite[] var1 = new Sprite[UtilClass18.fieldA * -678527857];
            for (int var2 = 0; var2 < UtilClass18.fieldA * -678527857; ++var2) {
                Sprite var3 = var1[var2] = new Sprite();
                var3.fieldM = UtilClass2.fieldV * 1527976215;
                var3.fieldW = UtilClass1.fieldI * -517911549;
                var3.fieldB = IgnoredPlayer.fieldB[var2];
                var3.fieldL = ExchangeOfferPriceComparator.fieldL[var2];
                var3.width = ExchangeOfferQuantityComparator.fieldM[var2];
                var3.height = UtilClass1.fieldW[var2];
                int var4 = var3.height * var3.width;
                byte[] var5 = classEp.fieldN[var2];
                var3.pixels = new int[var4];
                for (int var6 = 0; var6 < var4; ++var6) {
                    var3.pixels[var6] = UtilClass1.fieldE[var5[var6] & 255];
                }
            }
            classAo.method399(-1369562929);
            return var1;
        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "ad.k(" + ')');
        }
    }

    static void method408(byte var0) {
        try {
            for (int var1 = 0; var1 < Client.menuRowCount * 445599935; ++var1) {
                if (var0 == 0) {
                    throw new IllegalStateException();
                }

                if (ReferenceTableSub.method106(Client.menuOpcodes[var1], (byte) 1)) {
                    if (var0 == 0) {
                        throw new IllegalStateException();
                    }

                    if (var1 < Client.menuRowCount * 445599935 - 1) {
                        if (var0 == 0) {
                            return;
                        }

                        for (int var2 = var1; var2 < Client.menuRowCount * 445599935 - 1; ++var2) {
                            if (var0 == 0) {
                                return;
                            }

                            Client.menuOptions[var2] = Client.menuOptions[var2 + 1];
                            Client.menuNouns[var2] = Client.menuNouns[1 + var2];
                            Client.menuOpcodes[var2] = Client.menuOpcodes[var2 + 1];
                            Client.menuArg0[var2] = Client.menuArg0[var2 + 1];
                            Client.menuArg1[var2] = Client.menuArg1[var2 + 1];
                            Client.menuArg2[var2] = Client.menuArg2[1 + var2];
                        }
                    }

                    Client.menuRowCount -= 1829510975;
                }
            }

        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "ad.by(" + ')');
        }
    }

    static final void method409(int var0, int var1, int var2, int var3, int var4) {
        try {
            Client.fieldFn = 0;
            boolean var5 = false;
            int var6 = -1;

            int var7;
            for (var7 = -1; var7 < Client.playerCount * 16022533 + Client.npcCount * 1825497683; ++var7) {
                if (var4 >= 1407270603) {
                    throw new IllegalStateException();
                }

                Object var8;
                if (var7 == -1) {
                    if (var4 >= 1407270603) {
                        throw new IllegalStateException();
                    }

                    var8 = Client.myPlayer;
                } else if (var7 < Client.playerCount * 16022533) {
                    if (var4 >= 1407270603) {
                        throw new IllegalStateException();
                    }

                    var8 = Client.players[Client.playerIndicies[var7]];
                    if (Client.fieldHy * -1480489931 == Client.playerIndicies[var7]) {
                        var5 = true;
                        var6 = var7;
                        continue;
                    }
                } else {
                    var8 = Client.npcs[Client.npcIndices[var7 - Client.playerCount * 16022533]];
                }

                classCc.method349((Character) var8, var7, var0, var1, var2, var3, -1443094452);
            }

            if (var5) {
                if (var4 >= 1407270603) {
                    return;
                }

                classCc.method349(Client.players[Client.fieldHy * -1480489931], var6, var0, var1, var2, var3, 546305818);
            }

            for (var7 = 0; var7 < Client.fieldFn * 275036173; ++var7) {
                int var18 = Client.fieldFh[var7];
                int var9 = Client.fieldFi[var7];
                int var10 = Client.fieldFg[var7];
                int var11 = Client.fieldFs[var7];
                boolean var12 = true;

                while (var12) {
                    if (var4 >= 1407270603) {
                        throw new IllegalStateException();
                    }

                    var12 = false;

                    for (int var13 = 0; var13 < var7; ++var13) {
                        if (var4 >= 1407270603) {
                            throw new IllegalStateException();
                        }

                        if (var9 + 2 > Client.fieldFi[var13] - Client.fieldFs[var13]) {
                            if (var4 >= 1407270603) {
                                throw new IllegalStateException();
                            }

                            if (var9 - var11 < 2 + Client.fieldFi[var13]) {
                                if (var4 >= 1407270603) {
                                    throw new IllegalStateException();
                                }

                                if (var18 - var10 < Client.fieldFh[var13] + Client.fieldFg[var13]) {
                                    if (var4 >= 1407270603) {
                                        return;
                                    }

                                    if (var18 + var10 > Client.fieldFh[var13] - Client.fieldFg[var13]) {
                                        if (var4 >= 1407270603) {
                                            return;
                                        }

                                        if (Client.fieldFi[var13] - Client.fieldFs[var13] < var9) {
                                            if (var4 >= 1407270603) {
                                                throw new IllegalStateException();
                                            }

                                            var9 = Client.fieldFi[var13] - Client.fieldFs[var13];
                                            var12 = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                Client.fieldGk = -741472749 * Client.fieldFh[var7];
                Client.fieldGj = (Client.fieldFi[var7] = var9) * -249630405;
                String var19 = Client.fieldGo[var7];
                if (Client.fieldJg * -1735544961 == 0) {
                    if (var4 >= 1407270603) {
                        throw new IllegalStateException();
                    }

                    int var14 = 16776960;
                    if (Client.fieldGd[var7] < 6) {
                        if (var4 >= 1407270603) {
                            throw new IllegalStateException();
                        }

                        var14 = Client.fieldLe[Client.fieldGd[var7]];
                    }

                    int var10000;
                    if (Client.fieldGd[var7] == 6) {
                        if (Client.fieldGf * 1276134057 % 20 < 10) {
                            if (var4 >= 1407270603) {
                                throw new IllegalStateException();
                            }

                            var10000 = 16711680;
                        } else {
                            var10000 = 16776960;
                        }

                        var14 = var10000;
                    }

                    if (7 == Client.fieldGd[var7]) {
                        if (var4 >= 1407270603) {
                            throw new IllegalStateException();
                        }

                        var14 = Client.fieldGf * 1276134057 % 20 < 10 ? 255 : '\uffff';
                    }

                    if (Client.fieldGd[var7] == 8) {
                        if (var4 >= 1407270603) {
                            return;
                        }

                        if (Client.fieldGf * 1276134057 % 20 < 10) {
                            if (var4 >= 1407270603) {
                                throw new IllegalStateException();
                            }

                            var10000 = '\ub000';
                        } else {
                            var10000 = 8454016;
                        }

                        var14 = var10000;
                    }

                    int var15;
                    if (9 == Client.fieldGd[var7]) {
                        if (var4 >= 1407270603) {
                            return;
                        }

                        var15 = 150 - Client.fieldGp[var7];
                        if (var15 < 50) {
                            if (var4 >= 1407270603) {
                                throw new IllegalStateException();
                            }

                            var14 = 16711680 + var15 * 1280;
                        } else if (var15 < 100) {
                            var14 = 16776960 - (var15 - 50) * 327680;
                        } else if (var15 < 150) {
                            if (var4 >= 1407270603) {
                                throw new IllegalStateException();
                            }

                            var14 = '\uff00' + 5 * (var15 - 100);
                        }
                    }

                    if (10 == Client.fieldGd[var7]) {
                        if (var4 >= 1407270603) {
                            throw new IllegalStateException();
                        }

                        var15 = 150 - Client.fieldGp[var7];
                        if (var15 < 50) {
                            if (var4 >= 1407270603) {
                                throw new IllegalStateException();
                            }

                            var14 = 16711680 + var15 * 5;
                        } else if (var15 < 100) {
                            if (var4 >= 1407270603) {
                                throw new IllegalStateException();
                            }

                            var14 = 16711935 - 327680 * (var15 - 50);
                        } else if (var15 < 150) {
                            if (var4 >= 1407270603) {
                                throw new IllegalStateException();
                            }

                            var14 = 255 + (var15 - 100) * 327680 - 5 * (var15 - 100);
                        }
                    }

                    if (Client.fieldGd[var7] == 11) {
                        if (var4 >= 1407270603) {
                            throw new IllegalStateException();
                        }

                        var15 = 150 - Client.fieldGp[var7];
                        if (var15 < 50) {
                            if (var4 >= 1407270603) {
                                throw new IllegalStateException();
                            }

                            var14 = 16777215 - 327685 * var15;
                        } else if (var15 < 100) {
                            if (var4 >= 1407270603) {
                                throw new IllegalStateException();
                            }

                            var14 = '\uff00' + (var15 - 50) * 327685;
                        } else if (var15 < 150) {
                            if (var4 >= 1407270603) {
                                throw new IllegalStateException();
                            }

                            var14 = 16777215 - (var15 - 100) * 327680;
                        }
                    }

                    if (Client.fieldGa[var7] == 0) {
                        if (var4 >= 1407270603) {
                            throw new IllegalStateException();
                        }

                        MenuItem.font_b12full.k(var19, Client.fieldGk * -1627343845 + var0, Client.fieldGj * 43171827 + var1, var14, 0);
                    }

                    if (Client.fieldGa[var7] == 1) {
                        MenuItem.font_b12full.d(var19, var0 + Client.fieldGk * -1627343845, Client.fieldGj * 43171827 + var1, var14, 0, Client.fieldGf * 1276134057);
                    }

                    if (Client.fieldGa[var7] == 2) {
                        MenuItem.font_b12full.x(var19, Client.fieldGk * -1627343845 + var0, var1 + Client.fieldGj * 43171827, var14, 0, Client.fieldGf * 1276134057);
                    }

                    if (3 == Client.fieldGa[var7]) {
                        MenuItem.font_b12full.o(var19, Client.fieldGk * -1627343845 + var0, Client.fieldGj * 43171827 + var1, var14, 0, Client.fieldGf * 1276134057, 150 - Client.fieldGp[var7]);
                    }

                    if (4 == Client.fieldGa[var7]) {
                        var15 = (150 - Client.fieldGp[var7]) * (MenuItem.font_b12full.b(var19) + 100) / 150;
                        RSGraphics.method232(var0 + Client.fieldGk * -1627343845 - 50, var1, var0 + Client.fieldGk * -1627343845 + 50, var3 + var1);
                        MenuItem.font_b12full.n(var19, 50 + var0 + Client.fieldGk * -1627343845 - var15, Client.fieldGj * 43171827 + var1, var14, 0);
                        RSGraphics.method231(var0, var1, var0 + var2, var3 + var1);
                    }

                    if (Client.fieldGa[var7] == 5) {
                        var15 = 150 - Client.fieldGp[var7];
                        int var16 = 0;
                        if (var15 < 25) {
                            var16 = var15 - 25;
                        } else if (var15 > 125) {
                            if (var4 >= 1407270603) {
                                throw new IllegalStateException();
                            }

                            var16 = var15 - 125;
                        }

                        RSGraphics.method232(var0, Client.fieldGj * 43171827 + var1 - MenuItem.font_b12full.fieldW - 1, var2 + var0, 5 + var1 + Client.fieldGj * 43171827);
                        MenuItem.font_b12full.k(var19, Client.fieldGk * -1627343845 + var0, var16 + Client.fieldGj * 43171827 + var1, var14, 0);
                        RSGraphics.method231(var0, var1, var2 + var0, var1 + var3);
                    }
                } else {
                    MenuItem.font_b12full.k(var19, Client.fieldGk * -1627343845 + var0, var1 + Client.fieldGj * 43171827, 16776960, 0);
                }
            }

        } catch (RuntimeException var17) {
            throw ClanMate.error(var17, "ad.aa(" + ')');
        }
    }

    void v(Buffer var1, int var2) {
        try {
            while (true) {
                int var3 = var1.readUByte();
                if (0 == var3) {
                    return;
                }

                this.i(var1, var3, 324860113);
            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "ad.v(" + ')');
        }
    }

    void i(Buffer var1, int var2, int var3) {
        try {
            if (var2 == 1) {
                this.fieldI = (char) var1.readUByte();
            } else if (2 == var2) {
                this.fieldB = (char) var1.readUByte();
            } else if (var2 == 3) {
                this.fieldL = var1.readString(820775486);
            } else if (4 == var2) {
                this.fieldM = var1.readInt((byte) 109) * -1396181025;
            } else {
                int var4;
                if (var2 == 5) {
                    this.fieldW = var1.readUShort() * -475955927;
                    this.fieldE = new int[this.fieldW * 1762029337];
                    this.fieldS = new String[this.fieldW * 1762029337];
                    for (var4 = 0; var4 < this.fieldW * 1762029337; ++var4) {
                        this.fieldE[var4] = var1.readInt((byte) 13);
                        this.fieldS[var4] = var1.readString(1707531065);
                    }
                } else if (var2 == 6) {
                    this.fieldW = var1.readUShort() * -475955927;
                    this.fieldE = new int[this.fieldW * 1762029337];
                    this.fieldN = new int[this.fieldW * 1762029337];
                    for (var4 = 0; var4 < this.fieldW * 1762029337; ++var4) {
                        this.fieldE[var4] = var1.readInt((byte) 0);
                        this.fieldN[var4] = var1.readInt((byte) -16);
                    }
                }
            }

        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "ad.i(" + ')');
        }
    }
}
