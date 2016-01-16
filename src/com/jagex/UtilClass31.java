package com.jagex;

public class UtilClass31 {

    public static NodeIterable classStructureIterable = new NodeIterable();


    UtilClass31() throws Throwable {
        throw new Error();
    }

    static final int method30(int var0, int var1, int var2, int var3) {
        try {
            if (var2 > 179) {
                if (var3 <= 176089695) {
                    throw new IllegalStateException();
                }

                var1 /= 2;
            }

            if (var2 > 192) {
                if (var3 <= 176089695) {
                    throw new IllegalStateException();
                }

                var1 /= 2;
            }

            if (var2 > 217) {
                if (var3 <= 176089695) {
                    throw new IllegalStateException();
                }

                var1 /= 2;
            }

            if (var2 > 243) {
                if (var3 <= 176089695) {
                    throw new IllegalStateException();
                }

                var1 /= 2;
            }

            int var4 = var2 / 2 + (var0 / 4 << 10) + (var1 / 32 << 7);
            return var4;
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "gt.q(" + ')');
        }
    }
}
