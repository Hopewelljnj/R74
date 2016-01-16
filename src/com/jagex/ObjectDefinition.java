package com.jagex;

import java.awt.*;

public class ObjectDefinition extends DualNode {

    public static Cache fieldL = new Cache(500);
    static ReferenceTable objectDefinitionReferenceTable;
    static ReferenceTable fieldI;
    static Cache objectDefinitionCache = new Cache(64);
    static Cache fieldW = new Cache(30);
    static classCy[] fieldE = new classCy[4];
    public static classGm font_p11full;
    static boolean fieldA = false;
    static Widget fieldIu;
    static Cache fieldM = new Cache(30);
    public int fieldU = 491254494;
    public int id;
    public int hintIconId = -1980752465;
    public int sizeX = 185953465;
    public int sizeY = -1904935735;
    public boolean fieldAl = true;
    public boolean fieldJ = true;
    public int fieldG = -305171085;
    public boolean fieldR = false;
    public int wallThickness = 257546160;
    public String[] actions = new String[5];
    public int fieldAj = 0;
    public int animationId = 2118472049;
    public String name = "null";
    public boolean fieldAt = false;
    public int fieldAo = -2007857941;
    public int[] transformIds;
    public int[] fieldAc;
    public int fieldAk = -1061618737;
    public int fieldAf = 0;
    public int fieldAb = 0;
    public int objectIcon = 1110127897;
    int[] fieldK;
    int fieldAa = 0;
    short[] fieldX;
    int[] fieldS;
    int fieldY = 703996935;
    int fieldAx = 193203328;
    short[] fieldD;
    short[] fieldQ;
    int fieldAz = 0;
    boolean fieldP = false;
    short[] fieldO;
    int fieldAn = 0;
    int fieldAs = 0;
    boolean fieldAv = false;
    int transVarpbit = -977731905;
    int fieldAm = 447958400;
    int fieldAi = 0;
    boolean fieldAw = false;
    int transVarp = -1597778363;
    int fieldAq = -1845417856;

    public static void method357(int var0) {
        try {
            NpcDefinition.fieldI.clear();
            NpcDefinition.fieldB.clear();
        } catch (RuntimeException var1) {
            throw ClanMate.error(var1, "az.s(" + ')');
        }
    }

