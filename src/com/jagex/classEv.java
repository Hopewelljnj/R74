package com.jagex;

import java.awt.*;

public class classEv extends Node {

    public static boolean fieldM;
    static FontMetrics fieldBf;
    public byte[] fieldV;
    public classDz fieldI;
    public ReferenceTableSub fieldB;
    int fieldA;


    static final void addCacheObject(int var0, int var1, int var2, int var3, int var4, int objectType, Landscape var6, CollisionMap var7, int var8) {
        try {
            if (Client.lowMemory) {
                if ((classM.renderRules[0][var1][var2] & 2) == 0) {
                    if (0 != (classM.renderRules[var0][var1][var2] & 16)) {
                        return;
                    }
                    int var9;
                    if ((classM.renderRules[var0][var1][var2] & 8) != 0) {
                        var9 = 0;
                    } else {
                        label897:
                        {
                            if (var0 > 0 && 0 != (classM.renderRules[1][var1][var2] & 2)) {
                                var9 = var0 - 1;
                                break label897;
                            }

                            var9 = var0;
                        }
                    }

                    if (Client.fieldCs * -526352391 != var9) {
                        return;
                    }
                }
            }

            if (var0 < classM.fieldI * -364622169) {
                classM.fieldI = -2049935081 * var0;
            }

            int var10;
            int var11;
            ObjectDefinition var28;
            label890:
            {
                var28 = PlayerConfig.getObjectDef(var3, -1301281814);
                if (var4 != 1) {
                    if (3 != var4) {
                        var10 = var28.sizeX * -1151280759;
                        var11 = var28.sizeY * -1255940743;
                        break label890;
                    }
                }

                var10 = var28.sizeY * -1255940743;
                var11 = var28.sizeX * -1151280759;
            }

            int var12;
            int var13;
            if (var10 + var1 <= 104) {
                var12 = (var10 >> 1) + var1;
                var13 = (1 + var10 >> 1) + var1;
            } else {
                var12 = var1;
                var13 = var1 + 1;
            }

            int var14;
            int var15;
            if (var2 + var11 <= 104) {
                var14 = var2 + (var11 >> 1);
                var15 = (1 + var11 >> 1) + var2;
            } else {
                var14 = var2;
                var15 = 1 + var2;
            }

            int[][] var16 = classM.tileHeights[var0];
            int var17 = var16[var13][var14] + var16[var12][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
            int var18 = (var10 << 6) + (var1 << 7);
            int var19 = (var11 << 6) + (var2 << 7);
            int var20 = (var3 << 14) + (var2 << 7) + var1 + 1073741824;
            if (0 == var28.fieldG * 243222597) {
                var20 -= Integer.MIN_VALUE;
            }

            int var21 = objectType + (var4 << 6);
            if (var28.fieldAo * 2025716797 == 1) {
                var21 += 256;
            }

            int var23;
            int var24;
            if (var28.x(1425122944)) {
                classG var22;
                label877:
                {
                    var22 = new classG();
                    var22.fieldV = var0 * 1415505991;
                    var22.fieldI = -95831680 * var1;
                    var22.fieldB = 1317169536 * var2;
                    var23 = var28.sizeX * -1151280759;
                    var24 = var28.sizeY * -1255940743;
                    if (1 != var4) {
                        if (var8 <= -1249009197) {
                            throw new IllegalStateException();
                        }

                        if (var4 != 3) {
                            break label877;
                        }
                    }

                    var23 = var28.sizeY * -1255940743;
                    var24 = var28.sizeX * -1151280759;
                }

                var22.fieldL = -1905696128 * (var23 + var1);
                var22.fieldM = (var24 + var2) * 2021602176;
                var22.fieldE = var28.fieldAk * -854960991;
                var22.fieldW = var28.fieldAj * 2040064896;
                var22.fieldS = var28.fieldAf * 467187331;
                var22.fieldK = var28.fieldAb * -1684023079;
                var22.fieldF = var28.fieldAc;
                if (null != var28.transformIds) {
                    if (var8 <= -1249009197) {
                        return;
                    }

                    var22.fieldO = var28;
                    var22.i((byte) 50);
                }

                classG.fieldA.add(var22);
                if (null != var22.fieldF) {
                    if (var8 <= -1249009197) {
                        return;
                    }

                    var22.fieldD = (var22.fieldS * 1307018579 + (int) (Math.random() * (double) (var22.fieldK * -767190129 - var22.fieldS * 1307018579))) * -1044788389;
                }
            }

            Object var29;
            if (22 == objectType) {
                if (Client.lowMemory && var28.fieldG * 243222597 == 0 && var28.fieldU * 2025817487 != 1) {
                    if (!var28.fieldAt) {
                        return;
                    }
                    label736:
                    {
                        if (-1 == var28.animationId * 1563734127) {
                            if (null == var28.transformIds) {
                                var29 = var28.e(22, var4, var16, var18, var17, var19, 518596439);
                                break label736;
                            }
                        }

                        var29 = new DynamicObject(var3, 22, var4, var0, var1, var2, var28.animationId * 1563734127, true, (Renderable) null);
                    }

                    var6.setTileDecoration(var0, var1, var2, var17, (Renderable) var29, var20, var21);
                    if (1 == var28.fieldU * 2025817487) {
                        if (var8 <= -1249009197) {
                            return;
                        }

                        if (null != var7) {
                            if (var8 <= -1249009197) {
                                throw new IllegalStateException();
                            }

                            var7.l(var1, var2, -758689793);
                        }
                    }

                }
            } else {
                if (objectType != 10) {
                    if (var8 <= -1249009197) {
                        throw new IllegalStateException();
                    }

                    if (objectType != 11) {
                        if (objectType >= 12) {

            /*               if(objectType == 13) {
                               var4 = 2;
                               var0 = 0;
                               var2 += 3;
                              // objectType = 19;

                           }*/

                            if (var8 <= -1249009197) {
                                throw new IllegalStateException();
                            }

                            label746:
                            {
                                if (var28.animationId * 1563734127 == -1) {
                                    if (null == var28.transformIds) {
                                        var29 = var28.e(objectType, var4, var16, var18, var17, var19, 518596439);
                                 /*       if(objectType == 18) {
                                            System.out.println(var0 + "," + var1 + "," + var2);System.out.println(var0 + "," + var1 + "," + var2);
                                        //   var29 = null;
                                        }*/
                                        break label746;
                                    }
                                }

                                var29 = new DynamicObject(var3, objectType, var4, var0, var1, var2, var28.animationId * 1563734127, true, (Renderable) null);
                            }

                            var6.k(var0, var1, var2, var17, 1, 1, (Renderable) var29, 0, var20, var21);
                            if (objectType >= 12 && objectType <= 17 && objectType != 13 && var0 > 0) {
                                Buffer.fieldO[var0][var1][var2] |= 2340;
                            }

                            if (0 != var28.fieldU * 2025817487 && null != var7) {
                                var7.i(var1, var2, var10, var11, var28.fieldJ, 1764060776);
                            }

                            return;
                        }

                        if (0 == objectType) {

                            label754:
                            {
                                if (var28.animationId * 1563734127 == -1) {
                                    if (var8 <= -1249009197) {
                                        throw new IllegalStateException();
                                    }

                                    if (var28.transformIds == null) {
                                        if (var8 <= -1249009197) {
                                            throw new IllegalStateException();
                                        }

                                        var29 = var28.e(0, var4, var16, var18, var17, var19, 518596439);
                                        break label754;
                                    }
                                }

                                var29 = new DynamicObject(var3, 0, var4, var0, var1, var2, var28.animationId * 1563734127, true, (Renderable) null);
                            }

                            var6.setBoundary(var0, var1, var2, var17, (Renderable) var29, (Renderable) null, classM.fieldU[var4], 0, var20, var21);
                            if (var4 == 0) {
                                if (var8 <= -1249009197) {
                                    return;
                                }

                                if (var28.fieldAl) {
                                    if (var8 <= -1249009197) {
                                        throw new IllegalStateException();
                                    }

                                    classCn.fieldE[var0][var1][var2] = 50;
                                    classCn.fieldE[var0][var1][var2 + 1] = 50;
                                }

                                if (var28.fieldR) {
                                    Buffer.fieldO[var0][var1][var2] |= 585;
                                }
                            } else if (var4 == 1) {
                                if (var28.fieldAl) {
                                    if (var8 <= -1249009197) {
                                        throw new IllegalStateException();
                                    }

                                    classCn.fieldE[var0][var1][var2 + 1] = 50;
                                    classCn.fieldE[var0][var1 + 1][1 + var2] = 50;
                                }

                                if (var28.fieldR) {
                                    if (var8 <= -1249009197) {
                                        throw new IllegalStateException();
                                    }

                                    Buffer.fieldO[var0][var1][1 + var2] |= 1170;
                                }
                            } else if (2 == var4) {
                                if (var8 <= -1249009197) {
                                    throw new IllegalStateException();
                                }

                                if (var28.fieldAl) {
                                    if (var8 <= -1249009197) {
                                        throw new IllegalStateException();
                                    }

                                    classCn.fieldE[var0][1 + var1][var2] = 50;
                                    classCn.fieldE[var0][1 + var1][1 + var2] = 50;
                                }

                                if (var28.fieldR) {
                                    if (var8 <= -1249009197) {
                                        throw new IllegalStateException();
                                    }

                                    Buffer.fieldO[var0][1 + var1][var2] |= 585;
                                }
                            } else if (var4 == 3) {
                                if (var8 <= -1249009197) {
                                    return;
                                }

                                if (var28.fieldAl) {
                                    if (var8 <= -1249009197) {
                                        throw new IllegalStateException();
                                    }

                                    classCn.fieldE[var0][var1][var2] = 50;
                                    classCn.fieldE[var0][1 + var1][var2] = 50;
                                }

                                if (var28.fieldR) {
                                    if (var8 <= -1249009197) {
                                        throw new IllegalStateException();
                                    }

                                    Buffer.fieldO[var0][var1][var2] |= 1170;
                                }
                            }

                            if (var28.fieldU * 2025817487 != 0 && var7 != null) {
                                if (var8 <= -1249009197) {
                                    throw new IllegalStateException();
                                }

                                var7.v(var1, var2, objectType, var4, var28.fieldJ, 170122424);
                            }

                            if (var28.wallThickness * -1110459981 != 16) {
                                if (var8 <= -1249009197) {
                                    throw new IllegalStateException();
                                }

                                var6.t(var0, var1, var2, var28.wallThickness * -1110459981);
                            }

                            return;
                        }

                        if (objectType == 1) {


                            if (var8 <= -1249009197) {
                                throw new IllegalStateException();
                            }

                            label762:
                            {
                                if (var28.animationId * 1563734127 == -1) {
                                    if (var8 <= -1249009197) {
                                        return;
                                    }

                                    if (var28.transformIds == null) {
                                        if (var8 <= -1249009197) {
                                            throw new IllegalStateException();
                                        }

                                        var29 = var28.e(1, var4, var16, var18, var17, var19, 518596439);
                                        break label762;
                                    }
                                }

                                var29 = new DynamicObject(var3, 1, var4, var0, var1, var2, var28.animationId * 1563734127, true, (Renderable) null);
                            }

                            var6.setBoundary(var0, var1, var2, var17, (Renderable) var29, (Renderable) null, classM.fieldJ[var4], 0, var20, var21);
                            if (var28.fieldAl) {
                                if (var8 <= -1249009197) {
                                    throw new IllegalStateException();
                                }

                                if (var4 == 0) {
                                    classCn.fieldE[var0][var1][1 + var2] = 50;
                                } else if (1 == var4) {
                                    if (var8 <= -1249009197) {
                                        throw new IllegalStateException();
                                    }

                                    classCn.fieldE[var0][1 + var1][1 + var2] = 50;
                                } else if (2 == var4) {
                                    if (var8 <= -1249009197) {
                                        throw new IllegalStateException();
                                    }

                                    classCn.fieldE[var0][1 + var1][var2] = 50;
                                } else if (var4 == 3) {
                                    if (var8 <= -1249009197) {
                                        throw new IllegalStateException();
                                    }

                                    classCn.fieldE[var0][var1][var2] = 50;
                                }
                            }

                            if (0 != var28.fieldU * 2025817487) {
                                if (var8 <= -1249009197) {
                                    throw new IllegalStateException();
                                }

                                if (var7 != null) {
                                    if (var8 <= -1249009197) {
                                        return;
                                    }

                                    var7.v(var1, var2, objectType, var4, var28.fieldJ, -648202591);
                                }
                            }

                            return;
                        }

                        int var30;
                        Object var31;
                        if (2 == objectType) {
                            if (var8 <= -1249009197) {
                                return;
                            }

                            Object var33;
                            label771:
                            {
                                //  var4 = 1;
                                var30 = var4 + 1 & 3; //test
                                if (-1 == var28.animationId * 1563734127) {
                                    if (var8 <= -1249009197) {
                                        throw new IllegalStateException();
                                    }

                                    if (null == var28.transformIds) {
                                        var33 = var28.e(2, var4 + 4, var16, var18, var17, var19, 518596439);
                                        var31 = var28.e(2, var30, var16, var18, var17, var19, 518596439);
                                        break label771;
                                    }
                                }

                                var33 = new DynamicObject(var3, 2, 4 + var4, var0, var1, var2, var28.animationId * 1563734127, true, (Renderable) null);
                                var31 = new DynamicObject(var3, 2, var30, var0, var1, var2, var28.animationId * 1563734127, true, (Renderable) null);
                            }

                            var6.setBoundary(var0, var1, var2, var17, (Renderable) var33, (Renderable) var31, classM.fieldU[var4], classM.fieldU[var30], var20, var21);
                            if (var28.fieldR) {
                                if (var4 == 0) {
                                    if (var8 <= -1249009197) {
                                        throw new IllegalStateException();
                                    }

                                    Buffer.fieldO[var0][var1][var2] |= 585;
                                    Buffer.fieldO[var0][var1][1 + var2] |= 1170;
                                } else if (1 == var4) {
                                    if (var8 <= -1249009197) {
                                        throw new IllegalStateException();
                                    }

                                    Buffer.fieldO[var0][var1][1 + var2] |= 1170;
                                    Buffer.fieldO[var0][var1 + 1][var2] |= 585;
                                } else if (2 == var4) {
                                    Buffer.fieldO[var0][1 + var1][var2] |= 585;
                                    Buffer.fieldO[var0][var1][var2] |= 1170;
                                } else if (var4 == 3) {
                                    if (var8 <= -1249009197) {
                                        return;
                                    }

                                    Buffer.fieldO[var0][var1][var2] |= 1170;
                                    Buffer.fieldO[var0][var1][var2] |= 585;
                                }
                            }

                            if (0 != var28.fieldU * 2025817487) {
                                if (var8 <= -1249009197) {
                                    return;
                                }

                                if (var7 != null) {
                                    if (var8 <= -1249009197) {
                                        throw new IllegalStateException();
                                    }

                                    var7.v(var1, var2, objectType, var4, var28.fieldJ, -388958298);
                                }
                            }

                            if (var28.wallThickness * -1110459981 != 16) {
                                if (var8 <= -1249009197) {
                                    throw new IllegalStateException();
                                }

                                var6.t(var0, var1, var2, var28.wallThickness * -1110459981);
                            }

                            return;
                        }

                        if (3 == objectType) {
                            if (var8 <= -1249009197) {
                                return;
                            }

                            label780:
                            {
                                if (var28.animationId * 1563734127 == -1) {
                                    if (var8 <= -1249009197) {
                                        return;
                                    }

                                    if (var28.transformIds == null) {
                                        if (var8 <= -1249009197) {
                                            throw new IllegalStateException();
                                        }

                                        var29 = null;
                                        var28.e(3, var4, var16, var18, var17, var19, 518596439);
                                        break label780;
                                    }
                                }

                                var29 = new DynamicObject(var3, 3, var4, var0, var1, var2, var28.animationId * 1563734127, true, (Renderable) null);
                            }

                            //   System.out.println(var0 + "," + var1 + "," + var2);
                            var6.setBoundary(var0, var1, var2, var17, (Renderable) var29, (Renderable) null, classM.fieldJ[var4], 0, var20, var21);
                            if (var28.fieldAl) {
                                if (var8 <= -1249009197) {
                                    return;
                                }

                                if (var4 == 0) {
                                    if (var8 <= -1249009197) {
                                        throw new IllegalStateException();
                                    }

                                    classCn.fieldE[var0][var1][var2 + 1] = 50;
                                } else if (1 == var4) {
                                    classCn.fieldE[var0][1 + var1][var2 + 1] = 50;
                                } else if (var4 == 2) {
                                    if (var8 <= -1249009197) {
                                        return;
                                    }

                                    classCn.fieldE[var0][1 + var1][var2] = 50;
                                } else if (3 == var4) {
                                    if (var8 <= -1249009197) {
                                        throw new IllegalStateException();
                                    }

                                    classCn.fieldE[var0][var1][var2] = 50;
                                }
                            }

                            if (var28.fieldU * 2025817487 != 0) {
                                if (var8 <= -1249009197) {
                                    return;
                                }

                                if (var7 != null) {
                                    if (var8 <= -1249009197) {
                                        throw new IllegalStateException();
                                    }

                                    var7.v(var1, var2, objectType, var4, var28.fieldJ, -1274958808);
                                }
                            }

                            return;
                        }

                        if (objectType == 9) {


                            label789:
                            {
                                if (-1 == var28.animationId * 1563734127) {
                                    if (var8 <= -1249009197) {
                                        throw new IllegalStateException();
                                    }

                                    if (null == var28.transformIds) {
                                        if (var8 <= -1249009197) {
                                            return;
                                        }

                                        var29 = var28.e(objectType, var4, var16, var18, var17, var19, 518596439);
                                        break label789;
                                    }
                                }

                                var29 = new DynamicObject(var3, objectType, var4, var0, var1, var2, var28.animationId * 1563734127, true, (Renderable) null);
                            }

                            var6.k(var0, var1, var2, var17, 1, 1, (Renderable) var29, 0, var20, var21);
                            if (var28.fieldU * 2025817487 != 0 && var7 != null) {
                                if (var8 <= -1249009197) {
                                    throw new IllegalStateException();
                                }

                                var7.i(var1, var2, var10, var11, var28.fieldJ, 1593603380);
                            }

                            if (16 != var28.wallThickness * -1110459981) {
                                if (var8 <= -1249009197) {
                                    throw new IllegalStateException();
                                }

                                var6.t(var0, var1, var2, var28.wallThickness * -1110459981);
                            }

                            return;
                        }

                        if (4 == objectType) {


                            if (var8 <= -1249009197) {
                                throw new IllegalStateException();
                            }

                            label797:
                            {
                                if (var28.animationId * 1563734127 == -1) {
                                    if (var8 <= -1249009197) {
                                        throw new IllegalStateException();
                                    }

                                    if (var28.transformIds == null) {
                                        if (var8 <= -1249009197) {
                                            return;
                                        }

                                        var29 = var28.e(4, var4, var16, var18, var17, var19, 518596439);
                                        break label797;
                                    }
                                }

                                var29 = new DynamicObject(var3, 4, var4, var0, var1, var2, var28.animationId * 1563734127, true, (Renderable) null);
                            }

                            var6.setBoundaryDecoration(var0, var1, var2, var17, (Renderable) var29, (Renderable) null, classM.fieldU[var4], 0, 0, 0, var20, var21);
                            return;
                        }

                        if (objectType == 5) {

                            // var4 = 3;
                            if (var8 <= -1249009197) {
                                return;
                            }

                            var30 = 16;
                            var23 = var6.getBoundaryUID(var0, var1, var2);
                            if (0 != var23) {
                                var30 = PlayerConfig.getObjectDef(var23 >> 14 & 32767, 65448608).wallThickness * -1110459981;
                            }

                            // var30 = 16;

                            label806:
                            {
                                if (-1 == var28.animationId * 1563734127) {
                                    if (var8 <= -1249009197) {
                                        throw new IllegalStateException();
                                    }

                                    if (var28.transformIds == null) {
                                        if (var8 <= -1249009197) {
                                            throw new IllegalStateException();
                                        }

                                        var31 = var28.e(4, var4, var16, var18, var17, var19, 518596439);
                                        break label806;
                                    }
                                }

                                var31 = new DynamicObject(var3, 4, var4, var0, var1, var2, var28.animationId * 1563734127, true, (Renderable) null);
                            }

                            var6.setBoundaryDecoration(var0, var1, var2, var17, (Renderable) var31, (Renderable) null, classM.fieldU[var4], 0, classM.XScalar[var4] * var30, classM.YScalar[var4] * var30, var20, var21);


                            return;
                        }

                        if (6 == objectType) {
                            if (var8 <= -1249009197) {
                                throw new IllegalStateException();
                            }

                            var30 = 8;
                            var23 = var6.getBoundaryUID(var0, var1, var2);
                            if (0 != var23) {
                                if (var8 <= -1249009197) {
                                    throw new IllegalStateException();
                                }

                                var30 = PlayerConfig.getObjectDef(var23 >> 14 & 32767, 1418822396).wallThickness * -1110459981 / 2;
                            }

                            if (var28.animationId * 1563734127 == -1 && null == var28.transformIds) {
                                if (var8 <= -1249009197) {
                                    return;
                                }

                                var31 = var28.e(4, 4 + var4, var16, var18, var17, var19, 518596439);
                            } else {
                                var31 = new DynamicObject(var3, 4, 4 + var4, var0, var1, var2, var28.animationId * 1563734127, true, (Renderable) null);
                            }


                            var6.setBoundaryDecoration(var0, var1, var2, var17, (Renderable) var31, (Renderable) null, 256, var4, classM.DiagXScalar[var4] * var30, var30 * classM.DiagYScalar[var4], var20, var21);
                            return;
                        }

                        if (objectType == 7) {

                            if (var8 <= -1249009197) {
                                throw new IllegalStateException();
                            }

                            label827:
                            {
                                var23 = 2 + var4 & 3;
                                if (var28.animationId * 1563734127 == -1) {
                                    if (var8 <= -1249009197) {
                                        return;
                                    }

                                    if (var28.transformIds == null) {
                                        var29 = var28.e(4, var23 + 4, var16, var18, var17, var19, 518596439);
                                        break label827;
                                    }
                                }

                                var29 = new DynamicObject(var3, 4, 4 + var23, var0, var1, var2, var28.animationId * 1563734127, true, (Renderable) null);
                            }


                            var6.setBoundaryDecoration(var0, var1, var2, var17, (Renderable) var29, (Renderable) null, 256, var23, 0, 0, var20, var21);
                            return;
                        }

                        if (8 != objectType) {
                            return;
                        }

                        if (var8 <= -1249009197) {
                            throw new IllegalStateException();
                        }

                        var30 = 8;
                        var23 = var6.getBoundaryUID(var0, var1, var2);
                        if (0 != var23) {
                            var30 = PlayerConfig.getObjectDef(var23 >> 14 & 32767, 991164537).wallThickness * -1110459981 / 2;
                        }


                        Object var32;
                        label834:
                        {
                            int var26 = 2 + var4 & 3;
                            if (-1 == var28.animationId * 1563734127) {
                                if (var8 <= -1249009197) {
                                    throw new IllegalStateException();
                                }

                                if (var28.transformIds == null) {
                                    if (var8 <= -1249009197) {
                                        throw new IllegalStateException();
                                    }

                                    var31 = var28.e(4, var4 + 4, var16, var18, var17, var19, 518596439);
                                    var32 = var28.e(4, var26 + 4, var16, var18, var17, var19, 518596439);
                                    break label834;
                                }
                            }

                            var31 = new DynamicObject(var3, 4, 4 + var4, var0, var1, var2, var28.animationId * 1563734127, true, (Renderable) null);
                            var32 = new DynamicObject(var3, 4, var26 + 4, var0, var1, var2, var28.animationId * 1563734127, true, (Renderable) null);
                        }

                        //     System.out.println(var0 + "," + var1 + "," + var2 + "[" + PlayerConfig.getObjectDef(var3,0).name + "]");


                        var6.setBoundaryDecoration(var0, var1, var2, var17, (Renderable) var31, (Renderable) var32, 256, var4, classM.DiagXScalar[var4] * var30, classM.DiagYScalar[var4] * var30, var20, var21);
                        return;
                    }
                }

                // Object type 10,11
                label870:
                {
                    if (-1 == var28.animationId * 1563734127) {
                        if (var8 <= -1249009197) {
                            throw new IllegalStateException();
                        }

                        if (var28.transformIds == null) {

                            var29 = var28.e(10, var4, var16, var18, var17, var19, 518596439);

                            break label870;
                        }
                    }

                    var29 = new DynamicObject(var3, 10, var4, var0, var1, var2, var28.animationId * 1563734127, true, (Renderable) null);
                }

                if (var29 != null) {
                    if (var8 <= -1249009197) {
                        throw new IllegalStateException();
                    }

                    short var10008;
                    if (objectType == 11) {
                        if (var8 <= -1249009197) {
                            throw new IllegalStateException();
                        }

                        var10008 = 256;
                    } else {
                        var10008 = 0;
                    }

                    if (var6.k(var0, var1, var2, var17, var10, var11, (Renderable) var29, var10008, var20, var21)) {
                        if (var8 <= -1249009197) {
                            throw new IllegalStateException();
                        }

                        if (var28.fieldAl) {
                            if (var8 <= -1249009197) {
                                throw new IllegalStateException();
                            }

                            var23 = 15;
                            if (var29 instanceof Model) {
                                var23 = ((Model) var29).n() / 4;
                                if (var23 > 30) {
                                    if (var8 <= -1249009197) {
                                        throw new IllegalStateException();
                                    }

                                    var23 = 30;
                                }
                            }

                            for (var24 = 0; var24 <= var10; ++var24) {
                                if (var8 <= -1249009197) {
                                    throw new IllegalStateException();
                                }

                                for (int var25 = 0; var25 <= var11; ++var25) {
                                    if (var8 <= -1249009197) {
                                        throw new IllegalStateException();
                                    }

                                    if (var23 > classCn.fieldE[var0][var1 + var24][var2 + var25]) {
                                        if (var8 <= -1249009197) {
                                            return;
                                        }

                                        classCn.fieldE[var0][var24 + var1][var2 + var25] = (byte) var23;
                                    }
                                }
                            }
                        }
                    }
                }

                if (var28.fieldU * 2025817487 != 0) {
                    if (var8 <= -1249009197) {
                        throw new IllegalStateException();
                    }

                    if (var7 != null) {
                        var7.i(var1, var2, var10, var11, var28.fieldJ, 211809681);
                    }
                }

            }
        } catch (RuntimeException var27) {
            throw ClanMate.error(var27, "ev.e(" + ')');
        }
    }
}
