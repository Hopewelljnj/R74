package com.jagex;

public final class LandscapeTile extends Node {

    protected static String fieldQb;
    static Sprite[] hintHeadIcons;
    static int fieldAt;

    TilePaint paint;
    TileModel model;

    BoundaryDecoration boundDeco;
    Boundary boundary;
    TileDecoration tileDeco;
    ItemPile items;
    EntityMarker[] markers = new EntityMarker[5];

    LandscapeTile fieldP;

    int floor;
    int regionX;
    int regionY;

    boolean fieldT;
    boolean fieldQ;
    boolean fieldH;


    int fieldA;
    int fieldJ;
    int entityCount;
    int fieldO;

    int[] fieldD = new int[5];

    int fieldU;
    int fieldX = 0;
    int fieldG;
    int fieldY;



    LandscapeTile(int var1, int var2, int var3) {
        this.floor = (this.fieldA = 1656574747 * var1) * -346404159;
        this.regionX = var2 * -810987557;
        this.regionY = var3 * 1612140769;
    }

    public static void updateMouse(int var0) {
        try {
            Mouse var1 = Mouse.instance;
            synchronized (Mouse.instance) {
                Mouse.fieldM = Mouse.fieldI * 771078621;
                Mouse.fieldW = Mouse.fieldB * 1055280633;
                Mouse.fieldE = Mouse.fieldL * -791267903;
                Mouse.fieldD = Mouse.fieldN * -1879979327;
                Mouse.fieldX = Mouse.fieldS * -819832607;
                Mouse.fieldO = Mouse.fieldK * -328845073;
                Mouse.fieldQ = Mouse.fieldF * 5366817029664927983L;
                Mouse.fieldN = 0;
            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "cv.v(" + ')');
        }
    }

    static final void updateStubMod(LandscapeMod var0, byte DUMMY) {
        try {

            int uid = 0;
            int object_id = -1;
            int object_type = 0;
            int object_rot = 0;

            if (0 == var0.objectStubType * -1927249751) {
                uid = Client.landscape.getBoundaryUID(var0.floor * -94243731, var0.regionX * -567016967, var0.regionY * 29917975);
            }

            if (1 == var0.objectStubType * -1927249751) {
                uid = Client.landscape.getBoundaryDecUid(var0.floor * -94243731, var0.regionX * -567016967, var0.regionY * 29917975);
            }

            if (var0.objectStubType * -1927249751 == 2) {
                uid = Client.landscape.getObjectUID(var0.floor * -94243731, var0.regionX * -567016967, var0.regionY * 29917975);
            }

            if (3 == var0.objectStubType * -1927249751) {
                uid = Client.landscape.getTileDecoUID(var0.floor * -94243731, var0.regionX * -567016967, var0.regionY * 29917975);
            }

            if (0 != uid) {
                int var6 = Client.landscape.configForUid(var0.floor * -94243731, var0.regionX * -567016967, var0.regionY * 29917975, uid);
                object_id = uid >> 14 & 32767;
                object_type = var6 & 31;
                object_rot = var6 >> 6 & 3;
            }

            var0.prevObjectId = object_id * -1176437123;
            var0.prevObjectType = -2036050921 * object_type;
            var0.prevObjectRot = object_rot * -1238790341;

        } catch (RuntimeException var7) {
            var7.printStackTrace();
//            throw ClanMate.method194(var7, "cv.bu(" + ')');
        }
    }
}
