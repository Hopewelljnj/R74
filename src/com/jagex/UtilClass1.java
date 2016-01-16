package com.jagex;

public class UtilClass1 {

    static int fieldOg;
    static int[] fieldW;
    static int[] fieldE;
    static int fieldNo;
    static int fieldI;


    UtilClass1() throws Throwable {
        throw new Error();
    }

    static void method258(int var0, int var1) {
        try {
            if (var0 == -1) {
                if (var1 == 16711935) {
                    throw new IllegalStateException();
                }
            } else if (!Widget.loadWidget(var0, 477596194)) {
                if (var1 != 16711935) {
                    ;
                }
            } else {
                Widget[] var2 = Widget.widgets[var0];

                for (int var3 = 0; var3 < var2.length; ++var3) {
                    if (var1 == 16711935) {
                        throw new IllegalStateException();
                    }

                    Widget var4 = var2[var3];
                    if (null != var4.fieldCw) {
                        ScriptEvent var5 = new ScriptEvent();
                        var5.src = var4;
                        var5.args = var4.fieldCw;
                        Preferences.bigdickscripthandler(var5, 2000000, 2026952843);
                    }
                }

            }
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "bn.i(" + ')');
        }
    }

    static Message method259(int var0, byte var1) {
        try {
            return (Message) UtilClass40.fieldV.a((long) var0);
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "bn.l(" + ')');
        }
    }

    static boolean isIgnored(String var0, int var1) {
        try {
            if (null == var0) {
                return false;
            }
            String var2 = CalendarUtil.method297(var0, UtilClass38.fieldS, -822602721);
            for (int var3 = 0; var3 < Client.ignoreListSize * 697443259; ++var3) {
                IgnoredPlayer var4 = Client.ignoredPlayers[var3];
                if (var2.equalsIgnoreCase(CalendarUtil.method297(var4.previousName, UtilClass38.fieldS, 1385050899))
                        || var2.equalsIgnoreCase(CalendarUtil.method297(var4.displayName, UtilClass38.fieldS, -581915089))) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "bn.dq(" + ')');
        }
    }
}
