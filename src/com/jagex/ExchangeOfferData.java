package com.jagex;

public class ExchangeOfferData {

    public final long postTime;
    public final ExchangeOffer exchangeOffer;
    public final int fieldA;
    String fieldB;
    String fieldL;

    ExchangeOfferData(Buffer buff, byte status, int itemId) {
        this.fieldB = buff.readString(1800392870);
        this.fieldL = buff.readString(1332590459);
        this.fieldA = buff.readUShort() * 1728136977;
        this.postTime = buff.readLong(-1623566492) * -5306997646494837151L;
        int price = buff.readInt((byte) 26);
        int itemQuantity = buff.readInt((byte) -73);
        this.exchangeOffer = new ExchangeOffer();
        this.exchangeOffer.b(2, -1822001385);
        this.exchangeOffer.l(status, (short) 8364);
        this.exchangeOffer.price = 707774687 * price;
        this.exchangeOffer.itemQuantity = -747695095 * itemQuantity;
        this.exchangeOffer.transferred = 0;
        this.exchangeOffer.spent = 0;
        this.exchangeOffer.itemId = 1553847221 * itemId;
    }

    public static String method37(byte[] var0, int var1, int var2, byte var3) {
        try {
            char[] var4 = new char[var2];
            int var5 = 0;

            for (int var6 = 0; var6 < var2; ++var6) {
                int var7 = var0[var6 + var1] & 255;
                if (var7 != 0) {
                    if (var7 >= 128 && var7 < 160) {
                        char var8 = UtilClass33.fieldA[var7 - 128];
                        if (var8 == 0) {
                            var8 = 63;
                        }
                        var7 = var8;
                    }
                    var4[var5++] = (char) var7;
                }
            }
            return new String(var4, 0, var5);
        } catch (RuntimeException var9) {
            throw ClanMate.error(var9, "gr.l(" + ')');
        }
    }

    public String a(byte var1) {
        try {
            return this.fieldB;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "gr.a(" + ')');
        }
    }

    public String v(int var1) {
        try {
            return this.fieldL;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "gr.v(" + ')');
        }
    }
}
