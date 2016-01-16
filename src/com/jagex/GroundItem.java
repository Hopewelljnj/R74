package com.jagex;

import java.io.*;

public final class GroundItem extends Renderable {

    public static int fieldCh;
    static int fieldNr;
    static int fieldPr;
    int quantity;
    int itemId;

    public static void method98(String var0, String var1, int var2, int var3, byte var4) throws IOException {
        try {
            UtilClass19.fieldM = var3 * 892024459;
            UtilClass19.fieldO = var2 * 1711915021;

            try {
                GraphicsStub.fieldG = System.getProperty("os.name");
            } catch (Exception var21) {
                GraphicsStub.fieldG = "Unknown";
            }

            UtilClass39.fieldJ = GraphicsStub.fieldG.toLowerCase();

            try {
                JagSocket.fieldY = System.getProperty("user.home");
                if (null != JagSocket.fieldY) {
                    if (var4 >= 1) {
                        return;
                    }

                    JagSocket.fieldY = JagSocket.fieldY + "/";
                }
            } catch (Exception var20) {
                ;
            }

            try {
                if (UtilClass39.fieldJ.startsWith("win")) {
                    if (var4 >= 1) {
                        throw new IllegalStateException();
                    }

                    if (null == JagSocket.fieldY) {
                        if (var4 >= 1) {
                            throw new IllegalStateException();
                        }

                        JagSocket.fieldY = System.getenv("USERPROFILE");
                    }
                } else if (JagSocket.fieldY == null) {
                    if (var4 >= 1) {
                        return;
                    }

                    JagSocket.fieldY = System.getenv("HOME");
                }

                if (null != JagSocket.fieldY) {
                    if (var4 >= 1) {
                        throw new IllegalStateException();
                    }

                    JagSocket.fieldY = JagSocket.fieldY + "/";
                }
            } catch (Exception var19) {
                ;
            }

            if (null == JagSocket.fieldY) {
                JagSocket.fieldY = "~/";
            }

            classBq.fieldQ = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", JagSocket.fieldY, "/tmp/", ""};
            UtilClass2.fieldT = new String[]{".jagex_cache_" + UtilClass19.fieldO * 1675136709, ".file_store_" + UtilClass19.fieldO * 1675136709};
            int var5 = 0;

            label357:
            while (true) {
                if (var5 < 4) {
                    if (var4 >= 1) {
                        throw new IllegalStateException();
                    }

                    String var7 = 0 == var5 ? "" : "" + var5;
                    UtilClass19.fieldB = new File(JagSocket.fieldY, "jagex_cl_" + var0 + "_" + var1 + var7 + ".dat");
                    String var8 = null;
                    String var9 = null;
                    boolean var10 = false;
                    File var35;
                    if (UtilClass19.fieldB.exists()) {
                        if (var4 >= 1) {
                            return;
                        }

                        try {
                            label364:
                            {
                                JagexAccessFile var11 = new JagexAccessFile(UtilClass19.fieldB, "rw", 10000L);

                                Buffer var12;
                                int var13;
                                for (var12 = new Buffer((int) var11.b(-2005635316)); var12.caret * 651432265 < var12.payload.length; var12.caret += var13 * -99503879) {
                                    var13 = var11.l(var12.payload, var12.caret * 651432265, var12.payload.length - var12.caret * 651432265, (byte) 48);
                                    if (var13 == -1) {
                                        throw new IOException();
                                    }
                                }

                                var12.caret = 0;
                                var13 = var12.readUByte();
                                if (var13 >= 1) {
                                    if (var13 <= 3) {
                                        int var14 = 0;
                                        if (var13 > 1) {
                                            var14 = var12.readUByte();
                                        }

                                        if (var13 <= 2) {
                                            var8 = var12.c(1400990560);
                                            if (var14 == 1) {
                                                if (var4 >= 1) {
                                                    throw new IllegalStateException();
                                                }

                                                var9 = var12.c(1400990560);
                                            }
                                        } else {
                                            var8 = var12.an(-399707440);
                                            if (1 == var14) {
                                                if (var4 >= 1) {
                                                    throw new IllegalStateException();
                                                }

                                                var9 = var12.an(915732053);
                                            }
                                        }

                                        var11.i((byte) -105);
                                        break label364;
                                    }

                                    if (var4 >= 1) {
                                        throw new IllegalStateException();
                                    }
                                }

                                throw new IOException("" + var13);
                            }
                        } catch (IOException var24) {
                            var24.printStackTrace();
                        }

                        if (null != var8) {
                            if (var4 >= 1) {
                                throw new IllegalStateException();
                            }

                            var35 = new File(var8);
                            if (!var35.exists()) {
                                if (var4 >= 1) {
                                    throw new IllegalStateException();
                                }

                                var8 = null;
                            }
                        }

                        if (var8 != null) {
                            if (var4 >= 1) {
                                throw new IllegalStateException();
                            }

                            var35 = new File(var8, "test.dat");
                            if (!CalendarUtil.method296(var35, true, -1955711820)) {
                                if (var4 >= 1) {
                                    throw new IllegalStateException();
                                }

                                var8 = null;
                            }
                        }
                    }

                    if (var8 == null) {
                        if (var4 >= 1) {
                            throw new IllegalStateException();
                        }

                        if (0 == var5) {
                            if (var4 >= 1) {
                                throw new IllegalStateException();
                            }

                            label329:
                            for (int var32 = 0; var32 < UtilClass2.fieldT.length; ++var32) {
                                if (var4 >= 1) {
                                    throw new IllegalStateException();
                                }

                                for (int var38 = 0; var38 < classBq.fieldQ.length; ++var38) {
                                    if (var4 >= 1) {
                                        throw new IllegalStateException();
                                    }

                                    File var39 = new File(classBq.fieldQ[var38] + UtilClass2.fieldT[var32] + File.separatorChar + var0 + File.separatorChar);
                                    if (var39.exists()) {
                                        if (var4 >= 1) {
                                            throw new IllegalStateException();
                                        }

                                        if (CalendarUtil.method296(new File(var39, "test.dat"), true, -2108309263)) {
                                            if (var4 >= 1) {
                                                throw new IllegalStateException();
                                            }

                                            var8 = var39.toString();
                                            var10 = true;
                                            break label329;
                                        }
                                    }
                                }
                            }
                        }
                    }

                    if (var8 == null) {
                        if (var4 >= 1) {
                            return;
                        }

                        var8 = JagSocket.fieldY + File.separatorChar + "jagexcache" + var7 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
                        var10 = true;
                    }

                    if (var9 != null) {
                        File var34 = new File(var9);
                        var35 = new File(var8);

                        try {
                            File[] var40 = var34.listFiles();
                            File[] var41 = var40;

                            for (int var15 = 0; var15 < var41.length; ++var15) {
                                File var16 = var41[var15];
                                File var17 = new File(var35, var16.getName());
                                boolean var18 = var16.renameTo(var17);
                                if (!var18) {
                                    if (var4 >= 1) {
                                        throw new IllegalStateException();
                                    }

                                    throw new IOException();
                                }
                            }
                        } catch (Exception var23) {
                            var23.printStackTrace();
                        }

                        var10 = true;
                    }

                    if (var10) {
                        if (var4 >= 1) {
                            return;
                        }

                        UtilClass3.method62(new File(var8), (File) null, 1617132694);
                    }

                    File var6 = new File(var8);
                    UtilClass19.dir = var6;
                    if (!UtilClass19.dir.exists()) {
                        if (var4 >= 1) {
                            throw new IllegalStateException();
                        }

                        UtilClass19.dir.mkdirs();
                    }

                    File[] var29 = UtilClass19.dir.listFiles();
                    if (null != var29) {
                        if (var4 >= 1) {
                            throw new IllegalStateException();
                        }

                        File[] var36 = var29;

                        for (int var31 = 0; var31 < var36.length; ++var31) {
                            if (var4 >= 1) {
                                return;
                            }

                            File var33 = var36[var31];
                            if (!CalendarUtil.method296(var33, false, -1919627631)) {
                                if (var4 >= 1) {
                                    throw new IllegalStateException();
                                }

                                ++var5;
                                continue label357;
                            }
                        }
                    }
                }

                UtilClass2.method283(UtilClass19.dir, (short) -29618);

                try {
                    File var26 = new File(JagSocket.fieldY, "random.dat");
                    int var30;
                    if (var26.exists()) {
                        if (var4 >= 1) {
                            throw new IllegalStateException();
                        }

                        UtilClass19.fieldK = new classHf(new JagexAccessFile(var26, "rw", 25L), 24, 0);
                    } else {
                        label284:
                        for (int var27 = 0; var27 < UtilClass2.fieldT.length; ++var27) {
                            if (var4 >= 1) {
                                throw new IllegalStateException();
                            }

                            for (var30 = 0; var30 < classBq.fieldQ.length; ++var30) {
                                if (var4 >= 1) {
                                    throw new IllegalStateException();
                                }

                                File var37 = new File(classBq.fieldQ[var30] + UtilClass2.fieldT[var27] + File.separatorChar + "random.dat");
                                if (var37.exists()) {
                                    if (var4 >= 1) {
                                        return;
                                    }

                                    UtilClass19.fieldK = new classHf(new JagexAccessFile(var37, "rw", 25L), 24, 0);
                                    break label284;
                                }
                            }
                        }
                    }

                    if (UtilClass19.fieldK == null) {
                        RandomAccessFile var28 = new RandomAccessFile(var26, "rw");
                        var30 = var28.read();
                        var28.seek(0L);
                        var28.write(var30);
                        var28.seek(0L);
                        var28.close();
                        UtilClass19.fieldK = new classHf(new JagexAccessFile(var26, "rw", 25L), 24, 0);
                    }
                } catch (IOException var22) {
                    ;
                }

                UtilClass19.fieldF = new classHf(new JagexAccessFile(classAw.method381("main_file_cache.dat2", -1860421458), "rw", 1048576000L), 5200, 0);
                UtilClass19.fieldD = new classHf(new JagexAccessFile(classAw.method381("main_file_cache.idx255", -1860421458), "rw", 1048576L), 6000, 0);
                UtilClass11.fieldX = new classHf[UtilClass19.fieldM * -1933377245];

                for (var5 = 0; var5 < UtilClass19.fieldM * -1933377245; ++var5) {
                    UtilClass11.fieldX[var5] = new classHf(new JagexAccessFile(classAw.method381("main_file_cache.idx" + var5, -1860421458), "rw", 1048576L), 6000, 0);
                }

                return;
            }
        } catch (RuntimeException var25) {
            throw ClanMate.error(var25, "c.a(" + ')');
        }
    }

