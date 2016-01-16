package com.jagex;

public final class Boundary {

    public int uid = 0;
    public Renderable fieldM;
    public Renderable fieldW;
    int cfg = 0;
    int fieldV;
    int fieldB;
    int fieldL;
    int fieldI;
    int fieldA;


    static final void handleEvents(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, byte var8) {
        try {
            for (int var9 = 0; var9 < var0.length; ++var9) {
                if (var8 == 2) {
                    throw new IllegalStateException();
                }

                Widget var10 = var0[var9];
                if (var10 != null) {
                    if (var10.fieldK && 0 != var10.type * -729517859 && !var10.fieldCt) {
                        if (UtilClass38.getWidgetConfig(var10, 2070855251) == 0 && var10 != Client.fieldJl) {
                            continue;
                        }
                    }

                    if (var10.fieldP * 1574594539 == var1) {
                        if (var10.fieldK && Player.method144(var10, (byte) 52)) {
                            continue;
                        }

                        int masterX = var10.relativeX * -1209469007 + var6;
                        int masterY = var10.relativeY * -493238439 + var7;

                        int var13;
                        int var14;
                        int var15;
                        int var16;
                        int var17;
                        int var18;
                        int var19;
                        int var20;
                        if (2 == var10.type * -729517859) {
                            var13 = var2;
                            var14 = var3;
                            var15 = var4;
                            var16 = var5;
                        } else {
                            int var10000;
                            if (var10.type * -729517859 == 9) {
                                if (var8 == 2) {
                                    return;
                                }

                                var17 = masterX;
                                var18 = masterY;
                                var19 = var10.width * 805002637 + masterX;
                                var20 = var10.height * -1004717071 + masterY;
                                if (var19 < masterX) {
                                    if (var8 == 2) {
                                        throw new IllegalStateException();
                                    }

                                    var17 = var19;
                                    var19 = masterX;
                                }

                                if (var20 < masterY) {
                                    if (var8 == 2) {
                                        throw new IllegalStateException();
                                    }

                                    var18 = var20;
                                    var20 = masterY;
                                }

                                ++var19;
                                ++var20;
                                var13 = var17 > var2 ? var17 : var2;
                                if (var18 > var3) {
                                    if (var8 == 2) {
                                        throw new IllegalStateException();
                                    }

                                    var10000 = var18;
                                } else {
                                    var10000 = var3;
                                }

                                var14 = var10000;
                                if (var19 < var4) {
                                    if (var8 == 2) {
                                        throw new IllegalStateException();
                                    }

                                    var10000 = var19;
                                } else {
                                    var10000 = var4;
                                }

                                var15 = var10000;
                                if (var20 < var5) {
                                    if (var8 == 2) {
                                        return;
                                    }

                                    var10000 = var20;
                                } else {
                                    var10000 = var5;
                                }

                                var16 = var10000;
                            } else {
                                var17 = var10.width * 805002637 + masterX;
                                var18 = var10.height * -1004717071 + masterY;
                                if (masterX > var2) {
                                    if (var8 == 2) {
                                        throw new IllegalStateException();
                                    }

                                    var10000 = masterX;
                                } else {
                                    var10000 = var2;
                                }

                                var13 = var10000;
                                if (masterY > var3) {
                                    if (var8 == 2) {
                                        throw new IllegalStateException();
                                    }

                                    var10000 = masterY;
                                } else {
                                    var10000 = var3;
                                }

                                var14 = var10000;
                                if (var17 < var4) {
                                    if (var8 == 2) {
                                        return;
                                    }

                                    var10000 = var17;
                                } else {
                                    var10000 = var4;
                                }

                                var15 = var10000;
                                if (var18 < var5) {
                                    if (var8 == 2) {
                                        throw new IllegalStateException();
                                    }

                                    var10000 = var18;
                                } else {
                                    var10000 = var5;
                                }

                                var16 = var10000;
                            }
                        }

                        if (Client.widgetDragSource == var10) {
                            if (var8 == 2) {
                                throw new IllegalStateException();
                            }

                            Client.fieldKb = true;
                            Client.fieldKr = -208957197 * masterX;
                            Client.fieldKn = 1527369525 * masterY;
                        }

                        if (var10.fieldK) {
                            if (var8 == 2) {
                                throw new IllegalStateException();
                            }

                            if (var13 >= var15) {
                                continue;
                            }

                            if (var8 == 2) {
                                return;
                            }

                            if (var14 >= var16) {
                                continue;
                            }
                        }

                        //INSERT HERE

                        var17 = Mouse.fieldW * 518596439;
                        var18 = Mouse.fieldE * 1747296693;
                        if (Mouse.fieldD * 1724889987 != 0) {
                            if (var8 == 2) {
                                throw new IllegalStateException();
                            }

                            var17 = Mouse.fieldX * -1590834513;
                            var18 = Mouse.fieldO * 1708223245;
                        }

                        //OR HERE, just before the 1337

                        if (1337 == var10.contentType * 481950881) {
                            if (var8 == 2) {
                                throw new IllegalStateException();
                            }

                            classBx.method250(var10, 57574739);
                            if (!Client.fieldJ) {
                                if (var8 == 2) {
                                    throw new IllegalStateException();
                                }

                                if (!Client.menuOpen) {
                                    if (var8 == 2) {
                                        throw new IllegalStateException();
                                    }

                                    if (var17 >= var13) {
                                        if (var8 == 2) {
                                            throw new IllegalStateException();
                                        }

                                        if (var18 >= var14) {
                                            if (var8 == 2) {
                                                throw new IllegalStateException();
                                            }

                                            if (var17 < var15) {
                                                if (var8 == 2) {
                                                    return;
                                                }

                                                if (var18 < var16) {
                                                    classJ.method135(var17, var18, var13, var14, -1841301549);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            int var21;
                            int var22;
                            int var23;
                            int var24;
                            int var25;
                            int var26;
                            if (var10.contentType * 481950881 == 1338) {
                                if (var8 == 2) {
                                    return;
                                }

                                if (0 != Client.fieldMp * 750541649) {
                                    if (var8 == 2) {
                                        throw new IllegalStateException();
                                    }

                                    if (Client.fieldMp * 750541649 != 3) {
                                        continue;
                                    }
                                }

                                if (Mouse.fieldD * 1724889987 != 1) {
                                    if (CalendarUtil.fieldAw || Mouse.fieldD * 1724889987 != 4) {
                                        continue;
                                    }

                                    if (var8 == 2) {
                                        return;
                                    }
                                }

                                var19 = Mouse.fieldX * -1590834513 - 25 - masterX;
                                var20 = Mouse.fieldO * 1708223245 - 5 - masterY;
                                if (var19 >= 0) {
                                    if (var8 == 2) {
                                        throw new IllegalStateException();
                                    }

                                    if (var20 >= 0) {
                                        if (var8 == 2) {
                                            throw new IllegalStateException();
                                        }

                                        if (var19 < 146) {
                                            if (var8 == 2) {
                                                throw new IllegalStateException();
                                            }

                                            if (var20 < 151) {
                                                if (var8 == 2) {
                                                    throw new IllegalStateException();
                                                }

                                                if (var19 >= 0) {
                                                    if (var8 == 2) {
                                                        throw new IllegalStateException();
                                                    }

                                                    if (var19 <= 23) {
                                                        if (var8 == 2) {
                                                            throw new IllegalStateException();
                                                        }

                                                        if (var20 >= 117) {
                                                            if (var8 == 2) {
                                                                return;
                                                            }

                                                            if (var20 <= 142) {
                                                                if (var8 == 2) {
                                                                    throw new IllegalStateException();
                                                                }
                                                                continue;
                                                            }
                                                        }
                                                    }
                                                }

                                                var19 -= 73;
                                                var20 -= 75;
                                                var21 = Client.minimapRotation * -422086387 + Client.minimapScale * -148158859 & 2047;
                                                var22 = RSGraphics2D.SIN_TABLE[var21];
                                                var23 = RSGraphics2D.COS_TABLE[var21];
                                                var22 = (256 + Client.minimapOffset * -695888753) * var22 >> 8;
                                                var23 = (Client.minimapOffset * -695888753 + 256) * var23 >> 8;
                                                var24 = var19 * var23 + var20 * var22 >> 11;
                                                var25 = var23 * var20 - var19 * var22 >> 11;
                                                var26 = Client.myPlayer.strictX * 404428603 + var24 >> 7;
                                                int var27 = -1490664571 * Client.myPlayer.strictY - var25 >> 7;
                                                Client.fieldCo.writePacketHeader(246, (byte) 0);
                                                Client.fieldCo.writeByte(18);
                                                Client.fieldCo.writeLittleEndianShort(var27 + CalendarUtil.baseY * -1046564359, 2078440578);
                                                byte var10001 = Keyboard.someWeirdSettings[82] ? (byte) (Keyboard.someWeirdSettings[81] ? 2 : 1) : 0;
                                                //fdfsdfd
                                                Client.fieldCo.writeInvertedByte(var10001, (byte) -40);
                                                Client.fieldCo.ak(var26 + classDc.baseX * -2071335905, 1078918573);
                                                Client.fieldCo.writeByte(var19);
                                                Client.fieldCo.writeByte(var20);
                                                Client.fieldCo.writeShort(Client.minimapRotation * -422086387);
                                                Client.fieldCo.writeByte(57);
                                                Client.fieldCo.writeByte(Client.minimapScale * -148158859);
                                                Client.fieldCo.writeByte(Client.minimapOffset * -695888753);
                                                Client.fieldCo.writeByte(89);
                                                Client.fieldCo.writeShort(404428603 * Client.myPlayer.strictX);
                                                Client.fieldCo.writeShort(-1490664571 * Client.myPlayer.strictY);
                                                Client.fieldCo.writeByte(63);
                                                Client.destinationX = var26 * -950792229;
                                                Client.destinationY = -475172701 * var27;
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (!Client.menuOpen) {
                                    if (var8 == 2) {
                                        return;
                                    }

                                    if (var17 >= var13) {
                                        if (var8 == 2) {
                                            throw new IllegalStateException();
                                        }

                                        if (var18 >= var14) {
                                            if (var8 == 2) {
                                                throw new IllegalStateException();
                                            }

                                            if (var17 < var15) {
                                                if (var8 == 2) {
                                                    throw new IllegalStateException();
                                                }

                                                if (var18 < var16) {
                                                    if (var8 == 2) {
                                                        return;
                                                    }

                                                    LandscapeMod.method120(var10, var17 - masterX, var18 - masterY, (byte) 3);
                                                }
                                            }
                                        }
                                    }
                                }

                                if (var10.type * -729517859 == 0) {
                                    if (!var10.fieldK && Player.method144(var10, (byte) 86) && Client.fieldIi != var10) {
                                        continue;
                                    }
                                    handleEvents(var0, var10.id * -1866039137, var13, var14, var15, var16, masterX - var10.insetX * 531263513, masterY - var10.insetY * -1991825281, (byte) 52);
                                    if (null != var10.children) {
                                        handleEvents(var10.children, var10.id * -1866039137, var13, var14, var15, var16, masterX - var10.insetX * 531263513, masterY - var10.insetY * -1991825281, (byte) 37);
                                    }

                                    WidgetNode var29 = (WidgetNode) Client.widgetNodes.get((long) (var10.id * -1866039137));
                                    if (null != var29) {
                                        if (var29.state * -1886991873 == 0) {
                                            if (Mouse.fieldW * 518596439 >= var13 && Mouse.fieldE * 1747296693 >= var14
                                                    && Mouse.fieldW * 518596439 < var15 && Mouse.fieldE * 1747296693 < var16) {
                                                if (!Client.menuOpen && !Client.fieldJv) {
                                                    Client.menuOptions[0] = StringConstants.cancel;
                                                    Client.menuNouns[0] = "";
                                                    Client.menuOpcodes[0] = 1006;
                                                    Client.menuRowCount = 1829510975;
                                                }
                                            }
                                        }
                                        UtilClass41.method158(var29.owner * -1220935357, var13, var14, var15, var16, masterX, masterY, (byte) -2);
                                    }
                                }

                                if (var10.fieldK) {
                                    if (var10.fieldEp && Mouse.fieldW * 518596439 >= var13 && Mouse.fieldE * 1747296693 >= var14
                                            && Mouse.fieldW * 518596439 < var15 && Mouse.fieldE * 1747296693 < var16) {
                                        for (ScriptEvent e = Client.scriptEventDeque.next(); e != null; e = Client.scriptEventDeque.tail()) {
                                            if (e.fieldV) {
                                                e.delete();
                                                e.src.fieldDa = false;
                                            }
                                        }

                                        if (Preferences.fieldKi * -815191249 == 0) {
                                            Client.widgetDragSource = null;
                                            Client.fieldJl = null;
                                        }

                                        if (!Client.menuOpen) {
                                            Client.menuOptions[0] = StringConstants.cancel;
                                            Client.menuNouns[0] = "";
                                            Client.menuOpcodes[0] = 1006;
                                            Client.menuRowCount = 1829510975;
                                        }
                                    }

                                    boolean var32;
                                    label1377:
                                    {
                                        if (Mouse.fieldW * 518596439 >= var13 && Mouse.fieldE * 1747296693 >= var14) {
                                            if (Mouse.fieldW * 518596439 < var15 && Mouse.fieldE * 1747296693 < var16) {
                                                var32 = true;
                                                break label1377;
                                            }
                                        }

                                        var32 = false;
                                    }

                                    boolean var33;
                                    label1368:
                                    {
                                        var33 = false;
                                        if (1 != Mouse.fieldM * -2003697211) {
                                            if (CalendarUtil.fieldAw || Mouse.fieldM * -2003697211 != 4) {
                                                break label1368;
                                            }
                                        }

                                        if (var32) {
                                            var33 = true;
                                        }
                                    }

                                    boolean var30;
                                    label1360:
                                    {
                                        var30 = false;
                                        if (1 != Mouse.fieldD * 1724889987) {
                                            if (CalendarUtil.fieldAw || 4 != Mouse.fieldD * 1724889987) {
                                                break label1360;
                                            }
                                        }

                                        if (Mouse.fieldX * -1590834513 >= var13 && Mouse.fieldO * 1708223245 >= var14) {
                                            if (Mouse.fieldX * -1590834513 < var15 && Mouse.fieldO * 1708223245 < var16) {
                                                var30 = true;
                                            }
                                        }
                                    }

                                    if (var30) {
                                        classBy.method248(var10, Mouse.fieldX * -1590834513 - masterX, Mouse.fieldO * 1708223245 - masterY, (byte) 119);
                                    }

                                    if (Client.widgetDragSource != null && var10 != Client.widgetDragSource && var32) {
                                        if (classAm.method403(UtilClass38.getWidgetConfig(var10, 2070855251), 1998728876)) {
                                            Client.dragTarget = var10;
                                        }
                                    }

                                    if (Client.fieldJl == var10) {
                                        Client.fieldJw = true;
                                        Client.fieldJs = masterX * -408823943;
                                        Client.fieldJm = 1088418795 * masterY;
                                    }

                                    if (var10.fieldCt) {
                                        ScriptEvent var34;
                                        if (var32 && 0 != Client.fieldLg * 1022168875 && null != var10.fieldCm) {
                                            var34 = new ScriptEvent();
                                            var34.fieldV = true;
                                            var34.src = var10;
                                            var34.mouseY = Client.fieldLg * 1225360019;
                                            var34.args = var10.fieldCm;
                                            Client.scriptEventDeque.add(var34);
                                        }

                                        label1344:
                                        {
                                            if (null == Client.widgetDragSource && null == InputHandler.fieldGc) {
                                                if (!Client.menuOpen) {
                                                    break label1344;
                                                }
                                            }

                                            var30 = false;
                                            var33 = false;
                                            var32 = false;
                                        }

                                        if (!var10.fieldDz && var30) {
                                            var10.fieldDz = true;
                                            if (var10.fieldCq != null) {
                                                var34 = new ScriptEvent();
                                                var34.fieldV = true;
                                                var34.src = var10;
                                                var34.mouseX = -2120885821 * (Mouse.fieldX * -1590834513 - masterX);
                                                var34.mouseY = (Mouse.fieldO * 1708223245 - masterY) * -2120063431;
                                                var34.args = var10.fieldCq;
                                                Client.scriptEventDeque.add(var34);
                                            }
                                        }

                                        if (var10.fieldDz) {
                                            if (var8 == 2) {
                                                throw new IllegalStateException();
                                            }

                                            if (var33) {
                                                if (var8 == 2) {
                                                    throw new IllegalStateException();
                                                }

                                                if (var10.fieldCi != null) {
                                                    if (var8 == 2) {
                                                        return;
                                                    }

                                                    var34 = new ScriptEvent();
                                                    var34.fieldV = true;
                                                    var34.src = var10;
                                                    var34.mouseX = (Mouse.fieldW * 518596439 - masterX) * -2120885821;
                                                    var34.mouseY = -2120063431 * (Mouse.fieldE * 1747296693 - masterY);
                                                    var34.args = var10.fieldCi;
                                                    Client.scriptEventDeque.add(var34);
                                                }
                                            }
                                        }

                                        if (var10.fieldDz) {
                                            if (var8 == 2) {
                                                return;
                                            }

                                            if (!var33) {
                                                if (var8 == 2) {
                                                    throw new IllegalStateException();
                                                }

                                                var10.fieldDz = false;
                                                if (var10.fieldCf != null) {
                                                    if (var8 == 2) {
                                                        return;
                                                    }

                                                    var34 = new ScriptEvent();
                                                    var34.fieldV = true;
                                                    var34.src = var10;
                                                    var34.mouseX = -2120885821 * (Mouse.fieldW * 518596439 - masterX);
                                                    var34.mouseY = -2120063431 * (Mouse.fieldE * 1747296693 - masterY);
                                                    var34.args = var10.fieldCf;
                                                    Client.fieldLo.add(var34);
                                                }
                                            }
                                        }

                                        if (var33) {
                                            if (var8 == 2) {
                                                throw new IllegalStateException();
                                            }

                                            if (var10.fieldCo != null) {
                                                if (var8 == 2) {
                                                    throw new IllegalStateException();
                                                }

                                                var34 = new ScriptEvent();
                                                var34.fieldV = true;
                                                var34.src = var10;
                                                var34.mouseX = -2120885821 * (Mouse.fieldW * 518596439 - masterX);
                                                var34.mouseY = -2120063431 * (Mouse.fieldE * 1747296693 - masterY);
                                                var34.args = var10.fieldCo;
                                                Client.scriptEventDeque.add(var34);
                                            }
                                        }

                                        if (!var10.fieldDa) {
                                            if (var8 == 2) {
                                                throw new IllegalStateException();
                                            }

                                            if (var32) {
                                                var10.fieldDa = true;
                                                if (var10.fieldCj != null) {
                                                    if (var8 == 2) {
                                                        throw new IllegalStateException();
                                                    }

                                                    var34 = new ScriptEvent();
                                                    var34.fieldV = true;
                                                    var34.src = var10;
                                                    var34.mouseX = (Mouse.fieldW * 518596439 - masterX) * -2120885821;
                                                    var34.mouseY = (Mouse.fieldE * 1747296693 - masterY) * -2120063431;
                                                    var34.args = var10.fieldCj;
                                                    Client.scriptEventDeque.add(var34);
                                                }
                                            }
                                        }

                                        if (var10.fieldDa) {
                                            if (var8 == 2) {
                                                return;
                                            }

                                            if (var32 && null != var10.fieldCd) {
                                                if (var8 == 2) {
                                                    return;
                                                }

                                                var34 = new ScriptEvent();
                                                var34.fieldV = true;
                                                var34.src = var10;
                                                var34.mouseX = -2120885821 * (Mouse.fieldW * 518596439 - masterX);
                                                var34.mouseY = (Mouse.fieldE * 1747296693 - masterY) * -2120063431;
                                                var34.args = var10.fieldCd;
                                                Client.scriptEventDeque.add(var34);
                                            }
                                        }

                                        if (var10.fieldDa) {
                                            if (var8 == 2) {
                                                throw new IllegalStateException();
                                            }

                                            if (!var32) {
                                                if (var8 == 2) {
                                                    throw new IllegalStateException();
                                                }

                                                var10.fieldDa = false;
                                                if (null != var10.fieldCb) {
                                                    if (var8 == 2) {
                                                        throw new IllegalStateException();
                                                    }

                                                    var34 = new ScriptEvent();
                                                    var34.fieldV = true;
                                                    var34.src = var10;
                                                    var34.mouseX = (Mouse.fieldW * 518596439 - masterX) * -2120885821;
                                                    var34.mouseY = (Mouse.fieldE * 1747296693 - masterY) * -2120063431;
                                                    var34.args = var10.fieldCb;
                                                    Client.fieldLo.add(var34);
                                                }
                                            }
                                        }

                                        if (null != var10.fieldCl) {
                                            var34 = new ScriptEvent();
                                            var34.src = var10;
                                            var34.args = var10.fieldCl;
                                            Client.fieldLw.add(var34);
                                        }

                                        ScriptEvent var36;
                                        if (null != var10.fieldCg) {
                                            if (var8 == 2) {
                                                throw new IllegalStateException();
                                            }

                                            if (Client.fieldKc * -177295595 > var10.fieldDb * 1397078021) {
                                                if (var8 == 2) {
                                                    throw new IllegalStateException();
                                                }

                                                label1318:
                                                {
                                                    if (var10.fieldCy != null) {
                                                        if (var8 == 2) {
                                                            throw new IllegalStateException();
                                                        }

                                                        if (Client.fieldKc * -177295595 - var10.fieldDb * 1397078021 <= 32) {
                                                            var22 = var10.fieldDb * 1397078021;

                                                            while (true) {
                                                                if (var22 >= Client.fieldKc * -177295595) {
                                                                    break label1318;
                                                                }

                                                                if (var8 == 2) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                var23 = Client.fieldKp[var22 & 31];

                                                                for (var24 = 0; var24 < var10.fieldCy.length; ++var24) {
                                                                    if (var8 == 2) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    if (var10.fieldCy[var24] == var23) {
                                                                        if (var8 == 2) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        var36 = new ScriptEvent();
                                                                        var36.src = var10;
                                                                        var36.args = var10.fieldCg;
                                                                        Client.scriptEventDeque.add(var36);
                                                                        break label1318;
                                                                    }
                                                                }

                                                                ++var22;
                                                            }
                                                        }

                                                        if (var8 == 2) {
                                                            return;
                                                        }
                                                    }

                                                    var34 = new ScriptEvent();
                                                    var34.src = var10;
                                                    var34.args = var10.fieldCg;
                                                    Client.scriptEventDeque.add(var34);
                                                }

                                                var10.fieldDb = Client.fieldKc * 369039313;
                                            }
                                        }

                                        if (null != var10.fieldCv) {
                                            if (var8 == 2) {
                                                throw new IllegalStateException();
                                            }

                                            if (Client.fieldKu * -919438281 > var10.fieldDx * 2113155039) {
                                                if (var8 == 2) {
                                                    throw new IllegalStateException();
                                                }

                                                label1292:
                                                {
                                                    if (var10.fieldCc != null) {
                                                        if (Client.fieldKu * -919438281 - var10.fieldDx * 2113155039 <= 32) {
                                                            var22 = var10.fieldDx * 2113155039;

                                                            while (true) {
                                                                if (var22 >= Client.fieldKu * -919438281) {
                                                                    break label1292;
                                                                }

                                                                if (var8 == 2) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                var23 = Client.fieldKl[var22 & 31];

                                                                for (var24 = 0; var24 < var10.fieldCc.length; ++var24) {
                                                                    if (var23 == var10.fieldCc[var24]) {
                                                                        var36 = new ScriptEvent();
                                                                        var36.src = var10;
                                                                        var36.args = var10.fieldCv;
                                                                        Client.scriptEventDeque.add(var36);
                                                                        break label1292;
                                                                    }
                                                                }

                                                                ++var22;
                                                            }
                                                        }

                                                        if (var8 == 2) {
                                                            throw new IllegalStateException();
                                                        }
                                                    }

                                                    var34 = new ScriptEvent();
                                                    var34.src = var10;
                                                    var34.args = var10.fieldCv;
                                                    Client.scriptEventDeque.add(var34);
                                                }

                                                var10.fieldDx = Client.fieldKu * -134914391;
                                            }
                                        }

                                        if (null != var10.fieldCx) {
                                            if (var8 == 2) {
                                                return;
                                            }

                                            if (Client.fieldKk * -765568713 > var10.fieldDe * -1622717613) {
                                                if (var8 == 2) {
                                                    throw new IllegalStateException();
                                                }

                                                label1270:
                                                {
                                                    if (var10.fieldCe != null) {
                                                        if (var8 == 2) {
                                                            throw new IllegalStateException();
                                                        }

                                                        if (Client.fieldKk * -765568713 - var10.fieldDe * -1622717613 <= 32) {
                                                            var22 = var10.fieldDe * -1622717613;

                                                            while (true) {
                                                                if (var22 >= Client.fieldKk * -765568713) {
                                                                    break label1270;
                                                                }

                                                                if (var8 == 2) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                var23 = Client.fieldKs[var22 & 31];

                                                                for (var24 = 0; var24 < var10.fieldCe.length; ++var24) {
                                                                    if (var23 == var10.fieldCe[var24]) {
                                                                        if (var8 == 2) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        var36 = new ScriptEvent();
                                                                        var36.src = var10;
                                                                        var36.args = var10.fieldCx;
                                                                        Client.scriptEventDeque.add(var36);
                                                                        break label1270;
                                                                    }
                                                                }

                                                                ++var22;
                                                            }
                                                        }

                                                        if (var8 == 2) {
                                                            throw new IllegalStateException();
                                                        }
                                                    }

                                                    var34 = new ScriptEvent();
                                                    var34.src = var10;
                                                    var34.args = var10.fieldCx;
                                                    Client.scriptEventDeque.add(var34);
                                                }

                                                var10.fieldDe = Client.fieldKk * 737649165;
                                            }
                                        }

                                        if (Client.fieldKd * 260602995 > var10.fieldDy * -200070289 && null != var10.fieldCu) {
                                            if (var8 == 2) {
                                                throw new IllegalStateException();
                                            }

                                            var34 = new ScriptEvent();
                                            var34.src = var10;
                                            var34.args = var10.fieldCu;
                                            Client.scriptEventDeque.add(var34);
                                        }

                                        if (Client.fieldKt * 1057888025 > var10.fieldDy * -200070289) {
                                            if (var8 == 2) {
                                                throw new IllegalStateException();
                                            }

                                            if (null != var10.fieldCs) {
                                                if (var8 == 2) {
                                                    throw new IllegalStateException();
                                                }

                                                var34 = new ScriptEvent();
                                                var34.src = var10;
                                                var34.args = var10.fieldCs;
                                                Client.scriptEventDeque.add(var34);
                                            }
                                        }

                                        if (Client.fieldKy * -410226801 > var10.fieldDy * -200070289) {
                                            if (var8 == 2) {
                                                return;
                                            }

                                            if (var10.fieldDg != null) {
                                                if (var8 == 2) {
                                                    throw new IllegalStateException();
                                                }

                                                var34 = new ScriptEvent();
                                                var34.src = var10;
                                                var34.args = var10.fieldDg;
                                                Client.scriptEventDeque.add(var34);
                                            }
                                        }

                                        if (Client.fieldKx * -1733713231 > var10.fieldDy * -200070289) {
                                            if (var8 == 2) {
                                                throw new IllegalStateException();
                                            }

                                            if (null != var10.fieldDj) {
                                                var34 = new ScriptEvent();
                                                var34.src = var10;
                                                var34.args = var10.fieldDj;
                                                Client.scriptEventDeque.add(var34);
                                            }
                                        }

                                        if (Client.fieldKg * -1315399311 > var10.fieldDy * -200070289) {
                                            if (var8 == 2) {
                                                throw new IllegalStateException();
                                            }

                                            if (var10.fieldDi != null) {
                                                if (var8 == 2) {
                                                    throw new IllegalStateException();
                                                }

                                                var34 = new ScriptEvent();
                                                var34.src = var10;
                                                var34.args = var10.fieldDi;
                                                Client.scriptEventDeque.add(var34);
                                            }
                                        }

                                        if (Client.fieldKo * 565870825 > var10.fieldDy * -200070289 && null != var10.fieldDd) {
                                            if (var8 == 2) {
                                                throw new IllegalStateException();
                                            }

                                            var34 = new ScriptEvent();
                                            var34.src = var10;
                                            var34.args = var10.fieldDd;
                                            Client.scriptEventDeque.add(var34);
                                        }

                                        var10.fieldDy = Client.fieldKe * 1541584347;
                                        if (var10.fieldCa != null) {
                                            if (var8 == 2) {
                                                throw new IllegalStateException();
                                            }

                                            for (var22 = 0; var22 < Client.fieldLl * 1506159627; ++var22) {
                                                if (var8 == 2) {
                                                    throw new IllegalStateException();
                                                }

                                                ScriptEvent var35 = new ScriptEvent();
                                                var35.src = var10;
                                                var35.fieldE = Client.fieldMd[var22] * -1695094723;
                                                var35.fieldN = Client.fieldMj[var22] * -1279731817;
                                                var35.args = var10.fieldCa;
                                                Client.scriptEventDeque.add(var35);
                                            }
                                        }
                                    }
                                }

                                if (!var10.fieldK) {
                                    if (var8 == 2) {
                                        throw new IllegalStateException();
                                    }

                                    if (null == Client.widgetDragSource) {
                                        if (var8 == 2) {
                                            return;
                                        }

                                        if (InputHandler.fieldGc == null) {
                                            if (var8 == 2) {
                                                return;
                                            }

                                            if (Client.menuOpen) {
                                                if (var8 == 2) {
                                                    throw new IllegalStateException();
                                                }
                                            } else {
                                                label1230:
                                                {
                                                    if (var10.fieldDf * 2132438849 < 0) {
                                                        if (var8 == 2) {
                                                            throw new IllegalStateException();
                                                        }

                                                        if (var10.fieldAe * 1427124997 == 0) {
                                                            break label1230;
                                                        }

                                                        if (var8 == 2) {
                                                            throw new IllegalStateException();
                                                        }
                                                    }

                                                    if (Mouse.fieldW * 518596439 >= var13 && Mouse.fieldE * 1747296693 >= var14 && Mouse.fieldW * 518596439 < var15) {
                                                        if (var8 == 2) {
                                                            throw new IllegalStateException();
                                                        }

                                                        if (Mouse.fieldE * 1747296693 < var16) {
                                                            if (var8 == 2) {
                                                                throw new IllegalStateException();
                                                            }

                                                            if (var10.fieldDf * 2132438849 >= 0) {
                                                                if (var8 == 2) {
                                                                    return;
                                                                }

                                                                Client.fieldIi = var0[var10.fieldDf * 2132438849];
                                                            } else {
                                                                Client.fieldIi = var10;
                                                            }
                                                        }
                                                    }
                                                }

                                                if (var10.type * -729517859 == 8 && Mouse.fieldW * 518596439 >= var13) {
                                                    if (var8 == 2) {
                                                        throw new IllegalStateException();
                                                    }

                                                    if (Mouse.fieldE * 1747296693 >= var14) {
                                                        if (var8 == 2) {
                                                            throw new IllegalStateException();
                                                        }

                                                        if (Mouse.fieldW * 518596439 < var15) {
                                                            if (var8 == 2) {
                                                                throw new IllegalStateException();
                                                            }

                                                            if (Mouse.fieldE * 1747296693 < var16) {
                                                                if (var8 == 2) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                ObjectDefinition.fieldIu = var10;
                                                            }
                                                        }
                                                    }
                                                }

                                                if (var10.viewportHeight * 1854186653 > var10.height * -1004717071) {
                                                    var19 = var10.width * 805002637 + masterX;
                                                    var20 = var10.height * -1004717071;
                                                    var21 = var10.viewportHeight * 1854186653;
                                                    var22 = Mouse.fieldW * 518596439;
                                                    var23 = Mouse.fieldE * 1747296693;
                                                    if (Client.fieldFu) {
                                                        if (var8 == 2) {
                                                            throw new IllegalStateException();
                                                        }

                                                        Client.fieldFk = 1924775456;
                                                    } else {
                                                        Client.fieldFk = 0;
                                                    }

                                                    label1506:
                                                    {
                                                        Client.fieldFu = false;
                                                        if (1 != Mouse.fieldM * -2003697211) {
                                                            if (CalendarUtil.fieldAw) {
                                                                break label1506;
                                                            }

                                                            if (var8 == 2) {
                                                                throw new IllegalStateException();
                                                            }

                                                            if (4 != Mouse.fieldM * -2003697211) {
                                                                break label1506;
                                                            }

                                                            if (var8 == 2) {
                                                                throw new IllegalStateException();
                                                            }
                                                        }

                                                        if (var22 >= var19) {
                                                            if (var8 == 2) {
                                                                throw new IllegalStateException();
                                                            }

                                                            if (var22 < 16 + var19) {
                                                                if (var8 == 2) {
                                                                    return;
                                                                }

                                                                if (var23 >= masterY) {
                                                                    if (var8 == 2) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    if (var23 < masterY + 16) {
                                                                        if (var8 == 2) {
                                                                            return;
                                                                        }

                                                                        var10.insetY -= -1396548100;
                                                                        classBx.method250(var10, 57574739);
                                                                        break label1506;
                                                                    }
                                                                }
                                                            }
                                                        }

                                                        if (var22 >= var19) {
                                                            if (var8 == 2) {
                                                                throw new IllegalStateException();
                                                            }

                                                            if (var22 < 16 + var19) {
                                                                if (var8 == 2) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                if (var23 >= var20 + masterY - 16) {
                                                                    if (var8 == 2) {
                                                                        return;
                                                                    }

                                                                    if (var23 < var20 + masterY) {
                                                                        if (var8 == 2) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        var10.insetY += -1396548100;
                                                                        classBx.method250(var10, 57574739);
                                                                        break label1506;
                                                                    }
                                                                }
                                                            }
                                                        }

                                                        if (var22 >= var19 - Client.fieldFk * 509313809) {
                                                            if (var8 == 2) {
                                                                return;
                                                            }

                                                            if (var22 < var19 + 16 + Client.fieldFk * 509313809) {
                                                                if (var8 == 2) {
                                                                    return;
                                                                }

                                                                if (var23 >= 16 + masterY) {
                                                                    if (var8 == 2) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    if (var23 < var20 + masterY - 16) {
                                                                        if (var8 == 2) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        var24 = var20 * (var20 - 32) / var21;
                                                                        if (var24 < 8) {
                                                                            if (var8 == 2) {
                                                                                throw new IllegalStateException();
                                                                            }

                                                                            var24 = 8;
                                                                        }

                                                                        var25 = var23 - masterY - 16 - var24 / 2;
                                                                        var26 = var20 - 32 - var24;
                                                                        var10.insetY = var25 * (var21 - var20) / var26 * 724604799;
                                                                        classBx.method250(var10, 57574739);
                                                                        Client.fieldFu = true;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }

                                                    if (0 != Client.fieldLg * 1022168875) {
                                                        if (var8 == 2) {
                                                            throw new IllegalStateException();
                                                        }

                                                        var24 = var10.width * 805002637;
                                                        if (var22 >= var19 - var24) {
                                                            if (var8 == 2) {
                                                                return;
                                                            }

                                                            if (var23 >= masterY) {
                                                                if (var8 == 2) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                if (var22 < var19 + 16) {
                                                                    if (var8 == 2) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    if (var23 <= var20 + masterY) {
                                                                        var10.insetY += Client.fieldLg * 1637086705;
                                                                        classBx.method250(var10, 57574739);
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
                        }
                    }
                }
            }

        } catch (RuntimeException var28) {
            throw ClanMate.error(var28, "cw.cy(" + ')');
        }
    }

}
