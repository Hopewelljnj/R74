package com.jagex;

public class Widget extends Node {

    public static boolean[] fieldV;
    public static ReferenceTable widgetRefTable;
    public static boolean fieldS = false;
    public static Widget[][] widgets;
    static Cache fieldE = new Cache(50);
    static Cache fieldN = new Cache(20);
    static Cache spriteCache = new Cache(200);
    public int fieldDe;
    public int config = 0;
    public int[] fieldCe;
    public boolean fieldDz;
    public Object[] fieldCd;
    public Object[] fieldCg;
    public int type;
    public int fieldQ = 0;
    public int contentType = 0;
    public int relativeX = 0;
    public int viewportHeight = 0;
    public int fieldU = 0;
    public int fieldJ = 0;
    public int width = 0;
    public int height = 0;
    public int[] spriteIds;
    public boolean fieldR = false;
    public int fieldAv = 0;
    public int insetY = 0;
    public int insetX = 0;
    public int fieldP = -1959430339;
    public int fieldAh = 0;
    public int fieldDy;
    public Object[] fieldCv;
    public boolean fieldAl = false;
    public int fieldAq = 0;
    public int fieldAm = 792091749;
    public boolean fieldK = false;
    public int enabledTextureId = 832893295;
    public int fieldAi = 0;
    public boolean fieldAa = false;
    public int fieldAw = 0;
    public boolean vflipped;
    public int xPadding = 0;
    public int fieldBj = 0;
    public int fieldAu = 858091143;
    public Object[] fieldDg;
    public int fieldBb = 0;
    public int fieldAf = 1969895403;
    public int fieldAb = -242852431;
    public int fieldAc = 0;
    public int fieldAp = 0;
    public int fieldAy = 0;
    public int[] itemQuantities;
    public int fieldBo = 0;
    public int fieldBi = -686051852;
    public int fieldBs = 0;
    public Object[] fieldCp;
    public Object[] fieldCj;
    public Object[] fieldCl;
    public String fieldBm = "";
    public String fieldBz = "";
    public int fieldBr = 0;
    public int fieldBe = 0;
    public Object[] fieldCa;
    public boolean fieldBc = false;
    public int fieldAn = 0;
    public int yPadding = 0;
    public int[] xSprites;
    public int[] ySprites;
    public int textureId = -1568720601;
    public String[] fieldBn;
    public int fieldAe = 0;
    public String fieldBa = "";
    public String[] fieldBv;
    public Widget fieldBd = null;
    public int fieldBh = 0;
    public int fieldAr = 0;
    public boolean fieldBy = false;
    public String fieldCr = "";
    public boolean fieldCt = false;
    public int fieldDx;
    public Object[] fieldCi;
    public Object[] fieldCf;
    public Object[] fieldCo;
    public Object[] fieldDd;
    public Object[] fieldCq;
    public Object[] fieldCb;
    public Object[] fieldCh;
    public int id = 943023265;
    public boolean hflipped;
    public int[] fieldCy;
    public int fieldDc;
    public int[] fieldCc;
    public Object[] fieldCx;
    public int fieldAd = 918336837;
    public Object[] fieldCk;
    public Object[] fieldCz;
    public Object[] fieldCm;
    public Object[] fieldCu;
    public int fieldDs;
    public Object[] fieldCs;
    public Object[] fieldCn;
    public int index = 908534401;
    public Object[] fieldDp;
    public Object[] fieldDu;
    public Object[] fieldDj;
    public Object[] fieldDi;
    public int[][] fieldDo;
    public int[] fieldDq;
    public int[] fieldDh;
    public int fieldDf = -2125078721;
    public String fieldDw = "";
    public String toolTip;
    public int[] itemIds;
    public Object[] fieldCw;
    public int itemId;
    public int fieldDl;
    public int fieldBu = 0;
    public int fieldBp = 1128919930;
    public Widget[] children;
    public boolean fieldDa;
    public int fieldBw = 430265019;
    public boolean fieldBl = false;
    public int fieldDb;
    public int fieldEt;
    public int relativeY = 0;
    public int fieldDm;
    public int fieldAt = 0;
    public boolean fieldEp;
    int fieldAj = -934543251;
    int fieldAk = -2144359405;


