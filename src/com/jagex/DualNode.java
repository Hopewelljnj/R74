package com.jagex;

public class DualNode extends Node {

    public DualNode dualNext;
    public DualNode dualPrev;

    public void deleteDual() {
        if (this.dualPrev != null) {
            this.dualPrev.dualNext = this.dualNext;
            this.dualNext.dualPrev = this.dualPrev;
            this.dualNext = null;
            this.dualPrev = null;
        }
    }

}
