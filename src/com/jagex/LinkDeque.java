package com.jagex;

public class LinkDeque {

    Link tail;
    Link head = new Link();


    public LinkDeque() {
        this.head.next = this.head;
        this.head.fieldL = this.head;
    }

    public Link v() {
        Link var1 = this.head.next;
        if (var1 == this.head) {
            this.tail = null;
            return null;
        } else {
            this.tail = var1.next;
            return var1;
        }
    }

    public void a(Link var1) {
        if (var1.fieldL != null) {
            var1.delete();
        }

        var1.fieldL = this.head.fieldL;
        var1.next = this.head;
        var1.fieldL.next = var1;
        var1.next.fieldL = var1;
    }

    public Link i() {
        Link var1 = this.tail;
        if (var1 == this.head) {
            this.tail = null;
            return null;
        } else {
            this.tail = var1.next;
            return var1;
        }
    }
}