    public static Varpbit method99(int var0, int var1) {
        try {
            Varpbit var2 = (Varpbit) Varpbit.cache.get((long) var0);
            if (var2 != null) {
                if (var1 != -731628329) {
                    throw new IllegalStateException();
                } else {
                    return var2;
                }
            } else {
                byte[] var3 = Varpbit.fieldA.getFile(14, var0, (short) 26735);
                var2 = new Varpbit();
                if (null != var3) {
                    var2.i(new Buffer(var3), (byte) -60);
                }

                Varpbit.cache.put(var2, (long) var0);
                return var2;
            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "c.v(" + ')');
        }
    }

    static final void method100(int var0) {
        try {
            for (LandscapeMod var1 = (LandscapeMod) Client.landscapeModDeque.next(); null != var1; var1 = (LandscapeMod) Client.landscapeModDeque.tail()) {

                if (-1 == var1.spawnLife * 27100243) {
                    var1.spawnDelay = 0;
                    LandscapeTile.updateStubMod(var1, (byte) 45);
                } else {
                    var1.delete();
                }

            }

        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "c.ay(" + ')');
        }
    }

    static final void drawObjectsMM(int floor, int regionX, int regionY, int wallColor, int doorColor, int DUMMY) {

        try {

            int boundaryUID = Client.landscape.getBoundaryUID(floor, regionX, regionY);
            int cfg;
            int rotation;
            int object_type;
            int var10;
            int var12;
            int var13;
            if (boundaryUID != 0) {

                var10 = wallColor;

                if (boundaryUID > 0) { //Marks it as intractable
                    var10 = doorColor;
                }

                cfg = Client.landscape.configForUid(floor, regionX, regionY, boundaryUID);
                rotation = cfg >> 6 & 3;
                object_type = cfg & 31;

                int[] buffer = UtilClass2.minimapStaticImg.pixels;

                var12 = 24624 + regionX * 4 + 2048 * (103 - regionY);
                var13 = boundaryUID >> 14 & 32767;
                ObjectDefinition var14 = PlayerConfig.getObjectDef(var13, -243483937);
                if (var14.objectIcon * 2005838039 != -1) {
                    if (DUMMY >= -1975556921) {
                        throw new IllegalStateException();
                    }

                    CompressedImage var15 = UtilClass10.MMObjectIcons[var14.objectIcon * 2005838039];
                    if (var15 != null) {
                        if (DUMMY >= -1975556921) {
                            throw new IllegalStateException();
                        }

                        int var16 = (var14.sizeX * -310155740 - var15.fieldI) / 2;
                        int var17 = (var14.sizeY * -728795676 - var15.fieldB) / 2;
                        var15.i(var16 + 48 + regionX * 4, (104 - regionY - var14.sizeY * -1255940743) * 4 + 48 + var17);
                    }
                } else {
                    label225: {
                        if (0 != object_type) {
                            if (object_type != 2) {
                                break label225;
                            }
                        }

                        if (0 == rotation) {
                            if (DUMMY >= -1975556921) {
                                throw new IllegalStateException();
                            }

                            buffer[var12] = var10;
                            buffer[512 + var12] = var10;
                            buffer[var12 + 1024] = var10;
                            buffer[var12 + 1536] = var10;
                        } else if (rotation == 1) {
                            if (DUMMY >= -1975556921) {
                                throw new IllegalStateException();
                            }

                            buffer[var12] = var10;
                            buffer[var12 + 1] = var10;
                            buffer[var12 + 2] = var10;
                            buffer[3 + var12] = var10;
                        } else if (rotation == 2) {
                            if (DUMMY >= -1975556921) {
                                throw new IllegalStateException();
                            }

                            buffer[3 + var12] = var10;
                            buffer[3 + var12 + 512] = var10;
                            buffer[var12 + 3 + 1024] = var10;
                            buffer[1536 + var12 + 3] = var10;
                        } else if (rotation == 3) {
                            if (DUMMY >= -1975556921) {
                                throw new IllegalStateException();
                            }

                            buffer[1536 + var12] = var10;
                            buffer[1536 + var12 + 1] = var10;
                            buffer[var12 + 1536 + 2] = var10;
                            buffer[3 + var12 + 1536] = var10;
                        }
                    }

                    if (3 == object_type) {
                        if (DUMMY >= -1975556921) {
                            throw new IllegalStateException();
                        }

                        if (rotation == 0) {
                            buffer[var12] = var10;
                        } else if (rotation == 1) {
                            if (DUMMY >= -1975556921) {
                                return;
                            }

                            buffer[3 + var12] = var10;
                        } else if (rotation == 2) {
                            if (DUMMY >= -1975556921) {
                                throw new IllegalStateException();
                            }

                            buffer[var12 + 3 + 1536] = var10;
                        } else if (rotation == 3) {
                            if (DUMMY >= -1975556921) {
                                return;
                            }

                            buffer[var12 + 1536] = var10;
                        }
                    }

                    if (object_type == 2) {
                        if (rotation == 3) {
                            if (DUMMY >= -1975556921) {
                                throw new IllegalStateException();
                            }

                            buffer[var12] = var10;
                            buffer[var12 + 512] = var10;
                            buffer[1024 + var12] = var10;
                            buffer[1536 + var12] = var10;
                        } else if (0 == rotation) {
                            buffer[var12] = var10;
                            buffer[var12 + 1] = var10;
                            buffer[var12 + 2] = var10;
                            buffer[var12 + 3] = var10;
                        } else if (1 == rotation) {
                            buffer[var12 + 3] = var10;
                            buffer[512 + 3 + var12] = var10;
                            buffer[var12 + 3 + 1024] = var10;
                            buffer[var12 + 3 + 1536] = var10;
                        } else if (rotation == 2) {
                            if (DUMMY >= -1975556921) {
                                throw new IllegalStateException();
                            }

                            buffer[var12 + 1536] = var10;
                            buffer[1536 + var12 + 1] = var10;
                            buffer[2 + var12 + 1536] = var10;
                            buffer[var12 + 1536 + 3] = var10;
                        }
                    }
                }
            }


            boundaryUID = Client.landscape.getObjectUID(floor, regionX, regionY);
            if (0 != boundaryUID) {
                if (DUMMY >= -1975556921) {
                    return;
                }

                cfg = Client.landscape.configForUid(floor, regionX, regionY, boundaryUID);
                rotation = cfg >> 6 & 3;
                object_type = cfg & 31;
                var10 = boundaryUID >> 14 & 32767;
                ObjectDefinition var21 = PlayerConfig.getObjectDef(var10, 1285340233);
                int var25;
                if (-1 != var21.objectIcon * 2005838039) {
                    CompressedImage var23 = UtilClass10.MMObjectIcons[var21.objectIcon * 2005838039];
                    if (null != var23) {
                        if (DUMMY >= -1975556921) {
                            throw new IllegalStateException();
                        }

                        var13 = (var21.sizeX * -310155740 - var23.fieldI) / 2;
                        var25 = (var21.sizeY * -728795676 - var23.fieldB) / 2;
                        var23.i(var13 + 48 + 4 * regionX, var25 + 48 + (104 - regionY - var21.sizeY * -1255940743) * 4);
                    }
                } else if (object_type == 9) {
                    label238:
                    {
                        var12 = 15658734;
                        if (boundaryUID > 0) {
                            if (DUMMY >= -1975556921) {
                                throw new IllegalStateException();
                            }

                            var12 = 15597568;
                        }

                        int[] var24 = UtilClass2.minimapStaticImg.pixels;
                        var25 = regionX * 4 + 24624 + 512 * 4 * (103 - regionY);
                        if (0 != rotation) {

                            if (2 != rotation) {
                                var24[var25] = var12;
                                var24[1 + var25 + 512] = var12;
                                var24[var25 + 1024 + 2] = var12;
                                var24[3 + 1536 + var25] = var12;
                                break label238;
                            }

                        }

                        var24[var25 + 1536] = var12;
                        var24[1024 + var25 + 1] = var12;
                        var24[2 + 512 + var25] = var12;
                        var24[3 + var25] = var12;
                    }
                }
            }

            boundaryUID = Client.landscape.getTileDecoUID(floor, regionX, regionY);
            if (0 != boundaryUID) {
                if (DUMMY >= -1975556921) {
                    throw new IllegalStateException();
                }

                cfg = boundaryUID >> 14 & 32767;
                ObjectDefinition var19 = PlayerConfig.getObjectDef(cfg, 413044145);
                if (var19.objectIcon * 2005838039 != -1) {
                    if (DUMMY >= -1975556921) {
                        return;
                    }

                    CompressedImage var20 = UtilClass10.MMObjectIcons[var19.objectIcon * 2005838039];
                    if (var20 != null) {
                        var10 = (var19.sizeX * -310155740 - var20.fieldI) / 2;
                        int var22 = (var19.sizeY * -728795676 - var20.fieldB) / 2;
                        var20.i(48 + regionX * 4 + var10, var22 + (104 - regionY - var19.sizeY * -1255940743) * 4 + 48);
                    }
                }
            }

        } catch (RuntimeException var18) {
            throw ClanMate.error(var18, "c.af(" + ')');
        }
    }

    @Override
    protected final Model getModel(int var1) {
        try {
            return Client.getItemDefinition(this.itemId * 2057899465, -132163127).e(this.quantity * 1902127977, 2037340464);
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "c.v(" + ')');
        }
    }

}
