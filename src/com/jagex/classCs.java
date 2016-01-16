package com.jagex;

import java.awt.event.ActionEvent;

public class classCs {

    static long handshakeWriteTime;
    static classT fieldAf;
    byte[] fieldV;
    int[] fieldA;
    int[] fieldI;


    public classCs(byte[] var1) {
        int var2 = var1.length;
        this.fieldA = new int[var2];
        this.fieldV = var1;
        int[] var3 = new int[33];
        this.fieldI = new int[8];
        int var4 = 0;

        for (int var5 = 0; var5 < var2; ++var5) {
            byte var6 = var1[var5];
            if (var6 != 0) {
                int var7 = 1 << 32 - var6;
                int var8 = var3[var6];
                this.fieldA[var5] = var8;
                int var9;
                int var10;
                int var11;
                int var12;
                if ((var8 & var7) != 0) {
                    var9 = var3[var6 - 1];
                } else {
                    var9 = var8 | var7;

                    for (var10 = var6 - 1; var10 >= 1; --var10) {
                        var11 = var3[var10];
                        if (var11 != var8) {
                            break;
                        }

                        var12 = 1 << 32 - var10;
                        if (0 != (var11 & var12)) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }

                        var3[var10] = var11 | var12;
                    }
                }

                var3[var6] = var9;

                for (var10 = 1 + var6; var10 <= 32; ++var10) {
                    if (var3[var10] == var8) {
                        var3[var10] = var9;
                    }
                }

                var10 = 0;

                for (var11 = 0; var11 < var6; ++var11) {
                    var12 = Integer.MIN_VALUE >>> var11;
                    if ((var8 & var12) != 0) {
                        if (0 == this.fieldI[var10]) {
                            this.fieldI[var10] = var4;
                        }

                        var10 = this.fieldI[var10];
                    } else {
                        ++var10;
                    }

                    if (var10 >= this.fieldI.length) {
                        int[] var13 = new int[2 * this.fieldI.length];

                        for (int var14 = 0; var14 < this.fieldI.length; ++var14) {
                            var13[var14] = this.fieldI[var14];
                        }

                        this.fieldI = var13;
                    }

                    var12 >>>= 1;
                }

                this.fieldI[var10] = ~var5;
                if (var10 >= var4) {
                    var4 = var10 + 1;
                }
            }
        }

    }

    public static void method302(TaskHandler var0, Object var1, int var2) {
        try {
            if (null == var0.sysEventQueue) {
                if (var2 > 23626953) {
                    ;
                }
            } else {
                for (int var3 = 0; var3 < 50; ++var3) {
                    if (var2 <= 23626953) {
                        throw new IllegalStateException();
                    }

                    if (var0.sysEventQueue.peekEvent() == null) {
                        break;
                    }

                    if (var2 <= 23626953) {
                        throw new IllegalStateException();
                    }

                    fancySleep(1L);
                }

                if (var1 != null) {
                    if (var2 <= 23626953) {
                        throw new IllegalStateException();
                    }

                    var0.sysEventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
                }

            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "cs.a(" + ')');
        }
    }

    static final void method303(int var0, int var1, int var2, int var3, int var4) {
        try {
            for (int var5 = 0; var5 < Client.fieldLj * -1726837317; ++var5) {
                if (var4 == 426123712) {
                    throw new IllegalStateException();
                }

                if (Client.fieldLq[var5] + Client.fieldLu[var5] > var0 && Client.fieldLu[var5] < var0 + var2) {
                    if (var4 == 426123712) {
                        throw new IllegalStateException();
                    }

                    if (Client.fieldLf[var5] + Client.fieldLa[var5] > var1) {
                        if (var4 == 426123712) {
                            throw new IllegalStateException();
                        }

                        if (Client.fieldLa[var5] < var1 + var3) {
                            Client.fieldLm[var5] = true;
                        }
                    }
                }
            }

        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "cs.bk(" + ')');
        }
    }

    static String getWidgetTitle(Widget var0, int var1) {
        try {
            int var3 = UtilClass38.getWidgetConfig(var0, 2070855251);
            int var2 = var3 >> 11 & 63;
            if (var2 == 0) {
                if (var1 != 469151008) {
                    throw new IllegalStateException();
                } else {
                    return null;
                }
            } else {
                if (var0.fieldCr != null) {
                    if (var1 != 469151008) {
                        throw new IllegalStateException();
                    }

                    if (var0.fieldCr.trim().length() != 0) {
                        return var0.fieldCr;
                    }
                }

                return null;
            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "cs.dc(" + ')');
        }
    }

    public static int method305(CharSequence var0, int var1) {
        try {
            return LandscapeMod.method115(var0, 10, true, (byte) 115);
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "cs.i(" + ')');
        }
    }

    public static final void fancySleep(long var0) {
        try {
            if (var0 > 0L) {
                if (0L == var0 % 10L) {
                    classAp.sleep(var0 - 1L);
                    classAp.sleep(1L);
                } else {
                    classAp.sleep(var0);
                }

            }
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "cs.a(" + ')');
        }
    }

    public int a(byte[] var1, int var2, int var3, byte[] var4, int var5, byte var6) {
        try {
            int var7 = 0;
            int var8 = var5 << 3;
            for (var3 += var2; var2 < var3; ++var2) {
                int var9 = var1[var2] & 255;
                int var10 = this.fieldA[var9];
                byte var11 = this.fieldV[var9];
                if (0 == var11) {
                    throw new RuntimeException("");
                }
                int var12 = var8 >> 3;
                int var13 = var8 & 7;
                var7 &= -var13 >> 31;
                int var14 = var12 + (var11 + var13 - 1 >> 3);
                var13 += 24;
                var4[var12] = (byte) (var7 |= var10 >>> var13);
                if (var12 < var14) {
                    ++var12;
                    var13 -= 8;
                    var4[var12] = (byte) (var7 = var10 >>> var13);
                    if (var12 < var14) {
                        ++var12;
                        var13 -= 8;
                        var4[var12] = (byte) (var7 = var10 >>> var13);
                        if (var12 < var14) {
                            ++var12;
                            var13 -= 8;
                            var4[var12] = (byte) (var7 = var10 >>> var13);
                            if (var12 < var14) {
                                ++var12;
                                var13 -= 8;
                                var4[var12] = (byte) (var7 = var10 << -var13);
                            }
                        }
                    }
                }
                var8 += var11;
            }
            return (7 + var8 >> 3) - var5;
        } catch (RuntimeException var15) {
            throw ClanMate.error(var15, "cs.a(" + ')');
        }
    }

    public int v(byte[] var1, int var2, byte[] var3, int var4, int var5, byte var6) {
        try {
            if (0 == var5) {
                if (var6 == 0) {
                    throw new IllegalStateException();
                } else {
                    return 0;
                }
            } else {
                int var7 = 0;
                var5 += var4;
                int var8 = var2;

                while (true) {
                    byte var9 = var1[var8];
                    if (var9 < 0) {
                        if (var6 == 0) {
                            throw new IllegalStateException();
                        }

                        var7 = this.fieldI[var7];
                    } else {
                        ++var7;
                    }

                    int var10;
                    if ((var10 = this.fieldI[var7]) < 0) {
                        if (var6 == 0) {
                            throw new IllegalStateException();
                        }

                        var3[var4++] = (byte) (~var10);
                        if (var4 >= var5) {
                            if (var6 == 0) {
                                throw new IllegalStateException();
                            }
                            break;
                        }

                        var7 = 0;
                    }

                    if ((var9 & 64) != 0) {
                        var7 = this.fieldI[var7];
                    } else {
                        ++var7;
                    }

                    if ((var10 = this.fieldI[var7]) < 0) {
                        if (var6 == 0) {
                            throw new IllegalStateException();
                        }

                        var3[var4++] = (byte) (~var10);
                        if (var4 >= var5) {
                            break;
                        }

                        var7 = 0;
                    }

                    if ((var9 & 32) != 0) {
                        if (var6 == 0) {
                            throw new IllegalStateException();
                        }

                        var7 = this.fieldI[var7];
                    } else {
                        ++var7;
                    }

                    if ((var10 = this.fieldI[var7]) < 0) {
                        var3[var4++] = (byte) (~var10);
                        if (var4 >= var5) {
                            if (var6 == 0) {
                                throw new IllegalStateException();
                            }
                            break;
                        }

                        var7 = 0;
                    }

                    if (0 != (var9 & 16)) {
                        var7 = this.fieldI[var7];
                    } else {
                        ++var7;
                    }

                    if ((var10 = this.fieldI[var7]) < 0) {
                        var3[var4++] = (byte) (~var10);
                        if (var4 >= var5) {
                            if (var6 == 0) {
                                throw new IllegalStateException();
                            }
                            break;
                        }

                        var7 = 0;
                    }

                    if (0 != (var9 & 8)) {
                        if (var6 == 0) {
                            throw new IllegalStateException();
                        }

                        var7 = this.fieldI[var7];
                    } else {
                        ++var7;
                    }

                    if ((var10 = this.fieldI[var7]) < 0) {
                        if (var6 == 0) {
                            throw new IllegalStateException();
                        }

                        var3[var4++] = (byte) (~var10);
                        if (var4 >= var5) {
                            if (var6 == 0) {
                                throw new IllegalStateException();
                            }
                            break;
                        }

                        var7 = 0;
                    }

                    if ((var9 & 4) != 0) {
                        if (var6 == 0) {
                            throw new IllegalStateException();
                        }

                        var7 = this.fieldI[var7];
                    } else {
                        ++var7;
                    }

                    if ((var10 = this.fieldI[var7]) < 0) {
                        if (var6 == 0) {
                            throw new IllegalStateException();
                        }

                        var3[var4++] = (byte) (~var10);
                        if (var4 >= var5) {
                            if (var6 == 0) {
                                throw new IllegalStateException();
                            }
                            break;
                        }

                        var7 = 0;
                    }

                    if (0 != (var9 & 2)) {
                        if (var6 == 0) {
                            throw new IllegalStateException();
                        }

                        var7 = this.fieldI[var7];
                    } else {
                        ++var7;
                    }

                    if ((var10 = this.fieldI[var7]) < 0) {
                        if (var6 == 0) {
                            throw new IllegalStateException();
                        }

                        var3[var4++] = (byte) (~var10);
                        if (var4 >= var5) {
                            break;
                        }

                        var7 = 0;
                    }

                    if (0 != (var9 & 1)) {
                        if (var6 == 0) {
                            throw new IllegalStateException();
                        }

                        var7 = this.fieldI[var7];
                    } else {
                        ++var7;
                    }

                    if ((var10 = this.fieldI[var7]) < 0) {
                        if (var6 == 0) {
                            throw new IllegalStateException();
                        }

                        var3[var4++] = (byte) (~var10);
                        if (var4 >= var5) {
                            if (var6 == 0) {
                                throw new IllegalStateException();
                            }
                            break;
                        }

                        var7 = 0;
                    }

                    ++var8;
                }

                return 1 + var8 - var2;
            }
        } catch (RuntimeException var11) {
            throw ClanMate.error(var11, "cs.v(" + ')');
        }
    }
}
