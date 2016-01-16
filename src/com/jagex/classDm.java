package com.jagex;

import java.awt.*;

public final class classDm extends Canvas {

    static classAp fieldNf;
    static int fieldDg;
    Component fieldA;

    classDm(Component var1) {
        this.fieldA = var1;
    }

    @Override
    public final void update(Graphics var1) {
        try {
            this.fieldA.update(var1);
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "dm.update(" + ')');
        }
    }

    @Override
    public final void paint(Graphics var1) {
        try {
            this.fieldA.paint(var1);
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "dm.paint(" + ')');
        }
    }
}
