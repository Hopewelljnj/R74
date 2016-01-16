package com.jagex;

import java.applet.Applet;

public class RSException extends RuntimeException {

    public static String fieldV;
    static Applet applet;
    String fieldB;
    Throwable fieldL;


    RSException(Throwable var1, String var2) {
        this.fieldB = var2;
        this.fieldL = var1;
    }
}
