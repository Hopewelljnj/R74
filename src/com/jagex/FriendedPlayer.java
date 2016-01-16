package com.jagex;

public class FriendedPlayer {

    String previousName;
    String displayName;
    int fieldB;
    int world;
    boolean fieldM;
    boolean fieldL;


    static final int method177(classGn var0, short var1) {
        try {
            if (var0 == null) {
                return 12;
            } else {
                switch (var0.fieldN * -413650457) {
                    case 7:
                        return 20;
                    default:
                        return 12;
                }
            }
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "q.a(" + ')');
        }
    }

    static final void method178(int var0, int var1, int var2, int var3, int var4) {
        try {
            if (1 == Client.cursorState * -1127086643) {
                classAw.mouseCrosses[Client.fieldGy * -2013609415 / 100].f(Client.clickX * 1159101645 - 8, Client.clickY * 798227457 - 8);
            }

            if (Client.cursorState * -1127086643 == 2) {
                classAw.mouseCrosses[Client.fieldGy * -2013609415 / 100 + 4].f(Client.clickX * 1159101645 - 8, Client.clickY * 798227457 - 8);
            }

            classBy.method249((byte) 97);
            if (Client.fpsOn) {
                int var5 = 512 + var0 - 5;
                int var6 = 20 + var1;
                ScriptEvent.font_p12full.s("Fps:" + Client.fps * 555415887, var5, var6, 16776960, -1);
                var6 += 15;
                Runtime var7 = Runtime.getRuntime();
                int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                int var9 = 16776960;
                if (var8 > '\u8000' && Client.lowMemory) {
                    var9 = 16711680;
                }

                if (var8 > 65536 && !Client.lowMemory) {
                    var9 = 16711680;
                }

                ScriptEvent.font_p12full.s("Mem:" + var8 + "k", var5, var6, var9, -1);
                var6 += 15;
            }

        } catch (RuntimeException var10) {
            throw ClanMate.error(var10, "q.aw(" + ')');
        }
    }

}
