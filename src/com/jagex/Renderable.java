package com.jagex;

public abstract class Renderable extends DualNode {

    public int modelHeight = -303409688;


    boolean forceColor = false;
    int color = 0;

    boolean hardColor = false;

    public static int getStringLengthPlusTwo(String var0) {
        try {
            return var0.length() + 2;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "cr.e(" + ')');
        }
    }

    void render(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
        try {
            Model var10 = this.getModel(-1892837023);
            if (var10 != null) {
                this.modelHeight = 1 * var10.modelHeight;
                if(hardColor) var10.forceColor = true;
                var10.render(var1, var2, var3, var4, var5, var6, var7, var8, var9);
                var10.forceColor = false;
            }

        } catch (RuntimeException var11) {
            throw ClanMate.error(var11, "cr.r(" + ')');
        }
    }

    protected Model getModel(int var1) {
        try {
            return null;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "cr.v(" + ')');
        }
    }
}
