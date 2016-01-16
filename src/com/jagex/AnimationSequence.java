package com.jagex;

import java.awt.datatransfer.Clipboard;

public class AnimationSequence extends DualNode {

    public static ReferenceTable fieldI;
    public static ReferenceTable fieldA;
    public static ReferenceTable fieldV;
    public static Cache cache = new Cache(64);
    public static Cache fieldL = new Cache(100);
    static int appletWidth;
    static Clipboard fieldOo;
    public int precedence = -1773547575;
    public int fieldU = 1955237242;
    public int[] fieldM;
    public int[] fieldE;
    public int fieldS = 328995751;
    public boolean fieldF = false;
    public int fieldD = 1000538383;
    public int precedenceWalking = 990988445;
    public int replacementShield = -411614009;
    public int maxLoops = 385051585;
    public int replacementWeapon = 1707519085;
    public int[] fieldN;
    int[] fieldW;
    int[] alternateLeave;

    static final int method410(int var0, int var1, int var2) {
        try {
            if (-1 == var0) {
                return 12345678;
            } else {
                var1 = var1 * (var0 & 127) / 128;
                if (var1 < 2) {
                    var1 = 2;
                } else if (var1 > 126) {
                    var1 = 126;
                }
                return var1 + (var0 & '\uff80');
            }
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "aa.x(" + ')');
        }
    }

    static final void method411(int var0) {
        try {
            UtilClass0.method388(1180142852);
            classAi.fieldV.clear();
            classAw.fieldB.clear();
            UtilClass6.method65(1991978986);
            ObjectDefinition.method357(148101490);
            ItemDefinition.fieldE.clear();
            ItemDefinition.fieldN.clear();
            ItemDefinition.spriteCache.clear();
            cache.clear();
            fieldL.clear();
            Animation.cache.clear();
            Animation.fieldB.clear();
            Varpbit.clearCache();
            UtilClass41.method160(667883713);
            PlayerConfig.fieldF.clear();
            classCe.method347(-1580788875);
            ((TextureManagerImpl) RSGraphics2D.fieldAs).o((byte) -38);
            RuneScript.cache.clear();
            Client.fieldAc.q((byte) 4);
            classBo.fieldAp.q((byte) 4);
            Client.fieldBu.q((byte) 4);
            UtilClass39.fieldBo.q((byte) 4);
            UnknownEnum3.fieldBi.q((byte) 4);
            classT.fieldBs.q((byte) 4);
            Preferences.fieldBl.q((byte) 4);
            UtilClass5.fieldBp.q((byte) 4);
            ClientData.textures.q((byte) 4);
            JagSocket.wordpack.q((byte) 4);
            Client.fieldBz.q((byte) 4);
            Client.runescripts.q((byte) 4);
        } catch (RuntimeException var1) {
            throw ClanMate.error(var1, "aa.u(" + ')');
        }
    }

    public static AnimationSequence get(int var0, int var1) {
        try {
            AnimationSequence var2 = (AnimationSequence) cache.get((long) var0);
            if (null != var2) {
                return var2;
            } else {
                byte[] var3 = fieldA.getFile(12, var0, (short) 25511);
                var2 = new AnimationSequence();
                if (var3 != null) {
                    var2.read(new Buffer(var3), -171595316);
                }
                var2.b(-112548757);
                cache.put(var2, (long) var0);
                return var2;
            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "w.a(" + ')');
        }
    }

    void read(Buffer var1, int var2) {
        try {
            while (true) {
                int var3 = var1.readUByte();
                if (var3 == 0) {
                    return;
                }

                this.readBody(var1, var3, -886820934);
            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "aa.v(" + ')');
        }
    }

    void b(int var1) {
        try {
            if (this.precedence * -2061466233 == -1) {
                if (var1 <= -807470519) {
                    throw new IllegalStateException();
                }

                if (this.alternateLeave != null) {
                    if (var1 <= -807470519) {
                        throw new IllegalStateException();
                    }

                    this.precedence = -747872146;
                } else {
                    this.precedence = 0;
                }
            }

            if (this.replacementWeapon * 2102903451 == -1) {
                if (var1 <= -807470519) {
                    return;
                }

                if (this.alternateLeave != null) {
                    this.replacementWeapon = 879929126;
                } else {
                    this.replacementWeapon = 0;
                }
            }

        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "aa.b(" + ')');
        }
    }

    Model m(Model var1, int var2, int var3, int var4) {
        try {
            var2 = this.fieldM[var2];
            classCx var5 = Animation.method367(var2 >> 16, 56194046);
            var2 &= '\uffff';
            if (var5 == null) {
                return var1.i(true);
            } else {
                boolean var10001;
                if (!var5.a(var2, -1313669)) {
                    if (var4 != -1301976576) {
                        throw new IllegalStateException();
                    }

                    var10001 = true;
                } else {
                    var10001 = false;
                }

                Model var6 = var1.i(var10001);
                var3 &= 3;
                if (var3 == 1) {
                    var6.o();
                } else if (var3 == 2) {
                    if (var4 != -1301976576) {
                        throw new IllegalStateException();
                    }

                    var6.x();
                } else if (3 == var3) {
                    if (var4 != -1301976576) {
                        throw new IllegalStateException();
                    }

                    var6.d();
                }

                var6.s(var5, var2);
                if (var3 == 1) {
                    if (var4 != -1301976576) {
                        throw new IllegalStateException();
                    }

                    var6.d();
                } else if (2 == var3) {
                    if (var4 != -1301976576) {
                        throw new IllegalStateException();
                    }

                    var6.x();
                } else if (var3 == 3) {
                    if (var4 != -1301976576) {
                        throw new IllegalStateException();
                    }

                    var6.o();
                }

                return var6;
            }
        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "aa.m(" + ')');
        }
    }

    Model w(Model var1, int var2, int var3) {
        try {
            var2 = this.fieldM[var2];
            classCx var4 = Animation.method367(var2 >> 16, -1632337715);
            var2 &= '\uffff';
            if (var4 == null) {
                return var1.b(true);
            } else {
                boolean var10001;
                if (!var4.a(var2, 1389368145)) {
                    if (var3 != -483101911) {
                        throw new IllegalStateException();
                    }

                    var10001 = true;
                } else {
                    var10001 = false;
                }

                Model var5 = var1.b(var10001);
                var5.s(var4, var2);
                return var5;
            }
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "aa.w(" + ')');
        }
    }

    public Model n(Model var1, int var2, int var3) {
        try {
            int var4 = this.fieldM[var2];
            classCx var5 = Animation.method367(var4 >> 16, 1026135913);
            var4 &= '\uffff';
            if (null == var5) {
                if (var3 != -950792229) {
                    throw new IllegalStateException();
                } else {
                    return var1.i(true);
                }
            } else {
                classCx var6 = null;
                int var7 = 0;
                if (this.fieldW != null) {
                    if (var3 != -950792229) {
                        throw new IllegalStateException();
                    }

                    if (var2 < this.fieldW.length) {
                        if (var3 != -950792229) {
                            throw new IllegalStateException();
                        }

                        var7 = this.fieldW[var2];
                        var6 = Animation.method367(var7 >> 16, -1869171189);
                        var7 &= '\uffff';
                    }
                }

                Model var8;
                if (null != var6) {
                    if (var3 != -950792229) {
                        throw new IllegalStateException();
                    }

                    if (var7 != '\uffff') {
                        boolean var10001 = !var5.a(var4, -2082879638);
                        boolean var10002;
                        if (!var6.a(var7, 1659215742)) {
                            if (var3 != -950792229) {
                                throw new IllegalStateException();
                            }

                            var10002 = true;
                        } else {
                            var10002 = false;
                        }

                        var8 = var1.i(var10001 & var10002);
                        var8.s(var5, var4);
                        var8.s(var6, var7);
                        return var8;
                    }

                    if (var3 != -950792229) {
                        throw new IllegalStateException();
                    }
                }

                var8 = var1.i(!var5.a(var4, 61443683));
                var8.s(var5, var4);
                return var8;
            }
        } catch (RuntimeException var9) {
            throw ClanMate.error(var9, "aa.n(" + ')');
        }
    }

    public Model e(Model var1, int var2, AnimationSequence var3, int var4, int var5) {
        try {
            var2 = this.fieldM[var2];
            classCx var6 = Animation.method367(var2 >> 16, -445088016);
            var2 &= '\uffff';
            if (null == var6) {
                if (var5 >= -1448991672) {
                    throw new IllegalStateException();
                } else {
                    return var3.l(var1, var4, -95211449);
                }
            } else {
                var4 = var3.fieldM[var4];
                classCx var7 = Animation.method367(var4 >> 16, -1166864325);
                var4 &= '\uffff';
                boolean var10001;
                Model var8;
                if (null == var7) {
                    if (!var6.a(var2, -2128955334)) {
                        if (var5 >= -1448991672) {
                            throw new IllegalStateException();
                        }

                        var10001 = true;
                    } else {
                        var10001 = false;
                    }

                    var8 = var1.i(var10001);
                    var8.s(var6, var2);
                    return var8;
                } else {
                    if (!var6.a(var2, 1412894512)) {
                        if (var5 >= -1448991672) {
                            throw new IllegalStateException();
                        }

                        var10001 = true;
                    } else {
                        var10001 = false;
                    }

                    boolean var10002;
                    if (!var7.a(var4, 703514133)) {
                        if (var5 >= -1448991672) {
                            throw new IllegalStateException();
                        }

                        var10002 = true;
                    } else {
                        var10002 = false;
                    }

                    var8 = var1.i(var10001 & var10002);
                    var8.k(var6, var2, var7, var4, this.alternateLeave);
                    return var8;
                }
            }
        } catch (RuntimeException var9) {
            throw ClanMate.error(var9, "aa.e(" + ')');
        }
    }

    void readBody(Buffer buffer, int attribute, int dummy) {
        try {
            int var4;
            int var5;
            if (attribute == 1) {
                var4 = buffer.readUShort();
                this.fieldE = new int[var4];
                for (var5 = 0; var5 < var4; ++var5) {
                    this.fieldE[var5] = buffer.readUShort();
                }
                this.fieldM = new int[var4];
                for (var5 = 0; var5 < var4; ++var5) {
                    this.fieldM[var5] = buffer.readUShort();
                }
                for (var5 = 0; var5 < var4; ++var5) {
                    this.fieldM[var5] += buffer.readUShort() << 16;
                }
            } else if (2 == attribute) {
                this.fieldS = buffer.readUShort() * -328995751;
            } else if (3 == attribute) {
                var4 = buffer.readUByte();
                this.alternateLeave = new int[1 + var4];
                for (var5 = 0; var5 < var4; ++var5) {
                    this.alternateLeave[var5] = buffer.readUByte();
                }
                this.alternateLeave[var4] = 9999999;
            } else if (attribute == 4) {
                this.fieldF = true;
            } else if (attribute == 5) {
                this.fieldD = buffer.readUByte() * 1918094595;
            } else if (6 == attribute) {
                this.precedenceWalking = buffer.readUShort() * -990988445;
            } else if (attribute == 7) {
                this.replacementShield = buffer.readUShort() * 411614009;
            } else if (attribute == 8) {
                this.maxLoops = buffer.readUByte() * 1131860619;
            } else if (attribute == 9) {
                this.precedence = buffer.readUByte() * 1773547575;
            } else if (10 == attribute) {
                this.replacementWeapon = buffer.readUByte() * -1707519085;
            } else if (11 == attribute) {
                this.fieldU = buffer.readUByte() * 977618621;
            } else if (attribute == 12) {
                var4 = buffer.readUByte();
                this.fieldW = new int[var4];
                for (var5 = 0; var5 < var4; ++var5) {
                    this.fieldW[var5] = buffer.readUShort();
                }
                for (var5 = 0; var5 < var4; ++var5) {
                    this.fieldW[var5] += buffer.readUShort() << 16;
                }
            } else if (attribute == 13) {
                var4 = buffer.readUByte();
                this.fieldN = new int[var4];
                for (var5 = 0; var5 < var4; ++var5) {
                    this.fieldN[var5] = buffer.g(-1433618415);
                }
            }

        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "aa.i(" + ')');
        }
    }

    public Model l(Model var1, int var2, int var3) {
        try {
            var2 = this.fieldM[var2];
            classCx var4 = Animation.method367(var2 >> 16, -1806584422);
            var2 &= '\uffff';
            if (var4 == null) {
                if (var3 <= -297417081) {
                    throw new IllegalStateException();
                } else {
                    return var1.i(true);
                }
            } else {
                boolean var10001;
                if (!var4.a(var2, 595796975)) {
                    if (var3 <= -297417081) {
                        throw new IllegalStateException();
                    }

                    var10001 = true;
                } else {
                    var10001 = false;
                }

                Model var5 = var1.i(var10001);
                var5.s(var4, var2);
                return var5;
            }
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "aa.l(" + ')');
        }
    }
}
