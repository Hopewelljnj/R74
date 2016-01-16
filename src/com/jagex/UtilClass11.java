package com.jagex;

public class UtilClass11 {

    public static classHf[] fieldX;
    static int yaw;


    UtilClass11() throws Throwable {
        throw new Error();
    }

    static final void method85(boolean var0, byte var1) {
        try {
            Client.fieldHr = 0;
            Client.fieldHt = 0;
            Client.packet.gm(952376404);
            int var2 = Client.packet.gx(8, 1624336268);
            int var3;
            if (var2 < Client.npcCount * 1825497683) {
                if (var1 == 4) {
                    throw new IllegalStateException();
                }

                for (var3 = var2; var3 < Client.npcCount * 1825497683; ++var3) {
                    if (var1 == 4) {
                        throw new IllegalStateException();
                    }

                    Client.fieldHx[(Client.fieldHr += -1637101621) * -2105647645 - 1] = Client.npcIndices[var3];
                }
            }

            if (var2 > Client.npcCount * 1825497683) {
                if (var1 == 4) {
                    throw new IllegalStateException();
                } else {
                    throw new RuntimeException("");
                }
            } else {
                Client.npcCount = 0;

                for (var3 = 0; var3 < var2; ++var3) {
                    int var4 = Client.npcIndices[var3];
                    Npc var5 = Client.npcs[var4];
                    int var6 = Client.packet.gx(1, 471902519);
                    if (0 == var6) {
                        if (var1 == 4) {
                            throw new IllegalStateException();
                        }

                        Client.npcIndices[(Client.npcCount += -835472933) * 1825497683 - 1] = var4;
                        var5.fieldBx = Client.engineCycle * 612066721;
                    } else {
                        int var7 = Client.packet.gx(2, 1895001074);
                        if (var7 == 0) {
                            Client.npcIndices[(Client.npcCount += -835472933) * 1825497683 - 1] = var4;
                            var5.fieldBx = Client.engineCycle * 612066721;
                            Client.fieldHm[(Client.fieldHt += -530461679) * -839605007 - 1] = var4;
                        } else {
                            int var8;
                            int var9;
                            if (var7 == 1) {
                                if (var1 == 4) {
                                    throw new IllegalStateException();
                                }

                                Client.npcIndices[(Client.npcCount += -835472933) * 1825497683 - 1] = var4;
                                var5.fieldBx = Client.engineCycle * 612066721;
                                var8 = Client.packet.gx(3, -1890150827);
                                var5.k(var8, false, (short) 3321);
                                var9 = Client.packet.gx(1, -588880228);
                                if (var9 == 1) {
                                    Client.fieldHm[(Client.fieldHt += -530461679) * -839605007 - 1] = var4;
                                }
                            } else if (var7 == 2) {
                                if (var1 == 4) {
                                    return;
                                }

                                Client.npcIndices[(Client.npcCount += -835472933) * 1825497683 - 1] = var4;
                                var5.fieldBx = Client.engineCycle * 612066721;
                                var8 = Client.packet.gx(3, -1503881937);
                                var5.k(var8, true, (short) 3321);
                                var9 = Client.packet.gx(3, 1638230904);
                                var5.k(var9, true, (short) 3321);
                                int var10 = Client.packet.gx(1, 1918566352);
                                if (var10 == 1) {
                                    Client.fieldHm[(Client.fieldHt += -530461679) * -839605007 - 1] = var4;
                                }
                            } else if (var7 == 3) {
                                Client.fieldHx[(Client.fieldHr += -1637101621) * -2105647645 - 1] = var4;
                            }
                        }
                    }
                }

                InputHandler.method89(var0, 1702497078);
                UtilClass16.method59(-2143313583);

                for (var2 = 0; var2 < Client.fieldHr * -2105647645; ++var2) {
                    if (var1 == 4) {
                        return;
                    }

                    var3 = Client.fieldHx[var2];
                    if (16601493 * Client.npcs[var3].fieldBx != Client.engineCycle * -1223223371) {
                        if (var1 == 4) {
                            throw new IllegalStateException();
                        }

                        Client.npcs[var3].definition = null;
                        Client.npcs[var3] = null;
                    }
                }

                if (Client.packet.caret * 651432265 != Client.fieldCb * 237192877) {
                    if (var1 == 4) {
                        throw new IllegalStateException();
                    } else {
                        throw new RuntimeException(Client.packet.caret * 651432265 + UtilClass41.fieldV + Client.fieldCb * 237192877);
                    }
                } else {
                    for (var2 = 0; var2 < Client.npcCount * 1825497683; ++var2) {
                        if (var1 == 4) {
                            throw new IllegalStateException();
                        }

                        if (null == Client.npcs[Client.npcIndices[var2]]) {
                            if (var1 == 4) {
                                throw new IllegalStateException();
                            }

                            throw new RuntimeException(var2 + UtilClass41.fieldV + Client.npcCount * 1825497683);
                        }
                    }

                }
            }
        } catch (RuntimeException var11) {
            throw ClanMate.error(var11, "dr.bm(" + ')');
        }
    }
}
