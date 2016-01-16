package com.jagex;

import java.awt.*;
import java.io.IOException;
import java.lang.*;
import java.net.Socket;

public final class Client extends GameEngine {

    static final int[] objectType2StubType = new int[]{
            0, 0, 0, 0, //Boundary Objects {0,1,2,3] //
            1, 1, 1, 1, 1, //Bound Decoration Objects [4,5,6,7,8]
            2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, // Standard Object [9,10,11,12,13,14,15,16,17,18,19,20,21]
            3 // Tile Decoration Objects [22]
    };

    static final int[] playerActionOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
    public static classCs csInstance;
    static int fieldGj = 249630405;
    static Client instance;
    static boolean fieldI = true;
    static int currentWorld = -2118009981;
    static int[] fieldLu = new int[100];
    static int fieldAr = 0;
    static int fieldKy = 0;
    static int fieldFy = 0;
    public static boolean fieldK = false;
    public static boolean lowMemory = false;
    static int fieldD = 0;
    static int fieldEr = 2122879333;
    static boolean fieldJ = true;
    static int engineCycle = 0;
    static long fieldP = 5352456431471487611L;
    static int[] fieldNw = new int[50];
    static int fieldZ = -170675399;
    static NodeDeque landscapeModDeque = new NodeDeque();
    static int fieldAn = -1865341155;
    static boolean fieldAs = true;
    static boolean fpsOn = false;
    static int fieldKk = 0;
    static int fieldGz = 0;
    static int hintIconNpcIndex = 0;
    static boolean[] fieldHs = new boolean[8];
    static int hintIconX = 0;
    static int hintIconY = 0;
    static int fieldAx = 0;
    static int fieldAf = 0;
    static boolean fieldJw = false;
    static GameType fieldN;
    static UnknownEnum3 fieldAo = UnknownEnum3.UNKNOWN0;
    static int[] fieldNp = new int[50];
    static int socketState = 0;
    static boolean fieldGb = false;
    public static ReferenceTableSub fieldAc;
    public static ReferenceTableSub fieldBu;
    public static ReferenceTableSub fieldBz;
    public static ReferenceTableSub runescripts;
    static int numAttempts = 0;
    static int fieldBg = 0;
    static int[] fieldKw = new int[2000];
    static int fieldDu = 580952359;
    static int fieldBn = 0;
    static int itemSelectionStatus = 0;
    static int npcCount = 0;
    static int[] npcIndices = new int['\u8000'];
    static int fieldDx = 0;
    static Packet fieldCo = new Packet(5000);
    static Buffer fieldAa = new Buffer(new byte[5000]);
    static JagSocket socket;
    static boolean fieldFp = false;
    static int packetId = 0;
    static int fieldCn = 0;
    static int fieldCp = 0;
    static int socketRelatedInt = 0;
    static int fieldCg = 0;
    static int fieldCy = 0;
    static int fieldCv = 0;
    static boolean fieldCc = false;
    static int fieldCs = 0;
    static int fieldDp = 0;
    static int fieldE = 0;
    static int fieldDj = 0;
    static int fieldDi = 381635861;
    static int fieldDo = 0;
    static CollisionMap[] collisionMaps = new CollisionMap[4];
    static int fieldHt = 0;
    static int fieldDb = -54053374;
    static int fieldDa = 0;
    static int fieldFw = 0;
    static int destinationY = 0;
    static int hintIconPlayerIndex = 0;
    static int fieldOm = 0;
    static int fieldDe = -69455775;
    static boolean fieldJj = false;
    static int minimapScale = 0;
    static int fieldC = 1525788167;
    static int minimapOffset = 0;
    static int[] fieldHm = new int[2048];
    static int fieldEq = 0;
    static int fieldFe = 1927188352;
    static int fieldLx = 1805962546;
    static int playerRights = 0;
    static int fieldKn = -1527369525;
    static int fieldFv = -815528060;
    static boolean fieldFu = false;
    static String fieldMf = null;
    static int fieldGl = 0;
    static int fieldGi = 0;
    static int fieldFa = 0;
    static String[] menuNouns = new String[500];
    static NodeTable widgetNodeConfigs = new NodeTable(512);
    static int fieldEe = 1639120497;
    static int fieldFx = 0;
    static String spellAction = null;
    static int fieldAi = 0;
    static int fieldFn = 0;
    static int fieldFq = 1391121250;
    static int[] fieldFh = new int[fieldFq * -1045090583];
    static int[] fieldFi = new int[fieldFq * -1045090583];
    static int fieldEw = 904717473;
    static int[] fieldFg = new int[fieldFq * -1045090583];
    static int[] fieldGd = new int[fieldFq * -1045090583];
    static int fieldL = 0;
    static int[] fieldGp = new int[fieldFq * -1045090583];
    static String[] fieldGo = new String[fieldFq * -1045090583];
    static int[][] fieldGe = new int[104][104];
    static int fieldGf = 0;
    static int fieldGk = 741472749;
    static LinkDeque classGjListOfClassAm = new LinkDeque();
    static int clickX = 0;
    static int[] menuArg2 = new int[500];
    static int fieldGy = 0;
    static int cursorState = 0;
    static int fieldGw = 0;
    static int fieldGr = 0;
    static int fieldGv = 0;
    static int fieldFk = 0;
    static int[] fieldKp = new int[32];
    static int fieldGg = 0;
    static int fieldAz = 0;
    static classAc fieldNn;
    static int fieldGs = 0;
    static Player[] players = new Player[2048];
    static int playerCount = 0;
    static int[] playerIndicies = new int[2048];
    static int fieldDz = 1259849370;
    static int fieldFt = -467545037;
    static Buffer[] playerBuffers = new Buffer[2048];
    static int connectionState = 0;
    static boolean fieldJo = false;
    static int fieldHr = 0;
    static int[] fieldHx = new int[1000];
    static String[] playerActions = new String[8];
    static int fieldFb = 0;
    public static int bootState = 0;
    static InputHandler inputHandler;
    static NodeDeque<GroundItem>[][][] groundItemDeques = new NodeDeque[4][104][104];
    static int[] levels = new int[25];
    static NodeDeque projectileDeque = new NodeDeque();
    static NodeDeque fieldHa = new NodeDeque();
    static int fieldNx = 0;
    static int[] currentLevels = new int[25];
    static int[] experiences = new int[25];
    static int fieldMc = 1782911609;
    static boolean menuOpen = false;
    static int menuRowCount = 0;
    static int[] fieldGa = new int[fieldFq * -1045090583];
    static int[] menuOpcodes = new int[500];
    static int[] menuArg0 = new int[500];
    static String[] menuOptions = new String[500];
    static boolean fieldMv = false;
    static int fieldIo = 1536540027;
    static int fieldIq = -614668789;
    static Widget fieldIi;
    static int fieldIb = 0;
    static int[] fieldMd = new int[128];
    static int fieldKe = 1891793245;
    static int fieldBt = 0;
    static int numMMIcons = 0;
    static int fieldHq = 0;
    static int fieldJe = 1969677057;
    static boolean fieldJv = false;
    static String fieldJc = null;
    static int fieldJh = -1923106275;
    static NodeTable widgetNodes = new NodeTable(8);
    static int fieldJg = 0;
    static int fieldJt = 0;
    static Widget fieldJy = null;
    static int playerServerIndex = -180156303;
    static int fieldJp = 0;
    static int[][][] regionChunkIds = new int[4][13][13];
    static int fieldJx = 539922407;
    static int[] menuArg1 = new int[500];
    static int fieldEo = 0;
    static String fieldIt = null;
    static Widget widgetDragSource = null;
    static int ignoreListSize = 0;
    static int fieldJd = 0;
    static int fieldJf = 0;
    static int fieldJu = 0;
    static BuildType fieldM;
    static int fieldJs = 408823943;
    static int fieldJm = -1088418795;
    static boolean fieldKb = false;
    static int fieldKr = 208957197;
    static int minimapRotation = 0;
    static boolean fieldKz = false;
    static int[] fieldOq = new int[5];
    static int fieldEp = -227468914;
    static int fieldKc = 0;
    static int[] fieldKl = new int[32];
    static int fieldKu = 0;
    static Packet fieldCj = new Packet(5000);
    static int selectedSpellChildIndex = -30981765;
    static int fieldKd = 0;
    static boolean fieldDt = false;
    static boolean[] fieldLk = new boolean[100];
    static int fieldKg = 0;
    static int fieldFr = 0;
    static int fieldKo = 0;
    static Widget fieldJl = null;
    static String[] fieldKa = new String[1000];
    static int fieldLg = 0;
    static NodeDeque<ScriptEvent> scriptEventDeque = new NodeDeque<>();
    static NodeDeque fieldLw = new NodeDeque();
    static NodeDeque fieldLo = new NodeDeque();
    static Npc[] npcs = new Npc['\u8000'];
    static int fieldLj = 0;
    static int fieldOc = 1955424279;
    static boolean[] fieldLp = new boolean[100];
    static boolean[] fieldLm = new boolean[100];
    static int fieldHy = 1856459235;
    static int fieldAe = 0;
    static int[] fieldLa = new int[100];
    static int[] fieldLq = new int[100];
    static int[] fieldLf = new int[100];
    static int fieldLb = 0;
    static int fieldDm = 0;
    static int fieldLd = 0;
    static int fieldLh = 0;
    static String fieldLn = "";
    static long[] fieldLy = new long[100];
    static int fieldLv = 0;
    static int fieldLl = 0;
    static int[] fieldMj = new int[128];
    static int[] characterOrientations = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
    static int fieldCb = 0;
    static String fieldMz = null;
    static int fieldKt = 0;
    static int[] fieldKs = new int[32];
    static Packet packet = new Packet(5000);
    static int[] MMIconRegionX = new int[1000];
    static int[] MMIconRegionY = new int[1000];
    static Sprite[] MMIcons = new Sprite[1000];
    static int destinationX = 0;
    static int fieldDy = 0;
    static int fieldMp = 0;
    static int fieldMh = -994765607;
    static int fieldMx = 812653629;
    static boolean isSpellSelected = false;
    static int fieldNe = 1432963689;
    static int fieldNm = -1701791009;
    static boolean cameraLocked = false;
    static int fieldKx = 0;
    static int[] fieldLe = new int[]{16776960, 16711680, '\uff00', '\uffff', 16711935, 16777215};
    static int[] fieldNl = new int[50];
    static long fieldMl = 225950179832801381L;
    static int[] fieldNj = new int[50];
    static AudioEffect[] fieldNq = new AudioEffect[50];
    static int fieldIm = -239724726;
    static boolean[] fieldOf = new boolean[5];
    static int[] fieldOb = new int[5];
    static int[] fieldOn = new int[5];
    static int[] fieldOx = new int[5];
    static int fieldBx = 0;
    static int chosenFriendIndex = 0;
    static int[] fieldFs = new int[fieldFq * -1045090583];
    static FriendedPlayer[] friendedPlayers = new FriendedPlayer[400];
    static Widget dragTarget = null;
    static int clickY = 0;
    static IgnoredPlayer[] ignoredPlayers = new IgnoredPlayer[400];
    static PlayerConfig aPlayerConfig = new PlayerConfig();
    static int fieldHc = 0;
    static int fieldOk = 1270367957;
    static ExchangeOffer[] localExchangeOffers = new ExchangeOffer[6];
    static Landscape landscape;
    static CompressedImage fieldV;
    static CompressedImage[] cfieldE;
    static Player myPlayer;
    static int floorLevel;

