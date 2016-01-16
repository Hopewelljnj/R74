package com.jagex;

import java.applet.Applet;
import java.io.DataInputStream;
import java.net.URL;

public class UtilClass5 {

    protected static classDa fieldPk;
    static Applet fieldA = null;
    static CompressedImage fieldN;
    public static ReferenceTableSub fieldBp;
    static String fieldV = null;
    static Sprite[] mapMarkers;


    UtilClass5() throws Throwable {
        throw new Error();
    }

    public static void method61(String var0, Throwable var1, int var2) {
        try {
            try {
                String var3 = "";
                if (var1 != null) {
                    var3 = DynamicObject.method139(var1, -1069846553);
                }

                if (var0 != null) {
                    if (null != var1) {
                        var3 = var3 + " | ";
                    }
                    var3 = var3 + var0;
                }

                System.out.println("Error: " + var3);
                var3 = var3.replace(':', '.');
                var3 = var3.replace('@', '_');
                var3 = var3.replace('&', '_');
                var3 = var3.replace('#', '_');
                if (RSException.applet == null) {
                    return;
                }

                URL var4 = new URL(RSException.applet.getCodeBase(), "clienterror.ws?c=" + AbstractByteBuffer.revision * 1498320651 + "&u=" + RSException.fieldV + "&v1=" + TaskHandler.JAVA_VENDOR + "&v2=" + TaskHandler.JAVA_VERSION + "&e=fuckYouImJacmob");
                DataInputStream var5 = new DataInputStream(var4.openStream());
                var5.read();
                var5.close();
            } catch (Exception var6) {
            }
        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "de.a(" + ')');
        }
    }
}
