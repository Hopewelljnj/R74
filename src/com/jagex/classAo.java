package com.jagex;

import java.awt.*;

public class classAo extends DualNode {

    public static ReferenceTable fieldA;
    public static Cache fieldV = new Cache(64);
    static int pitch;
    public int fieldM = 1911615573;
    public int fieldW;
    public int fieldI = 0;
    public int fieldB = 867630811;
    public boolean fieldL = true;
    public int fieldK;
    public int fieldE;
    public int fieldN;
    public int fieldF;
    public int fieldS;

    public static void method397(Component var0, int var1) {
        try {
            var0.addMouseListener(Mouse.instance);
            var0.addMouseMotionListener(Mouse.instance);
            var0.addFocusListener(Mouse.instance);
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "ao.a(" + ')');
        }
    }

    static boolean method398(ReferenceTable var0, int var1, int var2, byte var3) {
        try {
            byte[] var4 = var0.getFile(var1, var2, (short) 25115);
            if (null == var4) {
                if (var3 >= 0) {
                    throw new IllegalStateException();
                } else {
                    return false;
                }
            } else {
                UtilClass0.method390(var4, 1640507215);
                return true;
            }
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "ao.f(" + ')');
        }
    }

    static void method399(int var0) {
        try {
            IgnoredPlayer.fieldB = null;
            ExchangeOfferPriceComparator.fieldL = null;
            ExchangeOfferQuantityComparator.fieldM = null;
            UtilClass1.fieldW = null;
            UtilClass1.fieldE = null;
            classEp.fieldN = (byte[][]) null;
        } catch (RuntimeException var1) {
            throw ClanMate.error(var1, "ao.x(" + ')');
        }
    }

    public static int method400(int var0, int var1, int var2) {
        try {
            int var3;
            if (var1 > var0) {
                var3 = var0;
                var0 = var1;
                var1 = var3;
            }

            while (var1 != 0) {
                var3 = var0 % var1;
                var0 = var1;
                var1 = var3;
            }

            return var0;
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "ao.v(" + ')');
        }
    }

    public void a(int var1) {
        try {
            if (-1 != this.fieldM * 5993219) {
                this.b(this.fieldM * 5993219, (byte) 1);
                this.fieldS = this.fieldW * 680580201;
                this.fieldK = this.fieldE * -511460953;
                this.fieldF = this.fieldN * 1397397831;
            }

            this.b(this.fieldI * -190994435, (byte) 1);
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "ao.a(" + ')');
        }
    }

    void i(Buffer var1, int var2, int var3, int var4) {
        try {
            if (var2 == 1) {
                this.fieldI = var1.g(-1521941688) * -1807028907;
            } else if (var2 == 2) {
                this.fieldB = var1.readUByte() * -867630811;
            } else if (5 == var2) {
                this.fieldL = false;
            } else if (var2 == 7) {
                this.fieldM = var1.g(-1090353080) * -1911615573;
            } else if (var2 == 8) {}

        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "ao.i(" + ')');
        }
    }

    public void v(Buffer var1, int var2, int var3) {
        try {
            while (true) {
                int var4 = var1.readUByte();
                if (0 == var4) {
                    return;
                }

                this.i(var1, var4, var2, -1277756563);
            }
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "ao.v(" + ')');
        }
    }

    void b(int var1, byte var2) {
        try {
            double var3 = (double) (var1 >> 16 & 255) / 256.0D;
            double var5 = (double) (var1 >> 8 & 255) / 256.0D;
            double var7 = (double) (var1 & 255) / 256.0D;
            double var9 = var3;
            if (var5 < var3) {
                if (var2 != 1) {
                    return;
                }

                var9 = var5;
            }

            if (var7 < var9) {
                if (var2 != 1) {
                    throw new IllegalStateException();
                }

                var9 = var7;
            }

            double var11 = var3;
            if (var5 > var3) {
                var11 = var5;
            }

            if (var7 > var11) {
                if (var2 != 1) {
                    return;
                }

                var11 = var7;
            }

            double var13 = 0.0D;
            double var15 = 0.0D;
            double var17 = (var9 + var11) / 2.0D;
            if (var11 != var9) {
                if (var2 != 1) {
                    return;
                }

                if (var17 < 0.5D) {
                    if (var2 != 1) {
                        throw new IllegalStateException();
                    }

                    var15 = (var11 - var9) / (var9 + var11);
                }

                if (var17 >= 0.5D) {
                    if (var2 != 1) {
                        return;
                    }

                    var15 = (var11 - var9) / (2.0D - var11 - var9);
                }

                if (var3 == var11) {
                    var13 = (var5 - var7) / (var11 - var9);
                } else if (var11 == var5) {
                    if (var2 != 1) {
                        throw new IllegalStateException();
                    }

                    var13 = 2.0D + (var7 - var3) / (var11 - var9);
                } else if (var11 == var7) {
                    if (var2 != 1) {
                        throw new IllegalStateException();
                    }

                    var13 = 4.0D + (var3 - var5) / (var11 - var9);
                }
            }

            var13 /= 6.0D;
            this.fieldW = -967322963 * (int) (var13 * 256.0D);
            this.fieldE = -1953082177 * (int) (256.0D * var15);
            this.fieldN = -531633929 * (int) (256.0D * var17);
            if (this.fieldE * -1003545793 < 0) {
                if (var2 != 1) {
                    throw new IllegalStateException();
                }

                this.fieldE = 0;
            } else if (this.fieldE * -1003545793 > 255) {
                if (var2 != 1) {
                    return;
                }

                this.fieldE = 180251201;
            }

            if (this.fieldN * -161785657 < 0) {
                if (var2 != 1) {
                    throw new IllegalStateException();
                }

                this.fieldN = 0;
            } else if (this.fieldN * -161785657 > 255) {
                if (var2 != 1) {
                    throw new IllegalStateException();
                }

                this.fieldN = 1872301577;
            }

        } catch (RuntimeException var19) {
            throw ClanMate.error(var19, "ao.b(" + ')');
        }
    }
}
