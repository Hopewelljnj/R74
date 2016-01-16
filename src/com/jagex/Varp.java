package com.jagex;

import java.awt.*;
import java.awt.Desktop.Action;
import java.net.URI;

public class Varp extends DualNode {

    public static int fieldV;
    public static short[] fieldW;
    public static ReferenceTable fieldA;
    static JagSocket fieldCf;
    static Cache fieldI = new Cache(64);
    static String fieldO;
    public int fieldB = 0;

    static final void method393(Player player, int var1, int var2, int var3, int var4) {
        try {
            if (player == Client.myPlayer) {
                if (var4 == 1175312543) {
                    throw new IllegalStateException();
                }
            } else if (Client.menuRowCount * 445599935 < 400) {
                String var5;
                int var8;
                if (0 == player.totalLevel * 930598627) {
                    if (var4 == 1175312543) {
                        return;
                    }

                    String var6 = player.name;
                    var8 = player.combatLevel * 1669625607;
                    int var9 = Client.myPlayer.combatLevel * 1669625607;
                    int var10 = var9 - var8;
                    String var7;
                    if (var10 < -9) {
                        if (var4 == 1175312543) {
                            throw new IllegalStateException();
                        }

                        var7 = Buffer.getColorTags(16711680, -1307537140);
                    } else if (var10 < -6) {
                        var7 = Buffer.getColorTags(16723968, -881636069);
                    } else if (var10 < -3) {
                        if (var4 == 1175312543) {
                            throw new IllegalStateException();
                        }

                        var7 = Buffer.getColorTags(16740352, 543964839);
                    } else if (var10 < 0) {
                        if (var4 == 1175312543) {
                            throw new IllegalStateException();
                        }

                        var7 = Buffer.getColorTags(16756736, 1035754086);
                    } else if (var10 > 9) {
                        if (var4 == 1175312543) {
                            throw new IllegalStateException();
                        }

                        var7 = Buffer.getColorTags('\uff00', 1045092556);
                    } else if (var10 > 6) {
                        if (var4 == 1175312543) {
                            return;
                        }

                        var7 = Buffer.getColorTags(4259584, 333195232);
                    } else if (var10 > 3) {
                        if (var4 == 1175312543) {
                            throw new IllegalStateException();
                        }

                        var7 = Buffer.getColorTags(8453888, 33389884);
                    } else if (var10 > 0) {
                        var7 = Buffer.getColorTags(12648192, 474447554);
                    } else {
                        var7 = Buffer.getColorTags(16776960, -474158646);
                    }

                    var5 = var6 + var7 + " " + UtilClass41.openParanthesis + StringConstants.level + player.combatLevel * 1669625607 + UtilClass41.closeParanthesis;
                } else {
                    var5 = player.name + " " + UtilClass41.openParanthesis + StringConstants.fieldFv + player.totalLevel * 930598627 + UtilClass41.closeParanthesis;
                }

                int var12;
                if (1 == Client.itemSelectionStatus * 279939385) {
                    ItemPile.insertMenuAction(StringConstants.fieldEk, Client.fieldIt + " " + UtilClass41.fieldM + " " + Buffer.getColorTags(16777215, 1947498814) + var5, 14, var1, var2, var3);
                } else if (Client.isSpellSelected) {
                    if (var4 == 1175312543) {
                        throw new IllegalStateException();
                    }

                    if (8 == (UtilClass40.selectedSpellTargetFlags * 1512402281 & 8)) {
                        if (var4 == 1175312543) {
                            throw new IllegalStateException();
                        }

                        ItemPile.insertMenuAction(Client.spellAction, Client.fieldJc + " " + UtilClass41.fieldM + " " + Buffer.getColorTags(16777215, 1517669482) + var5, 15, var1, var2, var3);
                    }
                } else {
                    for (var12 = 7; var12 >= 0; --var12) {
                        if (null != Client.playerActions[var12]) {
                            if (var4 == 1175312543) {
                                throw new IllegalStateException();
                            }

                            short var14 = 0;
                            if (Client.playerActions[var12].equalsIgnoreCase(StringConstants.fieldEv)) {
                                label171:
                                {
                                    if (UnknownEnum3.UNKNOWN1 != Client.fieldAo) {
                                        if (Client.fieldAo != UnknownEnum3.UNKNOWN0) {
                                            break label171;
                                        }
                                        if (player.combatLevel * 1669625607 <= 1669625607 * Client.myPlayer.combatLevel) {
                                            break label171;
                                        }
                                    }

                                    var14 = 2000;
                                }

                                if (-1806446711 * Client.myPlayer.team != 0 && 0 != player.team * -1806446711) {
                                    if (Client.myPlayer.team * -1806446711 == player.team * -1806446711) {
                                        var14 = 2000;
                                    } else {
                                        var14 = 0;
                                    }
                                }
                            } else if (Client.fieldHs[var12]) {
                                var14 = 2000;
                            }

                            boolean var13 = false;
                            var8 = var14 + Client.playerActionOpcodes[var12];
                            ItemPile.insertMenuAction(Client.playerActions[var12], Buffer.getColorTags(16777215, -135792372) + var5, var8, var1, var2, var3);
                        }
                    }
                }

                for (var12 = 0; var12 < Client.menuRowCount * 445599935; ++var12) {
                    if (var4 == 1175312543) {
                        throw new IllegalStateException();
                    }

                    if (Client.menuOpcodes[var12] == 23) {
                        Client.menuNouns[var12] = Buffer.getColorTags(16777215, 701498434) + var5;
                        break;
                    }
                }

            }
        } catch (RuntimeException var11) {
            throw ClanMate.error(var11, "aj.ci(" + ')');
        }
    }

