package com.jagex;

public class ClanMate extends Node {

    public static char fieldCb;
    static CompressedImage mapback;
    static int[] fieldEz;
    static Widget fieldGn;
    String uniDisplayName; //underscore THIS IS A NAME  -> this_is_a_name
    int world;
    String displayName;
    byte rank;

    static final void method193(MenuItem var0, int var1, int var2, int var3) {
        try {
            WidgetNode.processAction( var0.arg1 * 1726219831,
                                      var0.arg2 * -1774709117,
                                      var0.opcode * 145800255,
                                      var0.arg0 * -848112923,
                                      var0.option,
                                      var0.option,
                                      var1,
                                      var2
            );
        } catch (RuntimeException var4) {
            throw error(var4, "y.bn(" + ')');
        }
    }

    public static RSException error(Throwable var0, String var1) {
        try {
            RSException var2;
            if (var0 instanceof RSException) {
                var2 = (RSException) var0;
                var2.fieldB = var2.fieldB + ' ' + var1;
            } else {
                var2 = new RSException(var0, var1);
            }
            return var2;
        } catch (RuntimeException var3) {
            throw error(var3, "y.v(" + ')');
        }
    }

    public static boolean method195(CharSequence var0, int var1) {
        try {
            boolean var3 = false;
            boolean var4 = false;
            int var5 = 0;
            int var6 = var0.length();
            int var7 = 0;

            boolean var2;
            while (true) {
                if (var7 >= var6) {
                    var2 = var4;
                    break;
                }

                label115:
                {
                    char var8 = var0.charAt(var7);
                    if (var7 == 0) {
                        if (45 == var8) {
                            var3 = true;
                            break label115;
                        }

                        if (var8 == 43) {
                            break label115;
                        }
                    }

                    int var11;
                    label117:
                    {
                        if (var8 >= 48) {
                            if (var1 >= 1608526838) {
                                throw new IllegalStateException();
                            }

                            if (var8 <= 57) {
                                var11 = var8 - 48;
                                break label117;
                            }
                        }

                        if (var8 >= 65) {
                            if (var1 >= 1608526838) {
                                throw new IllegalStateException();
                            }

                            if (var8 <= 90) {
                                var11 = var8 - 55;
                                break label117;
                            }
                        }

                        if (var8 >= 97) {
                            if (var1 >= 1608526838) {
                                throw new IllegalStateException();
                            }

                            if (var8 <= 122) {
                                var11 = var8 - 87;
                                break label117;
                            }
                        }

                        var2 = false;
                        break;
                    }

                    if (var11 >= 10) {
                        if (var1 >= 1608526838) {
                            throw new IllegalStateException();
                        }

                        var2 = false;
                        break;
                    }

                    if (var3) {
                        if (var1 >= 1608526838) {
                            throw new IllegalStateException();
                        }

                        var11 = -var11;
                    }

                    int var9 = var5 * 10 + var11;
                    if (var9 / 10 != var5) {
                        var2 = false;
                        break;
                    }

                    var5 = var9;
                    var4 = true;
                }

                ++var7;
            }

            return var2;
        } catch (RuntimeException var10) {
            throw error(var10, "y.v(" + ')');
        }
    }

}
