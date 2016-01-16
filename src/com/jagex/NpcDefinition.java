package com.jagex;

import java.util.Date;

public class NpcDefinition extends DualNode {

    static Cache fieldI = new Cache(64);
    static ReferenceTable fieldA;
    static Cache fieldB = new Cache(50);
    public int id;
    public int fieldK = -1514178783;
    public int fieldAh = -1524640437;
    public int fieldD = -1303950509;
    public int fieldX = 1637074929;
    public int fieldO = -551353057;
    public int fieldQ = -1897165057;
    public int fieldS = -650995687;
    public int fieldW = -294100969;
    public String[] fieldG = new String[5];
    public int fieldAr = 398563424;
    public boolean fieldY = true;
    public int level = -166161559;
    public String fieldM = "null";
    public boolean fieldC = false;
    public int fieldF = 574214731;
    public int[] transformIds;
    public boolean interactable = true;
    public boolean fieldAm = true;
    public boolean fieldAx = false;
    public int healthBarWidth = -565683078;
    int[] fieldE;
    short[] fieldT;
    int transVarpbit = 996889557;
    short[] fieldU;
    int[] fieldN;
    int ySize = 1332151680;
    short[] fieldJ;
    int xSize = 205209472;
    int fieldAn = 0;
    int fieldAs = 0;
    short[] fieldH;
    int transVar = -2119355927;

    static final void method376(short var0) {
        try {
            if (Client.socketRelatedInt * 339818837 > 0) {
                classEp.method184((byte) -29);
            } else {
                UnknownEnum.method373(40, (byte) -12);
                Varp.fieldCf = Client.socket;
                Client.socket = null;
            }
        } catch (RuntimeException var1) {
            throw ClanMate.error(var1, "ax.j(" + ')');
        }
    }

    static void method377(AnimationSequence var0, int var1, int var2, int var3, byte var4) {
        try {
            if (Client.fieldNx * 1993078547 < 50) {
                if (Client.fieldNm * -1976627615 != 0) {
                    if (var0.fieldN != null) {
                        if (var1 < var0.fieldN.length) {
                            int var5 = var0.fieldN[var1];
                            if (var5 == 0) {
                                return;
                            }

                            int var6 = var5 >> 8;
                            int var7 = var5 >> 4 & 7;
                            int var8 = var5 & 15;
                            Client.fieldNp[Client.fieldNx * 1993078547] = var6;
                            Client.fieldNl[Client.fieldNx * 1993078547] = var7;
                            Client.fieldNw[Client.fieldNx * 1993078547] = 0;
                            Client.fieldNq[Client.fieldNx * 1993078547] = null;
                            int var9 = (var2 - 64) / 128;
                            int var10 = (var3 - 64) / 128;
                            Client.fieldNj[Client.fieldNx * 1993078547] = (var9 << 16) + (var10 << 8) + var8;
                            Client.fieldNx += 1441295131;
                            return;
                        }

                        if (var4 >= 16) {
                            return;
                        }
                    }

                    return;
                }

                if (var4 >= 16) {
                    throw new IllegalStateException();
                }
            }

        } catch (RuntimeException var11) {
            throw ClanMate.error(var11, "ax.r(" + ')');
        }
    }

