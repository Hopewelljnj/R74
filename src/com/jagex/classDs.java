package com.jagex;

public class classDs {

    public static final classDs fieldA = new classDs(0);
    public static final classDs fieldV = new classDs(1);
    public static final classDs fieldI = new classDs(2);
    public final int fieldB;


    classDs(int var1) {
        this.fieldB = -268577491 * var1;
    }

    public static CompressedImage[] method82(ReferenceTable var0, String var1, String var2, int var3) {
        try {
            int var4 = var0.h(var1, 1146992392);
            int var5 = var0.u(var4, var2, -1215033725);
            return method84(var0, var4, var5, -278509156);
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "ds.l(" + ')');
        }
    }

    static void method83(int var0, int var1, byte var2) {
        try {
            long var3 = (long) (var1 + (var0 << 16));
            classEr var5 = (classEr) UtilClass20.fieldN.get(var3);
            if (null != var5) {
                UtilClass20.fieldE.insert(var5);
            }
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "ds.i(" + ')');
        }
    }

    static CompressedImage[] method84(ReferenceTable var0, int var1, int var2, int var3) {
        try {
            if (!classAo.method398(var0, var1, var2, (byte) -73)) {
                return null;
            } else {
                CompressedImage[] var5 = new CompressedImage[UtilClass18.fieldA * -678527857];

                for (int var6 = 0; var6 < UtilClass18.fieldA * -678527857; ++var6) {
                    if (var3 == 1407262947) {
                        throw new IllegalStateException();
                    }

                    CompressedImage var7 = var5[var6] = new CompressedImage();
                    var7.fieldW = UtilClass2.fieldV * 1527976215;
                    var7.fieldE = UtilClass1.fieldI * -517911549;
                    var7.fieldL = IgnoredPlayer.fieldB[var6];
                    var7.fieldM = ExchangeOfferPriceComparator.fieldL[var6];
                    var7.fieldI = ExchangeOfferQuantityComparator.fieldM[var6];
                    var7.fieldB = UtilClass1.fieldW[var6];
                    var7.fieldV = UtilClass1.fieldE;
                    var7.fieldA = classEp.fieldN[var6];
                }

                classAo.method399(-325493987);
                return var5;
            }
        } catch (RuntimeException var8) {
            throw ClanMate.error(var8, "ds.a(" + ')');
        }
    }

}
