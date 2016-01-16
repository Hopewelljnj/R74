package com.jagex;

public abstract class Character extends Renderable {


    public static int counter = 0;
    public static int counter2 = 0;

    static int fieldIz;
    int fieldBf;
    int strictY;
    int fieldAp = 0;
    boolean fieldAx = false;
    int fieldZ = 1064164619;
    int fieldC = -2135249911;
    int fieldAn = 1311650547;
    int fieldAs = -1825575703;
    int[] queueY = new int[10];
    int fieldAr = -839425765;
    int fieldAe = 207366633;
    int fieldBb;
    int fieldAl = -805153131;
    String overheadText = null;
    int fieldCt = 0;
    boolean fieldR = false;
    int fieldAz = -1796329884;
    int fieldAi = 0;
    int fieldAh = -83690551;
    int[] hitsplatDamage = new int[4];
    boolean fieldAm;
    int fieldBe;
    int fieldBi = 0;
    int health;
    int maxHealth;
    int fieldAf = 0;
    int fieldAb = 0;
    int fieldAc = -1625775315;
    int targetIndex = -2015474651;
    int fieldAy = 0;
    int animation = 1079449139;
    int fieldBo = 0;
    int[] hitsplatCycles = new int[4];
    int animationDelay = 0;
    int fieldBl = 0;
    int fieldBx = 0;
    int fieldBw = 0;
    int fieldBm = 0;
    int fieldBz;
    int fieldBr;
    int healthBarCycle = 1721192888;
    int orientation;
    int fieldBc;
    int fieldBk;
    int fieldAa = 0;
    int fieldBg;
    int fieldBt;
    int fieldBn = 2119363496;
    int objOrientation;
    int fieldBa = 0;
    int rotation = -808843424;
    int queueSize = 0;
    int fieldAv = 5089843;
    boolean[] queueTraversed = new boolean[10];
    int[] hitplatType = new int[4];
    int fieldCr = 0;
    int strictX;
    int fieldBp = -1712363827;
    int[] queueX = new int[10];

