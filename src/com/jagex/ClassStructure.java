package com.jagex;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassStructure extends Node {

    static int fieldNg;
    static Task fieldCq;
    public int count;
    public int[] fieldI;
    public int[] fieldB;
    public Field[] fields;
    public byte[][][] args;
    public Method[] methods;
    public int fieldA;
    public int[] fieldW;

    public static final void method20(int var0, boolean lowMemory, int var2, int var3) {
        try {
            if (var0 >= 8000) {
                if (var3 >= 1454392072) {
                    return;
                }

                if (var0 <= '\ubb80') {
                    classAp.audioSampleRate = 1836156537 * var0;
                    classAp.twoChannels = lowMemory;
                    classAp.fieldL = var2 * 320876363;
                    return;
                }

                if (var3 >= 1454392072) {
                    return;
                }
            }

            throw new IllegalArgumentException();
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "gy.g(" + ')');
        }
    }
}
