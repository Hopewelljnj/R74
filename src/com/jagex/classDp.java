package com.jagex;

import java.util.zip.Inflater;

public class classDp {

    static int[] fieldU;
    Inflater fieldA;


    public classDp() {
        this(-1, 1000000, 1000000);
    }

    classDp(int var1, int var2, int var3) {
    }

    static int getUniqueItemQuantity(int tableKey, int index) {
        try {
            ItemTable var3 = (ItemTable) ItemTable.cache.get((long) tableKey);
            if (null == var3) {
                return 0;
            }
            return index >= 0 && index < var3.quantities.length ? var3.quantities[index] : 0;
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "dp.a(" + ')');
        }
    }

    protected static final void method81(int var0) {
        try {
            Player.fieldPq = null;
            GraphicsStub.fieldPg = null;
            classEv.fieldBf = null;
        } catch (RuntimeException var1) {
            throw ClanMate.error(var1, "dp.pp(" + ')');
        }
    }

    public void a(Buffer var1, byte[] var2, int var3) {
        try {
            if (var1.payload[var1.caret * 651432265] == 31) {
                if (var3 <= 1630565758) {
                    throw new IllegalStateException();
                }

                if (var1.payload[1 + var1.caret * 651432265] == -117) {
                    if (null == this.fieldA) {
                        if (var3 <= 1630565758) {
                            throw new IllegalStateException();
                        }

                        this.fieldA = new Inflater(true);
                    }

                    try {
                        this.fieldA.setInput(var1.payload, var1.caret * 651432265 + 10, var1.payload.length - (var1.caret * 651432265 + 10 + 8));
                        this.fieldA.inflate(var2);
                    } catch (Exception var5) {
                        this.fieldA.reset();
                        throw new RuntimeException("");
                    }

                    this.fieldA.reset();
                    return;
                }

                if (var3 <= 1630565758) {
                    throw new IllegalStateException();
                }
            }

            throw new RuntimeException("");
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "dp.a(" + ')');
        }
    }
}
