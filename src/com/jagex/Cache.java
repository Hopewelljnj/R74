package com.jagex;

public final class Cache {

    NodeTable table;
    int capacity;
    int remaining;
    DualNode emptyDualNode = new DualNode();
    NodeQueue queue = new NodeQueue();

    public Cache(int capacity) {
        this.capacity = capacity;
        this.remaining = capacity;
        int size;
        for (size = 1; size + size < capacity; size += size) {}
        this.table = new NodeTable(size);
    }

    public DualNode get(long key) {
        DualNode var3 = (DualNode) this.table.get(key);
        if (var3 != null) {
            this.queue.add(var3);
        }
        return var3;
    }

    public void remove(long var1) {
        DualNode var3 = (DualNode) this.table.get(var1);
        if (var3 != null) {
            var3.delete();
            var3.deleteDual();
            ++this.remaining;
        }
    }

    public void put(DualNode var1, long var2) {
        if (this.remaining == 0) {
            DualNode var4 = this.queue.pop();
            var4.delete();
            var4.deleteDual();
            if (var4 == this.emptyDualNode) {
                var4 = this.queue.pop();
                var4.delete();
                var4.deleteDual();
            }
        } else {
            --this.remaining;
        }
        this.table.put(var1, var2);
        this.queue.add(var1);
    }

    public void clear() {
        this.queue.clear();
        this.table.clear();
        this.emptyDualNode = new DualNode();
        this.remaining = this.capacity;
    }
}
