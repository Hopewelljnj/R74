package com.jagex;

import java.util.Iterator;

public class ImmutableQueue implements Iterable {

    public DualNode root = new DualNode();


    public ImmutableQueue() {
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

    @Override
    public Iterator iterator() {
        return new ImmutableQueueIterator(this);
    }

    public void clear() {
        while (this.root.dualNext != this.root) {
            this.root.dualNext.deleteDual();
        }
    }
}
