package com.jagex;

import java.io.IOException;

public enum UnknownEnum4 {

    UNKNOWN0(1, 0, "", ""),
    UNKNOWN1(0, 1, "", ""),
    UNKNOWN2(5, 2, "", ""),
    UNKNOWN3(4, 3, "", ""),
    UNKNOWN4(6, 4, "", ""),
    UNKNOWN5(7, 5, "", ""),
    UNKNOWN6(2, 6, "", ""),
    UNKNOWN7(3, -1, "", "", true, new UnknownEnum4[]{UNKNOWN0, UNKNOWN1, UNKNOWN2, UNKNOWN4, UNKNOWN3});

    public final int fieldN;
    final String fieldS;


    UnknownEnum4(int var1, int var2, String var3, String var4, boolean var5, UnknownEnum4[] var6) {
        this.fieldN = -1388555817 * var1;
        this.fieldS = var4;
    }

    UnknownEnum4(int var1, int var2, String var3, String var4) {
        this.fieldN = var1 * -1388555817;
        this.fieldS = var4;
    }

    static void method23(World var0, int var1) {
        try {
            if (var0.a(236369456) != Client.fieldK) {
                Client.fieldK = var0.a(-1693427696);
                boolean var2 = var0.a(-415815314);
                if (classEv.fieldM != var2) {
                    if (var1 == 681554074) {
                        throw new IllegalStateException();
                    }

                    ItemDefinition.fieldE.clear();
                    ItemDefinition.fieldN.clear();
                    ItemDefinition.spriteCache.clear();
                    classEv.fieldM = var2;
                }
            }

            UtilClass19.fieldBq = var0.fieldB;
            Client.currentWorld = var0.fieldA * 1930190031;
            Client.fieldL = var0.fieldV * -518266677;
            int var10001;
            if (0 == Client.fieldE * -135999197) {
                if (var1 == 681554074) {
                    return;
                }

                var10001 = '\uaa4a';
            } else {
                var10001 = '\u9c40' + var0.fieldA * 282778565;
            }

            Buffer.fieldBa = 738761855 * var10001;
            UnknownEnum.fieldBv = (Client.fieldE * -135999197 == 0 ? 443 : '\uc350' + var0.fieldA * 282778565) * 300650749;
            DynamicObject.fieldBd = Buffer.fieldBa * 1233499029;
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "gn.n(" + ')');
        }
    }

    static final void method24(boolean var0, int var1) {
        try {
            UtilClass39.method176(25331731);
            Client.fieldCp += -1615896493;
            if (Client.fieldCp * -1655315493 < 50 && !var0) {
                if (var1 != 651432265) {
                    throw new IllegalStateException();
                }
            } else {
                Client.fieldCp = 0;
                if (!Client.fieldCc) {
                    if (var1 != 651432265) {
                        throw new IllegalStateException();
                    }

                    if (Client.socket != null) {
                        if (var1 != 651432265) {
                            throw new IllegalStateException();
                        }

                        Client.fieldCo.writePacketHeader(170, (byte) 0);

                        try {
                            Client.socket.writeLater(Client.fieldCo.payload, 0, Client.fieldCo.caret * 651432265, (byte) 73);
                            Client.fieldCo.caret = 0;
                        } catch (IOException var3) {
                            Client.fieldCc = true;
                        }
                    }
                }

            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "gn.aj(" + ')');
        }
    }

    static void method25(String var0, boolean var1, int var2) {
        try {
            classBt.config.fieldQ = false;
            var0 = var0.toLowerCase();
            short[] var3 = new short[16];
            int var4 = 0;

            for (int var5 = 0; var5 < ExchangeOfferPriceComparator.fieldW * -188179663; ++var5) {
                ItemDefinition var6 = Client.getItemDefinition(var5, -1464579638);
                if (var1) {
                    if (var2 <= 1065296580) {
                        return;
                    }

                    if (!var6.fieldAy) {
                        if (var2 <= 1065296580) {
                            throw new IllegalStateException();
                        }
                        continue;
                    }
                }

                if (var6.fieldAu * -1133001085 != -1) {
                    if (var2 <= 1065296580) {
                        throw new IllegalStateException();
                    }
                } else if (var6.fieldX.toLowerCase().indexOf(var0) == -1) {
                    if (var2 <= 1065296580) {
                        throw new IllegalStateException();
                    }
                } else {
                    if (var4 >= 250) {
                        if (var2 <= 1065296580) {
                            throw new IllegalStateException();
                        }

                        InputHandler.fieldOp = 2059871559;
                        EntityMarker.fieldOj = null;
                        return;
                    }

                    if (var4 >= var3.length) {
                        short[] var7 = new short[var3.length * 2];

                        for (int var8 = 0; var8 < var4; ++var8) {
                            if (var2 <= 1065296580) {
                                return;
                            }

                            var7[var8] = var3[var8];
                        }

                        var3 = var7;
                    }

                    var3[var4++] = (short) var5;
                }
            }

            EntityMarker.fieldOj = var3;
            UtilClass1.fieldOg = 0;
            InputHandler.fieldOp = -2059871559 * var4;
            String[] var10 = new String[InputHandler.fieldOp * -501937271];

            for (int var11 = 0; var11 < InputHandler.fieldOp * -501937271; ++var11) {
                if (var2 <= 1065296580) {
                    return;
                }

                var10[var11] = Client.getItemDefinition(var3[var11], -1075592813).fieldX;
            }

            short[] var12 = EntityMarker.fieldOj;
            TileDecoration.method354(var10, var12, 0, var10.length - 1, (byte) 2);
            classBt.config.q((byte) 4);
            classBt.config.fieldQ = true;
        } catch (RuntimeException var9) {
            throw ClanMate.error(var9, "gn.da(" + ')');
        }
    }

    @Override
    public String toString() {
        try {
            return this.fieldS;
        } catch (RuntimeException var1) {
            throw ClanMate.error(var1, "gn.toString(" + ')');
        }
    }
}
