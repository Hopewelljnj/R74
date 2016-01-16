package com.jagex;

public class InputHandler implements Runnable {

    static int fieldOp;
    static Widget fieldGc;
    int fieldI = 0;
    boolean fieldA = true;
    int[] fieldB = new int[500];
    int[] fieldL = new int[500];
    Object fieldV = new Object();

    static final boolean method86(int var0, int var1) {
        try {
            if (var0 < 0) {
                if (var1 != -959053341) {
                    throw new IllegalStateException();
                } else {
                    return false;
                }
            } else {
                int var2 = Client.menuOpcodes[var0];
                if (var2 >= 2000) {
                    if (var1 != -959053341) {
                        throw new IllegalStateException();
                    }

                    var2 -= 2000;
                }

                if (var2 == 1007) {
                    if (var1 != -959053341) {
                        throw new IllegalStateException();
                    } else {
                        return true;
                    }
                } else {
                    return false;
                }
            }
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "f.bt(" + ')');
        }
    }

    static final void drawScrollBar(int endX, int startY, int yInset, int height, int viewportHeight) {
        try {
            TaskHandler.scollbars[0].i(endX, startY);
            TaskHandler.scollbars[1].i(endX, height + startY - 16);
            RSGraphics.method235(endX, startY + 16, 16, height - 32, Client.fieldEw * -100331717);
            int var6 = (height - 32) * height / viewportHeight;
            if (var6 < 8) {
                var6 = 8;
            }
            int var7 = (height - 32 - var6) * yInset / (viewportHeight - height);
            RSGraphics.method235(endX, var7 + 16 + startY, 16, var6, Client.fieldEr * -470526025);
            RSGraphics.method240(endX, 16 + startY + var7, var6, Client.fieldFv * -861735371);
            RSGraphics.method240(endX + 1, var7 + startY + 16, var6, Client.fieldFv * -861735371);
            RSGraphics.method238(endX, var7 + startY + 16, 16, Client.fieldFv * -861735371);
            RSGraphics.method238(endX, var7 + startY + 17, 16, Client.fieldFv * -861735371);
            RSGraphics.method240(15 + endX, 16 + startY + var7, var6, Client.fieldFt * -689020601);
            RSGraphics.method240(14 + endX, startY + 17 + var7, var6 - 1, Client.fieldFt * -689020601);
            RSGraphics.method238(endX, var7 + startY + 15 + var6, 16, Client.fieldFt * -689020601);
            RSGraphics.method238(endX + 1, var6 + var7 + 14 + startY, 15, Client.fieldFt * -689020601);
        } catch (RuntimeException var8) {
            throw ClanMate.error(var8, "f.cb(" + ')');
        }
    }

    static final void method88(Widget[] var0, int var1, int var2) {
        try {
            for (int var3 = 0; var3 < var0.length; ++var3) {
                Widget var4 = var0[var3];
                if (var4 == null) {
                    if (var2 <= -260026241) {
                        throw new IllegalStateException();
                    }
                } else {
                    if (0 == var4.type * -729517859) {
                        if (var2 <= -260026241) {
                            throw new IllegalStateException();
                        }

                        if (null != var4.children) {
                            if (var2 <= -260026241) {
                                throw new IllegalStateException();
                            }

                            method88(var4.children, var1, -174677492);
                        }

                        WidgetNode var5 = (WidgetNode) Client.widgetNodes.get((long) (var4.id * -1866039137));
                        if (var5 != null) {
                            if (var2 <= -260026241) {
                                throw new IllegalStateException();
                            }

                            int var6 = var5.owner * -1220935357;
                            if (!Widget.loadWidget(var6, 477596194)) {
                                if (var2 <= -260026241) {
                                    throw new IllegalStateException();
                                }
                            } else {
                                method88(Widget.widgets[var6], var1, 649801650);
                            }
                        }
                    }

                    ScriptEvent var8;
                    if (0 == var1) {
                        if (var2 <= -260026241) {
                            throw new IllegalStateException();
                        }

                        if (null != var4.fieldDp) {
                            var8 = new ScriptEvent();
                            var8.src = var4;
                            var8.args = var4.fieldDp;
                            classT.method167(var8, (byte) 1);
                        }
                    }

                    if (1 == var1 && var4.fieldDu != null) {
                        if (var2 <= -260026241) {
                            throw new IllegalStateException();
                        }

                        if (var4.index * 1176560255 >= 0) {
                            if (var2 <= -260026241) {
                                throw new IllegalStateException();
                            }

                            Widget var9 = Widget.lookup(var4.id * -1866039137);
                            if (null == var9) {
                                continue;
                            }

                            if (var2 <= -260026241) {
                                throw new IllegalStateException();
                            }

                            if (null == var9.children) {
                                continue;
                            }

                            if (var2 <= -260026241) {
                                throw new IllegalStateException();
                            }

                            if (var4.index * 1176560255 >= var9.children.length) {
                                continue;
                            }

                            if (var2 <= -260026241) {
                                throw new IllegalStateException();
                            }

                            if (var9.children[var4.index * 1176560255] != var4) {
                                if (var2 <= -260026241) {
                                    throw new IllegalStateException();
                                }
                                continue;
                            }
                        }

                        var8 = new ScriptEvent();
                        var8.src = var4;
                        var8.args = var4.fieldDu;
                        classT.method167(var8, (byte) 1);
                    }
                }
            }

        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "f.cv(" + ')');
        }
    }

    static final void method89(boolean var0, int var1) {
        try {
            while (true) {
                if (Client.packet.hf(Client.fieldCb * 237192877, (byte) -66) >= 27) {
                    int var2 = Client.packet.gx(15, 420988941);
                    if (var2 != 32767) {
                        boolean var3 = false;
                        if (Client.npcs[var2] == null) {
                            Client.npcs[var2] = new Npc();
                            var3 = true;
                        }

                        Npc var4 = Client.npcs[var2];
                        Client.npcIndices[(Client.npcCount += -835472933) * 1825497683 - 1] = var2;
                        var4.fieldBx = Client.engineCycle * 612066721;
                        int var5;
                        if (var0) {
                            var5 = Client.packet.gx(8, 738073930);
                            if (var5 > 127) {
                                var5 -= 256;
                            }
                        } else {
                            var5 = Client.packet.gx(5, -1327276900);
                            if (var5 > 15) {
                                var5 -= 32;
                            }
                        }

                        int var6 = Client.packet.gx(1, -1925756599);
                        if (var6 == 1) {
                            Client.fieldHm[(Client.fieldHt += -530461679) * -839605007 - 1] = var2;
                        }

                        var4.definition = classBo.getNpcDefinition(Client.packet.gx(14, -600738269), 2093290320);
                        int var7;
                        if (var0) {
                            if (var1 == 850828243) {
                                return;
                            }

                            var7 = Client.packet.gx(8, 830407842);
                            if (var7 > 127) {
                                var7 -= 256;
                            }
                        } else {
                            var7 = Client.packet.gx(5, -647153297);
                            if (var7 > 15) {
                                var7 -= 32;
                            }
                        }

                        int var8 = Client.characterOrientations[Client.packet.gx(3, 1193115362)];
                        if (var3) {
                            var4.objOrientation = (var4.orientation = var8 * -32522175) * -1334373177;
                        }

                        int var9 = Client.packet.gx(1, -731664590);
                        var4.fieldZ = var4.definition.fieldW * -1071812819;
                        var4.rotation = var4.definition.fieldAr * -1813489879;
                        if (var4.rotation * 1900546291 == 0) {
                            if (var1 == 850828243) {
                                throw new IllegalStateException();
                            }

                            var4.orientation = 0;
                        }

                        var4.fieldAh = var4.definition.fieldD * 1480332531;
                        var4.fieldAr = var4.definition.fieldX * -1576917557;
                        var4.fieldAe = -1671059465 * var4.definition.fieldO;
                        var4.fieldAv = 1744558285 * var4.definition.fieldQ;
                        var4.fieldC = 1621553521 * var4.definition.fieldS;
                        var4.fieldAn = var4.definition.fieldK * 372403091;
                        var4.fieldAs = var4.definition.fieldF * 774167835;
                        int var10001 = Client.myPlayer.queueX[0] + var5;
                        int var10002 = Client.myPlayer.queueY[0] + var7;
                        boolean var10003;
                        if (var9 == 1) {
                            if (var1 == 850828243) {
                                throw new IllegalStateException();
                            }

                            var10003 = true;
                        } else {
                            var10003 = false;
                        }

                        var4.setLocation(var10001, var10002, var10003, (byte) 10);
                        continue;
                    }

                    if (var1 == 850828243) {
                        throw new IllegalStateException();
                    }
                }

                Client.packet.hd((byte) 65);
                return;
            }
        } catch (RuntimeException var10) {
            throw ClanMate.error(var10, "f.bz(" + ')');
        }
    }

    @Override
    public void run() {
        try {
            for (; this.fieldA; classCs.fancySleep(50L)) {
                Object var1 = this.fieldV;
                synchronized (this.fieldV) {
                    if (this.fieldI * -1475327361 < 500) {
                        this.fieldB[this.fieldI * -1475327361] = Mouse.fieldW * 518596439;
                        this.fieldL[this.fieldI * -1475327361] = Mouse.fieldE * 1747296693;
                        this.fieldI += -1398704769;
                    }
                }
            }

        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "f.run(" + ')');
        }
    }
}
