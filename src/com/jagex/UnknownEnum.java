package com.jagex;

public enum UnknownEnum {

    UNKNOWN0,
    UNKNOWN1,
    UNKNOWN2,
    UNKNOWN3;

    static int fieldBv;

    static void method373(int var0, byte var1) {
        try {
            if (var0 != Client.connectionState * -214882771) {
                if (Client.connectionState * -214882771 == 0) {
                    classDp.method81(2131190900);
                }

                label131:
                {
                    if (var0 != 20) {
                        if (var1 >= 8) {
                            throw new IllegalStateException();
                        }

                        if (var0 != 40) {
                            if (var1 >= 8) {
                                throw new IllegalStateException();
                            }

                            if (var0 != 45) {
                                break label131;
                            }

                            if (var1 >= 8) {
                                return;
                            }
                        }
                    }

                    Client.fieldBg = 0;
                    Client.fieldBt = 0;
                    Client.fieldBx = 0;
                }

                if (20 != var0) {
                    if (var1 >= 8) {
                        return;
                    }

                    if (40 != var0) {
                        if (var1 >= 8) {
                            throw new IllegalStateException();
                        }

                        if (null != Varp.fieldCf) {
                            if (var1 >= 8) {
                                throw new IllegalStateException();
                            }

                            Varp.fieldCf.stop(-854866655);
                            Varp.fieldCf = null;
                        }
                    }
                }

                if (25 == Client.connectionState * -214882771) {
                    if (var1 >= 8) {
                        return;
                    }

                    Client.fieldDo = 0;
                    Client.fieldDp = 0;
                    Client.fieldDu = 580952359;
                    Client.fieldDj = 0;
                    Client.fieldDi = 381635861;
                }

                label119:
                {
                    if (var0 != 5) {
                        if (10 != var0) {
                            if (var0 == 20) {
                                if (var1 >= 8) {
                                    throw new IllegalStateException();
                                }

                                byte var10004;
                                if (11 == Client.connectionState * -214882771) {
                                    if (var1 >= 8) {
                                        throw new IllegalStateException();
                                    }

                                    var10004 = 4;
                                } else {
                                    var10004 = 0;
                                }

                                classT.method166(UtilClass22.canvas, JagSocket.wordpack, UtilClass5.fieldBp, true, var10004, -2095677493);
                            } else if (var0 == 11) {
                                if (var1 >= 8) {
                                    throw new IllegalStateException();
                                }

                                classT.method166(UtilClass22.canvas, JagSocket.wordpack, UtilClass5.fieldBp, false, 4, 1574059355);
                            } else if (classJ.fieldA) {
                                Client.fieldV = null;
                                ClientData.fieldI = null;
                                ItemTable.fieldB = null;
                                UtilClass7.fieldL = null;
                                ClientData.fieldM = null;
                                ClientData.fieldW = null;
                                Client.cfieldE = null;
                                UtilClass5.fieldN = null;
                                ClientData.fieldS = null;
                                ClientData.worldSelectorBack = null;
                                ClientData.worldSelectorFlags = null;
                                DynamicObject.worldSelectorArrows = null;
                                RuneScript.worldSelectorStars = null;
                                UtilClass19.fieldBu = null;
                                BoundaryDecoration.fieldH = null;
                                classDp.fieldU = null;
                                classBy.fieldJ = null;
                                UtilClass41.fieldT = null;
                                IgnoredPlayer.fieldP = null;
                                UtilClass35.fieldR = null;
                                classJ.fieldZ = null;
                                ClientData.fieldC = null;
                                UtilClass21.fieldL = -561749511;
                                UtilClass21.fieldM = null;
                                UtilClass35.fieldW = -1158645973;
                                classDz.fieldE = 1105453967;
                                ItemTable.fieldN = 0;
                                UtilClass21.fieldK = false;
                                UtilClass21.fieldS = 971689226;
                                classCn.method327(true, -118337521);
                                classJ.fieldA = false;
                            }
                            break label119;
                        }

                        if (var1 >= 8) {
                            return;
                        }
                    }

                    classT.method166(UtilClass22.canvas, JagSocket.wordpack, UtilClass5.fieldBp, true, 0, -356757461);
                }

                Client.connectionState = -34072155 * var0;
            }
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "ar.e(" + ')');
        }
    }

    static final void method374(int var0) {
        try {
            boolean var1 = false;

            int var2;
            int var5;
            while (!var1) {
                if (var0 >= 605217740) {
                    throw new IllegalStateException();
                }

                var1 = true;

                for (var2 = 0; var2 < Client.menuRowCount * 445599935 - 1; ++var2) {
                    if (var0 >= 605217740) {
                        throw new IllegalStateException();
                    }

                    if (Client.menuOpcodes[var2] < 1000 && Client.menuOpcodes[1 + var2] > 1000) {
                        if (var0 >= 605217740) {
                            throw new IllegalStateException();
                        }

                        String var3 = Client.menuNouns[var2];
                        Client.menuNouns[var2] = Client.menuNouns[var2 + 1];
                        Client.menuNouns[var2 + 1] = var3;
                        String var4 = Client.menuOptions[var2];
                        Client.menuOptions[var2] = Client.menuOptions[var2 + 1];
                        Client.menuOptions[1 + var2] = var4;
                        var5 = Client.menuOpcodes[var2];
                        Client.menuOpcodes[var2] = Client.menuOpcodes[var2 + 1];
                        Client.menuOpcodes[1 + var2] = var5;
                        var5 = Client.menuArg1[var2];
                        Client.menuArg1[var2] = Client.menuArg1[1 + var2];
                        Client.menuArg1[1 + var2] = var5;
                        var5 = Client.menuArg2[var2];
                        Client.menuArg2[var2] = Client.menuArg2[var2 + 1];
                        Client.menuArg2[1 + var2] = var5;
                        var5 = Client.menuArg0[var2];
                        Client.menuArg0[var2] = Client.menuArg0[1 + var2];
                        Client.menuArg0[1 + var2] = var5;
                        var1 = false;
                    }
                }
            }

            if (null == InputHandler.fieldGc) {
                if (null == Client.widgetDragSource) {
                    int var11 = Mouse.fieldD * 1724889987;
                    int var7;
                    int var8;
                    int var9;
                    int var12;
                    int var13;
                    if (Client.menuOpen) {
                        if (1 != var11) {
                            label446:
                            {
                                if (!CalendarUtil.fieldAw && var11 == 4) {
                                    break label446;
                                }

                                var2 = Mouse.fieldW * 518596439;
                                var12 = Mouse.fieldE * 1747296693;
                                if (var2 >= WidgetStrings.fieldIf * -856693505 - 10) {
                                    if (var2 <= WidgetStrings.fieldIf * -856693505 + UtilClass41.fieldIs * 55630027 + 10 && var12 >= UtilClass27.fieldIw * -1766645199 - 10) {
                                        if (var12 <= 10 + BoundaryDecoration.fieldIv * 183606305 + UtilClass27.fieldIw * -1766645199) {
                                            break label446;
                                        }
                                    }
                                }

                                Client.menuOpen = false;
                                classCc.method351(WidgetStrings.fieldIf * -856693505, UtilClass27.fieldIw * -1766645199, UtilClass41.fieldIs * 55630027, BoundaryDecoration.fieldIv * 183606305, 697443259);
                            }
                        }

                        if (1 != var11 && (CalendarUtil.fieldAw || 4 != var11)) {
                            return;
                        }

                        var2 = WidgetStrings.fieldIf * -856693505;
                        var12 = UtilClass27.fieldIw * -1766645199;
                        var13 = UtilClass41.fieldIs * 55630027;
                        var5 = Mouse.fieldX * -1590834513;
                        int var6 = Mouse.fieldO * 1708223245;
                        var7 = -1;

                        for (var8 = 0; var8 < Client.menuRowCount * 445599935; ++var8) {
                            var9 = 15 * (Client.menuRowCount * 445599935 - 1 - var8) + var12 + 31;
                            if (var5 > var2 && var5 < var13 + var2 && var6 > var9 - 13 && var6 < var9 + 3) {
                                var7 = var8;
                            }
                        }

                        if (-1 != var7) {
                            LandscapeMod.processActionAt(var7, 1970001724);
                        }

                        Client.menuOpen = false;
                        classCc.method351(WidgetStrings.fieldIf * -856693505, UtilClass27.fieldIw * -1766645199, UtilClass41.fieldIs * 55630027, BoundaryDecoration.fieldIv * 183606305, 697443259);
                    } else {
                        label426:
                        {
                            if (var11 != 1) {
                                if (var0 >= 605217740) {
                                    throw new IllegalStateException();
                                }

                                if (CalendarUtil.fieldAw) {
                                    break label426;
                                }

                                if (var0 >= 605217740) {
                                    throw new IllegalStateException();
                                }

                                if (4 != var11) {
                                    break label426;
                                }
                            }

                            if (Client.menuRowCount * 445599935 > 0) {
                                label452:
                                {
                                    if (var0 >= 605217740) {
                                        throw new IllegalStateException();
                                    }

                                    var2 = Client.menuOpcodes[Client.menuRowCount * 445599935 - 1];
                                    if (39 != var2) {
                                        if (var0 >= 605217740) {
                                            throw new IllegalStateException();
                                        }

                                        if (40 != var2) {
                                            if (var0 >= 605217740) {
                                                return;
                                            }

                                            if (41 != var2 && var2 != 42) {
                                                if (var0 >= 605217740) {
                                                    throw new IllegalStateException();
                                                }

                                                if (43 != var2) {
                                                    if (var0 >= 605217740) {
                                                        return;
                                                    }

                                                    if (var2 != 33) {
                                                        if (var0 >= 605217740) {
                                                            throw new IllegalStateException();
                                                        }

                                                        if (34 != var2 && 35 != var2) {
                                                            if (var0 >= 605217740) {
                                                                throw new IllegalStateException();
                                                            }

                                                            if (var2 != 36) {
                                                                if (var0 >= 605217740) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                if (37 != var2) {
                                                                    if (var0 >= 605217740) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    if (38 != var2) {
                                                                        if (var0 >= 605217740) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        if (var2 != 1005) {
                                                                            break label452;
                                                                        }

                                                                        if (var0 >= 605217740) {
                                                                            return;
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

                                    var12 = Client.menuArg1[Client.menuRowCount * 445599935 - 1];
                                    var13 = Client.menuArg2[Client.menuRowCount * 445599935 - 1];
                                    Widget var15 = Widget.lookup(var13);
                                    var7 = UtilClass38.getWidgetConfig(var15, 2070855251);
                                    boolean var10000;
                                    if ((var7 >> 28 & 1) != 0) {
                                        if (var0 >= 605217740) {
                                            throw new IllegalStateException();
                                        }

                                        var10000 = true;
                                    } else {
                                        var10000 = false;
                                    }

                                    boolean var14 = var10000;
                                    if (!var14) {
                                        if (var0 >= 605217740) {
                                            return;
                                        }

                                        UtilClass23 var16 = (UtilClass23) null;
                                        if (!classBq.method263(UtilClass38.getWidgetConfig(var15, 2070855251), (byte) 123)) {
                                            break label452;
                                        }

                                        if (var0 >= 605217740) {
                                            throw new IllegalStateException();
                                        }
                                    }

                                    if (null != InputHandler.fieldGc && !Client.fieldGb) {
                                        if (var0 >= 605217740) {
                                            throw new IllegalStateException();
                                        }

                                        if (Client.fieldHc * -283472751 != 1) {
                                            if (var0 >= 605217740) {
                                                throw new IllegalStateException();
                                            }

                                            if (!InputHandler.method86(Client.menuRowCount * 445599935 - 1, -959053341) && Client.menuRowCount * 445599935 > 0) {
                                                if (var0 >= 605217740) {
                                                    throw new IllegalStateException();
                                                }

                                                var8 = Client.fieldGl * -1533276865;
                                                var9 = Client.fieldGz * 1814995251;
                                                ClanMate.method193(Projectile.menuItem, var8, var9, -2060805461);
                                                Projectile.menuItem = null;
                                            }
                                        }
                                    }

                                    Client.fieldGb = false;
                                    Client.fieldGi = 0;
                                    if (null != InputHandler.fieldGc) {
                                        if (var0 >= 605217740) {
                                            throw new IllegalStateException();
                                        }

                                        classBx.method250(InputHandler.fieldGc, 57574739);
                                    }

                                    InputHandler.fieldGc = Widget.lookup(var13);
                                    Client.fieldGv = 2070664671 * var12;
                                    Client.fieldGl = Mouse.fieldX * -1556007279;
                                    Client.fieldGz = Mouse.fieldO * -1599585601;
                                    if (Client.menuRowCount * 445599935 > 0) {
                                        if (var0 >= 605217740) {
                                            throw new IllegalStateException();
                                        }

                                        var8 = Client.menuRowCount * 445599935 - 1;
                                        Projectile.menuItem = new MenuItem();
                                        Projectile.menuItem.arg1 = -268923001 * Client.menuArg1[var8];
                                        Projectile.menuItem.arg2 = Client.menuArg2[var8] * 1403349035;
                                        Projectile.menuItem.opcode = 614282175 * Client.menuOpcodes[var8];
                                        Projectile.menuItem.arg0 = Client.menuArg0[var8] * 741448429;
                                        Projectile.menuItem.option = Client.menuOptions[var8];
                                    }

                                    classBx.method250(InputHandler.fieldGc, 57574739);
                                    return;
                                }
                            }
                        }

                        label455:
                        {
                            if (var11 != 1) {
                                if (var0 >= 605217740) {
                                    return;
                                }

                                if (CalendarUtil.fieldAw) {
                                    break label455;
                                }

                                if (var0 >= 605217740) {
                                    throw new IllegalStateException();
                                }

                                if (var11 != 4) {
                                    break label455;
                                }

                                if (var0 >= 605217740) {
                                    throw new IllegalStateException();
                                }
                            }

                            label457:
                            {
                                if (1 == Client.fieldHc * -283472751) {
                                    if (Client.menuRowCount * 445599935 > 2) {
                                        break label457;
                                    }

                                    if (var0 >= 605217740) {
                                        throw new IllegalStateException();
                                    }
                                }

                                if (!InputHandler.method86(Client.menuRowCount * 445599935 - 1, -959053341)) {
                                    break label455;
                                }

                                if (var0 >= 605217740) {
                                    throw new IllegalStateException();
                                }
                            }

                            var11 = 2;
                        }

                        label338:
                        {
                            if (1 != var11) {
                                if (var0 >= 605217740) {
                                    return;
                                }

                                if (CalendarUtil.fieldAw) {
                                    break label338;
                                }

                                if (var0 >= 605217740) {
                                    throw new IllegalStateException();
                                }

                                if (var11 != 4) {
                                    break label338;
                                }

                                if (var0 >= 605217740) {
                                    throw new IllegalStateException();
                                }
                            }

                            if (Client.menuRowCount * 445599935 > 0) {
                                LandscapeMod.processActionAt(Client.menuRowCount * 445599935 - 1, 1507717099);
                            }
                        }

                        if (2 == var11) {
                            if (var0 >= 605217740) {
                                throw new IllegalStateException();
                            }

                            if (Client.menuRowCount * 445599935 > 0) {
                                if (var0 >= 605217740) {
                                    return;
                                }

                                UtilClass14.openMenu(Mouse.fieldX * -1590834513, Mouse.fieldO * 1708223245, 1654997370);
                            }
                        }
                    }

                }
            }
        } catch (RuntimeException var10) {
            throw ClanMate.error(var10, "ar.bf(" + ')');
        }
    }
}
