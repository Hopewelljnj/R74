package com.jagex;

import java.util.Iterator;

public class ImmutableQueueIterator implements Iterator {

    DualNode next;
    ImmutableQueue queue;
    DualNode current = null;


    ImmutableQueueIterator(ImmutableQueue var1) {
        this.queue = var1;
        this.next = this.queue.root.dualNext;
        this.current = null;
    }

    @Override
    public Object next() {
        DualNode var1 = this.next;
        if (var1 == this.queue.root) {
            var1 = null;
            this.next = null;
        } else {
            this.next = var1.dualNext;
        }

        this.current = var1;
        return var1;
    }

    @Override
    public void remove() {
        if (this.current == null) {
            throw new IllegalStateException();
        } else {
            this.current.deleteDual();
            this.current = null;
        }
    }

    @Override
    public boolean hasNext() {
        return this.next != this.queue.root;
    }
}
