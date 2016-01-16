package com.jagex;

import java.util.Iterator;

public class classGf implements Iterator {

    Node fieldV;
    NodeIterable fieldA;
    Node fieldI = null;


    classGf(NodeIterable var1) {
        this.fieldA = var1;
        this.fieldV = this.fieldA.current.next;
        this.fieldI = null;
    }

    @Override
    public void remove() {
        if (this.fieldI == null) {
            throw new IllegalStateException();
        } else {
            this.fieldI.delete();
            this.fieldI = null;
        }
    }

    @Override
    public boolean hasNext() {
        return this.fieldV != this.fieldA.current;
    }

    @Override
    public Object next() {
        Node var1 = this.fieldV;
        if (var1 == this.fieldA.current) {
            var1 = null;
            this.fieldV = null;
        } else {
            this.fieldV = var1.next;
        }

        this.fieldI = var1;
        return var1;
    }
}
