package com.jagex;

public class Link {

    Link fieldL;
    Link next;

    public void delete() {
        if (this.fieldL != null) {
            this.fieldL.next = this.next;
            this.next.fieldL = this.fieldL;
            this.next = null;
            this.fieldL = null;
        }
    }
}
