package com.jagex;

public class CollisionMap {

    public static final int WALL_NW  = 1 << 1; // 1
    public static final int WALL_N   = 1 << 2; // 2
    public static final int WALL_NE  = 1 << 3; // 4
    public static final int WALL_E   = 1 << 4; // 8
    public static final int WALL_S   = 1 << 5; // 16
    public static final int WALL_SW  = 1 << 6; // 32
    public static final int WALL_W   = 1 << 7; // 64

    public static final int OBJECT   = 1 << 8; // 128


    public int[][] flags;
    int width;
    int insetX = 0;
    int insetY = 0;
    int height;


    public CollisionMap(int var1, int var2) {
        this.width = -1369693959 * var1;
        this.height = var2 * -174307257;
        this.flags = new int[this.width * -1938906807][this.height * 2123161975];
        this.a(-75011337);
    }

    public void v(int regionX, int regionY, int objectType, int objectRot, boolean var5, int DUMMY) {
        try {

            regionX -= this.insetX * 700876711;
            regionY -= this.insetY * 1399070565;

            if (objectType == 0) {

                if (objectRot == 0) {
                    this.addFlag(regionX, regionY, OBJECT, -879333608);
                    this.addFlag(regionX - 1, regionY, WALL_E, -781435028);
                }

                if (1 == objectRot) {
                    this.addFlag(regionX, regionY, WALL_N, -768112478);
                    this.addFlag(regionX, regionY + 1, WALL_SW, -1622588511);
                }

                if (2 == objectRot) {
                    this.addFlag(regionX, regionY, WALL_E, -1387261140);
                    this.addFlag(1 + regionX, regionY, OBJECT, -1714735038);
                }

                if (objectRot == 3) {
                    this.addFlag(regionX, regionY, WALL_SW, -845078857);
                    this.addFlag(regionX, regionY - 1, WALL_N, -1512064360);
                }

            }


            if (objectType == 1 || objectType == 3) {

                if (0 == objectRot) {
                    this.addFlag(regionX, regionY, WALL_NW, -1281147461);
                    this.addFlag(regionX - 1, regionY + 1, WALL_S, -1962460202);
                }

                if (1 == objectRot) {
                    this.addFlag(regionX, regionY, WALL_NE, -2088021107);
                    this.addFlag(regionX + 1, 1 + regionY, WALL_W, -1336533421);
                }

                if (2 == objectRot) {
                    this.addFlag(regionX, regionY, WALL_S, -700006155);
                    this.addFlag(regionX + 1, regionY - 1, WALL_NW, -1535972032);
                }

                if (3 == objectRot) {
                    this.addFlag(regionX, regionY, WALL_W, -1309138625);
                    this.addFlag(regionX - 1, regionY - 1, WALL_NE, -1598047754);
                }
            }


            if (objectType == 2) {

                if (objectRot == 0) {
                    this.addFlag(regionX, regionY, OBJECT | WALL_N, -1617010280);
                    this.addFlag(regionX - 1, regionY, WALL_E, -761494399);
                    this.addFlag(regionX, 1 + regionY, WALL_SW, -2025761834);
                }

                if (objectRot == 1) {
                    this.addFlag(regionX, regionY, WALL_E | WALL_N, -1381158764);
                    this.addFlag(regionX, regionY + 1, WALL_SW, -2091376000);
                    this.addFlag(regionX + 1, regionY, OBJECT, -1980911141);
                }

                if (2 == objectRot) {
                    this.addFlag(regionX, regionY, WALL_SW | WALL_NE, -1855156936);
                    this.addFlag(regionX + 1, regionY, OBJECT, -1707800643);
                    this.addFlag(regionX, regionY - 1, WALL_N, -741181502);
                }

                if (3 == objectRot) {
                    this.addFlag(regionX, regionY, OBJECT | WALL_SW, -1703914924);
                    this.addFlag(regionX, regionY - 1, WALL_N, -1518302199);
                    this.addFlag(regionX - 1, regionY, WALL_E, -1084537265);
                }

            }

            if (var5) {

                if (0 == objectType) {

                    if (objectRot == 0) {
                        this.addFlag(regionX, regionY, 65536, -1883603366);
                        this.addFlag(regionX - 1, regionY, 4096, -1651292989);
                    }

                    if (1 == objectRot) {
                        this.addFlag(regionX, regionY, 1024, -1705024779);
                        this.addFlag(regionX, regionY + 1, 16384, -1646777876);
                    }

                    if (objectRot == 2) {
                        this.addFlag(regionX, regionY, 4096, -1574578322);
                        this.addFlag(1 + regionX, regionY, 65536, -957499297);
                    }

                    if (3 == objectRot) {
                        this.addFlag(regionX, regionY, 16384, -1711998955);
                        this.addFlag(regionX, regionY - 1, 1024, -1534712496);
                    }

                }

                if (1 == objectType || 3 == objectType) {

                    if (objectRot == 1) {
                        this.addFlag(regionX, regionY, 2048, -812886973);
                        this.addFlag(regionX + 1, regionY + 1, '\u8000', -782418670);
                    }

                    if (objectRot == 2) {
                        this.addFlag(regionX, regionY, 8192, -959778626);
                        this.addFlag(1 + regionX, regionY - 1, 512, -1710535411);
                    }

                    if (3 == objectRot) {
                        this.addFlag(regionX, regionY, '\u8000', -1366282430);
                        this.addFlag(regionX - 1, regionY - 1, 2048, -2089279483);
                    }

                }

                if (2 == objectType) {

                    if (0 == objectRot) {
                        this.addFlag(regionX, regionY, 66560, -1259035236);
                        this.addFlag(regionX - 1, regionY, 4096, -1147057342);
                        this.addFlag(regionX, regionY + 1, 16384, -1905094373);
                    }

                    if (objectRot == 1) {
                        this.addFlag(regionX, regionY, 5120, -1303937801);
                        this.addFlag(regionX, 1 + regionY, 16384, -1536937975);
                        this.addFlag(regionX + 1, regionY, 65536, -1234246096);
                    }

                    if (2 == objectRot) {
                        this.addFlag(regionX, regionY, 20480, -683512998);
                        this.addFlag(regionX + 1, regionY, 65536, -1765947598);
                        this.addFlag(regionX, regionY - 1, 1024, -1948907660);
                    }

                    if (objectRot == 3) {
                        this.addFlag(regionX, regionY, 81920, -2006072016);
                        this.addFlag(regionX, regionY - 1, 1024, -1778871196);
                        this.addFlag(regionX - 1, regionY, 4096, -981127968);
                    }

                }
            }

        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "hb.v(" + ')');
        }
    }

    public void i(int var1, int var2, int var3, int var4, boolean var5, int var6) {
        try {
            int var7 = OBJECT;
            if (var5) {
                if (var6 <= 16711680) {
                    throw new IllegalStateException();
                }

                var7 += 131072;
            }

            var1 -= this.insetX * 700876711;
            var2 -= this.insetY * 1399070565;

            for (int var8 = var1; var8 < var1 + var3; ++var8) {
                if (var6 <= 16711680) {
                    throw new IllegalStateException();
                }

                if (var8 >= 0) {
                    if (var6 <= 16711680) {
                        throw new IllegalStateException();
                    }

                    if (var8 < this.width * -1938906807) {
                        if (var6 <= 16711680) {
                            throw new IllegalStateException();
                        }

                        for (int var9 = var2; var9 < var4 + var2; ++var9) {
                            if (var6 <= 16711680) {
                                throw new IllegalStateException();
                            }

                            if (var9 >= 0) {
                                if (var6 <= 16711680) {
                                    throw new IllegalStateException();
                                }

                                if (var9 < this.height * 2123161975) {
                                    if (var6 <= 16711680) {
                                        throw new IllegalStateException();
                                    }

                                    this.addFlag(var8, var9, var7, -1402202961);
                                }
                            }
                        }
                    }
                }
            }

        } catch (RuntimeException var10) {
            throw ClanMate.error(var10, "hb.i(" + ')');
        }
    }

    public void b(int var1, int var2, int var3) {
        try {
            var1 -= this.insetX * 700876711;
            var2 -= this.insetY * 1399070565;
            this.flags[var1][var2] |= 2097152;
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "hb.b(" + ')');
        }
    }

    void addFlag(int regionX, int regionY, int flag, int var4) {
        try {
            this.flags[regionX][regionY] |= flag;
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "hb.m(" + ')');
        }
    }

    public void removeObject(int regionX, int regionY, int sizeX, int sizeY, int rotation, boolean unknown, int DUMMY) {
        try {

            int var8 = OBJECT;
            if (unknown) {
                var8 += 131072;
            }

            int var9;
            label73:
            {
                regionX -= this.insetX * 700876711;
                regionY -= this.insetY * 1399070565;
                if (1 != rotation) {
                    if (rotation != 3) {
                        break label73;
                    }
                }

                var9 = sizeX;
                sizeX = sizeY;
                sizeY = var9;
            }

            for (var9 = regionX; var9 < regionX + sizeX; ++var9) {

                if (var9 >= 0) {

                    if (var9 < this.width * -1938906807) {
                        for (int var10 = regionY; var10 < sizeY + regionY; ++var10) {

                            if (var10 >= 0) {


                                if (var10 < this.height * 2123161975) {

                                    this.removeFlag(var9, var10, var8, (byte) 101);
                                }
                            }
                        }
                    }
                }
            }

        } catch (RuntimeException var11) {
            throw ClanMate.error(var11, "hb.e(" + ')');
        }
    }

    void removeFlag(int regionX, int regionY, int flag, byte var4) {
        try {
            this.flags[regionX][regionY] &= ~flag;
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "hb.n(" + ')');
        }
    }

    public void s(int var1, int var2, byte var3) {
        try {
            var1 -= this.insetX * 700876711;
            var2 -= this.insetY * 1399070565;
            this.flags[var1][var2] &= -262145;
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "hb.s(" + ')');
        }
    }

    public void w(int regionX, int regionY, int objectType, int objectRot, boolean unknown, int DUMMY) {
        try {

            regionX -= this.insetX * 700876711;
            regionY -= this.insetY * 1399070565;

            if (objectType == 0) {

                if (objectRot == 0) {
                    this.removeFlag(regionX, regionY, 128, (byte) 101);
                    this.removeFlag(regionX - 1, regionY, 8, (byte) 101);
                }

                if (1 == objectRot) {
                    this.removeFlag(regionX, regionY, 2, (byte) 101);
                    this.removeFlag(regionX, 1 + regionY, 32, (byte) 101);
                }

                if (objectRot == 2) {
                    this.removeFlag(regionX, regionY, 8, (byte) 101);
                    this.removeFlag(1 + regionX, regionY, 128, (byte) 101);
                }

                if (3 == objectRot) {
                    this.removeFlag(regionX, regionY, 32, (byte) 101);
                    this.removeFlag(regionX, regionY - 1, 2, (byte) 101);
                }

            }


            if (objectType == 1 || objectType == 3) {

                if (objectRot == 0) {
                    this.removeFlag(regionX, regionY, 1, (byte) 101);
                    this.removeFlag(regionX - 1, regionY + 1, 16, (byte) 101);
                }

                if (objectRot == 1) {
                    this.removeFlag(regionX, regionY, 4, (byte) 101);
                    this.removeFlag(1 + regionX, 1 + regionY, 64, (byte) 101);
                }

                if (objectRot == 2) {
                    this.removeFlag(regionX, regionY, 16, (byte) 101);
                    this.removeFlag(regionX + 1, regionY - 1, 1, (byte) 101);
                }

                if (3 == objectRot) {
                    this.removeFlag(regionX, regionY, 64, (byte) 101);
                    this.removeFlag(regionX - 1, regionY - 1, 4, (byte) 101);
                }

            }

            if (objectType == 2) {

                if (objectRot == 0) {
                    this.removeFlag(regionX, regionY, 130, (byte) 101);
                    this.removeFlag(regionX - 1, regionY, 8, (byte) 101);
                    this.removeFlag(regionX, regionY + 1, 32, (byte) 101);
                }

                if (1 == objectRot) {
                    this.removeFlag(regionX, regionY, 10, (byte) 101);
                    this.removeFlag(regionX, 1 + regionY, 32, (byte) 101);
                    this.removeFlag(1 + regionX, regionY, 128, (byte) 101);
                }

                if (objectRot == 2) {
                    this.removeFlag(regionX, regionY, 40, (byte) 101);
                    this.removeFlag(regionX + 1, regionY, 128, (byte) 101);
                    this.removeFlag(regionX, regionY - 1, 2, (byte) 101);
                }

                if (objectRot == 3) {
                    this.removeFlag(regionX, regionY, 160, (byte) 101);
                    this.removeFlag(regionX, regionY - 1, 2, (byte) 101);
                    this.removeFlag(regionX - 1, regionY, 8, (byte) 101);
                }

            }

            if (unknown) {


                if (objectType == 0) {

                    if (objectRot == 0) {
                        this.removeFlag(regionX, regionY, 65536, (byte) 101);
                        this.removeFlag(regionX - 1, regionY, 4096, (byte) 101);
                    }

                    if (1 == objectRot) {
                        this.removeFlag(regionX, regionY, 1024, (byte) 101);
                        this.removeFlag(regionX, 1 + regionY, 16384, (byte) 101);
                    }

                    if (2 == objectRot) {
                        this.removeFlag(regionX, regionY, 4096, (byte) 101);
                        this.removeFlag(1 + regionX, regionY, 65536, (byte) 101);
                    }

                    if (objectRot == 3) {
                        this.removeFlag(regionX, regionY, 16384, (byte) 101);
                        this.removeFlag(regionX, regionY - 1, 1024, (byte) 101);
                    }

                }


                if (objectType == 1 || objectType == 3) {

                    if (0 == objectRot) {
                        this.removeFlag(regionX, regionY, 512, (byte) 101);
                        this.removeFlag(regionX - 1, 1 + regionY, 8192, (byte) 101);
                    }

                    if (objectRot == 1) {
                        this.removeFlag(regionX, regionY, 2048, (byte) 101);
                        this.removeFlag(1 + regionX, 1 + regionY, '\u8000', (byte) 101);
                    }

                    if (objectRot == 2) {
                        this.removeFlag(regionX, regionY, 8192, (byte) 101);
                        this.removeFlag(1 + regionX, regionY - 1, 512, (byte) 101);
                    }

                    if (objectRot == 3) {
                        this.removeFlag(regionX, regionY, '\u8000', (byte) 101);
                        this.removeFlag(regionX - 1, regionY - 1, 2048, (byte) 101);
                    }

                }


                if (2 == objectType) {

                    if (0 == objectRot) {
                        this.removeFlag(regionX, regionY, 66560, (byte) 101);
                        this.removeFlag(regionX - 1, regionY, 4096, (byte) 101);
                        this.removeFlag(regionX, 1 + regionY, 16384, (byte) 101);
                    }

                    if (objectRot == 1) {
                        this.removeFlag(regionX, regionY, 5120, (byte) 101);
                        this.removeFlag(regionX, regionY + 1, 16384, (byte) 101);
                        this.removeFlag(regionX + 1, regionY, 65536, (byte) 101);
                    }

                    if (2 == objectRot) {
                        this.removeFlag(regionX, regionY, 20480, (byte) 101);
                        this.removeFlag(regionX + 1, regionY, 65536, (byte) 101);
                        this.removeFlag(regionX, regionY - 1, 1024, (byte) 101);
                    }

                    if (objectRot == 3) {
                        this.removeFlag(regionX, regionY, 81920, (byte) 101);
                        this.removeFlag(regionX, regionY - 1, 1024, (byte) 101);
                        this.removeFlag(regionX - 1, regionY, 4096, (byte) 101);
                    }

                }
            }

        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "hb.w(" + ')');
        }
    }

    public void a(int var1) {
        try {
            for (int var2 = 0; var2 < this.width * -1938906807; ++var2) {
                for (int var3 = 0; var3 < this.height * 2123161975; ++var3) {
                    if (var2 != 0) {
                        if (var3 != 0) {
                            if (var2 < this.width * -1938906807 - 5) {
                                if (var3 < this.height * 2123161975 - 5) {
                                    this.flags[var2][var3] = 16777216; //
                                    continue;
                                }
                            }
                        }
                    }

                    this.flags[var2][var3] = 16777215; //All
                }
            }

        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "hb.a(" + ')');
        }
    }

    public void l(int var1, int var2, int var3) {
        try {
            var1 -= this.insetX * 700876711;
            var2 -= this.insetY * 1399070565;
            this.flags[var1][var2] |= 262144;
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "hb.l(" + ')');
        }
    }
}
