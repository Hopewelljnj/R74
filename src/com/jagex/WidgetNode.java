package com.jagex;

public class WidgetNode extends Node {

    static int[] fieldDq;
    static SystemNode systemNode;
    int state;
    boolean valid = false;
    int owner;

    static final void processAction(
            int arg1, int arg2, int opcode, int arg0, String action, String target,
            int mouseX, int mouseY) {
        try {
            if (opcode == 3) {
                int id = arg0 >> 14 & 0x7fff;
                System.out.println(id);
            }
            System.out.println("[doAction] Op: " + opcode + ", Arg1: " + arg1 + ", Arg2: " + arg2 + ", Arg0: " + arg0 +
                    ", Action: " + action + ", Target: " + target + ", var6: " + mouseX + ", var7: " + mouseY);
            if (opcode >= 2000) {
                opcode -= 2000;
            }

            if (31 == opcode) {
                Client.fieldCo.writePacketHeader(163, (byte) 0);
                Client.fieldCo.af(arg0);
                Client.fieldCo.writeInt(arg2);
                Client.fieldCo.af(Character.fieldIz * 1341679985);
                Client.fieldCo.writeShort(arg1);
                Client.fieldCo.bs(UtilClass6.selectedItemWidgetId * 1795747025, -1315614368);
                Client.fieldCo.writeLittleEndianShort(UtilClass41.selectedItemIndex * 1003817045, 2055656355);
                Client.fieldGw = 0;
                ClanMate.fieldGn = Widget.lookup(arg2);
                Client.fieldGr = arg1 * -959053341;
            }

            byte var10001;
            if (opcode == 2) {
                Client.clickX = 902680581 * mouseX;
                Client.clickY = mouseY * 1887175681;
                Client.cursorState = 1976884746;
                Client.fieldGy = 0;
                Client.destinationX = arg1 * -950792229;
                Client.destinationY = -475172701 * arg2;
                Client.fieldCo.writePacketHeader(184, (byte) 0);
                Client.fieldCo.writeLittleEndianShort(arg0 >> 14 & 32767, 2009058839);
                Client.fieldCo.writeLittleEndianShort(Client.selectedSpellChildIndex * 891259469, 1982637267);
                Client.fieldCo.ak(classDc.baseX * -2071335905 + arg1, 1078918573);
                if (Keyboard.someWeirdSettings[82]) {
                    var10001 = 1;
                } else {
                    var10001 = 0;
                }

                Client.fieldCo.ai(var10001, 1984668915);
                Client.fieldCo.writeLittleEndianShort(arg2 + CalendarUtil.baseY * -1046564359, 1905702726);
                Client.fieldCo.bs(classG.selectedSpellParentUID * 763146509, -1315614368);
            }

            if (opcode == 33) {
                Client.fieldCo.writePacketHeader(32, (byte) 0);
                Client.fieldCo.writeShort(arg1);
                Client.fieldCo.af(arg0);
                Client.fieldCo.bi(arg2, (byte) -94);
                Client.fieldGw = 0;
                ClanMate.fieldGn = Widget.lookup(arg2);
                Client.fieldGr = -959053341 * arg1;
            }

            if (42 == opcode) {
                Client.fieldCo.writePacketHeader(61, (byte) 0);
                Client.fieldCo.bi(arg2, (byte) -106);
                Client.fieldCo.writeLittleEndianShort(arg0, 2123384502);
                Client.fieldCo.writeLittleEndianShort(arg1, 1933616460);
                Client.fieldGw = 0;
                ClanMate.fieldGn = Widget.lookup(arg2);
                Client.fieldGr = arg1 * -959053341;
            }

            Npc var9;
            if (opcode == 7) {
                var9 = Client.npcs[arg0];
                if (var9 != null) {
                    Client.clickX = mouseX * 902680581;
                    Client.clickY = 1887175681 * mouseY;
                    Client.cursorState = 1976884746;
                    Client.fieldGy = 0;
                    Client.destinationX = -950792229 * arg1;
                    Client.destinationY = -475172701 * arg2;
                    Client.fieldCo.writePacketHeader(225, (byte) 0);
                    Client.fieldCo.writeLittleEndianShort(UtilClass41.selectedItemIndex * 1003817045, 1859043163);
                    Client.fieldCo.writeInt(UtilClass6.selectedItemWidgetId * 1795747025);
                    Client.fieldCo.ak(arg0, 1078918573);
                    if (Keyboard.someWeirdSettings[82]) {
                        var10001 = 1;
                    } else {
                        var10001 = 0;
                    }

                    Client.fieldCo.ai(var10001, 241645089);
                    Client.fieldCo.ak(Character.fieldIz * 1341679985, 1078918573);
                }
            }

            if (11 == opcode) {
                var9 = Client.npcs[arg0];
                if (null != var9) {
                    Client.clickX = mouseX * 902680581;
                    Client.clickY = 1887175681 * mouseY;
                    Client.cursorState = 1976884746;
                    Client.fieldGy = 0;
                    Client.destinationX = -950792229 * arg1;
                    Client.destinationY = arg2 * -475172701;
                    Client.fieldCo.writePacketHeader(65, (byte) 0);
                    Client.fieldCo.writeLittleEndianShort(arg0, 1914986864);
                    Client.fieldCo.writeByte(Keyboard.someWeirdSettings[82] ? 1 : 0);
                }
            }

            if (opcode == 17) {
                Client.clickX = mouseX * 902680581;
                Client.clickY = 1887175681 * mouseY;
                Client.cursorState = 1976884746;
                Client.fieldGy = 0;
                Client.destinationX = -950792229 * arg1;
                Client.destinationY = arg2 * -475172701;
                Client.fieldCo.writePacketHeader(204, (byte) 0);
                Client.fieldCo.writeLittleEndianShort(arg0, 1852895451);
                Client.fieldCo.ak(Client.selectedSpellChildIndex * 891259469, 1078918573);
                Client.fieldCo.writeShort(classDc.baseX * -2071335905 + arg1);
                Client.fieldCo.writeInvertedByte(Keyboard.someWeirdSettings[82] ? 1 : 0, (byte) 1);
                Client.fieldCo.writeLittleEndianShort(arg2 + CalendarUtil.baseY * -1046564359, 1937409312);
                Client.fieldCo.bi(classG.selectedSpellParentUID * 763146509, (byte) -27);
            }

            if (opcode == 16) {
                Client.clickX = 902680581 * mouseX;
                Client.clickY = mouseY * 1887175681;
                Client.cursorState = 1976884746;
                Client.fieldGy = 0;
                Client.destinationX = arg1 * -950792229;
                Client.destinationY = -475172701 * arg2;
                Client.fieldCo.writePacketHeader(197, (byte) 0);
                if (Keyboard.someWeirdSettings[82]) {
                    var10001 = 1;
                } else {
                    var10001 = 0;
                }

                Client.fieldCo.writeByte(var10001);
                Client.fieldCo.bs(UtilClass6.selectedItemWidgetId * 1795747025, -1315614368);
                Client.fieldCo.writeShort(UtilClass41.selectedItemIndex * 1003817045);
                Client.fieldCo.writeShort(CalendarUtil.baseY * -1046564359 + arg2);
                Client.fieldCo.writeShort(classDc.baseX * -2071335905 + arg1);
                Client.fieldCo.ak(arg0, 1078918573);
                Client.fieldCo.af(Character.fieldIz * 1341679985);
            }

            if (opcode == 26) {
                World.method181();
            }

            if (opcode == 43) {
                Client.fieldCo.writePacketHeader(103, (byte) 0);
                Client.fieldCo.af(arg1);
                Client.fieldCo.writeInt(arg2);
                Client.fieldCo.writeLittleEndianShort(arg0, 2136493496);
                Client.fieldGw = 0;
                ClanMate.fieldGn = Widget.lookup(arg2);
                Client.fieldGr = -959053341 * arg1;
            }

            if (18 == opcode) {
                Client.clickX = mouseX * 902680581;
                Client.clickY = mouseY * 1887175681;
                Client.cursorState = 1976884746;
                Client.fieldGy = 0;
                Client.destinationX = arg1 * -950792229;
                Client.destinationY = -475172701 * arg2;
                Client.fieldCo.writePacketHeader(212, (byte) 0);
                if (Keyboard.someWeirdSettings[82]) {
                    var10001 = 1;
                } else {
                    var10001 = 0;
                }

                Client.fieldCo.writeInvertedByte(var10001, (byte) 53);
                Client.fieldCo.ak(arg1 + classDc.baseX * -2071335905, 1078918573);
                Client.fieldCo.af(CalendarUtil.baseY * -1046564359 + arg2);
                Client.fieldCo.af(arg0);
            }

            Player var17;
            if (opcode == 51) {
                var17 = Client.players[arg0];
                if (var17 != null) {
                    Client.clickX = mouseX * 902680581;
                    Client.clickY = mouseY * 1887175681;
                    Client.cursorState = 1976884746;
                    Client.fieldGy = 0;
                    Client.destinationX = arg1 * -950792229;
                    Client.destinationY = -475172701 * arg2;
                    Client.fieldCo.writePacketHeader(38, (byte) 0);
                    Client.fieldCo.ak(arg0, 1078918573);
                    Client.fieldCo.writeInvertedByte(Keyboard.someWeirdSettings[82] ? 1 : 0, (byte) 46);
                }
            }

            if (30 == opcode && null == Client.fieldJy) {
                UtilClass38.method127(arg2, arg1, (byte) -22);
                Client.fieldJy = Message.getWidget(arg2, arg1, (byte) 52);
                classBx.method250(Client.fieldJy, 57574739);
            }

            int var10;
            Widget var18;
            if (opcode == 28) {
                Client.fieldCo.writePacketHeader(116, (byte) 0);
                Client.fieldCo.writeInt(arg2);
                var18 = Widget.lookup(arg2);
                if (var18.fieldDo != null && 5 == var18.fieldDo[0][0]) {
                    var10 = var18.fieldDo[0][1];
                    UtilClass27.vars[var10] = 1 - UtilClass27.vars[var10];
                    IgnoredPlayer.method94(var10, (short) 22870);
                }
            }

            if (40 == opcode) {
                Client.fieldCo.writePacketHeader(27, (byte) 0);
                Client.fieldCo.af(arg1);
                Client.fieldCo.bo(arg2, 1470065590);
                Client.fieldCo.af(arg0);
                Client.fieldGw = 0;
                ClanMate.fieldGn = Widget.lookup(arg2);
                Client.fieldGr = -959053341 * arg1;
            }

            if (opcode == 22) {
                Client.clickX = mouseX * 902680581;
                Client.clickY = mouseY * 1887175681;
                Client.cursorState = 1976884746;
                Client.fieldGy = 0;
                Client.destinationX = arg1 * -950792229;
                Client.destinationY = arg2 * -475172701;
                Client.fieldCo.writePacketHeader(240, (byte) 0);
                Client.fieldCo.af(CalendarUtil.baseY * -1046564359 + arg2);
                Client.fieldCo.ak(arg1 + classDc.baseX * -2071335905, 1078918573);
                Client.fieldCo.ak(arg0, 1078918573);
                if (Keyboard.someWeirdSettings[82]) {
                    var10001 = 1;
                } else {
                    var10001 = 0;
                }

                Client.fieldCo.ai(var10001, -1122976603);
            }

            if (19 == opcode) {
                Client.clickX = 902680581 * mouseX;
                Client.clickY = 1887175681 * mouseY;
                Client.cursorState = 1976884746;
                Client.fieldGy = 0;
                Client.destinationX = arg1 * -950792229;
                Client.destinationY = -475172701 * arg2;
                Client.fieldCo.writePacketHeader(120, (byte) 0);
                Client.fieldCo.af(classDc.baseX * -2071335905 + arg1);
                Client.fieldCo.af(CalendarUtil.baseY * -1046564359 + arg2);
                Client.fieldCo.ai(Keyboard.someWeirdSettings[82] ? 1 : 0, 1698069335);
                Client.fieldCo.af(arg0);
            }

            if (36 == opcode) {
                Client.fieldCo.writePacketHeader(148, (byte) 0);
                Client.fieldCo.bs(arg2, -1315614368);
                Client.fieldCo.ak(arg0, 1078918573);
                Client.fieldCo.af(arg1);
                Client.fieldGw = 0;
                ClanMate.fieldGn = Widget.lookup(arg2);
                Client.fieldGr = -959053341 * arg1;
            }

            if (opcode == 1004) {
                Client.clickX = 902680581 * mouseX;
                Client.clickY = mouseY * 1887175681;
                Client.cursorState = 1976884746;
                Client.fieldGy = 0;
                Client.fieldCo.writePacketHeader(129, (byte) 0);
                Client.fieldCo.af(arg0);
            }

            if (opcode == 10) {
                var9 = Client.npcs[arg0];
                if (var9 != null) {
                    Client.clickX = mouseX * 902680581;
                    Client.clickY = 1887175681 * mouseY;
                    Client.cursorState = 1976884746;
                    Client.fieldGy = 0;
                    Client.destinationX = -950792229 * arg1;
                    Client.destinationY = -475172701 * arg2;
                    Client.fieldCo.writePacketHeader(19, (byte) 0);
                    Client.fieldCo.writeLittleEndianShort(arg0, 2139692526);
                    if (Keyboard.someWeirdSettings[82]) {
                        var10001 = 1;
                    } else {
                        var10001 = 0;
                    }

                    Client.fieldCo.writeByte(var10001);
                }
            }

            if (opcode == 41) {
                Client.fieldCo.writePacketHeader(81, (byte) 0);
                Client.fieldCo.writeInt(arg2);
                Client.fieldCo.af(arg1);
                Client.fieldCo.writeLittleEndianShort(arg0, 1983462444);
                Client.fieldGw = 0;
                ClanMate.fieldGn = Widget.lookup(arg2);
                Client.fieldGr = -959053341 * arg1;
            }

            if (opcode == 38) {
                    classBt.method257((byte) 11);
                    var18 = Widget.lookup(arg2);
                    Client.itemSelectionStatus = 1688638729;
                    UtilClass41.selectedItemIndex = arg1 * 1496298749;
                    UtilClass6.selectedItemWidgetId = arg2 * 1876618289;
                    Character.fieldIz = -176867439 * arg0;
                    classBx.method250(var18, 57574739);
                    Client.fieldIt = Buffer.getColorTags(16748608, 2096021721) + Client.getItemDefinition(arg0, -423577726).fieldX + Buffer.getColorTags(16777215, -1431208449);
                    if (null == Client.fieldIt) {
                        Client.fieldIt = "null";
                    }
            } else {
                if (45 == opcode) {
                    var17 = Client.players[arg0];
                    if (null != var17) {
                        Client.clickX = 902680581 * mouseX;
                        Client.clickY = 1887175681 * mouseY;
                        Client.cursorState = 1976884746;
                        Client.fieldGy = 0;
                        Client.destinationX = arg1 * -950792229;
                        Client.destinationY = arg2 * -475172701;
                        Client.fieldCo.writePacketHeader(198, (byte) 0);
                        if (Keyboard.someWeirdSettings[82]) {
                            var10001 = 1;
                        } else {
                            var10001 = 0;
                        }

                        Client.fieldCo.ai(var10001, 1217591831);
                        Client.fieldCo.writeShort(arg0);
                    }
                }

                if (opcode == 1001) {
                    Client.clickX = mouseX * 902680581;
                    Client.clickY = 1887175681 * mouseY;
                    Client.cursorState = 1976884746;
                    Client.fieldGy = 0;
                    Client.destinationX = -950792229 * arg1;
                    Client.destinationY = -475172701 * arg2;
                    Client.fieldCo.writePacketHeader(48, (byte) 0);
                    if (Keyboard.someWeirdSettings[82]) {
                        var10001 = 1;
                    } else {
                        var10001 = 0;
                    }

                    Client.fieldCo.writeInvertedByte(var10001, (byte) -9);
                    Client.fieldCo.af(CalendarUtil.baseY * -1046564359 + arg2);
                    Client.fieldCo.writeShort(classDc.baseX * -2071335905 + arg1);
                    Client.fieldCo.writeShort(arg0 >> 14 & 32767);
                }

                if (opcode == 34) {
                    Client.fieldCo.writePacketHeader(115, (byte) 0);
                    Client.fieldCo.ak(arg1, 1078918573);
                    Client.fieldCo.af(arg0);
                    Client.fieldCo.writeInt(arg2);
                    Client.fieldGw = 0;
                    ClanMate.fieldGn = Widget.lookup(arg2);
                    Client.fieldGr = arg1 * -959053341;
                }

                if (opcode == 39) {
                    Client.fieldCo.writePacketHeader(123, (byte) 0);
                    Client.fieldCo.bo(arg2, 1449179961);
                    Client.fieldCo.af(arg1);
                    Client.fieldCo.writeShort(arg0);
                    Client.fieldGw = 0;
                    ClanMate.fieldGn = Widget.lookup(arg2);
                    Client.fieldGr = arg1 * -959053341;
                }

                if (opcode == 29) {
                    Client.fieldCo.writePacketHeader(116, (byte) 0);
                    Client.fieldCo.writeInt(arg2);
                    var18 = Widget.lookup(arg2);
                    if (var18.fieldDo != null && 5 == var18.fieldDo[0][0]) {
                        var10 = var18.fieldDo[0][1];
                        if (var18.fieldDh[0] != UtilClass27.vars[var10]) {
                            UtilClass27.vars[var10] = var18.fieldDh[0];
                            IgnoredPlayer.method94(var10, (short) 15846);
                        }
                    }
                }

                if (opcode == 1003) {
                    Client.clickX = 902680581 * mouseX;
                    Client.clickY = 1887175681 * mouseY;
                    Client.cursorState = 1976884746;
                    Client.fieldGy = 0;
                    var9 = Client.npcs[arg0];
                    if (var9 != null) {
                        NpcDefinition var19 = var9.definition;
                        if (null != var19.transformIds) {
                            var19 = var19.transform(623536953);
                        }

                        if (var19 != null) {
                            Client.fieldCo.writePacketHeader(192, (byte) 0);
                            Client.fieldCo.af(var19.id * 753371259);
                        }
                    }
                }

                if (opcode == 3) {
                    Client.clickX = 902680581 * mouseX;
                    Client.clickY = mouseY * 1887175681;
                    Client.cursorState = 1976884746;
                    Client.fieldGy = 0;
                    Client.destinationX = arg1 * -950792229;
                    Client.destinationY = arg2 * -475172701;
                    Client.fieldCo.writePacketHeader(221, (byte) 0);
                    Client.fieldCo.af(classDc.baseX * -2071335905 + arg1);
                    Client.fieldCo.af(arg0 >> 14 & 32767);
                    Client.fieldCo.writeShort(CalendarUtil.baseY * -1046564359 + arg2);
                    Client.fieldCo.aa(Keyboard.someWeirdSettings[82] ? 1 : 0, (byte) 79);
                }

                if (6 == opcode) {
                    Client.clickX = mouseX * 902680581;
                    Client.clickY = mouseY * 1887175681;
                    Client.cursorState = 1976884746;
                    Client.fieldGy = 0;
                    Client.destinationX = -950792229 * arg1;
                    Client.destinationY = arg2 * -475172701;
                    Client.fieldCo.writePacketHeader(94, (byte) 0);
                    Client.fieldCo.af(arg2 + CalendarUtil.baseY * -1046564359);
                    if (Keyboard.someWeirdSettings[82]) {
                        var10001 = 1;
                    } else {
                        var10001 = 0;
                    }

                    Client.fieldCo.aa(var10001, (byte) 61);
                    Client.fieldCo.writeLittleEndianShort(arg1 + classDc.baseX * -2071335905, 2024542319);
                    Client.fieldCo.writeLittleEndianShort(arg0 >> 14 & 32767, 2144518501);
                }

                if (58 == opcode) {
                    var18 = Message.getWidget(arg2, arg1, (byte) 56);
                    if (null != var18) {
                        Client.fieldCo.writePacketHeader(124, (byte) 0);
                        Client.fieldCo.ak(arg1, 1078918573);
                        Client.fieldCo.af(var18.itemId * -5424365);
                        Client.fieldCo.writeLittleEndianShort(Client.selectedSpellChildIndex * 891259469, 2143299269);
                        Client.fieldCo.af(Client.fieldJe * -2095193345);
                        Client.fieldCo.writeInt(arg2);
                        Client.fieldCo.bi(classG.selectedSpellParentUID * 763146509, (byte) -76);
                    }
                }

                if (23 == opcode) {
                    Client.landscape.ai(Client.floorLevel * 87713183, arg1, arg2);
                }

                if (21 == opcode) {
                    Client.clickX = mouseX * 902680581;
                    Client.clickY = 1887175681 * mouseY;
                    Client.cursorState = 1976884746;
                    Client.fieldGy = 0;
                    Client.destinationX = arg1 * -950792229;
                    Client.destinationY = arg2 * -475172701;
                    Client.fieldCo.writePacketHeader(112, (byte) 0);
                    Client.fieldCo.writeShort(CalendarUtil.baseY * -1046564359 + arg2);
                    Client.fieldCo.writeLittleEndianShort(arg0, 2106978805);
                    Client.fieldCo.ak(arg1 + classDc.baseX * -2071335905, 1078918573);
                    if (Keyboard.someWeirdSettings[82]) {
                        var10001 = 1;
                    } else {
                        var10001 = 0;
                    }

                    Client.fieldCo.writeInvertedByte(var10001, (byte) -2);
                }

                if (12 == opcode) {
                    var9 = Client.npcs[arg0];
                    if (null != var9) {
                        Client.clickX = mouseX * 902680581;
                        Client.clickY = mouseY * 1887175681;
                        Client.cursorState = 1976884746;
                        Client.fieldGy = 0;
                        Client.destinationX = -950792229 * arg1;
                        Client.destinationY = arg2 * -475172701;
                        Client.fieldCo.writePacketHeader(68, (byte) 0);
                        if (Keyboard.someWeirdSettings[82]) {
                            var10001 = 1;
                        } else {
                            var10001 = 0;
                        }

                        Client.fieldCo.writeInvertedByte(var10001, (byte) -89);
                        Client.fieldCo.af(arg0);
                    }
                }

                if (opcode == 14) {
                    var17 = Client.players[arg0];
                    if (null != var17) {
                        Client.clickX = mouseX * 902680581;
                        Client.clickY = 1887175681 * mouseY;
                        Client.cursorState = 1976884746;
                        Client.fieldGy = 0;
                        Client.destinationX = arg1 * -950792229;
                        Client.destinationY = arg2 * -475172701;
                        Client.fieldCo.writePacketHeader(165, (byte) 0);
                        Client.fieldCo.writeLittleEndianShort(Character.fieldIz * 1341679985, 2058143151);
                        if (Keyboard.someWeirdSettings[82]) {
                            var10001 = 1;
                        } else {
                            var10001 = 0;
                        }

                        Client.fieldCo.writeInvertedByte(var10001, (byte) 93);
                        Client.fieldCo.bo(UtilClass6.selectedItemWidgetId * 1795747025, 1161619609);
                        Client.fieldCo.af(UtilClass41.selectedItemIndex * 1003817045);
                        Client.fieldCo.ak(arg0, 1078918573);
                    }
                }

                if (opcode == 4) {
                    Client.clickX = 902680581 * mouseX;
                    Client.clickY = 1887175681 * mouseY;
                    Client.cursorState = 1976884746;
                    Client.fieldGy = 0;
                    Client.destinationX = arg1 * -950792229;
                    Client.destinationY = arg2 * -475172701;
                    Client.fieldCo.writePacketHeader(31, (byte) 0);
                    Client.fieldCo.writeLittleEndianShort(classDc.baseX * -2071335905 + arg1, 1939867138);
                    Client.fieldCo.writeShort(arg0 >> 14 & 32767);
                    Client.fieldCo.af(arg2 + CalendarUtil.baseY * -1046564359);
                    Client.fieldCo.writeInvertedByte(Keyboard.someWeirdSettings[82] ? 1 : 0, (byte) -10);
                }

                if (1002 == opcode) {
                    Client.clickX = mouseX * 902680581;
                    Client.clickY = 1887175681 * mouseY;
                    Client.cursorState = 1976884746;
                    Client.fieldGy = 0;
                    Client.fieldCo.writePacketHeader(133, (byte) 0);
                    Client.fieldCo.af(arg0 >> 14 & 32767);
                }

                if (50 == opcode) {
                    var17 = Client.players[arg0];
                    if (null != var17) {
                        Client.clickX = 902680581 * mouseX;
                        Client.clickY = mouseY * 1887175681;
                        Client.cursorState = 1976884746;
                        Client.fieldGy = 0;
                        Client.destinationX = arg1 * -950792229;
                        Client.destinationY = -475172701 * arg2;
                        Client.fieldCo.writePacketHeader(69, (byte) 0);
                        Client.fieldCo.ak(arg0, 1078918573);
                        Client.fieldCo.ai(Keyboard.someWeirdSettings[82] ? 1 : 0, 266102471);
                    }
                }

                if (opcode == 20) {
                    Client.clickX = mouseX * 902680581;
                    Client.clickY = mouseY * 1887175681;
                    Client.cursorState = 1976884746;
                    Client.fieldGy = 0;
                    Client.destinationX = -950792229 * arg1;
                    Client.destinationY = arg2 * -475172701;
                    Client.fieldCo.writePacketHeader(231, (byte) 0);
                    if (Keyboard.someWeirdSettings[82]) {
                        var10001 = 1;
                    } else {
                        var10001 = 0;
                    }

                    Client.fieldCo.ai(var10001, -371433056);
                    Client.fieldCo.ak(CalendarUtil.baseY * -1046564359 + arg2, 1078918573);
                    Client.fieldCo.writeShort(arg0);
                    Client.fieldCo.writeLittleEndianShort(arg1 + classDc.baseX * -2071335905, 2098599202);
                }

                if (5 == opcode) {
                    Client.clickX = mouseX * 902680581;
                    Client.clickY = 1887175681 * mouseY;
                    Client.cursorState = 1976884746;
                    Client.fieldGy = 0;
                    Client.destinationX = -950792229 * arg1;
                    Client.destinationY = arg2 * -475172701;
                    Client.fieldCo.writePacketHeader(93, (byte) 0);
                    Client.fieldCo.writeLittleEndianShort(classDc.baseX * -2071335905 + arg1, 1925566267);
                    Client.fieldCo.writeLittleEndianShort(CalendarUtil.baseY * -1046564359 + arg2, 2095155303);
                    Client.fieldCo.ak(arg0 >> 14 & 32767, 1078918573);
                    if (Keyboard.someWeirdSettings[82]) {
                        var10001 = 1;
                    } else {
                        var10001 = 0;
                    }

                    Client.fieldCo.writeByte(var10001);
                }

                if (32 == opcode) {
                    Client.fieldCo.writePacketHeader(153, (byte) 0);
                    Client.fieldCo.writeInt(arg2);
                    Client.fieldCo.ak(Client.selectedSpellChildIndex * 891259469, 1078918573);
                    Client.fieldCo.ak(arg0, 1078918573);
                    Client.fieldCo.writeInt(classG.selectedSpellParentUID * 763146509);
                    Client.fieldCo.writeShort(arg1);
                    Client.fieldGw = 0;
                    ClanMate.fieldGn = Widget.lookup(arg2);
                    Client.fieldGr = arg1 * -959053341;
                }

                if (opcode == 49) {
                    var17 = Client.players[arg0];
                    if (var17 != null) {
                        Client.clickX = 902680581 * mouseX;
                        Client.clickY = mouseY * 1887175681;
                        Client.cursorState = 1976884746;
                        Client.fieldGy = 0;
                        Client.destinationX = arg1 * -950792229;
                        Client.destinationY = -475172701 * arg2;
                        Client.fieldCo.writePacketHeader(118, (byte) 0);
                        Client.fieldCo.ak(arg0, 1078918573);
                        if (Keyboard.someWeirdSettings[82]) {
                            var10001 = 1;
                        } else {
                            var10001 = 0;
                        }

                        Client.fieldCo.aa(var10001, (byte) 53);
                    }
                }

                if (opcode == 13) {
                    var9 = Client.npcs[arg0];
                    if (var9 != null) {
                        Client.clickX = mouseX * 902680581;
                        Client.clickY = 1887175681 * mouseY;
                        Client.cursorState = 1976884746;
                        Client.fieldGy = 0;
                        Client.destinationX = -950792229 * arg1;
                        Client.destinationY = arg2 * -475172701;
                        Client.fieldCo.writePacketHeader(181, (byte) 0);
                        Client.fieldCo.af(arg0);
                        Client.fieldCo.ai(Keyboard.someWeirdSettings[82] ? 1 : 0, 1746923780);
                    }
                }

                if (1005 == opcode) {    //Examine Item
                    var18 = Widget.lookup(arg2);
                    if (null != var18 && var18.itemQuantities[arg1] >= 100000) {
                        JagSocket.addMessage(27, "", var18.itemQuantities[arg1] + " x " + Client.getItemDefinition(arg0, 21594233).fieldX, (byte) 16);
                    } else {
                        Client.fieldCo.writePacketHeader(129, (byte) 0);
                        Client.fieldCo.af(arg0);
                    }

                    Client.fieldGw = 0;
                    ClanMate.fieldGn = Widget.lookup(arg2);
                    Client.fieldGr = arg1 * -959053341;
                }

                label1276:
                {
                    if (opcode != 57 && 1007 != opcode) {
                        break label1276;
                    }

                    var18 = Message.getWidget(arg2, arg1, (byte) 112);
                    if (null != var18) {
                        var10 = var18.itemId * -5424365;
                        Widget var11 = Message.getWidget(arg2, arg1, (byte) 5);
                        if (var11 != null) {
                            if (null != var11.fieldCz) {
                                ScriptEvent var12 = new ScriptEvent();
                                var12.src = var11;
                                var12.fieldM = arg0 * -683483105;
                                var12.fieldS = target;
                                var12.args = var11.fieldCz;
                                classT.method167(var12, (byte) 1);
                            }

                            boolean var21 = true;
                            if (var11.contentType * 481950881 > 0) {
                                var21 = IgnoredPlayer.method95(var11, 892481275);
                            }

                            if (var21) {
                                int var14 = UtilClass38.getWidgetConfig(var11, 2070855251);
                                int var15 = arg0 - 1;
                                boolean var13 = 0 != (var14 >> 1 + var15 & 1);
                                if (var13) {
                                    if (1 == arg0) {
                                        Client.fieldCo.writePacketHeader(237, (byte) 0);
                                        Client.fieldCo.writeInt(arg2);
                                        Client.fieldCo.writeShort(arg1);
                                        Client.fieldCo.writeShort(var10);
                                    }

                                    if (arg0 == 2) {
                                        Client.fieldCo.writePacketHeader(223, (byte) 0);
                                        Client.fieldCo.writeInt(arg2);
                                        Client.fieldCo.writeShort(arg1);
                                        Client.fieldCo.writeShort(var10);
                                    }

                                    if (3 == arg0) {
                                        Client.fieldCo.writePacketHeader(219, (byte) 0);
                                        Client.fieldCo.writeInt(arg2);
                                        Client.fieldCo.writeShort(arg1);
                                        Client.fieldCo.writeShort(var10);
                                    }

                                    if (arg0 == 4) {
                                        Client.fieldCo.writePacketHeader(188, (byte) 0);
                                        Client.fieldCo.writeInt(arg2);
                                        Client.fieldCo.writeShort(arg1);
                                        Client.fieldCo.writeShort(var10);
                                    }

                                    if (arg0 == 5) {
                                        Client.fieldCo.writePacketHeader(28, (byte) 0);
                                        Client.fieldCo.writeInt(arg2);
                                        Client.fieldCo.writeShort(arg1);
                                        Client.fieldCo.writeShort(var10);
                                    }

                                    if (arg0 == 6) {
                                        Client.fieldCo.writePacketHeader(220, (byte) 0);
                                        Client.fieldCo.writeInt(arg2);
                                        Client.fieldCo.writeShort(arg1);
                                        Client.fieldCo.writeShort(var10);
                                    }

                                    if (arg0 == 7) {
                                        Client.fieldCo.writePacketHeader(110, (byte) 0);
                                        Client.fieldCo.writeInt(arg2);
                                        Client.fieldCo.writeShort(arg1);
                                        Client.fieldCo.writeShort(var10);
                                    }

                                    if (8 == arg0) {
                                        Client.fieldCo.writePacketHeader(60, (byte) 0);
                                        Client.fieldCo.writeInt(arg2);
                                        Client.fieldCo.writeShort(arg1);
                                        Client.fieldCo.writeShort(var10);
                                    }

                                    if (9 == arg0) {
                                        Client.fieldCo.writePacketHeader(146, (byte) 0);
                                        Client.fieldCo.writeInt(arg2);
                                        Client.fieldCo.writeShort(arg1);
                                        Client.fieldCo.writeShort(var10);
                                    }

                                    if (arg0 == 10) {
                                        Client.fieldCo.writePacketHeader(157, (byte) 0);
                                        Client.fieldCo.writeInt(arg2);
                                        Client.fieldCo.writeShort(arg1);
                                        Client.fieldCo.writeShort(var10);
                                    }
                                }
                            }
                        }
                    }
                }

                if (9 == opcode) {
                    var9 = Client.npcs[arg0];
                    if (null != var9) {
                        Client.clickX = 902680581 * mouseX;
                        Client.clickY = mouseY * 1887175681;
                        Client.cursorState = 1976884746;
                        Client.fieldGy = 0;
                        Client.destinationX = -950792229 * arg1;
                        Client.destinationY = -475172701 * arg2;
                        Client.fieldCo.writePacketHeader(91, (byte) 0);
                        Client.fieldCo.af(arg0);
                        if (Keyboard.someWeirdSettings[82]) {
                            var10001 = 1;
                        } else {
                            var10001 = 0;
                        }

                        Client.fieldCo.writeByte(var10001);
                    }
                }

                if (opcode == 24) {
                    var18 = Widget.lookup(arg2);
                    boolean var20 = true;
                    if (var18.contentType * 481950881 > 0) {
                        var20 = IgnoredPlayer.method95(var18, 711560915);
                    }

                    if (var20) {
                        Client.fieldCo.writePacketHeader(116, (byte) 0);
                        Client.fieldCo.writeInt(arg2);
                    }
                }

                if (37 == opcode) {
                    Client.fieldCo.writePacketHeader(97, (byte) 0);
                    Client.fieldCo.writeShort(arg0);
                    Client.fieldCo.bs(arg2, -1315614368);
                    Client.fieldCo.ak(arg1, 1078918573);
                    Client.fieldGw = 0;
                    ClanMate.fieldGn = Widget.lookup(arg2);
                    Client.fieldGr = -959053341 * arg1;
                }

                if (opcode == 8) {
                    var9 = Client.npcs[arg0];
                    if (var9 != null) {
                        Client.clickX = 902680581 * mouseX;
                        Client.clickY = mouseY * 1887175681;
                        Client.cursorState = 1976884746;
                        Client.fieldGy = 0;
                        Client.destinationX = -950792229 * arg1;
                        Client.destinationY = -475172701 * arg2;
                        Client.fieldCo.writePacketHeader(207, (byte) 0);
                        Client.fieldCo.ak(arg0, 1078918573);
                        Client.fieldCo.writeLittleEndianShort(Client.selectedSpellChildIndex * 891259469, 2016496092);
                        Client.fieldCo.bs(classG.selectedSpellParentUID * 763146509, -1315614368);
                        if (Keyboard.someWeirdSettings[82]) {
                            var10001 = 1;
                        } else {
                            var10001 = 0;
                        }

                        Client.fieldCo.ai(var10001, -196960332);
                    }
                }

                if (35 == opcode) {
                    Client.fieldCo.writePacketHeader(55, (byte) 0);
                    Client.fieldCo.writeLittleEndianShort(arg0, 2051810788);
                    Client.fieldCo.writeLittleEndianShort(arg1, 2103679893);
                    Client.fieldCo.writeInt(arg2);
                    Client.fieldGw = 0;
                    ClanMate.fieldGn = Widget.lookup(arg2);
                    Client.fieldGr = -959053341 * arg1;
                }

                if (44 == opcode) {
                    var17 = Client.players[arg0];
                    if (var17 != null) {
                        Client.clickX = 902680581 * mouseX;
                        Client.clickY = 1887175681 * mouseY;
                        Client.cursorState = 1976884746;
                        Client.fieldGy = 0;
                        Client.destinationX = -950792229 * arg1;
                        Client.destinationY = -475172701 * arg2;
                        Client.fieldCo.writePacketHeader(85, (byte) 0);
                        if (Keyboard.someWeirdSettings[82]) {
                            var10001 = 1;
                        } else {
                            var10001 = 0;
                        }

                        Client.fieldCo.aa(var10001, (byte) 93);
                        Client.fieldCo.af(arg0);
                    }
                }

                if (opcode == 47) {
                    var17 = Client.players[arg0];
                    if (var17 != null) {
                        Client.clickX = mouseX * 902680581;
                        Client.clickY = mouseY * 1887175681;
                        Client.cursorState = 1976884746;
                        Client.fieldGy = 0;
                        Client.destinationX = -950792229 * arg1;
                        Client.destinationY = -475172701 * arg2;
                        Client.fieldCo.writePacketHeader(189, (byte) 0);
                        if (Keyboard.someWeirdSettings[82]) {
                            var10001 = 1;
                        } else {
                            var10001 = 0;
                        }

                        Client.fieldCo.writeByte(var10001);
                        Client.fieldCo.writeShort(arg0);
                    }
                }

                if (25 == opcode) {
                    var18 = Message.getWidget(arg2, arg1, (byte) 39);
                    if (var18 != null) {
                        classBt.method257((byte) -120);
                        int var22 = UtilClass38.getWidgetConfig(var18, 2070855251);
                        int var23 = var22 >> 11 & 63;
                        UtilClass43.method187(arg2, arg1, var23, var18.itemId * -5424365, 353302508);
                        Client.itemSelectionStatus = 0;
                        Client.spellAction = classCs.getWidgetTitle(var18, 469151008);
                        if (Client.spellAction == null) {
                            Client.spellAction = "Null";
                        }
                        if (var18.fieldK) {
                            Client.fieldJc = var18.fieldBa + Buffer.getColorTags(16777215, -2047431907);
                        } else {
                            Client.fieldJc = Buffer.getColorTags('\uff00', 1373289210) + var18.fieldDw + Buffer.getColorTags(16777215, -1062178491);
                        }
                    }
                } else {
                    if (opcode == 48) {
                        var17 = Client.players[arg0];
                        if (null != var17) {
                            Client.clickX = 902680581 * mouseX;
                            Client.clickY = mouseY * 1887175681;
                            Client.cursorState = 1976884746;
                            Client.fieldGy = 0;
                            Client.destinationX = -950792229 * arg1;
                            Client.destinationY = -475172701 * arg2;
                            Client.fieldCo.writePacketHeader(132, (byte) 0);
                            Client.fieldCo.writeLittleEndianShort(arg0, 2088536985);
                            if (Keyboard.someWeirdSettings[82]) {
                                var10001 = 1;
                            } else {
                                var10001 = 0;
                            }
                            Client.fieldCo.writeInvertedByte(var10001, (byte) -74);
                        }
                    }

                    if (opcode == 1) {
                        Client.clickX = mouseX * 902680581;
                        Client.clickY = mouseY * 1887175681;
                        Client.cursorState = 1976884746;
                        Client.fieldGy = 0;
                        Client.destinationX = arg1 * -950792229;
                        Client.destinationY = arg2 * -475172701;
                        Client.fieldCo.writePacketHeader(244, (byte) 0);
                        Client.fieldCo.ak(arg0 >> 14 & 32767, 1078918573);
                        Client.fieldCo.writeLittleEndianShort(arg2 + CalendarUtil.baseY * -1046564359, 2111607392);
                        if (Keyboard.someWeirdSettings[82]) {
                            var10001 = 1;
                        } else {
                            var10001 = 0;
                        }

                        Client.fieldCo.aa(var10001, (byte) 97);
                        Client.fieldCo.ak(UtilClass41.selectedItemIndex * 1003817045, 1078918573);
                        Client.fieldCo.writeInt(UtilClass6.selectedItemWidgetId * 1795747025);
                        Client.fieldCo.af(Character.fieldIz * 1341679985);
                        Client.fieldCo.ak(arg1 + classDc.baseX * -2071335905, 1078918573);
                    }

                    if (15 == opcode) {
                        var17 = Client.players[arg0];
                        if (var17 != null) {
                            Client.clickX = mouseX * 902680581;
                            Client.clickY = mouseY * 1887175681;
                            Client.cursorState = 1976884746;
                            Client.fieldGy = 0;
                            Client.destinationX = arg1 * -950792229;
                            Client.destinationY = arg2 * -475172701;
                            Client.fieldCo.writePacketHeader(71, (byte) 0);
                            Client.fieldCo.writeInt(classG.selectedSpellParentUID * 763146509);
                            Client.fieldCo.af(arg0);
                            if (Keyboard.someWeirdSettings[82]) {
                                var10001 = 1;
                            } else {
                                var10001 = 0;
                            }

                            Client.fieldCo.writeByte(var10001);
                            Client.fieldCo.writeShort(Client.selectedSpellChildIndex * 891259469);
                        }
                    }

                    if (opcode == 46) {
                        var17 = Client.players[arg0];
                        if (null != var17) {
                            Client.clickX = 902680581 * mouseX;
                            Client.clickY = mouseY * 1887175681;
                            Client.cursorState = 1976884746;
                            Client.fieldGy = 0;
                            Client.destinationX = arg1 * -950792229;
                            Client.destinationY = arg2 * -475172701;
                            Client.fieldCo.writePacketHeader(82, (byte) 0);
                            if (Keyboard.someWeirdSettings[82]) {
                                var10001 = 1;
                            } else {
                                var10001 = 0;
                            }

                            Client.fieldCo.ai(var10001, 460959200);
                            Client.fieldCo.ak(arg0, 1078918573);
                        }
                    }

                    if (Client.itemSelectionStatus * 279939385 != 0) {
                        Client.itemSelectionStatus = 0;
                        classBx.method250(Widget.lookup(UtilClass6.selectedItemWidgetId * 1795747025), 57574739);
                    }

                    if (Client.isSpellSelected) {
                        classBt.method257((byte) -112);
                    }

                    if (null != ClanMate.fieldGn && Client.fieldGw * 597120765 == 0) {
                        classBx.method250(ClanMate.fieldGn, 57574739);
                    }

                }
            }
        } catch (RuntimeException var16) {
            throw ClanMate.error(var16, "b.bq(" + ')');
        }
    }

