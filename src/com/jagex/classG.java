package com.jagex;

public final class classG extends Node {

    static NodeDeque fieldA = new NodeDeque();
    static int selectedSpellParentUID;
    classBw fieldN;
    int fieldB;
    int fieldI;
    int fieldL;
    int fieldW;
    int fieldM;
    int fieldE;
    int[] fieldF;
    classBw fieldX;
    int fieldK;
    int fieldS;
    int fieldV;
    int fieldD;
    ObjectDefinition fieldO;

    void i(byte var1) {
        try {
            int var2 = this.fieldE * 1677615665;
            ObjectDefinition var3 = this.fieldO.transform(1106931628);
            if (null != var3) {
                if (var1 <= 4) {
                    return;
                }

                this.fieldE = var3.fieldAk * -854960991;
                this.fieldW = var3.fieldAj * 2040064896;
                this.fieldS = var3.fieldAf * 467187331;
                this.fieldK = var3.fieldAb * -1684023079;
                this.fieldF = var3.fieldAc;
            } else {
                this.fieldE = -2146678481;
                this.fieldW = 0;
                this.fieldS = 0;
                this.fieldK = 0;
                this.fieldF = null;
            }

            if (this.fieldE * 1677615665 != var2) {
                if (var1 <= 4) {
                    throw new IllegalStateException();
                }

                if (this.fieldN != null) {
                    if (var1 <= 4) {
                        throw new IllegalStateException();
                    }

                    Client.fieldNn.v(this.fieldN);
                    this.fieldN = null;
                }
            }

        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "g.i(" + ')');
        }
    }

}
