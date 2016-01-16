package com.jagex;

public class Message extends DualNode {

    static int fieldNh;
    static Widget fieldF;
    int fieldV;
    String fieldB;
    String fieldL;
    String fieldM;
    int fieldI;
    int fieldA = ItemPile.method343() * -783550231;


    Message(int var1, String var2, String var3, String var4) {
        this.fieldV = Client.engineCycle * 440644493;
        this.fieldI = var1 * 1006032623;
        this.fieldB = var2;
        this.fieldL = var3;
        this.fieldM = var4;
    }

    static void method382(int var0) {
        try {
            UtilClass40.messageContainerMap.clear();
            UtilClass40.fieldV.i();
            UtilClass40.fieldI.clear();
            UtilClass40.fieldB = 0;
        } catch (RuntimeException var1) {
            throw ClanMate.error(var1, "av.w(" + ')');
        }
    }

    public static Widget getWidget(int parentUID, int childIndex, byte var2) {
        try {
            Widget var3 = Widget.lookup(parentUID);
            if (childIndex == -1) {
                if (var2 <= -1) {
                    throw new IllegalStateException();
                } else {
                    return var3;
                }
            } else {
                if (var3 != null) {
                    if (var2 <= -1) {
                        throw new IllegalStateException();
                    }

                    if (null != var3.children) {
                        if (childIndex < var3.children.length) {
                            return var3.children[childIndex];
                        }

                        if (var2 <= -1) {
                            throw new IllegalStateException();
                        }
                    }
                }

                return null;
            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "av.i(" + ')');
        }
    }

    static void method384(int var0, short var1) {
        try {
            label38:
            {
                if (var0 == -1) {
                    if (var1 <= 8192) {
                        throw new IllegalStateException();
                    }

                    if (!Client.fieldMv) {
                        ScriptEvent.method109(1698296025);
                        break label38;
                    }
                }

                if (var0 != -1 && var0 != Client.fieldMx * -1477729045) {
                    if (var1 <= 8192) {
                        throw new IllegalStateException();
                    }

                    if (Client.fieldMh * 895565207 != 0) {
                        if (var1 <= 8192) {
                            throw new IllegalStateException();
                        }

                        if (!Client.fieldMv) {
                            classCn.method329(2, classT.fieldBs, var0, 0, Client.fieldMh * 895565207, false, (byte) 59);
                        }
                    }
                }
            }

            Client.fieldMx = -812653629 * var0;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "av.z(" + ')');
        }
    }

    static UnknownEnum3[] getEnum3Values(byte var0) {
        try {
            return new UnknownEnum3[]{UnknownEnum3.UNKNOWN2, UnknownEnum3.UNKNOWN0, UnknownEnum3.UNKNOWN1};
        } catch (RuntimeException var1) {
            throw ClanMate.error(var1, "av.a(" + ')');
        }
    }

    void a(int var1, String var2, String var3, String var4, int var5) {
        try {
            this.fieldA = ItemPile.method343() * -783550231;
            this.fieldV = Client.engineCycle * 440644493;
            this.fieldI = var1 * 1006032623;
            this.fieldB = var2;
            this.fieldL = var3;
            this.fieldM = var4;
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "av.a(" + ')');
        }
    }
}