    public static String method358(Buffer var0, int var1) {
        try {
            String var2;
            try {
                int var3 = var0.readImmediateSmart(2002032739);
                if (var3 > 32767) {
                    if (var1 == 651432265) {
                        throw new IllegalStateException();
                    }

                    var3 = 32767;
                }

                byte[] var4 = new byte[var3];
                var0.caret += Client.csInstance.v(var0.payload, var0.caret * 651432265, var4, 0, var3, (byte) 15) * -99503879;
                String var5 = ExchangeOfferData.method37(var4, 0, var3, (byte) 78);
                var2 = var5;
            } catch (Exception var6) {
                var2 = "Cabbage";
            }

            return var2;
        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "az.a(" + ')');
        }
    }

    public static GameType[] getGameTypeValues(byte var0) {
        try {
            return new GameType[]{GameType.STELLARDAWN, GameType.RUNESCAPE, GameType.GAME4, GameType.GAME3, GameType.OLDSCAPE, GameType.GAME5};
        } catch (RuntimeException var1) {
            throw ClanMate.error(var1, "az.a(" + ')');
        }
    }

    public final Model s(int objectType, int rotation, int[][] var3, int var4, int var5, int var6, AnimationSequence var7, int var8, int var9) {
        try {
            long var10;
            if (this.fieldK == null) {
                if (var9 <= -1815264384) {
                    throw new IllegalStateException();
                }

                var10 = (long) ((this.id * -1697158621 << 10) + rotation);
            } else {
                var10 = (long) (rotation + (objectType << 3) + (this.id * -1697158621 << 10));
            }

            Model var12 =  (Model) fieldW.get(var10);
            if (var12 == null) {
                if (var9 <= -1815264384) {
                    throw new IllegalStateException();
                }

                classCy var13 = this.k(objectType, rotation, -2119390742);
                if (null == var13) {
                    return null;
                }

                var12 = var13.p(this.fieldAn * 1390482661 + 64, this.fieldAs * 336994717 + 768, -50, -10, -50);
                fieldW.put(var12, var10);
            }

            if (var7 == null) {
                if (var9 <= -1815264384) {
                    throw new IllegalStateException();
                }

                if (this.fieldY * -905447863 == -1) {
                    if (var9 <= -1815264384) {
                        throw new IllegalStateException();
                    }

                    return var12;
                }
            }

            if (var7 != null) {
                if (var9 <= -1815264384) {
                    throw new IllegalStateException();
                }

                var12 = var7.m(var12, var8, rotation, -1301976576);
            } else {
                var12 = var12.i(true);
            }

            if (this.fieldY * -905447863 >= 0) {
                if (var9 <= -1815264384) {
                    throw new IllegalStateException();
                }

                var12 = var12.a(var3, var4, var5, var6, false, this.fieldY * -905447863);
            }

            return var12;
        } catch (RuntimeException var14) {
            throw ClanMate.error(var14, "az.s(" + ')');
        }
    }

    public final boolean w(int var1) {
        try {
            if (null == this.fieldS) {
                if (var1 <= 1722952660) {
                    throw new IllegalStateException();
                } else {
                    return true;
                }
            } else {
                boolean var2 = true;

                for (int var3 = 0; var3 < this.fieldS.length; ++var3) {
                    if (var1 <= 1722952660) {
                        throw new IllegalStateException();
                    }

                    var2 &= fieldI.l(this.fieldS[var3] & '\uffff', 0, -1355169400);
                }

                return var2;
            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "az.w(" + ')');
        }
    }

    public final Renderable e(int var1, int var2, int[][] var3, int var4, int var5, int var6, int var7) {
        try {
            long var8;
            if (null == this.fieldK) {
                var8 = (long) (var2 + (this.id * -1697158621 << 10));
            } else {
                var8 = (long) ((this.id * -1697158621 << 10) + (var1 << 3) + var2);
            }

            Object var10 = (Renderable) fieldM.get(var8);
            if (null == var10) {
                classCy var11 = this.k(var1, var2, -2096394940);
                if (null == var11) {
                    return null;
                }

                if (!this.fieldP) {
                    var10 = var11.p(64 + this.fieldAn * 1390482661, 768 + this.fieldAs * 336994717, -50, -10, -50);
                } else {
                    var11.fieldAm = (short) (64 + this.fieldAn * 1390482661);
                    var11.fieldAx = (short) (768 + this.fieldAs * 336994717);
                    var11.u();
                    var10 = var11;
                }

                fieldM.put((DualNode) var10, var8);
            }

            if (this.fieldP) {
                var10 = ((classCy) var10).m();
            }

            if (this.fieldY * -905447863 >= 0) {
                if (var10 instanceof Model) {
                    var10 = ((Model) var10).a(var3, var4, var5, var6, true, this.fieldY * -905447863);
                } else if (var10 instanceof classCy) {
                    var10 = ((classCy) var10).e(var3, var4, var5, var6, true, this.fieldY * -905447863);
                }
            }

            return (Renderable) var10;
        } catch (RuntimeException var12) {
            throw ClanMate.error(var12, "az.e(" + ')');
        }
    }

    public final Model n(int objectType, int rotation, int[][] heights, int var4, int avgHeight, int var6, byte DUMMY) {

        try {
            long var8;
            if (null == this.fieldK) {
                if (DUMMY != 16) {
                    throw new IllegalStateException();
                }

                var8 = (long) ((this.id * -1697158621 << 10) + rotation);
            } else {
                var8 = (long) (rotation + (objectType << 3) + (this.id * -1697158621 << 10));
            }

            Model var10 = (Model) fieldW.get(var8);
            if (null == var10) {
                classCy var11 = this.k(objectType, rotation, 401830472);
                if (var11 == null) {
                    if (DUMMY != 16) {
                        throw new IllegalStateException();
                    }

                    return null;
                }

                var10 = var11.p(64 + this.fieldAn * 1390482661, this.fieldAs * 336994717 + 768, -50, -10, -50);
                fieldW.put(var10, var8);
            }

            if (this.fieldY * -905447863 >= 0) {
                if (DUMMY != 16) {
                    throw new IllegalStateException();
                }

                var10 = var10.a(heights, var4, avgHeight, var6, true, this.fieldY * -905447863);
            }

            if(UtilClass43.spawning) {
                var10.hardColor = true;
                var10.color = Color.YELLOW.getRGB();
            }

            return var10;
        } catch (RuntimeException var12) {
            throw ClanMate.error(var12, "az.n(" + ')');
        }
    }

    public final boolean m(int var1, byte var2) {
        try {
            if (this.fieldK != null) {
                for (int var6 = 0; var6 < this.fieldK.length; ++var6) {
                    if (var2 == 4) {
                        throw new IllegalStateException();
                    }

                    if (this.fieldK[var6] == var1) {
                        if (var2 == 4) {
                            throw new IllegalStateException();
                        }

                        return fieldI.l(this.fieldS[var6] & '\uffff', 0, -2068069720);
                    }
                }

                return true;
            } else if (null == this.fieldS) {
                if (var2 == 4) {
                    throw new IllegalStateException();
                } else {
                    return true;
                }
            } else if (var1 != 10) {
                if (var2 == 4) {
                    throw new IllegalStateException();
                } else {
                    return true;
                }
            } else {
                boolean var3 = true;

                for (int var4 = 0; var4 < this.fieldS.length; ++var4) {
                    var3 &= fieldI.l(this.fieldS[var4] & '\uffff', 0, -810044249);
                }

                return var3;
            }
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "az.m(" + ')');
        }
    }

    public final ObjectDefinition transform(int var1) {
        try {

            int transId = -1;

            if (-1 != this.transVarpbit * -700019007) {
                transId = Keyboard.getVarpbitValue(this.transVarpbit * -700019007, 1350194799);
            } else if (-1 != this.transVarp * 2011902835) {
                transId = UtilClass27.vars[this.transVarp * 2011902835];
            }

            if (transId >= 0) {
                if (transId < this.transformIds.length) {
                    if (-1 != this.transformIds[transId]) {
                        return PlayerConfig.getObjectDef(this.transformIds[transId], -296393604);
                    }
                }
            }

            return null;

        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "az.f(" + ')');
        }
    }

    void i(int var1) {
        try {
            if (this.fieldG * 243222597 == -1) {
                this.fieldG = 0;
                if (this.fieldS != null) {
                    label75: {
                        if (null != this.fieldK && this.fieldK[0] != 10)
                            break label75;
                        this.fieldG = 305171085; // = 1
                    }
                }
                for (int var2 = 0; var2 < 5; ++var2) {
                    if (null != this.actions[var2])
                        this.fieldG = 305171085; // = 1
                }
            }
            if (-1 == this.fieldAo * 2025716797)
                this.fieldAo = (0 != this.fieldU * 2025817487 ? 1 : 0) * 2007857941;
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "az.i(" + ')');
        }
    }

    final classCy k(int objectType, int rotation, int pred) {
   //     System.out.println(objectType + "," + rotation);
       // if(true) return null;
        try {
            classCy var4 = null;
            boolean var5;
            int var6;
            int var8;
            if (null == this.fieldK) {
                if (objectType != 10 || this.fieldS == null)
                    return null;
                var5 = this.fieldAv;
                var6 = this.fieldS.length;

                for (int var7 = 0; var7 < var6; ++var7) {
                    var8 = this.fieldS[var7];
                    if (var5)
                        var8 += 65536;
                    var4 = (classCy) fieldL.get((long) var8);
                    if (var4 == null) {
                        var4 = classCy.method285(fieldI, var8 & '\uffff', 0);
                        if (var4 == null)
                            return null;
                        if (var5)
                            var4.t();
                        fieldL.put(var4, (long) var8);
                    }
                    if (var6 > 1)
                        fieldE[var7] = var4;
                }
                if (var6 > 1)
                    var4 = new classCy(fieldE, var6);
            } else {
                int var10 = -1;
                for (var6 = 0; var6 < this.fieldK.length; ++var6) {
                    if (this.fieldK[var6] == objectType) {
                        var10 = var6;
                        break;
                    }
                }
                if (var10 == -1)
                    return null;
                var6 = this.fieldS[var10];
                boolean var11 = this.fieldAv ^ rotation > 3;
                if (var11)
                    var6 += 65536;
                var4 = (classCy) fieldL.get((long) var6);
                if (null == var4) {
                    var4 = classCy.method285(fieldI, var6 & '\uffff', 0);
                    if (null == var4)
                        return null;
                    if (var11)
                        var4.t();
                    fieldL.put(var4, (long) var6);
                }
            }

            label322:
            {
                if (this.fieldAq * 732202673 == 128 && this.fieldAm * -1062662253 == 128 && this.fieldAx * -237775831 == 128) {
                    var5 = false;
                    break label322;
                }
                var5 = true;
            }

            boolean var12;
            label313:
            {
                if (0 == this.fieldAz * 404817683 && this.fieldAi * 1867022733 == 0 && 0 == this.fieldAa * -520437159) {
                    var12 = false;
                    break label313;
                }
                var12 = true;
            }

            classCy var14;
            boolean var10003;
            label305:
            {
                if (0 == rotation && !var5 && !var12) {
                    var10003 = true;
                    break label305;
                }
                var10003 = false;
            }
            var14 = new classCy(var4, var10003, this.fieldD == null, null == this.fieldO, true);
            classCy var13 = var14;
            if (objectType == 4 && rotation > 3) {
                var13.d(256);
                var13.x(45, 0, -45);
            }
            rotation &= 3;
            if (1 == rotation) {
                var13.s();
            } else if (rotation == 2) {
                var13.k();
            } else if (3 == rotation) {
                var13.f();
            }
            if (null != this.fieldD) {
                for (var8 = 0; var8 < this.fieldD.length; ++var8)
                    var13.o(this.fieldD[var8], this.fieldX[var8]);
            }
            if (this.fieldO != null) {
                for (var8 = 0; var8 < this.fieldO.length; ++var8)
                    var13.q(this.fieldO[var8], this.fieldQ[var8]);
            }
            if (var5)
                var13.h(this.fieldAq * 732202673, this.fieldAm * -1062662253, this.fieldAx * -237775831);
            if (var12)
                var13.x(this.fieldAz * 404817683, this.fieldAi * 1867022733, this.fieldAa * -520437159);
            return var13;
        } catch (RuntimeException var9) {
            throw ClanMate.error(var9, "az.k(" + ')');
        }
    }

    public boolean x(int var1) {
        try {
            if (this.transformIds == null) {
                if (var1 != 1425122944) {
                    throw new IllegalStateException();
                } else {
                    boolean var10000;
                    if (this.fieldAk * 1847448785 == -1) {
                        if (var1 != 1425122944) {
                            throw new IllegalStateException();
                        }

                        if (null == this.fieldAc) {
                            var10000 = false;
                            return var10000;
                        }

                        if (var1 != 1425122944) {
                            throw new IllegalStateException();
                        }
                    }

                    var10000 = true;
                    return var10000;
                }
            } else {
                int var2 = 0;

                while (true) {
                    if (var2 >= this.transformIds.length) {
                        return false;
                    }

                    if (this.transformIds[var2] != -1) {
                        if (var1 != 1425122944) {
                            throw new IllegalStateException();
                        }

                        ObjectDefinition var3 = PlayerConfig.getObjectDef(this.transformIds[var2], 1311121385);
                        if (-1 != var3.fieldAk * 1847448785) {
                            break;
                        }

                        if (var1 != 1425122944) {
                            throw new IllegalStateException();
                        }

                        if (var3.fieldAc != null) {
                            if (var1 != 1425122944) {
                                throw new IllegalStateException();
                            }
                            break;
                        }
                    }

                    ++var2;
                }

                return true;
            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "az.x(" + ')');
        }
    }

    void l(Buffer var1, int var2, short var3) {
        try {
            int var4;
            int var5;
            if (var2 == 1) {
                if (var3 != 321) {
                    throw new IllegalStateException();
                }

                var4 = var1.readUByte();
                if (var4 > 0) {
                    if (var3 != 321) {
                        return;
                    }

                    if (null != this.fieldS) {
                        if (!fieldA) {
                            var1.caret += var4 * -298511637;
                            return;
                        }
                    }

                    this.fieldK = new int[var4];
                    this.fieldS = new int[var4];

                    for (var5 = 0; var5 < var4; ++var5) {
                        this.fieldS[var5] = var1.readUShort();
                        this.fieldK[var5] = var1.readUByte();
                    }
                }
            } else if (var2 == 2) {
                if (var3 != 321) {
                    throw new IllegalStateException();
                }

                this.name = var1.readString(1007067529);
            } else if (var2 == 5) {
                if (var3 != 321) {
                    throw new IllegalStateException();
                }

                var4 = var1.readUByte();
                if (var4 > 0) {
                    if (var3 != 321) {
                        throw new IllegalStateException();
                    }

                    if (null != this.fieldS) {
                        if (!fieldA) {
                            var1.caret += var4 * -199007758;
                            return;
                        }

                        if (var3 != 321) {
                            throw new IllegalStateException();
                        }
                    }

                    this.fieldK = null;
                    this.fieldS = new int[var4];

                    for (var5 = 0; var5 < var4; ++var5) {
                        if (var3 != 321) {
                            throw new IllegalStateException();
                        }

                        this.fieldS[var5] = var1.readUShort();
                    }
                }
            } else if (var2 == 14) {
                if (var3 != 321) {
                    throw new IllegalStateException();
                }

                this.sizeX = var1.readUByte() * 185953465;
            } else if (var2 == 15) {
                if (var3 != 321) {
                    return;
                }

                this.sizeY = var1.readUByte() * -1904935735;
            } else if (var2 == 17) {
                this.fieldU = 0;
                this.fieldJ = false;
            } else if (18 == var2) {
                if (var3 != 321) {
                    throw new IllegalStateException();
                }

                this.fieldJ = false;
            } else if (var2 == 19) {
                this.fieldG = var1.readUByte() * 305171085;
            } else if (21 == var2) {
                this.fieldY = 0;
            } else if (22 == var2) {
                if (var3 != 321) {
                    throw new IllegalStateException();
                }

                this.fieldP = true;
            } else if (23 == var2) {
                if (var3 != 321) {
                    return;
                }

                this.fieldR = true;
            } else if (var2 == 24) {
                if (var3 != 321) {
                    throw new IllegalStateException();
                }

                this.animationId = var1.readUShort() * -2118472049;
                if (this.animationId * 1563734127 == '\uffff') {
                    if (var3 != 321) {
                        return;
                    }

                    this.animationId = 2118472049;
                }
            } else if (var2 == 27) {
                this.fieldU = -1901856401;
            } else if (var2 == 28) {
                if (var3 != 321) {
                    throw new IllegalStateException();
                }

                this.wallThickness = var1.readUByte() * -1862951557;
            } else if (var2 == 29) {
                this.fieldAn = var1.readByte() * 1980664045;
            } else if (39 == var2) {
                if (var3 != 321) {
                    throw new IllegalStateException();
                }

                this.fieldAs = var1.readByte() * -674849363;
            } else if (var2 >= 30 && var2 < 35) {
                this.actions[var2 - 30] = var1.readString(-323863011);
                if (this.actions[var2 - 30].equalsIgnoreCase(StringConstants.fieldB)) {
                    if (var3 != 321) {
                        throw new IllegalStateException();
                    }

                    this.actions[var2 - 30] = null;
                }
            } else if (40 == var2) {
                var4 = var1.readUByte();
                this.fieldD = new short[var4];
                this.fieldX = new short[var4];

                for (var5 = 0; var5 < var4; ++var5) {
                    if (var3 != 321) {
                        return;
                    }

                    this.fieldD[var5] = (short) var1.readUShort();
                    this.fieldX[var5] = (short) var1.readUShort();
                }
            } else if (41 == var2) {
                var4 = var1.readUByte();
                this.fieldO = new short[var4];
                this.fieldQ = new short[var4];

                for (var5 = 0; var5 < var4; ++var5) {
                    this.fieldO[var5] = (short) var1.readUShort();
                    this.fieldQ[var5] = (short) var1.readUShort();
                }
            } else if (60 == var2) {
                if (var3 != 321) {
                    throw new IllegalStateException();
                }

                this.hintIconId = var1.readUShort() * 1980752465;
            } else if (62 == var2) {
                if (var3 != 321) {
                    throw new IllegalStateException();
                }

                this.fieldAv = true;
            } else if (var2 == 64) {
                if (var3 != 321) {
                    throw new IllegalStateException();
                }

                this.fieldAl = false;
            } else if (var2 == 65) {
                if (var3 != 321) {
                    throw new IllegalStateException();
                }

                this.fieldAq = var1.readUShort() * 656671313;
            } else if (66 == var2) {
                if (var3 != 321) {
                    return;
                }

                this.fieldAm = var1.readUShort() * -1405786469;
            } else if (67 == var2) {
                if (var3 != 321) {
                    return;
                }

                this.fieldAx = var1.readUShort() * -1810429927;
            } else if (var2 == 68) {
                this.objectIcon = var1.readUShort() * -1110127897;
            } else if (69 == var2) {
                if (var3 != 321) {
                    throw new IllegalStateException();
                }

                var1.readUByte();
            } else if (70 == var2) {
                if (var3 != 321) {
                    return;
                }

                this.fieldAz = var1.j((byte) 1) * 982375195;
            } else if (var2 == 71) {
                if (var3 != 321) {
                    return;
                }

                this.fieldAi = var1.j((byte) 1) * 1986767173;
            } else if (72 == var2) {
                if (var3 != 321) {
                    return;
                }

                this.fieldAa = var1.j((byte) 1) * -1562876439;
            } else if (var2 == 73) {
                if (var3 != 321) {
                    throw new IllegalStateException();
                }

                this.fieldAt = true;
            } else if (var2 == 74) {
                if (var3 != 321) {
                    return;
                }

                this.fieldAw = true;
            } else if (var2 == 75) {
                if (var3 != 321) {
                    return;
                }

                this.fieldAo = var1.readUByte() * 2007857941;
            } else if (77 == var2) {
                if (var3 != 321) {
                    throw new IllegalStateException();
                }

                this.transVarpbit = var1.readUShort() * 977731905;
                if ('\uffff' == this.transVarpbit * -700019007) {
                    if (var3 != 321) {
                        throw new IllegalStateException();
                    }

                    this.transVarpbit = -977731905;
                }

                this.transVarp = var1.readUShort() * 1597778363;
                if (this.transVarp * 2011902835 == '\uffff') {
                    if (var3 != 321) {
                        throw new IllegalStateException();
                    }

                    this.transVarp = -1597778363;
                }

                var4 = var1.readUByte();
                this.transformIds = new int[var4 + 1];

                for (var5 = 0; var5 <= var4; ++var5) {
                    if (var3 != 321) {
                        throw new IllegalStateException();
                    }

                    this.transformIds[var5] = var1.readUShort();
                    if (this.transformIds[var5] == '\uffff') {
                        if (var3 != 321) {
                            return;
                        }

                        this.transformIds[var5] = -1;
                    }
                }
            } else if (78 == var2) {
                if (var3 != 321) {
                    return;
                }

                this.fieldAk = var1.readUShort() * 1061618737;
                this.fieldAj = var1.readUByte() * -2021113321;
            } else if (var2 == 79) {
                this.fieldAf = var1.readUShort() * 1020280521;
                this.fieldAb = var1.readUShort() * 438333831;
                this.fieldAj = var1.readUByte() * -2021113321;
                var4 = var1.readUByte();
                this.fieldAc = new int[var4];

                for (var5 = 0; var5 < var4; ++var5) {
                    if (var3 != 321) {
                        throw new IllegalStateException();
                    }

                    this.fieldAc[var5] = var1.readUShort();
                }
            } else if (var2 == 81) {
                this.fieldY = var1.readUByte() * 165411072;
            }

        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "az.l(" + ')');
        }
    }

    void b(Buffer var1, int var2) {
        try {
            while (true) {
                int var3 = var1.readUByte();
                if (var3 == 0) {
                    if (var2 != -1835840598) {
                        return;
                    }

                    return;
                }

                this.l(var1, var3, (short) 321);
            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "az.b(" + ')');
        }
    }
}
