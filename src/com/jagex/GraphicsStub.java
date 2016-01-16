package com.jagex;

import java.awt.*;

public final class GraphicsStub extends Renderable {

    static int fieldDd;
    static int cameraX;
    static Font fieldPg;
    static String fieldG;
    int height;
    int startCycle;
    int floor;
    int regionY;
    int regionX;
    int fieldE = 0;
    boolean complete = false;
    int fieldA;
    AnimationSequence fieldW;
    int fieldN = 0;


    GraphicsStub(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        this.fieldA = 1461529703 * var1;
        this.floor = var2 * -770311309;
        this.regionX = var3 * -1078509243;
        this.regionY = 1102425179 * var4;
        this.height = var5 * 1467593691;
        this.startCycle = (var6 + var7) * 1107073941;
        int var8 = TilePaint.getAnimation(this.fieldA * 1094266711, -1452313386).sequenceId * 1259888421;
        if (var8 != -1) {
            this.complete = false;
            this.fieldW = AnimationSequence.get(var8, 1976246855);
        } else {
            this.complete = true;
        }

    }

    static final boolean method405(char var0, int var1) {
        try {
            if (java.lang.Character.isISOControl(var0)) {
                if (var1 != -1857596927) {
                    throw new IllegalStateException();
                } else {
                    return false;
                }
            } else if (ExchangeOfferPriceComparator.method28(var0, -2117442459)) {
                if (var1 != -1857596927) {
                    throw new IllegalStateException();
                } else {
                    return true;
                }
            } else {
                char[] var2 = UtilClass34.fieldI;

                int var3;
                char var4;
                for (var3 = 0; var3 < var2.length; ++var3) {
                    if (var1 != -1857596927) {
                        throw new IllegalStateException();
                    }

                    var4 = var2[var3];
                    if (var4 == var0) {
                        if (var1 != -1857596927) {
                            throw new IllegalStateException();
                        }

                        return true;
                    }
                }

                var2 = UtilClass34.fieldB;

                for (var3 = 0; var3 < var2.length; ++var3) {
                    if (var1 != -1857596927) {
                        throw new IllegalStateException();
                    }

                    var4 = var2[var3];
                    if (var0 == var4) {
                        if (var1 != -1857596927) {
                            throw new IllegalStateException();
                        }

                        return true;
                    }
                }

                return false;
            }
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "an.v(" + ')');
        }
    }

    public static void method406(ReferenceTable var0, ReferenceTable var1, int var2) {
        try {
            classAw.fieldA = var0;
            classAw.fieldV = var1;
            classAw.fieldI = classAw.fieldA.getFileEntryCount(3, (byte) 0) * 481856405;
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "an.a(" + ')');
        }
    }

    final void a(int var1, int var2) {
        try {
            if (this.complete) {
                if (var2 < -1480489931) {
                    ;
                }
            } else {
                this.fieldN += -1094891139 * var1;

                while (this.fieldN * 370685909 > this.fieldW.fieldE[this.fieldE * -762311753]) {
                    this.fieldN -= this.fieldW.fieldE[this.fieldE * -762311753] * -1094891139;
                    this.fieldE += 843694599;
                    if (this.fieldE * -762311753 >= this.fieldW.fieldM.length) {
                        if (var2 >= -1480489931) {
                            return;
                        }

                        this.complete = true;
                        break;
                    }
                }

            }
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "an.a(" + ')');
        }
    }

    @Override
    protected final Model getModel(int var1) {
        try {
            Animation var2 = TilePaint.getAnimation(this.fieldA * 1094266711, 1243175545);
            Model var3;
            if (!this.complete) {
                if (var1 >= -1519654467) {
                    throw new IllegalStateException();
                }

                var3 = var2.l(this.fieldE * -762311753, 584501054);
            } else {
                var3 = var2.l(-1, 656695141);
            }

            if (var3 == null) {
                if (var1 >= -1519654467) {
                    throw new IllegalStateException();
                } else {
                    return null;
                }
            } else {
                var3.forceColor = true;
                var3.color = Color.GREEN.getRGB();
                return var3;
            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "an.v(" + ')');
        }
    }
}
