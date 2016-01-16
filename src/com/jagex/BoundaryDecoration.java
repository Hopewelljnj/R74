package com.jagex;

public final class BoundaryDecoration {

    static ExchangeInfo fieldOr;
    static int fieldIv;
    static int[] fieldH;

    public Renderable fieldE;
    public Renderable fieldN;
    int fieldB;
    int fieldL;

    int insetX;
    int insetY;
    int strictX;
    int strictY;
    int height;

    public int uid = 0;
    int cfg = 0;


    public static int method204(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
        try {
            if ((var5 & 1) == 1) {
                int var7 = var3;
                var3 = var4;
                var4 = var7;
            }

            var2 &= 3;
            if (0 == var2) {
                return var0;
            } else if (1 == var2) {
                if (var6 >= 1199929581) {
                    throw new IllegalStateException();
                } else {
                    return var1;
                }
            } else if (var2 == 2) {
                if (var6 >= 1199929581) {
                    throw new IllegalStateException();
                } else {
                    return 7 - var0 - (var3 - 1);
                }
            } else {
                return 7 - var1 - (var4 - 1);
            }
        } catch (RuntimeException var8) {
            throw ClanMate.error(var8, "cb.a(" + ')');
        }
    }

    public static ReferenceTableSub method205(int var0, boolean var1, boolean var2, boolean var3, int var4) {
        try {
            classDz var5 = null;
            if (null != UtilClass19.fieldF) {
                if (var4 >= 1778255017) {
                    throw new IllegalStateException();
                }

                var5 = new classDz(var0, UtilClass19.fieldF, UtilClass11.fieldX[var0], 1000000);
            }

            return new ReferenceTableSub(var5, classCx.fieldOl, var0, var1, var2, var3);
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "cb.d(" + ')');
        }
    }

    static final void method206(int var0, int var1, int var2, int var3, int var4) {
        try {
            for (int var5 = var1; var5 <= var3 + var1; ++var5) {
                if (var4 == -185631440) {
                    throw new IllegalStateException();
                }

                for (int var6 = var0; var6 <= var0 + var2; ++var6) {
                    if (var4 == -185631440) {
                        throw new IllegalStateException();
                    }

                    if (var6 >= 0) {
                        if (var4 == -185631440) {
                            throw new IllegalStateException();
                        }

                        if (var6 < 104 && var5 >= 0) {
                            if (var4 == -185631440) {
                                throw new IllegalStateException();
                            }

                            if (var5 < 104) {
                                if (var4 == -185631440) {
                                    throw new IllegalStateException();
                                }

                                classCn.fieldE[0][var6][var5] = 127;
                                if (var0 == var6) {
                                    if (var4 == -185631440) {
                                        return;
                                    }

                                    if (var6 > 0) {
                                        if (var4 == -185631440) {
                                            throw new IllegalStateException();
                                        }

                                        classM.tileHeights[0][var6][var5] = classM.tileHeights[0][var6 - 1][var5];
                                    }
                                }

                                if (var6 == var0 + var2) {
                                    if (var4 == -185631440) {
                                        throw new IllegalStateException();
                                    }

                                    if (var6 < 103) {
                                        if (var4 == -185631440) {
                                            throw new IllegalStateException();
                                        }

                                        classM.tileHeights[0][var6][var5] = classM.tileHeights[0][1 + var6][var5];
                                    }
                                }

                                if (var1 == var5) {
                                    if (var4 == -185631440) {
                                        return;
                                    }

                                    if (var5 > 0) {
                                        if (var4 == -185631440) {
                                            return;
                                        }

                                        classM.tileHeights[0][var6][var5] = classM.tileHeights[0][var6][var5 - 1];
                                    }
                                }

                                if (var3 + var1 == var5) {
                                    if (var4 == -185631440) {
                                        throw new IllegalStateException();
                                    }

                                    if (var5 < 103) {
                                        if (var4 == -185631440) {
                                            throw new IllegalStateException();
                                        }

                                        classM.tileHeights[0][var6][var5] = classM.tileHeights[0][var6][1 + var5];
                                    }
                                }
                            }
                        }
                    }
                }
            }

        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "cb.v(" + ')');
        }
    }
}
