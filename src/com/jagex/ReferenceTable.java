package com.jagex;

public abstract class ReferenceTable {

    static int fieldT = 0;
    static classDp fieldD = new classDp();
    public int fieldX;
    public boolean fieldQ;
    int[] fieldI;
    int[] fieldV;
    Object[][] fieldF;
    IdentityTable fieldB;
    int[] fieldL;
    int[] fieldM;
    int[] fieldW;
    int[][] fieldE;
    IdentityTable[] identities;
    Object[] fieldK;
    boolean fieldO;
    int[][] fieldN;
    int fieldA;


    ReferenceTable(boolean var1, boolean var2) {
        this.fieldO = var1;
        this.fieldQ = var2;
    }

    public byte[] n(int var1, int var2, int var3) {
        try {
            if (var1 >= 0) {
                if (var3 != -213809809) {
                    throw new IllegalStateException();
                }

                if (var1 < this.fieldF.length && null != this.fieldF[var1]) {
                    if (var3 != -213809809) {
                        throw new IllegalStateException();
                    }

                    if (var2 >= 0) {
                        if (var3 != -213809809) {
                            throw new IllegalStateException();
                        }

                        if (var2 < this.fieldF[var1].length) {
                            if (this.fieldF[var1][var2] == null) {
                                boolean var4 = this.t(var1, (int[]) null, -1502167029);
                                if (!var4) {
                                    if (var3 != -213809809) {
                                        throw new IllegalStateException();
                                    }

                                    this.k(var1, -845679860);
                                    var4 = this.t(var1, (int[]) null, -1528137920);
                                    if (!var4) {
                                        if (var3 != -213809809) {
                                            throw new IllegalStateException();
                                        }

                                        return null;
                                    }
                                }
                            }

                            byte[] var6 = classCe.transformData(this.fieldF[var1][var2], false, -807057784);
                            return var6;
                        }

                        if (var3 != -213809809) {
                            throw new IllegalStateException();
                        }
                    }
                }
            }

            return null;
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "ek.n(" + ')');
        }
    }

    public byte[] getFile(int index, int file, short var3) {
        try {
            return this.b(index, file, (int[]) null, 2075638551);
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "ek.i(" + ')');
        }
    }

    public byte[] b(int index, int file, int[] XTeaKeys, int DUMMY) {
        try {
            if (index >= 0) {

                if (index < this.fieldF.length) {

                    if (null != this.fieldF[index]) {


                        if (file >= 0) {

                            if (file < this.fieldF[index].length) {

                                if (null == this.fieldF[index][file]) {

                                    boolean var5 = this.t(index, XTeaKeys, -1749220495);
                                    if (!var5) {
                                        this.k(index, -845679860);
                                        var5 = this.t(index, XTeaKeys, -1806933318);
                                        if (!var5) {
                                            return null;
                                        }
                                    }
                                }

                                byte[] var7 = classCe.transformData(this.fieldF[index][file], false, -807057784);

                                if (this.fieldQ) {
                                    this.fieldF[index][file] = null;
                                }

                                return var7;

                            }


                        }
                    }
                }
            }

            return null;
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "ek.b(" + ')');
        }
    }

    public boolean l(int var1, int var2, int var3) {
        try {
            if (var1 >= 0 && var1 < this.fieldF.length) {
                if (var3 >= -51772626) {
                    throw new IllegalStateException();
                }

                if (this.fieldF[var1] != null) {
                    if (var3 >= -51772626) {
                        throw new IllegalStateException();
                    }

                    if (var2 >= 0) {
                        if (var3 >= -51772626) {
                            throw new IllegalStateException();
                        }

                        if (var2 < this.fieldF[var1].length) {
                            if (null != this.fieldF[var1][var2]) {
                                if (var3 >= -51772626) {
                                    throw new IllegalStateException();
                                }

                                return true;
                            }

                            if (this.fieldK[var1] != null) {
                                if (var3 >= -51772626) {
                                    throw new IllegalStateException();
                                }

                                return true;
                            }

                            this.k(var1, -845679860);
                            if (this.fieldK[var1] != null) {
                                return true;
                            }

                            return false;
                        }

                        if (var3 >= -51772626) {
                            throw new IllegalStateException();
                        }
                    }
                }
            }

            return false;
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "ek.l(" + ')');
        }
    }

    public boolean isFileLoaded(int var1, int var2) {
        try {
            if (null != this.fieldK[var1]) {
                if (var2 == 1742580922) {
                    throw new IllegalStateException();
                } else {
                    return true;
                }
            } else {
                this.k(var1, -845679860);
                if (null != this.fieldK[var1]) {
                    if (var2 == 1742580922) {
                        throw new IllegalStateException();
                    } else {
                        return true;
                    }
                } else {
                    return false;
                }
            }
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "ek.m(" + ')');
        }
    }

    public boolean isLoaded(int DUMMY) {
        try {
            boolean var2 = true;

            for (int var3 = 0; var3 < this.fieldV.length; ++var3) {

                int var4 = this.fieldV[var3];
                if (this.fieldK[var4] == null) {

                    this.k(var4, -845679860);
                    if (this.fieldK[var4] == null) {
                        var2 = false;
                    }
                }
            }

            return var2;
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "ek.w(" + ')');
        }
    }

    public byte[] e(int var1, short var2) {
        try {
            if (this.fieldF.length == 1) {
                return this.getFile(0, var1, (short) 31882);
            } else if (this.fieldF[var1].length == 1) {
                if (var2 != 145) {
                    throw new IllegalStateException();
                } else {
                    return this.getFile(var1, 0, (short) 21838);
                }
            } else {
                throw new RuntimeException();
            }
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "ek.e(" + ')');
        }
    }

    public byte[] s(int var1, byte var2) {
        try {
            if (1 == this.fieldF.length) {
                if (var2 >= 0) {
                    throw new IllegalStateException();
                } else {
                    return this.n(0, var1, -213809809);
                }
            } else if (this.fieldF[var1].length == 1) {
                if (var2 >= 0) {
                    throw new IllegalStateException();
                } else {
                    return this.n(var1, 0, -213809809);
                }
            } else {
                throw new RuntimeException();
            }
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "ek.s(" + ')');
        }
    }

    void k(int var1, int var2) {
        try {
            ;
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "ek.k(" + ')');
        }
    }

    public int[] f(int var1, int var2) {
        try {
            return this.fieldE[var1];
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "ek.f(" + ')');
        }
    }

    public void o(int var1, int var2) {
        try {
            for (int var3 = 0; var3 < this.fieldF[var1].length; ++var3) {
                if (var2 <= 1190747570) {
                    throw new IllegalStateException();
                }

                this.fieldF[var1][var3] = null;
            }

        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "ek.o(" + ')');
        }
    }

    public void q(byte var1) {
        try {
            for (int var2 = 0; var2 < this.fieldF.length; ++var2) {
                if (var1 != 4) {
                    throw new IllegalStateException();
                }

                if (null != this.fieldF[var2]) {
                    if (var1 != 4) {
                        throw new IllegalStateException();
                    }

                    for (int var3 = 0; var3 < this.fieldF[var2].length; ++var3) {
                        if (var1 != 4) {
                            return;
                        }

                        this.fieldF[var2][var3] = null;
                    }
                }
            }

        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "ek.q(" + ')');
        }
    }

    boolean t(int index, int[] keys, int DUMMY) {
        try {
            if (this.fieldK[index] == null) {
                return false;
            } else {
                int archiveSize = this.fieldW[index];
                int[] var5 = this.fieldE[index];
                Object[] archiveEntries = this.fieldF[index];

                boolean var7 = true;

                for (int var8 = 0; var8 < archiveSize; ++var8) {
                    if (archiveEntries[var5[var8]] == null) {
                        var7 = false;
                        break;
                    }
                }

                if (var7) {
                    return true;
                } else {
                    byte[] decodedBuffer;

                    label193: {
                        if (null != keys) {
                            if(keys[0] != 0 || keys[1] != 0 || keys[2] != 0 || keys[3] != 0) {
                                decodedBuffer = classCe.transformData(this.fieldK[index], true, -807057784);
                                Buffer var9 = new Buffer(decodedBuffer);
                                var9.decodeXTEA(keys, 5, var9.payload.length, -98152950);
                                break label193;
                            }
                        }

                        decodedBuffer = classCe.transformData(this.fieldK[index], false, -807057784);
                    }

                    int var14;
                    int id;
                    int var17;
                    int var18;
                    byte[] container;

                    try {
                        container = UtilClass39.decodeContainer(decodedBuffer, 165685569);
                    } catch (RuntimeException var22) {
                        String var12 = "" + (keys != null) + "," + index + "," + decodedBuffer.length + ",";
                        var14 = decodedBuffer.length;
                        id = -1;

                        for (var17 = 0; var17 < var14; ++var17) {
                            id = id >>> 8 ^ Buffer.fieldI[(id ^ decodedBuffer[var17]) & 255];
                        }

                        id = ~id;
                        String var28 = var12 + id + ",";
                        var18 = decodedBuffer.length - 2;
                        int var20 = -1;

                        for (int var21 = 0; var21 < var18; ++var21) {
                            var20 = var20 >>> 8 ^ Buffer.fieldI[(var20 ^ decodedBuffer[var21]) & 255];
                        }

                        var20 = ~var20;
                        throw ClanMate.error(var22, var28 + var20 + "," + this.fieldL[index] + "," + this.fieldX * -1535585527);
                    }

                    if (this.fieldO) {
                        this.fieldK[index] = null;
                    }

                    if (archiveSize > 1) {

                        int var10 = container.length;
                        --var10;
                        int chunks = container[var10] & 0xFF;
                        var10 -= chunks * archiveSize * 4;
                        Buffer var26 = new Buffer(container);
                        int[] sizes = new int[archiveSize];
                        var26.caret = var10 * -99503879;

                        int chunkSize;
                        for (var14 = 0; var14 < chunks; ++var14) {
                            chunkSize = 0;
                            for (id = 0; id < archiveSize; ++id) {
                                chunkSize += var26.readInt((byte) -101);
                                sizes[id] += chunkSize;
                            }
                        }

                        byte[][] entries = new byte[archiveSize][];

                        for (int id0 = 0; id0 < archiveSize; ++id0) {
                            entries[id0] = new byte[sizes[id0]];
                            sizes[id0] = 0;
                        }

                        var26.caret = var10 * -99503879;
                        chunkSize = 0;

                        for (id = 0; id < chunks; ++id) {
                            var17 = 0;

                            for (var18 = 0; var18 < archiveSize; ++var18) {

                                var17 += var26.readInt((byte) 57);
                                System.arraycopy(container, chunkSize, entries[var18], sizes[var18], var17);
                                sizes[var18] += var17;
                                chunkSize += var17;
                            }
                        }

                        for (id = 0; id < archiveSize; ++id) {
                            if (!this.fieldQ) {
                                archiveEntries[var5[id]] = UnknownEnum3.maskBuffer(entries[id], false, (byte) -56);
                            } else {
                                archiveEntries[var5[id]] = entries[id];
                            }
                        }

                    } else if (!this.fieldQ) {
                        archiveEntries[var5[0]] = UnknownEnum3.maskBuffer(container, false, (byte) -25);
                    } else {
                        archiveEntries[var5[0]] = container;
                    }

                    return true;
                }
            }
        } catch (RuntimeException var23) {
            throw ClanMate.error(var23, "ek.t(" + ')');
        }
    }

    public int h(String var1, int var2) {
        try {
            var1 = var1.toLowerCase();
            return this.fieldB.search(Parameter.method142(var1, -724423035));
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "ek.h(" + ')');
        }
    }

    public int u(int var1, String var2, int var3) {
        try {
            var2 = var2.toLowerCase();
            return this.identities[var1].search(Parameter.method142(var2, -724423035));
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "ek.u(" + ')');
        }
    }

    public byte[] j(String var1, String var2, byte var3) {
        try {
            var1 = var1.toLowerCase();
            var2 = var2.toLowerCase();
            int var4 = this.fieldB.search(Parameter.method142(var1, -724423035));
            int var5 = this.identities[var4].search(Parameter.method142(var2, -724423035));
            return this.getFile(var4, var5, (short) 15957);
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "ek.j(" + ')');
        }
    }

    public boolean g(String var1, String var2, int var3) {
        try {
            var1 = var1.toLowerCase();
            var2 = var2.toLowerCase();
            int var4 = this.fieldB.search(Parameter.method142(var1, -724423035));
            int var5 = this.identities[var4].search(Parameter.method142(var2, -724423035));
            return this.l(var4, var5, -2008110651);
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "ek.g(" + ')');
        }
    }

    public boolean y(String var1, int var2) {
        try {
            int var3 = this.h("", 644398611);
            if (-1 != var3) {
                if (var2 != -99503879) {
                    throw new IllegalStateException();
                } else {
                    return this.g("", var1, -1719611740);
                }
            } else {
                return this.g(var1, "", -1714459476);
            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "ek.y(" + ')');
        }
    }

    public void p(String var1, int var2) {
        try {
            var1 = var1.toLowerCase();
            int var3 = this.fieldB.search(Parameter.method142(var1, -724423035));
            if (var3 < 0) {
                if (var2 == -201045954) {
                    throw new IllegalStateException();
                }
            } else {
                this.v(var3, (byte) 45);
            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "ek.p(" + ')');
        }
    }

    public int getFileCount(int var1) {
        try {
            return this.fieldF.length;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "ek.x(" + ')');
        }
    }

    void a(byte[] var1, int var2) {
        try {
            int var4 = var1.length;
            int var6 = -1;

            int var7;
            for (var7 = 0; var7 < var4; ++var7) {
                var6 = var6 >>> 8 ^ Buffer.fieldI[(var6 ^ var1[var7]) & 255];
            }

            var6 = ~var6;
            this.fieldX = var6 * 160607033;
            Buffer var5 = new Buffer(UtilClass39.decodeContainer(var1, 1941057296));
            var6 = var5.readUByte();
            if (var6 >= 5) {
                if (var6 <= 7) {
                    if (var6 >= 6) {
                        var5.readInt((byte) 14);
                    }

                    var7 = var5.readUByte();
                    if (var6 >= 7) {
                        this.fieldA = var5.ae(1977148040) * -1056207049;
                    } else {
                        this.fieldA = var5.readUShort() * -1056207049;
                    }

                    int var8 = 0;
                    int var9 = -1;
                    this.fieldV = new int[this.fieldA * -854763897];
                    int var10;
                    if (var6 >= 7) {
                        for (var10 = 0; var10 < this.fieldA * -854763897; ++var10) {
                            if (var2 == 1158645973) {
                                return;
                            }

                            this.fieldV[var10] = var8 += var5.ae(-1275454968);
                            if (this.fieldV[var10] > var9) {
                                var9 = this.fieldV[var10];
                            }
                        }
                    } else {
                        for (var10 = 0; var10 < this.fieldA * -854763897; ++var10) {
                            if (var2 == 1158645973) {
                                throw new IllegalStateException();
                            }

                            this.fieldV[var10] = var8 += var5.readUShort();
                            if (this.fieldV[var10] > var9) {
                                if (var2 == 1158645973) {
                                    return;
                                }

                                var9 = this.fieldV[var10];
                            }
                        }
                    }

                    this.fieldL = new int[var9 + 1];
                    this.fieldM = new int[1 + var9];
                    this.fieldW = new int[var9 + 1];
                    this.fieldE = new int[var9 + 1][];
                    this.fieldK = new Object[1 + var9];
                    this.fieldF = new Object[var9 + 1][];
                    if (var7 != 0) {
                        this.fieldI = new int[var9 + 1];

                        for (var10 = 0; var10 < this.fieldA * -854763897; ++var10) {
                            if (var2 == 1158645973) {
                                return;
                            }

                            this.fieldI[this.fieldV[var10]] = var5.readInt((byte) -6);
                        }

                        this.fieldB = new IdentityTable(this.fieldI);
                    }

                    for (var10 = 0; var10 < this.fieldA * -854763897; ++var10) {
                        if (var2 == 1158645973) {
                            throw new IllegalStateException();
                        }

                        this.fieldL[this.fieldV[var10]] = var5.readInt((byte) -88);
                    }

                    for (var10 = 0; var10 < this.fieldA * -854763897; ++var10) {
                        if (var2 == 1158645973) {
                            return;
                        }

                        this.fieldM[this.fieldV[var10]] = var5.readInt((byte) -23);
                    }

                    for (var10 = 0; var10 < this.fieldA * -854763897; ++var10) {
                        if (var2 == 1158645973) {
                            throw new IllegalStateException();
                        }

                        this.fieldW[this.fieldV[var10]] = var5.readUShort();
                    }

                    int var11;
                    int var12;
                    int var13;
                    int var14;
                    int var15;
                    if (var6 >= 7) {
                        if (var2 == 1158645973) {
                            throw new IllegalStateException();
                        }

                        for (var10 = 0; var10 < this.fieldA * -854763897; ++var10) {
                            if (var2 == 1158645973) {
                                throw new IllegalStateException();
                            }

                            var11 = this.fieldV[var10];
                            var12 = this.fieldW[var11];
                            var8 = 0;
                            var13 = -1;
                            this.fieldE[var11] = new int[var12];

                            for (var14 = 0; var14 < var12; ++var14) {
                                if (var2 == 1158645973) {
                                    throw new IllegalStateException();
                                }

                                var15 = this.fieldE[var11][var14] = var8 += var5.ae(-2145900634);
                                if (var15 > var13) {
                                    var13 = var15;
                                }
                            }

                            this.fieldF[var11] = new Object[1 + var13];
                        }
                    } else {
                        for (var10 = 0; var10 < this.fieldA * -854763897; ++var10) {
                            if (var2 == 1158645973) {
                                throw new IllegalStateException();
                            }

                            var11 = this.fieldV[var10];
                            var12 = this.fieldW[var11];
                            var8 = 0;
                            var13 = -1;
                            this.fieldE[var11] = new int[var12];

                            for (var14 = 0; var14 < var12; ++var14) {
                                var15 = this.fieldE[var11][var14] = var8 += var5.readUShort();
                                if (var15 > var13) {
                                    if (var2 == 1158645973) {
                                        return;
                                    }

                                    var13 = var15;
                                }
                            }

                            this.fieldF[var11] = new Object[1 + var13];
                        }
                    }

                    if (0 != var7) {
                        if (var2 == 1158645973) {
                            return;
                        }

                        this.fieldN = new int[1 + var9][];
                        this.identities = new IdentityTable[1 + var9];

                        for (var10 = 0; var10 < this.fieldA * -854763897; ++var10) {
                            var11 = this.fieldV[var10];
                            var12 = this.fieldW[var11];
                            this.fieldN[var11] = new int[this.fieldF[var11].length];

                            for (var13 = 0; var13 < var12; ++var13) {
                                this.fieldN[var11][this.fieldE[var11][var13]] = var5.readInt((byte) -42);
                            }

                            this.identities[var11] = new IdentityTable(this.fieldN[var11]);
                        }
                    }

                    return;
                }

                if (var2 == 1158645973) {
                    throw new IllegalStateException();
                }
            }

            throw new RuntimeException("");
        } catch (RuntimeException var16) {
            throw ClanMate.error(var16, "ek.a(" + ')');
        }
    }

    void v(int var1, byte var2) {
        try {
            ;
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "ek.v(" + ')');
        }
    }

    public int getFileEntryCount(int var1, byte var2) {
        try {
            return this.fieldF[var1].length;
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "ek.d(" + ')');
        }
    }
}
