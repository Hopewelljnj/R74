package com.jagex;

public class RuneScript extends DualNode {

    static Cache cache = new Cache(128);
    static CompressedImage[] worldSelectorStars;

    int[] opcodes;

    int intArgGround;
    int stringArgCount;

    int stringStackMax;
    int intStackMax;

    int[] intOperands;
    String[] stringOperands;

    public static int updateKeyboardIdle(int var0) {
        try {
            return Keyboard.keyboardIdleTime * 1965147243;
        } catch (RuntimeException var1) {
            throw ClanMate.error(var1, "u.m(" + ')');
        }
    }

    public static void method162(String var0, boolean var1, boolean var2, int var3) {
        try {
            Varp.method396(var0, var1, "openjs", var2, -1392002884);
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "u.v(" + ')');
        }
    }

    static final void method163(CompressedImage var0, byte var1) {
        try {
            short var2 = 256;

            int var3;
            for (var3 = 0; var3 < IgnoredPlayer.fieldP.length; ++var3) {
                IgnoredPlayer.fieldP[var3] = 0;
            }

            int var4;
            for (var3 = 0; var3 < 5000; ++var3) {
                if (var1 <= 12) {
                    return;
                }

                var4 = (int) (Math.random() * 128.0D * (double) var2);
                IgnoredPlayer.fieldP[var4] = (int) (Math.random() * 256.0D);
            }

            int var5;
            int var6;
            for (var3 = 0; var3 < 20; ++var3) {
                for (var4 = 1; var4 < var2 - 1; ++var4) {
                    if (var1 <= 12) {
                        throw new IllegalStateException();
                    }

                    for (var5 = 1; var5 < 127; ++var5) {
                        if (var1 <= 12) {
                            throw new IllegalStateException();
                        }

                        var6 = var5 + (var4 << 7);
                        UtilClass35.fieldR[var6] = (IgnoredPlayer.fieldP[var6 - 128] + IgnoredPlayer.fieldP[1 + var6] + IgnoredPlayer.fieldP[var6 - 1] + IgnoredPlayer.fieldP[128 + var6]) / 4;
                    }
                }

                int[] var10 = IgnoredPlayer.fieldP;
                IgnoredPlayer.fieldP = UtilClass35.fieldR;
                UtilClass35.fieldR = var10;
            }

            if (var0 != null) {
                if (var1 <= 12) {
                    throw new IllegalStateException();
                }

                var3 = 0;

                for (var4 = 0; var4 < var0.fieldB; ++var4) {
                    if (var1 <= 12) {
                        throw new IllegalStateException();
                    }

                    for (var5 = 0; var5 < var0.fieldI; ++var5) {
                        if (var1 <= 12) {
                            throw new IllegalStateException();
                        }

                        if (var0.fieldA[var3++] != 0) {
                            if (var1 <= 12) {
                                throw new IllegalStateException();
                            }

                            var6 = var0.fieldL + var5 + 16;
                            int var7 = var0.fieldM + 16 + var4;
                            int var8 = var6 + (var7 << 7);
                            IgnoredPlayer.fieldP[var8] = 0;
                        }
                    }
                }
            }

        } catch (RuntimeException var9) {
            throw ClanMate.error(var9, "u.l(" + ')');
        }
    }

    static Widget method164(Widget var0, int var1) {
        try {
            int var2 = classCx.method289(UtilClass38.getWidgetConfig(var0, 2070855251), -1486805142);
            if (var2 == 0) {
                return null;
            } else {
                for (int var3 = 0; var3 < var2; ++var3) {
                    var0 = Widget.lookup(var0.fieldP * 1574594539);
                    if (var0 == null) {
                        return null;
                    }
                }
                return var0;
            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "u.dt(" + ')');
        }
    }
}
