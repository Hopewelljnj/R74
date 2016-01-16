package com.jagex;

import java.io.File;
import java.util.HashMap;

public class UtilClass2 {

    static int fieldV;
    static Sprite minimapStaticImg;
    static String[] fieldT;


    UtilClass2() throws Throwable {
        throw new Error();
    }

    static void method283(File var0, short var1) {
        try {
            UtilClass15.fieldV = var0;
            if (!UtilClass15.fieldV.exists()) {
                throw new RuntimeException("");
            } else {
                UtilClass15.fieldA = true;
            }
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "cz.a(" + ')');
        }
    }

    public static classDc method284(byte var0) {
        try {
            try {
                return new classEo();
            } catch (Throwable var2) {
                return null;
            }
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "cz.a(" + ')');
        }
    }

    static {
        new HashMap();
    }
}
