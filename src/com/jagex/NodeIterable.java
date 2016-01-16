package com.jagex;

import java.util.Iterator;

public class NodeIterable implements Iterable {

    Node current = new Node();

    public NodeIterable() {
        this.current.next = this.current;
        this.current.prev = this.current;
    }

    public Node next() {
        return this.i(null);
    }

    Node i(Node var1) {
        Node var2 = var1 == null ? this.current.next : var1;
        return var2 == this.current ? null : var2;
    }

    public void delete(Node var1) {
        if (var1.prev != null) {
            var1.delete();
        }

        var1.prev = this.current.prev;
        var1.next = this.current;
        var1.prev.next = var1;
        var1.next.prev = var1;
    }

    @Override
    public Iterator iterator() {
        return new classGf(this);
    }
}
