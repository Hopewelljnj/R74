package com.jagex;

import java.awt.*;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class classEo extends classDc implements MouseWheelListener {

    int fieldA = 0;


    @Override
    public void removeFrom(Component var1, byte var2) {
        try {
            var1.removeMouseWheelListener(this);
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "eo.i(" + ')');
        }
    }

    @Override
    public void v(Component var1, int var2) {
        try {
            var1.addMouseWheelListener(this);
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "eo.v(" + ')');
        }
    }

    @Override
    public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
        try {
            this.fieldA += var1.getWheelRotation() * 779541727;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "eo.mouseWheelMoved(" + ')');
        }
    }

    @Override
    public synchronized int b(int var1) {
        try {
            int var2 = this.fieldA * -60039393;
            this.fieldA = 0;
            return var2;
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "eo.b(" + ')');
        }
    }
}