    static final void method97(int regionX, int regionY) {
        try {
            NodeDeque<GroundItem> deque = Client.groundItemDeques[Client.floorLevel * 87713183][regionX][regionY];
            if (null == deque) {
                Client.landscape.removeItemPile(Client.floorLevel * 87713183, regionX, regionY);
            } else {
                long bestValue = -99999999L;
                GroundItem mostValuableItem = null;
                GroundItem item;
                for (item = deque.next(); item != null; item = deque.tail()) {
                    ItemDefinition var8 = Client.getItemDefinition(item.itemId * 2057899465, -126148443);
                    long value = (long) (var8.storeValue * 610558549);
                    if (var8.stackable * 1977514217 == 1) {
                        value *= (long) (1 + item.quantity * 1902127977);
                    }
                    if (value > bestValue) {
                        bestValue = value;
                        mostValuableItem = item;
                    }
                }
                if (mostValuableItem == null) {
                    Client.landscape.removeItemPile(Client.floorLevel * 87713183, regionX, regionY);
                } else {
                    deque.insert(mostValuableItem);
                    GroundItem midValuableItem = null;
                    GroundItem leastValuableItem = null;
                    for (item = deque.next(); null != item; item = deque.tail()) {
                        if (item.itemId * 2057899465 != mostValuableItem.itemId * 2057899465) {
                            if (null == midValuableItem) {
                                midValuableItem = item;
                            }
                            if (midValuableItem.itemId * 2057899465 != item.itemId * 2057899465 && leastValuableItem == null) {
                                leastValuableItem = item;
                            }
                        }
                    }
                    int uid = regionX + (regionY << 7) + 1610612736;
                    Client.landscape.setItemPile(Client.floorLevel * 87713183, regionX, regionY,
                            Landscape.getTileHeight(regionX * 128 + 64, regionY * 128 + 64, Client.floorLevel * 87713183),
                            mostValuableItem, uid, midValuableItem, leastValuableItem);
                }
            }
        } catch (RuntimeException var11) {
            throw ClanMate.error(var11, "b.bs(" + ')');
        }
    }

