package com.jagex;

import javax.sound.sampled.*;
import javax.sound.sampled.DataLine.Info;
import java.awt.*;

public class classBb extends classAp {

    int fieldAr;
    SourceDataLine line;
    AudioFormat format;
    byte[] audioData;


    @Override
    void v(int var1) throws LineUnavailableException {
        try {
            try {
                Info var2 = new Info(SourceDataLine.class, this.format, var1 << (twoChannels ? 2 : 1));
                this.line = (SourceDataLine) AudioSystem.getLine(var2);
                this.line.open();
                this.line.start();
                this.fieldAr = 1024118439 * var1;
            } catch (LineUnavailableException var5) {
                int var4 = (var1 & 1431655765) + (var1 >>> 1 & 1431655765);
                var4 = (var4 & 858993459) + (var4 >>> 2 & 858993459);
                var4 = var4 + (var4 >>> 4) & 252645135;
                var4 += var4 >>> 8;
                var4 += var4 >>> 16;
                int var3 = var4 & 255;
                if (1 != var3) {
                    this.v(Player.method151(var1, 2026821792));
                } else {
                    this.line = null;
                    throw var5;
                }
            }
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "bb.v(" + ')');
        }
    }

    @Override
    int i() {
        try {
            return this.fieldAr * -425592553 - (this.line.available() >> (twoChannels ? 2 : 1));
        } catch (RuntimeException var1) {
            throw ClanMate.error(var1, "bb.i(" + ')');
        }
    }

    @Override
    void b() {
        int var1 = 256;
        if (twoChannels) {
            var1 <<= 1;
        }

        for (int var2 = 0; var2 < var1; ++var2) {
            int var3 = this.fieldN[var2];
            if ((var3 + 8388608 & -16777216) != 0) {
                var3 = 8388607 ^ var3 >> 31;
            }

            this.audioData[var2 * 2] = (byte) (var3 >> 8);
            this.audioData[var2 * 2 + 1] = (byte) (var3 >> 16);
        }

        this.line.write(this.audioData, 0, var1 << 1);
    }

    @Override
    void m() {
        try {
            this.line.flush();
        } catch (RuntimeException var1) {
            throw ClanMate.error(var1, "bb.m(" + ')');
        }
    }

    @Override
    void a(Component var1) {
        try {
            this.format = new AudioFormat((float) (audioSampleRate * 2098856905), 16, twoChannels ? 2 : 1, true, false);
            this.audioData = new byte[256 << (twoChannels ? 2 : 1)];
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "bb.a(" + ')');
        }
    }

    @Override
    void l() {
        try {
            if (this.line != null) {
                this.line.close();
                this.line = null;
            }

        } catch (RuntimeException var1) {
            throw ClanMate.error(var1, "bb.l(" + ')');
        }
    }
}
