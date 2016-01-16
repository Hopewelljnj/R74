package com.jagex;

public class MessageContainer {

    public static short[][] fieldS;
    static int fieldKm;
    Message[] messages = new Message[100];
    int count;

    Message a(int var1, String var2, String var3, String var4) {
        try {
            Message tail = this.messages[99];
            for (int var7 = this.count * 1218493441; var7 > 0; --var7) {
                if (100 != var7) {
                    this.messages[var7] = this.messages[var7 - 1];
                }
            }
            if (null == tail) {
                tail = new Message(var1, var2, var4, var3);
            } else {
                tail.delete();
                tail.deleteDual();
                tail.a(var1, var2, var4, var3, 306344732);
            }
            this.messages[0] = tail;
            if (this.count * 1218493441 < 100) {
                this.count += -2123414527;
            }
            return tail;
        } catch (RuntimeException var8) {
            throw ClanMate.error(var8, "z.a(" + ')');
        }
    }

    Message getMessageAt(int var1) {
        try {
            if (var1 >= 0 && var1 < this.count * 1218493441) {
                return this.messages[var1];
            }
            return null;
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "z.v(" + ')');
        }
    }

    int getCount() {
        try {
            return this.count * 1218493441;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "z.i(" + ')');
        }
    }

}
