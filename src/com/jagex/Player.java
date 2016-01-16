package com.jagex;

import java.awt.*;
import java.lang.*;
import java.net.URL;

public final class Player extends Character {

    static int fieldKq;
    static Image fieldPq;
    boolean noTransform = false;
    boolean hidden = false;
    int skullIcon = -577060937;
    int prayerIcon = 1371539939;
    int combatLevel = 0;
    int height;
    String name;
    int objTransformEndCycle = 0;
    int objectLocX;
    int objectLocZ;
    int objectLocY;
    PlayerConfig cfg;
    int objRegionX;
    int totalLevel = 0;
    int objMaxRegionX;
    int objMaxRegionY;
    int team = 0;
    Model transformObjModel;
    int objRegionY;
    int objTransformStartCycle = 0;

    static final int method143(int var0, int var1, int var2, byte var3) {
        try {
            int var4 = var0 / var2;
            int var5 = var0 & var2 - 1;
            int var6 = var1 / var2;
            int var7 = var1 & var2 - 1;
            int var8 = UnknownEnum1.method90(var4, var6, 651806284);
            int var9 = UnknownEnum1.method90(1 + var4, var6, 651806284);
            int var10 = UnknownEnum1.method90(var4, var6 + 1, 651806284);
            int var11 = UnknownEnum1.method90(var4 + 1, var6 + 1, 651806284);
            int var12 = Varp.method394(var8, var9, var5, var2, -1169060667);
            int var13 = Varp.method394(var10, var11, var5, var2, 1980853196);
            return Varp.method394(var12, var13, var7, var2, -1803262454);
        } catch (RuntimeException var14) {
            throw ClanMate.error(var14, "i.s(" + ')');
        }
    }