    public Widget() {
        this.toolTip = StringConstants.fieldL;
        this.itemId = -64341787;
        this.fieldDl = 0;
        this.fieldDs = 0;
        this.fieldDc = 0;
        this.fieldDa = false;
        this.fieldDz = false;
        this.fieldDy = -692491151;
        this.fieldDb = 0;
        this.fieldDx = 0;
        this.fieldDe = 0;
        this.fieldDm = 18162491;
        this.fieldEt = -1792825163;
        this.fieldEp = false;
    }

    public static Widget lookup(int UID) {
        try {
            int var2 = UID >> 16;
            int var3 = UID & '\uffff';
            if (null != widgets[var2]) {
                if (null != widgets[var2][var3]) {
                    return widgets[var2][var3];
                }
            }
            boolean didLoad = loadWidget(var2, 477596194);
            return !didLoad ? null : widgets[var2][var3];

        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "cg.v(" + ')');
        }
    }

    public static boolean loadWidget(int majorId, int var1) {
        try {
            if (fieldV[majorId]) {
                if (var1 != 477596194) {
                    throw new IllegalStateException();
                } else {
                    return true;
                }
            } else if (!widgetRefTable.isFileLoaded(majorId, 480007877)) {
                if (var1 != 477596194) {
                    throw new IllegalStateException();
                } else {
                    return false;
                }
            } else {
                int var2 = widgetRefTable.getFileEntryCount(majorId, (byte) 0);
                if (0 == var2) {
                    if (var1 != 477596194) {
                        throw new IllegalStateException();
                    } else {
                        fieldV[majorId] = true;
                        return true;
                    }
                } else {
                    if (null == widgets[majorId]) {
                        if (var1 != 477596194) {
                            throw new IllegalStateException();
                        }

                        widgets[majorId] = new Widget[var2];
                    }

                    for (int var3 = 0; var3 < var2; ++var3) {
                        if (widgets[majorId][var3] == null) {
                            if (var1 != 477596194) {
                                throw new IllegalStateException();
                            }

                            byte[] var4 = widgetRefTable.getFile(majorId, var3, (short) 6200);
                            if (null != var4) {
                                if (var1 != 477596194) {
                                    throw new IllegalStateException();
                                }

                                widgets[majorId][var3] = new Widget();
                                widgets[majorId][var3].id = ((majorId << 16) + var3) * -943023265;
                                if (-1 == var4[0]) {
                                    if (var1 != 477596194) {
                                        throw new IllegalStateException();
                                    }

                                    widgets[majorId][var3].m(new Buffer(var4), (byte) 1);
                                } else {
                                    widgets[majorId][var3].l(new Buffer(var4), 2094086931);
                                }
                            }
                        }
                    }

                    fieldV[majorId] = true;
                    return true;
                }
            }
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "aa.b(" + ')');
        }
    }

    public Sprite f(int index, byte var2) {
        try {
            fieldS = false;
            if (index >= 0 && index < this.spriteIds.length) {
                int id = this.spriteIds[index];
                if (-1 == id) {
                    return null;
                }
                Sprite var4 = (Sprite) spriteCache.get((long) id);
                if (var4 != null) {
                    return var4;
                }
                var4 = classBt.method256(classDc.fieldL, id, 0, 1893373957);
                if (var4 != null) {
                    spriteCache.put(var4, (long) id);
                } else {
                    fieldS = true;
                }
                return var4;
            }
            return null;
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "ft.f(" + ')');
        }
    }

    void l(Buffer var1, int var2) {
        try {
            this.fieldK = false;
            this.type = var1.readUByte() * 295036789;
            this.fieldQ = var1.readUByte() * -2076308747;
            this.contentType = var1.readUShort() * -11344031;
            this.fieldU = (this.relativeX = var1.j((byte) 1) * 1121775953) * -1972268979;
            this.fieldJ = (this.relativeY = var1.j((byte) 1) * 1941180649) * -1573021493;
            this.width = var1.readUShort() * 310783301;
            this.height = var1.readUShort() * -542616303;
            this.fieldAq = var1.readUByte() * 353028707;
            this.fieldP = var1.readUShort() * 1959430339;
            if ('\uffff' == this.fieldP * 1574594539) {
                this.fieldP = -1959430339;
            } else {
                this.fieldP = ((this.id * -1866039137 & -65536) + this.fieldP * 1574594539) * 1959430339;
            }

            this.fieldDf = var1.readUShort() * 2125078721;
            if (this.fieldDf * 2132438849 == '\uffff') {
                this.fieldDf = -2125078721;
            }

            int var3 = var1.readUByte();
            int var4;
            if (var3 > 0) {
                if (var2 <= 1006525432) {
                    throw new IllegalStateException();
                }

                this.fieldDq = new int[var3];
                this.fieldDh = new int[var3];

                for (var4 = 0; var4 < var3; ++var4) {
                    if (var2 <= 1006525432) {
                        throw new IllegalStateException();
                    }

                    this.fieldDq[var4] = var1.readUByte();
                    this.fieldDh[var4] = var1.readUShort();
                }
            }

            var4 = var1.readUByte();
            int var5;
            int var6;
            int var7;
            if (var4 > 0) {
                this.fieldDo = new int[var4][];

                for (var5 = 0; var5 < var4; ++var5) {
                    if (var2 <= 1006525432) {
                        throw new IllegalStateException();
                    }

                    var6 = var1.readUShort();
                    this.fieldDo[var5] = new int[var6];

                    for (var7 = 0; var7 < var6; ++var7) {
                        if (var2 <= 1006525432) {
                            throw new IllegalStateException();
                        }

                        this.fieldDo[var5][var7] = var1.readUShort();
                        if (this.fieldDo[var5][var7] == '\uffff') {
                            if (var2 <= 1006525432) {
                                throw new IllegalStateException();
                            }

                            this.fieldDo[var5][var7] = -1;
                        }
                    }
                }
            }

            boolean var10001;
            if (this.type * -729517859 == 0) {
                this.viewportHeight = var1.readUShort() * 2112815541;
                if (var1.readUByte() == 1) {
                    if (var2 <= 1006525432) {
                        return;
                    }

                    var10001 = true;
                } else {
                    var10001 = false;
                }

                this.fieldR = var10001;
            }

            if (1 == this.type * -729517859) {
                if (var2 <= 1006525432) {
                    throw new IllegalStateException();
                }

                var1.readUShort();
                var1.readUByte();
            }

            if (2 == this.type * -729517859) {
                this.itemIds = new int[this.width * 805002637 * this.height * -1004717071];
                this.itemQuantities = new int[this.width * 805002637 * this.height * -1004717071];
                var5 = var1.readUByte();
                if (var5 == 1) {
                    if (var2 <= 1006525432) {
                        throw new IllegalStateException();
                    }

                    this.config = -1072646957 * (this.config * 1451344731 | 268435456);
                }

                var6 = var1.readUByte();
                if (1 == var6) {
                    if (var2 <= 1006525432) {
                        return;
                    }

                    this.config = -1072646957 * (this.config * 1451344731 | 1073741824);
                }

                var7 = var1.readUByte();
                if (1 == var7) {
                    if (var2 <= 1006525432) {
                        throw new IllegalStateException();
                    }

                    this.config = (this.config * 1451344731 | Integer.MIN_VALUE) * -1072646957;
                }

                int var8 = var1.readUByte();
                if (1 == var8) {
                    if (var2 <= 1006525432) {
                        throw new IllegalStateException();
                    }

                    this.config = -1072646957 * (this.config * 1451344731 | 536870912);
                }

                this.xPadding = var1.readUByte() * -2120455351;
                this.yPadding = var1.readUByte() * 1225301671;
                this.xSprites = new int[20];
                this.ySprites = new int[20];
                this.spriteIds = new int[20];

                int var9;
                for (var9 = 0; var9 < 20; ++var9) {
                    if (var2 <= 1006525432) {
                        throw new IllegalStateException();
                    }

                    int var10 = var1.readUByte();
                    if (var10 == 1) {
                        if (var2 <= 1006525432) {
                            return;
                        }

                        this.xSprites[var9] = var1.j((byte) 1);
                        this.ySprites[var9] = var1.j((byte) 1);
                        this.spriteIds[var9] = var1.readInt((byte) -88);
                    } else {
                        this.spriteIds[var9] = -1;
                    }
                }

                this.fieldBn = new String[5];

                for (var9 = 0; var9 < 5; ++var9) {
                    if (var2 <= 1006525432) {
                        throw new IllegalStateException();
                    }

                    String var13 = var1.readString(2048940114);
                    if (var13.length() > 0) {
                        if (var2 <= 1006525432) {
                            throw new IllegalStateException();
                        }

                        this.fieldBn[var9] = var13;
                        this.config = (this.config * 1451344731 | 1 << var9 + 23) * -1072646957;
                    }
                }
            }

            if (3 == this.type * -729517859) {
                if (var2 <= 1006525432) {
                    throw new IllegalStateException();
                }

                if (var1.readUByte() == 1) {
                    if (var2 <= 1006525432) {
                        throw new IllegalStateException();
                    }

                    var10001 = true;
                } else {
                    var10001 = false;
                }

                this.fieldAl = var10001;
            }

            label512:
            {
                if (4 != this.type * -729517859) {
                    if (var2 <= 1006525432) {
                        return;
                    }

                    if (1 != this.type * -729517859) {
                        break label512;
                    }
                }

                this.fieldBe = var1.readUByte() * 404843075;
                this.fieldBb = var1.readUByte() * 1068762391;
                this.fieldBr = var1.readUByte() * -2011961211;
                this.fieldBw = var1.readUShort() * -430265019;
                if ('\uffff' == this.fieldBw * -1926046323) {
                    this.fieldBw = 430265019;
                }

                this.fieldBc = var1.readUByte() == 1;
            }

            if (4 == this.type * -729517859) {
                if (var2 <= 1006525432) {
                    throw new IllegalStateException();
                }

                this.fieldBm = var1.readString(1205431501);
                this.fieldBz = var1.readString(191970246);
            }

            label455:
            {
                if (this.type * -729517859 != 1) {
                    if (var2 <= 1006525432) {
                        throw new IllegalStateException();
                    }

                    if (this.type * -729517859 != 3) {
                        if (var2 <= 1006525432) {
                            throw new IllegalStateException();
                        }

                        if (this.type * -729517859 != 4) {
                            break label455;
                        }

                        if (var2 <= 1006525432) {
                            throw new IllegalStateException();
                        }
                    }
                }

                this.fieldAh = var1.readInt((byte) 13) * -204360837;
            }

            label446:
            {
                if (3 != this.type * -729517859) {
                    if (var2 <= 1006525432) {
                        return;
                    }

                    if (4 != this.type * -729517859) {
                        break label446;
                    }

                    if (var2 <= 1006525432) {
                        throw new IllegalStateException();
                    }
                }

                this.fieldAr = var1.readInt((byte) -27) * -1036482801;
                this.fieldAe = var1.readInt((byte) -50) * 251503053;
                this.fieldAv = var1.readInt((byte) 31) * 1992644573;
            }

            if (5 == this.type * -729517859) {
                if (var2 <= 1006525432) {
                    return;
                }

                this.textureId = var1.readInt((byte) 51) * 1568720601;
                this.enabledTextureId = var1.readInt((byte) -6) * -832893295;
            }

            if (6 == this.type * -729517859) {
                if (var2 <= 1006525432) {
                    throw new IllegalStateException();
                }

                this.fieldAd = 918336837;
                this.fieldAu = var1.readUShort() * -858091143;
                if (this.fieldAu * -1801975607 == '\uffff') {
                    if (var2 <= 1006525432) {
                        throw new IllegalStateException();
                    }

                    this.fieldAu = 858091143;
                }

                this.fieldAk = -2144359405;
                this.fieldAj = var1.readUShort() * 934543251;
                if (this.fieldAj * 973076123 == '\uffff') {
                    if (var2 <= 1006525432) {
                        throw new IllegalStateException();
                    }

                    this.fieldAj = -934543251;
                }

                this.fieldAf = var1.readUShort() * -1969895403;
                if ('\uffff' == this.fieldAf * -9713859) {
                    if (var2 <= 1006525432) {
                        throw new IllegalStateException();
                    }

                    this.fieldAf = 1969895403;
                }

                this.fieldAb = var1.readUShort() * 242852431;
                if ('\uffff' == this.fieldAb * -1921108817) {
                    if (var2 <= 1006525432) {
                        throw new IllegalStateException();
                    }

                    this.fieldAb = -242852431;
                }

                this.fieldBi = var1.readUShort() * -1638948091;
                this.fieldAy = var1.readUShort() * -1514397635;
                this.fieldBu = var1.readUShort() * -1385890543;
            }

            if (7 == this.type * -729517859) {
                this.itemIds = new int[this.width * 805002637 * this.height * -1004717071];
                this.itemQuantities = new int[this.width * 805002637 * this.height * -1004717071];
                this.fieldBe = var1.readUByte() * 404843075;
                this.fieldBw = var1.readUShort() * -430265019;
                if ('\uffff' == this.fieldBw * -1926046323) {
                    if (var2 <= 1006525432) {
                        return;
                    }

                    this.fieldBw = 430265019;
                }

                if (var1.readUByte() == 1) {
                    if (var2 <= 1006525432) {
                        throw new IllegalStateException();
                    }

                    var10001 = true;
                } else {
                    var10001 = false;
                }

                this.fieldBc = var10001;
                this.fieldAh = var1.readInt((byte) -46) * -204360837;
                this.xPadding = var1.j((byte) 1) * -2120455351;
                this.yPadding = var1.j((byte) 1) * 1225301671;
                var5 = var1.readUByte();
                if (1 == var5) {
                    if (var2 <= 1006525432) {
                        throw new IllegalStateException();
                    }

                    this.config = -1072646957 * (this.config * 1451344731 | 1073741824);
                }

                this.fieldBn = new String[5];

                for (var6 = 0; var6 < 5; ++var6) {
                    String var12 = var1.readString(1615554471);
                    if (var12.length() > 0) {
                        this.fieldBn[var6] = var12;
                        this.config = (this.config * 1451344731 | 1 << 23 + var6) * -1072646957;
                    }
                }
            }

            if (8 == this.type * -729517859) {
                if (var2 <= 1006525432) {
                    return;
                }

                this.fieldBm = var1.readString(-90641223);
            }

            label428:
            {
                if (2 != this.fieldQ * 1240781149) {
                    if (var2 <= 1006525432) {
                        throw new IllegalStateException();
                    }

                    if (2 != this.type * -729517859) {
                        break label428;
                    }

                    if (var2 <= 1006525432) {
                        throw new IllegalStateException();
                    }
                }

                this.fieldCr = var1.readString(629278251);
                this.fieldDw = var1.readString(844218621);
                var5 = var1.readUShort() & 63;
                this.config = (this.config * 1451344731 | var5 << 11) * -1072646957;
            }

            label421:
            {
                if (this.fieldQ * 1240781149 != 1 && this.fieldQ * 1240781149 != 4 && 5 != this.fieldQ * 1240781149 && 6 != this.fieldQ * 1240781149) {
                    break label421;
                }
                this.toolTip = var1.readString(1891361850);
                if (this.toolTip.length() == 0) {
                    if (1 == this.fieldQ * 1240781149) {
                        this.toolTip = StringConstants.fieldL;
                    }
                    if (4 == this.fieldQ * 1240781149) {
                        this.toolTip = StringConstants.fieldM;
                    }
                    if (5 == this.fieldQ * 1240781149) {
                        this.toolTip = StringConstants.fieldM;
                    }
                    if (this.fieldQ * 1240781149 == 6) {
                        this.toolTip = StringConstants.fieldW;
                    }
                }
            }

            label410:
            {
                if (1 != this.fieldQ * 1240781149 && 4 != this.fieldQ * 1240781149 && 5 != this.fieldQ * 1240781149) {
                    break label410;
                }

                this.config = (this.config * 1451344731 | 4194304) * -1072646957;
            }

            if (this.fieldQ * 1240781149 == 6) {
                this.config = -1072646957 * (this.config * 1451344731 | 1);
            }

        } catch (RuntimeException var11) {
            throw ClanMate.error(var11, "ft.l(" + ')');
        }
    }

    void m(Buffer var1, byte var2) {
        try {
            var1.readUByte();
            this.fieldK = true;
            this.type = var1.readUByte() * 295036789;
            this.contentType = var1.readUShort() * -11344031;
            this.fieldU = (this.relativeX = var1.j((byte) 1) * 1121775953) * -1972268979;
            this.fieldJ = (this.relativeY = var1.j((byte) 1) * 1941180649) * -1573021493;
            this.width = var1.readUShort() * 310783301;
            if (9 == this.type * -729517859) {
                if (var2 != 1) {
                    throw new IllegalStateException();
                }

                this.height = var1.j((byte) 1) * -542616303;
            } else {
                this.height = var1.readUShort() * -542616303;
            }

            this.fieldP = var1.readUShort() * 1959430339;
            if (this.fieldP * 1574594539 == '\uffff') {
                if (var2 != 1) {
                    throw new IllegalStateException();
                }

                this.fieldP = -1959430339;
            } else {
                this.fieldP = (this.fieldP * 1574594539 + (this.id * -1866039137 & -65536)) * 1959430339;
            }

            boolean var10001;
            if (var1.readUByte() == 1) {
                if (var2 != 1) {
                    throw new IllegalStateException();
                }

                var10001 = true;
            } else {
                var10001 = false;
            }

            this.fieldR = var10001;
            if (this.type * -729517859 == 0) {
                if (var2 != 1) {
                    throw new IllegalStateException();
                }

                this.fieldAn = var1.readUShort() * -621098081;
                this.viewportHeight = var1.readUShort() * 2112815541;
            }

            if (5 == this.type * -729517859) {
                if (var2 != 1) {
                    return;
                }

                this.textureId = var1.readInt((byte) 35) * 1568720601;
                this.fieldAi = var1.readUShort() * 1032405715;
                if (var1.readUByte() == 1) {
                    if (var2 != 1) {
                        throw new IllegalStateException();
                    }

                    var10001 = true;
                } else {
                    var10001 = false;
                }

                this.fieldAa = var10001;
                this.fieldAq = var1.readUByte() * 353028707;
                this.fieldAt = var1.readUByte() * -188167725;
                this.fieldAw = var1.readInt((byte) -36) * -1835095931;
                if (var1.readUByte() == 1) {
                    if (var2 != 1) {
                        throw new IllegalStateException();
                    }

                    var10001 = true;
                } else {
                    var10001 = false;
                }

                this.vflipped = var10001;
                if (var1.readUByte() == 1) {
                    if (var2 != 1) {
                        return;
                    }

                    var10001 = true;
                } else {
                    var10001 = false;
                }

                this.hflipped = var10001;
            }

            if (this.type * -729517859 == 6) {
                if (var2 != 1) {
                    throw new IllegalStateException();
                }

                this.fieldAd = 918336837;
                this.fieldAu = var1.readUShort() * -858091143;
                if (this.fieldAu * -1801975607 == '\uffff') {
                    this.fieldAu = 858091143;
                }

                this.fieldAc = var1.j((byte) 1) * -751209793;
                this.fieldAp = var1.j((byte) 1) * -1143690161;
                this.fieldAy = var1.readUShort() * -1514397635;
                this.fieldBu = var1.readUShort() * -1385890543;
                this.fieldBo = var1.readUShort() * 2051348697;
                this.fieldBi = var1.readUShort() * -1638948091;
                this.fieldAf = var1.readUShort() * -1969895403;
                if ('\uffff' == this.fieldAf * -9713859) {
                    if (var2 != 1) {
                        throw new IllegalStateException();
                    }

                    this.fieldAf = 1969895403;
                }

                if (var1.readUByte() == 1) {
                    if (var2 != 1) {
                        return;
                    }

                    var10001 = true;
                } else {
                    var10001 = false;
                }

                this.fieldBl = var10001;
            }

            if (this.type * -729517859 == 4) {
                if (var2 != 1) {
                    throw new IllegalStateException();
                }

                this.fieldBw = var1.readUShort() * -430265019;
                if ('\uffff' == this.fieldBw * -1926046323) {
                    this.fieldBw = 430265019;
                }

                this.fieldBm = var1.readString(635473265);
                this.fieldBr = var1.readUByte() * -2011961211;
                this.fieldBe = var1.readUByte() * 404843075;
                this.fieldBb = var1.readUByte() * 1068762391;
                this.fieldBc = var1.readUByte() == 1;
                this.fieldAh = var1.readInt((byte) -16) * -204360837;
            }

            if (3 == this.type * -729517859) {
                if (var2 != 1) {
                    throw new IllegalStateException();
                }

                this.fieldAh = var1.readInt((byte) -67) * -204360837;
                if (var1.readUByte() == 1) {
                    if (var2 != 1) {
                        return;
                    }

                    var10001 = true;
                } else {
                    var10001 = false;
                }

                this.fieldAl = var10001;
                this.fieldAq = var1.readUByte() * 353028707;
            }

            if (9 == this.type * -729517859) {
                if (var2 != 1) {
                    throw new IllegalStateException();
                }

                this.fieldAm = var1.readUByte() * 792091749;
                this.fieldAh = var1.readInt((byte) -14) * -204360837;
            }

            this.config = var1.g(-960002166) * -1072646957;
            this.fieldBa = var1.readString(63319751);
            int var3 = var1.readUByte();
            if (var3 > 0) {
                this.fieldBv = new String[var3];

                for (int var4 = 0; var4 < var3; ++var4) {
                    if (var2 != 1) {
                        throw new IllegalStateException();
                    }

                    this.fieldBv[var4] = var1.readString(1973575753);
                }
            }

            this.fieldBh = var1.readUByte() * 1576727845;
            this.fieldBj = var1.readUByte() * -1701682411;
            this.fieldBy = var1.readUByte() == 1;
            this.fieldCr = var1.readString(555889051);
            this.fieldCw = this.w(var1, -1828661431);
            this.fieldCj = this.w(var1, -551127998);
            this.fieldCb = this.w(var1, 205953463);
            this.fieldCk = this.w(var1, -145423278);
            this.fieldCp = this.w(var1, -829143517);
            this.fieldCg = this.w(var1, 54058203);
            this.fieldCv = this.w(var1, 614123650);
            this.fieldCx = this.w(var1, -1520415337);
            this.fieldCl = this.w(var1, 1561075192);
            this.fieldCz = this.w(var1, 366320987);
            this.fieldCd = this.w(var1, 729388780);
            this.fieldCq = this.w(var1, -1847803229);
            this.fieldCi = this.w(var1, 1549412884);
            this.fieldCf = this.w(var1, -674622170);
            this.fieldCo = this.w(var1, -653727607);
            this.fieldCh = this.w(var1, -2132244385);
            this.fieldCn = this.w(var1, -1149459757);
            this.fieldCm = this.w(var1, 1782513449);
            this.fieldCy = this.e(var1, (short) 15410);
            this.fieldCc = this.e(var1, (short) 22620);
            this.fieldCe = this.e(var1, (short) 3190);
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "ft.m(" + ')');
        }
    }

    public Model d(AnimationSequence var1, int var2, boolean var3, PlayerConfig var4, byte var5) {
        try {
            fieldS = false;
            int var6;
            int var7;
            if (var3) {
                var6 = this.fieldAk * 1686830619;
                var7 = this.fieldAj * 973076123;
            } else {
                var6 = this.fieldAd * -1111255667;
                var7 = this.fieldAu * -1801975607;
            }

            if (0 == var6) {
                return null;
            } else {
                if (var6 == 1) {
                    if (var7 == -1) {
                        return null;
                    }
                }
                Model var8 = (Model) fieldE.get((long) ((var6 << 16) + var7));
                if (var8 == null) {
                    classCy var9;
                    if (1 == var6) {
                        var9 = classCy.method285(classEr.fieldB, var7, 0);
                        if (null == var9) {
                            fieldS = true;
                            return null;
                        }
                        var8 = var9.p(64, 768, -50, -10, -50);
                    }
                    if (var6 == 2) {
                        var9 = classBo.getNpcDefinition(var7, 1388076150).w(1916874564);
                        if (var9 == null) {
                            fieldS = true;
                            return null;
                        }
                        var8 = var9.p(64, 768, -50, -10, -50);
                    }
                    if (var6 == 3) {
                        if (var4 == null) {
                            return null;
                        }
                        var9 = var4.e(359859939);
                        if (var9 == null) {
                            fieldS = true;
                            return null;
                        }
                        var8 = var9.p(64, 768, -50, -10, -50);
                    }
                    if (var6 == 4) {
                        ItemDefinition var10 = Client.getItemDefinition(var7, -1902322482);
                        var9 = var10.w(10, -2114803858);
                        if (null == var9) {
                            fieldS = true;
                            return null;
                        }
                        var8 = var9.p(var10.fieldAb * 1958041997 + 64, 768 + var10.fieldAc * -1786891637, -50, -10, -50);
                    }
                    fieldE.put(var8, (long) (var7 + (var6 << 16)));
                }
                if (var1 != null) {
                    var8 = var1.n(var8, var2, -950792229);
                }
                return var8;
            }
        } catch (RuntimeException var11) {
            throw ClanMate.error(var11, "ft.d(" + ')');
        }
    }

    public void n(int var1, int var2, int var3) {
        try {
            int var4 = this.itemIds[var2];
            this.itemIds[var2] = this.itemIds[var1];
            this.itemIds[var1] = var4;
            var4 = this.itemQuantities[var2];
            this.itemQuantities[var2] = this.itemQuantities[var1];
            this.itemQuantities[var1] = var4;
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "ft.n(" + ')');
        }
    }

    public Sprite s(boolean var1, short var2) {
        try {
            fieldS = false;
            int var3 = var1 ? this.enabledTextureId * -1254985103 : this.textureId * -749381271;
            if (var3 == -1) {
                return null;
            } else {
                long var10000 = (long) (this.fieldAw * -1468854195) << 40;
                long var10001 = this.hflipped ? 1L : 0L;
                var10001 <<= 39;
                long var10002 = (long) var3 + ((long) (this.fieldAt * 828601947) << 36);
                long var10003 = this.vflipped ? 1L : 0L;
                long spriteKey = var10000 + var10001 + var10002 + (var10003 << 38);
                Sprite var6 = (Sprite) spriteCache.get(spriteKey);
                if (var6 != null) {
                    return var6;
                }
                var6 = classBt.method256(classDc.fieldL, var3, 0, 917826030);
                if (var6 == null) {
                    fieldS = true;
                    return null;
                }
                if (this.vflipped) {
                    var6.w();
                }
                if (this.hflipped) {
                    var6.m();
                }
                if (this.fieldAt * 828601947 > 0) {
                    var6.l(this.fieldAt * 828601947);
                }
                if (this.fieldAt * 828601947 >= 1) {
                    var6.e(1);
                }
                if (this.fieldAt * 828601947 >= 2) {
                    var6.e(16777215);
                }
                if (0 != this.fieldAw * -1468854195) {
                    var6.n(this.fieldAw * -1468854195);
                }
                spriteCache.put(var6, spriteKey);
                return var6;
            }
        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "ft.s(" + ')');
        }
    }

    public classGm k(int var1) {
        try {
            fieldS = false;
            if (this.fieldBw * -1926046323 == -1) {
                if (var1 <= -1255940743) {
                    throw new IllegalStateException();
                } else {
                    return null;
                }
            } else {
                classGm var2 = (classGm) fieldN.get((long) (this.fieldBw * -1926046323));
                if (var2 != null) {
                    if (var1 <= -1255940743) {
                        throw new IllegalStateException();
                    } else {
                        return var2;
                    }
                } else {
                    var2 = Animation.method368(classDc.fieldL, UtilClass32.fieldM, this.fieldBw * -1926046323, 0, -1659684103);
                    if (null != var2) {
                        if (var1 <= -1255940743) {
                            throw new IllegalStateException();
                        }

                        fieldN.put(var2, (long) (this.fieldBw * -1926046323));
                    } else {
                        fieldS = true;
                    }

                    return var2;
                }
            }
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "ft.k(" + ')');
        }
    }

    public void o(int var1, String var2, int var3) {
        try {
            label46:
            {
                if (this.fieldBv != null) {
                    if (var3 == 1210139709) {
                        return;
                    }

                    if (this.fieldBv.length > var1) {
                        break label46;
                    }

                    if (var3 == 1210139709) {
                        throw new IllegalStateException();
                    }
                }

                String[] var4 = new String[var1 + 1];
                if (null != this.fieldBv) {
                    if (var3 == 1210139709) {
                        throw new IllegalStateException();
                    }

                    for (int var5 = 0; var5 < this.fieldBv.length; ++var5) {
                        if (var3 == 1210139709) {
                            return;
                        }

                        var4[var5] = this.fieldBv[var5];
                    }
                }

                this.fieldBv = var4;
            }

            this.fieldBv[var1] = var2;
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "ft.o(" + ')');
        }
    }

    Object[] w(Buffer var1, int var2) {
        try {
            int var3 = var1.readUByte();
            if (var3 == 0) {
                if (var2 == -366991577) {
                    throw new IllegalStateException();
                } else {
                    return null;
                }
            } else {
                Object[] var4 = new Object[var3];

                for (int var5 = 0; var5 < var3; ++var5) {
                    if (var2 == -366991577) {
                        throw new IllegalStateException();
                    }

                    int var6 = var1.readUByte();
                    if (0 == var6) {
                        if (var2 == -366991577) {
                            throw new IllegalStateException();
                        }

                        var4[var5] = new Integer(var1.readInt((byte) -32));
                    } else if (var6 == 1) {
                        var4[var5] = var1.readString(1510767535);
                    }
                }

                this.fieldCt = true;
                return var4;
            }
        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "ft.w(" + ')');
        }
    }

    int[] e(Buffer var1, short var2) {
        try {
            int var3 = var1.readUByte();
            if (var3 == 0) {
                if (var2 <= 1406) {
                    throw new IllegalStateException();
                } else {
                    return null;
                }
            } else {
                int[] var4 = new int[var3];

                for (int var5 = 0; var5 < var3; ++var5) {
                    if (var2 <= 1406) {
                        throw new IllegalStateException();
                    }

                    var4[var5] = var1.readInt((byte) -46);
                }

                return var4;
            }
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "ft.e(" + ')');
        }
    }
}
