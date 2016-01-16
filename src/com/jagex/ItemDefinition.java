package com.jagex;

import java.io.File;
import java.io.IOException;

public class ItemDefinition extends DualNode {

    public static Cache fieldE = new Cache(64);
    public static Cache spriteCache = new Cache(100);
    public static Cache fieldN = new Cache(50);
    static ReferenceTable fieldL;
    static ReferenceTable fieldB;
    public int fieldR = 0;
    public boolean fieldAn = false;
    public int id;
    public boolean fieldAy;
    public String fieldX = "null";
    public int fieldU = -1037675664;
    public int fieldJ = 0;
    public int fieldG = 0;
    public int fieldP = 0;
    public int stackable = 0;
    public int fieldY = 0;
    public String[] actions;
    public String[] groundActions;
    public int fieldAb;
    public int storeValue = 1604684541;
    public int fieldAd;
    public int fieldAu;
    public int fieldAc;
    public int team;
    int fieldAw;
    short[] fieldT;
    int fieldAi;
    short[] colors;
    short[] fieldH;
    short[] modifiedColors;
    int fieldAm;
    int fieldAe;
    int fieldAv;
    int fieldAq;
    int fieldAx;
    int fieldAz;
    int fieldAa;
    int fieldAt;
    int[] fieldAo;
    int[] fieldAg;
    int fieldAk;
    int fieldAj;
    int fieldAf;
    int fieldAl;
    int fieldD;
    int fieldAr;


    ItemDefinition() {
        this.groundActions = new String[]{null, null, StringConstants.TAKE, null, null};
        this.actions = new String[]{null, null, null, null, StringConstants.DROP};
        this.fieldAr = 960909181;
        this.fieldAe = -2144644907;
        this.fieldAv = 0;
        this.fieldAl = 1944043171;
        this.fieldAq = 1415698857;
        this.fieldAm = 0;
        this.fieldAx = 69851309;
        this.fieldAz = -682233397;
        this.fieldAi = 661856129;
        this.fieldAa = -2095039953;
        this.fieldAt = -426518543;
        this.fieldAw = -961468771;
        this.fieldAd = 1891457449;
        this.fieldAu = 1213777877;
        this.fieldAk = 599125120;
        this.fieldAj = -896650112;
        this.fieldAf = -114180224;
        this.fieldAb = 0;
        this.fieldAc = 0;
        this.team = 0;
        this.fieldAy = false;
    }

    public static JagexAccessFile getAccessFile(String var0, String var1, boolean var2, int var3) {
        try {
            File var4 = new File(UtilClass19.dir, "preferences" + var0 + ".dat");
            if (var4.exists()) {
                try {
                    JagexAccessFile var12 = new JagexAccessFile(var4, "rw", 10000L);
                    return var12;
                } catch (IOException var10) {
                }
            }
            String var5 = "";
            if (UtilClass19.fieldO * 1675136709 == 33) {
                var5 = "_rc";
            } else if (UtilClass19.fieldO * 1675136709 == 34) {
                var5 = "_wip";
            }

            File var6 = new File(JagSocket.fieldY, "jagex_" + var1 + "_preferences" + var0 + var5 + ".dat");
            JagexAccessFile var7;
            if (!var2 && var6.exists()) {
                try {
                    var7 = new JagexAccessFile(var6, "rw", 10000L);
                    return var7;
                } catch (IOException var9) {
                    ;
                }
            }

            try {
                var7 = new JagexAccessFile(var4, "rw", 10000L);
                return var7;
            } catch (IOException var8) {
                throw new RuntimeException();
            }
        } catch (RuntimeException var11) {
            throw ClanMate.error(var11, "ak.b(" + ')');
        }
    }