    static final void drawInterface(Widget[] children, int var1, int var2, int var3, int var4, int var5, int deltaX, int deltaY, int var8, int DUMMY) {
        try {
            RSGraphics.method231(var2, var3, var4, var5);
            RSGraphics2D.method309();

            for (int var10 = 0; var10 < children.length; ++var10) {
                Widget widget = children[var10];
                if (widget != null) {
                    if (widget.fieldP * 1574594539 != var1 && (var1 != -1412584499 || Client.widgetDragSource != widget)) {
                        continue;
                    }
                    int var12;
                    if (var8 == -1) {
                        Client.fieldLu[Client.fieldLj * -1726837317] = widget.relativeX * -1209469007 + deltaX;
                        Client.fieldLa[Client.fieldLj * -1726837317] = deltaY + widget.relativeY * -493238439;
                        Client.fieldLq[Client.fieldLj * -1726837317] = widget.width * 805002637;
                        Client.fieldLf[Client.fieldLj * -1726837317] = widget.height * -1004717071;
                        var12 = (Client.fieldLj += -786485389) * -1726837317 - 1;
                    } else {
                        var12 = var8;
                    }

                    widget.fieldDm = -18162491 * var12;
                    widget.fieldEt = Client.engineCycle * -832670457;
                    if (widget.fieldK && Player.method144(widget, (byte) 63)) {
                        continue;
                    }
                    if (widget.contentType * 481950881 > 0) {
                        ItemPile.method337(widget);
                    }
                    int var13 = deltaX + widget.relativeX * -1209469007;
                    int var14 = deltaY + widget.relativeY * -493238439;
                    int var15 = widget.fieldAq * -1495660725;
                    int var16;
                    int var17;
                    if (widget == Client.widgetDragSource) {
                        if (-1412584499 != var1 && !widget.fieldBy) {
                            Preferences.fieldKh = children;
                            MessageContainer.fieldKm = deltaX * -1815503243;
                            Player.fieldKq = deltaY * -1236263703;
                            continue;
                        }

                        if (Client.fieldKz && Client.fieldJw) {
                            var16 = Mouse.fieldW * 518596439;
                            var17 = Mouse.fieldE * 1747296693;
                            var16 -= Client.fieldJd * 885034945;
                            var17 -= Client.fieldJf * -2011358707;
                            if (var16 < Client.fieldJs * 1629348553) {
                                var16 = Client.fieldJs * 1629348553;
                            }

                            if (widget.width * 805002637 + var16 > Client.fieldJl.width * 805002637 + Client.fieldJs * 1629348553) {
                                var16 = 805002637 * Client.fieldJl.width + Client.fieldJs * 1629348553 - widget.width * 805002637;
                            }

                            if (var17 < Client.fieldJm * -1831691069) {
                                var17 = Client.fieldJm * -1831691069;
                            }

                            if (var17 + widget.height * -1004717071 > -1004717071 * Client.fieldJl.height + Client.fieldJm * -1831691069) {
                                var17 = Client.fieldJm * -1831691069 + -1004717071 * Client.fieldJl.height - widget.height * -1004717071;
                            }

                            var13 = var16;
                            var14 = var17;
                        }

                        if (!widget.fieldBy) {
                            var15 = 128;
                        }
                    }

                    int var10000;
                    int var18;
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (widget.type * -729517859 == 2) {
                        var16 = var2;
                        var17 = var3;
                        var18 = var4;
                        var19 = var5;
                    } else if (widget.type * -729517859 == 9) {
                        var20 = var13;
                        var21 = var14;
                        var22 = widget.width * 805002637 + var13;
                        var23 = widget.height * -1004717071 + var14;
                        if (var22 < var13) {
                            var20 = var22;
                            var22 = var13;
                        }

                        if (var23 < var14) {
                            var21 = var23;
                            var23 = var14;
                        }

                        ++var22;
                        ++var23;
                        if (var20 > var2) {
                            var10000 = var20;
                        } else {
                            var10000 = var2;
                        }

                        var16 = var10000;
                        if (var21 > var3) {
                            var10000 = var21;
                        } else {
                            var10000 = var3;
                        }

                        var17 = var10000;
                        if (var22 < var4) {
                            var10000 = var22;
                        } else {
                            var10000 = var4;
                        }

                        var18 = var10000;
                        if (var23 < var5) {
                            var10000 = var23;
                        } else {
                            var10000 = var5;
                        }

                        var19 = var10000;
                    } else {
                        var20 = widget.width * 805002637 + var13;
                        var21 = var14 + widget.height * -1004717071;
                        var16 = var13 > var2 ? var13 : var2;
                        if (var14 > var3) {
                            var10000 = var14;
                        } else {
                            var10000 = var3;
                        }

                        var17 = var10000;
                        if (var20 < var4) {
                            var10000 = var20;
                        } else {
                            var10000 = var4;
                        }

                        var18 = var10000;
                        if (var21 < var5) {
                            var10000 = var21;
                        } else {
                            var10000 = var5;
                        }

                        var19 = var10000;
                    }

                    if (widget.fieldK && (var16 >= var18 || var17 >= var19)) {
                        continue;
                    }

                    int var24;
                    int var27;
                    int var30;
                    int var31;
                    int var32;
                    int var33;
                    int var34;
                    int var35;
                    int var36;
                    int var42;
                    int var44;
                    int var53;
                    int var55;
                    if (widget.contentType * 481950881 != 0) {
                        if (widget.contentType * 481950881 == 1337) {
                            Client.fieldIo = -1536540027 * var13;
                            Client.fieldIq = 614668789 * var14;
                            var20 = widget.width * 805002637;
                            var21 = widget.height * -1004717071;
                            RSGraphics.method231(var13, var14, var13 + var20, var21 + var14);
                            RSGraphics2D.method309();
                            Client.fieldGf += 852066713;
                            TileDecoration.loadPlayersIntoLandscape(UnknownEnum.UNKNOWN0, 1950363477);
                            boolean var59 = false;

                            if (Client.fieldHy * -1480489931 >= 0) {
                                for (var23 = 0; var23 < Client.playerCount * 16022533; ++var23) {
                                    if (Client.fieldHy * -1480489931 == Client.playerIndicies[var23]) {
                                        var59 = true;
                                        break;
                                    }
                                }
                            }

                            if (var59) {
                                TileDecoration.loadPlayersIntoLandscape(UnknownEnum.UNKNOWN3, 1392790369);
                            }

                            MenuItem.loadNpcsIntoLandscape(true, (byte) 32);
                            TileDecoration.loadPlayersIntoLandscape(var59 ? UnknownEnum.UNKNOWN2 : UnknownEnum.UNKNOWN1, 545632787);
                            MenuItem.loadNpcsIntoLandscape(false, (byte) 44);
                            Player.method145(-1178761680);

                            for (GraphicsStub var67 = (GraphicsStub) Client.fieldHa.next(); null != var67; var67 = (GraphicsStub) Client.fieldHa.tail()) {
                                if (var67.floor * 377135547 == Client.floorLevel * 87713183 && !var67.complete) {
                                    if (Client.engineCycle * -1223223371 >= var67.startCycle * -1933846595) {
                                        var67.a(Client.fieldEo * 1985191041, -1682932678);
                                        if (var67.complete) {
                                            var67.delete();
                                        } else {
                                            Client.landscape.addNpcEntityMarker(var67.floor * 377135547, var67.regionX * 830024077, var67.regionY * -1163942957, var67.height * -2131292077, 60, var67, 0, -1, false);
                                        }
                                    }
                                    continue;
                                }
                                var67.delete();
                            }

                            if (!Client.cameraLocked) {
                                var23 = Client.fieldFe * 81100511;
                                if (Client.fieldFb * 2052546725 / 256 > var23) {
                                    var23 = Client.fieldFb * 2052546725 / 256;
                                }

                                if (Client.fieldOf[4] && 128 + Client.fieldOn[4] > var23) {
                                    var23 = 128 + Client.fieldOn[4];
                                }

                                var24 = Client.fieldDx * -1708699181 + Client.minimapRotation * -422086387 & 2047;
                                var42 = LandscapeMod.fieldFj * 1738154679;
                                var44 = Landscape.getTileHeight(Client.myPlayer.strictX * 404428603, Client.myPlayer.strictY * -1490664571, Client.floorLevel * 87713183) - 50;
                                var27 = UtilClass40.fieldFc * 1210846145;
                                var53 = var23 * 3 + 600;
                                var55 = 2048 - var23 & 2047;
                                var30 = 2048 - var24 & 2047;
                                var31 = 0;
                                var32 = 0;
                                var33 = var53;
                                if (0 != var55) {
                                    var34 = RSGraphics2D.SIN_TABLE[var55];
                                    var35 = RSGraphics2D.COS_TABLE[var55];
                                    var36 = var35 * var32 - var53 * var34 >> 16;
                                    var33 = var35 * var53 + var32 * var34 >> 16;
                                    var32 = var36;
                                }

                                if (var30 != 0) {
                                    var34 = RSGraphics2D.SIN_TABLE[var30];
                                    var35 = RSGraphics2D.COS_TABLE[var30];
                                    var36 = var31 * var35 + var34 * var33 >> 16;
                                    var33 = var35 * var33 - var34 * var31 >> 16;
                                    var31 = var36;
                                }

                                GraphicsStub.cameraX = 892783111 * (var42 - var31);
                                Preferences.cameraZ = 1828163927 * (var44 - var32);
                                classEr.cameraY = 648000149 * (var27 - var33);
                                classAo.pitch = 702658669 * var23;
                                UtilClass11.yaw = 1735563723 * var24;
                            }

                            if (!Client.cameraLocked) {
                                if (Projectile.preferences.roofsEnabled) {
                                    var24 = Client.floorLevel * 87713183;
                                } else {
                                    var42 = 3;
                                    if (classAo.pitch * 362746213 < 310) {
                                        var44 = GraphicsStub.cameraX * 1659667383 >> 7;
                                        var27 = classEr.cameraY * -875394883 >> 7;
                                        var53 = 404428603 * Client.myPlayer.strictX >> 7;
                                        var55 = Client.myPlayer.strictY * -1490664571 >> 7;
                                        if (0 != (classM.renderRules[Client.floorLevel * 87713183][var44][var27] & 4)) {
                                            var42 = Client.floorLevel * 87713183;
                                        }

                                        if (var53 > var44) {
                                            var30 = var53 - var44;
                                        } else {
                                            var30 = var44 - var53;
                                        }

                                        if (var55 > var27) {
                                            var31 = var55 - var27;
                                        } else {
                                            var31 = var27 - var55;
                                        }

                                        if (var30 > var31) {
                                            var32 = var31 * 65536 / var30;
                                            var33 = '\u8000';

                                            while (var44 != var53) {
                                                if (var44 < var53) {
                                                    ++var44;
                                                } else if (var44 > var53) {
                                                    --var44;
                                                }

                                                if ((classM.renderRules[Client.floorLevel * 87713183][var44][var27] & 4) != 0) {
                                                    var42 = Client.floorLevel * 87713183;
                                                }

                                                var33 += var32;
                                                if (var33 >= 65536) {
                                                    var33 -= 65536;
                                                    if (var27 < var55) {
                                                        ++var27;
                                                    } else if (var27 > var55) {
                                                        --var27;
                                                    }

                                                    if ((classM.renderRules[Client.floorLevel * 87713183][var44][var27] & 4) != 0) {
                                                        var42 = Client.floorLevel * 87713183;
                                                    }
                                                }
                                            }
                                        } else {
                                            var32 = var30 * 65536 / var31;
                                            var33 = '\u8000';

                                            while (var27 != var55) {
                                                if (var27 < var55) {
                                                    ++var27;
                                                } else if (var27 > var55) {
                                                    --var27;
                                                }

                                                if (0 != (classM.renderRules[Client.floorLevel * 87713183][var44][var27] & 4)) {
                                                    var42 = Client.floorLevel * 87713183;
                                                }

                                                var33 += var32;
                                                if (var33 >= 65536) {
                                                    var33 -= 65536;
                                                    if (var44 < var53) {
                                                        ++var44;
                                                    } else if (var44 > var53) {
                                                        --var44;
                                                    }

                                                    if (0 != (classM.renderRules[Client.floorLevel * 87713183][var44][var27] & 4)) {
                                                        var42 = Client.floorLevel * 87713183;
                                                    }
                                                }
                                            }
                                        }
                                    }

                                    if ((classM.renderRules[Client.floorLevel * 87713183][404428603 * Client.myPlayer.strictX >> 7][Client.myPlayer.strictY * -1490664571 >> 7] & 4) != 0) {
                                        var42 = Client.floorLevel * 87713183;
                                    }

                                    var24 = var42;
                                }

                                var23 = var24;
                            } else {
                                if (Projectile.preferences.roofsEnabled) {
                                    var24 = Client.floorLevel * 87713183;
                                } else {
                                    var42 = Landscape.getTileHeight(GraphicsStub.cameraX * 1659667383, classEr.cameraY * -875394883, Client.floorLevel * 87713183);
                                    if (var42 - Preferences.cameraZ * 820898407 < 800 && 0 != (classM.renderRules[Client.floorLevel * 87713183][GraphicsStub.cameraX * 1659667383 >> 7][classEr.cameraY * -875394883 >> 7] & 4)) {
                                        var24 = Client.floorLevel * 87713183;
                                    } else {
                                        var24 = 3;
                                    }
                                }

                                var23 = var24;
                            }

                            var24 = GraphicsStub.cameraX * 1659667383;
                            var42 = Preferences.cameraZ * 820898407;
                            var44 = classEr.cameraY * -875394883;
                            var27 = classAo.pitch * 362746213;
                            var53 = UtilClass11.yaw * -1758149661;

                            for (var55 = 0; var55 < 5; ++var55) {
                                if (Client.fieldOf[var55]) {
                                    var30 = (int) (Math.random() * (double) (2 * Client.fieldOb[var55] + 1) - (double) Client.fieldOb[var55] + Math.sin((double) Client.fieldOq[var55] * ((double) Client.fieldOx[var55] / 100.0D)) * (double) Client.fieldOn[var55]);
                                    if (0 == var55) {
                                        GraphicsStub.cameraX += var30 * 892783111;
                                    }

                                    if (1 == var55) {
                                        Preferences.cameraZ += 1828163927 * var30;
                                    }

                                    if (var55 == 2) {
                                        classEr.cameraY += 648000149 * var30;
                                    }

                                    if (3 == var55) {
                                        UtilClass11.yaw = (var30 + UtilClass11.yaw * -1758149661 & 2047) * 1735563723;
                                    }

                                    if (4 == var55) {
                                        classAo.pitch += var30 * 702658669;
                                        if (classAo.pitch * 362746213 < 128) {
                                            classAo.pitch = -254003584;
                                        }

                                        if (classAo.pitch * 362746213 > 383) {
                                            classAo.pitch = -1464669421;
                                        }
                                    }
                                }
                            }

                            var55 = Mouse.fieldW * 518596439;
                            var30 = Mouse.fieldE * 1747296693;
                            if (0 != Mouse.fieldD * 1724889987) {
                                var55 = Mouse.fieldX * -1590834513;
                                var30 = Mouse.fieldO * 1708223245;
                            }

                            label1947:
                            {
                                if (var55 >= var13 && var55 < var20 + var13 && var30 >= var14 && var30 < var14 + var21) {
                                    Model.mouseInViewport = true;
                                    Model.totalHoveredUids = 0;
                                    Model.fieldBl = var55 - var13;
                                    Model.fieldBp = var30 - var14;
                                    break label1947;
                                }

                                Model.mouseInViewport = false;
                                Model.totalHoveredUids = 0;
                            }

                            UtilClass39.method176(1574339550);
                            RSGraphics.method235(var13, var14, var20, var21, 0);
                            UtilClass39.method176(226389776);
                            Client.landscape.render(GraphicsStub.cameraX * 1659667383, Preferences.cameraZ * 820898407, classEr.cameraY * -875394883,
                                    classAo.pitch * 362746213, UtilClass11.yaw * -1758149661, var23);
                            UtilClass39.method176(1581855683);
                            Client.landscape.clearTempEntities();
                            WidgetStrings.method409(var13, var14, var20, var21, 420862085);
                            if (2 == Client.fieldAe * 314239289) {
                                classEs.method190((Client.hintIconX * 252675335 - classDc.baseX * -2071335905 << 7) + Client.fieldAz * -1546637431, (Client.hintIconY * -170956129 - CalendarUtil.baseY * -1046564359 << 7) + Client.fieldAi * -701479397, Client.fieldAx * -1151090922, 1584890624);
                                if (Client.fieldGk * -1627343845 > -1 && Client.engineCycle * -1223223371 % 20 < 10) {
                                    LandscapeTile.hintHeadIcons[0].f(var13 + Client.fieldGk * -1627343845 - 12, var14 + Client.fieldGj * 43171827 - 28);
                                }
                            }

                            ((TextureManagerImpl) RSGraphics2D.fieldAs).q(Client.fieldEo * 1985191041, (byte) 0);
                            FriendedPlayer.method178(var13, var14, var20, var21, -266358161);
                            GraphicsStub.cameraX = 892783111 * var24;
                            Preferences.cameraZ = 1828163927 * var42;
                            classEr.cameraY = 648000149 * var44;
                            classAo.pitch = var27 * 702658669;
                            UtilClass11.yaw = var53 * 1735563723;
                            if (Client.fieldJ) {
                                byte var64 = 0;
                                var32 = var64 + UtilClass20.fieldW * 1795231551 + UtilClass20.fieldL * -408539103;
                                if (var32 == 0) {
                                    Client.fieldJ = false;
                                }
                            }

                            if (Client.fieldJ) {
                                RSGraphics.method235(var13, var14, var20, var21, 0);
                                ItemPile.method339(StringConstants.fieldS, false, -1839562951);
                            }

                            RSGraphics.method231(var2, var3, var4, var5);
                            continue;
                        }

                        if (widget.contentType * 481950881 == 1338) {
                            label1897:
                            {
                                UtilClass39.method176(-396390407);
                                RSGraphics.method231(var13, var14, ClanMate.mapback.fieldI + var13, var14 + ClanMate.mapback.fieldB);
                                if (2 != Client.fieldMp * 750541649) {
                                    if (Client.fieldMp * 750541649 != 5) {
                                        var20 = Client.minimapScale * -148158859 + Client.minimapRotation * -422086387 & 2047;
                                        var21 = 48 + 404428603 * Client.myPlayer.strictX / 32;
                                        var22 = 464 - Client.myPlayer.strictY * -1490664571 / 32;
                                        UtilClass2.minimapStaticImg.y(25 + var13, 5 + var14, 146, 151, var21, var22, var20, 256 + Client.minimapOffset * -695888753, Packet.fieldEv, classBo.fieldEs);

                                        for (var23 = 0; var23 < Client.numMMIcons * 2042341781; ++var23) {
                                            var24 = 2 + Client.MMIconRegionX[var23] * 4 - Client.myPlayer.strictX * 404428603 / 32;
                                            var42 = 2 + 4 * Client.MMIconRegionY[var23] - -1490664571 * Client.myPlayer.strictY / 32;
                                            EntityMarker.method331(var13, var14, var24, var42, Client.MMIcons[var23], -460155051);
                                        }

                                        for (var23 = 0; var23 < 104; ++var23) {
                                            for (var24 = 0; var24 < 104; ++var24) {
                                                NodeDeque var61 = Client.groundItemDeques[Client.floorLevel * 87713183][var23][var24];
                                                if (null != var61) {
                                                    var44 = 4 * var23 + 2 - Client.myPlayer.strictX * 404428603 / 32;
                                                    var27 = 2 + 4 * var24 - Client.myPlayer.strictY * -1490664571 / 32;
                                                    EntityMarker.method331(var13, var14, var44, var27, UtilClass25.mapdots[0], -587576768);
                                                }
                                            }
                                        }

                                        for (var23 = 0; var23 < Client.npcCount * 1825497683; ++var23) {
                                            Npc var60 = Client.npcs[Client.npcIndices[var23]];
                                            if (var60 != null && var60.isValid(-406494417)) {
                                                NpcDefinition var63 = var60.definition;
                                                if (var63 != null && var63.transformIds != null) {
                                                    var63 = var63.transform(-546599240);
                                                }

                                                if (var63 != null && var63.fieldY && var63.interactable) {
                                                    var44 = var60.strictX * 404428603 / 32 - Client.myPlayer.strictX * 404428603 / 32;
                                                    var27 = var60.strictY * -1490664571 / 32 - -1490664571 * Client.myPlayer.strictY / 32;
                                                    EntityMarker.method331(var13, var14, var44, var27, UtilClass25.mapdots[1], -1979585281);
                                                }
                                            }
                                        }

                                        for (var23 = 0; var23 < Client.playerCount * 16022533; ++var23) {
                                            Player var62 = Client.players[Client.playerIndicies[var23]];
                                            if (null != var62 && var62.isValid(2078712050) && !var62.hidden) {
                                                var42 = var62.strictX * 404428603 / 32 - Client.myPlayer.strictX * 404428603 / 32;
                                                var44 = var62.strictY * -1490664571 / 32 - Client.myPlayer.strictY * -1490664571 / 32;
                                                boolean var54 = false;
                                                if (classM.method128(var62.name, true, -1109772651)) {
                                                    var54 = true;
                                                }

                                                boolean var56 = false;

                                                for (var55 = 0; var55 < classCx.fieldMw * 4951847; ++var55) {
                                                    if (var62.name.equals(LandscapeMod.clanMates[var55].displayName)) {
                                                        var56 = true;
                                                        break;
                                                    }
                                                }

                                                boolean var57 = false;
                                                if (-1806446711 * Client.myPlayer.team != 0 && var62.team * -1806446711 != 0) {
                                                    if (var62.team * -1806446711 == Client.myPlayer.team * -1806446711) {
                                                        var57 = true;
                                                    }
                                                }

                                                if (var54) {
                                                    EntityMarker.method331(var13, var14, var42, var44, UtilClass25.mapdots[3], -1863694566);
                                                } else if (var57) {
                                                    EntityMarker.method331(var13, var14, var42, var44, UtilClass25.mapdots[4], -1007126694);
                                                } else if (var56) {
                                                    EntityMarker.method331(var13, var14, var42, var44, UtilClass25.mapdots[5], -1557673053);
                                                } else {
                                                    EntityMarker.method331(var13, var14, var42, var44, UtilClass25.mapdots[2], -442613523);
                                                }
                                            }
                                        }

                                        if (Client.fieldAe * 314239289 != 0 && Client.engineCycle * -1223223371 % 20 < 10) {
                                            if (Client.fieldAe * 314239289 == 1 && Client.hintIconNpcIndex * -574346357 >= 0) {
                                                if (Client.hintIconNpcIndex * -574346357 < Client.npcs.length) {
                                                    Npc var65 = Client.npcs[Client.hintIconNpcIndex * -574346357];
                                                    if (null != var65) {
                                                        var24 = var65.strictX * 404428603 / 32 - Client.myPlayer.strictX * 404428603 / 32;
                                                        var42 = var65.strictY * -1490664571 / 32 - -1490664571 * Client.myPlayer.strictY / 32;
                                                        classBy.method247(var13, var14, var24, var42, UtilClass5.mapMarkers[1], -1317037580);
                                                    }
                                                }
                                            }

                                            if (2 == Client.fieldAe * 314239289) {
                                                var23 = Client.hintIconX * 1010701340 - classDc.baseX * 304590972 + 2 - 404428603 * Client.myPlayer.strictX / 32;
                                                var24 = 2 + (Client.hintIconY * -683824516 - CalendarUtil.baseY * 108709860) - Client.myPlayer.strictY * -1490664571 / 32;
                                                classBy.method247(var13, var14, var23, var24, UtilClass5.mapMarkers[1], -1763335092);
                                            }

                                            if (10 == Client.fieldAe * 314239289 && Client.hintIconPlayerIndex * 1040701653 >= 0) {
                                                if (Client.hintIconPlayerIndex * 1040701653 < Client.players.length) {
                                                    Player var66 = Client.players[Client.hintIconPlayerIndex * 1040701653];
                                                    if (var66 != null) {
                                                        var24 = var66.strictX * 404428603 / 32 - 404428603 * Client.myPlayer.strictX / 32;
                                                        var42 = var66.strictY * -1490664571 / 32 - -1490664571 * Client.myPlayer.strictY / 32;
                                                        classBy.method247(var13, var14, var24, var42, UtilClass5.mapMarkers[1], -1413326301);
                                                    }
                                                }
                                            }
                                        }

                                        if (Client.destinationX * 1192318035 != 0) {
                                            var23 = Client.destinationX * 474304844 + 2 - 404428603 * Client.myPlayer.strictX / 32;
                                            var24 = Client.destinationY * -1727853524 + 2 - Client.myPlayer.strictY * -1490664571 / 32;
                                            EntityMarker.method331(var13, var14, var23, var24, UtilClass5.mapMarkers[0], -1144156214);
                                        }

                                        if (!Client.myPlayer.hidden) {
                                            RSGraphics.method235(4 + 93 + var13, var14 + 82 - 4, 3, 3, 16777215);
                                        }
                                        break label1897;
                                    }
                                }

                                RSGraphics.method246(25 + var13, 5 + var14, 0, Packet.fieldEv, classBo.fieldEs);
                            }

                            if (Client.fieldMp * 750541649 < 3) {
                                Projectile.fieldEi.y(var13, var14, 33, 33, 25, 25, Client.minimapRotation * -422086387, 256, UtilClass41.fieldEk, ClanMate.fieldEz);
                            } else {
                                RSGraphics.method246(var13, var14, 0, UtilClass41.fieldEk, ClanMate.fieldEz);
                            }

                            if (Client.fieldLk[var12]) {
                                ClanMate.mapback.i(var13, var14);
                            }

                            Client.fieldLm[var12] = true;
                            RSGraphics.method231(var2, var3, var4, var5);
                            continue;
                        }
                    }

                    if (widget.type * -729517859 == 0) {
                        if (!widget.fieldK && Player.method144(widget, (byte) 52) && widget != Client.fieldIi) {
                            continue;
                        }

                        if (!widget.fieldK) {
                            if (widget.insetY * -1991825281 > widget.viewportHeight * 1854186653 - widget.height * -1004717071) {
                                widget.insetY = widget.viewportHeight * 1297499363 - widget.height * 1091298191;
                            }
                            if (widget.insetY * -1991825281 < 0) {
                                widget.insetY = 0;
                            }
                        }

                        drawInterface(children, widget.id * -1866039137, var16, var17, var18, var19, var13 - widget.insetX * 531263513, var14 - widget.insetY * -1991825281, var12, -1973945246);
                        if (widget.children != null) {
                            drawInterface(widget.children, widget.id * -1866039137, var16, var17, var18, var19, var13 - widget.insetX * 531263513, var14 - widget.insetY * -1991825281, var12, -1994652087);
                        }

                        WidgetNode var38 = (WidgetNode) Client.widgetNodes.get((long) (widget.id * -1866039137));
                        if (var38 != null) {
                            UtilClass38.method124(var38.owner * -1220935357, var16, var17, var18, var19, var13, var14, var12, (byte) 0);
                        }

                        RSGraphics.method231(var2, var3, var4, var5);
                        RSGraphics2D.method309();
                    }

                    if (!Client.fieldLk[var12] && Client.fieldLb * -340512555 <= 1) {
                        continue;
                    }

                    if (widget.type * -729517859 == 0 && !widget.fieldK && widget.viewportHeight * 1854186653 > widget.height * -1004717071) {
                        InputHandler.drawScrollBar(var13 + widget.width * 805002637, var14, widget.insetY * -1991825281, widget.height * -1004717071, widget.viewportHeight * 1854186653);
                    }

                    if (1 != widget.type * -729517859) {
                        if (2 == widget.type * -729517859) {
                            var20 = 0;
                            for (var21 = 0; var21 < widget.height * -1004717071; ++var21) {
                                for (var22 = 0; var22 < widget.width * 805002637; ++var22) {
                                    var23 = (32 + widget.xPadding * -2111277319) * var22 + var13;
                                    var24 = var14 + (32 + widget.yPadding * -842585833) * var21;
                                    if (var20 < 20) {
                                        var23 += widget.xSprites[var20];
                                        var24 += widget.ySprites[var20];
                                    }
                                    if (widget.itemIds[var20] > 0) {
                                        label2204:
                                        {
                                            label2205:
                                            {
                                                boolean var25 = false;
                                                boolean var26 = false;
                                                var27 = widget.itemIds[var20] - 1;
                                                if (var23 + 32 > var2 && var23 < var4 && 32 + var24 > var3 && var24 < var5) {
                                                    break label2205;
                                                }
                                                if (InputHandler.fieldGc != widget || var20 != Client.fieldGv * -435280353) {
                                                    break label2204;
                                                }
                                            }

                                            Sprite var28;
                                            label2059:
                                            {
                                                if (Client.itemSelectionStatus * 279939385 == 1 && var20 == UtilClass41.selectedItemIndex * 1003817045) {
                                                    if (widget.id * -1866039137 == UtilClass6.selectedItemWidgetId * 1795747025) {
                                                        var28 = UtilClass0.getItemSprite(var27, widget.itemQuantities[var20], 2, 0, 2, false, -2143515502);
                                                        break label2059;
                                                    }
                                                }

                                                var28 = UtilClass0.getItemSprite(var27, widget.itemQuantities[var20], 1, 3153952, 2, false, -1217264024);
                                            }

                                            if (var28 != null) {
                                                label2206:
                                                {
                                                    if (InputHandler.fieldGc == widget && var20 == Client.fieldGv * -435280353) {
                                                        var42 = Mouse.fieldW * 518596439 - Client.fieldGl * -1533276865;
                                                        var44 = Mouse.fieldE * 1747296693 - Client.fieldGz * 1814995251;
                                                        if (var42 < 5 && var42 > -5) {
                                                            var42 = 0;
                                                        }

                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }

                                                        if (Client.fieldGi * 1192113145 < 5) {
                                                            var42 = 0;
                                                            var44 = 0;
                                                        }

                                                        var28.h(var23 + var42, var24 + var44, 128);
                                                        if (var1 != -1) {
                                                            Widget var29 = children[var1 & '\uffff'];
                                                            if (var44 + var24 < RSGraphics.fieldQ && var29.insetY * -1991825281 > 0) {
                                                                var30 = (RSGraphics.fieldQ - var24 - var44) * Client.fieldEo * 1985191041 / 3;
                                                                if (var30 > Client.fieldEo * -1622926070) {
                                                                    var30 = Client.fieldEo * -1622926070;
                                                                }

                                                                if (var30 > var29.insetY * -1991825281) {
                                                                    var30 = var29.insetY * -1991825281;
                                                                }

                                                                var29.insetY -= var30 * 724604799;
                                                                Client.fieldGz += -1086438917 * var30;
                                                                classBx.method250(var29, 57574739);
                                                            }

                                                            if (var24 + var44 + 32 > RSGraphics.fieldT && var29.insetY * -1991825281 < var29.viewportHeight * 1854186653 - var29.height * -1004717071) {
                                                                var30 = Client.fieldEo * 1985191041 * (32 + var44 + var24 - RSGraphics.fieldT) / 3;
                                                                if (var30 > Client.fieldEo * -1622926070) {
                                                                    var30 = Client.fieldEo * -1622926070;
                                                                }

                                                                if (var30 > var29.viewportHeight * 1854186653 - var29.height * -1004717071 - var29.insetY * -1991825281) {
                                                                    var30 = var29.viewportHeight * 1854186653 - var29.height * -1004717071 - var29.insetY * -1991825281;
                                                                }

                                                                var29.insetY += 724604799 * var30;
                                                                Client.fieldGz -= var30 * -1086438917;
                                                                classBx.method250(var29, 57574739);
                                                            }
                                                        }
                                                        break label2206;
                                                    }

                                                    if (widget == ClanMate.fieldGn && Client.fieldGr * 930433995 == var20) {
                                                        var28.h(var23, var24, 128);
                                                        break label2206;
                                                    }
                                                    var28.f(var23, var24);
                                                }
                                            } else {
                                                classBx.method250(widget, 57574739);
                                            }
                                        }
                                    } else if (widget.spriteIds != null && var20 < 20) {
                                        Sprite var47 = widget.f(var20, (byte) 116);
                                        if (null != var47) {
                                            var47.f(var23, var24);
                                        } else if (Widget.fieldS) {
                                            classBx.method250(widget, 57574739);
                                        }
                                    }

                                    ++var20;
                                }
                            }
                        } else if (3 == widget.type * -729517859) {
                            if (Player.method148(widget, -1862645947)) {
                                var20 = widget.fieldAr * -907048977;
                                if (Client.fieldIi == widget && 0 != widget.fieldAv * 1825093749) {
                                    var20 = widget.fieldAv * 1825093749;
                                }
                            } else {
                                var20 = widget.fieldAh * 259666867;
                                if (widget == Client.fieldIi && widget.fieldAe * 1427124997 != 0) {
                                    var20 = widget.fieldAe * 1427124997;
                                }
                            }

                            if (var15 == 0) {
                                if (widget.fieldAl) {
                                    RSGraphics.method235(var13, var14, widget.width * 805002637, widget.height * -1004717071, var20);
                                } else {
                                    RSGraphics.drawRectangle(var13, var14, widget.width * 805002637, widget.height * -1004717071, var20);
                                }
                            } else if (widget.fieldAl) {
                                RSGraphics.method234(var13, var14, widget.width * 805002637, widget.height * -1004717071, var20, 256 - (var15 & 255));
                            } else {
                                RSGraphics.method245(var13, var14, widget.width * 805002637, widget.height * -1004717071, var20, 256 - (var15 & 255));
                            }
                        } else {
                            int var10004;
                            classGm var40;
                            if (4 == widget.type * -729517859) {
                                var40 = widget.k(388137776);
                                if (null == var40) {
                                    if (Widget.fieldS) {
                                        classBx.method250(widget, 57574739);
                                    }
                                } else {
                                    String var39 = widget.fieldBm;
                                    if (Player.method148(widget, -1305850318)) {
                                        var21 = widget.fieldAr * -907048977;
                                        if (Client.fieldIi == widget && 0 != widget.fieldAv * 1825093749) {
                                            var21 = widget.fieldAv * 1825093749;
                                        }

                                        if (widget.fieldBz.length() > 0) {
                                            var39 = widget.fieldBz;
                                        }
                                    } else {
                                        var21 = widget.fieldAh * 259666867;
                                        if (widget == Client.fieldIi && 0 != widget.fieldAe * 1427124997) {
                                            var21 = widget.fieldAe * 1427124997;
                                        }
                                    }

                                    if (widget.fieldK && widget.itemId * -5424365 != -1) {
                                        label2214:
                                        {
                                            ItemDefinition var43 = Client.getItemDefinition(widget.itemId * -5424365, 405892149);
                                            var39 = var43.fieldX;
                                            if (null == var39) {
                                                var39 = "null";
                                            }

                                            if (1 != var43.stackable * 1977514217 && 1 == widget.fieldDl * -1877296303) {
                                                break label2214;
                                            }

                                            if (widget.fieldDl * -1877296303 != -1) {
                                                var39 = Buffer.getColorTags(16748608, 863631106) + var39 + UtilClass41.fieldE + " " + 'x' + Varp.method395(widget.fieldDl * -1877296303, (byte) 0);
                                            }
                                        }
                                    }

                                    if (Client.fieldJy == widget) {
                                        var39 = StringConstants.fieldFu;
                                        var21 = widget.fieldAh * 259666867;
                                    }

                                    if (!widget.fieldK) {
                                        var39 = classJ.method134(var39, widget, -1718586289);
                                    }

                                    var10004 = widget.width * 805002637;
                                    int var10005 = widget.height * -1004717071;
                                    byte var10007;
                                    var10007 = (byte) (widget.fieldBc ? 0 : -1);
                                    var40.f(var39, var13, var14, var10004, var10005, var21, var10007, widget.fieldBe * 904049259, widget.fieldBb * 62751399, widget.fieldBr * -1746153395);
                                }
                            } else if (widget.type * -729517859 == 5) {
                                Sprite var41;
                                if (!widget.fieldK) {
                                    var41 = widget.s(Player.method148(widget, -1616109332), (short) 1400);
                                    if (var41 != null) {
                                        var41.f(var13, var14);
                                    } else if (Widget.fieldS) {
                                        classBx.method250(widget, 57574739);
                                    }
                                } else {
                                    if (-1 != widget.itemId * -5424365) {
                                        var41 = UtilClass0.getItemSprite(widget.itemId * -5424365, widget.fieldDl * -1877296303, widget.fieldAt * 828601947, widget.fieldAw * -1468854195, widget.fieldBp * 1588529557, false, -1732083946);
                                    } else {
                                        var41 = widget.s(false, (short) 1400);
                                    }

                                    if (null != var41) {
                                        var21 = var41.fieldM;
                                        var22 = var41.fieldW;
                                        if (widget.fieldAa) {
                                            RSGraphics.method232(var13, var14, widget.width * 805002637 + var13, var14 + widget.height * -1004717071);
                                            var23 = (widget.width * 805002637 + (var21 - 1)) / var21;
                                            var24 = (var22 - 1 + widget.height * -1004717071) / var22;

                                            for (var42 = 0; var42 < var23; ++var42) {
                                                for (var44 = 0; var44 < var24; ++var44) {
                                                    if (widget.fieldAi * -1396152997 != 0) {
                                                        var41.r(var21 / 2 + var13 + var21 * var42, var22 / 2 + var14 + var22 * var44, widget.fieldAi * -1396152997, 4096);
                                                    } else if (var15 != 0) {
                                                        var41.h(var13 + var21 * var42, var22 * var44 + var14, 256 - (var15 & 255));
                                                    } else {
                                                        var41.f(var21 * var42 + var13, var14 + var22 * var44);
                                                    }
                                                }
                                            }

                                            RSGraphics.method231(var2, var3, var4, var5);
                                        } else {
                                            var23 = widget.width * -1244082176 / var21;
                                            if (0 != widget.fieldAi * -1396152997) {
                                                var41.r(var13 + widget.width * 805002637 / 2, var14 + widget.height * -1004717071 / 2, widget.fieldAi * -1396152997, var23);
                                            } else if (0 != var15) {
                                                var41.j(var13, var14, widget.width * 805002637, widget.height * -1004717071, 256 - (var15 & 255));
                                            } else {
                                                if (widget.width * 805002637 == var21 && var22 == widget.height * -1004717071) {
                                                    var41.f(var13, var14);
                                                    continue;
                                                }

                                                var41.x(var13, var14, widget.width * 805002637, widget.height * -1004717071);
                                            }
                                        }
                                    } else if (Widget.fieldS) {
                                        classBx.method250(widget, 57574739);
                                    }
                                }
                            } else {
                                ItemDefinition var46;
                                if (widget.type * -729517859 == 6) {
                                    boolean var45 = Player.method148(widget, -1329915737);
                                    if (var45) {
                                        var21 = widget.fieldAb * -1921108817;
                                    } else {
                                        var21 = widget.fieldAf * -9713859;
                                    }

                                    Model var49 = null;
                                    var23 = 0;
                                    if (widget.itemId * -5424365 != -1) {
                                        var46 = Client.getItemDefinition(widget.itemId * -5424365, -692308173);
                                        if (var46 != null) {
                                            var46 = var46.n(widget.fieldDl * -1877296303, 1994320292);
                                            var49 = var46.e(1, 2037340464);
                                            if (null != var49) {
                                                var49.m();
                                                var23 = var49.modelHeight * 1802750145 / 2;
                                            } else {
                                                classBx.method250(widget, 57574739);
                                            }
                                        }
                                    } else if (5 == widget.fieldAd * -1111255667) {
                                        if (widget.fieldAu * -1801975607 == 0) {
                                            var49 = Client.aPlayerConfig.w((AnimationSequence) null, -1, (AnimationSequence) null, -1, (byte) -95);
                                        } else {
                                            var49 = Client.myPlayer.getModel(-1671376484);
                                        }
                                    } else if (var21 == -1) {
                                        var49 = widget.d((AnimationSequence) null, -1, var45, Client.myPlayer.cfg, (byte) 41);
                                        if (var49 == null && Widget.fieldS) {
                                            classBx.method250(widget, 57574739);
                                        }
                                    } else {
                                        AnimationSequence var48 = AnimationSequence.get(var21, -1639381434);
                                        var49 = widget.d(var48, widget.fieldDs * -1365995491, var45, Client.myPlayer.cfg, (byte) 45);
                                        if (null == var49 && Widget.fieldS) {
                                            classBx.method250(widget, 57574739);
                                        }
                                    }

                                    RSGraphics2D.method323(var13 + widget.width * 805002637 / 2, widget.height * -1004717071 / 2 + var14);
                                    var24 = RSGraphics2D.SIN_TABLE[widget.fieldAy * 1396274965] * widget.fieldBi * 1337242061 >> 16;
                                    var42 = widget.fieldBi * 1337242061 * RSGraphics2D.COS_TABLE[widget.fieldAy * 1396274965] >> 16;
                                    if (var49 != null) {

                                        if (true/*!widget.fieldK*/) {
                                            var49.u(0, widget.fieldBu * 550343665, 0, widget.fieldAy * 1396274965, 0, var24, var42);
                                        } else {
                                            var49.m();
                                            if (true /*widget.fieldBl*/) {

                                                var49.j(
                                                        0,
                                                        widget.fieldBu * 550343665,
                                                        widget.fieldBo * -1543116951,
                                                        widget.fieldAy * 1396274965,

                                                        widget.fieldAc * -49611457,
                                                        var24 + var23 + widget.fieldAp * 209906351,
                                                        var42 + widget.fieldAp * 209906351,
                                                        /*widget.fieldBi * 1337242061*/50 + counter++);
                                            } else {
                                        //        //hold

                                                System.out.println( widget.fieldAy * 1396274965);
                                           /*     if(counter == 0) {
                                                    counter = 50;
                                                }*/
                                                var49.u(
                                                        0,
                                                        widget.fieldBu * 550343665,
                                                        widget.fieldBo * -1543116951,
                                                        widget.fieldAy * 1396274965 + counter,

                                                        widget.fieldAc * -49611457,
                                                        widget.fieldAp * 209906351 + var24 + var23,
                                                        var42 + widget.fieldAp * 209906351);
                                            }

                                            if((counter2++) % 5 == 0) {
                                                counter ++;
                                            }
                                           /* if(counter == 2045) {
                                                counter = 50;
                                            }*/
                                        }
                                    }

                                    RSGraphics2D.method324();
                                } else {
                                    if (7 == widget.type * -729517859) {
                                        var40 = widget.k(1635028242);
                                        if (var40 == null) {
                                            if (Widget.fieldS) {
                                                classBx.method250(widget, 57574739);
                                            }
                                            continue;
                                        }

                                        var21 = 0;

                                        for (var22 = 0; var22 < widget.height * -1004717071; ++var22) {
                                            for (var23 = 0; var23 < widget.width * 805002637; ++var23) {
                                                if (widget.itemIds[var21] > 0) {
                                                    String var50;
                                                    label1928:
                                                    {
                                                        var46 = Client.getItemDefinition(widget.itemIds[var21] - 1, -1418170214);
                                                        if (1 != var46.stackable * 1977514217 && 1 == widget.itemQuantities[var21]) {
                                                            var50 = Buffer.getColorTags(16748608, -5948515) + var46.fieldX + UtilClass41.fieldE;
                                                            break label1928;
                                                        }

                                                        var50 = Buffer.getColorTags(16748608, -527506504) + var46.fieldX + UtilClass41.fieldE + " " + 'x' + Varp.method395(widget.itemQuantities[var21], (byte) 0);
                                                    }

                                                    var44 = (widget.xPadding * -2111277319 + 115) * var23 + var13;
                                                    var27 = var14 + (widget.yPadding * -842585833 + 12) * var22;
                                                    if (0 == widget.fieldBe * 904049259) {
                                                        var10004 = widget.fieldAh * 259666867;
                                                        byte var68;
                                                        var68 = (byte) (widget.fieldBc ? 0 : -1);
                                                        var40.n(var50, var44, var27, var10004, var68);
                                                    } else if (1 == widget.fieldBe * 904049259) {
                                                        var40.k(var50, var44 + widget.width * 805002637 / 2, var27, widget.fieldAh * 259666867, widget.fieldBc ? 0 : -1);
                                                    } else {
                                                        var40.s(var50, widget.width * 805002637 + var44 - 1, var27, widget.fieldAh * 259666867, widget.fieldBc ? 0 : -1);
                                                    }
                                                }

                                                ++var21;
                                            }
                                        }
                                    }

                                    if (widget.type * -729517859 == 8 && ObjectDefinition.fieldIu == widget
                                            && Client.fieldIb * -110905105 == Client.fieldIm * -2085205915) {
                                        var20 = 0;
                                        var21 = 0;
                                        classGm var58 = ScriptEvent.font_p12full;
                                        String var52 = widget.fieldBm;

                                        String var51;
                                        for (var52 = classJ.method134(var52, widget, -1718586289); var52.length() > 0; var21 += var58.fieldW + 1) {
                                            var42 = var52.indexOf(UtilClass41.fieldW);
                                            if (var42 != -1) {
                                                var51 = var52.substring(0, var42);
                                                var52 = var52.substring(var42 + 4);
                                            } else {
                                                var51 = var52;
                                                var52 = "";
                                            }

                                            var44 = var58.b(var51);
                                            if (var44 > var20) {
                                                var20 = var44;
                                            }
                                        }

                                        var20 += 6;
                                        var21 += 7;
                                        var42 = var13 + widget.width * 805002637 - 5 - var20;
                                        var44 = var14 + widget.height * -1004717071 + 5;
                                        if (var42 < 5 + var13) {
                                            var42 = 5 + var13;
                                        }

                                        if (var20 + var42 > var4) {
                                            var42 = var4 - var20;
                                        }

                                        if (var44 + var21 > var5) {
                                            var44 = var5 - var21;
                                        }

                                        RSGraphics.method235(var42, var44, var20, var21, 16777120);
                                        RSGraphics.drawRectangle(var42, var44, var20, var21, 0);
                                        var52 = widget.fieldBm;
                                        var27 = var58.fieldW + var44 + 2;

                                        for (var52 = classJ.method134(var52, widget, -1718586289); var52.length() > 0; var27 += 1 + var58.fieldW) {
                                            var53 = var52.indexOf(UtilClass41.fieldW);
                                            if (-1 != var53) {
                                                var51 = var52.substring(0, var53);
                                                var52 = var52.substring(4 + var53);
                                            } else {
                                                var51 = var52;
                                                var52 = "";
                                            }

                                            var58.n(var51, var42 + 3, var27, 0, -1);
                                        }
                                    }

                                    if (widget.type * -729517859 == 9) {
                                        if (1 == widget.fieldAm * 1742140781) {
                                            RSGraphics.method241(var13, var14, var13 + widget.width * 805002637, var14 + widget.height * -1004717071, widget.fieldAh * 259666867);
                                        } else {
                                            if (widget.width * 805002637 >= 0) {
                                                var10000 = widget.width * 805002637;
                                            } else {
                                                var10000 = -(widget.width * 805002637);
                                            }

                                            var20 = var10000;
                                            if (widget.height * -1004717071 >= 0) {
                                                var10000 = widget.height * -1004717071;
                                            } else {
                                                var10000 = -(widget.height * -1004717071);
                                            }

                                            var21 = var10000;
                                            var22 = var20;
                                            if (var20 < var21) {
                                                var22 = var21;
                                            }

                                            if (var22 != 0) {
                                                var23 = (widget.width * 805002637 << 16) / var22;
                                                var24 = (widget.height * -1004717071 << 16) / var22;
                                                if (var24 <= var23) {
                                                    var23 = -var23;
                                                } else {
                                                    var24 = -var24;
                                                }
                                                var42 = widget.fieldAm * 1742140781 * var24 >> 17;
                                                var44 = 1 + widget.fieldAm * 1742140781 * var24 >> 17;
                                                var27 = var23 * widget.fieldAm * 1742140781 >> 17;
                                                var53 = widget.fieldAm * 1742140781 * var23 + 1 >> 17;
                                                var55 = var42 + var13;
                                                var30 = var13 - var44;
                                                var31 = var13 + widget.width * 805002637 - var44;
                                                var32 = var42 + var13 + widget.width * 805002637;
                                                var33 = var14 + var27;
                                                var34 = var14 - var53;
                                                var35 = widget.height * -1004717071 + var14 - var53;
                                                var36 = var14 + widget.height * -1004717071 + var27;
                                                RSGraphics2D.checkOnScreen(var55, var30, var31);
                                                RSGraphics2D.fillTriangle(var33, var34, var35, var55, var30, var31, widget.fieldAh * 259666867);
                                                RSGraphics2D.checkOnScreen(var55, var31, var32);
                                                RSGraphics2D.fillTriangle(var33, var35, var36, var55, var31, var32, widget.fieldAh * 259666867);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var37) {
            throw ClanMate.error(var37, "aq.co(" + ')');
        }
    }

    final void setLocation(int x, int y, boolean var3, byte var4) {
        try {
            if (this.animation * -433706235 != -1) {
                if (AnimationSequence.get(animation * -433706235, -1814000787).replacementWeapon * 2102903451 == 1) {
                    this.animation = 1079449139;
                }
            }

            if (!var3) {
                int stepX = x - this.queueX[0];
                int stepY = y - this.queueY[0];
                if (stepX >= -8 && stepX <= 8 && stepY >= -8 && stepY <= 8) {
                    if (this.queueSize * 1243816117 < 9) {
                        this.queueSize += -927674979;
                    }
                    for (int var7 = this.queueSize * 1243816117; var7 > 0; --var7) {
                        this.queueX[var7] = this.queueX[var7 - 1];
                        this.queueY[var7] = this.queueY[var7 - 1];
                        this.queueTraversed[var7] = this.queueTraversed[var7 - 1];
                    }
                    this.queueX[0] = x;
                    this.queueY[0] = y;
                    this.queueTraversed[0] = false;
                    return;
                }
            }
            this.queueSize = 0;
            this.fieldCt = 0;
            this.fieldCr = 0;
            this.queueX[0] = x;
            this.queueY[0] = y;
            this.strictX = this.queueX[0] * 1423243648 + this.fieldZ * -600183232;
            this.strictY = this.queueY[0] * 2107549312 + this.fieldZ * 511017408;
        } catch (RuntimeException var8) {
            throw ClanMate.error(var8, "aq.s(" + ')');
        }
    }

    final void f(int var1) {
        try {
            this.queueSize = 0;
            this.fieldCt = 0;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "aq.f(" + ')');
        }
    }

    boolean isValid(int var1) {
        try {
            return false;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "aq.i(" + ')');
        }
    }

    final void k(int var1, boolean var2, short var3) {
        try {
            int var4 = this.queueX[0];
            int var5 = this.queueY[0];
            if (var1 == 0) {
                if (var3 != 3321) {
                    throw new IllegalStateException();
                }

                --var4;
                ++var5;
            }

            if (var1 == 1) {
                if (var3 != 3321) {
                    throw new IllegalStateException();
                }

                ++var5;
            }

            if (2 == var1) {
                if (var3 != 3321) {
                    throw new IllegalStateException();
                }

                ++var4;
                ++var5;
            }

            if (var1 == 3) {
                if (var3 != 3321) {
                    return;
                }

                --var4;
            }

            if (4 == var1) {
                if (var3 != 3321) {
                    return;
                }

                ++var4;
            }

            if (5 == var1) {
                --var4;
                --var5;
            }

            if (var1 == 6) {
                if (var3 != 3321) {
                    throw new IllegalStateException();
                }

                --var5;
            }

            if (var1 == 7) {
                if (var3 != 3321) {
                    throw new IllegalStateException();
                }

                ++var4;
                --var5;
            }

            if (this.animation * -433706235 != -1) {
                if (var3 != 3321) {
                    throw new IllegalStateException();
                }

                if (AnimationSequence.get(this.animation * -433706235, -226784610).replacementWeapon * 2102903451 == 1) {
                    if (var3 != 3321) {
                        return;
                    }

                    this.animation = 1079449139;
                }
            }

            if (this.queueSize * 1243816117 < 9) {
                if (var3 != 3321) {
                    throw new IllegalStateException();
                }

                this.queueSize += -927674979;
            }

            for (int var6 = this.queueSize * 1243816117; var6 > 0; --var6) {
                if (var3 != 3321) {
                    return;
                }

                this.queueX[var6] = this.queueX[var6 - 1];
                this.queueY[var6] = this.queueY[var6 - 1];
                this.queueTraversed[var6] = this.queueTraversed[var6 - 1];
            }

            this.queueX[0] = var4;
            this.queueY[0] = var5;
            this.queueTraversed[0] = var2;
        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "aq.k(" + ')');
        }
    }

    final void registerHit(int hitType, int damage, int startCycle, int DUMMY) {
        try {
            for (int var5 = 0; var5 < 4; ++var5) {
                if (DUMMY >= 628976547) {
                    throw new IllegalStateException();
                }

                if (this.hitsplatCycles[var5] <= startCycle) {
                    if (DUMMY >= 628976547) {
                        throw new IllegalStateException();
                    }

                    this.hitsplatDamage[var5] = hitType;
                    this.hitplatType[var5] = damage;
                    this.hitsplatCycles[var5] = 70 + startCycle;
                    return;
                }
            }

        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "aq.d(" + ')');
        }
    }
}
