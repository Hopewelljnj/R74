package com.jagex;

public class ItemTable extends Node {

    public static int fieldN;
    static int fieldNt;
    static int[] fieldX;
    static CompressedImage[] modIcons;
    static byte[][] fieldDr;
    static CompressedImage[] fieldB;
    static NodeTable cache = new NodeTable(32);
    int[] quantities = new int[]{0};
    int[] ids = new int[]{-1};

    public static boolean method198(int var0, int var1) {
        try {
            boolean var10000;
            if (0 != (var0 >> 21 & 1)) {
                if (var1 <= 1972613567) {
                    throw new IllegalStateException();
                }

                var10000 = true;
            } else {
                var10000 = false;
            }

            return var10000;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "x.i(" + ')');
        }
    }

    static void method199(ReferenceTableSub var0, int var1, int var2, int var3, byte var4, boolean var5, int var6) {
        try {
            long var7 = (long) ((var1 << 16) + var2);
            classEr var9 = (classEr) UtilClass20.fieldB.get(var7);
            if (null != var9) {
                if (var6 != 645222263) {
                    throw new IllegalStateException();
                }
            } else {
                var9 = (classEr) UtilClass20.fieldM.get(var7);
                if (null != var9) {
                    if (var6 == 645222263) {
                        ;
                    }
                } else {
                    var9 = (classEr) UtilClass20.fieldN.get(var7);
                    if (null != var9) {
                        if (var6 != 645222263) {
                            throw new IllegalStateException();
                        } else {
                            if (var5) {
                                if (var6 != 645222263) {
                                    throw new IllegalStateException();
                                }

                                var9.deleteDual();
                                UtilClass20.fieldB.put(var9, var7);
                                UtilClass20.fieldS -= -748059873;
                                UtilClass20.fieldL += -1095412767;
                            }

                        }
                    } else {
                        if (!var5) {
                            if (var6 != 645222263) {
                                throw new IllegalStateException();
                            }

                            var9 = (classEr) UtilClass20.fieldK.get(var7);
                            if (null != var9) {
                                if (var6 != 645222263) {
                                    return;
                                }

                                return;
                            }
                        }

                        var9 = new classEr();
                        var9.fieldA = var0;
                        var9.fieldV = var3 * 1503297613;
                        var9.fieldI = var4;
                        if (var5) {
                            UtilClass20.fieldB.put(var9, var7);
                            UtilClass20.fieldL += -1095412767;
                        } else {
                            UtilClass20.fieldE.add(var9);
                            UtilClass20.fieldN.put(var9, var7);
                            UtilClass20.fieldS += -748059873;
                        }

                    }
                }
            }
        } catch (RuntimeException var10) {
            throw ClanMate.error(var10, "x.v(" + ')');
        }
    }

    static void setLoginErrorStrings(String var0, String var1, String var2, byte var3) {
        try {
            ClientData.fieldAq = var0;
            ClientData.fieldAm = var1;
            ClientData.fieldAx = var2;
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "x.b(" + ')');
        }
    }

    static void method201(GameEngine var0, int var1) {
        try {
            if (1 != Mouse.fieldD * 1724889987) {
                if (CalendarUtil.fieldAw) {
                    return;
                }

                if (var1 <= 384534393) {
                    throw new IllegalStateException();
                }

                if (4 != Mouse.fieldD * 1724889987) {
                    return;
                }

                if (var1 <= 384534393) {
                    return;
                }
            }

            short var2 = 280;
            if (Mouse.fieldX * -1590834513 >= var2) {
                if (var1 <= 384534393) {
                    throw new IllegalStateException();
                }

                if (Mouse.fieldX * -1590834513 <= var2 + 14) {
                    if (var1 <= 384534393) {
                        return;
                    }

                    if (Mouse.fieldO * 1708223245 >= 4) {
                        if (var1 <= 384534393) {
                            throw new IllegalStateException();
                        }

                        if (Mouse.fieldO * 1708223245 <= 18) {
                            if (var1 <= 384534393) {
                                throw new IllegalStateException();
                            }

                            UtilClass14.method51(0, 0, (byte) 41);
                            return;
                        }
                    }
                }
            }

            if (Mouse.fieldX * -1590834513 >= 15 + var2) {
                if (var1 <= 384534393) {
                    return;
                }

                if (Mouse.fieldX * -1590834513 <= 80 + var2) {
                    if (var1 <= 384534393) {
                        return;
                    }

                    if (Mouse.fieldO * 1708223245 >= 4 && Mouse.fieldO * 1708223245 <= 18) {
                        if (var1 <= 384534393) {
                            throw new IllegalStateException();
                        }

                        UtilClass14.method51(0, 1, (byte) 41);
                        return;
                    }
                }
            }

            short var3 = 390;
            if (Mouse.fieldX * -1590834513 >= var3 && Mouse.fieldX * -1590834513 <= var3 + 14 && Mouse.fieldO * 1708223245 >= 4) {
                if (var1 <= 384534393) {
                    throw new IllegalStateException();
                }

                if (Mouse.fieldO * 1708223245 <= 18) {
                    UtilClass14.method51(1, 0, (byte) 41);
                    return;
                }
            }

            if (Mouse.fieldX * -1590834513 >= 15 + var3) {
                if (var1 <= 384534393) {
                    return;
                }

                if (Mouse.fieldX * -1590834513 <= var3 + 80) {
                    if (var1 <= 384534393) {
                        return;
                    }

                    if (Mouse.fieldO * 1708223245 >= 4 && Mouse.fieldO * 1708223245 <= 18) {
                        UtilClass14.method51(1, 1, (byte) 41);
                        return;
                    }
                }
            }

            short var4 = 500;
            if (Mouse.fieldX * -1590834513 >= var4) {
                if (var1 <= 384534393) {
                    throw new IllegalStateException();
                }

                if (Mouse.fieldX * -1590834513 <= var4 + 14) {
                    if (var1 <= 384534393) {
                        throw new IllegalStateException();
                    }

                    if (Mouse.fieldO * 1708223245 >= 4) {
                        if (var1 <= 384534393) {
                            throw new IllegalStateException();
                        }

                        if (Mouse.fieldO * 1708223245 <= 18) {
                            if (var1 <= 384534393) {
                                return;
                            }

                            UtilClass14.method51(2, 0, (byte) 41);
                            return;
                        }
                    }
                }
            }

            if (Mouse.fieldX * -1590834513 >= 15 + var4) {
                if (var1 <= 384534393) {
                    throw new IllegalStateException();
                }

                if (Mouse.fieldX * -1590834513 <= 80 + var4 && Mouse.fieldO * 1708223245 >= 4) {
                    if (var1 <= 384534393) {
                        throw new IllegalStateException();
                    }

                    if (Mouse.fieldO * 1708223245 <= 18) {
                        UtilClass14.method51(2, 1, (byte) 41);
                        return;
                    }
                }
            }

            short var5 = 610;
            if (Mouse.fieldX * -1590834513 >= var5) {
                if (var1 <= 384534393) {
                    throw new IllegalStateException();
                }

                if (Mouse.fieldX * -1590834513 <= var5 + 14) {
                    if (var1 <= 384534393) {
                        throw new IllegalStateException();
                    }

                    if (Mouse.fieldO * 1708223245 >= 4 && Mouse.fieldO * 1708223245 <= 18) {
                        UtilClass14.method51(3, 0, (byte) 41);
                        return;
                    }
                }
            }

            if (Mouse.fieldX * -1590834513 >= 15 + var5) {
                if (var1 <= 384534393) {
                    throw new IllegalStateException();
                }

                if (Mouse.fieldX * -1590834513 <= 80 + var5) {
                    if (var1 <= 384534393) {
                        throw new IllegalStateException();
                    }

                    if (Mouse.fieldO * 1708223245 >= 4) {
                        if (var1 <= 384534393) {
                            return;
                        }

                        if (Mouse.fieldO * 1708223245 <= 18) {
                            if (var1 <= 384534393) {
                                throw new IllegalStateException();
                            }

                            UtilClass14.method51(3, 1, (byte) 41);
                            return;
                        }
                    }
                }
            }

            if (Mouse.fieldX * -1590834513 >= 708 && Mouse.fieldO * 1708223245 >= 4) {
                if (var1 <= 384534393) {
                    return;
                }

                if (Mouse.fieldX * -1590834513 <= 758 && Mouse.fieldO * 1708223245 <= 20) {
                    if (var1 <= 384534393) {
                        throw new IllegalStateException();
                    }

                    ClientData.isWorldSelectorOpen = false;
                    UtilClass7.fieldL.s(0, 0);
                    ClientData.fieldM.s(382, 0);
                    ClientData.fieldW.i(382 - ClientData.fieldW.fieldI / 2, 18);
                    return;
                }
            }

            if (-1 != ClientData.fieldBr * -909458641) {
                World var6 = ExchangeOfferQuantityComparator.fieldBi[ClientData.fieldBr * -909458641];
                UnknownEnum4.method23(var6, 819015872);
                ClientData.isWorldSelectorOpen = false;
                UtilClass7.fieldL.s(0, 0);
                ClientData.fieldM.s(382, 0);
                ClientData.fieldW.i(382 - ClientData.fieldW.fieldI / 2, 18);
            }
        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "x.e(" + ')');
        }
    }

    static classDa method202(int var0) {
        try {
            try {
                return new classEc();
            } catch (Throwable var2) {
                return new classEp();
            }
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "x.a(" + ')');
        }
    }

    static void method203(Player var0, int var1, int var2, int var3) {
        try {
            if (var1 == var0.animation * -433706235) {
                if (var1 != -1) {
                    int var4 = AnimationSequence.get(var1, 1128325155).fieldU * 888956053;
                    if (var4 == 1) {
                        var0.fieldBo = 0;
                        var0.fieldBi = 0;
                        var0.animationDelay = 229151739 * var2;
                        var0.fieldBl = 0;
                    }

                    if (var4 == 2) {
                        var0.fieldBl = 0;
                    }

                    return;
                }
            }

            if (var1 != -1) {
                if (-1 != var0.animation * -433706235) {
                    if (AnimationSequence.get(var1, 846663042).fieldD * 1901528491 < AnimationSequence.get(var0.animation * -433706235, -580590303).fieldD * 1901528491) {
                        return;
                    }
                }
            }

            var0.animation = var1 * -1079449139;
            var0.fieldBo = 0;
            var0.fieldBi = 0;
            var0.animationDelay = var2 * 229151739;
            var0.fieldBl = 0;
            var0.fieldCt = var0.queueSize * 1571161601;
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "x.al(" + ')');
        }
    }
}
