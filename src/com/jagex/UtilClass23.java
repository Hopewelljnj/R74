package com.jagex;

public class UtilClass23 {

    UtilClass23() throws Throwable {
        throw new Error();
    }

    static int method19(int var0, byte var1) {
        try {
            Message var2 = (Message) UtilClass40.fieldV.a((long) var0);
            if (null == var2) {
                if (var1 <= 82) {
                    throw new IllegalStateException();
                } else {
                    return -1;
                }
            } else if (var2.dualNext == UtilClass40.fieldI.root) {
                if (var1 <= 82) {
                    throw new IllegalStateException();
                } else {
                    return -1;
                }
            } else {
                return ((Message) var2.dualNext).fieldA * -1367842983;
            }
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "fo.e(" + ')');
        }
    }
}