    static boolean method144(Widget var0, byte var1) {
        try {
            if (Client.fieldJv) {
                if (var1 <= 0) {
                    throw new IllegalStateException();
                }

                if (UtilClass38.getWidgetConfig(var0, 2070855251) != 0) {
                    if (var1 <= 0) {
                        throw new IllegalStateException();
                    }

                    return false;
                }

                if (0 == var0.type * -729517859) {
                    if (var1 <= 0) {
                        throw new IllegalStateException();
                    }

                    return false;
                }
            }

            return var0.fieldR;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "i.dl(" + ')');
        }
    }

    static final void method145(int var0) {
        try {
            for (Projectile var1 = (Projectile) Client.projectileDeque.next(); null != var1; var1 = (Projectile) Client.projectileDeque.tail()) {
                if (Client.floorLevel * 87713183 == var1.fieldV * 643278347 && Client.engineCycle * -1223223371 <= var1.fieldE * 1858612267) {
                    if (Client.engineCycle * -1223223371 >= var1.fieldW * 1996772321) {
                        if (var0 <= -1179136749) {
                            return;
                        }

                        if (var1.fieldK * 693331085 > 0) {
                            if (var0 <= -1179136749) {
                                throw new IllegalStateException();
                            }

                            Npc var2 = Client.npcs[var1.fieldK * 693331085 - 1];
                            if (null != var2 && var2.strictX * 404428603 >= 0) {
                                if (var0 <= -1179136749) {
                                    throw new IllegalStateException();
                                }

                                if (var2.strictX * 404428603 < 13312) {
                                    if (var0 <= -1179136749) {
                                        throw new IllegalStateException();
                                    }

                                    if (var2.strictY * -1490664571 >= 0) {
                                        if (var0 <= -1179136749) {
                                            throw new IllegalStateException();
                                        }

                                        if (var2.strictY * -1490664571 < 13312) {
                                            if (var0 <= -1179136749) {
                                                throw new IllegalStateException();
                                            }

                                            var1.a(var2.strictX * 404428603, var2.strictY * -1490664571, Landscape.getTileHeight(var2.strictX * 404428603, var2.strictY * -1490664571, var1.fieldV * 643278347) - var1.fieldM * -57217399, Client.engineCycle * -1223223371, 1303475738);
                                        }
                                    }
                                }
                            }
                        }

                        if (var1.fieldK * 693331085 < 0) {
                            if (var0 <= -1179136749) {
                                throw new IllegalStateException();
                            }

                            int var3 = -(var1.fieldK * 693331085) - 1;
                            Player var5;
                            if (var3 == Client.playerServerIndex * -1508358289) {
                                var5 = Client.myPlayer;
                            } else {
                                var5 = Client.players[var3];
                            }

                            if (null != var5) {
                                if (var0 <= -1179136749) {
                                    throw new IllegalStateException();
                                }

                                if (var5.strictX * 404428603 >= 0) {
                                    if (var0 <= -1179136749) {
                                        throw new IllegalStateException();
                                    }

                                    if (var5.strictX * 404428603 < 13312) {
                                        if (var0 <= -1179136749) {
                                            throw new IllegalStateException();
                                        }

                                        if (var5.strictY * -1490664571 >= 0 && var5.strictY * -1490664571 < 13312) {
                                            if (var0 <= -1179136749) {
                                                return;
                                            }

                                            var1.a(var5.strictX * 404428603, var5.strictY * -1490664571, Landscape.getTileHeight(var5.strictX * 404428603, var5.strictY * -1490664571, var1.fieldV * 643278347) - var1.fieldM * -57217399, Client.engineCycle * -1223223371, 1303475738);
                                        }
                                    }
                                }
                            }
                        }

                        var1.i(Client.fieldEo * 1985191041, (byte) 0);
                        Client.landscape.addNpcEntityMarker(Client.floorLevel * 87713183, (int) var1.fieldD, (int) var1.fieldX, (int) var1.fieldO, 60, var1, var1.fieldG * -1161761717, -1, false);
                    }
                } else {
                    var1.delete();
                }
            }

        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "i.az(" + ')');
        }
    }

    static final void method146(int DUMMY) {
        try {
            for (LandscapeMod var1 = (LandscapeMod) Client.landscapeModDeque.next(); null != var1; var1 = (LandscapeMod) Client.landscapeModDeque.tail()) {

                if (var1.spawnLife * 27100243 > 0) {
                    var1.spawnLife -= -928555045;
                }

                boolean var2;
                int var3;
                int var4;
                ObjectDefinition var5;
                if (var1.spawnLife * 27100243 == 0) {
                    if (var1.prevObjectId * -850990379 >= 0) {

                        var3 = var1.prevObjectId * -850990379;
                        var4 = var1.prevObjectType * -1579015257;
                        var5 = PlayerConfig.getObjectDef(var3, 744442828);

                        if (11 == var4) {
                            var4 = 10;
                        }

                        if (var4 >= 5) {
                            if (var4 <= 8) {
                                var4 = 4;
                            }
                        }

                        var2 = var5.m(var4, (byte) -5);
                        if (!var2) {
                            continue;
                        }

                    }


                    UtilClass43.spawnObject(var1.floor * -94243731, var1.objectStubType * -1927249751, var1.regionX * -567016967, var1.regionY * 29917975, var1.prevObjectId * -850990379, var1.prevObjectRot * -1111723533, var1.prevObjectType * -1579015257, -93750200);
                    var1.delete();


                } else {

                    if (var1.spawnDelay * 1928588973 > 0) {
                        var1.spawnDelay -= 1001235749;
                    }

                    if (0 == var1.spawnDelay * 1928588973) {
                        if (var1.regionX * -567016967 >= 1) {
                            if (var1.regionY * 29917975 >= 1) {
                                if (var1.regionX * -567016967 <= 102) {
                                    if (var1.regionY * 29917975 <= 102) {
                                        if (var1.curObjectId * -2105141045 >= 0) {
                                            var3 = var1.curObjectId * -2105141045;
                                            var4 = var1.curObjectType * 155147131;
                                            var5 = PlayerConfig.getObjectDef(var3, -915388555);
                                            if (11 == var4) {
                                                var4 = 10;
                                            }

                                            if (var4 >= 5) {
                                                if (var4 <= 8) {
                                                    var4 = 4;
                                                }
                                            }

                                            var2 = var5.m(var4, (byte) 13);
                                            if (!var2) {
                                                continue;
                                            }
                                        }

                                        UtilClass43.spawnObject(var1.floor * -94243731, var1.objectStubType * -1927249751, var1.regionX * -567016967, var1.regionY * 29917975, var1.curObjectId * -2105141045, var1.curObjectRot * -2075767921, var1.curObjectType * 155147131, 1400473141);
                                        var1.spawnDelay = -1001235749;
                                        if (var1.curObjectId * -2105141045 == var1.prevObjectId * -850990379) {
                                            if (var1.prevObjectId * -850990379 == -1) {
                                                var1.delete();
                                                continue;
                                            }
                                        }

                                        if (var1.curObjectId * -2105141045 == var1.prevObjectId * -850990379 && var1.curObjectRot * -2075767921 == var1.prevObjectRot * -1111723533) {
                                            if (var1.curObjectType * 155147131 == var1.prevObjectType * -1579015257) {
                                                var1.delete();
                                            }
                                        }

                                    }
                                }
                            }
                        }
                    }
                }
            }

        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "i.bo(" + ')');
        }
    }

    static final void method147(int var0, int var1) {
        try {
            if (Widget.loadWidget(var0, 477596194)) {
                UnknownEnum2.method103(Widget.widgets[var0], -1, (byte) 100);
            }
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "i.cu(" + ')');
        }
    }

    static final boolean method148(Widget var0, int var1) {
        try {
            if (var0.fieldDq == null) {
                if (var1 >= -874849393) {
                    throw new IllegalStateException();
                } else {
                    return false;
                }
            } else {
                for (int var2 = 0; var2 < var0.fieldDq.length; ++var2) {
                    int var3 = ReferenceTableSub.method105(var0, var2, (byte) 70);
                    int var4 = var0.fieldDh[var2];
                    if (2 == var0.fieldDq[var2]) {
                        if (var1 >= -874849393) {
                            throw new IllegalStateException();
                        }

                        if (var3 >= var4) {
                            if (var1 >= -874849393) {
                                throw new IllegalStateException();
                            }

                            return false;
                        }
                    } else if (3 == var0.fieldDq[var2]) {
                        if (var3 <= var4) {
                            if (var1 >= -874849393) {
                                throw new IllegalStateException();
                            }

                            return false;
                        }
                    } else if (4 == var0.fieldDq[var2]) {
                        if (var1 >= -874849393) {
                            throw new IllegalStateException();
                        }

                        if (var4 == var3) {
                            if (var1 >= -874849393) {
                                throw new IllegalStateException();
                            }

                            return false;
                        }
                    } else if (var3 != var4) {
                        if (var1 >= -874849393) {
                            throw new IllegalStateException();
                        }

                        return false;
                    }
                }

                return true;
            }
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "i.cn(" + ')');
        }
    }

    static void method149(int var0) {
        try {
            Object var1 = classEs.fieldB;
            synchronized (classEs.fieldB) {
                if (0 == classEs.fieldI * 1123152153) {
                    if (var0 >= -685943478) {
                        throw new IllegalStateException();
                    }

                    classBq.globalTaskSchedular.scheduleThreadTask(new classEs(), 5, 922174047);
                }

                classEs.fieldI = 1375840280;
            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "i.i(" + ')');
        }
    }

    static Message method150(int var0, int var1, byte var2) {
        try {
            MessageContainer var3 = (MessageContainer) UtilClass40.messageContainerMap.get(Integer.valueOf(var0));
            return var3.getMessageAt(var1);
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "i.b(" + ')');
        }
    }

    public static int method151(int var0, int var1) {
        try {
            --var0;
            var0 |= var0 >>> 1;
            var0 |= var0 >>> 2;
            var0 |= var0 >>> 4;
            var0 |= var0 >>> 8;
            var0 |= var0 >>> 16;
            return 1 + var0;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "i.i(" + ')');
        }
    }

    static void method152(byte var0) {
        try {
            try {
                if (null == classCs.fieldAf) {
                    if (var0 <= 0) {
                        throw new IllegalStateException();
                    }

                    classCs.fieldAf = new classT(classBq.globalTaskSchedular, new URL(Varp.fieldO));
                } else {
                    byte[] var1 = classCs.fieldAf.a((byte) 79);
                    if (var1 != null) {
                        if (var0 <= 0) {
                            throw new IllegalStateException();
                        }

                        Buffer var2 = new Buffer(var1);
                        ClientData.fieldBo = var2.readUShort() * 1252782341;
                        ExchangeOfferQuantityComparator.fieldBi = new World[ClientData.fieldBo * -136563763];

                        for (int var3 = 0; var3 < ClientData.fieldBo * -136563763; ++var3) {
                            if (var0 <= 0) {
                                throw new IllegalStateException();
                            }

                            World var4 = ExchangeOfferQuantityComparator.fieldBi[var3] = new World();
                            var4.fieldA = var2.readUShort() * 300018445;
                            var4.fieldV = var2.readInt((byte) 48) * 1125622367;
                            var4.fieldB = var2.readString(1045331859);
                            var4.fieldL = var2.readString(317135859);
                            var4.fieldM = var2.readUByte() * 1656384895;
                            var4.fieldI = var2.j((byte) 1) * -818425643;
                            var4.fieldW = -1490258821 * var3;
                        }

                        UtilClass39.method174(ExchangeOfferQuantityComparator.fieldBi, 0, ExchangeOfferQuantityComparator.fieldBi.length - 1, ClientData.fieldBm, ClientData.fieldBz, 1621082554);
                        ClientData.isWorldSelectorOpen = true;
                        classCs.fieldAf = null;
                    }
                }
            } catch (Exception var5) {
                var5.printStackTrace();
                classCs.fieldAf = null;
            }

        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "i.s(" + ')');
        }
    }

    final void read(Buffer buffer, int var2) {
        try {
            buffer.caret = 0;
            int var3 = buffer.readUByte();
            this.skullIcon = buffer.readByte() * 577060937;
            this.prayerIcon = buffer.readByte() * -1371539939;
            int var4 = -1;
            this.team = 0;
            int[] var5 = new int[12];

            int var7;
            int var8;
            for (int var6 = 0; var6 < 12; ++var6) {
                var7 = buffer.readUByte();
                if (0 == var7) {
                    var5[var6] = 0;
                } else {
                    var8 = buffer.readUByte();
                    var5[var6] = var8 + (var7 << 8);
                    if (var6 == 0 && var5[0] == '\uffff') {
                        var4 = buffer.readUShort();
                        break;
                    }

                    if (var5[var6] >= 512) {
                        int var9 = Client.getItemDefinition(var5[var6] - 512, -1500813541).team * 96025317;
                        if (0 != var9) {
                            this.team = -1388357959 * var9;
                        }
                    }
                }
            }

            int[] var11 = new int[5];

            for (var7 = 0; var7 < 5; ++var7) {
                label159:
                {
                    var8 = buffer.readUByte();
                    if (var8 >= 0 && var8 < UtilClass24.fieldE[var7].length) {
                        break label159;
                    }
                    var8 = 0;
                }
                var11[var7] = var8;
            }

            //animations
            this.fieldC = buffer.readUShort() * 2135249911;
            if (this.fieldC * -1367515705 == '\uffff') {
                this.fieldC = -2135249911;
            }

            this.fieldAn = buffer.readUShort() * -1311650547;
            if (this.fieldAn * 1447479749 == '\uffff') {
                this.fieldAn = 1311650547;
            }

            this.fieldAs = this.fieldAn * 224772019;
            this.fieldAh = buffer.readUShort() * 83690551;
            if ('\uffff' == this.fieldAh * -138546809) {
                this.fieldAh = -83690551;
            }

            this.fieldAr = buffer.readUShort() * 839425765;
            if ('\uffff' == this.fieldAr * 1348267757) {
                this.fieldAr = -839425765;
            }

            this.fieldAe = buffer.readUShort() * -207366633;
            if ('\uffff' == this.fieldAe * -586628697) {
                this.fieldAe = 207366633;
            }

            this.fieldAv = buffer.readUShort() * -5089843;
            if ('\uffff' == this.fieldAv * 1025679109) {
                this.fieldAv = 5089843;
            }

            this.fieldAl = buffer.readUShort() * 805153131;
            if (this.fieldAl * -17614013 == '\uffff') {
                this.fieldAl = -805153131;
            }

            this.name = buffer.readString(1913967959);
            if (Client.myPlayer == this) {
                RSException.fieldV = this.name;
            }

            this.combatLevel = buffer.readUByte() * 1650804407;
            this.totalLevel = buffer.readUShort() * 311813835;

            this.hidden = buffer.readUByte() == 1;
            if (0 == Client.fieldE * -135999197 && Client.playerRights * -1572330347 >= 2) {
                this.hidden = false;
            }

            if (this.cfg == null) {
                this.cfg = new PlayerConfig();
            }

            boolean var10003 = var3 == 1;

            this.cfg.a(var5, var11, var10003, var4, (byte) 6);
        } catch (RuntimeException var10) {
            throw ClanMate.error(var10, "i.a(" + ')');
        }
    }

    @Override
    final boolean isValid(int var1) {
        try {
            return this.cfg != null;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "i.i(" + ')');
        }
    }

    @Override
    protected final Model getModel(int DUMMY) {
        try {
            if (this.cfg == null) {
                return null;
            } else {
                AnimationSequence var10000;
                label178:
                {
                    if (-1 != this.animation * -433706235 && this.animationDelay * -1858896077 == 0) {
                        var10000 = AnimationSequence.get(this.animation * -433706235, 474230764);
                        break label178;
                    }
                    var10000 = null;
                }

                AnimationSequence var2;
                label172:
                {
                    var2 = var10000;
                    if (-1 != this.fieldAc * -1420731557 && !this.noTransform) {
                        label183:
                        {
                            if (this.fieldC * -1367515705 == this.fieldAc * -1420731557 && var2 != null) {
                                break label183;
                            }
                            var10000 = AnimationSequence.get(this.fieldAc * -1420731557, 1144390243);
                            break label172;
                        }
                    }
                    var10000 = null;
                }

                AnimationSequence var3 = var10000;
                Model var4 = this.cfg.w(var2, this.fieldBo * 1983896939, var3, this.fieldAp * 816706191, (byte) -124);
                if (null == var4) {
                    return null;
                } else {
                    var4.m();
                    this.fieldBn = var4.modelHeight * 45054333;
                    Model var5;
                    Model[] var6;
                    if (!this.noTransform && -1 != this.fieldBp * -1404237317 && -1 != this.fieldBw * -2049894135) {
                        var5 = TilePaint.getAnimation(this.fieldBp * -1404237317, -2076569634).l(this.fieldBw * -2049894135, 680234509);
                        if (null != var5) {
                            var5.translate(0, -(this.fieldBr * -634107447), 0);
                            var6 = new Model[]{var4, var5};
                            var4 = new Model(var6, 2);
                        }
                    }

                    if (!this.noTransform && null != this.transformObjModel) {
                 /*           if (Client.viewportCycle * -1223223371 >= this.objTransformEndCycle * 2084005499) { //End Cycle
                                this.transformObjModel = null;
                            }
*/
                        if (Client.engineCycle * -1223223371 >= this.objTransformStartCycle * -1732723403) { //StartCycle
                            if (Client.engineCycle * -1223223371 < this.objTransformEndCycle * 2084005499) { //End Cycle
                                var5 = this.transformObjModel;
                                var5.translate(
                                        this.objectLocX * 1370558207 - this.strictX * 404428603,
                                        this.objectLocZ * -635548129 - this.height * -804179369,
                                        this.objectLocY * -867228493 - this.strictY * -1490664571
                                );
                                if (512 == this.objOrientation * -1133027529) {
                                    var5.d();
                                    var5.d();
                                    var5.d();
                                } else if (this.objOrientation * -1133027529 == 1024) {
                                    var5.d();
                                    var5.d();
                                } else if (this.objOrientation * -1133027529 == 1536) {
                                    var5.d();
                                }

                                var6 = new Model[]{var4, var5};
                                var4 = new Model(var6, 2);

                                if (this.objOrientation * -1133027529 == 512) {
                                    var5.d();
                                } else if (this.objOrientation * -1133027529 == 1024) {
                                    var5.d();
                                    var5.d();
                                } else if (this.objOrientation * -1133027529 == 1536) {
                                    var5.d();
                                    var5.d();
                                    var5.d();
                                }
                                var5.translate(this.strictX * 404428603 - this.objectLocX * 1370558207, this.height * -804179369 - this.objectLocZ * -635548129, this.strictY * -1490664571 - this.objectLocY * -867228493);
                            }
                        }
                    }
                    if (this.transformObjModel != null) {
                        System.out.println("YE");
                        var4 = this.transformObjModel;
                    }
                    var4.fieldAn = true;
                    return var4;
                }
            }
        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "i.v(" + ')');
        }
    }
}
