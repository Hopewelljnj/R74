package com.jagex;

public final class Projectile extends Renderable {

    public static classBq fieldPt;
    static Preferences preferences;
    static MenuItem menuItem;
    static Sprite fieldEi;
    int fieldI;
    int animationId;
    double fieldJ;
    int fieldL;
    int fieldR = 0;
    int fieldW;
    int fieldE;
    int fieldN;
    int fieldS;
    int fieldB;
    boolean fieldF = false;
    double fieldD;
    double fieldO;
    AnimationSequence fieldP;
    double fieldH;
    double fieldU;
    int fieldK;
    int fieldG;
    int fieldY;
    double fieldX;
    int fieldZ = 0;
    int fieldV;
    double fieldQ;
    double fieldT;
    int fieldM;


    Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
        this.animationId = -114155795 * var1;
        this.fieldV = var2 * 437466531;
        this.fieldI = -1222158271 * var3;
        this.fieldB = -1062992535 * var4;
        this.fieldL = -325847209 * var5;
        this.fieldW = 1066872865 * var6;
        this.fieldE = 793981571 * var7;
        this.fieldN = -445503637 * var8;
        this.fieldS = 1808829373 * var9;
        this.fieldK = var10 * -968163771;
        this.fieldM = 741402553 * var11;
        this.fieldF = false;
        int var12 = TilePaint.getAnimation(this.animationId * -1143804187, 781696960).sequenceId * 1259888421;
        if (-1 != var12) {
            this.fieldP = AnimationSequence.get(var12, 2105998378);
        } else {
            this.fieldP = null;
        }

    }

    static final String method153(int var0, int var1) {
        try {
            if (var0 < 999999999) {
                return Integer.toString(var0);
            } else {
                return "*";
            }
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "w.ch(" + ')');
        }
    }

    static final void spawnObjectLater(int floor, int regionX, int regionY, int stubType, int objectId, int objectType, int objectRot, int delay, int life, byte DUMMY) {
        try {
            LandscapeMod var10 = null;
            ObjectDefinition def = PlayerConfig.getObjectDef(objectId, -728879184);
            System.out.println("Spawn Later(delay=" + delay + ",life=" + life + "):[name=" + def.name + ",stub-type=" + stubType + ",object-type=" + objectType + ",floor=" + floor + ",x=" + regionX + ",y=" + regionY + "]");
            for (LandscapeMod var11 = (LandscapeMod) Client.landscapeModDeque.next(); null != var11; var11 = (LandscapeMod) Client.landscapeModDeque.tail()) {
                if (var11.floor * -94243731 == floor && regionX == var11.regionX * -567016967 && regionY == var11.regionY * 29917975) {
                    if (var11.objectStubType * -1927249751 == stubType) {
                        var10 = var11;
                        break;
                    }
                }
            }

            if (var10 == null) {
                var10 = new LandscapeMod();
                var10.floor = 1455437157 * floor;
                var10.objectStubType = stubType * -1214504039;
                var10.regionX = regionX * 543354953;
                var10.regionY = 962520231 * regionY;
                LandscapeTile.updateStubMod(var10, (byte) 62);
                Client.landscapeModDeque.add(var10);
            }

            var10.curObjectId = -1938060061 * objectId;
            var10.curObjectType = 1792166835 * objectType;
            var10.curObjectRot = objectRot * 455897967;
            var10.spawnDelay = delay * 1001235749;
            var10.spawnLife = life * -928555045;
        } catch (RuntimeException var12) {
            var12.printStackTrace();
            throw ClanMate.error(var12, "w.ap(" + ')');
        }
    }

    static void method156(int var0, String var1, int var2) {
        try {
            boolean var3 = false;

            for (int var4 = 0; var4 < Client.playerCount * 16022533; ++var4) {
                if (var2 <= 1370772398) {
                    return;
                }

                Player var5 = Client.players[Client.playerIndicies[var4]];
                if (null != var5 && var5.name != null) {
                    if (var2 <= 1370772398) {
                        throw new IllegalStateException();
                    }

                    if (var5.name.equalsIgnoreCase(var1)) {
                        if (var2 <= 1370772398) {
                            throw new IllegalStateException();
                        }

                        if (1 == var0) {
                            if (var2 <= 1370772398) {
                                throw new IllegalStateException();
                            }

                            Client.fieldCo.writePacketHeader(85, (byte) 0);
                            Client.fieldCo.aa(0, (byte) 44);
                            Client.fieldCo.af(Client.playerIndicies[var4]);
                        } else if (var0 == 4) {
                            if (var2 <= 1370772398) {
                                throw new IllegalStateException();
                            }

                            Client.fieldCo.writePacketHeader(189, (byte) 0);
                            Client.fieldCo.writeByte(0);
                            Client.fieldCo.writeShort(Client.playerIndicies[var4]);
                        } else if (6 == var0) {
                            if (var2 <= 1370772398) {
                                throw new IllegalStateException();
                            }

                            Client.fieldCo.writePacketHeader(118, (byte) 0);
                            Client.fieldCo.ak(Client.playerIndicies[var4], 1078918573);
                            Client.fieldCo.aa(0, (byte) 33);
                        } else if (7 == var0) {
                            if (var2 <= 1370772398) {
                                throw new IllegalStateException();
                            }

                            Client.fieldCo.writePacketHeader(69, (byte) 0);
                            Client.fieldCo.ak(Client.playerIndicies[var4], 1078918573);
                            Client.fieldCo.ai(0, -1132627572);
                        }

                        var3 = true;
                        break;
                    }
                }
            }

            if (!var3) {
                if (var2 <= 1370772398) {
                    throw new IllegalStateException();
                }

                JagSocket.addMessage(4, "", StringConstants.fieldEd + var1, (byte) 16);
            }

        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "w.ba(" + ')');
        }
    }

    final void a(int var1, int var2, int var3, int var4, int var5) {
        try {
            double var6;
            if (!this.fieldF) {
                if (var5 != 1303475738) {
                    throw new IllegalStateException();
                }

                var6 = (double) (var1 - this.fieldI * -79644735);
                double var8 = (double) (var2 - this.fieldB * 1845287641);
                double var10 = Math.sqrt(var8 * var8 + var6 * var6);
                this.fieldD = (double) (this.fieldS * 898008981) * var6 / var10 + (double) (this.fieldI * -79644735);
                this.fieldX = (double) (this.fieldB * 1845287641) + (double) (this.fieldS * 898008981) * var8 / var10;
                this.fieldO = (double) (this.fieldL * 1115874407);
            }

            var6 = (double) (1 + this.fieldE * 1858612267 - var4);
            this.fieldQ = ((double) var1 - this.fieldD) / var6;
            this.fieldT = ((double) var2 - this.fieldX) / var6;
            this.fieldH = Math.sqrt(this.fieldQ * this.fieldQ + this.fieldT * this.fieldT);
            if (!this.fieldF) {
                if (var5 != 1303475738) {
                    throw new IllegalStateException();
                }

                this.fieldU = -this.fieldH * Math.tan(0.02454369D * (double) (this.fieldN * -2089956029));
            }

            this.fieldJ = ((double) var3 - this.fieldO - this.fieldU * var6) * 2.0D / (var6 * var6);
        } catch (RuntimeException var12) {
            throw ClanMate.error(var12, "w.a(" + ')');
        }
    }

    final void i(int var1, byte var2) {
        try {
            this.fieldF = true;
            this.fieldD += this.fieldQ * (double) var1;
            this.fieldX += (double) var1 * this.fieldT;
            this.fieldO += (double) var1 * this.fieldJ * 0.5D * (double) var1 + this.fieldU * (double) var1;
            this.fieldU += this.fieldJ * (double) var1;
            this.fieldG = ((int) (Math.atan2(this.fieldQ, this.fieldT) * 325.949D) + 1024 & 2047) * 831290723;
            this.fieldY = ((int) (Math.atan2(this.fieldU, this.fieldH) * 325.949D) & 2047) * -1349865573;
            if (null != this.fieldP) {
                if (var2 != 0) {
                    throw new IllegalStateException();
                }

                this.fieldZ += var1 * -712465373;

                while (this.fieldZ * 153037707 > this.fieldP.fieldE[this.fieldR * 1081363009]) {
                    if (var2 != 0) {
                        throw new IllegalStateException();
                    }

                    this.fieldZ -= -712465373 * this.fieldP.fieldE[this.fieldR * 1081363009];
                    this.fieldR += 1060160961;
                    if (this.fieldR * 1081363009 >= this.fieldP.fieldM.length) {
                        if (var2 != 0) {
                            throw new IllegalStateException();
                        }

                        this.fieldR -= -1338779735 * this.fieldP.fieldS;
                        if (this.fieldR * 1081363009 >= 0) {
                            if (var2 != 0) {
                                throw new IllegalStateException();
                            }

                            if (this.fieldR * 1081363009 < this.fieldP.fieldM.length) {
                                continue;
                            }
                        }

                        this.fieldR = 0;
                    }
                }
            }

        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "w.i(" + ')');
        }
    }

    @Override
    protected final Model getModel(int var1) {
        try {
            Animation var2 = TilePaint.getAnimation(this.animationId * -1143804187, -277688073);
            Model var3 = var2.l(this.fieldR * 1081363009, 843552687);
            if (null == var3) {
                if (var1 >= -1519654467) {
                    throw new IllegalStateException();
                } else {
                    return null;
                }
            } else {
                var3.q(this.fieldY * -143974765);
                return var3;
            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "w.v(" + ')');
        }
    }
}
