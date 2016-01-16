package com.jagex;

public final class TileDecoration {

    public int uid;
    public Renderable deco;
    int height;
    int strictX;
    int strictY;
    int cfg;

    static final void method352(byte var0) {
        try {
            classBx.method250(Client.widgetDragSource, 57574739);
            Preferences.fieldKi += -107873329;
            if (Client.fieldKb) {
                if (var0 != 20) {
                    throw new IllegalStateException();
                }

                if (Client.fieldJw) {
                    int var1 = Mouse.fieldW * 518596439;
                    int var2 = Mouse.fieldE * 1747296693;
                    var1 -= Client.fieldJd * 885034945;
                    var2 -= Client.fieldJf * -2011358707;
                    if (var1 < Client.fieldJs * 1629348553) {
                        if (var0 != 20) {
                            throw new IllegalStateException();
                        }

                        var1 = Client.fieldJs * 1629348553;
                    }

                    if (Client.widgetDragSource.width * 805002637 + var1 > Client.fieldJl.width * 805002637 + Client.fieldJs * 1629348553) {
                        if (var0 != 20) {
                            throw new IllegalStateException();
                        }

                        var1 = Client.fieldJs * 1629348553 + Client.fieldJl.width * 805002637 - Client.widgetDragSource.width * 805002637;
                    }

                    if (var2 < Client.fieldJm * -1831691069) {
                        if (var0 != 20) {
                            throw new IllegalStateException();
                        }

                        var2 = Client.fieldJm * -1831691069;
                    }

                    if (Client.widgetDragSource.height * -1004717071 + var2 > Client.fieldJl.height * -1004717071 + Client.fieldJm * -1831691069) {
                        if (var0 != 20) {
                            throw new IllegalStateException();
                        }

                        var2 = Client.fieldJm * -1831691069 + Client.fieldJl.height * -1004717071 - Client.widgetDragSource.height * -1004717071;
                    }

                    int var3 = var1 - Client.fieldKr * 2012874811;
                    int var4 = var2 - Client.fieldKn * 1515408157;
                    int var5 = 1570119341 * Client.widgetDragSource.fieldBh;
                    if (Preferences.fieldKi * -815191249 > -2062691267 * Client.widgetDragSource.fieldBj) {
                        label184:
                        {
                            if (var0 != 20) {
                                throw new IllegalStateException();
                            }

                            if (var3 <= var5) {
                                if (var0 != 20) {
                                    throw new IllegalStateException();
                                }

                                if (var3 >= -var5) {
                                    if (var0 != 20) {
                                        return;
                                    }

                                    if (var4 <= var5 && var4 >= -var5) {
                                        break label184;
                                    }
                                }
                            }

                            Client.fieldKz = true;


                        }
                    }

                    int var6 = 531263513 * Client.fieldJl.insetX + (var1 - Client.fieldJs * 1629348553);
                    int var7 = -1991825281 * Client.fieldJl.insetY + (var2 - Client.fieldJm * -1831691069);
                    ScriptEvent var8;
                    if (Client.widgetDragSource.fieldCh != null) {
                        if (var0 != 20) {
                            return;
                        }

                        if (Client.fieldKz) {
                            if (var0 != 20) {
                                throw new IllegalStateException();
                            }

                            var8 = new ScriptEvent();
                            var8.src = Client.widgetDragSource;
                            var8.mouseX = -2120885821 * var6;
                            var8.mouseY = var7 * -2120063431;
                            var8.args = Client.widgetDragSource.fieldCh;
                            classT.method167(var8, (byte) 1);
                        }
                    }

                    if (Mouse.fieldM * -2003697211 == 0) {
                        if (var0 != 20) {
                            return;
                        }

                        if (Client.fieldKz) {
                            if (var0 != 20) {
                                return;
                            }


                            if (Client.widgetDragSource.fieldCn != null) {
                                var8 = new ScriptEvent();
                                var8.src = Client.widgetDragSource;
                                var8.mouseX = var6 * -2120885821;
                                var8.mouseY = var7 * -2120063431;
                                var8.fieldW = Client.dragTarget;
                                var8.args = Client.widgetDragSource.fieldCn;
                                classT.method167(var8, (byte) 1);
                            }

                            if (Client.dragTarget != null) {
                                if (var0 != 20) {
                                    throw new IllegalStateException();
                                }

                                if (RuneScript.method164(Client.widgetDragSource, -1307662494) != null) {
                                    if (var0 != 20) {
                                        return;
                                    }

                                    Client.fieldCo.writePacketHeader(127, (byte) 0);
                                    Client.fieldCo.writeLittleEndianShort(Client.dragTarget.index * 1176560255, 1937827871);
                                    Client.fieldCo.af(-5424365 * Client.dragTarget.itemId);
                                    Client.fieldCo.writeInt(-1866039137 * Client.dragTarget.id);
                                    Client.fieldCo.writeLittleEndianShort(-5424365 * Client.widgetDragSource.itemId, 1941333858);
                                    Client.fieldCo.bi(Client.widgetDragSource.id * -1866039137, (byte) -65);
                                    Client.fieldCo.ak(1176560255 * Client.widgetDragSource.index, 1078918573);
                                }
                            }
                        } else {
                            label151:
                            {
                                label150:
                                {
                                    if (Client.fieldHc * -283472751 != 1) {
                                        if (var0 != 20) {
                                            return;
                                        }

                                        if (!InputHandler.method86(Client.menuRowCount * 445599935 - 1, -959053341)) {
                                            break label150;
                                        }

                                        if (var0 != 20) {
                                            throw new IllegalStateException();
                                        }
                                    }

                                    if (Client.menuRowCount * 445599935 > 2) {
                                        UtilClass14.openMenu(Client.fieldKr * 2012874811 + Client.fieldJd * 885034945, Client.fieldJf * -2011358707 + Client.fieldKn * 1515408157, -1023681704);
                                        break label151;
                                    }
                                }

                                if (Client.menuRowCount * 445599935 > 0) {
                                    if (var0 != 20) {
                                        return;
                                    }

                                    int var11 = Client.fieldKr * 2012874811 + Client.fieldJd * 885034945;
                                    int var9 = Client.fieldJf * -2011358707 + Client.fieldKn * 1515408157;
                                    ClanMate.method193(Projectile.menuItem, var11, var9, 1575290118);
                                    Projectile.menuItem = null;
                                }
                            }
                        }

                        Client.widgetDragSource = null;
                    }

                    return;
                }

                if (var0 != 20) {
                    throw new IllegalStateException();
                }
            }

            if (Preferences.fieldKi * -815191249 > 1) {
                if (var0 != 20) {
                    throw new IllegalStateException();
                }

                Client.widgetDragSource = null;
            }

        } catch (RuntimeException var10) {
            throw ClanMate.error(var10, "cd.cx(" + ')');
        }
    }

