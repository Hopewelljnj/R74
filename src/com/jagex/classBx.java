package com.jagex;

import java.awt.*;
import java.awt.image.*;
import java.util.Hashtable;

public final class classBx extends classBq implements ImageProducer, ImageObserver {

    ImageConsumer fieldV;
    ColorModel fieldA;

    static void method250(Widget var0, int var1) {
        try {
            if (var0.fieldEt * 281148003 == Client.fieldLx * 111637079) {
                Client.fieldLp[var0.fieldDm * -553106931] = true;
            }

        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "bx.ce(" + ')');
        }
    }

    public static void method251(int dummy) {
        try {
            int var10;
            if (0 == Client.bootState * -465086451) {
                if (dummy >= -263010112) {
                    throw new IllegalStateException();
                } else {
                    Client.landscape = new Landscape(4, 104, 104, classM.tileHeights);

                    for (var10 = 0; var10 < 4; ++var10) {
                        if (dummy >= -263010112) {
                            throw new IllegalStateException();
                        }

                        Client.collisionMaps[var10] = new CollisionMap(104, 104);
                    }

                    UtilClass2.minimapStaticImg = new Sprite(512, 512);
                    ClientData.loadStatusString = StringConstants.fieldD;
                    ClientData.fieldAe = 1307930291;
                    Client.bootState = -1576122524;
                }
            } else {
                int var2;
                int var3;
                int var4;
                int var5;
                if (20 != Client.bootState * -465086451) {
                    if (Client.bootState * -465086451 == 30) {
                        Client.fieldAc = BoundaryDecoration.method205(0, false, true, true, -1545079029);
                        classBo.fieldAp = BoundaryDecoration.method205(1, false, true, true, -380720646);
                        classBt.config = BoundaryDecoration.method205(2, true, false, true, -110380578);
                        Client.fieldBu = BoundaryDecoration.method205(3, false, true, true, 587386184);
                        UtilClass39.fieldBo = BoundaryDecoration.method205(4, false, true, true, -2063506377);
                        UnknownEnum3.fieldBi = BoundaryDecoration.method205(5, true, true, true, 432161228);
                        classT.fieldBs = BoundaryDecoration.method205(6, true, true, false, 917050883);
                        Preferences.fieldBl = BoundaryDecoration.method205(7, false, true, true, 641235172);
                        UtilClass5.fieldBp = BoundaryDecoration.method205(8, false, true, true, -1403549533);
                        ClientData.textures = BoundaryDecoration.method205(9, false, true, true, -959858790);
                        JagSocket.wordpack = BoundaryDecoration.method205(10, false, true, true, -1148240992);
                        Client.fieldBz = BoundaryDecoration.method205(11, false, true, true, 1164133630);
                        Client.runescripts = BoundaryDecoration.method205(12, false, true, true, 942166139);
                        classM.fieldBe = BoundaryDecoration.method205(13, true, false, true, 760327170);
                        UtilClass3.fieldBb = BoundaryDecoration.method205(14, false, true, false, -343437971);
                        classFm.fieldBc = BoundaryDecoration.method205(15, false, true, true, -1288399089);
                        ClientData.loadStatusString = StringConstants.fieldO;
                        ClientData.fieldAe = 936753868;
                        Client.bootState = 1142722248;
                    } else if (Client.bootState * -465086451 == 40) {
                        if (dummy >= -263010112) {
                            throw new IllegalStateException();
                        } else {
                            byte var19 = 0;
                            var10 = var19 + Client.fieldAc.ch(-1185109137) * 4 / 100;
                            var10 += classBo.fieldAp.ch(-1630710041) * 4 / 100;
                            var10 += classBt.config.ch(1297673246) * 2 / 100;
                            var10 += Client.fieldBu.ch(-1599081416) * 2 / 100;
                            var10 += UtilClass39.fieldBo.ch(328188057) * 6 / 100;
                            var10 += UnknownEnum3.fieldBi.ch(733770854) * 4 / 100;
                            var10 += classT.fieldBs.ch(937275589) * 2 / 100;
                            var10 += Preferences.fieldBl.ch(1462479736) * 60 / 100;
                            var10 += UtilClass5.fieldBp.ch(557830278) * 2 / 100;
                            var10 += ClientData.textures.ch(1365741709) * 2 / 100;
                            var10 += JagSocket.wordpack.ch(93972038) * 2 / 100;
                            var10 += Client.fieldBz.ch(1876078333) * 2 / 100;
                            var10 += Client.runescripts.ch(-756127096) * 2 / 100;
                            var10 += classM.fieldBe.ch(482056286) * 2 / 100;
                            var10 += UtilClass3.fieldBb.ch(1353511033) * 2 / 100;
                            var10 += classFm.fieldBc.ch(110847894) * 2 / 100;
                            if (var10 != 100) {
                                if (dummy < -263010112) {
                                    if (0 != var10) {
                                        if (dummy >= -263010112) {
                                            throw new IllegalStateException();
                                        }

                                        ClientData.loadStatusString = StringConstants.fieldQ + var10 + "%";
                                    }

                                    ClientData.fieldAe = -742352846;
                                }
                            } else {
                                ClientData.loadStatusString = StringConstants.fieldT;
                                ClientData.fieldAe = -742352846;
                                Client.bootState = 1822433441;
                            }
                        }
                    } else {
                        ReferenceTableSub var11;
                        ReferenceTableSub var12;
                        ReferenceTableSub var13;
                        if (45 == Client.bootState * -465086451) {
                            if (dummy >= -263010112) {
                                throw new IllegalStateException();
                            } else {
                                ClassStructure.method20(22050, !Client.lowMemory, 2, -971563235);
                                classFm var18 = new classFm();
                                var18.x(9, 128, -1211766463);
                                classDm.fieldNf = LandscapeMod.method119(globalTaskSchedular, UtilClass22.canvas, 0, 22050, (byte) 10);
                                classDm.fieldNf.p(var18, -477795162);
                                var11 = classFm.fieldBc;
                                var12 = UtilClass3.fieldBb;
                                var13 = UtilClass39.fieldBo;
                                UtilClass21.fieldA = var11;
                                UtilClass21.fieldV = var12;
                                UtilClass21.fieldI = var13;
                                UtilClass37.fieldB = var18;
                                Npc.fieldNk = LandscapeMod.method119(globalTaskSchedular, UtilClass22.canvas, 1, 2048, (byte) 10);
                                Client.fieldNn = new classAc();
                                Npc.fieldNk.p(Client.fieldNn, 605354030);
                                TextureManagerImpl.fieldNa = new classBt(22050, classAp.audioSampleRate * 2098856905);
                                ClientData.loadStatusString = StringConstants.fieldH;
                                ClientData.fieldAe = 565577445;
                                Client.bootState = -1792822662;
                            }
                        } else if (50 == Client.bootState * -465086451) {
                            if (dummy >= -263010112) {
                                throw new IllegalStateException();
                            } else {
                                var10 = 0;
                                if (ObjectDefinition.font_p11full == null) {
                                    if (dummy >= -263010112) {
                                        throw new IllegalStateException();
                                    }

                                    ObjectDefinition.font_p11full = LandscapeMod.method118(UtilClass5.fieldBp, classM.fieldBe, "p11_full", "", -2032261774);
                                } else {
                                    ++var10;
                                }

                                if (ScriptEvent.font_p12full == null) {
                                    ScriptEvent.font_p12full = LandscapeMod.method118(UtilClass5.fieldBp, classM.fieldBe, "p12_full", "", -2032261774);
                                } else {
                                    ++var10;
                                }

                                if (null == com.jagex.MenuItem.font_b12full) {
                                    if (dummy >= -263010112) {
                                        throw new IllegalStateException();
                                    }

                                    com.jagex.MenuItem.font_b12full = LandscapeMod.method118(UtilClass5.fieldBp, classM.fieldBe, "b12_full", "", -2032261774);
                                } else {
                                    ++var10;
                                }

                                if (var10 < 3) {
                                    if (dummy >= -263010112) {
                                        throw new IllegalStateException();
                                    } else {
                                        ClientData.loadStatusString = StringConstants.fieldU + var10 * 100 / 3 + "%";
                                        ClientData.fieldAe = 1873507736;
                                    }
                                } else {
                                    WidgetNode.systemNode = new SystemNode(true);
                                    ClientData.loadStatusString = StringConstants.fieldJ;
                                    ClientData.fieldAe = 1873507736;
                                    Client.bootState = -433400276;
                                }
                            }
                        } else if (Client.bootState * -465086451 == 60) {
                            if (dummy >= -263010112) {
                                throw new IllegalStateException();
                            } else {
                                var11 = JagSocket.wordpack;
                                var12 = UtilClass5.fieldBp;
                                var4 = 0;
                                if (var11.g("title.jpg", "", -1499769103)) {
                                    if (dummy >= -263010112) {
                                        return;
                                    }

                                    ++var4;
                                }

                                if (var12.g("logo", "", -1762626120)) {
                                    ++var4;
                                }

                                if (var12.g("titlebox", "", -2034281749)) {
                                    if (dummy >= -263010112) {
                                        throw new IllegalStateException();
                                    }

                                    ++var4;
                                }

                                if (var12.g("titlebutton", "", -1835002073)) {
                                    if (dummy >= -263010112) {
                                        return;
                                    }

                                    ++var4;
                                }

                                if (var12.g("runes", "", -1755958628)) {
                                    if (dummy >= -263010112) {
                                        throw new IllegalStateException();
                                    }

                                    ++var4;
                                }

                                if (var12.g("title_mute", "", -1797355763)) {
                                    if (dummy >= -263010112) {
                                        throw new IllegalStateException();
                                    }

                                    ++var4;
                                }

                                if (var12.y("options_radio_buttons,0", -99503879)) {
                                    if (dummy >= -263010112) {
                                        return;
                                    }

                                    ++var4;
                                }

                                if (var12.y("options_radio_buttons,2", -99503879)) {
                                    if (dummy >= -263010112) {
                                        throw new IllegalStateException();
                                    }

                                    ++var4;
                                }

                                var12.g("sl_back", "", -1195260390);
                                var12.g("sl_flags", "", -1858470606);
                                var12.g("sl_arrows", "", -2094042578);
                                var12.g("sl_stars", "", -1525705659);
                                var12.g("sl_button", "", -1160946982);
                                byte var15 = 8;
                                if (var4 < var15) {
                                    if (dummy >= -263010112) {
                                        throw new IllegalStateException();
                                    } else {
                                        ClientData.loadStatusString = StringConstants.fieldG + 100 * var4 / var15 + "%";
                                        ClientData.fieldAe = 194401022;
                                    }
                                } else {
                                    ClientData.loadStatusString = StringConstants.fieldY;
                                    ClientData.fieldAe = 194401022;
                                    UnknownEnum.method373(5, (byte) -124);
                                    Client.bootState = 926022110;
                                }
                            }
                        } else if (70 == Client.bootState * -465086451) {
                            if (!classBt.config.isLoaded(-300912584)) {
                                if (dummy >= -263010112) {
                                    throw new IllegalStateException();
                                } else {
                                    ClientData.loadStatusString = StringConstants.fieldP + classBt.config.cv((byte) 91) + "%";
                                    ClientData.fieldAe = -1484705692;
                                }
                            } else {
                                ReferenceTableSub var17 = classBt.config;
                                classAo.fieldA = var17;
                                GameEngine.method197(classBt.config, (byte) 1);
                                GraphicsStub.method406(classBt.config, Preferences.fieldBl, 2141687126);
                                NpcDefinition.method378(classBt.config, Preferences.fieldBl, Client.lowMemory, (byte) 1);
                                UtilClass14.method49(classBt.config, Preferences.fieldBl, -1541278833);
                                UtilClass38.method126(classBt.config, Preferences.fieldBl, Client.fieldK, ObjectDefinition.font_p11full, -1916632383);
                                var11 = classBt.config;
                                var12 = Client.fieldAc;
                                var13 = classBo.fieldAp;
                                AnimationSequence.fieldA = var11;
                                AnimationSequence.fieldV = var12;
                                AnimationSequence.fieldI = var13;
                                Preferences.method113(classBt.config, Preferences.fieldBl, (short) 31138);
                                UtilClass16.method58(classBt.config, -1595114081);
                                ReferenceTableSub var14 = classBt.config;
                                Varp.fieldA = var14;
                                Varp.fieldV = Varp.fieldA.getFileEntryCount(16, (byte) 0) * 1595155571;
                                LandscapeMod.method121(Client.fieldBu, Preferences.fieldBl, UtilClass5.fieldBp, classM.fieldBe, 1385310866);
                                UnknownEnum2.method102(classBt.config, (byte) -53);
                                ReferenceTableSub var16 = classBt.config;
                                WidgetStrings.fieldA = var16;
                                ClientData.loadStatusString = StringConstants.fieldR;
                                ClientData.fieldAe = -1484705692;
                                Client.bootState = -2009522800;
                            }
                        } else if (Client.bootState * -465086451 == 80) {
                            if (dummy >= -263010112) {
                                throw new IllegalStateException();
                            } else {
                                var10 = 0;
                                if (Projectile.fieldEi == null) {
                                    if (dummy >= -263010112) {
                                        throw new IllegalStateException();
                                    }

                                    Projectile.fieldEi = classM.method133(UtilClass5.fieldBp, "compass", "", (byte) 105);
                                } else {
                                    ++var10;
                                }

                                if (TaskHandler.mapedge == null) {
                                    TaskHandler.mapedge = classM.method133(UtilClass5.fieldBp, "mapedge", "", (byte) 87);
                                } else {
                                    ++var10;
                                }

                                if (null == UtilClass10.MMObjectIcons) {
                                    if (dummy >= -263010112) {
                                        return;
                                    }

                                    UtilClass10.MMObjectIcons = classDs.method82(UtilClass5.fieldBp, "mapscene", "", 383993922);
                                } else {
                                    ++var10;
                                }

                                if (EntityMarker.hintIcons == null) {
                                    if (dummy >= -263010112) {
                                        return;
                                    }

                                    EntityMarker.hintIcons = UtilClass24.method4(UtilClass5.fieldBp, "mapfunction", "", (byte) 94);
                                } else {
                                    ++var10;
                                }

                                if (null == Npc.hitmarks) {
                                    if (dummy >= -263010112) {
                                        throw new IllegalStateException();
                                    }

                                    Npc.hitmarks = UtilClass24.method4(UtilClass5.fieldBp, "hitmarks", "", (byte) 123);
                                } else {
                                    ++var10;
                                }

                                if (null == UtilClass22.PkHeadIcons) {
                                    if (dummy >= -263010112) {
                                        throw new IllegalStateException();
                                    }

                                    UtilClass22.PkHeadIcons = UtilClass24.method4(UtilClass5.fieldBp, "headicons_pk", "", (byte) 105);
                                } else {
                                    ++var10;
                                }

                                if (null == LandscapeMod.prayerHeadIcons) {
                                    if (dummy >= -263010112) {
                                        throw new IllegalStateException();
                                    }

                                    LandscapeMod.prayerHeadIcons = UtilClass24.method4(UtilClass5.fieldBp, "headicons_prayer", "", (byte) 105);
                                } else {
                                    ++var10;
                                }

                                if (null == LandscapeTile.hintHeadIcons) {
                                    if (dummy >= -263010112) {
                                        throw new IllegalStateException();
                                    }

                                    LandscapeTile.hintHeadIcons = UtilClass24.method4(UtilClass5.fieldBp, "headicons_hint", "", (byte) 79);
                                } else {
                                    ++var10;
                                }

                                if (UtilClass5.mapMarkers == null) {
                                    if (dummy >= -263010112) {
                                        return;
                                    }

                                    UtilClass5.mapMarkers = UtilClass24.method4(UtilClass5.fieldBp, "mapmarker", "", (byte) 68);
                                } else {
                                    ++var10;
                                }

                                if (null == classAw.mouseCrosses) {
                                    if (dummy >= -263010112) {
                                        throw new IllegalStateException();
                                    }

                                    classAw.mouseCrosses = UtilClass24.method4(UtilClass5.fieldBp, "cross", "", (byte) 100);
                                } else {
                                    ++var10;
                                }

                                if (UtilClass25.mapdots == null) {
                                    if (dummy >= -263010112) {
                                        throw new IllegalStateException();
                                    }

                                    UtilClass25.mapdots = UtilClass24.method4(UtilClass5.fieldBp, "mapdots", "", (byte) 89);
                                } else {
                                    ++var10;
                                }

                                if (null == TaskHandler.scollbars) {
                                    if (dummy >= -263010112) {
                                        throw new IllegalStateException();
                                    }

                                    TaskHandler.scollbars = classDs.method82(UtilClass5.fieldBp, "scrollbar", "", 383993922);
                                } else {
                                    ++var10;
                                }

                                if (ItemTable.modIcons == null) {
                                    ItemTable.modIcons = classDs.method82(UtilClass5.fieldBp, "mod_icons", "", 383993922);
                                } else {
                                    ++var10;
                                }

                                if (null == ClanMate.mapback) {
                                    if (dummy >= -263010112) {
                                        throw new IllegalStateException();
                                    }

                                    ClanMate.mapback = DynamicObject.method137(UtilClass5.fieldBp, "mapback", "", 1454489932);
                                } else {
                                    ++var10;
                                }

                                if (var10 < 14) {
                                    if (dummy >= -263010112) {
                                        throw new IllegalStateException();
                                    } else {
                                        ClientData.loadStatusString = StringConstants.fieldZ + 100 * var10 / 14 + "%";
                                        ClientData.fieldAe = 1131154890;
                                    }
                                } else {
                                    classGs.fieldS = ItemTable.modIcons;
                                    TaskHandler.mapedge.b();
                                    var2 = (int) (Math.random() * 21.0D) - 10;
                                    var3 = (int) (Math.random() * 21.0D) - 10;
                                    var4 = (int) (Math.random() * 21.0D) - 10;
                                    var5 = (int) (Math.random() * 41.0D) - 20;

                                    for (int var6 = 0; var6 < EntityMarker.hintIcons.length; ++var6) {
                                        EntityMarker.hintIcons[var6].i(var2 + var5, var3 + var5, var5 + var4);
                                    }

                                    UtilClass10.MMObjectIcons[0].v(var5 + var2, var5 + var3, var4 + var5);
                                    CalendarUtil.method294(40311488);
                                    ClientData.loadStatusString = StringConstants.fieldC;
                                    ClientData.fieldAe = 1131154890;
                                    Client.bootState = -650100414;
                                }
                            }
                        } else if (Client.bootState * -465086451 == 90) {
                            if (dummy < -263010112) {
                                if (!ClientData.textures.isLoaded(363728695)) {
                                    if (dummy >= -263010112) {
                                        throw new IllegalStateException();
                                    } else {
                                        ClientData.loadStatusString = StringConstants.fieldAn + ClientData.textures.cv((byte) 42) + "%";
                                        ClientData.fieldAe = 2067908758;
                                    }
                                } else {
                                    short var10006;
                                    if (Client.lowMemory) {
                                        if (dummy >= -263010112) {
                                            throw new IllegalStateException();
                                        }

                                        var10006 = 64;
                                    } else {
                                        var10006 = 128;
                                    }

                                    TextureManagerImpl var9 = new TextureManagerImpl(ClientData.textures, UtilClass5.fieldBp, 20, 0.8D, var10006);
                                    RSGraphics2D.method313(var9);
                                    RSGraphics2D.method308(0.8D);
                                    ClientData.loadStatusString = StringConstants.fieldAs;
                                    ClientData.fieldAe = 2067908758;
                                    Client.bootState = 2068744358;
                                }
                            }
                        } else if (Client.bootState * -465086451 == 110) {
                            Client.inputHandler = new InputHandler();
                            globalTaskSchedular.scheduleThreadTask(Client.inputHandler, 10, 2145561415);
                            ClientData.loadStatusString = StringConstants.fieldAh;
                            ClientData.fieldAe = -321720846;
                            Client.bootState = -866800552;
                        } else if (120 == Client.bootState * -465086451) {
                            if (!JagSocket.wordpack.g("huffman", "", -2135369433)) {
                                ClientData.loadStatusString = StringConstants.fieldAr + 0 + "%";
                                ClientData.fieldAe = -1516535648;
                            } else {
                                classCs var8 = new classCs(JagSocket.wordpack.j("huffman", "", (byte) 25));
                                Client.csInstance = var8;
                                ClientData.loadStatusString = StringConstants.fieldAe;
                                ClientData.fieldAe = -1516535648;
                                Client.bootState = 492621834;
                            }
                        } else if (130 == Client.bootState * -465086451) {
                            if (!Client.fieldBu.isLoaded(-984964533)) {
                                ClientData.loadStatusString = StringConstants.fieldAv + Client.fieldBu.cv((byte) 67) * 4 / 5 + "%";
                                ClientData.fieldAe = 388802044;
                            } else if (!Client.runescripts.isLoaded(2083650412)) {
                                ClientData.loadStatusString = StringConstants.fieldAv + (80 + Client.runescripts.cv((byte) 109) / 6) + "%";
                                ClientData.fieldAe = 388802044;
                            } else if (!classM.fieldBe.isLoaded(1754313432)) {
                                if (dummy >= -263010112) {
                                    throw new IllegalStateException();
                                } else {
                                    ClientData.loadStatusString = StringConstants.fieldAv + (96 + classM.fieldBe.cv((byte) 45) / 20) + "%";
                                    ClientData.fieldAe = 388802044;
                                }
                            } else {
                                ClientData.loadStatusString = StringConstants.fieldAl;
                                ClientData.fieldAe = 388802044;
                                Client.bootState = 1852044220;
                            }
                        } else if (Client.bootState * -465086451 == 140) {
                            if (dummy >= -263010112) {
                                throw new IllegalStateException();
                            } else {
                                UnknownEnum.method373(10, (byte) -25);
                            }
                        }
                    }
                } else if (dummy >= -263010112) {
                    throw new IllegalStateException();
                } else {
                    int[] var1 = new int[9];

                    for (var2 = 0; var2 < 9; ++var2) {
                        var3 = 15 + 32 * var2 + 128;
                        var4 = 600 + 3 * var3;
                        var5 = RSGraphics2D.SIN_TABLE[var3];
                        var1[var2] = var5 * var4 >> 16;
                    }

                    Landscape.buildVisibilityMap(var1, 500, 800, 512, 334);
                    ClientData.loadStatusString = StringConstants.fieldX;
                    ClientData.fieldAe = -1679106714;
                    Client.bootState = -216700138;
                }
            }
        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "bx.f(" + ')');
        }
    }

    @Override
    public synchronized void removeConsumer(ImageConsumer var1) {
        try {
            if (this.fieldV == var1) {
                this.fieldV = null;
            }

        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "bx.removeConsumer(" + ')');
        }
    }

    @Override
    public final void i(Graphics var1, int var2, int var3, int var4, int var5, byte var6) {
        try {
            this.l(var2, var3, var4, var5, -299215831);
            Shape var7 = var1.getClip();
            var1.clipRect(var2, var3, var4, var5);
            var1.drawImage(this.fieldM, 0, 0, this);
            var1.setClip(var7);
        } catch (RuntimeException var8) {
            throw ClanMate.error(var8, "bx.i(" + ')');
        }
    }

    @Override
    public void startProduction(ImageConsumer var1) {
        try {
            this.addConsumer(var1);
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "bx.startProduction(" + ')');
        }
    }

    @Override
    public void requestTopDownLeftRightResend(ImageConsumer var1) {
        try {
            ;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "bx.requestTopDownLeftRightResend(" + ')');
        }
    }

    synchronized void b(int var1) {
        try {
            if (null != this.fieldV) {
                this.fieldV.setPixels(0, 0, this.fieldB * -1687097855, this.fieldL * 1535411689, this.fieldA, this.fieldI, 0, this.fieldB * -1687097855);
                this.fieldV.imageComplete(2);
            }
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "bx.b(" + ')');
        }
    }

    synchronized void l(int var1, int var2, int var3, int var4, int var5) {
        try {
            if (null == this.fieldV) {
                if (var5 == -1033996617) {
                    throw new IllegalStateException();
                }
            } else {
                this.fieldV.setPixels(var1, var2, var3, var4, this.fieldA, this.fieldI, var2 * this.fieldB * -1687097855 + var1, this.fieldB * -1687097855);
                this.fieldV.imageComplete(2);
            }
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "bx.l(" + ')');
        }
    }

    @Override
    public boolean imageUpdate(Image var1, int var2, int var3, int var4, int var5, int var6) {
        try {
            return true;
        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "bx.imageUpdate(" + ')');
        }
    }

    @Override
    public synchronized void addConsumer(ImageConsumer var1) {
        try {
            this.fieldV = var1;
            var1.setDimensions(this.fieldB * -1687097855, this.fieldL * 1535411689);
            var1.setProperties((Hashtable) null);
            var1.setColorModel(this.fieldA);
            var1.setHints(14);
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "bx.addConsumer(" + ')');
        }
    }

    @Override
    public final void a(int var1, int var2, Component var3, byte var4) {
        try {
            this.fieldB = 1238569473 * var1;
            this.fieldL = var2 * -223305127;
            this.fieldI = new int[1 + var2 * var1];
            this.fieldA = new DirectColorModel(32, 16711680, '\uff00', 255);
            this.fieldM = var3.createImage(this);
            this.b(902680581);
            var3.prepareImage(this.fieldM, this);
            this.b(902680581);
            var3.prepareImage(this.fieldM, this);
            this.b(902680581);
            var3.prepareImage(this.fieldM, this);
            this.av(651564399);
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "bx.a(" + ')');
        }
    }

    @Override
    public synchronized boolean isConsumer(ImageConsumer var1) {
        try {
            return this.fieldV == var1;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "bx.isConsumer(" + ')');
        }
    }

    @Override
    public final void v(Graphics var1, int var2, int var3, int var4) {
        try {
            this.b(902680581);
            var1.drawImage(this.fieldM, var2, var3, this);
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "bx.v(" + ')');
        }
    }
}
