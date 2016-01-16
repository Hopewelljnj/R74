package com.jagex;

import java.io.File;

public class UtilClass19 {

    public static classHf fieldK = null;
    public static classHf fieldF = null;
    public static classHf fieldD = null;
    public static int fieldM;
    static String fieldBq;
    static int fieldO;
    static File dir;
    static CompressedImage fieldBu;
    static File fieldB;


    UtilClass19() throws Throwable {
        throw new Error();
    }

    public static int method169(int var0, int var1, byte var2) {
        try {
            int var3;
            for (var3 = 1; var1 > 1; var1 >>= 1) {
                if (var2 == 111) {
                    throw new IllegalStateException();
                }

                if (0 != (var1 & 1)) {
                    if (var2 == 111) {
                        throw new IllegalStateException();
                    }

                    var3 *= var0;
                }

                var0 *= var0;
            }

            if (1 == var1) {
                if (var2 == 111) {
                    throw new IllegalStateException();
                } else {
                    return var3 * var0;
                }
            } else {
                return var3;
            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "el.a(" + ')');
        }
    }

    static int method170(char var0, int var1, byte var2) {
        try {
            int var3 = var0 << 4;
            if (!java.lang.Character.isUpperCase(var0)) {
                if (var2 >= 8) {
                    throw new IllegalStateException();
                }

                if (!java.lang.Character.isTitleCase(var0)) {
                    return var3;
                }

                if (var2 >= 8) {
                    throw new IllegalStateException();
                }
            }

            var0 = java.lang.Character.toLowerCase(var0);
            var3 = 1 + (var0 << 4);
            return var3;
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "el.b(" + ')');
        }
    }
}
