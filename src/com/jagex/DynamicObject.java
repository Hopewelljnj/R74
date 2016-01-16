package com.jagex;

import java.awt.*;
import java.io.*;

public class DynamicObject extends Renderable {

    static CompressedImage[] worldSelectorArrows;
    static byte[][] fieldDk;
    static int fieldBd;
    int fieldL;
    int fieldV;
    int fieldI;
    int cycle;
    AnimationSequence sequence;
    int fieldE;
    int fieldM;
    int fieldA;
    int fieldB;


    DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Renderable var9) {
        this.fieldA = -1862197825 * var1;
        this.fieldV = 1951715283 * var2;
        this.fieldI = var3 * -1436157935;
        this.fieldB = 2076509429 * var4;
        this.fieldL = 1637647001 * var5;
        this.fieldM = 224589007 * var6;
        if (var7 != -1) {
            this.sequence = AnimationSequence.get(var7, -1665806075);
            this.fieldE = 0;
            this.cycle = Client.engineCycle * -911169251 - -31302455;
            if (888956053 * this.sequence.fieldU == 0 && var9 != null && var9 instanceof DynamicObject) {
                DynamicObject var10 = (DynamicObject) var9;
                if (this.sequence == var10.sequence) {
                    this.fieldE = 1 * var10.fieldE;
                    this.cycle = var10.cycle * 1;
                    return;
                }
            }

            if (var8 && -1307272215 * this.sequence.fieldS != -1) {
                this.fieldE = (int) (Math.random() * (double) this.sequence.fieldM.length) * 1657668353;
                this.cycle -= (int) (Math.random() * (double) this.sequence.fieldE[this.fieldE * 1446706433]) * -31302455;
            }
        }
    }

    static final void updatePlayer(int index, Player player, int flags, int dummy) {
        try {
            int var4;
            if ((flags & 0x10) != 0) {
                var4 = Client.packet.readInvertedUByte((byte) 0);
                byte[] var5 = new byte[var4];
                Buffer var6 = new Buffer(var5);
                Client.packet.read(var5, 0, var4, 1997945954);
                Client.playerBuffers[index] = var6;
                player.read(var6, -1225537876);
            }

            if ((flags & 0x80) != 0) {
                player.targetIndex = Client.packet.ac((byte) 56) * 2015474651;
                if (player.targetIndex * -1206972333 == '\uffff') {
                    player.targetIndex = -2015474651;
                }
            }

            if ((flags & 0x1) != 0) {
                player.fieldAf = Client.packet.ap() * 1722699207;
                player.fieldAb = Client.packet.readUShort() * -1312598379;
            }

            int var16;
            if ((flags & 0x4) != 0) {
                var4 = Client.packet.readUShort();
                var16 = Client.packet.ao((byte) 75);
                player.registerHit(var4, var16, Client.engineCycle * -1223223371, 259182187);
                player.healthBarCycle = 1201629052 + Client.engineCycle * 1859706401;
                player.health = Client.packet.readUByte() * -1198485193;
                player.maxHealth = Client.packet.readInvertedUByte((byte) 0) * 309829455;
            }

            if ((flags & 0x200) != 0) {
                var4 = Client.packet.ap();
                var16 = Client.packet.aw((byte) 7);
                player.registerHit(var4, var16, Client.engineCycle * -1223223371, -568209532);
                player.healthBarCycle = 1201629052 + Client.engineCycle * 1859706401;
                player.health = Client.packet.ao((byte) 86) * -1198485193;
                player.maxHealth = Client.packet.aw((byte) 7) * 309829455;
            }

            if ((flags & 0x40) != 0) {
                player.overheadText = Client.packet.readString(432711714);
                if (player.overheadText.charAt(0) == 126) {
                    player.overheadText = player.overheadText.substring(1);
                    JagSocket.addMessage(2, player.name, player.overheadText, (byte) 16);
                } else if (player == Client.myPlayer) {
                    JagSocket.addMessage(2, player.name, player.overheadText, (byte) 16);
                }
                player.fieldAm = false;
                player.fieldAi = 0;
                player.fieldAa = 0;
                player.fieldAz = -547011178;
            }

            if ((flags & 0x400) != 0) {
                player.fieldBe = Client.packet.ao((byte) 108) * -1665532031;
                player.fieldBc = Client.packet.ao((byte) 34) * 692803995;
                player.fieldBb = Client.packet.aw((byte) 7) * 19885597;
                player.fieldBk = Client.packet.ao((byte) 105) * -1120853325;
                player.fieldBf = (Client.packet.readUShort() + Client.engineCycle * -1223223371) * 1271855895;
                player.fieldBg = (Client.packet.readUShort() + Client.engineCycle * -1223223371) * -1734719039;
                player.fieldBt = Client.packet.readUByte() * 1262183549;
                player.queueSize = -927674979;
                player.fieldCt = 0;
            }

            if ((flags & 0x100) != 0) {
                player.fieldBp = Client.packet.ab(1437321420) * 1712363827;
                var4 = Client.packet.bl(-1370254784);
                player.fieldBr = -1148182407 * (var4 >> 16);
                player.fieldBz = 794364867 * ((var4 & '\uffff') + Client.engineCycle * -1223223371);
                player.fieldBw = 0;
                player.fieldBm = 0;
                if (player.fieldBz * 1643494635 > Client.engineCycle * -1223223371) {
                    player.fieldBw = -966935865;
                }
                if ('\uffff' == player.fieldBp * -1404237317) {
                    player.fieldBp = -1712363827;
                }
            }

            if ((flags & 0x8) != 0) {
                var4 = Client.packet.ac((byte) 84);
                UnknownEnum2 var17 = Preferences.ValueOf(UnknownEnum3.getEnum2Values(2138350206), Client.packet.ao((byte) 19), 466615625);
                boolean var10000 = Client.packet.aw((byte) 7) == 1;
                int var7 = Client.packet.readUByte();
                int var8 = Client.packet.caret * 651432265;
                if (player.name != null && player.cfg != null) {
                    boolean var9 = false;
                    if (var17.fieldN && UtilClass1.isIgnored(player.name, -435132378)) {
                        var9 = true;
                    }

                    if (!var9 && 0 == Client.fieldGs * -1672251869 && !player.hidden) {
                        String var10;
                        boolean var10001;
                        label228:
                        {
                            Client.fieldAa.caret = 0;
                            Client.packet.read(Client.fieldAa.payload, 0, var7, 1967871236);
                            Client.fieldAa.caret = 0;
                            var10 = classGs.method32(ExchangeOfferTimeComparator.method26(ObjectDefinition.method358(Client.fieldAa, 813726960), -377200329));
                            player.overheadText = var10.trim();
                            player.fieldAi = -98561303 * (var4 >> 8);
                            player.fieldAa = 1482041193 * (var4 & 255);
                            player.fieldAz = -547011178;
                            player.fieldAm = var10000;
                            if (Client.myPlayer != player && var17.fieldN && "" != Client.fieldLn) {
                                if (var10.toLowerCase().indexOf(Client.fieldLn) == -1) {
                                    var10001 = true;
                                    break label228;
                                }
                            }
                            var10001 = false;
                        }

                        player.fieldAx = var10001;
                        byte var11;
                        byte var19;
                        if (var17.fieldE) {
                            var19 = (byte) (var10000 ? 91 : 1);
                            var11 = var19;
                        } else {
                            var19 = (byte) (var10000 ? 90 : 2);
                            var11 = var19;
                        }

                        if (-1 != var17.fieldW * 1736764383) {
                            int var14 = var17.fieldW * 1736764383;
                            String var13 = "<img=" + var14 + ">";
                            JagSocket.addMessage(var11, var13 + player.name, var10, (byte) 16);
                        } else {
                            JagSocket.addMessage(var11, player.name, var10, (byte) 16);
                        }
                    }
                }

                Client.packet.caret = -99503879 * (var7 + var8);
            }

            if ((flags & 0x2) != 0) {
                var4 = Client.packet.ac((byte) 21);
                if (var4 == '\uffff') {
                    var4 = -1;
                }
                var16 = Client.packet.readUByte();
                ItemTable.method203(player, var4, var16, 1252284258);
            }
        } catch (RuntimeException var15) {
            throw ClanMate.error(var15, "k.bw(" + ')');
        }
    }

    public static CompressedImage method137(ReferenceTable var0, String var1, String var2, int var3) {
        try {
            int var4 = var0.h(var1, 1049523582);
            int var5 = var0.u(var4, var2, -1174997574);
            return classCm.method326(var0, var4, var5, (byte) -88);
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "k.m(" + ')');
        }
    }

    static String method138(int var0, byte var1) {
        try {
            if (Client.menuNouns[var0].length() > 0) {
                if (var1 != -13) {
                    throw new IllegalStateException();
                } else {
                    return Client.menuOptions[var0] + StringConstants.fieldFo + Client.menuNouns[var0];
                }
            } else {
                return Client.menuOptions[var0];
            }
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "k.ct(" + ')');
        }
    }

    static String method139(Throwable var0, int var1) throws IOException {
        try {
            String var2;
            if (var0 instanceof RSException) {
                if (var1 != -1069846553) {
                    throw new IllegalStateException();
                }

                RSException var3 = (RSException) var0;
                var2 = var3.fieldB + " | ";
                var0 = var3.fieldL;
            } else {
                var2 = "";
            }

            StringWriter var14 = new StringWriter();
            PrintWriter var4 = new PrintWriter(var14);
            var0.printStackTrace(var4);
            var4.close();
            String var5 = var14.toString();
            BufferedReader var6 = new BufferedReader(new StringReader(var5));
            String var7 = var6.readLine();

            while (true) {
                String var8 = var6.readLine();
                if (null == var8) {
                    if (var1 != -1069846553) {
                        throw new IllegalStateException();
                    }

                    var2 = var2 + "| " + var7;
                    return var2;
                }

                int var9 = var8.indexOf(40);
                int var10 = var8.indexOf(41, 1 + var9);
                if (var9 >= 0) {
                    if (var1 != -1069846553) {
                        throw new IllegalStateException();
                    }

                    if (var10 >= 0) {
                        if (var1 != -1069846553) {
                            throw new IllegalStateException();
                        }

                        String var11 = var8.substring(1 + var9, var10);
                        int var12 = var11.indexOf(".java:");
                        if (var12 >= 0) {
                            var11 = var11.substring(0, var12) + var11.substring(5 + var12);
                            var2 = var2 + var11 + ' ';
                            continue;
                        }

                        var8 = var8.substring(0, var9);
                    }
                }

                var8 = var8.trim();
                var8 = var8.substring(var8.lastIndexOf(32) + 1);
                var8 = var8.substring(var8.lastIndexOf(9) + 1);
                var2 = var2 + var8 + ' ';
            }
        } catch (RuntimeException var13) {
            throw ClanMate.error(var13, "k.i(" + ')');
        }
    }

    @Override
    protected final Model getModel(int var1) {
        try {
            if (null != this.sequence) {
                if (var1 >= -1519654467) {
                    throw new IllegalStateException();
                }

                int var2 = Client.engineCycle * -1223223371 - this.cycle * 617905529;
                if (var2 > 100) {
                    if (var1 >= -1519654467) {
                        throw new IllegalStateException();
                    }

                    if (this.sequence.fieldS * -1307272215 > 0) {
                        if (var1 >= -1519654467) {
                            throw new IllegalStateException();
                        }

                        var2 = 100;
                    }
                }

                while (var2 > this.sequence.fieldE[this.fieldE * 1446706433]) {
                    if (var1 >= -1519654467) {
                        throw new IllegalStateException();
                    }

                    var2 -= this.sequence.fieldE[this.fieldE * 1446706433];
                    this.fieldE += 1657668353;
                    if (this.fieldE * 1446706433 >= this.sequence.fieldM.length) {
                        if (var1 >= -1519654467) {
                            throw new IllegalStateException();
                        }

                        this.fieldE -= this.sequence.fieldS * -1754900759;
                        if (this.fieldE * 1446706433 >= 0) {
                            if (this.fieldE * 1446706433 < this.sequence.fieldM.length) {
                                continue;
                            }

                            if (var1 >= -1519654467) {
                                throw new IllegalStateException();
                            }
                        }

                        this.sequence = null;
                        break;
                    }
                }

                this.cycle = -31302455 * (Client.engineCycle * -1223223371 - var2);
            }

            ObjectDefinition var14 = PlayerConfig.getObjectDef(this.fieldA * 1148047935, 1913332028);


            if (var14.transformIds != null) {
                if (var1 >= -1519654467) {
                    throw new IllegalStateException();
                }

                var14 = var14.transform(1106931628);
            }


           /* if(var14.name.equals("Cogs")) {
                System.out.println("ye");
            }*/


            if (var14 == null) {
                if (var1 >= -1519654467) {
                    throw new IllegalStateException();
                } else {
                    return null;
                }
            } else {
                int var3;
                int var4;
                label77:
                {
                    if (this.fieldI * 463599857 != 1) {
                        if (this.fieldI * 463599857 != 3) {
                            var3 = var14.sizeX * -1151280759;
                            var4 = var14.sizeY * -1255940743;
                            break label77;
                        }

                        if (var1 >= -1519654467) {
                            throw new IllegalStateException();
                        }
                    }

                    var3 = var14.sizeY * -1255940743;
                    var4 = var14.sizeX * -1151280759;
                }

                int var5 = (var3 >> 1) + this.fieldL * -1011699287;
                int var6 = (1 + var3 >> 1) + this.fieldL * -1011699287;
                int var7 = this.fieldM * 1561956911 + (var4 >> 1);
                int var8 = (var4 + 1 >> 1) + this.fieldM * 1561956911;
                int[][] var9 = classM.tileHeights[this.fieldB * -1299151011];
                int var10 = var9[var5][var8] + var9[var6][var7] + var9[var5][var7] + var9[var6][var8] >> 2;
                int var11 = (var3 << 6) + (this.fieldL * -1011699287 << 7);
                int var12 = (this.fieldM * 1561956911 << 7) + (var4 << 6);
                Model m = var14.s(this.fieldV * -527867813, this.fieldI * 463599857, var9, var11, var10, var12, this.sequence, this.fieldE * 1446706433, 1918502288);

                m.forceColor = true;
                m.color = Color.RED.getRGB();

                return m;
            }
        } catch (RuntimeException var13) {
            throw ClanMate.error(var13, "k.v(" + ')');
        }
    }
}
