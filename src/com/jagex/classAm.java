package com.jagex;

public class classAm extends Link {

    static long fieldOe;
    String fieldV;
    short fieldI;
    int fieldA = (int) (classDz.getFancyTime(320122807) / 1000L) * -1635780043;


    classAm(String var1, int var2) {
        this.fieldV = var1;
        this.fieldI = (short) var2;
    }

    public static boolean method403(int var0, int var1) {
        try {
            return (var0 >> 20 & 1) != 0;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "am.v(" + ')');
        }
    }

    public static void method404(int var0) {
        try {
            if (null != Keyboard.instance) {
                Keyboard var1 = Keyboard.instance;
                synchronized (Keyboard.instance) {
                    Keyboard.instance = null;
                }
            }

        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "am.i(" + ')');
        }
    }
}
