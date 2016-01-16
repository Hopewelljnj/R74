package com.jagex;

public abstract class classBz extends Node {

    classBm fieldU;
    int fieldH;
    classBz fieldT;
    volatile boolean fieldW = true;


    final void en(int[] var1, int var2, int var3) {
        if (this.fieldW) {
            this.n(var1, var2, var3);
        } else {
            this.k(var3);
        }

    }

    int ai() {
        return 255;
    }

    protected abstract classBz m();

    protected abstract classBz w();

    protected abstract int e();

    protected abstract void n(int[] var1, int var2, int var3);

    protected abstract void k(int var1);

}
