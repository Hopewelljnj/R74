package com.jagex;

public enum Parameter {

    P1("1", "1"),
    P2("2", "2"),
    P3("3", "3"),
    P4("4", "4"),
    P5("5", "5"),
    P6("6", "6"),
    P7("7", "7"),
    P8("8", "8"),
    P9("9", "9"),
    P10("10", "10"),
    P11("11", "11"),
    P12("12", "12"),
    P13("13", "13"),
    P14("14", "14"),
    P15("15", "15");

    public final String name;

    //Not used, but we might find out later...
    Parameter(String var0, String var2) {
        this.name = var2;
    }


    public static int method142(CharSequence var0, int var1) {
        try {
            int var2 = var0.length();
            int var3 = 0;

            for (int var4 = 0; var4 < var2; ++var4) {
                var3 = (var3 << 5) - var3 + classBq.method264(var0.charAt(var4), (byte) -23);
            }

            return var3;
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "fc.w(" + ')');
        }
    }

}
