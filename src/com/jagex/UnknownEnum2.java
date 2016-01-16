package com.jagex;

public enum UnknownEnum2 implements Identifiable {

    UNKNOWN0(0, -1, true, false, true),
    UNKNOWN1(1, 0, true, true, true),
    UNKNOWN2(2, 1, true, true, false),
    UNKNOWN3(3, 2, false, false, true),
    UNKNOWN4(4, 3, false, false, true);

    public final int fieldW;
    public final boolean fieldE;
    public final boolean fieldN;
    final int id;


    UnknownEnum2(int var1, int var2, boolean var3, boolean var4, boolean var5) {
        this.id = -1593722213 * var1;
        this.fieldW = var2 * 889622559;
        this.fieldE = var4;
        this.fieldN = var5;
    }

    public static void method102(ReferenceTable var0, byte var1) {
        try {
            CacheInt.fieldA = var0;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "ey.a(" + ')');
        }
    }

    static final void method103(Widget[] var0, int var1, byte var2) {
        try {
            for (int var3 = 0; var3 < var0.length; ++var3) {
                if (var2 <= 0) {
                    throw new IllegalStateException();
                }

                Widget var4 = var0[var3];
                if (var4 == null) {
                    if (var2 <= 0) {
                        throw new IllegalStateException();
                    }
                } else if (var4.fieldP * 1574594539 != var1) {
                    if (var2 <= 0) {
                        return;
                    }
                } else {
                    if (var4.fieldK) {
                        if (var2 <= 0) {
                            throw new IllegalStateException();
                        }

                        if (Player.method144(var4, (byte) 76)) {
                            continue;
                        }
                    }

                    int var6;
                    if (0 == var4.type * -729517859) {
                        if (var2 <= 0) {
                            throw new IllegalStateException();
                        }

                        if (!var4.fieldK) {
                            if (var2 <= 0) {
                                return;
                            }

                            if (Player.method144(var4, (byte) 122)) {
                                if (var2 <= 0) {
                                    throw new IllegalStateException();
                                }

                                if (Client.fieldIi != var4) {
                                    if (var2 <= 0) {
                                        throw new IllegalStateException();
                                    }
                                    continue;
                                }
                            }
                        }

                        method103(var0, var4.id * -1866039137, (byte) 32);
                        if (null != var4.children) {
                            method103(var4.children, var4.id * -1866039137, (byte) 110);
                        }

                        WidgetNode var5 = (WidgetNode) Client.widgetNodes.get((long) (var4.id * -1866039137));
                        if (null != var5) {
                            var6 = var5.owner * -1220935357;
                            if (!Widget.loadWidget(var6, 477596194)) {
                                if (var2 <= 0) {
                                    throw new IllegalStateException();
                                }
                            } else {
                                method103(Widget.widgets[var6], -1, (byte) 105);
                            }
                        }
                    }

                    if (6 == var4.type * -729517859) {
                        if (var2 <= 0) {
                            throw new IllegalStateException();
                        }

                        label178:
                        {
                            if (var4.fieldAf * -9713859 == -1) {
                                if (var2 <= 0) {
                                    return;
                                }

                                if (var4.fieldAb * -1921108817 == -1) {
                                    break label178;
                                }

                                if (var2 <= 0) {
                                    throw new IllegalStateException();
                                }
                            }

                            boolean var9 = Player.method148(var4, -1175688749);
                            if (var9) {
                                var6 = var4.fieldAb * -1921108817;
                            } else {
                                var6 = var4.fieldAf * -9713859;
                            }

                            if (-1 != var6) {
                                if (var2 <= 0) {
                                    throw new IllegalStateException();
                                }

                                AnimationSequence var7 = AnimationSequence.get(var6, 1738405709);

                                for (var4.fieldDc += Client.fieldEo * 467084465; var4.fieldDc * 635644113 > var7.fieldE[var4.fieldDs * -1365995491]; classBx.method250(var4, 57574739)) {
                                    if (var2 <= 0) {
                                        throw new IllegalStateException();
                                    }

                                    var4.fieldDc -= var7.fieldE[var4.fieldDs * -1365995491] * 1098788913;
                                    var4.fieldDs += -1861045707;
                                    if (var4.fieldDs * -1365995491 >= var7.fieldM.length) {
                                        if (var2 <= 0) {
                                            throw new IllegalStateException();
                                        }

                                        var4.fieldDs -= var7.fieldS * 571361597;
                                        if (var4.fieldDs * -1365995491 >= 0) {
                                            if (var2 <= 0) {
                                                throw new IllegalStateException();
                                            }

                                            if (var4.fieldDs * -1365995491 < var7.fieldM.length) {
                                                continue;
                                            }

                                            if (var2 <= 0) {
                                                throw new IllegalStateException();
                                            }
                                        }

                                        var4.fieldDs = 0;
                                    }
                                }
                            }
                        }

                        if (var4.fieldBs * -629725345 != 0 && !var4.fieldK) {
                            if (var2 <= 0) {
                                return;
                            }

                            int var10 = var4.fieldBs * -629725345 >> 16;
                            var6 = var4.fieldBs * -629725345 << 16 >> 16;
                            var10 *= Client.fieldEo * 1985191041;
                            var6 *= Client.fieldEo * 1985191041;
                            var4.fieldAy = -1514397635 * (var10 + var4.fieldAy * 1396274965 & 2047);
                            var4.fieldBu = (var6 + var4.fieldBu * 550343665 & 2047) * -1385890543;
                            classBx.method250(var4, 57574739);
                        }
                    }
                }
            }

        } catch (RuntimeException var8) {
            throw ClanMate.error(var8, "ey.ca(" + ')');
        }
    }

    static void method104(int var0, classDz var1, ReferenceTableSub var2, int var3) {
        try {
            byte[] var4 = null;
            NodeDeque var5 = classEs.fieldA;
            synchronized (classEs.fieldA) {
                for (classEv var6 = (classEv) classEs.fieldA.next(); var6 != null; var6 = (classEv) classEs.fieldA.tail()) {
                    if (var3 <= -1383298552) {
                        throw new IllegalStateException();
                    }

                    if (var6.key == (long) var0) {
                        if (var3 <= -1383298552) {
                            return;
                        }

                        if (var6.fieldI == var1) {
                            if (var3 <= -1383298552) {
                                return;
                            }

                            if (var6.fieldA * 332154689 == 0) {
                                if (var3 <= -1383298552) {
                                    throw new IllegalStateException();
                                }

                                var4 = var6.fieldV;
                                break;
                            }
                        }
                    }
                }
            }

            if (var4 != null) {
                if (var3 <= -1383298552) {
                    throw new IllegalStateException();
                } else {
                    var2.ck(var1, var0, var4, true, 1166058444);
                }
            } else {
                byte[] var10 = var1.a(var0, -695022911);
                var2.ck(var1, var0, var10, true, 1166058444);
            }
        } catch (RuntimeException var9) {
            throw ClanMate.error(var9, "ey.v(" + ')');
        }
    }

    public int getId(int DUMMY) {
        try {
            return this.id * 628267923;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "ey.v(" + ')');
        }
    }
}
