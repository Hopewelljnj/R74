package com.jagex;

public final class classGm extends classGs {

    public classGm(byte[] var1) {
        super(var1);
    }

    public classGm(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
        super(var1, var2, var3, var4, var5, var6, var7);
    }

    @Override
    final void y(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
        int var7 = var2 + var3 * fieldX;
        int var8 = fieldX - var4;
        int var9 = 0;
        int var10 = 0;
        int var11;
        if (var3 < fieldQ) {
            var11 = fieldQ - var3;
            var5 -= var11;
            var3 = fieldQ;
            var10 += var11 * var4;
            var7 += var11 * fieldX;
        }

        if (var3 + var5 > fieldT) {
            var5 -= var3 + var5 - fieldT;
        }

        if (var2 < fieldH) {
            var11 = fieldH - var2;
            var4 -= var11;
            var2 = fieldH;
            var10 += var11;
            var7 += var11;
            var9 += var11;
            var8 += var11;
        }

        if (var2 + var4 > fieldU) {
            var11 = var2 + var4 - fieldU;
            var4 -= var11;
            var9 += var11;
            var8 += var11;
        }

        if (var4 > 0 && var5 > 0) {
            method34(fieldD, var1, var6, var10, var7, var4, var5, var8, var9);
        }
    }

    @Override
    final void p(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        int var8 = var2 + var3 * fieldX;
        int var9 = fieldX - var4;
        int var10 = 0;
        int var11 = 0;
        int var12;
        if (var3 < fieldQ) {
            var12 = fieldQ - var3;
            var5 -= var12;
            var3 = fieldQ;
            var11 += var12 * var4;
            var8 += var12 * fieldX;
        }

        if (var3 + var5 > fieldT) {
            var5 -= var3 + var5 - fieldT;
        }

        if (var2 < fieldH) {
            var12 = fieldH - var2;
            var4 -= var12;
            var2 = fieldH;
            var11 += var12;
            var8 += var12;
            var10 += var12;
            var9 += var12;
        }

        if (var2 + var4 > fieldU) {
            var12 = var2 + var4 - fieldU;
            var4 -= var12;
            var10 += var12;
            var9 += var12;
        }

        if (var4 > 0 && var5 > 0) {
            method35(fieldD, var1, var6, var11, var8, var4, var5, var9, var10, var7);
        }
    }
}
