package com.jagex;

import java.util.Comparator;

final class classGz implements Comparator {

    static final void method21(int var0) {
        try {
            for (int var1 = 0; var1 < Client.fieldNx * 1993078547; ++var1) {
                --Client.fieldNw[var1];
                if (Client.fieldNw[var1] < -10) {
                    if (var0 >= 636372082) {
                        throw new IllegalStateException();
                    }

                    Client.fieldNx -= 1441295131;

                    for (int var2 = var1; var2 < Client.fieldNx * 1993078547; ++var2) {
                        if (var0 >= 636372082) {
                            return;
                        }

                        Client.fieldNp[var2] = Client.fieldNp[var2 + 1];
                        Client.fieldNq[var2] = Client.fieldNq[var2 + 1];
                        Client.fieldNl[var2] = Client.fieldNl[1 + var2];
                        Client.fieldNw[var2] = Client.fieldNw[1 + var2];
                        Client.fieldNj[var2] = Client.fieldNj[var2 + 1];
                    }

                    --var1;
                } else {
                    AudioEffect var11 = Client.fieldNq[var1];
                    if (var11 == null) {
                        if (var0 >= 636372082) {
                            return;
                        }

                        AudioEffect var10000 = (AudioEffect) null;
                        var11 = AudioEffect.get(UtilClass39.fieldBo, Client.fieldNp[var1], 0);
                        if (null == var11) {
                            continue;
                        }

                        Client.fieldNw[var1] += var11.i();
                        Client.fieldNq[var1] = var11;
                    }

                    if (Client.fieldNw[var1] < 0) {
                        if (var0 >= 636372082) {
                            throw new IllegalStateException();
                        }

                        int var3;
                        if (0 != Client.fieldNj[var1]) {
                            if (var0 >= 636372082) {
                                throw new IllegalStateException();
                            }

                            int var4 = 128 * (Client.fieldNj[var1] & 255);
                            int var5 = Client.fieldNj[var1] >> 16 & 255;
                            int var6 = var5 * 128 + 64 - 404428603 * Client.myPlayer.strictX;
                            if (var6 < 0) {
                                if (var0 >= 636372082) {
                                    throw new IllegalStateException();
                                }

                                var6 = -var6;
                            }

                            int var7 = Client.fieldNj[var1] >> 8 & 255;
                            int var8 = 64 + 128 * var7 - Client.myPlayer.strictY * -1490664571;
                            if (var8 < 0) {
                                if (var0 >= 636372082) {
                                    throw new IllegalStateException();
                                }

                                var8 = -var8;
                            }

                            int var9 = var6 + var8 - 128;
                            if (var9 > var4) {
                                Client.fieldNw[var1] = -100;
                                continue;
                            }

                            if (var9 < 0) {
                                if (var0 >= 636372082) {
                                    return;
                                }

                                var9 = 0;
                            }

                            var3 = Client.fieldNm * -1976627615 * (var4 - var9) / var4;
                        } else {
                            var3 = Client.fieldNe * 1707214503;
                        }

                        if (var3 > 0) {
                            if (var0 >= 636372082) {
                                return;
                            }

                            classBl var12 = var11.v().a(TextureManagerImpl.fieldNa);
                            classBw var13 = classBw.method209(var12, 100, var3);
                            var13.s(Client.fieldNl[var1] - 1);
                            Client.fieldNn.a(var13);
                        }

                        Client.fieldNw[var1] = -100;
                    }
                }
            }

            if (Client.fieldMv && !ScriptStackElement.method92(674166885)) {
                if (var0 >= 636372082) {
                    return;
                }

                if (0 != Client.fieldMh * 895565207) {
                    if (var0 >= 636372082) {
                        return;
                    }

                    if (Client.fieldMx * -1477729045 != -1) {
                        UtilClass40.method171(classT.fieldBs, Client.fieldMx * -1477729045, 0, Client.fieldMh * 895565207, false, -911580244);
                    }
                }

                Client.fieldMv = false;
            }

        } catch (RuntimeException var10) {
            throw ClanMate.error(var10, "gz.p(" + ')');
        }
    }

    int a(ExchangeOfferData var1, ExchangeOfferData var2, int var3) {
        try {
            byte var10000;
            if (var1.fieldA * 1954843121 < var2.fieldA * 1954843121) {
                if (var3 >= 1810382948) {
                    throw new IllegalStateException();
                }

                var10000 = -1;
            } else if (var1.fieldA * 1954843121 == var2.fieldA * 1954843121) {
                if (var3 >= 1810382948) {
                    throw new IllegalStateException();
                }

                var10000 = 0;
            } else {
                var10000 = 1;
            }

            return var10000;
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "gz.a(" + ')');
        }
    }

    @Override
    public int compare(Object var1, Object var2) {
        try {
            return this.a((ExchangeOfferData) var1, (ExchangeOfferData) var2, -1026759339);
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "gz.compare(" + ')');
        }
    }

    @Override
    public boolean equals(Object var1) {
        try {
            return super.equals(var1);
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "gz.equals(" + ')');
        }
    }
}
