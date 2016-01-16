package com.jagex;

public class classBy {

    static byte[][][] fieldL;
    static int[] fieldJ;
    static Widget fieldGu;
    int fieldV;
    int fieldA;
    int fieldI;


    static final void method247(int var0, int var1, int var2, int var3, Sprite var4, int var5) {
        try {
            int var6 = var3 * var3 + var2 * var2;
            if (var6 > 4225 && var6 < 90000) {
                int var7 = Client.minimapRotation * -422086387 + Client.minimapScale * -148158859 & 2047;
                int var8 = RSGraphics2D.SIN_TABLE[var7];
                int var9 = RSGraphics2D.COS_TABLE[var7];
                var8 = 256 * var8 / (256 + Client.minimapOffset * -695888753);
                var9 = 256 * var9 / (256 + Client.minimapOffset * -695888753);
                int var10 = var2 * var9 + var3 * var8 >> 16;
                int var11 = var9 * var3 - var2 * var8 >> 16;
                double var12 = Math.atan2((double) var10, (double) var11);
                int var14 = (int) (Math.sin(var12) * 63.0D);
                int var15 = (int) (Math.cos(var12) * 57.0D);
                TaskHandler.mapedge.p(var0 + 94 + var14 + 4 - 10, 83 + var1 - var15 - 20, 20, 20, 15, 15, var12, 256);
                return;
            }
            EntityMarker.method331(var0, var1, var2, var3, var4, -929543904);
        } catch (RuntimeException var16) {
            throw ClanMate.error(var16, "by.dj(" + ')');
        }
    }

    static final void method248(Widget var0, int var1, int var2, byte dummy) {
        try {
            if (Client.widgetDragSource == null && !Client.menuOpen && null != var0) {
                Widget var5 = RuneScript.method164(var0, -1307662494);
                if (null == var5)
                    var5 = var0.fieldBd;
                if (null != var5) {
                    Client.widgetDragSource = var0;
                    var5 = RuneScript.method164(var0, -1307662494);
                    if (var5 == null)
                        var5 = var0.fieldBd;
                    Client.fieldJl = var5;
                    Client.fieldJd = var1 * -1577353151;
                    Client.fieldJf = var2 * -2096249659;
                    Preferences.fieldKi = 0;
                    Client.fieldKz = false;
                    if (Client.menuRowCount * 445599935 > 0) {
                        int tail = Client.menuRowCount * 445599935 - 1;
                        Projectile.menuItem = new MenuItem();
                        Projectile.menuItem.arg1 = Client.menuArg1[tail] * -268923001;
                        Projectile.menuItem.arg2 = 1403349035 * Client.menuArg2[tail];
                        Projectile.menuItem.opcode = 614282175 * Client.menuOpcodes[tail];
                        Projectile.menuItem.arg0 = Client.menuArg0[tail] * 741448429;
                        Projectile.menuItem.option = Client.menuOptions[tail];
                    }
                }
            }
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "by.cc(" + ')');
        }
    }

    static final void method249(byte dummy) {
        try {
            Client.fieldGs = 0;
            int wx = classDc.baseX * -2071335905 + (404428603 * Client.myPlayer.strictX >> 7);
            int wy = CalendarUtil.baseY * -1046564359 + (-1490664571 * Client.myPlayer.strictY >> 7);

            if (wx >= 3053 && wx <= 3156 && wy >= 3056 && wy <= 3136)
                Client.fieldGs = 524544395;

            if (wx >= 3072 && wx <= 3118 && wy >= 9492 && wy <= 9535)
                Client.fieldGs = 524544395;

            if (1 == Client.fieldGs * -1672251869 && wx >= 3139 && wx <= 3199 && wy >= 3008 && wy <= 3062)
                Client.fieldGs = 0;

        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "by.at(" + ')');
        }
    }

}
