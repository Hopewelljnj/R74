package com.jagex;

import java.awt.*;
import java.awt.image.*;
import java.util.Hashtable;

public final class classBh extends classBq {

    Component fieldA;

    @Override
    public final void v(Graphics var1, int var2, int var3, int var4) {
        try {
            var1.drawImage(this.fieldM, var2, var3, this.fieldA);
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "bh.v(" + ')');
        }
    }

    @Override
    public final void i(Graphics var1, int var2, int var3, int var4, int var5, byte var6) {
        try {
            Shape var7 = var1.getClip();
            var1.clipRect(var2, var3, var4, var5);
            var1.drawImage(this.fieldM, 0, 0, this.fieldA);
            var1.setClip(var7);
        } catch (RuntimeException var8) {
            throw ClanMate.error(var8, "bh.i(" + ')');
        }
    }

    @Override
    public final void a(int var1, int var2, Component var3, byte var4) {
        try {
            this.fieldB = 1238569473 * var1;
            this.fieldL = -223305127 * var2;
            this.fieldI = new int[var1 * var2 + 1];
            DataBufferInt var5 = new DataBufferInt(this.fieldI, this.fieldI.length);
            DirectColorModel var6 = new DirectColorModel(32, 16711680, '\uff00', 255);
            WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.fieldB * -1687097855, this.fieldL * 1535411689), var5, (Point) null);
            this.fieldM = new BufferedImage(var6, var7, false, new Hashtable());
            this.fieldA = var3;
            this.av(693233842);
        } catch (RuntimeException var8) {
            throw ClanMate.error(var8, "bh.a(" + ')');
        }
    }
}
