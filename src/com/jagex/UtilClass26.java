package com.jagex;

public class UtilClass26 {

    UtilClass26() throws Throwable {
        throw new Error();
    }

    static char method5(char var0, byte var1) {
        try {
            if (var0 != 181) {
                if (var1 >= 0) {
                    throw new IllegalStateException();
                }

                if (402 != var0) {
                    return java.lang.Character.toTitleCase(var0);
                }

                if (var1 >= 0) {
                    throw new IllegalStateException();
                }
            }

            return var0;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "fx.i(" + ')');
        }
    }
}
