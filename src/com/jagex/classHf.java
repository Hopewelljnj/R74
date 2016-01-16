package com.jagex;

import java.io.EOFException;
import java.io.IOException;

public class classHf {

    long fieldK;
    byte[] fieldV;
    JagexAccessFile jagexAccessFile;
    long fieldM = -1756813412543653349L;
    byte[] fieldL;
    long fieldI = -5137454978899964141L;
    int fieldW = 0;
    long fieldE;
    long fieldN;
    long fieldS;
    int fieldB;


    public classHf(JagexAccessFile var1, int var2, int var3) throws IOException {
        this.jagexAccessFile = var1;
        this.fieldS = (this.fieldN = var1.b(-2114121532) * -2269584727758325119L) * 1654583792165919105L;
        this.fieldV = new byte[var2];
        this.fieldL = new byte[var3];
        this.fieldE = 0L;
    }

    public static WidgetStrings method22(int var0, int var1) {
        try {
            WidgetStrings var2 = (WidgetStrings) WidgetStrings.fieldV.get((long) var0);
            if (var2 != null) {
                return var2;
            } else {
                byte[] var3 = WidgetStrings.fieldA.getFile(8, var0, (short) 13144);
                var2 = new WidgetStrings();
                if (var3 != null) {
                    var2.v(new Buffer(var3), -2107947417);
                }

                WidgetStrings.fieldV.put(var2, (long) var0);
                return var2;
            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "hf.a(" + ')');
        }
    }

