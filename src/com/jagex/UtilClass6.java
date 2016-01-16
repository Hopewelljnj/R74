package com.jagex;

import java.awt.*;

public class UtilClass6 {

    static int selectedItemWidgetId;


    UtilClass6() throws Throwable {
        throw new Error();
    }

    public static void method63(Component var0, int var1) {
        try {
            var0.removeKeyListener(Keyboard.instance);
            var0.removeFocusListener(Keyboard.instance);
            Keyboard.fieldCk = -1729404783;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "dg.v(" + ')');
        }
    }

    public static boolean method64(int var0, int var1) {
        try {
            return 0 != (var0 >> 30 & 1);
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "dg.l(" + ')');
        }
    }

    public static void method65(int var0) {
        try {
            ObjectDefinition.objectDefinitionCache.clear();
            ObjectDefinition.fieldL.clear();
            ObjectDefinition.fieldM.clear();
            ObjectDefinition.fieldW.clear();
        } catch (RuntimeException var1) {
            throw ClanMate.error(var1, "dg.d(" + ')');
        }
    }
}
