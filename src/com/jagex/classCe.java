package com.jagex;

public final class classCe {

    int fieldK;
    int fieldA;
    int fieldF;
    int fieldI;
    int fieldL;
    int fieldM;
    int fieldW;
    int fieldE;
    int fieldN;
    int fieldS;
    int fieldV;
    int fieldX;
    int fieldD;
    int fieldO;
    int fieldQ;
    int fieldT;
    int fieldH;
    int fieldB;


    public static void method347(int var0) {
        try {
            Widget.spriteCache.clear();
            Widget.fieldE.clear();
            Widget.fieldN.clear();
        } catch (RuntimeException var1) {
            throw ClanMate.error(var1, "ce.x(" + ')');
        }
    }

    public static byte[] transformData(Object var0, boolean readOnly, int DUMMY) {
        try {
            if (var0 == null) {
                if (DUMMY != -807057784) {
                    throw new IllegalStateException();
                } else {
                    return null;
                }
            } else if (var0 instanceof byte[]) {
                if (DUMMY != -807057784) {
                    throw new IllegalStateException();
                } else {
                    byte[] var5 = (byte[]) ((byte[]) var0);
                    return readOnly ? MenuItem.cloneBuffer(var5, (byte) 58) : var5;
                }
            } else if (var0 instanceof AbstractByteBuffer) {
                if (DUMMY != -807057784) {
                    throw new IllegalStateException();
                } else {
                    AbstractByteBuffer var3 = (AbstractByteBuffer) var0;
                    return var3.getBuffer((byte) 5);
                }
            } else {
                throw new IllegalArgumentException();
            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "ce.s(" + ')');
        }
    }

}
