package com.jagex;

public class ExchangeOffer {

    public int price;
    public int itemId;
    public int spent;
    public int itemQuantity;
    public int transferred;
    byte status;


    public ExchangeOffer(Buffer var1, boolean var2) {
        this.status = var1.readByte();
        this.itemId = var1.readUShort() * 1553847221;
        this.price = var1.readInt((byte) 19) * 707774687;
        this.itemQuantity = var1.readInt((byte) 42) * -747695095;
        this.transferred = var1.readInt((byte) 50) * 1143159297;
        this.spent = var1.readInt((byte) 71) * -2096023639;
        if (var2) {
            classCn.method328(var1, -799613540);
        }

    }

    public ExchangeOffer() {}

    public int v(int var1) {
        try {
            return this.status & 7;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "gg.v(" + ')');
        }
    }

    public int i(int var1) {
        try {
            return (this.status & 8) == 8 ? 1 : 0;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "gg.i(" + ')');
        }
    }

    void l(int var1, short var2) {
        try {
            this.status &= 0xfffffff7;
            if (var1 == 1) {
                this.status = (byte) (this.status | 8);
            }

        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "gg.l(" + ')');
        }
    }

    void b(int var1, int var2) {
        try {
            this.status &= -8;
            this.status = (byte) (this.status | var1 & 7);
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "gg.b(" + ')');
        }
    }
}
