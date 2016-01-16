package com.jagex;

public class classFm extends classBz {

    public static ReferenceTableSub fieldBc;
    int[] fieldZ = new int[16];
    int[] fieldN = new int[16];
    classFr fieldAq = new classFr(this);
    int[] fieldB = new int[16];
    int[] fieldL = new int[16];
    int[] fieldM = new int[16];
    int[] fieldE = new int[16];
    int fieldI = 1174054976;
    NodeTable fieldA = new NodeTable(128);
    int[] fieldK = new int[16];
    int[] fieldF = new int[16];
    int[] fieldD = new int[16];
    int[] fieldJ = new int[16];
    int[] fieldG = new int[16];
    long fieldAv;
    int[] fieldP = new int[16];
    int[] fieldR = new int[16];
    int fieldV = -979943680;
    int[] fieldS = new int[16];
    classFy[][] fieldAn = new classFy[16][128];
    classFd fieldAs = new classFd();
    boolean fieldAh;
    int fieldAr;
    int[] fieldY = new int[16];
    classFy[][] fieldC = new classFy[16][128];
    long fieldAl;
    int fieldAe;


    public classFm() {
        this.ax('\uffff');
    }

    public static boolean method10(char var0, byte var1) {
        try {
            return var0 >= 48 && var0 <= 57;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "fm.n(" + ')');
        }
    }

    public static String method11(byte[] var0, int var1, int var2, int var3) {
        try {
            char[] var4 = new char[var2];
            int var5 = 0;
            int var6 = var1;

            int var9;
            for (int var7 = var1 + var2; var6 < var7; var4[var5++] = (char) var9) {
                if (var3 >= '\uff00') {
                    throw new IllegalStateException();
                }

                int var8 = var0[var6++] & 255;
                if (var8 < 128) {
                    if (0 == var8) {
                        if (var3 >= '\uff00') {
                            throw new IllegalStateException();
                        }

                        var9 = '\ufffd';
                    } else {
                        var9 = var8;
                    }
                } else if (var8 < 192) {
                    if (var3 >= '\uff00') {
                        throw new IllegalStateException();
                    }

                    var9 = '\ufffd';
                } else if (var8 < 224) {
                    if (var3 >= '\uff00') {
                        throw new IllegalStateException();
                    }

                    if (var6 < var7 && (var0[var6] & 192) == 128) {
                        if (var3 >= '\uff00') {
                            throw new IllegalStateException();
                        }

                        var9 = (var8 & 31) << 6 | var0[var6++] & 63;
                        if (var9 < 128) {
                            if (var3 >= '\uff00') {
                                throw new IllegalStateException();
                            }

                            var9 = '\ufffd';
                        }
                    } else {
                        var9 = '\ufffd';
                    }
                } else if (var8 < 240) {
                    if (1 + var6 < var7) {
                        if (var3 >= '\uff00') {
                            throw new IllegalStateException();
                        }

                        if (128 == (var0[var6] & 192)) {
                            if (var3 >= '\uff00') {
                                throw new IllegalStateException();
                            }

                            if (128 == (var0[var6 + 1] & 192)) {
                                if (var3 >= '\uff00') {
                                    throw new IllegalStateException();
                                }

                                var9 = (var8 & 15) << 12 | (var0[var6++] & 63) << 6 | var0[var6++] & 63;
                                if (var9 < 2048) {
                                    var9 = '\ufffd';
                                }
                                continue;
                            }
                        }
                    }

                    var9 = '\ufffd';
                } else if (var8 < 248) {
                    if (var3 >= '\uff00') {
                        throw new IllegalStateException();
                    }

                    if (2 + var6 < var7) {
                        if (var3 >= '\uff00') {
                            throw new IllegalStateException();
                        }

                        if (128 == (var0[var6] & 192)) {
                            if (var3 >= '\uff00') {
                                throw new IllegalStateException();
                            }

                            if (128 == (var0[var6 + 1] & 192)) {
                                if (var3 >= '\uff00') {
                                    throw new IllegalStateException();
                                }

                                if ((var0[2 + var6] & 192) == 128) {
                                    if (var3 >= '\uff00') {
                                        throw new IllegalStateException();
                                    }

                                    var9 = (var8 & 7) << 18 | (var0[var6++] & 63) << 12 | (var0[var6++] & 63) << 6 | var0[var6++] & 63;
                                    if (var9 >= 65536) {
                                        if (var3 >= '\uff00') {
                                            throw new IllegalStateException();
                                        }

                                        if (var9 <= 1114111) {
                                            var9 = '\ufffd';
                                            continue;
                                        }

                                        if (var3 >= '\uff00') {
                                            throw new IllegalStateException();
                                        }
                                    }

                                    var9 = '\ufffd';
                                    continue;
                                }
                            }
                        }
                    }

                    var9 = '\ufffd';
                } else {
                    var9 = '\ufffd';
                }
            }

            return new String(var4, 0, var5);
        } catch (RuntimeException var10) {
            throw ClanMate.error(var10, "fm.v(" + ')');
        }
    }

    public synchronized void a(int var1, int var2) {
        try {
            this.fieldV = -1698326721 * var1;
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "fm.a(" + ')');
        }
    }

    int v(int var1) {
        try {
            return this.fieldV * -766912321;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "fm.v(" + ')');
        }
    }

    void t(int var1, int var2, int var3, byte var4) {
        try {
            this.u(var1, var2, 64, 1984280431);
            if ((this.fieldJ[var1] & 2) != 0) {
                if (var4 != 0) {
                    throw new IllegalStateException();
                }

                for (classFy var5 = (classFy) this.fieldAq.fieldV.previous(); null != var5; var5 = (classFy) this.fieldAq.fieldV.s()) {
                    if (var4 != 0) {
                        throw new IllegalStateException();
                    }

                    if (var1 == var5.fieldA * 803650951) {
                        if (var4 != 0) {
                            throw new IllegalStateException();
                        }

                        if (var5.fieldO * -2091090135 < 0) {
                            if (var4 != 0) {
                                throw new IllegalStateException();
                            }

                            this.fieldC[var1][var5.fieldM * -731628329] = null;
                            this.fieldC[var1][var2] = var5;
                            int var6 = (var5.fieldK * 16228735 * var5.fieldS * -1392933419 >> 12) + var5.fieldN * -1532470531;
                            var5.fieldN += 1690571349 * (var2 - var5.fieldM * -731628329 << 8);
                            var5.fieldS = (var6 - var5.fieldN * -1532470531) * 151227261;
                            var5.fieldK = 1642590208;
                            var5.fieldM = -1001490713 * var2;
                            return;
                        }
                    }
                }
            }

            classFl var10 = (classFl) this.fieldA.get((long) this.fieldN[var1]);
            if (var10 == null) {
                if (var4 != 0) {
                    throw new IllegalStateException();
                }
            } else {
                classBl var11 = var10.fieldV[var2];
                if (var11 == null) {
                    if (var4 != 0) {
                        throw new IllegalStateException();
                    }
                } else {
                    classFy var7 = new classFy();
                    var7.fieldA = -2076542921 * var1;
                    var7.fieldV = var10;
                    var7.fieldI = var11;
                    var7.fieldB = var10.fieldM[var2];
                    var7.fieldL = 137041073 * var10.fieldW[var2];
                    var7.fieldM = -1001490713 * var2;
                    var7.fieldW = (var10.fieldB[var2] * var10.fieldA * 61777273 * var3 * var3 + 1024 >> 11) * -1267124969;
                    var7.fieldE = 665109199 * (var10.fieldL[var2] & 255);
                    var7.fieldN = 1690571349 * ((var2 << 8) - (var10.fieldI[var2] & 32767));
                    var7.fieldF = 0;
                    var7.fieldD = 0;
                    var7.fieldX = 0;
                    var7.fieldO = 1103196903;
                    var7.fieldQ = 0;
                    if (0 == this.fieldP[var1]) {
                        if (var4 != 0) {
                            return;
                        }

                        var7.fieldU = classBw.method210(var11, this.ao(var7, (byte) 13), this.ag(var7, -194895516), this.ad(var7, 247317827));
                    } else {
                        var7.fieldU = classBw.method210(var11, this.ao(var7, (byte) 25), 0, this.ad(var7, 247317827));
                        boolean var10002;
                        if (var10.fieldI[var2] < 0) {
                            if (var4 != 0) {
                                return;
                            }

                            var10002 = true;
                        } else {
                            var10002 = false;
                        }

                        this.h(var7, var10002, 1033464431);
                    }

                    if (var10.fieldI[var2] < 0) {
                        if (var4 != 0) {
                            throw new IllegalStateException();
                        }

                        var7.fieldU.s(-1);
                    }

                    if (var7.fieldL * -1183665071 >= 0) {
                        if (var4 != 0) {
                            return;
                        }

                        classFy var8 = this.fieldAn[var1][var7.fieldL * -1183665071];
                        if (null != var8) {
                            if (var4 != 0) {
                                throw new IllegalStateException();
                            }

                            if (var8.fieldO * -2091090135 < 0) {
                                if (var4 != 0) {
                                    return;
                                }

                                this.fieldC[var1][var8.fieldM * -731628329] = null;
                                var8.fieldO = 0;
                            }
                        }

                        this.fieldAn[var1][var7.fieldL * -1183665071] = var7;
                    }

                    this.fieldAq.fieldV.add(var7);
                    this.fieldC[var1][var2] = var7;
                }
            }
        } catch (RuntimeException var9) {
            throw ClanMate.error(var9, "fm.t(" + ')');
        }
    }

    synchronized void l(byte var1) {
        try {
            for (classFl var2 = (classFl) this.fieldA.first(); var2 != null; var2 = (classFl) this.fieldA.next()) {
                if (var1 != 8) {
                    throw new IllegalStateException();
                }

                var2.delete();
            }

        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "fm.l(" + ')');
        }
    }

    public synchronized void s(classFz var1, boolean var2, int var3) {
        try {
            this.f(-2028428827);
            this.fieldAs.a(var1.fieldV);
            this.fieldAh = var2;
            this.fieldAv = 0L;
            int var4 = this.fieldAs.b();

            for (int var5 = 0; var5 < var4; ++var5) {
                if (var3 <= -376532238) {
                    return;
                }

                this.fieldAs.l(var5);
                this.fieldAs.e(var5);
                this.fieldAs.m(var5);
            }

            this.fieldAr = this.fieldAs.d() * 1247952347;
            this.fieldAe = this.fieldAs.fieldL[this.fieldAr * -237406637] * -2094761767;
            this.fieldAl = this.fieldAs.f(this.fieldAe * -623868055) * -8289641489040996393L;
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "fm.s(" + ')');
        }
    }

    public synchronized void f(int var1) {
        try {
            this.fieldAs.v();
            this.ax('\uffff');
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "fm.f(" + ')');
        }
    }

    void o(int var1, int var2, int var3) {
        try {
            this.fieldE[var1] = var2;
            this.fieldS[var1] = var2 & -128;
            this.q(var1, var2, -324003522);
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "fm.o(" + ')');
        }
    }

    void q(int var1, int var2, int var3) {
        try {
            if (var2 != this.fieldN[var1]) {
                if (var3 == -1954825921) {
                    return;
                }

                this.fieldN[var1] = var2;

                for (int var4 = 0; var4 < 128; ++var4) {
                    if (var3 == -1954825921) {
                        throw new IllegalStateException();
                    }

                    this.fieldAn[var1][var4] = null;
                }
            }

        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "fm.q(" + ')');
        }
    }

    void h(classFy var1, boolean var2, int var3) {
        try {
            int var5;
            label35:
            {
                int var4 = var1.fieldI.fieldV.length;
                if (var2) {
                    if (var3 >= 1083431611) {
                        throw new IllegalStateException();
                    }

                    if (var1.fieldI.fieldL) {
                        if (var3 >= 1083431611) {
                            throw new IllegalStateException();
                        }

                        int var6 = var4 + var4 - var1.fieldI.fieldI;
                        var5 = (int) ((long) var6 * (long) this.fieldP[var1.fieldA * 803650951] >> 6);
                        var4 <<= 8;
                        if (var5 >= var4) {
                            if (var3 >= 1083431611) {
                                throw new IllegalStateException();
                            }

                            var5 = var4 + var4 - 1 - var5;
                            var1.fieldU.h(true);
                        }
                        break label35;
                    }
                }

                var5 = (int) ((long) this.fieldP[var1.fieldA * 803650951] * (long) var4 >> 6);
            }

            var1.fieldU.t(var5);
        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "fm.h(" + ')');
        }
    }

    boolean ak(classFy var1, byte var2) {
        try {
            if (var1.fieldU == null) {
                if (var1.fieldO * -2091090135 >= 0) {
                    if (var2 <= 0) {
                        throw new IllegalStateException();
                    }

                    var1.delete();
                    if (var1.fieldL * -1183665071 > 0) {
                        if (var2 <= 0) {
                            throw new IllegalStateException();
                        }

                        if (this.fieldAn[var1.fieldA * 803650951][var1.fieldL * -1183665071] == var1) {
                            if (var2 <= 0) {
                                throw new IllegalStateException();
                            }

                            this.fieldAn[var1.fieldA * 803650951][var1.fieldL * -1183665071] = null;
                        }
                    }
                }

                return true;
            } else {
                return false;
            }
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "fm.ak(" + ')');
        }
    }

    void j(int var1, int var2, int var3, byte var4) {
        try {
            ;
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "fm.j(" + ')');
        }
    }

    void ae(int var1, byte var2) {
        try {
            for (classFy var3 = (classFy) this.fieldAq.fieldV.next(); null != var3; var3 = (classFy) this.fieldAq.fieldV.tail()) {
                if (var2 == 127) {
                    return;
                }

                if (var1 >= 0) {
                    if (var2 == 127) {
                        throw new IllegalStateException();
                    }

                    if (var1 != var3.fieldA * 803650951) {
                        continue;
                    }

                    if (var2 == 127) {
                        throw new IllegalStateException();
                    }
                }

                if (var3.fieldU != null) {
                    var3.fieldU.y(classAp.audioSampleRate * 2098856905 / 100);
                    if (var3.fieldU.ax()) {
                        if (var2 == 127) {
                            throw new IllegalStateException();
                        }

                        this.fieldAq.fieldI.a(var3.fieldU);
                    }

                    var3.a((byte) 1);
                }

                if (var3.fieldO * -2091090135 < 0) {
                    if (var2 == 127) {
                        throw new IllegalStateException();
                    }

                    this.fieldC[var3.fieldA * 803650951][var3.fieldM * -731628329] = null;
                }

                var3.delete();
            }

        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "fm.ae(" + ')');
        }
    }

    public synchronized void b(int var1) {
        try {
            for (classFl var2 = (classFl) this.fieldA.first(); var2 != null; var2 = (classFl) this.fieldA.next()) {
                if (var1 >= -54651549) {
                    throw new IllegalStateException();
                }

                var2.v(983393450);
            }

        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "fm.b(" + ')');
        }
    }

    void ax(int var1) {
        try {
            this.ae(-1, (byte) -15);
            this.av(-1, 1022991386);

            int var2;
            for (var2 = 0; var2 < 16; ++var2) {
                this.fieldN[var2] = this.fieldE[var2];
            }

            for (var2 = 0; var2 < 16; ++var2) {
                this.fieldS[var2] = this.fieldE[var2] & -128;
            }

        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "fm.ax(" + ')');
        }
    }

    void az(int var1, short var2) {
        try {
            if (0 != (this.fieldJ[var1] & 2)) {
                if (var2 >= 255) {
                    throw new IllegalStateException();
                }

                for (classFy var3 = (classFy) this.fieldAq.fieldV.next(); var3 != null; var3 = (classFy) this.fieldAq.fieldV.tail()) {
                    if (var3.fieldA * 803650951 == var1) {
                        if (var2 >= 255) {
                            throw new IllegalStateException();
                        }

                        if (null == this.fieldC[var1][var3.fieldM * -731628329]) {
                            if (var2 >= 255) {
                                throw new IllegalStateException();
                            }

                            if (var3.fieldO * -2091090135 < 0) {
                                if (var2 >= 255) {
                                    throw new IllegalStateException();
                                }

                                var3.fieldO = 0;
                            }
                        }
                    }
                }
            }

        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "fm.az(" + ')');
        }
    }

    void at(int var1, int var2) {
        try {
            int var3 = var1 & 240;
            int var4;
            int var5;
            int var6;
            if (var3 == 128) {
                var4 = var1 & 15;
                var5 = var1 >> 8 & 127;
                var6 = var1 >> 16 & 127;
                this.u(var4, var5, var6, 1984280431);
            } else if (144 == var3) {
                var4 = var1 & 15;
                var5 = var1 >> 8 & 127;
                var6 = var1 >> 16 & 127;
                if (var6 > 0) {
                    this.t(var4, var5, var6, (byte) 0);
                } else {
                    this.u(var4, var5, 64, 1984280431);
                }

            } else if (160 == var3) {
                if (var2 == -124491416) {
                    var4 = var1 & 15;
                    var5 = var1 >> 8 & 127;
                    var6 = var1 >> 16 & 127;
                    this.j(var4, var5, var6, (byte) 59);
                }
            } else if (var3 == 176) {
                if (var2 != -124491416) {
                    throw new IllegalStateException();
                } else {
                    var4 = var1 & 15;
                    var5 = var1 >> 8 & 127;
                    var6 = var1 >> 16 & 127;
                    if (var5 == 0) {
                        if (var2 != -124491416) {
                            return;
                        }

                        this.fieldS[var4] = (this.fieldS[var4] & -2080769) + (var6 << 14);
                    }

                    if (var5 == 32) {
                        if (var2 != -124491416) {
                            throw new IllegalStateException();
                        }

                        this.fieldS[var4] = (var6 << 7) + (this.fieldS[var4] & -16257);
                    }

                    if (1 == var5) {
                        if (var2 != -124491416) {
                            throw new IllegalStateException();
                        }

                        this.fieldF[var4] = (this.fieldF[var4] & -16257) + (var6 << 7);
                    }

                    if (33 == var5) {
                        if (var2 != -124491416) {
                            throw new IllegalStateException();
                        }

                        this.fieldF[var4] = var6 + (this.fieldF[var4] & -128);
                    }

                    if (5 == var5) {
                        this.fieldD[var4] = (var6 << 7) + (this.fieldD[var4] & -16257);
                    }

                    if (var5 == 37) {
                        if (var2 != -124491416) {
                            throw new IllegalStateException();
                        }

                        this.fieldD[var4] = (this.fieldD[var4] & -128) + var6;
                    }

                    if (var5 == 7) {
                        if (var2 != -124491416) {
                            throw new IllegalStateException();
                        }

                        this.fieldB[var4] = (this.fieldB[var4] & -16257) + (var6 << 7);
                    }

                    if (39 == var5) {
                        if (var2 != -124491416) {
                            throw new IllegalStateException();
                        }

                        this.fieldB[var4] = var6 + (this.fieldB[var4] & -128);
                    }

                    if (var5 == 10) {
                        if (var2 != -124491416) {
                            throw new IllegalStateException();
                        }

                        this.fieldL[var4] = (this.fieldL[var4] & -16257) + (var6 << 7);
                    }

                    if (42 == var5) {
                        if (var2 != -124491416) {
                            throw new IllegalStateException();
                        }

                        this.fieldL[var4] = var6 + (this.fieldL[var4] & -128);
                    }

                    if (11 == var5) {
                        if (var2 != -124491416) {
                            return;
                        }

                        this.fieldM[var4] = (this.fieldM[var4] & -16257) + (var6 << 7);
                    }

                    if (43 == var5) {
                        if (var2 != -124491416) {
                            throw new IllegalStateException();
                        }

                        this.fieldM[var4] = var6 + (this.fieldM[var4] & -128);
                    }

                    if (var5 == 64) {
                        if (var2 != -124491416) {
                            throw new IllegalStateException();
                        }

                        if (var6 >= 64) {
                            this.fieldJ[var4] |= 1;
                        } else {
                            this.fieldJ[var4] &= -2;
                        }
                    }

                    if (var5 == 65) {
                        if (var6 >= 64) {
                            if (var2 != -124491416) {
                                throw new IllegalStateException();
                            }

                            this.fieldJ[var4] |= 2;
                        } else {
                            this.az(var4, (short) -15619);
                            this.fieldJ[var4] &= -3;
                        }
                    }

                    if (var5 == 99) {
                        if (var2 != -124491416) {
                            throw new IllegalStateException();
                        }

                        this.fieldG[var4] = (this.fieldG[var4] & 127) + (var6 << 7);
                    }

                    if (var5 == 98) {
                        this.fieldG[var4] = var6 + (this.fieldG[var4] & 16256);
                    }

                    if (101 == var5) {
                        if (var2 != -124491416) {
                            throw new IllegalStateException();
                        }

                        this.fieldG[var4] = (var6 << 7) + (this.fieldG[var4] & 127) + 16384;
                    }

                    if (100 == var5) {
                        if (var2 != -124491416) {
                            return;
                        }

                        this.fieldG[var4] = var6 + 16384 + (this.fieldG[var4] & 16256);
                    }

                    if (120 == var5) {
                        if (var2 != -124491416) {
                            throw new IllegalStateException();
                        }

                        this.ae(var4, (byte) -109);
                    }

                    if (121 == var5) {
                        if (var2 != -124491416) {
                            throw new IllegalStateException();
                        }

                        this.av(var4, 2023491504);
                    }

                    if (var5 == 123) {
                        if (var2 != -124491416) {
                            throw new IllegalStateException();
                        }

                        this.al(var4, 596883714);
                    }

                    int var7;
                    if (6 == var5) {
                        if (var2 != -124491416) {
                            throw new IllegalStateException();
                        }

                        var7 = this.fieldG[var4];
                        if (16384 == var7) {
                            if (var2 != -124491416) {
                                throw new IllegalStateException();
                            }

                            this.fieldY[var4] = (var6 << 7) + (this.fieldY[var4] & -16257);
                        }
                    }

                    if (var5 == 38) {
                        if (var2 != -124491416) {
                            throw new IllegalStateException();
                        }

                        var7 = this.fieldG[var4];
                        if (var7 == 16384) {
                            if (var2 != -124491416) {
                                throw new IllegalStateException();
                            }

                            this.fieldY[var4] = (this.fieldY[var4] & -128) + var6;
                        }
                    }

                    if (var5 == 16) {
                        if (var2 != -124491416) {
                            return;
                        }

                        this.fieldP[var4] = (this.fieldP[var4] & -16257) + (var6 << 7);
                    }

                    if (48 == var5) {
                        if (var2 != -124491416) {
                            throw new IllegalStateException();
                        }

                        this.fieldP[var4] = var6 + (this.fieldP[var4] & -128);
                    }

                    if (var5 == 81) {
                        if (var2 != -124491416) {
                            throw new IllegalStateException();
                        }

                        if (var6 >= 64) {
                            if (var2 != -124491416) {
                                throw new IllegalStateException();
                            }

                            this.fieldJ[var4] |= 4;
                        } else {
                            this.aa(var4, (byte) -127);
                            this.fieldJ[var4] &= -5;
                        }
                    }

                    if (var5 == 17) {
                        if (var2 != -124491416) {
                            throw new IllegalStateException();
                        }

                        this.aw(var4, (var6 << 7) + (this.fieldR[var4] & -16257), (byte) 38);
                    }

                    if (var5 == 49) {
                        if (var2 != -124491416) {
                            throw new IllegalStateException();
                        }

                        this.aw(var4, var6 + (this.fieldR[var4] & -128), (byte) 39);
                    }

                }
            } else if (var3 == 192) {
                if (var2 != -124491416) {
                    throw new IllegalStateException();
                } else {
                    var4 = var1 & 15;
                    var5 = var1 >> 8 & 127;
                    this.q(var4, var5 + this.fieldS[var4], 824210562);
                }
            } else if (var3 == 208) {
                if (var2 != -124491416) {
                    throw new IllegalStateException();
                } else {
                    var4 = var1 & 15;
                    var5 = var1 >> 8 & 127;
                    this.g(var4, var5, (byte) 54);
                }
            } else if (var3 == 224) {
                if (var2 != -124491416) {
                    throw new IllegalStateException();
                } else {
                    var4 = var1 & 15;
                    var5 = (var1 >> 9 & 16256) + (var1 >> 8 & 127);
                    this.y(var4, var5, 457907916);
                }
            } else {
                var3 = var1 & 255;
                if (var3 == 255) {
                    if (var2 != -124491416) {
                        throw new IllegalStateException();
                    } else {
                        this.ax('\uffff');
                    }
                }
            }
        } catch (RuntimeException var8) {
            throw ClanMate.error(var8, "fm.at(" + ')');
        }
    }

    void aw(int var1, int var2, byte var3) {
        try {
            this.fieldR[var1] = var2;
            this.fieldZ[var1] = (int) (2097152.0D * Math.pow(2.0D, (double) var2 * 5.4931640625E-4D) + 0.5D);
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "fm.aw(" + ')');
        }
    }

    int ao(classFy var1, byte var2) {
        try {
            int var3 = (var1.fieldS * -1392933419 * var1.fieldK * 16228735 >> 12) + var1.fieldN * -1532470531;
            var3 += (this.fieldK[var1.fieldA * 803650951] - 8192) * this.fieldY[var1.fieldA * 803650951] >> 12;
            classFa var4 = var1.fieldB;
            int var5;
            if (var4.fieldE * -2124160421 > 0) {
                label57:
                {
                    if (var2 == 1) {
                        throw new IllegalStateException();
                    }

                    if (var4.fieldW * -1902461161 <= 0) {
                        if (var2 == 1) {
                            throw new IllegalStateException();
                        }

                        if (this.fieldF[var1.fieldA * 803650951] <= 0) {
                            break label57;
                        }

                        if (var2 == 1) {
                            throw new IllegalStateException();
                        }
                    }

                    var5 = var4.fieldW * -1902461161 << 2;
                    int var6 = var4.fieldN * 1239460653 << 1;
                    if (var1.fieldT * -697231537 < var6) {
                        if (var2 == 1) {
                            throw new IllegalStateException();
                        }

                        var5 = var1.fieldT * -697231537 * var5 / var6;
                    }

                    var5 += this.fieldF[var1.fieldA * 803650951] >> 7;
                    double var7 = Math.sin((double) (var1.fieldH * 449320029 & 511) * 0.01227184630308513D);
                    var3 += (int) (var7 * (double) var5);
                }
            }

            var5 = (int) ((double) (var1.fieldI.fieldA * 256) * Math.pow(2.0D, 3.255208333333333E-4D * (double) var3) / (double) (classAp.audioSampleRate * 2098856905) + 0.5D);
            int var10000;
            if (var5 < 1) {
                if (var2 == 1) {
                    throw new IllegalStateException();
                }

                var10000 = 1;
            } else {
                var10000 = var5;
            }

            return var10000;
        } catch (RuntimeException var9) {
            throw ClanMate.error(var9, "fm.ao(" + ')');
        }
    }

    boolean aj(classFy var1, int[] var2, int var3, int var4, int var5) {
        try {
            var1.fieldJ = classAp.audioSampleRate * 2098856905 / 100 * -1621020349;
            if (var1.fieldO * -2091090135 >= 0) {
                label233:
                {
                    if (var5 != -422835390) {
                        throw new IllegalStateException();
                    }

                    if (var1.fieldU != null) {
                        if (var5 != -422835390) {
                            throw new IllegalStateException();
                        }

                        if (!var1.fieldU.al()) {
                            break label233;
                        }

                        if (var5 != -422835390) {
                            throw new IllegalStateException();
                        }
                    }

                    var1.a((byte) 1);
                    var1.delete();
                    if (var1.fieldL * -1183665071 > 0) {
                        if (var5 != -422835390) {
                            throw new IllegalStateException();
                        }

                        if (var1 == this.fieldAn[var1.fieldA * 803650951][var1.fieldL * -1183665071]) {
                            if (var5 != -422835390) {
                                throw new IllegalStateException();
                            }

                            this.fieldAn[var1.fieldA * 803650951][var1.fieldL * -1183665071] = null;
                        }
                    }

                    return true;
                }
            }

            int var6 = var1.fieldK * 16228735;
            if (var6 > 0) {
                if (var5 != -422835390) {
                    throw new IllegalStateException();
                }

                var6 -= (int) (16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double) this.fieldD[var1.fieldA * 803650951]) + 0.5D);
                if (var6 < 0) {
                    if (var5 != -422835390) {
                        throw new IllegalStateException();
                    }

                    var6 = 0;
                }

                var1.fieldK = 1757814399 * var6;
            }

            var1.fieldU.ae(this.ao(var1, (byte) -102));
            classFa var7 = var1.fieldB;
            boolean var8 = false;
            var1.fieldT += -1281777745;
            var1.fieldH += var7.fieldE * -1313774057;
            double var9 = 5.086263020833333E-6D * (double) ((var1.fieldK * 16228735 * var1.fieldS * -1392933419 >> 12) + (var1.fieldM * -731628329 - 60 << 8));
            if (var7.fieldI * -421395485 > 0) {
                if (var5 != -422835390) {
                    throw new IllegalStateException();
                }

                if (var7.fieldM * -1315353931 > 0) {
                    if (var5 != -422835390) {
                        throw new IllegalStateException();
                    }

                    var1.fieldF += (int) (128.0D * Math.pow(2.0D, (double) (var7.fieldM * -1315353931) * var9) + 0.5D) * -1096162483;
                } else {
                    var1.fieldF += 1425122944;
                }
            }

            if (var7.fieldA != null) {
                if (var5 != -422835390) {
                    throw new IllegalStateException();
                }

                if (var7.fieldB * -1398542743 > 0) {
                    if (var5 != -422835390) {
                        throw new IllegalStateException();
                    }

                    var1.fieldD += (int) (128.0D * Math.pow(2.0D, (double) (var7.fieldB * -1398542743) * var9) + 0.5D) * -779941273;
                } else {
                    var1.fieldD += -1048235136;
                }

                while (var1.fieldX * 783294939 < var7.fieldA.length - 2) {
                    if (var5 != -422835390) {
                        throw new IllegalStateException();
                    }

                    if (var1.fieldD * 404779351 <= (var7.fieldA[var1.fieldX * 783294939 + 2] & 255) << 8) {
                        break;
                    }

                    var1.fieldX += 1272571046;
                }

                if (var1.fieldX * 783294939 == var7.fieldA.length - 2) {
                    if (var5 != -422835390) {
                        throw new IllegalStateException();
                    }

                    if (0 == var7.fieldA[1 + var1.fieldX * 783294939]) {
                        if (var5 != -422835390) {
                            throw new IllegalStateException();
                        }

                        var8 = true;
                    }
                }
            }

            if (var1.fieldO * -2091090135 >= 0) {
                if (var5 != -422835390) {
                    throw new IllegalStateException();
                }

                if (null != var7.fieldV) {
                    if (var5 != -422835390) {
                        throw new IllegalStateException();
                    }

                    if (0 == (this.fieldJ[var1.fieldA * 803650951] & 1)) {
                        label238:
                        {
                            if (var5 != -422835390) {
                                throw new IllegalStateException();
                            }

                            if (var1.fieldL * -1183665071 >= 0) {
                                if (var5 != -422835390) {
                                    throw new IllegalStateException();
                                }

                                if (this.fieldAn[var1.fieldA * 803650951][var1.fieldL * -1183665071] == var1) {
                                    break label238;
                                }

                                if (var5 != -422835390) {
                                    throw new IllegalStateException();
                                }
                            }

                            if (var7.fieldL * 116000815 > 0) {
                                if (var5 != -422835390) {
                                    throw new IllegalStateException();
                                }

                                var1.fieldO += (int) (128.0D * Math.pow(2.0D, var9 * (double) (var7.fieldL * 116000815)) + 0.5D) * -1103196903;
                            } else {
                                var1.fieldO += 524717184;
                            }

                            while (var1.fieldQ * -1302400077 < var7.fieldV.length - 2 && var1.fieldO * -2091090135 > (var7.fieldV[2 + var1.fieldQ * -1302400077] & 255) << 8) {
                                if (var5 != -422835390) {
                                    throw new IllegalStateException();
                                }

                                var1.fieldQ += -210376970;
                            }

                            if (var1.fieldQ * -1302400077 == var7.fieldV.length - 2) {
                                if (var5 != -422835390) {
                                    throw new IllegalStateException();
                                }

                                var8 = true;
                            }
                        }
                    }
                }
            }

            if (var8) {
                var1.fieldU.y(var1.fieldJ * 1902568299);
                if (var2 != null) {
                    if (var5 != -422835390) {
                        throw new IllegalStateException();
                    }

                    var1.fieldU.n(var2, var3, var4);
                } else {
                    var1.fieldU.k(var4);
                }

                if (var1.fieldU.ax()) {
                    this.fieldAq.fieldI.a(var1.fieldU);
                }

                var1.a((byte) 1);
                if (var1.fieldO * -2091090135 >= 0) {
                    if (var5 != -422835390) {
                        throw new IllegalStateException();
                    }

                    var1.delete();
                    if (var1.fieldL * -1183665071 > 0 && this.fieldAn[var1.fieldA * 803650951][var1.fieldL * -1183665071] == var1) {
                        if (var5 != -422835390) {
                            throw new IllegalStateException();
                        }

                        this.fieldAn[var1.fieldA * 803650951][var1.fieldL * -1183665071] = null;
                    }
                }

                return true;
            } else {
                var1.fieldU.g(var1.fieldJ * 1902568299, this.ag(var1, -1417013172), this.ad(var1, 247317827));
                return false;
            }
        } catch (RuntimeException var11) {
            throw ClanMate.error(var11, "fm.aj(" + ')');
        }
    }

    int ad(classFy var1, int var2) {
        try {
            int var3 = this.fieldL[var1.fieldA * 803650951];
            if (var3 < 8192) {
                if (var2 != 247317827) {
                    throw new IllegalStateException();
                } else {
                    return var1.fieldE * -1069874129 * var3 + 32 >> 6;
                }
            } else {
                return 16384 - (32 + (16384 - var3) * (128 - var1.fieldE * -1069874129) >> 6);
            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "fm.ad(" + ')');
        }
    }

    @Override
    protected synchronized classBz m() {
        try {
            return this.fieldAq;
        } catch (RuntimeException var1) {
            throw ClanMate.error(var1, "fm.m(" + ')');
        }
    }

    @Override
    protected synchronized void n(int[] var1, int var2, int var3) {
        try {
            if (this.fieldAs.i()) {
                int var4 = this.fieldI * 1997169001 * this.fieldAs.fieldV / (classAp.audioSampleRate * 2098856905);

                do {
                    long var5 = this.fieldAv * -4888691971587836201L + (long) var4 * (long) var3;
                    if (-7917800364115633177L * this.fieldAl - var5 >= 0L) {
                        this.fieldAv = -9031917737295651609L * var5;
                        break;
                    }

                    int var7 = (int) (((long) var4 + (-7917800364115633177L * this.fieldAl - this.fieldAv * -4888691971587836201L) - 1L) / (long) var4);
                    this.fieldAv += -9031917737295651609L * (long) var7 * (long) var4;
                    this.fieldAq.n(var1, var2, var7);
                    var2 += var7;
                    var3 -= var7;
                    this.au((byte) 1);
                } while (this.fieldAs.i());
            }

            this.fieldAq.n(var1, var2, var3);
        } catch (RuntimeException var8) {
            throw ClanMate.error(var8, "fm.n(" + ')');
        }
    }

    @Override
    protected synchronized void k(int var1) {
        try {
            if (this.fieldAs.i()) {
                int var2 = this.fieldI * 1997169001 * this.fieldAs.fieldV / (classAp.audioSampleRate * 2098856905);

                do {
                    long var3 = this.fieldAv * -4888691971587836201L + (long) var1 * (long) var2;
                    if (-7917800364115633177L * this.fieldAl - var3 >= 0L) {
                        this.fieldAv = -9031917737295651609L * var3;
                        break;
                    }

                    int var5 = (int) (((long) var2 + (this.fieldAl * -7917800364115633177L - -4888691971587836201L * this.fieldAv) - 1L) / (long) var2);
                    this.fieldAv += -9031917737295651609L * (long) var5 * (long) var2;
                    this.fieldAq.k(var5);
                    var1 -= var5;
                    this.au((byte) 1);
                } while (this.fieldAs.i());
            }

            this.fieldAq.k(var1);
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "fm.k(" + ')');
        }
    }

    void au(byte var1) {
        try {
            int var2 = this.fieldAr * -237406637;
            int var3 = this.fieldAe * -623868055;
            long var4 = -7917800364115633177L * this.fieldAl;

            label76:
            while (true) {
                if (var3 != this.fieldAe * -623868055) {
                    this.fieldAr = 1247952347 * var2;
                    this.fieldAe = -2094761767 * var3;
                    this.fieldAl = -8289641489040996393L * var4;
                    return;
                }

                if (var1 != 1) {
                    throw new IllegalStateException();
                }

                while (this.fieldAs.fieldL[var2] == var3) {
                    if (var1 != 1) {
                        throw new IllegalStateException();
                    }

                    this.fieldAs.l(var2);
                    int var6 = this.fieldAs.n(var2);
                    if (var6 == 1) {
                        if (var1 != 1) {
                            throw new IllegalStateException();
                        }

                        this.fieldAs.w();
                        this.fieldAs.m(var2);
                        if (!this.fieldAs.x()) {
                            if (var1 != 1) {
                                throw new IllegalStateException();
                            }
                        } else {
                            if (!this.fieldAh) {
                                break label76;
                            }

                            if (var1 != 1) {
                                throw new IllegalStateException();
                            }

                            if (0 == var3) {
                                break label76;
                            }

                            if (var1 != 1) {
                                return;
                            }

                            this.fieldAs.o(var4);
                        }
                        break;
                    }

                    if (0 != (var6 & 128)) {
                        if (var1 != 1) {
                            return;
                        }

                        this.at(var6, -124491416);
                    }

                    this.fieldAs.e(var2);
                    this.fieldAs.m(var2);
                }

                var2 = this.fieldAs.d();
                var3 = this.fieldAs.fieldL[var2];
                var4 = this.fieldAs.f(var3);
            }

            this.ax('\uffff');
            this.fieldAs.v();
        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "fm.au(" + ')');
        }
    }

    void g(int var1, int var2, byte var3) {
        try {
            ;
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "fm.g(" + ')');
        }
    }

    void y(int var1, int var2, int var3) {
        try {
            this.fieldK[var1] = var2;
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "fm.y(" + ')');
        }
    }

    @Override
    protected synchronized classBz w() {
        try {
            return null;
        } catch (RuntimeException var1) {
            throw ClanMate.error(var1, "fm.w(" + ')');
        }
    }

    public synchronized void x(int var1, int var2, int var3) {
        try {
            this.o(var1, var2, 1510948163);
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "fm.x(" + ')');
        }
    }

    void u(int var1, int var2, int var3, int var4) {
        try {
            classFy var5 = this.fieldC[var1][var2];
            if (var5 == null) {
                if (var4 != 1984280431) {
                    throw new IllegalStateException();
                }
            } else {
                this.fieldC[var1][var2] = null;
                if (0 != (this.fieldJ[var1] & 2)) {
                    if (var4 != 1984280431) {
                        throw new IllegalStateException();
                    }

                    for (classFy var6 = (classFy) this.fieldAq.fieldV.next(); null != var6; var6 = (classFy) this.fieldAq.fieldV.tail()) {
                        if (var6.fieldA * 803650951 == var5.fieldA * 803650951) {
                            if (var4 != 1984280431) {
                                throw new IllegalStateException();
                            }

                            if (var6.fieldO * -2091090135 < 0) {
                                if (var4 != 1984280431) {
                                    throw new IllegalStateException();
                                }

                                if (var6 != var5) {
                                    if (var4 != 1984280431) {
                                        throw new IllegalStateException();
                                    }

                                    var5.fieldO = 0;
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    var5.fieldO = 0;
                }

            }
        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "fm.u(" + ')');
        }
    }

    synchronized boolean d(int var1) {
        try {
            return this.fieldAs.i();
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "fm.d(" + ')');
        }
    }

    public synchronized boolean i(classFz var1, ReferenceTable var2, classBo var3, int var4, int var5) {
        try {
            var1.v();
            boolean var6 = true;
            int[] var7 = null;
            if (var4 > 0) {
                var7 = new int[]{var4};
            }

            for (classFi var8 = (classFi) var1.fieldA.first(); var8 != null; var8 = (classFi) var1.fieldA.next()) {
                if (var5 == -1135933951) {
                    throw new IllegalStateException();
                }

                int var9 = (int) var8.key;
                classFl var10 = (classFl) this.fieldA.get((long) var9);
                if (var10 == null) {
                    if (var5 == -1135933951) {
                        throw new IllegalStateException();
                    }

                    byte[] var12 = var2.e(var9, (short) 145);
                    classFl var11;
                    if (null == var12) {
                        if (var5 == -1135933951) {
                            throw new IllegalStateException();
                        }

                        var11 = null;
                    } else {
                        var11 = new classFl(var12);
                    }

                    var10 = var11;
                    if (null == var11) {
                        if (var5 == -1135933951) {
                            throw new IllegalStateException();
                        }

                        var6 = false;
                        continue;
                    }

                    this.fieldA.put(var11, (long) var9);
                }

                if (!var10.a(var3, var8.fieldA, var7, (byte) 101)) {
                    var6 = false;
                }
            }

            if (var6) {
                if (var5 == -1135933951) {
                    throw new IllegalStateException();
                }

                var1.i();
            }

            return var6;
        } catch (RuntimeException var13) {
            throw ClanMate.error(var13, "fm.i(" + ')');
        }
    }

    void aa(int var1, byte var2) {
        try {
            if (0 != (this.fieldJ[var1] & 4)) {
                if (var2 >= 0) {
                    return;
                }

                for (classFy var3 = (classFy) this.fieldAq.fieldV.next(); null != var3; var3 = (classFy) this.fieldAq.fieldV.tail()) {
                    if (var2 >= 0) {
                        return;
                    }

                    if (var1 == var3.fieldA * 803650951) {
                        var3.fieldY = 0;
                    }
                }
            }

        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "fm.aa(" + ')');
        }
    }

    void al(int var1, int var2) {
        try {
            for (classFy var3 = (classFy) this.fieldAq.fieldV.next(); var3 != null; var3 = (classFy) this.fieldAq.fieldV.tail()) {
                if (var2 >= 967890352) {
                    throw new IllegalStateException();
                }

                if (var1 >= 0) {
                    if (var1 != var3.fieldA * 803650951) {
                        continue;
                    }

                    if (var2 >= 967890352) {
                        throw new IllegalStateException();
                    }
                }

                if (var3.fieldO * -2091090135 < 0) {
                    if (var2 >= 967890352) {
                        throw new IllegalStateException();
                    }

                    this.fieldC[var3.fieldA * 803650951][var3.fieldM * -731628329] = null;
                    var3.fieldO = 0;
                }
            }

        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "fm.al(" + ')');
        }
    }

    int ag(classFy var1, int var2) {
        try {
            classFa var3 = var1.fieldB;
            int var4 = 4096 + this.fieldM[var1.fieldA * 803650951] * this.fieldB[var1.fieldA * 803650951] >> 13;
            var4 = 16384 + var4 * var4 >> 15;
            var4 = 16384 + var1.fieldW * 1000034983 * var4 >> 15;
            var4 = var4 * this.fieldV * -766912321 + 128 >> 8;
            if (var3.fieldI * -421395485 > 0) {
                if (var2 >= 488943768) {
                    throw new IllegalStateException();
                }

                var4 = (int) ((double) var4 * Math.pow(0.5D, (double) (var3.fieldI * -421395485) * 1.953125E-5D * (double) (var1.fieldF * -1191572091)) + 0.5D);
            }

            int var5;
            int var6;
            int var7;
            int var8;
            if (null != var3.fieldA) {
                if (var2 >= 488943768) {
                    throw new IllegalStateException();
                }

                var5 = var1.fieldD * 404779351;
                var6 = var3.fieldA[1 + var1.fieldX * 783294939];
                if (var1.fieldX * 783294939 < var3.fieldA.length - 2) {
                    if (var2 >= 488943768) {
                        throw new IllegalStateException();
                    }

                    var7 = (var3.fieldA[var1.fieldX * 783294939] & 255) << 8;
                    var8 = (var3.fieldA[var1.fieldX * 783294939 + 2] & 255) << 8;
                    var6 += (var3.fieldA[var1.fieldX * 783294939 + 3] - var6) * (var5 - var7) / (var8 - var7);
                }

                var4 = var6 * var4 + 32 >> 6;
            }

            if (var1.fieldO * -2091090135 > 0) {
                if (var2 >= 488943768) {
                    throw new IllegalStateException();
                }

                if (null != var3.fieldV) {
                    if (var2 >= 488943768) {
                        throw new IllegalStateException();
                    }

                    var5 = var1.fieldO * -2091090135;
                    var6 = var3.fieldV[1 + var1.fieldQ * -1302400077];
                    if (var1.fieldQ * -1302400077 < var3.fieldV.length - 2) {
                        if (var2 >= 488943768) {
                            throw new IllegalStateException();
                        }

                        var7 = (var3.fieldV[var1.fieldQ * -1302400077] & 255) << 8;
                        var8 = (var3.fieldV[var1.fieldQ * -1302400077 + 2] & 255) << 8;
                        var6 += (var3.fieldV[var1.fieldQ * -1302400077 + 3] - var6) * (var5 - var7) / (var8 - var7);
                    }

                    var4 = var6 * var4 + 32 >> 6;
                }
            }

            return var4;
        } catch (RuntimeException var9) {
            throw ClanMate.error(var9, "fm.ag(" + ')');
        }
    }

    void av(int var1, int var2) {
        try {
            if (var1 < 0) {
                if (var2 <= -815426140) {
                    throw new IllegalStateException();
                } else {
                    for (var1 = 0; var1 < 16; ++var1) {
                        if (var2 <= -815426140) {
                            throw new IllegalStateException();
                        }

                        this.av(var1, -681995065);
                    }

                }
            } else {
                this.fieldB[var1] = 12800;
                this.fieldL[var1] = 8192;
                this.fieldM[var1] = 16383;
                this.fieldK[var1] = 8192;
                this.fieldF[var1] = 0;
                this.fieldD[var1] = 8192;
                this.az(var1, (short) -13133);
                this.aa(var1, (byte) -120);
                this.fieldJ[var1] = 0;
                this.fieldG[var1] = 32767;
                this.fieldY[var1] = 256;
                this.fieldP[var1] = 0;
                this.aw(var1, 8192, (byte) 118);
            }
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "fm.av(" + ')');
        }
    }

    @Override
    protected synchronized int e() {
        try {
            return 0;
        } catch (RuntimeException var1) {
            throw ClanMate.error(var1, "fm.e(" + ')');
        }
    }
}
