package com.jagex;

public final class IsaacCipher {

    int fieldM;
    int fieldB;
    int[] fieldW = new int[256];
    int[] fieldE = new int[256];
    int fieldA;
    int fieldN;


    IsaacCipher(int[] var1) {
        for (int var2 = 0; var2 < var1.length; ++var2) {
            this.fieldW[var2] = var1[var2];
        }

        this.i((byte) 14);
    }

    static final void method66(int var0, int var1, int var2) {
        try {
            if (Client.menuRowCount * 445599935 < 2) {
                if (var2 == -1701682411) {
                    throw new IllegalStateException();
                }

                if (Client.itemSelectionStatus * 279939385 == 0 && !Client.isSpellSelected) {
                    if (var2 == -1701682411) {
                        throw new IllegalStateException();
                    }

                    return;
                }
            }

            String var3;
            label75:
            {
                if (1 == Client.itemSelectionStatus * 279939385) {
                    if (var2 == -1701682411) {
                        throw new IllegalStateException();
                    }

                    if (Client.menuRowCount * 445599935 < 2) {
                        if (var2 == -1701682411) {
                            throw new IllegalStateException();
                        }

                        var3 = StringConstants.fieldEk + StringConstants.fieldFo + Client.fieldIt + " " + UtilClass41.fieldM;
                        break label75;
                    }
                }

                if (Client.isSpellSelected) {

                    if (Client.menuRowCount * 445599935 < 2) {
                        var3 = Client.spellAction + StringConstants.fieldFo + Client.fieldJc + " " + UtilClass41.fieldM;
                        break label75;
                    }
                }

                int var5 = Client.menuRowCount * 445599935 - 1;
                String var4;
                if (Client.menuNouns[var5].length() > 0) {
                    if (var2 == -1701682411) {
                        return;
                    }

                    var4 = Client.menuOptions[var5] + StringConstants.fieldFo + Client.menuNouns[var5];
                } else {
                    var4 = Client.menuOptions[var5];
                }

                var3 = var4;
            }

            if (Client.menuRowCount * 445599935 > 2) {
                if (var2 == -1701682411) {
                    throw new IllegalStateException();
                }

                var3 = var3 + Buffer.getColorTags(16777215, 1118261532) + " " + '/' + " " + (Client.menuRowCount * 445599935 - 2) + StringConstants.fieldEw;
            }

            MenuItem.font_b12full.q(var3, var0 + 4, 15 + var1, 16777215, 0, Client.engineCycle * -1223223371 / 1000);
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "df.be(" + ')');
        }
    }

    final int a(byte var1) {
        try {
            if (0 == (this.fieldM -= 465966171) * 2077817811 + 1) {
                if (var1 <= -1) {
                    throw new IllegalStateException();
                }

                this.v(-1471134950);
                this.fieldM = -1437710683;
            }

            return this.fieldW[this.fieldM * 2077817811];
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "df.a(" + ')');
        }
    }

    final void i(byte var1) {
        try {
            int var10 = -1640531527;
            int var9 = -1640531527;
            int var8 = -1640531527;
            int var7 = -1640531527;
            int var6 = -1640531527;
            int var5 = -1640531527;
            int var4 = -1640531527;
            int var3 = -1640531527;

            int var2;
            for (var2 = 0; var2 < 4; ++var2) {
                if (var1 <= 1) {
                    throw new IllegalStateException();
                }

                var3 ^= var4 << 11;
                var6 += var3;
                var4 += var5;
                var4 ^= var5 >>> 2;
                var7 += var4;
                var5 += var6;
                var5 ^= var6 << 8;
                var8 += var5;
                var6 += var7;
                var6 ^= var7 >>> 16;
                var9 += var6;
                var7 += var8;
                var7 ^= var8 << 10;
                var10 += var7;
                var8 += var9;
                var8 ^= var9 >>> 4;
                var3 += var8;
                var9 += var10;
                var9 ^= var10 << 8;
                var4 += var9;
                var10 += var3;
                var10 ^= var3 >>> 9;
                var5 += var10;
                var3 += var4;
            }

            for (var2 = 0; var2 < 256; var2 += 8) {
                if (var1 <= 1) {
                    throw new IllegalStateException();
                }

                var3 += this.fieldW[var2];
                var4 += this.fieldW[1 + var2];
                var5 += this.fieldW[2 + var2];
                var6 += this.fieldW[3 + var2];
                var7 += this.fieldW[var2 + 4];
                var8 += this.fieldW[var2 + 5];
                var9 += this.fieldW[6 + var2];
                var10 += this.fieldW[7 + var2];
                var3 ^= var4 << 11;
                var6 += var3;
                var4 += var5;
                var4 ^= var5 >>> 2;
                var7 += var4;
                var5 += var6;
                var5 ^= var6 << 8;
                var8 += var5;
                var6 += var7;
                var6 ^= var7 >>> 16;
                var9 += var6;
                var7 += var8;
                var7 ^= var8 << 10;
                var10 += var7;
                var8 += var9;
                var8 ^= var9 >>> 4;
                var3 += var8;
                var9 += var10;
                var9 ^= var10 << 8;
                var4 += var9;
                var10 += var3;
                var10 ^= var3 >>> 9;
                var5 += var10;
                var3 += var4;
                this.fieldE[var2] = var3;
                this.fieldE[1 + var2] = var4;
                this.fieldE[var2 + 2] = var5;
                this.fieldE[3 + var2] = var6;
                this.fieldE[var2 + 4] = var7;
                this.fieldE[5 + var2] = var8;
                this.fieldE[var2 + 6] = var9;
                this.fieldE[7 + var2] = var10;
            }

            for (var2 = 0; var2 < 256; var2 += 8) {
                var3 += this.fieldE[var2];
                var4 += this.fieldE[1 + var2];
                var5 += this.fieldE[var2 + 2];
                var6 += this.fieldE[var2 + 3];
                var7 += this.fieldE[var2 + 4];
                var8 += this.fieldE[5 + var2];
                var9 += this.fieldE[var2 + 6];
                var10 += this.fieldE[var2 + 7];
                var3 ^= var4 << 11;
                var6 += var3;
                var4 += var5;
                var4 ^= var5 >>> 2;
                var7 += var4;
                var5 += var6;
                var5 ^= var6 << 8;
                var8 += var5;
                var6 += var7;
                var6 ^= var7 >>> 16;
                var9 += var6;
                var7 += var8;
                var7 ^= var8 << 10;
                var10 += var7;
                var8 += var9;
                var8 ^= var9 >>> 4;
                var3 += var8;
                var9 += var10;
                var9 ^= var10 << 8;
                var4 += var9;
                var10 += var3;
                var10 ^= var3 >>> 9;
                var5 += var10;
                var3 += var4;
                this.fieldE[var2] = var3;
                this.fieldE[1 + var2] = var4;
                this.fieldE[2 + var2] = var5;
                this.fieldE[3 + var2] = var6;
                this.fieldE[var2 + 4] = var7;
                this.fieldE[var2 + 5] = var8;
                this.fieldE[6 + var2] = var9;
                this.fieldE[7 + var2] = var10;
            }

            this.v(-1471134950);
            this.fieldM = -971744512;
        } catch (RuntimeException var11) {
            throw ClanMate.error(var11, "df.i(" + ')');
        }
    }

    final void v(int var1) {
        try {
            this.fieldA += (this.fieldB += -1825771135) * 1199654929;

            for (int var2 = 0; var2 < 256; ++var2) {
                if (var1 != -1471134950) {
                    throw new IllegalStateException();
                }

                int var3 = this.fieldE[var2];
                if (0 == (var2 & 2)) {
                    if ((var2 & 1) == 0) {
                        if (var1 != -1471134950) {
                            throw new IllegalStateException();
                        }

                        this.fieldN = (this.fieldN * -663853693 ^ this.fieldN * -663853693 << 13) * -368586453;
                    } else {
                        this.fieldN = -368586453 * (this.fieldN * -663853693 ^ this.fieldN * -663853693 >>> 6);
                    }
                } else if (0 == (var2 & 1)) {
                    if (var1 != -1471134950) {
                        throw new IllegalStateException();
                    }

                    this.fieldN = (this.fieldN * -663853693 ^ this.fieldN * -663853693 << 2) * -368586453;
                } else {
                    this.fieldN = -368586453 * (this.fieldN * -663853693 ^ this.fieldN * -663853693 >>> 16);
                }

                this.fieldN += -368586453 * this.fieldE[128 + var2 & 255];
                int var4;
                this.fieldE[var2] = var4 = this.fieldE[(var3 & 1020) >> 2] + this.fieldN * -663853693 + this.fieldA * -775712911;
                this.fieldW[var2] = (this.fieldA = -488025711 * (this.fieldE[(var4 >> 8 & 1020) >> 2] + var3)) * -775712911;
            }

        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "df.v(" + ')');
        }
    }
}
