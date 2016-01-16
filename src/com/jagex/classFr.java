package com.jagex;

public class classFr extends classBz {

    NodeDeque fieldV = new NodeDeque();
    classAc fieldI = new classAc();
    classFm fieldA;


    classFr(classFm var1) {
        this.fieldA = var1;
    }

    @Override
    protected int e() {
        try {
            return 0;
        } catch (RuntimeException var1) {
            throw ClanMate.error(var1, "fr.e(" + ')');
        }
    }

    @Override
    protected void n(int[] var1, int var2, int var3) {
        try {
            this.fieldI.n(var1, var2, var3);

            for (classFy var6 = (classFy) this.fieldV.next(); var6 != null; var6 = (classFy) this.fieldV.tail()) {
                if (!this.fieldA.ak(var6, (byte) 23)) {
                    int var4 = var2;
                    int var5 = var3;

                    do {
                        if (var5 <= var6.fieldJ * 1902568299) {
                            this.a(var6, var1, var4, var5, var4 + var5, -1737584791);
                            var6.fieldJ -= var5 * -1621020349;
                            break;
                        }

                        this.a(var6, var1, var4, var6.fieldJ * 1902568299, var4 + var5, 1927756284);
                        var4 += var6.fieldJ * 1902568299;
                        var5 -= var6.fieldJ * 1902568299;
                    } while (!this.fieldA.aj(var6, var1, var4, var5, -422835390));
                }
            }

        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "fr.n(" + ')');
        }
    }

    @Override
    protected void k(int var1) {
        try {
            this.fieldI.k(var1);

            for (classFy var3 = (classFy) this.fieldV.next(); var3 != null; var3 = (classFy) this.fieldV.tail()) {
                if (!this.fieldA.ak(var3, (byte) 73)) {
                    int var2 = var1;

                    do {
                        if (var2 <= var3.fieldJ * 1902568299) {
                            this.v(var3, var2, 1073170910);
                            var3.fieldJ -= var2 * -1621020349;
                            break;
                        }

                        this.v(var3, var3.fieldJ * 1902568299, -2143854994);
                        var2 -= var3.fieldJ * 1902568299;
                    } while (!this.fieldA.aj(var3, (int[]) null, 0, var2, -422835390));
                }
            }

        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "fr.k(" + ')');
        }
    }

    void a(classFy var1, int[] var2, int var3, int var4, int var5, int var6) {
        try {
            if (0 != (this.fieldA.fieldJ[var1.fieldA * 803650951] & 4) && var1.fieldO * -2091090135 < 0) {
                if (var6 == -399256414) {
                    throw new IllegalStateException();
                }

                int var7 = this.fieldA.fieldZ[var1.fieldA * 803650951] / (classAp.audioSampleRate * 2098856905);

                while (true) {
                    int var8 = (var7 + 1048575 - var1.fieldY * 1913905157) / var7;
                    if (var8 > var4) {
                        if (var6 == -399256414) {
                            return;
                        }

                        var1.fieldY += -1759646515 * var4 * var7;
                        break;
                    }

                    var1.fieldU.n(var2, var3, var8);
                    var3 += var8;
                    var4 -= var8;
                    var1.fieldY += (var7 * var8 - 1048576) * -1759646515;
                    int var9 = classAp.audioSampleRate * 2098856905 / 100;
                    int var10 = 262144 / var7;
                    if (var10 < var9) {
                        var9 = var10;
                    }

                    classBw var11 = var1.fieldU;
                    if (this.fieldA.fieldP[var1.fieldA * 803650951] == 0) {
                        if (var6 == -399256414) {
                            throw new IllegalStateException();
                        }

                        var1.fieldU = classBw.method210(var1.fieldI, var11.av(), var11.o(), var11.q());
                    } else {
                        var1.fieldU = classBw.method210(var1.fieldI, var11.av(), 0, var11.q());
                        boolean var10002;
                        if (var1.fieldV.fieldI[var1.fieldM * -731628329] < 0) {
                            if (var6 == -399256414) {
                                throw new IllegalStateException();
                            }

                            var10002 = true;
                        } else {
                            var10002 = false;
                        }

                        this.fieldA.h(var1, var10002, -427336632);
                        var1.fieldU.j(var9, var11.o());
                    }

                    if (var1.fieldV.fieldI[var1.fieldM * -731628329] < 0) {
                        if (var6 == -399256414) {
                            throw new IllegalStateException();
                        }

                        var1.fieldU.s(-1);
                    }

                    var11.y(var9);
                    var11.n(var2, var3, var5 - var3);
                    if (var11.ax()) {
                        if (var6 == -399256414) {
                            throw new IllegalStateException();
                        }

                        this.fieldI.a(var11);
                    }
                }
            }

            var1.fieldU.n(var2, var3, var4);
        } catch (RuntimeException var12) {
            throw ClanMate.error(var12, "fr.a(" + ')');
        }
    }

    void v(classFy var1, int var2, int var3) {
        try {
            if (0 != (this.fieldA.fieldJ[var1.fieldA * 803650951] & 4)) {
                if (var3 == -507101108) {
                    return;
                }

                if (var1.fieldO * -2091090135 < 0) {
                    if (var3 == -507101108) {
                        return;
                    }

                    int var4 = this.fieldA.fieldZ[var1.fieldA * 803650951] / (classAp.audioSampleRate * 2098856905);
                    int var5 = (var4 + 1048575 - var1.fieldY * 1913905157) / var4;
                    var1.fieldY = -1759646515 * (var1.fieldY * 1913905157 + var4 * var2 & 1048575);
                    if (var5 <= var2) {
                        if (var3 == -507101108) {
                            throw new IllegalStateException();
                        }

                        if (0 == this.fieldA.fieldP[var1.fieldA * 803650951]) {
                            var1.fieldU = classBw.method210(var1.fieldI, var1.fieldU.av(), var1.fieldU.o(), var1.fieldU.q());
                        } else {
                            var1.fieldU = classBw.method210(var1.fieldI, var1.fieldU.av(), 0, var1.fieldU.q());
                            boolean var10002;
                            if (var1.fieldV.fieldI[var1.fieldM * -731628329] < 0) {
                                if (var3 == -507101108) {
                                    return;
                                }

                                var10002 = true;
                            } else {
                                var10002 = false;
                            }

                            this.fieldA.h(var1, var10002, -857026399);
                        }

                        if (var1.fieldV.fieldI[var1.fieldM * -731628329] < 0) {
                            var1.fieldU.s(-1);
                        }

                        var2 = var1.fieldY * 1913905157 / var4;
                    }
                }
            }

            var1.fieldU.k(var2);
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "fr.v(" + ')');
        }
    }

    @Override
    protected classBz m() {
        try {
            classFy var1 = (classFy) this.fieldV.next();
            return (classBz) (var1 == null ? null : (var1.fieldU != null ? var1.fieldU : this.w()));
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "fr.m(" + ')');
        }
    }

    @Override
    protected classBz w() {
        try {
            classFy var1;
            do {
                var1 = (classFy) this.fieldV.tail();
                if (var1 == null) {
                    return null;
                }
            } while (null == var1.fieldU);

            return var1.fieldU;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "fr.w(" + ')');
        }
    }
}
