package com.jagex;

public class Landscape {

    static final int[] fieldAb = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
    static final int[] fieldAj = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
    static final int[] fieldAf = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
    static final int[] fieldAc = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
    static final int[] fieldAp = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
    static final int[] fieldAy = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
    static final int[] fieldBu = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
    public static boolean fieldA = true;
    public static int selectedTileRegionX = -1;
    public static int selectedTileRegionY = -1;
    static int fieldAq = 0;
    static boolean[][][][] visibilityMap = new boolean[8][32][51][51];
    static int cameraRegionY;
    static int cameraY;
    static int fieldQ = 0;
    static int fieldT = 0;
    static NodeDeque tileRenderDeque = new NodeDeque();
    static int renderZoneMinX;
    static int renderZoneMaxX;
    static int renderZoneMinY;
    static int renderZoneMaxY;
    static int cameraRegionX;
    static int cameraX;
    static int mouseY = 0;
    static int cameraZ;
    static int screenCenterY;
    static int landscapeTick;
    static int yawCos;
    static EntityMarker[] fieldAv = new EntityMarker[100];
    static boolean checkMouse = false;
    static int mouseX = 0;
    static int fieldAw = 4;
    static int fieldAd = 0;
    static classCe[] fieldAu = new classCe[500];
    static int pitchCos;
    static int[] fieldAo = new int[fieldAw];
    static int pitchSin;
    static boolean[][] vismap;
    static int screenCenterX;
    static int yawSin;
    static int viewportMinX;
    static int viewportMinY;
    static int viewportMaxX;
    static int viewportMaxY;
    static classCe[][] fieldAg = new classCe[fieldAw][500];
    EntityMarker[] tempEntities = new EntityMarker[5000];
    int floors;
    int sizeX;
    int[][][] tileHeights;
    int[][][] fieldS;
    int fieldW = 0;
    int numTemp = 0;
    int sizeY;
    LandscapeTile[][][] tiles;
    int[][] fieldBi = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
    int[][] fieldBo = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};


    public Landscape(int numFloors, int sizeX, int sizeY, int[][][] tileHeights) {
        this.floors = numFloors;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.tiles = new LandscapeTile[numFloors][sizeX][sizeY];
        this.fieldS = new int[numFloors][sizeX + 1][sizeY + 1];
        this.tileHeights = tileHeights;
        this.clear();
    }

    public static void method298(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        classCe var8 = new classCe();
        var8.fieldA = var2 / 128 * -1266584775;
        var8.fieldV = var3 / 128 * -1211536643;
        var8.fieldI = var4 / 128 * 1648377379;
        var8.fieldB = var5 / 128 * -190476797;
        var8.fieldL = var1 * -1623240481;
        var8.fieldM = var2 * -119336183;
        var8.fieldW = var3 * 1552489773;
        var8.fieldE = var4 * 1489100575;
        var8.fieldN = var5 * 1392955601;
        var8.fieldS = var6 * -921913475;
        var8.fieldK = var7 * -1947143447;
        fieldAg[var0][fieldAo[var0]++] = var8;
    }

    public static void buildVisibilityMap(int[] var0, int var1, int var2, int screenWidth, int screenHeight) {
        viewportMinX = 0;
        viewportMinY = 0;
        viewportMaxX = screenWidth;
        viewportMaxY = screenHeight;
        screenCenterX = screenWidth / 2;
        screenCenterY = screenHeight / 2;
        boolean[][][][] var5 = new boolean[9][32][53][53];

        int pitch;
        int yaw;
        int var8;
        int var9;
        int var11;
        int var12;
        for (pitch = 128; pitch <= 384; pitch += 32) {
            for (yaw = 0; yaw < 2048; yaw += 64) {
                pitchSin = RSGraphics2D.SIN_TABLE[pitch];
                pitchCos = RSGraphics2D.COS_TABLE[pitch];
                yawSin = RSGraphics2D.SIN_TABLE[yaw];
                yawCos = RSGraphics2D.COS_TABLE[yaw];
                var8 = (pitch - 128) / 32;
                var9 = yaw / 64;

                for (int var10 = -26; var10 <= 26; ++var10) {
                    var11 = -26;

                    while (var11 <= 26) {
                        var12 = var10 * 128;
                        int var13 = var11 * 128;
                        boolean var14 = false;
                        int var15 = -var1;

                        while (true) {
                            if (var15 <= var2) {
                                if (!isPointVisible(var12, var0[var8] + var15, var13)) {
                                    var15 += 128;
                                    continue;
                                }

                                var14 = true;
                            }

                            var5[var8][var9][var10 + 25 + 1][var11 + 25 + 1] = var14;
                            ++var11;
                            break;
                        }
                    }
                }
            }
        }

        for (pitch = 0; pitch < 8; ++pitch) {
            for (yaw = 0; yaw < 32; ++yaw) {
                for (var8 = -25; var8 < 25; ++var8) {
                    var9 = -25;

                    while (var9 < 25) {
                        boolean var16 = false;
                        var11 = -1;

                        label85:
                        while (true) {
                            if (var11 <= 1) {
                                var12 = -1;

                                while (true) {
                                    if (var12 > 1) {
                                        ++var11;
                                        continue label85;
                                    }

                                    if (var5[pitch][yaw][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                                        var16 = true;
                                        break;
                                    }

                                    if (var5[pitch][(yaw + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                                        var16 = true;
                                        break;
                                    }

                                    if (var5[pitch + 1][yaw][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                                        var16 = true;
                                        break;
                                    }

                                    if (var5[pitch + 1][(yaw + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                                        var16 = true;
                                        break;
                                    }

                                    ++var12;
                                }
                            }

                            visibilityMap[pitch][yaw][var8 + 25][var9 + 25] = var16;
                            ++var9;
                            break;
                        }
                    }
                }
            }
        }

    }

    static boolean isPointVisible(int var0, int var1, int var2) {
        int var3 = var2 * yawSin + var0 * yawCos >> 16;
        int var4 = var2 * yawCos - var0 * yawSin >> 16;
        int var5 = var1 * pitchSin + var4 * pitchCos >> 16;
        int var6 = var1 * pitchCos - var4 * pitchSin >> 16;
        if (var5 >= 50 && var5 <= 3500) {
            int var7 = screenCenterX + (var3 << 9) / var5;
            int var8 = screenCenterY + (var6 << 9) / var5;
            return var7 >= viewportMinX && var7 <= viewportMaxX && var8 >= viewportMinY && var8 <= viewportMaxY;
        } else {
            return false;
        }
    }

    static final int method301(int var0, int var1) {
        var1 = var1 * (var0 & 127) >> 7;
        if (var1 < 2) {
            var1 = 2;
        } else if (var1 > 126) {
            var1 = 126;
        }

        return (var0 & '\uff80') + var1;
    }

    static final int getTileHeight(int strictX, int strictY, int floor) {
        try {
            int regionX = strictX >> 7;
            int regionY = strictY >> 7;
            if (regionX >= 0 && regionY >= 0 && regionX <= 103 && regionY <= 103) {
                int level = floor;
                if (floor < 3 && 2 == (classM.renderRules[1][regionX][regionY] & 0x2)) {
                    level = floor + 1;
                }
                int var7 = strictX & 0x7f;
                int var8 = strictY & 0x7f;
                int var9 = classM.tileHeights[level][regionX + 1][regionY] * var7 + (128 - var7) * classM.tileHeights[level][regionX][regionY] >> 7;
                int var10 = classM.tileHeights[level][regionX][1 + regionY] * (128 - var7) + classM.tileHeights[level][1 + regionX][regionY + 1] * var7 >> 7;
                return var8 * var10 + var9 * (128 - var8) >> 7;
            }
            return 0;
        } catch (RuntimeException var11) {
            throw ClanMate.error(var11, "cg.ad(" + ')');
        }
    }

    public void clear() {
        int var1;
        int var2;
        for (var1 = 0; var1 < this.floors; ++var1) {
            for (var2 = 0; var2 < this.sizeX; ++var2) {
                for (int var3 = 0; var3 < this.sizeY; ++var3) {
                    this.tiles[var1][var2][var3] = null;
                }
            }
        }

        for (var1 = 0; var1 < fieldAw; ++var1) {
            for (var2 = 0; var2 < fieldAo[var1]; ++var2) {
                fieldAg[var1][var2] = null;
            }

            fieldAo[var1] = 0;
        }

        for (var1 = 0; var1 < this.numTemp; ++var1) {
            this.tempEntities[var1] = null;
        }

        this.numTemp = 0;

        for (var1 = 0; var1 < fieldAv.length; ++var1) {
            fieldAv[var1] = null;
        }

    }

    public void v(int var1) {
        this.fieldW = var1;

        for (int var2 = 0; var2 < this.sizeX; ++var2) {
            for (int var3 = 0; var3 < this.sizeY; ++var3) {
                if (this.tiles[var1][var2][var3] == null) {
                    this.tiles[var1][var2][var3] = new LandscapeTile(var1, var2, var3);
                }
            }
        }

    }

    public void i(int var1, int var2) {
        LandscapeTile var3 = this.tiles[0][var1][var2];

        for (int var4 = 0; var4 < 3; ++var4) {
            LandscapeTile var5 = this.tiles[var4][var1][var2] = this.tiles[var4 + 1][var1][var2];
            if (var5 != null) {
                var5.fieldA -= 1656574747;

                for (int var6 = 0; var6 < var5.entityCount * -1552839441; ++var6) {
                    EntityMarker var7 = var5.markers[var6];
                    if ((var7.uid * -1211010875 >> 29 & 3) == 2 && var7.rootRegionX * -451326837 == var1 && var7.rootRegionY * -1669424973 == var2) {
                        var7.floor -= -72758693;
                    }
                }
            }
        }

        if (this.tiles[0][var1][var2] == null) {
            this.tiles[0][var1][var2] = new LandscapeTile(0, var1, var2);
        }

        this.tiles[0][var1][var2].fieldP = var3;
        this.tiles[3][var1][var2] = null;
    }

    public void l(int var1, int var2, int var3, int var4) {
        LandscapeTile var5 = this.tiles[var1][var2][var3];
        if (var5 != null) {
            this.tiles[var1][var2][var3].fieldO = var4 * 163694213;
        }
    }

    public void setTileDecoration(int floor, int regionX, int regionY, int height, Renderable deco, int uid, int cfg) {
        if (deco != null) {
            TileDecoration var8 = new TileDecoration();
            var8.deco = deco;
            var8.strictX = regionX * 72463232 + 36231616;
            var8.strictY = regionY * -665823616 + -332911808;
            var8.height = height * 312510477;
            var8.uid = uid * 191714433;
            var8.cfg = cfg * 1540572789;
            if (this.tiles[floor][regionX][regionY] == null) {
                this.tiles[floor][regionX][regionY] = new LandscapeTile(floor, regionX, regionY);
            }

            this.tiles[floor][regionX][regionY].tileDeco = var8;
        }
    }

    public int getBoundaryDecUid(int floor, int regionX, int regionY) {
        LandscapeTile var4 = this.tiles[floor][regionX][regionY];
        return var4 != null && var4.boundDeco != null ? var4.boundDeco.uid * -1933340315 : 0;
    }

    public void setBoundaryDecoration(int floor, int regionX, int regionY, int height,
                                      Renderable var5, Renderable var6,
                                      int var7, int var8,
                                      int insetX, int insetY,
                                      int uid, int cfg) {
        if (var5 != null) {
            BoundaryDecoration var13 = new BoundaryDecoration();
            var13.uid = uid * -454477715;
            var13.cfg = cfg * 2114849083;
            var13.strictX = regionX * -894210688 + 1700378304;
            var13.strictY = regionY * 1834006144 + -1230480576;
            var13.height = height * 774856423;
            var13.fieldE = var5;
            var13.fieldN = var6;
            var13.fieldB = var7 * -1412086121;
            var13.fieldL = var8 * 46344111;
            var13.insetX = insetX * 295623597;
            var13.insetY = insetY * 1365635909;

            for (int var14 = floor; var14 >= 0; --var14) {
                if (this.tiles[var14][regionX][regionY] == null) {
                    this.tiles[var14][regionX][regionY] = new LandscapeTile(var14, regionX, regionY);
                }
            }

            this.tiles[floor][regionX][regionY].boundDeco = var13;
        }
    }

    public boolean k(int floor, int regionX, int regionY, int height, int sizeX, int sizeY, Renderable var7, int rotation, int uid, int cfg) {
        if (var7 == null) {
            return true;
        }
        int strictX = regionX * 128 + 64 * sizeX;
        int strictY = regionY * 128 + 64 * sizeY;
        return this.addEntity(floor, regionX, regionY, sizeX, sizeY, strictX, strictY, height, var7, rotation, false, uid, cfg);
    }

    public boolean addNpcEntityMarker(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, int uid, boolean var9) {
        if (var6 == null) {
            return true;
        }
        int var10 = var2 - var5;
        int var11 = var3 - var5;
        int var12 = var2 + var5;
        int var13 = var3 + var5;
        if (var9) {
            if (var7 > 640 && var7 < 1408) {
                var13 += 128;
            }

            if (var7 > 1152 && var7 < 1920) {
                var12 += 128;
            }

            if (var7 > 1664 || var7 < 384) {
                var11 -= 128;
            }

            if (var7 > 128 && var7 < 896) {
                var10 -= 128;
            }
        }

        var10 /= 128;
        var11 /= 128;
        var12 /= 128;
        var13 /= 128;
        return this.addEntity(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, uid, 0);
    }

    boolean addEntity(int floor, int regionX, int regionY,
                      int sizeX, int sizeY,
                      int strictX, int strictY, int height,
                      Renderable entity, int orientation,
                      boolean temp, int uid, int cfg) {

        int var15;
        for (int var14 = regionX; var14 < regionX + sizeX; ++var14) {
            for (var15 = regionY; var15 < regionY + sizeY; ++var15) {
                if (var14 < 0 || var15 < 0 || var14 >= this.sizeX || var15 >= this.sizeY) {
                    return false;
                }

                LandscapeTile var16 = this.tiles[floor][var14][var15];
                if (var16 != null && var16.entityCount * -1552839441 >= 5) {
                    return false;
                }
            }
        }

        EntityMarker var20 = new EntityMarker();
        var20.uid = uid * -1013936627;
        var20.cfg = cfg * -188694549;
        var20.floor = floor * -72758693;
        var20.strictX = strictX * 1786424391;
        var20.strictY = strictY * 318647065;
        var20.height = height * -1916125979;
        var20.entity = entity;
        var20.orientation = orientation * -1641894085;
        var20.rootRegionX = regionX * -2029798621;
        var20.rootRegionY = regionY * -1277307269;
        var20.maxX = (regionX + sizeX - 1) * 1144714805;
        var20.maxY = (regionY + sizeY - 1) * 765823083;

        for (var15 = regionX; var15 < regionX + sizeX; ++var15) {
            for (int var21 = regionY; var21 < regionY + sizeY; ++var21) {
                int var17 = 0;
                if (var15 > regionX) {
                    ++var17;
                }

                if (var15 < regionX + sizeX - 1) {
                    var17 += 4;
                }

                if (var21 > regionY) {
                    var17 += 8;
                }

                if (var21 < regionY + sizeY - 1) {
                    var17 += 2;
                }

                for (int var18 = floor; var18 >= 0; --var18) {
                    if (this.tiles[var18][var15][var21] == null) {
                        this.tiles[var18][var15][var21] = new LandscapeTile(var18, var15, var21);
                    }
                }

                LandscapeTile var22 = this.tiles[floor][var15][var21];
                var22.markers[var22.entityCount * -1552839441] = var20;
                var22.fieldD[var22.entityCount * -1552839441] = var17;
                var22.fieldX = (var22.fieldX * -1790942883 | var17) * 1218902773;
                var22.entityCount += -2073091569;
            }
        }

        if (temp) {
            this.tempEntities[this.numTemp++] = var20;
        }

        return true;
    }

    public void clearTempEntities() {
        for (int var1 = 0; var1 < this.numTemp; ++var1) {
            EntityMarker var2 = this.tempEntities[var1];
            this.removeEntity(var2);
            this.tempEntities[var1] = null;
        }

        this.numTemp = 0;
    }

    public void t(int floor, int regionX, int regionY, int var4) {
        LandscapeTile var5 = this.tiles[floor][regionX][regionY];
        if (var5 != null) {
            BoundaryDecoration var6 = var5.boundDeco;
            if (var6 != null) {
                var6.insetX = var6.insetX * 360398885 * var4 / 16 * 295623597;
                var6.insetY = var6.insetY * -1686394995 * var4 / 16 * 1365635909;
            }
        }
    }

    public void removeBoundaryDecoration(int floor, int regionX, int regionY) {
        LandscapeTile var4 = this.tiles[floor][regionX][regionY];
        if (var4 != null) {
            var4.boundDeco = null;
        }
    }

    public void removeObject(int floor, int regionX, int regionY) {
        LandscapeTile var4 = this.tiles[floor][regionX][regionY];
        if (var4 != null) {
            for (int var5 = 0; var5 < var4.entityCount * -1552839441; ++var5) {
                EntityMarker var6 = var4.markers[var5];
                if ((var6.uid * -1211010875 >> 29 & 3) == 2 && var6.rootRegionX * -451326837 == regionX && var6.rootRegionY * -1669424973 == regionY) {
                    this.removeEntity(var6);
                    return;
                }
            }
        }
    }

    public Boundary getBoundaryAt(int floor, int regionX, int regionY) {
        LandscapeTile var4 = this.tiles[floor][regionX][regionY];
        return var4 == null ? null : var4.boundary;
    }

    public EntityMarker getObjectAt(int floor, int regionX, int regionY) {
        LandscapeTile var4 = this.tiles[floor][regionX][regionY];
        if (var4 == null) {
            return null;
        } else {
            for (int var5 = 0; var5 < var4.entityCount * -1552839441; ++var5) {
                EntityMarker var6 = var4.markers[var5];
                if ((var6.uid * -1211010875 >> 29 & 3) == 2 && var6.rootRegionX * -451326837 == regionX && var6.rootRegionY * -1669424973 == regionY) {
                    return var6;
                }
            }

            return null;
        }
    }

    public TileDecoration c(int var1, int var2, int var3) {
        LandscapeTile var4 = this.tiles[var1][var2][var3];
        return var4 != null && var4.tileDeco != null ? var4.tileDeco : null;
    }

    public int getBoundaryUID(int var1, int var2, int var3) {
        LandscapeTile var4 = this.tiles[var1][var2][var3];
        return var4 != null && var4.boundary != null ? var4.boundary.uid * -1483668077 : 0;
    }

    public int getObjectUID(int floor, int regionX, int regionY) {
        LandscapeTile var4 = this.tiles[floor][regionX][regionY];
        if (var4 == null) {
            return 0;
        } else {
            for (int var5 = 0; var5 < var4.entityCount * -1552839441; ++var5) {
                EntityMarker var6 = var4.markers[var5];
                if ((var6.uid * -1211010875 >> 29 & 3) == 2 && var6.rootRegionX * -451326837 == regionX && var6.rootRegionY * -1669424973 == regionY) {
                    return var6.uid * -1211010875;
                }
            }

            return 0;
        }
    }

    public int getTileDecoUID(int floor, int regionX, int regionY) {
        LandscapeTile var4 = this.tiles[floor][regionX][regionY];
        return var4 != null && var4.tileDeco != null ? var4.tileDeco.uid * 2119625601 : 0;
    }

    public int configForUid(int var1, int var2, int var3, int var4) {
        LandscapeTile var5 = this.tiles[var1][var2][var3];
        if (var5 == null) {
            return -1;
        } else if (var5.boundary != null && var5.boundary.uid * -1483668077 == var4) {
            return var5.boundary.cfg * 1203523989 & 255;
        } else if (var5.boundDeco != null && var5.boundDeco.uid * -1933340315 == var4) {
            return var5.boundDeco.cfg * -847517709 & 255;
        } else if (var5.tileDeco != null && var5.tileDeco.uid * 2119625601 == var4) {
            return var5.tileDeco.cfg * -436741667 & 255;
        } else {
            for (int var6 = 0; var6 < var5.entityCount * -1552839441; ++var6) {
                if (var5.markers[var6].uid * -1211010875 == var4) {
                    return var5.markers[var6].cfg * -1327140669 & 255;
                }
            }

            return -1;
        }
    }

    public boolean addPlayerMarker(int floor, int strictX, int strictY, int height, int var5, Renderable var6, int orientation, int uid, int regionX, int regionY, int maxRegionX, int maxRegionY) {
        return var6 == null || this.addEntity(floor, regionX, regionY, maxRegionX - regionX + 1, maxRegionY - regionY + 1, strictX, strictY, height, var6, orientation, true, uid, 0);
    }

    void setTilePaint(TilePaint paint, int floor, int pitchSin, int pitchCos, int yawSin, int yawCos, int regionX, int regionY) {
        int var9;
        int TLx = var9 = (regionX << 7) - cameraX;
        int var11;
        int var12 = var11 = (regionY << 7) - cameraY;
        int var13;
        int var14 = var13 = TLx + 128;
        int var15;
        int var16 = var15 = var12 + 128;

        int TLy = this.tileHeights[floor][regionX][regionY] - cameraZ;
        int var18 = this.tileHeights[floor][regionX + 1][regionY] - cameraZ;
        int var19 = this.tileHeights[floor][regionX + 1][regionY + 1] - cameraZ;
        int var20 = this.tileHeights[floor][regionX][regionY + 1] - cameraZ;

        int var21 = var12 * yawSin + TLx * yawCos >> 16;
        var12 = var12 * yawCos - TLx * yawSin >> 16;
        TLx = var21;
        var21 = TLy * pitchCos - var12 * pitchSin >> 16;
        var12 = TLy * pitchSin + var12 * pitchCos >> 16;
        TLy = var21;
        if (var12 >= 50) {
            var21 = var11 * yawSin + var14 * yawCos >> 16;
            var11 = var11 * yawCos - var14 * yawSin >> 16;
            var14 = var21;
            var21 = var18 * pitchCos - var11 * pitchSin >> 16;
            var11 = var18 * pitchSin + var11 * pitchCos >> 16;
            var18 = var21;
            if (var11 >= 50) {
                var21 = var16 * yawSin + var13 * yawCos >> 16;
                var16 = var16 * yawCos - var13 * yawSin >> 16;
                var13 = var21;
                var21 = var19 * pitchCos - var16 * pitchSin >> 16;
                var16 = var19 * pitchSin + var16 * pitchCos >> 16;
                var19 = var21;
                if (var16 >= 50) {
                    var21 = var15 * yawSin + var9 * yawCos >> 16;
                    var15 = var15 * yawCos - var9 * yawSin >> 16;
                    var9 = var21;
                    var21 = var20 * pitchCos - var15 * pitchSin >> 16;
                    var15 = var20 * pitchSin + var15 * pitchCos >> 16;
                    if (var15 >= 50) {

                        int topLeftX = RSGraphics2D.screenCenterX + (TLx << 9) / var12;
                        int topLeftY = RSGraphics2D.screenCenterY + (TLy << 9) / var12;

                        int topRightX = RSGraphics2D.screenCenterX + (var14 << 9) / var11;
                        int topRightY = RSGraphics2D.screenCenterY + (var18 << 9) / var11;

                        int bottomRightX = RSGraphics2D.screenCenterX + (var13 << 9) / var16;
                        int bottomRightY = RSGraphics2D.screenCenterY + (var19 << 9) / var16;

                        int bottomLeftX = RSGraphics2D.screenCenterX + (var9 << 9) / var15;
                        int bottomLeftY = RSGraphics2D.screenCenterY + (var21 << 9) / var15;

                        RSGraphics2D.alpha = 0;
                        int var30;

                        // tile.frontFacingA = true
                        // tile.frontFacingB = true

                        if ((bottomRightX - bottomLeftX) * (topRightY - bottomLeftY) - (bottomRightY - bottomLeftY)
                                * (topRightX - bottomLeftX) > 0) { //Counter clockwise, front facing triangle
                            RSGraphics2D.offscreen = false;
                            if (bottomRightX < 0 || bottomLeftX < 0 || topRightX < 0 || bottomRightX > RSGraphics2D.fieldJ || bottomLeftX > RSGraphics2D.fieldJ || topRightX > RSGraphics2D.fieldJ) {
                                RSGraphics2D.offscreen = true;
                            }

                            if (checkMouse && this.isPointInTile(mouseX, mouseY, bottomRightY, bottomLeftY, topRightY,
                                    bottomRightX, bottomLeftX, topRightX)) {
                                selectedTileRegionX = regionX;
                                selectedTileRegionY = regionY;
                            }

                            int old0 = paint.fieldI;
                            int old1 = paint.fieldB;
                            int old2 = paint.fieldV;


                            if (paint.texture * -1278797823 == -1) {
                                if (paint.fieldI * 2070189115 != 12345678) {
                                    RSGraphics2D.method316(bottomRightY, bottomLeftY, topRightY, bottomRightX, bottomLeftX, topRightX, paint.fieldI * 2070189115, paint.fieldB * 1390567799, paint.fieldV * -1106617167);
                                }
                            } else if (!fieldA) {
                                if (paint.flatShade) {
                                    RSGraphics2D.method319(bottomRightY, bottomLeftY, topRightY, bottomRightX, bottomLeftX, topRightX, paint.fieldI * 2070189115, paint.fieldB * 1390567799, paint.fieldV * -1106617167, TLx, var14, var9, TLy, var18, var21, var12, var11, var15, paint.texture * -1278797823);
                                } else {
                                    RSGraphics2D.method319(bottomRightY, bottomLeftY, topRightY, bottomRightX, bottomLeftX, topRightX, paint.fieldI * 2070189115, paint.fieldB * 1390567799, paint.fieldV * -1106617167, var13, var9, var14, var19, var21, var18, var16, var15, var11, paint.texture * -1278797823);
                                }
                            } else {
                                var30 = RSGraphics2D.fieldAs.v(paint.texture * -1278797823, (byte) -7);
                                RSGraphics2D.method316(bottomRightY, bottomLeftY, topRightY, bottomRightX, bottomLeftX, topRightX, method301(var30, paint.fieldI * 2070189115), method301(var30, paint.fieldB * 1390567799), method301(var30, paint.fieldV * -1106617167));
                            }

                            paint.fieldI = old0;
                            paint.fieldB = old1;
                            paint.fieldV = old2;
                        }

                        if ((topLeftX - topRightX) * (bottomLeftY - topRightY) - (topLeftY - topRightY) * (bottomLeftX - topRightX) > 0) {

                            RSGraphics2D.offscreen = topLeftX < 0
                                    || topRightX < 0
                                    || bottomLeftX < 0
                                    || topLeftX > RSGraphics2D.fieldJ
                                    || topRightX > RSGraphics2D.fieldJ
                                    || bottomLeftX > RSGraphics2D.fieldJ;

                            if (checkMouse && this.isPointInTile(mouseX, mouseY, topLeftY, topRightY, bottomLeftY, topLeftX, topRightX, bottomLeftX)) {
                                selectedTileRegionX = regionX;
                                selectedTileRegionY = regionY;
                            }

                            if (paint.texture * -1278797823 == -1) {
                                if (paint.fieldA * 407736515 != 12345678) {
                                    RSGraphics2D.method316(topLeftY, topRightY, bottomLeftY, topLeftX, topRightX, bottomLeftX, paint.fieldA * 407736515, paint.fieldV * -1106617167, paint.fieldB * 1390567799);
                                }
                            } else if (!fieldA) {
                                RSGraphics2D.method319(topLeftY, topRightY, bottomLeftY, topLeftX, topRightX, bottomLeftX, paint.fieldA * 407736515, paint.fieldV * -1106617167, paint.fieldB * 1390567799, TLx, var14, var9, TLy, var18, var21, var12, var11, var15, paint.texture * -1278797823);
                            } else {
                                var30 = RSGraphics2D.fieldAs.v(paint.texture * -1278797823, (byte) 28);
                                RSGraphics2D.method316(topLeftY, topRightY, bottomLeftY, topLeftX, topRightX, bottomLeftX, method301(var30, paint.fieldA * 407736515), method301(var30, paint.fieldV * -1106617167), method301(var30, paint.fieldB * 1390567799));
                            }
                        }

                    }
                }
            }
        }
    }

    void aq(classCy var1, int floor, int regionX, int regionY, int sizeX, int sizeY) {
        boolean var7 = true;
        int baseX = regionX;
        int endX = regionX + sizeX;
        int baseY = regionY - 1;
        int endY = regionY + sizeY;

        for (int curFloor = floor; curFloor <= floor + 1; ++curFloor) {
            if (curFloor != this.floors) {
                for (int rx = baseX; rx <= endX; ++rx) {
                    if (rx >= 0 && rx < this.sizeX) {
                        for (int ry = baseY; ry <= endY; ++ry) {
                            if (ry >= 0 && ry < this.sizeY && (!var7 || rx >= endX || ry >= endY || ry < regionY && rx != regionX)) {
                                LandscapeTile var15 = this.tiles[curFloor][rx][ry];
                                if (var15 != null) {
                                    int var16 = (this.tileHeights[curFloor][rx][ry] + this.tileHeights[curFloor][rx + 1][ry] + this.tileHeights[curFloor][rx][ry + 1] + this.tileHeights[curFloor][rx + 1][ry + 1]) / 4 - (this.tileHeights[floor][regionX][regionY] + this.tileHeights[floor][regionX + 1][regionY] + this.tileHeights[floor][regionX][regionY + 1] + this.tileHeights[floor][regionX + 1][regionY + 1]) / 4;
                                    Boundary var17 = var15.boundary;
                                    if (var17 != null) {
                                        classCy var18;
                                        if (var17.fieldM instanceof classCy) {
                                            var18 = (classCy) var17.fieldM;
                                            classCy.merge(var1, var18, (rx - regionX) * 128 + (1 - sizeX) * 64, var16, (ry - regionY) * 128 + (1 - sizeY) * 64, var7);
                                        }

                                        if (var17.fieldW instanceof classCy) {
                                            var18 = (classCy) var17.fieldW;
                                            classCy.merge(var1, var18, (rx - regionX) * 128 + (1 - sizeX) * 64, var16, (ry - regionY) * 128 + (1 - sizeY) * 64, var7);
                                        }
                                    }

                                    for (int var23 = 0; var23 < var15.entityCount * -1552839441; ++var23) {
                                        EntityMarker var19 = var15.markers[var23];
                                        if (var19 != null && var19.entity instanceof classCy) {
                                            classCy var20 = (classCy) var19.entity;
                                            int var21 = var19.maxX * 589114397 - var19.rootRegionX * -451326837 + 1;
                                            int var22 = var19.maxY * -469048253 - var19.rootRegionY * -1669424973 + 1;
                                            classCy.merge(var1, var20, (var19.rootRegionX * -451326837 - regionX) * 128 + (var21 - sizeX) * 64, var16, (var19.rootRegionY * -1669424973 - regionY) * 128 + (var22 - sizeY) * 64, var7);
                                        }
                                    }

                                }
                            }
                        }
                    }
                }

                --baseX;
                var7 = false;
            }
        }

    }

    public void drawMMTile(int[] buffer, int pos, int width, int floor, int regionX, int regionY) {
        LandscapeTile var7 = this.tiles[floor][regionX][regionY];
        if (var7 != null) {
            TilePaint var8 = var7.paint;
            int var10;
            if (var8 != null) {
                int rgb = var8.rgb * -1662792501;
                if (rgb != 0) {
                    for (var10 = 0; var10 < 4; ++var10) {
                        buffer[pos] = rgb;
                        buffer[pos + 1] = rgb;
                        buffer[pos + 2] = rgb;
                        buffer[pos + 3] = rgb;
                        pos += width;
                    }

                }
            } else {
                TileModel var9 = var7.model;
                if (var9 != null) {
                    var10 = var9.fieldF;
                    int var11 = var9.fieldD;
                    int var12 = var9.fieldX;
                    int var13 = var9.fieldO;
                    int[] var14 = this.fieldBo[var10];
                    int[] var15 = this.fieldBi[var11];
                    int var16 = 0;
                    int var17;
                    if (var12 != 0) {
                        for (var17 = 0; var17 < 4; ++var17) {
                            buffer[pos] = var14[var15[var16++]] == 0 ? var12 : var13;
                            buffer[pos + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
                            buffer[pos + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
                            buffer[pos + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
                            pos += width;
                        }
                    } else {
                        for (var17 = 0; var17 < 4; ++var17) {
                            if (var14[var15[var16++]] != 0) {
                                buffer[pos] = var13;
                            }

                            if (var14[var15[var16++]] != 0) {
                                buffer[pos + 1] = var13;
                            }

                            if (var14[var15[var16++]] != 0) {
                                buffer[pos + 2] = var13;
                            }

                            if (var14[var15[var16++]] != 0) {
                                buffer[pos + 3] = var13;
                            }

                            pos += width;
                        }
                    }

                }
            }
        }
    }

    public void ai(int var1, int var2, int var3) {
        checkMouse = true;
        fieldAq = var1;
        mouseX = var2;
        mouseY = var3;
        selectedTileRegionX = -1;
        selectedTileRegionY = -1;
    }

    public void render(int cameraX, int cameraZ, int cameraY, int pitch, int yaw, int var6) {
        if (cameraX < 0) {
            cameraX = 0;
        } else if (cameraX >= this.sizeX * 128) {
            cameraX = this.sizeX * 128 - 1;
        }

        if (cameraY < 0) {
            cameraY = 0;
        } else if (cameraY >= this.sizeY * 128) {
            cameraY = this.sizeY * 128 - 1;
        }

        ++landscapeTick;
        pitchSin = RSGraphics2D.SIN_TABLE[pitch];
        pitchCos = RSGraphics2D.COS_TABLE[pitch];
        yawSin = RSGraphics2D.SIN_TABLE[yaw];
        yawCos = RSGraphics2D.COS_TABLE[yaw];
        vismap = visibilityMap[(pitch - 128) / 32][yaw / 64];
        Landscape.cameraX = cameraX;
        Landscape.cameraZ = cameraZ;
        Landscape.cameraY = cameraY;
        cameraRegionX = cameraX / 128;
        cameraRegionY = cameraY / 128;
        fieldT = var6;
        renderZoneMinX = cameraRegionX - 25;
        if (renderZoneMinX < 0) {
            renderZoneMinX = 0;
        }

        renderZoneMinY = cameraRegionY - 25;
        if (renderZoneMinY < 0) {
            renderZoneMinY = 0;
        }

        renderZoneMaxX = cameraRegionX + 25;
        if (renderZoneMaxX > this.sizeX) {
            renderZoneMaxX = this.sizeX;
        }

        renderZoneMaxY = cameraRegionY + 25;
        if (renderZoneMaxY > this.sizeY) {
            renderZoneMaxY = this.sizeY;
        }

        this.au();
        fieldQ = 0;

        int var7;
        LandscapeTile[][] var8;
        int var9;
        int var10;
        for (var7 = this.fieldW; var7 < this.floors; ++var7) {
            var8 = this.tiles[var7];
            for (var9 = renderZoneMinX; var9 < renderZoneMaxX; ++var9) {
                for (var10 = renderZoneMinY; var10 < renderZoneMaxY; ++var10) {
                    LandscapeTile var11 = var8[var9][var10];
                    if (var11 != null) {
                        if (var11.fieldO * -1707785651 <= var6 && (vismap[var9 - cameraRegionX + 25][var10 - cameraRegionY + 25] || this.tileHeights[var7][var9][var10] - cameraZ >= 2000)) {
                            var11.fieldQ = true;
                            var11.fieldT = true;
                            var11.fieldH = var11.entityCount * -1552839441 > 0;
                            ++fieldQ;
                        } else {
                            var11.fieldQ = false;
                            var11.fieldT = false;
                            var11.fieldU = 0;
                        }
                    }
                }
            }
        }

        int var12;
        int var13;
        int var14;
        LandscapeTile var15;
        int var16;
        for (var7 = this.fieldW; var7 < this.floors; ++var7) {
            var8 = this.tiles[var7];

            for (var9 = -25; var9 <= 0; ++var9) {
                var10 = cameraRegionX + var9;
                var16 = cameraRegionX - var9;
                if (var10 >= renderZoneMinX || var16 < renderZoneMaxX) {
                    for (var12 = -25; var12 <= 0; ++var12) {
                        var13 = cameraRegionY + var12;
                        var14 = cameraRegionY - var12;
                        if (var10 >= renderZoneMinX) {
                            if (var13 >= renderZoneMinY) {
                                var15 = var8[var10][var13];
                                if (var15 != null && var15.fieldQ) {
                                    this.renderAt(var15, true);
                                }
                            }

                            if (var14 < renderZoneMaxY) {
                                var15 = var8[var10][var14];
                                if (var15 != null && var15.fieldQ) {
                                    this.renderAt(var15, true);
                                }
                            }
                        }

                        if (var16 < renderZoneMaxX) {
                            if (var13 >= renderZoneMinY) {
                                var15 = var8[var16][var13];
                                if (var15 != null && var15.fieldQ) {
                                    this.renderAt(var15, true);
                                }
                            }

                            if (var14 < renderZoneMaxY) {
                                var15 = var8[var16][var14];
                                if (var15 != null && var15.fieldQ) {
                                    this.renderAt(var15, true);
                                }
                            }
                        }

                        if (fieldQ == 0) {
                            checkMouse = false;
                            return;
                        }
                    }
                }
            }
        }

        for (var7 = this.fieldW; var7 < this.floors; ++var7) {
            var8 = this.tiles[var7];

            for (var9 = -25; var9 <= 0; ++var9) {
                var10 = cameraRegionX + var9;
                var16 = cameraRegionX - var9;
                if (var10 >= renderZoneMinX || var16 < renderZoneMaxX) {
                    for (var12 = -25; var12 <= 0; ++var12) {
                        var13 = cameraRegionY + var12;
                        var14 = cameraRegionY - var12;
                        if (var10 >= renderZoneMinX) {
                            if (var13 >= renderZoneMinY) {
                                var15 = var8[var10][var13];
                                if (var15 != null && var15.fieldQ) {
                                    this.renderAt(var15, false);
                                }
                            }

                            if (var14 < renderZoneMaxY) {
                                var15 = var8[var10][var14];
                                if (var15 != null && var15.fieldQ) {
                                    this.renderAt(var15, false);
                                }
                            }
                        }

                        if (var16 < renderZoneMaxX) {
                            if (var13 >= renderZoneMinY) {
                                var15 = var8[var16][var13];
                                if (var15 != null && var15.fieldQ) {
                                    this.renderAt(var15, false);
                                }
                            }

                            if (var14 < renderZoneMaxY) {
                                var15 = var8[var16][var14];
                                if (var15 != null && var15.fieldQ) {
                                    this.renderAt(var15, false);
                                }
                            }
                        }

                        if (fieldQ == 0) {
                            checkMouse = false;
                            return;
                        }
                    }
                }
            }
        }
        checkMouse = false;
    }

    public void setBoundary(int floor, int regionX, int regionY, int var4, Renderable var5, Renderable var6, int var7, int var8, int uid, int cfg) {
        if (var5 != null || var6 != null) {
            Boundary var11 = new Boundary();
            var11.uid = uid * -1827938149;
            var11.cfg = cfg * -555650627;
            var11.fieldV = regionX * 656040064 + -1819463616;
            var11.fieldI = regionY * 2138775680 + -1078095808;
            var11.fieldA = var4 * 1818299931;
            var11.fieldM = var5;
            var11.fieldW = var6;
            var11.fieldB = var7 * 714597883;
            var11.fieldL = var8 * 1601518145;
            for (int var12 = floor; var12 >= 0; --var12) {
                if (this.tiles[var12][regionX][regionY] == null) {
                    this.tiles[var12][regionX][regionY] = new LandscapeTile(var12, regionX, regionY);
                }
            }
            this.tiles[floor][regionX][regionY].boundary = var11;
        }
    }

    public void removeItemPile(int floor, int regionX, int regionY) {
        LandscapeTile var4 = this.tiles[floor][regionX][regionY];
        if (var4 != null) {
            var4.items = null;
        }
    }

    void au() {
        int var1 = fieldAo[fieldT];
        classCe[] var2 = fieldAg[fieldT];
        fieldAd = 0;

        for (int var3 = 0; var3 < var1; ++var3) {
            classCe var4 = var2[var3];
            int var5;
            int var6;
            int var7;
            boolean var8;
            int var9;
            if (var4.fieldL * -1468503265 == 1) {
                var5 = var4.fieldA * -1912894711 - cameraRegionX + 25;
                if (var5 >= 0 && var5 <= 50) {
                    var6 = var4.fieldI * -405708405 - cameraRegionY + 25;
                    if (var6 < 0) {
                        var6 = 0;
                    }

                    var7 = var4.fieldB * -543814485 - cameraRegionY + 25;
                    if (var7 > 50) {
                        var7 = 50;
                    }

                    var8 = false;

                    while (var6 <= var7) {
                        if (vismap[var5][var6++]) {
                            var8 = true;
                            break;
                        }
                    }

                    if (var8) {
                        var9 = cameraX - var4.fieldM * 1000106809;
                        if (var9 > 32) {
                            var4.fieldF = -789596287;
                        } else {
                            if (var9 >= -32) {
                                continue;
                            }

                            var4.fieldF = -1579192574;
                            var9 = -var9;
                        }

                        var4.fieldO = (var4.fieldE * 1621155039 - cameraY << 8) / var9 * -829451811;
                        var4.fieldQ = (var4.fieldN * 2035517489 - cameraY << 8) / var9 * 993630363;
                        var4.fieldT = (var4.fieldS * -1011172907 - cameraZ << 8) / var9 * -2112209969;
                        var4.fieldH = (var4.fieldK * -1602943655 - cameraZ << 8) / var9 * 1927211229;
                        fieldAu[fieldAd++] = var4;
                    }
                }
            } else if (var4.fieldL * -1468503265 == 2) {
                var5 = var4.fieldI * -405708405 - cameraRegionY + 25;
                if (var5 >= 0 && var5 <= 50) {
                    var6 = var4.fieldA * -1912894711 - cameraRegionX + 25;
                    if (var6 < 0) {
                        var6 = 0;
                    }

                    var7 = var4.fieldV * 510100053 - cameraRegionX + 25;
                    if (var7 > 50) {
                        var7 = 50;
                    }

                    var8 = false;

                    while (var6 <= var7) {
                        if (vismap[var6++][var5]) {
                            var8 = true;
                            break;
                        }
                    }

                    if (var8) {
                        var9 = cameraY - var4.fieldE * 1621155039;
                        if (var9 > 32) {
                            var4.fieldF = 1926178435;
                        } else {
                            if (var9 >= -32) {
                                continue;
                            }

                            var4.fieldF = 1136582148;
                            var9 = -var9;
                        }

                        var4.fieldD = (var4.fieldM * 1000106809 - cameraX << 8) / var9 * -1008602219;
                        var4.fieldX = (var4.fieldW * 1100233381 - cameraX << 8) / var9 * 1404150519;
                        var4.fieldT = (var4.fieldS * -1011172907 - cameraZ << 8) / var9 * -2112209969;
                        var4.fieldH = (var4.fieldK * -1602943655 - cameraZ << 8) / var9 * 1927211229;
                        fieldAu[fieldAd++] = var4;
                    }
                }
            } else if (var4.fieldL * -1468503265 == 4) {
                var5 = var4.fieldS * -1011172907 - cameraZ;
                if (var5 > 128) {
                    var6 = var4.fieldI * -405708405 - cameraRegionY + 25;
                    if (var6 < 0) {
                        var6 = 0;
                    }

                    var7 = var4.fieldB * -543814485 - cameraRegionY + 25;
                    if (var7 > 50) {
                        var7 = 50;
                    }

                    if (var6 <= var7) {
                        int var13 = var4.fieldA * -1912894711 - cameraRegionX + 25;
                        if (var13 < 0) {
                            var13 = 0;
                        }

                        var9 = var4.fieldV * 510100053 - cameraRegionX + 25;
                        if (var9 > 50) {
                            var9 = 50;
                        }

                        boolean var10 = false;

                        label150:
                        for (int var11 = var13; var11 <= var9; ++var11) {
                            for (int var12 = var6; var12 <= var7; ++var12) {
                                if (vismap[var11][var12]) {
                                    var10 = true;
                                    break label150;
                                }
                            }
                        }

                        if (var10) {
                            var4.fieldF = 346985861;
                            var4.fieldD = (var4.fieldM * 1000106809 - cameraX << 8) / var5 * -1008602219;
                            var4.fieldX = (var4.fieldW * 1100233381 - cameraX << 8) / var5 * 1404150519;
                            var4.fieldO = (var4.fieldE * 1621155039 - cameraY << 8) / var5 * -829451811;
                            var4.fieldQ = (var4.fieldN * 2035517489 - cameraY << 8) / var5 * 993630363;
                            fieldAu[fieldAd++] = var4;
                        }
                    }
                }
            }
        }

    }

    boolean ak(int var1, int var2, int var3) {
        int var4 = this.fieldS[var1][var2][var3];
        if (var4 == -landscapeTick) {
            return false;
        } else if (var4 == landscapeTick) {
            return true;
        } else {
            int var5 = var2 << 7;
            int var6 = var3 << 7;
            if (this.ac(var5 + 1, this.tileHeights[var1][var2][var3], var6 + 1) && this.ac(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3], var6 + 1) && this.ac(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.ac(var5 + 1, this.tileHeights[var1][var2][var3 + 1], var6 + 128 - 1)) {
                this.fieldS[var1][var2][var3] = landscapeTick;
                return true;
            } else {
                this.fieldS[var1][var2][var3] = -landscapeTick;
                return false;
            }
        }
    }

    boolean aj(int var1, int var2, int var3, int var4) {
        if (!this.ak(var1, var2, var3)) {
            return false;
        } else {
            int var5 = var2 << 7;
            int var6 = var3 << 7;
            int var7 = this.tileHeights[var1][var2][var3] - 1;
            int var8 = var7 - 120;
            int var9 = var7 - 230;
            int var10 = var7 - 238;
            if (var4 < 16) {
                if (var4 == 1) {
                    if (var5 > cameraX) {
                        if (!this.ac(var5, var7, var6)) {
                            return false;
                        }

                        if (!this.ac(var5, var7, var6 + 128)) {
                            return false;
                        }
                    }

                    if (var1 > 0) {
                        if (!this.ac(var5, var8, var6)) {
                            return false;
                        }

                        if (!this.ac(var5, var8, var6 + 128)) {
                            return false;
                        }
                    }

                    if (!this.ac(var5, var9, var6)) {
                        return false;
                    }

                    if (!this.ac(var5, var9, var6 + 128)) {
                        return false;
                    }

                    return true;
                }

                if (var4 == 2) {
                    if (var6 < cameraY) {
                        if (!this.ac(var5, var7, var6 + 128)) {
                            return false;
                        }

                        if (!this.ac(var5 + 128, var7, var6 + 128)) {
                            return false;
                        }
                    }

                    if (var1 > 0) {
                        if (!this.ac(var5, var8, var6 + 128)) {
                            return false;
                        }

                        if (!this.ac(var5 + 128, var8, var6 + 128)) {
                            return false;
                        }
                    }

                    if (!this.ac(var5, var9, var6 + 128)) {
                        return false;
                    }

                    if (!this.ac(var5 + 128, var9, var6 + 128)) {
                        return false;
                    }

                    return true;
                }

                if (var4 == 4) {
                    if (var5 < cameraX) {
                        if (!this.ac(var5 + 128, var7, var6)) {
                            return false;
                        }

                        if (!this.ac(var5 + 128, var7, var6 + 128)) {
                            return false;
                        }
                    }

                    if (var1 > 0) {
                        if (!this.ac(var5 + 128, var8, var6)) {
                            return false;
                        }

                        if (!this.ac(var5 + 128, var8, var6 + 128)) {
                            return false;
                        }
                    }

                    if (!this.ac(var5 + 128, var9, var6)) {
                        return false;
                    }

                    if (!this.ac(var5 + 128, var9, var6 + 128)) {
                        return false;
                    }

                    return true;
                }

                if (var4 == 8) {
                    if (var6 > cameraY) {
                        if (!this.ac(var5, var7, var6)) {
                            return false;
                        }

                        if (!this.ac(var5 + 128, var7, var6)) {
                            return false;
                        }
                    }

                    if (var1 > 0) {
                        if (!this.ac(var5, var8, var6)) {
                            return false;
                        }

                        if (!this.ac(var5 + 128, var8, var6)) {
                            return false;
                        }
                    }

                    if (!this.ac(var5, var9, var6)) {
                        return false;
                    }

                    if (!this.ac(var5 + 128, var9, var6)) {
                        return false;
                    }

                    return true;
                }
            }

            return !this.ac(var5 + 64, var10, var6 + 64) ? false : (var4 == 16 ? this.ac(var5, var9, var6 + 128) : (var4 == 32 ? this.ac(var5 + 128, var9, var6 + 128) : (var4 == 64 ? this.ac(var5 + 128, var9, var6) : (var4 == 128 ? this.ac(var5, var9, var6) : true))));
        }
    }

    boolean af(int var1, int var2, int var3, int var4) {
        if (!this.ak(var1, var2, var3)) {
            return false;
        } else {
            int var5 = var2 << 7;
            int var6 = var3 << 7;
            return this.ac(var5 + 1, this.tileHeights[var1][var2][var3] - var4, var6 + 1) && this.ac(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3] - var4, var6 + 1) && this.ac(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.ac(var5 + 1, this.tileHeights[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
        }
    }

    boolean ab(int var1, int var2, int var3, int var4, int var5, int var6) {
        int var7;
        int var8;
        if (var2 == var3 && var4 == var5) {
            if (!this.ak(var1, var2, var4)) {
                return false;
            } else {
                var7 = var2 << 7;
                var8 = var4 << 7;
                return this.ac(var7 + 1, this.tileHeights[var1][var2][var4] - var6, var8 + 1) && this.ac(var7 + 128 - 1, this.tileHeights[var1][var2 + 1][var4] - var6, var8 + 1) && this.ac(var7 + 128 - 1, this.tileHeights[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.ac(var7 + 1, this.tileHeights[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
            }
        } else {
            for (var7 = var2; var7 <= var3; ++var7) {
                for (var8 = var4; var8 <= var5; ++var8) {
                    if (this.fieldS[var1][var7][var8] == -landscapeTick) {
                        return false;
                    }
                }
            }

            var7 = (var2 << 7) + 1;
            var8 = (var4 << 7) + 2;
            int var9 = this.tileHeights[var1][var2][var4] - var6;
            if (!this.ac(var7, var9, var8)) {
                return false;
            } else {
                int var10 = (var3 << 7) - 1;
                if (!this.ac(var10, var9, var8)) {
                    return false;
                } else {
                    int var11 = (var5 << 7) - 1;
                    if (!this.ac(var7, var9, var11)) {
                        return false;
                    } else if (!this.ac(var10, var9, var11)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
    }

    boolean ac(int var1, int var2, int var3) {
        for (int var4 = 0; var4 < fieldAd; ++var4) {
            classCe var5 = fieldAu[var4];
            int var6;
            int var7;
            int var8;
            int var9;
            int var10;
            if (var5.fieldF * -105346943 == 1) {
                var6 = var5.fieldM * 1000106809 - var1;
                if (var6 > 0) {
                    var7 = var5.fieldE * 1621155039 + (var5.fieldO * 153439861 * var6 >> 8);
                    var8 = var5.fieldN * 2035517489 + (var5.fieldQ * -325022317 * var6 >> 8);
                    var9 = var5.fieldS * -1011172907 + (var5.fieldT * -1657214161 * var6 >> 8);
                    var10 = var5.fieldK * -1602943655 + (var5.fieldH * -882167947 * var6 >> 8);
                    if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                        return true;
                    }
                }
            } else if (var5.fieldF * -105346943 == 2) {
                var6 = var1 - var5.fieldM * 1000106809;
                if (var6 > 0) {
                    var7 = var5.fieldE * 1621155039 + (var5.fieldO * 153439861 * var6 >> 8);
                    var8 = var5.fieldN * 2035517489 + (var5.fieldQ * -325022317 * var6 >> 8);
                    var9 = var5.fieldS * -1011172907 + (var5.fieldT * -1657214161 * var6 >> 8);
                    var10 = var5.fieldK * -1602943655 + (var5.fieldH * -882167947 * var6 >> 8);
                    if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                        return true;
                    }
                }
            } else if (var5.fieldF * -105346943 == 3) {
                var6 = var5.fieldE * 1621155039 - var3;
                if (var6 > 0) {
                    var7 = var5.fieldM * 1000106809 + (var5.fieldD * 2062008253 * var6 >> 8);
                    var8 = var5.fieldW * 1100233381 + (var5.fieldX * -2130592057 * var6 >> 8);
                    var9 = var5.fieldS * -1011172907 + (var5.fieldT * -1657214161 * var6 >> 8);
                    var10 = var5.fieldK * -1602943655 + (var5.fieldH * -882167947 * var6 >> 8);
                    if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                        return true;
                    }
                }
            } else if (var5.fieldF * -105346943 == 4) {
                var6 = var3 - var5.fieldE * 1621155039;
                if (var6 > 0) {
                    var7 = var5.fieldM * 1000106809 + (var5.fieldD * 2062008253 * var6 >> 8);
                    var8 = var5.fieldW * 1100233381 + (var5.fieldX * -2130592057 * var6 >> 8);
                    var9 = var5.fieldS * -1011172907 + (var5.fieldT * -1657214161 * var6 >> 8);
                    var10 = var5.fieldK * -1602943655 + (var5.fieldH * -882167947 * var6 >> 8);
                    if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                        return true;
                    }
                }
            } else if (var5.fieldF * -105346943 == 5) {
                var6 = var2 - var5.fieldS * -1011172907;
                if (var6 > 0) {
                    var7 = var5.fieldM * 1000106809 + (var5.fieldD * 2062008253 * var6 >> 8);
                    var8 = var5.fieldW * 1100233381 + (var5.fieldX * -2130592057 * var6 >> 8);
                    var9 = var5.fieldE * 1621155039 + (var5.fieldO * 153439861 * var6 >> 8);
                    var10 = var5.fieldN * 2035517489 + (var5.fieldQ * -325022317 * var6 >> 8);
                    if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public void removeTileDecoration(int floor, int regionX, int regionY) {
        LandscapeTile var4 = this.tiles[floor][regionX][regionY];
        if (var4 != null) {
            var4.tileDeco = null;
        }
    }

    boolean isPointInTile(int px, int py, int var3, int var4, int var5, int var6, int var7, int var8) {
        if (py < var3 && py < var4 && py < var5) {
            return false;
        } else if (py > var3 && py > var4 && py > var5) {
            return false;
        } else if (px < var6 && px < var7 && px < var8) {
            return false;
        } else if (px > var6 && px > var7 && px > var8) {
            return false;
        } else {
            int var9 = (py - var3) * (var7 - var6) - (px - var6) * (var4 - var3);
            int var10 = (py - var5) * (var6 - var8) - (px - var8) * (var3 - var5);
            int var11 = (py - var4) * (var8 - var7) - (px - var7) * (var5 - var4);
            return var9 * var11 > 0 && var11 * var10 > 0;
        }
    }

    public BoundaryDecoration getBoundaryDecoration(int floor, int regionX, int regionY) {
        LandscapeTile var4 = this.tiles[floor][regionX][regionY];
        return var4 == null ? null : var4.boundDeco;
    }

    public void setItemPile(int floor, int regionX, int regionY, int height, Renderable top, int uid, Renderable bottom, Renderable mid) {
        ItemPile var9 = new ItemPile();
        var9.topItem = top;
        var9.regionX = regionX * -1689585536 + 1302690880;
        var9.regionY = regionY * 1439989888 + -1427488704;
        var9.height = height * 510007563;
        var9.uid = uid * -1969522435;
        var9.bottomItem = bottom;
        var9.midItem = mid;
        int counterHeight = 0;
        LandscapeTile var11 = this.tiles[floor][regionX][regionY];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.entityCount * -1552839441; ++var12) {
                if ((var11.markers[var12].cfg * -1327140669 & 256) == 256 && var11.markers[var12].entity instanceof Model) {
                    Model var13 = (Model) var11.markers[var12].entity;
                    var13.m();
                    if (var13.modelHeight * 1802750145 > counterHeight) {
                        counterHeight = var13.modelHeight * 1802750145;
                    }
                }
            }
        }

        var9.counterHeight = counterHeight * 1003088683;
        if (this.tiles[floor][regionX][regionY] == null) {
            this.tiles[floor][regionX][regionY] = new LandscapeTile(floor, regionX, regionY);
        }

        this.tiles[floor][regionX][regionY].items = var9;
    }

    public void removeBoundary(int var1, int var2, int var3) {
        LandscapeTile var4 = this.tiles[var1][var2][var3];
        if (var4 != null) {
            var4.boundary = null;
        }
    }

    public void m(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
        TilePaint var21;
        int var22;
        if (var4 == 0) {
            var21 = new TilePaint(var11, var12, var13, var14, -1, var19, false);

            for (var22 = var1; var22 >= 0; --var22) {
                if (this.tiles[var22][var2][var3] == null) {
                    this.tiles[var22][var2][var3] = new LandscapeTile(var22, var2, var3);
                }
            }

            this.tiles[var1][var2][var3].paint = var21;
        } else if (var4 != 1) {
            TileModel var23 = new TileModel(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

            for (var22 = var1; var22 >= 0; --var22) {
                if (this.tiles[var22][var2][var3] == null) {
                    this.tiles[var22][var2][var3] = new LandscapeTile(var22, var2, var3);
                }
            }

            this.tiles[var1][var2][var3].model = var23;
        } else {
            var21 = new TilePaint(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

            for (var22 = var1; var22 >= 0; --var22) {
                if (this.tiles[var22][var2][var3] == null) {
                    this.tiles[var22][var2][var3] = new LandscapeTile(var22, var2, var3);
                }
            }

            this.tiles[var1][var2][var3].paint = var21;
        }
    }

    void al(classCy var1, int floor, int regionX, int regionY) {
        LandscapeTile var5;
        classCy var6;
        if (regionX < this.sizeX) {
            var5 = this.tiles[floor][regionX + 1][regionY];
            if (var5 != null && var5.tileDeco != null && var5.tileDeco.deco instanceof classCy) {
                var6 = (classCy) var5.tileDeco.deco;
                classCy.merge(var1, var6, 128, 0, 0, true);
            }
        }

        if (regionY < this.sizeX) {
            var5 = this.tiles[floor][regionX][regionY + 1];
            if (var5 != null && var5.tileDeco != null && var5.tileDeco.deco instanceof classCy) {
                var6 = (classCy) var5.tileDeco.deco;
                classCy.merge(var1, var6, 0, 0, 128, true);
            }
        }

        if (regionX < this.sizeX && regionY < this.sizeY) {
            var5 = this.tiles[floor][regionX + 1][regionY + 1];
            if (var5 != null && var5.tileDeco != null && var5.tileDeco.deco instanceof classCy) {
                var6 = (classCy) var5.tileDeco.deco;
                classCy.merge(var1, var6, 128, 0, 128, true);
            }
        }

        if (regionX < this.sizeX && regionY > 0) {
            var5 = this.tiles[floor][regionX + 1][regionY - 1];
            if (var5 != null && var5.tileDeco != null && var5.tileDeco.deco instanceof classCy) {
                var6 = (classCy) var5.tileDeco.deco;
                classCy.merge(var1, var6, 128, 0, -128, true);
            }
        }

    }

    void removeEntity(EntityMarker var1) {
        for (int var2 = var1.rootRegionX * -451326837; var2 <= var1.maxX * 589114397; ++var2) {
            for (int var3 = var1.rootRegionY * -1669424973; var3 <= var1.maxY * -469048253; ++var3) {
                LandscapeTile var4 = this.tiles[var1.floor * -1560652333][var2][var3];
                if (var4 != null) {
                    int var5;
                    for (var5 = 0; var5 < var4.entityCount * -1552839441; ++var5) {
                        if (var4.markers[var5] == var1) {
                            var4.entityCount -= -2073091569;

                            for (int var6 = var5; var6 < var4.entityCount * -1552839441; ++var6) {
                                var4.markers[var6] = var4.markers[var6 + 1];
                                var4.fieldD[var6] = var4.fieldD[var6 + 1];
                            }

                            var4.markers[var4.entityCount * -1552839441] = null;
                            break;
                        }
                    }

                    var4.fieldX = 0;

                    for (var5 = 0; var5 < var4.entityCount * -1552839441; ++var5) {
                        var4.fieldX = (var4.fieldX * -1790942883 | var4.fieldD[var5]) * 1218902773;
                    }
                }
            }
        }

    }

    public void av(int var1, int var2, int var3) {
        for (int floor = 0; floor < this.floors; ++floor) {
            for (int regionX = 0; regionX < this.sizeX; ++regionX) {
                for (int regionY = 0; regionY < this.sizeY; ++regionY) {
                    LandscapeTile var7 = this.tiles[floor][regionX][regionY];
                    if (var7 != null) {
                        Boundary var8 = var7.boundary;
                        classCy var10;
                        if (var8 != null && var8.fieldM instanceof classCy) {
                            classCy var9 = (classCy) var8.fieldM;
                            this.aq(var9, floor, regionX, regionY, 1, 1);
                            if (var8.fieldW instanceof classCy) {
                                var10 = (classCy) var8.fieldW;
                                this.aq(var10, floor, regionX, regionY, 1, 1);
                                classCy.merge(var9, var10, 0, 0, 0, false);
                                var8.fieldW = var10.p(var10.fieldAm, var10.fieldAx, var1, var2, var3);
                            }

                            var8.fieldM = var9.p(var9.fieldAm, var9.fieldAx, var1, var2, var3);
                        }

                        for (int var12 = 0; var12 < var7.entityCount * -1552839441; ++var12) {
                            EntityMarker var14 = var7.markers[var12];
                            if (var14 != null && var14.entity instanceof classCy) {
                                classCy var11 = (classCy) var14.entity;
                                this.aq(var11, floor, regionX, regionY, var14.maxX * 589114397 - var14.rootRegionX * -451326837 + 1, var14.maxY * -469048253 - var14.rootRegionY * -1669424973 + 1);
                                var14.entity = var11.p(var11.fieldAm, var11.fieldAx, var1, var2, var3);
                            }
                        }

                        TileDecoration var13 = var7.tileDeco;
                        if (var13 != null && var13.deco instanceof classCy) {
                            var10 = (classCy) var13.deco;
                            this.al(var10, floor, regionX, regionY);
                            var13.deco = var10.p(var10.fieldAm, var10.fieldAx, var1, var2, var3);
                        }
                    }
                }
            }
        }

    }

    void renderAt(LandscapeTile var1, boolean var2) {
        tileRenderDeque.add(var1);

        while (true) {
            LandscapeTile var3 = (LandscapeTile) tileRenderDeque.popFirst();
            if (var3 == null) {
                return;
            }

            if (var3.fieldT) {
                int var4 = var3.regionX * 1123685459;
                int var5 = var3.regionY * -44436703;
                int var6 = var3.fieldA * 1564528403;
                int var7 = var3.floor * 396079827;
                LandscapeTile[][] var8 = this.tiles[var6];
                LandscapeTile var9;
                Boundary var10;
                int var11;
                EntityMarker marker;
                int var14;
                int var15;
                int var16;
                int var17;
                int var18;
                int var21;
                boolean var22;
                LandscapeTile var33;
                if (var3.fieldQ) {
                    if (var2) {
                        if (var6 > 0) {
                            var9 = this.tiles[var6 - 1][var4][var5];
                            if (var9 != null && var9.fieldT) {
                                continue;
                            }
                        }

                        if (var4 <= cameraRegionX && var4 > renderZoneMinX) {
                            var9 = var8[var4 - 1][var5];
                            if (var9 != null && var9.fieldT && (var9.fieldQ || (var3.fieldX * -1790942883 & 1) == 0)) {
                                continue;
                            }
                        }

                        if (var4 >= cameraRegionX && var4 < renderZoneMaxX - 1) {
                            var9 = var8[var4 + 1][var5];
                            if (var9 != null && var9.fieldT && (var9.fieldQ || (var3.fieldX * -1790942883 & 4) == 0)) {
                                continue;
                            }
                        }

                        if (var5 <= cameraRegionY && var5 > renderZoneMinY) {
                            var9 = var8[var4][var5 - 1];
                            if (var9 != null && var9.fieldT && (var9.fieldQ || (var3.fieldX * -1790942883 & 8) == 0)) {
                                continue;
                            }
                        }

                        if (var5 >= cameraRegionY && var5 < renderZoneMaxY - 1) {
                            var9 = var8[var4][var5 + 1];
                            if (var9 != null && var9.fieldT && (var9.fieldQ || (var3.fieldX * -1790942883 & 2) == 0)) {
                                continue;
                            }
                        }
                    } else {
                        var2 = true;
                    }

                    var3.fieldQ = false;
                    if (var3.fieldP != null) {
                        var9 = var3.fieldP;
                        if (var9.paint != null) {
                            if (!this.ak(0, var4, var5)) {
                                this.setTilePaint(var9.paint, 0, pitchSin, pitchCos, yawSin, yawCos, var4, var5);
                            }
                        } else if (var9.model != null && !this.ak(0, var4, var5)) {
                            this.ao(var9.model, pitchSin, pitchCos, yawSin, yawCos, var4, var5);
                        }

                        var10 = var9.boundary;
                        if (var10 != null) {
                            var10.fieldM.render(0, pitchSin, pitchCos, yawSin, yawCos, var10.fieldV * -429630655 - cameraX, var10.fieldA * -1781326829 - cameraZ, var10.fieldI * -1732503103 - cameraY, var10.uid * -1483668077);
                        }

                        for (var11 = 0; var11 < var9.entityCount * -1552839441; ++var11) {
                            marker = var9.markers[var11];
                            if (marker != null) {
                                marker.entity.render(marker.orientation * -322547213, pitchSin, pitchCos, yawSin, yawCos, marker.strictX * -97829513 - cameraX, marker.height * -1443553043 - cameraZ, marker.strictY * -1272970967 - cameraY, marker.uid * -1211010875);
                            }
                        }
                    }

                    var22 = false;
                    if (var3.paint != null) {
                        if (!this.ak(var7, var4, var5)) {
                            var22 = true;
                            if (var3.paint.fieldI * 2070189115 != 12345678 || checkMouse && var6 <= fieldAq) {
                                this.setTilePaint(var3.paint, var7, pitchSin, pitchCos, yawSin, yawCos, var4, var5);
                            }
                        }
                    } else if (var3.model != null && !this.ak(var7, var4, var5)) {
                        var22 = true;
                        this.ao(var3.model, pitchSin, pitchCos, yawSin, yawCos, var4, var5);
                    }

                    var21 = 0;
                    var11 = 0;
                    Boundary var23 = var3.boundary;
                    BoundaryDecoration var13 = var3.boundDeco;
                    if (var23 != null || var13 != null) {
                        if (cameraRegionX == var4) {
                            ++var21;
                        } else if (cameraRegionX < var4) {
                            var21 += 2;
                        }

                        if (cameraRegionY == var5) {
                            var21 += 3;
                        } else if (cameraRegionY > var5) {
                            var21 += 6;
                        }

                        var11 = fieldAj[var21];
                        var3.fieldY = fieldAb[var21] * 515984273;
                    }

                    if (var23 != null) {
                        if ((var23.fieldB * -977052365 & fieldAf[var21]) != 0) {
                            if (var23.fieldB * -977052365 == 16) {
                                var3.fieldU = 1305422723;
                                var3.fieldJ = fieldAc[var21] * -1181295081;
                                var3.fieldG = -1147794813 - var3.fieldJ * -862584281;
                            } else if (var23.fieldB * -977052365 == 32) {
                                var3.fieldU = -1684121850;
                                var3.fieldJ = fieldAp[var21] * -1181295081;
                                var3.fieldG = 1999377670 - var3.fieldJ * -862584281;
                            } else if (var23.fieldB * -977052365 == 64) {
                                var3.fieldU = 926723596;
                                var3.fieldJ = fieldAy[var21] * -1181295081;
                                var3.fieldG = -296211956 - var3.fieldJ * -862584281;
                            } else {
                                var3.fieldU = -378699127;
                                var3.fieldJ = fieldBu[var21] * -1181295081;
                                var3.fieldG = 851582857 - var3.fieldJ * -862584281;
                            }
                        } else {
                            var3.fieldU = 0;
                        }

                        if ((var23.fieldB * -977052365 & var11) != 0 && !this.aj(var7, var4, var5, var23.fieldB * -977052365)) {
                            var23.fieldM.render(0, pitchSin, pitchCos, yawSin, yawCos, var23.fieldV * -429630655 - cameraX, var23.fieldA * -1781326829 - cameraZ, var23.fieldI * -1732503103 - cameraY, var23.uid * -1483668077);
                        }

                        if ((var23.fieldL * 1332204993 & var11) != 0 && !this.aj(var7, var4, var5, var23.fieldL * 1332204993)) {
                            var23.fieldW.render(0, pitchSin, pitchCos, yawSin, yawCos, var23.fieldV * -429630655 - cameraX, var23.fieldA * -1781326829 - cameraZ, var23.fieldI * -1732503103 - cameraY, var23.uid * -1483668077);
                        }
                    }

                    if (var13 != null && !this.af(var7, var4, var5, var13.fieldE.modelHeight * 1802750145)) {
                        if ((var13.fieldB * -344024793 & var11) != 0) {
                            var13.fieldE.render(0, pitchSin, pitchCos, yawSin, yawCos, var13.strictX * -2085214893 - cameraX + var13.insetX * 360398885, var13.height * -748628777 - cameraZ, var13.strictY * 387289189 - cameraY + var13.insetY * -1686394995, var13.uid * -1933340315);
                        } else if (var13.fieldB * -344024793 == 256) {
                            var14 = var13.strictX * -2085214893 - cameraX;
                            var15 = var13.height * -748628777 - cameraZ;
                            var16 = var13.strictY * 387289189 - cameraY;
                            var17 = var13.fieldL * -769355953;
                            if (var17 != 1 && var17 != 2) {
                                var18 = var14;
                            } else {
                                var18 = -var14;
                            }

                            int var19;
                            if (var17 != 2 && var17 != 3) {
                                var19 = var16;
                            } else {
                                var19 = -var16;
                            }

                            if (var19 < var18) {
                                var13.fieldE.render(0, pitchSin, pitchCos, yawSin, yawCos, var14 + var13.insetX * 360398885, var15, var16 + var13.insetY * -1686394995, var13.uid * -1933340315);
                            } else if (var13.fieldN != null) {
                                var13.fieldN.render(0, pitchSin, pitchCos, yawSin, yawCos, var14, var15, var16, var13.uid * -1933340315);
                            }
                        }
                    }

                    if (var22) {
                        TileDecoration var27 = var3.tileDeco;
                        if (var27 != null) {
                            var27.deco.render(0, pitchSin, pitchCos, yawSin, yawCos, var27.strictX * -1772566441 - cameraX, var27.height * -1549596987 - cameraZ, var27.strictY * -351681755 - cameraY, var27.uid * 2119625601);
                        }

                        ItemPile var31 = var3.items;
                        if (var31 != null && var31.counterHeight * 395148163 == 0) {
                            if (var31.bottomItem != null) {
                                var31.bottomItem.render(0, pitchSin, pitchCos, yawSin, yawCos, var31.regionX * -261506287 - cameraX, var31.height * 177138339 - cameraZ, var31.regionY * -437954815 - cameraY, var31.uid * -1393138603);
                            }

                            if (var31.midItem != null) {
                                var31.midItem.render(0, pitchSin, pitchCos, yawSin, yawCos, var31.regionX * -261506287 - cameraX, var31.height * 177138339 - cameraZ, var31.regionY * -437954815 - cameraY, var31.uid * -1393138603);
                            }

                            if (var31.topItem != null) {
                                var31.topItem.render(0, pitchSin, pitchCos, yawSin, yawCos, var31.regionX * -261506287 - cameraX, var31.height * 177138339 - cameraZ, var31.regionY * -437954815 - cameraY, var31.uid * -1393138603);
                            }
                        }
                    }

                    var14 = var3.fieldX * -1790942883;
                    if (var14 != 0) {
                        if (var4 < cameraRegionX && (var14 & 4) != 0) {
                            var33 = var8[var4 + 1][var5];
                            if (var33 != null && var33.fieldT) {
                                tileRenderDeque.add(var33);
                            }
                        }

                        if (var5 < cameraRegionY && (var14 & 2) != 0) {
                            var33 = var8[var4][var5 + 1];
                            if (var33 != null && var33.fieldT) {
                                tileRenderDeque.add(var33);
                            }
                        }

                        if (var4 > cameraRegionX && (var14 & 1) != 0) {
                            var33 = var8[var4 - 1][var5];
                            if (var33 != null && var33.fieldT) {
                                tileRenderDeque.add(var33);
                            }
                        }

                        if (var5 > cameraRegionY && (var14 & 8) != 0) {
                            var33 = var8[var4][var5 - 1];
                            if (var33 != null && var33.fieldT) {
                                tileRenderDeque.add(var33);
                            }
                        }
                    }
                }

                if (var3.fieldU * -907202175 != 0) {
                    var22 = true;

                    for (var21 = 0; var21 < var3.entityCount * -1552839441; ++var21) {
                        if (var3.markers[var21].fieldF * 1455575469 != landscapeTick && (var3.fieldD[var21] & var3.fieldU * -907202175) == var3.fieldJ * 1764637095) {
                            var22 = false;
                            break;
                        }
                    }

                    if (var22) {
                        var10 = var3.boundary;
                        if (!this.aj(var7, var4, var5, var10.fieldB * -977052365)) {
                            var10.fieldM.render(0, pitchSin, pitchCos, yawSin, yawCos, var10.fieldV * -429630655 - cameraX, var10.fieldA * -1781326829 - cameraZ, var10.fieldI * -1732503103 - cameraY, var10.uid * -1483668077);
                        }

                        var3.fieldU = 0;
                    }
                }

                int var24;
                int var26;
                if (var3.fieldH) {
                    try {
                        int var25 = var3.entityCount * -1552839441;
                        var3.fieldH = false;
                        var21 = 0;

                        label544:
                        for (var11 = 0; var11 < var25; ++var11) {
                            marker = var3.markers[var11];
                            if (marker.fieldF * 1455575469 != landscapeTick) {
                                for (var26 = marker.rootRegionX * -451326837; var26 <= marker.maxX * 589114397; ++var26) {
                                    for (var14 = marker.rootRegionY * -1669424973; var14 <= marker.maxY * -469048253; ++var14) {
                                        var33 = var8[var26][var14];
                                        if (var33.fieldQ) {
                                            var3.fieldH = true;
                                            continue label544;
                                        }

                                        if (var33.fieldU * -907202175 != 0) {
                                            var16 = 0;
                                            if (var26 > marker.rootRegionX * -451326837) {
                                                ++var16;
                                            }

                                            if (var26 < marker.maxX * 589114397) {
                                                var16 += 4;
                                            }

                                            if (var14 > marker.rootRegionY * -1669424973) {
                                                var16 += 8;
                                            }

                                            if (var14 < marker.maxY * -469048253) {
                                                var16 += 2;
                                            }

                                            if ((var16 & var33.fieldU * -907202175) == var3.fieldG * -637911935) {
                                                var3.fieldH = true;
                                                continue label544;
                                            }
                                        }
                                    }
                                }

                                fieldAv[var21++] = marker;
                                var26 = cameraRegionX - marker.rootRegionX * -451326837;
                                var14 = marker.maxX * 589114397 - cameraRegionX;
                                if (var14 > var26) {
                                    var26 = var14;
                                }

                                var15 = cameraRegionY - marker.rootRegionY * -1669424973;
                                var16 = marker.maxY * -469048253 - cameraRegionY;
                                if (var16 > var15) {
                                    marker.fieldK = (var26 + var16) * -1657342537;
                                } else {
                                    marker.fieldK = (var26 + var15) * -1657342537;
                                }
                            }
                        }

                        while (var21 > 0) {
                            var11 = -50;
                            var24 = -1;

                            for (var26 = 0; var26 < var21; ++var26) {
                                EntityMarker var34 = fieldAv[var26];
                                if (var34.fieldF * 1455575469 != landscapeTick) {
                                    if (var34.fieldK * -2042955769 > var11) {
                                        var11 = var34.fieldK * -2042955769;
                                        var24 = var26;
                                    } else if (var34.fieldK * -2042955769 == var11) {
                                        var15 = var34.strictX * -97829513 - cameraX;
                                        var16 = var34.strictY * -1272970967 - cameraY;
                                        var17 = fieldAv[var24].strictX * -97829513 - cameraX;
                                        var18 = fieldAv[var24].strictY * -1272970967 - cameraY;
                                        if (var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) {
                                            var24 = var26;
                                        }
                                    }
                                }
                            }

                            if (var24 == -1) {
                                break;
                            }

                            EntityMarker var35 = fieldAv[var24];
                            var35.fieldF = landscapeTick * -466798043;
                            if (!this.ab(var7, var35.rootRegionX * -451326837, var35.maxX * 589114397, var35.rootRegionY * -1669424973, var35.maxY * -469048253, var35.entity.modelHeight * 1802750145)) {
                                var35.entity.render(var35.orientation * -322547213, pitchSin, pitchCos, yawSin, yawCos, var35.strictX * -97829513 - cameraX, var35.height * -1443553043 - cameraZ, var35.strictY * -1272970967 - cameraY, var35.uid * -1211010875);
                            }

                            for (var14 = var35.rootRegionX * -451326837; var14 <= var35.maxX * 589114397; ++var14) {
                                for (var15 = var35.rootRegionY * -1669424973; var15 <= var35.maxY * -469048253; ++var15) {
                                    LandscapeTile var36 = var8[var14][var15];
                                    if (var36.fieldU * -907202175 != 0) {
                                        tileRenderDeque.add(var36);
                                    } else if ((var14 != var4 || var15 != var5) && var36.fieldT) {
                                        tileRenderDeque.add(var36);
                                    }
                                }
                            }
                        }

                        if (var3.fieldH) {
                            continue;
                        }
                    } catch (Exception var20) {
                        var3.fieldH = false;
                    }
                }

                if (var3.fieldT && var3.fieldU * -907202175 == 0) {
                    if (var4 <= cameraRegionX && var4 > renderZoneMinX) {
                        var9 = var8[var4 - 1][var5];
                        if (var9 != null && var9.fieldT) {
                            continue;
                        }
                    }

                    if (var4 >= cameraRegionX && var4 < renderZoneMaxX - 1) {
                        var9 = var8[var4 + 1][var5];
                        if (var9 != null && var9.fieldT) {
                            continue;
                        }
                    }

                    if (var5 <= cameraRegionY && var5 > renderZoneMinY) {
                        var9 = var8[var4][var5 - 1];
                        if (var9 != null && var9.fieldT) {
                            continue;
                        }
                    }

                    if (var5 >= cameraRegionY && var5 < renderZoneMaxY - 1) {
                        var9 = var8[var4][var5 + 1];
                        if (var9 != null && var9.fieldT) {
                            continue;
                        }
                    }

                    var3.fieldT = false;
                    --fieldQ;
                    ItemPile pile = var3.items;
                    if (pile != null && pile.counterHeight * 395148163 != 0) {
                        if (pile.bottomItem != null) {
                            pile.bottomItem.render(0, pitchSin, pitchCos, yawSin, yawCos, pile.regionX * -261506287 - cameraX, pile.height * 177138339 - cameraZ - pile.counterHeight * 395148163, pile.regionY * -437954815 - cameraY, pile.uid * -1393138603);
                        }

                        if (pile.midItem != null) {
                            pile.midItem.render(0, pitchSin, pitchCos, yawSin, yawCos, pile.regionX * -261506287 - cameraX, pile.height * 177138339 - cameraZ - pile.counterHeight * 395148163, pile.regionY * -437954815 - cameraY, pile.uid * -1393138603);
                        }

                        if (pile.topItem != null) {
                            pile.topItem.render(0, pitchSin, pitchCos, yawSin, yawCos, pile.regionX * -261506287 - cameraX, pile.height * 177138339 - cameraZ - pile.counterHeight * 395148163, pile.regionY * -437954815 - cameraY, pile.uid * -1393138603);
                        }
                    }

                    if (var3.fieldY * -655436431 != 0) {
                        BoundaryDecoration var30 = var3.boundDeco;
                        if (var30 != null && !this.af(var7, var4, var5, var30.fieldE.modelHeight * 1802750145)) {
                            if ((var30.fieldB * -344024793 & var3.fieldY * -655436431) != 0) {
                                var30.fieldE.render(0, pitchSin, pitchCos, yawSin, yawCos, var30.strictX * -2085214893 - cameraX + var30.insetX * 360398885, var30.height * -748628777 - cameraZ, var30.strictY * 387289189 - cameraY + var30.insetY * -1686394995, var30.uid * -1933340315);
                            } else if (var30.fieldB * -344024793 == 256) {
                                var11 = var30.strictX * -2085214893 - cameraX;
                                var24 = var30.height * -748628777 - cameraZ;
                                var26 = var30.strictY * 387289189 - cameraY;
                                var14 = var30.fieldL * -769355953;
                                if (var14 != 1 && var14 != 2) {
                                    var15 = var11;
                                } else {
                                    var15 = -var11;
                                }

                                if (var14 != 2 && var14 != 3) {
                                    var16 = var26;
                                } else {
                                    var16 = -var26;
                                }

                                if (var16 >= var15) {
                                    var30.fieldE.render(0, pitchSin, pitchCos, yawSin, yawCos, var11 + var30.insetX * 360398885, var24, var26 + var30.insetY * -1686394995, var30.uid * -1933340315);
                                } else if (var30.fieldN != null) {
                                    var30.fieldN.render(0, pitchSin, pitchCos, yawSin, yawCos, var11, var24, var26, var30.uid * -1933340315);
                                }
                            }
                        }

                        Boundary var28 = var3.boundary;
                        if (var28 != null) {
                            if ((var28.fieldL * 1332204993 & var3.fieldY * -655436431) != 0 && !this.aj(var7, var4, var5, var28.fieldL * 1332204993)) {
                                var28.fieldW.render(0, pitchSin, pitchCos, yawSin, yawCos, var28.fieldV * -429630655 - cameraX, var28.fieldA * -1781326829 - cameraZ, var28.fieldI * -1732503103 - cameraY, var28.uid * -1483668077);
                            }

                            if ((var28.fieldB * -977052365 & var3.fieldY * -655436431) != 0 && !this.aj(var7, var4, var5, var28.fieldB * -977052365)) {
                                var28.fieldM.render(0, pitchSin, pitchCos, yawSin, yawCos, var28.fieldV * -429630655 - cameraX, var28.fieldA * -1781326829 - cameraZ, var28.fieldI * -1732503103 - cameraY, var28.uid * -1483668077);
                            }
                        }
                    }

                    LandscapeTile var32;
                    if (var6 < this.floors - 1) {
                        var32 = this.tiles[var6 + 1][var4][var5];
                        if (var32 != null && var32.fieldT) {
                            tileRenderDeque.add(var32);
                        }
                    }

                    if (var4 < cameraRegionX) {
                        var32 = var8[var4 + 1][var5];
                        if (var32 != null && var32.fieldT) {
                            tileRenderDeque.add(var32);
                        }
                    }

                    if (var5 < cameraRegionY) {
                        var32 = var8[var4][var5 + 1];
                        if (var32 != null && var32.fieldT) {
                            tileRenderDeque.add(var32);
                        }
                    }

                    if (var4 > cameraRegionX) {
                        var32 = var8[var4 - 1][var5];
                        if (var32 != null && var32.fieldT) {
                            tileRenderDeque.add(var32);
                        }
                    }

                    if (var5 > cameraRegionY) {
                        var32 = var8[var4][var5 - 1];
                        if (var32 != null && var32.fieldT) {
                            tileRenderDeque.add(var32);
                        }
                    }
                }
            }
        }
    }

    void ao(TileModel var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        int var8 = var1.fieldA.length;

        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        for (var9 = 0; var9 < var8; ++var9) {
            var10 = var1.fieldA[var9] - cameraX;
            var11 = var1.fieldV[var9] - cameraZ;
            var12 = var1.fieldI[var9] - cameraY;
            var13 = var12 * var4 + var10 * var5 >> 16;
            var12 = var12 * var5 - var10 * var4 >> 16;
            var10 = var13;
            var13 = var11 * var3 - var12 * var2 >> 16;
            var12 = var11 * var2 + var12 * var3 >> 16;
            if (var12 < 50) {
                return;
            }

            if (var1.fieldS != null) {
                TileModel.fieldH[var9] = var10;
                TileModel.fieldU[var9] = var13;
                TileModel.fieldJ[var9] = var12;
            }

            TileModel.fieldQ[var9] = RSGraphics2D.screenCenterX + (var10 << 9) / var12;
            TileModel.fieldT[var9] = RSGraphics2D.screenCenterY + (var13 << 9) / var12;
        }

        RSGraphics2D.alpha = 0;
        var8 = var1.fieldW.length;

        for (var9 = 0; var9 < var8; ++var9) {
            var10 = var1.fieldW[var9];
            var11 = var1.fieldE[var9];
            var12 = var1.fieldN[var9];
            var13 = TileModel.fieldQ[var10];
            int var14 = TileModel.fieldQ[var11];
            int var15 = TileModel.fieldQ[var12];
            int var16 = TileModel.fieldT[var10];
            int var17 = TileModel.fieldT[var11];
            int var18 = TileModel.fieldT[var12];
            if ((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) {
                RSGraphics2D.offscreen = false;
                if (var13 < 0 || var14 < 0 || var15 < 0 || var13 > RSGraphics2D.fieldJ || var14 > RSGraphics2D.fieldJ || var15 > RSGraphics2D.fieldJ) {
                    RSGraphics2D.offscreen = true;
                }

                if (checkMouse && this.isPointInTile(mouseX, mouseY, var16, var17, var18, var13, var14, var15)) {
                    selectedTileRegionX = var6;
                    selectedTileRegionY = var7;
                }

                if (var1.fieldS != null && var1.fieldS[var9] != -1) {
                    if (!fieldA) {
                        if (var1.fieldK) {
                            RSGraphics2D.method319(var16, var17, var18, var13, var14, var15, var1.fieldB[var9], var1.fieldL[var9], var1.fieldM[var9], TileModel.fieldH[0], TileModel.fieldH[1], TileModel.fieldH[3], TileModel.fieldU[0], TileModel.fieldU[1], TileModel.fieldU[3], TileModel.fieldJ[0], TileModel.fieldJ[1], TileModel.fieldJ[3], var1.fieldS[var9]);
                        } else {
                            RSGraphics2D.method319(var16, var17, var18, var13, var14, var15, var1.fieldB[var9], var1.fieldL[var9], var1.fieldM[var9], TileModel.fieldH[var10], TileModel.fieldH[var11], TileModel.fieldH[var12], TileModel.fieldU[var10], TileModel.fieldU[var11], TileModel.fieldU[var12], TileModel.fieldJ[var10], TileModel.fieldJ[var11], TileModel.fieldJ[var12], var1.fieldS[var9]);
                        }
                    } else {
                        int var19 = RSGraphics2D.fieldAs.v(var1.fieldS[var9], (byte) -46);
                        RSGraphics2D.method316(var16, var17, var18, var13, var14, var15, method301(var19, var1.fieldB[var9]), method301(var19, var1.fieldL[var9]), method301(var19, var1.fieldM[var9]));
                    }
                } else if (var1.fieldB[var9] != 12345678) {
                    RSGraphics2D.method316(var16, var17, var18, var13, var14, var15, var1.fieldB[var9], var1.fieldL[var9], var1.fieldM[var9]);
                }
            }
        }

    }
}