    static final int method394(int var0, int var1, int var2, int var3, int var4) {
        try {
            int var5 = 65536 - RSGraphics2D.COS_TABLE[var2 * 1024 / var3] >> 1;
            return (var1 * var5 >> 16) + ((65536 - var5) * var0 >> 16);
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "aj.k(" + ')');
        }
    }

    static final String method395(int var0, byte var1) {
        try {
            String var2 = Integer.toString(var0);

            for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
                if (var1 != 0) {
                    throw new IllegalStateException();
                }

                var2 = var2.substring(0, var3) + UtilClass41.fieldV + var2.substring(var3);
            }

            if (var2.length() > 9) {
                if (var1 != 0) {
                    throw new IllegalStateException();
                } else {
                    return " " + Buffer.getColorTags('\uff80', -1069972606) + var2.substring(0, var2.length() - 8) + StringConstants.fieldFf + " " + UtilClass41.openParanthesis + var2 + UtilClass41.closeParanthesis + UtilClass41.fieldE;
                }
            } else if (var2.length() > 6) {
                if (var1 != 0) {
                    throw new IllegalStateException();
                } else {
                    return " " + Buffer.getColorTags(16777215, 2142245009) + var2.substring(0, var2.length() - 4) + StringConstants.fieldFl + " " + UtilClass41.openParanthesis + var2 + UtilClass41.closeParanthesis + UtilClass41.fieldE;
                }
            } else {
                return " " + Buffer.getColorTags(16776960, 1289434808) + var2 + UtilClass41.fieldE;
            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "aj.cd(" + ')');
        }
    }

    static void method396(String var0, boolean var1, String var2, boolean var3, int var4) {
        try {
            if (var1) {
                if (!var3) {
                    if (var4 >= 424981016) {
                        throw new IllegalStateException();
                    }

                    if (Desktop.isDesktopSupported()) {
                        if (var4 >= 424981016) {
                            return;
                        }

                        if (Desktop.getDesktop().isSupported(Action.BROWSE)) {
                            if (var4 >= 424981016) {
                                throw new IllegalStateException();
                            }

                            try {
                                Desktop.getDesktop().browse(new URI(var0));
                                return;
                            } catch (Exception var6) {
                                ;
                            }
                        }
                    }
                }

                if (UtilClass5.fieldV.startsWith("win")) {
                    if (var4 >= 424981016) {
                        throw new IllegalStateException();
                    }

                    if (!var3) {
                        if (var4 >= 424981016) {
                            throw new IllegalStateException();
                        }

                        classFy.method7(var0, 0, (byte) -114);
                        return;
                    }
                }

                if (UtilClass5.fieldV.startsWith("mac")) {
                    TaskHandler.method277(var0, 1, var2, (byte) 4);
                    return;
                }

                classFy.method7(var0, 2, (byte) -44);
            } else {
                classFy.method7(var0, 3, (byte) -52);
            }

        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "aj.i(" + ')');
        }
    }

    void i(Buffer var1, int var2, short var3) {
        try {
            if (5 == var2) {
                this.fieldB = var1.readUShort() * 938085935;
            }

        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "aj.i(" + ')');
        }
    }

    void v(Buffer var1, byte var2) {
        try {
            while (true) {
                int var3 = var1.readUByte();
                if (0 == var3) {
                    return;
                }

                this.i(var1, var3, (short) 426);
            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "aj.v(" + ')');
        }
    }
}
