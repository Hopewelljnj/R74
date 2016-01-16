package com.jagex;

public final class Packet extends Buffer {

    static final int[] fieldE = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, '\uffff', 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
    static int[] fieldEv;
    IsaacCipher cipher;
    int bitCaret;


    public Packet(int var1) {
        super(var1);
    }

    static final String formatItemQuantityColor(int num, int var1) {
        try {
            return num < 100000 ? "<col=ffff00>" + num + "</col>"
                    : num < 10000000 ? "<col=ffffff>" + num / 1000 + StringConstants.thousandK + "</col>"
                    : "<col=00ff80>" + num / 1000000 + StringConstants.millionM + "</col>";
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "dh.k(" + ')');
        }
    }

    public static int method69(CharSequence var0, int var1, int var2) {
        try {
            return LandscapeMod.method115(var0, var1, true, (byte) 44);
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "dh.b(" + ')');
        }
    }

    public void gm(int var1) {
        try {
            this.bitCaret = this.caret * -960061224;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "dh.gm(" + ')');
        }
    }

    public int gs(int var1) {
        try {
            return this.payload[(this.caret += -99503879) * 651432265 - 1] - this.cipher.a((byte) 50) & 255;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "dh.gs(" + ')');
        }
    }

    public int gx(int var1, int var2) {
        try {
            int var3 = this.bitCaret * -250814869 >> 3;
            int var4 = 8 - (this.bitCaret * -250814869 & 7);
            int var5 = 0;

            for (this.bitCaret += -796664253 * var1; var1 > var4; var4 = 8) {
                var5 += (this.payload[var3++] & fieldE[var4]) << var1 - var4;
                var1 -= var4;
            }

            if (var1 == var4) {
                if (var2 == -318135294) {
                    throw new IllegalStateException();
                }

                var5 += this.payload[var3] & fieldE[var4];
            } else {
                var5 += this.payload[var3] >> var4 - var1 & fieldE[var1];
            }

            return var5;
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "dh.gx(" + ')');
        }
    }

    public int hf(int var1, byte var2) {
        try {
            return var1 * 8 - this.bitCaret * -250814869;
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "dh.hf(" + ')');
        }
    }

    public void loadIsaac(int[] keys, int var2) {
        try {
            this.cipher = new IsaacCipher(keys);
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "dh.gb(" + ')');
        }
    }

    public void writePacketHeader(int var1, byte var2) {
        try {
            this.payload[(this.caret += -99503879) * 651432265 - 1] = (byte) (var1 + this.cipher.a((byte) 106));
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "dh.gi(" + ')');
        }
    }

    public void hd(byte var1) {
        try {
            this.caret = -99503879 * ((7 + this.bitCaret * -250814869) / 8);
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "dh.hd(" + ')');
        }
    }
}
