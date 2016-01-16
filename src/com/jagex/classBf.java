package com.jagex;

public class classBf implements Runnable {

    public static Buffer fieldJ;
    static Task fieldAu;
    TaskHandler fieldA;
    volatile classAp[] fieldV = new classAp[2];
    volatile boolean fieldI = false;
    volatile boolean fieldB = false;

    static boolean method266(int var0, int var1, int var2) {
        try {
            if (4 == var0) {
                if (var2 >= -309520531) {
                    throw new IllegalStateException();
                }

                if (8 == var1) {
                    if (var2 >= -309520531) {
                        throw new IllegalStateException();
                    }

                    return false;
                }
            }

            return true;
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "bf.a(" + ')');
        }
    }

    @Override
    public void run() {
        try {
            this.fieldB = true;

            try {
                while (!this.fieldI) {
                    for (int var1 = 0; var1 < 2; ++var1) {
                        classAp var2 = this.fieldV[var1];
                        if (null != var2) {
                            var2.r((byte) -47);
                        }
                    }

                    classCs.fancySleep(10L);
                    classCs.method302(this.fieldA, (Object) null, 1577743068);
                }
            } catch (Exception var7) {
                UtilClass5.method61((String) null, var7, -765030861);
            } finally {
                this.fieldB = false;
            }

        } catch (RuntimeException var9) {
            throw ClanMate.error(var9, "bf.run(" + ')');
        }
    }
}
