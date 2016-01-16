package com.jagex;

public class classBo {

    static int[] fieldEs;
    public static ReferenceTableSub fieldAp;
    NodeTable fieldI = new NodeTable(256);
    ReferenceTable fieldA;
    NodeTable fieldB = new NodeTable(256);
    ReferenceTable fieldV;


    public classBo(ReferenceTable var1, ReferenceTable var2) {
        this.fieldA = var1;
        this.fieldV = var2;
    }

    public static NpcDefinition getNpcDefinition(int id, int DUMMY) {
        try {
            NpcDefinition var2 = (NpcDefinition) NpcDefinition.fieldI.get((long) id);
            if (var2 != null) {
                if (DUMMY <= 208910842) {
                    throw new IllegalStateException();
                } else {
                    return var2;
                }
            } else {
                byte[] var3 = NpcDefinition.fieldA.getFile(9, id, (short) 10483);
                var2 = new NpcDefinition();
                var2.id = 1976768179 * id;
                if (var3 != null) {
                    var2.b(new Buffer(var3), -1311682326);
                }

                var2.i((byte) 5);
                NpcDefinition.fieldI.put(var2, (long) id);
                return var2;
            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "bo.v(" + ')');
        }
    }

    classBl a(int var1, int var2, int[] var3, int var4) {
        try {
            int var5 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
            var5 |= var1 << 16;
            long var6 = (long) var5;
            classBl var8 = (classBl) this.fieldB.get(var6);
            if (null != var8) {
                return var8;
            } else {
                if (var3 != null) {
                    if (var4 >= 1161043068) {
                        throw new IllegalStateException();
                    }

                    if (var3[0] <= 0) {
                        if (var4 >= 1161043068) {
                            throw new IllegalStateException();
                        }

                        return null;
                    }
                }

                AudioEffect var9 = AudioEffect.get(this.fieldA, var1, var2);
                if (var9 == null) {
                    return null;
                } else {
                    var8 = var9.v();
                    this.fieldB.put(var8, var6);
                    if (var3 != null) {
                        if (var4 >= 1161043068) {
                            throw new IllegalStateException();
                        }

                        var3[0] -= var8.fieldV.length;
                    }

                    return var8;
                }
            }
        } catch (RuntimeException var10) {
            throw ClanMate.error(var10, "bo.a(" + ')');
        }
    }

    classBl v(int var1, int var2, int[] var3, int var4) {
        try {
            int var5 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
            var5 |= var1 << 16;
            long var6 = (long) var5 ^ 4294967296L;
            classBl var8 = (classBl) this.fieldB.get(var6);
            if (null != var8) {
                if (var4 != 1997416853) {
                    throw new IllegalStateException();
                } else {
                    return var8;
                }
            } else if (var3 != null && var3[0] <= 0) {
                if (var4 != 1997416853) {
                    throw new IllegalStateException();
                } else {
                    return null;
                }
            } else {
                classBc var9 = (classBc) this.fieldI.get(var6);
                if (var9 == null) {
                    if (var4 != 1997416853) {
                        throw new IllegalStateException();
                    }

                    var9 = classBc.method269(this.fieldV, var1, var2);
                    if (var9 == null) {
                        if (var4 != 1997416853) {
                            throw new IllegalStateException();
                        }

                        return null;
                    }

                    this.fieldI.put(var9, var6);
                }

                var8 = var9.s(var3);
                if (null == var8) {
                    return null;
                } else {
                    var9.delete();
                    this.fieldB.put(var8, var6);
                    return var8;
                }
            }
        } catch (RuntimeException var10) {
            throw ClanMate.error(var10, "bo.v(" + ')');
        }
    }

    public classBl b(int var1, int[] var2, int var3) {
        try {
            if (this.fieldV.getFileCount(2086810961) == 1) {
                if (var3 != 1396957121) {
                    throw new IllegalStateException();
                } else {
                    return this.v(0, var1, var2, 1997416853);
                }
            } else if (this.fieldV.getFileEntryCount(var1, (byte) 0) == 1) {
                if (var3 != 1396957121) {
                    throw new IllegalStateException();
                } else {
                    return this.v(var1, 0, var2, 1997416853);
                }
            } else {
                throw new RuntimeException();
            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "bo.b(" + ')');
        }
    }

    public classBl i(int var1, int[] var2, byte var3) {
        try {
            if (this.fieldA.getFileCount(1990017829) == 1) {
                if (var3 <= 0) {
                    throw new IllegalStateException();
                } else {
                    return this.a(0, var1, var2, -727456804);
                }
            } else if (this.fieldA.getFileEntryCount(var1, (byte) 0) == 1) {
                if (var3 <= 0) {
                    throw new IllegalStateException();
                } else {
                    return this.a(var1, 0, var2, -920731342);
                }
            } else {
                throw new RuntimeException();
            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "bo.i(" + ')');
        }
    }
}
