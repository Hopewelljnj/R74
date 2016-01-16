package com.jagex;

import java.nio.ByteBuffer;

public class SimpleBuffer extends AbstractByteBuffer {

    ByteBuffer buffer;


    @Override
    byte[] getBuffer(byte DUMMY) {
        try {
            byte[] var2 = new byte[this.buffer.capacity()];
            this.buffer.position(0);
            this.buffer.get(var2);
            return var2;
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "dj.a(" + ')');
        }
    }

    @Override
    void setBuffer(byte[] var1, byte DUMMY) {
        try {
            this.buffer = ByteBuffer.allocateDirect(var1.length);
            this.buffer.position(0);
            this.buffer.put(var1);
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "dj.v(" + ')');
        }
    }
}
