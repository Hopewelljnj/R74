package com.jagex;

public class Animation extends DualNode {

    public static Cache cache = new Cache(64);
    public static Cache fieldB = new Cache(30);
    static ReferenceTable fieldV;
    static ReferenceTable referenceTable;
    public int sequenceId = -1527030957;
    int fieldM;
    int id;
    int fieldX = 0;
    short[] fieldE;
    short[] fieldS;
    short[] fieldK;
    int fieldF = -1815264384;
    int fieldD = 160265856;
    int fieldO = 0;
    int fieldQ = 0;
    short[] fieldN;


    static classCx method367(int var0, int var1) {
        try {
            classCx var2 = (classCx) AnimationSequence.fieldL.get((long) var0);
            if (var2 != null) {
                if (var1 >= 1161834894) {
                    throw new IllegalStateException();
                } else {
                    return var2;
                }
            } else {
                ReferenceTable var4 = AnimationSequence.fieldV;
                ReferenceTable var5 = AnimationSequence.fieldI;
                boolean var6 = true;
                int[] var7 = var4.f(var0, -826674753);

                for (int var8 = 0; var8 < var7.length; ++var8) {
                    if (var1 >= 1161834894) {
                        throw new IllegalStateException();
                    }

                    byte[] var9 = var4.n(var0, var7[var8], -213809809);
                    if (var9 == null) {
                        if (var1 >= 1161834894) {
                            throw new IllegalStateException();
                        }

                        var6 = false;
                    } else {
                        int var10 = (var9[0] & 255) << 8 | var9[1] & 255;
                        byte[] var11 = var5.n(var10, 0, -213809809);
                        if (null == var11) {
                            var6 = false;
                        }
                    }
                }

                classCx var3;
                if (!var6) {
                    if (var1 >= 1161834894) {
                        throw new IllegalStateException();
                    }

                    var3 = null;
                } else {
                    try {
                        var3 = new classCx(var4, var5, var0, false);
                    } catch (Exception var12) {
                        var3 = null;
                    }
                }

                if (var3 != null) {
                    AnimationSequence.fieldL.put(var3, (long) var0);
                }

                return var3;
            }
        } catch (RuntimeException var13) {
            throw ClanMate.error(var13, "at.s(" + ')');
        }
    }

    public static classGm method368(ReferenceTable var0, ReferenceTable var1, int var2, int var3, int var4) {
        try {
            if (!classAo.method398(var0, var2, var3, (byte) -70)) {
                if (var4 != -1659684103) {
                    throw new IllegalStateException();
                } else {
                    return null;
                }
            } else {
                byte[] var6 = var1.getFile(var2, var3, (short) 9436);
                classGm var5;
                if (var6 == null) {
                    if (var4 != -1659684103) {
                        throw new IllegalStateException();
                    }

                    var5 = null;
                } else {
                    classGm var7 = new classGm(var6, IgnoredPlayer.fieldB, ExchangeOfferPriceComparator.fieldL, ExchangeOfferQuantityComparator.fieldM, UtilClass1.fieldW, UtilClass1.fieldE, classEp.fieldN);
                    classAo.method399(-1904203355);
                    var5 = var7;
                }

                return var5;
            }
        } catch (RuntimeException var8) {
            throw ClanMate.error(var8, "at.b(" + ')');
        }
    }

    public static void method369(int var0) {
        try {
            if (null != UtilClass20.fieldA) {
                if (var0 <= -1740508114) {
                    return;
                }

                UtilClass20.fieldA.stop(-603178201);
            }

        } catch (RuntimeException var1) {
            throw ClanMate.error(var1, "at.b(" + ')');
        }
    }