    static final void method189(WidgetNode node, boolean var1) {
        try {
            int id = node.owner * -1220935357;
            int key = (int) node.key;
            node.delete();
            int var6;
            if (var1) {
                if (-1 != id && Widget.fieldV[id]) {
                    Widget.widgetRefTable.o(id, 1724651399);
                    if (null != Widget.widgets[id]) {
                        boolean var5 = true;
                        for (var6 = 0; var6 < Widget.widgets[id].length; ++var6) {
                            if (Widget.widgets[id][var6] != null) {
                                if (2 != -729517859 * Widget.widgets[id][var6].type) {
                                    Widget.widgets[id][var6] = null;
                                } else {
                                    var5 = false;
                                }
                            }
                        }
                        if (var5) {
                            Widget.widgets[id] = null;
                        }
                        Widget.fieldV[id] = false;
                    }
                }
            }

            for (IntegerNode cfg = (IntegerNode) Client.widgetNodeConfigs.first(); null != cfg; cfg = (IntegerNode) Client.widgetNodeConfigs.next()) {
                if ((cfg.key >> 48 & 65535L) == (long) id) {
                    cfg.delete();
                }
            }

            Widget widget = Widget.lookup(key);
            if (null != widget) {
                classBx.method250(widget, 57574739);
            }

            WidgetStrings.method408((byte) -121);
            if (Client.fieldJh * -98490421 != -1) {
                var6 = Client.fieldJh * -98490421;
                if (Widget.loadWidget(var6, 477596194)) {
                    InputHandler.method88(Widget.widgets[var6], 1, 320386219);
                }
            }

        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "em.dp(" + ')');
        }
    }
}
