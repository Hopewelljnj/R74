package com.jagex;

public enum UnknownEnum3 implements Identifiable {

    UNKNOWN0(0),
    UNKNOWN1(1),
    UNKNOWN2(2);

    public static ReferenceTableSub fieldBi;
    final int id;

    UnknownEnum3(int var1) {
        this.id = 1304514843 * var1;
    }

    public static UnknownEnum2[] getEnum2Values(int var0) {
        try {
            return new UnknownEnum2[]{UnknownEnum2.UNKNOWN3, UnknownEnum2.UNKNOWN0, UnknownEnum2.UNKNOWN2, UnknownEnum2.UNKNOWN4, UnknownEnum2.UNKNOWN1};
        } catch (RuntimeException var1) {
            throw ClanMate.error(var1, "h.a(" + ')');
        }
    }

    public static Object maskBuffer(byte[] var0, boolean var1, byte var2) {
        try {
            if (var0 == null) {
                if (var2 >= 1) {
                    throw new IllegalStateException();
                } else {
                    return null;
                }
            } else {
                if (var0.length > 136) {


                    if (!AbstractByteBuffer.fieldV) {

                        try {
                            SimpleBuffer var3 = new SimpleBuffer();
                            var3.setBuffer(var0, (byte) -103);
                            return var3;
                        } catch (Throwable var4) {
                            AbstractByteBuffer.fieldV = true;
                        }
                    }
                }

                if (var1) {
                    return MenuItem.cloneBuffer(var0, (byte) 92);
                } else {
                    return var0;
                }
            }
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "h.n(" + ')');
        }
    }

    public int getId(int DUMMY) {
        try {
            return this.id * 591372563;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "h.v(" + ')');
        }
    }
}
