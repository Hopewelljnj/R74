package com.jagex;

public class ScriptStackElement {

    protected static boolean fieldQg;
    int fieldV = -427443733;
    String[] fieldB;
    int[] fieldI;
    RuneScript fieldA;

    static final void method91(byte[] var0, int var1, int var2, Landscape var3, CollisionMap[] var4, int var5) {
        try {
            Buffer var6 = new Buffer(var0);
            int var7 = -1;

            while (true) {
                int var8 = var6.readImmediateSmart(2095405648);
                if (var8 == 0) {
                    if (var5 != 79843573) {
                        throw new IllegalStateException();
                    }

                    return;
                }

                var7 += var8;
                int var9 = 0;

                while (true) {
                    int var10 = var6.readImmediateSmart(1974742776);
                    if (0 == var10) {
                        if (var5 != 79843573) {
                            throw new IllegalStateException();
                        }
                        break;
                    }

                    var9 += var10 - 1;
                    int var11 = var9 & 63;
                    int var12 = var9 >> 6 & 63;
                    int var13 = var9 >> 12;
                    int var14 = var6.readUByte();
                    int var15 = var14 >> 2;
                    int var16 = var14 & 3;
                    int var17 = var1 + var12;
                    int var18 = var2 + var11;
                    if (var17 > 0) {
                        if (var5 != 79843573) {
                            throw new IllegalStateException();
                        }

                        if (var18 > 0) {
                            if (var5 != 79843573) {
                                return;
                            }

                            if (var17 < 103) {
                                if (var5 != 79843573) {
                                    return;
                                }

                                if (var18 < 103) {
                                    if (var5 != 79843573) {
                                        throw new IllegalStateException();
                                    }

                                    int var19 = var13;
                                    if (2 == (classM.renderRules[1][var17][var18] & 2)) {
                                        var19 = var13 - 1;
                                    }

                                    CollisionMap var20 = null;
                                    if (var19 >= 0) {
                                        if (var5 != 79843573) {
                                            return;
                                        }

                                        var20 = var4[var19];
                                    }

                                    classEv.addCacheObject(var13, var17, var18, var7, var16, var15, var3, var20, 1297564227);
                                }
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var21) {
            throw ClanMate.error(var21, "d.m(" + ')');
        }
    }

    public static boolean method92(int var0) {
        try {
            if (UtilClass21.fieldL * 1195675721 != 0) {
                if (var0 == -499935474) {
                    throw new IllegalStateException();
                } else {
                    return true;
                }
            } else {
                return UtilClass37.fieldB.d(-56969330);
            }
        } catch (RuntimeException var1) {
            throw ClanMate.error(var1, "d.l(" + ')');
        }
    }
}
