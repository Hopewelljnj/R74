package com.jagex;

public enum UnknownEnum1 implements Identifiable {

    THREE_ZERO(3, 0),
    ZERO_ONE(0, 1),
    TWO_TWO(2, 2),
    ONE_THREE(1, 3);

    public final int fieldL;
    final int id;


    UnknownEnum1(int var1, int var2) {
        this.fieldL = 2060117711 * var1;
        this.id = 1795142373 * var2;
    }

    static final int method90(int var0, int var1, int var2) {
        try {
            int var3 = ScriptEvent.method108(var0 - 1, var1 - 1, 177944953) + ScriptEvent.method108(var0 + 1, var1 - 1, -1895635067) + ScriptEvent.method108(var0 - 1, var1 + 1, 1079099591) + ScriptEvent.method108(1 + var0, var1 + 1, -898169246);
            int var4 = ScriptEvent.method108(var0 - 1, var1, -170555332) + ScriptEvent.method108(1 + var0, var1, 757030119) + ScriptEvent.method108(var0, var1 - 1, 814950018) + ScriptEvent.method108(var0, 1 + var1, -415345085);
            int var5 = ScriptEvent.method108(var0, var1, 2143177035);
            return var5 / 4 + var4 / 8 + var3 / 16;
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "eu.f(" + ')');
        }
    }

    public int getId(int DUMMY) {
        try {
            return this.id * 776583917;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "eu.v(" + ')');
        }
    }
}