    public final Model l(int var1, int var2) {
        try {
            Model var3 = (Model) fieldB.get((long) (this.id * -1375400661));
            if (null == var3) {
                if (var2 == -1579634833) {
                    throw new IllegalStateException();
                }

                classCy var4 = classCy.method285(fieldV, this.fieldM * -2030124381, 0);
                if (null == var4) {
                    return null;
                }

                int var5;
                if (this.fieldE != null) {
                    for (var5 = 0; var5 < this.fieldE.length; ++var5) {
                        if (var2 == -1579634833) {
                            throw new IllegalStateException();
                        }

                        var4.o(this.fieldE[var5], this.fieldN[var5]);
                    }
                }

                if (this.fieldS != null) {
                    if (var2 == -1579634833) {
                        throw new IllegalStateException();
                    }

                    for (var5 = 0; var5 < this.fieldS.length; ++var5) {
                        if (var2 == -1579634833) {
                            throw new IllegalStateException();
                        }

                        var4.q(this.fieldS[var5], this.fieldK[var5]);
                    }
                }

                var3 = var4.p(this.fieldO * -278573317 + 64, this.fieldQ * 998013233 + 850, -30, -50, -30);
                fieldB.put(var3, (long) (this.id * -1375400661));
            }

            Model var7;
            if (this.sequenceId * 1259888421 != -1 && -1 != var1) {
                if (var2 == -1579634833) {
                    throw new IllegalStateException();
                }

                var7 = AnimationSequence.get(this.sequenceId * 1259888421, 1679700557).w(var3, var1, -483101911);
            } else {
                var7 = var3.b(true);
            }

            label92:
            {
                if (128 == this.fieldF * 1289095991) {
                    if (var2 == -1579634833) {
                        throw new IllegalStateException();
                    }

                    if (this.fieldD * -1857203483 == 128) {
                        break label92;
                    }

                    if (var2 == -1579634833) {
                        throw new IllegalStateException();
                    }
                }

                var7.h(this.fieldF * 1289095991, this.fieldD * -1857203483, this.fieldF * 1289095991);
            }

            if (this.fieldX * -1089268567 != 0) {
                if (var2 == -1579634833) {
                    throw new IllegalStateException();
                }

                if (this.fieldX * -1089268567 == 90) {
                    if (var2 == -1579634833) {
                        throw new IllegalStateException();
                    }

                    var7.d();
                }

                if (this.fieldX * -1089268567 == 180) {
                    if (var2 == -1579634833) {
                        throw new IllegalStateException();
                    }

                    var7.d();
                    var7.d();
                }

                if (this.fieldX * -1089268567 == 270) {
                    var7.d();
                    var7.d();
                    var7.d();
                }
            }

            return var7;
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "at.l(" + ')');
        }
    }

    void i(Buffer var1, int var2) {
        try {
            while (true) {
                int var3 = var1.readUByte();
                if (var3 == 0) {
                    if (var2 >= 189278432) {
                        throw new IllegalStateException();
                    }

                    return;
                }

                this.b(var1, var3, 371337116);
            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "at.i(" + ')');
        }
    }

    void b(Buffer var1, int var2, int var3) {
        try {
            if (var2 == 1) {
                if (var3 != 371337116) {
                    throw new IllegalStateException();
                }

                this.fieldM = var1.readUShort() * -1975975669;
            } else if (2 == var2) {
                if (var3 != 371337116) {
                    throw new IllegalStateException();
                }

                this.sequenceId = var1.readUShort() * 1527030957;
            } else if (var2 == 4) {
                if (var3 != 371337116) {
                    return;
                }

                this.fieldF = var1.readUShort() * -1792566649;
            } else if (var2 == 5) {
                if (var3 != 371337116) {
                    throw new IllegalStateException();
                }

                this.fieldD = var1.readUShort() * -233628947;
            } else if (var2 == 6) {
                if (var3 != 371337116) {
                    throw new IllegalStateException();
                }

                this.fieldX = var1.readUShort() * -1421553767;
            } else if (7 == var2) {
                if (var3 != 371337116) {
                    return;
                }

                this.fieldO = var1.readUByte() * -1528787917;
            } else if (var2 == 8) {
                this.fieldQ = var1.readUByte() * -1024573487;
            } else {
                int var4;
                int var5;
                if (var2 == 40) {
                    if (var3 != 371337116) {
                        return;
                    }

                    var4 = var1.readUByte();
                    this.fieldE = new short[var4];
                    this.fieldN = new short[var4];

                    for (var5 = 0; var5 < var4; ++var5) {
                        if (var3 != 371337116) {
                            throw new IllegalStateException();
                        }

                        this.fieldE[var5] = (short) var1.readUShort();
                        this.fieldN[var5] = (short) var1.readUShort();
                    }
                } else if (41 == var2) {
                    if (var3 != 371337116) {
                        throw new IllegalStateException();
                    }

                    var4 = var1.readUByte();
                    this.fieldS = new short[var4];
                    this.fieldK = new short[var4];

                    for (var5 = 0; var5 < var4; ++var5) {
                        if (var3 != 371337116) {
                            throw new IllegalStateException();
                        }

                        this.fieldS[var5] = (short) var1.readUShort();
                        this.fieldK[var5] = (short) var1.readUShort();
                    }
                }
            }

        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "at.b(" + ')');
        }
    }
}
