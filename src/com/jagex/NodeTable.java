package com.jagex;

public final class NodeTable {

    int index = 0;
    Node[] buckets;
    Node current;
    int size;
    Node first;


    public NodeTable(int var1) {
        this.size = var1;
        this.buckets = new Node[var1];
        for (int i = 0; i < var1; ++i) {
            Node var3 = this.buckets[i] = new Node();
            var3.next = var3;
            var3.prev = var3;
        }
    }

    public Node first() {
        this.index = 0;
        return this.next();
    }

    public void put(Node node, long key) {
        if (node.prev != null) {
            node.delete();
        }
        Node last = this.buckets[(int) (key & (long) (this.size - 1))];
        node.prev = last.prev;
        node.next = last;
        node.prev.next = node;
        node.next.prev = node;
        node.key = key;
    }

    void clear() {
        int var1 = 0;
        while (var1 < this.size) {
            Node var2 = this.buckets[var1];
            while (true) {
                Node var3 = var2.next;
                if (var3 == var2) {
                    ++var1;
                    break;
                }
                var3.delete();
            }
        }
        this.current = null;
        this.first = null;
    }

    public Node next() {
        Node var1;
        if (this.index > 0 && this.first != this.buckets[this.index - 1]) {
            var1 = this.first;
            this.first = var1.next;
            return var1;
        } else {
            if (this.index >= this.size) {
                return null;
            }
            var1 = this.buckets[this.index++].next;
            while (var1 == this.buckets[this.index - 1]) {
                if (this.index < this.size) {
                    var1 = this.buckets[this.index++].next;
                } else {
                    return null;
                }
            }
            this.first = var1.next;
            return var1;
        }
    }

    public Node get(long key) {
        Node last = this.buckets[(int) (key & (long) (this.size - 1))];
        for (this.current = last.next; this.current != last; this.current = this.current.next) {
            if (this.current.key == key) {
                Node var4 = this.current;
                this.current = this.current.next;
                return var4;
            }
        }
        this.current = null;
        return null;
    }
}
