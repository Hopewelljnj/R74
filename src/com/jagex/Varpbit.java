package com.jagex;

public class Varpbit extends DualNode {

    static Cache cache = new Cache(64);
    static ReferenceTable fieldA;
    static int[] fieldZ;
    public int varp;
    public int low;
    public int high;

    static final void method414(int DUMMY) {
        try {
            if (Client.lowMemory && Client.fieldCs * -526352391 != Client.floorLevel * 87713183) {
                classBq.method265(classDm.fieldDg * -1081192611, GraphicsStub.fieldDd * 39993143, Client.floorLevel * 87713183, Client.myPlayer.queueX[0], Client.myPlayer.queueY[0], 470196408);
            } else {
                if (Client.floorLevel * 87713183 != Client.fieldMc * -1209055177) {
                    Client.fieldMc = Client.floorLevel * 845531609;
                    int floor = Client.floorLevel * 87713183;
                    int[] buffer = UtilClass2.minimapStaticImg.pixels;
                    int var3 = buffer.length;

                    int regionY;
                    for (regionY = 0; regionY < var3; ++regionY) {
                        buffer[regionY] = 0;
                    }

                    //Draw underlay

                    int pos;
                    int regionX;
                    for (regionY = 1; regionY < 103; ++regionY) {

                        pos = 24628 + (103 - regionY) * 2048;

                        for (regionX = 1; regionX < 103; ++regionX) {

                            if ((classM.renderRules[floor][regionX][regionY] & 24) == 0) {
                                Client.landscape.drawMMTile(buffer, pos, 512, floor, regionX, regionY);
                            }

                            if (floor < 3 && 0 != (classM.renderRules[floor + 1][regionX][regionY] & 8)) {
                                Client.landscape.drawMMTile(buffer, pos, 512, 1 + floor, regionX, regionY);
                            }

                            pos += 4;

                        }
                    }

                    regionY = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
                    pos = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
                    UtilClass2.minimapStaticImg.v();

                    int var7;
                    for (regionX = 1; regionX < 103; ++regionX) {
                        for (var7 = 1; var7 < 103; ++var7) {
                            if (0 == (classM.renderRules[floor][var7][regionX] & 24)) {
                                GroundItem.drawObjectsMM(floor, var7, regionX, regionY, pos, -2095451891);
                            }

                            if (floor < 3) {
                                if (0 != (classM.renderRules[floor + 1][var7][regionX] & 8)) {
                                    GroundItem.drawObjectsMM(1 + floor, var7, regionX, regionY, pos, -2128009967);
                                }
                            }
                        }
                    }

                    Client.numMMIcons = 0;

                    for (regionX = 0; regionX < 104; ++regionX) {
                        for (var7 = 0; var7 < 104; ++var7) {
                            int var8 = Client.landscape.getTileDecoUID(Client.floorLevel * 87713183, regionX, var7);
                            if (0 != var8) {
                                var8 = var8 >> 14 & 32767;
                                int var9 = PlayerConfig.getObjectDef(var8, -1537509065).hintIconId * -1190877519;
                                if (var9 >= 0) {
                                    int var10 = regionX;
                                    int var11 = var7;
                                    if (22 != var9) {
                                        if (29 != var9) {
                                            if (34 != var9 && var9 != 36) {
                                                if (var9 != 46) {
                                                    if (47 != var9) {
                                                        if (48 != var9) {
                                                            int[][] flags = Client.collisionMaps[Client.floorLevel * 87713183].flags;
                                                            for (int var15 = 0; var15 < 10; ++var15) {
                                                                int var16 = (int) (Math.random() * 4.0D);
                                                                if (var16 == 0) {
                                                                    if (var10 > 0 && var10 > regionX - 3) {
                                                                        if (0 == (flags[var10 - 1][var11] & 19136776)) {
                                                                            --var10;
                                                                        }
                                                                    }
                                                                }

                                                                if (1 == var16 && var10 < 103) {

                                                                    if (var10 < regionX + 3) {


                                                                        if ((flags[1 + var10][var11] & 19136896) == 0) {


                                                                            ++var10;
                                                                        }
                                                                    }
                                                                }

                                                                if (2 == var16) {


                                                                    if (var11 > 0) {


                                                                        if (var11 > var7 - 3) {

                                                                            if ((flags[var10][var11 - 1] & 19136770) == 0) {


                                                                                --var11;
                                                                            }
                                                                        }
                                                                    }
                                                                }

                                                                if (var16 == 3) {

                                                                    if (var11 < 103 && var11 < var7 + 3) {


                                                                        if (0 == (flags[var10][1 + var11] & 19136800)) {

                                                                            ++var11;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }

                                    Client.MMIcons[Client.numMMIcons * 2042341781] = EntityMarker.hintIcons[var9];
                                    Client.MMIconRegionX[Client.numMMIcons * 2042341781] = var10;
                                    Client.MMIconRegionY[Client.numMMIcons * 2042341781] = var11;
                                    Client.numMMIcons += 1589860797;

                                }
                            }
                        }
                    }

                    Projectile.fieldPt.av(-1208128763);
                }

            }
        } catch (RuntimeException var17) {
            throw ClanMate.error(var17, "ag.c(" + ')');
        }
    }

    public static void clearCache() {
        try {
            cache.clear();
        } catch (RuntimeException var1) {
            throw ClanMate.error(var1, "em.l(" + ')');
        }
    }

    void i(Buffer var1, byte var2) {
        try {
            while (true) {
                int var3 = var1.readUByte();
                if (0 == var3) {
                    return;
                }

                this.b(var1, var3, 1914296951);
            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "ag.i(" + ')');
        }
    }

    void b(Buffer var1, int var2, int var3) {
        try {
            if (var2 == 1) {
                if (var3 <= 86742597) {
                    return;
                }

                this.varp = var1.readUShort() * -192107713;
                this.low = var1.readUByte() * -711373227;
                this.high = var1.readUByte() * -286134613;
            }

        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "ag.b(" + ')');
        }
    }

}
