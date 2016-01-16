package com.jagex;

import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;

public class classEr extends DualNode {

    static int fieldH;
    static ReferenceTable fieldB;
    static int cameraY;

    public int fieldV;
    public ReferenceTableSub fieldA;
    public byte fieldI;


    static final void method191(byte var0) {
        try {
            int var1 = Client.packet.gx(8, -752508981);
            int var2;
            if (var1 < Client.playerCount * 16022533) {
                if (var0 == 100) {
                    throw new IllegalStateException();
                }

                for (var2 = var1; var2 < Client.playerCount * 16022533; ++var2) {
                    if (var0 == 100) {
                        throw new IllegalStateException();
                    }

                    Client.fieldHx[(Client.fieldHr += -1637101621) * -2105647645 - 1] = Client.playerIndicies[var2];
                }
            }

            if (var1 > Client.playerCount * 16022533) {
                if (var0 == 100) {
                    throw new IllegalStateException();
                } else {
                    throw new RuntimeException("");
                }
            } else {
                Client.playerCount = 0;

                for (var2 = 0; var2 < var1; ++var2) {
                    if (var0 == 100) {
                        return;
                    }

                    int var3 = Client.playerIndicies[var2];
                    Player var4 = Client.players[var3];
                    int var5 = Client.packet.gx(1, 780751394);
                    if (0 == var5) {
                        Client.playerIndicies[(Client.playerCount += 509931725) * 16022533 - 1] = var3;
                        var4.fieldBx = Client.engineCycle * 612066721;
                    } else {
                        int var6 = Client.packet.gx(2, 624772840);
                        if (0 == var6) {
                            if (var0 == 100) {
                                throw new IllegalStateException();
                            }

                            Client.playerIndicies[(Client.playerCount += 509931725) * 16022533 - 1] = var3;
                            var4.fieldBx = Client.engineCycle * 612066721;
                            Client.fieldHm[(Client.fieldHt += -530461679) * -839605007 - 1] = var3;
                        } else {
                            int var7;
                            int var8;
                            if (1 == var6) {
                                if (var0 == 100) {
                                    throw new IllegalStateException();
                                }

                                Client.playerIndicies[(Client.playerCount += 509931725) * 16022533 - 1] = var3;
                                var4.fieldBx = Client.engineCycle * 612066721;
                                var7 = Client.packet.gx(3, -429610842);
                                var4.k(var7, false, (short) 3321);
                                var8 = Client.packet.gx(1, -1628110168);
                                if (var8 == 1) {
                                    if (var0 == 100) {
                                        throw new IllegalStateException();
                                    }

                                    Client.fieldHm[(Client.fieldHt += -530461679) * -839605007 - 1] = var3;
                                }
                            } else if (2 == var6) {
                                if (var0 == 100) {
                                    throw new IllegalStateException();
                                }

                                Client.playerIndicies[(Client.playerCount += 509931725) * 16022533 - 1] = var3;
                                var4.fieldBx = Client.engineCycle * 612066721;
                                var7 = Client.packet.gx(3, 1062940380);
                                var4.k(var7, true, (short) 3321);
                                var8 = Client.packet.gx(3, -1562667247);
                                var4.k(var8, true, (short) 3321);
                                int var9 = Client.packet.gx(1, -1282829753);
                                if (1 == var9) {
                                    if (var0 == 100) {
                                        throw new IllegalStateException();
                                    }

                                    Client.fieldHm[(Client.fieldHt += -530461679) * -839605007 - 1] = var3;
                                }
                            } else if (3 == var6) {
                                if (var0 == 100) {
                                    throw new IllegalStateException();
                                }

                                Client.fieldHx[(Client.fieldHr += -1637101621) * -2105647645 - 1] = var3;
                            }
                        }
                    }
                }

            }
        } catch (RuntimeException var10) {
            throw ClanMate.error(var10, "er.bl(" + ')');
        }
    }

