package com.jagex;

import java.lang.*;
import java.math.BigInteger;

public class UtilClass38 {

    static final BigInteger rsaExponent = new BigInteger("10001", 16);
    static final BigInteger rsaModulus = new BigInteger("9a6d17765512e51426656b08931007eade702f44709ec2f18d0bfb598a684b0b5a03154316c495f25765dc122f693a66400371197d027e43ce6310fb7d037d057338f40a00d5f15ea784818107a9c6b1d1314255949448d3e7cb5ff4d0af9517e421a8b0815df161927b1595ae79772001a809f9f4722e7bd73fa99c4614d551", 16);
    public static classEr fieldX;
    static classGn fieldS;
    static int[] fieldDh;


    UtilClass38() throws Throwable {
        throw new Error();
    }

    static final void method124(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, byte var8) {
        try {
            if (Widget.loadWidget(var0, 477596194)) {
                Preferences.fieldKh = null;
                Character.drawInterface(Widget.widgets[var0], -1, var1, var2, var3, var4, var5, var6, var7, -2030390556);
                if (null != Preferences.fieldKh) {
                    Character.drawInterface(Preferences.fieldKh, -1412584499, var1, var2, var3, var4, MessageContainer.fieldKm * 1762443741, Player.fieldKq * -319653031, var7, -1907769222);
                    Preferences.fieldKh = null;
                }

            } else {
                if (-1 != var7) {
                    Client.fieldLp[var7] = true;
                } else {
                    for (int var9 = 0; var9 < 100; ++var9) {
                        Client.fieldLp[var9] = true;
                    }
                }

            }
        } catch (RuntimeException var10) {
            throw ClanMate.error(var10, "l.cf(" + ')');
        }
    }

    static int getWidgetConfig(Widget var0, int var1) {
        try {
            IntegerNode var2 = (IntegerNode) Client.widgetNodeConfigs.get((long) (var0.index * 1176560255) + ((long) (var0.id * -1866039137) << 32));
            if (null != var2) {
                if (var1 != 2070855251) {
                    throw new IllegalStateException();
                } else {
                    return var2.value;
                }
            } else {
                return var0.config * 1451344731;
            }
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "l.dv(" + ')');
        }
    }

    public static void method126(ReferenceTable var0, ReferenceTable var1, boolean var2, classGm var3, int var4) {
        try {
            ItemDefinition.fieldB = var0;
            ItemDefinition.fieldL = var1;
            classEv.fieldM = var2;
            ExchangeOfferPriceComparator.fieldW = ItemDefinition.fieldB.getFileEntryCount(10, (byte) 0) * -1908351535;
            WidgetStrings.fieldK = var3;
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "l.a(" + ')');
        }
    }

    static void method127(int var0, int var1, byte var2) {
        try {
            Client.fieldCo.writePacketHeader(80, (byte) 0);
            Client.fieldCo.writeShort(var1);
            Client.fieldCo.bs(var0, -1315614368);
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "l.bh(" + ')');
        }
    }
}
