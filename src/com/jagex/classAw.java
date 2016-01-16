package com.jagex;

import java.io.File;
import java.io.RandomAccessFile;

public class classAw extends DualNode {

    public static Cache fieldB = new Cache(64);
    public static int fieldI;
    static ReferenceTable fieldA;
    static ReferenceTable fieldV;
    static int[][] fieldDw;
    static Sprite[] mouseCrosses;
    public boolean fieldF = false;
    public int fieldL = 608168039;
    int[] fieldK = new int[]{-1, -1, -1, -1, -1};
    int[] fieldM;
    short[] fieldW;
    short[] fieldE;
    short[] fieldN;
    short[] fieldS;

    static File method381(String var0, int var1) {
        try {
            if (!UtilClass15.fieldA) {
                if (var1 != -1860421458) {
                    throw new IllegalStateException();
                } else {
                    throw new RuntimeException("");
                }
            } else {
                File var2 = (File) UtilClass15.fieldI.get(var0);
                if (var2 != null) {
                    if (var1 != -1860421458) {
                        throw new IllegalStateException();
                    } else {
                        return var2;
                    }
                } else {
                    File var3 = new File(UtilClass15.fieldV, var0);
                    RandomAccessFile var4 = null;

                    try {
                        File var5 = new File(var3.getParent());
                        if (!var5.exists()) {
                            if (var1 != -1860421458) {
                                throw new IllegalStateException();
                            } else {
                                throw new RuntimeException("");
                            }
                        } else {
                            var4 = new RandomAccessFile(var3, "rw");
                            int var6 = var4.read();
                            var4.seek(0L);
                            var4.write(var6);
                            var4.seek(0L);
                            var4.close();
                            UtilClass15.fieldI.put(var0, var3);
                            return var3;
                        }
                    } catch (Exception var8) {
                        try {
                            if (null != var4) {
                                if (var1 != -1860421458) {
                                    throw new IllegalStateException();
                                }

                                var4.close();
                                var4 = null;
                            }
                        } catch (Exception var7) {
                            ;
                        }

                        throw new RuntimeException();
                    }
                }
            }
        } catch (RuntimeException var9) {
            throw ClanMate.error(var9, "aw.v(" + ')');
        }
    }

