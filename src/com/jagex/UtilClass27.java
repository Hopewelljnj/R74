package com.jagex;

public class UtilClass27 {

    public static int[] tempVars;
    public static int[] vars;

    public static int[] masks = new int[32];
    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            masks[var1] = var0 - 1;
            var0 += var0;
        }
        tempVars = new int[2000];
        vars = new int[2000];
    }

    static int fieldIw;

    UtilClass27() throws Throwable {
        throw new Error();
    }

    static final void method18(Character var0, int var1) {
        try {
            label68:
            {
                if (Client.engineCycle * -1223223371 != var0.fieldBg * -1916221887) {
                    if (var1 != 555521379) {
                        throw new IllegalStateException();
                    }

                    if (var0.animation * -433706235 != -1 && 0 == var0.animationDelay * -1858896077) {
                        if (var1 != 555521379) {
                            throw new IllegalStateException();
                        }

                        if (1 + var0.fieldBi * -1871093805 <= AnimationSequence.get(var0.animation * -433706235, -1922609031).fieldE[var0.fieldBo * 1983896939]) {
                            break label68;
                        }

                        if (var1 != 555521379) {
                            throw new IllegalStateException();
                        }
                    }
                }

                int var2 = var0.fieldBg * -1916221887 - var0.fieldBf * -467145561;
                int var3 = Client.engineCycle * -1223223371 - var0.fieldBf * -467145561;
                int var4 = var0.fieldBe * -1289731968 + var0.fieldZ * 377596096;
                int var5 = var0.fieldZ * 377596096 + var0.fieldBc * -1330493056;
                int var6 = var0.fieldBb * 811735680 + var0.fieldZ * 377596096;
                int var7 = var0.fieldZ * 377596096 + var0.fieldBk * -1305592448;
                var0.strictX = 1386850803 * ((var4 * (var2 - var3) + var6 * var3) / var2);
                var0.strictY = 1224424781 * ((var3 * var7 + var5 * (var2 - var3)) / var2);
            }

            var0.fieldCr = 0;
            if (var0.fieldBt * 2006725845 == 0) {
                var0.objOrientation = -367387648;
            }

            if (1 == var0.fieldBt * 2006725845) {
                if (var1 != 555521379) {
                    throw new IllegalStateException();
                }

                var0.objOrientation = -551081472;
            }

            if (2 == var0.fieldBt * 2006725845) {
                if (var1 != 555521379) {
                    throw new IllegalStateException();
                }

                var0.objOrientation = 0;
            }

            if (3 == var0.fieldBt * 2006725845) {
                if (var1 != 555521379) {
                    return;
                }

                var0.objOrientation = -183693824;
            }

            var0.orientation = var0.objOrientation * -2014221065;
        } catch (RuntimeException var8) {
            throw ClanMate.error(var8, "fu.av(" + ')');
        }
    }
}
