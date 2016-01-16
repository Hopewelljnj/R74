package com.jagex;

public class UtilClass43 {

    UtilClass43() throws Throwable {
        throw new Error();
    }

    public static boolean spawning = false;

    static final void spawnObject(int floor, int stubType, int regionX, int regionY, int objectId, int rotation, int objectType, int dummy) {
        spawning = true;
        ObjectDefinition def = PlayerConfig.getObjectDef(objectId, -728879184);
        System.out.println("Spawn Object[name=" + def.name + ",id=" + objectId + ",stub-type=" + stubType + "object-type=" + objectType + "x=" + regionX + ",y=" + regionY + "]");
        try {
            if (regionX >= 1 && regionY >= 1 && regionX <= 102 && regionY <= 102) {
                if (Client.lowMemory && floor != Client.floorLevel * 87713183) {
                    spawning = false;
                    return;
                }

                int uid = 0;

                if (stubType == 0) {
                    uid = Client.landscape.getBoundaryUID(floor, regionX, regionY);
                }

                if (1 == stubType) {
                    uid = Client.landscape.getBoundaryDecUid(floor, regionX, regionY);
                }

                if (2 == stubType) {
                    uid = Client.landscape.getObjectUID(floor, regionX, regionY);
                }

                if (stubType == 3) {
                    uid = Client.landscape.getTileDecoUID(floor, regionX, regionY);
                }

                int config;
                if (uid != 0) { //object already exists, an object with the uid is already on the tile
                    config = Client.landscape.configForUid(floor, regionX, regionY, uid);
                    int objId = uid >> 14 & 32767;
                    int objType = config & 31;
                    int objRotation = config >> 6 & 3;
                    ObjectDefinition objDef = PlayerConfig.getObjectDef(objId, -728879184);
                    System.out.println("Remove Object[name=" + objDef.name + ",id=" + objId + ",stub-type=" + stubType + ",object-type=" + objectType + ".x=" + regionX + ",y=" + regionY + "]");
                    if (stubType == 0) {
                        Client.landscape.removeBoundary(floor, regionX, regionY);
                        objDef = PlayerConfig.getObjectDef(objId, 673046922);
                        if (objDef.fieldU * 2025817487 != 0) {
                            Client.collisionMaps[floor].w(regionX, regionY, objType, objRotation, objDef.fieldJ, 2122433919);
                        }
                    }
                    if (1 == stubType) {
                        Client.landscape.removeBoundaryDecoration(floor, regionX, regionY);
                    }

                    if (stubType == 2) {
                        label617:
                        {
                            Client.landscape.removeObject(floor, regionX, regionY);
                            objDef = PlayerConfig.getObjectDef(objId, -728879184);
                            if (objDef.sizeX * -1151280759 + regionX <= 103 && regionY + objDef.sizeX * -1151280759 <= 103) {
                                if (regionX + objDef.sizeY * -1255940743 <= 103) {
                                    if (objDef.sizeY * -1255940743 + regionY <= 103) {
                                        if (0 != objDef.fieldU * 2025817487) {
                                            Client.collisionMaps[floor].removeObject(regionX, regionY, objDef.sizeX * -1151280759, objDef.sizeY * -1255940743, objRotation, objDef.fieldJ, 1992996084);
                                        }
                                        break label617;
                                    }
                                }
                            }
                            spawning = false;
                            return;
                        }
                    }
                    if (stubType == 3) {
                        Client.landscape.removeTileDecoration(floor, regionX, regionY);
                        objDef = PlayerConfig.getObjectDef(objId, -1531853766);
                        if (1 == objDef.fieldU * 2025817487) {
                            Client.collisionMaps[floor].s(regionX, regionY, (byte) 68);
                        }
                    }
                }

                if (objectId >= 0) {
                    config = floor;
                    if (floor < 3 && 2 == (classM.renderRules[1][regionX][regionY] & 2)) {
                        config = floor + 1;
                    }

                    CollisionMap collisionMap;
                    ObjectDefinition objDef;
                    int sizeX;
                    int sizeY;
                    Landscape landscape;
                    label567:
                    {
                        landscape = Client.landscape;
                        collisionMap = Client.collisionMaps[floor];
                        objDef = PlayerConfig.getObjectDef(objectId, -164443394);
                        if (1 != rotation && rotation != 3) {
                            sizeX = objDef.sizeX * -1151280759;
                            sizeY = objDef.sizeY * -1255940743;
                            break label567;
                        }
                        sizeX = objDef.sizeY * -1255940743;
                        sizeY = objDef.sizeX * -1151280759;
                    }
                    int var18;
                    int var19;
                    if (sizeX + regionX <= 104) {
                        var18 = (sizeX >> 1) + regionX;
                        var19 = regionX + (sizeX + 1 >> 1);
                    } else {
                        var18 = regionX;
                        var19 = 1 + regionX;
                    }

                    int var20;
                    int var21;
                    if (regionY + sizeY <= 104) {
                        var20 = (sizeY >> 1) + regionY;
                        var21 = regionY + (1 + sizeY >> 1);
                    } else {
                        var20 = regionY;
                        var21 = 1 + regionY;
                    }

                    int[][] var22 = classM.tileHeights[config];
                    int height = var22[var18][var20] + var22[var19][var20] + var22[var18][var21] + var22[var19][var21] >> 2;
                    int var24 = (regionX << 7) + (sizeX << 6);
                    int var25 = (regionY << 7) + (sizeY << 6);
                    int objUid = (objectId << 14) + regionX + (regionY << 7) + 1073741824;

                    if (objDef.fieldG * 243222597 == 0) {
                        objUid -= Integer.MIN_VALUE;
                    }

                    int cfg = (rotation << 6) + objectType;

                    if (1 == objDef.fieldAo * 2025716797) {
                        cfg += 256;
                    }

                    Renderable var28;
                    if (22 == objectType) { // Tile Decoration Object
                        if (-1 == objDef.animationId * 1563734127 && objDef.transformIds == null) {
                            var28 = objDef.n(22, rotation, var22, var24, height, var25, (byte) 16);
                        } else {
                            var28 = new DynamicObject(objectId, 22, rotation, cfg, regionX, regionY, objDef.animationId * 1563734127, true, (Renderable) null);
                        }
                        landscape.setTileDecoration(floor, regionX, regionY, height, (Renderable) var28, objUid, cfg);
                        if (objDef.fieldU * 2025817487 == 1) {
                            collisionMap.l(regionX, regionY, -1036387262);
                        }
                    } else {
                        if (10 != objectType) {
                            if (11 != objectType) {
                                if (objectType >= 12) {
                                    if (-1 == objDef.animationId * 1563734127 && null == objDef.transformIds) {
                                        var28 = objDef.n(objectType, rotation, var22, var24, height, var25, (byte) 16);
                                    } else {
                                        var28 = new DynamicObject(objectId, objectType, rotation, cfg, regionX, regionY, objDef.animationId * 1563734127, true, (Renderable) null);
                                    }
                                    landscape.k(floor, regionX, regionY, height, 1, 1, (Renderable) var28, 0, objUid, cfg);
                                    if (objDef.fieldU * 2025817487 != 0) {
                                        collisionMap.i(regionX, regionY, sizeX, sizeY, objDef.fieldJ, 1279348157);
                                        spawning = false;
                                        return;
                                    }
                                    spawning = false;
                                    return;
                                } else if (0 == objectType) { //Boundary

                                    label487:
                                    {
                                        if (-1 == objDef.animationId * 1563734127) {

                                            if (objDef.transformIds == null) {


                                                var28 = objDef.n(0, rotation, var22, var24, height, var25, (byte) 16);
                                                break label487;
                                            }
                                        }

                                        var28 = new DynamicObject(objectId, 0, rotation, cfg, regionX, regionY, objDef.animationId * 1563734127, true, (Renderable) null);
                                    }

                                    landscape.setBoundary(floor, regionX, regionY, height, (Renderable) var28, (Renderable) null, classM.fieldU[rotation], 0, objUid, cfg);

                                    if (objDef.fieldU * 2025817487 != 0) {
                                        collisionMap.v(regionX, regionY, objectType, rotation, objDef.fieldJ, -1170844777);
                                        spawning = false;
                                        return;
                                    }

                                    spawning = false;
                                    return;

                                } else if (1 == objectType) { //Boundary

                                    if (-1 == objDef.animationId * 1563734127 && null == objDef.transformIds) {
                                        var28 = objDef.n(1, rotation, var22, var24, height, var25, (byte) 16);
                                    } else {
                                        var28 = new DynamicObject(objectId, 1, rotation, cfg, regionX, regionY, objDef.animationId * 1563734127, true, (Renderable) null);
                                    }

                                    landscape.setBoundary(floor, regionX, regionY, height, (Renderable) var28, (Renderable) null, classM.fieldJ[rotation], 0, objUid, cfg);

                                    if (objDef.fieldU * 2025817487 != 0) {
                                        collisionMap.v(regionX, regionY, objectType, rotation, objDef.fieldJ, -676812782);
                                        spawning = false;
                                        return;
                                    }

                                    spawning = false;
                                    return;
                                } else {
                                    Object var30;
                                    int var39;
                                    if (2 == objectType) { //Boundary
                                        var39 = (rotation + 1) & 3;
                                        Object var29;

                                        if (-1 == objDef.animationId * 1563734127 && null == objDef.transformIds) {
                                            var29 = objDef.n(2, 4 + rotation, var22, var24, height, var25, (byte) 16);
                                            var30 = objDef.n(2, var39, var22, var24, height, var25, (byte) 16);
                                        } else {
                                            var29 = new DynamicObject(objectId, 2, rotation + 4, cfg, regionX, regionY, objDef.animationId * 1563734127, true, (Renderable) null);
                                            var30 = new DynamicObject(objectId, 2, var39, cfg, regionX, regionY, objDef.animationId * 1563734127, true, (Renderable) null);
                                        }

                                        landscape.setBoundary(floor, regionX, regionY, height, (Renderable) var29, (Renderable) var30, classM.fieldU[rotation], classM.fieldU[var39], objUid, cfg);
                                        if (0 != objDef.fieldU * 2025817487) {
                                            collisionMap.v(regionX, regionY, objectType, rotation, objDef.fieldJ, -683150842);
                                            spawning = false;
                                            return;
                                        }

                                        spawning = false;
                                        return;
                                    } else if (objectType == 3) { //Boundary

                                        label480:
                                        {

                                            if (-1 == objDef.animationId * 1563734127) {
                                                if (objDef.transformIds == null) {
                                                    var28 = objDef.n(3, rotation, var22, var24, height, var25, (byte) 16);
                                                    break label480;
                                                }
                                            }

                                            var28 = new DynamicObject(objectId, 3, rotation, cfg, regionX, regionY, objDef.animationId * 1563734127, true, (Renderable) null);
                                        }

                                        landscape.setBoundary(floor, regionX, regionY, height, (Renderable) var28, (Renderable) null, classM.fieldJ[rotation], 0, objUid, cfg);
                                        if (0 != objDef.fieldU * 2025817487) {
                                            collisionMap.v(regionX, regionY, objectType, rotation, objDef.fieldJ, -353952802);
                                            spawning = false;
                                            return;
                                        }

                                        spawning = false;
                                        return;
                                    } else if (objectType == 9) {
                                        if (dummy == -2121548036) {
                                            throw new IllegalStateException();
                                        }

                                        if (objDef.animationId * 1563734127 == -1 && null == objDef.transformIds) {
                                            var28 = objDef.n(objectType, rotation, var22, var24, height, var25, (byte) 16);
                                        } else {
                                            var28 = new DynamicObject(objectId, objectType, rotation, cfg, regionX, regionY, objDef.animationId * 1563734127, true, (Renderable) null);
                                        }

                                        landscape.k(floor, regionX, regionY, height, 1, 1, (Renderable) var28, 0, objUid, cfg);
                                        if (0 != objDef.fieldU * 2025817487) {
                                            collisionMap.i(regionX, regionY, sizeX, sizeY, objDef.fieldJ, 366479233);
                                            spawning = false;
                                            return;
                                        }

                                        spawning = false;
                                        return;
                                    } else if (4 == objectType) { //Boundary Deco


                                        label541:
                                        {
                                            if (objDef.animationId * 1563734127 == -1) {
                                                if (objDef.transformIds == null) {
                                                    var28 = objDef.n(4, rotation, var22, var24, height, var25, (byte) 16);
                                                    break label541;
                                                }
                                            }

                                            var28 = new DynamicObject(objectId, 4, rotation, cfg, regionX, regionY, objDef.animationId * 1563734127, true, (Renderable) null);
                                        }

                                        landscape.setBoundaryDecoration(floor, regionX, regionY, height, (Renderable) var28, (Renderable) null, classM.fieldU[rotation], 0, 0, 0, objUid, cfg);
                                        spawning = false;
                                        return;
                                    } else {
                                        int var38;
                                        if (5 == objectType) { //Boundary Deco

                                            var39 = 16;
                                            var38 = landscape.getBoundaryUID(floor, regionX, regionY);
                                            if (0 != var38) {
                                                var39 = PlayerConfig.getObjectDef(var38 >> 14 & 32767, -82085691).wallThickness * -1110459981;
                                            }

                                            label531:
                                            {
                                                if (-1 == objDef.animationId * 1563734127) {
                                                    if (dummy == -2121548036) {
                                                        throw new IllegalStateException();
                                                    }

                                                    if (null == objDef.transformIds) {
                                                        if (dummy == -2121548036) {
                                                            throw new IllegalStateException();
                                                        }

                                                        var30 = objDef.n(4, rotation, var22, var24, height, var25, (byte) 16);
                                                        break label531;
                                                    }
                                                }

                                                var30 = new DynamicObject(objectId, 4, rotation, cfg, regionX, regionY, objDef.animationId * 1563734127, true, (Renderable) null);
                                            }

                                            landscape.setBoundaryDecoration(floor, regionX, regionY, height, (Renderable) var30, (Renderable) null, classM.fieldU[rotation], 0, classM.XScalar[rotation] * var39, classM.YScalar[rotation] * var39, objUid, cfg);
                                            spawning = false;
                                            return;
                                        } else if (6 == objectType) { //BoundaryDeco
                                            var39 = 8;
                                            var38 = landscape.getBoundaryUID(floor, regionX, regionY);
                                            if (var38 != 0) {
                                                var39 = PlayerConfig.getObjectDef(var38 >> 14 & 32767, 416383534).wallThickness * -1110459981 / 2;
                                            }

                                            if (-1 == objDef.animationId * 1563734127 && objDef.transformIds == null) {
                                                var30 = objDef.n(4, 4 + rotation, var22, var24, height, var25, (byte) 16);
                                            } else {
                                                var30 = new DynamicObject(objectId, 4, 4 + rotation, cfg, regionX, regionY, objDef.animationId * 1563734127, true, (Renderable) null);
                                            }

                                            landscape.setBoundaryDecoration(floor, regionX, regionY, height, (Renderable) var30, (Renderable) null, 256, rotation, classM.DiagXScalar[rotation] * var39, var39 * classM.DiagYScalar[rotation], objUid, cfg);
                                            spawning = false;
                                            return;
                                        } else {
                                            if (objectType == 7) { //BoundaryDeco

                                                label516:
                                                {
                                                    var38 = (rotation + 2) & 3;
                                                    if (-1 == objDef.animationId * 1563734127) {


                                                        if (objDef.transformIds == null) {


                                                            var28 = objDef.n(4, 4 + var38, var22, var24, height, var25, (byte) 16);
                                                            break label516;
                                                        }
                                                    }

                                                    var28 = new DynamicObject(objectId, 4, 4 + var38, cfg, regionX, regionY, objDef.animationId * 1563734127, true, (Renderable) null);
                                                }

                                                landscape.setBoundaryDecoration(floor, regionX, regionY, height, (Renderable) var28, (Renderable) null, 256, var38, 0, 0, objUid, cfg);
                                            } else if (8 == objectType) { //BoundaryDeco

                                                var39 = 8;
                                                var38 = landscape.getBoundaryUID(floor, regionX, regionY);
                                                if (var38 != 0) {
                                                    var39 = PlayerConfig.getObjectDef(var38 >> 14 & 32767, -847529944).wallThickness * -1110459981 / 2;
                                                }

                                                Object var31;
                                                label506:
                                                {
                                                    int var32 = (2 + rotation) & 3;
                                                    if (-1 == objDef.animationId * 1563734127) {


                                                        if (objDef.transformIds == null) {
                                                            var30 = objDef.n(4, rotation + 4, var22, var24, height, var25, (byte) 16);
                                                            var31 = objDef.n(4, 4 + var32, var22, var24, height, var25, (byte) 16);
                                                            break label506;
                                                        }
                                                    }

                                                    var30 = new DynamicObject(objectId, 4, 4 + rotation, cfg, regionX, regionY, objDef.animationId * 1563734127, true, (Renderable) null);
                                                    var31 = new DynamicObject(objectId, 4, 4 + var32, cfg, regionX, regionY, objDef.animationId * 1563734127, true, (Renderable) null);
                                                }

                                                landscape.setBoundaryDecoration(floor, regionX, regionY, height, (Renderable) var30, (Renderable) var31, 256, rotation, classM.DiagXScalar[rotation] * var39, classM.DiagYScalar[rotation] * var39, objUid, cfg);
                                                spawning = false;
                                                return;
                                            }

                                            spawning = false;
                                            return;
                                        }
                                    }
                                }
                            }

                            if (dummy == -2121548036) {
                                throw new IllegalStateException();
                            }
                        }

                        label457:
                        {
                            if (-1 == objDef.animationId * 1563734127) {
                                if (objDef.transformIds == null) {

                                    var28 = objDef.n(10, rotation, var22, var24, height, var25, (byte) 16);
                                    break label457;
                                }
                            }

                            var28 = new DynamicObject(objectId, 10, rotation, cfg, regionX, regionY, objDef.animationId * 1563734127, true, (Renderable) null);
                        }


                        if (var28 != null) {
                            short var10008;
                            if (objectType == 11) {
                                var10008 = 256;
                            } else {
                                var10008 = 0;
                            }

                            landscape.k(floor, regionX, regionY, height, sizeX, sizeY, (Renderable) var28, var10008, objUid, cfg);
                        }

                        if (objDef.fieldU * 2025817487 != 0) {
                            collisionMap.i(regionX, regionY, sizeX, sizeY, objDef.fieldJ, 27641709);
                        }
                    }
                }
            }

        } catch (RuntimeException var33) {
            throw ClanMate.error(var33, "en.bi(" + ')');
        }
    }

    static void method187(int var0, int var1, int var2, int var3, int DUMMY) {
        try {

            Widget var5 = Message.getWidget(var0, var1, (byte) 0);
            if (null != var5) {
                if (var5.fieldCp != null) {
                    ScriptEvent var6 = new ScriptEvent();
                    var6.src = var5;
                    var6.args = var5.fieldCp;
                    classT.method167(var6, (byte) 1);
                }
            }

            Client.fieldJe = var3 * -1969677057;
            Client.isSpellSelected = true;
            classG.selectedSpellParentUID = var0 * -1353677371;
            Client.selectedSpellChildIndex = var1 * 30981765;
            UtilClass40.selectedSpellTargetFlags = var2 * -302910759;
            classBx.method250(var5, 57574739);
        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "en.bv(" + ')');
        }
    }
}
