package com.jagex;

import java.util.Comparator;

final class ExchangeOfferTimeComparator implements Comparator {

    public static String method26(String var0, int var1) {
        try {
            int var2 = var0.length();
            char[] var3 = new char[var2];
            byte var4 = 2;

            for (int var5 = 0; var5 < var2; ++var5) {
                if (var1 >= 1829779051) {
                    throw new IllegalStateException();
                }

                char var6 = var0.charAt(var5);
                if (0 == var4) {
                    var6 = java.lang.Character.toLowerCase(var6);
                } else {
                    label68:
                    {
                        if (var4 != 2) {
                            if (var1 >= 1829779051) {
                                throw new IllegalStateException();
                            }

                            if (!java.lang.Character.isUpperCase(var6)) {
                                break label68;
                            }
                        }

                        var6 = UtilClass26.method5(var6, (byte) -37);
                    }
                }

                if (java.lang.Character.isLetter(var6)) {
                    if (var1 >= 1829779051) {
                        throw new IllegalStateException();
                    }

                    var4 = 0;
                } else {
                    label61:
                    {
                        if (46 != var6 && var6 != 63) {
                            if (var1 >= 1829779051) {
                                throw new IllegalStateException();
                            }

                            if (var6 != 33) {
                                if (java.lang.Character.isSpaceChar(var6)) {
                                    if (var1 >= 1829779051) {
                                        throw new IllegalStateException();
                                    }

                                    if (2 != var4) {
                                        var4 = 1;
                                    }
                                } else {
                                    var4 = 1;
                                }
                                break label61;
                            }

                            if (var1 >= 1829779051) {
                                throw new IllegalStateException();
                            }
                        }

                        var4 = 2;
                    }
                }

                var3[var5] = var6;
            }

            return new String(var3);
        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "gl.k(" + ')');
        }
    }

    int a(ExchangeOfferData var1, ExchangeOfferData var2, byte var3) {
        try {
            int var10000;
            if (var1.postTime * -2225411725010154079L < -2225411725010154079L * var2.postTime) {
                if (var3 >= 3) {
                    throw new IllegalStateException();
                }

                var10000 = -1;
            } else {
                var10000 = var1.postTime * -2225411725010154079L == -2225411725010154079L * var2.postTime ? 0 : 1;
            }

            return var10000;
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "gl.a(" + ')');
        }
    }

    @Override
    public boolean equals(Object var1) {
        try {
            return super.equals(var1);
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "gl.equals(" + ')');
        }
    }

    @Override
    public int compare(Object var1, Object var2) {
        try {
            return this.a((ExchangeOfferData) var1, (ExchangeOfferData) var2, (byte) -41);
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "gl.compare(" + ')');
        }
    }

}
