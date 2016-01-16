package com.jagex;

public class NodeDeque<T extends Node> {

    public Node head = new Node();
    Node tail;

    public NodeDeque() {
        this.head.next = this.head;
        this.head.prev = this.head;
    }

    public static void replace(Node var0, Node var1) {
        if (var0.prev != null) {
            var0.delete();
        }
        var0.prev = var1.prev;
        var0.next = var1;
        var0.prev.next = var0;
        var0.next.prev = var0;
    }

    public T popFirst() {
        Node var1 = this.head.next;
        if (var1 == this.head) {
            return null;
        } else {
            var1.delete();
            return (T) var1;
        }
    }

    public T popLast() {
        Node var1 = this.head.prev;
        if (var1 == this.head) {
            return null;
        } else {
            var1.delete();
            return (T) var1;
        }
    }

    public T next() {
        Node var1 = this.head.next;
        if (var1 == this.head) {
            this.tail = null;
            return null;
        } else {
            this.tail = var1.next;
            return (T) var1;
        }
    }

    public T previous() {
        Node var1 = this.head.prev;
        if (var1 == this.head) {
            this.tail = null;
            return null;
        } else {
            this.tail = var1.prev;
            return (T) var1;
        }
    }

    public T s() {
        Node var1 = this.tail;
        if (var1 == this.head) {
            this.tail = null;
            return null;
        } else {
            this.tail = var1.prev;
            return (T) var1;
        }
    }

    //add to end of deque
    public void insert(T var1) {
        if (var1.prev != null) {
            var1.delete();
        }
        var1.prev = this.head;
        var1.next = this.head.next;
        var1.prev.next = var1;
        var1.next.prev = var1;
    }

    public T tail() {
        Node var1 = this.tail;
        if (var1 == this.head) {
            this.tail = null;
            return null;
        } else {
            this.tail = var1.next;
            return (T) var1;
        }
    }

    //add to end of deque
    public void add(T var1) {
        if (var1.prev != null) {
            var1.delete();
        }

        var1.prev = this.head.prev;
        var1.next = this.head;
        var1.prev.next = var1;
        var1.next.prev = var1;
    }

    public void clear() {
        while (true) {
            Node var1 = this.head.next;
            if (var1 == this.head) {
                this.tail = null;
                return;
            }

            var1.delete();
        }
    }
}
