package com.jagex;

public abstract class classDa {

    static Widget fieldK;

    static void method280(GameEngine var0, int var1) {
        try {
            if (ClientData.isWorldSelectorOpen) {
                if (var1 <= -265663055) {
                    throw new IllegalStateException();
                } else {
                    ItemTable.method201(var0, 2098948485);
                }
            } else {
                int var3;
                int var4;
                label880:
                {
                    if (1 != Mouse.fieldD * 1724889987) {
                        if (var1 <= -265663055) {
                            throw new IllegalStateException();
                        }

                        if (CalendarUtil.fieldAw) {
                            break label880;
                        }

                        if (var1 <= -265663055) {
                            throw new IllegalStateException();
                        }

                        if (4 != Mouse.fieldD * 1724889987) {
                            break label880;
                        }
                    }

                    if (Mouse.fieldX * -1590834513 >= 715 && Mouse.fieldO * 1708223245 >= 453) {
                        if (var1 <= -265663055) {
                            return;
                        }

                        Projectile.preferences.audioEnabled = !Projectile.preferences.audioEnabled;
                        World.method182(-1698077053);
                        if (!Projectile.preferences.audioEnabled) {
                            if (var1 <= -265663055) {
                                throw new IllegalStateException();
                            }

                            ReferenceTableSub var2 = classT.fieldBs;
                            var3 = var2.h("scape main", 1675890893);
                            var4 = var2.u(var3, "", -67617224);
                            UtilClass40.method171(var2, var3, var4, 255, false, -911580244);
                        } else {
                            ScriptEvent.method109(1698296025);
                        }
                    }
                }

                if (Client.connectionState * -214882771 == 5) {
                    if (var1 <= -265663055) {
                        throw new IllegalStateException();
                    }
                } else {
                    ClientData.fieldAh += 1467536273;
                    if (Client.connectionState * -214882771 != 10) {
                        if (var1 <= -265663055) {
                            throw new IllegalStateException();
                        }

                        if (Client.connectionState * -214882771 != 11) {
                            return;
                        }
                    }

                    if (Client.fieldD * -925892703 == 0) {
                        label866:
                        {
                            if (Mouse.fieldD * 1724889987 != 1) {
                                if (var1 <= -265663055) {
                                    throw new IllegalStateException();
                                }

                                if (CalendarUtil.fieldAw) {
                                    break label866;
                                }

                                if (var1 <= -265663055) {
                                    throw new IllegalStateException();
                                }

                                if (Mouse.fieldD * 1724889987 != 4) {
                                    break label866;
                                }

                                if (var1 <= -265663055) {
                                    throw new IllegalStateException();
                                }
                            }

                            byte var11 = 5;
                            short var13 = 463;
                            byte var14 = 100;
                            byte var5 = 35;
                            if (Mouse.fieldX * -1590834513 >= var11 && Mouse.fieldX * -1590834513 <= var14 + var11) {
                                if (var1 <= -265663055) {
                                    throw new IllegalStateException();
                                }

                                if (Mouse.fieldO * 1708223245 >= var13) {
                                    if (var1 <= -265663055) {
                                        throw new IllegalStateException();
                                    }

                                    if (Mouse.fieldO * 1708223245 <= var13 + var5) {
                                        if (var1 <= -265663055) {
                                            return;
                                        }

                                        Player.method152((byte) 116);
                                        return;
                                    }
                                }
                            }
                        }

                        if (null != classCs.fieldAf) {
                            if (var1 <= -265663055) {
                                throw new IllegalStateException();
                            }

                            Player.method152((byte) 65);
                        }
                    }

                    int var12 = Mouse.fieldD * 1724889987;
                    var3 = Mouse.fieldX * -1590834513;
                    var4 = Mouse.fieldO * 1708223245;
                    if (!CalendarUtil.fieldAw) {
                        if (var1 <= -265663055) {
                            throw new IllegalStateException();
                        }

                        if (var12 == 4) {
                            if (var1 <= -265663055) {
                                throw new IllegalStateException();
                            }

                            var12 = 1;
                        }
                    }

                    short var6;
                    short var15;
                    if (0 == ClientData.fieldAl * -250617745) {
                        if (var1 <= -265663055) {
                            return;
                        }

                        var15 = 302;
                        var6 = 291;
                        if (1 == var12 && var3 >= var15 - 75) {
                            if (var1 <= -265663055) {
                                throw new IllegalStateException();
                            }

                            if (var3 <= 75 + var15) {
                                if (var1 <= -265663055) {
                                    throw new IllegalStateException();
                                }

                                if (var4 >= var6 - 20) {
                                    if (var1 <= -265663055) {
                                        return;
                                    }

                                    if (var4 <= var6 + 20) {
                                        if (var1 <= -265663055) {
                                            throw new IllegalStateException();
                                        }

                                        RuneScript.method162(World.method179("secure", true, -1069476758) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false, 2041943657);
                                    }
                                }
                            }
                        }

                        var15 = 462;
                        if (1 == var12) {
                            if (var1 <= -265663055) {
                                throw new IllegalStateException();
                            }

                            if (var3 >= var15 - 75) {
                                if (var1 <= -265663055) {
                                    throw new IllegalStateException();
                                }

                                if (var3 <= 75 + var15) {
                                    if (var1 <= -265663055) {
                                        throw new IllegalStateException();
                                    }

                                    if (var4 >= var6 - 20 && var4 <= 20 + var6) {
                                        if (var1 <= -265663055) {
                                            return;
                                        }

                                        if (0 != (Client.fieldL * -1521806339 & 4)) {
                                            if (var1 <= -265663055) {
                                                throw new IllegalStateException();
                                            }

                                            if (0 != (Client.fieldL * -1521806339 & 1024)) {
                                                if (var1 <= -265663055) {
                                                    throw new IllegalStateException();
                                                }

                                                ClientData.fieldAq = StringConstants.fieldHh;
                                                ClientData.fieldAm = StringConstants.fieldHp;
                                                ClientData.fieldAx = StringConstants.fieldHs;
                                            } else {
                                                ClientData.fieldAq = StringConstants.fieldHv;
                                                ClientData.fieldAm = StringConstants.fieldHq;
                                                ClientData.fieldAx = StringConstants.fieldHz;
                                            }

                                            ClientData.fieldAl = -226132337;
                                            ClientData.fieldAg = 0;
                                        } else if (0 != (Client.fieldL * -1521806339 & 1024)) {
                                            ClientData.fieldAq = StringConstants.fieldHr;
                                            ClientData.fieldAm = StringConstants.fieldHx;
                                            ClientData.fieldAx = StringConstants.fieldHi;
                                            ClientData.fieldAl = -226132337;
                                            ClientData.fieldAg = 0;
                                        } else {
                                            ClientData.fieldAq = StringConstants.fieldHt;
                                            ClientData.fieldAm = StringConstants.fieldHm;
                                            ClientData.fieldAx = StringConstants.fieldHk;
                                            ClientData.fieldAl = -452264674;
                                            ClientData.fieldAg = 0;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (1 == ClientData.fieldAl * -250617745) {
                        while (classDc.method276(-1674300467)) {
                            if (GroundItem.fieldCh * 365866549 == 84) {
                                if (var1 <= -265663055) {
                                    throw new IllegalStateException();
                                }

                                ClientData.fieldAq = StringConstants.fieldHt;
                                ClientData.fieldAm = StringConstants.fieldHm;
                                ClientData.fieldAx = StringConstants.fieldHk;
                                ClientData.fieldAl = -452264674;
                                ClientData.fieldAg = 0;
                            } else if (GroundItem.fieldCh * 365866549 == 13) {
                                if (var1 <= -265663055) {
                                    throw new IllegalStateException();
                                }

                                ClientData.fieldAl = 0;
                            }
                        }

                        var15 = 302;
                        var6 = 321;
                        if (var12 == 1) {
                            if (var1 <= -265663055) {
                                return;
                            }

                            if (var3 >= var15 - 75) {
                                if (var1 <= -265663055) {
                                    throw new IllegalStateException();
                                }

                                if (var3 <= var15 + 75) {
                                    if (var1 <= -265663055) {
                                        throw new IllegalStateException();
                                    }

                                    if (var4 >= var6 - 20) {
                                        if (var1 <= -265663055) {
                                            return;
                                        }

                                        if (var4 <= var6 + 20) {
                                            ClientData.fieldAq = StringConstants.fieldHt;
                                            ClientData.fieldAm = StringConstants.fieldHm;
                                            ClientData.fieldAx = StringConstants.fieldHk;
                                            ClientData.fieldAl = -452264674;
                                            ClientData.fieldAg = 0;
                                        }
                                    }
                                }
                            }
                        }

                        var15 = 462;
                        if (var12 == 1) {
                            if (var1 <= -265663055) {
                                throw new IllegalStateException();
                            }

                            if (var3 >= var15 - 75) {
                                if (var1 <= -265663055) {
                                    throw new IllegalStateException();
                                }

                                if (var3 <= var15 + 75) {
                                    if (var1 <= -265663055) {
                                        throw new IllegalStateException();
                                    }

                                    if (var4 >= var6 - 20) {
                                        if (var1 <= -265663055) {
                                            throw new IllegalStateException();
                                        }

                                        if (var4 <= var6 + 20) {
                                            if (var1 <= -265663055) {
                                                return;
                                            }

                                            ClientData.fieldAl = 0;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        UnknownEnum1 unknownEnum1;
                        if (2 == ClientData.fieldAl * -250617745) {
                            var15 = 231;
                            int var16 = var15 + 30;
                            if (1 == var12 && var4 >= var16 - 15 && var4 < var16) {
                                ClientData.fieldAg = 0;
                            }
                            var16 += 15;
                            if (var12 == 1 && var4 >= var16 - 15 && var4 < var16) {
                                ClientData.fieldAg = -1990734877;
                            }

                            var16 += 15;
                            var6 = 302;
                            short var7 = 321;
                            if (var12 == 1 && var3 >= var6 - 75 && var3 <= 75 + var6 && var4 >= var7 - 20 && var4 <= var7 + 20) {
                                ClientData.username = ClientData.username.trim();
                                if (ClientData.username.length() == 0) {
                                    ItemTable.setLoginErrorStrings(StringConstants.fieldDv, StringConstants.fieldDt, StringConstants.fieldDl, (byte) -70);
                                    return;
                                }

                                if (ClientData.password.length() == 0) {
                                    ItemTable.setLoginErrorStrings(StringConstants.fieldDs, StringConstants.fieldDc, StringConstants.fieldDn, (byte) 18);
                                    return;
                                }

                                ItemTable.setLoginErrorStrings(StringConstants.fieldHj, StringConstants.fieldHu, StringConstants.fieldHn, (byte) -32);
                                if (Projectile.preferences.map.containsKey(Integer.valueOf(UtilClass39.method173(ClientData.username, (byte) 64)))) {
                                    unknownEnum1 = UnknownEnum1.THREE_ZERO;
                                } else {
                                    unknownEnum1 = UnknownEnum1.TWO_TWO;
                                }

                                ClientData.fieldAa = unknownEnum1;
                                UnknownEnum.method373(20, (byte) -13);
                                return;
                            }

                            var6 = 462;
                            if (var12 == 1) {
                                if (var1 <= -265663055) {
                                    throw new IllegalStateException();
                                }

                                if (var3 >= var6 - 75) {
                                    if (var1 <= -265663055) {
                                        throw new IllegalStateException();
                                    }

                                    if (var3 <= var6 + 75) {
                                        if (var1 <= -265663055) {
                                            return;
                                        }

                                        if (var4 >= var7 - 20 && var4 <= var7 + 20) {
                                            if (var1 <= -265663055) {
                                                throw new IllegalStateException();
                                            }

                                            ClientData.fieldAl = 0;
                                            ClientData.username = "faggot";
                                            ClientData.password = "ok";
                                            LandscapeTile.fieldAt = 0;
                                            classAi.fieldAw = "";
                                            ClientData.fieldAo = true;
                                        }
                                    }
                                }
                            }

                            while (classDc.method276(-2072543731)) {
                                if (var1 <= -265663055) {
                                    return;
                                }

                                boolean var8 = false;

                                for (int var9 = 0; var9 < ClientData.fieldAd.length(); ++var9) {
                                    if (ClanMate.fieldCb == ClientData.fieldAd.charAt(var9)) {
                                        var8 = true;
                                        break;
                                    }
                                }

                                if (GroundItem.fieldCh * 365866549 == 13) {
                                    if (var1 <= -265663055) {
                                        throw new IllegalStateException();
                                    }

                                    ClientData.fieldAl = 0;
                                    ClientData.username = "faggot";
                                    ClientData.password = "ok";
                                    LandscapeTile.fieldAt = 0;
                                    classAi.fieldAw = "";
                                    ClientData.fieldAo = true;
                                } else if (0 == ClientData.fieldAg * 2079314379) {
                                    if (var1 <= -265663055) {
                                        return;
                                    }

                                    if (85 == GroundItem.fieldCh * 365866549) {
                                        if (var1 <= -265663055) {
                                            throw new IllegalStateException();
                                        }

                                        if (ClientData.username.length() > 0) {
                                            if (var1 <= -265663055) {
                                                throw new IllegalStateException();
                                            }

                                            ClientData.username = ClientData.username.substring(0, ClientData.username.length() - 1);
                                        }
                                    }

                                    label821:
                                    {
                                        if (GroundItem.fieldCh * 365866549 != 84) {
                                            if (var1 <= -265663055) {
                                                return;
                                            }

                                            if (80 != GroundItem.fieldCh * 365866549) {
                                                break label821;
                                            }
                                        }

                                        ClientData.fieldAg = -1990734877;
                                    }

                                    if (var8) {
                                        if (var1 <= -265663055) {
                                            throw new IllegalStateException();
                                        }

                                        if (ClientData.username.length() < 320) {
                                            ClientData.username = ClientData.username + ClanMate.fieldCb;
                                        }
                                    }
                                } else if (ClientData.fieldAg * 2079314379 == 1) {
                                    if (var1 <= -265663055) {
                                        return;
                                    }

                                    if (GroundItem.fieldCh * 365866549 == 85 && ClientData.password.length() > 0) {
                                        if (var1 <= -265663055) {
                                            throw new IllegalStateException();
                                        }

                                        ClientData.password = ClientData.password.substring(0, ClientData.password.length() - 1);
                                    }

                                    label832:
                                    {
                                        if (84 != GroundItem.fieldCh * 365866549) {
                                            if (80 != GroundItem.fieldCh * 365866549) {
                                                break label832;
                                            }

                                            if (var1 <= -265663055) {
                                                return;
                                            }
                                        }

                                        ClientData.fieldAg = 0;
                                    }

                                    if (84 == GroundItem.fieldCh * 365866549) {
                                        if (var1 <= -265663055) {
                                            return;
                                        }

                                        ClientData.username = ClientData.username.trim();
                                        if (ClientData.username.length() == 0) {
                                            ItemTable.setLoginErrorStrings(StringConstants.fieldDv, StringConstants.fieldDt, StringConstants.fieldDl, (byte) -25);
                                            return;
                                        }

                                        if (ClientData.password.length() == 0) {
                                            ItemTable.setLoginErrorStrings(StringConstants.fieldDs, StringConstants.fieldDc, StringConstants.fieldDn, (byte) 49);
                                            return;
                                        }

                                        ItemTable.setLoginErrorStrings(StringConstants.fieldHj, StringConstants.fieldHu, StringConstants.fieldHn, (byte) 16);
                                        if (Projectile.preferences.map.containsKey(Integer.valueOf(UtilClass39.method173(ClientData.username, (byte) 64)))) {
                                            if (var1 <= -265663055) {
                                                return;
                                            }

                                            unknownEnum1 = UnknownEnum1.THREE_ZERO;
                                        } else {
                                            unknownEnum1 = UnknownEnum1.TWO_TWO;
                                        }

                                        ClientData.fieldAa = unknownEnum1;
                                        UnknownEnum.method373(20, (byte) -45);
                                        return;
                                    }

                                    if (var8) {
                                        if (var1 <= -265663055) {
                                            return;
                                        }

                                        if (ClientData.password.length() < 20) {
                                            if (var1 <= -265663055) {
                                                throw new IllegalStateException();
                                            }

                                            ClientData.password = ClientData.password + ClanMate.fieldCb;
                                        }
                                    }
                                }
                            }
                        } else if (ClientData.fieldAl * -250617745 == 4) {
                            if (var1 <= -265663055) {
                                throw new IllegalStateException();
                            }

                            var15 = 302;
                            var6 = 321;
                            if (1 == var12) {
                                if (var1 <= -265663055) {
                                    throw new IllegalStateException();
                                }

                                if (var3 >= var15 - 75) {
                                    if (var1 <= -265663055) {
                                        throw new IllegalStateException();
                                    }

                                    if (var3 <= var15 + 75) {
                                        if (var1 <= -265663055) {
                                            throw new IllegalStateException();
                                        }

                                        if (var4 >= var6 - 20) {
                                            if (var1 <= -265663055) {
                                                throw new IllegalStateException();
                                            }

                                            if (var4 <= var6 + 20) {
                                                if (var1 <= -265663055) {
                                                    return;
                                                }

                                                classAi.fieldAw.trim();
                                                if (classAi.fieldAw.length() != 6) {
                                                    if (var1 <= -265663055) {
                                                        throw new IllegalStateException();
                                                    }

                                                    ItemTable.setLoginErrorStrings(StringConstants.fieldAq, StringConstants.fieldAm, StringConstants.fieldAx, (byte) 6);
                                                    return;
                                                }

                                                LandscapeTile.fieldAt = Integer.parseInt(classAi.fieldAw) * -238878273;
                                                classAi.fieldAw = "";
                                                if (ClientData.fieldAo) {
                                                    if (var1 <= -265663055) {
                                                        throw new IllegalStateException();
                                                    }

                                                    unknownEnum1 = UnknownEnum1.ZERO_ONE;
                                                } else {
                                                    unknownEnum1 = UnknownEnum1.ONE_THREE;
                                                }

                                                ClientData.fieldAa = unknownEnum1;
                                                ItemTable.setLoginErrorStrings(StringConstants.fieldHj, StringConstants.fieldHu, StringConstants.fieldHn, (byte) 5);
                                                UnknownEnum.method373(20, (byte) -67);
                                                return;
                                            }
                                        }
                                    }
                                }
                            }

                            if (1 == var12) {
                                if (var1 <= -265663055) {
                                    throw new IllegalStateException();
                                }

                                if (var3 >= 373) {
                                    if (var1 <= -265663055) {
                                        throw new IllegalStateException();
                                    }

                                    if (var3 <= 512) {
                                        if (var1 <= -265663055) {
                                            return;
                                        }

                                        if (var4 >= 263) {
                                            if (var1 <= -265663055) {
                                                throw new IllegalStateException();
                                            }

                                            if (var4 <= 296) {
                                                if (var1 <= -265663055) {
                                                    throw new IllegalStateException();
                                                }

                                                ClientData.fieldAo = !ClientData.fieldAo;
                                            }
                                        }
                                    }
                                }
                            }

                            if (var12 == 1) {
                                if (var1 <= -265663055) {
                                    return;
                                }

                                if (var3 >= 348 && var3 <= 416) {
                                    if (var1 <= -265663055) {
                                        throw new IllegalStateException();
                                    }

                                    if (var4 >= 351) {
                                        if (var1 <= -265663055) {
                                            return;
                                        }

                                        if (var4 <= 363) {
                                            if (var1 <= -265663055) {
                                                throw new IllegalStateException();
                                            }

                                            RuneScript.method162(World.method179("secure", true, -692904070) + "m=totp-authenticator/disableTOTPRequest", true, false, 1936005723);
                                        }
                                    }
                                }
                            }

                            var15 = 462;
                            if (var12 == 1) {
                                if (var1 <= -265663055) {
                                    throw new IllegalStateException();
                                }

                                if (var3 >= var15 - 75) {
                                    if (var1 <= -265663055) {
                                        return;
                                    }

                                    if (var3 <= 75 + var15) {
                                        if (var1 <= -265663055) {
                                            throw new IllegalStateException();
                                        }

                                        if (var4 >= var6 - 20) {
                                            if (var1 <= -265663055) {
                                                throw new IllegalStateException();
                                            }

                                            if (var4 <= var6 + 20) {
                                                if (var1 <= -265663055) {
                                                    return;
                                                }

                                                ClientData.fieldAl = 0;
                                                ClientData.username = "faggot";
                                                ClientData.password = "ok";
                                                LandscapeTile.fieldAt = 0;
                                                classAi.fieldAw = "";
                                            }
                                        }
                                    }
                                }
                            }

                            while (classDc.method276(-2086775672)) {
                                if (var1 <= -265663055) {
                                    throw new IllegalStateException();
                                }

                                boolean var17 = false;

                                for (int var18 = 0; var18 < ClientData.fieldAu.length(); ++var18) {
                                    if (var1 <= -265663055) {
                                        throw new IllegalStateException();
                                    }

                                    if (ClanMate.fieldCb == ClientData.fieldAu.charAt(var18)) {
                                        if (var1 <= -265663055) {
                                            throw new IllegalStateException();
                                        }

                                        var17 = true;
                                        break;
                                    }
                                }

                                if (GroundItem.fieldCh * 365866549 == 13) {
                                    if (var1 <= -265663055) {
                                        throw new IllegalStateException();
                                    }

                                    ClientData.fieldAl = 0;
                                    ClientData.username = "faggot";
                                    ClientData.password = "ok";
                                    LandscapeTile.fieldAt = 0;
                                    classAi.fieldAw = "";
                                } else {
                                    if (85 == GroundItem.fieldCh * 365866549) {
                                        if (var1 <= -265663055) {
                                            return;
                                        }

                                        if (classAi.fieldAw.length() > 0) {
                                            if (var1 <= -265663055) {
                                                throw new IllegalStateException();
                                            }

                                            classAi.fieldAw = classAi.fieldAw.substring(0, classAi.fieldAw.length() - 1);
                                        }
                                    }

                                    if (84 == GroundItem.fieldCh * 365866549) {
                                        if (var1 <= -265663055) {
                                            throw new IllegalStateException();
                                        }

                                        classAi.fieldAw.trim();
                                        if (classAi.fieldAw.length() != 6) {
                                            if (var1 <= -265663055) {
                                                throw new IllegalStateException();
                                            }

                                            ItemTable.setLoginErrorStrings(StringConstants.fieldAq, StringConstants.fieldAm, StringConstants.fieldAx, (byte) 71);
                                            return;
                                        }

                                        LandscapeTile.fieldAt = Integer.parseInt(classAi.fieldAw) * -238878273;
                                        classAi.fieldAw = "";
                                        if (ClientData.fieldAo) {
                                            if (var1 <= -265663055) {
                                                return;
                                            }

                                            unknownEnum1 = UnknownEnum1.ZERO_ONE;
                                        } else {
                                            unknownEnum1 = UnknownEnum1.ONE_THREE;
                                        }

                                        ClientData.fieldAa = unknownEnum1;
                                        ItemTable.setLoginErrorStrings(StringConstants.fieldHj, StringConstants.fieldHu, StringConstants.fieldHn, (byte) -10);
                                        UnknownEnum.method373(20, (byte) -95);
                                        return;
                                    }

                                    if (var17 && classAi.fieldAw.length() < 6) {
                                        if (var1 <= -265663055) {
                                            throw new IllegalStateException();
                                        }

                                        classAi.fieldAw = classAi.fieldAw + ClanMate.fieldCb;
                                    }
                                }
                            }
                        }
                    }

                }
            }
        } catch (RuntimeException var10) {
            throw ClanMate.error(var10, "da.v(" + ')');
        }
    }

    static final void method281(int var0, int var1, int var2, byte var3) {
        try {
            int var4;
            for (var4 = 0; var4 < 8; ++var4) {
                if (var3 == 2) {
                    return;
                }

                for (int var5 = 0; var5 < 8; ++var5) {
                    if (var3 == 2) {
                        throw new IllegalStateException();
                    }

                    classM.tileHeights[var0][var4 + var1][var2 + var5] = 0;
                }
            }

            if (var1 > 0) {
                if (var3 == 2) {
                    return;
                }

                for (var4 = 1; var4 < 8; ++var4) {
                    if (var3 == 2) {
                        throw new IllegalStateException();
                    }

                    classM.tileHeights[var0][var1][var4 + var2] = classM.tileHeights[var0][var1 - 1][var2 + var4];
                }
            }

            if (var2 > 0) {
                if (var3 == 2) {
                    throw new IllegalStateException();
                }

                for (var4 = 1; var4 < 8; ++var4) {
                    if (var3 == 2) {
                        throw new IllegalStateException();
                    }

                    classM.tileHeights[var0][var4 + var1][var2] = classM.tileHeights[var0][var4 + var1][var2 - 1];
                }
            }

            if (var1 > 0 && classM.tileHeights[var0][var1 - 1][var2] != 0) {
                if (var3 == 2) {
                    throw new IllegalStateException();
                }

                classM.tileHeights[var0][var1][var2] = classM.tileHeights[var0][var1 - 1][var2];
            } else {
                if (var2 > 0) {
                    if (var3 == 2) {
                        throw new IllegalStateException();
                    }

                    if (classM.tileHeights[var0][var1][var2 - 1] != 0) {
                        if (var3 == 2) {
                            throw new IllegalStateException();
                        }

                        classM.tileHeights[var0][var1][var2] = classM.tileHeights[var0][var1][var2 - 1];
                        return;
                    }
                }

                if (var1 > 0 && var2 > 0 && classM.tileHeights[var0][var1 - 1][var2 - 1] != 0) {
                    if (var3 == 2) {
                        return;
                    }

                    classM.tileHeights[var0][var1][var2] = classM.tileHeights[var0][var1 - 1][var2 - 1];
                }
            }

        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "da.b(" + ')');
        }
    }

    public static void method282(Buffer var0, int var1, int var2) {
        try {
            if (null != UtilClass19.fieldK) {
                if (var2 <= -779051372) {
                    return;
                }

                try {
                    UtilClass19.fieldK.v(0L);
                    UtilClass19.fieldK.w(var0.payload, var1, 24, 2127967187);
                } catch (Exception var4) {
                    ;
                }
            }

        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "da.l(" + ')');
        }
    }

    abstract int i(int var1, int var2, int var3);

    public abstract void v(byte var1);
}
