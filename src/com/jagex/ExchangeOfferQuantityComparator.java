package com.jagex;

import java.util.Comparator;

final class ExchangeOfferQuantityComparator implements Comparator {

    static int[] fieldM;
    static World[] fieldBi;


    @Override
    public boolean equals(Object var1) {
        try {
            return super.equals(var1);
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "gu.equals(" + ')');
        }
    }

    int a(ExchangeOfferData var1, ExchangeOfferData var2, int var3) {
        try {
            int var10000;
            if (-1551451591 * var1.exchangeOffer.itemQuantity < -1551451591 * var2.exchangeOffer.itemQuantity) {
                if (var3 >= -2016648916) {
                    throw new IllegalStateException();
                }

                var10000 = -1;
            } else {
                var10000 = -1551451591 * var2.exchangeOffer.itemQuantity == -1551451591 * var1.exchangeOffer.itemQuantity ? 0 : 1;
            }

            return var10000;
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "gu.a(" + ')');
        }
    }

    @Override
    public int compare(Object var1, Object var2) {
        try {
            return this.a((ExchangeOfferData) var1, (ExchangeOfferData) var2, -2100482833);
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "gu.compare(" + ')');
        }
    }

}
