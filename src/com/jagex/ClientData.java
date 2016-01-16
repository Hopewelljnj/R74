package com.jagex;

import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.util.Iterator;

public class ClientData {

    static boolean fieldAo = true;
    static Sprite fieldM;
    static CompressedImage fieldW;
    static CompressedImage fieldS;
    static int fieldAr = 0;
    static CompressedImage fieldI;
    static int fieldG = 0;
    static int fieldY = 0;
    static int[] fieldC;
    static int fieldAh = 0;
    static String fieldAx = "";
    static String fieldAq = "";
    static CompressedImage[] worldSelectorFlags;
    static int fieldAe = -1679106714;
    static String loadStatusString = "";
    static int fieldAl = 0;
    static String fieldAm = "";
    static String username = "";
    static String password = "";
    static UnknownEnum1 fieldAa = UnknownEnum1.TWO_TWO;
    static String fieldAu = "1234567890";
    static int fieldAg = 0;
    static String fieldAd = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ";
    static boolean isWorldSelectorOpen = false;
    static int fieldAn = 0;
    static int[] fieldQ = new int[256];
    static int[] fieldBz = new int[]{1, 1, 1, 1};
    static int fieldBr = -222258127;
    static Sprite[] worldSelectorBack;
    static int fieldBo = 0;
    static int[] fieldBm = new int[]{0, 1, 2, 3};
    static int fieldAs = 0;
    public static ReferenceTableSub textures;


    ClientData() throws Throwable {
        throw new Error();
    }

