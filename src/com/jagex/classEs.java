package com.jagex;

public class classEs implements Runnable {

    public static int fieldI = 0;
    public static Object fieldB = new Object();
    public static NodeDeque fieldA = new NodeDeque();
    public static NodeDeque fieldV = new NodeDeque();

    static final void method190(int var0, int var1, int var2, int var3) {
        try {
            if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
                int var4 = Landscape.getTileHeight(var0, var1, Client.floorLevel * 87713183) - var2;
                var0 -= GraphicsStub.cameraX * 1659667383;
                var4 -= Preferences.cameraZ * 820898407;
                var1 -= classEr.cameraY * -875394883;
                int var5 = RSGraphics2D.SIN_TABLE[classAo.pitch * 362746213];
                int var6 = RSGraphics2D.COS_TABLE[classAo.pitch * 362746213];
                int var7 = RSGraphics2D.SIN_TABLE[UtilClass11.yaw * -1758149661];
                int var8 = RSGraphics2D.COS_TABLE[UtilClass11.yaw * -1758149661];
                int var9 = var0 * var8 + var1 * var7 >> 16;
                var1 = var8 * var1 - var7 * var0 >> 16;
                var0 = var9;
                var9 = var6 * var4 - var5 * var1 >> 16;
                var1 = var6 * var1 + var5 * var4 >> 16;
                if (var1 >= 50) {
                    Client.fieldGk = ((var0 << 9) / var1 + 256) * -741472749;
                    Client.fieldGj = -249630405 * ((var9 << 9) / var1 + 167);
                } else {
                    Client.fieldGk = 741472749;
                    Client.fieldGj = 249630405;
                }
                return;
            }
            Client.fieldGk = 741472749;
            Client.fieldGj = 249630405;
        } catch (RuntimeException var10) {
            throw ClanMate.error(var10, "es.ag(" + ')');
        }
    }

    @Override
    public void run() {
        try {
            try {
                while (true) {
                    NodeDeque var2 = fieldA;
                    classEv var1;
                    synchronized (fieldA) {
                        var1 = (classEv) fieldA.next();
                    }

                    Object var15;
                    if (null != var1) {
                        if (0 == var1.fieldA * 332154689) {
                            var1.fieldI.v((int) var1.key, var1.fieldV, var1.fieldV.length, -2130664004);
                            var2 = fieldA;
                            synchronized (fieldA) {
                                var1.delete();
                            }
                        } else if (var1.fieldA * 332154689 == 1) {
                            var1.fieldV = var1.fieldI.a((int) var1.key, -802746084);
                            var2 = fieldA;
                            synchronized (fieldA) {
                                fieldV.add(var1);
                            }
                        }

                        var15 = fieldB;
                        synchronized (fieldB) {
                            if (fieldI * 1123152153 <= 1) {
                                fieldI = 0;
                                fieldB.notifyAll();
                                return;
                            }

                            fieldI = 1375840280;
                        }
                    } else {
                        classCs.fancySleep(100L);
                        var15 = fieldB;
                        synchronized (fieldB) {
                            if (fieldI * 1123152153 <= 1) {
                                fieldI = 0;
                                fieldB.notifyAll();
                                return;
                            }

                            fieldI -= 2113985321;
                        }
                    }
                }
            } catch (Exception var13) {
                UtilClass5.method61((String) null, var13, -765030861);
            }
        } catch (RuntimeException var14) {
            throw ClanMate.error(var14, "es.run(" + ')');
        }
    }
}
