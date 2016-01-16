package com.jagex;

public final class NodeQueue {

    DualNode root = new DualNode();

    public NodeQueue() {
        this.root.dualNext = this.root;
        this.root.dualPrev = this.root;
    }

    public void add(DualNode var1) {
        if (var1.dualPrev != null) {
            var1.deleteDual();
        }
        var1.dualPrev = this.root.dualPrev;
        var1.dualNext = this.root;
        var1.dualPrev.dualNext = var1;
        var1.dualNext.dualPrev = var1;
    }

    public void insert(DualNode var1) {
        if (var1.dualPrev != null) {
            var1.deleteDual();
        }
        var1.dualPrev = this.root;
        var1.dualNext = this.root.dualNext;
        var1.dualPrev.dualNext = var1;
        var1.dualNext.dualPrev = var1;
    }

    public DualNode next() {
        DualNode var1 = this.root.dualNext;
        return var1 == this.root ? null : var1;
    }

    void clear() {
        while (true) {
            DualNode var1 = this.root.dualNext;
            if (var1 == this.root) {
                return;
            }
            var1.deleteDual();
        }
    }

    DualNode pop() {
        DualNode var1 = this.root.dualNext;
        if (var1 == this.root) {
            return null;
        } else {
            var1.deleteDual();
            return var1;
        }
    }
}
