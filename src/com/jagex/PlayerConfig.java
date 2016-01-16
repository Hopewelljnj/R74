package com.jagex;

public class PlayerConfig {

    static final int[] fieldK = new int[]{8, 11, 4, 6, 9, 7, 10};
    public static Cache fieldF = new Cache(260);
    public boolean male;
    long fieldM;
    int fieldB;
    long fieldL;
    int[] fieldV;
    int[] fieldA;

    public static ObjectDefinition getObjectDef(int id, int var1) {
        try {
            ObjectDefinition def = (ObjectDefinition) ObjectDefinition.objectDefinitionCache.get((long) id);
            if (def != null)
                return def;
            byte[] buff = ObjectDefinition.objectDefinitionReferenceTable.getFile(6, id, (short) 20830);
            def = new ObjectDefinition();
            def.id = 660706699 * id;
            if (buff != null)
                def.b(new Buffer(buff), -1835840598);
            def.i(1541758999);
            if (def.fieldAw) {
                def.fieldU = 0;
                def.fieldJ = false;
            }
            ObjectDefinition.objectDefinitionCache.put(def, (long) id);
            return def;
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "ff.v(" + ')');
        }
    }

    static final void method16(int var0) {
        try {
            for (int var1 = 0; var1 < Client.fieldHt * -839605007; ++var1) {
                int var2 = Client.fieldHm[var1];
                Player var3 = Client.players[var2];
                int var4 = Client.packet.readUByte();
                if (0 != (var4 & 32)) {
                    if (var0 != -1347370030) {
                        throw new IllegalStateException();
                    }

                    var4 += Client.packet.readUByte() << 8;
                }

                DynamicObject.updatePlayer(var2, var3, var4, -1571534834);
            }

        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "ff.bp(" + ')');
        }
    }

    public static Class GetClass(String name, int dummy) throws ClassNotFoundException {
        try {
            if (name.equals("B")) {
                return Byte.TYPE;
            } else if (name.equals("I")) {
                return Integer.TYPE;
            } else if (name.equals("S")) {
                return Short.TYPE;
            } else if (name.equals("J")) {
                return Long.TYPE;
            } else if (name.equals("Z")) {
                return Boolean.TYPE;
            } else if (name.equals("F")) {
                return Float.TYPE;
            } else if (name.equals("D")) {
                return Double.TYPE;
            } else if (name.equals("C")) {
                return java.lang.Character.TYPE;
            } else if (name.equals("void")) {
                return Void.TYPE;
            } else {
                return Class.forName(name);
            }
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "ff.v(" + ')');
        }
    }

    public void b(boolean var1, byte var2) {
        try {
            if (var1 == this.male) {
                if (var2 != 26) {
                    ;
                }
            } else {
                this.a((int[]) null, this.fieldV, var1, -1, (byte) 6);
            }
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "ff.b(" + ')');
        }
    }

    public void l(Buffer var1, int var2) {
        try {
            byte var10001;
            if (this.male) {
                if (var2 == -1255718426) {
                    throw new IllegalStateException();
                }

                var10001 = 1;
            } else {
                var10001 = 0;
            }

            var1.writeByte(var10001);

            int var3;
            for (var3 = 0; var3 < 7; ++var3) {
                if (var2 == -1255718426) {
                    return;
                }

                int var4 = this.fieldA[fieldK[var3]];
                if (var4 == 0) {
                    if (var2 == -1255718426) {
                        throw new IllegalStateException();
                    }

                    var1.writeByte(-1);
                } else {
                    var1.writeByte(var4 - 256);
                }
            }

            for (var3 = 0; var3 < 5; ++var3) {
                if (var2 == -1255718426) {
                    throw new IllegalStateException();
                }

                var1.writeByte(this.fieldV[var3]);
            }

        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "ff.l(" + ')');
        }
    }

    public Model w(AnimationSequence var1, int var2, AnimationSequence var3, int var4, byte var5) {
        try {
            if (this.fieldB * 1495851301 != -1) {
                return classBo.getNpcDefinition(this.fieldB * 1495851301, 838359687).m(var1, var2, var3, var4, 2081079311);
            } else {
                long var6 = -4949597171391222175L * this.fieldL;
                int[] var8 = this.fieldA;
                if (null != var1) {
                    label236:
                    {
                        if (var1.precedenceWalking * 38830667 < 0) {
                            if (var1.replacementShield * 1614660361 < 0) {
                                break label236;
                            }

                            if (var5 >= 1) {
                                throw new IllegalStateException();
                            }
                        }

                        var8 = new int[12];

                        for (int var9 = 0; var9 < 12; ++var9) {
                            if (var5 >= 1) {
                                throw new IllegalStateException();
                            }

                            var8[var9] = this.fieldA[var9];
                        }

                        if (var1.precedenceWalking * 38830667 >= 0) {
                            var6 += (long) (var1.precedenceWalking * 38830667 - this.fieldA[5] << 40);
                            var8[5] = var1.precedenceWalking * 38830667;
                        }

                        if (var1.replacementShield * 1614660361 >= 0) {
                            var6 += (long) (var1.replacementShield * 1614660361 - this.fieldA[3] << 48);
                            var8[3] = var1.replacementShield * 1614660361;
                        }
                    }
                }

                Model var17 = (Model) fieldF.get(var6);
                if (var17 == null) {
                    boolean var10 = false;

                    int var12;
                    for (int var11 = 0; var11 < 12; ++var11) {
                        if (var5 >= 1) {
                            throw new IllegalStateException();
                        }

                        var12 = var8[var11];
                        if (var12 >= 256) {
                            if (var5 >= 1) {
                                throw new IllegalStateException();
                            }

                            if (var12 < 512) {
                                if (var5 >= 1) {
                                    throw new IllegalStateException();
                                }

                                if (!EntityMarker.method332(var12 - 256, (byte) 0).l(-568529611)) {
                                    var10 = true;
                                }
                            }
                        }

                        if (var12 >= 512 && !Client.getItemDefinition(var12 - 512, -1902721845).f(this.male, (byte) 106)) {
                            if (var5 >= 1) {
                                throw new IllegalStateException();
                            }

                            var10 = true;
                        }
                    }

                    if (var10) {
                        if (var5 >= 1) {
                            throw new IllegalStateException();
                        }

                        if (this.fieldM * 2123679480589368263L != -1L) {
                            if (var5 >= 1) {
                                throw new IllegalStateException();
                            }

                            var17 = (Model) fieldF.get(2123679480589368263L * this.fieldM);
                        }

                        if (var17 == null) {
                            return null;
                        }
                    }

                    if (null == var17) {
                        if (var5 >= 1) {
                            throw new IllegalStateException();
                        }

                        classCy[] var19 = new classCy[12];
                        var12 = 0;

                        int var14;
                        for (int var13 = 0; var13 < 12; ++var13) {
                            if (var5 >= 1) {
                                throw new IllegalStateException();
                            }

                            var14 = var8[var13];
                            classCy var15;
                            if (var14 >= 256) {
                                if (var5 >= 1) {
                                    throw new IllegalStateException();
                                }

                                if (var14 < 512) {
                                    var15 = EntityMarker.method332(var14 - 256, (byte) 0).m((byte) 80);
                                    if (null != var15) {
                                        if (var5 >= 1) {
                                            throw new IllegalStateException();
                                        }

                                        var19[var12++] = var15;
                                    }
                                }
                            }

                            if (var14 >= 512) {
                                if (var5 >= 1) {
                                    throw new IllegalStateException();
                                }

                                var15 = Client.getItemDefinition(var14 - 512, -1140922214).d(this.male, (byte) -38);
                                if (var15 != null) {
                                    if (var5 >= 1) {
                                        throw new IllegalStateException();
                                    }

                                    var19[var12++] = var15;
                                }
                            }
                        }

                        classCy var20 = new classCy(var19, var12);

                        for (var14 = 0; var14 < 5; ++var14) {
                            if (var5 >= 1) {
                                throw new IllegalStateException();
                            }

                            if (this.fieldV[var14] < UtilClass24.fieldE[var14].length) {
                                if (var5 >= 1) {
                                    throw new IllegalStateException();
                                }

                                var20.o(Varp.fieldW[var14], UtilClass24.fieldE[var14][this.fieldV[var14]]);
                            }

                            if (this.fieldV[var14] < MessageContainer.fieldS[var14].length) {
                                if (var5 >= 1) {
                                    throw new IllegalStateException();
                                }

                                var20.o(CacheInt.fieldN[var14], MessageContainer.fieldS[var14][this.fieldV[var14]]);
                            }
                        }

                        var17 = var20.p(64, 850, -30, -50, -30);
                        fieldF.put(var17, var6);
                        this.fieldM = -5759031294722796041L * var6;
                    }
                }

                if (var1 == null && null == var3) {
                    if (var5 >= 1) {
                        throw new IllegalStateException();
                    } else {
                        return var17;
                    }
                } else {
                    Model var18;
                    if (null != var1 && null != var3) {
                        if (var5 >= 1) {
                            throw new IllegalStateException();
                        }

                        var18 = var1.e(var17, var2, var3, var4, -1690411752);
                    } else if (null != var1) {
                        if (var5 >= 1) {
                            throw new IllegalStateException();
                        }

                        var18 = var1.l(var17, var2, 1578513844);
                    } else {
                        var18 = var3.l(var17, var4, 375549999);
                    }

                    return var18;
                }
            }
        } catch (RuntimeException var16) {
            throw ClanMate.error(var16, "ff.w(" + ')');
        }
    }

    classCy e(int var1) {
        try {
            if (this.fieldB * 1495851301 != -1) {
                    return classBo.getNpcDefinition(this.fieldB * 1495851301, 1176152535).w(1916874564);
            }
            boolean var2 = false;

            int var4;
            for (int var3 = 0; var3 < 12; ++var3) {
                var4 = this.fieldA[var3];
                if (var4 >= 256 && var4 < 512) {
                    if (!EntityMarker.method332(var4 - 256, (byte) 0).w((byte) -7)) {
                        var2 = true;
                    }
                }

                if (var4 >= 512) {
                    if (!Client.getItemDefinition(var4 - 512, 83934863).x(this.male, -642787323)) {
                        var2 = true;
                    }
                }
            }

            if (var2) {
                if (var1 <= -867672885) {
                    throw new IllegalStateException();
                } else {
                    return null;
                }
            } else {
                classCy[] var9 = new classCy[12];
                var4 = 0;

                int var6;
                for (int var5 = 0; var5 < 12; ++var5) {
                    if (var1 <= -867672885) {
                        throw new IllegalStateException();
                    }

                    var6 = this.fieldA[var5];
                    classCy var7;
                    if (var6 >= 256) {
                        if (var1 <= -867672885) {
                            throw new IllegalStateException();
                        }

                        if (var6 < 512) {
                            if (var1 <= -867672885) {
                                throw new IllegalStateException();
                            }

                            var7 = EntityMarker.method332(var6 - 256, (byte) 0).e((byte) 51);
                            if (var7 != null) {
                                if (var1 <= -867672885) {
                                    throw new IllegalStateException();
                                }

                                var9[var4++] = var7;
                            }
                        }
                    }

                    if (var6 >= 512) {
                        if (var1 <= -867672885) {
                            throw new IllegalStateException();
                        }

                        var7 = Client.getItemDefinition(var6 - 512, -42024554).o(this.male, 1770149585);
                        if (var7 != null) {
                            var9[var4++] = var7;
                        }
                    }
                }

                classCy var10 = new classCy(var9, var4);

                for (var6 = 0; var6 < 5; ++var6) {
                    if (var1 <= -867672885) {
                        throw new IllegalStateException();
                    }

                    if (this.fieldV[var6] < UtilClass24.fieldE[var6].length) {
                        if (var1 <= -867672885) {
                            throw new IllegalStateException();
                        }

                        var10.o(Varp.fieldW[var6], UtilClass24.fieldE[var6][this.fieldV[var6]]);
                    }

                    if (this.fieldV[var6] < MessageContainer.fieldS[var6].length) {
                        if (var1 <= -867672885) {
                            throw new IllegalStateException();
                        }

                        var10.o(CacheInt.fieldN[var6], MessageContainer.fieldS[var6][this.fieldV[var6]]);
                    }
                }

                return var10;
            }
        } catch (RuntimeException var8) {
            throw ClanMate.error(var8, "ff.e(" + ')');
        }
    }

    public int n(int var1) {
        try {
            if (this.fieldB * 1495851301 == -1) {
                if (var1 == 534051064) {
                    throw new IllegalStateException();
                } else {
                    return this.fieldA[1] + (this.fieldA[11] << 5) + (this.fieldV[0] << 25) + (this.fieldV[4] << 20) + (this.fieldA[0] << 15) + (this.fieldA[8] << 10);
                }
            } else {
                return 305419896 + classBo.getNpcDefinition(this.fieldB * 1495851301, 352515993).id * 753371259;
            }
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "ff.n(" + ')');
        }
    }

    public void v(int var1, boolean var2, int var3) {
        try {
            if (1 == var1) {
                if (var3 >= -1886809242) {
                    throw new IllegalStateException();
                }

                if (this.male) {
                    if (var3 >= -1886809242) {
                        throw new IllegalStateException();
                    }

                    return;
                }
            }

            int var4 = this.fieldA[fieldK[var1]];
            if (0 == var4) {
                if (var3 < -1886809242) {
                    ;
                }
            } else {
                var4 -= 256;

                while (true) {
                    if (!var2) {
                        if (var3 >= -1886809242) {
                            throw new IllegalStateException();
                        }

                        --var4;
                        if (var4 < 0) {
                            if (var3 >= -1886809242) {
                                throw new IllegalStateException();
                            }

                            var4 = classAw.fieldI * 926443453 - 1;
                        }
                    } else {
                        ++var4;
                        if (var4 >= classAw.fieldI * 926443453) {
                            if (var3 >= -1886809242) {
                                throw new IllegalStateException();
                            }

                            var4 = 0;
                        }
                    }

                    classAw var5 = EntityMarker.method332(var4, (byte) 0);
                    if (null != var5) {
                        if (var3 >= -1886809242) {
                            throw new IllegalStateException();
                        }

                        if (!var5.fieldF) {
                            byte var10000;
                            if (this.male) {
                                if (var3 >= -1886809242) {
                                    return;
                                }

                                var10000 = 7;
                            } else {
                                var10000 = 0;
                            }

                            if (var10000 + var1 == var5.fieldL * -1845015383) {
                                if (var3 >= -1886809242) {
                                    throw new IllegalStateException();
                                }

                                this.fieldA[fieldK[var1]] = 256 + var4;
                                this.m((byte) -103);
                                return;
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "ff.v(" + ')');
        }
    }

    void m(byte var1) {
        try {
            long var2 = -4949597171391222175L * this.fieldL;
            int var4 = this.fieldA[5];
            int var5 = this.fieldA[9];
            this.fieldA[5] = var5;
            this.fieldA[9] = var4;
            this.fieldL = 0L;

            int var6;
            for (var6 = 0; var6 < 12; ++var6) {
                this.fieldL = (this.fieldL * -4949597171391222175L << 4) * -7066285823122049631L;
                if (this.fieldA[var6] >= 256) {
                    if (var1 >= 2) {
                        throw new IllegalStateException();
                    }

                    this.fieldL += (long) (this.fieldA[var6] - 256) * -7066285823122049631L;
                }
            }

            if (this.fieldA[0] >= 256) {
                if (var1 >= 2) {
                    throw new IllegalStateException();
                }

                this.fieldL += -7066285823122049631L * (long) (this.fieldA[0] - 256 >> 4);
            }

            if (this.fieldA[1] >= 256) {
                if (var1 >= 2) {
                    throw new IllegalStateException();
                }

                this.fieldL += (long) (this.fieldA[1] - 256 >> 8) * -7066285823122049631L;
            }

            for (var6 = 0; var6 < 5; ++var6) {
                if (var1 >= 2) {
                    throw new IllegalStateException();
                }

                this.fieldL = -7066285823122049631L * (-4949597171391222175L * this.fieldL << 3);
                this.fieldL += -7066285823122049631L * (long) this.fieldV[var6];
            }

            this.fieldL = -7066285823122049631L * (-4949597171391222175L * this.fieldL << 1);
            byte var10003;
            if (this.male) {
                if (var1 >= 2) {
                    throw new IllegalStateException();
                }

                var10003 = 1;
            } else {
                var10003 = 0;
            }

            this.fieldL += -7066285823122049631L * (long) var10003;
            this.fieldA[5] = var4;
            this.fieldA[9] = var5;
            if (0L != var2) {
                if (var1 >= 2) {
                    throw new IllegalStateException();
                }

                if (var2 != this.fieldL * -4949597171391222175L) {
                    fieldF.remove(var2);
                }
            }

        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "ff.m(" + ')');
        }
    }

    public void i(int var1, boolean var2, int var3) {
        try {
            int var4 = this.fieldV[var1];
            if (!var2) {
                do {
                    --var4;
                    if (var4 < 0) {
                        if (var3 == 578383525) {
                            return;
                        }

                        var4 = UtilClass24.fieldE[var1].length - 1;
                    }
                } while (!classBf.method266(var1, var4, -2073258704));

                if (var3 == 578383525) {
                    throw new IllegalStateException();
                }
            } else {
                do {
                    ++var4;
                    if (var4 >= UtilClass24.fieldE[var1].length) {
                        if (var3 == 578383525) {
                            throw new IllegalStateException();
                        }

                        var4 = 0;
                    }
                } while (!classBf.method266(var1, var4, -2091157742));

                if (var3 == 578383525) {
                    throw new IllegalStateException();
                }
            }

            this.fieldV[var1] = var4;
            this.m((byte) -126);
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "ff.i(" + ')');
        }
    }

    public void a(int[] var1, int[] var2, boolean var3, int var4, byte var5) {
        try {
            if (null == var1) {
                var1 = new int[12];
                for (int var6 = 0; var6 < 7; ++var6) {
                    for (int var7 = 0; var7 < classAw.fieldI * 926443453; ++var7) {
                        classAw var8 = EntityMarker.method332(var7, (byte) 0);
                        if (null != var8 && !var8.fieldF) {
                            int var10000 = var8.fieldL * -1845015383;
                            if (var10000 == (var3 ? 7 : 0) + var6) {
                                var1[fieldK[var6]] = var7 + 256;
                                break;
                            }
                        }
                    }
                }
            }
            this.fieldA = var1;
            this.fieldV = var2;
            this.male = var3;
            this.fieldB = 731533997 * var4;
            this.m((byte) -57);
        } catch (RuntimeException var9) {
            throw ClanMate.error(var9, "ff.a(" + ')');
        }
    }
}