    static final void method192(int var0) {
        try {
            try {
                if (Client.fieldBg * -59346499 == 0) {
                    if (var0 != 1976884746) {
                        throw new IllegalStateException();
                    }

                    if (null != Client.socket) {
                        Client.socket.stop(-1729924920);
                        Client.socket = null;
                    }

                    ClassStructure.fieldCq = null;
                    Client.fieldCc = false;
                    Client.fieldBt = 0;
                    Client.fieldBg = -955297387;
                }

                if (1 == Client.fieldBg * -59346499) {
                    if (ClassStructure.fieldCq == null) {
                        ClassStructure.fieldCq = classBq.globalTaskSchedular.scheduleSocketTask(UtilClass19.fieldBq, DynamicObject.fieldBd * -1775258173, (byte) 16);
                    }

                    if (ClassStructure.fieldCq.resultStatus == 2) {
                        if (var0 != 1976884746) {
                            throw new IllegalStateException();
                        }

                        throw new IOException();
                    }

                    if (ClassStructure.fieldCq.resultStatus == 1) {
                        Client.socket = new JagSocket((Socket) ClassStructure.fieldCq.result, classBq.globalTaskSchedular);
                        ClassStructure.fieldCq = null;
                        Client.fieldBg = -1910594774;
                    }
                }

                if (Client.fieldBg * -59346499 == 2) {
                    Client.fieldCo.caret = 0;
                    Client.fieldCo.writeByte(14);
                    Client.socket.writeLater(Client.fieldCo.payload, 0, 1, (byte) 13);
                    Client.packet.caret = 0;
                    Client.fieldBg = 1429075135;
                }

                int var1;
                if (Client.fieldBg * -59346499 == 3) {
                    if (var0 != 1976884746) {
                        return;
                    }

                    if (classDm.fieldNf != null) {
                        if (var0 != 1976884746) {
                            throw new IllegalStateException();
                        }

                        classDm.fieldNf.z(1640553310);
                    }

                    if (Npc.fieldNk != null) {
                        if (var0 != 1976884746) {
                            throw new IllegalStateException();
                        }

                        Npc.fieldNk.z(1462916404);
                    }

                    var1 = Client.socket.read(1626160645);
                    if (null != classDm.fieldNf) {
                        classDm.fieldNf.z(577878078);
                    }

                    if (Npc.fieldNk != null) {
                        if (var0 != 1976884746) {
                            return;
                        }

                        Npc.fieldNk.z(786094357);
                    }

                    if (var1 != 0) {
                        if (var0 != 1976884746) {
                            throw new IllegalStateException();
                        }

                        LandscapeMod.setLoginError(var1, (short) 25447);
                        return;
                    }

                    Client.packet.caret = 0;
                    Client.fieldBg = -481519639;
                }

                int var2;
                int var3;
                if (5 == Client.fieldBg * -59346499) {
                    if (var0 != 1976884746) {
                        return;
                    }

                    int[] var13 = new int[]{(int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D)};
                    Client.fieldCo.caret = 0;
                    Client.fieldCo.writeByte(1);
                    Client.fieldCo.writeByte(ClientData.fieldAa.getId(757368065));
                    Client.fieldCo.writeInt(var13[0]);
                    Client.fieldCo.writeInt(var13[1]);
                    Client.fieldCo.writeInt(var13[2]);
                    Client.fieldCo.writeInt(var13[3]);
                    switch (ClientData.fieldAa.fieldL * 187588655) {
                        case 0:
                        case 1:
                            Client.fieldCo.i(LandscapeTile.fieldAt * 761130559);
                            Client.fieldCo.caret += -497519395;
                            break;
                        case 2:
                            Client.fieldCo.caret += -796031032;
                            break;
                        case 3:
                            Client.fieldCo.writeInt(((Integer) Projectile.preferences.map.get(Integer.valueOf(UtilClass39.method173(ClientData.username, (byte) 64)))).intValue());
                            Client.fieldCo.caret += -398015516;
                    }

                    Client.fieldCo.w(ClientData.password, (byte) 0);
                    Client.fieldCo.applyRSA(UtilClass38.rsaExponent, UtilClass38.rsaModulus, 1855175296);
                    Client.fieldCj.caret = 0;
                    if (40 == Client.connectionState * -214882771) {
                        Client.fieldCj.writeByte(18);
                    } else {
                        Client.fieldCj.writeByte(16);
                    }

                    Client.fieldCj.writeShort(0);
                    var2 = Client.fieldCj.caret * 651432265;
                    Client.fieldCj.writeInt(74);
                    Client.fieldCj.k(Client.fieldCo.payload, 0, Client.fieldCo.caret * 651432265, 560090964);
                    var3 = 651432265 * Client.fieldCj.caret;
                    Client.fieldCj.w(ClientData.username, (byte) 0);
                    Client.fieldCj.writeByte(Client.lowMemory ? 1 : 0);
                    Packet var4 = Client.fieldCj;
                    byte[] var5 = new byte[24];

                    int var6;
                    try {
                        UtilClass19.fieldK.v(0L);
                        UtilClass19.fieldK.b(var5, 879251677);

                        for (var6 = 0; var6 < 24; ++var6) {
                            if (var0 != 1976884746) {
                                throw new IllegalStateException();
                            }

                            if (0 != var5[var6]) {
                                break;
                            }
                        }

                        if (var6 >= 24) {
                            if (var0 != 1976884746) {
                                throw new IllegalStateException();
                            }

                            throw new IOException();
                        }
                    } catch (Exception var10) {
                        for (int var7 = 0; var7 < 24; ++var7) {
                            if (var0 != 1976884746) {
                                return;
                            }

                            var5[var7] = -1;
                        }
                    }

                    var4.k(var5, 0, 24, 258818027);
                    Client.fieldCj.w(classCf.fieldQ, (byte) 0);
                    Client.fieldCj.writeInt(UtilClass7.fieldT * -806740623);
                    Buffer var17 = new Buffer(WidgetNode.systemNode.getBufferSize());
                    WidgetNode.systemNode.writeTo(var17);
                    Client.fieldCj.k(var17.payload, 0, var17.payload.length, -1252829235);
                    Client.fieldCj.writeByte(fieldH * 1273658485);
                    Client.fieldCj.writeInt(Client.fieldAc.fieldX * -1535585527);
                    Client.fieldCj.writeInt(classBo.fieldAp.fieldX * -1535585527);
                    Client.fieldCj.writeInt(classBt.config.fieldX * -1535585527);
                    Client.fieldCj.writeInt(Client.fieldBu.fieldX * -1535585527);
                    Client.fieldCj.writeInt(-1535585527 * UtilClass39.fieldBo.fieldX);
                    Client.fieldCj.writeInt(UnknownEnum3.fieldBi.fieldX * -1535585527);
                    Client.fieldCj.writeInt(-1535585527 * classT.fieldBs.fieldX);
                    Client.fieldCj.writeInt(Preferences.fieldBl.fieldX * -1535585527);
                    Client.fieldCj.writeInt(UtilClass5.fieldBp.fieldX * -1535585527);
                    Client.fieldCj.writeInt(ClientData.textures.fieldX * -1535585527);
                    Client.fieldCj.writeInt(JagSocket.wordpack.fieldX * -1535585527);
                    Client.fieldCj.writeInt(Client.fieldBz.fieldX * -1535585527);
                    Client.fieldCj.writeInt(-1535585527 * Client.runescripts.fieldX);
                    Client.fieldCj.writeInt(classM.fieldBe.fieldX * -1535585527);
                    Client.fieldCj.writeInt(-1535585527 * UtilClass3.fieldBb.fieldX);
                    Client.fieldCj.writeInt(-1535585527 * classFm.fieldBc.fieldX);
                    Client.fieldCj.encXTEA(var13, var3, 651432265 * Client.fieldCj.caret, (byte) -37);
                    Client.fieldCj.d(651432265 * Client.fieldCj.caret - var2, -1768311717);
                    Client.socket.writeLater(Client.fieldCj.payload, 0, 651432265 * Client.fieldCj.caret, (byte) -10);
                    Client.fieldCo.loadIsaac(var13, -498392333);

                    for (var6 = 0; var6 < 4; ++var6) {
                        var13[var6] += 50;
                    }

                    Client.packet.loadIsaac(var13, 927302787);
                    Client.fieldBg = -1436817026;
                }

                if (Client.fieldBg * -59346499 == 6) {
                    if (var0 != 1976884746) {
                        throw new IllegalStateException();
                    }

                    if (Client.socket.available(2017443205) > 0) {
                        label445:
                        {
                            if (var0 != 1976884746) {
                                return;
                            }

                            var1 = Client.socket.read(1926939257);
                            if (21 == var1) {
                                if (var0 != 1976884746) {
                                    throw new IllegalStateException();
                                }

                                if (Client.connectionState * -214882771 == 20) {
                                    if (var0 != 1976884746) {
                                        throw new IllegalStateException();
                                    }

                                    Client.fieldBg = 1902852883;
                                    break label445;
                                }
                            }

                            if (2 == var1) {
                                if (var0 != 1976884746) {
                                    throw new IllegalStateException();
                                }

                                Client.fieldBg = -7741891;
                            } else {
                                label446:
                                {
                                    if (15 == var1 && Client.connectionState * -214882771 == 40) {
                                        if (var0 != 1976884746) {
                                            throw new IllegalStateException();
                                        }

                                        Client.fieldCo.caret = 0;
                                        Client.packet.caret = 0;
                                        Client.packetId = 453798763;
                                        Client.fieldCg = -1080667917;
                                        Client.fieldCy = -1573933999;
                                        Client.fieldCv = 1078918573;
                                        Client.fieldCb = 0;
                                        Client.fieldCn = 0;
                                        Client.fieldAr = 0;
                                        Client.menuRowCount = 0;
                                        Client.menuOpen = false;
                                        Client.fieldMp = 0;
                                        Client.destinationX = 0;

                                        for (var2 = 0; var2 < Client.players.length; ++var2) {
                                            if (var0 != 1976884746) {
                                                throw new IllegalStateException();
                                            }

                                            if (null != Client.players[var2]) {
                                                if (var0 != 1976884746) {
                                                    throw new IllegalStateException();
                                                }

                                                Client.players[var2].targetIndex = -2015474651;
                                            }
                                        }

                                        for (var2 = 0; var2 < Client.npcs.length; ++var2) {
                                            if (var0 != 1976884746) {
                                                throw new IllegalStateException();
                                            }

                                            if (null != Client.npcs[var2]) {
                                                if (var0 != 1976884746) {
                                                    throw new IllegalStateException();
                                                }

                                                Client.npcs[var2].targetIndex = -2015474651;
                                            }
                                        }

                                        ExchangeOfferPriceComparator.method29((short) -17114);
                                        UnknownEnum.method373(30, (byte) -80);

                                        for (var2 = 0; var2 < 100; ++var2) {
                                            if (var0 != 1976884746) {
                                                throw new IllegalStateException();
                                            }

                                            Client.fieldLp[var2] = true;
                                        }

                                        return;
                                    }

                                    if (var1 == 23) {
                                        if (var0 != 1976884746) {
                                            throw new IllegalStateException();
                                        }

                                        if (Client.fieldBx * -1175289839 < 1) {
                                            if (var0 != 1976884746) {
                                                throw new IllegalStateException();
                                            }

                                            Client.fieldBx += -36802319;
                                            Client.fieldBg = 0;
                                            break label446;
                                        }
                                    }

                                    LandscapeMod.setLoginError(var1, (short) 32515);
                                    return;
                                }
                            }
                        }
                    }
                }

                if (Client.fieldBg * -59346499 == 7 && Client.socket.available(2109175340) > 0) {
                    if (var0 != 1976884746) {
                        throw new IllegalStateException();
                    }

                    Client.fieldBn = (Client.socket.read(2134041247) + 3) * 1086526036;
                    Client.fieldBg = 947555496;
                }

                if (Client.fieldBg * -59346499 == 8) {
                    if (var0 == 1976884746) {
                        Client.fieldBt = 0;
                        ItemTable.setLoginErrorStrings(StringConstants.fieldAz, StringConstants.fieldAi, Client.fieldBn * 1296074003 / 60 + StringConstants.fieldAa, (byte) -40);
                        if ((Client.fieldBn -= 1020267803) * 1296074003 <= 0) {
                            Client.fieldBg = 0;
                        }

                    }
                } else {
                    if (9 == Client.fieldBg * -59346499 && Client.socket.available(2043458364) >= 13) {
                        boolean var10000;
                        if (Client.socket.read(1617669278) == 1) {
                            if (var0 != 1976884746) {
                                throw new IllegalStateException();
                            }

                            var10000 = true;
                        } else {
                            var10000 = false;
                        }

                        boolean var14 = var10000;
                        Client.socket.read(Client.packet.payload, 0, 4, -192107713);
                        Client.packet.caret = 0;
                        boolean var15 = false;
                        if (var14) {
                            if (var0 != 1976884746) {
                                throw new IllegalStateException();
                            }

                            var2 = Client.packet.gs(855101677) << 24;
                            var2 |= Client.packet.gs(100253957) << 16;
                            var2 |= Client.packet.gs(-883605587) << 8;
                            var2 |= Client.packet.gs(-86055715);
                            var3 = UtilClass39.method173(ClientData.username, (byte) 64);
                            if (Projectile.preferences.map.size() >= 10) {
                                if (var0 != 1976884746) {
                                    throw new IllegalStateException();
                                }

                                if (!Projectile.preferences.map.containsKey(Integer.valueOf(var3))) {
                                    if (var0 != 1976884746) {
                                        throw new IllegalStateException();
                                    }

                                    Iterator var16 = Projectile.preferences.map.entrySet().iterator();
                                    var16.next();
                                    var16.remove();
                                }
                            }

                            Projectile.preferences.map.put(Integer.valueOf(var3), Integer.valueOf(var2));
                            World.method182(388266908);
                        }

                        Client.playerRights = Client.socket.read(1839867761) * -226785603;
                        if (Client.socket.read(2096050129) == 1) {
                            if (var0 != 1976884746) {
                                throw new IllegalStateException();
                            }

                            var10000 = true;
                        } else {
                            var10000 = false;
                        }

                        Client.fieldJj = var10000;
                        Client.playerServerIndex = Client.socket.read(1690824153) * 180156303;
                        Client.playerServerIndex = 180156303 * (Client.playerServerIndex * -1508358289 << 8);
                        Client.playerServerIndex += Client.socket.read(1601857994) * 180156303;
                        Client.fieldHq = Client.socket.read(1998992355) * -1614112445;
                        Client.socket.read(Client.packet.payload, 0, 1, -192107713);
                        Client.packet.caret = 0;
                        Client.packetId = Client.packet.gs(804823116) * -453798763;
                        Client.socket.read(Client.packet.payload, 0, 2, -192107713);
                        Client.packet.caret = 0;
                        Client.fieldCb = Client.packet.readUShort() * 764415269;
                        if (1 == Client.fieldHq * 961198955) {
                            if (var0 != 1976884746) {
                                throw new IllegalStateException();
                            }

                            try {
                                JSObjectUtil.call(Client.instance, "zap", (byte) 1);
                            } catch (Throwable var9) {
                                ;
                            }
                        } else {
                            try {
                                JSObjectUtil.call(Client.instance, "unzap", (byte) 1);
                            } catch (Throwable var8) {
                                ;
                            }
                        }

                        Client.fieldBg = -963039278;
                    }

                    if (Client.fieldBg * -59346499 == 10) {
                        if (var0 != 1976884746) {
                            throw new IllegalStateException();
                        } else {
                            if (Client.socket.available(2003774837) >= Client.fieldCb * 237192877) {
                                if (var0 != 1976884746) {
                                    throw new IllegalStateException();
                                }

                                Client.packet.caret = 0;
                                Client.socket.read(Client.packet.payload, 0, Client.fieldCb * 237192877, -192107713);
                                Client.method207((byte) 0);
                                classDm.fieldDg = -989953269;
                                NpcDefinition.method380(false, 68773785);
                                Client.packetId = 453798763;
                            }

                        }
                    } else {
                        Client.fieldBt += -776613021;
                        if (Client.fieldBt * 1455048267 > 2000) {
                            if (var0 != 1976884746) {
                                throw new IllegalStateException();
                            } else if (Client.fieldBx * -1175289839 < 1) {
                                if (var0 != 1976884746) {
                                    throw new IllegalStateException();
                                } else {
                                    if (DynamicObject.fieldBd * -1775258173 == Buffer.fieldBa * -819256449) {
                                        DynamicObject.fieldBd = UnknownEnum.fieldBv * 1728797703;
                                    } else {
                                        DynamicObject.fieldBd = Buffer.fieldBa * 1233499029;
                                    }

                                    Client.fieldBx += -36802319;
                                    Client.fieldBg = 0;
                                }
                            } else {
                                LandscapeMod.setLoginError(-3, (short) 12251);
                            }
                        }
                    }
                }
            } catch (IOException var11) {
                if (Client.fieldBx * -1175289839 < 1) {
                    if (var0 != 1976884746) {
                        throw new IllegalStateException();
                    } else {
                        if (DynamicObject.fieldBd * -1775258173 == Buffer.fieldBa * -819256449) {
                            if (var0 != 1976884746) {
                                return;
                            }

                            DynamicObject.fieldBd = UnknownEnum.fieldBv * 1728797703;
                        } else {
                            DynamicObject.fieldBd = Buffer.fieldBa * 1233499029;
                        }

                        Client.fieldBx += -36802319;
                        Client.fieldBg = 0;
                    }
                } else {
                    LandscapeMod.setLoginError(-2, (short) 26236);
                }
            }
        } catch (RuntimeException var12) {
            throw ClanMate.error(var12, "er.o(" + ')');
        }
    }

}
