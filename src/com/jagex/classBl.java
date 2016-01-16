package com.jagex;

public class classBl extends classBm {

    public int fieldA;
    public byte[] fieldV;
    public int fieldI;
    public boolean fieldL;
    int fieldB;


    classBl(int var1, byte[] var2, int var3, int var4) {
        this.fieldA = var1;
        this.fieldV = var2;
        this.fieldI = var3;
        this.fieldB = var4;
    }

    classBl(int var1, byte[] var2, int var3, int var4, boolean var5) {
        this.fieldA = var1;
        this.fieldV = var2;
        this.fieldI = var3;
        this.fieldB = var4;
        this.fieldL = var5;
    }

    public classBl a(classBt var1) {
        this.fieldV = var1.a(this.fieldV, -1988376647);
        this.fieldA = var1.v(this.fieldA, -891201059);
        if (this.fieldI == this.fieldB) {
            this.fieldI = this.fieldB = var1.i(this.fieldI, 376231943);
        } else {
            this.fieldI = var1.i(this.fieldI, 1334929351);
            this.fieldB = var1.i(this.fieldB, -1330238252);
            if (this.fieldI == this.fieldB) {
                --this.fieldI;
            }
        }

        return this;
    }
}
