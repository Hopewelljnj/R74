package com.jagex;

public class classCx extends DualNode {

    static int fieldMw;
    static classDz fieldOl;
    classCq[] fieldA;


    public classCx(ReferenceTable var1, ReferenceTable var2, int var3, boolean var4) {
        NodeDeque var5 = new NodeDeque();
        int var6 = var1.getFileEntryCount(var3, (byte) 0);
        this.fieldA = new classCq[var6];
        int[] var7 = var1.f(var3, 399797968);
        int var8 = 0;

        while (var8 < var7.length) {
            byte[] var9 = var1.getFile(var3, var7[var8], (short) 18550);
            classCc var10 = null;
            int var11 = (var9[0] & 255) << 8 | var9[1] & 255;
            classCc var12 = (classCc) var5.next();

            while (true) {
                if (null != var12) {
                    if (var12.fieldA * 2016191483 != var11) {
                        var12 = (classCc) var5.tail();
                        continue;
                    }

                    var10 = var12;
                }

                if (null == var10) {
                    byte[] var13;
                    if (var4) {
                        var13 = var2.n(0, var11, -213809809);
                    } else {
                        var13 = var2.n(var11, 0, -213809809);
                    }

                    var10 = new classCc(var11, var13);
                    var5.add(var10);
                }

                this.fieldA[var7[var8]] = new classCq(var9, var10);
                ++var8;
                break;
            }
        }

    }

    public static int method289(int var0, int var1) {
        try {
            return var0 >> 17 & 7;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "cx.a(" + ')');
        }
    }

    public boolean a(int var1, int var2) {
        try {
            return this.fieldA[var1].fieldK;
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "cx.a(" + ')');
        }
    }
}
