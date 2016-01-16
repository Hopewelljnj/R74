package com.jagex;

public final class classCm {

    final int fieldV = 16;
    final int fieldI = 258;
    final int fieldM = 18002;
    final int fieldB = 6;
    final int fieldA = 4096;
    final int fieldL = 50;
    int fieldP;
    int[] fieldAi = new int[6];
    byte[] fieldW;
    int fieldE = 0;
    int fieldN;
    byte[] fieldS;
    int fieldK = 0;
    int fieldF;
    int fieldD;
    byte[] fieldAr = new byte[4096];
    int fieldT;
    int fieldQ;
    int fieldU;
    int fieldJ;
    int fieldG;
    byte fieldX;
    int fieldO;
    int[] fieldR = new int[257];
    int fieldC;
    boolean[] fieldAn = new boolean[256];
    int fieldH;
    byte[] fieldAh = new byte[256];
    int[] fieldAe = new int[16];
    byte[] fieldAv = new byte[18002];
    byte[] fieldAl = new byte[18002];
    byte[][] fieldAq = new byte[6][258];
    int[][] fieldAm = new int[6][258];
    int[][] fieldAx = new int[6][258];
    int[][] fieldAz = new int[6][258];
    int[] fieldY = new int[256];
    int fieldAa;
    boolean[] fieldAs = new boolean[16];

    static CompressedImage method326(ReferenceTable var0, int var1, int var2, byte var3) {
        try {
            if (!classAo.method398(var0, var1, var2, (byte) -24)) {
                if (var3 >= 0) {
                    throw new IllegalStateException();
                } else {
                    return null;
                }
            } else {
                return ItemPile.method342();
            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "cm.v(" + ')');
        }
    }
}
