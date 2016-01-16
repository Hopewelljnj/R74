package com.jagex;

public class UtilClass41 {

    static int[] fieldT;
    static String fieldI = "|";
    static String openParanthesis = " (";
    static String closeParanthesis = ")";
    static String fieldW = "<br>";
    static String fieldE = "</col>";
    static int fieldIs;
    static String fieldV = ",";
    static String fieldA = "true";
    static String fieldM = "->";
    static int[] fieldEk;
    static int selectedItemIndex;


    UtilClass41() throws Throwable {
        throw new Error();
    }

    static final void method157(String var0, int var1) {
        try {
            if (var0.equalsIgnoreCase("toggleroof")) {
                if (var1 <= -1672630959) {
                    return;
                }

                boolean var10001;
                if (!Projectile.preferences.roofsEnabled) {
                    var10001 = true;
                } else {
                    var10001 = false;
                }

                Projectile.preferences.roofsEnabled = var10001;
                World.method182(-549722749);
                if (Projectile.preferences.roofsEnabled) {
                    JagSocket.addMessage(99, "", "Roofs are now all hidden", (byte) 16);
                } else {
                    JagSocket.addMessage(99, "", "Roofs will only be removed selectively", (byte) 16);
                }
            }

            if (Client.playerRights * -1572330347 >= 2) {
                if (var0.equalsIgnoreCase("fpson")) {
                    Client.fpsOn = true;
                }

                if (var0.equalsIgnoreCase("fpsoff")) {
                    Client.fpsOn = false;
                }

                if (var0.equalsIgnoreCase("gc")) {
                    System.gc();
                }

                if (var0.equalsIgnoreCase("clientdrop")) {
                    if (Client.socketRelatedInt * 339818837 > 0) {
                        classEp.method184((byte) -108);
                    } else {
                        UnknownEnum.method373(40, (byte) -127);
                        Varp.fieldCf = Client.socket;
                        Client.socket = null;
                    }
                }

                if (var0.equalsIgnoreCase("errortest") && 2 == Client.fieldE * -135999197) {
                    throw new RuntimeException();
                }
            }

            Client.fieldCo.writePacketHeader(107, (byte) 0);
            Client.fieldCo.writeByte(var0.length() + 1);
            Client.fieldCo.w(var0, (byte) 0);
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "v.as(" + ')');
        }
    }

    static final void method158(int var0, int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
        try {
            if (!Widget.loadWidget(var0, 477596194)) {
                if (var7 >= 1) {
                    throw new IllegalStateException();
                }
            } else {
                Boundary.handleEvents(Widget.widgets[var0], -1, var1, var2, var3, var4, var5, var6, (byte) 42);
            }
        } catch (RuntimeException var8) {
            throw ClanMate.error(var8, "v.cg(" + ')');
        }
    }

    static final void method159(int var0) {
        try {
            int var1;
            int var2;
            for (var1 = -1; var1 < Client.playerCount * 16022533; ++var1) {
                if (var0 <= 640131428) {
                    throw new IllegalStateException();
                }

                if (var1 == -1) {
                    if (var0 <= 640131428) {
                        throw new IllegalStateException();
                    }

                    var2 = 2047;
                } else {
                    var2 = Client.playerIndicies[var1];
                }

                Player var3 = Client.players[var2];
                if (null != var3) {
                    if (var0 <= 640131428) {
                        return;
                    }

                    if (var3.fieldAz * -1478694783 > 0) {
                        if (var0 <= 640131428) {
                            return;
                        }

                        var3.fieldAz -= -919906431;
                        if (0 == var3.fieldAz * -1478694783) {
                            if (var0 <= 640131428) {
                                throw new IllegalStateException();
                            }

                            var3.overheadText = null;
                        }
                    }
                }
            }

            for (var1 = 0; var1 < Client.npcCount * 1825497683; ++var1) {
                if (var0 <= 640131428) {
                    throw new IllegalStateException();
                }

                var2 = Client.npcIndices[var1];
                Npc var5 = Client.npcs[var2];
                if (null != var5) {
                    if (var0 <= 640131428) {
                        throw new IllegalStateException();
                    }

                    if (var5.fieldAz * -1478694783 > 0) {
                        if (var0 <= 640131428) {
                            throw new IllegalStateException();
                        }

                        var5.fieldAz -= -919906431;
                        if (var5.fieldAz * -1478694783 == 0) {
                            if (var0 <= 640131428) {
                                throw new IllegalStateException();
                            }

                            var5.overheadText = null;
                        }
                    }
                }
            }

        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "v.an(" + ')');
        }
    }

    public static void method160(int var0) {
        try {
            Varp.fieldI.clear();
        } catch (RuntimeException var1) {
            throw ClanMate.error(var1, "v.b(" + ')');
        }
    }

}
