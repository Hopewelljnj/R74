package com.jagex;

import java.io.*;

public final class JagexAccessFile {

    long fieldI;
    long fieldV;
    RandomAccessFile raf;


    public JagexAccessFile(File var1, String var2, long var3) throws IOException {
        if (-1L == var3) {
            var3 = Long.MAX_VALUE;
        }

        if (var1.length() >= var3) {
            var1.delete();
        }

        this.raf = new RandomAccessFile(var1, var2);
        this.fieldV = 4380931168547320781L * var3;
        this.fieldI = 0L;
        int var5 = this.raf.read();
        if (-1 != var5 && !var2.equals("r")) {
            this.raf.seek(0L);
            this.raf.write(var5);
        }

        this.raf.seek(0L);
    }

    public final void i(byte var1) throws IOException {
        try {
            if (this.raf != null) {
                if (var1 >= 48) {
                    throw new IllegalStateException();
                }

                this.raf.close();
                this.raf = null;
            }

        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "hd.i(" + ')');
        }
    }

    public final void v(byte[] var1, int var2, int var3, int var4) throws IOException {
        try {
            if (this.fieldI * -9142834286542446675L + (long) var3 > -143908105931132667L * this.fieldV) {
                if (var4 >= 1095008449) {
                    throw new IllegalStateException();
                } else {
                    this.raf.seek(-143908105931132667L * this.fieldV + 1L);
                    this.raf.write(1);
                    throw new EOFException();
                }
            } else {
                this.raf.write(var1, var2, var3);
                this.fieldI += (long) var3 * 741777946272242725L;
            }
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "hd.v(" + ')');
        }
    }

    public final long b(int var1) throws IOException {
        try {
            return this.raf.length();
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "hd.b(" + ')');
        }
    }

    public final int l(byte[] var1, int var2, int var3, byte var4) throws IOException {
        try {
            int var5 = this.raf.read(var1, var2, var3);
            if (var5 > 0) {
                this.fieldI += 741777946272242725L * (long) var5;
            }

            return var5;
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "hd.l(" + ')');
        }
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            if (this.raf != null) {
                System.out.println("");
                this.i((byte) -22);
            }

        } catch (RuntimeException var1) {
            throw ClanMate.error(var1, "hd.finalize(" + ')');
        }
    }

    final void a(long var1) throws IOException {
        try {
            this.raf.seek(var1);
            this.fieldI = var1 * 741777946272242725L;
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "hd.a(" + ')');
        }
    }
}