    public static void method378(ReferenceTable var0, ReferenceTable var1, boolean var2, byte var3) {
        try {
            ObjectDefinition.objectDefinitionReferenceTable = var0;
            ObjectDefinition.fieldI = var1;
            ObjectDefinition.fieldA = var2;
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "ax.a(" + ')');
        }
    }

    public static String method379(long var0) {
        try {
            CalendarUtil.GTM_CALENDAR.setTime(new Date(var0));
            int var2 = CalendarUtil.GTM_CALENDAR.get(7);
            int var3 = CalendarUtil.GTM_CALENDAR.get(5);
            int var4 = CalendarUtil.GTM_CALENDAR.get(2);
            int var5 = CalendarUtil.GTM_CALENDAR.get(1);
            int var6 = CalendarUtil.GTM_CALENDAR.get(11);
            int var7 = CalendarUtil.GTM_CALENDAR.get(12);
            int var8 = CalendarUtil.GTM_CALENDAR.get(13);
            return CalendarUtil.DAYS[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + CalendarUtil.MONTHS[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
        } catch (RuntimeException var9) {
            throw ClanMate.error(var9, "ax.a(" + ')');
        }
    }

    static final void method380(boolean var0, int DUMMY) {
        try {
            Client.fieldDt = var0;
            int var2;
            int var3;
            int var4;
            int var5;
            int var6;
            int var7;
            int var9;
            int var10;
            int var11;
            if (!Client.fieldDt) {
                if (DUMMY != 68773785) {
                    throw new IllegalStateException();
                }

                var2 = Client.packet.aw((byte) 7);
                var3 = Client.packet.ap();
                var4 = (Client.fieldCb * 237192877 - Client.packet.caret * 651432265) / 16;
                classAw.fieldDw = new int[var4][4];

                for (var5 = 0; var5 < var4; ++var5) {
                    if (DUMMY != 68773785) {
                        throw new IllegalStateException();
                    }

                    for (var6 = 0; var6 < 4; ++var6) {
                        if (DUMMY != 68773785) {
                            throw new IllegalStateException();
                        }

                        classAw.fieldDw[var5][var6] = Client.packet.bl(-1405971742);
                    }
                }

                boolean var8;
                label293:
                {
                    var5 = Client.packet.ab(1502980410);
                    var6 = Client.packet.ac((byte) 53);
                    var7 = Client.packet.ab(714133882);
                    WidgetNode.fieldDq = new int[var4];
                    UtilClass38.fieldDh = new int[var4];
                    classEp.fieldDf = new int[var4];
                    DynamicObject.fieldDk = new byte[var4][];
                    ItemTable.fieldDr = new byte[var4][];
                    var8 = false;
                    if (48 != var3 / 8) {
                        if (DUMMY != 68773785) {
                            throw new IllegalStateException();
                        }

                        if (var3 / 8 != 49) {
                            break label293;
                        }
                    }

                    if (48 == var6 / 8) {
                        if (DUMMY != 68773785) {
                            return;
                        }

                        var8 = true;
                    }
                }

                if (var3 / 8 == 48) {
                    if (DUMMY != 68773785) {
                        throw new IllegalStateException();
                    }

                    if (148 == var6 / 8) {
                        var8 = true;
                    }
                }

                var4 = 0;

                for (var9 = (var3 - 6) / 8; var9 <= (var3 + 6) / 8; ++var9) {
                    if (DUMMY != 68773785) {
                        throw new IllegalStateException();
                    }

                    for (var10 = (var6 - 6) / 8; var10 <= (var6 + 6) / 8; ++var10) {
                        if (DUMMY != 68773785) {
                            throw new IllegalStateException();
                        }

                        var11 = var10 + (var9 << 8);
                        if (var8) {
                            if (49 == var10) {
                                continue;
                            }

                            if (DUMMY != 68773785) {
                                return;
                            }

                            if (149 == var10) {
                                continue;
                            }

                            if (DUMMY != 68773785) {
                                return;
                            }

                            if (var10 == 147) {
                                continue;
                            }

                            if (DUMMY != 68773785) {
                                return;
                            }

                            if (var9 == 50) {
                                continue;
                            }

                            if (var9 == 49) {
                                if (DUMMY != 68773785) {
                                    throw new IllegalStateException();
                                }

                                if (47 == var10) {
                                    if (DUMMY != 68773785) {
                                        throw new IllegalStateException();
                                    }
                                    continue;
                                }
                            }
                        }

                        WidgetNode.fieldDq[var4] = var11;
                        UtilClass38.fieldDh[var4] = UnknownEnum3.fieldBi.h("m" + var9 + "_" + var10, 1476710355);
                        classEp.fieldDf[var4] = UnknownEnum3.fieldBi.h("l" + var9 + "_" + var10, 1961013507);

                        System.out.println(var9 + "," + var10);
                        ++var4;
                    }
                }

                classBq.method265(var3, var6, var2, var5, var7, 1616651728);
            } else {
                var2 = Client.packet.readUShort();
                Client.packet.gm(1912332673);

                for (var3 = 0; var3 < 4; ++var3) {


                    for (var4 = 0; var4 < 13; ++var4) {


                        for (var5 = 0; var5 < 13; ++var5) {


                            var6 = Client.packet.gx(1, 1818659657);

                            if (1 == var6) {
                                Client.regionChunkIds[var3][var4][var5] = Client.packet.gx(26, -908135562);
                            } else {
                                Client.regionChunkIds[var3][var4][var5] = -1;
                            }
                        }
                    }
                }

                Client.packet.hd((byte) 77);
                var3 = (Client.fieldCb * 237192877 - 651432265 * Client.packet.caret) / 16;
                classAw.fieldDw = new int[var3][4];

                for (var4 = 0; var4 < var3; ++var4) {
                    for (var5 = 0; var5 < 4; ++var5) {
                        classAw.fieldDw[var4][var5] = Client.packet.readInt((byte) -86);
                    }
                }

                var4 = Client.packet.ab(653295774);
                var5 = Client.packet.ac((byte) 31);
                var6 = Client.packet.ab(1209452913);
                var7 = Client.packet.ao((byte) 48);
                WidgetNode.fieldDq = new int[var3];
                UtilClass38.fieldDh = new int[var3];
                classEp.fieldDf = new int[var3];
                DynamicObject.fieldDk = new byte[var3][];
                ItemTable.fieldDr = new byte[var3][];
                var3 = 0;

                for (int var18 = 0; var18 < 4; ++var18) {
                    for (var9 = 0; var9 < 13; ++var9) {
                        for (var10 = 0; var10 < 13; ++var10) {
                            var11 = Client.regionChunkIds[var18][var9][var10];
                            if (-1 != var11) {


                                int var12 = var11 >> 14 & 1023;
                                int var13 = var11 >> 3 & 2047;
                                int chunkId = (var12 / 8 << 8) + var13 / 8;

                                System.out.println("Chunk: " + chunkId + "(" + var12 + "," + var13 + ")");

                                int var15;
                                for (var15 = 0; var15 < var3; ++var15) {
                                    if (chunkId == WidgetNode.fieldDq[var15]) {
                                        chunkId = -1;
                                        break;
                                    }
                                }

                                if (-1 != chunkId) {
                                    if (DUMMY != 68773785) {
                                        throw new IllegalStateException();
                                    }

                                    WidgetNode.fieldDq[var3] = chunkId;
                                    int regionX = chunkId >> 8 & 255;
                                    int regionY = chunkId & 255;
                                    UtilClass38.fieldDh[var3] = UnknownEnum3.fieldBi.h("m" + regionX + "_" + regionX, 647579403);
                                    classEp.fieldDf[var3] = UnknownEnum3.fieldBi.h("l" + regionX + "_" + regionY, 1306145722);
                                    ++var3;
                                }
                            }
                        }
                    }
                }

                classBq.method265(var2, var6, var7, var4, var5, 1192389560);
            }

        } catch (RuntimeException var17) {
            throw ClanMate.error(var17, "ax.au(" + ')');
        }
    }

    void l(Buffer var1, int var2, int var3) {
        try {
            int var4;
            int var5;
            if (1 == var2) {
                if (var3 != -1661416579) {
                    throw new IllegalStateException();
                }

                var4 = var1.readUByte();
                this.fieldE = new int[var4];

                for (var5 = 0; var5 < var4; ++var5) {
                    this.fieldE[var5] = var1.readUShort();
                }
            } else if (2 == var2) {
                if (var3 != -1661416579) {
                    throw new IllegalStateException();
                }

                this.fieldM = var1.readString(1185127389);
            } else if (var2 == 12) {
                if (var3 != -1661416579) {
                    return;
                }

                this.fieldW = var1.readUByte() * -294100969;
            } else if (13 == var2) {
                if (var3 != -1661416579) {
                    throw new IllegalStateException();
                }

                this.fieldS = var1.readUShort() * 650995687;
            } else if (var2 == 14) {
                if (var3 != -1661416579) {
                    throw new IllegalStateException();
                }

                this.fieldD = var1.readUShort() * 1303950509;
            } else if (var2 == 15) {
                if (var3 != -1661416579) {
                    return;
                }

                this.fieldK = var1.readUShort() * 1514178783;
            } else if (16 == var2) {
                if (var3 != -1661416579) {
                    throw new IllegalStateException();
                }

                this.fieldF = var1.readUShort() * -574214731;
            } else if (17 == var2) {
                if (var3 != -1661416579) {
                    return;
                }

                this.fieldD = var1.readUShort() * 1303950509;
                this.fieldX = var1.readUShort() * -1637074929;
                this.fieldO = var1.readUShort() * 551353057;
                this.fieldQ = var1.readUShort() * 1897165057;
            } else {
                if (var2 >= 30) {
                    if (var3 != -1661416579) {
                        throw new IllegalStateException();
                    }

                    if (var2 < 35) {
                        if (var3 != -1661416579) {
                            throw new IllegalStateException();
                        }

                        this.fieldG[var2 - 30] = var1.readString(506521652);
                        if (this.fieldG[var2 - 30].equalsIgnoreCase(StringConstants.fieldB)) {
                            if (var3 != -1661416579) {
                                throw new IllegalStateException();
                            }

                            this.fieldG[var2 - 30] = null;
                        }

                        return;
                    }
                }

                if (var2 == 40) {
                    if (var3 != -1661416579) {
                        throw new IllegalStateException();
                    }

                    var4 = var1.readUByte();
                    this.fieldT = new short[var4];
                    this.fieldH = new short[var4];

                    for (var5 = 0; var5 < var4; ++var5) {
                        if (var3 != -1661416579) {
                            throw new IllegalStateException();
                        }

                        this.fieldT[var5] = (short) var1.readUShort();
                        this.fieldH[var5] = (short) var1.readUShort();
                    }
                } else if (var2 == 41) {
                    if (var3 != -1661416579) {
                        return;
                    }

                    var4 = var1.readUByte();
                    this.fieldU = new short[var4];
                    this.fieldJ = new short[var4];

                    for (var5 = 0; var5 < var4; ++var5) {
                        if (var3 != -1661416579) {
                            return;
                        }

                        this.fieldU[var5] = (short) var1.readUShort();
                        this.fieldJ[var5] = (short) var1.readUShort();
                    }
                } else if (var2 == 60) {
                    var4 = var1.readUByte();
                    this.fieldN = new int[var4];

                    for (var5 = 0; var5 < var4; ++var5) {
                        if (var3 != -1661416579) {
                            throw new IllegalStateException();
                        }

                        this.fieldN[var5] = var1.readUShort();
                    }
                } else if (var2 == 93) {
                    if (var3 != -1661416579) {
                        throw new IllegalStateException();
                    }

                    this.fieldY = false;
                } else if (var2 == 95) {
                    if (var3 != -1661416579) {
                        return;
                    }

                    this.level = var1.readUShort() * 166161559;
                } else if (97 == var2) {
                    this.xSize = var1.readUShort() * -1944553857;
                } else if (var2 == 98) {
                    this.ySize = var1.readUShort() * 1084149259;
                } else if (var2 == 99) {
                    if (var3 != -1661416579) {
                        throw new IllegalStateException();
                    }

                    this.fieldC = true;
                } else if (100 == var2) {
                    this.fieldAn = var1.readByte() * -1210151837;
                } else if (var2 == 101) {
                    if (var3 != -1661416579) {
                        throw new IllegalStateException();
                    }

                    this.fieldAs = var1.readByte() * -2134832355;
                } else if (102 == var2) {
                    if (var3 != -1661416579) {
                        throw new IllegalStateException();
                    }

                    this.fieldAh = var1.readUShort() * 1524640437;
                } else if (103 == var2) {
                    this.fieldAr = var1.readUShort() * 1623067843;
                } else if (106 == var2) {
                    if (var3 != -1661416579) {
                        throw new IllegalStateException();
                    }

                    this.transVarpbit = var1.readUShort() * -996889557;
                    if ('\uffff' == this.transVarpbit * -1079856509) {
                        if (var3 != -1661416579) {
                            throw new IllegalStateException();
                        }

                        this.transVarpbit = 996889557;
                    }

                    this.transVar = var1.readUShort() * 2119355927;
                    if ('\uffff' == this.transVar * -1881060953) {
                        if (var3 != -1661416579) {
                            throw new IllegalStateException();
                        }

                        this.transVar = -2119355927;
                    }

                    var4 = var1.readUByte();
                    this.transformIds = new int[var4 + 1];

                    for (var5 = 0; var5 <= var4; ++var5) {
                        if (var3 != -1661416579) {
                            throw new IllegalStateException();
                        }

                        this.transformIds[var5] = var1.readUShort();
                        if ('\uffff' == this.transformIds[var5]) {
                            if (var3 != -1661416579) {
                                throw new IllegalStateException();
                            }

                            this.transformIds[var5] = -1;
                        }
                    }
                } else if (var2 == 107) {
                    if (var3 != -1661416579) {
                        return;
                    }

                    this.interactable = false;
                } else if (var2 == 109) {
                    if (var3 != -1661416579) {
                        throw new IllegalStateException();
                    }

                    this.fieldAm = false;
                } else if (111 == var2) {
                    if (var3 != -1661416579) {
                        throw new IllegalStateException();
                    }

                    this.fieldAx = true;
                } else if (var2 == 112) {
                    if (var3 != -1661416579) {
                        throw new IllegalStateException();
                    }

                    this.healthBarWidth = var1.readUByte() * -1736843021;
                }
            }

        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "ax.l(" + ')');
        }
    }

    void b(Buffer var1, int var2) {
        try {
            while (true) {
                int var3 = var1.readUByte();
                if (0 == var3) {
                    if (var2 >= 370228815) {
                        throw new IllegalStateException();
                    }

                    return;
                }

                this.l(var1, var3, -1661416579);
            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "ax.b(" + ')');
        }
    }

    public final Model m(AnimationSequence var1, int var2, AnimationSequence var3, int var4, int var5) {
        try {
            if (this.transformIds != null) {
                NpcDefinition var13 = this.transform(1225710287);
                if (var13 == null) {
                    return null;
                } else {
                    return var13.m(var1, var2, var3, var4, 2071633458);
                }
            } else {
                Model var6 = (Model) fieldB.get((long) (this.id * 753371259));
                if (null == var6) {
                    boolean var7 = false;
                    for (int aFieldE : this.fieldE) {
                        if (!UtilClass22.fieldV.l(aFieldE, 0, -1186854221)) {
                            var7 = true;
                        }
                    }

                    if (var7) {
                        return null;
                    }

                    classCy[] var9 = new classCy[this.fieldE.length];

                    int var10;
                    for (var10 = 0; var10 < this.fieldE.length; ++var10) {
                        var9[var10] = classCy.method285(UtilClass22.fieldV, this.fieldE[var10], 0);
                    }

                    classCy var14;
                    if (var9.length == 1) {
                        var14 = var9[0];
                    } else {
                        var14 = new classCy(var9, var9.length);
                    }

                    if (this.fieldT != null) {
                        for (var10 = 0; var10 < this.fieldT.length; ++var10) {
                            var14.o(this.fieldT[var10], this.fieldH[var10]);
                        }
                    }

                    if (null != this.fieldU) {
                        for (var10 = 0; var10 < this.fieldU.length; ++var10) {
                            var14.q(this.fieldU[var10], this.fieldJ[var10]);
                        }
                    }

                    var6 = var14.p(this.fieldAn * -586132149 + 64, 850 + this.fieldAs * 1668434953, -30, -50, -30);
                    fieldB.put(var6, (long) (this.id * 753371259));
                }

                Model var12;
                if (null != var1 && null != var3) {
                    var12 = var1.e(var6, var2, var3, var4, -1527660038);
                } else if (var1 != null) {
                    var12 = var1.l(var6, var2, 466184112);
                } else if (var3 != null) {
                    var12 = var3.l(var6, var4, -185986997);
                } else {
                    var12 = var6.i(true);
                }

                if (this.xSize * -294827649 == 128 && 128 == this.ySize * -1842557533) {
                    return var12;
                }

                var12.h(this.xSize * -294827649, this.ySize * -1842557533, this.xSize * -294827649);
                return var12;
            }
        } catch (RuntimeException var11) {
            throw ClanMate.error(var11, "ax.m(" + ')');
        }
    }

    public final classCy w(int var1) {
        try {
            if (this.transformIds != null) {
                if (var1 != 1916874564) {
                    throw new IllegalStateException();
                } else {
                    NpcDefinition var7 = this.transform(2065228263);
                    if (var7 == null) {
                        if (var1 != 1916874564) {
                            throw new IllegalStateException();
                        } else {
                            return null;
                        }
                    } else {
                        return var7.w(1916874564);
                    }
                }
            } else if (null == this.fieldN) {
                if (var1 != 1916874564) {
                    throw new IllegalStateException();
                } else {
                    return null;
                }
            } else {
                boolean var2 = false;

                for (int var3 = 0; var3 < this.fieldN.length; ++var3) {
                    if (var1 != 1916874564) {
                        throw new IllegalStateException();
                    }

                    if (!UtilClass22.fieldV.l(this.fieldN[var3], 0, -797972025)) {
                        if (var1 != 1916874564) {
                            throw new IllegalStateException();
                        }

                        var2 = true;
                    }
                }

                if (var2) {
                    if (var1 != 1916874564) {
                        throw new IllegalStateException();
                    } else {
                        return null;
                    }
                } else {
                    classCy[] var8 = new classCy[this.fieldN.length];

                    for (int var4 = 0; var4 < this.fieldN.length; ++var4) {
                        if (var1 != 1916874564) {
                            throw new IllegalStateException();
                        }

                        var8[var4] = classCy.method285(UtilClass22.fieldV, this.fieldN[var4], 0);
                    }

                    classCy var9;
                    if (1 == var8.length) {
                        if (var1 != 1916874564) {
                            throw new IllegalStateException();
                        }

                        var9 = var8[0];
                    } else {
                        var9 = new classCy(var8, var8.length);
                    }

                    int var5;
                    if (null != this.fieldT) {
                        if (var1 != 1916874564) {
                            throw new IllegalStateException();
                        }

                        for (var5 = 0; var5 < this.fieldT.length; ++var5) {
                            if (var1 != 1916874564) {
                                throw new IllegalStateException();
                            }

                            var9.o(this.fieldT[var5], this.fieldH[var5]);
                        }
                    }

                    if (this.fieldU != null) {
                        if (var1 != 1916874564) {
                            throw new IllegalStateException();
                        }

                        for (var5 = 0; var5 < this.fieldU.length; ++var5) {
                            if (var1 != 1916874564) {
                                throw new IllegalStateException();
                            }

                            var9.q(this.fieldU[var5], this.fieldJ[var5]);
                        }
                    }

                    return var9;
                }
            }
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "ax.w(" + ')');
        }
    }

    public final NpcDefinition transform(int var1) {
        try {
            int var2 = -1;
            if (this.transVarpbit * -1079856509 != -1) {
                var2 = Keyboard.getVarpbitValue(this.transVarpbit * -1079856509, 1350194799);
            } else if (this.transVar * -1881060953 != -1) {
                var2 = UtilClass27.vars[this.transVar * -1881060953];
            }

            if (var2 >= 0) {
                if (var2 < this.transformIds.length) {
                    if (this.transformIds[var2] != -1) {
                        return classBo.getNpcDefinition(this.transformIds[var2], 2140916852);
                    }
                }
            }

            return null;
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "ax.e(" + ')');
        }
    }

    public boolean canTransform(byte DUMMY) {
        try {
            if (null == this.transformIds) {
                return true;
            } else {
                int var2 = -1;
                if (this.transVarpbit * -1079856509 != -1) {
                    var2 = Keyboard.getVarpbitValue(this.transVarpbit * -1079856509, 1350194799);
                } else if (this.transVar * -1881060953 != -1) {
                    var2 = UtilClass27.vars[this.transVar * -1881060953];
                }
                return var2 >= 0 && var2 < this.transformIds.length && this.transformIds[var2] != -1;
            }
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "ax.n(" + ')');
        }
    }

    void i(byte var1) {
        try {
            ;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "ax.i(" + ')');
        }
    }
}
