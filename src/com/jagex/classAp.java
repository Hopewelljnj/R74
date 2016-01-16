package com.jagex;

import java.awt.*;

public class classAp {

    public static int audioSampleRate;
    static int fieldL;
    static boolean twoChannels;
    static classBf fieldM;
    int fieldU = 0;
    int[] fieldN;
    classBz fieldS;
    long fieldJ = 0L;
    int fieldD;
    long fieldQ = 0L;
    long fieldF = classDz.getFancyTime(801655421) * 8190748539564203193L;
    int fieldT = 0;
    int fieldH = 0;
    int fieldO;
    int fieldX;
    boolean fieldG = true;
    int fieldK = 285948320;
    int fieldAn = 0;
    classBz[] fieldAs = new classBz[8];
    classBz[] fieldAh = new classBz[8];

    static final void sleep(long var0) {
        try {
            try {
                Thread.sleep(var0);
            } catch (InterruptedException var3) {
                ;
            }

        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "ap.v(" + ')');
        }
    }

    static void method402(int var0) {
        try {
            classM.fieldI = -1080110107;
            classM.fieldB = new byte[4][104][104];
            classBy.fieldL = new byte[4][104][104];
            classM.fieldM = new byte[4][104][104];
            classM.fieldW = new byte[4][104][104];
            Buffer.fieldO = new int[4][105][105];
            classCn.fieldE = new byte[4][105][105];
            World.fieldN = new int[105][105];
            classM.fieldS = new int[104];
            classM.fieldK = new int[104];
            classM.fieldF = new int[104];
            classM.fieldD = new int[104];
            ItemTable.fieldX = new int[104];
        } catch (RuntimeException var1) {
            throw ClanMate.error(var1, "ap.a(" + ')');
        }
    }

    void v(int var1) throws Exception {
        try {
            ;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "ap.v(" + ')');
        }
    }

    public final synchronized void p(classBz var1, int var2) {
        try {
            this.fieldS = var1;
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "ap.p(" + ')');
        }
    }

    public final synchronized void r(byte var1) {
        try {
            if (this.fieldN != null) {
                long var2 = classDz.getFancyTime(828916988);

                try {
                    if (this.fieldQ * 3086274968713247337L != 0L) {
                        if (var1 >= 8) {
                            throw new IllegalStateException();
                        }

                        if (var2 < 3086274968713247337L * this.fieldQ) {
                            if (var1 >= 8) {
                                throw new IllegalStateException();
                            }

                            return;
                        }

                        this.v(this.fieldD * 205159871);
                        this.fieldQ = 0L;
                        this.fieldG = true;
                    }

                    int var4 = this.i();
                    if (this.fieldU * -51941201 - var4 > this.fieldT * 1729230423) {
                        if (var1 >= 8) {
                            return;
                        }

                        this.fieldT = (this.fieldU * -51941201 - var4) * -1409460889;
                    }

                    int var5 = this.fieldO * 1943529701 + this.fieldX * 17421589;
                    if (var5 + 256 > 16384) {
                        if (var1 >= 8) {
                            throw new IllegalStateException();
                        }

                        var5 = 16128;
                    }

                    if (256 + var5 > this.fieldD * 205159871) {
                        if (var1 >= 8) {
                            return;
                        }

                        this.fieldD += -1849099264;
                        if (this.fieldD * 205159871 > 16384) {
                            if (var1 >= 8) {
                                throw new IllegalStateException();
                            }

                            this.fieldD = 479182848;
                        }

                        this.l();
                        this.v(this.fieldD * 205159871);
                        var4 = 0;
                        this.fieldG = true;
                        if (var5 + 256 > this.fieldD * 205159871) {
                            if (var1 >= 8) {
                                throw new IllegalStateException();
                            }

                            var5 = this.fieldD * 205159871 - 256;
                            this.fieldO = (var5 - this.fieldX * 17421589) * -1174039315;
                        }
                    }

                    while (var4 < var5) {
                        if (var1 >= 8) {
                            throw new IllegalStateException();
                        }

                        this.ah(this.fieldN, 256);
                        this.b();
                        var4 += 256;
                    }

                    if (var2 > 3257137446149622949L * this.fieldJ) {
                        if (!this.fieldG) {
                            if (var1 >= 8) {
                                throw new IllegalStateException();
                            }

                            if (this.fieldT * 1729230423 == 0) {
                                if (var1 >= 8) {
                                    throw new IllegalStateException();
                                }

                                if (0 == this.fieldH * -575838015) {
                                    if (var1 >= 8) {
                                        throw new IllegalStateException();
                                    }

                                    this.l();
                                    this.fieldQ = -4281901793394035239L * (2000L + var2);
                                    return;
                                }
                            }

                            this.fieldO = Math.min(this.fieldH * -575838015, this.fieldT * 1729230423) * -1174039315;
                            this.fieldH = this.fieldT * 593218839;
                        } else {
                            this.fieldG = false;
                        }

                        this.fieldT = 0;
                        this.fieldJ = (var2 + 2000L) * 4315629168894278445L;
                    }

                    this.fieldU = -807803313 * var4;
                } catch (Exception var7) {
                    this.l();
                    this.fieldQ = -4281901793394035239L * (2000L + var2);
                }

                try {
                    if (var2 > 500000L + this.fieldF * 2399384022408571273L) {
                        if (var1 >= 8) {
                            throw new IllegalStateException();
                        }

                        var2 = 2399384022408571273L * this.fieldF;
                    }

                    while (var2 > 5000L + 2399384022408571273L * this.fieldF) {
                        if (var1 >= 8) {
                            return;
                        }

                        this.as(256, (short) 128);
                        this.fieldF += 8190748539564203193L * (long) (256000 / (audioSampleRate * 2098856905));
                    }
                } catch (Exception var6) {
                    this.fieldF = var2 * 8190748539564203193L;
                }

            }
        } catch (RuntimeException var8) {
            throw ClanMate.error(var8, "ap.r(" + ')');
        }
    }

    public final synchronized void c(short var1) {
        try {
            this.fieldG = true;

            try {
                this.m();
            } catch (Exception var3) {
                this.l();
                this.fieldQ = (classDz.getFancyTime(965376390) + 2000L) * -4281901793394035239L;
            }

        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "ap.c(" + ')');
        }
    }

    public final synchronized void an(int var1) {
        try {
            if (null != fieldM) {
                if (var1 <= -950792229) {
                    return;
                }

                boolean var2 = true;

                for (int var3 = 0; var3 < 2; ++var3) {
                    if (var1 <= -950792229) {
                        throw new IllegalStateException();
                    }

                    if (this == fieldM.fieldV[var3]) {
                        fieldM.fieldV[var3] = null;
                    }

                    if (fieldM.fieldV[var3] != null) {
                        var2 = false;
                    }
                }

                if (var2) {
                    if (var1 <= -950792229) {
                        throw new IllegalStateException();
                    }

                    fieldM.fieldI = true;

                    while (fieldM.fieldB) {
                        classCs.fancySleep(50L);
                    }

                    fieldM = null;
                }
            }

            this.l();
            this.fieldN = null;
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "ap.an(" + ')');
        }
    }

    final void as(int var1, short var2) {
        try {
            this.fieldAn -= var1 * 584765503;
            if (this.fieldAn * 2126061503 < 0) {
                if (var2 != 128) {
                    return;
                }

                this.fieldAn = 0;
            }

            if (this.fieldS != null) {
                if (var2 != 128) {
                    throw new IllegalStateException();
                }

                this.fieldS.k(var1);
            }

        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "ap.as(" + ')');
        }
    }

    void a(Component var1) throws Exception {
        try {
            ;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "ap.a(" + ')');
        }
    }

    int i() throws Exception {
        try {
            return this.fieldD * 205159871;
        } catch (RuntimeException var1) {
            throw ClanMate.error(var1, "ap.i(" + ')');
        }
    }

    void b() throws Exception {
        try {
            ;
        } catch (RuntimeException var1) {
            throw ClanMate.error(var1, "ap.b(" + ')');
        }
    }

    void m() throws Exception {
        try {
            ;
        } catch (RuntimeException var1) {
            throw ClanMate.error(var1, "ap.m(" + ')');
        }
    }

    final void ae(classBz var1, int var2, short var3) {
        try {
            int var4 = var2 >> 5;
            classBz var5 = this.fieldAh[var4];
            if (var5 == null) {
                if (var3 != 128) {
                    throw new IllegalStateException();
                }

                this.fieldAs[var4] = var1;
            } else {
                var5.fieldT = var1;
            }

            this.fieldAh[var4] = var1;
            var1.fieldH = var2;
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "ap.ae(" + ')');
        }
    }

    public final void z(int var1) {
        try {
            this.fieldG = true;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "ap.z(" + ')');
        }
    }

    void l() {
        try {
            ;
        } catch (RuntimeException var1) {
            throw ClanMate.error(var1, "ap.l(" + ')');
        }
    }

    final void ah(int[] var1, int var2) {
        int var3 = var2;
        if (twoChannels) {
            var3 = var2 << 1;
        }

        UtilClass9.method73(var1, 0, var3);
        this.fieldAn -= var2 * 584765503;
        if (this.fieldS != null && this.fieldAn * 2126061503 <= 0) {
            this.fieldAn += 584765503 * (audioSampleRate * 2098856905 >> 4);
            UtilClass39.method172(this.fieldS, 1676997225);
            this.ae(this.fieldS, this.fieldS.ai(), (short) 128);
            int var4 = 0;
            int var5 = 255;

            int var6;
            classBz var10;
            label136:
            for (var6 = 7; var5 != 0; --var6) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }

                for (int var9 = var5 >>> var7 & 286331153; 0 != var9; var9 >>>= 4) {
                    if (0 != (var9 & 1)) {
                        var5 &= ~(1 << var7);
                        var10 = null;
                        classBz var11 = this.fieldAs[var7];

                        while (null != var11) {
                            classBm var12 = var11.fieldU;
                            if (var12 != null && var12.fieldM > var8) {
                                var5 |= 1 << var7;
                                var10 = var11;
                                var11 = var11.fieldT;
                            } else {
                                var11.fieldW = true;
                                int var13 = var11.e();
                                var4 += var13;
                                if (null != var12) {
                                    var12.fieldM += var13;
                                }

                                if (var4 >= this.fieldK * -147571963) {
                                    break label136;
                                }

                                classBz var14 = var11.m();
                                if (null != var14) {
                                    for (int var15 = var11.fieldH; var14 != null; var14 = var11.w()) {
                                        this.ae(var14, var15 * var14.ai() >> 8, (short) 128);
                                    }
                                }

                                classBz var18 = var11.fieldT;
                                var11.fieldT = null;
                                if (null == var10) {
                                    this.fieldAs[var7] = var18;
                                } else {
                                    var10.fieldT = var18;
                                }

                                if (var18 == null) {
                                    this.fieldAh[var7] = var10;
                                }

                                var11 = var18;
                            }
                        }
                    }

                    var7 += 4;
                    ++var8;
                }
            }

            for (var6 = 0; var6 < 8; ++var6) {
                classBz var16 = this.fieldAs[var6];
                classBz[] var17 = this.fieldAs;
                this.fieldAh[var6] = null;

                for (var17[var6] = null; null != var16; var16 = var10) {
                    var10 = var16.fieldT;
                    var16.fieldT = null;
                }
            }
        }

        if (this.fieldAn * 2126061503 < 0) {
            this.fieldAn = 0;
        }

        if (null != this.fieldS) {
            this.fieldS.n(var1, 0, var2);
        }

        this.fieldF = classDz.getFancyTime(972827831) * 8190748539564203193L;
    }

}