    static final void method415(int var0) {
        try {
            if (Client.fieldAr * -499169579 > 1) {
                if (var0 >= -144450105) {
                    return;
                }

                Client.fieldAr -= -1774599555;
            }

            if (Client.socketRelatedInt * 339818837 > 0) {
                Client.socketRelatedInt -= -1761281027;
            }

            if (Client.fieldCc) {
                Client.fieldCc = false;
                NpcDefinition.method376((short) -19605);
            } else {
                if (!Client.menuOpen) {
                    Client.menuOptions[0] = StringConstants.cancel;
                    Client.menuNouns[0] = "";
                    Client.menuOpcodes[0] = 1006;
                    Client.menuRowCount = 1829510975;
                }

                int var1;
                for (var1 = 0; var1 < 100; ++var1) {
                    if (!TextureManagerImpl.packet(662436734)) {
                        break;
                    }
                }

                if (30 != Client.connectionState * -214882771) {
                    if (var0 >= -144450105) {
                        throw new IllegalStateException();
                    }
                } else {
                    while (true) {
                        ClassStructure var2 = (ClassStructure) UtilClass31.classStructureIterable.next();
                        int var17;
                        if (var2 == null) {
                            Object var18 = Client.inputHandler.fieldV;
                            int var3;
                            int var4;
                            int var5;
                            int var6;
                            int var7;
                            int var8;
                            int var9;
                            synchronized (Client.inputHandler.fieldV) {
                                if (Client.fieldI) {
                                    label1305:
                                    {
                                        if (0 == Mouse.fieldD * 1724889987 && Client.inputHandler.fieldI * -1475327361 < 40) {
                                            break label1305;
                                        }

                                        Client.fieldCo.writePacketHeader(143, (byte) 0);
                                        Client.fieldCo.writeByte(0);
                                        var17 = Client.fieldCo.caret * 651432265;
                                        var3 = 0;

                                        for (var4 = 0; var4 < -1475327361 * Client.inputHandler.fieldI; ++var4) {
                                            if (Client.fieldCo.caret * 651432265 - var17 >= 240) {
                                                break;
                                            }

                                            ++var3;
                                            var5 = Client.inputHandler.fieldL[var4];
                                            if (var5 < 0) {
                                                var5 = 0;
                                            } else if (var5 > 502) {
                                                var5 = 502;
                                            }

                                            var6 = Client.inputHandler.fieldB[var4];
                                            if (var6 < 0) {
                                                var6 = 0;
                                            } else if (var6 > 764) {
                                                var6 = 764;
                                            }

                                            var7 = var6 + var5 * 765;
                                            if (-1 == Client.inputHandler.fieldL[var4] && Client.inputHandler.fieldB[var4] == -1) {
                                                var6 = -1;
                                                var5 = -1;
                                                var7 = 524287;
                                            }

                                            if (var6 == Client.fieldZ * 713733367 && var5 == Client.fieldC * 619159625) {
                                                if (Client.fieldAn * 1351691467 < 2047) {
                                                    Client.fieldAn += 1865341155;
                                                }
                                                continue;
                                            }

                                            var8 = var6 - Client.fieldZ * 713733367;
                                            Client.fieldZ = 170675399 * var6;
                                            var9 = var5 - Client.fieldC * 619159625;
                                            Client.fieldC = var5 * -1525788167;
                                            if (Client.fieldAn * 1351691467 < 8 && var8 >= -32 && var8 <= 31 && var9 >= -32 && var9 <= 31) {
                                                var8 += 32;
                                                var9 += 32;
                                                Client.fieldCo.writeShort((Client.fieldAn * 1351691467 << 12) + (var8 << 6) + var9);
                                                Client.fieldAn = 0;
                                                continue;
                                            }

                                            if (Client.fieldAn * 1351691467 < 8) {
                                                Client.fieldCo.i(var7 + (Client.fieldAn * 1351691467 << 19) + 8388608);
                                                Client.fieldAn = 0;
                                            } else {
                                                Client.fieldCo.writeInt(var7 + -1073741824 + (Client.fieldAn * 1351691467 << 19));
                                                Client.fieldAn = 0;
                                            }
                                        }

                                        Client.fieldCo.x(Client.fieldCo.caret * 651432265 - var17, (byte) -125);
                                        if (var3 >= Client.inputHandler.fieldI * -1475327361) {
                                            Client.inputHandler.fieldI = 0;
                                        } else {
                                            Client.inputHandler.fieldI -= var3 * -1398704769;

                                            for (var4 = 0; var4 < Client.inputHandler.fieldI * -1475327361; ++var4) {
                                                Client.inputHandler.fieldB[var4] = Client.inputHandler.fieldB[var3 + var4];
                                                Client.inputHandler.fieldL[var4] = Client.inputHandler.fieldL[var4 + var3];
                                            }
                                        }
                                    }
                                } else {
                                    Client.inputHandler.fieldI = 0;
                                }
                            }

                            label1309:
                            {
                                if (Mouse.fieldD * 1724889987 != 1) {
                                    label1310:
                                    {
                                        if (var0 >= -144450105) {
                                            throw new IllegalStateException();
                                        }

                                        if (!CalendarUtil.fieldAw) {
                                            if (var0 >= -144450105) {
                                                throw new IllegalStateException();
                                            }

                                            if (4 == Mouse.fieldD * 1724889987) {
                                                break label1310;
                                            }

                                            if (var0 >= -144450105) {
                                                throw new IllegalStateException();
                                            }
                                        }

                                        if (Mouse.fieldD * 1724889987 != 2) {
                                            break label1309;
                                        }
                                    }
                                }

                                long var19 = (Mouse.fieldQ * 1152336450931229011L - 1219437111416953677L * Client.fieldP) / 50L;
                                if (var19 > 4095L) {
                                    var19 = 4095L;
                                }

                                Client.fieldP = 5374760574719164191L * Mouse.fieldQ;
                                var3 = Mouse.fieldO * 1708223245;
                                if (var3 < 0) {
                                    if (var0 >= -144450105) {
                                        throw new IllegalStateException();
                                    }

                                    var3 = 0;
                                } else if (var3 > 502) {
                                    if (var0 >= -144450105) {
                                        throw new IllegalStateException();
                                    }

                                    var3 = 502;
                                }

                                var4 = Mouse.fieldX * -1590834513;
                                if (var4 < 0) {
                                    if (var0 >= -144450105) {
                                        throw new IllegalStateException();
                                    }

                                    var4 = 0;
                                } else if (var4 > 764) {
                                    var4 = 764;
                                }

                                var5 = var3 * 765 + var4;
                                byte var28 = 0;
                                if (2 == Mouse.fieldD * 1724889987) {
                                    if (var0 >= -144450105) {
                                        throw new IllegalStateException();
                                    }

                                    var28 = 1;
                                }

                                var7 = (int) var19;
                                Client.fieldCo.writePacketHeader(194, (byte) 0);
                                Client.fieldCo.writeInt(var5 + (var28 << 19) + (var7 << 20));
                            }

                            if (Keyboard.fieldCc * -1601902227 > 0) {
                                if (var0 >= -144450105) {
                                    throw new IllegalStateException();
                                }

                                Client.fieldCo.writePacketHeader(209, (byte) 0);
                                Client.fieldCo.writeShort(0);
                                var1 = 651432265 * Client.fieldCo.caret;
                                long var20 = classDz.getFancyTime(520090157);

                                for (var4 = 0; var4 < Keyboard.fieldCc * -1601902227; ++var4) {
                                    if (var0 >= -144450105) {
                                        throw new IllegalStateException();
                                    }

                                    long var27 = var20 - Client.fieldMl * 2416060807338014355L;
                                    if (var27 > 16777215L) {
                                        if (var0 >= -144450105) {
                                            throw new IllegalStateException();
                                        }

                                        var27 = 16777215L;
                                    }

                                    Client.fieldMl = -225950179832801381L * var20;
                                    Client.fieldCo.writeByte(Keyboard.fieldCv[var4]);
                                    Client.fieldCo.bu((int) var27, -821537633);
                                }

                                Client.fieldCo.d(651432265 * Client.fieldCo.caret - var1, 1987064604);
                            }

                            if (Client.fieldFx * 88556127 > 0) {
                                if (var0 >= -144450105) {
                                    throw new IllegalStateException();
                                }

                                Client.fieldFx -= -2066900577;
                            }

                            label1217:
                            {
                                if (!Keyboard.someWeirdSettings[96] && !Keyboard.someWeirdSettings[97]) {
                                    if (var0 >= -144450105) {
                                        throw new IllegalStateException();
                                    }

                                    if (!Keyboard.someWeirdSettings[98]) {
                                        if (var0 >= -144450105) {
                                            return;
                                        }

                                        if (!Keyboard.someWeirdSettings[99]) {
                                            break label1217;
                                        }

                                        if (var0 >= -144450105) {
                                            return;
                                        }
                                    }
                                }

                                Client.fieldFp = true;
                            }

                            if (Client.fieldFp) {
                                if (var0 >= -144450105) {
                                    throw new IllegalStateException();
                                }

                                if (Client.fieldFx * 88556127 <= 0) {
                                    if (var0 >= -144450105) {
                                        return;
                                    }

                                    Client.fieldFx = 1611661420;
                                    Client.fieldFp = false;
                                    Client.fieldCo.writePacketHeader(4, (byte) 0);
                                    Client.fieldCo.ak(Client.minimapRotation * -422086387, 1078918573);
                                    Client.fieldCo.writeShort(Client.fieldFe * 81100511);
                                }
                            }

                            if (ScriptStackElement.fieldQg) {
                                if (var0 >= -144450105) {
                                    throw new IllegalStateException();
                                }

                                if (!Client.fieldAs) {
                                    if (var0 >= -144450105) {
                                        throw new IllegalStateException();
                                    }

                                    Client.fieldAs = true;
                                    Client.fieldCo.writePacketHeader(1, (byte) 0);
                                    Client.fieldCo.writeByte(1);
                                }
                            }

                            if (!ScriptStackElement.fieldQg) {
                                if (var0 >= -144450105) {
                                    throw new IllegalStateException();
                                }

                                if (Client.fieldAs) {
                                    if (var0 >= -144450105) {
                                        throw new IllegalStateException();
                                    }

                                    Client.fieldAs = false;
                                    Client.fieldCo.writePacketHeader(1, (byte) 0);
                                    Client.fieldCo.writeByte(0);
                                }
                            }

                            Varpbit.method414(1593890895);
                            if (30 != Client.connectionState * -214882771) {
                                if (var0 >= -144450105) {
                                    return;
                                }

                                return;
                            }

                            Player.method146(-542616303);
                            classGz.method21(-842025972);
                            Client.fieldCn += 627858425;
                            if (Client.fieldCn * 1251833417 > 750) {
                                if (var0 >= -144450105) {
                                    throw new IllegalStateException();
                                }

                                NpcDefinition.method376((short) -18845);
                                return;
                            }

                            for (var1 = -1; var1 < Client.playerCount * 16022533; ++var1) {
                                if (var0 >= -144450105) {
                                    throw new IllegalStateException();
                                }

                                if (-1 == var1) {
                                    if (var0 >= -144450105) {
                                        throw new IllegalStateException();
                                    }

                                    var17 = 2047;
                                } else {
                                    var17 = Client.playerIndicies[var1];
                                }

                                Player var23 = Client.players[var17];
                                if (null != var23) {
                                    if (var0 >= -144450105) {
                                        throw new IllegalStateException();
                                    }

                                    Client.method208(var23, 1, (byte) 61);
                                }
                            }

                            classEp.method185(165565210);
                            UtilClass41.method159(692079065);
                            Client.fieldEo += 1731765121;
                            if (0 != Client.cursorState * -1127086643) {
                                Client.fieldGy += -227872588;
                                if (Client.fieldGy * -2013609415 >= 400) {
                                    Client.cursorState = 0;
                                }
                            }

                            if (ClanMate.fieldGn != null) {
                                if (var0 >= -144450105) {
                                    throw new IllegalStateException();
                                }

                                Client.fieldGw += -2002913707;
                                if (Client.fieldGw * 597120765 >= 15) {
                                    classBx.method250(ClanMate.fieldGn, 57574739);
                                    ClanMate.fieldGn = null;
                                }
                            }

                            Widget var22 = Client.fieldIi;
                            Widget var21 = ObjectDefinition.fieldIu;
                            Client.fieldIi = null;
                            ObjectDefinition.fieldIu = null;
                            Client.dragTarget = null;
                            Client.fieldKb = false;
                            Client.fieldJw = false;
                            Client.fieldLl = 0;

                            while (classDc.method276(-1985174875)) {
                                if (var0 >= -144450105) {
                                    throw new IllegalStateException();
                                }

                                if (Client.fieldLl * 1506159627 >= 128) {
                                    break;
                                }

                                if (var0 >= -144450105) {
                                    throw new IllegalStateException();
                                }

                                if (Client.playerRights * -1572330347 >= 2) {
                                    if (var0 >= -144450105) {
                                        return;
                                    }

                                    if (Keyboard.someWeirdSettings[82]) {
                                        if (var0 >= -144450105) {
                                            throw new IllegalStateException();
                                        }

                                        if (GroundItem.fieldCh * 365866549 == 66) {
                                            String var26 = "";

                                            Message var32;
                                            for (Iterator var30 = UtilClass40.fieldV.iterator(); var30.hasNext(); var26 = var26 + var32.fieldB + ':' + var32.fieldM + '\n') {
                                                if (var0 >= -144450105) {
                                                    throw new IllegalStateException();
                                                }

                                                var32 = (Message) var30.next();
                                            }

                                            AnimationSequence.fieldOo.setContents(new StringSelection(var26), (ClipboardOwner) null);
                                            continue;
                                        }
                                    }
                                }

                                Client.fieldMd[Client.fieldLl * 1506159627] = GroundItem.fieldCh * 365866549;
                                Client.fieldMj[Client.fieldLl * 1506159627] = ClanMate.fieldCb;
                                Client.fieldLl += -138805341;
                            }

                            UtilClass41.method158(Client.fieldJh * -98490421, 0, 0, 765, 503, 0, 0, (byte) -51);
                            Client.fieldKe += 1891793245;

                            while (true) {
                                ScriptEvent var24 = (ScriptEvent) Client.fieldLw.popFirst();
                                Widget var29;
                                Widget var31;
                                if (null == var24) {
                                    if (var0 >= -144450105) {
                                        return;
                                    }

                                    while (true) {
                                        var24 = (ScriptEvent) Client.fieldLo.popFirst();
                                        if (var24 == null) {
                                            if (var0 >= -144450105) {
                                                return;
                                            }

                                            while (true) {
                                                var24 = (ScriptEvent) Client.scriptEventDeque.popFirst();
                                                if (null == var24) {
                                                    if (var0 >= -144450105) {
                                                        throw new IllegalStateException();
                                                    }

                                                    UnknownEnum.method374(-552445325);
                                                    if (Client.widgetDragSource != null) {
                                                        TileDecoration.method352((byte) 20);
                                                    }

                                                    if (InputHandler.fieldGc != null) {
                                                        if (var0 >= -144450105) {
                                                            throw new IllegalStateException();
                                                        }

                                                        classBx.method250(InputHandler.fieldGc, 57574739);
                                                        Client.fieldGi += 683417161;
                                                        if (Mouse.fieldM * -2003697211 == 0) {
                                                            if (var0 >= -144450105) {
                                                                return;
                                                            }

                                                            if (Client.fieldGb) {
                                                                if (var0 >= -144450105) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                if (classBy.fieldGu == InputHandler.fieldGc && Client.fieldGv * -435280353 != Client.fieldGg * 522202181) {
                                                                    Widget var25 = InputHandler.fieldGc;
                                                                    byte var33 = 0;
                                                                    if (1 == Client.fieldJt * 1555724423) {
                                                                        if (var0 >= -144450105) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        if (var25.contentType * 481950881 == 206) {
                                                                            if (var0 >= -144450105) {
                                                                                return;
                                                                            }

                                                                            var33 = 1;
                                                                        }
                                                                    }

                                                                    if (var25.itemIds[Client.fieldGg * 522202181] <= 0) {
                                                                        if (var0 >= -144450105) {
                                                                            return;
                                                                        }

                                                                        var33 = 0;
                                                                    }

                                                                    if (classBq.method263(UtilClass38.getWidgetConfig(var25, 2070855251), (byte) 5)) {
                                                                        var5 = Client.fieldGv * -435280353;
                                                                        var6 = Client.fieldGg * 522202181;
                                                                        var25.itemIds[var6] = var25.itemIds[var5];
                                                                        var25.itemQuantities[var6] = var25.itemQuantities[var5];
                                                                        var25.itemIds[var5] = -1;
                                                                        var25.itemQuantities[var5] = 0;
                                                                    } else if (var33 == 1) {
                                                                        if (var0 >= -144450105) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        var5 = Client.fieldGv * -435280353;
                                                                        var6 = Client.fieldGg * 522202181;

                                                                        while (var5 != var6) {
                                                                            if (var0 >= -144450105) {
                                                                                throw new IllegalStateException();
                                                                            }

                                                                            if (var5 > var6) {
                                                                                var25.n(var5 - 1, var5, -649166710);
                                                                                --var5;
                                                                            } else if (var5 < var6) {
                                                                                if (var0 >= -144450105) {
                                                                                    throw new IllegalStateException();
                                                                                }

                                                                                var25.n(var5 + 1, var5, -896650360);
                                                                                ++var5;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var25.n(Client.fieldGg * 522202181, Client.fieldGv * -435280353, 774696639);
                                                                    }

                                                                    Client.fieldCo.writePacketHeader(226, (byte) 0);
                                                                    Client.fieldCo.bs(-1866039137 * InputHandler.fieldGc.id, -1315614368);
                                                                    Client.fieldCo.aa(var33, (byte) 6);
                                                                    Client.fieldCo.af(Client.fieldGg * 522202181);
                                                                    Client.fieldCo.af(Client.fieldGv * -435280353);
                                                                }
                                                            } else {
                                                                label1104:
                                                                {
                                                                    label1103:
                                                                    {
                                                                        if (Client.fieldHc * -283472751 != 1) {
                                                                            if (var0 >= -144450105) {
                                                                                return;
                                                                            }

                                                                            if (!InputHandler.method86(Client.menuRowCount * 445599935 - 1, -959053341)) {
                                                                                break label1103;
                                                                            }

                                                                            if (var0 >= -144450105) {
                                                                                throw new IllegalStateException();
                                                                            }
                                                                        }

                                                                        if (Client.menuRowCount * 445599935 > 2) {
                                                                            if (var0 >= -144450105) {
                                                                                return;
                                                                            }

                                                                            UtilClass14.openMenu(Client.fieldGl * -1533276865, Client.fieldGz * 1814995251, 820603769);
                                                                            break label1104;
                                                                        }
                                                                    }

                                                                    if (Client.menuRowCount * 445599935 > 0) {
                                                                        if (var0 >= -144450105) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        var3 = Client.fieldGl * -1533276865;
                                                                        var4 = Client.fieldGz * 1814995251;
                                                                        ClanMate.method193(Projectile.menuItem, var3, var4, 2092622819);
                                                                        Projectile.menuItem = null;
                                                                    }
                                                                }
                                                            }

                                                            Client.fieldGw = 1445699410;
                                                            Mouse.fieldD = 0;
                                                            InputHandler.fieldGc = null;
                                                        } else if (Client.fieldGi * 1192113145 >= 5) {
                                                            label1328:
                                                            {
                                                                if (var0 >= -144450105) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                if (Mouse.fieldW * 518596439 <= Client.fieldGl * -1533276865 + 5) {
                                                                    if (var0 >= -144450105) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    if (Mouse.fieldW * 518596439 >= Client.fieldGl * -1533276865 - 5 && Mouse.fieldE * 1747296693 <= 5 + Client.fieldGz * 1814995251) {
                                                                        if (Mouse.fieldE * 1747296693 >= Client.fieldGz * 1814995251 - 5) {
                                                                            break label1328;
                                                                        }

                                                                        if (var0 >= -144450105) {
                                                                            return;
                                                                        }
                                                                    }
                                                                }

                                                                Client.fieldGb = true;
                                                            }
                                                        }
                                                    }

                                                    if (-1 != Landscape.selectedTileRegionX) {
                                                        var3 = Landscape.selectedTileRegionX;
                                                        var4 = Landscape.selectedTileRegionY;
                                                        Client.fieldCo.writePacketHeader(0, (byte) 0);
                                                        Client.fieldCo.writeByte(5);
                                                        Client.fieldCo.writeLittleEndianShort(var4 + CalendarUtil.baseY * -1046564359, 1912675015);
                                                        Client.fieldCo.writeInvertedByte(Keyboard.someWeirdSettings[82] ? (byte) (Keyboard.someWeirdSettings[81] ? 2 : 1) : 0, (byte) -10);
                                                        Client.fieldCo.ak(var3 + classDc.baseX * -2071335905, 1078918573);
                                                        Landscape.selectedTileRegionX = -1;
                                                        Client.clickX = Mouse.fieldX * -474602133;
                                                        Client.clickY = Mouse.fieldO * 902405901;
                                                        Client.cursorState = -1159041275;
                                                        Client.fieldGy = 0;
                                                        Client.destinationX = -950792229 * var3;
                                                        Client.destinationY = var4 * -475172701;
                                                    }

                                                    if (var22 != Client.fieldIi) {
                                                        if (var22 != null) {
                                                            classBx.method250(var22, 57574739);
                                                        }

                                                        if (Client.fieldIi != null) {
                                                            if (var0 >= -144450105) {
                                                                throw new IllegalStateException();
                                                            }

                                                            classBx.method250(Client.fieldIi, 57574739);
                                                        }
                                                    }

                                                    if (var21 != ObjectDefinition.fieldIu) {
                                                        if (var0 >= -144450105) {
                                                            return;
                                                        }

                                                        if (Client.fieldIm * -2085205915 == Client.fieldIb * -110905105) {
                                                            if (var0 >= -144450105) {
                                                                throw new IllegalStateException();
                                                            }

                                                            if (var21 != null) {
                                                                classBx.method250(var21, 57574739);
                                                            }

                                                            if (ObjectDefinition.fieldIu != null) {
                                                                classBx.method250(ObjectDefinition.fieldIu, 57574739);
                                                            }
                                                        }
                                                    }

                                                    if (null != ObjectDefinition.fieldIu) {
                                                        if (Client.fieldIb * -110905105 < Client.fieldIm * -2085205915) {
                                                            if (var0 >= -144450105) {
                                                                throw new IllegalStateException();
                                                            }

                                                            Client.fieldIb += 783709711;
                                                            if (Client.fieldIb * -110905105 == Client.fieldIm * -2085205915) {
                                                                if (var0 >= -144450105) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                classBx.method250(ObjectDefinition.fieldIu, 57574739);
                                                            }
                                                        }
                                                    } else if (Client.fieldIb * -110905105 > 0) {
                                                        if (var0 >= -144450105) {
                                                            throw new IllegalStateException();
                                                        }

                                                        Client.fieldIb -= 783709711;
                                                    }

                                                    label1078:
                                                    {
                                                        var3 = Client.fieldDa * 1350194799 + 404428603 * Client.myPlayer.strictX;
                                                        var4 = Client.fieldDy * 99601201 + -1490664571 * Client.myPlayer.strictY;
                                                        if (LandscapeMod.fieldFj * 1738154679 - var3 >= -500) {
                                                            if (var0 >= -144450105) {
                                                                return;
                                                            }

                                                            if (LandscapeMod.fieldFj * 1738154679 - var3 <= 500) {
                                                                if (var0 >= -144450105) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                if (UtilClass40.fieldFc * 1210846145 - var4 >= -500) {
                                                                    if (var0 >= -144450105) {
                                                                        return;
                                                                    }

                                                                    if (UtilClass40.fieldFc * 1210846145 - var4 <= 500) {
                                                                        break label1078;
                                                                    }

                                                                    if (var0 >= -144450105) {
                                                                        throw new IllegalStateException();
                                                                    }
                                                                }
                                                            }
                                                        }

                                                        LandscapeMod.fieldFj = var3 * 689855239;
                                                        UtilClass40.fieldFc = var4 * -1390279615;
                                                    }

                                                    if (var3 != LandscapeMod.fieldFj * 1738154679) {
                                                        if (var0 >= -144450105) {
                                                            throw new IllegalStateException();
                                                        }

                                                        LandscapeMod.fieldFj += (var3 - LandscapeMod.fieldFj * 1738154679) / 16 * 689855239;
                                                    }

                                                    if (var4 != UtilClass40.fieldFc * 1210846145) {
                                                        if (var0 >= -144450105) {
                                                            throw new IllegalStateException();
                                                        }

                                                        UtilClass40.fieldFc += -1390279615 * ((var4 - UtilClass40.fieldFc * 1210846145) / 16);
                                                    }

                                                    label1332:
                                                    {
                                                        if (4 == Mouse.fieldM * -2003697211 && CalendarUtil.fieldAw) {
                                                            int var35;
                                                            label1057:
                                                            {
                                                                var5 = Mouse.fieldE * 1747296693 - Client.fieldFw * -336467773;
                                                                Client.fieldFr = var5 * -120712282;
                                                                if (var5 != -1 && var5 != 1) {
                                                                    var35 = (Client.fieldFw * -336467773 + Mouse.fieldE * 1747296693) / 2;
                                                                    break label1057;
                                                                }
                                                                var35 = Mouse.fieldE * 1747296693;
                                                            }

                                                            int var10000;
                                                            label1051:
                                                            {
                                                                Client.fieldFw = -586807317 * var35;
                                                                var6 = Client.fieldFy * -1210889211 - Mouse.fieldW * 518596439;
                                                                Client.fieldFa = var6 * -1909344798;
                                                                if (var6 != -1 && 1 != var6) {
                                                                    var10000 = (Client.fieldFy * -1210889211 + Mouse.fieldW * 518596439) / 2;
                                                                    break label1051;
                                                                }
                                                                var10000 = Mouse.fieldW * 518596439;
                                                            }
                                                            Client.fieldFy = var10000 * 1718984909;
                                                            break label1332;
                                                        }

                                                        if (Keyboard.someWeirdSettings[96]) {
                                                            Client.fieldFa += (-24 - Client.fieldFa * 1033164305) / 2 * -954672399;
                                                        } else if (Keyboard.someWeirdSettings[97]) {
                                                            Client.fieldFa += (24 - Client.fieldFa * 1033164305) / 2 * -954672399;
                                                        } else {
                                                            Client.fieldFa = -954672399 * (Client.fieldFa * 1033164305 / 2);
                                                        }

                                                        if (Keyboard.someWeirdSettings[98]) {
                                                            if (var0 >= -144450105) {
                                                                throw new IllegalStateException();
                                                            }

                                                            Client.fieldFr += -60356141 * ((12 - Client.fieldFr * -1033947557) / 2);
                                                        } else if (Keyboard.someWeirdSettings[99]) {
                                                            if (var0 >= -144450105) {
                                                                throw new IllegalStateException();
                                                            }

                                                            Client.fieldFr += -60356141 * ((-12 - Client.fieldFr * -1033947557) / 2);
                                                        } else {
                                                            Client.fieldFr = -60356141 * (Client.fieldFr * -1033947557 / 2);
                                                        }

                                                        Client.fieldFw = Mouse.fieldE * -1389009881;
                                                        Client.fieldFy = Mouse.fieldW * 504225963;
                                                    }

                                                    Client.minimapRotation = -1874395707 * (Client.fieldFa * 1033164305 / 2 + Client.minimapRotation * -422086387 & 2047);
                                                    Client.fieldFe += 1927658783 * (Client.fieldFr * -1033947557 / 2);
                                                    if (Client.fieldFe * 81100511 < 128) {
                                                        if (var0 >= -144450105) {
                                                            throw new IllegalStateException();
                                                        }

                                                        Client.fieldFe = 1927188352;
                                                    }

                                                    if (Client.fieldFe * 81100511 > 383) {
                                                        Client.fieldFe = -441061023;
                                                    }

                                                    var5 = LandscapeMod.fieldFj * 1738154679 >> 7;
                                                    var6 = UtilClass40.fieldFc * 1210846145 >> 7;
                                                    var7 = Landscape.getTileHeight(LandscapeMod.fieldFj * 1738154679, UtilClass40.fieldFc * 1210846145, Client.floorLevel * 87713183);
                                                    var8 = 0;
                                                    if (var5 > 3) {
                                                        if (var0 >= -144450105) {
                                                            return;
                                                        }

                                                        if (var6 > 3 && var5 < 100) {
                                                            if (var0 >= -144450105) {
                                                                throw new IllegalStateException();
                                                            }

                                                            if (var6 < 100) {
                                                                if (var0 >= -144450105) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                for (var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                                                                    for (int var10 = var6 - 4; var10 <= 4 + var6; ++var10) {
                                                                        if (var0 >= -144450105) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        int var11 = Client.floorLevel * 87713183;
                                                                        if (var11 < 3) {
                                                                            if (var0 >= -144450105) {
                                                                                throw new IllegalStateException();
                                                                            }

                                                                            if ((classM.renderRules[1][var9][var10] & 2) == 2) {
                                                                                if (var0 >= -144450105) {
                                                                                    return;
                                                                                }

                                                                                ++var11;
                                                                            }
                                                                        }

                                                                        int var12 = var7 - classM.tileHeights[var11][var9][var10];
                                                                        if (var12 > var8) {
                                                                            var8 = var12;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }

                                                    var9 = 192 * var8;
                                                    if (var9 > 98048) {
                                                        if (var0 >= -144450105) {
                                                            throw new IllegalStateException();
                                                        }

                                                        var9 = 98048;
                                                    }

                                                    if (var9 < '\u8000') {
                                                        if (var0 >= -144450105) {
                                                            throw new IllegalStateException();
                                                        }

                                                        var9 = '\u8000';
                                                    }

                                                    if (var9 > Client.fieldFb * 2052546725) {
                                                        if (var0 >= -144450105) {
                                                            throw new IllegalStateException();
                                                        }

                                                        Client.fieldFb += -76970195 * ((var9 - Client.fieldFb * 2052546725) / 24);
                                                    } else if (var9 < Client.fieldFb * 2052546725) {
                                                        if (var0 >= -144450105) {
                                                            throw new IllegalStateException();
                                                        }

                                                        Client.fieldFb += -76970195 * ((var9 - Client.fieldFb * 2052546725) / 80);
                                                    }

                                                    if (Client.cameraLocked) {
                                                        UtilClass34.method355(1750966389);
                                                    }

                                                    for (var3 = 0; var3 < 5; ++var3) {
                                                        ++Client.fieldOq[var3];
                                                    }

                                                    var3 = CalendarUtil.updateMouseIdle(314272449);
                                                    var4 = RuneScript.updateKeyboardIdle(-709878131);
                                                    if (var3 > 15000 && var4 > 15000) {
                                                        Client.socketRelatedInt = 2061374738; //250 - if this is set > 0 then socket#stop is called
                                                        Mouse.mouseIdleTime = -1390983492; //14500
                                                        Client.fieldCo.writePacketHeader(108, (byte) 0);
                                                    }

                                                    Client.fieldDm += 1018976399;
                                                    if (Client.fieldDm * 1513735791 > 500) {
                                                        Client.fieldDm = 0;
                                                        var5 = (int) (Math.random() * 8.0D);
                                                        if ((var5 & 1) == 1) {
                                                            Client.fieldDa += Client.fieldDz * 1601205579;
                                                        }

                                                        if (2 == (var5 & 2)) {
                                                            if (var0 >= -144450105) {
                                                                throw new IllegalStateException();
                                                            }

                                                            Client.fieldDy += Client.fieldDb * -1561058607;
                                                        }

                                                        if (4 == (var5 & 4)) {
                                                            Client.fieldDx += Client.fieldDe * -681310149;
                                                        }
                                                    }

                                                    if (Client.fieldDa * 1350194799 < -50) {
                                                        if (var0 >= -144450105) {
                                                            return;
                                                        }

                                                        Client.fieldDz = 1259849370;
                                                    }

                                                    if (Client.fieldDa * 1350194799 > 50) {
                                                        if (var0 >= -144450105) {
                                                            throw new IllegalStateException();
                                                        }

                                                        Client.fieldDz = -1259849370;
                                                    }

                                                    if (Client.fieldDy * 99601201 < -55) {
                                                        if (var0 >= -144450105) {
                                                            return;
                                                        }

                                                        Client.fieldDb = -54053374;
                                                    }

                                                    if (Client.fieldDy * 99601201 > 55) {
                                                        Client.fieldDb = 54053374;
                                                    }

                                                    if (Client.fieldDx * -1708699181 < -40) {
                                                        if (var0 >= -144450105) {
                                                            return;
                                                        }

                                                        Client.fieldDe = -69455775;
                                                    }

                                                    if (Client.fieldDx * -1708699181 > 40) {
                                                        if (var0 >= -144450105) {
                                                            throw new IllegalStateException();
                                                        }

                                                        Client.fieldDe = 69455775;
                                                    }

                                                    Client.fieldEq += -828059317;
                                                    if (Client.fieldEq * 518991971 > 500) {
                                                        Client.fieldEq = 0;
                                                        var5 = (int) (Math.random() * 8.0D);
                                                        if ((var5 & 1) == 1) {
                                                            Client.minimapScale += Client.fieldEp * -705341381;
                                                        }

                                                        if (2 == (var5 & 2)) {
                                                            Client.minimapOffset += Client.fieldEe * 1395836639;
                                                        }
                                                    }

                                                    if (Client.minimapScale * -148158859 < -60) {
                                                        Client.fieldEp = -227468914;
                                                    }

                                                    if (Client.minimapScale * -148158859 > 60) {
                                                        Client.fieldEp = 227468914;
                                                    }

                                                    if (Client.minimapOffset * -695888753 < -20) {
                                                        Client.fieldEe = 1639120497;
                                                    }

                                                    if (Client.minimapOffset * -695888753 > 10) {
                                                        Client.fieldEe = -1639120497;
                                                    }

                                                    for (classAm var34 = (classAm) Client.classGjListOfClassAm.v(); null != var34; var34 = (classAm) Client.classGjListOfClassAm.i()) {
                                                        if ((long) (var34.fieldA * -892139491) < classDz.getFancyTime(1055635888) / 1000L - 5L) {
                                                            if (var34.fieldI > 0) {
                                                                JagSocket.addMessage(5, "", var34.fieldV + StringConstants.fieldEn, (byte) 16);
                                                            }

                                                            if (0 == var34.fieldI) {
                                                                JagSocket.addMessage(5, "", var34.fieldV + StringConstants.fieldEu, (byte) 16);
                                                            }

                                                            var34.delete();
                                                        }
                                                    }

                                                    Client.fieldCp += -1615896493;
                                                    if (Client.fieldCp * -1655315493 > 50) {
                                                        if (var0 >= -144450105) {
                                                            throw new IllegalStateException();
                                                        }

                                                        Client.fieldCo.writePacketHeader(170, (byte) 0);
                                                    }

                                                    try {
                                                        if (Client.socket != null && 651432265 * Client.fieldCo.caret > 0) {
                                                            Client.socket.writeLater(Client.fieldCo.payload, 0, 651432265 * Client.fieldCo.caret, (byte) 72);
                                                            Client.fieldCo.caret = 0;
                                                            Client.fieldCp = 0;
                                                        }
                                                    } catch (IOException var13) {
                                                        NpcDefinition.method376((short) -26126);
                                                    }

                                                    return;
                                                }

                                                var29 = var24.src;
                                                if (var29.index * 1176560255 >= 0) {
                                                    if (var0 >= -144450105) {
                                                        throw new IllegalStateException();
                                                    }

                                                    var31 = Widget.lookup(var29.fieldP * 1574594539);
                                                    if (null == var31) {
                                                        continue;
                                                    }

                                                    if (var0 >= -144450105) {
                                                        throw new IllegalStateException();
                                                    }

                                                    if (var31.children == null) {
                                                        continue;
                                                    }

                                                    if (var0 >= -144450105) {
                                                        throw new IllegalStateException();
                                                    }

                                                    if (var29.index * 1176560255 >= var31.children.length) {
                                                        continue;
                                                    }

                                                    if (var0 >= -144450105) {
                                                        throw new IllegalStateException();
                                                    }

                                                    if (var31.children[var29.index * 1176560255] != var29) {
                                                        continue;
                                                    }
                                                }

                                                classT.method167(var24, (byte) 1);
                                            }
                                        }

                                        var29 = var24.src;
                                        if (var29.index * 1176560255 >= 0) {
                                            if (var0 >= -144450105) {
                                                throw new IllegalStateException();
                                            }

                                            var31 = Widget.lookup(var29.fieldP * 1574594539);
                                            if (var31 == null || var31.children == null) {
                                                continue;
                                            }

                                            if (var0 >= -144450105) {
                                                throw new IllegalStateException();
                                            }

                                            if (var29.index * 1176560255 >= var31.children.length) {
                                                continue;
                                            }

                                            if (var0 >= -144450105) {
                                                throw new IllegalStateException();
                                            }

                                            if (var29 != var31.children[var29.index * 1176560255]) {
                                                if (var0 >= -144450105) {
                                                    return;
                                                }
                                                continue;
                                            }
                                        }

                                        classT.method167(var24, (byte) 1);
                                    }
                                }

                                var29 = var24.src;
                                if (var29.index * 1176560255 >= 0) {
                                    if (var0 >= -144450105) {
                                        throw new IllegalStateException();
                                    }

                                    var31 = Widget.lookup(var29.fieldP * 1574594539);
                                    if (var31 == null) {
                                        continue;
                                    }

                                    if (var0 >= -144450105) {
                                        throw new IllegalStateException();
                                    }

                                    if (var31.children == null || var29.index * 1176560255 >= var31.children.length) {
                                        continue;
                                    }

                                    if (var0 >= -144450105) {
                                        throw new IllegalStateException();
                                    }

                                    if (var31.children[var29.index * 1176560255] != var29) {
                                        if (var0 >= -144450105) {
                                            throw new IllegalStateException();
                                        }
                                        continue;
                                    }
                                }

                                classT.method167(var24, (byte) 1);
                            }
                        }

                        Client.fieldCo.writePacketHeader(185, (byte) 0);
                        Client.fieldCo.writeByte(0);
                        var17 = Client.fieldCo.caret * 651432265;
                        UtilClass16.method57(Client.fieldCo, -210263554);
                        Client.fieldCo.x(Client.fieldCo.caret * 651432265 - var17, (byte) -87);
                    }
                }
            }
        } catch (RuntimeException var15) {
            throw ClanMate.error(var15, "ah.g(" + ')');
        }
    }

    static final void method416(String var0, byte var1) {
        try {
            if (var0.equals("")) {
                if (var1 == 0) {
                    throw new IllegalStateException();
                }
            } else {
                Client.fieldCo.writePacketHeader(46, (byte) 0);
                Packet var2 = Client.fieldCo;
                int var3 = var0.length() + 1;
                var2.writeByte(var3);
                Client.fieldCo.w(var0, (byte) 0);
            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "ah.dk(" + ')');
        }
    }
}
