package com.jagex;

public class UtilClass39 {

    public static String fieldJ;
    public static ReferenceTableSub fieldBo;


    UtilClass39() throws Throwable {
        throw new Error();
    }

    static final void method172(classBz var0, int var1) {
        try {
            var0.fieldW = false;
            if (var0.fieldU != null) {
                if (var1 != 1676997225) {
                    return;
                }

                var0.fieldU.fieldM = 0;
            }

            for (classBz var2 = var0.m(); var2 != null; var2 = var0.w()) {
                if (var1 != 1676997225) {
                    return;
                }

                method172(var2, 1676997225);
            }

        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "r.ar(" + ')');
        }
    }

    public static int method173(CharSequence var0, byte var1) {
        try {
            int var2 = var0.length();
            int var3 = 0;

            for (int var4 = 0; var4 < var2; ++var4) {
                if (var1 != 64) {
                    throw new IllegalStateException();
                }

                var3 = (var3 << 5) - var3 + var0.charAt(var4);
            }

            return var3;
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "r.e(" + ')');
        }
    }

    static void method174(World[] var0, int var1, int var2, int[] var3, int[] var4, int var5) {
        try {
            if (var1 < var2) {
                if (var5 != 1621082554) {
                    throw new IllegalStateException();
                }

                int var6 = var1 - 1;
                int var7 = 1 + var2;
                int var8 = (var1 + var2) / 2;
                World var9 = var0[var8];
                var0[var8] = var0[var1];
                var0[var1] = var9;

                while (var6 < var7) {
                    if (var5 != 1621082554) {
                        throw new IllegalStateException();
                    }

                    boolean var10 = true;

                    int var11;
                    int var12;
                    int var13;
                    byte var10000;
                    do {
                        --var7;

                        for (var11 = 0; var11 < 4; ++var11) {
                            if (var5 != 1621082554) {
                                return;
                            }

                            if (2 == var3[var11]) {
                                if (var5 != 1621082554) {
                                    throw new IllegalStateException();
                                }

                                var12 = var0[var7].fieldW * -2012394829;
                                var13 = var9.fieldW * -2012394829;
                            } else if (var3[var11] == 1) {
                                if (var5 != 1621082554) {
                                    throw new IllegalStateException();
                                }

                                var12 = -1182340995 * var0[var7].fieldI;
                                var13 = var9.fieldI * -1182340995;
                                if (var12 == -1 && 1 == var4[var11]) {
                                    if (var5 != 1621082554) {
                                        throw new IllegalStateException();
                                    }

                                    var12 = 2001;
                                }

                                if (var13 == -1) {
                                    if (var5 != 1621082554) {
                                        throw new IllegalStateException();
                                    }

                                    if (var4[var11] == 1) {
                                        if (var5 != 1621082554) {
                                            return;
                                        }

                                        var13 = 2001;
                                    }
                                }
                            } else if (var3[var11] == 3) {
                                if (var5 != 1621082554) {
                                    throw new IllegalStateException();
                                }

                                if (var0[var7].a(267378281)) {
                                    if (var5 != 1621082554) {
                                        throw new IllegalStateException();
                                    }

                                    var10000 = 1;
                                } else {
                                    var10000 = 0;
                                }

                                var12 = var10000;
                                if (var9.a(-942218619)) {
                                    if (var5 != 1621082554) {
                                        return;
                                    }

                                    var10000 = 1;
                                } else {
                                    var10000 = 0;
                                }

                                var13 = var10000;
                            } else {
                                var12 = var0[var7].fieldA * 282778565;
                                var13 = var9.fieldA * 282778565;
                            }

                            if (var13 != var12) {
                                if (var4[var11] == 1) {
                                    if (var5 != 1621082554) {
                                        throw new IllegalStateException();
                                    }

                                    if (var12 > var13) {
                                        if (var5 != 1621082554) {
                                            throw new IllegalStateException();
                                        }
                                        break;
                                    }
                                }

                                if (0 == var4[var11]) {
                                    if (var5 != 1621082554) {
                                        return;
                                    }

                                    if (var12 < var13) {
                                        if (var5 != 1621082554) {
                                            throw new IllegalStateException();
                                        }
                                        break;
                                    }
                                }

                                var10 = false;
                                break;
                            }

                            if (var5 != 1621082554) {
                                throw new IllegalStateException();
                            }

                            if (3 == var11) {
                                if (var5 != 1621082554) {
                                    throw new IllegalStateException();
                                }

                                var10 = false;
                            }
                        }
                    } while (var10);

                    var10 = true;

                    do {
                        ++var6;

                        for (var11 = 0; var11 < 4; ++var11) {
                            if (var5 != 1621082554) {
                                throw new IllegalStateException();
                            }

                            if (2 == var3[var11]) {
                                if (var5 != 1621082554) {
                                    return;
                                }

                                var12 = var0[var6].fieldW * -2012394829;
                                var13 = var9.fieldW * -2012394829;
                            } else if (var3[var11] == 1) {
                                if (var5 != 1621082554) {
                                    throw new IllegalStateException();
                                }

                                var12 = var0[var6].fieldI * -1182340995;
                                var13 = var9.fieldI * -1182340995;
                                if (var12 == -1) {
                                    if (var5 != 1621082554) {
                                        return;
                                    }

                                    if (var4[var11] == 1) {
                                        if (var5 != 1621082554) {
                                            throw new IllegalStateException();
                                        }

                                        var12 = 2001;
                                    }
                                }

                                if (var13 == -1) {
                                    if (var5 != 1621082554) {
                                        throw new IllegalStateException();
                                    }

                                    if (var4[var11] == 1) {
                                        if (var5 != 1621082554) {
                                            throw new IllegalStateException();
                                        }

                                        var13 = 2001;
                                    }
                                }
                            } else if (3 == var3[var11]) {
                                if (var5 != 1621082554) {
                                    throw new IllegalStateException();
                                }

                                if (var0[var6].a(-1638688543)) {
                                    if (var5 != 1621082554) {
                                        throw new IllegalStateException();
                                    }

                                    var10000 = 1;
                                } else {
                                    var10000 = 0;
                                }

                                var12 = var10000;
                                if (var9.a(-1065284837)) {
                                    if (var5 != 1621082554) {
                                        throw new IllegalStateException();
                                    }

                                    var10000 = 1;
                                } else {
                                    var10000 = 0;
                                }

                                var13 = var10000;
                            } else {
                                var12 = var0[var6].fieldA * 282778565;
                                var13 = var9.fieldA * 282778565;
                            }

                            if (var12 != var13) {
                                if (1 == var4[var11]) {
                                    if (var5 != 1621082554) {
                                        return;
                                    }

                                    if (var12 < var13) {
                                        if (var5 != 1621082554) {
                                            throw new IllegalStateException();
                                        }
                                        break;
                                    }
                                }

                                if (var4[var11] == 0 && var12 > var13) {
                                    if (var5 != 1621082554) {
                                        throw new IllegalStateException();
                                    }
                                    break;
                                }

                                var10 = false;
                                break;
                            }

                            if (var5 != 1621082554) {
                                throw new IllegalStateException();
                            }

                            if (var11 == 3) {
                                if (var5 != 1621082554) {
                                    throw new IllegalStateException();
                                }

                                var10 = false;
                            }
                        }
                    } while (var10);

                    if (var5 != 1621082554) {
                        throw new IllegalStateException();
                    }

                    if (var6 < var7) {
                        if (var5 != 1621082554) {
                            throw new IllegalStateException();
                        }

                        World var15 = var0[var6];
                        var0[var6] = var0[var7];
                        var0[var7] = var15;
                    }
                }

                method174(var0, var1, var7, var3, var4, 1621082554);
                method174(var0, var7 + 1, var2, var3, var4, 1621082554);
            }

        } catch (RuntimeException var14) {
            throw ClanMate.error(var14, "r.f(" + ')');
        }
    }

    static final byte[] decodeContainer(byte[] buffer, int DUMMY) {
        try {

            Buffer buf = new Buffer(buffer);
            int compressionType = buf.readUByte();
            int length = buf.readInt((byte) 40);

            if (length >= 0) {

                if (ReferenceTable.fieldT * -1989764757 != 0) {
                    if (length > ReferenceTable.fieldT * -1989764757) {
                        throw new RuntimeException();
                    }
                }

                if (compressionType == 0) {
                    byte[] var8 = new byte[length];
                    buf.read(var8, 0, length, (byte) -37);
                    return var8;
                } else {
                    int uncompressedLength = buf.readInt((byte) -72);
                    if (uncompressedLength >= 0) {

                        if (0 != ReferenceTable.fieldT * -1989764757) {
                            if (uncompressedLength > ReferenceTable.fieldT * -1989764757) {
                                throw new RuntimeException();
                            }
                        }

                        byte[] var6 = new byte[uncompressedLength];
                        if (compressionType == 1) {
                            UtilClass12.method38(var6, uncompressedLength, buffer, length, 9);
                        } else {
                            ReferenceTable.fieldD.a(buf, var6, 1860846228);
                        }

                        return var6;

                    } else {
                        throw new RuntimeException();
                    }
                }
            } else {
                throw new RuntimeException();
            }
        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "r.r(" + ')');
        }
    }

    static final void method176(int var0) {
        try {
            if (Npc.fieldNk != null) {
                Npc.fieldNk.r((byte) -102);
            }

            if (classDm.fieldNf != null) {
                if (var0 == -885093604) {
                    return;
                }

                classDm.fieldNf.r((byte) -29);
            }

        } catch (RuntimeException var1) {
            throw ClanMate.error(var1, "r.y(" + ')');
        }
    }
}
