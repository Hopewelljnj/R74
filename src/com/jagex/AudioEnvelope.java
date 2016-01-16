package com.jagex;

public class AudioEnvelope {

    int fieldS;
    int[] fieldV = new int[2];
    int fieldM;
    int start;
    int end;
    int fieldA = 2;
    int fieldW;
    int fieldE;
    int[] fieldI = new int[2];
    int fieldK;
    int fieldN;


    AudioEnvelope() {
        this.fieldV[0] = 0;
        this.fieldV[1] = '\uffff';
        this.fieldI[0] = 0;
        this.fieldI[1] = '\uffff';
    }

    final void decode(Buffer var1) {
        this.fieldM = var1.readUByte();
        this.start = var1.readInt((byte) 28);
        this.end = var1.readInt((byte) -46);
        this.v(var1);
    }

    final void v(Buffer var1) {
        this.fieldA = var1.readUByte();
        this.fieldV = new int[this.fieldA];
        this.fieldI = new int[this.fieldA];

        for (int var2 = 0; var2 < this.fieldA; ++var2) {
            this.fieldV[var2] = var1.readUShort();
            this.fieldI[var2] = var1.readUShort();
        }

    }

    final void reset() {
        this.fieldW = 0;
        this.fieldE = 0;
        this.fieldN = 0;
        this.fieldS = 0;
        this.fieldK = 0;
    }

    final int forward(int var1) {
        if (this.fieldK >= this.fieldW) {
            this.fieldS = this.fieldI[this.fieldE++] << 15;
            if (this.fieldE >= this.fieldA) {
                this.fieldE = this.fieldA - 1;
            }

            this.fieldW = (int) ((double) this.fieldV[this.fieldE] / 65536.0D * (double) var1);
            if (this.fieldW > this.fieldK) {
                this.fieldN = ((this.fieldI[this.fieldE] << 15) - this.fieldS) / (this.fieldW - this.fieldK);
            }
        }

        this.fieldS += this.fieldN;
        ++this.fieldK;
        return this.fieldS - this.fieldN >> 15;
    }
}