    void b(Buffer var1, int var2, byte var3) {
        try {
            if (1 == var2) {
                if (var3 <= 0) {
                    throw new IllegalStateException();
                }

                this.fieldL = var1.readUByte() * -608168039;
            } else {
                int var4;
                int var5;
                if (2 == var2) {
                    var4 = var1.readUByte();
                    this.fieldM = new int[var4];

                    for (var5 = 0; var5 < var4; ++var5) {
                        if (var3 <= 0) {
                            return;
                        }

                        this.fieldM[var5] = var1.readUShort();
                    }
                } else if (3 == var2) {
                    if (var3 <= 0) {
                        return;
                    }

                    this.fieldF = true;
                } else if (40 == var2) {
                    if (var3 <= 0) {
                        return;
                    }

                    var4 = var1.readUByte();
                    this.fieldW = new short[var4];
                    this.fieldE = new short[var4];

                    for (var5 = 0; var5 < var4; ++var5) {
                        if (var3 <= 0) {
                            throw new IllegalStateException();
                        }

                        this.fieldW[var5] = (short) var1.readUShort();
                        this.fieldE[var5] = (short) var1.readUShort();
                    }
                } else if (var2 == 41) {
                    var4 = var1.readUByte();
                    this.fieldN = new short[var4];
                    this.fieldS = new short[var4];

                    for (var5 = 0; var5 < var4; ++var5) {
                        if (var3 <= 0) {
                            return;
                        }

                        this.fieldN[var5] = (short) var1.readUShort();
                        this.fieldS[var5] = (short) var1.readUShort();
                    }
                } else if (var2 >= 60) {
                    if (var3 <= 0) {
                        throw new IllegalStateException();
                    }

                    if (var2 < 70) {
                        if (var3 <= 0) {
                            throw new IllegalStateException();
                        }

                        this.fieldK[var2 - 60] = var1.readUShort();
                    }
                }
            }

        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "aw.b(" + ')');
        }
    }

    public classCy m(byte var1) {
        try {
            if (this.fieldM == null) {
                if (var1 <= 0) {
                    throw new IllegalStateException();
                } else {
                    return null;
                }
            } else {
                classCy[] var2 = new classCy[this.fieldM.length];

                for (int var3 = 0; var3 < this.fieldM.length; ++var3) {
                    if (var1 <= 0) {
                        throw new IllegalStateException();
                    }

                    var2[var3] = classCy.method285(fieldV, this.fieldM[var3], 0);
                }

                classCy var6;
                if (var2.length == 1) {
                    if (var1 <= 0) {
                        throw new IllegalStateException();
                    }

                    var6 = var2[0];
                } else {
                    var6 = new classCy(var2, var2.length);
                }

                int var4;
                if (null != this.fieldW) {
                    if (var1 <= 0) {
                        throw new IllegalStateException();
                    }

                    for (var4 = 0; var4 < this.fieldW.length; ++var4) {
                        var6.o(this.fieldW[var4], this.fieldE[var4]);
                    }
                }

                if (this.fieldN != null) {
                    if (var1 <= 0) {
                        throw new IllegalStateException();
                    }

                    for (var4 = 0; var4 < this.fieldN.length; ++var4) {
                        if (var1 <= 0) {
                            throw new IllegalStateException();
                        }

                        var6.q(this.fieldN[var4], this.fieldS[var4]);
                    }
                }

                return var6;
            }
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "aw.m(" + ')');
        }
    }

    public classCy e(byte var1) {
        try {
            classCy[] var2 = new classCy[5];
            int var3 = 0;

            for (int var4 = 0; var4 < 5; ++var4) {
                if (var1 == 4) {
                    throw new IllegalStateException();
                }

                if (-1 != this.fieldK[var4]) {
                    var2[var3++] = classCy.method285(fieldV, this.fieldK[var4], 0);
                }
            }

            classCy var7 = new classCy(var2, var3);
            int var5;
            if (null != this.fieldW) {
                if (var1 == 4) {
                    throw new IllegalStateException();
                }

                for (var5 = 0; var5 < this.fieldW.length; ++var5) {
                    if (var1 == 4) {
                        throw new IllegalStateException();
                    }

                    var7.o(this.fieldW[var5], this.fieldE[var5]);
                }
            }

            if (null != this.fieldN) {
                for (var5 = 0; var5 < this.fieldN.length; ++var5) {
                    var7.q(this.fieldN[var5], this.fieldS[var5]);
                }
            }

            return var7;
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "aw.e(" + ')');
        }
    }

    public boolean l(int var1) {
        try {
            if (this.fieldM == null) {
                if (var1 == 1942167286) {
                    throw new IllegalStateException();
                } else {
                    return true;
                }
            } else {
                boolean var2 = true;

                for (int var3 = 0; var3 < this.fieldM.length; ++var3) {
                    if (var1 == 1942167286) {
                        throw new IllegalStateException();
                    }

                    if (!fieldV.l(this.fieldM[var3], 0, -1848854801)) {
                        if (var1 == 1942167286) {
                            throw new IllegalStateException();
                        }

                        var2 = false;
                    }
                }

                return var2;
            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "aw.l(" + ')');
        }
    }

    public boolean w(byte var1) {
        try {
            boolean var2 = true;

            for (int var3 = 0; var3 < 5; ++var3) {
                if (var1 == 7) {
                    throw new IllegalStateException();
                }

                if (this.fieldK[var3] != -1) {
                    if (var1 == 7) {
                        throw new IllegalStateException();
                    }

                    if (!fieldV.l(this.fieldK[var3], 0, -932718537)) {
                        if (var1 == 7) {
                            throw new IllegalStateException();
                        }

                        var2 = false;
                    }
                }
            }

            return var2;
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "aw.w(" + ')');
        }
    }

    void i(Buffer var1, byte var2) {
        try {
            while (true) {
                int var3 = var1.readUByte();
                if (0 == var3) {
                    if (var2 >= 0) {
                        throw new IllegalStateException();
                    }

                    return;
                }

                this.b(var1, var3, (byte) 86);
            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "aw.i(" + ')');
        }
    }
}
