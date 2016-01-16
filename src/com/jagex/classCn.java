package com.jagex;

import java.io.IOException;

public class classCn {

    static byte[][][] fieldE;
    int fieldB;
    int fieldV;
    int fieldI;
    int fieldA;


    classCn() {
    }

    classCn(classCn var1) {
        this.fieldA = 1 * var1.fieldA;
        this.fieldV = 1 * var1.fieldV;
        this.fieldI = var1.fieldI * 1;
        this.fieldB = var1.fieldB * 1;
    }

    public static void method327(boolean var0, int var1) {
        try {
            if (UtilClass20.fieldA == null) {
                if (var1 <= -2118311854) {
                    throw new IllegalStateException();
                }
            } else {
                try {
                    Buffer var2 = new Buffer(4);
                    byte var10001;
                    if (var0) {
                        if (var1 <= -2118311854) {
                            throw new IllegalStateException();
                        }

                        var10001 = 2;
                    } else {
                        var10001 = 3;
                    }

                    var2.writeByte(var10001);
                    var2.i(0);
                    UtilClass20.fieldA.writeLater(var2.payload, 0, 4, (byte) -34);
                } catch (IOException var5) {
                    try {
                        UtilClass20.fieldA.stop(-2066694444);
                    } catch (Exception var4) {
                        ;
                    }

                    UtilClass20.fieldR += -1608089801;
                    UtilClass20.fieldA = null;
                }

            }
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "cn.a(" + ')');
        }
    }

    static void method328(Buffer var0, int var1) {
        try {
            if (var0.readUByte() != 255) {
                throw new IllegalStateException("");
            }
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "cn.a(" + ')');
        }
    }

    public static void method329(int var0, ReferenceTable var1, int var2, int var3, int var4, boolean var5, byte var6) {
        try {
            UtilClass21.fieldL = -561749511;
            UtilClass21.fieldM = var1;
            UtilClass35.fieldW = var2 * 1158645973;
            classDz.fieldE = var3 * -1105453967;
            ItemTable.fieldN = var4 * -703074975;
            UtilClass21.fieldK = var5;
            UtilClass21.fieldS = var0 * 485844613;
        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "cn.b(" + ')');
        }
    }
}
