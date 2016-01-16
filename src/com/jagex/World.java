package com.jagex;

public class World {

    static int[][] fieldN;
    int fieldV;
    int fieldW;
    String fieldB;
    String fieldL;
    int fieldM;
    int fieldA;
    int fieldI;

    static String method179(String var0, boolean var1, int var2) {
        try {
            String var10000;
            if (var1) {
                if (var2 >= -551081472) {
                    throw new IllegalStateException();
                }

                var10000 = "https://";
            } else {
                var10000 = "http://";
            }

            String var3 = var10000;
            if (1 == Client.fieldE * -135999197) {
                if (var2 >= -551081472) {
                    throw new IllegalStateException();
                }

                var0 = var0 + "-wtrc";
            } else if (Client.fieldE * -135999197 == 2) {
                if (var2 >= -551081472) {
                    throw new IllegalStateException();
                }

                var0 = var0 + "-wtqa";
            } else if (Client.fieldE * -135999197 == 3) {
                if (var2 >= -551081472) {
                    throw new IllegalStateException();
                }

                var0 = var0 + "-wtwip";
            } else if (5 == Client.fieldE * -135999197) {
                if (var2 >= -551081472) {
                    throw new IllegalStateException();
                }

                var0 = var0 + "-wti";
            } else if (Client.fieldE * -135999197 == 4) {
                var0 = "local";
            }

            String var4 = "";
            if (null != classCf.fieldQ) {
                if (var2 >= -551081472) {
                    throw new IllegalStateException();
                }

                var4 = "/p=" + classCf.fieldQ;
            }

            String var5 = "runescape.com";
            return var3 + var0 + "." + var5 + "/l=" + Client.fieldD * -925892703 + "/a=" + UtilClass7.fieldT * -806740623 + var4 + "/";
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "p.dn(" + ')');
        }
    }

    public static int method180(String var0, int var1) {
        try {
            return var0.length() + 1;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "p.m(" + ')');
        }
    }

    static final void method181() {
        try {
            Client.fieldCo.writePacketHeader(25, (byte) 0);
            for (WidgetNode var1 = (WidgetNode) Client.widgetNodes.first(); null != var1; var1 = (WidgetNode) Client.widgetNodes.next()) {
                if (var1.state * -1886991873 != 0 && var1.state * -1886991873 != 3) {
                    continue;
                }
                WidgetNode.method189(var1, true);
            }
            if (null != Client.fieldJy) {
                classBx.method250(Client.fieldJy, 57574739);
                Client.fieldJy = null;
            }
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "p.dd(" + ')');
        }
    }

    static void method182(int var0) {
        try {
            JagexAccessFile var1 = null;

            try {
                var1 = ItemDefinition.getAccessFile("", Client.fieldN.privateName, true, -1695321363);
                Buffer var2 = Projectile.preferences.write(-1687097855);
                var1.v(var2.payload, 0, var2.caret * 651432265, 712333399);
            } catch (Exception var4) {
                ;
            }

            try {
                if (null != var1) {
                    if (var0 == -1532149812) {
                        throw new IllegalStateException();
                    }

                    var1.i((byte) -102);
                }
            } catch (Exception var3) {
                ;
            }

        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "p.i(" + ')');
        }
    }

    boolean a(int var1) {
        try {
            boolean var10000;
            if ((1 & this.fieldV * 1018509727) != 0) {
                if (var1 >= 1803334296) {
                    throw new IllegalStateException();
                }

                var10000 = true;
            } else {
                var10000 = false;
            }

            return var10000;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "p.a(" + ')');
        }
    }

    boolean v(byte var1) {
        try {
            boolean var10000;
            if (0 != (4 & this.fieldV * 1018509727)) {
                if (var1 <= 82) {
                    throw new IllegalStateException();
                }

                var10000 = true;
            } else {
                var10000 = false;
            }

            return var10000;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "p.v(" + ')');
        }
    }
}