    static int getItemQuantity(int var0, int var1, byte var2) {
        try {
            ItemTable var3 = (ItemTable) ItemTable.cache.get((long) var0);
            if (null == var3 || -1 == var1) {
                return 0;
            }
            int var4 = 0;
            for (int var5 = 0; var5 < var3.quantities.length; ++var5) {
                if (var3.ids[var5] == var1) {
                    var4 += var3.quantities[var5];
                }
            }
            return var4;
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "ak.v(" + ')');
        }
    }

    void i(int var1) {
        try {
            ;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "ak.i(" + ')');
        }
    }

    public final boolean f(boolean var1, byte var2) {
        try {
            int var3 = this.fieldAr * -1184883157;
            int var4 = this.fieldAe * 1015584643;
            int var5 = this.fieldAx * 1820505307;
            if (var1) {
                if (var2 <= 24) {
                    throw new IllegalStateException();
                }

                var3 = this.fieldAl * 2056657653;
                var4 = this.fieldAq * 978068839;
                var5 = this.fieldAz * 1982288925;
            }

            if (var3 == -1) {
                if (var2 <= 24) {
                    throw new IllegalStateException();
                } else {
                    return true;
                }
            } else {
                boolean var6 = true;
                if (!fieldL.l(var3, 0, -67560834)) {
                    if (var2 <= 24) {
                        throw new IllegalStateException();
                    }

                    var6 = false;
                }

                if (-1 != var4) {
                    if (var2 <= 24) {
                        throw new IllegalStateException();
                    }

                    if (!fieldL.l(var4, 0, -119873133)) {
                        if (var2 <= 24) {
                            throw new IllegalStateException();
                        }

                        var6 = false;
                    }
                }

                if (-1 != var5) {
                    if (var2 <= 24) {
                        throw new IllegalStateException();
                    }

                    if (!fieldL.l(var5, 0, -1375269586)) {
                        if (var2 <= 24) {
                            throw new IllegalStateException();
                        }

                        var6 = false;
                    }
                }

                return var6;
            }
        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "ak.f(" + ')');
        }
    }

    void copy(ItemDefinition var1, ItemDefinition var2, int var3) {
        try {
            this.fieldD = var1.fieldD * 1;
            this.fieldU = 1 * var1.fieldU;
            this.fieldJ = var1.fieldJ * 1;
            this.fieldG = 1 * var1.fieldG;
            this.fieldY = 1 * var1.fieldY;
            this.fieldP = 1 * var1.fieldP;
            this.fieldR = var1.fieldR * 1;
            this.colors = var1.colors;
            this.modifiedColors = var1.modifiedColors;
            this.fieldT = var1.fieldT;
            this.fieldH = var1.fieldH;
            this.fieldX = var2.fieldX;
            this.fieldAn = var2.fieldAn;
            this.storeValue = var2.storeValue * 1;
            this.stackable = 1385029465;
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "ak.m(" + ')');
        }
    }

    public final Model e(int var1, int DUMMY) {
        try {
            if (null != this.fieldAo) {


                if (var1 > 1) {


                    int var3 = -1;

                    for (int var4 = 0; var4 < 10; ++var4) {


                        if (var1 >= this.fieldAg[var4]) {


                            if (0 != this.fieldAg[var4]) {


                                var3 = this.fieldAo[var4];
                            }
                        }
                    }

                    if (var3 != -1) {
                        return Client.getItemDefinition(var3, -354669685).e(1, 2037340464);
                    }

                }
            }

            Model var7 = (Model) fieldN.get((long) (this.id * -1571020975));
            if (var7 != null) {
                return var7;

            } else {
                classCy var8 = classCy.method285(fieldL, this.fieldD * -615553803, 0);
                if (var8 == null) {
                    if (DUMMY != 2037340464) {
                        throw new IllegalStateException();
                    } else {
                        return null;
                    }
                } else {
                    label111:
                    {
                        if (this.fieldAk * -256613271 == 128 && this.fieldAj * -568183847 == 128) {
                            if (DUMMY != 2037340464) {
                                throw new IllegalStateException();
                            }

                            if (128 == this.fieldAf * 1182882943) {
                                break label111;
                            }

                            if (DUMMY != 2037340464) {
                                throw new IllegalStateException();
                            }
                        }

                        var8.h(this.fieldAk * -256613271, this.fieldAj * -568183847, this.fieldAf * 1182882943);
                    }

                    int var5;
                    if (null != this.colors) {
                        if (DUMMY != 2037340464) {
                            throw new IllegalStateException();
                        }

                        for (var5 = 0; var5 < this.colors.length; ++var5) {
                            var8.o(this.colors[var5], this.modifiedColors[var5]);
                        }
                    }

                    if (null != this.fieldT) {
                        if (DUMMY != 2037340464) {
                            throw new IllegalStateException();
                        }

                        for (var5 = 0; var5 < this.fieldT.length; ++var5) {
                            if (DUMMY != 2037340464) {
                                throw new IllegalStateException();
                            }

                            var8.q(this.fieldT[var5], this.fieldH[var5]);
                        }
                    }

                    var7 = var8.p(this.fieldAb * 1958041997 + 64, 768 + this.fieldAc * -1786891637, -50, -10, -50);
                    var7.fieldAn = true;
                    fieldN.put(var7, (long) (this.id * -1571020975));
                    return var7;
                }
            }
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "ak.e(" + ')');
        }
    }

    public ItemDefinition n(int var1, int var2) {
        try {
            if (null != this.fieldAo) {
                if (var2 <= 1824894535) {
                    throw new IllegalStateException();
                }

                if (var1 > 1) {
                    if (var2 <= 1824894535) {
                        throw new IllegalStateException();
                    }

                    int var3 = -1;

                    for (int var4 = 0; var4 < 10; ++var4) {
                        if (var1 >= this.fieldAg[var4]) {
                            if (var2 <= 1824894535) {
                                throw new IllegalStateException();
                            }

                            if (this.fieldAg[var4] != 0) {
                                var3 = this.fieldAo[var4];
                            }
                        }
                    }

                    if (-1 != var3) {
                        if (var2 <= 1824894535) {
                            throw new IllegalStateException();
                        }

                        return Client.getItemDefinition(var3, -866555629);
                    }
                }
            }

            return this;
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "ak.n(" + ')');
        }
    }

    public final classCy d(boolean var1, byte var2) {
        try {
            int var3 = this.fieldAr * -1184883157;
            int var4 = this.fieldAe * 1015584643;
            int var5 = this.fieldAx * 1820505307;
            if (var1) {
                var3 = this.fieldAl * 2056657653;
                var4 = this.fieldAq * 978068839;
                var5 = this.fieldAz * 1982288925;
            }

            if (var3 == -1) {
                return null;
            } else {
                classCy var6 = classCy.method285(fieldL, var3, 0);
                if (-1 != var4) {
                    classCy var7 = classCy.method285(fieldL, var4, 0);
                    if (-1 != var5) {
                        classCy var8 = classCy.method285(fieldL, var5, 0);
                        classCy[] var9 = new classCy[]{var6, var7, var8};
                        var6 = new classCy(var9, 3);
                    } else {
                        classCy[] var12 = new classCy[]{var6, var7};
                        var6 = new classCy(var12, 2);
                    }
                }

                if (!var1) {
                    if (0 != this.fieldAv * -1720730999) {
                        var6.x(0, this.fieldAv * -1720730999, 0);
                    }
                }

                if (var1 && this.fieldAm * 1747200593 != 0) {
                    var6.x(0, this.fieldAm * 1747200593, 0);
                }

                int var11;
                if (null != this.colors) {
                    for (var11 = 0; var11 < this.colors.length; ++var11) {
                        var6.o(this.colors[var11], this.modifiedColors[var11]);
                    }
                }

                if (null != this.fieldT) {
                    for (var11 = 0; var11 < this.fieldT.length; ++var11) {
                        var6.q(this.fieldT[var11], this.fieldH[var11]);
                    }
                }
                return var6;
            }
        } catch (RuntimeException var10) {
            throw ClanMate.error(var10, "ak.d(" + ')');
        }
    }

    public final classCy o(boolean var1, int var2) {
        try {
            int var3 = this.fieldAi * 510844799;
            int var4 = this.fieldAa * 1757066033;
            if (var1) {
                var3 = this.fieldAt * 524666607;
                var4 = this.fieldAw * 1568239691;
            }

            if (-1 == var3) {
                return null;
            } else {
                classCy var5 = classCy.method285(fieldL, var3, 0);
                if (var4 != -1) {
                    if (var2 <= 334847270) {
                        throw new IllegalStateException();
                    }

                    classCy var6 = classCy.method285(fieldL, var4, 0);
                    classCy[] var7 = new classCy[]{var5, var6};
                    var5 = new classCy(var7, 2);
                }

                int var9;
                if (null != this.colors) {
                    if (var2 <= 334847270) {
                        throw new IllegalStateException();
                    }

                    for (var9 = 0; var9 < this.colors.length; ++var9) {
                        if (var2 <= 334847270) {
                            throw new IllegalStateException();
                        }

                        var5.o(this.colors[var9], this.modifiedColors[var9]);
                    }
                }

                if (null != this.fieldT) {
                    if (var2 <= 334847270) {
                        throw new IllegalStateException();
                    }

                    for (var9 = 0; var9 < this.fieldT.length; ++var9) {
                        if (var2 <= 334847270) {
                            throw new IllegalStateException();
                        }

                        var5.q(this.fieldT[var9], this.fieldH[var9]);
                    }
                }

                return var5;
            }
        } catch (RuntimeException var8) {
            throw ClanMate.error(var8, "ak.o(" + ')');
        }
    }

    void l(Buffer var1, int opcode, int dummy) {
        try {
            if (opcode == 1) {
                this.fieldD = var1.readUShort() * 139143005;
            } else if (opcode == 2) {
                if (dummy != 1232779563) {
                    throw new IllegalStateException();
                }

                this.fieldX = var1.readString(2061076165);
            } else if (opcode == 4) {
                if (dummy != 1232779563) {
                    throw new IllegalStateException();
                }

                this.fieldU = var1.readUShort() * -518062397;
            } else if (opcode == 5) {
                if (dummy != 1232779563) {
                    throw new IllegalStateException();
                }

                this.fieldJ = var1.readUShort() * 802499809;
            } else if (opcode == 6) {
                if (dummy != 1232779563) {
                    return;
                }

                this.fieldG = var1.readUShort() * 52201419;
            } else if (7 == opcode) {
                if (dummy != 1232779563) {
                    throw new IllegalStateException();
                }

                this.fieldP = var1.readUShort() * -1750325393;
                if (this.fieldP * -2015029361 > 32767) {
                    if (dummy != 1232779563) {
                        return;
                    }

                    this.fieldP -= 661585920;
                }
            } else if (8 == opcode) {
                if (dummy != 1232779563) {
                    throw new IllegalStateException();
                }

                this.fieldR = var1.readUShort() * 2131157763;
                if (this.fieldR * 1117986731 > 32767) {
                    if (dummy != 1232779563) {
                        throw new IllegalStateException();
                    }

                    this.fieldR -= -486342656;
                }
            } else if (opcode == 11) {
                this.stackable = 1385029465;
            } else if (opcode == 12) {
                if (dummy != 1232779563) {
                    return;
                }

                this.storeValue = var1.readInt((byte) 67) * 1604684541;
            } else if (opcode == 16) {
                if (dummy != 1232779563) {
                    return;
                }

                this.fieldAn = true;
            } else if (23 == opcode) {
                this.fieldAr = var1.readUShort() * -960909181;
                this.fieldAv = var1.readUByte() * 880270265;
            } else if (opcode == 24) {
                if (dummy != 1232779563) {
                    throw new IllegalStateException();
                }

                this.fieldAe = var1.readUShort() * 2144644907;
            } else if (opcode == 25) {
                this.fieldAl = var1.readUShort() * -1944043171;
                this.fieldAm = var1.readUByte() * -840606031;
            } else if (26 == opcode) {
                this.fieldAq = var1.readUShort() * -1415698857;
            } else {
                if (opcode >= 30) {
                    if (dummy != 1232779563) {
                        return;
                    }

                    if (opcode < 35) {
                        this.groundActions[opcode - 30] = var1.readString(2520738);
                        if (this.groundActions[opcode - 30].equalsIgnoreCase(StringConstants.fieldB)) {
                            this.groundActions[opcode - 30] = null;
                        }

                        return;
                    }
                }

                if (opcode >= 35) {
                    if (dummy != 1232779563) {
                        throw new IllegalStateException();
                    }

                    if (opcode < 40) {
                        if (dummy != 1232779563) {
                            throw new IllegalStateException();
                        }

                        this.actions[opcode - 35] = var1.readString(1431882067);
                        return;
                    }
                }

                int var4;
                int var5;
                if (opcode == 40) {
                    if (dummy != 1232779563) {
                        throw new IllegalStateException();
                    }

                    var4 = var1.readUByte();
                    this.colors = new short[var4];
                    this.modifiedColors = new short[var4];

                    for (var5 = 0; var5 < var4; ++var5) {
                        this.colors[var5] = (short) var1.readUShort();
                        this.modifiedColors[var5] = (short) var1.readUShort();
                    }
                } else if (opcode == 41) {
                    var4 = var1.readUByte();
                    this.fieldT = new short[var4];
                    this.fieldH = new short[var4];

                    for (var5 = 0; var5 < var4; ++var5) {
                        if (dummy != 1232779563) {
                            return;
                        }

                        this.fieldT[var5] = (short) var1.readUShort();
                        this.fieldH[var5] = (short) var1.readUShort();
                    }
                } else if (65 == opcode) {
                    if (dummy != 1232779563) {
                        throw new IllegalStateException();
                    }

                    this.fieldAy = true;
                } else if (opcode == 78) {
                    if (dummy != 1232779563) {
                        throw new IllegalStateException();
                    }

                    this.fieldAx = var1.readUShort() * -69851309;
                } else if (79 == opcode) {
                    if (dummy != 1232779563) {
                        throw new IllegalStateException();
                    }

                    this.fieldAz = var1.readUShort() * 682233397;
                } else if (90 == opcode) {
                    if (dummy != 1232779563) {
                        throw new IllegalStateException();
                    }

                    this.fieldAi = var1.readUShort() * -661856129;
                } else if (opcode == 91) {
                    if (dummy != 1232779563) {
                        throw new IllegalStateException();
                    }

                    this.fieldAt = var1.readUShort() * 426518543;
                } else if (92 == opcode) {
                    this.fieldAa = var1.readUShort() * 2095039953;
                } else if (opcode == 93) {
                    if (dummy != 1232779563) {
                        return;
                    }

                    this.fieldAw = var1.readUShort() * 961468771;
                } else if (opcode == 95) {
                    if (dummy != 1232779563) {
                        throw new IllegalStateException();
                    }

                    this.fieldY = var1.readUShort() * -991095719;
                } else if (opcode == 97) {
                    if (dummy != 1232779563) {
                        throw new IllegalStateException();
                    }

                    this.fieldAd = var1.readUShort() * -1891457449;
                } else if (98 == opcode) {
                    if (dummy != 1232779563) {
                        throw new IllegalStateException();
                    }

                    this.fieldAu = var1.readUShort() * -1213777877;
                } else {
                    if (opcode >= 100) {
                        if (dummy != 1232779563) {
                            throw new IllegalStateException();
                        }

                        if (opcode < 110) {
                            if (this.fieldAo == null) {
                                if (dummy != 1232779563) {
                                    throw new IllegalStateException();
                                }

                                this.fieldAo = new int[10];
                                this.fieldAg = new int[10];
                            }

                            this.fieldAo[opcode - 100] = var1.readUShort();
                            this.fieldAg[opcode - 100] = var1.readUShort();
                            return;
                        }
                    }

                    if (opcode == 110) {
                        if (dummy != 1232779563) {
                            throw new IllegalStateException();
                        }

                        this.fieldAk = var1.readUShort() * -129537063;
                    } else if (111 == opcode) {
                        this.fieldAj = var1.readUShort() * 563420265;
                    } else if (112 == opcode) {
                        if (dummy != 1232779563) {
                            throw new IllegalStateException();
                        }

                        this.fieldAf = var1.readUShort() * -235773057;
                    } else if (113 == opcode) {
                        this.fieldAb = var1.readByte() * -1065447099;
                    } else if (opcode == 114) {
                        if (dummy != 1232779563) {
                            throw new IllegalStateException();
                        }

                        this.fieldAc = var1.readByte() * 71285167;
                    } else if (115 == opcode) {
                        if (dummy != 1232779563) {
                            throw new IllegalStateException();
                        }

                        this.team = var1.readUByte() * -1661406483;
                    }
                }
            }

        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "ak.l(" + ')');
        }
    }

    public final classCy w(int var1, int var2) {
        try {
            int var4;
            if (null != this.fieldAo && var1 > 1) {
                if (var2 >= -2007854954) {
                    throw new IllegalStateException();
                }

                int var3 = -1;

                for (var4 = 0; var4 < 10; ++var4) {
                    if (var2 >= -2007854954) {
                        throw new IllegalStateException();
                    }

                    if (var1 >= this.fieldAg[var4]) {
                        if (var2 >= -2007854954) {
                            throw new IllegalStateException();
                        }

                        if (this.fieldAg[var4] != 0) {
                            if (var2 >= -2007854954) {
                                throw new IllegalStateException();
                            }

                            var3 = this.fieldAo[var4];
                        }
                    }
                }

                if (-1 != var3) {
                    return Client.getItemDefinition(var3, -1659254263).w(1, -2085420775);
                }
            }

            classCy var6 = classCy.method285(fieldL, this.fieldD * -615553803, 0);
            if (null == var6) {
                return null;
            } else {
                label105:
                {
                    if (128 == this.fieldAk * -256613271) {
                        if (var2 >= -2007854954) {
                            throw new IllegalStateException();
                        }

                        if (128 == this.fieldAj * -568183847) {
                            if (var2 >= -2007854954) {
                                throw new IllegalStateException();
                            }

                            if (this.fieldAf * 1182882943 == 128) {
                                break label105;
                            }

                            if (var2 >= -2007854954) {
                                throw new IllegalStateException();
                            }
                        }
                    }

                    var6.h(this.fieldAk * -256613271, this.fieldAj * -568183847, this.fieldAf * 1182882943);
                }

                if (null != this.colors) {
                    if (var2 >= -2007854954) {
                        throw new IllegalStateException();
                    }

                    for (var4 = 0; var4 < this.colors.length; ++var4) {
                        if (var2 >= -2007854954) {
                            throw new IllegalStateException();
                        }

                        var6.o(this.colors[var4], this.modifiedColors[var4]);
                    }
                }

                if (this.fieldT != null) {
                    if (var2 >= -2007854954) {
                        throw new IllegalStateException();
                    }

                    for (var4 = 0; var4 < this.fieldT.length; ++var4) {
                        if (var2 >= -2007854954) {
                            throw new IllegalStateException();
                        }

                        var6.q(this.fieldT[var4], this.fieldH[var4]);
                    }
                }

                return var6;
            }
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "ak.w(" + ')');
        }
    }

    public final boolean x(boolean var1, int var2) {
        try {
            int var3 = this.fieldAi * 510844799;
            int var4 = this.fieldAa * 1757066033;
            if (var1) {
                var3 = this.fieldAt * 524666607;
                var4 = this.fieldAw * 1568239691;
            }

            if (-1 == var3) {
                if (var2 != -642787323) {
                    throw new IllegalStateException();
                } else {
                    return true;
                }
            } else {
                boolean var5 = true;
                if (!fieldL.l(var3, 0, -346932200)) {
                    if (var2 != -642787323) {
                        throw new IllegalStateException();
                    }

                    var5 = false;
                }

                if (-1 != var4) {
                    if (var2 != -642787323) {
                        throw new IllegalStateException();
                    }

                    if (!fieldL.l(var4, 0, -147072497)) {
                        if (var2 != -642787323) {
                            throw new IllegalStateException();
                        }

                        var5 = false;
                    }
                }

                return var5;
            }
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "ak.x(" + ')');
        }
    }

    void b(Buffer var1, int var2) {
        try {
            while (true) {
                int var3 = var1.readUByte();
                if (0 == var3) {
                    if (var2 >= -849564480) {
                        return;
                    }

                    return;
                }

                this.l(var1, var3, 1232779563);
            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "ak.b(" + ')');
        }
    }
}
