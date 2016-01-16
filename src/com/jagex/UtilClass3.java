package com.jagex;

import java.io.File;
import java.io.IOException;

public class UtilClass3 {

    static long fieldV;
    static long fieldA;
    public static ReferenceTableSub fieldBb;


    UtilClass3() throws Throwable {
        throw new Error();
    }

    static void method62(File var0, File var1, int var2) {
        try {
            try {
                JagexAccessFile var3 = new JagexAccessFile(UtilClass19.fieldB, "rw", 10000L);
                Buffer var4 = new Buffer(500);
                var4.writeByte(3);
                byte var10001;
                if (var1 != null) {
                    if (var2 != 1617132694) {
                        throw new IllegalStateException();
                    }

                    var10001 = 1;
                } else {
                    var10001 = 0;
                }

                var4.writeByte(var10001);
                var4.s(var0.getPath(), 1599562756);
                if (var1 != null) {
                    var4.s(var1.getPath(), 1609870059);
                }

                var3.v(var4.payload, 0, var4.caret * 651432265, 752683031);
                var3.i((byte) -18);
            } catch (IOException var5) {
                var5.printStackTrace();
            }

        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "dd.v(" + ')');
        }
    }
}
