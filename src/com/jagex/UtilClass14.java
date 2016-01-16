package com.jagex;

public class UtilClass14 {

    static int fieldDn;


    UtilClass14() throws Throwable {
        throw new Error();
    }

    public static void method49(ReferenceTable var0, ReferenceTable var1, int var2) {
        try {
            NpcDefinition.fieldA = var0;
            UtilClass22.fieldV = var1;
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "dw.a(" + ')');
        }
    }

    static final void openMenu(int x, int y, int var2) {
        try {
            int var3 = MenuItem.font_b12full.b(StringConstants.CHOOSE_OPTION);

            int var4;
            int var5;
            for (var4 = 0; var4 < Client.menuRowCount * 445599935; ++var4) {
                var5 = MenuItem.font_b12full.b(DynamicObject.method138(var4, (byte) -13));
                if (var5 > var3) {
                    if (var2 == 16711680) {
                        throw new IllegalStateException();
                    }

                    var3 = var5;
                }
            }

            var3 += 8;
            var4 = 21 + Client.menuRowCount * -1905935567;
            var5 = x - var3 / 2;
            if (var3 + var5 > 765) {
                var5 = 765 - var3;
            }

            if (var5 < 0) {
                if (var2 == 16711680) {
                    throw new IllegalStateException();
                }

                var5 = 0;
            }

            int var6 = y;
            if (y + var4 > 503) {
                if (var2 == 16711680) {
                    throw new IllegalStateException();
                }

                var6 = 503 - var4;
            }

            if (var6 < 0) {
                if (var2 == 16711680) {
                    throw new IllegalStateException();
                }

                var6 = 0;
            }

            Client.menuOpen = true;
            WidgetStrings.fieldIf = var5 * -1288234241;
            UtilClass27.fieldIw = var6 * -741935407;
            UtilClass41.fieldIs = var3 * 1273679075;
            BoundaryDecoration.fieldIv = -202642090 + Client.menuRowCount * -514409199;
        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "dw.bg(" + ')');
        }
    }

    static void method51(int var0, int var1, byte var2) {
        try {
            int[] var3 = new int[4];
            int[] var4 = new int[4];
            var3[0] = var0;
            var4[0] = var1;
            int var5 = 1;

            for (int var6 = 0; var6 < 4; ++var6) {
                if (var2 != 41) {
                    throw new IllegalStateException();
                }

                if (ClientData.fieldBm[var6] != var0) {
                    var3[var5] = ClientData.fieldBm[var6];
                    var4[var5] = ClientData.fieldBz[var6];
                    ++var5;
                }
            }

            ClientData.fieldBm = var3;
            ClientData.fieldBz = var4;
            UtilClass39.method174(ExchangeOfferQuantityComparator.fieldBi, 0, ExchangeOfferQuantityComparator.fieldBi.length - 1, ClientData.fieldBm, ClientData.fieldBz, 1621082554);
        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "dw.k(" + ')');
        }
    }

    public static String method52(int var0, int var1) {
        try {
            return (var0 >> 24 & 255) + "." + (var0 >> 16 & 255) + "." + (var0 >> 8 & 255) + "." + (var0 & 255);
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "dw.a(" + ')');
        }
    }
}
