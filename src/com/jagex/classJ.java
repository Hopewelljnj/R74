package com.jagex;

import java.util.Comparator;

final class classJ implements Comparator {

    static int fieldDc;
    static int[] fieldZ;
    static boolean fieldA;
    // $FF: synthetic field
    final boolean fieldVal$preferOwnWorld;


    classJ(boolean var1) {
        this.fieldVal$preferOwnWorld = var1;
    }

    static String method134(String var0, Widget var1, int var2) {
        try {
            if (var0.indexOf("%") != -1) {
                int var3;
                for (var3 = 1; var3 <= 5; ++var3) {
                    while (true) {
                        int var4 = var0.indexOf("%" + var3);
                        if (var4 == -1) {
                            break;
                        }
                        var0 = var0.substring(0, var4) + Projectile.method153(ReferenceTableSub.method105(var1, var3 - 1, (byte) 4), 1241801348) + var0.substring(2 + var4);
                    }
                }

                while (true) {
                    var3 = var0.indexOf("%dns");
                    if (-1 == var3) {
                        break;
                    }

                    String var6 = "";
                    if (null != UtilClass0.fieldAt) {
                        var6 = UtilClass14.method52(UtilClass0.fieldAt.intArg, 1413350465);
                        if (null != UtilClass0.fieldAt.result) {
                            var6 = (String) UtilClass0.fieldAt.result;
                        }
                    }

                    var0 = var0.substring(0, var3) + var6 + var0.substring(4 + var3);
                }
            }

            return var0;
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "j.cj(" + ')');
        }
    }

    static final void method135(int var0, int var1, int var2, int var3, int DUMMY) {
        try {
            if (Client.itemSelectionStatus * 279939385 == 0 && !Client.isSpellSelected) {
                ItemPile.insertMenuAction(StringConstants.walkHere, "", 23, 0, var0 - var2, var1 - var3);
            }

            int var5 = -1;
            int previousUid = -1;

            int var7;
            int uid;
            for (var7 = 0; var7 < Model.totalHoveredUids; ++var7) {
                uid = Model.hoveredUids[var7];
                int regionX = uid & 127;
                int regionY = uid >> 7 & 127;
                int entityType = uid >> 29 & 3;
                int entityID = uid >> 14 & 32767;
                if (uid != previousUid) {
                    previousUid = uid;
                    if (entityType == 2) { //Object
                        if (Client.landscape.configForUid(Client.floorLevel * 87713183, regionX, regionY, uid) >= 0) {
                            ObjectDefinition var13 = PlayerConfig.getObjectDef(entityID, -454470654);
/*
                            if(var13.animationId * 1563734127 != -1) {
                                System.out.println(var13.name + "==" + var13.animationId * 1563734127);
                            }*/

                            if (var13.transformIds != null) {
                                var13 = var13.transform(1106931628);
                            }
                            if (var13 == null) {
                                continue;
                            }
                            if (1 == Client.itemSelectionStatus * 279939385) {
                                ItemPile.insertMenuAction(StringConstants.fieldEk, Client.fieldIt + " " + UtilClass41.fieldM + " " + Buffer.getColorTags('\uffff', 545291822) + var13.name, 1, uid, regionX, regionY);
                            } else if (Client.isSpellSelected) {
                                if (4 == (UtilClass40.selectedSpellTargetFlags * 1512402281 & 4)) {
                                    ItemPile.insertMenuAction(Client.spellAction, Client.fieldJc + " " + UtilClass41.fieldM + " " + Buffer.getColorTags('\uffff', 132437687) + var13.name, 2, uid, regionX, regionY);
                                }
                            } else {
                                String[] var14 = var13.actions;
                                if (Client.fieldJo) {
                                    var14 = UtilClass24.method3(var14, -979489200);
                                }
                                if (var14 != null) {
                                    for (int var15 = 4; var15 >= 0; --var15) {
                                        if (null != var14[var15]) {
                                            short var16 = 0;
                                            if (var15 == 0) {
                                                var16 = 3;
                                            }
                                            if (1 == var15) {
                                                var16 = 4;
                                            }
                                            if (var15 == 2) {
                                                var16 = 5;
                                            }
                                            if (3 == var15) {
                                                var16 = 6;
                                            }
                                            if (4 == var15) {
                                                var16 = 1001;
                                            }
                                            ItemPile.insertMenuAction(var14[var15], Buffer.getColorTags('\uffff', 1264768067) + var13.name, var16, uid, regionX, regionY);
                                        }
                                    }
                                }
                                ItemPile.insertMenuAction(StringConstants.EXAMINE, Buffer.getColorTags('\uffff', 739096327) + var13.name, 1002, var13.id * -1697158621 << 14, regionX, regionY);
                            }
                        }
                    }

                    int var24;
                    Npc var25;
                    Player var26;
                    if (1 == entityType) { //Npc
                        Npc var21 = Client.npcs[entityID];
                        if (var21 == null) {

                            continue;
                        }

                        if (-450177113 * var21.definition.fieldW == 1) {


                            if (64 == (var21.strictX * 404428603 & 127)) {

                                if (64 == (var21.strictY * -1490664571 & 127)) {


                                    for (var24 = 0; var24 < Client.npcCount * 1825497683; ++var24) {


                                        var25 = Client.npcs[Client.npcIndices[var24]];
                                        if (var25 != null) {


                                            if (var21 != var25) {

                                                if (1 == var25.definition.fieldW * -450177113) {


                                                    if (var21.strictX * 404428603 == var25.strictX * 404428603) {


                                                        if (var25.strictY * -1490664571 == var21.strictY * -1490664571) {


                                                            classFy.buildNpcActions(var25.definition, Client.npcIndices[var24], regionX, regionY, 2029842241);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }

                                    for (var24 = 0; var24 < Client.playerCount * 16022533; ++var24) {
                                        var26 = Client.players[Client.playerIndicies[var24]];
                                        if (var26 != null) {


                                            if (var26.strictX * 404428603 == var21.strictX * 404428603 && var26.strictY * -1490664571 == var21.strictY * -1490664571) {
                                                Varp.method393(var26, Client.playerIndicies[var24], regionX, regionY, 1042155341);
                                            }
                                        }
                                    }
                                }
                            }
                        }

                        classFy.buildNpcActions(var21.definition, entityID, regionX, regionY, 1807024346);
                    }

                    if (0 == entityType) { //Player
                        if (DUMMY == -1956490611) {
                            throw new IllegalStateException();
                        }

                        Player var22 = Client.players[entityID];
                        if (null == var22) {
                            if (DUMMY == -1956490611) {
                                throw new IllegalStateException();
                            }
                            continue;
                        }

                        if (64 == (var22.strictX * 404428603 & 127) && (var22.strictY * -1490664571 & 127) == 64) {
                            for (var24 = 0; var24 < Client.npcCount * 1825497683; ++var24) {
                                var25 = Client.npcs[Client.npcIndices[var24]];
                                if (null != var25) {
                                    if (DUMMY == -1956490611) {
                                        throw new IllegalStateException();
                                    }

                                    if (-450177113 * var25.definition.fieldW == 1 && var22.strictX * 404428603 == var25.strictX * 404428603) {
                                        if (DUMMY == -1956490611) {
                                            throw new IllegalStateException();
                                        }

                                        if (var25.strictY * -1490664571 == var22.strictY * -1490664571) {
                                            if (DUMMY == -1956490611) {
                                                return;
                                            }

                                            classFy.buildNpcActions(var25.definition, Client.npcIndices[var24], regionX, regionY, 1898317922);
                                        }
                                    }
                                }
                            }

                            for (var24 = 0; var24 < Client.playerCount * 16022533; ++var24) {
                                if (DUMMY == -1956490611) {
                                    throw new IllegalStateException();
                                }

                                var26 = Client.players[Client.playerIndicies[var24]];
                                if (var26 != null) {
                                    if (DUMMY == -1956490611) {
                                        return;
                                    }

                                    if (var26 != var22 && var26.strictX * 404428603 == var22.strictX * 404428603) {
                                        if (DUMMY == -1956490611) {
                                            return;
                                        }

                                        if (var22.strictY * -1490664571 == var26.strictY * -1490664571) {
                                            if (DUMMY == -1956490611) {
                                                throw new IllegalStateException();
                                            }

                                            Varp.method393(var26, Client.playerIndicies[var24], regionX, regionY, 1571664867);
                                        }
                                    }
                                }
                            }
                        }

                        if (entityID != Client.fieldHy * -1480489931) {
                            if (DUMMY == -1956490611) {
                                throw new IllegalStateException();
                            }

                            Varp.method393(var22, entityID, regionX, regionY, 351527577);
                        } else {
                            var5 = uid;
                        }
                    }

                    if (entityType == 3) { //GroundItem
                        if (DUMMY == -1956490611) {
                            throw new IllegalStateException();
                        }

                        NodeDeque<GroundItem> deque = Client.groundItemDeques[Client.floorLevel * 87713183][regionX][regionY];
                        if (deque != null) {
                            for (GroundItem gi = deque.previous(); gi != null; gi =  deque.s()) {
                                ItemDefinition var27 = Client.getItemDefinition(gi.itemId * 2057899465, -1327244302);
                                if (Client.itemSelectionStatus * 279939385 == 1) {
                                    ItemPile.insertMenuAction(StringConstants.fieldEk, Client.fieldIt + " " + UtilClass41.fieldM + " " + Buffer.getColorTags(16748608, 1043767296) + var27.fieldX, 16, gi.itemId * 2057899465, regionX, regionY);
                                } else if (Client.isSpellSelected) {
                                    if (1 == (UtilClass40.selectedSpellTargetFlags * 1512402281 & 1)) {
                                        ItemPile.insertMenuAction(Client.spellAction, Client.fieldJc + " " + UtilClass41.fieldM + " " + Buffer.getColorTags(16748608, -171067380) + var27.fieldX, 17, gi.itemId * 2057899465, regionX, regionY);
                                    }
                                } else {
                                    String[] var29 = var27.groundActions;
                                    if (Client.fieldJo) {
                                        var29 = UtilClass24.method3(var29, -1970240505);
                                    }

                                    for (int var17 = 4; var17 >= 0; --var17) {
                                        if (null != var29) {
                                            if (var29[var17] != null) {
                                                byte var18 = 0;
                                                if (var17 == 0) {
                                                    var18 = 18;
                                                }

                                                if (var17 == 1) {
                                                    var18 = 19;
                                                }

                                                if (var17 == 2) {
                                                    var18 = 20;
                                                }

                                                if (var17 == 3) {
                                                    var18 = 21;
                                                }

                                                if (4 == var17) {
                                                    var18 = 22;
                                                }

                                                ItemPile.insertMenuAction(var29[var17], Buffer.getColorTags(16748608, 1370637007) + var27.fieldX, var18, gi.itemId * 2057899465, regionX, regionY);
                                                continue;
                                            }
                                        }

                                        if (var17 == 2) {
                                            ItemPile.insertMenuAction(StringConstants.TAKE, Buffer.getColorTags(16748608, -977859347) + var27.fieldX, 20, gi.itemId * 2057899465, regionX, regionY);
                                        }
                                    }
                                    ItemPile.insertMenuAction(StringConstants.EXAMINE, Buffer.getColorTags(16748608, 2108833367) + var27.fieldX, 1004, gi.itemId * 2057899465, regionX, regionY);
                                }
                            }
                        }
                    }
                }
            }

            if (-1 != var5) {
                var7 = var5 & 127;
                uid = var5 >> 7 & 127;
                Player var20 = Client.players[Client.fieldHy * -1480489931];
                Varp.method393(var20, Client.fieldHy * -1480489931, var7, uid, 1334499428);
            }

        } catch (RuntimeException var19) {
            throw ClanMate.error(var19, "j.cw(" + ')');
        }
    }

    int compare0(ExchangeOfferData var1, ExchangeOfferData var2, byte var3) {
        try {
            if (var2.fieldA * 1954843121 == var1.fieldA * 1954843121) {
                if (var3 >= 16) {
                    throw new IllegalStateException();
                } else {
                    return 0;
                }
            } else {
                if (this.fieldVal$preferOwnWorld) {
                    if (var1.fieldA * 1954843121 == Client.currentWorld * -1276662997) {
                        return -1;
                    }

                    if (var2.fieldA * 1954843121 == Client.currentWorld * -1276662997) {
                        return 1;
                    }
                }

                byte var10000;
                if (var1.fieldA * 1954843121 < var2.fieldA * 1954843121) {
                    var10000 = -1;
                } else {
                    var10000 = 1;
                }

                return var10000;
            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "j.a(" + ')');
        }
    }

    @Override
    public int compare(Object var1, Object var2) {
        try {
            return this.compare0((ExchangeOfferData) var1, (ExchangeOfferData) var2, (byte) -42);
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "j.compare(" + ')');
        }
    }

    @Override
    public boolean equals(Object var1) {
        try {
            return super.equals(var1);
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "j.equals(" + ')');
        }
    }
}