    public void v(long var1) throws IOException {
        try {
            if (var1 < 0L) {
                throw new IOException("");
            } else {
                this.fieldE = 4043368247790746177L * var1;
            }
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "hf.v(" + ')');
        }
    }

    public void b(byte[] var1, int var2) throws IOException {
        try {
            this.l(var1, 0, var1.length, 655966399);
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "hf.b(" + ')');
        }
    }

    public void l(byte[] var1, int var2, int var3, int var4) throws IOException {
        try {
            try {
                if (var3 + var2 > var1.length) {
                    throw new ArrayIndexOutOfBoundsException(var2 + var3 - var1.length);
                }

                if (-1L != 8219632261171138541L * this.fieldM) {
                    if (var4 != 655966399) {
                        return;
                    }

                    if (this.fieldE * -1582060347748788799L >= this.fieldM * 8219632261171138541L) {
                        if (var4 != 655966399) {
                            throw new IllegalStateException();
                        }

                        if ((long) var3 + -1582060347748788799L * this.fieldE <= this.fieldM * 8219632261171138541L + (long) (this.fieldW * 1929157385)) {
                            System.arraycopy(this.fieldL, (int) (this.fieldE * -1582060347748788799L - 8219632261171138541L * this.fieldM), var1, var2, var3);
                            this.fieldE += 4043368247790746177L * (long) var3;
                            return;
                        }
                    }
                }

                long var5 = this.fieldE * -1582060347748788799L;
                int var8 = var3;
                int var9;
                if (this.fieldE * -1582060347748788799L >= this.fieldI * -3575076038935122715L) {
                    if (var4 != 655966399) {
                        throw new IllegalStateException();
                    }

                    if (this.fieldE * -1582060347748788799L < this.fieldI * -3575076038935122715L + (long) (this.fieldB * -226446321)) {
                        if (var4 != 655966399) {
                            throw new IllegalStateException();
                        }

                        var9 = (int) ((long) (this.fieldB * -226446321) - (-1582060347748788799L * this.fieldE - -3575076038935122715L * this.fieldI));
                        if (var9 > var3) {
                            var9 = var3;
                        }

                        System.arraycopy(this.fieldV, (int) (-1582060347748788799L * this.fieldE - this.fieldI * -3575076038935122715L), var1, var2, var9);
                        this.fieldE += (long) var9 * 4043368247790746177L;
                        var2 += var9;
                        var3 -= var9;
                    }
                }

                if (var3 > this.fieldV.length) {
                    if (var4 != 655966399) {
                        throw new IllegalStateException();
                    }

                    this.jagexAccessFile.a(this.fieldE * -1582060347748788799L);

                    for (this.fieldK = this.fieldE * 6344622491185933485L; var3 > 0; var3 -= var9) {
                        var9 = this.jagexAccessFile.l(var1, var2, var3, (byte) 36);
                        if (var9 == -1) {
                            break;
                        }

                        this.fieldK += (long) var9 * -5819371169718547987L;
                        this.fieldE += 4043368247790746177L * (long) var9;
                        var2 += var9;
                    }
                } else if (var3 > 0) {
                    if (var4 != 655966399) {
                        return;
                    }

                    this.m(1687160245);
                    var9 = var3;
                    if (var3 > this.fieldB * -226446321) {
                        if (var4 != 655966399) {
                            throw new IllegalStateException();
                        }

                        var9 = this.fieldB * -226446321;
                    }

                    System.arraycopy(this.fieldV, 0, var1, var2, var9);
                    var2 += var9;
                    var3 -= var9;
                    this.fieldE += 4043368247790746177L * (long) var9;
                }

                if (-1L != 8219632261171138541L * this.fieldM) {
                    if (8219632261171138541L * this.fieldM > this.fieldE * -1582060347748788799L) {
                        if (var4 != 655966399) {
                            throw new IllegalStateException();
                        }

                        if (var3 > 0) {
                            if (var4 != 655966399) {
                                throw new IllegalStateException();
                            }

                            var9 = var2 + (int) (8219632261171138541L * this.fieldM - this.fieldE * -1582060347748788799L);
                            if (var9 > var2 + var3) {
                                if (var4 != 655966399) {
                                    throw new IllegalStateException();
                                }

                                var9 = var3 + var2;
                            }

                            while (var2 < var9) {
                                if (var4 != 655966399) {
                                    return;
                                }

                                var1[var2++] = 0;
                                --var3;
                                this.fieldE += 4043368247790746177L;
                            }
                        }
                    }

                    long var11;
                    long var16;
                    label174:
                    {
                        var16 = -1L;
                        var11 = -1L;
                        if (this.fieldM * 8219632261171138541L >= var5) {
                            if (var4 != 655966399) {
                                throw new IllegalStateException();
                            }

                            if (this.fieldM * 8219632261171138541L < (long) var8 + var5) {
                                if (var4 != 655966399) {
                                    return;
                                }

                                var16 = 8219632261171138541L * this.fieldM;
                                break label174;
                            }
                        }

                        if (var5 >= 8219632261171138541L * this.fieldM) {
                            if (var4 != 655966399) {
                                throw new IllegalStateException();
                            }

                            if (var5 < (long) (this.fieldW * 1929157385) + 8219632261171138541L * this.fieldM) {
                                if (var4 != 655966399) {
                                    throw new IllegalStateException();
                                }

                                var16 = var5;
                            }
                        }
                    }

                    label168:
                    {
                        if (8219632261171138541L * this.fieldM + (long) (this.fieldW * 1929157385) > var5) {
                            if (var4 != 655966399) {
                                throw new IllegalStateException();
                            }

                            if (8219632261171138541L * this.fieldM + (long) (this.fieldW * 1929157385) <= (long) var8 + var5) {
                                if (var4 != 655966399) {
                                    throw new IllegalStateException();
                                }

                                var11 = 8219632261171138541L * this.fieldM + (long) (this.fieldW * 1929157385);
                                break label168;
                            }
                        }

                        if ((long) var8 + var5 > 8219632261171138541L * this.fieldM && var5 + (long) var8 <= (long) (this.fieldW * 1929157385) + 8219632261171138541L * this.fieldM) {
                            if (var4 != 655966399) {
                                throw new IllegalStateException();
                            }

                            var11 = (long) var8 + var5;
                        }
                    }

                    if (var16 > -1L) {
                        if (var4 != 655966399) {
                            throw new IllegalStateException();
                        }

                        if (var11 > var16) {
                            if (var4 != 655966399) {
                                throw new IllegalStateException();
                            }

                            int var13 = (int) (var11 - var16);
                            System.arraycopy(this.fieldL, (int) (var16 - 8219632261171138541L * this.fieldM), var1, (int) (var16 - var5) + var2, var13);
                            if (var11 > this.fieldE * -1582060347748788799L) {
                                if (var4 != 655966399) {
                                    return;
                                }

                                var3 = (int) ((long) var3 - (var11 - -1582060347748788799L * this.fieldE));
                                this.fieldE = 4043368247790746177L * var11;
                            }
                        }
                    }
                }
            } catch (IOException var14) {
                this.fieldK = 5819371169718547987L;
                throw var14;
            }

            if (var3 > 0) {
                if (var4 != 655966399) {
                    throw new IllegalStateException();
                } else {
                    throw new EOFException();
                }
            }
        } catch (RuntimeException var15) {
            throw ClanMate.error(var15, "hf.l(" + ')');
        }
    }

    void e(byte var1) throws IOException {
        try {
            if (8219632261171138541L * this.fieldM != -1L) {
                if (var1 != 0) {
                    throw new IllegalStateException();
                }

                if (this.fieldM * 8219632261171138541L != this.fieldK * -378834647540630555L) {
                    if (var1 != 0) {
                        return;
                    }

                    this.jagexAccessFile.a(this.fieldM * 8219632261171138541L);
                    this.fieldK = -7880111051866172567L * this.fieldM;
                }

                this.jagexAccessFile.v(this.fieldL, 0, this.fieldW * 1929157385, 498924989);
                this.fieldK += 4625050473656457301L * (long) this.fieldW;
                if (this.fieldK * -378834647540630555L > this.fieldN * -1844820564117682815L) {
                    if (var1 != 0) {
                        throw new IllegalStateException();
                    }

                    this.fieldN = 2803925862869291109L * this.fieldK;
                }

                long var2;
                long var4;
                label92:
                {
                    var2 = -1L;
                    var4 = -1L;
                    if (8219632261171138541L * this.fieldM >= this.fieldI * -3575076038935122715L) {
                        if (var1 != 0) {
                            throw new IllegalStateException();
                        }

                        if (this.fieldM * 8219632261171138541L < this.fieldI * -3575076038935122715L + (long) (this.fieldB * -226446321)) {
                            if (var1 != 0) {
                                throw new IllegalStateException();
                            }

                            var2 = 8219632261171138541L * this.fieldM;
                            break label92;
                        }
                    }

                    if (-3575076038935122715L * this.fieldI >= 8219632261171138541L * this.fieldM) {
                        if (var1 != 0) {
                            throw new IllegalStateException();
                        }

                        if (-3575076038935122715L * this.fieldI < 8219632261171138541L * this.fieldM + (long) (this.fieldW * 1929157385)) {
                            if (var1 != 0) {
                                return;
                            }

                            var2 = this.fieldI * -3575076038935122715L;
                        }
                    }
                }

                label86:
                {
                    if ((long) (this.fieldW * 1929157385) + this.fieldM * 8219632261171138541L > -3575076038935122715L * this.fieldI) {
                        if (var1 != 0) {
                            throw new IllegalStateException();
                        }

                        if ((long) (this.fieldW * 1929157385) + this.fieldM * 8219632261171138541L <= (long) (this.fieldB * -226446321) + this.fieldI * -3575076038935122715L) {
                            if (var1 != 0) {
                                return;
                            }

                            var4 = (long) (this.fieldW * 1929157385) + 8219632261171138541L * this.fieldM;
                            break label86;
                        }
                    }

                    if ((long) (this.fieldB * -226446321) + -3575076038935122715L * this.fieldI > 8219632261171138541L * this.fieldM && (long) (this.fieldB * -226446321) + this.fieldI * -3575076038935122715L <= (long) (this.fieldW * 1929157385) + 8219632261171138541L * this.fieldM) {
                        if (var1 != 0) {
                            return;
                        }

                        var4 = (long) (this.fieldB * -226446321) + this.fieldI * -3575076038935122715L;
                    }
                }

                if (var2 > -1L) {
                    if (var1 != 0) {
                        throw new IllegalStateException();
                    }

                    if (var4 > var2) {
                        int var6 = (int) (var4 - var2);
                        System.arraycopy(this.fieldL, (int) (var2 - this.fieldM * 8219632261171138541L), this.fieldV, (int) (var2 - this.fieldI * -3575076038935122715L), var6);
                    }
                }

                this.fieldM = -1756813412543653349L;
                this.fieldW = 0;
            }

        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "hf.e(" + ')');
        }
    }

    public void w(byte[] var1, int var2, int var3, int var4) throws IOException {
        try {
            try {
                if (this.fieldE * -1582060347748788799L + (long) var3 > 8443599178407406593L * this.fieldS) {
                    if (var4 <= 2089118482) {
                        throw new IllegalStateException();
                    }

                    this.fieldS = (this.fieldE * -1582060347748788799L + (long) var3) * -261166264069712895L;
                }

                if (this.fieldM * 8219632261171138541L != -1L) {
                    label168:
                    {
                        if (var4 <= 2089118482) {
                            throw new IllegalStateException();
                        }

                        if (-1582060347748788799L * this.fieldE >= this.fieldM * 8219632261171138541L) {
                            if (var4 <= 2089118482) {
                                throw new IllegalStateException();
                            }

                            if (-1582060347748788799L * this.fieldE <= (long) (this.fieldW * 1929157385) + this.fieldM * 8219632261171138541L) {
                                break label168;
                            }

                            if (var4 <= 2089118482) {
                                return;
                            }
                        }

                        this.e((byte) 0);
                    }
                }

                if (-1L != this.fieldM * 8219632261171138541L) {
                    if (var4 <= 2089118482) {
                        throw new IllegalStateException();
                    }

                    if (-1582060347748788799L * this.fieldE + (long) var3 > 8219632261171138541L * this.fieldM + (long) this.fieldL.length) {
                        if (var4 <= 2089118482) {
                            return;
                        }

                        int var5 = (int) ((long) this.fieldL.length - (this.fieldE * -1582060347748788799L - this.fieldM * 8219632261171138541L));
                        System.arraycopy(var1, var2, this.fieldL, (int) (-1582060347748788799L * this.fieldE - 8219632261171138541L * this.fieldM), var5);
                        this.fieldE += (long) var5 * 4043368247790746177L;
                        var2 += var5;
                        var3 -= var5;
                        this.fieldW = this.fieldL.length * -1046125767;
                        this.e((byte) 0);
                    }
                }

                if (var3 > this.fieldL.length) {
                    if (var4 <= 2089118482) {
                        throw new IllegalStateException();
                    } else {
                        if (-378834647540630555L * this.fieldK != this.fieldE * -1582060347748788799L) {
                            if (var4 <= 2089118482) {
                                throw new IllegalStateException();
                            }

                            this.jagexAccessFile.a(this.fieldE * -1582060347748788799L);
                            this.fieldK = this.fieldE * 6344622491185933485L;
                        }

                        this.jagexAccessFile.v(var1, var2, var3, -1468071578);
                        this.fieldK += -5819371169718547987L * (long) var3;
                        if (-378834647540630555L * this.fieldK > this.fieldN * -1844820564117682815L) {
                            if (var4 <= 2089118482) {
                                throw new IllegalStateException();
                            }

                            this.fieldN = this.fieldK * 2803925862869291109L;
                        }

                        long var7;
                        long var12;
                        label146:
                        {
                            var12 = -1L;
                            var7 = -1L;
                            if (this.fieldE * -1582060347748788799L >= this.fieldI * -3575076038935122715L) {
                                if (var4 <= 2089118482) {
                                    throw new IllegalStateException();
                                }

                                if (-1582060347748788799L * this.fieldE < (long) (this.fieldB * -226446321) + this.fieldI * -3575076038935122715L) {
                                    if (var4 <= 2089118482) {
                                        throw new IllegalStateException();
                                    }

                                    var12 = this.fieldE * -1582060347748788799L;
                                    break label146;
                                }
                            }

                            if (this.fieldI * -3575076038935122715L >= -1582060347748788799L * this.fieldE && -3575076038935122715L * this.fieldI < this.fieldE * -1582060347748788799L + (long) var3) {
                                if (var4 <= 2089118482) {
                                    throw new IllegalStateException();
                                }

                                var12 = -3575076038935122715L * this.fieldI;
                            }
                        }

                        label140:
                        {
                            if ((long) var3 + -1582060347748788799L * this.fieldE > -3575076038935122715L * this.fieldI) {
                                if (var4 <= 2089118482) {
                                    throw new IllegalStateException();
                                }

                                if (this.fieldE * -1582060347748788799L + (long) var3 <= this.fieldI * -3575076038935122715L + (long) (this.fieldB * -226446321)) {
                                    if (var4 <= 2089118482) {
                                        throw new IllegalStateException();
                                    }

                                    var7 = this.fieldE * -1582060347748788799L + (long) var3;
                                    break label140;
                                }
                            }

                            if (-3575076038935122715L * this.fieldI + (long) (this.fieldB * -226446321) > -1582060347748788799L * this.fieldE) {
                                if (var4 <= 2089118482) {
                                    throw new IllegalStateException();
                                }

                                if ((long) (this.fieldB * -226446321) + -3575076038935122715L * this.fieldI <= (long) var3 + this.fieldE * -1582060347748788799L) {
                                    if (var4 <= 2089118482) {
                                        return;
                                    }

                                    var7 = this.fieldI * -3575076038935122715L + (long) (this.fieldB * -226446321);
                                }
                            }
                        }

                        if (var12 > -1L) {
                            if (var4 <= 2089118482) {
                                throw new IllegalStateException();
                            }

                            if (var7 > var12) {
                                int var9 = (int) (var7 - var12);
                                System.arraycopy(var1, (int) (var12 + (long) var2 - -1582060347748788799L * this.fieldE), this.fieldV, (int) (var12 - -3575076038935122715L * this.fieldI), var9);
                            }
                        }

                        this.fieldE += 4043368247790746177L * (long) var3;
                    }
                } else if (var3 > 0) {
                    if (var4 <= 2089118482) {
                        throw new IllegalStateException();
                    } else {
                        if (this.fieldM * 8219632261171138541L == -1L) {
                            this.fieldM = -5809396445198853467L * this.fieldE;
                        }

                        System.arraycopy(var1, var2, this.fieldL, (int) (-1582060347748788799L * this.fieldE - this.fieldM * 8219632261171138541L), var3);
                        this.fieldE += (long) var3 * 4043368247790746177L;
                        if (this.fieldE * -1582060347748788799L - 8219632261171138541L * this.fieldM > (long) (this.fieldW * 1929157385)) {
                            if (var4 <= 2089118482) {
                                throw new IllegalStateException();
                            }

                            this.fieldW = (int) (-1582060347748788799L * this.fieldE - this.fieldM * 8219632261171138541L) * -1046125767;
                        }

                    }
                }
            } catch (IOException var10) {
                this.fieldK = 5819371169718547987L;
                throw var10;
            }
        } catch (RuntimeException var11) {
            throw ClanMate.error(var11, "hf.w(" + ')');
        }
    }

    void m(int var1) throws IOException {
        try {
            this.fieldB = 0;
            if (-378834647540630555L * this.fieldK != this.fieldE * -1582060347748788799L) {
                if (var1 == -1257350729) {
                    return;
                }

                this.jagexAccessFile.a(this.fieldE * -1582060347748788799L);
                this.fieldK = 6344622491185933485L * this.fieldE;
            }

            int var2;
            for (this.fieldI = 1824301589901726637L * this.fieldE; this.fieldB * -226446321 < this.fieldV.length; this.fieldB += var2 * 531348207) {
                if (var1 == -1257350729) {
                    throw new IllegalStateException();
                }

                var2 = this.jagexAccessFile.l(this.fieldV, this.fieldB * -226446321, this.fieldV.length - this.fieldB * -226446321, (byte) 23);
                if (-1 == var2) {
                    if (var1 == -1257350729) {
                        throw new IllegalStateException();
                    }
                    break;
                }

                this.fieldK += -5819371169718547987L * (long) var2;
            }

        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "hf.m(" + ')');
        }
    }

    public void a(int var1) throws IOException {
        try {
            this.e((byte) 0);
            this.jagexAccessFile.i((byte) -43);
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "hf.a(" + ')');
        }
    }

    public long i(int var1) {
        try {
            return this.fieldS * 8443599178407406593L;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "hf.i(" + ')');
        }
    }
}
