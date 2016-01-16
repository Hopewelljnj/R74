package com.jagex;

public class classEp extends classDa {

    static int[] fieldDf;
    static classDs fieldLi;
    static byte[][] fieldN;
    int fieldV = 1867468544;
    long fieldB = classDz.getFancyTime(1314142527) * -5223807680292560567L;
    int fieldL = 0;
    int fieldM;
    long[] fieldA = new long[10];
    int fieldI = -1755333147;


    classEp() {
        for (int var1 = 0; var1 < 10; ++var1) {
            this.fieldA[var1] = 2821246704223936761L * this.fieldB;
        }

    }

    static void addToItemTable(int tableKey, int len, int id, int quantity) {
        try {
            ItemTable table = (ItemTable) ItemTable.cache.get((long) tableKey);
            if (table == null) {
                table = new ItemTable();
                ItemTable.cache.put(table, (long) tableKey);
            }
            if (table.ids.length <= len) {
                int[] var6 = new int[1 + len];
                int[] var7 = new int[1 + len];
                int var8;
                for (var8 = 0; var8 < table.ids.length; ++var8) {
                    var6[var8] = table.ids[var8];
                    var7[var8] = table.quantities[var8];
                }
                for (var8 = table.ids.length; var8 < len; ++var8) {
                    var6[var8] = -1;
                    var7[var8] = 0;
                }
                table.ids = var6;
                table.quantities = var7;
            }
            table.ids[len] = id;
            table.quantities[len] = quantity;
        } catch (RuntimeException var9) {
            throw ClanMate.error(var9, "ep.i(" + ')');
        }
    }

    static final void method184(byte var0) {
        try {
            if (null != Client.socket) {
                Client.socket.stop(-694734675);
                Client.socket = null;
            }

            AnimationSequence.method411(2077409627);
            Client.landscape.clear();

            for (int var1 = 0; var1 < 4; ++var1) {
                if (var0 >= 0) {
                    return;
                }

                Client.collisionMaps[var1].a(358695889);
            }

            System.gc();
            UtilClass21.fieldL = -561749511;
            UtilClass21.fieldM = null;
            UtilClass35.fieldW = -1158645973;
            classDz.fieldE = 1105453967;
            ItemTable.fieldN = 0;
            UtilClass21.fieldK = false;
            UtilClass21.fieldS = 971689226;
            Client.fieldMx = 812653629;
            Client.fieldMv = false;
            TaskHandler.method278(-1749929480);
            UnknownEnum.method373(10, (byte) 5);
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "ep.h(" + ')');
        }
    }

    static final void method185(int var0) {
        try {
            for (int var1 = 0; var1 < Client.npcCount * 1825497683; ++var1) {
                if (var0 == -1642132820) {
                    throw new IllegalStateException();
                }

                int var2 = Client.npcIndices[var1];
                Npc var3 = Client.npcs[var2];
                if (var3 != null) {
                    Client.method208(var3, -450177113 * var3.definition.fieldW, (byte) 127);
                }
            }

        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "ep.ar(" + ')');
        }
    }

    @Override
    public void v(byte var1) {
        try {
            for (int var2 = 0; var2 < 10; ++var2) {
                if (var1 != 14) {
                    throw new IllegalStateException();
                }

                this.fieldA[var2] = 0L;
            }

        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "ep.v(" + ')');
        }
    }

    @Override
    int i(int var1, int var2, int var3) {
        try {
            int var4 = this.fieldV * -721393745;
            int var5 = this.fieldI * 792541165;
            this.fieldV = 1114697876;
            this.fieldI = -1755333147;
            this.fieldB = classDz.getFancyTime(223246388) * -5223807680292560567L;
            if (0L == this.fieldA[this.fieldM * 906676883]) {
                if (var3 <= -1507413030) {
                    throw new IllegalStateException();
                }

                this.fieldV = var4 * -798011569;
                this.fieldI = -1755333147 * var5;
            } else if (this.fieldB * 2821246704223936761L > this.fieldA[this.fieldM * 906676883]) {
                if (var3 <= -1507413030) {
                    throw new IllegalStateException();
                }

                this.fieldV = (int) ((long) (var1 * 2560) / (2821246704223936761L * this.fieldB - this.fieldA[this.fieldM * 906676883])) * -798011569;
            }

            if (this.fieldV * -721393745 < 25) {
                if (var3 <= -1507413030) {
                    throw new IllegalStateException();
                }

                this.fieldV = 1524547255;
            }

            if (this.fieldV * -721393745 > 256) {
                if (var3 <= -1507413030) {
                    throw new IllegalStateException();
                }

                this.fieldV = 1867468544;
                this.fieldI = -1755333147 * (int) ((long) var1 - (2821246704223936761L * this.fieldB - this.fieldA[this.fieldM * 906676883]) / 10L);
            }

            if (this.fieldI * 792541165 > var1) {
                if (var3 <= -1507413030) {
                    throw new IllegalStateException();
                }

                this.fieldI = -1755333147 * var1;
            }

            this.fieldA[this.fieldM * 906676883] = this.fieldB * 2821246704223936761L;
            this.fieldM = -1104288869 * ((this.fieldM * 906676883 + 1) % 10);
            int var6;
            if (this.fieldI * 792541165 > 1) {
                if (var3 <= -1507413030) {
                    throw new IllegalStateException();
                }

                for (var6 = 0; var6 < 10; ++var6) {
                    if (var3 <= -1507413030) {
                        throw new IllegalStateException();
                    }

                    if (this.fieldA[var6] != 0L) {
                        if (var3 <= -1507413030) {
                            throw new IllegalStateException();
                        }

                        this.fieldA[var6] += (long) (this.fieldI * 792541165);
                    }
                }
            }

            if (this.fieldI * 792541165 < var2) {
                if (var3 <= -1507413030) {
                    throw new IllegalStateException();
                }

                this.fieldI = -1755333147 * var2;
            }

            classCs.fancySleep((long) (this.fieldI * 792541165));

            for (var6 = 0; this.fieldL * -1257350729 < 256; this.fieldL += this.fieldV * -1313881655) {
                if (var3 <= -1507413030) {
                    throw new IllegalStateException();
                }

                ++var6;
            }

            this.fieldL = (this.fieldL * -1257350729 & 255) * 1748030471;
            return var6;
        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "ep.i(" + ')');
        }
    }
}
