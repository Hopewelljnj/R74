package com.jagex;

public final class EntityMarker {

    static Sprite[] hintIcons;
    static short[] fieldOj;

    public Renderable entity;

    public int uid = 0;
    int cfg = 0;

    int orientation;
    int strictX;
    int strictY;
    int maxX;
    int maxY;
    int fieldK;
    int fieldF;
    int height;

    int rootRegionX;
    int rootRegionY;
    int floor;

    static void method330(int var0) {
        try {
            for (WidgetNode var1 = (WidgetNode) Client.widgetNodes.first(); null != var1; var1 = (WidgetNode) Client.widgetNodes.next()) {
                int var2 = var1.owner * -1220935357;
                if (Widget.loadWidget(var2, 477596194)) {
                    if (var0 != 1803308586) {
                        return;
                    }

                    boolean var3 = true;
                    Widget[] var4 = Widget.widgets[var2];

                    int var5;
                    for (var5 = 0; var5 < var4.length; ++var5) {
                        if (var0 != 1803308586) {
                            throw new IllegalStateException();
                        }

                        if (var4[var5] != null) {
                            if (var0 != 1803308586) {
                                return;
                            }

                            var3 = var4[var5].fieldK;
                            break;
                        }
                    }

                    if (!var3) {
                        if (var0 != 1803308586) {
                            throw new IllegalStateException();
                        }

                        var5 = (int) var1.key;
                        Widget var6 = Widget.lookup(var5);
                        if (null != var6) {
                            if (var0 != 1803308586) {
                                throw new IllegalStateException();
                            }

                            classBx.method250(var6, 57574739);
                        }
                    }
                }
            }

        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "ck.cl(" + ')');
        }
    }

    static final void method331(int var0, int var1, int var2, int var3, Sprite var4, int var5) {
        try {
            if (var4 != null) {
                int var6 = Client.minimapRotation * -422086387 + Client.minimapScale * -148158859 & 2047;
                int var7 = var2 * var2 + var3 * var3;
                if (var7 <= 6400) {
                    int var8 = RSGraphics2D.SIN_TABLE[var6];
                    int var9 = RSGraphics2D.COS_TABLE[var6];
                    var8 = 256 * var8 / (256 + Client.minimapOffset * -695888753);
                    var9 = var9 * 256 / (256 + Client.minimapOffset * -695888753);
                    int var10 = var9 * var2 + var3 * var8 >> 16;
                    int var11 = var9 * var3 - var8 * var2 >> 16;
                    if (var7 > 2500) {
                        var4.c(ClanMate.mapback, 4 + (var10 + 94 + var0 - var4.fieldM / 2), 83 + var1 - var11 - var4.fieldW / 2 - 4);
                    } else {
                        var4.f(4 + (var10 + 94 + var0 - var4.fieldM / 2), 83 + var1 - var11 - var4.fieldW / 2 - 4);
                    }
                }
            }
        } catch (RuntimeException var12) {
            throw ClanMate.error(var12, "ck.di(" + ')');
        }
    }

    public static classAw method332(int var0, byte var1) {
        try {
            classAw var2 = (classAw) classAw.fieldB.get((long) var0);
            if (null != var2) {
                if (var1 != 0) {
                    throw new IllegalStateException();
                } else {
                    return var2;
                }
            } else {
                byte[] var3 = classAw.fieldA.getFile(3, var0, (short) 27684);
                var2 = new classAw();
                if (var3 != null) {
                    if (var1 != 0) {
                        throw new IllegalStateException();
                    }

                    var2.i(new Buffer(var3), (byte) -29);
                }

                classAw.fieldB.put(var2, (long) var0);
                return var2;
            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "ck.v(" + ')');
        }
    }
}
