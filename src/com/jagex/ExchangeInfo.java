package com.jagex;

import java.util.*;

public class ExchangeInfo {

    public static Comparator timeComparator = new ExchangeOfferTimeComparator();
    public static Comparator priceComparator;
    public static Comparator quantityComparator;
    public static Comparator fieldB;
    static {
        new classGz();
        priceComparator = new ExchangeOfferPriceComparator();
        fieldB = new classGw();
        quantityComparator = new ExchangeOfferQuantityComparator();
    }
    public final List<ExchangeOfferData> fieldA;

    public ExchangeInfo(Buffer var1, boolean var2) {
        int var3 = var1.readUShort();
        boolean var4 = var1.readUByte() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }

        int var6 = var1.readUShort();
        this.fieldA = new ArrayList<ExchangeOfferData>(var6);

        for (int var7 = 0; var7 < var6; ++var7) {
            this.fieldA.add(new ExchangeOfferData(var1, var5, var3));
        }

    }

    public void a(Comparator var1, boolean var2, int var3) {
        try {
            if (var2) {
                if (var3 != 128464934) {
                    return;
                }

                Collections.sort(this.fieldA, var1);
            } else {
                Collections.sort(this.fieldA, Collections.reverseOrder(var1));
            }

        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "gb.a(" + ')');
        }
    }
}
