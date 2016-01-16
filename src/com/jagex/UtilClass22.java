package com.jagex;

import java.awt.*;

public class UtilClass22 {

    public static Canvas canvas;
    static Sprite[] PkHeadIcons;
    static ReferenceTable fieldV;


    UtilClass22() throws Throwable {
        throw new Error();
    }

    static char method8(char var0, int var1) {
        try {
            if (var0 == 198) {
                if (var1 == -2051352354) {
                    throw new IllegalStateException();
                } else {
                    return 'E';
                }
            } else if (var0 == 230) {
                return 'e';
            } else if (223 == var0) {
                if (var1 == -2051352354) {
                    throw new IllegalStateException();
                } else {
                    return 's';
                }
            } else if (var0 == 338) {
                if (var1 == -2051352354) {
                    throw new IllegalStateException();
                } else {
                    return 'E';
                }
            } else if (339 == var0) {
                if (var1 == -2051352354) {
                    throw new IllegalStateException();
                } else {
                    return 'e';
                }
            } else {
                return '\u0000';
            }
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "fk.i(" + ')');
        }
    }
}
