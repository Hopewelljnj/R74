package com.jagex;

import java.util.Comparator;

final class classGw implements Comparator {

    int a(ExchangeOfferData var1, ExchangeOfferData var2, byte var3) {
        try {
            return var1.a((byte) 102).compareTo(var2.a((byte) 102));
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "gw.a(" + ')');
        }
    }

    @Override
    public boolean equals(Object var1) {
        try {
            return super.equals(var1);
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "gw.equals(" + ')');
        }
    }

    @Override
    public int compare(Object var1, Object var2) {
        try {
            return this.a((ExchangeOfferData) var1, (ExchangeOfferData) var2, (byte) -67);
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "gw.compare(" + ')');
        }
    }

}
