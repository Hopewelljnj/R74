package com.jagex;

import java.util.Comparator;

final class ExchangeOfferPriceComparator implements Comparator {

    public static int fieldW;
    static int[] fieldL;

    public static boolean method28(char var0, int var1) {
        try {
            boolean var10000;
            label58:
            {
                if (var0 >= 48) {
                    if (var1 >= -2080118265) {
                        throw new IllegalStateException();
                    }

                    if (var0 <= 57) {
                        break label58;
                    }
                }

                if (var0 >= 65) {
                    if (var1 >= -2080118265) {
                        throw new IllegalStateException();
                    }

                    if (var0 <= 90) {
                        break label58;
                    }

                    if (var1 >= -2080118265) {
                        throw new IllegalStateException();
                    }
                }

                if (var0 >= 97) {
                    if (var1 >= -2080118265) {
                        throw new IllegalStateException();
                    }

                    if (var0 <= 122) {
                        if (var1 >= -2080118265) {
                            throw new IllegalStateException();
                        }
                        break label58;
                    }
                }

                var10000 = false;
                return var10000;
            }

            var10000 = true;
            return var10000;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "gv.s(" + ')');
        }
    }

    static void method29(short var0) {
        try {
            ItemTable.cache = new NodeTable(32);
        } catch (RuntimeException var1) {
            throw ClanMate.error(var1, "gv.m(" + ')');
        }
    }

    @Override
    public int compare(Object var1, Object var2) {
        try {
            return this.a((ExchangeOfferData) var1, (ExchangeOfferData) var2, 1314730669);
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "gv.compare(" + ')');
        }
    }

    @Override
    public boolean equals(Object var1) {
        try {
            return super.equals(var1);
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "gv.equals(" + ')');
        }
    }

    int a(ExchangeOfferData var1, ExchangeOfferData var2, int var3) {
        try {
            byte var10000;
            if (var1.exchangeOffer.price * 2044064543 < 2044064543 * var2.exchangeOffer.price) {
                var10000 = -1;
            } else if (var1.exchangeOffer.price * 2044064543 == var2.exchangeOffer.price * 2044064543) {
                if (var3 != 1314730669) {
                    throw new IllegalStateException();
                }

                var10000 = 0;
            } else {
                var10000 = 1;
            }

            return var10000;
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "gv.a(" + ')');
        }
    }
}
