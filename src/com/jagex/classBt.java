package com.jagex;

public class classBt {

    public static boolean fieldD;
    public static ReferenceTableSub config;
    int fieldL;
    int[][] fieldM;
    int fieldB;


    public classBt(int var1, int var2) {
        if (var1 != var2) {
            int var3 = classAo.method400(var1, var2, 2057465513);
            var1 /= var3;
            var2 /= var3;
            this.fieldB = var1 * -991771787;
            this.fieldL = 494613289 * var2;
            this.fieldM = new int[var1][14];

            for (int var4 = 0; var4 < var1; ++var4) {
                int[] var5 = this.fieldM[var4];
                double var6 = 6.0D + (double) var4 / (double) var1;
                int var8 = (int) Math.floor(var6 - 7.0D + 1.0D);
                if (var8 < 0) {
                    var8 = 0;
                }

                int var9 = (int) Math.ceil(var6 + 7.0D);
                if (var9 > 14) {
                    var9 = 14;
                }

                for (double var10 = (double) var2 / (double) var1; var8 < var9; ++var8) {
                    double var12 = 3.141592653589793D * ((double) var8 - var6);
                    double var14 = var10;
                    if (var12 < -1.0E-4D || var12 > 1.0E-4D) {
                        var14 = var10 * (Math.sin(var12) / var12);
                    }

                    var14 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double) var8 - var6));
                    var5[var8] = (int) Math.floor(var14 * 65536.0D + 0.5D);
                }
            }

        }
    }

    static final void method255(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
        try {
            int var8;
            if (var2 >= 0) {
                if (var7 == 18) {
                    throw new IllegalStateException();
                }

                if (var2 < 104) {
                    if (var7 == 18) {
                        return;
                    }

                    if (var3 >= 0) {
                        if (var7 == 18) {
                            return;
                        }

                        if (var3 < 104) {
                            if (var7 == 18) {
                                throw new IllegalStateException();
                            }

                            classM.renderRules[var1][var2][var3] = 0;

                            while (true) {
                                var8 = var0.readUByte();
                                if (0 == var8) {
                                    if (var7 == 18) {
                                        throw new IllegalStateException();
                                    }

                                    if (0 == var1) {
                                        if (var7 == 18) {
                                            return;
                                        }

                                        classM.tileHeights[0][var2][var3] = -ScriptEvent.method107(932731 + var2 + var4, var5 + var3 + 556238, -2083936259) * 8;
                                    } else {
                                        classM.tileHeights[var1][var2][var3] = classM.tileHeights[var1 - 1][var2][var3] - 240;
                                    }

                                    return;
                                }

                                if (var8 == 1) {
                                    if (var7 == 18) {
                                        throw new IllegalStateException();
                                    }

                                    int var9 = var0.readUByte();
                                    if (var9 == 1) {
                                        if (var7 == 18) {
                                            throw new IllegalStateException();
                                        }

                                        var9 = 0;
                                    }

                                    if (var1 == 0) {
                                        if (var7 == 18) {
                                            return;
                                        }

                                        classM.tileHeights[0][var2][var3] = 8 * -var9;
                                    } else {
                                        classM.tileHeights[var1][var2][var3] = classM.tileHeights[var1 - 1][var2][var3] - var9 * 8;
                                    }

                                    return;
                                }

                                if (var8 <= 49) {
                                    if (var7 == 18) {
                                        throw new IllegalStateException();
                                    }

                                    classBy.fieldL[var1][var2][var3] = var0.readByte();
                                    classM.fieldM[var1][var2][var3] = (byte) ((var8 - 2) / 4);
                                    classM.fieldW[var1][var2][var3] = (byte) (var8 - 2 + var6 & 3);
                                } else if (var8 <= 81) {
                                    if (var7 == 18) {
                                        throw new IllegalStateException();
                                    }

                                    classM.renderRules[var1][var2][var3] = (byte) (var8 - 49);
                                } else {
                                    classM.fieldB[var1][var2][var3] = (byte) (var8 - 81);
                                }
                            }
                        }
                    }
                }
            }

            while (true) {
                var8 = var0.readUByte();
                if (0 == var8) {
                    break;
                }

                if (1 == var8) {
                    if (var7 == 18) {
                        throw new IllegalStateException();
                    }

                    var0.readUByte();
                    break;
                }

                if (var8 <= 49) {
                    if (var7 == 18) {
                        return;
                    }

                    var0.readUByte();
                }
            }

        } catch (RuntimeException var10) {
            throw ClanMate.error(var10, "bt.l(" + ')');
        }
    }

    public static Sprite method256(ReferenceTable var0, int var1, int var2, int var3) {
        try {
            if (!classAo.method398(var0, var1, var2, (byte) -58)) {
                return null;
            } else {
                Sprite var5 = new Sprite();
                var5.fieldM = UtilClass2.fieldV * 1527976215;
                var5.fieldW = UtilClass1.fieldI * -517911549;
                var5.fieldB = IgnoredPlayer.fieldB[0];
                var5.fieldL = ExchangeOfferPriceComparator.fieldL[0];
                var5.width = ExchangeOfferQuantityComparator.fieldM[0];
                var5.height = UtilClass1.fieldW[0];
                int var6 = var5.width * var5.height;
                byte[] var7 = classEp.fieldN[0];
                var5.pixels = new int[var6];
                for (int var8 = 0; var8 < var6; ++var8) {
                    var5.pixels[var8] = UtilClass1.fieldE[var7[var8] & 255];
                }
                classAo.method399(-1654272909);
                return var5;
            }
        } catch (RuntimeException var9) {
            throw ClanMate.error(var9, "bt.i(" + ')');
        }
    }

    static void method257(byte var0) {
        try {
            if (Client.isSpellSelected) {
                Widget var1 = Message.getWidget(classG.selectedSpellParentUID * 763146509, Client.selectedSpellChildIndex * 891259469, (byte) 1);
                if (null != var1 && var1.fieldCk != null) {
                    ScriptEvent var2 = new ScriptEvent();
                    var2.src = var1;
                    var2.args = var1.fieldCk;
                    classT.method167(var2, (byte) 1);
                }

                Client.isSpellSelected = false;
                classBx.method250(var1, 57574739);
            }
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "bt.bd(" + ')');
        }
    }

    int v(int var1, int var2) {
        try {
            if (this.fieldM != null) {
                if (var2 != -891201059) {
                    throw new IllegalStateException();
                }

                var1 = (int) ((long) var1 * (long) (this.fieldL * -1890510567) / (long) (this.fieldB * -1129073443));
            }

            return var1;
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "bt.v(" + ')');
        }
    }

    int i(int var1, int var2) {
        try {
            if (null != this.fieldM) {
                if (var2 == 510100053) {
                    throw new IllegalStateException();
                }

                var1 = (int) ((long) var1 * (long) (this.fieldL * -1890510567) / (long) (this.fieldB * -1129073443)) + 6;
            }

            return var1;
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "bt.i(" + ')');
        }
    }

    byte[] a(byte[] var1, int var2) {
        try {
            if (null != this.fieldM) {
                if (var2 >= -1038133839) {
                    throw new IllegalStateException();
                }

                int var3 = 14 + (int) ((long) var1.length * (long) (this.fieldL * -1890510567) / (long) (this.fieldB * -1129073443));
                int[] var4 = new int[var3];
                int var5 = 0;
                int var6 = 0;

                int var7;
                for (var7 = 0; var7 < var1.length; ++var7) {
                    byte var8 = var1[var7];
                    int[] var9 = this.fieldM[var6];

                    int var10;
                    for (var10 = 0; var10 < 14; ++var10) {
                        if (var2 >= -1038133839) {
                            throw new IllegalStateException();
                        }

                        var4[var10 + var5] += var9[var10] * var8;
                    }

                    var6 += this.fieldL * -1890510567;
                    var10 = var6 / (this.fieldB * -1129073443);
                    var5 += var10;
                    var6 -= var10 * this.fieldB * -1129073443;
                }

                var1 = new byte[var3];

                for (var7 = 0; var7 < var3; ++var7) {
                    if (var2 >= -1038133839) {
                        throw new IllegalStateException();
                    }

                    int var12 = '\u8000' + var4[var7] >> 16;
                    if (var12 < -128) {
                        if (var2 >= -1038133839) {
                            throw new IllegalStateException();
                        }

                        var1[var7] = -128;
                    } else if (var12 > 127) {
                        if (var2 >= -1038133839) {
                            throw new IllegalStateException();
                        }

                        var1[var7] = 127;
                    } else {
                        var1[var7] = (byte) var12;
                    }
                }
            }

            return var1;
        } catch (RuntimeException var11) {
            throw ClanMate.error(var11, "bt.a(" + ')');
        }
    }
}
