package com.jagex;

import java.awt.*;
import java.lang.*;

public final class LandscapeMod extends Node {

    public static classBo fieldD;
    static ClanMate[] clanMates;
    static Sprite[] prayerHeadIcons;
    static int fieldFj;
    int spawnLife = 928555045;
    int objectStubType;
    int regionX;
    int regionY;
    int curObjectType;
    int prevObjectId;
    int prevObjectType;
    int curObjectId;
    int curObjectRot;
    int prevObjectRot;
    int spawnDelay = 0;
    int floor;

    static int method115(CharSequence var0, int var1, boolean var2, byte var3) {
        try {
            if (var1 >= 2 && var1 <= 36) {
                boolean var4 = false;
                boolean var5 = false;
                int var6 = 0;
                int var7 = var0.length();
                int var8 = 0;

                while (true) {
                    if (var8 >= var7) {
                        if (!var5) {
                            throw new NumberFormatException();
                        }
                        return var6;
                    }

                    if (var3 <= 1) {
                        throw new IllegalStateException();
                    }

                    label138:
                    {
                        char var9 = var0.charAt(var8);
                        if (0 == var8) {
                            if (45 == var9) {
                                if (var3 <= 1) {
                                    throw new IllegalStateException();
                                }

                                var4 = true;
                                break label138;
                            }

                            if (43 == var9) {
                                if (var3 <= 1) {
                                    throw new IllegalStateException();
                                }

                                if (var2) {
                                    if (var3 <= 1) {
                                        throw new IllegalStateException();
                                    }
                                    break label138;
                                }
                            }
                        }

                        int var12;
                        label139:
                        {
                            if (var9 >= 48) {
                                if (var3 <= 1) {
                                    throw new IllegalStateException();
                                }

                                if (var9 <= 57) {
                                    if (var3 <= 1) {
                                        throw new IllegalStateException();
                                    }

                                    var12 = var9 - 48;
                                    break label139;
                                }
                            }

                            if (var9 >= 65 && var9 <= 90) {
                                if (var3 <= 1) {
                                    throw new IllegalStateException();
                                }

                                var12 = var9 - 55;
                            } else {
                                if (var9 < 97) {
                                    break;
                                }

                                if (var3 <= 1) {
                                    throw new IllegalStateException();
                                }

                                if (var9 > 122) {
                                    break;
                                }

                                if (var3 <= 1) {
                                    throw new IllegalStateException();
                                }

                                var12 = var9 - 87;
                            }
                        }

                        if (var12 >= var1) {
                            if (var3 <= 1) {
                                throw new IllegalStateException();
                            }

                            throw new NumberFormatException();
                        }

                        if (var4) {
                            var12 = -var12;
                        }

                        int var10 = var12 + var6 * var1;
                        if (var10 / var1 != var6) {
                            if (var3 <= 1) {
                                throw new IllegalStateException();
                            }

                            throw new NumberFormatException();
                        }

                        var6 = var10;
                        var5 = true;
                    }

                    ++var8;
                }

                throw new NumberFormatException();
            } else {
                throw new IllegalArgumentException("");
            }
        } catch (RuntimeException var11) {
            throw ClanMate.error(var11, "o.l(" + ')');
        }
    }

