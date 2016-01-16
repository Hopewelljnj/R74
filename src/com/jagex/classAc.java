package com.jagex;

public class classAc extends classBz {

    NodeDeque fieldA = new NodeDeque();
    NodeDeque fieldV = new NodeDeque();
    int fieldI = 0;
    int fieldB = -1;


    void b(Node var1, DeadClass0 var2) {
        while (var1 != this.fieldV.head && ((DeadClass0) var1).fieldA <= var2.fieldA) {
            var1 = var1.next;
        }

        NodeDeque.replace(var2, var1);
        this.fieldB = ((DeadClass0) this.fieldV.head.next).fieldA;
    }

    public final synchronized void a(classBz var1) {
        this.fieldA.insert(var1);
    }

    public final synchronized void v(classBz var1) {
        var1.delete();
    }

    void i() {
        if (this.fieldI > 0) {
            for (DeadClass0 var1 = (DeadClass0) this.fieldV.next(); var1 != null; var1 = (DeadClass0) this.fieldV.tail()) {
                var1.fieldA -= this.fieldI;
            }

            this.fieldB -= this.fieldI;
            this.fieldI = 0;
        }

    }

    @Override
    protected classBz w() {
        return (classBz) this.fieldA.tail();
    }

    @Override
    public final synchronized void n(int[] var1, int var2, int var3) {
        do {
            if (this.fieldB < 0) {
                this.s(var1, var2, var3);
                return;
            }

            if (this.fieldI + var3 < this.fieldB) {
                this.fieldI += var3;
                this.s(var1, var2, var3);
                return;
            }

            int var4 = this.fieldB - this.fieldI;
            this.s(var1, var2, var4);
            var2 += var4;
            var3 -= var4;
            this.fieldI += var4;
            this.i();
            DeadClass0 var5 = (DeadClass0) this.fieldV.next();
            synchronized (var5) {
                int var7 = var5.v(this);
                if (var7 < 0) {
                    var5.fieldA = 0;
                    this.l(var5);
                } else {
                    var5.fieldA = var7;
                    this.b(var5.next, var5);
                }
            }
        } while (var3 != 0);

    }

    void s(int[] var1, int var2, int var3) {
        for (classBz var4 = (classBz) this.fieldA.next(); var4 != null; var4 = (classBz) this.fieldA.tail()) {
            var4.en(var1, var2, var3);
        }

    }

    @Override
    public final synchronized void k(int var1) {
        do {
            if (this.fieldB < 0) {
                this.f(var1);
                return;
            }

            if (this.fieldI + var1 < this.fieldB) {
                this.fieldI += var1;
                this.f(var1);
                return;
            }

            int var2 = this.fieldB - this.fieldI;
            this.f(var2);
            var1 -= var2;
            this.fieldI += var2;
            this.i();
            DeadClass0 var3 = (DeadClass0) this.fieldV.next();
            synchronized (var3) {
                int var5 = var3.v(this);
                if (var5 < 0) {
                    var3.fieldA = 0;
                    this.l(var3);
                } else {
                    var3.fieldA = var5;
                    this.b(var3.next, var3);
                }
            }
        } while (var1 != 0);

    }

    @Override
    protected classBz m() {
        return (classBz) this.fieldA.next();
    }

    @Override
    protected int e() {
        return 0;
    }

    void f(int var1) {
        for (classBz var2 = (classBz) this.fieldA.next(); var2 != null; var2 = (classBz) this.fieldA.tail()) {
            var2.k(var1);
        }

    }

    void l(DeadClass0 var1) {
        var1.delete();
        var1.a();
        Node var2 = this.fieldV.head.next;
        if (var2 == this.fieldV.head) {
            this.fieldB = -1;
        } else {
            this.fieldB = ((DeadClass0) var2).fieldA;
        }

    }
}
