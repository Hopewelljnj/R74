package com.jagex;

import java.applet.Applet;

public class ScriptEvent extends Node {

    static classGm font_p12full;
    Widget fieldW;
    boolean fieldV;
    int mouseX;
    int mouseY;
    Object[] args;
    String fieldS;
    int fieldE;
    int fieldN;
    Widget src;
    int fieldM;


    static final int method107(int var0, int var1, int var2) {
        try {
            int var3 = Player.method143(var0 + '\ub135', 91923 + var1, 4, (byte) 24) - 128 + (Player.method143(var0 + 10294, var1 + '\u93bd', 2, (byte) 24) - 128 >> 1) + (Player.method143(var0, var1, 1, (byte) 24) - 128 >> 2);
            var3 = (int) ((double) var3 * 0.3D) + 35;
            if (var3 < 10) {
                var3 = 10;
            } else if (var3 > 60) {
                if (var2 != -2083936259) {
                    throw new IllegalStateException();
                }

                var3 = 60;
            }

            return var3;
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "a.n(" + ')');
        }
    }

    static final int method108(int var0, int var1, int var2) {
        try {
            int var3 = var0 + 57 * var1;
            var3 ^= var3 << 13;
            int var4 = 1376312589 + (789221 + 15731 * var3 * var3) * var3 & Integer.MAX_VALUE;
            return var4 >> 19 & 255;
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "a.d(" + ')');
        }
    }

    public static void method109(int var0) {
        try {
            UtilClass37.fieldB.f(-1901317126);
            UtilClass21.fieldL = -561749511;
            UtilClass21.fieldM = null;
        } catch (RuntimeException var1) {
            throw ClanMate.error(var1, "a.v(" + ')');
        }
    }

    public static int method110(int var0, int var1) {
        try {
            int var2;
            label59:
            {
                var2 = 0;
                if (var0 >= 0) {
                    if (var1 != 522576155) {
                        throw new IllegalStateException();
                    }

                    if (var0 < 65536) {
                        break label59;
                    }

                    if (var1 != 522576155) {
                        throw new IllegalStateException();
                    }
                }

                var0 >>>= 16;
                var2 += 16;
            }

            if (var0 >= 256) {
                if (var1 != 522576155) {
                    throw new IllegalStateException();
                }

                var0 >>>= 8;
                var2 += 8;
            }

            if (var0 >= 16) {
                if (var1 != 522576155) {
                    throw new IllegalStateException();
                }

                var0 >>>= 4;
                var2 += 4;
            }

            if (var0 >= 4) {
                if (var1 != 522576155) {
                    throw new IllegalStateException();
                }

                var0 >>>= 2;
                var2 += 2;
            }

            if (var0 >= 1) {
                if (var1 != 522576155) {
                    throw new IllegalStateException();
                }

                var0 >>>= 1;
                ++var2;
            }

            return var2 + var0;
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "a.b(" + ')');
        }
    }

    public static void method111(Applet var0, String var1, int var2) {
        try {
            UtilClass5.fieldA = var0;
            UtilClass5.fieldV = var1;
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "a.a(" + ')');
        }
    }

}
