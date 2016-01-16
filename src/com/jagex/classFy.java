package com.jagex;

public class classFy extends Node {

    classBl fieldI;
    classFl fieldV;
    classBw fieldU;
    classFa fieldB;
    int fieldL;
    int fieldM;
    int fieldW;
    int fieldE;
    int fieldN;
    int fieldS;
    int fieldK;
    int fieldF;
    int fieldD;
    int fieldX;
    int fieldQ;
    int fieldJ;
    int fieldO;
    int fieldA;
    int fieldH;
    int fieldY;
    int fieldT;


    static final void buildNpcActions(NpcDefinition def, int index, int regionX, int regionY, int var4) {
        try {
            if (Client.menuRowCount * 445599935 < 400) {
                if (def.transformIds != null) {
                    def = def.transform(-364933245);
                }

                if (def != null && def.interactable) {
                    if (def.fieldAx && index != Client.fieldJx * -523310039) {
                        return;
                    }
                    String var5 = def.fieldM;
                    int var9;
                    if (0 != def.level * 1014158119) {
                        int var8 = def.level * 1014158119;
                        var9 = 1669625607 * Client.myPlayer.combatLevel;
                        int var10 = var9 - var8;
                        String var7;
                        if (var10 < -9) {
                            var7 = Buffer.getColorTags(16711680, -375301583);
                        } else if (var10 < -6) {
                            var7 = Buffer.getColorTags(16723968, 2052873990);
                        } else if (var10 < -3) {
                            var7 = Buffer.getColorTags(16740352, -910177582);
                        } else if (var10 < 0) {
                            var7 = Buffer.getColorTags(16756736, 1090584483);
                        } else if (var10 > 9) {
                            var7 = Buffer.getColorTags('\uff00', 665413194);
                        } else if (var10 > 6) {
                            var7 = Buffer.getColorTags(4259584, -1075644960);
                        } else if (var10 > 3) {
                            var7 = Buffer.getColorTags(8453888, -1600735325);
                        } else if (var10 > 0) {
                            var7 = Buffer.getColorTags(12648192, -1811433499);
                        } else {
                            var7 = Buffer.getColorTags(16776960, 1530451339);
                        }
                        var5 += var7 + " " + UtilClass41.openParanthesis + StringConstants.level + def.level * 1014158119 + UtilClass41.closeParanthesis;
                    }

                    if (1 == Client.itemSelectionStatus * 279939385) {
                        ItemPile.insertMenuAction(StringConstants.fieldEk, Client.fieldIt + " " + UtilClass41.fieldM + " " + Buffer.getColorTags(16776960, 45763301) + var5, 7, index, regionX, regionY);
                    } else if (Client.isSpellSelected) {
                        if (2 == (UtilClass40.selectedSpellTargetFlags * 1512402281 & 2)) {
                            if (var4 <= 537294408) {
                                return;
                            }

                            ItemPile.insertMenuAction(Client.spellAction, Client.fieldJc + " " + UtilClass41.fieldM + " " + Buffer.getColorTags(16776960, 834591581) + var5, 8, index, regionX, regionY);
                        }
                    } else {
                        String[] var6 = def.fieldG;
                        if (Client.fieldJo) {
                            var6 = UtilClass24.method3(var6, -1711691494);
                        }

                        int var13;
                        if (null != var6) {
                            if (var4 <= 537294408) {
                                throw new IllegalStateException();
                            }

                            for (var13 = 4; var13 >= 0; --var13) {
                                if (var4 <= 537294408) {
                                    return;
                                }

                                if (var6[var13] != null && !var6[var13].equalsIgnoreCase(StringConstants.fieldEv)) {
                                    if (var4 <= 537294408) {
                                        return;
                                    }

                                    byte var12 = 0;
                                    if (0 == var13) {
                                        if (var4 <= 537294408) {
                                            throw new IllegalStateException();
                                        }

                                        var12 = 9;
                                    }

                                    if (1 == var13) {
                                        if (var4 <= 537294408) {
                                            throw new IllegalStateException();
                                        }

                                        var12 = 10;
                                    }

                                    if (2 == var13) {
                                        if (var4 <= 537294408) {
                                            throw new IllegalStateException();
                                        }

                                        var12 = 11;
                                    }

                                    if (3 == var13) {
                                        if (var4 <= 537294408) {
                                            throw new IllegalStateException();
                                        }

                                        var12 = 12;
                                    }

                                    if (4 == var13) {
                                        if (var4 <= 537294408) {
                                            throw new IllegalStateException();
                                        }

                                        var12 = 13;
                                    }

                                    ItemPile.insertMenuAction(var6[var13], Buffer.getColorTags(16776960, 310676140) + var5, var12, index, regionX, regionY);
                                }
                            }
                        }

                        if (null != var6) {
                            if (var4 <= 537294408) {
                                return;
                            }

                            for (var13 = 4; var13 >= 0; --var13) {
                                if (var4 <= 537294408) {
                                    throw new IllegalStateException();
                                }

                                if (var6[var13] != null) {
                                    if (var4 <= 537294408) {
                                        throw new IllegalStateException();
                                    }

                                    if (var6[var13].equalsIgnoreCase(StringConstants.fieldEv)) {
                                        if (var4 <= 537294408) {
                                            return;
                                        }

                                        short var14;
                                        label261:
                                        {
                                            var14 = 0;
                                            if (Client.fieldAo != UnknownEnum3.UNKNOWN1) {
                                                if (var4 <= 537294408) {
                                                    throw new IllegalStateException();
                                                }

                                                if (Client.fieldAo != UnknownEnum3.UNKNOWN0) {
                                                    break label261;
                                                }

                                                if (var4 <= 537294408) {
                                                    throw new IllegalStateException();
                                                }

                                                if (def.level * 1014158119 <= 1669625607 * Client.myPlayer.combatLevel) {
                                                    break label261;
                                                }

                                                if (var4 <= 537294408) {
                                                    return;
                                                }
                                            }

                                            var14 = 2000;
                                        }

                                        var9 = 0;
                                        if (var13 == 0) {
                                            var9 = var14 + 9;
                                        }

                                        if (var13 == 1) {
                                            if (var4 <= 537294408) {
                                                throw new IllegalStateException();
                                            }

                                            var9 = 10 + var14;
                                        }

                                        if (var13 == 2) {
                                            if (var4 <= 537294408) {
                                                return;
                                            }

                                            var9 = 11 + var14;
                                        }

                                        if (var13 == 3) {
                                            var9 = 12 + var14;
                                        }

                                        if (var13 == 4) {
                                            if (var4 <= 537294408) {
                                                throw new IllegalStateException();
                                            }

                                            var9 = 13 + var14;
                                        }

                                        ItemPile.insertMenuAction(var6[var13], Buffer.getColorTags(16776960, -1025514696) + var5, var9, index, regionX, regionY);
                                    }
                                }
                            }
                        }

                        ItemPile.insertMenuAction(StringConstants.EXAMINE, Buffer.getColorTags(16776960, -234137041) + var5, 1003, index, regionX, regionY);
                    }

                }
            }
        } catch (RuntimeException var11) {
            throw ClanMate.error(var11, "fy.cq(" + ')');
        }
    }

    static boolean method7(String var0, int var1, byte var2) {
        try {
            return TaskHandler.method277(var0, var1, "openjs", (byte) 4);
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "fy.b(" + ')');
        }
    }

    void a(byte var1) {
        try {
            this.fieldV = null;
            this.fieldI = null;
            this.fieldB = null;
            this.fieldU = null;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "fy.a(" + ')');
        }
    }
}