    static void setLoginError(int id, short var1) {
        try {
            if (id == -3) {
                ItemTable.setLoginErrorStrings(StringConstants.fieldAt, StringConstants.fieldAw, StringConstants.fieldAo, (byte) -4);
            } else if (id == -2) {
                ItemTable.setLoginErrorStrings(StringConstants.fieldAg, StringConstants.fieldAd, StringConstants.fieldAu, (byte) -45);
            } else if (id == -1) {
                ItemTable.setLoginErrorStrings(StringConstants.fieldAk, StringConstants.fieldAj, StringConstants.fieldAf, (byte) -91);
            } else if (id == 3) {
                ItemTable.setLoginErrorStrings(StringConstants.fieldAb, StringConstants.fieldAc, StringConstants.fieldAp, (byte) -4);
            } else if (4 == id) {
                ItemTable.setLoginErrorStrings(StringConstants.fieldAy, StringConstants.fieldBu, StringConstants.fieldBo, (byte) -26);
            } else if (id == 5) {
                ItemTable.setLoginErrorStrings(StringConstants.fieldBi, StringConstants.fieldBs, StringConstants.fieldBl, (byte) -41);
            } else if (id == 6) {
                ItemTable.setLoginErrorStrings(StringConstants.fieldBp, StringConstants.fieldBw, StringConstants.fieldBm, (byte) 108);
            } else if (7 == id) {
                ItemTable.setLoginErrorStrings(StringConstants.fieldBz, StringConstants.fieldBr, StringConstants.fieldBe, (byte) 48);
            } else if (8 == id) {
                ItemTable.setLoginErrorStrings(StringConstants.fieldBb, StringConstants.fieldBc, StringConstants.fieldBk, (byte) 35);
            } else if (9 == id) {
                ItemTable.setLoginErrorStrings(StringConstants.fieldBf, StringConstants.fieldBg, StringConstants.fieldBt, (byte) -17);
            } else if (10 == id) {
                ItemTable.setLoginErrorStrings(StringConstants.fieldBx, StringConstants.fieldBn, StringConstants.fieldBq, (byte) 95);
            } else if (id == 11) {
                ItemTable.setLoginErrorStrings(StringConstants.fieldBa, StringConstants.fieldBv, StringConstants.fieldBd, (byte) -18);
            } else if (12 == id) {
                ItemTable.setLoginErrorStrings(StringConstants.fieldBh, StringConstants.fieldBj, StringConstants.fieldBy, (byte) 11);
            } else if (id == 13) {
                ItemTable.setLoginErrorStrings(StringConstants.fieldCr, StringConstants.fieldCt, StringConstants.fieldCw, (byte) -62);
            } else if (id == 14) {
                ItemTable.setLoginErrorStrings(StringConstants.fieldCq, StringConstants.fieldCi, StringConstants.fieldCf, (byte) -29);
            } else if (16 == id) {
                ItemTable.setLoginErrorStrings(StringConstants.fieldCo, StringConstants.fieldCj, StringConstants.fieldCd, (byte) 59);
            } else if (id == 17) {
                ItemTable.setLoginErrorStrings(StringConstants.fieldCb, StringConstants.fieldCh, StringConstants.fieldCn, (byte) -7);
            } else if (18 == id) {
                ItemTable.setLoginErrorStrings(StringConstants.fieldCp, StringConstants.fieldCk, StringConstants.fieldCg, (byte) 13);
            } else if (19 == id) {
                ItemTable.setLoginErrorStrings(StringConstants.fieldCy, StringConstants.fieldCv, StringConstants.fieldCc, (byte) -36);
            } else if (20 == id) {
                ItemTable.setLoginErrorStrings(StringConstants.fieldCx, StringConstants.fieldCe, StringConstants.fieldCl, (byte) -109);
            } else if (id == 22) {
                ItemTable.setLoginErrorStrings(StringConstants.fieldCz, StringConstants.fieldCm, StringConstants.fieldCu, (byte) 98);
            } else if (23 == id) {
                ItemTable.setLoginErrorStrings(StringConstants.fieldCa, StringConstants.fieldCs, StringConstants.fieldDg, (byte) -74);
            } else if (id == 24) {
                ItemTable.setLoginErrorStrings(StringConstants.fieldDd, StringConstants.fieldDp, StringConstants.fieldDu, (byte) -7);
            } else if (25 == id) {
                ItemTable.setLoginErrorStrings(StringConstants.fieldDj, StringConstants.fieldDi, StringConstants.fieldDo, (byte) -52);
            } else if (26 == id) {
                ItemTable.setLoginErrorStrings(StringConstants.fieldDq, StringConstants.fieldDh, StringConstants.fieldDf, (byte) 114);
            } else if (id == 27) {
                ItemTable.setLoginErrorStrings(StringConstants.fieldDw, StringConstants.fieldDk, StringConstants.fieldDr, (byte) 21);
            } else if (id == 31) {
                ItemTable.setLoginErrorStrings(StringConstants.fieldDa, StringConstants.fieldDz, StringConstants.fieldDy, (byte) -45);
            } else if (32 == id) {
                ItemTable.setLoginErrorStrings(StringConstants.fieldDb, StringConstants.fieldDx, StringConstants.fieldDe, (byte) -45);
            } else if (37 == id) {
                ItemTable.setLoginErrorStrings(StringConstants.fieldDm, StringConstants.fieldEt, StringConstants.fieldEp, (byte) 38);
            } else if (id == 38) {
                ItemTable.setLoginErrorStrings(StringConstants.fieldEj, StringConstants.fieldEe, StringConstants.fieldEq, (byte) 14);
            } else if (55 == id) {
                ItemTable.setLoginErrorStrings(StringConstants.fieldEo, StringConstants.fieldEi, StringConstants.fieldEc, (byte) 63);
            } else {
                if (id == 56) {
                    ItemTable.setLoginErrorStrings(StringConstants.fieldEh, StringConstants.fieldEl, StringConstants.fieldEb, (byte) -32);
                    UnknownEnum.method373(11, (byte) -28);
                    return;
                }

                if (57 == id) {
                    ItemTable.setLoginErrorStrings(StringConstants.fieldEy, StringConstants.fieldEg, StringConstants.fieldEm, (byte) 29);
                    UnknownEnum.method373(11, (byte) -48);
                    return;
                }

                ItemTable.setLoginErrorStrings(StringConstants.fieldEa, StringConstants.fieldEf, StringConstants.fieldEx, (byte) 59);
            }

            UnknownEnum.method373(10, (byte) -2);
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "o.t(" + ')');
        }
    }

    static final void method117(int pred) {
        try {
            int var1;
            int var2;
            int var3;
            int var4;
            GroundItem var31;
            if (Client.packetId * -5466435 == 17) {
                var1 = Client.packet.readUByte();
                var2 = classJ.fieldDc * 968617591 + (var1 >> 4 & 7);
                var3 = (var1 & 7) + UtilClass14.fieldDn * 1626548707;
                var4 = Client.packet.ap();
                if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                    NodeDeque<GroundItem> var34 = Client.groundItemDeques[Client.floorLevel * 87713183][var2][var3];
                    if (var34 != null) {
                        for (var31 = var34.next(); var31 != null; var31 = var34.tail()) {
                            if (var31.itemId * 2057899465 == (var4 & 32767)) {
                                var31.delete();
                                break;
                            }
                        }
                        if (var34.next() == null) {
                            Client.groundItemDeques[Client.floorLevel * 87713183][var2][var3] = null;
                        }
                        WidgetNode.method97(var2, var3);
                    }
                }

            } else {
                int var5;
                int var6;
                if (Client.packetId * -5466435 == 150) {
                    var1 = Client.packet.readUByte();
                    var2 = (var1 >> 4 & 7) + classJ.fieldDc * 968617591;
                    var3 = (var1 & 7) + UtilClass14.fieldDn * 1626548707;
                    var4 = Client.packet.readUShort();
                    var5 = Client.packet.readUShort();
                    var6 = Client.packet.readUShort();
                    if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                        NodeDeque<GroundItem> var35 = Client.groundItemDeques[Client.floorLevel * 87713183][var2][var3];
                        if (var35 != null) {
                            for (GroundItem var37 = var35.next(); var37 != null; var37 = var35.tail()) {
                                if ((var4 & 0x7fff) == var37.itemId * 2057899465 && var5 == var37.quantity * 1902127977) {
                                    var37.quantity = -243329831 * var6;
                                    break;
                                }
                            }
                            WidgetNode.method97(var2, var3);
                        }
                    }
                } else {
                    int var7;
                    int var8;
                    int var9;
                    if (Client.packetId * -5466435 == 134) {
                        var1 = Client.packet.readUByte();
                        var2 = (var1 >> 4 & 0x7) + classJ.fieldDc * 968617591;
                        var3 = (var1 & 0x7) + UtilClass14.fieldDn * 1626548707;
                        var4 = Client.packet.readUShort();
                        var5 = Client.packet.readUByte();
                        var6 = var5 >> 4 & 0xf;
                        var7 = var5 & 0x7;
                        var8 = Client.packet.readUByte();
                        if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                            var9 = var6 + 1;
                            if (Client.myPlayer.queueX[0] >= var2 - var9
                                    && Client.myPlayer.queueX[0] <= var9 + var2
                                    && Client.myPlayer.queueY[0] >= var3 - var9
                                    && Client.myPlayer.queueY[0] <= var9 + var3) {
                                if (0 != Client.fieldNm * -1976627615 && var7 > 0 && Client.fieldNx * 1993078547 < 50) {
                                    Client.fieldNp[Client.fieldNx * 1993078547] = var4;
                                    Client.fieldNl[Client.fieldNx * 1993078547] = var7;
                                    Client.fieldNw[Client.fieldNx * 1993078547] = var8;
                                    Client.fieldNq[Client.fieldNx * 1993078547] = null;
                                    Client.fieldNj[Client.fieldNx * 1993078547] = var6 + (var2 << 16) + (var3 << 8);
                                    Client.fieldNx += 1441295131;
                                }
                            }
                        }
                    }

                    if (Client.packetId * -5466435 == 148) {
                        var1 = Client.packet.readUShort();
                        var2 = Client.packet.readInvertedUByte((byte) 0);
                        var3 = classJ.fieldDc * 968617591 + (var2 >> 4 & 7);
                        var4 = UtilClass14.fieldDn * 1626548707 + (var2 & 7);
                        var5 = Client.packet.readUByte();
                        var6 = var5 >> 2;
                        var7 = var5 & 3;
                        var8 = Client.objectType2StubType[var6];
                        if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                            Projectile.spawnObjectLater(Client.floorLevel * 87713183, var3, var4, var8, var1, var6, var7, 0, -1, (byte) 11);
                        }
                    } else if (32 == Client.packetId * -5466435) {
                        var1 = Client.packet.readUByte();
                        var2 = classJ.fieldDc * 968617591 + (var1 >> 4 & 7);
                        var3 = (var1 & 7) + UtilClass14.fieldDn * 1626548707;
                        var4 = Client.packet.readUShort();
                        var5 = Client.packet.readUByte();
                        var6 = Client.packet.readUShort();
                        if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                            var2 = 64 + 128 * var2;
                            var3 = 128 * var3 + 64;
                            GraphicsStub var33 = new GraphicsStub(var4, Client.floorLevel * 87713183, var2, var3, Landscape.getTileHeight(var2, var3, Client.floorLevel * 87713183) - var5, var6, Client.engineCycle * -1223223371);
                            Client.fieldHa.add(var33);
                        }
                    } else if (Client.packetId * -5466435 == 206) {
                        var1 = Client.packet.readInvertedUByte((byte) 0);
                        var2 = var1 >> 2;
                        var3 = var1 & 3;
                        var4 = Client.objectType2StubType[var2];
                        var5 = Client.packet.aw((byte) 7);
                        var6 = classJ.fieldDc * 968617591 + (var5 >> 4 & 7);
                        var7 = UtilClass14.fieldDn * 1626548707 + (var5 & 7);
                        if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
                            Projectile.spawnObjectLater(Client.floorLevel * 87713183, var6, var7, var4, -1, var2, var3, 0, -1, (byte) 6);
                        }
                    } else {
                        int var10;
                        if (Client.packetId * -5466435 == 186) {
                            var1 = Client.packet.readInvertedUByte((byte) 0);
                            var2 = classJ.fieldDc * 968617591 + (var1 >> 4 & 7);
                            var3 = (var1 & 7) + UtilClass14.fieldDn * 1626548707;
                            var4 = Client.packet.ao((byte) 86);
                            var5 = var4 >> 2;
                            var6 = var4 & 3;
                            var7 = Client.objectType2StubType[var5];
                            var8 = Client.packet.ac((byte) 17);
                            if (var2 >= 0 && var3 >= 0 && var2 < 103 && var3 < 103) {
                                if (0 == var7) {
                                    Boundary var38 = Client.landscape.getBoundaryAt(Client.floorLevel * 87713183, var2, var3);
                                    if (var38 != null) {
                                        var10 = var38.uid * -1483668077 >> 14 & 32767;
                                        if (2 == var5) {
                                            var38.fieldM = new DynamicObject(var10, 2, var6 + 4, Client.floorLevel * 87713183, var2, var3, var8, false, var38.fieldM);
                                            var38.fieldW = new DynamicObject(var10, 2, 1 + var6 & 3, Client.floorLevel * 87713183, var2, var3, var8, false, var38.fieldW);
                                        } else {
                                            var38.fieldM = new DynamicObject(var10, var5, var6, Client.floorLevel * 87713183, var2, var3, var8, false, var38.fieldM);
                                        }
                                    }
                                }
                                if (var7 == 1) {
                                    BoundaryDecoration var39 = Client.landscape.getBoundaryDecoration(Client.floorLevel * 87713183, var2, var3);
                                    if (null != var39) {
                                        label621:
                                        {
                                            var10 = var39.uid * -1933340315 >> 14 & 32767;
                                            if (4 != var5 && 5 != var5) {
                                                if (var5 == 6) {
                                                    var39.fieldE = new DynamicObject(var10, 4, var6 + 4, Client.floorLevel * 87713183, var2, var3, var8, false, var39.fieldE);
                                                } else if (7 == var5) {
                                                    var39.fieldE = new DynamicObject(var10, 4, (2 + var6 & 3) + 4, Client.floorLevel * 87713183, var2, var3, var8, false, var39.fieldE);
                                                } else if (var5 == 8) {
                                                    var39.fieldE = new DynamicObject(var10, 4, 4 + var6, Client.floorLevel * 87713183, var2, var3, var8, false, var39.fieldE);
                                                    var39.fieldN = new DynamicObject(var10, 4, (var6 + 2 & 3) + 4, Client.floorLevel * 87713183, var2, var3, var8, false, var39.fieldN);
                                                }
                                                break label621;
                                            }
                                            var39.fieldE = new DynamicObject(var10, 4, var6, Client.floorLevel * 87713183, var2, var3, var8, false, var39.fieldE);
                                        }
                                    }
                                }

                                if (2 == var7) {
                                    EntityMarker var40 = Client.landscape.getObjectAt(Client.floorLevel * 87713183, var2, var3);
                                    if (11 == var5) {
                                        var5 = 10;
                                    }
                                    if (null != var40) {
                                        var40.entity = new DynamicObject(var40.uid * -1211010875 >> 14 & 32767, var5, var6, Client.floorLevel * 87713183, var2, var3, var8, false, var40.entity);
                                    }
                                }

                                if (var7 == 3) {
                                    TileDecoration var41 = Client.landscape.c(Client.floorLevel * 87713183, var2, var3);
                                    if (null != var41) {
                                        var41.deco = new DynamicObject(var41.uid * 2119625601 >> 14 & 32767, 22, var6, Client.floorLevel * 87713183, var2, var3, var8, false, var41.deco);
                                    }
                                }
                            }

                        } else if (218 == Client.packetId * -5466435) {
                            var1 = Client.packet.readUShort();
                            var2 = Client.packet.ao((byte) 5);
                            var3 = classJ.fieldDc * 968617591 + (var2 >> 4 & 7);
                            var4 = UtilClass14.fieldDn * 1626548707 + (var2 & 7);
                            var5 = Client.packet.ab(1774505017);
                            if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                                var31 = new GroundItem();
                                var31.itemId = 1159896185 * var1;
                                var31.quantity = -243329831 * var5;
                                if (Client.groundItemDeques[Client.floorLevel * 87713183][var3][var4] == null) {
                                    Client.groundItemDeques[Client.floorLevel * 87713183][var3][var4] = new NodeDeque<>();
                                }
                                Client.groundItemDeques[Client.floorLevel * 87713183][var3][var4].add(var31);
                                WidgetNode.method97(var3, var4);
                            }

                        } else {
                            int var11;
                            int var12;
                            if (Client.packetId * -5466435 == 180) {
                                if (pred > 399667269) { //dawut, did fern fuck up here?
                                    var1 = Client.packet.readUByte();
                                    var2 = (var1 >> 4 & 7) + classJ.fieldDc * 968617591;
                                    var3 = UtilClass14.fieldDn * 1626548707 + (var1 & 7);
                                    var4 = var2 + Client.packet.readByte();
                                    var5 = var3 + Client.packet.readByte();
                                    var6 = Client.packet.j((byte) 1);
                                    var7 = Client.packet.readUShort();
                                    var8 = Client.packet.readUByte() * 4;
                                    var9 = Client.packet.readUByte() * 4;
                                    var10 = Client.packet.readUShort();
                                    var11 = Client.packet.readUShort();
                                    var12 = Client.packet.readUByte();
                                    int var42 = Client.packet.readUByte();
                                    if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104 && var4 >= 0 && var5 >= 0) {
                                        if (var4 < 104 && var5 < 104 && '\uffff' != var7) {
                                            var2 = 128 * var2 + 64;
                                            var3 = 64 + 128 * var3;
                                            var4 = 128 * var4 + 64;
                                            var5 = var5 * 128 + 64;
                                            Projectile projectile = new Projectile(var7, Client.floorLevel * 87713183, var2, var3, Landscape.getTileHeight(var2, var3, Client.floorLevel * 87713183) - var8, var10 + Client.engineCycle * -1223223371, var11 + Client.engineCycle * -1223223371, var12, var42, var6, var9);
                                            projectile.a(var4, var5, Landscape.getTileHeight(var4, var5, Client.floorLevel * 87713183) - var9, Client.engineCycle * -1223223371 + var10, 1303475738);
                                            Client.projectileDeque.add(projectile);
                                        }
                                    }
                                }
                            } else if (Client.packetId * -5466435 == 67) {
                                var1 = Client.packet.ap();
                                var2 = Client.packet.ab(2124647261);
                                var3 = Client.packet.ab(868165550);
                                var4 = Client.packet.ao((byte) 47);
                                var5 = var4 >> 2;
                                var6 = var4 & 3;
                                var7 = Client.objectType2StubType[var5];
                                byte var32 = Client.packet.readByte();
                                byte var36 = Client.packet.readByte();
                                var10 = Client.packet.readInvertedUByte((byte) 0);
                                var11 = (var10 >> 4 & 0x7) + classJ.fieldDc * 968617591;
                                var12 = UtilClass14.fieldDn * 1626548707 + (var10 & 7);
                                byte var13 = Client.packet.ad();
                                byte var14 = Client.packet.readInvertedByte((byte) 58);
                                int var15 = Client.packet.ac((byte) 74);
                                Player var16;
                                var16 = Client.playerServerIndex * -1508358289 == var3 ? Client.myPlayer : Client.players[var3];
                                if (var16 != null) {
                                    ObjectDefinition var17;
                                    int var18;
                                    int var19;
                                    label644:
                                    {
                                        var17 = PlayerConfig.getObjectDef(var1, 885530217);
                                        if (var6 != 1 && var6 != 3) {
                                            var18 = var17.sizeX * -1151280759;
                                            var19 = var17.sizeY * -1255940743;
                                            break label644;
                                        }
                                        var18 = var17.sizeY * -1255940743;
                                        var19 = var17.sizeX * -1151280759;
                                    }

                                    int var20 = var11 + (var18 >> 1);
                                    int var21 = (1 + var18 >> 1) + var11;
                                    int var22 = var12 + (var19 >> 1);
                                    int var23 = var12 + (1 + var19 >> 1);
                                    int[][] plane = classM.tileHeights[Client.floorLevel * 87713183];
                                    int height = plane[var21][var23] + plane[var20][var22] + plane[var21][var22] + plane[var20][var23] >> 2;
                                    int var26 = (var18 << 6) + (var11 << 7);
                                    int var27 = (var19 << 6) + (var12 << 7);
                                    Model var28 = var17.n(var5, var6, plane, var26, height, var27, (byte) 16);
                                    if (null != var28) {
                                        Projectile.spawnObjectLater(Client.floorLevel * 87713183, var11, var12, var7, -1, 0, 0, var2 + 1, var15 + 1, (byte) 87);
                                        var16.objTransformStartCycle = (var2 + Client.engineCycle * -1223223371) * -136876771;
                                        var16.objTransformEndCycle = (var15 + Client.engineCycle * -1223223371) * 1691781299;
                                        var16.transformObjModel = var28;
                                        var16.objectLocX = 461127616 * var18 + var11 * 922255232;
                                        var16.objectLocY = var19 * 252354240 + var12 * 504708480;
                                        var16.objectLocZ = -1823363617 * height;
                                        byte var29;

                                        if (var14 > var13) {
                                            var29 = var14;
                                            var14 = var13;
                                            var13 = var29;
                                        }

                                        if (var36 > var32) {
                                            var29 = var36;
                                            var36 = var32;
                                            var32 = var29;
                                        }

                                        var16.objRegionX = (var11 + var14) * -1626034921;
                                        var16.objMaxRegionX = -1205480525 * (var11 + var13);
                                        var16.objRegionY = (var36 + var12) * -303997603;
                                        var16.objMaxRegionY = 394406681 * (var12 + var32);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var30) {
            throw ClanMate.error(var30, "o.ac(" + ')');
        }
    }

    public static classGm method118(ReferenceTable var0, ReferenceTable var1, String var2, String var3, int var4) {
        try {
            int var5 = var0.h(var2, 921294597);
            int var6 = var0.u(var5, var3, 633939902);
            return Animation.method368(var0, var1, var5, var6, -1659684103);
        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "o.n(" + ')');
        }
    }

    public static final classAp method119(TaskHandler var0, Component var1, int var2, int var3, byte var4) {
        try {
            if (classAp.audioSampleRate * 2098856905 == 0) {
                    throw new IllegalStateException();
            } else {
                if (var2 >= 0) {
                    if (var2 < 2) {
                        if (var3 < 256) {
                            var3 = 256;
                        }

                        try {
                            classBb var9 = new classBb();
                            byte var10001;
                            if (classAp.twoChannels) {
                                var10001 = 2;
                            } else {
                                var10001 = 1;
                            }

                            var9.fieldN = new int[var10001 * 256];
                            var9.fieldX = var3 * 833212989;
                            var9.a(var1);
                            var9.fieldD = ((var3 & -1024) + 1024) * -312184257;
                            if (var9.fieldD * 205159871 > 16384) {
                                var9.fieldD = 479182848;
                            }

                            var9.v(var9.fieldD * 205159871);
                            if (classAp.fieldL * 175727203 > 0) {
                                if (classAp.fieldM == null) {
                                    classAp.fieldM = new classBf();
                                    classAp.fieldM.fieldA = var0;
                                    var0.scheduleThreadTask(classAp.fieldM, classAp.fieldL * 175727203, 1409603907);
                                }
                            }

                            if (null != classAp.fieldM) {
                                if (null != classAp.fieldM.fieldV[var2]) {
                                    throw new IllegalArgumentException();
                                }

                                classAp.fieldM.fieldV[var2] = var9;
                            }

                            return var9;
                        } catch (Throwable var7) {
                            try {
                                classAb var5 = new classAb(var0, var2);
                                var5.fieldN = new int[256 * (classAp.twoChannels ? 2 : 1)];
                                var5.fieldX = 833212989 * var3;
                                var5.a(var1);
                                var5.fieldD = 479182848;
                                var5.v(var5.fieldD * 205159871);
                                if (classAp.fieldL * 175727203 > 0 && classAp.fieldM == null) {
                                    classAp.fieldM = new classBf();
                                    classAp.fieldM.fieldA = var0;
                                    var0.scheduleThreadTask(classAp.fieldM, classAp.fieldL * 175727203, 624612212);
                                }

                                if (classAp.fieldM != null) {
                                    if (classAp.fieldM.fieldV[var2] != null) {
                                        throw new IllegalArgumentException();
                                    }

                                    classAp.fieldM.fieldV[var2] = var5;
                                }

                                return var5;
                            } catch (Throwable var6) {
                                return new classAp();
                            }
                        }
                    }

                    if (var4 != 10) {
                        throw new IllegalStateException();
                    }
                }

                throw new IllegalArgumentException();
            }
        } catch (RuntimeException var8) {
            throw ClanMate.error(var8, "o.y(" + ')');
        }
    }

    static final void method120(Widget widget, int var1, int var2, byte var3) {
        try {
            if (1 == widget.fieldQ * 1240781149) {
                ItemPile.insertMenuAction(widget.toolTip, "", 24, 0, 0, widget.id * -1866039137);
            }

            String var4;
            if (widget.fieldQ * 1240781149 == 2 && !Client.isSpellSelected) {
                var4 = classCs.getWidgetTitle(widget, 469151008);
                if (null != var4) {
                    ItemPile.insertMenuAction(var4, Buffer.getColorTags('\uff00', 1640266589) + widget.fieldDw, 25, 0, -1, widget.id * -1866039137);
                }
            }

            if (3 == widget.fieldQ * 1240781149) {
                ItemPile.insertMenuAction(StringConstants.CLOSE, "", 26, 0, 0, widget.id * -1866039137);
            }

            if (4 == widget.fieldQ * 1240781149) {
                ItemPile.insertMenuAction(widget.toolTip, "", 28, 0, 0, widget.id * -1866039137);
            }

            if (5 == widget.fieldQ * 1240781149) {
                ItemPile.insertMenuAction(widget.toolTip, "", 29, 0, 0, widget.id * -1866039137);
            }

            if (widget.fieldQ * 1240781149 == 6) {
                if (Client.fieldJy == null) {
                    ItemPile.insertMenuAction(widget.toolTip, "", 30, 0, -1, widget.id * -1866039137);
                }
            }

            int var5;
            int var6;
            int var8;
            boolean var10000;
            int var20;
            if (widget.type * -729517859 == 2) {
                var20 = 0;
                for (var5 = 0; var5 < widget.height * -1004717071; ++var5) {
                    for (var6 = 0; var6 < widget.width * 805002637; ++var6) {
                        int var7 = (32 + widget.xPadding * -2111277319) * var6;
                        var8 = var5 * (32 + widget.yPadding * -842585833);
                        if (var20 < 20) {
                            var7 += widget.xSprites[var20];
                            var8 += widget.ySprites[var20];
                        }

                        if (var1 >= var7) {
                            if (var3 != 3) {
                                return;
                            }

                            if (var2 >= var8) {
                                if (var3 != 3) {
                                    throw new IllegalStateException();
                                }

                                if (var1 < var7 + 32) {
                                    if (var3 != 3) {
                                        throw new IllegalStateException();
                                    }

                                    if (var2 < 32 + var8) {
                                        if (var3 != 3) {
                                            throw new IllegalStateException();
                                        }

                                        Client.fieldGg = -400161139 * var20;
                                        classBy.fieldGu = widget;
                                        if (widget.itemIds[var20] > 0) {
                                            label559:
                                            {
                                                if (var3 != 3) {
                                                    return;
                                                }

                                                ItemDefinition var9 = Client.getItemDefinition(widget.itemIds[var20] - 1, -756689105);
                                                if (1 == Client.itemSelectionStatus * 279939385) {
                                                    if (var3 != 3) {
                                                        throw new IllegalStateException();
                                                    }

                                                    if (UtilClass6.method64(UtilClass38.getWidgetConfig(widget, 2070855251), 1078584907)) {
                                                        if (var3 != 3) {
                                                            throw new IllegalStateException();
                                                        }

                                                        if (widget.id * -1866039137 == UtilClass6.selectedItemWidgetId * 1795747025) {
                                                            if (var3 != 3) {
                                                                return;
                                                            }

                                                            if (var20 == UtilClass41.selectedItemIndex * 1003817045) {
                                                                break label559;
                                                            }
                                                        }

                                                        ItemPile.insertMenuAction(StringConstants.fieldEk, Client.fieldIt + " " + UtilClass41.fieldM + " " + Buffer.getColorTags(16748608, -1499648027) + var9.fieldX, 31, var9.id * -1571020975, var20, widget.id * -1866039137);
                                                        break label559;
                                                    }
                                                }

                                                if (Client.isSpellSelected) {
                                                    if (var3 != 3) {
                                                        return;
                                                    }

                                                    int var11 = UtilClass38.getWidgetConfig(widget, 2070855251);
                                                    if ((var11 >> 30 & 1) != 0) {
                                                        if (var3 != 3) {
                                                            throw new IllegalStateException();
                                                        }

                                                        var10000 = true;
                                                    } else {
                                                        var10000 = false;
                                                    }

                                                    boolean var10 = var10000;
                                                    if (var10) {
                                                        if (16 == (UtilClass40.selectedSpellTargetFlags * 1512402281 & 16)) {
                                                            if (var3 != 3) {
                                                                throw new IllegalStateException();
                                                            }

                                                            ItemPile.insertMenuAction(Client.spellAction, Client.fieldJc + " " + UtilClass41.fieldM + " " + Buffer.getColorTags(16748608, -983068456) + var9.fieldX, 32, var9.id * -1571020975, var20, widget.id * -1866039137);
                                                        }
                                                        break label559;
                                                    }
                                                }

                                                String[] var25 = var9.actions;
                                                if (Client.fieldJo) {
                                                    if (var3 != 3) {
                                                        throw new IllegalStateException();
                                                    }

                                                    var25 = UtilClass24.method3(var25, -1426559463);
                                                }

                                                int var12 = UtilClass38.getWidgetConfig(widget, 2070855251);
                                                if (0 != (var12 >> 30 & 1)) {
                                                    if (var3 != 3) {
                                                        throw new IllegalStateException();
                                                    }

                                                    var10000 = true;
                                                } else {
                                                    var10000 = false;
                                                }

                                                boolean var26 = var10000;
                                                if (var26) {
                                                    if (var3 != 3) {
                                                        throw new IllegalStateException();
                                                    }

                                                    for (int var13 = 4; var13 >= 3; --var13) {
                                                        if (null != var25) {
                                                            if (var3 != 3) {
                                                                throw new IllegalStateException();
                                                            }

                                                            if (var25[var13] != null) {
                                                                if (var3 != 3) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                byte var14;
                                                                if (3 == var13) {
                                                                    var14 = 36;
                                                                } else {
                                                                    var14 = 37;
                                                                }

                                                                ItemPile.insertMenuAction(var25[var13], Buffer.getColorTags(16748608, 1341875985) + var9.fieldX, var14, var9.id * -1571020975, var20, widget.id * -1866039137);
                                                                continue;
                                                            }
                                                        }

                                                        if (4 == var13) {
                                                            ItemPile.insertMenuAction(StringConstants.DROP, Buffer.getColorTags(16748608, 505967043) + var9.fieldX, 37, var9.id * -1571020975, var20, widget.id * -1866039137);
                                                        }
                                                    }
                                                }

                                                int var28 = UtilClass38.getWidgetConfig(widget, 2070855251);
                                                if (0 != (var28 >> 31 & 1)) {
                                                    if (var3 != 3) {
                                                        return;
                                                    }

                                                    var10000 = true;
                                                } else {
                                                    var10000 = false;
                                                }

                                                boolean var27 = var10000;
                                                if (var27) {
                                                    if (var3 != 3) {
                                                        return;
                                                    }

                                                    ItemPile.insertMenuAction(StringConstants.fieldEk, Buffer.getColorTags(16748608, -211300135) + var9.fieldX, 38, var9.id * -1571020975, var20, widget.id * -1866039137);
                                                }

                                                int var16 = UtilClass38.getWidgetConfig(widget, 2070855251);
                                                if ((var16 >> 30 & 1) != 0) {
                                                    if (var3 != 3) {
                                                        throw new IllegalStateException();
                                                    }

                                                    var10000 = true;
                                                } else {
                                                    var10000 = false;
                                                }

                                                boolean var15 = var10000;
                                                int var17;
                                                byte var18;
                                                if (var15) {
                                                    if (var3 != 3) {
                                                        return;
                                                    }

                                                    if (null != var25) {
                                                        for (var17 = 2; var17 >= 0; --var17) {
                                                            if (var3 != 3) {
                                                                throw new IllegalStateException();
                                                            }

                                                            if (var25[var17] != null) {
                                                                if (var3 != 3) {
                                                                    return;
                                                                }

                                                                var18 = 0;
                                                                if (var17 == 0) {
                                                                    var18 = 33;
                                                                }

                                                                if (1 == var17) {
                                                                    if (var3 != 3) {
                                                                        return;
                                                                    }

                                                                    var18 = 34;
                                                                }

                                                                if (2 == var17) {
                                                                    var18 = 35;
                                                                }

                                                                ItemPile.insertMenuAction(var25[var17], Buffer.getColorTags(16748608, -1984397223) + var9.fieldX, var18, var9.id * -1571020975, var20, widget.id * -1866039137);
                                                            }
                                                        }
                                                    }
                                                }

                                                var25 = widget.fieldBn;
                                                if (Client.fieldJo) {
                                                    if (var3 != 3) {
                                                        throw new IllegalStateException();
                                                    }

                                                    var25 = UtilClass24.method3(var25, -1659841739);
                                                }

                                                if (var25 != null) {
                                                    for (var17 = 4; var17 >= 0; --var17) {
                                                        if (var3 != 3) {
                                                            throw new IllegalStateException();
                                                        }

                                                        if (var25[var17] != null) {
                                                            var18 = 0;
                                                            if (0 == var17) {
                                                                if (var3 != 3) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                var18 = 39;
                                                            }

                                                            if (1 == var17) {
                                                                if (var3 != 3) {
                                                                    return;
                                                                }

                                                                var18 = 40;
                                                            }

                                                            if (2 == var17) {
                                                                if (var3 != 3) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                var18 = 41;
                                                            }

                                                            if (var17 == 3) {
                                                                if (var3 != 3) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                var18 = 42;
                                                            }

                                                            if (var17 == 4) {
                                                                if (var3 != 3) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                var18 = 43;
                                                            }

                                                            ItemPile.insertMenuAction(var25[var17], Buffer.getColorTags(16748608, -78645642) + var9.fieldX, var18, var9.id * -1571020975, var20, widget.id * -1866039137);
                                                        }
                                                    }
                                                }

                                                ItemPile.insertMenuAction(StringConstants.EXAMINE, Buffer.getColorTags(16748608, -1473814822) + var9.fieldX, 1005, var9.id * -1571020975, var20, widget.id * -1866039137);
                                            }
                                        }
                                    }
                                }
                            }
                        }

                        ++var20;
                    }
                }
            }

            if (widget.fieldK) {
                if (var3 != 3) {
                    throw new IllegalStateException();
                }

                if (Client.isSpellSelected) {
                    if (var3 != 3) {
                        return;
                    }

                    if (ItemTable.method198(UtilClass38.getWidgetConfig(widget, 2070855251), 2095271657)) {
                        if (var3 != 3) {
                            throw new IllegalStateException();
                        }

                        if (32 == (UtilClass40.selectedSpellTargetFlags * 1512402281 & 32)) {
                            if (var3 != 3) {
                                throw new IllegalStateException();
                            }

                            ItemPile.insertMenuAction(Client.spellAction, Client.fieldJc + " " + UtilClass41.fieldM + " " + widget.fieldBa, 58, 0, widget.index * 1176560255, widget.id * -1866039137);
                        }
                    }
                } else {
                    for (var20 = 9; var20 >= 5; --var20) {
                        String var21 = UtilClass10.method77(widget, var20, (byte) 1);
                        if (var21 != null) {
                            if (var3 != 3) {
                                return;
                            }

                            ItemPile.insertMenuAction(var21, widget.fieldBa, 1007, var20 + 1, widget.index * 1176560255, widget.id * -1866039137);
                        }
                    }

                    var4 = classCs.getWidgetTitle(widget, 469151008);
                    if (null != var4) {
                        if (var3 != 3) {
                            throw new IllegalStateException();
                        }

                        ItemPile.insertMenuAction(var4, widget.fieldBa, 25, 0, widget.index * 1176560255, widget.id * -1866039137);
                    }

                    for (var5 = 4; var5 >= 0; --var5) {
                        if (var3 != 3) {
                            throw new IllegalStateException();
                        }

                        var8 = UtilClass38.getWidgetConfig(widget, 2070855251);
                        if (0 != (var8 >> 1 + var5 & 1)) {
                            if (var3 != 3) {
                                throw new IllegalStateException();
                            }

                            var10000 = true;
                        } else {
                            var10000 = false;
                        }

                        String var23;
                        label572:
                        {
                            boolean var24 = var10000;
                            if (!var24) {
                                if (var3 != 3) {
                                    throw new IllegalStateException();
                                }

                                if (widget.fieldCz == null) {
                                    if (var3 != 3) {
                                        throw new IllegalStateException();
                                    }

                                    var23 = null;
                                    break label572;
                                }
                            }

                            if (widget.fieldBv != null) {
                                if (var3 != 3) {
                                    throw new IllegalStateException();
                                }

                                if (widget.fieldBv.length > var5) {
                                    if (var3 != 3) {
                                        return;
                                    }

                                    if (widget.fieldBv[var5] != null) {
                                        if (var3 != 3) {
                                            throw new IllegalStateException();
                                        }

                                        if (widget.fieldBv[var5].trim().length() != 0) {
                                            var23 = widget.fieldBv[var5];
                                            break label572;
                                        }

                                        if (var3 != 3) {
                                            throw new IllegalStateException();
                                        }
                                    }
                                }
                            }

                            var23 = null;
                        }

                        if (null != var23) {
                            if (var3 != 3) {
                                throw new IllegalStateException();
                            }

                            ItemPile.insertMenuAction(var23, widget.fieldBa, 57, var5 + 1, widget.index * 1176560255, widget.id * -1866039137);
                        }
                    }

                    var6 = UtilClass38.getWidgetConfig(widget, 2070855251);
                    if ((var6 & 1) != 0) {
                        if (var3 != 3) {
                            throw new IllegalStateException();
                        }

                        var10000 = true;
                    } else {
                        var10000 = false;
                    }

                    boolean var22 = var10000;
                    if (var22) {
                        if (var3 != 3) {
                            throw new IllegalStateException();
                        }

                        ItemPile.insertMenuAction(StringConstants.fieldW, "", 30, 0, widget.index * 1176560255, widget.id * -1866039137);
                    }
                }
            }

        } catch (RuntimeException var19) {
            throw ClanMate.error(var19, "o.ck(" + ')');
        }
    }

    public static void method121(ReferenceTable var0, ReferenceTable var1, ReferenceTable var2, ReferenceTable var3, int var4) {
        try {
            Widget.widgetRefTable = var0;
            classEr.fieldB = var1;
            classDc.fieldL = var2;
            UtilClass32.fieldM = var3;
            Widget.widgets = new Widget[Widget.widgetRefTable.getFileCount(2032617000)][];
            Widget.fieldV = new boolean[Widget.widgetRefTable.getFileCount(2060301196)];
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "o.a(" + ')');
        }
    }

    static final void method122(Character var0, int var1, int var2) {
        try {
            classEs.method190(var0.strictX * 404428603, var0.strictY * -1490664571, var1, 818412146);
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "o.ao(" + ')');
        }
    }

    static final void processActionAt(int index, int var1) {
        try {
            if (index >= 0) {
                int arg1 = Client.menuArg1[index];
                int arg2 = Client.menuArg2[index];
                int opcode = Client.menuOpcodes[index];
                int arg0 = Client.menuArg0[index];
                String action = Client.menuOptions[index];
                String target = Client.menuNouns[index];
                WidgetNode.processAction(arg1,
                        arg2,
                        opcode,
                        arg0,
                        action,
                        target,
                        Mouse.fieldX * -1590834513,
                        Mouse.fieldO * 1708223245
                );
            }
        } catch (RuntimeException var8) {
            throw ClanMate.error(var8, "o.bx(" + ')');
        }
    }
}
