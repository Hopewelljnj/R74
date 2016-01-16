package com.jagex;

import java.awt.*;

public class classAb extends classAp {

    static classAf fieldA;
    int fieldV;


    classAb(TaskHandler var1, int var2) {
        fieldA = var1.e(701315885);
        this.fieldV = var2;
    }

    @Override
    int i() {
        return fieldA.i(this.fieldV, (short) 3171);
    }

    @Override
    void v(int var1) throws Exception {
        if (var1 > '\u8000') {
            throw new IllegalArgumentException();
        } else {
            fieldA.v(this.fieldV, var1, 1102285009);
        }
    }

    @Override
    void b() {
        fieldA.b(this.fieldV, this.fieldN, 1204818952);
    }

    @Override
    void m() {
        fieldA.m(this.fieldV, -322861429);
    }

    @Override
    void l() {
        fieldA.l(this.fieldV, (byte) 43);
    }

    @Override
    void a(Component var1) throws Exception {
        fieldA.a(var1, audioSampleRate * 2098856905, twoChannels, (byte) 45);
    }
}
