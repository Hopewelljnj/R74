package com.jagex;

public final class TilePaint {

    int fieldV;
    int fieldB;
    int fieldI;
    int texture;
    boolean flatShade = true;
    int rgb;
    int fieldA;


    TilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
        this.fieldA = var1 * 241278955;
        this.fieldV = 150891601 * var2;
        this.fieldI = -803396365 * var3;
        this.fieldB = var4 * -436287417;
        this.texture = -1636243455 * var5;
        this.rgb = 1308571875 * var6;
        this.flatShade = var7;
    }

    public static Animation getAnimation(int var0, int var1) {
        try {
            Animation var2 = (Animation) Animation.cache.get((long) var0);
            if (var2 != null)
                return var2;
            byte[] var3 = Animation.referenceTable.getFile(13, var0, (short) 24196);
            var2 = new Animation();
            var2.id = 226183555 * var0;
            if (null != var3)
                var2.i(new Buffer(var3), -1669585332);
            Animation.cache.put(var2, (long) var0);
            return var2;
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "ci.v(" + ')');
        }
    }

    static final void method334(int var0) {
        try {
            Client.fieldCo.writePacketHeader(46, (byte) 0);
            Client.fieldCo.writeByte(0);
        } catch (RuntimeException var1) {
            throw ClanMate.error(var1, "ci.dr(" + ')');
        }
    }

    public static void method335(int var0, ReferenceTable var1, String var2, String var3, int var4, boolean var5, int var6) {
        try {
            int var7 = var1.h(var2, 2121341611);
            int var8 = var1.u(var7, var3, -644941349);
            classCn.method329(var0, var1, var7, var8, var4, var5, (byte) 26);
        } catch (RuntimeException var9) {
            throw ClanMate.error(var9, "ci.i(" + ')');
        }
    }
}
