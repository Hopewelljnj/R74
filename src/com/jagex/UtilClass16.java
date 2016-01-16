package com.jagex;

import java.io.*;
import java.lang.reflect.*;

public final class UtilClass16 {

    UtilClass16() throws Throwable {
        throw new Error();
    }

    public static String method56(long var0) {
        try {
            if (var0 > 0L && var0 < 6582952005840035281L) {
                if (0L == var0 % 37L) {
                    return null;
                } else {
                    int var2 = 0;

                    for (long var3 = var0; var3 != 0L; var3 /= 37L) {
                        ++var2;
                    }

                    StringBuilder var5;
                    char var8;
                    for (var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) {
                        long var6 = var0;
                        var0 /= 37L;
                        var8 = UtilClass36.fieldA[(int) (var6 - 37L * var0)];
                        if (95 == var8) {
                            int var9 = var5.length() - 1;
                            var5.setCharAt(var9, java.lang.Character.toUpperCase(var5.charAt(var9)));
                            var8 = 160;
                        }
                    }

                    var5.reverse();
                    var5.setCharAt(0, java.lang.Character.toUpperCase(var5.charAt(0)));
                    return var5.toString();
                }
            } else {
                return null;
            }
        } catch (RuntimeException var10) {
            throw ClanMate.error(var10, "eb.v(" + ')');
        }
    }

    public static void method57(Packet var0, int var1) {
        try {
            ClassStructure var2 = (ClassStructure) UtilClass31.classStructureIterable.next();
            if (null != var2) {
                int var3 = var0.caret * 651432265;
                var0.writeInt(var2.fieldA * -574130111);
                for (int var4 = 0; var4 < var2.count * -525874907; ++var4) {
                    if (0 != var2.fieldB[var4]) {
                        var0.writeByte(var2.fieldB[var4]);
                    } else {
                        try {
                            int var5 = var2.fieldI[var4];
                            Field var6;
                            int var7;
                            if (0 == var5) {
                                var6 = var2.fields[var4];
                                var7 = var6.getInt((Object) null);
                                var0.writeByte(0);
                                var0.writeInt(var7);
                            } else if (1 == var5) {
                                var6 = var2.fields[var4];
                                var6.setInt((Object) null, var2.fieldW[var4]);
                                var0.writeByte(0);
                            } else if (var5 == 2) {
                                var6 = var2.fields[var4];
                                var7 = var6.getModifiers();
                                var0.writeByte(0);
                                var0.writeInt(var7);
                            }
                            Method var24;
                            if (var5 == 3) {
                                var24 = var2.methods[var4];
                                byte[][] var25 = var2.args[var4];
                                Object[] var8 = new Object[var25.length];
                                for (int var9 = 0; var9 < var25.length; ++var9) {
                                    ObjectInputStream var10 = new ObjectInputStream(new ByteArrayInputStream(var25[var9]));
                                    var8[var9] = var10.readObject();
                                }
                                Object var26 = var24.invoke((Object) null, var8);
                                if (null == var26) {
                                    var0.writeByte(0);
                                } else if (var26 instanceof Number) {
                                    var0.writeByte(1);
                                    var0.l(((Number) var26).longValue());
                                } else if (var26 instanceof String) {
                                    var0.writeByte(2);
                                    var0.w((String) var26, (byte) 0);
                                } else {
                                    var0.writeByte(4);
                                }
                            } else if (4 == var5) {
                                var24 = var2.methods[var4];
                                var7 = var24.getModifiers();
                                var0.writeByte(0);
                                var0.writeInt(var7);
                            }
                        } catch (ClassNotFoundException var11) {
                            var0.writeByte(-10);
                        } catch (InvalidClassException var12) {
                            var0.writeByte(-11);
                        } catch (StreamCorruptedException var13) {
                            var0.writeByte(-12);
                        } catch (OptionalDataException var14) {
                            var0.writeByte(-13);
                        } catch (IllegalAccessException var15) {
                            var0.writeByte(-14);
                        } catch (IllegalArgumentException var16) {
                            var0.writeByte(-15);
                        } catch (InvocationTargetException var17) {
                            var0.writeByte(-16);
                        } catch (SecurityException var18) {
                            var0.writeByte(-17);
                        } catch (IOException var19) {
                            var0.writeByte(-18);
                        } catch (NullPointerException var20) {
                            var0.writeByte(-19);
                        } catch (Exception var21) {
                            var0.writeByte(-20);
                        } catch (Throwable var22) {
                            var0.writeByte(-21);
                        }
                    }
                }
                var0.writeCrc(var3, 2074328890);
                var2.delete();
            }
        } catch (RuntimeException var23) {
            throw ClanMate.error(var23, "eb.a(" + ')');
        }
    }

