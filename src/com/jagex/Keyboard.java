package com.jagex;

import java.awt.event.*;

public final class Keyboard implements KeyListener, FocusListener {

    public static int[] fieldCv = new int[128];
    public static boolean[] someWeirdSettings = new boolean[112];
    public static int fieldCc = 0;
    public static int[] fieldCm = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    static volatile int keyboardIdleTime = 0;
    static Keyboard instance = new Keyboard();
    static int fieldCk = 0;
    static char[] fieldCg = new char[128];
    static int[] fieldCy = new int[128];
    static int fieldCp = 0;
    static int fieldCl = 0;
    static int fieldCx = 0;
    static int[] fieldCn = new int[128];
    static int fieldCe = 0;
    static int fieldNb;

    static void clearItemTable(int tableKey, int var1) {
        try {
            ItemTable var2 = (ItemTable) ItemTable.cache.get((long) tableKey);
            if (null != var2) {
                for (int var3 = 0; var3 < var2.ids.length; ++var3) {
                    var2.ids[var3] = -1;
                    var2.quantities[var3] = 0;
                }
            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "dx.b(" + ')');
        }
    }

    public static int getVarpbitValue(int varpbitId, int var1) {
        try {
            Varpbit var2 = GroundItem.method99(varpbitId, -731628329);
            int var3 = var2.varp * -602880833;
            int var4 = var2.low * 1735474941;
            int var5 = var2.high * -1456563197;
            int var6 = UtilClass27.masks[var5 - var4];
            return UtilClass27.vars[var3] >> var4 & var6;
        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "dx.a(" + ')');
        }
    }

    @Override
    public final synchronized void keyReleased(KeyEvent var1) {
        try {
            if (null != instance) {
                keyboardIdleTime = 0;
                int var2 = var1.getKeyCode();
                if (var2 >= 0 && var2 < fieldCm.length) {
                    var2 = fieldCm[var2] & -129;
                } else {
                    var2 = -1;
                }

                if (fieldCk * 274440079 >= 0 && var2 >= 0) {
                    fieldCn[fieldCk * 274440079] = ~var2;
                    fieldCk = (fieldCk * 274440079 + 1 & 127) * 1729404783;
                    if (fieldCk * 274440079 == fieldCp * -246102743) {
                        fieldCk = -1729404783;
                    }
                }
            }

            var1.consume();
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "dx.keyReleased(" + ')');
        }
    }

    @Override
    public final void focusGained(FocusEvent var1) {
        try {
            ;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "dx.focusGained(" + ')');
        }
    }

    @Override
    public final synchronized void focusLost(FocusEvent var1) {
        try {
            if (null != instance) {
                fieldCk = -1729404783;
            }

        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "dx.focusLost(" + ')');
        }
    }


    void hack() {

        int objectId = 23055; //Client.packet.ap(-1797152954);
        int spawnDelay = 0; //Client.packet.ab(2124647261);
        int playerId = Client.playerServerIndex * -1508358289; //Client.packet.ab(868165550);
       // int objCfg = Client.packet.ao((byte) 47);
        int objectType = 10; //hash >> 2;
        int rotation = 0;// hash & 3;
        int stubType = Client.objectType2StubType[objectType];
        byte playerSizeY = 4;// Client.packet.readByte(250344736);
        byte rootY = 2; //Client.packet.readByte(250344736);
     //   int locHash = Client.packet.ag((byte) 0);
        int regionX = /*(locHash >> 4 & 7) +*/ 2 + classJ.fieldDc * 968617591;
        int regionY = UtilClass14.fieldDn * 1626548707 + 2 /*(locHash & 7)*/;
        byte playerSizeX = 4; //Client.packet.ad(209080471);
        byte rootX = 2; //Client.packet.au((byte) 58);
        int spawnLife = 100; //Client.packet.ac((byte) 74);
        Player var16;
        if (Client.playerServerIndex * -1508358289 == playerId) {
            var16 = Client.myPlayer;
        } else {
            var16 = Client.players[playerId];
        }

        if (var16 != null) {
            ObjectDefinition var17;
            int sizeX;
            int sizeY;
            label644:
            {
                var17 = PlayerConfig.getObjectDef(objectId, 885530217);
                if (rotation != 1) {


                    if (rotation != 3) {
                        sizeX = var17.sizeX * -1151280759;
                        sizeY = var17.sizeY * -1255940743;
                        break label644;
                    }


                }

                sizeX = var17.sizeY * -1255940743;
                sizeY = var17.sizeX * -1151280759;
            }

            int var20 = regionX + (sizeX / 2);
            int var21 = regionX + ((1 + sizeX) / 2);
            int var22 = regionY + (sizeY / 2);
            int var23 = regionY + ((1 + sizeY) / 2);

            int[][] var24 = classM.tileHeights[Client.floorLevel * 87713183];
            int height = (var24[var21][var23]
                      + var24[var20][var22]
                      + var24[var21][var22]
                      + var24[var20][var23]) >> 2;
            int var26 = (sizeX << 6) + (regionX << 7);
            int var27 = (sizeY << 6) + (regionY << 7);
            Model objModel = var17.n(objectType, rotation, var24, var26, height, var27, (byte) 16);

            if (null != objModel) {


                Projectile.spawnObjectLater(Client.floorLevel * 87713183, regionX, regionY, stubType, -1, 0, 0, spawnDelay + 1, spawnLife + 1, (byte) 87);
                var16.objTransformStartCycle = (spawnDelay + Client.engineCycle * -1223223371) * -136876771;
                var16.objTransformEndCycle = (spawnLife + Client.engineCycle * -1223223371) * 1691781299;
                var16.transformObjModel = objModel;
                var16.objectLocX = 461127616 * sizeX + regionX * 922255232;
                var16.objectLocY = sizeY * 252354240 + regionY * 504708480;
                var16.objectLocZ = -1823363617 * height;
                byte var29;

                if (rootX > playerSizeX) {
                    var29 = rootX;
                    rootX = playerSizeX;
                    playerSizeX = var29;
                }

                if (rootY > playerSizeY) {
                    var29 = rootY;
                    rootY = playerSizeY;
                    playerSizeY = var29;
                }

                var16.objRegionX = (regionX + rootX) * -1626034921;
                var16.objMaxRegionX = -1205480525 * (regionX + playerSizeX);
                var16.objRegionY = (rootY + regionY) * -303997603;
                var16.objMaxRegionY = 394406681 * (regionY + playerSizeY);
            }
        }

    }

    static void hack2() {
        Player var1 = Client.myPlayer;
        var1.fieldBp = 23; //Client.packet.ab(1437321420) * 1712363827;
  //      int var4 = Client.packet.bl(-1370254784);
        var1.fieldBr = 100; //-1148182407 * (var4 >> 16);
        var1.fieldBz = 100 + Client.engineCycle;// 794364867 * ((var4 & '\uffff') + Client.viewportCycle * -1223223371);
        var1.fieldBw = 0;
        var1.fieldBm = 0;
        if (var1.fieldBz * 1643494635 > Client.engineCycle * -1223223371) {
            var1.fieldBw = -966935865;
        }

        if ('\uffff' == var1.fieldBp * -1404237317) {
            var1.fieldBp = -1712363827;
        }
    }

    static void hack1() {


        Projectile.spawnObjectLater(Client.floorLevel * 87713183,
                (Client.myPlayer.strictX * 404428603) / 128 + 1,
                (Client.myPlayer.strictY * -1490664571) / 128 + 1,
                0, 25368, 10, 2, 50,100, (byte) 87);


/*
        Projectile.spawnObjectLater(ClanMate.floorLevel * 87713183,
                81,
                70,
                0, 1319, 10, 2, 0,50, (byte) 87);*/
    }

    @Override
    public final synchronized void keyPressed(KeyEvent var1) {
        if(Client.myPlayer != null && (var1.getKeyChar() == 'H' || var1.getKeyChar() == 'h')) {
            System.out.println("Hack");


            for(int i = 0; i < 30000;i++) {
                ObjectDefinition def = PlayerConfig.getObjectDef(i,0);
                if(def == null) continue;
                int id = def.objectIcon * 2005838039;
                if(id != -1) {
                    System.out.println(def.name + "(" + i + ")==" + id);
                }
             //   if(def != null && def.objectIcon * )
            }

        //    var14.objectIcon * 2005838039

           hack1();
        }
        try {
            if (instance != null) {
                keyboardIdleTime = 0;
                int var2 = var1.getKeyCode();
                if (var2 >= 0 && var2 < fieldCm.length) {
                    var2 = fieldCm[var2];
                    if (0 != (var2 & 128)) {
                        var2 = -1;
                    }
                } else {
                    var2 = -1;
                }

                if (fieldCk * 274440079 >= 0 && var2 >= 0) {
                    fieldCn[fieldCk * 274440079] = var2;
                    fieldCk = 1729404783 * (1 + fieldCk * 274440079 & 127);
                    if (fieldCk * 274440079 == fieldCp * -246102743) {
                        fieldCk = -1729404783;
                    }
                }

                int var3;
                if (var2 >= 0) {
                    var3 = fieldCe * 1747692617 + 1 & 127;
                    if (var3 != fieldCx * -756998689) {
                        fieldCy[fieldCe * 1747692617] = var2;
                        fieldCg[fieldCe * 1747692617] = 0;
                        fieldCe = var3 * 703071737;
                    }
                }

                var3 = var1.getModifiers();
                if ((var3 & 10) != 0 || 85 == var2 || 10 == var2) {
                    var1.consume();
                }
            }

        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "dx.keyPressed(" + ')');
        }
    }

    @Override
    public final void keyTyped(KeyEvent var1) {
        try {
            if (null != instance) {
                char var2 = var1.getKeyChar();
                if (0 != var2 && '\uffff' != var2 && TaskHandler.method279(var2, (byte) 116)) {
                    int var3 = fieldCe * 1747692617 + 1 & 127;
                    if (var3 != fieldCx * -756998689) {
                        fieldCy[fieldCe * 1747692617] = -1;
                        fieldCg[fieldCe * 1747692617] = var2;
                        fieldCe = var3 * 703071737;
                    }
                }
            }

            var1.consume();
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "dx.keyTyped(" + ')');
        }
    }
}
