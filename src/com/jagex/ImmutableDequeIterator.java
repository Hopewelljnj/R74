package com.jagex;

import java.util.Iterator;

public class ImmutableDequeIterator implements Iterator {

    int size;
    Node next;
    ImmutableDeque deque;
    Node current = null;


    ImmutableDequeIterator(ImmutableDeque var1) {
        this.deque = var1;
        this.reset();
    }

    void reset() {
        this.next = this.deque.fieldV[0].next;
        this.size = 1;
        this.current = null;
    }

    @Override
    public Object next() {
        Node var1;
        if (this.next != this.deque.fieldV[this.size - 1]) {
            var1 = this.next;
            this.next = var1.next;
            this.current = var1;
            return var1;
        } else {
            do {
                if (this.size >= this.deque.fieldA) {
                    return null;
                }

                var1 = this.deque.fieldV[this.size++].next;
            } while (var1 == this.deque.fieldV[this.size - 1]);

            this.next = var1.next;
            this.current = var1;
            return var1;
        }
    }

    @Override
    public void remove() {
        if (this.current == null) {
            throw new IllegalStateException();
        } else {
            this.current.delete();
            this.current = null;
        }
    }

    @Override
    public boolean hasNext() {
        if (this.next != this.deque.fieldV[this.size - 1]) {
            return true;
        } else {
            while (this.size < this.deque.fieldA) {
                if (this.deque.fieldV[this.size++].next != this.deque.fieldV[this.size - 1]) {
                    this.next = this.deque.fieldV[this.size - 1].next;
                    return true;
                }

                this.next = this.deque.fieldV[this.size - 1];
            }

            return false;
        }
    }
}