    static void method207(byte DUMMY) {
        try {
            fieldP = 5352456431471487611L;
            fieldAn = -1865341155;
            inputHandler.fieldI = 0;
            ScriptStackElement.fieldQg = true;
            fieldAs = true;
            fieldMl = 225950179832801381L;
            UtilClass31.classStructureIterable = new NodeIterable();
            fieldCo.caret = 0;
            packet.caret = 0;
            packetId = 453798763;
            fieldCg = -1080667917;
            fieldCy = -1573933999;
            fieldCv = 1078918573;
            fieldCn = 0;
            fieldAr = 0;
            socketRelatedInt = 0;
            fieldAe = 0;
            menuRowCount = 0;
            menuOpen = false;
            Mouse.mouseIdleTime = 0;
            Message.method382(366473297);
            itemSelectionStatus = 0;
            isSpellSelected = false;
            fieldNx = 0;
            fieldDa = ((int) (Math.random() * 100.0D) - 50) * 1938671759;
            fieldDy = ((int) (Math.random() * 110.0D) - 55) * -925127215;
            fieldDx = ((int) (Math.random() * 80.0D) - 40) * 1244016219;
            minimapScale = ((int) (Math.random() * 120.0D) - 60) * 769645021;
            minimapOffset = ((int) (Math.random() * 30.0D) - 20) * -523695505;
            minimapRotation = ((int) (Math.random() * 20.0D) - 10 & 2047) * -1874395707;
            fieldMp = 0;
            fieldMc = 1782911609;
            destinationX = 0;
            destinationY = 0;
            fieldAo = UnknownEnum3.UNKNOWN0;
            playerCount = 0;
            npcCount = 0;

            int var1;
            for (var1 = 0; var1 < 2048; ++var1) {
                players[var1] = null;
                playerBuffers[var1] = null;
            }

            for (var1 = 0; var1 < '\u8000'; ++var1) {
                npcs[var1] = null;
            }

            myPlayer = players[2047] = new Player();
            fieldHy = 1856459235;
            projectileDeque.clear();
            fieldHa.clear();

            int var3;
            for (var1 = 0; var1 < 4; ++var1) {
                if (DUMMY != 0) {
                    throw new IllegalStateException();
                }

                for (int var2 = 0; var2 < 104; ++var2) {
                    if (DUMMY != 0) {
                        throw new IllegalStateException();
                    }

                    for (var3 = 0; var3 < 104; ++var3) {
                        groundItemDeques[var1][var2][var3] = null;
                    }
                }
            }

            landscapeModDeque = new NodeDeque();
            fieldOm = 0;
            chosenFriendIndex = 0;
            ignoreListSize = 0;

            for (var1 = 0; var1 < Varp.fieldV * 93921467; ++var1) {
                Varp var5 = UtilClass10.getVarp(var1, 365023698);
                if (var5 != null) {
                    if (DUMMY != 0) {
                        throw new IllegalStateException();
                    }

                    UtilClass27.tempVars[var1] = 0;
                    UtilClass27.vars[var1] = 0;
                }
            }

            for (var1 = 0; var1 < fieldKw.length; ++var1) {
                fieldKw[var1] = -1;
            }

            fieldJx = 539922407;
            if (-1 != fieldJh * -98490421) {
                if (DUMMY != 0) {
                    return;
                }

                var1 = fieldJh * -98490421;
                if (-1 != var1) {
                    if (!Widget.fieldV[var1]) {
                        if (DUMMY != 0) {
                            throw new IllegalStateException();
                        }
                    } else {
                        Widget.widgetRefTable.o(var1, 1495842988);
                        if (null == Widget.widgets[var1]) {
                            if (DUMMY != 0) {
                                throw new IllegalStateException();
                            }
                        } else {
                            boolean var6 = true;

                            for (var3 = 0; var3 < Widget.widgets[var1].length; ++var3) {
                                if (Widget.widgets[var1][var3] != null) {
                                    if (2 != Widget.widgets[var1][var3].type * -729517859) {
                                        Widget.widgets[var1][var3] = null;
                                    } else {
                                        var6 = false;
                                    }
                                }
                            }

                            if (var6) {
                                if (DUMMY != 0) {
                                    throw new IllegalStateException();
                                }

                                Widget.widgets[var1] = null;
                            }

                            Widget.fieldV[var1] = false;
                        }
                    }
                }
            }

            for (WidgetNode var7 = (WidgetNode) widgetNodes.first(); var7 != null; var7 = (WidgetNode) widgetNodes.next()) {
                WidgetNode.method189(var7, true);
            }

            fieldJh = -1923106275;
            widgetNodes = new NodeTable(8);
            fieldJy = null;
            menuOpen = false;
            menuRowCount = 0;
            aPlayerConfig.a((int[]) null, new int[]{0, 0, 0, 0, 0}, false, -1, (byte) 6);

            for (var1 = 0; var1 < 8; ++var1) {
                if (DUMMY != 0) {
                    throw new IllegalStateException();
                }

                playerActions[var1] = null;
                fieldHs[var1] = false;
            }

            ExchangeOfferPriceComparator.method29((short) -15608);
            fieldJ = true;

            for (var1 = 0; var1 < 100; ++var1) {
                if (DUMMY != 0) {
                    throw new IllegalStateException();
                }

                fieldLp[var1] = true;
            }

            fieldMz = null;
            classCx.fieldMw = 0;
            LandscapeMod.clanMates = null;

            for (var1 = 0; var1 < 6; ++var1) {
                localExchangeOffers[var1] = new ExchangeOffer();
            }

            BoundaryDecoration.fieldOr = null;
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "client.q(" + ')');
        }
    }

    static final void method208(Character var0, int var1, byte var2) {
        try {
            int var3;
            int var4;
            int var5;
            int var6;
            AnimationSequence var12;
            if (var0.fieldBf * -467145561 > engineCycle * -1223223371) {
                if (var2 <= 31) {
                    throw new IllegalStateException();
                }

                var3 = var0.fieldBf * -467145561 - engineCycle * -1223223371;
                var4 = var0.fieldZ * 377596096 + var0.fieldBe * -1289731968;
                var5 = var0.fieldBc * -1330493056 + var0.fieldZ * 377596096;
                var0.strictX += (var4 - var0.strictX * 404428603) / var3 * 1386850803;
                var0.strictY += (var5 - var0.strictY * -1490664571) / var3 * 1224424781;
                var0.fieldCr = 0;
                if (0 == var0.fieldBt * 2006725845) {
                    if (var2 <= 31) {
                        throw new IllegalStateException();
                    }

                    var0.objOrientation = -367387648;
                }

                if (var0.fieldBt * 2006725845 == 1) {
                    if (var2 <= 31) {
                        throw new IllegalStateException();
                    }

                    var0.objOrientation = -551081472;
                }

                if (2 == var0.fieldBt * 2006725845) {
                    if (var2 <= 31) {
                        throw new IllegalStateException();
                    }

                    var0.objOrientation = 0;
                }

                if (var0.fieldBt * 2006725845 == 3) {
                    if (var2 <= 31) {
                        throw new IllegalStateException();
                    }

                    var0.objOrientation = -183693824;
                }
            } else if (var0.fieldBg * -1916221887 >= engineCycle * -1223223371) {
                if (var2 <= 31) {
                    throw new IllegalStateException();
                }

                UtilClass27.method18(var0, 555521379);
            } else {
                var0.fieldAc = var0.fieldC * 496553733;
                if (var0.queueSize * 1243816117 == 0) {
                    var0.fieldCr = 0;
                } else {
                    label958:
                    {
                        if (-1 != var0.animation * -433706235) {
                            if (var2 <= 31) {
                                throw new IllegalStateException();
                            }

                            if (0 == var0.animationDelay * -1858896077) {
                                if (var2 <= 31) {
                                    throw new IllegalStateException();
                                }

                                var12 = AnimationSequence.get(var0.animation * -433706235, 1212332893);
                                if (var0.fieldCt * -898309451 > 0 && var12.precedence * -2061466233 == 0) {
                                    if (var2 <= 31) {
                                        throw new IllegalStateException();
                                    }

                                    var0.fieldCr += 1915787813;
                                    break label958;
                                }

                                if (var0.fieldCt * -898309451 <= 0) {
                                    if (var2 <= 31) {
                                        throw new IllegalStateException();
                                    }

                                    if (0 == var12.replacementWeapon * 2102903451) {
                                        if (var2 <= 31) {
                                            throw new IllegalStateException();
                                        }

                                        var0.fieldCr += 1915787813;
                                        break label958;
                                    }
                                }
                            }
                        }

                        var3 = var0.strictX * 404428603;
                        var4 = var0.strictY * -1490664571;
                        var5 = 128 * var0.queueX[var0.queueSize * 1243816117 - 1] + var0.fieldZ * 377596096;
                        var6 = 128 * var0.queueY[var0.queueSize * 1243816117 - 1] + var0.fieldZ * 377596096;
                        if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256) {
                            if (var6 - var4 >= -256) {
                                if (var3 < var5) {
                                    if (var4 < var6) {
                                        var0.objOrientation = 1688249088;
                                    } else if (var4 > var6) {
                                        var0.objOrientation = 1504555264;
                                    } else {
                                        var0.objOrientation = -551081472;
                                    }
                                } else if (var3 > var5) {
                                    if (var4 < var6) {
                                        var0.objOrientation = 1871942912;
                                    } else if (var4 > var6) {
                                        var0.objOrientation = 2055636736;
                                    } else {
                                        var0.objOrientation = -183693824;
                                    }
                                } else if (var4 < var6) {
                                    var0.objOrientation = -367387648;
                                } else if (var4 > var6) {
                                    var0.objOrientation = 0;
                                }

                                int var7 = var0.objOrientation * -1133027529 - var0.orientation * -422817855 & 2047;
                                if (var7 > 1024) {
                                    var7 -= 2048;
                                }

                                int var8;
                                label962:
                                {
                                    var8 = var0.fieldAr * 1348267757;
                                    if (var7 >= -256 && var7 <= 256) {
                                        var8 = var0.fieldAh * -138546809;
                                        break label962;
                                    }

                                    if (var7 >= 256 && var7 < 768) {
                                        var8 = var0.fieldAv * 1025679109;
                                        break label962;
                                    }

                                    if (var7 >= -768 && var7 <= -256) {
                                        var8 = var0.fieldAe * -586628697;
                                    }
                                }

                                if (-1 == var8) {
                                    var8 = var0.fieldAh * -138546809;
                                }

                                var0.fieldAc = 1625775315 * var8;
                                int var9 = 4;
                                boolean var10 = true;
                                if (var0 instanceof Npc) {
                                    var10 = ((Npc) var0).definition.fieldAm;
                                }

                                if (var10) {
                                    if (var0.orientation * -422817855 != var0.objOrientation * -1133027529) {
                                        if (var0.targetIndex * -1206972333 == -1 && 0 != var0.rotation * 1900546291) {
                                            var9 = 2;
                                        }
                                    }

                                    if (var0.queueSize * 1243816117 > 2) {
                                        var9 = 6;
                                    }

                                    if (var0.queueSize * 1243816117 > 3) {
                                        var9 = 8;
                                    }

                                    if (var0.fieldCr * -428871251 > 0 && var0.queueSize * 1243816117 > 1) {
                                        var9 = 8;
                                        var0.fieldCr -= 1915787813;
                                    }
                                } else {
                                    if (var0.queueSize * 1243816117 > 1) {
                                        var9 = 6;
                                    }

                                    if (var0.queueSize * 1243816117 > 2) {
                                        var9 = 8;
                                    }

                                    if (var0.fieldCr * -428871251 > 0 && var0.queueSize * 1243816117 > 1) {
                                        var9 = 8;
                                        var0.fieldCr -= 1915787813;
                                    }
                                }

                                if (var0.queueTraversed[var0.queueSize * 1243816117 - 1]) {
                                    var9 <<= 1;
                                }

                                if (var9 >= 8 && var0.fieldAc * -1420731557 == var0.fieldAh * -138546809) {
                                    if (-1 != var0.fieldAl * -17614013) {
                                        var0.fieldAc = var0.fieldAl * 624618553;
                                    }
                                }

                                if (var3 < var5) {
                                    var0.strictX += var9 * 1386850803;
                                    if (var0.strictX * 404428603 > var5) {
                                        var0.strictX = var5 * 1386850803;
                                    }
                                } else if (var3 > var5) {
                                    var0.strictX -= var9 * 1386850803;
                                    if (var0.strictX * 404428603 < var5) {
                                        var0.strictX = var5 * 1386850803;
                                    }
                                }

                                if (var4 < var6) {
                                    var0.strictY += var9 * 1224424781;
                                    if (var0.strictY * -1490664571 > var6) {
                                        var0.strictY = 1224424781 * var6;
                                    }
                                } else if (var4 > var6) {
                                    var0.strictY -= var9 * 1224424781;
                                    if (var0.strictY * -1490664571 < var6) {
                                        var0.strictY = var6 * 1224424781;
                                    }
                                }

                                if (var0.strictX * 404428603 == var5 && var6 == var0.strictY * -1490664571) {
                                    var0.queueSize -= -927674979;
                                    if (var0.fieldCt * -898309451 > 0) {
                                        var0.fieldCt -= 1649703837;
                                    }
                                }
                                break label958;
                            }
                        }
                        var0.strictX = var5 * 1386850803;
                        var0.strictY = 1224424781 * var6;
                    }
                }
            }

            label915:
            {
                if (var0.strictX * 404428603 >= 128) {
                    if (var0.strictY * -1490664571 >= 128 && var0.strictX * 404428603 < 13184) {
                        if (var0.strictY * -1490664571 < 13184) {
                            break label915;
                        }
                    }
                }

                var0.animation = 1079449139;
                var0.fieldBp = -1712363827;
                var0.fieldBf = 0;
                var0.fieldBg = 0;
                var0.strictX = var0.fieldZ * -600183232 + var0.queueX[0] * 1423243648;
                var0.strictY = var0.fieldZ * 511017408 + var0.queueY[0] * 2107549312;
                var0.f(-1849426410);
            }

            if (var0 == myPlayer) {
                label966:
                {
                    if (var0.strictX * 404428603 >= 1536) {
                        if (var0.strictY * -1490664571 >= 1536 && var0.strictX * 404428603 < 11776) {
                            if (var0.strictY * -1490664571 < 11776) {
                                break label966;
                            }
                        }
                    }

                    var0.animation = 1079449139;
                    var0.fieldBp = -1712363827;
                    var0.fieldBf = 0;
                    var0.fieldBg = 0;
                    var0.strictX = var0.fieldZ * -600183232 + 1423243648 * var0.queueX[0];
                    var0.strictY = var0.queueY[0] * 2107549312 + var0.fieldZ * 511017408;
                    var0.f(-1893695429);
                }
            }

            if (var0.rotation * 1900546291 != 0) {
                if (-1 != var0.targetIndex * -1206972333 && var0.targetIndex * -1206972333 < '\u8000') {
                    Npc var13 = npcs[var0.targetIndex * -1206972333];
                    if (var13 != null) {
                        label969:
                        {
                            var4 = var0.strictX * 404428603 - var13.strictX * 404428603;
                            var5 = var0.strictY * -1490664571 - var13.strictY * -1490664571;
                            if (0 == var4 && 0 == var5) {
                                break label969;
                            }

                            var0.objOrientation = ((int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047) * -948271481;
                        }
                    }
                }

                if (var0.targetIndex * -1206972333 >= '\u8000') {
                    var3 = var0.targetIndex * -1206972333 - '\u8000';
                    if (playerServerIndex * -1508358289 == var3) {
                        var3 = 2047;
                    }

                    Player var14 = players[var3];
                    if (null != var14) {
                        label972:
                        {
                            var5 = var0.strictX * 404428603 - var14.strictX * 404428603;
                            var6 = var0.strictY * -1490664571 - var14.strictY * -1490664571;
                            if (0 == var5 && 0 == var6) {
                                break label972;
                            }

                            var0.objOrientation = ((int) (Math.atan2((double) var5, (double) var6) * 325.949D) & 2047) * -948271481;
                        }
                    }
                }

                label973:
                {
                    if (0 == var0.fieldAf * -397843465 && var0.fieldAb * -37501763 == 0) {
                        break label973;
                    }

                    if (var0.queueSize * 1243816117 != 0 && var0.fieldCr * -428871251 <= 0) {
                        break label973;
                    }

                    label856:
                    {
                        var3 = var0.strictX * 404428603 - (var0.fieldAf * 307822016 - classDc.baseX * 578488256 - classDc.baseX * 578488256);
                        var4 = var0.strictY * -1490664571 - (var0.fieldAb * 1894854464 - CalendarUtil.baseY * 1739357760 - CalendarUtil.baseY * 1739357760);
                        if (0 == var3 && var4 == 0) {
                            break label856;
                        }

                        var0.objOrientation = ((int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 2047) * -948271481;
                    }

                    var0.fieldAf = 0;
                    var0.fieldAb = 0;
                }

                var3 = var0.objOrientation * -1133027529 - var0.orientation * -422817855 & 2047;
                if (var3 != 0) {
                    if (var2 <= 31) {
                        return;
                    }

                    var0.fieldBa += -1184760753;
                    boolean var15;
                    if (var3 > 1024) {
                        if (var2 <= 31) {
                            throw new IllegalStateException();
                        }

                        label832:
                        {
                            var0.orientation -= var0.rotation * 1782416819;
                            var15 = true;
                            if (var3 >= var0.rotation * 1900546291 && var3 <= 2048 - var0.rotation * 1900546291) {
                                break label832;
                            }

                            var0.orientation = var0.objOrientation * -2014221065;
                            var15 = false;
                        }

                        if (var0.fieldAc * -1420731557 == var0.fieldC * -1367515705) {
                            label979:
                            {
                                if (var0.fieldBa * 1202952879 <= 25 && !var15) {
                                    break label979;
                                }
                                var0.fieldAc = var0.fieldAn * 1447479749 != -1 ? var0.fieldAn * 2107513183 : var0.fieldAh * 86742597;
                            }
                        }
                    } else {
                        label845:
                        {
                            var0.orientation += var0.rotation * 1782416819;
                            var15 = true;
                            if (var3 >= var0.rotation * 1900546291 && var3 <= 2048 - var0.rotation * 1900546291) {
                                break label845;
                            }

                            var0.orientation = var0.objOrientation * -2014221065;
                            var15 = false;
                        }

                        if (var0.fieldC * -1367515705 == var0.fieldAc * -1420731557) {
                            label839:
                            {
                                if (var0.fieldBa * 1202952879 <= 25 && !var15) {
                                    break label839;
                                }
                                var0.fieldAc = var0.fieldAs * -234859353 != -1 ? var0.fieldAs * -1755133531 : var0.fieldAh * 86742597;
                            }
                        }
                    }

                    var0.orientation = (var0.orientation * -422817855 & 2047) * -32522175;
                } else {
                    var0.fieldBa = 0;
                }
            }

            var0.fieldR = false;
            if (var0.fieldAc * -1420731557 != -1) {
                var12 = AnimationSequence.get(var0.fieldAc * -1420731557, 1793113602);
                if (null != var12 && var12.fieldM != null) {
                    var0.fieldAy += 1368433959;
                    if (var0.fieldAp * 816706191 < var12.fieldM.length && var0.fieldAy * -1552516457 > var12.fieldE[var0.fieldAp * 816706191]) {
                        var0.fieldAy = 1368433959;
                        var0.fieldAp += 59305071;
                        NpcDefinition.method377(var12, var0.fieldAp * 816706191, var0.strictX * 404428603, var0.strictY * -1490664571, (byte) -34);
                    }

                    if (var0.fieldAp * 816706191 >= var12.fieldM.length) {
                        var0.fieldAy = 0;
                        var0.fieldAp = 0;
                        NpcDefinition.method377(var12, var0.fieldAp * 816706191, var0.strictX * 404428603, var0.strictY * -1490664571, (byte) -75);
                    }
                } else {
                    var0.fieldAc = -1625775315;
                }
            }

            if (var0.fieldBp * -1404237317 != -1) {
                if (var2 <= 31) {
                    throw new IllegalStateException();
                }

                if (engineCycle * -1223223371 >= var0.fieldBz * 1643494635) {
                    if (var2 <= 31) {
                        return;
                    }

                    if (var0.fieldBw * -2049894135 < 0) {
                        if (var2 <= 31) {
                            throw new IllegalStateException();
                        }

                        var0.fieldBw = 0;
                    }

                    var3 = TilePaint.getAnimation(var0.fieldBp * -1404237317, 1060440471).sequenceId * 1259888421;
                    if (var3 != -1) {
                        label983:
                        {
                            if (var2 <= 31) {
                                throw new IllegalStateException();
                            }

                            AnimationSequence var16 = AnimationSequence.get(var3, 600374691);
                            if (null != var16) {
                                if (var2 <= 31) {
                                    throw new IllegalStateException();
                                }

                                if (null != var16.fieldM) {
                                    var0.fieldBm += -810764565;
                                    if (var0.fieldBw * -2049894135 < var16.fieldM.length) {
                                        if (var2 <= 31) {
                                            throw new IllegalStateException();
                                        }

                                        if (var0.fieldBm * 1564295619 > var16.fieldE[var0.fieldBw * -2049894135]) {
                                            if (var2 <= 31) {
                                                throw new IllegalStateException();
                                            }

                                            var0.fieldBm = -810764565;
                                            var0.fieldBw += 966935865;
                                            NpcDefinition.method377(var16, var0.fieldBw * -2049894135, var0.strictX * 404428603, var0.strictY * -1490664571, (byte) -100);
                                        }
                                    }

                                    if (var0.fieldBw * -2049894135 >= var16.fieldM.length) {
                                        if (var0.fieldBw * -2049894135 >= 0) {
                                            if (var2 <= 31) {
                                                throw new IllegalStateException();
                                            }

                                            if (var0.fieldBw * -2049894135 < var16.fieldM.length) {
                                                break label983;
                                            }

                                            if (var2 <= 31) {
                                                throw new IllegalStateException();
                                            }
                                        }

                                        var0.fieldBp = -1712363827;
                                    }
                                    break label983;
                                }
                            }

                            var0.fieldBp = -1712363827;
                        }
                    } else {
                        var0.fieldBp = -1712363827;
                    }
                }
            }

            if (-1 != var0.animation * -433706235) {
                if (var2 <= 31) {
                    throw new IllegalStateException();
                }

                if (var0.animationDelay * -1858896077 <= 1) {
                    if (var2 <= 31) {
                        throw new IllegalStateException();
                    }

                    var12 = AnimationSequence.get(var0.animation * -433706235, -1982650822);
                    if (1 == var12.precedence * -2061466233) {
                        if (var2 <= 31) {
                            throw new IllegalStateException();
                        }

                        if (var0.fieldCt * -898309451 > 0) {
                            if (var2 <= 31) {
                                throw new IllegalStateException();
                            }

                            if (var0.fieldBf * -467145561 <= engineCycle * -1223223371) {
                                if (var2 <= 31) {
                                    throw new IllegalStateException();
                                }

                                if (var0.fieldBg * -1916221887 < engineCycle * -1223223371) {
                                    if (var2 <= 31) {
                                        throw new IllegalStateException();
                                    }

                                    var0.animationDelay = 229151739;
                                    return;
                                }
                            }
                        }
                    }
                }
            }

            if (-1 != var0.animation * -433706235) {
                if (var2 <= 31) {
                    return;
                }

                if (0 == var0.animationDelay * -1858896077) {
                    label986:
                    {
                        if (var2 <= 31) {
                            return;
                        }

                        var12 = AnimationSequence.get(var0.animation * -433706235, 1517177747);
                        if (var12 != null) {
                            if (var2 <= 31) {
                                throw new IllegalStateException();
                            }

                            if (null != var12.fieldM) {
                                if (var2 <= 31) {
                                    return;
                                }

                                var0.fieldBi += -724348837;
                                if (var0.fieldBo * 1983896939 < var12.fieldM.length && var0.fieldBi * -1871093805 > var12.fieldE[var0.fieldBo * 1983896939]) {
                                    if (var2 <= 31) {
                                        throw new IllegalStateException();
                                    }

                                    var0.fieldBi = -724348837;
                                    var0.fieldBo += 1666803523;
                                    NpcDefinition.method377(var12, var0.fieldBo * 1983896939, var0.strictX * 404428603, var0.strictY * -1490664571, (byte) 0);
                                }

                                if (var0.fieldBo * 1983896939 >= var12.fieldM.length) {
                                    if (var2 <= 31) {
                                        throw new IllegalStateException();
                                    }

                                    var0.fieldBo -= var12.fieldS * 891325691;
                                    var0.fieldBl += 1628083507;
                                    if (var0.fieldBl * 8613371 >= var12.maxLoops * -386038493) {
                                        if (var2 <= 31) {
                                            throw new IllegalStateException();
                                        }

                                        var0.animation = 1079449139;
                                    } else {
                                        label758:
                                        {
                                            if (var0.fieldBo * 1983896939 >= 0) {
                                                if (var2 <= 31) {
                                                    throw new IllegalStateException();
                                                }

                                                if (var0.fieldBo * 1983896939 < var12.fieldM.length) {
                                                    NpcDefinition.method377(var12, var0.fieldBo * 1983896939, var0.strictX * 404428603, var0.strictY * -1490664571, (byte) -102);
                                                    break label758;
                                                }

                                                if (var2 <= 31) {
                                                    throw new IllegalStateException();
                                                }
                                            }

                                            var0.animation = 1079449139;
                                        }
                                    }
                                }

                                var0.fieldR = var12.fieldF;
                                break label986;
                            }
                        }

                        var0.animation = 1079449139;
                    }
                }
            }

            if (var0.animationDelay * -1858896077 > 0) {
                var0.animationDelay -= 229151739;
            }

        } catch (RuntimeException var11) {
            throw ClanMate.error(var11, "client.ae(" + ')');
        }
    }

    static void method27(int type, String var1, String var2, String var3, short var4) {
        try {
            MessageContainer var5 = UtilClass40.messageContainerMap.get(type);
            if (var5 == null) {
                var5 = new MessageContainer();
                UtilClass40.messageContainerMap.put(type, var5);
            }

            Message var6 = var5.a(type, var1, var2, var3);
            UtilClass40.fieldV.v(var6, (long) (var6.fieldA * -1367842983));
            UtilClass40.fieldI.add(var6);
            fieldKd = fieldKe * 261894391;
        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "gh.i(" + ')');
        }
    }

    public static ItemDefinition getItemDefinition(int id, int var1) {
        try {
            ItemDefinition def = (ItemDefinition) ItemDefinition.fieldE.get((long) id);
            if (null != def) {
                return def;
            } else {
                byte[] var3 = ItemDefinition.fieldB.getFile(10, id, (short) 30190);
                def = new ItemDefinition();
                def.id = 1842121137 * id;
                if (null != var3) {
                    def.b(new Buffer(var3), -1392828574);
                }

                def.i(-524242306);
                if (-1 != def.fieldAu * -1133001085) {
                    def.copy(getItemDefinition(def.fieldAu * -1133001085, 280731310), getItemDefinition(def.fieldAd * -349199001, -936395622), 1747200593);
                }

                if (!classEv.fieldM && def.fieldAn) {
                    def.fieldX = StringConstants.fieldA;
                    def.fieldAy = false;
                    def.groundActions = null;
                    def.actions = null;
                    def.team = 0;
                }

                ItemDefinition.fieldE.put(def, (long) id);
                return def;
            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "aa.v(" + ')');
        }
    }

    @Override
    protected final void v(int var1) {
        try {
            ;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "client.v(" + ')');
        }
    }

    @Override
    public final void init() {
        try {
            if (this.pz(-33452066)) {

                Parameter[] var1 = new Parameter[]{Parameter.P4, Parameter.P3, Parameter.P9, Parameter.P12, Parameter.P1, Parameter.P13, Parameter.P14, Parameter.P6, Parameter.P10, Parameter.P15, Parameter.P7, Parameter.P2, Parameter.P11, Parameter.P8, Parameter.P5};
                Parameter[] var2 = var1;

                for (int var3 = 0; var3 < var2.length; ++var3) {
                    Parameter var4 = var2[var3];
                    String var5 = this.getParameter(var4.name);
                    if (var5 != null) {
                        switch (Integer.parseInt(var4.name)) {

                            case 1:
                                fieldN = Preferences.ValueOf(ObjectDefinition.getGameTypeValues((byte) -59), Integer.parseInt(var5), 917316640);
                                if (GameType.OLDSCAPE == fieldN) {
                                    UtilClass38.fieldS = classGn.fieldA;
                                } else {
                                    UtilClass38.fieldS = classGn.fieldE;
                                }
                                break;
                            case 2:
                                if (var5.equalsIgnoreCase(UtilClass41.fieldA)) {
                                    ;
                                }
                            case 3:
                            case 7:
                            default:
                                break;
                            case 4:
                                classCf.fieldQ = var5;
                                break;
                            case 5:
                                Varp.fieldO = var5;
                                break;
                            case 6:
                                classEr.fieldH = Integer.parseInt(var5) * -1866304547;
                                break;
                            case 8:
                                fieldL = Integer.parseInt(var5) * -2133466795;
                                break;
                            case 9:
                                currentWorld = Integer.parseInt(var5) * -2118009981;
                                break;
                            case 10:
                                int var7 = Integer.parseInt(var5);
                                BuildType[] var8 = new BuildType[]{BuildType.RC, BuildType.WIP, BuildType.LIVE, BuildType.BLIVE};
                                BuildType[] var9 = var8;
                                int var10 = 0;

                                BuildType var6;
                                while (true) {
                                    if (var10 >= var9.length) {
                                        var6 = null;
                                        break;
                                    }

                                    BuildType var11 = var9[var10];
                                    if (var11.id * 1412544101 == var7) {
                                        var6 = var11;
                                        break;
                                    }

                                    ++var10;
                                }

                                fieldM = var6;
                                break;
                            case 11:
                                fieldE = Integer.parseInt(var5) * 201320075;
                                break;
                            case 12:
                                UtilClass7.fieldT = Integer.parseInt(var5) * -1940061295;
                                break;
                            case 13:
                                if (var5.equalsIgnoreCase(UtilClass41.fieldA)) {
                                    fieldK = true;
                                } else {
                                    fieldK = false;
                                }
                                break;
                            case 14:
                                fieldD = Integer.parseInt(var5) * 105751649;
                        }
                    }
                }

                Landscape.fieldA = false;
                lowMemory = false;
                UtilClass19.fieldBq = this.getCodeBase().getHost();
                String var14 = fieldM.name;
                byte var15 = 0;

                try {
                    GroundItem.method98("oldschool", var14, var15, 16, (byte) -59);
                } catch (Exception var12) {
                    UtilClass5.method61((String) null, var12, -765030861);
                }

                instance = this;
                this.load(765, 503, 74, 1995411361);
            }
        } catch (RuntimeException var13) {
            throw ClanMate.error(var13, "client.init(" + ')');
        }
    }

    void s(int DUMMY) {
        try {
            if (UtilClass20.fieldP * -2112327413 >= 4) {
                if (DUMMY >= -2058233110) {
                    throw new IllegalStateException();
                } else {
                    this.criticalError("js5crc", 1062454508);
                    connectionState = 287583368;
                }
            } else {
                if (UtilClass20.fieldR * 647325319 >= 4) {
                    if (DUMMY >= -2058233110) {
                        throw new IllegalStateException();
                    }

                    if (connectionState * -214882771 <= 5) {
                        if (DUMMY >= -2058233110) {
                            throw new IllegalStateException();
                        }

                        this.criticalError("js5io", 1062454508);
                        connectionState = 287583368;
                        return;
                    }

                    fieldAf = -1092671880;
                    UtilClass20.fieldR = -529302107;
                }

                if ((fieldAf -= 1653198185) * -514616615 + 1 <= 0) {
                    try {
                        if (0 == socketState * -1166833069) {
                            classBf.fieldAu = classBq.globalTaskSchedular.scheduleSocketTask(UtilClass19.fieldBq, DynamicObject.fieldBd * -1775258173, (byte) 16);
                            socketState += -1886565925;
                        }

                        if (1 == socketState * -1166833069) {
                            if (2 == classBf.fieldAu.resultStatus) {
                                this.connectFailed(-1, 651432265);
                                return;
                            }

                            if (1 == classBf.fieldAu.resultStatus) {
                                socketState += -1886565925;
                            }
                        }


                        if (socketState * -1166833069 == 2) {
                            //upload handshake
                            classM.fieldAk = new JagSocket((Socket) classBf.fieldAu.result, classBq.globalTaskSchedular);
                            Buffer var2 = new Buffer(5);
                            var2.writeByte(15);
                            var2.writeInt(74);
                            classM.fieldAk.writeLater(var2.payload, 0, 5, (byte) -112);
                            socketState += -1886565925;
                            classCs.handshakeWriteTime = classDz.getFancyTime(680429248) * -4890630956901663079L;
                        }

                        if (socketState * -1166833069 == 3) {
                            label203:
                            {

                                if (connectionState * -214882771 > 5) {
                                    if (classM.fieldAk.available(1996504366) <= 0) {
                                        if (classDz.getFancyTime(925070221) - classCs.handshakeWriteTime * 4779374346378704297L > 30000L) {
                                            //Timeout
                                            this.connectFailed(-2, 651432265);
                                            return;
                                        }
                                        break label203;
                                    }
                                }

                                int var11 = classM.fieldAk.read(1831683863);
                                if (var11 != 0) {
                                    this.connectFailed(var11, 651432265);
                                    return;
                                }

                                socketState += -1886565925;
                            }
                        }

                        if (4 == socketState * -1166833069) {

                            JagSocket var12 = classM.fieldAk;
                            boolean var10000;
                            if (connectionState * -214882771 > 20) {

                                var10000 = true;
                            } else {
                                var10000 = false;
                            }

                            boolean var3 = var10000;

                            if (UtilClass20.fieldA != null) {
                                try {
                                    UtilClass20.fieldA.stop(1094828260);
                                } catch (Exception ignored) {
                                }

                                UtilClass20.fieldA = null;
                            }

                            UtilClass20.fieldA = var12;
                            classCn.method327(var3, -246659078);
                            UtilClass20.fieldO.caret = 0;
                            UtilClass38.fieldX = null;
                            UtilClass20.fieldQ = null;
                            UtilClass20.fieldT = 0;

                            while (true) {
                                classEr var4 = (classEr) UtilClass20.fieldM.first();
                                if (null == var4) {

                                    while (true) {
                                        var4 = (classEr) UtilClass20.fieldK.first();
                                        if (var4 == null) {

                                            if (UtilClass20.fieldY != 0) {

                                                try {
                                                    Buffer var13 = new Buffer(4);
                                                    var13.writeByte(4);
                                                    var13.writeByte(UtilClass20.fieldY);
                                                    var13.writeShort(0);
                                                    UtilClass20.fieldA.writeLater(var13.payload, 0, 4, (byte) 49);
                                                } catch (IOException var7) {

                                                    try {
                                                        UtilClass20.fieldA.stop(-761677292);
                                                    } catch (Exception ignored) {
                                                    }

                                                    UtilClass20.fieldR += -1608089801;
                                                    UtilClass20.fieldA = null;
                                                }
                                            }

                                            UtilClass20.fieldV = 0;
                                            UtilClass20.fieldI = classDz.getFancyTime(1757423254) * 7659793936815245145L;
                                            classBf.fieldAu = null;
                                            classM.fieldAk = null;
                                            socketState = 0;
                                            numAttempts = 0;
                                            return;
                                        }

                                        UtilClass20.fieldE.insert(var4);
                                        UtilClass20.fieldN.put(var4, var4.key);
                                        UtilClass20.fieldS += -748059873;
                                        UtilClass20.fieldF -= -1971002295;
                                    }
                                }

                                UtilClass20.fieldB.put(var4, var4.key);
                                UtilClass20.fieldL += -1095412767;
                                UtilClass20.fieldW -= -637378369;
                            }
                        }
                    } catch (IOException var9) {
                        this.connectFailed(-3, 651432265);
                    }

                }
            }
        } catch (RuntimeException var10) {
            throw ClanMate.error(var10, "client.s(" + ')');
        }
    }

    void connectFailed(int errorCode, int DUMMY) {
        try {
            classBf.fieldAu = null;
            classM.fieldAk = null;
            socketState = 0;
            if (Buffer.fieldBa * -819256449 == DynamicObject.fieldBd * -1775258173) {
                if (DUMMY != 651432265) {
                    return;
                }

                DynamicObject.fieldBd = UnknownEnum.fieldBv * 1728797703;
            } else {
                DynamicObject.fieldBd = Buffer.fieldBa * 1233499029;
            }

            numAttempts += 2122116867;
            if (numAttempts * -373656661 >= 2) {


                if (errorCode == 7 || errorCode == 9) {
                    if (connectionState * -214882771 <= 5) {
                        this.criticalError("js5connect_full", 1062454508);
                        connectionState = 287583368;
                    } else {
                        fieldAf = -1092671880;
                    }
                }


                return;

            }

            if (numAttempts * -373656661 >= 2) {
                if (DUMMY != 651432265) {
                    return;
                }

                if (errorCode == 6) {
                    this.criticalError("js5connect_outofdate", 1062454508);
                    connectionState = 287583368;
                    return;
                }

            }

            if (numAttempts * -373656661 >= 4) {
                if (connectionState * -214882771 <= 5) {
                    this.criticalError("js5connect", 1062454508);
                    connectionState = 287583368;
                } else {
                    fieldAf = -1092671880;
                }
            }

        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "client.k(" + ')');
        }
    }

    @Override
    protected final void w(int var1) {
        try {
            if (null != inputHandler) {
                if (var1 <= 2067110025) {
                    throw new IllegalStateException();
                }

                inputHandler.fieldA = false;
            }

            inputHandler = null;
            if (null != socket) {
                if (var1 <= 2067110025) {
                    return;
                }

                socket.stop(1444804123);
                socket = null;
            }

            classAm.method404(-566955328);
            if (Mouse.instance != null) {
                Mouse var2 = Mouse.instance;
                synchronized (Mouse.instance) {
                    Mouse.instance = null;
                }
            }

            AbstractByteBuffer.mouseWheelListener = null;
            if (null != classDm.fieldNf) {
                if (var1 <= 2067110025) {
                    throw new IllegalStateException();
                }

                classDm.fieldNf.an(-695881871);
            }

            if (Npc.fieldNk != null) {
                if (var1 <= 2067110025) {
                    return;
                }

                Npc.fieldNk.an(1790299757);
            }

            Animation.method369(900661610);
            Object var10 = classEs.fieldB;
            synchronized (classEs.fieldB) {
                if (0 != classEs.fieldI * 1123152153) {
                    if (var1 <= 2067110025) {
                        throw new IllegalStateException();
                    }

                    classEs.fieldI = 2113985321;

                    try {
                        classEs.fieldB.wait();
                    } catch (InterruptedException var5) {
                        ;
                    }
                }
            }

            try {
                UtilClass19.fieldF.a(-424627301);

                for (int var11 = 0; var11 < UtilClass19.fieldM * -1933377245; ++var11) {
                    if (var1 <= 2067110025) {
                        return;
                    }

                    UtilClass11.fieldX[var11].a(-1706694558);
                }

                UtilClass19.fieldD.a(-808457266);
                UtilClass19.fieldK.a(-766320991);
            } catch (Exception var7) {
                ;
            }

        } catch (RuntimeException var9) {
            throw ClanMate.error(var9, "client.w(" + ')');
        }
    }

    @Override
    protected final void l(int DUMMY) {
        try {

          //  UtilClass27.vars[]

            engineCycle += 1557814941;
            this.n((byte) 23);

            while (true) {
                NodeDeque var3 = classEs.fieldA;
                classEv var2;
                synchronized (classEs.fieldA) {
                    var2 = (classEv) classEs.fieldV.popFirst();
                }

                if (null == var2) {
                    if (DUMMY <= -1865916510) {
                        throw new IllegalStateException();
                    }

                    UtilClass7.method70(-601723472);
                    UtilClass39.method176(-746983426);
                    classAi.method392(1389966556);
                    LandscapeTile.updateMouse(1733432995);
                    int var50;
                    if (AbstractByteBuffer.mouseWheelListener != null) {
                        if (DUMMY <= -1865916510) {
                            return;
                        }

                        var50 = AbstractByteBuffer.mouseWheelListener.b(-813128708);
                        fieldLg = var50 * -1110624381;
                    }

                    if (connectionState * -214882771 == 0) {
                        if (DUMMY <= -1865916510) {
                            return;
                        }

                        classBx.method251(-336173618);
                        UtilClass5.fieldPk.v((byte) 14);

                        for (var50 = 0; var50 < 32; ++var50) {
                            fieldPx[var50] = 0L;
                        }

                        for (var50 = 0; var50 < 32; ++var50) {
                            if (DUMMY <= -1865916510) {
                                throw new IllegalStateException();
                            }

                            fieldPw[var50] = 0L;
                        }

                        classDz.fieldPe = 0;
                    } else if (5 == connectionState * -214882771) {
                        if (DUMMY <= -1865916510) {
                            throw new IllegalStateException();
                        }

                        classDa.method280(this, 1413228277);
                        classBx.method251(-1510353486);
                        UtilClass5.fieldPk.v((byte) 14);

                        for (var50 = 0; var50 < 32; ++var50) {
                            if (DUMMY <= -1865916510) {
                                throw new IllegalStateException();
                            }

                            fieldPx[var50] = 0L;
                        }

                        for (var50 = 0; var50 < 32; ++var50) {
                            fieldPw[var50] = 0L;
                        }

                        classDz.fieldPe = 0;
                    } else if (connectionState * -214882771 != 10 && 11 != connectionState * -214882771) {
                        if (20 == connectionState * -214882771) {
                            if (DUMMY <= -1865916510) {
                                return;
                            }

                            classDa.method280(this, 1152901132);
                            classEr.method192(1976884746);
                        } else if (connectionState * -214882771 == 25) {
                            if (DUMMY <= -1865916510) {
                                throw new IllegalStateException();
                            }

                            classGn.method24(false, 651432265);
                            fieldDp = 0;
                            boolean var53 = true;

                            int var51;
                            for (var51 = 0; var51 < DynamicObject.fieldDk.length; ++var51) {
                                if (DUMMY <= -1865916510) {
                                    throw new IllegalStateException();
                                }

                                if (UtilClass38.fieldDh[var51] != -1 && DynamicObject.fieldDk[var51] == null) {
                                    if (DUMMY <= -1865916510) {
                                        throw new IllegalStateException();
                                    }

                                    DynamicObject.fieldDk[var51] = UnknownEnum3.fieldBi.getFile(UtilClass38.fieldDh[var51], 0, (short) 31078);
                                    if (DynamicObject.fieldDk[var51] == null) {
                                        if (DUMMY <= -1865916510) {
                                            throw new IllegalStateException();
                                        }

                                        var53 = false;
                                        fieldDp += -796486731;
                                    }
                                }

                                if (-1 != classEp.fieldDf[var51]) {
                                    if (DUMMY <= -1865916510) {
                                        throw new IllegalStateException();
                                    }

                                    if (null == ItemTable.fieldDr[var51]) {
                                        ItemTable.fieldDr[var51] = UnknownEnum3.fieldBi.b(classEp.fieldDf[var51], 0, classAw.fieldDw[var51], -764090660);
                                        if (null == ItemTable.fieldDr[var51]) {
                                            if (DUMMY <= -1865916510) {
                                                throw new IllegalStateException();
                                            }

                                            var53 = false;
                                            fieldDp += -796486731;
                                        }
                                    }
                                }
                            }

                            if (!var53) {
                                fieldDo = 1141329083;
                            } else {
                                fieldDj = 0;
                                var53 = true;

                                int var5;
                                int var6;
                                int var11;
                                int var12;
                                int var13;
                                int var15;
                                int var16;
                                int var17;
                                int var18;
                                int var19;
                                int var20;
                                for (var51 = 0; var51 < DynamicObject.fieldDk.length; ++var51) {
                                    if (DUMMY <= -1865916510) {
                                        return;
                                    }

                                    byte[] var4 = ItemTable.fieldDr[var51];
                                    if (null != var4) {
                                        if (DUMMY <= -1865916510) {
                                            throw new IllegalStateException();
                                        }

                                        var5 = 64 * (WidgetNode.fieldDq[var51] >> 8) - classDc.baseX * -2071335905;
                                        var6 = (WidgetNode.fieldDq[var51] & 255) * 64 - CalendarUtil.baseY * -1046564359;
                                        if (fieldDt) {
                                            if (DUMMY <= -1865916510) {
                                                throw new IllegalStateException();
                                            }

                                            var5 = 10;
                                            var6 = 10;
                                        }

                                        boolean var9 = true;
                                        Buffer var10 = new Buffer(var4);
                                        var11 = -1;

                                        label1797:
                                        while (true) {
                                            var12 = var10.readImmediateSmart(1953799824);
                                            if (0 == var12) {
                                                if (DUMMY <= -1865916510) {
                                                    return;
                                                }

                                                var53 &= var9;
                                                break;
                                            }

                                            var11 += var12;
                                            var13 = 0;
                                            boolean var14 = false;

                                            while (true) {
                                                while (!var14) {
                                                    var15 = var10.readImmediateSmart(2112013398);
                                                    if (var15 == 0) {
                                                        if (DUMMY <= -1865916510) {
                                                            throw new IllegalStateException();
                                                        }
                                                        continue label1797;
                                                    }

                                                    var13 += var15 - 1;
                                                    var16 = var13 & 63;
                                                    var17 = var13 >> 6 & 63;
                                                    var18 = var10.readUByte() >> 2;
                                                    var19 = var17 + var5;
                                                    var20 = var16 + var6;
                                                    if (var19 > 0 && var20 > 0) {
                                                        if (DUMMY <= -1865916510) {
                                                            throw new IllegalStateException();
                                                        }

                                                        if (var19 < 103) {
                                                            if (DUMMY <= -1865916510) {
                                                                throw new IllegalStateException();
                                                            }

                                                            if (var20 < 103) {
                                                                ObjectDefinition var21 = PlayerConfig.getObjectDef(var11, -179082373);
                                                                if (22 == var18) {
                                                                    if (DUMMY <= -1865916510) {
                                                                        return;
                                                                    }

                                                                    if (lowMemory) { //landscape related objdef shit?
                                                                        if (0 == var21.fieldG * 243222597) {
                                                                            if (1 != var21.fieldU * 2025817487) {
                                                                                if (!var21.fieldAt) {
                                                                                    continue;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }

                                                                if (!var21.w(2022969504)) {
                                                                    fieldDj += -150514415;
                                                                    var9 = false;
                                                                }

                                                                var14 = true;
                                                            }
                                                        }
                                                    }
                                                }

                                                if (DUMMY <= -1865916510) {
                                                    return;
                                                }

                                                var15 = var10.readImmediateSmart(2118536973);
                                                if (var15 == 0) {
                                                    if (DUMMY <= -1865916510) {
                                                        throw new IllegalStateException();
                                                    }
                                                    break;
                                                }

                                                var10.readUByte();
                                            }
                                        }
                                    }
                                }

                                if (!var53) {
                                    if (DUMMY <= -1865916510) {
                                        throw new IllegalStateException();
                                    }

                                    fieldDo = -2012309130;
                                } else {
                                    if (fieldDo * -1750787981 != 0) {
                                        if (DUMMY <= -1865916510) {
                                            return;
                                        }

                                        ItemPile.method339(StringConstants.fieldS + UtilClass41.fieldW + UtilClass41.openParanthesis + 100 + "%" + UtilClass41.closeParanthesis, true, -789427325);
                                    }

                                    UtilClass39.method176(1159817177);
                                    AnimationSequence.method411(2077409627);
                                    UtilClass39.method176(-360030500);
                                    landscape.clear();
                                    UtilClass39.method176(742057226);
                                    System.gc();

                                    for (var51 = 0; var51 < 4; ++var51) {
                                        if (DUMMY <= -1865916510) {
                                            throw new IllegalStateException();
                                        }

                                        collisionMaps[var51].a(-99949288);
                                    }

                                    int var52;
                                    for (var51 = 0; var51 < 4; ++var51) {
                                        for (var52 = 0; var52 < 104; ++var52) {
                                            if (DUMMY <= -1865916510) {
                                                throw new IllegalStateException();
                                            }

                                            for (var5 = 0; var5 < 104; ++var5) {
                                                if (DUMMY <= -1865916510) {
                                                    throw new IllegalStateException();
                                                }

                                                classM.renderRules[var51][var52][var5] = 0;
                                            }
                                        }
                                    }

                                    UtilClass39.method176(1424455101);
                                    classAp.method402(1101151440);
                                    var51 = DynamicObject.fieldDk.length;
                                    TaskHandler.method278(1143653083);
                                    classGn.method24(true, 651432265);
                                    int var8;
                                    int var55;
                                    int var59;
                                    int var64;
                                    if (!fieldDt) {
                                        byte[] var7;
                                        for (var52 = 0; var52 < var51; ++var52) {
                                            if (DUMMY <= -1865916510) {
                                                return;
                                            }

                                            var5 = 64 * (WidgetNode.fieldDq[var52] >> 8) - classDc.baseX * -2071335905;
                                            var6 = (WidgetNode.fieldDq[var52] & 255) * 64 - CalendarUtil.baseY * -1046564359;
                                            var7 = DynamicObject.fieldDk[var52];
                                            if (null != var7) {
                                                UtilClass39.method176(1403380948);
                                                var8 = classDm.fieldDg * -59606296 - 48;
                                                var59 = GraphicsStub.fieldDd * 319945144 - 48;
                                                CollisionMap[] var61 = collisionMaps;

                                                for (var11 = 0; var11 < 4; ++var11) {
                                                    if (DUMMY <= -1865916510) {
                                                        throw new IllegalStateException();
                                                    }

                                                    for (var12 = 0; var12 < 64; ++var12) {
                                                        if (DUMMY <= -1865916510) {
                                                            throw new IllegalStateException();
                                                        }

                                                        for (var13 = 0; var13 < 64; ++var13) {
                                                            if (DUMMY <= -1865916510) {
                                                                throw new IllegalStateException();
                                                            }

                                                            if (var5 + var12 > 0) {
                                                                if (DUMMY <= -1865916510) {
                                                                    return;
                                                                }

                                                                if (var12 + var5 < 103) {
                                                                    if (DUMMY <= -1865916510) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    if (var13 + var6 > 0) {
                                                                        if (DUMMY <= -1865916510) {
                                                                            return;
                                                                        }

                                                                        if (var6 + var13 < 103) {
                                                                            if (DUMMY <= -1865916510) {
                                                                                return;
                                                                            }

                                                                            var61[var11].flags[var12 + var5][var13 + var6] &= -16777217;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }

                                                Buffer var63 = new Buffer(var7);

                                                for (var12 = 0; var12 < 4; ++var12) {
                                                    if (DUMMY <= -1865916510) {
                                                        return;
                                                    }

                                                    for (var13 = 0; var13 < 64; ++var13) {
                                                        for (var64 = 0; var64 < 64; ++var64) {
                                                            if (DUMMY <= -1865916510) {
                                                                throw new IllegalStateException();
                                                            }

                                                            classBt.method255(var63, var12, var5 + var13, var6 + var64, var8, var59, 0, (byte) 2);
                                                        }
                                                    }
                                                }
                                            }
                                        }

                                        for (var52 = 0; var52 < var51; ++var52) {
                                            if (DUMMY <= -1865916510) {
                                                return;
                                            }

                                            var5 = 64 * (WidgetNode.fieldDq[var52] >> 8) - classDc.baseX * -2071335905;
                                            var6 = (WidgetNode.fieldDq[var52] & 255) * 64 - CalendarUtil.baseY * -1046564359;
                                            var7 = DynamicObject.fieldDk[var52];
                                            if (var7 == null) {
                                                if (DUMMY <= -1865916510) {
                                                    throw new IllegalStateException();
                                                }

                                                if (GraphicsStub.fieldDd * 39993143 < 800) {
                                                    if (DUMMY <= -1865916510) {
                                                        throw new IllegalStateException();
                                                    }

                                                    UtilClass39.method176(59013055);
                                                    BoundaryDecoration.method206(var5, var6, 64, 64, 1683410190);
                                                }
                                            }
                                        }

                                        classGn.method24(true, 651432265);

                                        for (var52 = 0; var52 < var51; ++var52) {
                                            if (DUMMY <= -1865916510) {
                                                return;
                                            }

                                            byte[] var54 = ItemTable.fieldDr[var52];
                                            if (var54 != null) {
                                                var6 = (WidgetNode.fieldDq[var52] >> 8) * 64 - classDc.baseX * -2071335905;
                                                var55 = (WidgetNode.fieldDq[var52] & 255) * 64 - CalendarUtil.baseY * -1046564359;
                                                UtilClass39.method176(-663886050);
                                                ScriptStackElement.method91(var54, var6, var55, landscape, collisionMaps, 79843573);
                                            }
                                        }
                                    }

                                    int var62;
                                    if (fieldDt) {
                                        if (DUMMY <= -1865916510) {
                                            throw new IllegalStateException();
                                        }

                                        for (var52 = 0; var52 < 4; ++var52) {
                                            if (DUMMY <= -1865916510) {
                                                return;
                                            }

                                            UtilClass39.method176(455992953);

                                            for (var5 = 0; var5 < 13; ++var5) {
                                                for (var6 = 0; var6 < 13; ++var6) {
                                                    if (DUMMY <= -1865916510) {
                                                        throw new IllegalStateException();
                                                    }

                                                    boolean var56 = false;
                                                    var8 = regionChunkIds[var52][var5][var6];
                                                    if (-1 != var8) {
                                                        if (DUMMY <= -1865916510) {
                                                            throw new IllegalStateException();
                                                        }

                                                        var59 = var8 >> 24 & 3;
                                                        var62 = var8 >> 1 & 3;
                                                        var11 = var8 >> 14 & 1023;
                                                        var12 = var8 >> 3 & 2047;
                                                        var13 = var12 / 8 + (var11 / 8 << 8);

                                                        for (var64 = 0; var64 < WidgetNode.fieldDq.length; ++var64) {
                                                            if (DUMMY <= -1865916510) {
                                                                return;
                                                            }

                                                            if (WidgetNode.fieldDq[var64] == var13) {
                                                                if (DUMMY <= -1865916510) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                if (DynamicObject.fieldDk[var64] != null) {
                                                                    if (DUMMY <= -1865916510) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    classFl.method12(DynamicObject.fieldDk[var64], var52, var5 * 8, var6 * 8, var59, 8 * (var11 & 7), 8 * (var12 & 7), var62, collisionMaps, 433178466);
                                                                    var56 = true;
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }

                                                    if (!var56) {
                                                        if (DUMMY <= -1865916510) {
                                                            throw new IllegalStateException();
                                                        }

                                                        classDa.method281(var52, var5 * 8, var6 * 8, (byte) 68);
                                                    }
                                                }
                                            }
                                        }

                                        for (var52 = 0; var52 < 13; ++var52) {
                                            if (DUMMY <= -1865916510) {
                                                return;
                                            }

                                            for (var5 = 0; var5 < 13; ++var5) {
                                                if (DUMMY <= -1865916510) {
                                                    return;
                                                }

                                                var6 = regionChunkIds[0][var52][var5];
                                                if (-1 == var6) {
                                                    if (DUMMY <= -1865916510) {
                                                        return;
                                                    }

                                                    BoundaryDecoration.method206(8 * var52, 8 * var5, 8, 8, 39312479);
                                                }
                                            }
                                        }

                                        classGn.method24(true, 651432265);

                                        for (var52 = 0; var52 < 4; ++var52) {
                                            if (DUMMY <= -1865916510) {
                                                throw new IllegalStateException();
                                            }

                                            UtilClass39.method176(-1131800390);

                                            for (var5 = 0; var5 < 13; ++var5) {
                                                if (DUMMY <= -1865916510) {
                                                    throw new IllegalStateException();
                                                }

                                                for (var6 = 0; var6 < 13; ++var6) {
                                                    var55 = regionChunkIds[var52][var5][var6];
                                                    if (var55 != -1) {
                                                        if (DUMMY <= -1865916510) {
                                                            throw new IllegalStateException();
                                                        }

                                                        var8 = var55 >> 24 & 3;
                                                        var59 = var55 >> 1 & 3;
                                                        var62 = var55 >> 14 & 1023;
                                                        var11 = var55 >> 3 & 2047;
                                                        var12 = var11 / 8 + (var62 / 8 << 8);

                                                        for (var13 = 0; var13 < WidgetNode.fieldDq.length; ++var13) {
                                                            if (var12 == WidgetNode.fieldDq[var13]) {
                                                                if (DUMMY <= -1865916510) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                if (null != ItemTable.fieldDr[var13]) {
                                                                    if (DUMMY <= -1865916510) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    TextureManagerImpl.method345(ItemTable.fieldDr[var13], var52, 8 * var5, 8 * var6, var8, (var62 & 7) * 8, 8 * (var11 & 7), var59, landscape, collisionMaps, (byte) -1);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }

                                    classGn.method24(true, 651432265);
                                    AnimationSequence.method411(2077409627);
                                    UtilClass39.method176(-2055517930);
                                    Landscape var57 = landscape;
                                    CollisionMap[] var58 = collisionMaps;

                                    for (var6 = 0; var6 < 4; ++var6) {
                                        if (DUMMY <= -1865916510) {
                                            return;
                                        }

                                        for (var55 = 0; var55 < 104; ++var55) {
                                            if (DUMMY <= -1865916510) {
                                                return;
                                            }

                                            for (var8 = 0; var8 < 104; ++var8) {
                                                if (DUMMY <= -1865916510) {
                                                    throw new IllegalStateException();
                                                }

                                                if ((classM.renderRules[var6][var55][var8] & 1) == 1) {
                                                    var59 = var6;
                                                    if (2 == (classM.renderRules[1][var55][var8] & 2)) {
                                                        if (DUMMY <= -1865916510) {
                                                            return;
                                                        }

                                                        var59 = var6 - 1;
                                                    }

                                                    if (var59 >= 0) {
                                                        if (DUMMY <= -1865916510) {
                                                            throw new IllegalStateException();
                                                        }

                                                        var58[var59].b(var55, var8, 2029411137);
                                                    }
                                                }
                                            }
                                        }
                                    }

                                    classM.fieldZ += ((int) (Math.random() * 5.0D) - 2) * 13476519;
                                    if (classM.fieldZ * -794696425 < -8) {
                                        if (DUMMY <= -1865916510) {
                                            throw new IllegalStateException();
                                        }

                                        classM.fieldZ = -107812152;
                                    }

                                    if (classM.fieldZ * -794696425 > 8) {
                                        if (DUMMY <= -1865916510) {
                                            return;
                                        }

                                        classM.fieldZ = 107812152;
                                    }

                                    classM.fieldC += ((int) (Math.random() * 5.0D) - 2) * -791528103;
                                    if (classM.fieldC * 750795497 < -16) {
                                        classM.fieldC = -220452240;
                                    }

                                    if (classM.fieldC * 750795497 > 16) {
                                        if (DUMMY <= -1865916510) {
                                            throw new IllegalStateException();
                                        }

                                        classM.fieldC = 220452240;
                                    }

                                    int var22;
                                    int var68;
                                    for (var6 = 0; var6 < 4; ++var6) {
                                        if (DUMMY <= -1865916510) {
                                            throw new IllegalStateException();
                                        }

                                        byte[][] var60 = classCn.fieldE[var6];
                                        var13 = (int) Math.sqrt(5100.0D);
                                        var64 = 768 * var13 >> 8;

                                        int var23;
                                        int var24;
                                        for (var15 = 1; var15 < 103; ++var15) {
                                            if (DUMMY <= -1865916510) {
                                                return;
                                            }

                                            for (var16 = 1; var16 < 103; ++var16) {
                                                if (DUMMY <= -1865916510) {
                                                    return;
                                                }

                                                var17 = classM.tileHeights[var6][var16 + 1][var15] - classM.tileHeights[var6][var16 - 1][var15];
                                                var18 = classM.tileHeights[var6][var16][var15 + 1] - classM.tileHeights[var6][var16][var15 - 1];
                                                var19 = (int) Math.sqrt((double) (var17 * var17 + 65536 + var18 * var18));
                                                var20 = (var17 << 8) / var19;
                                                var68 = 65536 / var19;
                                                var22 = (var18 << 8) / var19;
                                                var23 = 96 + (var20 * -50 + var68 * -10 + var22 * -50) / var64;
                                                var24 = (var60[var16][var15] >> 1) + (var60[var16][var15 - 1] >> 2) + (var60[1 + var16][var15] >> 3) + (var60[var16 - 1][var15] >> 2) + (var60[var16][1 + var15] >> 3);
                                                World.fieldN[var16][var15] = var23 - var24;
                                            }
                                        }

                                        for (var15 = 0; var15 < 104; ++var15) {
                                            if (DUMMY <= -1865916510) {
                                                throw new IllegalStateException();
                                            }

                                            classM.fieldS[var15] = 0;
                                            classM.fieldK[var15] = 0;
                                            classM.fieldF[var15] = 0;
                                            classM.fieldD[var15] = 0;
                                            ItemTable.fieldX[var15] = 0;
                                        }

                                        for (var15 = -5; var15 < 109; ++var15) {
                                            if (DUMMY <= -1865916510) {
                                                throw new IllegalStateException();
                                            }

                                            for (var16 = 0; var16 < 104; ++var16) {
                                                if (DUMMY <= -1865916510) {
                                                    throw new IllegalStateException();
                                                }

                                                var17 = var15 + 5;
                                                if (var17 >= 0) {
                                                    if (DUMMY <= -1865916510) {
                                                        return;
                                                    }

                                                    if (var17 < 104) {
                                                        if (DUMMY <= -1865916510) {
                                                            return;
                                                        }

                                                        var18 = classM.fieldB[var6][var17][var16] & 255;
                                                        if (var18 > 0) {
                                                            var20 = var18 - 1;
                                                            classAi var69 = (classAi) classAi.fieldV.get((long) var20);
                                                            classAi var65;
                                                            if (null != var69) {
                                                                var65 = var69;
                                                            } else {
                                                                byte[] var70 = classAi.fieldA.getFile(1, var20, (short) 14803);
                                                                var69 = new classAi();
                                                                if (null != var70) {
                                                                    var69.i(new Buffer(var70), var20, (byte) 0);
                                                                }

                                                                var69.v(739446497);
                                                                classAi.fieldV.put(var69, (long) var20);
                                                                var65 = var69;
                                                            }

                                                            classM.fieldS[var16] += var65.fieldB * 145323297;
                                                            classM.fieldK[var16] += var65.fieldL * -401044417;
                                                            classM.fieldF[var16] += var65.fieldM * -578578097;
                                                            classM.fieldD[var16] += var65.fieldW * 1325321055;
                                                            ++ItemTable.fieldX[var16];
                                                        }
                                                    }
                                                }

                                                var18 = var15 - 5;
                                                if (var18 >= 0) {
                                                    if (DUMMY <= -1865916510) {
                                                        return;
                                                    }

                                                    if (var18 < 104) {
                                                        if (DUMMY <= -1865916510) {
                                                            throw new IllegalStateException();
                                                        }

                                                        var19 = classM.fieldB[var6][var18][var16] & 255;
                                                        if (var19 > 0) {
                                                            if (DUMMY <= -1865916510) {
                                                                return;
                                                            }

                                                            var68 = var19 - 1;
                                                            classAi var71 = (classAi) classAi.fieldV.get((long) var68);
                                                            classAi var67;
                                                            if (var71 != null) {
                                                                if (DUMMY <= -1865916510) {
                                                                    return;
                                                                }

                                                                var67 = var71;
                                                            } else {
                                                                byte[] var72 = classAi.fieldA.getFile(1, var68, (short) 6842);
                                                                var71 = new classAi();
                                                                if (null != var72) {
                                                                    var71.i(new Buffer(var72), var68, (byte) 0);
                                                                }

                                                                var71.v(1526680915);
                                                                classAi.fieldV.put(var71, (long) var68);
                                                                var67 = var71;
                                                            }

                                                            classM.fieldS[var16] -= var67.fieldB * 145323297;
                                                            classM.fieldK[var16] -= var67.fieldL * -401044417;
                                                            classM.fieldF[var16] -= var67.fieldM * -578578097;
                                                            classM.fieldD[var16] -= var67.fieldW * 1325321055;
                                                            --ItemTable.fieldX[var16];
                                                        }
                                                    }
                                                }
                                            }

                                            if (var15 >= 1) {
                                                if (DUMMY <= -1865916510) {
                                                    return;
                                                }

                                                if (var15 < 103) {
                                                    if (DUMMY <= -1865916510) {
                                                        throw new IllegalStateException();
                                                    }

                                                    var16 = 0;
                                                    var17 = 0;
                                                    var18 = 0;
                                                    var19 = 0;
                                                    var20 = 0;

                                                    for (var68 = -5; var68 < 109; ++var68) {
                                                        if (DUMMY <= -1865916510) {
                                                            throw new IllegalStateException();
                                                        }

                                                        var22 = var68 + 5;
                                                        if (var22 >= 0) {
                                                            if (DUMMY <= -1865916510) {
                                                                throw new IllegalStateException();
                                                            }

                                                            if (var22 < 104) {
                                                                if (DUMMY <= -1865916510) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                var16 += classM.fieldS[var22];
                                                                var17 += classM.fieldK[var22];
                                                                var18 += classM.fieldF[var22];
                                                                var19 += classM.fieldD[var22];
                                                                var20 += ItemTable.fieldX[var22];
                                                            }
                                                        }

                                                        var23 = var68 - 5;
                                                        if (var23 >= 0) {
                                                            if (DUMMY <= -1865916510) {
                                                                return;
                                                            }

                                                            if (var23 < 104) {
                                                                if (DUMMY <= -1865916510) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                var16 -= classM.fieldS[var23];
                                                                var17 -= classM.fieldK[var23];
                                                                var18 -= classM.fieldF[var23];
                                                                var19 -= classM.fieldD[var23];
                                                                var20 -= ItemTable.fieldX[var23];
                                                            }
                                                        }

                                                        if (var68 >= 1) {
                                                            if (DUMMY <= -1865916510) {
                                                                throw new IllegalStateException();
                                                            }

                                                            if (var68 < 103) {
                                                                if (DUMMY <= -1865916510) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                if (lowMemory) {
                                                                    if (0 == (classM.renderRules[0][var15][var68] & 2)) {
                                                                        if (0 != (classM.renderRules[var6][var15][var68] & 16)) {
                                                                            continue;
                                                                        }

                                                                        if ((classM.renderRules[var6][var15][var68] & 8) != 0) {
                                                                            if (DUMMY <= -1865916510) {
                                                                                throw new IllegalStateException();
                                                                            }

                                                                            var24 = 0;
                                                                        } else {
                                                                            label1555:
                                                                            {
                                                                                if (var6 > 0) {
                                                                                    if (DUMMY <= -1865916510) {
                                                                                        throw new IllegalStateException();
                                                                                    }

                                                                                    if (0 != (classM.renderRules[1][var15][var68] & 2)) {
                                                                                        var24 = var6 - 1;
                                                                                        break label1555;
                                                                                    }
                                                                                }

                                                                                var24 = var6;
                                                                            }
                                                                        }

                                                                        if (fieldCs * -526352391 != var24) {
                                                                            continue;
                                                                        }
                                                                    }
                                                                }

                                                                if (var6 < classM.fieldI * -364622169) {
                                                                    if (DUMMY <= -1865916510) {
                                                                        return;
                                                                    }

                                                                    classM.fieldI = -2049935081 * var6;
                                                                }

                                                                var24 = classM.fieldB[var6][var15][var68] & 255;
                                                                int var25 = classBy.fieldL[var6][var15][var68] & 255;
                                                                if (var24 <= 0) {
                                                                    if (DUMMY <= -1865916510) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    if (var25 <= 0) {
                                                                        continue;
                                                                    }
                                                                }

                                                                int var26 = classM.tileHeights[var6][var15][var68];
                                                                int var27 = classM.tileHeights[var6][var15 + 1][var68];
                                                                int var28 = classM.tileHeights[var6][var15 + 1][1 + var68];
                                                                int var29 = classM.tileHeights[var6][var15][1 + var68];
                                                                int var30 = World.fieldN[var15][var68];
                                                                int var31 = World.fieldN[var15 + 1][var68];
                                                                int var32 = World.fieldN[var15 + 1][1 + var68];
                                                                int var33 = World.fieldN[var15][1 + var68];
                                                                int var34 = -1;
                                                                int var35 = -1;
                                                                int var36;
                                                                int var37;
                                                                int var38;
                                                                if (var24 > 0) {
                                                                    if (DUMMY <= -1865916510) {
                                                                        return;
                                                                    }

                                                                    var36 = 256 * var16 / var19;
                                                                    var37 = var17 / var20;
                                                                    var38 = var18 / var20;
                                                                    var34 = UtilClass31.method30(var36, var37, var38, 971834698);
                                                                    var36 = classM.fieldZ * -794696425 + var36 & 255;
                                                                    var38 += classM.fieldC * 750795497;
                                                                    if (var38 < 0) {
                                                                        var38 = 0;
                                                                    } else if (var38 > 255) {
                                                                        var38 = 255;
                                                                    }

                                                                    var35 = UtilClass31.method30(var36, var37, var38, 1066245000);
                                                                }

                                                                classAo var39;
                                                                if (var6 > 0) {
                                                                    boolean var73 = true;
                                                                    if (var24 == 0) {
                                                                        if (DUMMY <= -1865916510) {
                                                                            return;
                                                                        }

                                                                        if (classM.fieldM[var6][var15][var68] != 0) {
                                                                            if (DUMMY <= -1865916510) {
                                                                                throw new IllegalStateException();
                                                                            }

                                                                            var73 = false;
                                                                        }
                                                                    }

                                                                    if (var25 > 0) {
                                                                        if (DUMMY <= -1865916510) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        var38 = var25 - 1;
                                                                        var39 = (classAo) classAo.fieldV.get((long) var38);
                                                                        classAo var74;
                                                                        if (null != var39) {
                                                                            var74 = var39;
                                                                        } else {
                                                                            byte[] var40 = classAo.fieldA.getFile(4, var38, (short) 29669);
                                                                            var39 = new classAo();
                                                                            if (var40 != null) {
                                                                                if (DUMMY <= -1865916510) {
                                                                                    throw new IllegalStateException();
                                                                                }

                                                                                var39.v(new Buffer(var40), var38, -917071977);
                                                                            }

                                                                            var39.a(1347779008);
                                                                            classAo.fieldV.put(var39, (long) var38);
                                                                            var74 = var39;
                                                                        }

                                                                        if (!var74.fieldL) {
                                                                            var73 = false;
                                                                        }
                                                                    }

                                                                    if (var73) {
                                                                        if (DUMMY <= -1865916510) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        if (var27 == var26) {
                                                                            if (DUMMY <= -1865916510) {
                                                                                return;
                                                                            }

                                                                            if (var26 == var28) {
                                                                                if (DUMMY <= -1865916510) {
                                                                                    throw new IllegalStateException();
                                                                                }

                                                                                if (var29 == var26) {
                                                                                    if (DUMMY <= -1865916510) {
                                                                                        throw new IllegalStateException();
                                                                                    }

                                                                                    Buffer.fieldO[var6][var15][var68] |= 2340;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }

                                                                var36 = 0;
                                                                if (var35 != -1) {
                                                                    if (DUMMY <= -1865916510) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    var36 = RSGraphics2D.fieldAn[AnimationSequence.method410(var35, 96, -403535838)];
                                                                }

                                                                if (0 == var25) {
                                                                    if (DUMMY <= -1865916510) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    var57.m(var6, var15, var68, 0, 0, -1, var26, var27, var28, var29, AnimationSequence.method410(var34, var30, -403535838), AnimationSequence.method410(var34, var31, -403535838), AnimationSequence.method410(var34, var32, -403535838), AnimationSequence.method410(var34, var33, -403535838), 0, 0, 0, 0, var36, 0);
                                                                } else {
                                                                    var37 = 1 + classM.fieldM[var6][var15][var68];
                                                                    byte var75 = classM.fieldW[var6][var15][var68];
                                                                    int var76 = var25 - 1;
                                                                    classAo var41 = (classAo) classAo.fieldV.get((long) var76);
                                                                    if (var41 != null) {
                                                                        var39 = var41;
                                                                    } else {
                                                                        byte[] var42 = classAo.fieldA.getFile(4, var76, (short) 23969);
                                                                        var41 = new classAo();
                                                                        if (var42 != null) {
                                                                            if (DUMMY <= -1865916510) {
                                                                                return;
                                                                            }

                                                                            var41.v(new Buffer(var42), var76, -917071977);
                                                                        }

                                                                        var41.a(699810886);
                                                                        classAo.fieldV.put(var41, (long) var76);
                                                                        var39 = var41;
                                                                    }

                                                                    int var77 = var39.fieldB * 1314730669;
                                                                    int var43;
                                                                    int var44;
                                                                    int var45;
                                                                    int var46;
                                                                    if (var77 >= 0) {
                                                                        if (DUMMY <= -1865916510) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        var44 = RSGraphics2D.fieldAs.v(var77, (byte) 10);
                                                                        var43 = -1;
                                                                    } else if (var39.fieldI * -190994435 == 16711935) {
                                                                        if (DUMMY <= -1865916510) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        var43 = -2;
                                                                        var77 = -1;
                                                                        var44 = -2;
                                                                    } else {
                                                                        var43 = UtilClass31.method30(var39.fieldW * -1295556315, var39.fieldE * -1003545793, var39.fieldN * -161785657, 1125474927);
                                                                        var45 = var39.fieldW * -1295556315 + classM.fieldZ * -794696425 & 255;
                                                                        var46 = classM.fieldC * 750795497 + var39.fieldN * -161785657;
                                                                        if (var46 < 0) {
                                                                            if (DUMMY <= -1865916510) {
                                                                                return;
                                                                            }

                                                                            var46 = 0;
                                                                        } else if (var46 > 255) {
                                                                            if (DUMMY <= -1865916510) {
                                                                                throw new IllegalStateException();
                                                                            }

                                                                            var46 = 255;
                                                                        }

                                                                        var44 = UtilClass31.method30(var45, var39.fieldE * -1003545793, var46, 679942957);
                                                                    }

                                                                    var45 = 0;
                                                                    if (var44 != -2) {
                                                                        var45 = RSGraphics2D.fieldAn[classM.method130(var44, 96, -130305283)];
                                                                    }

                                                                    if (-1 != var39.fieldM * 5993219) {
                                                                        if (DUMMY <= -1865916510) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        var46 = var39.fieldS * -1263165603 + classM.fieldZ * -794696425 & 255;
                                                                        int var47 = var39.fieldF * 19465345 + classM.fieldC * 750795497;
                                                                        if (var47 < 0) {
                                                                            if (DUMMY <= -1865916510) {
                                                                                throw new IllegalStateException();
                                                                            }

                                                                            var47 = 0;
                                                                        } else if (var47 > 255) {
                                                                            if (DUMMY <= -1865916510) {
                                                                                return;
                                                                            }

                                                                            var47 = 255;
                                                                        }

                                                                        var44 = UtilClass31.method30(var46, var39.fieldK * 244552873, var47, 1543008995);
                                                                        var45 = RSGraphics2D.fieldAn[classM.method130(var44, 96, 1294922484)];
                                                                    }

                                                                    var57.m(var6, var15, var68, var37, var75, var77, var26, var27, var28, var29, AnimationSequence.method410(var34, var30, -403535838), AnimationSequence.method410(var34, var31, -403535838), AnimationSequence.method410(var34, var32, -403535838), AnimationSequence.method410(var34, var33, -403535838), classM.method130(var43, var30, 343122959), classM.method130(var43, var31, 2039920507), classM.method130(var43, var32, 699919734), classM.method130(var43, var33, 516650075), var36, var45);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }

                                        for (var15 = 1; var15 < 103; ++var15) {
                                            if (DUMMY <= -1865916510) {
                                                throw new IllegalStateException();
                                            }

                                            for (var16 = 1; var16 < 103; ++var16) {
                                                if (DUMMY <= -1865916510) {
                                                    return;
                                                }

                                                if (0 != (classM.renderRules[var6][var16][var15] & 8)) {
                                                    if (DUMMY <= -1865916510) {
                                                        throw new IllegalStateException();
                                                    }

                                                    var68 = 0;
                                                } else {
                                                    label1527:
                                                    {
                                                        if (var6 > 0) {
                                                            if (DUMMY <= -1865916510) {
                                                                throw new IllegalStateException();
                                                            }

                                                            if (0 != (classM.renderRules[1][var16][var15] & 2)) {
                                                                var68 = var6 - 1;
                                                                break label1527;
                                                            }
                                                        }

                                                        var68 = var6;
                                                    }
                                                }

                                                var57.l(var6, var16, var15, var68);
                                            }
                                        }

                                        classM.fieldB[var6] = (byte[][]) null;
                                        classBy.fieldL[var6] = (byte[][]) null;
                                        classM.fieldM[var6] = (byte[][]) null;
                                        classM.fieldW[var6] = (byte[][]) null;
                                        classCn.fieldE[var6] = (byte[][]) null;
                                    }

                                    var57.av(-50, -10, -50);

                                    for (var6 = 0; var6 < 104; ++var6) {
                                        if (DUMMY <= -1865916510) {
                                            return;
                                        }

                                        for (var55 = 0; var55 < 104; ++var55) {
                                            if (DUMMY <= -1865916510) {
                                                throw new IllegalStateException();
                                            }

                                            if ((classM.renderRules[1][var6][var55] & 2) == 2) {
                                                if (DUMMY <= -1865916510) {
                                                    throw new IllegalStateException();
                                                }

                                                var57.i(var6, var55);
                                            }
                                        }
                                    }

                                    var6 = 1;
                                    var55 = 2;
                                    var8 = 4;

                                    for (var59 = 0; var59 < 4; ++var59) {
                                        if (DUMMY <= -1865916510) {
                                            throw new IllegalStateException();
                                        }

                                        if (var59 > 0) {
                                            if (DUMMY <= -1865916510) {
                                                return;
                                            }

                                            var6 <<= 3;
                                            var55 <<= 3;
                                            var8 <<= 3;
                                        }

                                        for (var62 = 0; var62 <= var59; ++var62) {
                                            for (var11 = 0; var11 <= 104; ++var11) {
                                                for (var12 = 0; var12 <= 104; ++var12) {
                                                    short var66;
                                                    if (0 != (Buffer.fieldO[var62][var12][var11] & var6)) {
                                                        if (DUMMY <= -1865916510) {
                                                            throw new IllegalStateException();
                                                        }

                                                        var13 = var11;
                                                        var64 = var11;
                                                        var15 = var62;

                                                        for (var16 = var62; var13 > 0; --var13) {
                                                            if (DUMMY <= -1865916510) {
                                                                return;
                                                            }

                                                            if ((Buffer.fieldO[var62][var12][var13 - 1] & var6) == 0) {
                                                                break;
                                                            }

                                                            if (DUMMY <= -1865916510) {
                                                                throw new IllegalStateException();
                                                            }
                                                        }

                                                        while (var64 < 104) {
                                                            if (DUMMY <= -1865916510) {
                                                                throw new IllegalStateException();
                                                            }

                                                            if (0 == (Buffer.fieldO[var62][var12][1 + var64] & var6)) {
                                                                break;
                                                            }

                                                            if (DUMMY <= -1865916510) {
                                                                return;
                                                            }

                                                            ++var64;
                                                        }

                                                        label1347:
                                                        while (var15 > 0) {
                                                            if (DUMMY <= -1865916510) {
                                                                throw new IllegalStateException();
                                                            }

                                                            for (var17 = var13; var17 <= var64; ++var17) {
                                                                if (DUMMY <= -1865916510) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                if (0 == (Buffer.fieldO[var15 - 1][var12][var17] & var6)) {
                                                                    if (DUMMY <= -1865916510) {
                                                                        throw new IllegalStateException();
                                                                    }
                                                                    break label1347;
                                                                }
                                                            }

                                                            --var15;
                                                        }

                                                        label1361:
                                                        while (var16 < var59) {
                                                            if (DUMMY <= -1865916510) {
                                                                throw new IllegalStateException();
                                                            }

                                                            for (var17 = var13; var17 <= var64; ++var17) {
                                                                if (DUMMY <= -1865916510) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                if ((Buffer.fieldO[var16 + 1][var12][var17] & var6) == 0) {
                                                                    if (DUMMY <= -1865916510) {
                                                                        throw new IllegalStateException();
                                                                    }
                                                                    break label1361;
                                                                }
                                                            }

                                                            ++var16;
                                                        }

                                                        var17 = (1 + (var64 - var13)) * (1 + var16 - var15);
                                                        if (var17 >= 8) {
                                                            var66 = 240;
                                                            var19 = classM.tileHeights[var16][var12][var13] - var66;
                                                            var20 = classM.tileHeights[var15][var12][var13];
                                                            Landscape.method298(var59, 1, 128 * var12, 128 * var12, var13 * 128, 128 * var64 + 128, var19, var20);

                                                            for (var68 = var15; var68 <= var16; ++var68) {
                                                                if (DUMMY <= -1865916510) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                for (var22 = var13; var22 <= var64; ++var22) {
                                                                    if (DUMMY <= -1865916510) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    Buffer.fieldO[var68][var12][var22] &= ~var6;
                                                                }
                                                            }
                                                        }
                                                    }

                                                    if (0 != (Buffer.fieldO[var62][var12][var11] & var55)) {
                                                        if (DUMMY <= -1865916510) {
                                                            throw new IllegalStateException();
                                                        }

                                                        var13 = var12;
                                                        var64 = var12;
                                                        var15 = var62;

                                                        for (var16 = var62; var13 > 0; --var13) {
                                                            if (DUMMY <= -1865916510) {
                                                                throw new IllegalStateException();
                                                            }

                                                            if ((Buffer.fieldO[var62][var13 - 1][var11] & var55) == 0) {
                                                                break;
                                                            }

                                                            if (DUMMY <= -1865916510) {
                                                                throw new IllegalStateException();
                                                            }
                                                        }

                                                        while (var64 < 104) {
                                                            if (DUMMY <= -1865916510) {
                                                                throw new IllegalStateException();
                                                            }

                                                            if (0 == (Buffer.fieldO[var62][1 + var64][var11] & var55)) {
                                                                break;
                                                            }

                                                            if (DUMMY <= -1865916510) {
                                                                return;
                                                            }

                                                            ++var64;
                                                        }

                                                        label1404:
                                                        while (var15 > 0) {
                                                            if (DUMMY <= -1865916510) {
                                                                throw new IllegalStateException();
                                                            }

                                                            for (var17 = var13; var17 <= var64; ++var17) {
                                                                if (DUMMY <= -1865916510) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                if ((Buffer.fieldO[var15 - 1][var17][var11] & var55) == 0) {
                                                                    if (DUMMY <= -1865916510) {
                                                                        throw new IllegalStateException();
                                                                    }
                                                                    break label1404;
                                                                }
                                                            }

                                                            --var15;
                                                        }

                                                        label1418:
                                                        while (var16 < var59) {
                                                            if (DUMMY <= -1865916510) {
                                                                throw new IllegalStateException();
                                                            }

                                                            for (var17 = var13; var17 <= var64; ++var17) {
                                                                if (DUMMY <= -1865916510) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                if ((Buffer.fieldO[1 + var16][var17][var11] & var55) == 0) {
                                                                    break label1418;
                                                                }
                                                            }

                                                            ++var16;
                                                        }

                                                        var17 = (var64 - var13 + 1) * (var16 + 1 - var15);
                                                        if (var17 >= 8) {
                                                            if (DUMMY <= -1865916510) {
                                                                throw new IllegalStateException();
                                                            }

                                                            var66 = 240;
                                                            var19 = classM.tileHeights[var16][var13][var11] - var66;
                                                            var20 = classM.tileHeights[var15][var13][var11];
                                                            Landscape.method298(var59, 2, var13 * 128, 128 + 128 * var64, var11 * 128, 128 * var11, var19, var20);

                                                            for (var68 = var15; var68 <= var16; ++var68) {
                                                                if (DUMMY <= -1865916510) {
                                                                    return;
                                                                }

                                                                for (var22 = var13; var22 <= var64; ++var22) {
                                                                    Buffer.fieldO[var68][var22][var11] &= ~var55;
                                                                }
                                                            }
                                                        }
                                                    }

                                                    if ((Buffer.fieldO[var62][var12][var11] & var8) != 0) {
                                                        if (DUMMY <= -1865916510) {
                                                            throw new IllegalStateException();
                                                        }

                                                        var13 = var12;
                                                        var64 = var12;
                                                        var15 = var11;

                                                        for (var16 = var11; var15 > 0; --var15) {
                                                            if (DUMMY <= -1865916510) {
                                                                return;
                                                            }

                                                            if ((Buffer.fieldO[var62][var12][var15 - 1] & var8) == 0) {
                                                                break;
                                                            }
                                                        }

                                                        while (var16 < 104) {
                                                            if (DUMMY <= -1865916510) {
                                                                throw new IllegalStateException();
                                                            }

                                                            if (0 == (Buffer.fieldO[var62][var12][var16 + 1] & var8)) {
                                                                break;
                                                            }

                                                            if (DUMMY <= -1865916510) {
                                                                throw new IllegalStateException();
                                                            }

                                                            ++var16;
                                                        }

                                                        label1459:
                                                        while (var13 > 0) {
                                                            for (var17 = var15; var17 <= var16; ++var17) {
                                                                if (0 == (Buffer.fieldO[var62][var13 - 1][var17] & var8)) {
                                                                    break label1459;
                                                                }
                                                            }

                                                            --var13;
                                                        }

                                                        label1473:
                                                        while (var64 < 104) {
                                                            if (DUMMY <= -1865916510) {
                                                                throw new IllegalStateException();
                                                            }

                                                            for (var17 = var15; var17 <= var16; ++var17) {
                                                                if (DUMMY <= -1865916510) {
                                                                    return;
                                                                }

                                                                if (0 == (Buffer.fieldO[var62][var64 + 1][var17] & var8)) {
                                                                    break label1473;
                                                                }
                                                            }

                                                            ++var64;
                                                        }

                                                        if ((1 + (var16 - var15)) * (1 + (var64 - var13)) >= 4) {
                                                            var17 = classM.tileHeights[var62][var13][var15];
                                                            Landscape.method298(var59, 4, var13 * 128, 128 + var64 * 128, 128 * var15, 128 * var16 + 128, var17, var17);

                                                            for (var18 = var13; var18 <= var64; ++var18) {
                                                                if (DUMMY <= -1865916510) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                for (var19 = var15; var19 <= var16; ++var19) {
                                                                    if (DUMMY <= -1865916510) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    Buffer.fieldO[var62][var18][var19] &= ~var8;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }

                                    classGn.method24(true, 651432265);
                                    var6 = classM.fieldI * -364622169;
                                    if (var6 > floorLevel * 87713183) {
                                        if (DUMMY <= -1865916510) {
                                            return;
                                        }

                                        var6 = floorLevel * 87713183;
                                    }

                                    if (var6 < floorLevel * 87713183 - 1) {
                                        if (DUMMY <= -1865916510) {
                                            throw new IllegalStateException();
                                        }

                                        var6 = floorLevel * 87713183 - 1;
                                    }

                                    if (lowMemory) {
                                        landscape.v(classM.fieldI * -364622169);
                                    } else {
                                        landscape.v(0);
                                    }

                                    for (var55 = 0; var55 < 104; ++var55) {
                                        if (DUMMY <= -1865916510) {
                                            throw new IllegalStateException();
                                        }

                                        for (var8 = 0; var8 < 104; ++var8) {
                                            if (DUMMY <= -1865916510) {
                                                throw new IllegalStateException();
                                            }

                                            WidgetNode.method97(var55, var8);
                                        }
                                    }

                                    UtilClass39.method176(-1311860496);
                                    GroundItem.method100(1399222358);
                                    ObjectDefinition.fieldL.clear();
                                    if (Mouse.fieldPu != null) {
                                        if (DUMMY <= -1865916510) {
                                            throw new IllegalStateException();
                                        }

                                        fieldCo.writePacketHeader(183, (byte) 0);
                                        fieldCo.writeInt(1057001181);
                                    }

                                    if (!fieldDt) {
                                        if (DUMMY <= -1865916510) {
                                            throw new IllegalStateException();
                                        }

                                        var55 = (classDm.fieldDg * -1081192611 - 6) / 8;
                                        var8 = (classDm.fieldDg * -1081192611 + 6) / 8;
                                        var59 = (GraphicsStub.fieldDd * 39993143 - 6) / 8;
                                        var62 = (6 + GraphicsStub.fieldDd * 39993143) / 8;

                                        for (var11 = var55 - 1; var11 <= var8 + 1; ++var11) {
                                            if (DUMMY <= -1865916510) {
                                                throw new IllegalStateException();
                                            }

                                            for (var12 = var59 - 1; var12 <= var62 + 1; ++var12) {
                                                if (DUMMY <= -1865916510) {
                                                    throw new IllegalStateException();
                                                }

                                                if (var11 >= var55) {
                                                    if (DUMMY <= -1865916510) {
                                                        throw new IllegalStateException();
                                                    }

                                                    if (var11 <= var8 && var12 >= var59) {
                                                        if (DUMMY <= -1865916510) {
                                                            throw new IllegalStateException();
                                                        }

                                                        if (var12 <= var62) {
                                                            if (DUMMY <= -1865916510) {
                                                                return;
                                                            }
                                                            continue;
                                                        }
                                                    }
                                                }

                                                UnknownEnum3.fieldBi.p("m" + var11 + "_" + var12, -277734777);
                                                UnknownEnum3.fieldBi.p("l" + var11 + "_" + var12, 646442706);
                                            }
                                        }
                                    }

                                    UnknownEnum.method373(30, (byte) -21);
                                    UtilClass39.method176(-260287389);
                                    classM.fieldB = (byte[][][]) null;
                                    classBy.fieldL = (byte[][][]) null;
                                    classM.fieldM = (byte[][][]) null;
                                    classM.fieldW = (byte[][][]) null;
                                    Buffer.fieldO = (int[][][]) null;
                                    classCn.fieldE = (byte[][][]) null;
                                    World.fieldN = (int[][]) null;
                                    classM.fieldS = null;
                                    classM.fieldK = null;
                                    classM.fieldF = null;
                                    classM.fieldD = null;
                                    ItemTable.fieldX = null;
                                    fieldCo.writePacketHeader(195, (byte) 0);
                                    UtilClass5.fieldPk.v((byte) 14);

                                    for (var55 = 0; var55 < 32; ++var55) {
                                        if (DUMMY <= -1865916510) {
                                            throw new IllegalStateException();
                                        }

                                        fieldPx[var55] = 0L;
                                    }

                                    for (var55 = 0; var55 < 32; ++var55) {
                                        if (DUMMY <= -1865916510) {
                                            throw new IllegalStateException();
                                        }

                                        fieldPw[var55] = 0L;
                                    }

                                    classDz.fieldPe = 0;
                                }
                            }
                        }
                    } else {
                        classDa.method280(this, 955496638);
                    }

                    if (connectionState * -214882771 == 30) {
                        ClientData.method415(-953955522);
                    } else {
                        if (40 != connectionState * -214882771 && 45 != connectionState * -214882771) {
                            return;
                        }
                        classEr.method192(1976884746);
                    }
                    return;
                }

                var2.fieldB.ck(var2.fieldI, (int) var2.key, var2.fieldV, false, 1166058444);
            }
        } catch (RuntimeException var49) {
            throw ClanMate.error(var49, "client.l(" + ')');
        }
    }

    @Override
    protected final void b(short var1) {
        try {
            int var10000;
            if (0 == fieldE * -135999197) {
                if (var1 >= 16256) {
                    throw new IllegalStateException();
                }

                var10000 = '\uaa4a';
            } else {
                var10000 = '\u9c40' + currentWorld * -1276662997;
            }

            Buffer.fieldBa = var10000 * 738761855;
            if (0 == fieldE * -135999197) {
                if (var1 >= 16256) {
                    throw new IllegalStateException();
                }

                var10000 = 443;
            } else {
                var10000 = currentWorld * -1276662997 + '\uc350';
            }

            UnknownEnum.fieldBv = var10000 * 300650749;
            DynamicObject.fieldBd = Buffer.fieldBa * 1233499029;
            Varp.fieldW = UtilClass24.fieldA;
            UtilClass24.fieldE = UtilClass24.fieldV;
            CacheInt.fieldN = UtilClass24.fieldI;
            MessageContainer.fieldS = UtilClass24.fieldB;
            if (TaskHandler.JAVA_VENDOR.toLowerCase().indexOf("microsoft") != -1) {
                if (var1 >= 16256) {
                    return;
                }

                Keyboard.fieldCm[186] = 57;
                Keyboard.fieldCm[187] = 27;
                Keyboard.fieldCm[188] = 71;
                Keyboard.fieldCm[189] = 26;
                Keyboard.fieldCm[190] = 72;
                Keyboard.fieldCm[191] = 73;
                Keyboard.fieldCm[192] = 58;
                Keyboard.fieldCm[219] = 42;
                Keyboard.fieldCm[220] = 74;
                Keyboard.fieldCm[221] = 43;
                Keyboard.fieldCm[222] = 59;
                Keyboard.fieldCm[223] = 28;
            } else {
                Keyboard.fieldCm[44] = 71;
                Keyboard.fieldCm[45] = 26;
                Keyboard.fieldCm[46] = 72;
                Keyboard.fieldCm[47] = 73;
                Keyboard.fieldCm[59] = 57;
                Keyboard.fieldCm[61] = 27;
                Keyboard.fieldCm[91] = 42;
                Keyboard.fieldCm[92] = 74;
                Keyboard.fieldCm[93] = 43;
                Keyboard.fieldCm[192] = 28;
                Keyboard.fieldCm[222] = 58;
                Keyboard.fieldCm[520] = 59;
            }

            UtilClass24.method2(UtilClass22.canvas, -546881714);
            classAo.method397(UtilClass22.canvas, -1153395946);
            AbstractByteBuffer.mouseWheelListener = UtilClass2.method284((byte) 15);
            if (null != AbstractByteBuffer.mouseWheelListener) {
                if (var1 >= 16256) {
                    throw new IllegalStateException();
                }

                AbstractByteBuffer.mouseWheelListener.v(UtilClass22.canvas, -1814883677);
            }

            classCx.fieldOl = new classDz(255, UtilClass19.fieldF, UtilClass19.fieldD, 500000);
            JagexAccessFile var3 = null;
            Preferences var4 = new Preferences();

            try {
                var3 = ItemDefinition.getAccessFile("", fieldN.privateName, false, -1002969014);
                byte[] var5 = new byte[(int) var3.b(-2111875593)];
                int var7;
                for (int var6 = 0; var6 < var5.length; var6 += var7) {
                    var7 = var3.l(var5, var6, var5.length - var6, (byte) 70);
                    if (-1 == var7) {
                        throw new IOException();
                    }
                }
                var4 = new Preferences(new Buffer(var5));
            } catch (Exception var9) {
            }

            try {
                if (var3 != null) {
                    var3.i((byte) -115);
                }
            } catch (Exception var8) {
            }
            Projectile.preferences = var4;
            AnimationSequence.fieldOo = this.getToolkit().getSystemClipboard();
            ScriptEvent.method111(this, LandscapeTile.fieldQb, -732292147);
            if (fieldE * -135999197 != 0) {
                if (var1 >= 16256) {
                    return;
                }

                fpsOn = true;
            }

        } catch (RuntimeException var10) {
            throw ClanMate.error(var10, "client.b(" + ')');
        }
    }

    @Override
    protected final void m(byte var1) {
        try {
            boolean var2;
            label451:
            {
                try {
                    if (UtilClass21.fieldL * 1195675721 == 2) {
                        if (null == UtilClass21.fieldF) {
                            UtilClass21.fieldF = classFz.method1(UtilClass21.fieldM, UtilClass35.fieldW * 64581757, classDz.fieldE * 424944785);
                            if (null == UtilClass21.fieldF) {
                                var2 = false;
                                break label451;
                            }
                        }

                        if (LandscapeMod.fieldD == null) {
                            LandscapeMod.fieldD = new classBo(UtilClass21.fieldI, UtilClass21.fieldV);
                        }

                        if (UtilClass37.fieldB.i(UtilClass21.fieldF, UtilClass21.fieldA, LandscapeMod.fieldD, 22050, -83296831)) {
                            UtilClass37.fieldB.b(-1286503482);
                            UtilClass37.fieldB.a(ItemTable.fieldN * -1356237151, 1601010395);
                            UtilClass37.fieldB.s(UtilClass21.fieldF, UtilClass21.fieldK, 1127125680);
                            UtilClass21.fieldL = 0;
                            UtilClass21.fieldF = null;
                            LandscapeMod.fieldD = null;
                            UtilClass21.fieldM = null;
                            var2 = true;
                            break label451;
                        }
                    }
                } catch (Exception var17) {
                    var17.printStackTrace();
                    UtilClass37.fieldB.f(-1956851297);
                    UtilClass21.fieldL = 0;
                    UtilClass21.fieldF = null;
                    LandscapeMod.fieldD = null;
                    UtilClass21.fieldM = null;
                }

                var2 = false;
            }

            if (var2) {
                if (var1 == 0) {
                    throw new IllegalStateException();
                }

                if (fieldMv) {
                    if (var1 == 0) {
                        throw new IllegalStateException();
                    }

                    if (classDm.fieldNf != null) {
                        if (var1 == 0) {
                            throw new IllegalStateException();
                        }

                        classDm.fieldNf.c((short) -29781);
                    }
                }
            }

            if (fieldPm) {
                if (var1 == 0) {
                    throw new IllegalStateException();
                }

                UtilClass6.method63(UtilClass22.canvas, -1571311130);
                Canvas var4 = UtilClass22.canvas;
                var4.removeMouseListener(Mouse.instance);
                var4.removeMouseMotionListener(Mouse.instance);
                var4.removeFocusListener(Mouse.instance);
                Mouse.fieldI = 0;
                if (AbstractByteBuffer.mouseWheelListener != null) {
                    AbstractByteBuffer.mouseWheelListener.removeFrom(UtilClass22.canvas, (byte) 57);
                }

                this.pb((byte) 103);
                UtilClass24.method2(UtilClass22.canvas, -1322951617);
                classAo.method397(UtilClass22.canvas, -220741012);
                if (null != AbstractByteBuffer.mouseWheelListener) {
                    AbstractByteBuffer.mouseWheelListener.v(UtilClass22.canvas, -1787329197);
                }
            }

            int var5;
            if (0 == connectionState * -214882771) {
                if (var1 == 0) {
                    throw new IllegalStateException();
                }

                classM.method131(ClientData.fieldAe * 999862887, ClientData.loadStatusString, (Color) null, 1946884900);
            } else if (5 == connectionState * -214882771) {
                if (var1 == 0) {
                    throw new IllegalStateException();
                }

                classAi.method391(com.jagex.MenuItem.font_b12full, ObjectDefinition.font_p11full, 1068901960);
            } else {
                label434:
                {
                    if (connectionState * -214882771 != 10) {
                        if (var1 == 0) {
                            return;
                        }

                        if (connectionState * -214882771 != 11) {
                            if (20 == connectionState * -214882771) {
                                if (var1 == 0) {
                                    throw new IllegalStateException();
                                }

                                classAi.method391(com.jagex.MenuItem.font_b12full, ObjectDefinition.font_p11full, -410659485);
                            } else {
                                int var19;
                                if (25 == connectionState * -214882771) {
                                    if (fieldDo * -1750787981 == 1) {
                                        if (var1 == 0) {
                                            return;
                                        }

                                        if (fieldDp * -1592786275 > fieldDu * 1122680471) {
                                            fieldDu = fieldDp * 389358315;
                                        }

                                        var19 = (fieldDu * 299448702 - fieldDp * 1965064874) / (fieldDu * 1122680471);
                                        ItemPile.method339(StringConstants.fieldS + UtilClass41.fieldW + UtilClass41.openParanthesis + var19 + "%" + UtilClass41.closeParanthesis, false, -795446739);
                                    } else if (2 == fieldDo * -1750787981) {
                                        if (var1 == 0) {
                                            throw new IllegalStateException();
                                        }

                                        if (fieldDj * 832453617 > fieldDi * -1159947715) {
                                            if (var1 == 0) {
                                                throw new IllegalStateException();
                                            }

                                            fieldDi = fieldDj * 416376773;
                                        }

                                        var19 = 50 + (fieldDi * 2132156394 - fieldDj * -1326992110) / (fieldDi * -1159947715);
                                        ItemPile.method339(StringConstants.fieldS + UtilClass41.fieldW + UtilClass41.openParanthesis + var19 + "%" + UtilClass41.closeParanthesis, false, -1207330949);
                                    } else {
                                        ItemPile.method339(StringConstants.fieldS, false, -845328515);
                                    }
                                } else if (connectionState * -214882771 == 30) {
                                    if (var1 == 0) {
                                        return;
                                    }

                                    if (-1 != fieldJh * -98490421) {
                                        if (var1 == 0) {
                                            return;
                                        }

                                        Player.method147(fieldJh * -98490421, -1788877879);
                                    }

                                    for (var19 = 0; var19 < fieldLj * -1726837317; ++var19) {
                                        if (fieldLp[var19]) {
                                            if (var1 == 0) {
                                                throw new IllegalStateException();
                                            }

                                            fieldLm[var19] = true;
                                        }

                                        fieldLk[var19] = fieldLp[var19];
                                        fieldLp[var19] = false;
                                    }

                                    fieldLx = engineCycle * -196692269;
                                    fieldIo = 1536540027;
                                    fieldIq = -614668789;
                                    classBy.fieldGu = null;
                                    if (-1 != fieldJh * -98490421) {
                                        if (var1 == 0) {
                                            throw new IllegalStateException();
                                        }

                                        fieldLj = 0;
                                        UtilClass38.method124(fieldJh * -98490421, 0, 0, 765, 503, 0, 0, -1, (byte) 0);
                                    }

                                    RSGraphics.method230();
                                    if (!menuOpen) {
                                        if (var1 == 0) {
                                            return;
                                        }

                                        if (-1 != fieldIo * -1338677683) {
                                            if (var1 == 0) {
                                                throw new IllegalStateException();
                                            }

                                            IsaacCipher.method66(fieldIo * -1338677683, fieldIq * 155978333, 1477189937);
                                        }
                                    } else {
                                        SystemNode.method60(1574019267);
                                    }

                                    if (fieldLb * -340512555 == 3) {
                                        if (var1 == 0) {
                                            throw new IllegalStateException();
                                        }

                                        for (var19 = 0; var19 < fieldLj * -1726837317; ++var19) {
                                            if (var1 == 0) {
                                                throw new IllegalStateException();
                                            }

                                            if (fieldLk[var19]) {
                                                if (var1 == 0) {
                                                    throw new IllegalStateException();
                                                }

                                                RSGraphics.method234(fieldLu[var19], fieldLa[var19], fieldLq[var19], fieldLf[var19], 16711935, 128);
                                            } else if (fieldLm[var19]) {
                                                if (var1 == 0) {
                                                    throw new IllegalStateException();
                                                }

                                                RSGraphics.method234(fieldLu[var19], fieldLa[var19], fieldLq[var19], fieldLf[var19], 16711680, 128);
                                            }
                                        }
                                    }

                                    var19 = floorLevel * 87713183;
                                    var5 = 404428603 * myPlayer.strictX;
                                    int var6 = myPlayer.strictY * -1490664571;
                                    int var7 = fieldEo * 1985191041;

                                    for (classG var8 = (classG) classG.fieldA.next(); var8 != null; var8 = (classG) classG.fieldA.tail()) {
                                        if (-1 == var8.fieldE * 1677615665) {
                                            if (var1 == 0) {
                                                throw new IllegalStateException();
                                            }

                                            if (var8.fieldF == null) {
                                                continue;
                                            }
                                        }

                                        int var9 = 0;
                                        if (var5 > var8.fieldL * 457759757) {
                                            if (var1 == 0) {
                                                throw new IllegalStateException();
                                            }

                                            var9 += var5 - var8.fieldL * 457759757;
                                        } else if (var5 < var8.fieldI * -966669893) {
                                            if (var1 == 0) {
                                                return;
                                            }

                                            var9 += var8.fieldI * -966669893 - var5;
                                        }

                                        if (var6 > var8.fieldM * -1546830505) {
                                            if (var1 == 0) {
                                                throw new IllegalStateException();
                                            }

                                            var9 += var6 - var8.fieldM * -1546830505;
                                        } else if (var6 < var8.fieldB * -166071461) {
                                            if (var1 == 0) {
                                                throw new IllegalStateException();
                                            }

                                            var9 += var8.fieldB * -166071461 - var6;
                                        }

                                        if (var9 - 64 <= var8.fieldW * -246980431) {
                                            if (var1 == 0) {
                                                throw new IllegalStateException();
                                            }

                                            if (0 != fieldNm * -1976627615) {
                                                if (var1 == 0) {
                                                    throw new IllegalStateException();
                                                }

                                                if (var8.fieldV * 903364983 == var19) {
                                                    var9 -= 64;
                                                    if (var9 < 0) {
                                                        var9 = 0;
                                                    }

                                                    int var10 = (var8.fieldW * -246980431 - var9) * fieldNm * -1976627615 / (var8.fieldW * -246980431);
                                                    AudioEffect var10000;
                                                    if (var8.fieldN == null) {
                                                        if (var1 == 0) {
                                                            throw new IllegalStateException();
                                                        }

                                                        if (var8.fieldE * 1677615665 >= 0) {
                                                            if (var1 == 0) {
                                                                throw new IllegalStateException();
                                                            }

                                                            var10000 = (AudioEffect) null;
                                                            AudioEffect var11 = AudioEffect.get(UtilClass39.fieldBo, var8.fieldE * 1677615665, 0);
                                                            if (var11 != null) {
                                                                if (var1 == 0) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                classBl var12 = var11.v().a(TextureManagerImpl.fieldNa);
                                                                classBw var13 = classBw.method209(var12, 100, var10);
                                                                var13.s(-1);
                                                                fieldNn.a(var13);
                                                                var8.fieldN = var13;
                                                            }
                                                        }
                                                    } else {
                                                        var8.fieldN.f(var10);
                                                    }

                                                    if (null == var8.fieldX) {
                                                        if (var1 == 0) {
                                                            return;
                                                        }

                                                        if (null != var8.fieldF) {
                                                            if (var1 == 0) {
                                                                return;
                                                            }

                                                            if ((var8.fieldD -= var7 * -1044788389) * -1985385261 <= 0) {
                                                                if (var1 == 0) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                int var21 = (int) (Math.random() * (double) var8.fieldF.length);
                                                                var10000 = (AudioEffect) null;
                                                                AudioEffect var22 = AudioEffect.get(UtilClass39.fieldBo, var8.fieldF[var21], 0);
                                                                if (var22 != null) {
                                                                    if (var1 == 0) {
                                                                        return;
                                                                    }

                                                                    classBl var23 = var22.v().a(TextureManagerImpl.fieldNa);
                                                                    classBw var14 = classBw.method209(var23, 100, var10);
                                                                    var14.s(0);
                                                                    fieldNn.a(var14);
                                                                    var8.fieldX = var14;
                                                                    var8.fieldD = (var8.fieldS * 1307018579 + (int) (Math.random() * (double) (var8.fieldK * -767190129 - var8.fieldS * 1307018579))) * -1044788389;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        var8.fieldX.f(var10);
                                                        if (!var8.fieldX.isLinked()) {
                                                            if (var1 == 0) {
                                                                throw new IllegalStateException();
                                                            }

                                                            var8.fieldX = null;
                                                        }
                                                    }
                                                    continue;
                                                }

                                                if (var1 == 0) {
                                                    return;
                                                }
                                            }
                                        }

                                        if (null != var8.fieldN) {
                                            if (var1 == 0) {
                                                throw new IllegalStateException();
                                            }

                                            fieldNn.v(var8.fieldN);
                                            var8.fieldN = null;
                                        }

                                        if (var8.fieldX != null) {
                                            if (var1 == 0) {
                                                return;
                                            }

                                            fieldNn.v(var8.fieldX);
                                            var8.fieldX = null;
                                        }
                                    }

                                    fieldEo = 0;
                                } else if (40 == connectionState * -214882771) {
                                    if (var1 == 0) {
                                        throw new IllegalStateException();
                                    }

                                    ItemPile.method339(StringConstants.fieldK + UtilClass41.fieldW + StringConstants.fieldF, false, -2040141897);
                                } else if (connectionState * -214882771 == 45) {
                                    if (var1 == 0) {
                                        throw new IllegalStateException();
                                    }

                                    ItemPile.method339(StringConstants.fieldFu, false, -2049993395);
                                }
                            }
                            break label434;
                        }
                    }

                    classAi.method391(com.jagex.MenuItem.font_b12full, ObjectDefinition.font_p11full, 6925142);
                }
            }

            //drawStuff




            Graphics var20;
            if (connectionState * -214882771 == 30 && 0 == fieldLb * -340512555) {
                if (var1 == 0) {
                    throw new IllegalStateException();
                }

                if (!fieldPp) {
                    try {
                        var20 = UtilClass22.canvas.getGraphics();


                  /*      int[] buffer = new int[32*32];
                        DataBufferInt buf = new DataBufferInt(buffer, buffer.length);
                        DirectColorModel var6 = new DirectColorModel(32, 16711680, '\uff00', 255);
                        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(32,32), buf, (Point) null);
                        BufferedImage img = new BufferedImage(var6, var7, false, new Hashtable());*/



                        for (var5 = 0; var5 < fieldLj * -1726837317; ++var5) {
                            if (var1 == 0) {
                                throw new IllegalStateException();
                            }

                            if (fieldLm[var5]) {
                                Projectile.fieldPt.i(var20, fieldLu[var5], fieldLa[var5], fieldLq[var5], fieldLf[var5], (byte) -18);
                                fieldLm[var5] = false;
                            }
                        }

                        if(myPlayer != null) {
                            Graphics2D g = (Graphics2D) UtilClass22.canvas.getGraphics();
                            g.setColor(Color.GREEN);
                            int x = 404428603 * myPlayer.strictX / 128;
                            int y = myPlayer.strictY * -1490664571 / 128;
                            g.drawString(x + "," + y, 5, 15);
                            g.drawString("Selected item index: " + UtilClass41.selectedItemIndex * 1003817045, 5, 30);
                        }
                        return;
                    } catch (Exception var16) {
                        UtilClass22.canvas.repaint();
                        return;
                    }



                }
            }





           /* var20 = classFk.canvas.getGraphics();

            int x = 130;
            int y = 32;
            int i = 0;
            if(EntityMarker.hintIcons != null) {
                for (CompressedImage s : classDq.MMObjectIcons*//* EntityMarker.hintIcons*//*) {
                    var20.setColor(Color.GREEN);
                    var20.drawString("" + i++, x, y);
                    s.i(x + 10, y);
                    y += 15;
                    if(y > 300) {
                        y = 32;
                        x+= 65;
                    }
                }
            }
*/

            if (connectionState * -214882771 > 0) {
                if (var1 == 0) {
                    throw new IllegalStateException();
                }

                try {
                    var20 = UtilClass22.canvas.getGraphics();
                    Projectile.fieldPt.v(var20, 0, 0, 1145314815);
                    fieldPp = false;

                    for (var5 = 0; var5 < fieldLj * -1726837317; ++var5) {
                        fieldLm[var5] = false;
                    }
                } catch (Exception var15) {
                    UtilClass22.canvas.repaint();
                }
            }




        } catch (RuntimeException var18) {
            throw ClanMate.error(var18, "client.m(" + ')');
        }
    }

    void n(byte var1) {
        try {
            if (1000 != connectionState * -214882771) {
                long var3 = classDz.getFancyTime(1280135208);
                int var5 = (int) (var3 - -7343729688938442519L * UtilClass20.fieldI);
                UtilClass20.fieldI = 7659793936815245145L * var3;
                if (var5 > 200) {
                    var5 = 200;
                }

                boolean var2;
                label347:
                {
                    UtilClass20.fieldV += 1151329351 * var5;
                    if (0 == UtilClass20.fieldF * 57953785) {
                        if (var1 <= 12) {
                            throw new IllegalStateException();
                        }

                        if (0 == UtilClass20.fieldW * 1795231551) {
                            if (var1 <= 12) {
                                throw new IllegalStateException();
                            }

                            if (UtilClass20.fieldS * 412629215 == 0) {
                                if (var1 <= 12) {
                                    throw new IllegalStateException();
                                }

                                if (0 == UtilClass20.fieldL * -408539103) {
                                    if (var1 <= 12) {
                                        throw new IllegalStateException();
                                    }

                                    var2 = true;
                                    break label347;
                                }
                            }
                        }
                    }

                    if (null == UtilClass20.fieldA) {
                        if (var1 <= 12) {
                            throw new IllegalStateException();
                        }

                        var2 = false;
                    } else {
                        try {
                            if (UtilClass20.fieldV * 625771895 > 30000) {
                                if (var1 <= 12) {
                                    throw new IllegalStateException();
                                }

                                throw new IOException();
                            }

                            classEr var6;
                            Buffer var7;
                            while (UtilClass20.fieldW * 1795231551 < 20) {
                                if (var1 <= 12) {
                                    return;
                                }

                                if (UtilClass20.fieldL * -408539103 <= 0) {
                                    break;
                                }

                                if (var1 <= 12) {
                                    throw new IllegalStateException();
                                }

                                var6 = (classEr) UtilClass20.fieldB.first();
                                var7 = new Buffer(4);
                                var7.writeByte(1);
                                var7.i((int) var6.key);
                                UtilClass20.fieldA.writeLater(var7.payload, 0, 4, (byte) -51);
                                UtilClass20.fieldM.put(var6, var6.key);
                                UtilClass20.fieldL -= -1095412767;
                                UtilClass20.fieldW += -637378369;
                            }

                            while (UtilClass20.fieldF * 57953785 < 20) {
                                if (var1 <= 12) {
                                    throw new IllegalStateException();
                                }

                                if (UtilClass20.fieldS * 412629215 <= 0) {
                                    break;
                                }

                                if (var1 <= 12) {
                                    throw new IllegalStateException();
                                }

                                var6 = (classEr) UtilClass20.fieldE.next();
                                var7 = new Buffer(4);
                                var7.writeByte(0);
                                var7.i((int) var6.key);
                                UtilClass20.fieldA.writeLater(var7.payload, 0, 4, (byte) -84);
                                var6.deleteDual();
                                UtilClass20.fieldK.put(var6, var6.key);
                                UtilClass20.fieldS -= -748059873;
                                UtilClass20.fieldF += -1971002295;
                            }

                            int var22 = 0;

                            while (true) {
                                if (var22 < 100) {
                                    if (var1 <= 12) {
                                        throw new IllegalStateException();
                                    }

                                    int var23 = UtilClass20.fieldA.available(2035108241);
                                    if (var23 < 0) {
                                        if (var1 <= 12) {
                                            return;
                                        }

                                        throw new IOException();
                                    }

                                    if (var23 == 0) {
                                        if (var1 <= 12) {
                                            throw new IllegalStateException();
                                        }
                                    } else {
                                        label358:
                                        {
                                            UtilClass20.fieldV = 0;
                                            byte var8 = 0;
                                            if (UtilClass38.fieldX == null) {
                                                if (var1 <= 12) {
                                                    throw new IllegalStateException();
                                                }

                                                var8 = 8;
                                            } else if (0 == UtilClass20.fieldT * 1875319503) {
                                                if (var1 <= 12) {
                                                    return;
                                                }

                                                var8 = 1;
                                            }

                                            int var9;
                                            int var10;
                                            int var11;
                                            int var13;
                                            if (var8 > 0) {
                                                if (var1 <= 12) {
                                                    throw new IllegalStateException();
                                                }

                                                var9 = var8 - 651432265 * UtilClass20.fieldO.caret;
                                                if (var9 > var23) {
                                                    if (var1 <= 12) {
                                                        throw new IllegalStateException();
                                                    }

                                                    var9 = var23;
                                                }

                                                UtilClass20.fieldA.read(UtilClass20.fieldO.payload, 651432265 * UtilClass20.fieldO.caret, var9, -192107713);
                                                if (0 != UtilClass20.fieldY) {
                                                    for (var10 = 0; var10 < var9; ++var10) {
                                                        if (var1 <= 12) {
                                                            return;
                                                        }

                                                        UtilClass20.fieldO.payload[651432265 * UtilClass20.fieldO.caret + var10] ^= UtilClass20.fieldY;
                                                    }
                                                }

                                                UtilClass20.fieldO.caret += var9 * -99503879;
                                                if (651432265 * UtilClass20.fieldO.caret < var8) {
                                                    if (var1 <= 12) {
                                                        throw new IllegalStateException();
                                                    }
                                                    break label358;
                                                }

                                                if (UtilClass38.fieldX == null) {
                                                    if (var1 <= 12) {
                                                        throw new IllegalStateException();
                                                    }

                                                    UtilClass20.fieldO.caret = 0;
                                                    var10 = UtilClass20.fieldO.readUByte();
                                                    var11 = UtilClass20.fieldO.readUShort();
                                                    int var12 = UtilClass20.fieldO.readUByte();
                                                    var13 = UtilClass20.fieldO.readInt((byte) -53);
                                                    long var14 = (long) ((var10 << 16) + var11);
                                                    classEr var16 = (classEr) UtilClass20.fieldM.get(var14);
                                                    classBt.fieldD = true;
                                                    if (null == var16) {
                                                        if (var1 <= 12) {
                                                            return;
                                                        }

                                                        var16 = (classEr) UtilClass20.fieldK.get(var14);
                                                        classBt.fieldD = false;
                                                    }

                                                    if (null == var16) {
                                                        if (var1 <= 12) {
                                                            throw new IllegalStateException();
                                                        }

                                                        throw new IOException();
                                                    }

                                                    byte var10000;
                                                    if (0 == var12) {
                                                        if (var1 <= 12) {
                                                            throw new IllegalStateException();
                                                        }

                                                        var10000 = 5;
                                                    } else {
                                                        var10000 = 9;
                                                    }

                                                    byte var17 = var10000;
                                                    UtilClass38.fieldX = var16;
                                                    UtilClass20.fieldQ = new Buffer(var17 + var13 + UtilClass38.fieldX.fieldI);
                                                    UtilClass20.fieldQ.writeByte(var12);
                                                    UtilClass20.fieldQ.writeInt(var13);
                                                    UtilClass20.fieldT = -1559404168;
                                                    UtilClass20.fieldO.caret = 0;
                                                } else if (UtilClass20.fieldT * 1875319503 == 0) {
                                                    if (-1 == UtilClass20.fieldO.payload[0]) {
                                                        if (var1 <= 12) {
                                                            throw new IllegalStateException();
                                                        }

                                                        UtilClass20.fieldT = -1268667345;
                                                        UtilClass20.fieldO.caret = 0;
                                                    } else {
                                                        UtilClass38.fieldX = null;
                                                    }
                                                }
                                            } else {
                                                var9 = UtilClass20.fieldQ.payload.length - UtilClass38.fieldX.fieldI;
                                                var10 = 512 - UtilClass20.fieldT * 1875319503;
                                                if (var10 > var9 - 651432265 * UtilClass20.fieldQ.caret) {
                                                    if (var1 <= 12) {
                                                        throw new IllegalStateException();
                                                    }

                                                    var10 = var9 - 651432265 * UtilClass20.fieldQ.caret;
                                                }

                                                if (var10 > var23) {
                                                    if (var1 <= 12) {
                                                        throw new IllegalStateException();
                                                    }

                                                    var10 = var23;
                                                }

                                                UtilClass20.fieldA.read(UtilClass20.fieldQ.payload, 651432265 * UtilClass20.fieldQ.caret, var10, -192107713);
                                                if (0 != UtilClass20.fieldY) {
                                                    if (var1 <= 12) {
                                                        throw new IllegalStateException();
                                                    }

                                                    for (var11 = 0; var11 < var10; ++var11) {
                                                        if (var1 <= 12) {
                                                            throw new IllegalStateException();
                                                        }

                                                        UtilClass20.fieldQ.payload[UtilClass20.fieldQ.caret * 651432265 + var11] ^= UtilClass20.fieldY;
                                                    }
                                                }

                                                UtilClass20.fieldQ.caret += -99503879 * var10;
                                                UtilClass20.fieldT += -1268667345 * var10;
                                                if (var9 == UtilClass20.fieldQ.caret * 651432265) {
                                                    if (var1 <= 12) {
                                                        return;
                                                    }

                                                    if (UtilClass38.fieldX.key == 16711935L) {
                                                        if (var1 <= 12) {
                                                            throw new IllegalStateException();
                                                        }

                                                        classBf.fieldJ = UtilClass20.fieldQ;

                                                        for (var11 = 0; var11 < 256; ++var11) {
                                                            if (var1 <= 12) {
                                                                throw new IllegalStateException();
                                                            }

                                                            ReferenceTableSub var24 = UtilClass20.fieldG[var11];
                                                            if (var24 != null) {
                                                                if (var1 <= 12) {
                                                                    return;
                                                                }

                                                                classBf.fieldJ.caret = var11 * -796031032 + -497519395;
                                                                var13 = classBf.fieldJ.readInt((byte) 15);
                                                                int var25 = classBf.fieldJ.readInt((byte) 86);
                                                                var24.cn(var13, var25, 1517787322);
                                                            }
                                                        }
                                                    } else {
                                                        UtilClass20.fieldU.reset();
                                                        UtilClass20.fieldU.update(UtilClass20.fieldQ.payload, 0, var9);
                                                        var11 = (int) UtilClass20.fieldU.getValue();
                                                        if (var11 != UtilClass38.fieldX.fieldV * 580171909) {
                                                            if (var1 <= 12) {
                                                                throw new IllegalStateException();
                                                            }

                                                            try {
                                                                UtilClass20.fieldA.stop(-1446270641);
                                                            } catch (Exception var19) {
                                                                ;
                                                            }

                                                            UtilClass20.fieldP += 1681904291;
                                                            UtilClass20.fieldA = null;
                                                            UtilClass20.fieldY = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                                            var2 = false;
                                                            break;
                                                        }

                                                        UtilClass20.fieldP = 0;
                                                        UtilClass20.fieldR = 0;
                                                        int var10001 = (int) (UtilClass38.fieldX.key & 65535L);
                                                        boolean var10003;
                                                        if ((UtilClass38.fieldX.key & 16711680L) == 16711680L) {
                                                            if (var1 <= 12) {
                                                                throw new IllegalStateException();
                                                            }

                                                            var10003 = true;
                                                        } else {
                                                            var10003 = false;
                                                        }

                                                        UtilClass38.fieldX.fieldA.cp(var10001, UtilClass20.fieldQ.payload, var10003, classBt.fieldD, -1883264824);
                                                    }

                                                    UtilClass38.fieldX.delete();
                                                    if (classBt.fieldD) {
                                                        UtilClass20.fieldW -= -637378369;
                                                    } else {
                                                        UtilClass20.fieldF -= -1971002295;
                                                    }

                                                    UtilClass20.fieldT = 0;
                                                    UtilClass38.fieldX = null;
                                                    UtilClass20.fieldQ = null;
                                                } else {
                                                    if (512 != UtilClass20.fieldT * 1875319503) {
                                                        break label358;
                                                    }

                                                    if (var1 <= 12) {
                                                        throw new IllegalStateException();
                                                    }

                                                    UtilClass20.fieldT = 0;
                                                }
                                            }

                                            ++var22;
                                            continue;
                                        }
                                    }
                                }

                                var2 = true;
                                break;
                            }
                        } catch (IOException var20) {
                            try {
                                UtilClass20.fieldA.stop(423125581);
                            } catch (Exception var18) {
                                ;
                            }

                            UtilClass20.fieldR += -1608089801;
                            UtilClass20.fieldA = null;
                            var2 = false;
                        }
                    }
                }

                if (!var2) {
                    if (var1 <= 12) {
                        throw new IllegalStateException();
                    }

                    this.s(-2092131853);
                }

            }
        } catch (RuntimeException var21) {
            throw ClanMate.error(var21, "client.n(" + ')');
        }
    }
}
