package com.jagex;

import java.util.zip.CRC32;

public class ReferenceTableSub extends ReferenceTable {

    static CRC32 fieldC = new CRC32();
    int fieldY;
    boolean fieldR = false;
    volatile boolean[] fieldZ;
    volatile boolean loaded = false;
    classDz fieldG;
    classDz fieldJ;
    int fieldAn;
    int fieldAs;
    int fieldAh = -730617895;


    public ReferenceTableSub(classDz var1, classDz var2, int var3, boolean var4, boolean var5, boolean var6) {
        super(var4, var5);
        this.fieldJ = var1;
        this.fieldG = var2;
        this.fieldY = var3 * 1352129537;
        this.fieldR = var6;
        int var8 = this.fieldY * 880288769;
        if (null != classBf.fieldJ) {
            classBf.fieldJ.caret = -497519395 + var8 * -796031032;
            int var9 = classBf.fieldJ.readInt((byte) 55);
            int var10 = classBf.fieldJ.readInt((byte) 50);
            this.cn(var9, var10, 1606324506);
        } else {
            ItemTable.method199((ReferenceTableSub) null, 255, 255, 0, (byte) 0, true, 645222263);
            UtilClass20.fieldG[var8] = this;
        }

    }

    static final int method105(Widget var0, int var1, byte var2) {
        try {
            if (var0.fieldDo != null) {
                if (var2 == 0) {
                    throw new IllegalStateException();
                }

                if (var1 < var0.fieldDo.length) {
                    try {
                        int[] var3 = var0.fieldDo[var1];
                        int var4 = 0;
                        int var5 = 0;
                        byte var6 = 0;

                        while (true) {
                            int var7 = var3[var5++];
                            int var8 = 0;
                            byte var9 = 0;
                            if (0 == var7) {
                                if (var2 == 0) {
                                    throw new IllegalStateException();
                                }

                                return var4;
                            }

                            if (var7 == 1) {
                                if (var2 == 0) {
                                    throw new IllegalStateException();
                                }

                                var8 = Client.levels[var3[var5++]];
                            }

                            if (2 == var7) {
                                var8 = Client.currentLevels[var3[var5++]];
                            }

                            if (3 == var7) {
                                var8 = Client.experiences[var3[var5++]];
                            }

                            int var10;
                            Widget var11;
                            int var12;
                            int var13;
                            if (var7 == 4) {
                                if (var2 == 0) {
                                    throw new IllegalStateException();
                                }

                                var10 = var3[var5++] << 16;
                                var10 += var3[var5++];
                                var11 = Widget.lookup(var10);
                                var12 = var3[var5++];
                                if (var12 != -1) {
                                    label313:
                                    {
                                        if (var2 == 0) {
                                            throw new IllegalStateException();
                                        }

                                        if (Client.getItemDefinition(var12, -1928652075).fieldAn) {
                                            if (!Client.fieldK) {
                                                break label313;
                                            }

                                            if (var2 == 0) {
                                                throw new IllegalStateException();
                                            }
                                        }

                                        for (var13 = 0; var13 < var11.itemIds.length; ++var13) {
                                            if (var2 == 0) {
                                                throw new IllegalStateException();
                                            }

                                            if (var12 + 1 == var11.itemIds[var13]) {
                                                var8 += var11.itemQuantities[var13];
                                            }
                                        }
                                    }
                                }
                            }

                            if (var7 == 5) {
                                if (var2 == 0) {
                                    throw new IllegalStateException();
                                }

                                var8 = UtilClass27.vars[var3[var5++]];
                            }

                            if (6 == var7) {
                                var8 = SkillInfo.XPTABLE[Client.currentLevels[var3[var5++]] - 1];
                            }

                            if (7 == var7) {
                                var8 = UtilClass27.vars[var3[var5++]] * 100 / '\ub71b';
                            }

                            if (8 == var7) {
                                var8 = 1669625607 * Client.myPlayer.combatLevel;
                            }

                            if (var7 == 9) {
                                if (var2 == 0) {
                                    throw new IllegalStateException();
                                }

                                for (var10 = 0; var10 < 25; ++var10) {
                                    if (SkillInfo.ENABLED_SKILLS[var10]) {
                                        var8 += Client.currentLevels[var10];
                                    }
                                }
                            }

                            if (var7 == 10) {
                                var10 = var3[var5++] << 16;
                                var10 += var3[var5++];
                                var11 = Widget.lookup(var10);
                                var12 = var3[var5++];
                                if (-1 != var12) {
                                    label317:
                                    {
                                        if (var2 == 0) {
                                            throw new IllegalStateException();
                                        }

                                        if (Client.getItemDefinition(var12, 535201550).fieldAn) {
                                            if (var2 == 0) {
                                                throw new IllegalStateException();
                                            }

                                            if (!Client.fieldK) {
                                                break label317;
                                            }

                                            if (var2 == 0) {
                                                throw new IllegalStateException();
                                            }
                                        }

                                        for (var13 = 0; var13 < var11.itemIds.length; ++var13) {
                                            if (var2 == 0) {
                                                throw new IllegalStateException();
                                            }

                                            if (var12 + 1 == var11.itemIds[var13]) {
                                                if (var2 == 0) {
                                                    throw new IllegalStateException();
                                                }

                                                var8 = 999999999;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }

                            if (11 == var7) {
                                if (var2 == 0) {
                                    throw new IllegalStateException();
                                }

                                var8 = Client.fieldJu * -1490565209;
                            }

                            if (var7 == 12) {
                                if (var2 == 0) {
                                    throw new IllegalStateException();
                                }

                                var8 = Client.fieldJp * 885212209;
                            }

                            if (13 == var7) {
                                if (var2 == 0) {
                                    throw new IllegalStateException();
                                }

                                var10 = UtilClass27.vars[var3[var5++]];
                                int var16 = var3[var5++];
                                byte var10000;
                                if (0 != (var10 & 1 << var16)) {
                                    if (var2 == 0) {
                                        throw new IllegalStateException();
                                    }

                                    var10000 = 1;
                                } else {
                                    var10000 = 0;
                                }

                                var8 = var10000;
                            }

                            if (var7 == 14) {
                                if (var2 == 0) {
                                    throw new IllegalStateException();
                                }

                                var10 = var3[var5++];
                                var8 = Keyboard.getVarpbitValue(var10, 1350194799);
                            }

                            if (15 == var7) {
                                if (var2 == 0) {
                                    throw new IllegalStateException();
                                }

                                var9 = 1;
                            }

                            if (16 == var7) {
                                var9 = 2;
                            }

                            if (var7 == 17) {
                                if (var2 == 0) {
                                    throw new IllegalStateException();
                                }

                                var9 = 3;
                            }

                            if (18 == var7) {
                                var8 = classDc.baseX * -2071335905 + (404428603 * Client.myPlayer.strictX >> 7);
                            }

                            if (var7 == 19) {
                                if (var2 == 0) {
                                    throw new IllegalStateException();
                                }

                                var8 = CalendarUtil.baseY * -1046564359 + (-1490664571 * Client.myPlayer.strictY >> 7);
                            }

                            if (20 == var7) {
                                if (var2 == 0) {
                                    throw new IllegalStateException();
                                }

                                var8 = var3[var5++];
                            }

                            if (var9 == 0) {
                                if (var2 == 0) {
                                    throw new IllegalStateException();
                                }

                                if (var6 == 0) {
                                    if (var2 == 0) {
                                        throw new IllegalStateException();
                                    }

                                    var4 += var8;
                                }

                                if (1 == var6) {
                                    if (var2 == 0) {
                                        throw new IllegalStateException();
                                    }

                                    var4 -= var8;
                                }

                                if (2 == var6) {
                                    if (var2 == 0) {
                                        throw new IllegalStateException();
                                    }

                                    if (var8 != 0) {
                                        if (var2 == 0) {
                                            throw new IllegalStateException();
                                        }

                                        var4 /= var8;
                                    }
                                }

                                if (var6 == 3) {
                                    if (var2 == 0) {
                                        throw new IllegalStateException();
                                    }

                                    var4 *= var8;
                                }

                                var6 = 0;
                            } else {
                                var6 = var9;
                            }
                        }
                    } catch (Exception var14) {
                        return -1;
                    }
                }

                if (var2 == 0) {
                    throw new IllegalStateException();
                }
            }

            return -2;
        } catch (RuntimeException var15) {
            throw ClanMate.error(var15, "ez.cp(" + ')');
        }
    }

    static boolean method106(int var0, byte var1) {
        try {
            boolean var10000;
            if (57 != var0) {
                if (var1 != 1) {
                    throw new IllegalStateException();
                }

                if (var0 != 58) {
                    if (var1 != 1) {
                        throw new IllegalStateException();
                    }

                    if (var0 != 1007) {
                        if (var1 != 1) {
                            throw new IllegalStateException();
                        }

                        if (25 != var0) {
                            if (var1 != 1) {
                                throw new IllegalStateException();
                            }

                            if (30 != var0) {
                                var10000 = false;
                                return var10000;
                            }

                            if (var1 != 1) {
                                throw new IllegalStateException();
                            }
                        }
                    }
                }
            }

            var10000 = true;
            return var10000;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "ez.cr(" + ')');
        }
    }

    public int ch(int var1) {
        try {
            if (this.loaded) {
                if (var1 == -1063374) {
                    throw new IllegalStateException();
                } else {
                    return 100;
                }
            } else if (this.fieldK != null) {
                if (var1 == -1063374) {
                    throw new IllegalStateException();
                } else {
                    return 99;
                }
            } else {
                int var2;
                label45:
                {
                    int var3 = this.fieldY * 880288769;
                    long var4 = (long) (16711680 + var3);
                    if (null != UtilClass38.fieldX) {
                        if (var1 == -1063374) {
                            throw new IllegalStateException();
                        }

                        if (UtilClass38.fieldX.key == var4) {
                            var2 = 67284795 * UtilClass20.fieldQ.caret / (UtilClass20.fieldQ.payload.length - UtilClass38.fieldX.fieldI) + 1;
                            break label45;
                        }
                    }

                    var2 = 0;
                }

                int var7 = var2;
                if (var2 >= 100) {
                    if (var1 == -1063374) {
                        throw new IllegalStateException();
                    }

                    var7 = 99;
                }

                return var7;
            }
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "ez.ch(" + ')');
        }
    }

    public void cp(int var1, byte[] var2, boolean var3, boolean var4, int var5) {
        try {
            if (var3) {
                if (var5 >= -1462123185) {
                    throw new IllegalStateException();
                }

                if (this.loaded) {
                    if (var5 >= -1462123185) {
                        return;
                    }

                    throw new RuntimeException();
                }

                if (this.fieldG != null) {
                    int var6 = this.fieldY * 880288769;
                    classDz var7 = this.fieldG;
                    classEv var8 = new classEv();
                    var8.fieldA = 0;
                    var8.key = (long) var6;
                    var8.fieldV = var2;
                    var8.fieldI = var7;
                    NodeDeque var9 = classEs.fieldA;
                    synchronized (classEs.fieldA) {
                        classEs.fieldA.add(var8);
                    }

                    Player.method149(-1994342432);
                }

                this.a(var2, -2132803531);
                this.cg(-310251794);
            } else {
                var2[var2.length - 2] = (byte) (this.fieldM[var1] >> 8);
                var2[var2.length - 1] = (byte) this.fieldM[var1];
                if (this.fieldJ != null) {
                    if (var5 >= -1462123185) {
                        throw new IllegalStateException();
                    }

                    classDz var15 = this.fieldJ;
                    classEv var16 = new classEv();
                    var16.fieldA = 0;
                    var16.key = (long) var1;
                    var16.fieldV = var2;
                    var16.fieldI = var15;
                    NodeDeque var17 = classEs.fieldA;
                    synchronized (classEs.fieldA) {
                        classEs.fieldA.add(var16);
                    }

                    Player.method149(-1275346765);
                    this.fieldZ[var1] = true;
                }

                if (var4) {
                    if (var5 >= -1462123185) {
                        throw new IllegalStateException();
                    }

                    this.fieldK[var1] = UnknownEnum3.maskBuffer(var2, false, (byte) -51);
                }
            }

        } catch (RuntimeException var14) {
            throw ClanMate.error(var14, "ez.cp(" + ')');
        }
    }

    @Override
    void k(int var1, int var2) {
        try {
            if (this.fieldJ != null && null != this.fieldZ && this.fieldZ[var1]) {
                if (var2 != -845679860) {
                    throw new IllegalStateException();
                }

                UnknownEnum2.method104(var1, this.fieldJ, this, 2000190473);
            } else {
                ItemTable.method199(this, this.fieldY * 880288769, var1, this.fieldL[var1], (byte) 2, true, 645222263);
            }

        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "ez.k(" + ')');
        }
    }

    public void cn(int var1, int var2, int var3) {
        try {
            this.fieldAn = var1 * 1299390917;
            this.fieldAs = 1722810847 * var2;
            if (null != this.fieldG) {
                UnknownEnum2.method104(this.fieldY * 880288769, this.fieldG, this, 546626255);
            } else {
                ItemTable.method199(this, 255, this.fieldY * 880288769, this.fieldAn * -660884211, (byte) 0, true, 645222263);
            }

        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "ez.cn(" + ')');
        }
    }

