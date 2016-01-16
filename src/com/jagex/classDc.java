package com.jagex;

import java.awt.*;

public abstract class classDc {

    static ReferenceTable fieldL;
    static byte fieldMi;
    static int baseX;

    public static final boolean method276(int var0) {
        try {
            Keyboard var1 = Keyboard.instance;
            synchronized (Keyboard.instance) {
                if (Keyboard.fieldCl * -1936173031 == Keyboard.fieldCx * -756998689) {
                    return false;
                } else {
                    GroundItem.fieldCh = Keyboard.fieldCy[Keyboard.fieldCx * -756998689] * -1747602403;
                    ClanMate.fieldCb = Keyboard.fieldCg[Keyboard.fieldCx * -756998689];
                    Keyboard.fieldCx = (Keyboard.fieldCx * -756998689 + 1 & 127) * 803921439;
                    return true;
                }
            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "dc.l(" + ')');
        }
    }

    public abstract void v(Component var1, int var2);

    public abstract int b(int var1);

    public abstract void removeFrom(Component var1, byte var2);
}
