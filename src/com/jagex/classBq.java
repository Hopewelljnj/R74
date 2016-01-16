package com.jagex;

import java.awt.*;

public abstract class classBq {

    public static TaskHandler globalTaskSchedular;
    static String[] fieldQ;
    public int[] fieldI;
    int fieldB;
    Image fieldM;
    int fieldL;

    public static boolean method263(int var0, byte var1) {
        try {
            return (var0 >> 29 & 1) != 0;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "bq.b(" + ')');
        }
    }

    public static byte method264(char var0, byte var1) {
        try {
            byte var2;
            label207:
            {
                if (var0 > 0) {
                    if (var1 == 27) {
                        throw new IllegalStateException();
                    }

                    if (var0 < 128) {
                        break label207;
                    }

                    if (var1 == 27) {
                        throw new IllegalStateException();
                    }
                }

                if (var0 < 160 || var0 > 255) {
                    if (var0 == 8364) {
                        if (var1 == 27) {
                            throw new IllegalStateException();
                        }

                        var2 = -128;
                        return var2;
                    } else if (8218 == var0) {
                        if (var1 == 27) {
                            throw new IllegalStateException();
                        }

                        var2 = -126;
                        return var2;
                    } else if (402 == var0) {
                        if (var1 == 27) {
                            throw new IllegalStateException();
                        }

                        var2 = -125;
                        return var2;
                    } else if (var0 == 8222) {
                        if (var1 == 27) {
                            throw new IllegalStateException();
                        }

                        var2 = -124;
                        return var2;
                    } else if (var0 == 8230) {
                        var2 = -123;
                        return var2;
                    } else if (8224 == var0) {
                        var2 = -122;
                        return var2;
                    } else if (8225 == var0) {
                        var2 = -121;
                        return var2;
                    } else if (var0 == 710) {
                        if (var1 == 27) {
                            throw new IllegalStateException();
                        }

                        var2 = -120;
                        return var2;
                    } else if (var0 == 8240) {
                        if (var1 == 27) {
                            throw new IllegalStateException();
                        }

                        var2 = -119;
                        return var2;
                    } else if (var0 == 352) {
                        if (var1 == 27) {
                            throw new IllegalStateException();
                        }

                        var2 = -118;
                        return var2;
                    } else if (8249 == var0) {
                        if (var1 == 27) {
                            throw new IllegalStateException();
                        }

                        var2 = -117;
                        return var2;
                    } else if (338 == var0) {
                        if (var1 == 27) {
                            throw new IllegalStateException();
                        }

                        var2 = -116;
                        return var2;
                    } else if (381 == var0) {
                        if (var1 == 27) {
                            throw new IllegalStateException();
                        }

                        var2 = -114;
                        return var2;
                    } else if (var0 == 8216) {
                        if (var1 == 27) {
                            throw new IllegalStateException();
                        }

                        var2 = -111;
                        return var2;
                    } else if (8217 == var0) {
                        if (var1 == 27) {
                            throw new IllegalStateException();
                        }

                        var2 = -110;
                        return var2;
                    } else if (var0 == 8220) {
                        if (var1 == 27) {
                            throw new IllegalStateException();
                        }

                        var2 = -109;
                        return var2;
                    } else if (8221 == var0) {
                        if (var1 == 27) {
                            throw new IllegalStateException();
                        }

                        var2 = -108;
                        return var2;
                    } else if (8226 == var0) {
                        if (var1 == 27) {
                            throw new IllegalStateException();
                        }

                        var2 = -107;
                        return var2;
                    } else if (8211 == var0) {
                        if (var1 == 27) {
                            throw new IllegalStateException();
                        }

                        var2 = -106;
                        return var2;
                    } else if (var0 == 8212) {
                        if (var1 == 27) {
                            throw new IllegalStateException();
                        }

                        var2 = -105;
                        return var2;
                    } else if (var0 == 732) {
                        if (var1 == 27) {
                            throw new IllegalStateException();
                        }

                        var2 = -104;
                        return var2;
                    } else if (var0 == 8482) {
                        var2 = -103;
                        return var2;
                    } else if (var0 == 353) {
                        if (var1 == 27) {
                            throw new IllegalStateException();
                        }

                        var2 = -102;
                        return var2;
                    } else if (8250 == var0) {
                        if (var1 == 27) {
                            throw new IllegalStateException();
                        }

                        var2 = -101;
                        return var2;
                    } else if (var0 == 339) {
                        if (var1 == 27) {
                            throw new IllegalStateException();
                        }

                        var2 = -100;
                        return var2;
                    } else if (var0 == 382) {
                        if (var1 == 27) {
                            throw new IllegalStateException();
                        }

                        var2 = -98;
                        return var2;
                    } else {
                        if (376 == var0) {
                            var2 = -97;
                        } else {
                            var2 = 63;
                        }

                        return var2;
                    }
                }

                if (var1 == 27) {
                    throw new IllegalStateException();
                }
            }

            var2 = (byte) var0;
            return var2;
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "bq.a(" + ')');
        }
    }

    static final void method265(int var0, int var1, int floorLevel, int var3, int var4, int DUMMY) {
        try {
            System.out.println("buildRegion:" + var0 + "," + var1 + "," + floorLevel + "," + var3 + "," + var4);
            if (var0 == classDm.fieldDg * -1081192611) {
                if (GraphicsStub.fieldDd * 39993143 == var1) {
                    label245:
                    {
                        if (floorLevel != Client.fieldCs * -526352391 && Client.lowMemory) {
                            break label245;
                        }
                        return;
                    }
                }
            }
            classDm.fieldDg = 989953269 * var0;
            GraphicsStub.fieldDd = var1 * -337271161;
            Client.fieldCs = 2048660041 * floorLevel;
            if (!Client.lowMemory) {
                Client.fieldCs = 0;
            }

            UnknownEnum.method373(25, (byte) -85);
            ItemPile.method339(StringConstants.fieldS, true, -1927523918);
            int var6 = classDc.baseX * -2071335905;
            int var7 = CalendarUtil.baseY * -1046564359;
            classDc.baseX = 39091960 * (var0 - 6);
            CalendarUtil.baseY = -1136000440 * (var1 - 6);
            int destinationX = classDc.baseX * -2071335905 - var6;
            int destinationY = CalendarUtil.baseY * -1046564359 - var7;
            var6 = classDc.baseX * -2071335905;
            var7 = CalendarUtil.baseY * -1046564359;

            int var10;
            int var12;
            for (var10 = 0; var10 < '\u8000'; ++var10) {
                Npc var11 = Client.npcs[var10];
                if (null != var11) {
                    for (var12 = 0; var12 < 10; ++var12) {
                        var11.queueX[var12] -= destinationX;
                        var11.queueY[var12] -= destinationY;
                    }
                    var11.strictX -= destinationX * 1423243648;
                    var11.strictY -= destinationY * 2107549312;
                }
            }

            for (var10 = 0; var10 < 2048; ++var10) {
                Player var23 = Client.players[var10];
                if (var23 != null) {
                    for (var12 = 0; var12 < 10; ++var12) {
                        var23.queueX[var12] -= destinationX;
                        var23.queueY[var12] -= destinationY;
                    }
                    var23.strictX -= 1423243648 * destinationX;
                    var23.strictY -= 2107549312 * destinationY;
                }
            }

            Client.floorLevel = 677607007 * floorLevel;
            Client.myPlayer.setLocation(var3, var4, false, (byte) 10);
            byte var22 = 0;
            byte var24 = 104;
            byte var25 = 1;
            if (destinationX < 0) {
                var22 = 103;
                var24 = -1;
                var25 = -1;
            }

            byte var13 = 0;
            byte var14 = 104;
            byte var15 = 1;
            if (destinationY < 0) {
                var13 = 103;
                var14 = -1;
                var15 = -1;
            }

            for (int var16 = var22; var16 != var24; var16 += var25) {
                for (int var17 = var13; var17 != var14; var17 += var15) {
                    int var18 = var16 + destinationX;
                    int var19 = var17 + destinationY;
                    for (int var20 = 0; var20 < 4; ++var20) {
                        if (var18 >= 0 && var19 >= 0 && var18 < 104 && var19 < 104) {
                            Client.groundItemDeques[var20][var16][var17] = Client.groundItemDeques[var20][var18][var19];
                            continue;
                        }
                        Client.groundItemDeques[var20][var16][var17] = null;
                    }
                }
            }

            for (LandscapeMod var26 = (LandscapeMod) Client.landscapeModDeque.next(); null != var26; var26 = (LandscapeMod) Client.landscapeModDeque.tail()) {
                var26.regionX -= 543354953 * destinationX;
                var26.regionY -= destinationY * 962520231;
                if (var26.regionX * -567016967 >= 0 && var26.regionY * 29917975 >= 0) {
                    if (var26.regionX * -567016967 < 104 && var26.regionY * 29917975 < 104) {
                        continue;
                    }
                }
                var26.delete();
            }

            if (0 != Client.destinationX * 1192318035) {
                Client.destinationX -= -950792229 * destinationX;
                Client.destinationY -= -475172701 * destinationY;
            }
            Client.fieldNx = 0;
            Client.cameraLocked = false;
            Client.fieldMc = 1782911609;
            Client.fieldHa.clear();
            Client.projectileDeque.clear();
        } catch (RuntimeException var21) {
            throw ClanMate.error(var21, "bq.ak(" + ')');
        }
    }

    public final void av(int var1) {
        try {
            RSGraphics.method229(this.fieldI, this.fieldB * -1687097855, this.fieldL * 1535411689);
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "bq.av(" + ')');
        }
    }

    public abstract void v(Graphics var1, int var2, int var3, int var4);

    public abstract void i(Graphics var1, int var2, int var3, int var4, int var5, byte var6);

    public abstract void a(int var1, int var2, Component var3, byte var4);
}
