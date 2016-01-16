package com.jagex;

import java.util.Iterator;

public final class ImmutableDeque implements Iterable {

    Node fieldI;
    Node[] fieldV;
    int fieldA;


    public ImmutableDeque(int var1) {
        this.fieldA = var1;
        this.fieldV = new Node[var1];

        for (int var2 = 0; var2 < var1; ++var2) {
            Node var3 = this.fieldV[var2] = new Node();
            var3.next = var3;
            var3.prev = var3;
        }

    }

    public Node a(long var1) {
        Node var3 = this.fieldV[(int) (var1 & (long) (this.fieldA - 1))];

        for (this.fieldI = var3.next; this.fieldI != var3; this.fieldI = this.fieldI.next) {
            if (this.fieldI.key == var1) {
                Node var4 = this.fieldI;
                this.fieldI = this.fieldI.next;
                return var4;
            }
        }

        this.fieldI = null;
        return null;
    }

    public void v(Node var1, long var2) {
        if (var1.prev != null) {
            var1.delete();
        }

        Node var4 = this.fieldV[(int) (var2 & (long) (this.fieldA - 1))];
        var1.prev = var4.prev;
        var1.next = var4;
        var1.prev.next = var1;
        var1.next.prev = var1;
        var1.key = var2;
    }

    @Override
    public Iterator iterator() {
        return new ImmutableDequeIterator(this);
    }

    public void i() {
        int var1 = 0;

        while (var1 < this.fieldA) {
            Node var2 = this.fieldV[var1];

            while (true) {
                Node var3 = var2.next;
                if (var3 == var2) {
                    ++var1;
                    break;
                }

                var3.delete();
            }
        }

        this.fieldI = null;
    }
}