    void cg(int var1) {
        try {
            this.fieldZ = new boolean[this.fieldK.length];

            int var2;
            for (var2 = 0; var2 < this.fieldZ.length; ++var2) {
                if (var1 != -310251794) {
                    throw new IllegalStateException();
                }

                this.fieldZ[var2] = false;
            }

            if (this.fieldJ == null) {
                if (var1 != -310251794) {
                    throw new IllegalStateException();
                } else {
                    this.loaded = true;
                }
            } else {
                this.fieldAh = -730617895;

                for (var2 = 0; var2 < this.fieldZ.length; ++var2) {
                    if (var1 != -310251794) {
                        return;
                    }

                    if (this.fieldW[var2] > 0) {
                        if (var1 != -310251794) {
                            throw new IllegalStateException();
                        }

                        classDz var3 = this.fieldJ;
                        classEv var5 = new classEv();
                        var5.fieldA = 1978943681;
                        var5.key = (long) var2;
                        var5.fieldI = var3;
                        var5.fieldB = this;
                        NodeDeque var6 = classEs.fieldA;
                        synchronized (classEs.fieldA) {
                            classEs.fieldA.add(var5);
                        }

                        Player.method149(-1413815045);
                        this.fieldAh = var2 * 730617895;
                    }
                }

                if (-1 == this.fieldAh * -123758697) {
                    if (var1 != -310251794) {
                        throw new IllegalStateException();
                    }

                    this.loaded = true;
                }

            }
        } catch (RuntimeException var9) {
            throw ClanMate.error(var9, "ez.cg(" + ')');
        }
    }

