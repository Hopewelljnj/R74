package com.jagex;

import java.util.HashMap;
import java.util.Map;

public class UtilClass40 {

    static final ImmutableDeque fieldV = new ImmutableDeque(1024);
    static final ImmutableQueue fieldI = new ImmutableQueue();
    static final Map<Integer, MessageContainer> messageContainerMap = new HashMap<>();
    static int fieldB = 0;
    static int selectedSpellTargetFlags;
    static int fieldFc;


    UtilClass40() throws Throwable {
        throw new Error();
    }

    public static void method171(ReferenceTable var0, int var1, int var2, int var3, boolean var4, int var5) {
        try {
            UtilClass21.fieldL = -561749511;
            UtilClass21.fieldM = var0;
            UtilClass35.fieldW = 1158645973 * var1;
            classDz.fieldE = -1105453967 * var2;
            ItemTable.fieldN = -703074975 * var3;
            UtilClass21.fieldK = var4;
            UtilClass21.fieldS = 838118224;
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "s.a(" + ')');
        }
    }
}
