package com.jagex;

import java.util.*;
import java.util.Map.Entry;

public class Preferences {

    static int fieldKi;
    static Widget[] fieldKh;
    static int cameraZ;
    static int fieldNv;
    public static ReferenceTableSub fieldBl;
    static int unknownConstant = 488959395;
    boolean roofsEnabled;
    LinkedHashMap map = new LinkedHashMap();
    boolean audioEnabled;

    Preferences(Buffer var1) {
        if (null != var1 && null != var1.payload) {
            int count = var1.readUByte();
            if (count >= 0 && count <= unknownConstant * 1418136097) {

                if (var1.readUByte() == 1) {
                    this.roofsEnabled = true;
                }

                if (count > 1) {
                    this.audioEnabled = var1.readUByte() == 1;
                }

                if (count > 2) {
                    int var3 = var1.readUByte();
                    for (int var4 = 0; var4 < var3; ++var4) {
                        int var5 = var1.readInt((byte) -41);
                        int var6 = var1.readInt((byte) 77);
                        this.map.put(Integer.valueOf(var5), Integer.valueOf(var6));
                    }
                }
            } else {
                this.a(true, -1722869650);
            }
        } else {
            this.a(true, -938977463);
        }

    }

    Preferences() {
        this.a(true, -150914209);
    }

    static void bigdickscripthandler(ScriptEvent var0, int var1, int DUMMY) {
        try {
            Object[] args = var0.args;
            int scriptId = ((Integer) args[0]).intValue();
            RuneScript script = GameEngine.getRuneScript(scriptId, 2117247939);

            if (script != null) {
                int var6 = 0;
                int var7 = 0;
                int stackWordIndex = -1;
                int[] var9 = script.opcodes;
                int[] var10 = script.intOperands;
                byte var11 = -1;
                UtilClass0.fieldN = 0;

                int var14;
                try {
                    UtilClass0.intStack = new int[script.intStackMax * 1107594725];
                    int var12 = 0;
                    UtilClass0.stringStack = new String[script.stringStackMax * -857620813];
                    int var32 = 0;

                    int var15;
                    int var10000;
                    String var45;
                    for (var14 = 1; var14 < args.length; ++var14)
                        if (args[var14] instanceof Integer) {
                            var15 = (Integer) args[var14];



                            if (-2147483647 == var15) {
                                var15 = var0.mouseX * 559865579;
                               // System.out.println("A:" + var0.mouseX * 55986557);
                            }

                            if (var15 == -2147483646) {
                                var15 = var0.mouseY * -1747081207;
                               // System.out.println("B:" + var0.mouseY * -1747081207);
                            }

                            if (var15 == -2147483645) {
                                if (var0.src != null) {
                                    var10000 = var0.src.id * -1866039137;
                                } else {
                                    var10000 = -1;
                                }

                                var15 = var10000;
                            }

                            if (var15 == -2147483644) {
                                var15 = var0.fieldM * 1869913055;
                              //  System.out.println("C:" + var0.fieldM * 1869913055);
                            }

                            if (var15 == -2147483643) {
                                if (var0.src != null) {
                                    var10000 = var0.src.index * 1176560255;
                                } else {
                                    var10000 = -1;
                                }

                                var15 = var10000;
                            }

                            if (-2147483642 == var15) {

                                if (null != var0.fieldW) {

                                    var10000 = -1866039137 * var0.fieldW.id;
                                } else {
                                    var10000 = -1;
                                }

                                var15 = var10000;
                            }

                            if (var15 == -2147483641) {
                                if (null != var0.fieldW) {
                                    if (DUMMY == -350752953) {
                                        throw new IllegalStateException();
                                    }

                                    var10000 = 1176560255 * var0.fieldW.index;
                                } else {
                                    var10000 = -1;
                                }

                                var15 = var10000;
                            }

                            if (-2147483640 == var15) {
                                var15 = var0.fieldE * -2088308971;
                                //System.out.println("E:" + var0.fieldE * -2088308971);
                            }

                            if (-2147483639 == var15) {
                                if (DUMMY == -350752953) {
                                    throw new IllegalStateException();
                                }

                                var15 = var0.fieldN * 1988565031;
                              //  System.out.println("G:" + var0.fieldN * 1988565031);
                            }

                            UtilClass0.intStack[var12++] = var15;
                        } else if (args[var14] instanceof String) {
                            if (DUMMY == -350752953) {
                                throw new IllegalStateException();
                            }

                            var45 = (String) args[var14];
                            if (var45.equals("event_opbase")) {
                                if (DUMMY == -350752953) {
                                    throw new IllegalStateException();
                                }

                                var45 = var0.fieldS;
                              //  System.out.println("F:" + var0.fieldS);
                            }

                            UtilClass0.stringStack[var32++] = var45;
                        }

                    var14 = 0;

                    label4980:
                    while (true) {
                        ++var14;
                        if (var14 > var1) {
                            if (DUMMY == -350752953) {
                                throw new IllegalStateException();
                            }

                            throw new RuntimeException();
                        }

                        ++stackWordIndex;
                        int opcode = var9[stackWordIndex];
                        int var16;
                        int var10001;
                        int var17;
                        int var21;
                        int var35;
                        int[] var36;
                        int var38;
                        int var42;
                        String var44;
                        String var53;
                        String var56;
                        byte var74;
                        if (opcode < 100) {
                            if (DUMMY == -350752953) {
                                return;
                            }

                            if (0 == opcode) {
                                if (DUMMY == -350752953) {
                                    return;
                                }

                                UtilClass0.intstack[var6++] = var10[stackWordIndex];
                                continue;
                            }

                            if (opcode == 1) {
                                if (DUMMY == -350752953) {
                                    throw new IllegalStateException();
                                }

                                var15 = var10[stackWordIndex];
                                UtilClass0.intstack[var6++] = UtilClass27.vars[var15];
                                continue;
                            }

                            if (2 == opcode) {
                                if (DUMMY == -350752953) {
                                    throw new IllegalStateException();
                                }

                                var15 = var10[stackWordIndex];
                                --var6;
                                UtilClass27.vars[var15] = UtilClass0.intstack[var6];
                                IgnoredPlayer.method94(var15, (short) 11093);
                                continue;
                            }

                            if (3 == opcode) {
                                UtilClass0.stringstack[var7++] = script.stringOperands[stackWordIndex];
                                continue;
                            }

                            if (6 == opcode) {
                                if (DUMMY == -350752953) {
                                    throw new IllegalStateException();
                                }

                                stackWordIndex += var10[stackWordIndex];
                                continue;
                            }

                            if (opcode == 7) {
                                if (DUMMY == -350752953) {
                                    throw new IllegalStateException();
                                }

                                var6 -= 2;
                                if (UtilClass0.intstack[1 + var6] != UtilClass0.intstack[var6]) {
                                    if (DUMMY == -350752953) {
                                        throw new IllegalStateException();
                                    }

                                    stackWordIndex += var10[stackWordIndex];
                                }
                                continue;
                            }

                            if (opcode == 8) {
                                if (DUMMY == -350752953) {
                                    throw new IllegalStateException();
                                }

                                var6 -= 2;
                                if (UtilClass0.intstack[1 + var6] == UtilClass0.intstack[var6]) {
                                    if (DUMMY == -350752953) {
                                        return;
                                    }

                                    stackWordIndex += var10[stackWordIndex];
                                }
                                continue;
                            }

                            if (9 == opcode) {
                                if (DUMMY == -350752953) {
                                    throw new IllegalStateException();
                                }

                                var6 -= 2;
                                if (UtilClass0.intstack[var6] < UtilClass0.intstack[1 + var6]) {
                                    if (DUMMY == -350752953) {
                                        throw new IllegalStateException();
                                    }

                                    stackWordIndex += var10[stackWordIndex];
                                }
                                continue;
                            }

                            if (10 == opcode) {
                                if (DUMMY == -350752953) {
                                    throw new IllegalStateException();
                                }

                                var6 -= 2;
                                if (UtilClass0.intstack[var6] > UtilClass0.intstack[var6 + 1]) {
                                    if (DUMMY == -350752953) {
                                        throw new IllegalStateException();
                                    }

                                    stackWordIndex += var10[stackWordIndex];
                                }
                                continue;
                            }

                            if (21 == opcode) {
                                if (DUMMY == -350752953) {
                                    throw new IllegalStateException();
                                }

                                if (UtilClass0.fieldN * -518422623 == 0) {
                                    return;
                                }

                                ScriptStackElement var77 = UtilClass0.scriptstackelement[(UtilClass0.fieldN -= -186375071) * -518422623];
                                script = var77.fieldA;
                                var9 = script.opcodes;
                                var10 = script.intOperands;
                                stackWordIndex = var77.fieldV * 494950717;
                                UtilClass0.intStack = var77.fieldI;
                                UtilClass0.stringStack = var77.fieldB;
                                continue;
                            }

                            if (opcode == 25) {
                                if (DUMMY == -350752953) {
                                    throw new IllegalStateException();
                                }

                                var15 = var10[stackWordIndex];
                                UtilClass0.intstack[var6++] = Keyboard.getVarpbitValue(var15, 1350194799);
                                continue;
                            }

                            if (opcode == 27) {
                                var15 = var10[stackWordIndex];
                                --var6;
                                var16 = UtilClass0.intstack[var6];
                                Varpbit var95 = GroundItem.method99(var15, -731628329);
                                var35 = var95.varp * -602880833;
                                var38 = var95.low * 1735474941;
                                var42 = var95.high * -1456563197;
                                var21 = UtilClass27.masks[var42 - var38];
                                if (var16 < 0 || var16 > var21) {
                                    var16 = 0;
                                }

                                var21 <<= var38;
                                UtilClass27.vars[var35] = UtilClass27.vars[var35] & ~var21 | var16 << var38 & var21;

                                continue;
                            }

                            if (31 == opcode) {
                                var6 -= 2;
                                if (UtilClass0.intstack[var6] <= UtilClass0.intstack[var6 + 1]) {
                                    if (DUMMY == -350752953) {
                                        throw new IllegalStateException();
                                    }

                                    stackWordIndex += var10[stackWordIndex];
                                }
                                continue;
                            }

                            if (opcode == 32) {
                                var6 -= 2;
                                if (UtilClass0.intstack[var6] >= UtilClass0.intstack[var6 + 1]) {
                                    if (DUMMY == -350752953) {
                                        return;
                                    }

                                    stackWordIndex += var10[stackWordIndex];
                                }
                                continue;
                            }

                            if (opcode == 33) {
                                if (DUMMY == -350752953) {
                                    throw new IllegalStateException();
                                }

                                UtilClass0.intstack[var6++] = UtilClass0.intStack[var10[stackWordIndex]];
                                continue;
                            }

                            if (34 == opcode) {
                                if (DUMMY == -350752953) {
                                    throw new IllegalStateException();
                                }

                                var10001 = var10[stackWordIndex];
                                --var6;
                                UtilClass0.intStack[var10001] = UtilClass0.intstack[var6];
                                continue;
                            }

                            if (35 == opcode) {
                                if (DUMMY == -350752953) {
                                    throw new IllegalStateException();
                                }

                                UtilClass0.stringstack[var7++] = UtilClass0.stringStack[var10[stackWordIndex]];
                                continue;
                            }

                            if (opcode == 36) {
                                if (DUMMY == -350752953) {
                                    throw new IllegalStateException();
                                }

                                var10001 = var10[stackWordIndex];
                                --var7;
                                UtilClass0.stringStack[var10001] = UtilClass0.stringstack[var7];
                                continue;
                            }

                            if (37 == opcode) {
                                if (DUMMY == -350752953) {
                                    throw new IllegalStateException();
                                }

                                var15 = var10[stackWordIndex];
                                var7 -= var15;
                                String[] var94 = UtilClass0.stringstack;
                                if (0 == var15) {
                                    if (DUMMY == -350752953) {
                                        throw new IllegalStateException();
                                    }

                                    var44 = "";
                                } else if (1 == var15) {
                                    if (DUMMY == -350752953) {
                                        throw new IllegalStateException();
                                    }

                                    var53 = var94[var7];
                                    if (null == var53) {
                                        if (DUMMY == -350752953) {
                                            throw new IllegalStateException();
                                        }

                                        var44 = "null";
                                    } else {
                                        var44 = var53.toString();
                                    }
                                } else {
                                    var35 = var7 + var15;
                                    var38 = 0;

                                    for (var42 = var7; var42 < var35; ++var42) {
                                        if (DUMMY == -350752953) {
                                            return;
                                        }

                                        var56 = var94[var42];
                                        if (var56 == null) {
                                            if (DUMMY == -350752953) {
                                                throw new IllegalStateException();
                                            }

                                            var38 += 4;
                                        } else {
                                            var38 += var56.length();
                                        }
                                    }

                                    StringBuilder var87 = new StringBuilder(var38);

                                    for (var21 = var7; var21 < var35; ++var21) {
                                        String var55 = var94[var21];
                                        if (var55 == null) {
                                            if (DUMMY == -350752953) {
                                                return;
                                            }

                                            var87.append("null");
                                        } else {
                                            var87.append(var55);
                                        }
                                    }

                                    var44 = var87.toString();
                                }

                                UtilClass0.stringstack[var7++] = var44;
                                continue;
                            }

                            if (opcode == 38) {
                                --var6;
                                continue;
                            }

                            if (opcode == 39) {
                                if (DUMMY == -350752953) {
                                    throw new IllegalStateException();
                                }

                                --var7;
                                continue;
                            }

                            if (40 == opcode) {
                                var15 = var10[stackWordIndex];
                                RuneScript var100 = GameEngine.getRuneScript(var15, 2114830703);
                                var36 = new int[var100.intStackMax * 1107594725];
                                String[] var85 = new String[var100.stringStackMax * -857620813];

                                for (var38 = 0; var38 < var100.intArgGround * -1952773443; ++var38) {
                                    if (DUMMY == -350752953) {
                                        throw new IllegalStateException();
                                    }

                                    var36[var38] = UtilClass0.intstack[var6 - var100.intArgGround * -1952773443 + var38];
                                }

                                for (var38 = 0; var38 < var100.stringArgCount * 474469531; ++var38) {
                                    var85[var38] = UtilClass0.stringstack[var7 - var100.stringArgCount * 474469531 + var38];
                                }

                                var6 -= var100.intArgGround * -1952773443;
                                var7 -= var100.stringArgCount * 474469531;
                                ScriptStackElement var97 = new ScriptStackElement();
                                var97.fieldA = script;
                                var97.fieldV = stackWordIndex * 427443733;
                                var97.fieldI = UtilClass0.intStack;
                                var97.fieldB = UtilClass0.stringStack;
                                UtilClass0.scriptstackelement[(UtilClass0.fieldN += -186375071) * -518422623 - 1] = var97;
                                script = var100;
                                var9 = var100.opcodes;
                                var10 = var100.intOperands;
                                stackWordIndex = -1;
                                UtilClass0.intStack = var36;
                                UtilClass0.stringStack = var85;
                                continue;
                            }

                            if (42 == opcode) {
                                UtilClass0.intstack[var6++] = Client.fieldKw[var10[stackWordIndex]];
                                continue;
                            }

                            if (43 == opcode) {
                                if (DUMMY == -350752953) {
                                    throw new IllegalStateException();
                                }

                                var10001 = var10[stackWordIndex];
                                --var6;
                                Client.fieldKw[var10001] = UtilClass0.intstack[var6];
                                continue;
                            }

                            if (opcode == 44) {
                                if (DUMMY == -350752953) {
                                    throw new IllegalStateException();
                                }

                                var15 = var10[stackWordIndex] >> 16;
                                var16 = var10[stackWordIndex] & '\uffff';
                                --var6;
                                var17 = UtilClass0.intstack[var6];
                                if (var17 >= 0) {
                                    if (DUMMY == -350752953) {
                                        throw new IllegalStateException();
                                    }

                                    if (var17 <= 5000) {
                                        UtilClass0.fieldL[var15] = var17;
                                        var74 = -1;
                                        if (105 == var16) {
                                            var74 = 0;
                                        }

                                        var38 = 0;

                                        while (true) {
                                            if (var38 >= var17) {
                                                continue label4980;
                                            }

                                            if (DUMMY == -350752953) {
                                                throw new IllegalStateException();
                                            }

                                            UtilClass0.fieldM[var15][var38] = var74;
                                            ++var38;
                                        }
                                    }

                                    if (DUMMY == -350752953) {
                                        throw new IllegalStateException();
                                    }
                                }

                                throw new RuntimeException();
                            }

                            if (opcode == 45) {
                                if (DUMMY == -350752953) {
                                    return;
                                }

                                var15 = var10[stackWordIndex];
                                --var6;
                                var16 = UtilClass0.intstack[var6];
                                if (var16 >= 0) {
                                    if (DUMMY == -350752953) {
                                        return;
                                    }

                                    if (var16 < UtilClass0.fieldL[var15]) {
                                        UtilClass0.intstack[var6++] = UtilClass0.fieldM[var15][var16];
                                        continue;
                                    }

                                    if (DUMMY == -350752953) {
                                        return;
                                    }
                                }

                                throw new RuntimeException();
                            }

                            if (opcode == 46) {
                                if (DUMMY == -350752953) {
                                    throw new IllegalStateException();
                                }

                                var15 = var10[stackWordIndex];
                                var6 -= 2;
                                var16 = UtilClass0.intstack[var6];
                                if (var16 >= 0) {
                                    if (DUMMY == -350752953) {
                                        throw new IllegalStateException();
                                    }

                                    if (var16 < UtilClass0.fieldL[var15]) {
                                        UtilClass0.fieldM[var15][var16] = UtilClass0.intstack[var6 + 1];
                                        continue;
                                    }

                                    if (DUMMY == -350752953) {
                                        throw new IllegalStateException();
                                    }
                                }

                                throw new RuntimeException();
                            }

                            if (opcode == 47) {
                                if (DUMMY == -350752953) {
                                    throw new IllegalStateException();
                                }

                                var45 = Client.fieldKa[var10[stackWordIndex]];
                                if (null == var45) {
                                    if (DUMMY == -350752953) {
                                        throw new IllegalStateException();
                                    }

                                    var45 = "null";
                                }

                                UtilClass0.stringstack[var7++] = var45;
                                continue;
                            }

                            if (48 == opcode) {
                                if (DUMMY == -350752953) {
                                    throw new IllegalStateException();
                                }

                                var10001 = var10[stackWordIndex];
                                --var7;
                                Client.fieldKa[var10001] = UtilClass0.stringstack[var7];
                                continue;
                            }
                        }

                        boolean var50;
                        if (var10[stackWordIndex] == 1) {
                            if (DUMMY == -350752953) {
                                throw new IllegalStateException();
                            }

                            var50 = true;
                        } else {
                            var50 = false;
                        }

                        Widget var18;
                        Widget var19;
                        Widget var33;
                        if (opcode < 1000) {
                            if (opcode == 100) {
                                var6 -= 3;
                                var16 = UtilClass0.intstack[var6];
                                var17 = UtilClass0.intstack[1 + var6];
                                var35 = UtilClass0.intstack[2 + var6];
                                if (0 == var17) {
                                    if (DUMMY == -350752953) {
                                        throw new IllegalStateException();
                                    }

                                    throw new RuntimeException();
                                }

                                var19 = Widget.lookup(var16);
                                if (var19.children == null) {
                                    if (DUMMY == -350752953) {
                                        throw new IllegalStateException();
                                    }

                                    var19.children = new Widget[var35 + 1];
                                }

                                if (var19.children.length <= var35) {
                                    if (DUMMY == -350752953) {
                                        throw new IllegalStateException();
                                    }

                                    Widget[] var20 = new Widget[var35 + 1];

                                    for (var21 = 0; var21 < var19.children.length; ++var21) {
                                        if (DUMMY == -350752953) {
                                            throw new IllegalStateException();
                                        }

                                        var20[var21] = var19.children[var21];
                                    }

                                    var19.children = var20;
                                }

                                if (var35 > 0) {
                                    if (DUMMY == -350752953) {
                                        return;
                                    }

                                    if (null == var19.children[var35 - 1]) {
                                        if (DUMMY == -350752953) {
                                            throw new IllegalStateException();
                                        }

                                        throw new RuntimeException("" + (var35 - 1));
                                    }
                                }

                                Widget var39 = new Widget();
                                var39.type = 295036789 * var17;
                                var39.fieldP = (var39.id = 1 * var19.id) * 1157525789;
                                var39.index = -908534401 * var35;
                                var39.fieldK = true;
                                var19.children[var35] = var39;
                                if (var50) {
                                    if (DUMMY == -350752953) {
                                        throw new IllegalStateException();
                                    }

                                    Message.fieldF = var39;
                                } else {
                                    classDa.fieldK = var39;
                                }

                                classBx.method250(var19, 57574739);
                                continue;
                            }

                            if (opcode == 101) {
                                if (DUMMY == -350752953) {
                                    return;
                                }

                                var33 = var50 ? Message.fieldF : classDa.fieldK;
                                Widget var34 = Widget.lookup(var33.id * -1866039137);
                                var34.children[var33.index * 1176560255] = null;
                                classBx.method250(var34, 57574739);
                                continue;
                            }

                            if (102 == opcode) {
                                --var6;
                                var33 = Widget.lookup(UtilClass0.intstack[var6]);
                                var33.children = null;
                                classBx.method250(var33, 57574739);
                                continue;
                            }

                            if (opcode == 200) {
                                if (DUMMY == -350752953) {
                                    throw new IllegalStateException();
                                }

                                var6 -= 2;
                                var16 = UtilClass0.intstack[var6];
                                var17 = UtilClass0.intstack[1 + var6];
                                var18 = Message.getWidget(var16, var17, (byte) 1);
                                if (null != var18) {
                                    if (DUMMY == -350752953) {
                                        throw new IllegalStateException();
                                    }

                                    if (var17 != -1) {
                                        if (DUMMY == -350752953) {
                                            return;
                                        }

                                        UtilClass0.intstack[var6++] = 1;
                                        if (var50) {
                                            if (DUMMY == -350752953) {
                                                return;
                                            }

                                            Message.fieldF = var18;
                                        } else {
                                            classDa.fieldK = var18;
                                        }
                                        continue;
                                    }
                                }

                                UtilClass0.intstack[var6++] = 0;
                                continue;
                            }
                        } else {
                            label5025:
                            {
                                boolean var40;
                                Widget var101;
                                label5026:
                                {
                                    if (opcode >= 1000) {
                                        if (DUMMY == -350752953) {
                                            throw new IllegalStateException();
                                        }

                                        if (opcode < 1100) {
                                            break label5026;
                                        }

                                        if (DUMMY == -350752953) {
                                            throw new IllegalStateException();
                                        }
                                    }

                                    if (opcode >= 2000) {
                                        if (DUMMY == -350752953) {
                                            throw new IllegalStateException();
                                        }

                                        if (opcode < 2100) {
                                            break label5026;
                                        }
                                    }

                                    String var46;
                                    boolean var106;
                                    label5182:
                                    {
                                        if (opcode >= 1100) {
                                            if (DUMMY == -350752953) {
                                                return;
                                            }

                                            if (opcode < 1200) {
                                                break label5182;
                                            }

                                            if (DUMMY == -350752953) {
                                                return;
                                            }
                                        }

                                        if (opcode >= 2100) {
                                            if (DUMMY == -350752953) {
                                                throw new IllegalStateException();
                                            }

                                            if (opcode < 2200) {
                                                break label5182;
                                            }
                                        }

                                        boolean var103;
                                        label5030:
                                        {
                                            if (opcode >= 1200) {
                                                if (DUMMY == -350752953) {
                                                    throw new IllegalStateException();
                                                }

                                                if (opcode < 1300) {
                                                    break label5030;
                                                }

                                                if (DUMMY == -350752953) {
                                                    return;
                                                }
                                            }

                                            if (opcode < 2200 || opcode >= 2300) {
                                                label5032:
                                                {
                                                    if (opcode >= 1300) {
                                                        if (DUMMY == -350752953) {
                                                            throw new IllegalStateException();
                                                        }

                                                        if (opcode < 1400) {
                                                            break label5032;
                                                        }

                                                        if (DUMMY == -350752953) {
                                                            throw new IllegalStateException();
                                                        }
                                                    }

                                                    if (opcode < 2300 || opcode >= 2400) {
                                                        int[] var41;
                                                        label5034:
                                                        {
                                                            label5035:
                                                            {
                                                                if (opcode >= 1400) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    if (opcode < 1500) {
                                                                        break label5035;
                                                                    }

                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }
                                                                }

                                                                if (opcode < 2400) {
                                                                    break label5034;
                                                                }

                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                if (opcode >= 2500) {
                                                                    break label5034;
                                                                }

                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }
                                                            }

                                                            if (opcode >= 2000) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                opcode -= 1000;
                                                                --var6;
                                                                var33 = Widget.lookup(UtilClass0.intstack[var6]);
                                                            } else {
                                                                if (var50) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    var101 = Message.fieldF;
                                                                } else {
                                                                    var101 = classDa.fieldK;
                                                                }

                                                                var33 = var101;
                                                            }

                                                            --var7;
                                                            var46 = UtilClass0.stringstack[var7];
                                                            var41 = null;
                                                            if (var46.length() > 0) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                if (var46.charAt(var46.length() - 1) == 89) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    --var6;
                                                                    var38 = UtilClass0.intstack[var6];
                                                                    if (var38 > 0) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        for (var41 = new int[var38]; var38-- > 0; var41[var38] = UtilClass0.intstack[var6]) {
                                                                            if (DUMMY == -350752953) {
                                                                                throw new IllegalStateException();
                                                                            }

                                                                            --var6;
                                                                        }
                                                                    }

                                                                    var46 = var46.substring(0, var46.length() - 1);
                                                                }
                                                            }

                                                            Object[] var91 = new Object[var46.length() + 1];

                                                            for (var42 = var91.length - 1; var42 >= 1; --var42) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                if (var46.charAt(var42 - 1) == 115) {
                                                                    --var7;
                                                                    var91[var42] = UtilClass0.stringstack[var7];
                                                                } else {
                                                                    --var6;
                                                                    Integer var107 = UtilClass0.intstack[var6];
                                                                    var91[var42] = var107;
                                                                }
                                                            }

                                                            --var6;
                                                            var42 = UtilClass0.intstack[var6];
                                                            if (-1 != var42) {
                                                                if (DUMMY == -350752953) {
                                                                    return;
                                                                }

                                                                var91[0] = new Integer(var42);
                                                            } else {
                                                                var91 = null;
                                                            }

                                                            if (opcode == 1400) {
                                                                if (DUMMY == -350752953) {
                                                                    return;
                                                                }

                                                                var33.fieldCq = var91;
                                                            }

                                                            if (1401 == opcode) {
                                                                var33.fieldCo = var91;
                                                            }

                                                            if (opcode == 1402) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                var33.fieldCf = var91;
                                                            }

                                                            if (opcode == 1403) {
                                                                var33.fieldCj = var91;
                                                            }

                                                            if (opcode == 1404) {
                                                                if (DUMMY == -350752953) {
                                                                    return;
                                                                }

                                                                var33.fieldCb = var91;
                                                            }

                                                            if (1405 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    return;
                                                                }

                                                                var33.fieldCh = var91;
                                                            }

                                                            if (opcode == 1406) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                var33.fieldCk = var91;
                                                            }

                                                            if (opcode == 1407) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                var33.fieldCg = var91;
                                                                var33.fieldCy = var41;
                                                            }

                                                            if (1408 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    return;
                                                                }

                                                                var33.fieldCl = var91;
                                                            }

