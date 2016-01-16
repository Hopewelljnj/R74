package com.jagex;

import java.applet.Applet;

public class JSObjectUtil {

    JSObjectUtil() throws Throwable {
        throw new Error();
    }

    public static void eval(Applet var0, String var1, int var2) throws Throwable {
        try {
            throw new Error(var1);
         //   JSObject.getWindow(var0).eval(var1);
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "dn.a(" + ')');
        }
    }

    public static Object call(Applet var0, String var1, byte var2) throws Throwable {
        try {
            throw new Error(var1);
            //return JSObject.getWindow(var0).call(var1, (Object[]) null);

        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "dn.v(" + ')');
        }
    }
}