    static final void loadPlayersIntoLandscape(UnknownEnum var0, int DUMMY) {
        try {

            if (Client.myPlayer.strictX * 404428603 >> 7 == Client.destinationX * 1192318035) {
                if (Client.destinationY * 1715520267 == -1490664571 * Client.myPlayer.strictY >> 7) {
                    Client.destinationX = 0;
                }
            }

            int var2;
            label195:
            {
                var2 = Client.playerCount * 16022533;
                if (UnknownEnum.UNKNOWN0 != var0 && var0 != UnknownEnum.UNKNOWN3) {
                    break label195;
                }
                var2 = 1;
            }

            for (int var3 = 0; var3 < var2; ++var3) {
                Player player;
                int uid;
                if (var0 == UnknownEnum.UNKNOWN0) {
                    player = Client.myPlayer;
                    uid = 2047 << 14;
                } else if (var0 == UnknownEnum.UNKNOWN3) {
                    player = Client.players[Client.fieldHy * -1480489931];
                    uid = Client.fieldHy * -1480489931 << 14;
                    System.out.println(player.name);
                } else {
                    player = Client.players[Client.playerIndicies[var3]];
                    uid = Client.playerIndicies[var3] << 14;
                    if (UnknownEnum.UNKNOWN2 == var0 && Client.fieldHy * -1480489931 == Client.playerIndicies[var3]) {
                        continue;
                    }
                }

                if (player != null) {
                    if (DUMMY <= 417507353) {
                        throw new IllegalStateException();
                    }

                    if (player.isValid(217840711)) {
                        if (!player.hidden) {
                            label171:
                            {
                                label203:
                                {
                                    player.noTransform = false;
                                    if (Client.lowMemory && Client.playerCount * 16022533 > 50) {
                                        break label203;
                                    }
                                    if (Client.playerCount * 16022533 <= 200) {
                                        break label171;
                                    }
                                }
                                if (var0 != UnknownEnum.UNKNOWN0 && player.fieldAc * -1420731557 == player.fieldC * -1367515705) {
                                    player.noTransform = true;
                                }
                            }

                            int var6 = player.strictX * 404428603 >> 7;
                            int var7 = player.strictY * -1490664571 >> 7;
                            if (var6 >= 0) {
                                if (var6 < 104) {
                                    if (var7 >= 0) {
                                        if (var7 < 104) {
                                            if (player.transformObjModel != null && Client.engineCycle * -1223223371 >= player.objTransformStartCycle * -1732723403) {
                                                if (Client.engineCycle * -1223223371 < player.objTransformEndCycle * 2084005499) {
                                                    player.noTransform = false;
                                                    player.height = Landscape.getTileHeight(player.strictX * 404428603, player.strictY * -1490664571, Client.floorLevel * 87713183) * -29370009;
                                                    Client.landscape.addPlayerMarker(Client.floorLevel * 87713183, player.strictX * 404428603, player.strictY * -1490664571, player.height * -804179369,
                                                            60, player, player.orientation * -422817855, uid, player.objRegionX * 71260839, player.objRegionY * 1226301173, player.objMaxRegionX * 569316219, player.objMaxRegionY * -983826135);
                                                    continue;
                                                }
                                            }

                                            if ((player.strictX * 404428603 & 127) == 64) { //Center of the tile
                                                if ((player.strictY * -1490664571 & 127) == 64) { // Center of the tile
                                                    if (Client.fieldGf * 1276134057 == Client.fieldGe[var6][var7]) {
                                                        continue;
                                                    }
                                                    Client.fieldGe[var6][var7] = Client.fieldGf * 1276134057;
                                                }
                                            }

                                            player.height = Landscape.getTileHeight(player.strictX * 404428603, player.strictY * -1490664571, Client.floorLevel * 87713183) * -29370009;
                                            Client.landscape.addNpcEntityMarker(Client.floorLevel * 87713183, player.strictX * 404428603, player.strictY * -1490664571, player.height * -804179369, 60, player, player.orientation * -422817855, uid, player.fieldR);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

        } catch (RuntimeException var8) {
            throw ClanMate.error(var8, "cd.am(" + ')');
        }
    }

    public static void method354(String[] var0, short[] var1, int var2, int var3, byte var4) {
        try {
            if (var2 < var3) {
                if (var4 != 2) {
                    return;
                }

                int var5 = (var3 + var2) / 2;
                int var6 = var2;
                String var7 = var0[var5];
                var0[var5] = var0[var3];
                var0[var3] = var7;
                short var8 = var1[var5];
                var1[var5] = var1[var3];
                var1[var3] = var8;

                for (int var9 = var2; var9 < var3; ++var9) {
                    if (var7 != null) {
                        if (var4 != 2) {
                            throw new IllegalStateException();
                        }

                        if (null == var0[var9]) {
                            continue;
                        }

                        if (var4 != 2) {
                            throw new IllegalStateException();
                        }

                        if (var0[var9].compareTo(var7) >= (var9 & 1)) {
                            continue;
                        }

                        if (var4 != 2) {
                            throw new IllegalStateException();
                        }
                    }

                    String var10 = var0[var9];
                    var0[var9] = var0[var6];
                    var0[var6] = var10;
                    short var11 = var1[var9];
                    var1[var9] = var1[var6];
                    var1[var6++] = var11;
                }

                var0[var3] = var0[var6];
                var0[var6] = var7;
                var1[var3] = var1[var6];
                var1[var6] = var8;
                method354(var0, var1, var2, var6 - 1, (byte) 2);
                method354(var0, var1, var6 + 1, var3, (byte) 2);
            }

        } catch (RuntimeException var12) {
            throw ClanMate.error(var12, "cd.a(" + ')');
        }
    }

}
