package com.jagex;

public class Node {

    public long key;
    public Node next;
    Node prev;

    public void delete() {
        if (this.prev != null) {
            this.prev.next = this.next;
            this.next.prev = this.prev;
            this.next = null;
            this.prev = null;
        }
    }

    public boolean isLinked() {
        return this.prev != null;
    }

}
