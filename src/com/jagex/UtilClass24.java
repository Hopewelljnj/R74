package com.jagex;

import java.awt.*;

public class UtilClass24 {

    public static final short[] fieldA = new short[]{(short) 6798, (short) 8741, (short) 25238, (short) 4626, (short) 4550};
    public static final short[][] fieldV = new short[][]{{(short) 6798, (short) 107, (short) 10283, (short) 16, (short) 4797, (short) 7744, (short) 5799, (short) 4634, (short) -31839, (short) 22433, (short) 2983, (short) -11343, (short) 8, (short) 5281, (short) 10438, (short) 3650, (short) -27322, (short) -21845, (short) 200, (short) 571, (short) 908, (short) 21830, (short) 28946, (short) -15701, (short) -14010}, {(short) 8741, (short) 12, (short) -1506, (short) -22374, (short) 7735, (short) 8404, (short) 1701, (short) -27106, (short) 24094, (short) 10153, (short) -8915, (short) 4783, (short) 1341, (short) 16578, (short) -30533, (short) 25239, (short) 8, (short) 5281, (short) 10438, (short) 3650, (short) -27322, (short) -21845, (short) 200, (short) 571, (short) 908, (short) 21830, (short) 28946, (short) -15701, (short) -14010}, {(short) 25238, (short) 8742, (short) 12, (short) -1506, (short) -22374, (short) 7735, (short) 8404, (short) 1701, (short) -27106, (short) 24094, (short) 10153, (short) -8915, (short) 4783, (short) 1341, (short) 16578, (short) -30533, (short) 8, (short) 5281, (short) 10438, (short) 3650, (short) -27322, (short) -21845, (short) 200, (short) 571, (short) 908, (short) 21830, (short) 28946, (short) -15701, (short) -14010}, {(short) 4626, (short) 11146, (short) 6439, (short) 12, (short) 4758, (short) 10270}, {(short) 4550, (short) 4537, (short) 5681, (short) 5673, (short) 5790, (short) 6806, (short) 8076, (short) 4574, (short) 17050}};
    public static final short[] fieldI = new short[]{(short) -10304, (short) 9104, (short) -1, (short) -1, (short) -1};
    public static final short[][] fieldB = new short[][]{{(short) 6554, (short) 115, (short) 10304, (short) 28, (short) 5702, (short) 7756, (short) 5681, (short) 4510, (short) -31835, (short) 22437, (short) 2859, (short) -11339, (short) 16, (short) 5157, (short) 10446, (short) 3658, (short) -27314, (short) -21965, (short) 472, (short) 580, (short) 784, (short) 21966, (short) 28950, (short) -15697, (short) -14002}, {(short) 9104, (short) 10275, (short) 7595, (short) 3610, (short) 7975, (short) 8526, (short) 918, (short) -26734, (short) 24466, (short) 10145, (short) -6882, (short) 5027, (short) 1457, (short) 16565, (short) -30545, (short) 25486, (short) 24, (short) 5392, (short) 10429, (short) 3673, (short) -27335, (short) -21957, (short) 192, (short) 687, (short) 412, (short) 21821, (short) 28835, (short) -15460, (short) -14019}, new short[0], new short[0], new short[0]};
    public static short[][] fieldE;


    UtilClass24() throws Throwable {
        throw new Error();
    }

    public static void method2(Component var0, int var1) {
        try {
            var0.setFocusTraversalKeysEnabled(false);
            var0.addKeyListener(Keyboard.instance);
            var0.addFocusListener(Keyboard.instance);
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "fv.a(" + ')');
        }
    }

    static final String[] method3(String[] var0, int var1) {
        try {
            String[] var2 = new String[5];

            for (int var3 = 0; var3 < 5; ++var3) {
                var2[var3] = var3 + ": ";
                if (var0 != null) {
                    if (var1 >= 153440902) {
                        throw new IllegalStateException();
                    }

                    if (null != var0[var3]) {
                        if (var1 >= 153440902) {
                            throw new IllegalStateException();
                        }

                        var2[var3] = var2[var3] + var0[var3];
                    }
                }
            }

            return var2;
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "fv.cz(" + ')');
        }
    }

    public static Sprite[] method4(ReferenceTable var0, String var1, String var2, byte var3) {
        try {
            int var4 = var0.h(var1, 601883607);
            int var5 = var0.u(var4, var2, -1138623310);
            Sprite[] var6;
            if (!classAo.method398(var0, var4, var5, (byte) -3)) {
                if (var3 <= 58) {
                    throw new IllegalStateException();
                }

                var6 = null;
            } else {
                var6 = WidgetStrings.method407(-683666654);
            }

            return var6;
        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "fv.w(" + ')');
        }
    }
}
