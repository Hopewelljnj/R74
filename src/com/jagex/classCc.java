package com.jagex;

public class classCc extends Node {

    int fieldV;
    int fieldA;
    int[][] fieldB;
    int[] fieldI;


    classCc(int var1, byte[] var2) {
        this.fieldA = 1120726835 * var1;
        Buffer var3 = new Buffer(var2);
        this.fieldV = var3.readUByte() * -1633000201;
        this.fieldI = new int[this.fieldV * -605840185];
        this.fieldB = new int[this.fieldV * -605840185][];

        int var4;
        for (var4 = 0; var4 < this.fieldV * -605840185; ++var4) {
            this.fieldI[var4] = var3.readUByte();
        }

        for (var4 = 0; var4 < this.fieldV * -605840185; ++var4) {
            this.fieldB[var4] = new int[var3.readUByte()];
        }

        for (var4 = 0; var4 < this.fieldV * -605840185; ++var4) {
            for (int var5 = 0; var5 < this.fieldB[var4].length; ++var5) {
                this.fieldB[var4][var5] = var3.readUByte();
            }
        }

    }

    static final void method349(Character var0, int var1, int var2, int var3, int var4, int var5, int DUMMY) {
        try {
            if (null != var0) {

                if (var0.isValid(-852595417)) {
                    NpcDefinition var7;
                    if (var0 instanceof Npc) {
                        var7 = ((Npc) var0).definition;
                        if (null != var7.transformIds) {
                            var7 = var7.transform(-480018585);
                        }

                        if (null == var7) {
                            return;
                        }
                    }

                    int var10;
                    if (var1 < Client.playerCount * 16022533) {
                        var10 = 30;
                        Player var8 = (Player) var0;
                        if (var8.hidden) {
                            return;
                        }
                        if (-1 != var8.skullIcon * -1115508231 || -1 != var8.prayerIcon * -771982283) {
                            LandscapeMod.method122(var0, 15 + var0.fieldBn * 72273813, -1850909185);
                            if (Client.fieldGk * -1627343845 > -1) {
                                if (var8.skullIcon * -1115508231 != -1) {
                                    UtilClass22.PkHeadIcons[var8.skullIcon * -1115508231].f(Client.fieldGk * -1627343845 + var2 - 12, Client.fieldGj * 43171827 + var3 - var10);
                                    var10 += 25;
                                }

                                if (-1 != var8.prayerIcon * -771982283) {
                                    LandscapeMod.prayerHeadIcons[var8.prayerIcon * -771982283].f(Client.fieldGk * -1627343845 + var2 - 12, var3 + Client.fieldGj * 43171827 - var10);
                                    var10 += 25;
                                }
                            }
                        }

                        if (var1 >= 0 && Client.fieldAe * 314239289 == 10) {
                            if (Client.playerIndicies[var1] == Client.hintIconPlayerIndex * 1040701653) {
                                LandscapeMod.method122(var0, var0.fieldBn * 72273813 + 15, -693939034);
                                if (Client.fieldGk * -1627343845 > -1) {
                                    LandscapeTile.hintHeadIcons[1].f(Client.fieldGk * -1627343845 + var2 - 12, Client.fieldGj * 43171827 + var3 - var10);
                                }
                            }
                        }
                    }
                    var7 = ((Npc) var0).definition;
                    if (null != var7.transformIds) {
                        var7 = var7.transform(795172589);
                    }

                    if (var7.fieldAh * 1032647581 >= 0 && var7.fieldAh * 1032647581 < LandscapeMod.prayerHeadIcons.length) {
                        LandscapeMod.method122(var0, var0.fieldBn * 72273813 + 15, -1511955136);
                        if (Client.fieldGk * -1627343845 > -1) {
                            LandscapeMod.prayerHeadIcons[var7.fieldAh * 1032647581].f(Client.fieldGk * -1627343845 + var2 - 12, var3 + Client.fieldGj * 43171827 - 30);
                        }
                    }

                    if (1 == Client.fieldAe * 314239289) {
                        if (Client.npcIndices[var1 - Client.playerCount * 16022533] == Client.hintIconNpcIndex * -574346357) {
                            if (Client.engineCycle * -1223223371 % 20 < 10) {
                                LandscapeMod.method122(var0, 15 + var0.fieldBn * 72273813, -650903209);
                                if (Client.fieldGk * -1627343845 > -1) {
                                    LandscapeTile.hintHeadIcons[0].f(var2 + Client.fieldGk * -1627343845 - 12, Client.fieldGj * 43171827 + var3 - 28);
                                }
                            }
                        }
                    }

                    if (null != var0.overheadText) {
                        label339:
                        {
                            if (var1 < Client.playerCount * 16022533) {
                                if (var0.fieldAx || 4 != Client.fieldLd * 1046832053 &&
                                        (var0.fieldAm || 0 != Client.fieldLd * 1046832053 && Client.fieldLd * 1046832053 != 3
                                                && (Client.fieldLd * 1046832053 != 1 || !classM.method128(((Player) var0).name,
                                                false, -238757493)))) {
                                    break label339;
                                }
                            }

                            LandscapeMod.method122(var0, var0.fieldBn * 72273813, 546681368);
                            if (Client.fieldGk * -1627343845 > -1 && Client.fieldFn * 275036173 < Client.fieldFq * -1045090583) {
                                Client.fieldFg[Client.fieldFn * 275036173] = MenuItem.font_b12full.b(var0.overheadText) / 2;
                                Client.fieldFs[Client.fieldFn * 275036173] = MenuItem.font_b12full.fieldW;
                                Client.fieldFh[Client.fieldFn * 275036173] = Client.fieldGk * -1627343845;
                                Client.fieldFi[Client.fieldFn * 275036173] = Client.fieldGj * 43171827;
                                Client.fieldGd[Client.fieldFn * 275036173] = var0.fieldAi * 253224281;
                                Client.fieldGa[Client.fieldFn * 275036173] = var0.fieldAa * 1090050265;
                                Client.fieldGp[Client.fieldFn * 275036173] = var0.fieldAz * -1478694783;
                                Client.fieldGo[Client.fieldFn * 275036173] = var0.overheadText;
                                Client.fieldFn += 1523734213;
                            }
                        }
                    }

                    if (var0.healthBarCycle * -724893931 > Client.engineCycle * -1223223371) {
                        LandscapeMod.method122(var0, var0.fieldBn * 72273813 + 15, -663324658);
                        if (Client.fieldGk * -1627343845 > -1) {
                            int hpBarWidth = 0;
                            if (var1 < Client.playerCount * 16022533) {
                                hpBarWidth = 30; //default 30 width
                            } else {
                                //some npcs such as corporal beast have thicker health bar...
                                NpcDefinition var11 = ((Npc) var0).definition;
                                hpBarWidth = var11.healthBarWidth * 259799099;
                            }

                            int hp = var0.health * -1828850553 * hpBarWidth / (var0.maxHealth * 100013999);
                            if (hp > hpBarWidth) {
                                hp = hpBarWidth;
                            } else if (0 == hp && var0.health * -1828850553 > 0) {
                                hp = 1;
                            }

                            RSGraphics.method235(Client.fieldGk * -1627343845 + var2 - hpBarWidth / 2, Client.fieldGj * 43171827 + var3 - 3, hp, 5, '\uff00');
                            RSGraphics.method235(Client.fieldGk * -1627343845 + var2 - hpBarWidth / 2 + hp, Client.fieldGj * 43171827 + var3 - 3, hpBarWidth - hp, 5, 16711680);
                        }
                    }

                    for (var10 = 0; var10 < 4; ++var10) {
                        if (var0.hitsplatCycles[var10] > Client.engineCycle * -1223223371) {
                            LandscapeMod.method122(var0, var0.fieldBn * 72273813 / 2, -541780041);
                            if (Client.fieldGk * -1627343845 > -1) {
                                if (1 == var10) {
                                    Client.fieldGj -= -697640804;
                                }

                                if (2 == var10) {
                                    Client.fieldGk -= 1762810653;
                                    Client.fieldGj -= 1798663246;
                                }

                                if (3 == var10) {
                                    Client.fieldGk += 1762810653;
                                    Client.fieldGj -= 1798663246;
                                }

                                Npc.hitmarks[var0.hitplatType[var10]].f(var2 + Client.fieldGk * -1627343845 - 12, var3 + Client.fieldGj * 43171827 - 12);
                                ObjectDefinition.font_p11full.k(Integer.toString(var0.hitsplatDamage[var10]), var2 + Client.fieldGk * -1627343845 - 1, 3 + Client.fieldGj * 43171827 + var3, 16777215, 0);
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var9) {
            throw ClanMate.error(var9, "cc.ai(" + ')');
        }
    }

    static final void method350(String var0, int var1) {
        try {
            if (null == var0) {
                if (var1 == 925636544) {
                    ;
                }
            } else {
                String var2 = CalendarUtil.method297(var0, UtilClass38.fieldS, 2096522037);
                if (var2 == null) {
                    if (var1 != 925636544) {
                        throw new IllegalStateException();
                    }
                } else {
                    for (int var3 = 0; var3 < Client.ignoreListSize * 697443259; ++var3) {
                        if (var1 != 925636544) {
                            throw new IllegalStateException();
                        }

                        IgnoredPlayer var4 = Client.ignoredPlayers[var3];
                        String var5 = var4.previousName;
                        String var6 = CalendarUtil.method297(var5, UtilClass38.fieldS, -1015017427);
                        boolean var7;
                        if (null != var0 && var5 != null) {
                            label74:
                            {
                                if (!var0.startsWith("#")) {
                                    if (!var5.startsWith("#")) {
                                        var7 = var2.equals(var6);
                                        break label74;
                                    }

                                    if (var1 != 925636544) {
                                        return;
                                    }
                                }

                                var7 = var0.equals(var5);
                            }
                        } else {
                            var7 = false;
                        }

                        if (var7) {
                            if (var1 != 925636544) {
                                throw new IllegalStateException();
                            }

                            Client.ignoreListSize -= -1571608205;

                            for (int var8 = var3; var8 < Client.ignoreListSize * 697443259; ++var8) {
                                Client.ignoredPlayers[var8] = Client.ignoredPlayers[var8 + 1];
                            }

                            Client.fieldKt = Client.fieldKe * -709004739;
                            Client.fieldCo.writePacketHeader(136, (byte) 0);
                            Packet var11 = Client.fieldCo;
                            int var9 = var0.length() + 1;
                            var11.writeByte(var9);
                            Client.fieldCo.w(var0, (byte) 0);
                            break;
                        }
                    }

                }
            }
        } catch (RuntimeException var10) {
            throw ClanMate.error(var10, "cc.dw(" + ')');
        }
    }

    static final void method351(int var0, int var1, int var2, int var3, int var4) {
        try {
            for (int var5 = 0; var5 < Client.fieldLj * -1726837317; ++var5) {
                if (Client.fieldLq[var5] + Client.fieldLu[var5] > var0) {
                    if (var4 != 697443259) {
                        return;
                    }

                    if (Client.fieldLu[var5] < var2 + var0) {
                        if (var4 != 697443259) {
                            throw new IllegalStateException();
                        }

                        if (Client.fieldLa[var5] + Client.fieldLf[var5] > var1 && Client.fieldLa[var5] < var3 + var1) {
                            Client.fieldLp[var5] = true;
                        }
                    }
                }
            }

        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "cc.bc(" + ')');
        }
    }
}