    public static void method58(ReferenceTable var0, int var1) {
        try {
            Varpbit.fieldA = var0;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "eb.a(" + ')');
        }
    }

    static final void method59(int var0) {
        try {
            for (int var1 = 0; var1 < Client.fieldHt * -839605007; ++var1) {
                if (var0 != -2143313583) {
                    throw new IllegalStateException();
                }

                int var2 = Client.fieldHm[var1];
                Npc var3 = Client.npcs[var2];
                int var4 = Client.packet.readUByte();
                int var5;
                if (0 != (var4 & 2)) {
                    if (var0 != -2143313583) {
                        throw new IllegalStateException();
                    }

                    var3.fieldBp = Client.packet.readUShort() * 1712363827;
                    var5 = Client.packet.readInt((byte) 0);
                    var3.fieldBr = -1148182407 * (var5 >> 16);
                    var3.fieldBz = (Client.engineCycle * -1223223371 + (var5 & '\uffff')) * 794364867;
                    var3.fieldBw = 0;
                    var3.fieldBm = 0;
                    if (var3.fieldBz * 1643494635 > Client.engineCycle * -1223223371) {
                        var3.fieldBw = -966935865;
                    }

                    if (var3.fieldBp * -1404237317 == '\uffff') {
                        if (var0 != -2143313583) {
                            throw new IllegalStateException();
                        }

                        var3.fieldBp = -1712363827;
                    }
                }

                int var6;
                if ((var4 & 4) != 0) {
                    label171:
                    {
                        var5 = Client.packet.ab(2015483783);
                        if (var5 == '\uffff') {
                            if (var0 != -2143313583) {
                                return;
                            }

                            var5 = -1;
                        }

                        var6 = Client.packet.aw((byte) 7);
                        if (var5 == var3.animation * -433706235) {
                            if (var0 != -2143313583) {
                                throw new IllegalStateException();
                            }

                            if (var5 != -1) {
                                if (var0 != -2143313583) {
                                    return;
                                }

                                int var7 = AnimationSequence.get(var5, 663723798).fieldU * 888956053;
                                if (1 == var7) {
                                    if (var0 != -2143313583) {
                                        return;
                                    }

                                    var3.fieldBo = 0;
                                    var3.fieldBi = 0;
                                    var3.animationDelay = 229151739 * var6;
                                    var3.fieldBl = 0;
                                }

                                if (var7 == 2) {
                                    if (var0 != -2143313583) {
                                        throw new IllegalStateException();
                                    }

                                    var3.fieldBl = 0;
                                }
                                break label171;
                            }
                        }

                        if (var5 != -1) {
                            if (var0 != -2143313583) {
                                throw new IllegalStateException();
                            }

                            if (-1 != var3.animation * -433706235) {
                                if (var0 != -2143313583) {
                                    throw new IllegalStateException();
                                }

                                if (AnimationSequence.get(var5, 1633806278).fieldD * 1901528491 < AnimationSequence.get(var3.animation * -433706235, -1572591865).fieldD * 1901528491) {
                                    break label171;
                                }

                                if (var0 != -2143313583) {
                                    return;
                                }
                            }
                        }

                        var3.animation = -1079449139 * var5;
                        var3.fieldBo = 0;
                        var3.fieldBi = 0;
                        var3.animationDelay = var6 * 229151739;
                        var3.fieldBl = 0;
                        var3.fieldCt = var3.queueSize * 1571161601;
                    }
                }

                if (0 != (var4 & 32)) {
                    if (var0 != -2143313583) {
                        return;
                    }

                    var3.definition = classBo.getNpcDefinition(Client.packet.ap(), 1937219186);
                    var3.fieldZ = -1071812819 * var3.definition.fieldW;
                    var3.rotation = -1813489879 * var3.definition.fieldAr;
                    var3.fieldAh = var3.definition.fieldD * 1480332531;
                    var3.fieldAr = var3.definition.fieldX * -1576917557;
                    var3.fieldAe = -1671059465 * var3.definition.fieldO;
                    var3.fieldAv = 1744558285 * var3.definition.fieldQ;
                    var3.fieldC = var3.definition.fieldS * 1621553521;
                    var3.fieldAn = 372403091 * var3.definition.fieldK;
                    var3.fieldAs = var3.definition.fieldF * 774167835;
                }

                if ((var4 & 8) != 0) {
                    if (var0 != -2143313583) {
                        throw new IllegalStateException();
                    }

                    var5 = Client.packet.readUByte();
                    var6 = Client.packet.readUByte();
                    var3.registerHit(var5, var6, Client.engineCycle * -1223223371, -884419711);
                    var3.healthBarCycle = 1201629052 + Client.engineCycle * 1859706401;
                    var3.health = Client.packet.readUShort() * -1198485193;
                    var3.maxHealth = Client.packet.ap() * 309829455;
                }

                if ((var4 & 128) != 0) {
                    var3.targetIndex = Client.packet.ap() * 2015474651;
                    if (var3.targetIndex * -1206972333 == '\uffff') {
                        var3.targetIndex = -2015474651;
                    }
                }

                if ((var4 & 16) != 0) {
                    var3.fieldAf = Client.packet.ac((byte) 43) * 1722699207;
                    var3.fieldAb = Client.packet.ac((byte) 84) * -1312598379;
                }

                if (0 != (var4 & 1)) {
                    if (var0 != -2143313583) {
                        throw new IllegalStateException();
                    }

                    var5 = Client.packet.readInvertedUByte((byte) 0);
                    var6 = Client.packet.readUByte();
                    var3.registerHit(var5, var6, Client.engineCycle * -1223223371, -1956910325);
                    var3.healthBarCycle = 1201629052 + Client.engineCycle * 1859706401;
                    var3.health = Client.packet.ap() * -1198485193;
                    var3.maxHealth = Client.packet.ab(1720818323) * 309829455;
                }

                if ((var4 & 64) != 0) {
                    var3.overheadText = Client.packet.readString(1439966632);
                    var3.fieldAz = -1796329884;
                }
            }

        } catch (RuntimeException var8) {
            throw ClanMate.error(var8, "eb.br(" + ')');
        }
    }
}