    int cy(int var1, int var2) {
        try {
            if (this.fieldK[var1] != null) {
                if (var2 >= 465966171) {
                    throw new IllegalStateException();
                } else {
                    return 100;
                }
            } else if (this.fieldZ[var1]) {
                if (var2 >= 465966171) {
                    throw new IllegalStateException();
                } else {
                    return 100;
                }
            } else {
                int var4 = this.fieldY * 880288769;
                long var5 = (long) (var1 + (var4 << 16));
                int var3;
                if (UtilClass38.fieldX != null) {
                    if (var5 == UtilClass38.fieldX.key) {
                        var3 = 67284795 * UtilClass20.fieldQ.caret / (UtilClass20.fieldQ.payload.length - UtilClass38.fieldX.fieldI) + 1;
                        return var3;
                    }

                    if (var2 >= 465966171) {
                        throw new IllegalStateException();
                    }
                }

                var3 = 0;
                return var3;
            }
        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "ez.cy(" + ')');
        }
    }

    public int cv(byte var1) {
        try {
            int var2 = 0;
            int var3 = 0;

            int var4;
            for (var4 = 0; var4 < this.fieldK.length; ++var4) {
                if (var1 <= 25) {
                    throw new IllegalStateException();
                }

                if (this.fieldW[var4] > 0) {
                    var2 += 100;
                    var3 += this.cy(var4, -203409837);
                }
            }

            if (0 == var2) {
                if (var1 <= 25) {
                    throw new IllegalStateException();
                } else {
                    return 100;
                }
            } else {
                var4 = var3 * 100 / var2;
                return var4;
            }
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "ez.cv(" + ')');
        }
    }

    public void ck(classDz var1, int var2, byte[] var3, boolean var4, int var5) {
        try {
            int var6;
            if (this.fieldG == var1) {
                if (var5 != 1166058444) {
                    throw new IllegalStateException();
                } else if (this.loaded) {
                    if (var5 != 1166058444) {
                        throw new IllegalStateException();
                    } else {
                        throw new RuntimeException();
                    }
                } else if (var3 == null) {
                    if (var5 != 1166058444) {
                        throw new IllegalStateException();
                    } else {
                        ItemTable.method199(this, 255, this.fieldY * 880288769, this.fieldAn * -660884211, (byte) 0, true, 645222263);
                    }
                } else {
                    fieldC.reset();
                    fieldC.update(var3, 0, var3.length);
                    var6 = (int) fieldC.getValue();
                    Buffer var7 = new Buffer(UtilClass39.decodeContainer(var3, -373975347));
                    int var8 = var7.readUByte();
                    if (5 != var8) {
                        if (var5 != 1166058444) {
                            throw new IllegalStateException();
                        }

                        if (var8 != 6) {
                            if (var5 != 1166058444) {
                                return;
                            }

                            throw new RuntimeException(var8 + "," + this.fieldY * 880288769 + "," + var2);
                        }
                    }

                    int var9 = 0;
                    if (var8 >= 6) {
                        if (var5 != 1166058444) {
                            return;
                        }

                        var9 = var7.readInt((byte) 23);
                    }

                    if (var6 == this.fieldAn * -660884211) {
                        if (this.fieldAs * 77920799 == var9) {
                            this.a(var3, 1590071988);
                            this.cg(-310251794);
                            return;
                        }

                        if (var5 != 1166058444) {
                            throw new IllegalStateException();
                        }
                    }

                    ItemTable.method199(this, 255, this.fieldY * 880288769, this.fieldAn * -660884211, (byte) 0, true, 645222263);
                }
            } else {
                if (!var4 && this.fieldAh * -123758697 == var2) {
                    if (var5 != 1166058444) {
                        throw new IllegalStateException();
                    }

                    this.loaded = true;
                }

                if (var3 != null) {
                    if (var5 != 1166058444) {
                        throw new IllegalStateException();
                    }

                    if (var3.length > 2) {
                        fieldC.reset();
                        fieldC.update(var3, 0, var3.length - 2);
                        var6 = (int) fieldC.getValue();
                        int var11 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
                        if (var6 == this.fieldL[var2]) {
                            if (var5 != 1166058444) {
                                throw new IllegalStateException();
                            }

                            if (this.fieldM[var2] == var11) {
                                this.fieldZ[var2] = true;
                                if (var4) {
                                    if (var5 != 1166058444) {
                                        throw new IllegalStateException();
                                    }

                                    this.fieldK[var2] = UnknownEnum3.maskBuffer(var3, false, (byte) -58);
                                }

                                return;
                            }

                            if (var5 != 1166058444) {
                                throw new IllegalStateException();
                            }
                        }

                        this.fieldZ[var2] = false;
                        if (!this.fieldR) {
                            if (var5 != 1166058444) {
                                throw new IllegalStateException();
                            }

                            if (!var4) {
                                return;
                            }

                            if (var5 != 1166058444) {
                                throw new IllegalStateException();
                            }
                        }

                        ItemTable.method199(this, this.fieldY * 880288769, var2, this.fieldL[var2], (byte) 2, var4, 645222263);
                        return;
                    }

                    if (var5 != 1166058444) {
                        throw new IllegalStateException();
                    }
                }

                this.fieldZ[var2] = false;
                if (this.fieldR || var4) {
                    ItemTable.method199(this, this.fieldY * 880288769, var2, this.fieldL[var2], (byte) 2, var4, 645222263);
                }

            }
        } catch (RuntimeException var10) {
            throw ClanMate.error(var10, "ez.ck(" + ')');
        }
    }

    @Override
    void v(int var1, byte var2) {
        try {
            classDs.method83(this.fieldY * 880288769, var1, (byte) 57);
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "ez.v(" + ')');
        }
    }
}
