package com.jagex;

import java.io.EOFException;
import java.io.IOException;

public final class classDz {

    public static int fieldE;
    protected static int fieldPe;
    static byte[] fieldA = new byte[520];
    classHf fieldV = null;
    int fieldL = -1986488536;
    classHf fieldB = null;
    int fieldI;


    public classDz(int var1, classHf var2, classHf var3, int var4) {
        this.fieldI = 681054393 * var1;
        this.fieldV = var2;
        this.fieldB = var3;
        this.fieldL = -1226342839 * var4;
    }

    public static synchronized long getFancyTime(int var0) {
        try {
            long var1 = System.currentTimeMillis();
            if (var1 < UtilClass3.fieldA * 6555031736608146535L) {
                UtilClass3.fieldV += -861227465807218701L * (6555031736608146535L * UtilClass3.fieldA - var1);
            }

            UtilClass3.fieldA = var1 * 9043281468859094871L;
            return var1 + UtilClass3.fieldV * 2520020392274966843L;
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "dz.a(" + ')');
        }
    }

    boolean i(int var1, byte[] var2, int var3, boolean var4, int var5) {
        try {
            classHf var6 = this.fieldV;
            synchronized (this.fieldV) {
                boolean var10000;
                try {
                    int var7;
                    if (var4) {
                        label196:
                        {
                            if (this.fieldB.i(1446144165) < (long) (var1 * 6 + 6)) {
                                if (var5 <= -527527690) {
                                    throw new IllegalStateException();
                                }

                                var10000 = false;
                                return var10000;
                            }

                            this.fieldB.v((long) (var1 * 6));
                            this.fieldB.l(fieldA, 0, 6, 655966399);
                            var7 = (fieldA[5] & 255) + ((fieldA[3] & 255) << 16) + ((fieldA[4] & 255) << 8);
                            if (var7 > 0) {
                                if (var5 <= -527527690) {
                                    throw new IllegalStateException();
                                }

                                if ((long) var7 <= this.fieldV.i(1529321308) / 520L) {
                                    break label196;
                                }

                                if (var5 <= -527527690) {
                                    throw new IllegalStateException();
                                }
                            }

                            var10000 = false;
                            return var10000;
                        }
                    } else {
                        var7 = (int) ((this.fieldV.i(1006322277) + 519L) / 520L);
                        if (var7 == 0) {
                            if (var5 <= -527527690) {
                                throw new IllegalStateException();
                            }

                            var7 = 1;
                        }
                    }

                    fieldA[0] = (byte) (var3 >> 16);
                    fieldA[1] = (byte) (var3 >> 8);
                    fieldA[2] = (byte) var3;
                    fieldA[3] = (byte) (var7 >> 16);
                    fieldA[4] = (byte) (var7 >> 8);
                    fieldA[5] = (byte) var7;
                    this.fieldB.v((long) (6 * var1));
                    this.fieldB.w(fieldA, 0, 6, 2110666995);
                    int var8 = 0;
                    int var9 = 0;

                    while (true) {
                        if (var8 < var3) {
                            label178:
                            {
                                if (var5 <= -527527690) {
                                    throw new IllegalStateException();
                                }

                                int var10 = 0;
                                int var11;
                                if (var4) {
                                    label199:
                                    {
                                        if (var5 <= -527527690) {
                                            throw new IllegalStateException();
                                        }

                                        this.fieldV.v((long) (520 * var7));

                                        try {
                                            this.fieldV.l(fieldA, 0, 8, 655966399);
                                        } catch (EOFException var15) {
                                            break label178;
                                        }

                                        var11 = ((fieldA[0] & 255) << 8) + (fieldA[1] & 255);
                                        int var12 = ((fieldA[2] & 255) << 8) + (fieldA[3] & 255);
                                        var10 = ((fieldA[5] & 255) << 8) + ((fieldA[4] & 255) << 16) + (fieldA[6] & 255);
                                        int var13 = fieldA[7] & 255;
                                        if (var11 == var1) {
                                            if (var5 <= -527527690) {
                                                throw new IllegalStateException();
                                            }

                                            if (var9 == var12) {
                                                if (var13 == this.fieldI * 948893065) {
                                                    if (var10 < 0) {
                                                        break;
                                                    }

                                                    if (var5 <= -527527690) {
                                                        throw new IllegalStateException();
                                                    }

                                                    if ((long) var10 > this.fieldV.i(2024375140) / 520L) {
                                                        if (var5 <= -527527690) {
                                                            throw new IllegalStateException();
                                                        }
                                                        break;
                                                    }
                                                    break label199;
                                                }

                                                if (var5 <= -527527690) {
                                                    throw new IllegalStateException();
                                                }
                                            }
                                        }

                                        var10000 = false;
                                        return var10000;
                                    }
                                }

                                if (var10 == 0) {
                                    var4 = false;
                                    var10 = (int) ((this.fieldV.i(1482701735) + 519L) / 520L);
                                    if (0 == var10) {
                                        ++var10;
                                    }

                                    if (var10 == var7) {
                                        if (var5 <= -527527690) {
                                            throw new IllegalStateException();
                                        }

                                        ++var10;
                                    }
                                }

                                if (var3 - var8 <= 512) {
                                    if (var5 <= -527527690) {
                                        throw new IllegalStateException();
                                    }

                                    var10 = 0;
                                }

                                fieldA[0] = (byte) (var1 >> 8);
                                fieldA[1] = (byte) var1;
                                fieldA[2] = (byte) (var9 >> 8);
                                fieldA[3] = (byte) var9;
                                fieldA[4] = (byte) (var10 >> 16);
                                fieldA[5] = (byte) (var10 >> 8);
                                fieldA[6] = (byte) var10;
                                fieldA[7] = (byte) (this.fieldI * 948893065);
                                this.fieldV.v((long) (var7 * 520));
                                this.fieldV.w(fieldA, 0, 8, 2123236741);
                                var11 = var3 - var8;
                                if (var11 > 512) {
                                    if (var5 <= -527527690) {
                                        throw new IllegalStateException();
                                    }

                                    var11 = 512;
                                }

                                this.fieldV.w(var2, var8, var11, 2104782540);
                                var8 += var11;
                                var7 = var10;
                                ++var9;
                                continue;
                            }
                        }

                        var10000 = true;
                        return var10000;
                    }

                    var10000 = false;
                } catch (IOException var16) {
                    return false;
                }

                return var10000;
            }
        } catch (RuntimeException var18) {
            throw ClanMate.error(var18, "dz.i(" + ')');
        }
    }

    public boolean v(int var1, byte[] var2, int var3, int var4) {
        try {
            classHf var5 = this.fieldV;
            synchronized (this.fieldV) {
                if (var3 >= 0) {
                    if (var4 == 313718106) {
                        throw new IllegalStateException();
                    }

                    if (var3 <= this.fieldL * -306129927) {
                        boolean var6 = this.i(var1, var2, var3, true, 1697849685);
                        if (!var6) {
                            if (var4 == 313718106) {
                                throw new IllegalStateException();
                            }

                            var6 = this.i(var1, var2, var3, false, 520104608);
                        }

                        return var6;
                    }
                }

                throw new IllegalArgumentException();
            }
        } catch (RuntimeException var9) {
            throw ClanMate.error(var9, "dz.v(" + ')');
        }
    }

    public byte[] a(int var1, int var2) {
        try {
            classHf var3 = this.fieldV;
            synchronized (this.fieldV) {
                try {
                    Object var10000;
                    if (this.fieldB.i(1017570093) < (long) (6 + 6 * var1)) {
                        if (var2 <= -1299330032) {
                            throw new IllegalStateException();
                        } else {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                    } else {
                        this.fieldB.v((long) (var1 * 6));
                        this.fieldB.l(fieldA, 0, 6, 655966399);
                        int var4 = (fieldA[2] & 255) + ((fieldA[0] & 255) << 16) + ((fieldA[1] & 255) << 8);
                        int var5 = (fieldA[5] & 255) + ((fieldA[3] & 255) << 16) + ((fieldA[4] & 255) << 8);
                        if (var4 >= 0) {
                            if (var2 <= -1299330032) {
                                throw new IllegalStateException();
                            }

                            if (var4 <= this.fieldL * -306129927) {
                                if (var5 > 0) {
                                    if (var2 <= -1299330032) {
                                        throw new IllegalStateException();
                                    }

                                    if ((long) var5 <= this.fieldV.i(1543868078) / 520L) {
                                        byte[] var6 = new byte[var4];
                                        int var7 = 0;
                                        int var8 = 0;

                                        while (true) {
                                            if (var7 < var4) {
                                                if (var2 <= -1299330032) {
                                                    throw new IllegalStateException();
                                                }

                                                if (0 == var5) {
                                                    var10000 = null;
                                                    return (byte[]) var10000;
                                                }

                                                this.fieldV.v((long) (var5 * 520));
                                                int var9 = var4 - var7;
                                                if (var9 > 512) {
                                                    if (var2 <= -1299330032) {
                                                        throw new IllegalStateException();
                                                    }

                                                    var9 = 512;
                                                }

                                                this.fieldV.l(fieldA, 0, 8 + var9, 655966399);
                                                int var10 = (fieldA[1] & 255) + ((fieldA[0] & 255) << 8);
                                                int var11 = ((fieldA[2] & 255) << 8) + (fieldA[3] & 255);
                                                int var12 = (fieldA[6] & 255) + ((fieldA[5] & 255) << 8) + ((fieldA[4] & 255) << 16);
                                                int var13 = fieldA[7] & 255;
                                                if (var1 == var10) {
                                                    if (var2 <= -1299330032) {
                                                        throw new IllegalStateException();
                                                    }

                                                    if (var11 == var8) {
                                                        if (var13 == this.fieldI * 948893065) {
                                                            if (var12 >= 0) {
                                                                if (var2 <= -1299330032) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                if ((long) var12 <= this.fieldV.i(1196497452) / 520L) {
                                                                    for (int var14 = 0; var14 < var9; ++var14) {
                                                                        var6[var7++] = fieldA[8 + var14];
                                                                    }

                                                                    var5 = var12;
                                                                    ++var8;
                                                                    continue;
                                                                }

                                                                if (var2 <= -1299330032) {
                                                                    throw new IllegalStateException();
                                                                }
                                                            }

                                                            var10000 = null;
                                                            return (byte[]) var10000;
                                                        }

                                                        if (var2 <= -1299330032) {
                                                            throw new IllegalStateException();
                                                        }
                                                    }
                                                }

                                                var10000 = null;
                                                return (byte[]) var10000;
                                            }

                                            byte[] var19 = var6;
                                            return var19;
                                        }
                                    }

                                    if (var2 <= -1299330032) {
                                        throw new IllegalStateException();
                                    }
                                }

                                var10000 = null;
                                return (byte[]) var10000;
                            }

                            if (var2 <= -1299330032) {
                                throw new IllegalStateException();
                            }
                        }

                        var10000 = null;
                        return (byte[]) var10000;
                    }
                } catch (IOException var16) {
                    return null;
                }
            }
        } catch (RuntimeException var18) {
            throw ClanMate.error(var18, "dz.a(" + ')');
        }
    }
}
