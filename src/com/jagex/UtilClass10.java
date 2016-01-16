package com.jagex;

public class UtilClass10 {

    static int fieldV = 0;
    static CompressedImage[] MMObjectIcons;
    static int fieldI = 0;
    static byte[][] fieldB = new byte[1000][];
    static byte[][] fieldL = new byte[250][];
    static byte[][] fieldM = new byte[50][];
    static int fieldA = 0;


    UtilClass10() throws Throwable {
        throw new Error();
    }

    public static Varp getVarp(int var0, int var1) {
        try {
            Varp var2 = (Varp) Varp.fieldI.get((long) var0);
            if (null != var2) {
                return var2;
            } else {
                byte[] var3 = Varp.fieldA.getFile(16, var0, (short) 2289);
                var2 = new Varp();
                if (var3 != null) {
                    var2.v(new Buffer(var3), (byte) 0);
                }
                Varp.fieldI.put(var2, (long) var0);
                return var2;
            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "dq.a(" + ')');
        }
    }

    static String method77(Widget var0, int var1, byte var2) {
        try {
            int var4 = UtilClass38.getWidgetConfig(var0, 2070855251);
            boolean var10000;
            if (0 != (var4 >> var1 + 1 & 1)) {
                if (var2 != 1) {
                    throw new IllegalStateException();
                }

                var10000 = true;
            } else {
                var10000 = false;
            }

            boolean var3 = var10000;
            if (!var3) {
                if (var2 != 1) {
                    throw new IllegalStateException();
                }

                if (var0.fieldCz == null) {
                    if (var2 != 1) {
                        throw new IllegalStateException();
                    }

                    return null;
                }
            }

            if (var0.fieldBv != null) {
                if (var2 != 1) {
                    throw new IllegalStateException();
                }

                if (var0.fieldBv.length > var1 && var0.fieldBv[var1] != null) {
                    if (var2 != 1) {
                        throw new IllegalStateException();
                    }

                    if (var0.fieldBv[var1].trim().length() != 0) {
                        return var0.fieldBv[var1];
                    }

                    if (var2 != 1) {
                        throw new IllegalStateException();
                    }
                }
            }

            return null;
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "dq.ds(" + ')');
        }
    }

    static void method78(int var0) {
        try {
            for (classG var1 = (classG) classG.fieldA.next(); var1 != null; var1 = (classG) classG.fieldA.tail()) {
                if (var0 == -163143922) {
                    return;
                }

                if (var1.fieldO != null) {
                    if (var0 == -163143922) {
                        throw new IllegalStateException();
                    }

                    var1.i((byte) 90);
                }
            }

        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "dq.v(" + ')');
        }
    }

    static synchronized byte[] method79(int var0, int var1) {
        try {
            byte[] var2;
            if (var0 == 100) {
                if (var1 != 495228928) {
                    throw new IllegalStateException();
                }

                if (fieldA * -130659317 > 0) {
                    if (var1 != 495228928) {
                        throw new IllegalStateException();
                    }

                    var2 = fieldB[(fieldA -= -1986994269) * -130659317];
                    fieldB[fieldA * -130659317] = null;
                    return var2;
                }
            }

            if (var0 == 5000) {
                if (var1 != 495228928) {
                    throw new IllegalStateException();
                }

                if (fieldV * -2062828579 > 0) {
                    var2 = fieldL[(fieldV -= -136350603) * -2062828579];
                    fieldL[fieldV * -2062828579] = null;
                    return var2;
                }
            }

            if (var0 == 30000) {
                if (var1 != 495228928) {
                    throw new IllegalStateException();
                }

                if (fieldI * 441140845 > 0) {
                    if (var1 != 495228928) {
                        throw new IllegalStateException();
                    }

                    var2 = fieldM[(fieldI -= -1192512667) * 441140845];
                    fieldM[fieldI * 441140845] = null;
                    return var2;
                }
            }

            return new byte[var0];
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "dq.a(" + ')');
        }
    }
}
