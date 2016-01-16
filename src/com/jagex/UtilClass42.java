package com.jagex;

public class UtilClass42 {

    UtilClass42() throws Throwable {
        throw new Error();
    }

    static int method9(int var0, int var1) {
        try {
            MessageContainer var2 = (MessageContainer) UtilClass40.messageContainerMap.get(Integer.valueOf(var0));
            if (var2 == null) {
                if (var1 == -717164293) {
                    throw new IllegalStateException();
                } else {
                    return 0;
                }
            } else {
                return var2.getCount();
            }
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "fj.m(" + ')');
        }
    }
}
