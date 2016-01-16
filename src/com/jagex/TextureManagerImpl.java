package com.jagex;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TextureManagerImpl implements TextureManager {

    static byte fieldMy;
    static classBt fieldNa;
    NodeDeque fieldV = new NodeDeque();
    int fieldI;
    int fieldB = 0;
    double fieldL = 1.0D;
    int fieldM = -1938869120;
    ReferenceTable fieldW;
    classBj[] fieldA;


    public TextureManagerImpl(ReferenceTable var1, ReferenceTable var2, int var3, double var4, int var6) {
        this.fieldW = var2;
        this.fieldI = var3 * -484812855;
        this.fieldB = this.fieldI * -1669315919;
        this.fieldL = var4;
        this.fieldM = var6 * -753344919;
        int[] var7 = var1.f(0, 932846416);
        int var8 = var7.length;
        this.fieldA = new classBj[var1.getFileEntryCount(0, (byte) 0)];

        for (int var9 = 0; var9 < var8; ++var9) {
            Buffer var10 = new Buffer(var1.getFile(0, var7[var9], (short) 12010));
            this.fieldA[var7[var9]] = new classBj(var10);
        }

    }

    static final boolean packet(int var0) {
        try {
            if (null == Client.socket) {
                return false;
            } else {
                String var2;
                int var3;
                try {
                    int var1 = Client.socket.available(2098146773);
                    if (0 == var1) {
                        if (var0 == -1205395532) {
                            throw new IllegalStateException();
                        }

                        return false;
                    }

                    if (-1 == Client.packetId * -5466435) {
                        if (var0 == -1205395532) {
                            throw new IllegalStateException();
                        }

                        Client.socket.read(Client.packet.payload, 0, 1, -192107713);
                        Client.packet.caret = 0;
                        Client.packetId = Client.packet.gs(1538225559) * -453798763;
                        Client.fieldCb = UtilClass25.fieldGh[Client.packetId * -5466435] * 764415269;
                        --var1;
                    }

                    if (Client.fieldCb * 237192877 == -1) {
                        if (var0 == -1205395532) {
                            throw new IllegalStateException();
                        }

                        if (var1 <= 0) {
                            return false;
                        }

                        if (var0 == -1205395532) {
                            throw new IllegalStateException();
                        }

                        Client.socket.read(Client.packet.payload, 0, 1, -192107713);
                        Client.fieldCb = 764415269 * (Client.packet.payload[0] & 255);
                        --var1;
                    }

                    if (-2 == Client.fieldCb * 237192877) {
                        if (var0 == -1205395532) {
                            throw new IllegalStateException();
                        }

                        if (var1 <= 1) {
                            return false;
                        }

                        Client.socket.read(Client.packet.payload, 0, 2, -192107713);
                        Client.packet.caret = 0;
                        Client.fieldCb = Client.packet.readUShort() * 764415269;
                        var1 -= 2;
                    }

                    if (var1 < Client.fieldCb * 237192877) {
                        if (var0 == -1205395532) {
                            throw new IllegalStateException();
                        }

                        return false;
                    }

                    Client.packet.caret = 0;
                    Client.socket.read(Client.packet.payload, 0, Client.fieldCb * 237192877, -192107713);
                    Client.fieldCn = 0;
                    Client.fieldCv = Client.fieldCy * 1449742493;
                    Client.fieldCy = Client.fieldCg * 1532001963;
                    Client.fieldCg = Client.packetId * 173267609;
                    int var32;
                    if (Client.packetId * -5466435 == 200) {
                        for (var32 = 0; var32 < Client.players.length; ++var32) {
                            if (Client.players[var32] != null) {
                                if (var0 == -1205395532) {
                                    throw new IllegalStateException();
                                }

                                Client.players[var32].animation = 1079449139;
                            }
                        }

                        for (var32 = 0; var32 < Client.npcs.length; ++var32) {
                            if (var0 == -1205395532) {
                                throw new IllegalStateException();
                            }

                            if (Client.npcs[var32] != null) {
                                if (var0 == -1205395532) {
                                    throw new IllegalStateException();
                                }

                                Client.npcs[var32].animation = 1079449139;
                            }
                        }

                        Client.packetId = 453798763;
                        return true;
                    }

                    int var6;
                    int var36;
                    Widget var43;
                    int var44;
                    if (238 == Client.packetId * -5466435) {
                        if (var0 == -1205395532) {
                            throw new IllegalStateException();
                        }

                        label2855:
                        {
                            var32 = Client.packet.readInt((byte) 14);
                            var3 = Client.packet.ay((byte) 51);
                            var36 = Client.packet.ay((byte) 127);
                            var43 = Widget.lookup(var32);
                            var6 = var43.fieldU * -1111468299 + var3;
                            var44 = var36 + var43.fieldJ * 1595666411;
                            if (var43.relativeX * -1209469007 == var6) {
                                if (var0 == -1205395532) {
                                    throw new IllegalStateException();
                                }

                                if (var44 == var43.relativeY * -493238439) {
                                    break label2855;
                                }

                                if (var0 == -1205395532) {
                                    throw new IllegalStateException();
                                }
                            }

                            var43.relativeX = var6 * 1121775953;
                            var43.relativeY = var44 * 1941180649;
                            classBx.method250(var43, 57574739);
                        }

                        Client.packetId = 453798763;
                        return true;
                    }

                    Widget var42;
                    if (143 == Client.packetId * -5466435) {
                        if (var0 == -1205395532) {
                            throw new IllegalStateException();
                        }

                        label2846:
                        {
                            var32 = Client.packet.bw(-1651771824);
                            var3 = Client.packet.ac((byte) 98);
                            var42 = Widget.lookup(var32);
                            if (2 == var42.fieldAd * -1111255667) {
                                if (var0 == -1205395532) {
                                    throw new IllegalStateException();
                                }

                                if (var42.fieldAu * -1801975607 == var3) {
                                    break label2846;
                                }

                                if (var0 == -1205395532) {
                                    throw new IllegalStateException();
                                }
                            }

                            var42.fieldAd = 1836673674;
                            var42.fieldAu = var3 * -858091143;
                            classBx.method250(var42, 57574739);
                        }

                        Client.packetId = 453798763;
                        return true;
                    }

                    boolean var46;
                    int var55;
                    if (Client.packetId * -5466435 == 25) {
                        if (var0 == -1205395532) {
                            throw new IllegalStateException();
                        }

                        var2 = Client.packet.readString(-335233847);
                        var3 = Client.packet.readUShort();
                        byte var104 = Client.packet.readByte();
                        var46 = false;
                        if (var104 == -128) {
                            if (var0 == -1205395532) {
                                throw new IllegalStateException();
                            }

                            var46 = true;
                        }

                        if (var46) {
                            if (var0 == -1205395532) {
                                throw new IllegalStateException();
                            }

                            if (0 == classCx.fieldMw * 4951847) {
                                Client.packetId = 453798763;
                                return true;
                            }

                            boolean var83 = false;

                            for (var6 = 0; var6 < classCx.fieldMw * 4951847; ++var6) {
                                if (LandscapeMod.clanMates[var6].displayName.equals(var2)) {
                                    if (var0 == -1205395532) {
                                        throw new IllegalStateException();
                                    }

                                    if (-714802545 * LandscapeMod.clanMates[var6].world == var3) {
                                        if (var0 == -1205395532) {
                                            throw new IllegalStateException();
                                        }
                                        break;
                                    }
                                }
                            }

                            if (var6 < classCx.fieldMw * 4951847) {
                                if (var0 == -1205395532) {
                                    throw new IllegalStateException();
                                }

                                while (var6 < classCx.fieldMw * 4951847 - 1) {
                                    if (var0 == -1205395532) {
                                        throw new IllegalStateException();
                                    }

                                    LandscapeMod.clanMates[var6] = LandscapeMod.clanMates[var6 + 1];
                                    ++var6;
                                }

                                classCx.fieldMw -= -1120472937;
                                LandscapeMod.clanMates[classCx.fieldMw * 4951847] = null;
                            }
                        } else {
                            String kek = Client.packet.readString(1377373755);

                            ClanMate var91 = new ClanMate();
                            var91.displayName = var2;
                            var91.uniDisplayName = CalendarUtil.method297(var91.displayName, UtilClass38.fieldS, 1781195076);
                            var91.world = 485549167 * var3;
                            var91.rank = var104;


                            for (var44 = classCx.fieldMw * 4951847 - 1; var44 >= 0; --var44) {
                                if (var0 == -1205395532) {
                                    throw new IllegalStateException();
                                }

                                var55 = LandscapeMod.clanMates[var44].uniDisplayName.compareTo(var91.uniDisplayName);
                                if (0 == var55) {
                                    if (var0 == -1205395532) {
                                        throw new IllegalStateException();
                                    }

                                    LandscapeMod.clanMates[var44].world = 485549167 * var3;
                                    LandscapeMod.clanMates[var44].rank = var104;
                                    if (var2.equals(Client.myPlayer.name)) {
                                        if (var0 == -1205395532) {
                                            throw new IllegalStateException();
                                        }

                                        fieldMy = var104;
                                    }

                                    Client.fieldKy = Client.fieldKe * 1646183227;
                                    Client.packetId = 453798763;
                                    return true;
                                }

                                if (var55 < 0) {
                                    break;
                                }
                            }

                            if (classCx.fieldMw * 4951847 >= LandscapeMod.clanMates.length) {
                                if (var0 == -1205395532) {
                                    throw new IllegalStateException();
                                }

                                Client.packetId = 453798763;
                                return true;
                            }

                            for (var55 = classCx.fieldMw * 4951847 - 1; var55 > var44; --var55) {
                                if (var0 == -1205395532) {
                                    throw new IllegalStateException();
                                }

                                LandscapeMod.clanMates[var55 + 1] = LandscapeMod.clanMates[var55];
                            }

                            if (classCx.fieldMw * 4951847 == 0) {
                                if (var0 == -1205395532) {
                                    throw new IllegalStateException();
                                }

                                LandscapeMod.clanMates = new ClanMate[100];
                            }

                            LandscapeMod.clanMates[1 + var44] = var91;
                            classCx.fieldMw += -1120472937;
                            if (var2.equals(Client.myPlayer.name)) {
                                fieldMy = var104;
                            }
                        }

                        Client.fieldKy = Client.fieldKe * 1646183227;
                        Client.packetId = 453798763;
                        return true;
                    }

                    if (161 == Client.packetId * -5466435) {
                        if (var0 == -1205395532) {
                            throw new IllegalStateException();
                        }

                        classJ.fieldDc = Client.packet.aw((byte) 7) * 790383431;
                        UtilClass14.fieldDn = Client.packet.aw((byte) 7) * 2131321803;

                        for (var32 = classJ.fieldDc * 968617591; var32 < classJ.fieldDc * 968617591 + 8; ++var32) {
                            if (var0 == -1205395532) {
                                throw new IllegalStateException();
                            }

                            for (var3 = UtilClass14.fieldDn * 1626548707; var3 < UtilClass14.fieldDn * 1626548707 + 8; ++var3) {
                                if (var0 == -1205395532) {
                                    throw new IllegalStateException();
                                }

                                if (Client.groundItemDeques[Client.floorLevel * 87713183][var32][var3] != null) {
                                    if (var0 == -1205395532) {
                                        throw new IllegalStateException();
                                    }

                                    Client.groundItemDeques[Client.floorLevel * 87713183][var32][var3] = null;
                                    WidgetNode.method97(var32, var3);
                                }
                            }
                        }

                        for (LandscapeMod var107 = (LandscapeMod) Client.landscapeModDeque.next(); var107 != null; var107 = (LandscapeMod) Client.landscapeModDeque.tail()) {
                            if (var0 == -1205395532) {
                                throw new IllegalStateException();
                            }

                            if (var107.regionX * -567016967 >= classJ.fieldDc * 968617591 && var107.regionX * -567016967 < classJ.fieldDc * 968617591 + 8) {
                                if (var0 == -1205395532) {
                                    throw new IllegalStateException();
                                }

                                if (var107.regionY * 29917975 >= UtilClass14.fieldDn * 1626548707) {
                                    if (var0 == -1205395532) {
                                        throw new IllegalStateException();
                                    }

                                    if (var107.regionY * 29917975 < 8 + UtilClass14.fieldDn * 1626548707) {
                                        if (var0 == -1205395532) {
                                            throw new IllegalStateException();
                                        }

                                        if (var107.floor * -94243731 == Client.floorLevel * 87713183) {
                                            if (var0 == -1205395532) {
                                                throw new IllegalStateException();
                                            }

                                            var107.spawnLife = 0;
                                        }
                                    }
                                }
                            }
                        }

                        Client.packetId = 453798763;
                        return true;
                    }

                    if (Client.packetId * -5466435 == 18) {
                        Client.cameraLocked = true;
                        ItemTable.fieldNt = Client.packet.readUByte() * -178563265;
                        StringConstants.fieldNz = Client.packet.readUByte() * -116156463;
                        Message.fieldNh = Client.packet.readUShort() * -138704207;
                        UtilClass18.fieldNs = Client.packet.readUByte() * -945625543;
                        UtilClass1.fieldNo = Client.packet.readUByte() * -1685268935;
                        if (UtilClass1.fieldNo * 45103113 >= 100) {
                            GraphicsStub.cameraX = 1303544256 + ItemTable.fieldNt * -1900962688;
                            classEr.cameraY = StringConstants.fieldNz * 2117190272 + -1477663424;
                            Preferences.cameraZ = (Landscape.getTileHeight(GraphicsStub.cameraX * 1659667383, classEr.cameraY * -875394883, Client.floorLevel * 87713183) - Message.fieldNh * 1397128785) * 1828163927;
                        }

                        Client.packetId = 453798763;
                        return true;
                    }

                    if (192 == Client.packetId * -5466435) {
                        if (var0 == -1205395532) {
                            throw new IllegalStateException();
                        }

                        UtilClass11.method85(false, (byte) 52);
                        Client.packetId = 453798763;
                        return true;
                    }

                    if (Client.packetId * -5466435 == 2) {
                        Client.destinationX = Client.packet.readUByte() * -950792229;
                        if (Client.destinationX * 1192318035 == 255) {
                            if (var0 == -1205395532) {
                                throw new IllegalStateException();
                            }

                            Client.destinationX = 0;
                        }

                        Client.destinationY = Client.packet.readUByte() * -475172701;
                        if (Client.destinationY * 1715520267 == 255) {
                            Client.destinationY = 0;
                        }

                        Client.packetId = 453798763;
                        return true;
                    }

                    if (75 == Client.packetId * -5466435) {
                        NpcDefinition.method380(false, 68773785);
                        Client.packetId = 453798763;
                        return true;
                    }

                    if (117 == Client.packetId * -5466435) {
                        if (var0 == -1205395532) {
                            throw new IllegalStateException();
                        }

                        Client.fieldAe = Client.packet.readUByte() * 2001548553;
                        if (1 == Client.fieldAe * 314239289) {
                            if (var0 == -1205395532) {
                                throw new IllegalStateException();
                            }

                            Client.hintIconNpcIndex = Client.packet.readUShort() * 335258659;
                        }

                        if (Client.fieldAe * 314239289 >= 2) {
                            if (var0 == -1205395532) {
                                throw new IllegalStateException();
                            }

                            if (Client.fieldAe * 314239289 <= 6) {
                                if (var0 == -1205395532) {
                                    throw new IllegalStateException();
                                }

                                if (Client.fieldAe * 314239289 == 2) {
                                    if (var0 == -1205395532) {
                                        throw new IllegalStateException();
                                    }

                                    Client.fieldAz = 2017308224;
                                    Client.fieldAi = -1488386880;
                                }

                                if (3 == Client.fieldAe * 314239289) {
                                    if (var0 == -1205395532) {
                                        throw new IllegalStateException();
                                    }

                                    Client.fieldAz = 0;
                                    Client.fieldAi = -1488386880;
                                }

                                if (Client.fieldAe * 314239289 == 4) {
                                    if (var0 == -1205395532) {
                                        throw new IllegalStateException();
                                    }

                                    Client.fieldAz = -260350848;
                                    Client.fieldAi = -1488386880;
                                }

                                if (5 == Client.fieldAe * 314239289) {
                                    if (var0 == -1205395532) {
                                        throw new IllegalStateException();
                                    }

                                    Client.fieldAz = 2017308224;
                                    Client.fieldAi = 0;
                                }

                                if (6 == Client.fieldAe * 314239289) {
                                    if (var0 == -1205395532) {
                                        throw new IllegalStateException();
                                    }

                                    Client.fieldAz = 2017308224;
                                    Client.fieldAi = 1318193536;
                                }

                                Client.fieldAe = -291870190;
                                Client.hintIconX = Client.packet.readUShort() * -293152585;
                                Client.hintIconY = Client.packet.readUShort() * 369176927;
                                Client.fieldAx = Client.packet.readUByte() * -1697034205;
                            }
                        }

                        if (Client.fieldAe * 314239289 == 10) {
                            if (var0 == -1205395532) {
                                throw new IllegalStateException();
                            }

                            Client.hintIconPlayerIndex = Client.packet.readUShort() * -1492213635;
                        }

                        Client.packetId = 453798763;
                        return true;
                    }

                    if (9 == Client.packetId * -5466435) {
                        if (var0 == -1205395532) {
                            throw new IllegalStateException();
                        }

                        Client.fieldMp = Client.packet.readUByte() * 253087153;
                        Client.packetId = 453798763;
                        return true;
                    }

                    if (Client.packetId * -5466435 == 208) {
                        var32 = Client.packet.readUByte();
                        if (Client.packet.readUByte() == 0) {
                            Client.localExchangeOffers[var32] = new ExchangeOffer();
                            Client.packet.caret += -1791069822;
                        } else {
                            Client.packet.caret -= -99503879;
                            Client.localExchangeOffers[var32] = new ExchangeOffer(Client.packet, false);
                        }
                        Client.fieldKx = Client.fieldKe * -1928385147;
                        Client.packetId = 453798763;
                        return true;
                    }

                    if (125 == Client.packetId * -5466435) {
                        for (var32 = 0; var32 < Varp.fieldV * 93921467; ++var32) {
                            Varp var106 = UtilClass10.getVarp(var32, -437911675);
                            if (var106 != null) {
                                UtilClass27.tempVars[var32] = 0;
                                UtilClass27.vars[var32] = 0;
                            }
                        }

                        EntityMarker.method330(1803308586);
                        Client.fieldKc += -1373304928;
                        Client.packetId = 453798763;
                        return true;
                    }

                    if (Client.packetId * -5466435 == 14) {
                        if (var0 == -1205395532) {
                            throw new IllegalStateException();
                        }

                        classEp.method184((byte) -113);
                        Client.packetId = 453798763;
                        return false;
                    }

                    if (Client.packetId * -5466435 == 205) {
                        if (var0 == -1205395532) {
                            throw new IllegalStateException();
                        }

                        var32 = Client.packet.ac((byte) 22);
                        if (var32 == '\uffff') {
                            if (var0 == -1205395532) {
                                throw new IllegalStateException();
                            }

                            var32 = -1;
                        }

                        Message.method384(var32, (short) 29264);
                        Client.packetId = 453798763;
                        return true;
                    }

                    if (Client.packetId * -5466435 == 118) {
                        if (var0 == -1205395532) {
                            throw new IllegalStateException();
                        }

                        var32 = Client.packet.g(-1901563443);
                        var3 = Client.packet.readUShort();
                        if ('\uffff' == var3) {
                            if (var0 == -1205395532) {
                                throw new IllegalStateException();
                            }

                            var3 = -1;
                        }

                        if (0 != Client.fieldMh * 895565207) {
                            if (var0 == -1205395532) {
                                throw new IllegalStateException();
                            }

                            if (-1 != var3) {
                                if (var0 == -1205395532) {
                                    throw new IllegalStateException();
                                }

                                UtilClass40.method171(Client.fieldBz, var3, 0, Client.fieldMh * 895565207, false, -911580244);
                                Client.fieldMv = true;
                            }
                        }

                        Client.packetId = 453798763;
                        return true;
                    }

                    if (37 == Client.packetId * -5466435) {
                        if (var0 == -1205395532) {
                            throw new IllegalStateException();
                        }

                        var2 = Client.packet.readString(244332234);
                        Object[] var105 = new Object[var2.length() + 1];

                        for (var36 = var2.length() - 1; var36 >= 0; --var36) {
                            if (var0 == -1205395532) {
                                throw new IllegalStateException();
                            }

                            if (var2.charAt(var36) == 115) {
                                if (var0 == -1205395532) {
                                    throw new IllegalStateException();
                                }

                                var105[1 + var36] = Client.packet.readString(1487950708);
                            } else {
                                var105[var36 + 1] = new Integer(Client.packet.readInt((byte) -38));
                            }
                        }

                        var105[0] = new Integer(Client.packet.readInt((byte) 31));
                        ScriptEvent var103 = new ScriptEvent();
                        var103.args = var105;
                        classT.method167(var103, (byte) 1);
                        Client.packetId = 453798763;
                        return true;
                    }

                    String var4;
                    int var9;
                    int var12;
                    boolean var54;
                    long var62;
                    long var64;
                    int var71;
                    if (Client.packetId * -5466435 == 154) {
                        if (var0 == -1205395532) {
                            throw new IllegalStateException();
                        }

                        Client.fieldKy = Client.fieldKe * 1646183227;
                        if (0 == Client.fieldCb * 237192877) {
                            if (var0 == -1205395532) {
                                throw new IllegalStateException();
                            }

                            Client.fieldMz = null;
                            Client.fieldMf = null;
                            classCx.fieldMw = 0;
                            LandscapeMod.clanMates = null;
                            Client.packetId = 453798763;
                            return true;
                        }

                        label2786:
                        {
                            Client.fieldMf = Client.packet.readString(-297260079);
                            long var102 = Client.packet.readLong(-1990967839);
                            var64 = var102;
                            if (var102 > 0L) {
                                if (var0 == -1205395532) {
                                    throw new IllegalStateException();
                                }

                                if (var102 < 6582952005840035281L) {
                                    if (0L == var102 % 37L) {
                                        if (var0 == -1205395532) {
                                            throw new IllegalStateException();
                                        }

                                        var4 = null;
                                    } else {
                                        var44 = 0;

                                        for (var62 = var102; var62 != 0L; var62 /= 37L) {
                                            ++var44;
                                        }

                                        StringBuilder var80 = new StringBuilder(var44);

                                        while (var64 != 0L) {
                                            if (var0 == -1205395532) {
                                                throw new IllegalStateException();
                                            }

                                            long var76 = var64;
                                            var64 /= 37L;
                                            var80.append(UtilClass36.fieldA[(int) (var76 - 37L * var64)]);
                                        }

                                        var4 = var80.reverse().toString();
                                    }
                                    break label2786;
                                }

                                if (var0 == -1205395532) {
                                    throw new IllegalStateException();
                                }
                            }

                            var4 = null;
                        }

                        Client.fieldMz = var4;
                        classDc.fieldMi = Client.packet.readByte();
                        var44 = Client.packet.readUByte();
                        if (255 == var44) {
                            if (var0 == -1205395532) {
                                throw new IllegalStateException();
                            }

                            Client.packetId = 453798763;
                            return true;
                        }

                        classCx.fieldMw = -1120472937 * var44;
                        ClanMate[] var86 = new ClanMate[100];

                        for (var9 = 0; var9 < classCx.fieldMw * 4951847; ++var9) {
                            if (var0 == -1205395532) {
                                throw new IllegalStateException();
                            }

                            var86[var9] = new ClanMate();
                            var86[var9].displayName = Client.packet.readString(1204737279);
                            var86[var9].uniDisplayName = CalendarUtil.method297(var86[var9].displayName, UtilClass38.fieldS, -2123110205);
                            var86[var9].world = Client.packet.readUShort() * 485549167;
                            var86[var9].rank = Client.packet.readByte();
                            String server = Client.packet.readString(1370611841);


                            if (var86[var9].displayName.equals(Client.myPlayer.name)) {
                                fieldMy = var86[var9].rank;
                            }
                        }

                        var54 = false;
                        var71 = classCx.fieldMw * 4951847;

                        while (var71 > 0) {
                            var54 = true;
                            --var71;

                            for (var12 = 0; var12 < var71; ++var12) {
                                if (var86[var12].uniDisplayName.compareTo(var86[var12 + 1].uniDisplayName) > 0) {
                                    if (var0 == -1205395532) {
                                        throw new IllegalStateException();
                                    }

                                    ClanMate var82 = var86[var12];
                                    var86[var12] = var86[1 + var12];
                                    var86[1 + var12] = var82;
                                    var54 = false;
                                }
                            }

                            if (var54) {
                                break;
                            }
                        }

                        LandscapeMod.clanMates = var86;
                        Client.packetId = 453798763;
                        return true;
                    }

                    if (79 == Client.packetId * -5466435) {
                        if (var0 == -1205395532) {
                            throw new IllegalStateException();
                        }

                        label2746:
                        {
                            var32 = Client.packet.bp(-709453079);
                            var3 = Client.packet.j((byte) 1);
                            var42 = Widget.lookup(var32);
                            if (var42.fieldAf * -9713859 == var3) {
                                if (var0 == -1205395532) {
                                    throw new IllegalStateException();
                                }

                                if (var3 != -1) {
                                    break label2746;
                                }

                                if (var0 == -1205395532) {
                                    throw new IllegalStateException();
                                }
                            }

                            var42.fieldAf = -1969895403 * var3;
                            var42.fieldDs = 0;
                            var42.fieldDc = 0;
                            classBx.method250(var42, 57574739);
                        }

                        Client.packetId = 453798763;
                        return true;
                    }

                    if (Client.packetId * -5466435 == 133) {
                        UtilClass11.method85(true, (byte) -10);
                        Client.packetId = 453798763;
                        return true;
                    }

                    int var37;
                    if (247 == Client.packetId * -5466435) {
                        var32 = Client.packet.readInt((byte) 2);
                        var3 = Client.packet.readUShort();
                        if (var32 < -70000) {
                            var3 += '\u8000';
                        }
                        var42 = var32 >= 0 ? Widget.lookup(var32) : null;
                        if (var42 != null) {
                            for (var37 = 0; var37 < var42.itemIds.length; ++var37) {
                                var42.itemIds[var37] = 0;
                                var42.itemQuantities[var37] = 0;
                            }
                        }

                        Keyboard.clearItemTable(var3, 108072868);
                        var37 = Client.packet.readUShort();

                        for (var6 = 0; var6 < var37; ++var6) {
                            var44 = Client.packet.ab(1810403947);
                            var55 = Client.packet.readUByte();
                            if (255 == var55) {
                                var55 = Client.packet.bl(147713622);
                            }
                            if (var42 != null && var6 < var42.itemIds.length) {
                                var42.itemIds[var6] = var44;
                                var42.itemQuantities[var6] = var55;
                            }

                            classEp.addToItemTable(var3, var6, var44 - 1, var55);
                        }

                        if (null != var42) {
                            classBx.method250(var42, 57574739);
                        }

                        EntityMarker.method330(1803308586);
                        Client.fieldKl[(Client.fieldKu += 1869216135) * -919438281 - 1 & 31] = var3 & 32767;
                        Client.packetId = 453798763;
                        return true;
                    }

                    if (182 == Client.packetId * -5466435) {
                        if (var0 == -1205395532) {
                            throw new IllegalStateException();
                        }

                        Client.packet.caret += 1508858684;
                        if (Client.packet.matchCrcs((short) 4032)) {
                            if (var0 == -1205395532) {
                                throw new IllegalStateException();
                            }

                            classDa.method282(Client.packet, Client.packet.caret * 651432265 - 28, 25216892);
                        }

                        Client.packetId = 453798763;
                        return true;
                    }

                    if (253 == Client.packetId * -5466435) {
                        if (var0 == -1205395532) {
                            throw new IllegalStateException();
                        }

                        var32 = Client.packet.readUShort();
                        var3 = Client.packet.readUByte();
                        var36 = Client.packet.readUShort();
                        if (0 != Client.fieldNe * 1707214503) {
                            if (var0 == -1205395532) {
                                throw new IllegalStateException();
                            }

                            if (0 != var3 && Client.fieldNx * 1993078547 < 50) {
                                Client.fieldNp[Client.fieldNx * 1993078547] = var32;
                                Client.fieldNl[Client.fieldNx * 1993078547] = var3;
                                Client.fieldNw[Client.fieldNx * 1993078547] = var36;
                                Client.fieldNq[Client.fieldNx * 1993078547] = null;
                                Client.fieldNj[Client.fieldNx * 1993078547] = 0;
                                Client.fieldNx += 1441295131;
                            }
                        }

                        Client.packetId = 453798763;
                        return true;
                    }

                    if (155 == Client.packetId * -5466435) {
                        var3 = Client.packet.readUByte();
                        classDs[] var99 = new classDs[]{classDs.fieldV, classDs.fieldI, classDs.fieldA};
                        classDs[] var100 = var99;
                        var6 = 0;

                        classDs var101;
                        while (true) {
                            if (var6 >= var100.length) {
                                var101 = null;
                                break;
                            }
                            classDs var84 = var100[var6];
                            if (var84.fieldB * -2010103131 == var3) {
                                var101 = var84;
                                break;
                            }

                            ++var6;
                        }

                        classEp.fieldLi = var101;
                        Client.packetId = 453798763;
                        return true;
                    }

                    boolean var10000;
                    boolean var33;
                    if (Client.packetId * -5466435 == 36) {
                        var32 = Client.packet.readInt((byte) -61);
                        var10000 = Client.packet.readInvertedUByte((byte) 0) == 1 ? true : false;
                        var33 = var10000;
                        var42 = Widget.lookup(var32);
                        if (var42.fieldR != var33) {
                            var42.fieldR = var33;
                            classBx.method250(var42, 57574739);
                        }

                        Client.packetId = 453798763;
                        return true;
                    }

                    if (166 == Client.packetId * -5466435) {
                        var32 = Client.packet.aw((byte) 7);
                        var3 = Client.packet.readUByte();
                        var36 = Client.packet.ao((byte) 18);
                        Client.floorLevel = (var32 >> 1) * 677607007;
                        Client.myPlayer.setLocation(var3, var36, (var32 & 0x1) == 1, (byte) 10);
                        Client.packetId = 453798763;
                        return true;
                    }

                    if (210 == Client.packetId * -5466435) {
                        var32 = Client.packet.readUShort();
                        Client.fieldJh = var32 * 1923106275;
                        classM.method129(var32, (byte) -86);
                        UtilClass1.method258(Client.fieldJh * -98490421, -1200024960);

                        for (var3 = 0; var3 < 100; ++var3) {
                            Client.fieldLp[var3] = true;
                        }

                        Client.packetId = 453798763;
                        return true;
                    }

                    Widget var41;
                    if (22 == Client.packetId * -5466435) {
                        var32 = Client.packet.readInt((byte) -18);
                        var41 = Widget.lookup(var32);
                        var41.fieldAd = -1539956785;
                        var41.fieldAu = Client.myPlayer.cfg.n(-1131399529) * -858091143;
                        classBx.method250(var41, 57574739);
                        Client.packetId = 453798763;
                        return true;
                    }

                    if (46 == Client.packetId * -5466435) {
                        for (var32 = 0; var32 < UtilClass27.vars.length; ++var32) {
                            if (UtilClass27.vars[var32] != UtilClass27.tempVars[var32]) {
                                int old = UtilClass27.vars[var32];
                                int now = UtilClass27.tempVars[var32];
                                UtilClass27.vars[var32] = UtilClass27.tempVars[var32];
                                IgnoredPlayer.method94(var32, (short) 7833);
                                Client.fieldKp[(Client.fieldKc += 1836132413) * -177295595 - 1 & 31] = var32;
                                System.out.println("Var Changed(" + var32 + ")[" + old + "->" + now + "]");
                            }
                        }

                        Client.packetId = 453798763;
                        return true;
                    }

                    if (147 == Client.packetId * -5466435) {
                        label2716:
                        {
                            var32 = Client.packet.ap();
                            var3 = Client.packet.readInt((byte) -21);
                            var42 = Widget.lookup(var3);
                            if (var42.fieldAd * -1111255667 == 1 && var32 == var42.fieldAu * -1801975607) {
                                break label2716;
                            }

                            var42.fieldAd = 918336837;
                            var42.fieldAu = -858091143 * var32;
                            classBx.method250(var42, 57574739);
                        }

                        Client.packetId = 453798763;
                        return true;
                    }

                    if (244 == Client.packetId * -5466435) {
                        Client.fieldHr = 0;
                        Client.fieldHt = 0;
                        Client.packet.gm(1024136874);
                        var32 = Client.packet.gx(1, 611482597);
                        if (0 != var32) {
                            var3 = Client.packet.gx(2, -1052137161);
                            if (var3 == 0) {
                                Client.fieldHm[(Client.fieldHt += -530461679) * -839605007 - 1] = 2047;
                            } else if (1 == var3) {
                                var36 = Client.packet.gx(3, -2030508043);
                                Client.myPlayer.k(var36, false, (short) 3321);
                                var37 = Client.packet.gx(1, -1626612256);
                                if (var37 == 1) {
                                    Client.fieldHm[(Client.fieldHt += -530461679) * -839605007 - 1] = 2047;
                                }
                            } else if (var3 == 2) {
                                var36 = Client.packet.gx(3, -658058203);
                                Client.myPlayer.k(var36, true, (short) 3321);
                                var37 = Client.packet.gx(3, 227622670);
                                Client.myPlayer.k(var37, true, (short) 3321);
                                var6 = Client.packet.gx(1, -1335588638);
                                if (var6 == 1) {
                                    Client.fieldHm[(Client.fieldHt += -530461679) * -839605007 - 1] = 2047;
                                }
                            } else if (3 == var3) {
                                var36 = Client.packet.gx(1, -1441149309);
                                if (1 == var36) {
                                    Client.fieldHm[(Client.fieldHt += -530461679) * -839605007 - 1] = 2047;
                                }

                                var37 = Client.packet.gx(1, -333812371);
                                Client.floorLevel = Client.packet.gx(2, -2092540994) * 677607007;
                                var6 = Client.packet.gx(7, -330398748);
                                var44 = Client.packet.gx(7, 1984497286);
                                Client.myPlayer.setLocation(var6, var44, var37 == 1, (byte) 10);
                            }
                        }

                        classEr.method191((byte) -4);

                        while (true) {
                            if (Client.packet.hf(Client.fieldCb * 237192877, (byte) -53) < 11) {
                                break;
                            }

                            var32 = Client.packet.gx(11, -410806694);
                            if (2047 == var32) {
                                break;
                            }

                            var33 = false;
                            if (null == Client.players[var32]) {
                                Client.players[var32] = new Player();
                                if (null != Client.playerBuffers[var32]) {
                                    Client.players[var32].read(Client.playerBuffers[var32], -1225537876);
                                }
                                var33 = true;
                            }

                            Client.playerIndicies[(Client.playerCount += 509931725) * 16022533 - 1] = var32;
                            Player var97 = Client.players[var32];
                            var97.fieldBx = Client.engineCycle * 612066721;
                            var37 = Client.packet.gx(1, -1068410245);
                            var6 = Client.packet.gx(1, 1589912800);
                            if (1 == var6) {
                                if (var0 == -1205395532) {
                                    throw new IllegalStateException();
                                }

                                Client.fieldHm[(Client.fieldHt += -530461679) * -839605007 - 1] = var32;
                            }

                            var44 = Client.packet.gx(5, 1907659684);
                            if (var44 > 15) {
                                var44 -= 32;
                            }

                            var55 = Client.characterOrientations[Client.packet.gx(3, -506190694)];
                            if (var33) {
                                var97.objOrientation = (var97.orientation = -32522175 * var55) * -1334373177;
                            }

                            var9 = Client.packet.gx(5, -1110729726);
                            if (var9 > 15) {
                                var9 -= 32;
                            }

                            var97.setLocation(Client.myPlayer.queueX[0] + var9, var44 + Client.myPlayer.queueY[0], 1 == var37, (byte) 10);
                        }

                        Client.packet.hd((byte) 126);
                        PlayerConfig.method16(-1347370030);

                        for (var32 = 0; var32 < Client.fieldHr * -2105647645; ++var32) {
                            var3 = Client.fieldHx[var32];
                            if (Client.engineCycle * -1223223371 != Client.players[var3].fieldBx * 16601493) {
                                Client.players[var3] = null;
                            }
                        }

                        if (651432265 * Client.packet.caret != Client.fieldCb * 237192877) {
                            throw new RuntimeException(651432265 * Client.packet.caret + UtilClass41.fieldV + Client.fieldCb * 237192877);
                        }

                        for (var32 = 0; var32 < Client.playerCount * 16022533; ++var32) {
                            if (null == Client.players[Client.playerIndicies[var32]]) {
                                throw new RuntimeException(var32 + UtilClass41.fieldV + Client.playerCount * 16022533);
                            }
                        }

                        Client.packetId = 453798763;
                        return true;
                    }

                    if (49 == Client.packetId * -5466435) {
                        EntityMarker.method330(1803308586);
                        Client.fieldJu = Client.packet.readUByte() * 231501847;
                        Client.fieldKo = Client.fieldKe * -1239619027;
                        Client.packetId = 453798763;
                        return true;
                    }

                    if (227 == Client.packetId * -5466435) {
                        if (-1 != Client.fieldJh * -98490421) {
                            var32 = Client.fieldJh * -98490421;
                            if (Widget.loadWidget(var32, 477596194)) {
                                InputHandler.method88(Widget.widgets[var32], 0, 1370273786);
                            }
                        }

                        Client.packetId = 453798763;
                        return true;
                    }

                    WidgetNode var38;
                    if (Client.packetId * -5466435 == 189) {
                        var32 = Client.packet.readInvertedUByte((byte) 0);
                        var3 = Client.packet.bl(-1747178085);
                        var36 = Client.packet.readUShort();
                        var38 = (WidgetNode) Client.widgetNodes.get((long) var3);
                        if (null != var38) {
                            WidgetNode.method189(var38, var36 != var38.owner * -1220935357);
                        }
                        WidgetNode var68 = new WidgetNode();
                        var68.owner = 1331204971 * var36;
                        var68.state = var32 * 1897215487;
                        Client.widgetNodes.put(var68, (long) var3);
                        classM.method129(var36, (byte) -35);
                        UtilClass1.method258(var36, -1616556860);
                        Widget var74 = Widget.lookup(var3);
                        if (var74 != null) {
                            classBx.method250(var74, 57574739);
                        }

                        if (Client.fieldJy != null) {
                            classBx.method250(Client.fieldJy, 57574739);
                            Client.fieldJy = null;
                        }

                        WidgetStrings.method408((byte) -9);
                        if (-1 != Client.fieldJh * -98490421) {
                            var55 = Client.fieldJh * -98490421;
                            if (!Widget.loadWidget(var55, 477596194)) {
                                if (var0 == -1205395532) {
                                    throw new IllegalStateException();
                                }
                            } else {
                                InputHandler.method88(Widget.widgets[var55], 1, 345830673);
                            }
                        }
                        Client.packetId = 453798763;
                        return true;
                    }

                    if (173 == Client.packetId * -5466435) {
                        Client.cameraLocked = false;
                        for (var32 = 0; var32 < 5; ++var32) {
                            Client.fieldOf[var32] = false;
                        }
                        Client.packetId = 453798763;
                        return true;
                    }

                    if (Client.packetId * -5466435 == 103) {
                        var32 = Client.packet.readInt((byte) -48);
                        WidgetNode var94 = (WidgetNode) Client.widgetNodes.get((long) var32);
                        if (null != var94) {
                            WidgetNode.method189(var94, true);
                        }

                        if (Client.fieldJy != null) {
                            classBx.method250(Client.fieldJy, 57574739);
                            Client.fieldJy = null;
                        }

                        Client.packetId = 453798763;
                        return true;
                    }

                    if (56 == Client.packetId * -5466435) {
                        Client.fieldAr = Client.packet.ab(1142489931) * -1698379098;
                        Client.fieldKo = Client.fieldKe * -1239619027;
                        Client.packetId = 453798763;
                        return true;
                    }

                    int var14;
                    int var17;
                    int var85;
                    if (226 == Client.packetId * -5466435) {
                        Packet var77 = Client.packet;
                        var3 = Client.fieldCb * 237192877;
                        ClassStructure var92 = new ClassStructure();
                        var92.count = var77.readUByte() * 119089837;
                        var92.fieldA = var77.readInt((byte) 3) * 2024839105;
                        var92.fieldI = new int[var92.count * -525874907];
                        var92.fieldB = new int[var92.count * -525874907];
                        var92.fields = new Field[var92.count * -525874907];
                        var92.fieldW = new int[var92.count * -525874907];
                        var92.methods = new Method[var92.count * -525874907];
                        var92.args = new byte[var92.count * -525874907][][];

                        for (var37 = 0; var37 < var92.count * -525874907; ++var37) {
                            try {
                                var6 = var77.readUByte();
                                String var69;
                                String var72;
                                if (var6 != 0 && 1 != var6 && 2 != var6) {
                                    if (3 != var6 && var6 != 4) {
                                        continue;
                                    }
                                    var72 = var77.readString(-236028374);
                                    var69 = var77.readString(1623640427);
                                    var9 = var77.readUByte();
                                    String[] var78 = new String[var9];

                                    for (var71 = 0; var71 < var9; ++var71) {
                                        var78[var71] = var77.readString(1819728255);
                                    }

                                    String var75 = var77.readString(669602145);
                                    byte[][] var87 = new byte[var9][];
                                    if (var6 == 3) {
                                        for (var85 = 0; var85 < var9; ++var85) {
                                            var14 = var77.readInt((byte) 15);
                                            var87[var85] = new byte[var14];
                                            var77.read(var87[var85], 0, var14, (byte) 37);
                                        }
                                    }

                                    var92.fieldI[var37] = var6;
                                    Class[] var95 = new Class[var9];

                                    for (var14 = 0; var14 < var9; ++var14) {
                                        var95[var14] = PlayerConfig.GetClass(var78[var14], -2142743746);
                                    }

                                    Class var98 = PlayerConfig.GetClass(var75, 112987041);
                                    if (PlayerConfig.GetClass(var72, 1892019121).getClassLoader() == null) {
                                        throw new SecurityException();
                                    }

                                    Method[] var90 = PlayerConfig.GetClass(var72, -1450112374).getDeclaredMethods();
                                    Method[] var96 = var90;

                                    for (var17 = 0; var17 < var96.length; ++var17) {
                                        Method var18 = var96[var17];
                                        if (var18.getName().equals(var69)) {
                                            Class[] paramTypes = var18.getParameterTypes();
                                            if (var95.length == paramTypes.length) {
                                                boolean var20 = true;
                                                for (int var21 = 0; var21 < var95.length; ++var21) {
                                                    if (var95[var21] != paramTypes[var21]) {
                                                        var20 = false;
                                                        break;
                                                    }
                                                }

                                                if (var20 && var98 == var18.getReturnType()) {
                                                    var92.methods[var37] = var18;
                                                }
                                            }
                                        }
                                    }

                                    var92.args[var37] = var87;
                                    continue;
                                }

                                var72 = var77.readString(-107654225);
                                var69 = var77.readString(-313054777);
                                var9 = 0;
                                if (var6 == 1) {
                                    var9 = var77.readInt((byte) -64);
                                }

                                var92.fieldI[var37] = var6;
                                var92.fieldW[var37] = var9;
                                if (PlayerConfig.GetClass(var72, -1543385772).getClassLoader() == null) {
                                    throw new SecurityException();
                                }
                                var92.fields[var37] = PlayerConfig.GetClass(var72, -370486080).getDeclaredField(var69);
                            } catch (ClassNotFoundException var24) {
                                var92.fieldB[var37] = -1;
                                // throw new InternalError("Renamed class possibly broke interaction!");
                            } catch (SecurityException var25) {
                                var92.fieldB[var37] = -2;
                            } catch (NullPointerException var26) {
                                var92.fieldB[var37] = -3;
                            } catch (Exception var27) {
                                var92.fieldB[var37] = -4;
                            } catch (Throwable var28) {
                                var92.fieldB[var37] = -5;
                            }
                        }

                        UtilClass31.classStructureIterable.delete(var92);
                        Client.packetId = 453798763;
                        return true;
                    }

                    String var35;
                    if (Client.packetId * -5466435 == 160) {
                        var2 = Client.packet.readString(15766130);
                        var35 = classGs.method32(ExchangeOfferTimeComparator.method26(ObjectDefinition.method358(Client.packet, -1553120784), 1584866160));
                        JagSocket.addMessage(6, var2, var35, (byte) 16);
                        Client.packetId = 453798763;
                        return true;
                    }

                    String var5;
                    if (Client.packetId * -5466435 == 26) {
                        if (var0 == -1205395532) {
                            throw new IllegalStateException();
                        }

                        var2 = Client.packet.readString(30764308);
                        classCf.fieldQ = var2;

                        try {
                            var35 = Client.instance.getParameter(Parameter.P15.name);
                            var4 = Client.instance.getParameter(Parameter.P7.name);
                            var5 = var35 + "settings=" + var2 + "; version=1; path=/; domain=" + var4;
                            if (var2.length() == 0) {
                                var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                            } else {
                                var5 = var5 + "; Expires=" + NpcDefinition.method379(classDz.getFancyTime(924974257) + 94608000000L) + "; Max-Age=" + 94608000L;
                            }

                            JSObjectUtil.eval(Client.instance, "document.cookie=\"" + var5 + "\"", -240856910);
                        } catch (Throwable var23) {
                            var23.printStackTrace();
                            ;
                        }

                        Client.packetId = 453798763;
                        return true;
                    }

                    if (170 == Client.packetId * -5466435) {
                        if (var0 == -1205395532) {
                            throw new IllegalStateException();
                        }

                        classJ.fieldDc = Client.packet.readInvertedUByte((byte) 0) * 790383431;
                        UtilClass14.fieldDn = Client.packet.aw((byte) 7) * 2131321803;

                        while (651432265 * Client.packet.caret < Client.fieldCb * 237192877) {
                            Client.packetId = Client.packet.readUByte() * -453798763;
                            LandscapeMod.method117(482916519);
                        }

                        Client.packetId = 453798763;
                        return true;
                    }

                    long var40;
                    long var52;
                    long var61;
                    boolean var73;
                    String var81;
                    if (Client.packetId * -5466435 == 104) {
                        if (var0 == -1205395532) {
                            throw new IllegalStateException();
                        }

                        var2 = Client.packet.readString(655936586);
                        var40 = Client.packet.readLong(-1111648960);
                        var64 = (long) Client.packet.readUShort();
                        var52 = (long) Client.packet.g(-1050731046);
                        UnknownEnum2 var58 = Preferences.ValueOf(UnknownEnum3.getEnum2Values(2138350206), Client.packet.readUByte(), -1576147742);
                        var61 = var52 + (var64 << 32);
                        var73 = false;

                        for (var85 = 0; var85 < 100; ++var85) {
                            if (var0 == -1205395532) {
                                throw new IllegalStateException();
                            }

                            if (Client.fieldLy[var85] == var61) {
                                if (var0 == -1205395532) {
                                    throw new IllegalStateException();
                                }

                                var73 = true;
                                break;
                            }
                        }

                        if (var58.fieldN) {
                            if (var0 == -1205395532) {
                                throw new IllegalStateException();
                            }

                            if (UtilClass1.isIgnored(var2, -1095155284)) {
                                var73 = true;
                            }
                        }

                        if (!var73) {
                            if (var0 == -1205395532) {
                                throw new IllegalStateException();
                            }

                            if (0 == Client.fieldGs * -1672251869) {
                                if (var0 == -1205395532) {
                                    throw new IllegalStateException();
                                }

                                Client.fieldLy[Client.fieldLv * -1286975453] = var61;
                                Client.fieldLv = -1421287541 * ((1 + Client.fieldLv * -1286975453) % 100);
                                var81 = classGs.method32(ExchangeOfferTimeComparator.method26(ObjectDefinition.method358(Client.packet, 1331511999), -1359779866));
                                if (var58.fieldW * 1736764383 != -1) {
                                    int var89 = var58.fieldW * 1736764383;
                                    String var93 = "<img=" + var89 + ">";
                                    Client.method27(9, var93 + var2, var81, UtilClass16.method56(var40), (short) 4096);
                                } else {
                                    Client.method27(9, var2, var81, UtilClass16.method56(var40), (short) 4096);
                                }
                            }
                        }

                        Client.packetId = 453798763;
                        return true;
                    }

                    if (Client.packetId * -5466435 == 44) {
                        var2 = Client.packet.readString(1478699673);
                        var3 = Client.packet.readUByte();
                        var36 = Client.packet.readUByte();
                        if (var36 >= 1) {
                            if (var0 == -1205395532) {
                                throw new IllegalStateException();
                            }

                            if (var36 <= 8) {
                                if (var0 == -1205395532) {
                                    throw new IllegalStateException();
                                }

                                if (var2.equalsIgnoreCase("null")) {
                                    if (var0 == -1205395532) {
                                        throw new IllegalStateException();
                                    }

                                    var2 = null;
                                }

                                Client.playerActions[var36 - 1] = var2;
                                int var10001 = var36 - 1;
                                boolean var10002;
                                if (0 == var3) {
                                    if (var0 == -1205395532) {
                                        throw new IllegalStateException();
                                    }

                                    var10002 = true;
                                } else {
                                    var10002 = false;
                                }

                                Client.fieldHs[var10001] = var10002;
                            }
                        }

                        Client.packetId = 453798763;
                        return true;
                    }

                    if (Client.packetId * -5466435 == 139) {
                        if (var0 == -1205395532) {
                            throw new IllegalStateException();
                        }

                        var32 = Client.packet.readUShort();
                        var3 = Client.packet.bp(715778742);
                        var36 = var32 >> 10 & 31;
                        var37 = var32 >> 5 & 31;
                        var6 = var32 & 31;
                        var44 = (var36 << 19) + (var37 << 11) + (var6 << 3);
                        Widget var65 = Widget.lookup(var3);
                        if (var65.fieldAh * 259666867 != var44) {
                            if (var0 == -1205395532) {
                                throw new IllegalStateException();
                            }

                            var65.fieldAh = -204360837 * var44;
                            classBx.method250(var65, 57574739);
                        }

                        Client.packetId = 453798763;
                        return true;
                    }

                    if (Client.packetId * -5466435 == 185) {
                        if (var0 == -1205395532) {
                            throw new IllegalStateException();
                        }

                        var32 = Client.packet.readInt((byte) -122);
                        UtilClass0.fieldAt = classBq.globalTaskSchedular.scheduleINetTask(var32, (byte) 1);
                        Client.packetId = 453798763;
                        return true;
                    }

                    if (248 == Client.packetId * -5466435) {
                        if (var0 == -1205395532) {
                            throw new IllegalStateException();
                        }

                        World var59 = new World();
                        var59.fieldB = Client.packet.readString(-331757002);
                        var59.fieldA = Client.packet.readUShort() * 300018445;
                        var3 = Client.packet.readInt((byte) -22);
                        var59.fieldV = 1125622367 * var3;
                        UnknownEnum.method373(45, (byte) -115);
                        Client.socket.stop(452673077);
                        Client.socket = null;
                        UnknownEnum4.method23(var59, 210450085);
                        Client.packetId = 453798763;
                        return false;
                    }

                    if (252 == Client.packetId * -5466435) {
                        var32 = Client.packet.ap();
                        CalendarUtil.method295(var32, 1399293285);
                        Client.fieldKl[(Client.fieldKu += 1869216135) * -919438281 - 1 & 31] = var32 & 32767;
                        Client.packetId = 453798763;
                        return true;
                    }

                    if (214 == Client.packetId * -5466435) {
                        if (var0 == -1205395532) {
                            throw new IllegalStateException();
                        }

                        var32 = Client.packet.readInt((byte) -82);
                        var3 = Client.packet.readUShort();
                        if (var32 < -70000) {
                            if (var0 == -1205395532) {
                                throw new IllegalStateException();
                            }

                            var3 += '\u8000';
                        }

                        if (var32 >= 0) {
                            if (var0 == -1205395532) {
                                throw new IllegalStateException();
                            }

                            var42 = Widget.lookup(var32);
                        } else {
                            var42 = null;
                        }

                        for (; Client.packet.caret * 651432265 < Client.fieldCb * 237192877; classEp.addToItemTable(var3, var37, var6 - 1, var44)) {
                            var37 = Client.packet.readImmediateSmart(2064278033);
                            var6 = Client.packet.readUShort();
                            var44 = 0;
                            if (0 != var6) {
                                var44 = Client.packet.readUByte();
                                if (var44 == 255) {
                                    if (var0 == -1205395532) {
                                        throw new IllegalStateException();
                                    }

                                    var44 = Client.packet.readInt((byte) -36);
                                }
                            }

                            if (var42 != null && var37 >= 0) {
                                if (var0 == -1205395532) {
                                    throw new IllegalStateException();
                                }

                                if (var37 < var42.itemIds.length) {
                                    if (var0 == -1205395532) {
                                        throw new IllegalStateException();
                                    }

                                    var42.itemIds[var37] = var6;
                                    var42.itemQuantities[var37] = var44;
                                }
                            }
                        }

                        if (null != var42) {
                            if (var0 == -1205395532) {
                                throw new IllegalStateException();
                            }

                            classBx.method250(var42, 57574739);
                        }

                        EntityMarker.method330(1803308586);
                        Client.fieldKl[(Client.fieldKu += 1869216135) * -919438281 - 1 & 31] = var3 & 32767;
                        Client.packetId = 453798763;
                        return true;
                    }

                    if (187 == Client.packetId * -5466435) {
                        if (var0 == -1205395532) {
                            throw new IllegalStateException();
                        }

                        var32 = Client.packet.bl(-868567269);
                        var3 = Client.packet.readUShort();
                        if (var3 == '\uffff') {
                            if (var0 == -1205395532) {
                                throw new IllegalStateException();
                            }

                            var3 = -1;
                        }

                        var36 = Client.packet.ap();
                        if (var36 == '\uffff') {
                            if (var0 == -1205395532) {
                                throw new IllegalStateException();
                            }

                            var36 = -1;
                        }

                        var37 = Client.packet.bp(2120377834);

                        for (var6 = var36; var6 <= var3; ++var6) {
                            var52 = (long) var6 + ((long) var32 << 32);
                            Node var56 = Client.widgetNodeConfigs.get(var52);
                            if (var56 != null) {
                                if (var0 == -1205395532) {
                                    throw new IllegalStateException();
                                }

                                var56.delete();
                            }

                            Client.widgetNodeConfigs.put(new IntegerNode(var37), var52);
                        }

                        Client.packetId = 453798763;
                        return true;
                    }

                    if (28 == Client.packetId * -5466435) {
                        if (var0 == -1205395532) {
                            throw new IllegalStateException();
                        }

                        var32 = Client.packet.readUByte();
                        var3 = Client.packet.readUByte();
                        var36 = Client.packet.readUByte();
                        var37 = Client.packet.readUByte();
                        Client.fieldOf[var32] = true;
                        Client.fieldOb[var32] = var3;
                        Client.fieldOn[var32] = var36;
                        Client.fieldOx[var32] = var37;
                        Client.fieldOq[var32] = 0;
                        Client.packetId = 453798763;
                        return true;
                    }

                    if (Client.packetId * -5466435 == 169) {
                        var32 = Client.packet.ac((byte) 104);
                        var3 = Client.packet.ac((byte) 109);
                        var36 = Client.packet.bp(-311746029);
                        var43 = Widget.lookup(var36);
                        var43.fieldBs = ((var32 << 16) + var3) * -1400310625;
                        Client.packetId = 453798763;
                        return true;
                    }

                    if (134 != Client.packetId * -5466435) {
                        if (var0 == -1205395532) {
                            throw new IllegalStateException();
                        }

                        if (150 != Client.packetId * -5466435 && Client.packetId * -5466435 != 67 && 32 != Client.packetId * -5466435) {
                            if (var0 == -1205395532) {
                                throw new IllegalStateException();
                            }

                            if (Client.packetId * -5466435 != 180 && 17 != Client.packetId * -5466435 && Client.packetId * -5466435 != 218 && 186 != Client.packetId * -5466435) {
                                if (var0 == -1205395532) {
                                    throw new IllegalStateException();
                                }

                                if (206 != Client.packetId * -5466435) {
                                    if (148 != Client.packetId * -5466435) {
                                        if (Client.packetId * -5466435 == 62) {
                                            if (var0 == -1205395532) {
                                                throw new IllegalStateException();
                                            }

                                            NpcDefinition.method380(true, 68773785);
                                            Client.packetId = 453798763;
                                            return true;
                                        }

                                        if (Client.packetId * -5466435 == 82) {
                                            if (var0 == -1205395532) {
                                                throw new IllegalStateException();
                                            }

                                            var32 = Client.packet.readImmediateSmart(1980445623);
                                            var33 = Client.packet.readUByte() == 1;
                                            var4 = "";
                                            var46 = false;
                                            if (var33) {
                                                if (var0 == -1205395532) {
                                                    throw new IllegalStateException();
                                                }

                                                var4 = Client.packet.readString(504519144);
                                                if (UtilClass1.isIgnored(var4, 243870475)) {
                                                    if (var0 == -1205395532) {
                                                        throw new IllegalStateException();
                                                    }

                                                    var46 = true;
                                                }
                                            }

                                            String var53 = Client.packet.readString(1056413530);
                                            if (!var46) {
                                                if (var0 == -1205395532) {
                                                    throw new IllegalStateException();
                                                }

                                                JagSocket.addMessage(var32, var4, var53, (byte) 16);
                                            }

                                            Client.packetId = 453798763;
                                            return true;
                                        }

                                        if (41 == Client.packetId * -5466435) {
                                            if (var0 == -1205395532) {
                                                throw new IllegalStateException();
                                            }

                                            Client.cameraLocked = true;
                                            SystemNode.fieldNu = Client.packet.readUByte() * -1713898413;
                                            ClassStructure.fieldNg = Client.packet.readUByte() * 1472583297;
                                            Keyboard.fieldNb = Client.packet.readUShort() * -1996403451;
                                            GroundItem.fieldNr = Client.packet.readUByte() * -1930022621;
                                            Preferences.fieldNv = Client.packet.readUByte() * -1079814079;
                                            if (Preferences.fieldNv * 818198465 >= 100) {
                                                if (var0 == -1205395532) {
                                                    throw new IllegalStateException();
                                                }

                                                var32 = SystemNode.fieldNu * 1574169984 + 64;
                                                var3 = 64 + ClassStructure.fieldNg * 708100224;
                                                var36 = Landscape.getTileHeight(var32, var3, Client.floorLevel * 87713183) - Keyboard.fieldNb * -620202035;
                                                var37 = var32 - GraphicsStub.cameraX * 1659667383;
                                                var6 = var36 - Preferences.cameraZ * 820898407;
                                                var44 = var3 - classEr.cameraY * -875394883;
                                                var55 = (int) Math.sqrt((double) (var44 * var44 + var37 * var37));
                                                classAo.pitch = ((int) (Math.atan2((double) var6, (double) var55) * 325.949D) & 2047) * 702658669;
                                                UtilClass11.yaw = ((int) (Math.atan2((double) var37, (double) var44) * -325.949D) & 2047) * 1735563723;
                                                if (classAo.pitch * 362746213 < 128) {
                                                    if (var0 == -1205395532) {
                                                        throw new IllegalStateException();
                                                    }

                                                    classAo.pitch = -254003584;
                                                }

                                                if (classAo.pitch * 362746213 > 383) {
                                                    classAo.pitch = -1464669421;
                                                }
                                            }

                                            Client.packetId = 453798763;
                                            return true;
                                        }

                                        if (71 == Client.packetId * -5466435) {
                                            if (var0 == -1205395532) {
                                                throw new IllegalStateException();
                                            }

                                            var32 = Client.packet.bl(-901545481);
                                            var3 = Client.packet.readUShort();
                                            var42 = Widget.lookup(var32);
                                            if (null != var42 && var42.type * -729517859 == 0) {
                                                if (var3 > var42.viewportHeight * 1854186653 - var42.height * -1004717071) {
                                                    var3 = var42.viewportHeight * 1854186653 - var42.height * -1004717071;
                                                }
                                                if (var3 < 0) {
                                                    var3 = 0;
                                                }
                                                if (var3 != var42.insetY * -1991825281) {
                                                    var42.insetY = 724604799 * var3;
                                                    classBx.method250(var42, 57574739);
                                                }
                                            }

                                            Client.packetId = 453798763;
                                            return true;
                                        }

                                        if (Client.packetId * -5466435 == 95) {
                                            if (var0 == -1205395532) {
                                                throw new IllegalStateException();
                                            }

                                            UtilClass14.fieldDn = Client.packet.readUByte() * 2131321803;
                                            classJ.fieldDc = Client.packet.aw((byte) 7) * 790383431;
                                            Client.packetId = 453798763;
                                            return true;
                                        }

                                        if (Client.packetId * -5466435 == 249) {
                                            if (var0 == -1205395532) {
                                                throw new IllegalStateException();
                                            }

                                            label2615:
                                            {
                                                var32 = Client.packet.ap();
                                                var3 = Client.packet.bw(1976658857);
                                                var36 = Client.packet.ac((byte) 72);
                                                var37 = Client.packet.ac((byte) 9);
                                                Widget var51 = Widget.lookup(var3);
                                                if (var32 == var51.fieldAy * 1396274965) {
                                                    if (var0 == -1205395532) {
                                                        throw new IllegalStateException();
                                                    }

                                                    if (var36 == var51.fieldBu * 550343665) {
                                                        if (var0 == -1205395532) {
                                                            throw new IllegalStateException();
                                                        }

                                                        if (var37 == var51.fieldBi * 1337242061) {
                                                            break label2615;
                                                        }

                                                        if (var0 == -1205395532) {
                                                            throw new IllegalStateException();
                                                        }
                                                    }
                                                }

                                                var51.fieldAy = -1514397635 * var32;
                                                var51.fieldBu = -1385890543 * var36;
                                                var51.fieldBi = -1638948091 * var37;
                                                classBx.method250(var51, 57574739);
                                            }

                                            Client.packetId = 453798763;
                                            return true;
                                        }

                                        if (Client.packetId * -5466435 == 8) {
                                            if (var0 == -1205395532) {
                                                throw new IllegalStateException();
                                            }

                                            var32 = Client.packet.ac((byte) 112);
                                            byte var47 = Client.packet.readByte();
                                            UtilClass27.tempVars[var32] = var47;
                                            if (UtilClass27.vars[var32] != var47) {

                                                int old = UtilClass27.vars[var32];
                                                int now = UtilClass27.tempVars[var32];

                                                if (var0 == -1205395532) {
                                                    throw new IllegalStateException();
                                                }

                                                UtilClass27.vars[var32] = var47;
                                                IgnoredPlayer.method94(var32, (short) 8922);

                                                System.out.println("Var Changed(" + var32 + ")[" + old + "->" + now + "]");

                                            }

                                            Client.fieldKp[(Client.fieldKc += 1836132413) * -177295595 - 1 & 31] = var32;
                                            Client.packetId = 453798763;
                                            return true;
                                        }

                                        if (Client.packetId * -5466435 == 191) {
                                            if (var0 == -1205395532) {
                                                throw new IllegalStateException();
                                            }

                                            var32 = Client.packet.readInt((byte) 55);
                                            var3 = Client.packet.ap();
                                            UtilClass27.tempVars[var3] = var32;
                                            if (UtilClass27.vars[var3] != var32) {

                                                int old = UtilClass27.vars[var3];
                                                int now = UtilClass27.tempVars[var3];


                                                if (var0 == -1205395532) {
                                                    throw new IllegalStateException();
                                                }

                                                UtilClass27.vars[var3] = var32;
                                                IgnoredPlayer.method94(var3, (short) 26782);

                                                System.out.println("Var Changed(" + var3 + ")[" + old + "->" + now + "]");

                                            }

                                            Client.fieldKp[(Client.fieldKc += 1836132413) * -177295595 - 1 & 31] = var3;
                                            Client.packetId = 453798763;
                                            return true;
                                        }

                                        if (156 == Client.packetId * -5466435) {
                                            EntityMarker.method330(1803308586);
                                            var32 = Client.packet.readUByte();
                                            var3 = Client.packet.bp(1332623161);
                                            var36 = Client.packet.readUByte();
                                            Client.experiences[var32] = var3;
                                            Client.levels[var32] = var36;
                                            Client.currentLevels[var32] = 1;

                                            for (var37 = 0; var37 < 98; ++var37) {
                                                if (var3 >= SkillInfo.XPTABLE[var37]) {
                                                    Client.currentLevels[var32] = 2 + var37;
                                                }
                                            }

                                            Client.fieldKs[(Client.fieldKk += 1159900295) * -765568713 - 1 & 31] = var32;
                                            Client.packetId = 453798763;
                                            return true;
                                        }

                                        if (Client.packetId * -5466435 == 135) {
                                            if (var0 == -1205395532) {
                                                throw new IllegalStateException();
                                            }

                                            var32 = Client.packet.bl(1810688611);
                                            var41 = Widget.lookup(var32);

                                            for (var36 = 0; var36 < var41.itemIds.length; ++var36) {
                                                if (var0 == -1205395532) {
                                                    throw new IllegalStateException();
                                                }

                                                var41.itemIds[var36] = -1;
                                                var41.itemIds[var36] = 0;
                                            }

                                            classBx.method250(var41, 57574739);
                                            Client.packetId = 453798763;
                                            return true;
                                        }

                                        if (116 == Client.packetId * -5466435) {
                                            if (var0 == -1205395532) {
                                                throw new IllegalStateException();
                                            }

                                            var2 = Client.packet.readString(1154823493);
                                            var40 = (long) Client.packet.readUShort();
                                            var64 = (long) Client.packet.g(-1220178951);
                                            UnknownEnum2 var49 = Preferences.ValueOf(UnknownEnum3.getEnum2Values(2138350206), Client.packet.readUByte(), -1717374787);
                                            var62 = var64 + (var40 << 32);
                                            boolean var70 = false;

                                            for (var71 = 0; var71 < 100; ++var71) {
                                                if (var62 == Client.fieldLy[var71]) {
                                                    if (var0 == -1205395532) {
                                                        throw new IllegalStateException();
                                                    }

                                                    var70 = true;
                                                    break;
                                                }
                                            }

                                            if (UtilClass1.isIgnored(var2, -2089221275)) {
                                                if (var0 == -1205395532) {
                                                    throw new IllegalStateException();
                                                }

                                                var70 = true;
                                            }

                                            if (!var70) {
                                                if (var0 == -1205395532) {
                                                    throw new IllegalStateException();
                                                }

                                                if (Client.fieldGs * -1672251869 == 0) {
                                                    if (var0 == -1205395532) {
                                                        throw new IllegalStateException();
                                                    }

                                                    Client.fieldLy[Client.fieldLv * -1286975453] = var62;
                                                    Client.fieldLv = -1421287541 * ((Client.fieldLv * -1286975453 + 1) % 100);
                                                    Packet var79 = Client.packet;

                                                    String var16;
                                                    try {
                                                        var14 = var79.readImmediateSmart(2029325702);
                                                        if (var14 > 32767) {
                                                            if (var0 == -1205395532) {
                                                                throw new IllegalStateException();
                                                            }

                                                            var14 = 32767;
                                                        }

                                                        byte[] var15 = new byte[var14];
                                                        var79.caret += Client.csInstance.v(var79.payload, var79.caret * 651432265, var15, 0, var14, (byte) 60) * -99503879;
                                                        var16 = ExchangeOfferData.method37(var15, 0, var14, (byte) 8);
                                                        var81 = var16;
                                                    } catch (Exception var22) {
                                                        var81 = "Cabbage";
                                                    }

                                                    var81 = classGs.method32(ExchangeOfferTimeComparator.method26(var81, -1565386374));
                                                    byte var88;
                                                    if (var49.fieldE) {
                                                        if (var0 == -1205395532) {
                                                            throw new IllegalStateException();
                                                        }

                                                        var88 = 7;
                                                    } else {
                                                        var88 = 3;
                                                    }

                                                    if (-1 != var49.fieldW * 1736764383) {
                                                        if (var0 == -1205395532) {
                                                            throw new IllegalStateException();
                                                        }

                                                        var17 = var49.fieldW * 1736764383;
                                                        var16 = "<img=" + var17 + ">";
                                                        JagSocket.addMessage(var88, var16 + var2, var81, (byte) 16);
                                                    } else {
                                                        JagSocket.addMessage(var88, var2, var81, (byte) 16);
                                                    }
                                                }
                                            }

                                            Client.packetId = 453798763;
                                            return true;
                                        }

                                        boolean var34;
                                        if (240 == Client.packetId * -5466435) {
                                            while (651432265 * Client.packet.caret < Client.fieldCb * 237192877) {
                                                var10000 = Client.packet.readUByte() == 1;
                                                var34 = var10000;
                                                var35 = Client.packet.readString(55944005);
                                                var4 = Client.packet.readString(-290455451);
                                                var37 = Client.packet.readUShort();
                                                var6 = Client.packet.readUByte();
                                                var44 = Client.packet.readUByte();
                                                boolean var57 = 0 != (var44 & 2);
                                                var54 = 0 != (var44 & 1);
                                                if (var37 > 0) {
                                                    Client.packet.readString(-134788194);
                                                    Client.packet.readUByte();
                                                    Client.packet.readInt((byte) 41);
                                                }

                                                Client.packet.readString(1144329497);
                                                int var63 = 0;

                                                while (true) {
                                                    if (var63 < Client.chosenFriendIndex * 1960973713) {
                                                        label3069:
                                                        {
                                                            FriendedPlayer friend = Client.friendedPlayers[var63];
                                                            if (!var34) {
                                                                if (var35.equals(friend.displayName)) {
                                                                    if (friend.world * -1774843337 != var37) {
                                                                        var73 = true;
                                                                        for (classAm var13 = (classAm) Client.classGjListOfClassAm.v(); null != var13; var13 = (classAm) Client.classGjListOfClassAm.i()) {
                                                                            if (var13.fieldV.equals(var35)) {
                                                                                if (0 != var37 && 0 == var13.fieldI) {
                                                                                    var13.delete();
                                                                                    var73 = false;
                                                                                    continue;
                                                                                }

                                                                                if (0 == var37 && 0 != var13.fieldI) {
                                                                                    var13.delete();
                                                                                    var73 = false;
                                                                                }
                                                                            }
                                                                        }

                                                                        if (var73) {

                                                                            Client.classGjListOfClassAm.a(new classAm(var35, var37));
                                                                        }

                                                                        friend.world = -330183801 * var37;
                                                                    }

                                                                    friend.previousName = var4;
                                                                    friend.fieldB = -673597679 * var6;
                                                                    friend.fieldL = var57;
                                                                    friend.fieldM = var54;
                                                                    var35 = null;
                                                                    break label3069;
                                                                }
                                                            } else if (var4.equals(friend.displayName)) {
                                                                if (var0 == -1205395532) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                friend.displayName = var35;
                                                                friend.previousName = var4;
                                                                var35 = null;
                                                                break label3069;
                                                            }

                                                            ++var63;
                                                            continue;
                                                        }
                                                    }

                                                    if (var35 != null && Client.chosenFriendIndex * 1960973713 < 400) {
                                                        FriendedPlayer friend = new FriendedPlayer();
                                                        Client.friendedPlayers[Client.chosenFriendIndex * 1960973713] = friend;
                                                        friend.displayName = var35;
                                                        friend.previousName = var4;
                                                        friend.world = -330183801 * var37;
                                                        friend.fieldB = var6 * -673597679;
                                                        friend.fieldL = var57;
                                                        friend.fieldM = var54;
                                                        Client.chosenFriendIndex += -533509263;
                                                    }
                                                    break;
                                                }
                                            }

                                            Client.fieldOm = -1167682862;
                                            Client.fieldKt = Client.fieldKe * -709004739;
                                            var34 = false;
                                            var3 = Client.chosenFriendIndex * 1960973713;

                                            while (var3 > 0) {
                                                var34 = true;
                                                --var3;

                                                for (var36 = 0; var36 < var3; ++var36) {
                                                    if (var0 == -1205395532) {
                                                        throw new IllegalStateException();
                                                    }

                                                    var46 = false;
                                                    FriendedPlayer var50 = Client.friendedPlayers[var36];
                                                    FriendedPlayer var48 = Client.friendedPlayers[var36 + 1];
                                                    if (Client.currentWorld * -1276662997 != var50.world * -1774843337) {
                                                        if (var0 == -1205395532) {
                                                            throw new IllegalStateException();
                                                        }

                                                        if (Client.currentWorld * -1276662997 == var48.world * -1774843337) {
                                                            var46 = true;
                                                        }
                                                    }

                                                    if (!var46 && 0 == var50.world * -1774843337) {
                                                        if (var0 == -1205395532) {
                                                            throw new IllegalStateException();
                                                        }

                                                        if (var48.world * -1774843337 != 0) {
                                                            if (var0 == -1205395532) {
                                                                throw new IllegalStateException();
                                                            }

                                                            var46 = true;
                                                        }
                                                    }

                                                    if (!var46) {
                                                        if (var0 == -1205395532) {
                                                            throw new IllegalStateException();
                                                        }

                                                        if (!var50.fieldL) {
                                                            if (var0 == -1205395532) {
                                                                throw new IllegalStateException();
                                                            }

                                                            if (var48.fieldL) {
                                                                if (var0 == -1205395532) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                var46 = true;
                                                            }
                                                        }
                                                    }

                                                    if (!var46) {
                                                        if (var0 == -1205395532) {
                                                            throw new IllegalStateException();
                                                        }

                                                        if (!var50.fieldM && var48.fieldM) {
                                                            var46 = true;
                                                        }
                                                    }

                                                    if (var46) {
                                                        if (var0 == -1205395532) {
                                                            throw new IllegalStateException();
                                                        }

                                                        FriendedPlayer var60 = Client.friendedPlayers[var36];
                                                        Client.friendedPlayers[var36] = Client.friendedPlayers[1 + var36];
                                                        Client.friendedPlayers[var36 + 1] = var60;
                                                        var34 = false;
                                                    }
                                                }

                                                if (var34) {
                                                    if (var0 == -1205395532) {
                                                        throw new IllegalStateException();
                                                    }
                                                    break;
                                                }
                                            }

                                            Client.packetId = 453798763;
                                            return true;
                                        }

                                        if (Client.packetId * -5466435 == 122) {
                                            if (var0 == -1205395532) {
                                                throw new IllegalStateException();
                                            }

                                            if (Client.packet.readUByte() == 1) {
                                                if (var0 == -1205395532) {
                                                    throw new IllegalStateException();
                                                }

                                                var10000 = true;
                                            } else {
                                                var10000 = false;
                                            }

                                            var34 = var10000;
                                            if (var34) {
                                                classAm.fieldOe = (classDz.getFancyTime(153186200) - Client.packet.readLong(-715169054)) * -4070898290561806801L;
                                                BoundaryDecoration.fieldOr = new ExchangeInfo(Client.packet, true);
                                            } else {
                                                BoundaryDecoration.fieldOr = null;
                                            }

                                            Client.fieldKg = Client.fieldKe * -283836475;
                                            Client.packetId = 453798763;
                                            return true;
                                        }

                                        if (Client.packetId * -5466435 == 198) {
                                            if (var0 == -1205395532) {
                                                throw new IllegalStateException();
                                            }

                                            Client.fieldOm = 1563642217;
                                            Client.fieldKt = Client.fieldKe * -709004739;
                                            Client.packetId = 453798763;
                                            return true;
                                        }

                                        if (101 == Client.packetId * -5466435) {
                                            if (var0 == -1205395532) {
                                                throw new IllegalStateException();
                                            }

                                            var32 = Client.packet.bp(1235171841);
                                            var35 = Client.packet.readString(1424375190);
                                            var42 = Widget.lookup(var32);
                                            if (!var35.equals(var42.fieldBm)) {
                                                if (var0 == -1205395532) {
                                                    throw new IllegalStateException();
                                                }

                                                var42.fieldBm = var35;
                                                classBx.method250(var42, 57574739);
                                            }

                                            Client.packetId = 453798763;
                                            return true;
                                        }

                                        if (Client.packetId * -5466435 == 94) {
                                            if (var0 == -1205395532) {
                                                throw new IllegalStateException();
                                            }

                                            EntityMarker.method330(1803308586);
                                            Client.fieldJp = Client.packet.j((byte) 1) * 779719889;
                                            Client.fieldKo = Client.fieldKe * -1239619027;
                                            Client.packetId = 453798763;
                                            return true;
                                        }

                                        if (115 == Client.packetId * -5466435) {
                                            if (var0 == -1205395532) {
                                                throw new IllegalStateException();
                                            }

                                            var32 = Client.packet.bp(-275540044);
                                            var3 = Client.packet.bp(1535928320);
                                            var36 = Client.packet.ac((byte) 17);
                                            if ('\uffff' == var36) {
                                                if (var0 == -1205395532) {
                                                    throw new IllegalStateException();
                                                }

                                                var36 = -1;
                                            }

                                            var43 = Widget.lookup(var32);
                                            ItemDefinition var45;
                                            if (!var43.fieldK) {
                                                if (var0 == -1205395532) {
                                                    throw new IllegalStateException();
                                                }

                                                if (var36 == -1) {
                                                    if (var0 == -1205395532) {
                                                        throw new IllegalStateException();
                                                    }

                                                    var43.fieldAd = 0;
                                                    Client.packetId = 453798763;
                                                    return true;
                                                }

                                                var45 = Client.getItemDefinition(var36, -323384594);
                                                var43.fieldAd = -621619948;
                                                var43.fieldAu = var36 * -858091143;
                                                var43.fieldAy = var45.fieldJ * 959197;
                                                var43.fieldBu = var45.fieldG * 2085460755;
                                                var43.fieldBi = var45.fieldU * 122240972 / var3 * -1638948091;
                                                classBx.method250(var43, 57574739);
                                            } else {
                                                var43.itemId = 64341787 * var36;
                                                var43.fieldDl = 416509361 * var3;
                                                var45 = Client.getItemDefinition(var36, -768969534);
                                                var43.fieldAy = var45.fieldJ * 959197;
                                                var43.fieldBu = var45.fieldG * 2085460755;
                                                var43.fieldBo = var45.fieldY * 1298241665;
                                                var43.fieldAc = var45.fieldP * -2076098127;
                                                var43.fieldAp = var45.fieldR * 1278847429;
                                                var43.fieldBi = var45.fieldU * -756987241;
                                                if (var45.stackable * 1977514217 == 1) {
                                                    if (var0 == -1205395532) {
                                                        throw new IllegalStateException();
                                                    }

                                                    var43.fieldBp = -1583023683;
                                                } else {
                                                    var43.fieldBp = 1128919930;
                                                }

                                                if (var43.width * 805002637 > 0) {
                                                    if (var0 == -1205395532) {
                                                        throw new IllegalStateException();
                                                    }

                                                    var43.fieldBi = var43.fieldBi * -157927008 / (var43.width * 805002637) * -1638948091;
                                                }

                                                classBx.method250(var43, 57574739);
                                            }

                                            Client.packetId = 453798763;
                                            return true;
                                        }

                                        if (221 == Client.packetId * -5466435) {
                                            if (var0 == -1205395532) {
                                                throw new IllegalStateException();
                                            }

                                            var32 = Client.packet.caret * 651432265 + Client.fieldCb * 237192877;
                                            var3 = Client.packet.readUShort();
                                            var36 = Client.packet.readUShort();
                                            if (Client.fieldJh * -98490421 != var3) {
                                                if (var0 == -1205395532) {
                                                    throw new IllegalStateException();
                                                }

                                                Client.fieldJh = var3 * 1923106275;
                                                classM.method129(Client.fieldJh * -98490421, (byte) -36);
                                                UtilClass1.method258(Client.fieldJh * -98490421, 1194645264);

                                                for (var37 = 0; var37 < 100; ++var37) {
                                                    if (var0 == -1205395532) {
                                                        throw new IllegalStateException();
                                                    }

                                                    Client.fieldLp[var37] = true;
                                                }
                                            }

                                            WidgetNode var8;
                                            for (; var36-- > 0; var8.valid = true) {
                                                var37 = Client.packet.readInt((byte) -56);
                                                var6 = Client.packet.readUShort();
                                                var44 = Client.packet.readUByte();
                                                var8 = (WidgetNode) Client.widgetNodes.get((long) var37);
                                                if (var8 != null && var8.owner * -1220935357 != var6) {
                                                    WidgetNode.method189(var8, true);
                                                    var8 = null;
                                                }

                                                if (var8 == null) {
                                                    WidgetNode var10 = new WidgetNode();
                                                    var10.owner = 1331204971 * var6;
                                                    var10.state = var44 * 1897215487;
                                                    Client.widgetNodes.put(var10, (long) var37);
                                                    classM.method129(var6, (byte) 14);
                                                    UtilClass1.method258(var6, 961204943);
                                                    Widget var11 = Widget.lookup(var37);
                                                    if (var11 != null) {
                                                        classBx.method250(var11, 57574739);
                                                    }

                                                    if (Client.fieldJy != null) {
                                                        classBx.method250(Client.fieldJy, 57574739);
                                                        Client.fieldJy = null;
                                                    }

                                                    WidgetStrings.method408((byte) -98);
                                                    if (-1 != Client.fieldJh * -98490421) {
                                                        var12 = Client.fieldJh * -98490421;
                                                        if (Widget.loadWidget(var12, 477596194)) {
                                                            InputHandler.method88(Widget.widgets[var12], 1, 1015099662);
                                                        }
                                                    }
                                                    var8 = var10;
                                                }
                                            }

                                            for (var38 = (WidgetNode) Client.widgetNodes.first(); var38 != null; var38 = (WidgetNode) Client.widgetNodes.next()) {
                                                if (var38.valid) {
                                                    var38.valid = false;
                                                } else {
                                                    WidgetNode.method189(var38, true);
                                                }
                                            }

                                            Client.widgetNodeConfigs = new NodeTable(512);

                                            while (Client.packet.caret * 651432265 < var32) {
                                                if (var0 == -1205395532) {
                                                    throw new IllegalStateException();
                                                }

                                                var37 = Client.packet.readInt((byte) 88);
                                                var6 = Client.packet.readUShort();
                                                var44 = Client.packet.readUShort();
                                                var55 = Client.packet.readInt((byte) 89);

                                                for (var9 = var6; var9 <= var44; ++var9) {
                                                    if (var0 == -1205395532) {
                                                        throw new IllegalStateException();
                                                    }

                                                    var61 = (long) var9 + ((long) var37 << 32);
                                                    Client.widgetNodeConfigs.put(new IntegerNode(var55), var61);
                                                }
                                            }

                                            Client.packetId = 453798763;
                                            return true;
                                        }

                                        if (91 == Client.packetId * -5466435) {
                                            if (var0 == -1205395532) {
                                                throw new IllegalStateException();
                                            }

                                            Client.fieldLd = Client.packet.readUByte() * -1253657955;
                                            Client.fieldLh = Client.packet.readUByte() * -176726983;
                                            Client.packetId = 453798763;
                                            return true;
                                        }

                                        if (203 == Client.packetId * -5466435) {
                                            while (651432265 * Client.packet.caret < Client.fieldCb * 237192877) {
                                                if (var0 == -1205395532) {
                                                    throw new IllegalStateException();
                                                }

                                                var32 = Client.packet.readUByte();
                                                if (1 == (var32 & 1)) {
                                                    if (var0 == -1205395532) {
                                                        throw new IllegalStateException();
                                                    }

                                                    var10000 = true;
                                                } else {
                                                    var10000 = false;
                                                }

                                                var33 = var10000;
                                                var4 = Client.packet.readString(1068503851);
                                                var5 = Client.packet.readString(1936064690);
                                                Client.packet.readString(1049533418);
                                                var6 = 0;

                                                while (true) {
                                                    if (var6 < Client.ignoreListSize * 697443259) {
                                                        label3088:
                                                        {
                                                            if (var0 == -1205395532) {
                                                                throw new IllegalStateException();
                                                            }

                                                            IgnoredPlayer var7 = Client.ignoredPlayers[var6];
                                                            if (var33) {
                                                                if (var0 == -1205395532) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                if (var5.equals(var7.previousName)) {
                                                                    var7.previousName = var4;
                                                                    var7.displayName = var5;
                                                                    var4 = null;
                                                                    break label3088;
                                                                }
                                                            } else if (var4.equals(var7.previousName)) {
                                                                if (var0 == -1205395532) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                var7.previousName = var4;
                                                                var7.displayName = var5;
                                                                var4 = null;
                                                                break label3088;
                                                            }

                                                            ++var6;
                                                            continue;
                                                        }
                                                    }

                                                    if (null != var4 && Client.ignoreListSize * 697443259 < 400) {
                                                        if (var0 == -1205395532) {
                                                            throw new IllegalStateException();
                                                        }

                                                        IgnoredPlayer var39 = new IgnoredPlayer();
                                                        Client.ignoredPlayers[Client.ignoreListSize * 697443259] = var39;
                                                        var39.previousName = var4;
                                                        var39.displayName = var5;
                                                        Client.ignoreListSize += -1571608205;
                                                    }
                                                    break;
                                                }
                                            }

                                            Client.fieldKt = Client.fieldKe * -709004739;
                                            Client.packetId = 453798763;
                                            return true;
                                        }

                                        UtilClass5.method61("" + Client.packetId * -5466435 + UtilClass41.fieldV + Client.fieldCy * -1138826417 + UtilClass41.fieldV + Client.fieldCv * -1250520613 + UtilClass41.fieldV + Client.fieldCb * 237192877, (Throwable) null, -765030861);
                                        classEp.method184((byte) -106);
                                        return true;
                                    }

                                    if (var0 == -1205395532) {
                                        throw new IllegalStateException();
                                    }
                                }
                            }
                        }
                    }

                    LandscapeMod.method117(1119711160);
                    Client.packetId = 453798763;
                    return true;
                } catch (IOException var29) {
                    if (Client.socketRelatedInt * 339818837 > 0) {
                        classEp.method184((byte) -106);
                    } else {
                        UnknownEnum.method373(40, (byte) -23);
                        Varp.fieldCf = Client.socket;
                        Client.socket = null;
                    }
                } catch (Exception var30) {
                    var2 = "" + Client.packetId * -5466435 + UtilClass41.fieldV + Client.fieldCy * -1138826417 + UtilClass41.fieldV + Client.fieldCv * -1250520613 + UtilClass41.fieldV + Client.fieldCb * 237192877 + UtilClass41.fieldV + (Client.myPlayer.queueX[0] + classDc.baseX * -2071335905) + UtilClass41.fieldV + (Client.myPlayer.queueY[0] + CalendarUtil.baseY * -1046564359) + UtilClass41.fieldV;

                    for (var3 = 0; var3 < Client.fieldCb * 237192877; ++var3) {
                        if (var0 == -1205395532) {
                            throw new IllegalStateException();
                        }

                        if (var3 >= 50) {
                            break;
                        }

                        if (var0 == -1205395532) {
                            throw new IllegalStateException();
                        }

                        var2 = var2 + Client.packet.payload[var3] + UtilClass41.fieldV;
                    }

                    UtilClass5.method61(var2, var30, -765030861);
                    classEp.method184((byte) -125);
                }

                return true;
            }
        } catch (RuntimeException var31) {
            throw ClanMate.error(var31, "ch.ab(" + ')');
        }
    }

    static final void method345(byte[] var0, int floor, int var2, int var3, int var4, int var5, int var6, int regionRot, Landscape var8, CollisionMap[] var9, byte var10) {
        try {
            Buffer var11 = new Buffer(var0);
            int objectId = -1;

            while (true) {
                int var13 = var11.readImmediateSmart(1950739066);
                if (0 == var13) {
                    if (var10 != -1) {
                        throw new IllegalStateException();
                    }

                    return;
                }

                objectId += var13;
                int var14 = 0;

                while (true) {
                    int var15 = var11.readImmediateSmart(2052839025);
                    if (var15 == 0) {
                        break;
                    }

                    var14 += var15 - 1;
                    int var16 = var14 & 63;
                    int var17 = var14 >> 6 & 63;
                    int var18 = var14 >> 12;
                    int var19 = var11.readUByte();
                    int objectType = var19 >> 2;
                    int var21 = var19 & 3;
                    if (var4 == var18) {
                        if (var10 != -1) {
                            throw new IllegalStateException();
                        }

                        if (var17 >= var5) {
                            if (var10 != -1) {
                                return;
                            }

                            if (var17 < var5 + 8) {
                                if (var10 != -1) {
                                    throw new IllegalStateException();
                                }

                                if (var16 >= var6) {
                                    if (var10 != -1) {
                                        throw new IllegalStateException();
                                    }

                                    if (var16 < var6 + 8) {
                                        if (var10 != -1) {
                                            throw new IllegalStateException();
                                        }

                                        ObjectDefinition var22 = PlayerConfig.getObjectDef(objectId, -1368681104);
                                        int regionX = var2 + BoundaryDecoration.method204(var17 & 7, var16 & 7, regionRot, var22.sizeX * -1151280759, var22.sizeY * -1255940743, var21, -1758119708);
                                        int var26 = var17 & 7;
                                        int var27 = var16 & 7;
                                        int var29 = var22.sizeX * -1151280759;
                                        int var30 = var22.sizeY * -1255940743;
                                        int regionY;
                                        if (1 == (var21 & 1)) {
                                            if (var10 != -1) {
                                                throw new IllegalStateException();
                                            }

                                            regionY = var29;
                                            var29 = var30;
                                            var30 = regionY;
                                        }

                                        int var28 = regionRot & 3;
                                        int var25;
                                        if (var28 == 0) {
                                            if (var10 != -1) {
                                                return;
                                            }

                                            var25 = var27;
                                        } else if (var28 == 1) {
                                            var25 = 7 - var26 - (var29 - 1);
                                        } else if (var28 == 2) {
                                            if (var10 != -1) {
                                                throw new IllegalStateException();
                                            }

                                            var25 = 7 - var27 - (var30 - 1);
                                        } else {
                                            var25 = var26;
                                        }

                                        regionY = var3 + var25;
                                        if (regionX > 0) {
                                            if (var10 != -1) {
                                                throw new IllegalStateException();
                                            }

                                            if (regionY > 0) {
                                                if (var10 != -1) {
                                                    throw new IllegalStateException();
                                                }

                                                if (regionX < 103) {
                                                    if (var10 != -1) {
                                                        return;
                                                    }

                                                    if (regionY < 103) {
                                                        if (var10 != -1) {
                                                            throw new IllegalStateException();
                                                        }

                                                        int var32 = floor;
                                                        if ((classM.renderRules[1][regionX][regionY] & 2) == 2) {
                                                            var32 = floor - 1;
                                                        }

                                                        CollisionMap var33 = null;
                                                        if (var32 >= 0) {
                                                            if (var10 != -1) {
                                                                throw new IllegalStateException();
                                                            }

                                                            var33 = var9[var32];
                                                        }

                                                        classEv.addCacheObject(floor, regionX, regionY, objectId, var21 + regionRot & 3, objectType, var8, var33, -1219207578);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var34) {
            throw ClanMate.error(var34, "ch.w(" + ')');
        }
    }

    public static String method346(char var0, int var1, int var2) {
        try {
            char[] var3 = new char[var1];

            for (int var4 = 0; var4 < var1; ++var4) {
                if (var2 != -1303950509) {
                    throw new IllegalStateException();
                }

                var3[var4] = var0;
            }
            //   return "big blak cok";
            return new String(var3);
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "ch.f(" + ')');
        }
    }

    public int[] a(int var1, byte var2) {
        try {
            classBj var3 = this.fieldA[var1];
            if (var3 != null) {
                if (var3.fieldD != null) {
                    if (var2 >= 8) {
                        throw new IllegalStateException();
                    }

                    this.fieldV.insert(var3);
                    var3.fieldX = true;
                    return var3.fieldD;
                }

                boolean var4 = var3.a(this.fieldL, this.fieldM * -266169895, this.fieldW);
                if (var4) {
                    if (var2 >= 8) {
                        throw new IllegalStateException();
                    }

                    if (0 == this.fieldB * -451883447) {
                        if (var2 >= 8) {
                            throw new IllegalStateException();
                        }

                        classBj var5 = (classBj) this.fieldV.popLast();
                        var5.v();
                    } else {
                        this.fieldB -= 811107321;
                    }

                    this.fieldV.insert(var3);
                    var3.fieldX = true;
                    return var3.fieldD;
                }
            }

            return null;
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "ch.a(" + ')');
        }
    }

    public int v(int var1, byte var2) {
        try {
            if (null != this.fieldA[var1]) {
                if (var2 == 8) {
                    throw new IllegalStateException();
                } else {
                    return this.fieldA[var1].fieldL;
                }
            } else {
                return 0;
            }
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "ch.v(" + ')');
        }
    }

    public boolean b(int var1, int var2) {
        try {
            return 64 == this.fieldM * -266169895;
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "ch.b(" + ')');
        }
    }

    public void x(double var1) {
        try {
            this.fieldL = var1;
            this.o((byte) -77);
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "ch.x(" + ')');
        }
    }

    public void q(int var1, byte var2) {
        try {
            for (int var3 = 0; var3 < this.fieldA.length; ++var3) {
                if (var2 != 0) {
                    throw new IllegalStateException();
                }

                classBj var4 = this.fieldA[var3];
                if (var4 != null) {
                    if (var2 != 0) {
                        throw new IllegalStateException();
                    }

                    if (0 != var4.fieldK && var4.fieldX) {
                        if (var2 != 0) {
                            throw new IllegalStateException();
                        }

                        var4.i(var1);
                        var4.fieldX = false;
                    }
                }
            }

        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "ch.q(" + ')');
        }
    }

    public void o(byte var1) {
        try {
            for (int var2 = 0; var2 < this.fieldA.length; ++var2) {
                if (var1 >= 1) {
                    return;
                }

                if (this.fieldA[var2] != null) {
                    if (var1 >= 1) {
                        return;
                    }

                    this.fieldA[var2].v();
                }
            }

            this.fieldV = new NodeDeque();
            this.fieldB = this.fieldI * -1669315919;
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "ch.o(" + ')');
        }
    }

    public boolean i(int var1, int var2) {
        try {
            return this.fieldA[var1].fieldM;
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "ch.i(" + ')');
        }
    }
}