                                                            if (opcode == 1409) {
                                                                var33.fieldCz = var91;
                                                            }

                                                            if (1410 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                var33.fieldCn = var91;
                                                            }

                                                            if (1411 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    return;
                                                                }

                                                                var33.fieldCi = var91;
                                                            }

                                                            if (opcode == 1412) {
                                                                var33.fieldCd = var91;
                                                            }

                                                            if (1414 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                var33.fieldCv = var91;
                                                                var33.fieldCc = var41;
                                                            }

                                                            if (1415 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    return;
                                                                }

                                                                var33.fieldCx = var91;
                                                                var33.fieldCe = var41;
                                                            }

                                                            if (opcode == 1416) {
                                                                if (DUMMY == -350752953) {
                                                                    return;
                                                                }

                                                                var33.fieldCp = var91;
                                                            }

                                                            if (1417 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    return;
                                                                }

                                                                var33.fieldCm = var91;
                                                            }

                                                            if (1418 == opcode) {
                                                                var33.fieldCu = var91;
                                                            }

                                                            if (1419 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    return;
                                                                }

                                                                var33.fieldCa = var91;
                                                            }

                                                            if (opcode == 1420) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                var33.fieldCs = var91;
                                                            }

                                                            if (opcode == 1421) {
                                                                var33.fieldDg = var91;
                                                            }

                                                            if (opcode == 1422) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                var33.fieldDd = var91;
                                                            }

                                                            if (1423 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                var33.fieldDp = var91;
                                                            }

                                                            if (opcode == 1424) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                var33.fieldDu = var91;
                                                            }

                                                            if (opcode == 1425) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                var33.fieldDj = var91;
                                                            }

                                                            if (1426 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                var33.fieldDi = var91;
                                                            }

                                                            var33.fieldCt = true;
                                                            continue;
                                                        }

                                                        byte var10002;
                                                        if (opcode < 1600) {
                                                            if (var50) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                var101 = Message.fieldF;
                                                            } else {
                                                                var101 = classDa.fieldK;
                                                            }

                                                            var33 = var101;
                                                            if (opcode == 1500) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                UtilClass0.intstack[var6++] = var33.relativeX * -1209469007;
                                                                continue;
                                                            }

                                                            if (opcode == 1501) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                UtilClass0.intstack[var6++] = var33.relativeY * -493238439;
                                                                continue;
                                                            }

                                                            if (opcode == 1502) {
                                                                if (DUMMY == -350752953) {
                                                                    return;
                                                                }

                                                                UtilClass0.intstack[var6++] = var33.width * 805002637;
                                                                continue;
                                                            }

                                                            if (1503 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                UtilClass0.intstack[var6++] = var33.height * -1004717071;
                                                                continue;
                                                            }

                                                            if (opcode == 1504) {
                                                                if (DUMMY == -350752953) {
                                                                    return;
                                                                }

                                                                var10001 = var6++;
                                                                if (var33.fieldR) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    var10002 = 1;
                                                                } else {
                                                                    var10002 = 0;
                                                                }

                                                                UtilClass0.intstack[var10001] = var10002;
                                                                continue;
                                                            }

                                                            if (1505 == opcode) {
                                                                UtilClass0.intstack[var6++] = var33.fieldP * 1574594539;
                                                                continue;
                                                            }
                                                        } else if (opcode < 1700) {
                                                            if (DUMMY == -350752953) {
                                                                throw new IllegalStateException();
                                                            }

                                                            if (var50) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                var101 = Message.fieldF;
                                                            } else {
                                                                var101 = classDa.fieldK;
                                                            }

                                                            var33 = var101;
                                                            if (opcode == 1600) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                UtilClass0.intstack[var6++] = var33.insetX * 531263513;
                                                                continue;
                                                            }

                                                            if (opcode == 1601) {
                                                                if (DUMMY == -350752953) {
                                                                    return;
                                                                }

                                                                UtilClass0.intstack[var6++] = var33.insetY * -1991825281;
                                                                continue;
                                                            }

                                                            if (1602 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    return;
                                                                }

                                                                UtilClass0.stringstack[var7++] = var33.fieldBm;
                                                                continue;
                                                            }

                                                            if (opcode == 1603) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                UtilClass0.intstack[var6++] = var33.fieldAn * 192647263;
                                                                continue;
                                                            }

                                                            if (1604 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    return;
                                                                }

                                                                UtilClass0.intstack[var6++] = var33.viewportHeight * 1854186653;
                                                                continue;
                                                            }

                                                            if (1605 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                UtilClass0.intstack[var6++] = var33.fieldBi * 1337242061;
                                                                continue;
                                                            }

                                                            if (1606 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                UtilClass0.intstack[var6++] = var33.fieldAy * 1396274965;
                                                                continue;
                                                            }

                                                            if (opcode == 1607) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                UtilClass0.intstack[var6++] = var33.fieldBo * -1543116951;
                                                                continue;
                                                            }

                                                            if (opcode == 1608) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                UtilClass0.intstack[var6++] = var33.fieldBu * 550343665;
                                                                continue;
                                                            }
                                                        } else if (opcode < 1800) {
                                                            if (DUMMY == -350752953) {
                                                                throw new IllegalStateException();
                                                            }

                                                            if (var50) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                var101 = Message.fieldF;
                                                            } else {
                                                                var101 = classDa.fieldK;
                                                            }

                                                            var33 = var101;
                                                            if (1700 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                UtilClass0.intstack[var6++] = var33.itemId * -5424365;
                                                                continue;
                                                            }

                                                            if (1701 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                if (var33.itemId * -5424365 != -1) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    UtilClass0.intstack[var6++] = var33.fieldDl * -1877296303;
                                                                } else {
                                                                    UtilClass0.intstack[var6++] = 0;
                                                                }
                                                                continue;
                                                            }

                                                            if (1702 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                UtilClass0.intstack[var6++] = var33.index * 1176560255;
                                                                continue;
                                                            }
                                                        } else if (opcode < 1900) {
                                                            if (DUMMY == -350752953) {
                                                                return;
                                                            }

                                                            if (var50) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                var101 = Message.fieldF;
                                                            } else {
                                                                var101 = classDa.fieldK;
                                                            }

                                                            var33 = var101;
                                                            if (opcode == 1800) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                var36 = UtilClass0.intstack;
                                                                var35 = var6++;
                                                                var42 = UtilClass38.getWidgetConfig(var33, 2070855251);
                                                                var38 = var42 >> 11 & 63;
                                                                var36[var35] = var38;
                                                                continue;
                                                            }

                                                            if (1801 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                --var6;
                                                                var17 = UtilClass0.intstack[var6];
                                                                --var17;
                                                                if (null != var33.fieldBv) {
                                                                    if (DUMMY == -350752953) {
                                                                        return;
                                                                    }

                                                                    if (var17 < var33.fieldBv.length) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        if (var33.fieldBv[var17] != null) {
                                                                            UtilClass0.stringstack[var7++] = var33.fieldBv[var17];
                                                                            continue;
                                                                        }
                                                                    }
                                                                }

                                                                UtilClass0.stringstack[var7++] = "";
                                                                continue;
                                                            }

                                                            if (1802 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    return;
                                                                }

                                                                if (null == var33.fieldBa) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    UtilClass0.stringstack[var7++] = "";
                                                                } else {
                                                                    UtilClass0.stringstack[var7++] = var33.fieldBa;
                                                                }
                                                                continue;
                                                            }
                                                        } else if (opcode < 2600) {
                                                            if (DUMMY == -350752953) {
                                                                return;
                                                            }

                                                            --var6;
                                                            var33 = Widget.lookup(UtilClass0.intstack[var6]);
                                                            if (2500 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                UtilClass0.intstack[var6++] = var33.relativeX * -1209469007;
                                                                continue;
                                                            }

                                                            if (2501 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                UtilClass0.intstack[var6++] = var33.relativeY * -493238439;
                                                                continue;
                                                            }

                                                            if (2502 == opcode) {
                                                                UtilClass0.intstack[var6++] = var33.width * 805002637;
                                                                continue;
                                                            }

                                                            if (opcode == 2503) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                UtilClass0.intstack[var6++] = var33.height * -1004717071;
                                                                continue;
                                                            }

                                                            if (2504 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                UtilClass0.intstack[var6++] = var33.fieldR ? 1 : 0;
                                                                continue;
                                                            }

                                                            if (2505 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                UtilClass0.intstack[var6++] = var33.fieldP * 1574594539;
                                                                continue;
                                                            }
                                                        } else if (opcode < 2700) {
                                                            if (DUMMY == -350752953) {
                                                                return;
                                                            }

                                                            --var6;
                                                            var33 = Widget.lookup(UtilClass0.intstack[var6]);
                                                            if (2600 == opcode) {
                                                                UtilClass0.intstack[var6++] = var33.insetX * 531263513;
                                                                continue;
                                                            }

                                                            if (2601 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                UtilClass0.intstack[var6++] = var33.insetY * -1991825281;
                                                                continue;
                                                            }

                                                            if (2602 == opcode) {
                                                                UtilClass0.stringstack[var7++] = var33.fieldBm;
                                                                continue;
                                                            }

                                                            if (opcode == 2603) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                UtilClass0.intstack[var6++] = var33.fieldAn * 192647263;
                                                                continue;
                                                            }

                                                            if (opcode == 2604) {
                                                                if (DUMMY == -350752953) {
                                                                    return;
                                                                }

                                                                UtilClass0.intstack[var6++] = var33.viewportHeight * 1854186653;
                                                                continue;
                                                            }

                                                            if (opcode == 2605) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                UtilClass0.intstack[var6++] = var33.fieldBi * 1337242061;
                                                                continue;
                                                            }

                                                            if (opcode == 2606) {
                                                                UtilClass0.intstack[var6++] = var33.fieldAy * 1396274965;
                                                                continue;
                                                            }

                                                            if (2607 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                UtilClass0.intstack[var6++] = var33.fieldBo * -1543116951;
                                                                continue;
                                                            }

                                                            if (2608 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    return;
                                                                }

                                                                UtilClass0.intstack[var6++] = var33.fieldBu * 550343665;
                                                                continue;
                                                            }
                                                        } else if (opcode < 2800) {
                                                            if (DUMMY == -350752953) {
                                                                return;
                                                            }

                                                            if (opcode == 2700) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                --var6;
                                                                var33 = Widget.lookup(UtilClass0.intstack[var6]);
                                                                UtilClass0.intstack[var6++] = var33.itemId * -5424365;
                                                                continue;
                                                            }

                                                            if (2701 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                --var6;
                                                                var33 = Widget.lookup(UtilClass0.intstack[var6]);
                                                                if (var33.itemId * -5424365 != -1) {
                                                                    UtilClass0.intstack[var6++] = var33.fieldDl * -1877296303;
                                                                } else {
                                                                    UtilClass0.intstack[var6++] = 0;
                                                                }
                                                                continue;
                                                            }

                                                            if (opcode == 2702) {
                                                                --var6;
                                                                var16 = UtilClass0.intstack[var6];
                                                                WidgetNode var37 = (WidgetNode) Client.widgetNodes.get((long) var16);
                                                                if (var37 != null) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    UtilClass0.intstack[var6++] = 1;
                                                                } else {
                                                                    UtilClass0.intstack[var6++] = 0;
                                                                }
                                                                continue;
                                                            }
                                                        } else if (opcode < 2900) {
                                                            --var6;
                                                            var33 = Widget.lookup(UtilClass0.intstack[var6]);
                                                            if (opcode == 2800) {
                                                                var36 = UtilClass0.intstack;
                                                                var35 = var6++;
                                                                var42 = UtilClass38.getWidgetConfig(var33, 2070855251);
                                                                var38 = var42 >> 11 & 63;
                                                                var36[var35] = var38;
                                                                continue;
                                                            }

                                                            if (2801 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                --var6;
                                                                var17 = UtilClass0.intstack[var6];
                                                                --var17;
                                                                if (var33.fieldBv != null) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    if (var17 < var33.fieldBv.length) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        if (var33.fieldBv[var17] != null) {
                                                                            UtilClass0.stringstack[var7++] = var33.fieldBv[var17];
                                                                            continue;
                                                                        }

                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }
                                                                    }
                                                                }

                                                                UtilClass0.stringstack[var7++] = "";
                                                                continue;
                                                            }

                                                            if (opcode == 2802) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                if (var33.fieldBa == null) {
                                                                    if (DUMMY == -350752953) {
                                                                        return;
                                                                    }

                                                                    UtilClass0.stringstack[var7++] = "";
                                                                } else {
                                                                    UtilClass0.stringstack[var7++] = var33.fieldBa;
                                                                }
                                                                continue;
                                                            }
                                                        } else if (opcode < 3200) {
                                                            if (DUMMY == -350752953) {
                                                                throw new IllegalStateException();
                                                            }

                                                            if (opcode == 3100) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                --var7;
                                                                var44 = UtilClass0.stringstack[var7];
                                                                JagSocket.addMessage(0, "", var44, (byte) 16);
                                                                continue;
                                                            }

                                                            if (3101 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    return;
                                                                }

                                                                var6 -= 2;
                                                                ItemTable.method203(Client.myPlayer, UtilClass0.intstack[var6], UtilClass0.intstack[var6 + 1], 1252284258);
                                                                continue;
                                                            }

                                                            if (3103 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                World.method181();
                                                                continue;
                                                            }

                                                            if (3104 == opcode) {
                                                                --var7;
                                                                var44 = UtilClass0.stringstack[var7];
                                                                var17 = 0;
                                                                if (ClanMate.method195(var44, 1096029294)) {
                                                                    var17 = classCs.method305(var44, 1917400400);
                                                                }

                                                                Client.fieldCo.writePacketHeader(167, (byte) 0);
                                                                Client.fieldCo.writeInt(var17);
                                                                continue;
                                                            }

                                                            if (3105 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                --var7;
                                                                var44 = UtilClass0.stringstack[var7];
                                                                Client.fieldCo.writePacketHeader(147, (byte) 0);
                                                                Client.fieldCo.writeByte(var44.length() + 1);
                                                                Client.fieldCo.w(var44, (byte) 0);
                                                                continue;
                                                            }

                                                            if (opcode == 3106) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                --var7;
                                                                var44 = UtilClass0.stringstack[var7];
                                                                Client.fieldCo.writePacketHeader(200, (byte) 0);
                                                                Client.fieldCo.writeByte(var44.length() + 1);
                                                                Client.fieldCo.w(var44, (byte) 0);
                                                                continue;
                                                            }

                                                            if (3107 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                --var6;
                                                                var16 = UtilClass0.intstack[var6];
                                                                --var7;
                                                                var46 = UtilClass0.stringstack[var7];
                                                                Projectile.method156(var16, var46, 1906375050);
                                                                continue;
                                                            }

                                                            if (3108 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    return;
                                                                }

                                                                var6 -= 3;
                                                                var16 = UtilClass0.intstack[var6];
                                                                var17 = UtilClass0.intstack[1 + var6];
                                                                var35 = UtilClass0.intstack[2 + var6];
                                                                var19 = Widget.lookup(var35);
                                                                classBy.method248(var19, var16, var17, (byte) 127);
                                                                continue;
                                                            }

                                                            if (3109 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    return;
                                                                }

                                                                var6 -= 2;
                                                                var16 = UtilClass0.intstack[var6];
                                                                var17 = UtilClass0.intstack[var6 + 1];
                                                                if (var50) {
                                                                    if (DUMMY == -350752953) {
                                                                        return;
                                                                    }

                                                                    var101 = Message.fieldF;
                                                                } else {
                                                                    var101 = classDa.fieldK;
                                                                }

                                                                var18 = var101;
                                                                classBy.method248(var18, var16, var17, (byte) 101);
                                                                continue;
                                                            }

                                                            if (3110 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                --var6;
                                                                if (UtilClass0.intstack[var6] == 1) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    var103 = true;
                                                                } else {
                                                                    var103 = false;
                                                                }

                                                                CalendarUtil.fieldAw = var103;
                                                                continue;
                                                            }

                                                            if (3111 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                UtilClass0.intstack[var6++] = Projectile.preferences.roofsEnabled ? 1 : 0;
                                                                continue;
                                                            }

                                                            if (3112 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                --var6;
                                                                if (UtilClass0.intstack[var6] == 1) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    var106 = true;
                                                                } else {
                                                                    var106 = false;
                                                                }

                                                                Projectile.preferences.roofsEnabled = var106;
                                                                World.method182(1790188);
                                                                continue;
                                                            }

                                                            if (3113 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    return;
                                                                }

                                                                --var7;
                                                                var44 = UtilClass0.stringstack[var7];
                                                                --var6;
                                                                if (UtilClass0.intstack[var6] == 1) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    var103 = true;
                                                                } else {
                                                                    var103 = false;
                                                                }

                                                                var40 = var103;
                                                                RuneScript.method162(var44, var40, false, 1774221287);
                                                                continue;
                                                            }

                                                            if (3115 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                --var6;
                                                                var16 = UtilClass0.intstack[var6];
                                                                Client.fieldCo.writePacketHeader(10, (byte) 0);
                                                                Client.fieldCo.writeShort(var16);
                                                                continue;
                                                            }
                                                        } else if (opcode < 3300) {
                                                            if (DUMMY == -350752953) {
                                                                return;
                                                            }

                                                            if (3200 == opcode) {
                                                                var6 -= 3;
                                                                var16 = UtilClass0.intstack[var6];
                                                                var17 = UtilClass0.intstack[var6 + 1];
                                                                var35 = UtilClass0.intstack[2 + var6];
                                                                if (Client.fieldNe * 1707214503 != 0) {
                                                                    if (DUMMY == -350752953) {
                                                                        return;
                                                                    }

                                                                    if (0 != var17) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        if (Client.fieldNx * 1993078547 < 50) {
                                                                            if (DUMMY == -350752953) {
                                                                                throw new IllegalStateException();
                                                                            }

                                                                            Client.fieldNp[Client.fieldNx * 1993078547] = var16;
                                                                            Client.fieldNl[Client.fieldNx * 1993078547] = var17;
                                                                            Client.fieldNw[Client.fieldNx * 1993078547] = var35;
                                                                            Client.fieldNq[Client.fieldNx * 1993078547] = null;
                                                                            Client.fieldNj[Client.fieldNx * 1993078547] = 0;
                                                                            Client.fieldNx += 1441295131;
                                                                        }
                                                                    }
                                                                }
                                                                continue;
                                                            }

                                                            if (opcode == 3201) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                --var6;
                                                                Message.method384(UtilClass0.intstack[var6], (short) 21910);
                                                                continue;
                                                            }

                                                            if (opcode == 3202) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                var6 -= 2;
                                                                var16 = UtilClass0.intstack[var6];
                                                                var10000 = UtilClass0.intstack[1 + var6];
                                                                if (Client.fieldMh * 895565207 != 0) {
                                                                    if (DUMMY == -350752953) {
                                                                        return;
                                                                    }

                                                                    if (-1 != var16) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        UtilClass40.method171(Client.fieldBz, var16, 0, Client.fieldMh * 895565207, false, -911580244);
                                                                        Client.fieldMv = true;
                                                                    }
                                                                }
                                                                continue;
                                                            }
                                                        } else if (opcode < 3400) {
                                                            if (opcode == 3300) {
                                                                UtilClass0.intstack[var6++] = Client.engineCycle * -1223223371;
                                                                continue;
                                                            }

                                                            ItemTable var47;
                                                            if (3301 == opcode) {
                                                                var6 -= 2;
                                                                var16 = UtilClass0.intstack[var6];
                                                                var17 = UtilClass0.intstack[var6 + 1];
                                                                var41 = UtilClass0.intstack;
                                                                var38 = var6++;
                                                                var47 = (ItemTable) ItemTable.cache.get((long) var16);
                                                                if (var47 == null) {
                                                                    var42 = -1;
                                                                } else {
                                                                    label4602:
                                                                    {
                                                                        if (var17 >= 0 && var17 < var47.ids.length) {
                                                                            var42 = var47.ids[var17];
                                                                            break label4602;
                                                                        }
                                                                        var42 = -1;
                                                                    }
                                                                }
                                                                var41[var38] = var42;
                                                                continue;
                                                            }

                                                            if (3302 == opcode) {
                                                                var6 -= 2;
                                                                var16 = UtilClass0.intstack[var6];
                                                                var17 = UtilClass0.intstack[var6 + 1];
                                                                UtilClass0.intstack[var6++] = classDp.getUniqueItemQuantity(var16, var17);
                                                                continue;
                                                            }

                                                            if (3303 == opcode) {
                                                                var6 -= 2;
                                                                var16 = UtilClass0.intstack[var6];
                                                                var17 = UtilClass0.intstack[var6 + 1];
                                                                UtilClass0.intstack[var6++] = ItemDefinition.getItemQuantity(var16, var17, (byte) -101);
                                                                continue;
                                                            }

                                                            if (opcode == 3304) {
                                                                --var6;
                                                                var16 = UtilClass0.intstack[var6];
                                                                var36 = UtilClass0.intstack;
                                                                var35 = var6++;
                                                                CacheInt var51 = (CacheInt) CacheInt.fieldV.get((long) var16);
                                                                CacheInt var43;
                                                                if (var51 != null) {
                                                                    var43 = var51;
                                                                } else {
                                                                    byte[] var49 = CacheInt.fieldA.getFile(5, var16, (short) 24592);
                                                                    var51 = new CacheInt();
                                                                    if (var49 != null) {
                                                                        var51.v(new Buffer(var49), -1092093683);
                                                                    }
                                                                    CacheInt.fieldV.put(var51, (long) var16);
                                                                    var43 = var51;
                                                                }

                                                                var36[var35] = var43.value * -1271455393;
                                                                continue;
                                                            }

                                                            if (opcode == 3305) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                --var6;
                                                                var16 = UtilClass0.intstack[var6];
                                                                UtilClass0.intstack[var6++] = Client.levels[var16];
                                                                continue;
                                                            }

                                                            if (opcode == 3306) {
                                                                if (DUMMY == -350752953) {
                                                                    return;
                                                                }

                                                                --var6;
                                                                var16 = UtilClass0.intstack[var6];
                                                                UtilClass0.intstack[var6++] = Client.currentLevels[var16];
                                                                continue;
                                                            }

                                                            if (opcode == 3307) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                --var6;
                                                                var16 = UtilClass0.intstack[var6];
                                                                UtilClass0.intstack[var6++] = Client.experiences[var16];
                                                                continue;
                                                            }

                                                            if (opcode == 3308) {
                                                                if (DUMMY == -350752953) {
                                                                    return;
                                                                }

                                                                var16 = Client.floorLevel * 87713183;
                                                                var17 = classDc.baseX * -2071335905 + (Client.myPlayer.strictX * 404428603 >> 7);
                                                                var35 = CalendarUtil.baseY * -1046564359 + (-1490664571 * Client.myPlayer.strictY >> 7);
                                                                UtilClass0.intstack[var6++] = var35 + (var16 << 28) + (var17 << 14);
                                                                continue;
                                                            }

                                                            if (opcode == 3309) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                --var6;
                                                                var16 = UtilClass0.intstack[var6];
                                                                UtilClass0.intstack[var6++] = var16 >> 14 & 16383;
                                                                continue;
                                                            }

                                                            if (opcode == 3310) {
                                                                --var6;
                                                                var16 = UtilClass0.intstack[var6];
                                                                UtilClass0.intstack[var6++] = var16 >> 28;
                                                                continue;
                                                            }

                                                            if (3311 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                --var6;
                                                                var16 = UtilClass0.intstack[var6];
                                                                UtilClass0.intstack[var6++] = var16 & 16383;
                                                                continue;
                                                            }

                                                            if (3312 == opcode) {
                                                                var10001 = var6++;
                                                                if (Client.fieldK) {
                                                                    if (DUMMY == -350752953) {
                                                                        return;
                                                                    }

                                                                    var10002 = 1;
                                                                } else {
                                                                    var10002 = 0;
                                                                }

                                                                UtilClass0.intstack[var10001] = var10002;
                                                                continue;
                                                            }

                                                            if (3313 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                var6 -= 2;
                                                                var16 = '\u8000' + UtilClass0.intstack[var6];
                                                                var17 = UtilClass0.intstack[1 + var6];
                                                                var41 = UtilClass0.intstack;
                                                                var38 = var6++;
                                                                var47 = (ItemTable) ItemTable.cache.get((long) var16);
                                                                if (var47 == null) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    var42 = -1;
                                                                } else {
                                                                    label4611:
                                                                    {
                                                                        if (var17 >= 0) {
                                                                            if (DUMMY == -350752953) {
                                                                                throw new IllegalStateException();
                                                                            }

                                                                            if (var17 < var47.ids.length) {
                                                                                var42 = var47.ids[var17];
                                                                                break label4611;
                                                                            }

                                                                            if (DUMMY == -350752953) {
                                                                                throw new IllegalStateException();
                                                                            }
                                                                        }

                                                                        var42 = -1;
                                                                    }
                                                                }

                                                                var41[var38] = var42;
                                                                continue;
                                                            }

                                                            if (opcode == 3314) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                var6 -= 2;
                                                                var16 = '\u8000' + UtilClass0.intstack[var6];
                                                                var17 = UtilClass0.intstack[var6 + 1];
                                                                UtilClass0.intstack[var6++] = classDp.getUniqueItemQuantity(var16, var17);
                                                                continue;
                                                            }

                                                            if (3315 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    return;
                                                                }

                                                                var6 -= 2;
                                                                var16 = UtilClass0.intstack[var6] + '\u8000';
                                                                var17 = UtilClass0.intstack[1 + var6];
                                                                UtilClass0.intstack[var6++] = ItemDefinition.getItemQuantity(var16, var17, (byte) -101);
                                                                continue;
                                                            }

                                                            if (opcode == 3316) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                if (Client.playerRights * -1572330347 >= 2) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    UtilClass0.intstack[var6++] = Client.playerRights * -1572330347;
                                                                } else {
                                                                    UtilClass0.intstack[var6++] = 0;
                                                                }
                                                                continue;
                                                            }

                                                            if (opcode == 3317) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                UtilClass0.intstack[var6++] = Client.fieldAr * -499169579;
                                                                continue;
                                                            }

                                                            if (3318 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                UtilClass0.intstack[var6++] = Client.currentWorld * -1276662997;
                                                                continue;
                                                            }

                                                            if (3321 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                UtilClass0.intstack[var6++] = Client.fieldJu * -1490565209;
                                                                continue;
                                                            }

                                                            if (3322 == opcode) {
                                                                UtilClass0.intstack[var6++] = Client.fieldJp * 885212209;
                                                                continue;
                                                            }

                                                            if (opcode == 3323) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                if (Client.fieldJj) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    UtilClass0.intstack[var6++] = 1;
                                                                } else {
                                                                    UtilClass0.intstack[var6++] = 0;
                                                                }
                                                                continue;
                                                            }

                                                            if (3324 == opcode) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                UtilClass0.intstack[var6++] = Client.fieldL * -1521806339;
                                                                continue;
                                                            }
                                                        } else if (opcode < 3500) {
                                                            if (3400 == opcode) {
                                                                var6 -= 2;
                                                                var16 = UtilClass0.intstack[var6];
                                                                var17 = UtilClass0.intstack[1 + var6];
                                                                WidgetStrings var48 = classHf.method22(var16, 2018930494);
                                                                if (115 != var48.fieldB) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }
                                                                }

                                                                for (var38 = 0; var38 < var48.fieldW * 1762029337; ++var38) {
                                                                    if (var48.fieldE[var38] == var17) {
                                                                        UtilClass0.stringstack[var7++] = var48.fieldS[var38];
                                                                        var48 = null;
                                                                        break;
                                                                    }
                                                                }

                                                                if (var48 != null) {
                                                                    UtilClass0.stringstack[var7++] = var48.fieldL;
                                                                }
                                                                continue;
                                                            }

                                                            if (opcode == 3408) {
                                                                if (DUMMY == -350752953) {
                                                                    return;
                                                                }

                                                                var6 -= 4;
                                                                var16 = UtilClass0.intstack[var6];
                                                                var17 = UtilClass0.intstack[1 + var6];
                                                                var35 = UtilClass0.intstack[var6 + 2];
                                                                var38 = UtilClass0.intstack[3 + var6];
                                                                WidgetStrings var62 = classHf.method22(var35, 1727913818);
                                                                if (var62.fieldI == var16) {
                                                                    if (DUMMY == -350752953) {
                                                                        return;
                                                                    }

                                                                    if (var62.fieldB == var17) {
                                                                        for (var21 = 0; var21 < var62.fieldW * 1762029337; ++var21) {
                                                                            if (DUMMY == -350752953) {
                                                                                throw new IllegalStateException();
                                                                            }

                                                                            if (var62.fieldE[var21] == var38) {
                                                                                if (DUMMY == -350752953) {
                                                                                    throw new IllegalStateException();
                                                                                }

                                                                                if (var17 == 115) {
                                                                                    if (DUMMY == -350752953) {
                                                                                        return;
                                                                                    }

                                                                                    UtilClass0.stringstack[var7++] = var62.fieldS[var21];
                                                                                } else {
                                                                                    UtilClass0.intstack[var6++] = var62.fieldN[var21];
                                                                                }

                                                                                var62 = null;
                                                                                break;
                                                                            }
                                                                        }

                                                                        if (null != var62) {
                                                                            if (DUMMY == -350752953) {
                                                                                return;
                                                                            }

                                                                            if (115 == var17) {
                                                                                if (DUMMY == -350752953) {
                                                                                    throw new IllegalStateException();
                                                                                }

                                                                                UtilClass0.stringstack[var7++] = var62.fieldL;
                                                                            } else {
                                                                                UtilClass0.intstack[var6++] = var62.fieldM * -280591329;
                                                                            }
                                                                        }
                                                                        continue;
                                                                    }

                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }
                                                                }

                                                                if (115 == var17) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    UtilClass0.stringstack[var7++] = "null";
                                                                } else {
                                                                    UtilClass0.intstack[var6++] = 0;
                                                                }
                                                                continue;
                                                            }
                                                        } else {
                                                            int var22;
                                                            int[] var104;
                                                            if (opcode < 3700) {
                                                                if (3600 == opcode) {
                                                                    if (0 == Client.fieldOm * -2000562471) {
                                                                        UtilClass0.intstack[var6++] = -2;
                                                                    } else if (1 == Client.fieldOm * -2000562471) {
                                                                        UtilClass0.intstack[var6++] = -1;
                                                                    } else {
                                                                        UtilClass0.intstack[var6++] = Client.chosenFriendIndex * 1960973713;
                                                                    }
                                                                    continue;
                                                                }

                                                                if (3601 == opcode) {
                                                                    --var6;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    if (Client.fieldOm * -2000562471 == 2 && var16 < Client.chosenFriendIndex * 1960973713) {
                                                                        UtilClass0.stringstack[var7++] = Client.friendedPlayers[var16].displayName;
                                                                        UtilClass0.stringstack[var7++] = Client.friendedPlayers[var16].previousName;
                                                                        continue;
                                                                    }
                                                                    UtilClass0.stringstack[var7++] = "";
                                                                    UtilClass0.stringstack[var7++] = "";
                                                                    continue;
                                                                }

                                                                if (opcode == 3602) {
                                                                    --var6;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    if (2 == Client.fieldOm * -2000562471) {
                                                                        if (var16 < Client.chosenFriendIndex * 1960973713) {
                                                                            UtilClass0.intstack[var6++] = Client.friendedPlayers[var16].world * -1774843337;
                                                                            continue;
                                                                        }
                                                                    }
                                                                    UtilClass0.intstack[var6++] = 0;
                                                                    continue;
                                                                }

                                                                if (3603 == opcode) {
                                                                    --var6;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    if (Client.fieldOm * -2000562471 == 2) {
                                                                        if (var16 < Client.chosenFriendIndex * 1960973713) {
                                                                            UtilClass0.intstack[var6++] = 982129137 * Client.friendedPlayers[var16].fieldB;
                                                                            continue;
                                                                        }
                                                                    }
                                                                    UtilClass0.intstack[var6++] = 0;
                                                                    continue;
                                                                }

                                                                Packet var65;
                                                                if (opcode == 3604) {
                                                                    --var7;
                                                                    var44 = UtilClass0.stringstack[var7];
                                                                    --var6;
                                                                    var17 = UtilClass0.intstack[var6];
                                                                    Client.fieldCo.writePacketHeader(67, (byte) 0);
                                                                    var65 = Client.fieldCo;
                                                                    var38 = var44.length() + 1;
                                                                    var65.writeByte(var38 + 1);
                                                                    Client.fieldCo.w(var44, (byte) 0);
                                                                    Client.fieldCo.writeInvertedByte(var17, (byte) -6);
                                                                    continue;
                                                                }

                                                                if (opcode == 3605) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    --var7;
                                                                    var44 = UtilClass0.stringstack[var7];
                                                                    UtilClass7.method71(var44);
                                                                    continue;
                                                                }

                                                                if (opcode == 3606) {
                                                                    --var7;
                                                                    var44 = UtilClass0.stringstack[var7];
                                                                    UtilClass13.method47(var44, (byte) -30);
                                                                    continue;
                                                                }

                                                                String var66;
                                                                if (opcode == 3607) {
                                                                    if (DUMMY == -350752953) {
                                                                        return;
                                                                    }

                                                                    --var7;
                                                                    var44 = UtilClass0.stringstack[var7];
                                                                    if (var44 == null) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }
                                                                        continue;
                                                                    }

                                                                    label4680:
                                                                    {
                                                                        if (Client.ignoreListSize * 697443259 >= 100) {
                                                                            if (1 != Client.fieldHq * 961198955) {
                                                                                break label4680;
                                                                            }

                                                                            if (DUMMY == -350752953) {
                                                                                return;
                                                                            }
                                                                        }

                                                                        if (Client.ignoreListSize * 697443259 < 400) {
                                                                            var46 = CalendarUtil.method297(var44, UtilClass38.fieldS, -311083127);
                                                                            if (var46 == null) {
                                                                                if (DUMMY == -350752953) {
                                                                                    throw new IllegalStateException();
                                                                                }
                                                                                continue;
                                                                            }

                                                                            for (var35 = 0; var35 < Client.ignoreListSize * 697443259; ++var35) {
                                                                                IgnoredPlayer var60 = Client.ignoredPlayers[var35];
                                                                                var66 = CalendarUtil.method297(var60.previousName, UtilClass38.fieldS, -2134383291);
                                                                                if (null != var66) {
                                                                                    if (var66.equals(var46)) {
                                                                                        JagSocket.addMessage(31, "", var44 + StringConstants.fieldFy, (byte) 16);
                                                                                        continue label4980;
                                                                                    }
                                                                                }

                                                                                if (var60.displayName != null) {
                                                                                    var56 = CalendarUtil.method297(var60.displayName, UtilClass38.fieldS, 543493544);
                                                                                    if (var56 != null) {
                                                                                        if (DUMMY == -350752953) {
                                                                                            throw new IllegalStateException();
                                                                                        }

                                                                                        if (var56.equals(var46)) {
                                                                                            JagSocket.addMessage(31, "", var44 + StringConstants.fieldFy, (byte) 16);
                                                                                            continue label4980;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }

                                                                            for (var35 = 0; var35 < Client.chosenFriendIndex * 1960973713; ++var35) {
                                                                                if (DUMMY == -350752953) {
                                                                                    return;
                                                                                }

                                                                                FriendedPlayer var61 = Client.friendedPlayers[var35];
                                                                                var66 = CalendarUtil.method297(var61.displayName, UtilClass38.fieldS, 386400364);
                                                                                if (null != var66) {
                                                                                    if (DUMMY == -350752953) {
                                                                                        throw new IllegalStateException();
                                                                                    }

                                                                                    if (var66.equals(var46)) {
                                                                                        if (DUMMY == -350752953) {
                                                                                            return;
                                                                                        }

                                                                                        JagSocket.addMessage(31, "", StringConstants.fieldFp + var44 + StringConstants.fieldFb, (byte) 16);
                                                                                        continue label4980;
                                                                                    }
                                                                                }

                                                                                if (var61.previousName != null) {
                                                                                    if (DUMMY == -350752953) {
                                                                                        throw new IllegalStateException();
                                                                                    }

                                                                                    var56 = CalendarUtil.method297(var61.previousName, UtilClass38.fieldS, 1321286630);
                                                                                    if (null != var56 && var56.equals(var46)) {
                                                                                        if (DUMMY == -350752953) {
                                                                                            return;
                                                                                        }

                                                                                        JagSocket.addMessage(31, "", StringConstants.fieldFp + var44 + StringConstants.fieldFb, (byte) 16);
                                                                                        continue label4980;
                                                                                    }
                                                                                }
                                                                            }

                                                                            if (CalendarUtil.method297(Client.myPlayer.name, UtilClass38.fieldS, 1507109593).equals(var46)) {
                                                                                if (DUMMY == -350752953) {
                                                                                    return;
                                                                                }

                                                                                JagSocket.addMessage(31, "", StringConstants.fieldFj, (byte) 16);
                                                                            } else {
                                                                                Client.fieldCo.writePacketHeader(109, (byte) 0);
                                                                                var65 = Client.fieldCo;
                                                                                var38 = var44.length() + 1;
                                                                                var65.writeByte(var38);
                                                                                Client.fieldCo.w(var44, (byte) 0);
                                                                            }
                                                                            continue;
                                                                        }
                                                                    }

                                                                    JagSocket.addMessage(31, "", StringConstants.fieldFr, (byte) 16);
                                                                    continue;
                                                                }

                                                                if (opcode == 3608) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    --var7;
                                                                    var44 = UtilClass0.stringstack[var7];
                                                                    classCc.method350(var44, 925636544);
                                                                    continue;
                                                                }

                                                                if (opcode == 3609) {
                                                                    --var7;
                                                                    var44 = UtilClass0.stringstack[var7];
                                                                    UnknownEnum2[] var69 = UnknownEnum3.getEnum2Values(2138350206);

                                                                    for (var35 = 0; var35 < var69.length; ++var35) {
                                                                        if (DUMMY == -350752953) {
                                                                            return;
                                                                        }

                                                                        UnknownEnum2 var58 = var69[var35];
                                                                        if (-1 != var58.fieldW * 1736764383) {
                                                                            var22 = var58.fieldW * 1736764383;
                                                                            var56 = "<img=" + var22 + ">";
                                                                            if (var44.startsWith(var56)) {
                                                                                var44 = var44.substring(6 + Integer.toString(var58.fieldW * 1736764383).length());
                                                                                break;
                                                                            }
                                                                        }
                                                                    }

                                                                    var104 = UtilClass0.intstack;
                                                                    var10001 = var6++;
                                                                    if (classM.method128(var44, false, 1628927647)) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        var10002 = 1;
                                                                    } else {
                                                                        var10002 = 0;
                                                                    }

                                                                    var104[var10001] = var10002;
                                                                    continue;
                                                                }

                                                                String var54;
                                                                String[] var75;
                                                                if (opcode == 3611) {
                                                                    if (Client.fieldMz != null) {
                                                                        var75 = UtilClass0.stringstack;
                                                                        var17 = var7++;
                                                                        var54 = Client.fieldMz;
                                                                        var66 = UtilClass16.method56(UtilClass13.method46(var54, (byte) -49));
                                                                        if (var66 == null) {
                                                                            var66 = "";
                                                                        }

                                                                        var75[var17] = var66;
                                                                    } else {
                                                                        UtilClass0.stringstack[var7++] = "";
                                                                    }
                                                                    continue;
                                                                }

                                                                if (3612 == opcode) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    if (Client.fieldMz != null) {
                                                                        UtilClass0.intstack[var6++] = classCx.fieldMw * 4951847;
                                                                    } else {
                                                                        UtilClass0.intstack[var6++] = 0;
                                                                    }
                                                                    continue;
                                                                }

                                                                if (3613 == opcode) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    --var6;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    if (Client.fieldMz != null) {
                                                                        if (DUMMY == -350752953) {
                                                                            return;
                                                                        }

                                                                        if (var16 < classCx.fieldMw * 4951847) {
                                                                            if (DUMMY == -350752953) {
                                                                                throw new IllegalStateException();
                                                                            }

                                                                            UtilClass0.stringstack[var7++] = LandscapeMod.clanMates[var16].displayName;
                                                                            continue;
                                                                        }
                                                                    }

                                                                    UtilClass0.stringstack[var7++] = "";
                                                                    continue;
                                                                }

                                                                if (3614 == opcode) {
                                                                    if (DUMMY == -350752953) {
                                                                        return;
                                                                    }

                                                                    --var6;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    if (null != Client.fieldMz && var16 < classCx.fieldMw * 4951847) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        UtilClass0.intstack[var6++] = -714802545 * LandscapeMod.clanMates[var16].world;
                                                                        continue;
                                                                    }

                                                                    UtilClass0.intstack[var6++] = 0;
                                                                    continue;
                                                                }

                                                                if (opcode == 3615) {
                                                                    --var6;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    if (null != Client.fieldMz) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        if (var16 < classCx.fieldMw * 4951847) {
                                                                            if (DUMMY == -350752953) {
                                                                                throw new IllegalStateException();
                                                                            }

                                                                            UtilClass0.intstack[var6++] = LandscapeMod.clanMates[var16].rank;
                                                                            continue;
                                                                        }
                                                                    }

                                                                    UtilClass0.intstack[var6++] = 0;
                                                                    continue;
                                                                }

                                                                if (opcode == 3616) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    UtilClass0.intstack[var6++] = classDc.fieldMi;
                                                                    continue;
                                                                }

                                                                if (opcode == 3617) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    --var7;
                                                                    var44 = UtilClass0.stringstack[var7];
                                                                    if (null == LandscapeMod.clanMates) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }
                                                                    } else {
                                                                        Client.fieldCo.writePacketHeader(243, (byte) 0);
                                                                        Client.fieldCo.writeByte(World.method180(var44, -1468506463));
                                                                        Client.fieldCo.w(var44, (byte) 0);
                                                                    }
                                                                    continue;
                                                                }

                                                                if (3618 == opcode) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    UtilClass0.intstack[var6++] = TextureManagerImpl.fieldMy;
                                                                    continue;
                                                                }

                                                                if (opcode == 3619) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    --var7;
                                                                    var44 = UtilClass0.stringstack[var7];
                                                                    ClientData.method416(var44, (byte) -24);
                                                                    continue;
                                                                }

                                                                if (opcode == 3620) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    TilePaint.method334(687631229);
                                                                    continue;
                                                                }

                                                                if (opcode == 3621) {
                                                                    if (Client.fieldOm * -2000562471 == 0) {
                                                                        UtilClass0.intstack[var6++] = -1;
                                                                    } else {
                                                                        UtilClass0.intstack[var6++] = Client.ignoreListSize * 697443259;
                                                                    }
                                                                    continue;
                                                                }

                                                                if (opcode == 3622) {
                                                                    if (DUMMY == -350752953) {
                                                                        return;
                                                                    }

                                                                    --var6;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    if (0 != Client.fieldOm * -2000562471) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        if (var16 < Client.ignoreListSize * 697443259) {
                                                                            if (DUMMY == -350752953) {
                                                                                throw new IllegalStateException();
                                                                            }

                                                                            UtilClass0.stringstack[var7++] = Client.ignoredPlayers[var16].previousName;
                                                                            UtilClass0.stringstack[var7++] = Client.ignoredPlayers[var16].displayName;
                                                                            continue;
                                                                        }
                                                                    }

                                                                    UtilClass0.stringstack[var7++] = "";
                                                                    UtilClass0.stringstack[var7++] = "";
                                                                    continue;
                                                                }

                                                                if (opcode == 3623) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    label4700:
                                                                    {
                                                                        --var7;
                                                                        var44 = UtilClass0.stringstack[var7];
                                                                        var53 = "<img=0>";
                                                                        if (!var44.startsWith(var53)) {
                                                                            if (DUMMY == -350752953) {
                                                                                throw new IllegalStateException();
                                                                            }

                                                                            var66 = "<img=1>";
                                                                            if (!var44.startsWith(var66)) {
                                                                                if (DUMMY == -350752953) {
                                                                                    return;
                                                                                }
                                                                                break label4700;
                                                                            }
                                                                        }

                                                                        var44 = var44.substring(7);
                                                                    }

                                                                    var104 = UtilClass0.intstack;
                                                                    var10001 = var6++;
                                                                    if (UtilClass1.isIgnored(var44, -1154968744)) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        var10002 = 1;
                                                                    } else {
                                                                        var10002 = 0;
                                                                    }

                                                                    var104[var10001] = var10002;
                                                                    continue;
                                                                }

                                                                if (3624 == opcode) {
                                                                    --var6;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    if (null != LandscapeMod.clanMates) {
                                                                        if (DUMMY == -350752953) {
                                                                            return;
                                                                        }

                                                                        if (var16 < classCx.fieldMw * 4951847) {
                                                                            if (DUMMY == -350752953) {
                                                                                return;
                                                                            }

                                                                            if (LandscapeMod.clanMates[var16].displayName.equalsIgnoreCase(Client.myPlayer.name)) {
                                                                                if (DUMMY == -350752953) {
                                                                                    return;
                                                                                }

                                                                                UtilClass0.intstack[var6++] = 1;
                                                                                continue;
                                                                            }
                                                                        }
                                                                    }

                                                                    UtilClass0.intstack[var6++] = 0;
                                                                    continue;
                                                                }

                                                                if (opcode == 3625) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    if (Client.fieldMf != null) {
                                                                        if (DUMMY == -350752953) {
                                                                            return;
                                                                        }

                                                                        var75 = UtilClass0.stringstack;
                                                                        var17 = var7++;
                                                                        var54 = Client.fieldMf;
                                                                        var66 = UtilClass16.method56(UtilClass13.method46(var54, (byte) -36));
                                                                        if (var66 == null) {
                                                                            if (DUMMY == -350752953) {
                                                                                return;
                                                                            }

                                                                            var66 = "";
                                                                        }

                                                                        var75[var17] = var66;
                                                                    } else {
                                                                        UtilClass0.stringstack[var7++] = "";
                                                                    }
                                                                    continue;
                                                                }
                                                            } else if (opcode < 4000) {
                                                                if (opcode == 3903) {
                                                                    --var6;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    UtilClass0.intstack[var6++] = Client.localExchangeOffers[var16].i(-467763670);
                                                                    continue;
                                                                }

                                                                if (opcode == 3904) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    --var6;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    UtilClass0.intstack[var6++] = Client.localExchangeOffers[var16].itemId * -1116814691;
                                                                    continue;
                                                                }

                                                                if (opcode == 3905) {
                                                                    --var6;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    UtilClass0.intstack[var6++] = 2044064543 * Client.localExchangeOffers[var16].price;
                                                                    continue;
                                                                }

                                                                if (opcode == 3906) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    --var6;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    UtilClass0.intstack[var6++] = -1551451591 * Client.localExchangeOffers[var16].itemQuantity;
                                                                    continue;
                                                                }

                                                                if (3907 == opcode) {
                                                                    if (DUMMY == -350752953) {
                                                                        return;
                                                                    }

                                                                    --var6;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    UtilClass0.intstack[var6++] = 2097202689 * Client.localExchangeOffers[var16].transferred;
                                                                    continue;
                                                                }

                                                                if (opcode == 3908) {
                                                                    --var6;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    UtilClass0.intstack[var6++] = 1647139993 * Client.localExchangeOffers[var16].spent;
                                                                    continue;
                                                                }

                                                                if (3910 == opcode) {
                                                                    --var6;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    var17 = Client.localExchangeOffers[var16].v(1445031798);
                                                                    var10001 = var6++;
                                                                    UtilClass0.intstack[var10001] = var17 == 0 ? 1 : 0;
                                                                    continue;
                                                                }

                                                                if (3911 == opcode) {
                                                                    --var6;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    var17 = Client.localExchangeOffers[var16].v(685466495);
                                                                    var10001 = var6++;
                                                                    var10002 = (byte) (2 == var17 ? 1 : 0);
                                                                    UtilClass0.intstack[var10001] = var10002;
                                                                    continue;
                                                                }

                                                                if (opcode == 3912) {
                                                                    --var6;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    var17 = Client.localExchangeOffers[var16].v(391329469);
                                                                    var10001 = var6++;
                                                                    if (var17 == 5) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        var10002 = 1;
                                                                    } else {
                                                                        var10002 = 0;
                                                                    }

                                                                    UtilClass0.intstack[var10001] = var10002;
                                                                    continue;
                                                                }

                                                                if (opcode == 3913) {
                                                                    --var6;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    var17 = Client.localExchangeOffers[var16].v(62956571);
                                                                    var10001 = var6++;
                                                                    if (var17 == 1) {
                                                                        if (DUMMY == -350752953) {
                                                                            return;
                                                                        }

                                                                        var10002 = 1;
                                                                    } else {
                                                                        var10002 = 0;
                                                                    }

                                                                    UtilClass0.intstack[var10001] = var10002;
                                                                    continue;
                                                                }

                                                                boolean var88;
                                                                if (3914 == opcode) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    --var6;
                                                                    if (UtilClass0.intstack[var6] == 1) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        var103 = true;
                                                                    } else {
                                                                        var103 = false;
                                                                    }

                                                                    var88 = var103;
                                                                    if (null != BoundaryDecoration.fieldOr) {
                                                                        if (DUMMY == -350752953) {
                                                                            return;
                                                                        }

                                                                        BoundaryDecoration.fieldOr.a(ExchangeInfo.fieldB, var88, 128464934);
                                                                    }
                                                                    continue;
                                                                }

                                                                if (3915 == opcode) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    --var6;
                                                                    if (UtilClass0.intstack[var6] == 1) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        var103 = true;
                                                                    } else {
                                                                        var103 = false;
                                                                    }

                                                                    var88 = var103;
                                                                    if (BoundaryDecoration.fieldOr != null) {
                                                                        BoundaryDecoration.fieldOr.a(ExchangeInfo.priceComparator, var88, 128464934);
                                                                    }
                                                                    continue;
                                                                }

                                                                if (3916 == opcode) {
                                                                    var6 -= 2;
                                                                    if (UtilClass0.intstack[var6] == 1) {
                                                                        if (DUMMY == -350752953) {
                                                                            return;
                                                                        }

                                                                        var103 = true;
                                                                    } else {
                                                                        var103 = false;
                                                                    }

                                                                    var88 = var103;
                                                                    if (1 == UtilClass0.intstack[var6 + 1]) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        var103 = true;
                                                                    } else {
                                                                        var103 = false;
                                                                    }

                                                                    var40 = var103;
                                                                    if (BoundaryDecoration.fieldOr != null) {
                                                                        BoundaryDecoration.fieldOr.a(new classJ(var40), var88, 128464934);
                                                                    }
                                                                    continue;
                                                                }

                                                                if (opcode == 3917) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    --var6;
                                                                    if (UtilClass0.intstack[var6] == 1) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        var103 = true;
                                                                    } else {
                                                                        var103 = false;
                                                                    }

                                                                    var88 = var103;
                                                                    if (BoundaryDecoration.fieldOr != null) {
                                                                        BoundaryDecoration.fieldOr.a(ExchangeInfo.timeComparator, var88, 128464934);
                                                                    }
                                                                    continue;
                                                                }

                                                                if (opcode == 3918) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    --var6;
                                                                    if (UtilClass0.intstack[var6] == 1) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        var103 = true;
                                                                    } else {
                                                                        var103 = false;
                                                                    }

                                                                    var88 = var103;
                                                                    if (BoundaryDecoration.fieldOr != null) {
                                                                        BoundaryDecoration.fieldOr.a(ExchangeInfo.quantityComparator, var88, 128464934);
                                                                    }
                                                                    continue;
                                                                }

                                                                if (opcode == 3919) {
                                                                    if (DUMMY == -350752953) {
                                                                        return;
                                                                    }

                                                                    var10001 = var6++;
                                                                    int var102;
                                                                    if (BoundaryDecoration.fieldOr == null) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        var102 = 0;
                                                                    } else {
                                                                        var102 = BoundaryDecoration.fieldOr.fieldA.size();
                                                                    }

                                                                    UtilClass0.intstack[var10001] = var102;
                                                                    continue;
                                                                }

                                                                ExchangeOfferData var71;
                                                                if (3920 == opcode) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    --var6;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    var71 = (ExchangeOfferData) BoundaryDecoration.fieldOr.fieldA.get(var16);
                                                                    UtilClass0.intstack[var6++] = var71.fieldA * 1954843121;
                                                                    continue;
                                                                }

                                                                if (3921 == opcode) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    --var6;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    var71 = (ExchangeOfferData) BoundaryDecoration.fieldOr.fieldA.get(var16);
                                                                    UtilClass0.stringstack[var7++] = var71.a((byte) 102);
                                                                    continue;
                                                                }

                                                                if (opcode == 3922) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    --var6;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    var71 = (ExchangeOfferData) BoundaryDecoration.fieldOr.fieldA.get(var16);
                                                                    UtilClass0.stringstack[var7++] = var71.v(393516714);
                                                                    continue;
                                                                }

                                                                if (opcode == 3923) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    --var6;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    var71 = (ExchangeOfferData) BoundaryDecoration.fieldOr.fieldA.get(var16);
                                                                    long var67 = classDz.getFancyTime(1271112205) - classAm.fieldOe * -3477930167591470897L - -2225411725010154079L * var71.postTime;
                                                                    var42 = (int) (var67 / 3600000L);
                                                                    var21 = (int) ((var67 - (long) (3600000 * var42)) / 60000L);
                                                                    var22 = (int) ((var67 - (long) (3600000 * var42) - (long) ('\uea60' * var21)) / 1000L);
                                                                    String var23 = var42 + ":" + var21 / 10 + var21 % 10 + ":" + var22 / 10 + var22 % 10;
                                                                    UtilClass0.stringstack[var7++] = var23;
                                                                    continue;
                                                                }

                                                                if (3924 == opcode) {
                                                                    if (DUMMY == -350752953) {
                                                                        return;
                                                                    }

                                                                    --var6;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    var71 = (ExchangeOfferData) BoundaryDecoration.fieldOr.fieldA.get(var16);
                                                                    UtilClass0.intstack[var6++] = -1551451591 * var71.exchangeOffer.itemQuantity;
                                                                    continue;
                                                                }

                                                                if (opcode == 3925) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    --var6;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    var71 = (ExchangeOfferData) BoundaryDecoration.fieldOr.fieldA.get(var16);
                                                                    UtilClass0.intstack[var6++] = var71.exchangeOffer.price * 2044064543;
                                                                    continue;
                                                                }

                                                                if (opcode == 3926) {
                                                                    if (DUMMY == -350752953) {
                                                                        return;
                                                                    }

                                                                    --var6;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    var71 = (ExchangeOfferData) BoundaryDecoration.fieldOr.fieldA.get(var16);
                                                                    UtilClass0.intstack[var6++] = -1116814691 * var71.exchangeOffer.itemId;
                                                                    continue;
                                                                }
                                                            } else if (opcode < 4100) {
                                                                if (DUMMY == -350752953) {
                                                                    return;
                                                                }

                                                                if (opcode == 4000) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    var6 -= 2;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    var17 = UtilClass0.intstack[1 + var6];
                                                                    UtilClass0.intstack[var6++] = var16 + var17;
                                                                    continue;
                                                                }

                                                                if (opcode == 4001) {
                                                                    if (DUMMY == -350752953) {
                                                                        return;
                                                                    }

                                                                    var6 -= 2;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    var17 = UtilClass0.intstack[var6 + 1];
                                                                    UtilClass0.intstack[var6++] = var16 - var17;
                                                                    continue;
                                                                }

                                                                if (4002 == opcode) {
                                                                    var6 -= 2;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    var17 = UtilClass0.intstack[1 + var6];
                                                                    UtilClass0.intstack[var6++] = var17 * var16;
                                                                    continue;
                                                                }

                                                                if (4003 == opcode) {
                                                                    if (DUMMY == -350752953) {
                                                                        return;
                                                                    }

                                                                    var6 -= 2;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    var17 = UtilClass0.intstack[1 + var6];
                                                                    UtilClass0.intstack[var6++] = var16 / var17;
                                                                    continue;
                                                                }

                                                                if (4004 == opcode) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    --var6;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    UtilClass0.intstack[var6++] = (int) (Math.random() * (double) var16);
                                                                    continue;
                                                                }

                                                                if (opcode == 4005) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    --var6;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    UtilClass0.intstack[var6++] = (int) (Math.random() * (double) (1 + var16));
                                                                    continue;
                                                                }

                                                                if (4006 == opcode) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    var6 -= 5;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    var17 = UtilClass0.intstack[1 + var6];
                                                                    var35 = UtilClass0.intstack[2 + var6];
                                                                    var38 = UtilClass0.intstack[var6 + 3];
                                                                    var42 = UtilClass0.intstack[4 + var6];
                                                                    UtilClass0.intstack[var6++] = var16 + (var17 - var16) * (var42 - var35) / (var38 - var35);
                                                                    continue;
                                                                }

                                                                if (opcode == 4007) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    var6 -= 2;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    var17 = UtilClass0.intstack[var6 + 1];
                                                                    UtilClass0.intstack[var6++] = var16 * var17 / 100 + var16;
                                                                    continue;
                                                                }

                                                                if (4008 == opcode) {
                                                                    if (DUMMY == -350752953) {
                                                                        return;
                                                                    }

                                                                    var6 -= 2;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    var17 = UtilClass0.intstack[var6 + 1];
                                                                    UtilClass0.intstack[var6++] = var16 | 1 << var17;
                                                                    continue;
                                                                }

                                                                if (4009 == opcode) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    var6 -= 2;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    var17 = UtilClass0.intstack[1 + var6];
                                                                    UtilClass0.intstack[var6++] = var16 & -1 - (1 << var17);
                                                                    continue;
                                                                }

                                                                if (4010 == opcode) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    var6 -= 2;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    var17 = UtilClass0.intstack[var6 + 1];
                                                                    var10001 = var6++;
                                                                    if (0 != (var16 & 1 << var17)) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        var10002 = 1;
                                                                    } else {
                                                                        var10002 = 0;
                                                                    }

                                                                    UtilClass0.intstack[var10001] = var10002;
                                                                    continue;
                                                                }

                                                                if (4011 == opcode) {
                                                                    if (DUMMY == -350752953) {
                                                                        return;
                                                                    }

                                                                    var6 -= 2;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    var17 = UtilClass0.intstack[var6 + 1];
                                                                    UtilClass0.intstack[var6++] = var16 % var17;
                                                                    continue;
                                                                }

                                                                if (opcode == 4012) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    var6 -= 2;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    var17 = UtilClass0.intstack[var6 + 1];
                                                                    if (var16 == 0) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        UtilClass0.intstack[var6++] = 0;
                                                                    } else {
                                                                        UtilClass0.intstack[var6++] = (int) Math.pow((double) var16, (double) var17);
                                                                    }
                                                                    continue;
                                                                }

                                                                if (opcode == 4013) {
                                                                    var6 -= 2;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    var17 = UtilClass0.intstack[var6 + 1];
                                                                    if (var16 == 0) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        UtilClass0.intstack[var6++] = 0;
                                                                    } else if (var17 == 0) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        UtilClass0.intstack[var6++] = Integer.MAX_VALUE;
                                                                    } else {
                                                                        UtilClass0.intstack[var6++] = (int) Math.pow((double) var16, 1.0D / (double) var17);
                                                                    }
                                                                    continue;
                                                                }

                                                                if (opcode == 4014) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    var6 -= 2;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    var17 = UtilClass0.intstack[var6 + 1];
                                                                    UtilClass0.intstack[var6++] = var16 & var17;
                                                                    continue;
                                                                }

                                                                if (4015 == opcode) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    var6 -= 2;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    var17 = UtilClass0.intstack[1 + var6];
                                                                    UtilClass0.intstack[var6++] = var16 | var17;
                                                                    continue;
                                                                }
                                                            } else if (opcode < 4200) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                if (4100 == opcode) {
                                                                    if (DUMMY == -350752953) {
                                                                        return;
                                                                    }

                                                                    --var7;
                                                                    var44 = UtilClass0.stringstack[var7];
                                                                    --var6;
                                                                    var17 = UtilClass0.intstack[var6];
                                                                    UtilClass0.stringstack[var7++] = var44 + var17;
                                                                    continue;
                                                                }

                                                                if (opcode == 4101) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    var7 -= 2;
                                                                    var44 = UtilClass0.stringstack[var7];
                                                                    var46 = UtilClass0.stringstack[var7 + 1];
                                                                    UtilClass0.stringstack[var7++] = var44 + var46;
                                                                    continue;
                                                                }

                                                                if (4102 == opcode) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    --var7;
                                                                    var44 = UtilClass0.stringstack[var7];
                                                                    --var6;
                                                                    var17 = UtilClass0.intstack[var6];
                                                                    UtilClass0.stringstack[var7++] = var44 + UtilClass7.method72(var17, true, 607597377);
                                                                    continue;
                                                                }

                                                                if (4103 == opcode) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    --var7;
                                                                    var44 = UtilClass0.stringstack[var7];
                                                                    UtilClass0.stringstack[var7++] = var44.toLowerCase();
                                                                    continue;
                                                                }

                                                                if (opcode == 4104) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    --var6;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    long var90 = (11745L + (long) var16) * 86400000L;
                                                                    UtilClass0.fieldD.setTime(new Date(var90));
                                                                    var38 = UtilClass0.fieldD.get(5);
                                                                    var42 = UtilClass0.fieldD.get(2);
                                                                    var21 = UtilClass0.fieldD.get(1);
                                                                    UtilClass0.stringstack[var7++] = var38 + "-" + UtilClass0.fieldX[var42] + "-" + var21;
                                                                    continue;
                                                                }

                                                                if (opcode == 4105) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    var7 -= 2;
                                                                    var44 = UtilClass0.stringstack[var7];
                                                                    var46 = UtilClass0.stringstack[1 + var7];
                                                                    if (null != Client.myPlayer.cfg && Client.myPlayer.cfg.male) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        UtilClass0.stringstack[var7++] = var46;
                                                                        continue;
                                                                    }

                                                                    UtilClass0.stringstack[var7++] = var44;
                                                                    continue;
                                                                }

                                                                if (4106 == opcode) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    --var6;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    UtilClass0.stringstack[var7++] = Integer.toString(var16);
                                                                    continue;
                                                                }

                                                                if (opcode == 4107) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    var7 -= 2;
                                                                    int[] var98 = UtilClass0.intstack;
                                                                    var17 = var6++;
                                                                    var38 = classT.method168(UtilClass0.stringstack[var7], UtilClass0.stringstack[1 + var7], Client.fieldD * -925892703, -1459060751);
                                                                    if (var38 > 0) {
                                                                        var74 = 1;
                                                                    } else if (var38 < 0) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        var74 = -1;
                                                                    } else {
                                                                        var74 = 0;
                                                                    }

                                                                    var98[var17] = var74;
                                                                    continue;
                                                                }

                                                                byte[] var72;
                                                                classGm var76;
                                                                if (4108 == opcode) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    --var7;
                                                                    var44 = UtilClass0.stringstack[var7];
                                                                    var6 -= 2;
                                                                    var17 = UtilClass0.intstack[var6];
                                                                    var35 = UtilClass0.intstack[var6 + 1];
                                                                    var72 = classM.fieldBe.getFile(var35, 0, (short) 25187);
                                                                    var76 = new classGm(var72);
                                                                    UtilClass0.intstack[var6++] = var76.w(var44, var17);
                                                                    continue;
                                                                }

                                                                if (4109 == opcode) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    --var7;
                                                                    var44 = UtilClass0.stringstack[var7];
                                                                    var6 -= 2;
                                                                    var17 = UtilClass0.intstack[var6];
                                                                    var35 = UtilClass0.intstack[var6 + 1];
                                                                    var72 = classM.fieldBe.getFile(var35, 0, (short) 6397);
                                                                    var76 = new classGm(var72);
                                                                    UtilClass0.intstack[var6++] = var76.m(var44, var17);
                                                                    continue;
                                                                }

                                                                if (4110 == opcode) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    var7 -= 2;
                                                                    var44 = UtilClass0.stringstack[var7];
                                                                    var46 = UtilClass0.stringstack[1 + var7];
                                                                    --var6;
                                                                    if (UtilClass0.intstack[var6] == 1) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        UtilClass0.stringstack[var7++] = var44;
                                                                    } else {
                                                                        UtilClass0.stringstack[var7++] = var46;
                                                                    }
                                                                    continue;
                                                                }

                                                                if (opcode == 4111) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    --var7;
                                                                    var44 = UtilClass0.stringstack[var7];
                                                                    UtilClass0.stringstack[var7++] = classGs.method32(var44);
                                                                    continue;
                                                                }

                                                                if (4112 == opcode) {
                                                                    --var7;
                                                                    var44 = UtilClass0.stringstack[var7];
                                                                    --var6;
                                                                    var17 = UtilClass0.intstack[var6];
                                                                    UtilClass0.stringstack[var7++] = var44 + (char) var17;
                                                                    continue;
                                                                }

                                                                boolean var68;
                                                                char var73;
                                                                if (opcode == 4113) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    label5104:
                                                                    {
                                                                        --var6;
                                                                        var16 = UtilClass0.intstack[var6];
                                                                        var36 = UtilClass0.intstack;
                                                                        var35 = var6++;
                                                                        var73 = (char) var16;
                                                                        if (var73 >= 32) {
                                                                            if (DUMMY == -350752953) {
                                                                                throw new IllegalStateException();
                                                                            }

                                                                            if (var73 <= 126) {
                                                                                var68 = true;
                                                                                break label5104;
                                                                            }
                                                                        }

                                                                        if (var73 >= 160 && var73 <= 255) {
                                                                            if (DUMMY == -350752953) {
                                                                                throw new IllegalStateException();
                                                                            }

                                                                            var68 = true;
                                                                        } else {
                                                                            label5171:
                                                                            {
                                                                                if (8364 != var73 && 338 != var73) {
                                                                                    if (DUMMY == -350752953) {
                                                                                        throw new IllegalStateException();
                                                                                    }

                                                                                    if (8212 != var73) {
                                                                                        if (DUMMY == -350752953) {
                                                                                            return;
                                                                                        }

                                                                                        if (339 != var73) {
                                                                                            if (DUMMY == -350752953) {
                                                                                                return;
                                                                                            }

                                                                                            if (var73 != 376) {
                                                                                                var68 = false;
                                                                                                break label5171;
                                                                                            }

                                                                                            if (DUMMY == -350752953) {
                                                                                                throw new IllegalStateException();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }

                                                                                var68 = true;
                                                                            }
                                                                        }
                                                                    }

                                                                    if (var68) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        var10002 = 1;
                                                                    } else {
                                                                        var10002 = 0;
                                                                    }

                                                                    var36[var35] = var10002;
                                                                    continue;
                                                                }

                                                                if (opcode == 4114) {
                                                                    if (DUMMY == -350752953) {
                                                                        return;
                                                                    }

                                                                    --var6;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    UtilClass0.intstack[var6++] = ExchangeOfferPriceComparator.method28((char) var16, -2101474668) ? 1 : 0;
                                                                    continue;
                                                                }

                                                                if (4115 == opcode) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    label4768:
                                                                    {
                                                                        label5108:
                                                                        {
                                                                            --var6;
                                                                            var16 = UtilClass0.intstack[var6];
                                                                            var36 = UtilClass0.intstack;
                                                                            var35 = var6++;
                                                                            var73 = (char) var16;
                                                                            if (var73 >= 65) {
                                                                                if (DUMMY == -350752953) {
                                                                                    throw new IllegalStateException();
                                                                                }

                                                                                if (var73 <= 90) {
                                                                                    break label5108;
                                                                                }
                                                                            }

                                                                            if (var73 < 97 || var73 > 122) {
                                                                                var103 = false;
                                                                                break label4768;
                                                                            }

                                                                            if (DUMMY == -350752953) {
                                                                                return;
                                                                            }
                                                                        }

                                                                        var103 = true;
                                                                    }

                                                                    var68 = var103;
                                                                    var36[var35] = var68 ? 1 : 0;
                                                                    continue;
                                                                }

                                                                if (4116 == opcode) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    --var6;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    var104 = UtilClass0.intstack;
                                                                    var10001 = var6++;
                                                                    if (classFm.method10((char) var16, (byte) -49)) {
                                                                        if (DUMMY == -350752953) {
                                                                            return;
                                                                        }

                                                                        var10002 = 1;
                                                                    } else {
                                                                        var10002 = 0;
                                                                    }

                                                                    var104[var10001] = var10002;
                                                                    continue;
                                                                }

                                                                if (4117 == opcode) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    --var7;
                                                                    var44 = UtilClass0.stringstack[var7];
                                                                    if (null != var44) {
                                                                        UtilClass0.intstack[var6++] = var44.length();
                                                                    } else {
                                                                        UtilClass0.intstack[var6++] = 0;
                                                                    }
                                                                    continue;
                                                                }

                                                                if (opcode == 4118) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    --var7;
                                                                    var44 = UtilClass0.stringstack[var7];
                                                                    var6 -= 2;
                                                                    var17 = UtilClass0.intstack[var6];
                                                                    var35 = UtilClass0.intstack[var6 + 1];
                                                                    UtilClass0.stringstack[var7++] = var44.substring(var17, var35);
                                                                    continue;
                                                                }

                                                                if (opcode == 4119) {
                                                                    --var7;
                                                                    var44 = UtilClass0.stringstack[var7];
                                                                    StringBuilder var86 = new StringBuilder(var44.length());
                                                                    boolean var70 = false;

                                                                    for (var38 = 0; var38 < var44.length(); ++var38) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        var73 = var44.charAt(var38);
                                                                        if (var73 == 60) {
                                                                            if (DUMMY == -350752953) {
                                                                                return;
                                                                            }

                                                                            var70 = true;
                                                                        } else if (62 == var73) {
                                                                            if (DUMMY == -350752953) {
                                                                                throw new IllegalStateException();
                                                                            }

                                                                            var70 = false;
                                                                        } else if (!var70) {
                                                                            if (DUMMY == -350752953) {
                                                                                throw new IllegalStateException();
                                                                            }

                                                                            var86.append(var73);
                                                                        }
                                                                    }

                                                                    UtilClass0.stringstack[var7++] = var86.toString();
                                                                    continue;
                                                                }

                                                                if (4120 == opcode) {
                                                                    --var7;
                                                                    var44 = UtilClass0.stringstack[var7];
                                                                    --var6;
                                                                    var17 = UtilClass0.intstack[var6];
                                                                    UtilClass0.intstack[var6++] = var44.indexOf(var17);
                                                                    continue;
                                                                }

                                                                if (opcode == 4121) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    var7 -= 2;
                                                                    var44 = UtilClass0.stringstack[var7];
                                                                    var46 = UtilClass0.stringstack[1 + var7];
                                                                    --var6;
                                                                    var35 = UtilClass0.intstack[var6];
                                                                    UtilClass0.intstack[var6++] = var44.indexOf(var46, var35);
                                                                    continue;
                                                                }
                                                            } else if (opcode < 4300) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                if (4200 == opcode) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    --var6;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    UtilClass0.stringstack[var7++] = Client.getItemDefinition(var16, -1049273594).fieldX;
                                                                    continue;
                                                                }

                                                                ItemDefinition var78;
                                                                if (4201 == opcode) {
                                                                    if (DUMMY == -350752953) {
                                                                        return;
                                                                    }

                                                                    var6 -= 2;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    var17 = UtilClass0.intstack[var6 + 1];
                                                                    var78 = Client.getItemDefinition(var16, -664106508);
                                                                    if (var17 >= 1) {
                                                                        if (DUMMY == -350752953) {
                                                                            return;
                                                                        }

                                                                        if (var17 <= 5) {
                                                                            if (DUMMY == -350752953) {
                                                                                throw new IllegalStateException();
                                                                            }

                                                                            if (null != var78.groundActions[var17 - 1]) {
                                                                                if (DUMMY == -350752953) {
                                                                                    return;
                                                                                }

                                                                                UtilClass0.stringstack[var7++] = var78.groundActions[var17 - 1];
                                                                                continue;
                                                                            }
                                                                        }
                                                                    }

                                                                    UtilClass0.stringstack[var7++] = "";
                                                                    continue;
                                                                }

                                                                if (opcode == 4202) {
                                                                    if (DUMMY == -350752953) {
                                                                        return;
                                                                    }

                                                                    var6 -= 2;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    var17 = UtilClass0.intstack[1 + var6];
                                                                    var78 = Client.getItemDefinition(var16, -2001655174);
                                                                    if (var17 >= 1) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        if (var17 <= 5 && var78.actions[var17 - 1] != null) {
                                                                            if (DUMMY == -350752953) {
                                                                                return;
                                                                            }

                                                                            UtilClass0.stringstack[var7++] = var78.actions[var17 - 1];
                                                                            continue;
                                                                        }
                                                                    }

                                                                    UtilClass0.stringstack[var7++] = "";
                                                                    continue;
                                                                }

                                                                if (4203 == opcode) {
                                                                    --var6;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    UtilClass0.intstack[var6++] = Client.getItemDefinition(var16, -643923151).storeValue * 610558549;
                                                                    continue;
                                                                }

                                                                if (4204 == opcode) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    --var6;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    var104 = UtilClass0.intstack;
                                                                    var10001 = var6++;
                                                                    if (Client.getItemDefinition(var16, -985562588).stackable * 1977514217 == 1) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        var10002 = 1;
                                                                    } else {
                                                                        var10002 = 0;
                                                                    }

                                                                    var104[var10001] = var10002;
                                                                    continue;
                                                                }

                                                                ItemDefinition var92;
                                                                if (4205 == opcode) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    --var6;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    var92 = Client.getItemDefinition(var16, -981469427);
                                                                    if (var92.fieldAu * -1133001085 == -1 && var92.fieldAd * -349199001 >= 0) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        UtilClass0.intstack[var6++] = var92.fieldAd * -349199001;
                                                                        continue;
                                                                    }

                                                                    UtilClass0.intstack[var6++] = var16;
                                                                    continue;
                                                                }

                                                                if (opcode == 4206) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    --var6;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    var92 = Client.getItemDefinition(var16, -727426261);
                                                                    if (var92.fieldAu * -1133001085 >= 0) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        if (var92.fieldAd * -349199001 >= 0) {
                                                                            if (DUMMY == -350752953) {
                                                                                throw new IllegalStateException();
                                                                            }

                                                                            UtilClass0.intstack[var6++] = var92.fieldAd * -349199001;
                                                                            continue;
                                                                        }
                                                                    }

                                                                    UtilClass0.intstack[var6++] = var16;
                                                                    continue;
                                                                }

                                                                if (4207 == opcode) {
                                                                    --var6;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    var104 = UtilClass0.intstack;
                                                                    var10001 = var6++;
                                                                    if (Client.getItemDefinition(var16, -1619444299).fieldAn) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        var10002 = 1;
                                                                    } else {
                                                                        var10002 = 0;
                                                                    }

                                                                    var104[var10001] = var10002;
                                                                    continue;
                                                                }

                                                                if (4210 == opcode) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    --var7;
                                                                    var44 = UtilClass0.stringstack[var7];
                                                                    --var6;
                                                                    var17 = UtilClass0.intstack[var6];
                                                                    if (1 == var17) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        var106 = true;
                                                                    } else {
                                                                        var106 = false;
                                                                    }

                                                                    UnknownEnum4.method25(var44, var106, 1497066213);
                                                                    UtilClass0.intstack[var6++] = InputHandler.fieldOp * -501937271;
                                                                    continue;
                                                                }

                                                                if (4211 == opcode) {
                                                                    if (DUMMY == -350752953) {
                                                                        return;
                                                                    }

                                                                    if (EntityMarker.fieldOj != null) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        if (UtilClass1.fieldOg * -31328799 < InputHandler.fieldOp * -501937271) {
                                                                            UtilClass0.intstack[var6++] = EntityMarker.fieldOj[(UtilClass1.fieldOg += 499977761) * -31328799 - 1] & '\uffff';
                                                                            continue;
                                                                        }

                                                                        if (DUMMY == -350752953) {
                                                                            return;
                                                                        }
                                                                    }

                                                                    UtilClass0.intstack[var6++] = -1;
                                                                    continue;
                                                                }

                                                                if (4212 == opcode) {
                                                                    if (DUMMY == -350752953) {
                                                                        return;
                                                                    }

                                                                    UtilClass1.fieldOg = 0;
                                                                    continue;
                                                                }
                                                            } else if (opcode < 5100) {
                                                                if (DUMMY == -350752953) {
                                                                    throw new IllegalStateException();
                                                                }

                                                                if (opcode == 5000) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    UtilClass0.intstack[var6++] = Client.fieldLd * 1046832053;
                                                                    continue;
                                                                }

                                                                if (opcode == 5001) {
                                                                    var6 -= 3;
                                                                    Client.fieldLd = UtilClass0.intstack[var6] * -1253657955;
                                                                    var17 = UtilClass0.intstack[var6 + 1];
                                                                    classDs[] var84 = new classDs[]{classDs.fieldV, classDs.fieldI, classDs.fieldA};
                                                                    classDs[] var89 = var84;
                                                                    var42 = 0;

                                                                    classDs var99;
                                                                    while (true) {
                                                                        if (var42 >= var89.length) {
                                                                            var99 = null;
                                                                            break;
                                                                        }

                                                                        if (DUMMY == -350752953) {
                                                                            return;
                                                                        }

                                                                        classDs var63 = var89[var42];
                                                                        if (var17 == var63.fieldB * -2010103131) {
                                                                            if (DUMMY == -350752953) {
                                                                                return;
                                                                            }

                                                                            var99 = var63;
                                                                            break;
                                                                        }

                                                                        ++var42;
                                                                    }

                                                                    classEp.fieldLi = var99;
                                                                    if (null == classEp.fieldLi) {
                                                                        classEp.fieldLi = classDs.fieldV;
                                                                    }

                                                                    Client.fieldLh = UtilClass0.intstack[var6 + 2] * -176726983;
                                                                    Client.fieldCo.writePacketHeader(62, (byte) 0);
                                                                    Client.fieldCo.writeByte(Client.fieldLd * 1046832053);
                                                                    Client.fieldCo.writeByte(classEp.fieldLi.fieldB * -2010103131);
                                                                    Client.fieldCo.writeByte(Client.fieldLh * 476041737);
                                                                    continue;
                                                                }

                                                                Packet var79;
                                                                if (opcode == 5002) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    --var7;
                                                                    var44 = UtilClass0.stringstack[var7];
                                                                    var6 -= 2;
                                                                    var17 = UtilClass0.intstack[var6];
                                                                    var35 = UtilClass0.intstack[1 + var6];
                                                                    Client.fieldCo.writePacketHeader(2, (byte) 0);
                                                                    var79 = Client.fieldCo;
                                                                    var42 = var44.length() + 1;
                                                                    var79.writeByte(2 + var42);
                                                                    Client.fieldCo.w(var44, (byte) 0);
                                                                    Client.fieldCo.writeByte(var17 - 1);
                                                                    Client.fieldCo.writeByte(var35);
                                                                    continue;
                                                                }

                                                                String var105;
                                                                if (5003 == opcode) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    var6 -= 2;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    var17 = UtilClass0.intstack[1 + var6];
                                                                    Message var83 = Player.method150(var16, var17, (byte) -89);
                                                                    if (null != var83) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        UtilClass0.intstack[var6++] = var83.fieldA * -1367842983;
                                                                        UtilClass0.intstack[var6++] = var83.fieldV * 1204098761;
                                                                        var10001 = var7++;
                                                                        if (var83.fieldB != null) {
                                                                            if (DUMMY == -350752953) {
                                                                                throw new IllegalStateException();
                                                                            }

                                                                            var105 = var83.fieldB;
                                                                        } else {
                                                                            var105 = "";
                                                                        }

                                                                        UtilClass0.stringstack[var10001] = var105;
                                                                        var10001 = var7++;
                                                                        if (var83.fieldL != null) {
                                                                            if (DUMMY == -350752953) {
                                                                                return;
                                                                            }

                                                                            var105 = var83.fieldL;
                                                                        } else {
                                                                            var105 = "";
                                                                        }

                                                                        UtilClass0.stringstack[var10001] = var105;
                                                                        var10001 = var7++;
                                                                        if (null != var83.fieldM) {
                                                                            if (DUMMY == -350752953) {
                                                                                throw new IllegalStateException();
                                                                            }

                                                                            var105 = var83.fieldM;
                                                                        } else {
                                                                            var105 = "";
                                                                        }

                                                                        UtilClass0.stringstack[var10001] = var105;
                                                                    } else {
                                                                        UtilClass0.intstack[var6++] = -1;
                                                                        UtilClass0.intstack[var6++] = 0;
                                                                        UtilClass0.stringstack[var7++] = "";
                                                                        UtilClass0.stringstack[var7++] = "";
                                                                        UtilClass0.stringstack[var7++] = "";
                                                                    }
                                                                    continue;
                                                                }

                                                                if (opcode == 5004) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    --var6;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    Message var93 = UtilClass1.method259(var16, (byte) 16);
                                                                    if (null != var93) {
                                                                        UtilClass0.intstack[var6++] = var93.fieldI * 1976375311;
                                                                        UtilClass0.intstack[var6++] = var93.fieldV * 1204098761;
                                                                        var10001 = var7++;
                                                                        if (var93.fieldB != null) {
                                                                            if (DUMMY == -350752953) {
                                                                                throw new IllegalStateException();
                                                                            }

                                                                            var105 = var93.fieldB;
                                                                        } else {
                                                                            var105 = "";
                                                                        }

                                                                        UtilClass0.stringstack[var10001] = var105;
                                                                        var10001 = var7++;
                                                                        if (var93.fieldL != null) {
                                                                            if (DUMMY == -350752953) {
                                                                                throw new IllegalStateException();
                                                                            }

                                                                            var105 = var93.fieldL;
                                                                        } else {
                                                                            var105 = "";
                                                                        }

                                                                        UtilClass0.stringstack[var10001] = var105;
                                                                        UtilClass0.stringstack[var7++] = var93.fieldM != null ? var93.fieldM : "";
                                                                    } else {
                                                                        UtilClass0.intstack[var6++] = -1;
                                                                        UtilClass0.intstack[var6++] = 0;
                                                                        UtilClass0.stringstack[var7++] = "";
                                                                        UtilClass0.stringstack[var7++] = "";
                                                                        UtilClass0.stringstack[var7++] = "";
                                                                    }
                                                                    continue;
                                                                }

                                                                if (5005 == opcode) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    if (null == classEp.fieldLi) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        UtilClass0.intstack[var6++] = -1;
                                                                    } else {
                                                                        UtilClass0.intstack[var6++] = -2010103131 * classEp.fieldLi.fieldB;
                                                                    }
                                                                    continue;
                                                                }

                                                                if (5008 == opcode) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    --var7;
                                                                    var44 = UtilClass0.stringstack[var7];
                                                                    --var6;
                                                                    var17 = UtilClass0.intstack[var6];
                                                                    var53 = var44.toLowerCase();
                                                                    byte var80 = 0;
                                                                    if (var53.startsWith(StringConstants.fieldFn)) {
                                                                        var80 = 0;
                                                                        var44 = var44.substring(StringConstants.fieldFn.length());
                                                                    } else if (var53.startsWith(StringConstants.fieldFh)) {
                                                                        if (DUMMY == -350752953) {
                                                                            return;
                                                                        }

                                                                        var80 = 1;
                                                                        var44 = var44.substring(StringConstants.fieldFh.length());
                                                                    } else if (var53.startsWith(StringConstants.fieldFs)) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        var80 = 2;
                                                                        var44 = var44.substring(StringConstants.fieldFs.length());
                                                                    } else if (var53.startsWith(StringConstants.fieldGd)) {
                                                                        if (DUMMY == -350752953) {
                                                                            return;
                                                                        }

                                                                        var80 = 3;
                                                                        var44 = var44.substring(StringConstants.fieldGd.length());
                                                                    } else if (var53.startsWith(StringConstants.fieldGp)) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        var80 = 4;
                                                                        var44 = var44.substring(StringConstants.fieldGp.length());
                                                                    } else if (var53.startsWith(StringConstants.fieldGe)) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        var80 = 5;
                                                                        var44 = var44.substring(StringConstants.fieldGe.length());
                                                                    } else if (var53.startsWith(StringConstants.fieldGk)) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        var80 = 6;
                                                                        var44 = var44.substring(StringConstants.fieldGk.length());
                                                                    } else if (var53.startsWith(StringConstants.fieldGq)) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        var80 = 7;
                                                                        var44 = var44.substring(StringConstants.fieldGq.length());
                                                                    } else if (var53.startsWith(StringConstants.fieldGy)) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        var80 = 8;
                                                                        var44 = var44.substring(StringConstants.fieldGy.length());
                                                                    } else if (var53.startsWith(StringConstants.fieldGn)) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        var80 = 9;
                                                                        var44 = var44.substring(StringConstants.fieldGn.length());
                                                                    } else if (var53.startsWith(StringConstants.fieldGr)) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        var80 = 10;
                                                                        var44 = var44.substring(StringConstants.fieldGr.length());
                                                                    } else if (var53.startsWith(StringConstants.fieldGu)) {
                                                                        var80 = 11;
                                                                        var44 = var44.substring(StringConstants.fieldGu.length());
                                                                    } else if (0 != Client.fieldD * -925892703) {
                                                                        if (var53.startsWith(StringConstants.fieldFq)) {
                                                                            if (DUMMY == -350752953) {
                                                                                throw new IllegalStateException();
                                                                            }

                                                                            var80 = 0;
                                                                            var44 = var44.substring(StringConstants.fieldFq.length());
                                                                        } else if (var53.startsWith(StringConstants.fieldFi)) {
                                                                            if (DUMMY == -350752953) {
                                                                                throw new IllegalStateException();
                                                                            }

                                                                            var80 = 1;
                                                                            var44 = var44.substring(StringConstants.fieldFi.length());
                                                                        } else if (var53.startsWith(StringConstants.fieldFg)) {
                                                                            if (DUMMY == -350752953) {
                                                                                return;
                                                                            }

                                                                            var80 = 2;
                                                                            var44 = var44.substring(StringConstants.fieldFg.length());
                                                                        } else if (var53.startsWith(StringConstants.fieldGa)) {
                                                                            if (DUMMY == -350752953) {
                                                                                throw new IllegalStateException();
                                                                            }

                                                                            var80 = 3;
                                                                            var44 = var44.substring(StringConstants.fieldGa.length());
                                                                        } else if (var53.startsWith(StringConstants.fieldGo)) {
                                                                            if (DUMMY == -350752953) {
                                                                                throw new IllegalStateException();
                                                                            }

                                                                            var80 = 4;
                                                                            var44 = var44.substring(StringConstants.fieldGo.length());
                                                                        } else if (var53.startsWith(StringConstants.fieldGf)) {
                                                                            if (DUMMY == -350752953) {
                                                                                throw new IllegalStateException();
                                                                            }

                                                                            var80 = 5;
                                                                            var44 = var44.substring(StringConstants.fieldGf.length());
                                                                        } else if (var53.startsWith(StringConstants.fieldGj)) {
                                                                            if (DUMMY == -350752953) {
                                                                                throw new IllegalStateException();
                                                                            }

                                                                            var80 = 6;
                                                                            var44 = var44.substring(StringConstants.fieldGj.length());
                                                                        } else if (var53.startsWith(StringConstants.fieldGh)) {
                                                                            if (DUMMY == -350752953) {
                                                                                return;
                                                                            }

                                                                            var80 = 7;
                                                                            var44 = var44.substring(StringConstants.fieldGh.length());
                                                                        } else if (var53.startsWith(StringConstants.fieldGt)) {
                                                                            if (DUMMY == -350752953) {
                                                                                return;
                                                                            }

                                                                            var80 = 8;
                                                                            var44 = var44.substring(StringConstants.fieldGt.length());
                                                                        } else if (var53.startsWith(StringConstants.fieldGw)) {
                                                                            if (DUMMY == -350752953) {
                                                                                throw new IllegalStateException();
                                                                            }

                                                                            var80 = 9;
                                                                            var44 = var44.substring(StringConstants.fieldGw.length());
                                                                        } else if (var53.startsWith(StringConstants.fieldGc)) {
                                                                            if (DUMMY == -350752953) {
                                                                                throw new IllegalStateException();
                                                                            }

                                                                            var80 = 10;
                                                                            var44 = var44.substring(StringConstants.fieldGc.length());
                                                                        } else if (var53.startsWith(StringConstants.fieldGv)) {
                                                                            if (DUMMY == -350752953) {
                                                                                throw new IllegalStateException();
                                                                            }

                                                                            var80 = 11;
                                                                            var44 = var44.substring(StringConstants.fieldGv.length());
                                                                        }
                                                                    }

                                                                    var53 = var44.toLowerCase();
                                                                    byte var82 = 0;
                                                                    if (var53.startsWith(StringConstants.fieldGl)) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        var82 = 1;
                                                                        var44 = var44.substring(StringConstants.fieldGl.length());
                                                                    } else if (var53.startsWith(StringConstants.fieldGg)) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        var82 = 2;
                                                                        var44 = var44.substring(StringConstants.fieldGg.length());
                                                                    } else if (var53.startsWith(StringConstants.fieldGi)) {
                                                                        var82 = 3;
                                                                        var44 = var44.substring(StringConstants.fieldGi.length());
                                                                    } else if (var53.startsWith(StringConstants.fieldGm)) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        var82 = 4;
                                                                        var44 = var44.substring(StringConstants.fieldGm.length());
                                                                    } else if (var53.startsWith(StringConstants.fieldHd)) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        var82 = 5;
                                                                        var44 = var44.substring(StringConstants.fieldHd.length());
                                                                    } else if (Client.fieldD * -925892703 != 0) {
                                                                        if (DUMMY == -350752953) {
                                                                            return;
                                                                        }

                                                                        if (var53.startsWith(StringConstants.fieldGz)) {
                                                                            if (DUMMY == -350752953) {
                                                                                throw new IllegalStateException();
                                                                            }

                                                                            var82 = 1;
                                                                            var44 = var44.substring(StringConstants.fieldGz.length());
                                                                        } else if (var53.startsWith(StringConstants.fieldGb)) {
                                                                            if (DUMMY == -350752953) {
                                                                                return;
                                                                            }

                                                                            var82 = 2;
                                                                            var44 = var44.substring(StringConstants.fieldGb.length());
                                                                        } else if (var53.startsWith(StringConstants.fieldGs)) {
                                                                            var82 = 3;
                                                                            var44 = var44.substring(StringConstants.fieldGs.length());
                                                                        } else if (var53.startsWith(StringConstants.fieldGx)) {
                                                                            if (DUMMY == -350752953) {
                                                                                throw new IllegalStateException();
                                                                            }

                                                                            var82 = 4;
                                                                            var44 = var44.substring(StringConstants.fieldGx.length());
                                                                        } else if (var53.startsWith(StringConstants.fieldHf)) {
                                                                            var82 = 5;
                                                                            var44 = var44.substring(StringConstants.fieldHf.length());
                                                                        }
                                                                    }

                                                                    Client.fieldCo.writePacketHeader(63, (byte) 0);
                                                                    Client.fieldCo.writeByte(0);
                                                                    var21 = 651432265 * Client.fieldCo.caret;
                                                                    Client.fieldCo.writeByte(var17);
                                                                    Client.fieldCo.writeByte(var80);
                                                                    Client.fieldCo.writeByte(var82);
                                                                    Packet var52 = Client.fieldCo;
                                                                    int var59 = var52.caret * 651432265;
                                                                    int var64 = var44.length();
                                                                    byte[] var26 = new byte[var64];

                                                                    for (int var27 = 0; var27 < var64; ++var27) {
                                                                        char var28;
                                                                        label5128:
                                                                        {
                                                                            var28 = var44.charAt(var27);
                                                                            if (var28 > 0 && var28 < 128 || var28 >= 160 && var28 <= 255) {
                                                                                break label5128;
                                                                            }

                                                                            if (var28 == 8364) {
                                                                                var26[var27] = -128;
                                                                            } else if (var28 == 8218) {
                                                                                var26[var27] = -126;
                                                                            } else if (var28 == 402) {
                                                                                var26[var27] = -125;
                                                                            } else if (var28 == 8222) {
                                                                                var26[var27] = -124;
                                                                            } else if (8230 == var28) {
                                                                                var26[var27] = -123;
                                                                            } else if (8224 == var28) {
                                                                                var26[var27] = -122;
                                                                            } else if (8225 == var28) {
                                                                                var26[var27] = -121;
                                                                            } else if (710 == var28) {
                                                                                var26[var27] = -120;
                                                                            } else if (var28 == 8240) {
                                                                                var26[var27] = -119;
                                                                            } else if (var28 == 352) {
                                                                                var26[var27] = -118;
                                                                            } else if (8249 == var28) {
                                                                                var26[var27] = -117;
                                                                            } else if (var28 == 338) {
                                                                                var26[var27] = -116;
                                                                            } else if (var28 == 381) {
                                                                                var26[var27] = -114;
                                                                            } else if (8216 == var28) {
                                                                                var26[var27] = -111;
                                                                            } else if (var28 == 8217) {
                                                                                var26[var27] = -110;
                                                                            } else if (var28 == 8220) {
                                                                                var26[var27] = -109;
                                                                            } else if (var28 == 8221) {
                                                                                var26[var27] = -108;
                                                                            } else if (var28 == 8226) {
                                                                                var26[var27] = -107;
                                                                            } else if (8211 == var28) {
                                                                                var26[var27] = -106;
                                                                            } else if (8212 == var28) {
                                                                                var26[var27] = -105;
                                                                            } else if (732 == var28) {
                                                                                var26[var27] = -104;
                                                                            } else if (8482 == var28) {
                                                                                var26[var27] = -103;
                                                                            } else if (353 == var28) {
                                                                                var26[var27] = -102;
                                                                            } else if (var28 == 8250) {
                                                                                var26[var27] = -101;
                                                                            } else if (var28 == 339) {
                                                                                var26[var27] = -100;
                                                                            } else if (382 == var28) {
                                                                                var26[var27] = -98;
                                                                            } else if (376 == var28) {
                                                                                var26[var27] = -97;
                                                                            } else {
                                                                                var26[var27] = 63;
                                                                            }
                                                                            continue;
                                                                        }

                                                                        var26[var27] = (byte) var28;
                                                                    }

                                                                    var52.o(var26.length, (byte) 4);
                                                                    var52.caret += Client.csInstance.a(var26, 0, var26.length, var52.payload, var52.caret * 651432265, (byte) -46) * -99503879;
                                                                    Client.fieldCo.x(Client.fieldCo.caret * 651432265 - var21, (byte) -7);
                                                                    continue;
                                                                }

                                                                if (opcode == 5009) {
                                                                    var7 -= 2;
                                                                    var44 = UtilClass0.stringstack[var7];
                                                                    var46 = UtilClass0.stringstack[var7 + 1];
                                                                    Client.fieldCo.writePacketHeader(130, (byte) 0);
                                                                    Client.fieldCo.writeShort(0);
                                                                    var35 = 651432265 * Client.fieldCo.caret;
                                                                    Client.fieldCo.w(var44, (byte) 0);
                                                                    var79 = Client.fieldCo;
                                                                    var42 = var79.caret * 651432265;
                                                                    var22 = var46.length();
                                                                    byte[] var57 = new byte[var22];

                                                                    for (int var24 = 0; var24 < var22; ++var24) {
                                                                        if (DUMMY == -350752953) {
                                                                            throw new IllegalStateException();
                                                                        }

                                                                        char var25;
                                                                        label5183:
                                                                        {
                                                                            var25 = var46.charAt(var24);
                                                                            if (var25 > 0) {
                                                                                if (DUMMY == -350752953) {
                                                                                    throw new IllegalStateException();
                                                                                }

                                                                                if (var25 < 128) {
                                                                                    break label5183;
                                                                                }

                                                                                if (DUMMY == -350752953) {
                                                                                    return;
                                                                                }
                                                                            }

                                                                            if (var25 >= 160) {
                                                                                if (DUMMY == -350752953) {
                                                                                    throw new IllegalStateException();
                                                                                }

                                                                                if (var25 <= 255) {
                                                                                    if (DUMMY == -350752953) {
                                                                                        throw new IllegalStateException();
                                                                                    }
                                                                                    break label5183;
                                                                                }
                                                                            }

                                                                            if (8364 == var25) {
                                                                                if (DUMMY == -350752953) {
                                                                                    return;
                                                                                }

                                                                                var57[var24] = -128;
                                                                            } else if (var25 == 8218) {
                                                                                if (DUMMY == -350752953) {
                                                                                    return;
                                                                                }

                                                                                var57[var24] = -126;
                                                                            } else if (402 == var25) {
                                                                                var57[var24] = -125;
                                                                            } else if (8222 == var25) {
                                                                                var57[var24] = -124;
                                                                            } else if (var25 == 8230) {
                                                                                if (DUMMY == -350752953) {
                                                                                    throw new IllegalStateException();
                                                                                }

                                                                                var57[var24] = -123;
                                                                            } else if (8224 == var25) {
                                                                                var57[var24] = -122;
                                                                            } else if (var25 == 8225) {
                                                                                if (DUMMY == -350752953) {
                                                                                    return;
                                                                                }

                                                                                var57[var24] = -121;
                                                                            } else if (var25 == 710) {
                                                                                if (DUMMY == -350752953) {
                                                                                    throw new IllegalStateException();
                                                                                }

                                                                                var57[var24] = -120;
                                                                            } else if (var25 == 8240) {
                                                                                if (DUMMY == -350752953) {
                                                                                    throw new IllegalStateException();
                                                                                }

                                                                                var57[var24] = -119;
                                                                            } else if (352 == var25) {
                                                                                var57[var24] = -118;
                                                                            } else if (var25 == 8249) {
                                                                                var57[var24] = -117;
                                                                            } else if (var25 == 338) {
                                                                                if (DUMMY == -350752953) {
                                                                                    return;
                                                                                }

                                                                                var57[var24] = -116;
                                                                            } else if (var25 == 381) {
                                                                                if (DUMMY == -350752953) {
                                                                                    return;
                                                                                }

                                                                                var57[var24] = -114;
                                                                            } else if (var25 == 8216) {
                                                                                if (DUMMY == -350752953) {
                                                                                    throw new IllegalStateException();
                                                                                }

                                                                                var57[var24] = -111;
                                                                            } else if (8217 == var25) {
                                                                                var57[var24] = -110;
                                                                            } else if (8220 == var25) {
                                                                                var57[var24] = -109;
                                                                            } else if (var25 == 8221) {
                                                                                if (DUMMY == -350752953) {
                                                                                    throw new IllegalStateException();
                                                                                }

                                                                                var57[var24] = -108;
                                                                            } else if (8226 == var25) {
                                                                                var57[var24] = -107;
                                                                            } else if (8211 == var25) {
                                                                                if (DUMMY == -350752953) {
                                                                                    throw new IllegalStateException();
                                                                                }

                                                                                var57[var24] = -106;
                                                                            } else if (8212 == var25) {
                                                                                if (DUMMY == -350752953) {
                                                                                    return;
                                                                                }

                                                                                var57[var24] = -105;
                                                                            } else if (732 == var25) {
                                                                                if (DUMMY == -350752953) {
                                                                                    return;
                                                                                }

                                                                                var57[var24] = -104;
                                                                            } else if (8482 == var25) {
                                                                                if (DUMMY == -350752953) {
                                                                                    throw new IllegalStateException();
                                                                                }

                                                                                var57[var24] = -103;
                                                                            } else if (353 == var25) {
                                                                                if (DUMMY == -350752953) {
                                                                                    throw new IllegalStateException();
                                                                                }

                                                                                var57[var24] = -102;
                                                                            } else if (8250 == var25) {
                                                                                if (DUMMY == -350752953) {
                                                                                    throw new IllegalStateException();
                                                                                }

                                                                                var57[var24] = -101;
                                                                            } else if (339 == var25) {
                                                                                if (DUMMY == -350752953) {
                                                                                    throw new IllegalStateException();
                                                                                }

                                                                                var57[var24] = -100;
                                                                            } else if (382 == var25) {
                                                                                if (DUMMY == -350752953) {
                                                                                    throw new IllegalStateException();
                                                                                }

                                                                                var57[var24] = -98;
                                                                            } else if (var25 == 376) {
                                                                                if (DUMMY == -350752953) {
                                                                                    return;
                                                                                }

                                                                                var57[var24] = -97;
                                                                            } else {
                                                                                var57[var24] = 63;
                                                                            }
                                                                            continue;
                                                                        }

                                                                        var57[var24] = (byte) var25;
                                                                    }

                                                                    var79.o(var57.length, (byte) 4);
                                                                    var79.caret += Client.csInstance.a(var57, 0, var57.length, var79.payload, var79.caret * 651432265, (byte) 56) * -99503879;
                                                                    Client.fieldCo.d(651432265 * Client.fieldCo.caret - var35, 2073311638);
                                                                    continue;
                                                                }

                                                                if (opcode == 5015) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    label4869:
                                                                    {
                                                                        if (Client.myPlayer != null) {
                                                                            if (DUMMY == -350752953) {
                                                                                return;
                                                                            }

                                                                            if (null != Client.myPlayer.name) {
                                                                                if (DUMMY == -350752953) {
                                                                                    throw new IllegalStateException();
                                                                                }

                                                                                var44 = Client.myPlayer.name;
                                                                                break label4869;
                                                                            }
                                                                        }

                                                                        var44 = "";
                                                                    }

                                                                    UtilClass0.stringstack[var7++] = var44;
                                                                    continue;
                                                                }

                                                                if (opcode == 5016) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    UtilClass0.intstack[var6++] = Client.fieldLh * 476041737;
                                                                    continue;
                                                                }

                                                                if (5017 == opcode) {
                                                                    if (DUMMY == -350752953) {
                                                                        return;
                                                                    }

                                                                    --var6;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    UtilClass0.intstack[var6++] = UtilClass42.method9(var16, -833639735);
                                                                    continue;
                                                                }

                                                                if (opcode == 5018) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    --var6;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    UtilClass0.intstack[var6++] = UtilClass23.method19(var16, (byte) 86);
                                                                    continue;
                                                                }

                                                                if (5019 == opcode) {
                                                                    if (DUMMY == -350752953) {
                                                                        return;
                                                                    }

                                                                    --var6;
                                                                    var16 = UtilClass0.intstack[var6];
                                                                    var36 = UtilClass0.intstack;
                                                                    var35 = var6++;
                                                                    Message var81 = (Message) UtilClass40.fieldV.a((long) var16);
                                                                    if (var81 == null) {
                                                                        if (DUMMY == -350752953) {
                                                                            return;
                                                                        }

                                                                        var38 = -1;
                                                                    } else if (var81.dualPrev == UtilClass40.fieldI.root) {
                                                                        if (DUMMY == -350752953) {
                                                                            return;
                                                                        }

                                                                        var38 = -1;
                                                                    } else {
                                                                        var38 = ((Message) var81.dualPrev).fieldA * -1367842983;
                                                                    }

                                                                    var36[var35] = var38;
                                                                    continue;
                                                                }

                                                                if (opcode == 5020) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    --var7;
                                                                    var44 = UtilClass0.stringstack[var7];
                                                                    UtilClass41.method157(var44, -1432964986);
                                                                    continue;
                                                                }

                                                                if (opcode == 5021) {
                                                                    if (DUMMY == -350752953) {
                                                                        return;
                                                                    }

                                                                    --var7;
                                                                    Client.fieldLn = UtilClass0.stringstack[var7].toLowerCase().trim();
                                                                    continue;
                                                                }

                                                                if (opcode == 5022) {
                                                                    if (DUMMY == -350752953) {
                                                                        throw new IllegalStateException();
                                                                    }

                                                                    UtilClass0.stringstack[var7++] = Client.fieldLn;
                                                                    continue;
                                                                }
                                                            }
                                                        }
                                                        break label5025;
                                                    }
                                                }

                                                if (opcode >= 2000) {
                                                    if (DUMMY == -350752953) {
                                                        return;
                                                    }

                                                    opcode -= 1000;
                                                    --var6;
                                                    var33 = Widget.lookup(UtilClass0.intstack[var6]);
                                                } else {
                                                    if (var50) {
                                                        if (DUMMY == -350752953) {
                                                            return;
                                                        }

                                                        var101 = Message.fieldF;
                                                    } else {
                                                        var101 = classDa.fieldK;
                                                    }

                                                    var33 = var101;
                                                }

                                                if (1300 == opcode) {
                                                    if (DUMMY == -350752953) {
                                                        throw new IllegalStateException();
                                                    }

                                                    --var6;
                                                    var17 = UtilClass0.intstack[var6] - 1;
                                                    if (var17 >= 0) {
                                                        if (DUMMY == -350752953) {
                                                            throw new IllegalStateException();
                                                        }

                                                        if (var17 <= 9) {
                                                            --var7;
                                                            var33.o(var17, UtilClass0.stringstack[var7], -1640116996);
                                                            continue;
                                                        }

                                                        if (DUMMY == -350752953) {
                                                            throw new IllegalStateException();
                                                        }
                                                    }

                                                    --var7;
                                                    continue;
                                                }

                                                if (opcode == 1301) {
                                                    var6 -= 2;
                                                    var17 = UtilClass0.intstack[var6];
                                                    var35 = UtilClass0.intstack[var6 + 1];
                                                    var33.fieldBd = Message.getWidget(var17, var35, (byte) 21);
                                                    continue;
                                                }

                                                if (opcode == 1302) {
                                                    if (DUMMY == -350752953) {
                                                        throw new IllegalStateException();
                                                    }

                                                    --var6;
                                                    var33.fieldBy = UtilClass0.intstack[var6] == 1;
                                                    continue;
                                                }

                                                if (1303 == opcode) {
                                                    if (DUMMY == -350752953) {
                                                        throw new IllegalStateException();
                                                    }

                                                    --var6;
                                                    var33.fieldBh = UtilClass0.intstack[var6] * 1576727845;
                                                    continue;
                                                }

                                                if (opcode == 1304) {
                                                    if (DUMMY == -350752953) {
                                                        return;
                                                    }

                                                    --var6;
                                                    var33.fieldBj = UtilClass0.intstack[var6] * -1701682411;
                                                    continue;
                                                }

                                                if (1305 == opcode) {
                                                    --var7;
                                                    var33.fieldBa = UtilClass0.stringstack[var7];
                                                    continue;
                                                }

                                                if (1306 == opcode) {
                                                    if (DUMMY == -350752953) {
                                                        throw new IllegalStateException();
                                                    }

                                                    --var7;
                                                    var33.fieldCr = UtilClass0.stringstack[var7];
                                                    continue;
                                                }

                                                if (opcode == 1307) {
                                                    var33.fieldBv = null;
                                                    continue;
                                                }
                                                break label5025;
                                            }
                                        }

                                        if (opcode >= 2000) {
                                            if (DUMMY == -350752953) {
                                                throw new IllegalStateException();
                                            }

                                            opcode -= 1000;
                                            --var6;
                                            var33 = Widget.lookup(UtilClass0.intstack[var6]);
                                        } else {
                                            if (var50) {
                                                if (DUMMY == -350752953) {
                                                    throw new IllegalStateException();
                                                }

                                                var101 = Message.fieldF;
                                            } else {
                                                var101 = classDa.fieldK;
                                            }

                                            var33 = var101;
                                        }

                                        classBx.method250(var33, 57574739);
                                        if (opcode != 1200) {
                                            if (DUMMY == -350752953) {
                                                return;
                                            }

                                            if (opcode != 1205) {
                                                if (DUMMY == -350752953) {
                                                    throw new IllegalStateException();
                                                }

                                                if (opcode != 1212) {
                                                    if (1201 == opcode) {
                                                        if (DUMMY == -350752953) {
                                                            throw new IllegalStateException();
                                                        }

                                                        var33.fieldAd = 1836673674;
                                                        --var6;
                                                        var33.fieldAu = UtilClass0.intstack[var6] * -858091143;
                                                        continue;
                                                    }

                                                    if (opcode == 1202) {
                                                        if (DUMMY == -350752953) {
                                                            throw new IllegalStateException();
                                                        }

                                                        var33.fieldAd = -1539956785;
                                                        var33.fieldAu = Client.myPlayer.cfg.n(-1350768990) * -858091143;
                                                        continue;
                                                    }
                                                    break label5025;
                                                }

                                                if (DUMMY == -350752953) {
                                                    return;
                                                }
                                            }
                                        }

                                        var6 -= 2;
                                        var17 = UtilClass0.intstack[var6];
                                        var35 = UtilClass0.intstack[1 + var6];
                                        var33.itemId = var17 * 64341787;
                                        var33.fieldDl = var35 * 416509361;
                                        ItemDefinition var96 = Client.getItemDefinition(var17, 333646966);
                                        var33.fieldAy = var96.fieldJ * 959197;
                                        var33.fieldBu = var96.fieldG * 2085460755;
                                        var33.fieldBo = var96.fieldY * 1298241665;
                                        var33.fieldAc = var96.fieldP * -2076098127;
                                        var33.fieldAp = var96.fieldR * 1278847429;
                                        var33.fieldBi = var96.fieldU * -756987241;
                                        if (opcode == 1205) {
                                            var33.fieldBp = 0;
                                        } else {
                                            if (opcode == 1212) {
                                                if (DUMMY == -350752953) {
                                                    throw new IllegalStateException();
                                                }

                                                var103 = true;
                                            } else {
                                                var103 = false;
                                            }

                                            if (var96.stackable * 1977514217 == 1) {
                                                if (DUMMY == -350752953) {
                                                    throw new IllegalStateException();
                                                }

                                                var106 = true;
                                            } else {
                                                var106 = false;
                                            }

                                            if (var103 | var106) {
                                                if (DUMMY == -350752953) {
                                                    throw new IllegalStateException();
                                                }

                                                var33.fieldBp = -1583023683;
                                            } else {
                                                var33.fieldBp = 1128919930;
                                            }
                                        }

                                        if (var33.width * 805002637 > 0) {
                                            if (DUMMY == -350752953) {
                                                throw new IllegalStateException();
                                            }

                                            var33.fieldBi = -1638948091 * (var33.fieldBi * -157927008 / (var33.width * 805002637));
                                        }
                                        continue;
                                    }

                                    if (opcode >= 2000) {
                                        if (DUMMY == -350752953) {
                                            return;
                                        }

                                        opcode -= 1000;
                                        --var6;
                                        var33 = Widget.lookup(UtilClass0.intstack[var6]);
                                    } else {
                                        var33 = var50 ? Message.fieldF : classDa.fieldK;
                                    }

                                    if (1100 == opcode) {
                                        if (DUMMY == -350752953) {
                                            throw new IllegalStateException();
                                        }

                                        var6 -= 2;
                                        var33.insetX = UtilClass0.intstack[var6] * -924455895;
                                        if (var33.insetX * 531263513 > var33.fieldAn * 192647263 - var33.width * 805002637) {
                                            var33.insetX = var33.fieldAn * 484225847 - var33.width * 1084290965;
                                        }

                                        if (var33.insetX * 531263513 < 0) {
                                            var33.insetX = 0;
                                        }

                                        var33.insetY = UtilClass0.intstack[var6 + 1] * 724604799;
                                        if (var33.insetY * -1991825281 > var33.viewportHeight * 1854186653 - var33.height * -1004717071) {
                                            if (DUMMY == -350752953) {
                                                throw new IllegalStateException();
                                            }

                                            var33.insetY = var33.viewportHeight * 1297499363 - var33.height * 1091298191;
                                        }

                                        if (var33.insetY * -1991825281 < 0) {
                                            if (DUMMY == -350752953) {
                                                throw new IllegalStateException();
                                            }

                                            var33.insetY = 0;
                                        }

                                        classBx.method250(var33, 57574739);
                                        continue;
                                    }

                                    if (1101 == opcode) {
                                        if (DUMMY == -350752953) {
                                            throw new IllegalStateException();
                                        }

                                        --var6;
                                        var33.fieldAh = UtilClass0.intstack[var6] * -204360837;
                                        classBx.method250(var33, 57574739);
                                        continue;
                                    }

                                    if (1102 == opcode) {
                                        if (DUMMY == -350752953) {
                                            throw new IllegalStateException();
                                        }

                                        --var6;
                                        if (UtilClass0.intstack[var6] == 1) {
                                            if (DUMMY == -350752953) {
                                                throw new IllegalStateException();
                                            }

                                            var106 = true;
                                        } else {
                                            var106 = false;
                                        }

                                        var33.fieldAl = var106;
                                        classBx.method250(var33, 57574739);
                                        continue;
                                    }

                                    if (opcode == 1103) {
                                        --var6;
                                        var33.fieldAq = UtilClass0.intstack[var6] * 353028707;
                                        classBx.method250(var33, 57574739);
                                        continue;
                                    }

                                    if (1104 == opcode) {
                                        if (DUMMY == -350752953) {
                                            return;
                                        }

                                        --var6;
                                        var33.fieldAm = UtilClass0.intstack[var6] * 792091749;
                                        classBx.method250(var33, 57574739);
                                        continue;
                                    }

                                    if (opcode == 1105) {
                                        if (DUMMY == -350752953) {
                                            throw new IllegalStateException();
                                        }

                                        --var6;
                                        var33.textureId = UtilClass0.intstack[var6] * 1568720601;
                                        classBx.method250(var33, 57574739);
                                        continue;
                                    }

                                    if (opcode == 1106) {
                                        --var6;
                                        var33.fieldAi = UtilClass0.intstack[var6] * 1032405715;
                                        classBx.method250(var33, 57574739);
                                        continue;
                                    }

                                    if (opcode == 1107) {
                                        if (DUMMY == -350752953) {
                                            throw new IllegalStateException();
                                        }

                                        --var6;
                                        if (UtilClass0.intstack[var6] == 1) {
                                            if (DUMMY == -350752953) {
                                                throw new IllegalStateException();
                                            }

                                            var106 = true;
                                        } else {
                                            var106 = false;
                                        }

                                        var33.fieldAa = var106;
                                        classBx.method250(var33, 57574739);
                                        continue;
                                    }

                                    if (opcode == 1108) {
                                        if (DUMMY == -350752953) {
                                            return;
                                        }

                                        var33.fieldAd = 918336837;
                                        --var6;
                                        var33.fieldAu = UtilClass0.intstack[var6] * -858091143;
                                        classBx.method250(var33, 57574739);
                                        continue;
                                    }

                                    if (1109 == opcode) {
                                        var6 -= 6;
                                        var33.fieldAc = UtilClass0.intstack[var6] * -751209793;
                                        var33.fieldAp = UtilClass0.intstack[1 + var6] * -1143690161;
                                        var33.fieldAy = -1514397635 * UtilClass0.intstack[2 + var6];
                                        var33.fieldBu = UtilClass0.intstack[var6 + 3] * -1385890543;
                                        var33.fieldBo = UtilClass0.intstack[var6 + 4] * 2051348697;
                                        var33.fieldBi = UtilClass0.intstack[var6 + 5] * -1638948091;
                                        classBx.method250(var33, 57574739);
                                        continue;
                                    }

                                    if (1110 == opcode) {
                                        if (DUMMY == -350752953) {
                                            throw new IllegalStateException();
                                        }

                                        --var6;
                                        var17 = UtilClass0.intstack[var6];
                                        if (var17 != var33.fieldAf * -9713859) {
                                            var33.fieldAf = var17 * -1969895403;
                                            var33.fieldDs = 0;
                                            var33.fieldDc = 0;
                                            classBx.method250(var33, 57574739);
                                        }
                                        continue;
                                    }

                                    if (opcode == 1111) {
                                        if (DUMMY == -350752953) {
                                            return;
                                        }

                                        --var6;
                                        if (UtilClass0.intstack[var6] == 1) {
                                            if (DUMMY == -350752953) {
                                                throw new IllegalStateException();
                                            }

                                            var106 = true;
                                        } else {
                                            var106 = false;
                                        }

                                        var33.fieldBl = var106;
                                        classBx.method250(var33, 57574739);
                                        continue;
                                    }

                                    if (opcode == 1112) {
                                        if (DUMMY == -350752953) {
                                            throw new IllegalStateException();
                                        }

                                        --var7;
                                        var46 = UtilClass0.stringstack[var7];
                                        if (!var46.equals(var33.fieldBm)) {
                                            if (DUMMY == -350752953) {
                                                throw new IllegalStateException();
                                            }

                                            var33.fieldBm = var46;
                                            classBx.method250(var33, 57574739);
                                        }
                                        continue;
                                    }

                                    if (opcode == 1113) {
                                        if (DUMMY == -350752953) {
                                            return;
                                        }

                                        --var6;
                                        var33.fieldBw = UtilClass0.intstack[var6] * -430265019;
                                        classBx.method250(var33, 57574739);
                                        continue;
                                    }

                                    if (opcode == 1114) {
                                        if (DUMMY == -350752953) {
                                            return;
                                        }

                                        var6 -= 3;
                                        var33.fieldBe = 404843075 * UtilClass0.intstack[var6];
                                        var33.fieldBb = 1068762391 * UtilClass0.intstack[1 + var6];
                                        var33.fieldBr = UtilClass0.intstack[var6 + 2] * -2011961211;
                                        classBx.method250(var33, 57574739);
                                        continue;
                                    }

                                    if (opcode == 1115) {
                                        --var6;
                                        if (UtilClass0.intstack[var6] == 1) {
                                            if (DUMMY == -350752953) {
                                                throw new IllegalStateException();
                                            }

                                            var106 = true;
                                        } else {
                                            var106 = false;
                                        }

                                        var33.fieldBc = var106;
                                        classBx.method250(var33, 57574739);
                                        continue;
                                    }

                                    if (1116 == opcode) {
                                        --var6;
                                        var33.fieldAt = UtilClass0.intstack[var6] * -188167725;
                                        classBx.method250(var33, 57574739);
                                        continue;
                                    }

                                    if (1117 == opcode) {
                                        --var6;
                                        var33.fieldAw = UtilClass0.intstack[var6] * -1835095931;
                                        classBx.method250(var33, 57574739);
                                        continue;
                                    }

                                    if (opcode == 1118) {
                                        --var6;
                                        var33.vflipped = UtilClass0.intstack[var6] == 1;
                                        classBx.method250(var33, 57574739);
                                        continue;
                                    }

                                    if (opcode == 1119) {
                                        --var6;
                                        var33.hflipped = UtilClass0.intstack[var6] == 1;
                                        classBx.method250(var33, 57574739);
                                        continue;
                                    }

                                    if (opcode == 1120) {
                                        var6 -= 2;
                                        var33.fieldAn = UtilClass0.intstack[var6] * -621098081;
                                        var33.viewportHeight = UtilClass0.intstack[1 + var6] * 2112815541;
                                        classBx.method250(var33, 57574739);
                                        continue;
                                    }

                                    if (opcode == 1121) {
                                        if (DUMMY == -350752953) {
                                            throw new IllegalStateException();
                                        }

                                        UtilClass38.method127(var33.id * -1866039137, var33.index * 1176560255, (byte) -96);
                                        Client.fieldJy = var33;
                                        classBx.method250(var33, 57574739);
                                        continue;
                                    }
                                    break label5025;
                                }

                                if (opcode >= 2000) {
                                    opcode -= 1000;
                                    --var6;
                                    var33 = Widget.lookup(UtilClass0.intstack[var6]);
                                } else {
                                    if (var50) {
                                        if (DUMMY == -350752953) {
                                            throw new IllegalStateException();
                                        }

                                        var101 = Message.fieldF;
                                    } else {
                                        var101 = classDa.fieldK;
                                    }

                                    var33 = var101;
                                }

                                if (1000 == opcode) {
                                    var6 -= 2;
                                    var33.relativeX = 1121775953 * UtilClass0.intstack[var6];
                                    var33.relativeY = 1941180649 * UtilClass0.intstack[1 + var6];
                                    classBx.method250(var33, 57574739);
                                    continue;
                                }

                                if (1001 == opcode) {
                                    if (DUMMY == -350752953) {
                                        throw new IllegalStateException();
                                    }

                                    var6 -= 2;
                                    var33.width = 310783301 * UtilClass0.intstack[var6];
                                    var33.height = -542616303 * UtilClass0.intstack[1 + var6];
                                    classBx.method250(var33, 57574739);
                                    continue;
                                }

                                if (1003 == opcode) {
                                    if (DUMMY == -350752953) {
                                        throw new IllegalStateException();
                                    }

                                    --var6;
                                    var40 = UtilClass0.intstack[var6] == 1;
                                    if (var40 != var33.fieldR) {
                                        if (DUMMY == -350752953) {
                                            return;
                                        }

                                        var33.fieldR = var40;
                                        classBx.method250(var33, 57574739);
                                    }
                                    continue;
                                }
                            }
                        }

                        if (opcode >= 5600 || opcode != 5504) {
                            throw new IllegalStateException();
                        }

                        if (DUMMY == -350752953) {
                            throw new IllegalStateException();
                        }

                        var6 -= 2;
                        var16 = UtilClass0.intstack[var6];
                        var17 = UtilClass0.intstack[1 + var6];
                        if (!Client.cameraLocked) {
                            if (DUMMY == -350752953) {
                                return;
                            }

                            Client.fieldFe = 1927658783 * var16;
                            Client.minimapRotation = -1874395707 * var17;
                        }
                    }
                } catch (Exception var29) {
                    StringBuilder var13 = new StringBuilder(30);
                    var13.append("").append(script.key).append(" ");

                    for (var14 = UtilClass0.fieldN * -518422623 - 1; var14 >= 0; --var14) {
                        var13.append("").append(UtilClass0.scriptstackelement[var14].fieldA.key).append(" ");
                    }

                    var13.append("").append(var11);
                    UtilClass5.method61(var13.toString(), var29, -765030861);
                }
            }
        } catch (RuntimeException var30) {
            throw ClanMate.error(var30, "n.v(" + ')');
        }
    }

    public static void method113(ReferenceTable var0, ReferenceTable var1, short var2) {
        try {
            Animation.referenceTable = var0;
            Animation.fieldV = var1;
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "n.a(" + ')');
        }
    }

    public static<T extends Identifiable> T ValueOf(T[] pool, int id, int DUMMY) {
        try {

            for (T var5 : pool) {
                if (id == var5.getId(-1501444937)) {
                    return var5;
                }
            }

            return null;
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "n.a(" + ')');
        }
    }

    void a(boolean var1, int var2) {

    }

    /**
     * Structure:
     * unknown (3) - byte
     * roofs - bool byte
     * audio - bool byte
     * map size - byte
     * all map keys and values as ints
     */
    Buffer write(int dummy) {
        try {
            Buffer output = new Buffer(100);
            output.writeByte(Preferences.unknownConstant * 1418136097); //always 3?

            byte value = (byte) (this.roofsEnabled ? 1 : 0);
            output.writeByte(value);

            value = (byte) (this.audioEnabled ? 1 : 0);
            output.writeByte(value);

            output.writeByte(this.map.size());

            Iterator var3 = this.map.entrySet().iterator();
            while (var3.hasNext()) {
                Entry var4 = (Entry) var3.next();
                output.writeInt(((Integer) var4.getKey()).intValue());
                output.writeInt(((Integer) var4.getValue()).intValue());
            }

            return output;
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "n.v(" + ')');
        }
    }
}
