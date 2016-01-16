package com.jagex;

public class CacheInt extends DualNode {

    public static ReferenceTable fieldA;
    public static Cache fieldV = new Cache(64);
    public static short[] fieldN;

    public int value = 0;

    public void v(Buffer var1, int var2) {
        try {
            while (true) {
                int var3 = var1.readUByte();
                if (var3 == 0) {
                    return;
                }

                this.i(var1, var3, -230315992);
            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "au.v(" + ')');
        }
    }

    void i(Buffer var1, int var2, int var3) {
        try {
            if (2 == var2) {
                if (var3 <= -1454587172) {
                    throw new IllegalStateException();
                }

                this.value = var1.readUShort() * -83527009;
            }

        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "au.i(" + ')');
        }
    }

}
