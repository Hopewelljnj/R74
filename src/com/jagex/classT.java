package com.jagex;

import java.awt.*;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

public class classT {

    public static ReferenceTableSub fieldBs;
    DataInputStream fieldB;
    Task fieldV;
    byte[] fieldI = new byte[4];
    int fieldL;
    int fieldA;
    byte[] fieldM;
    int fieldW;
    long fieldE;


    classT(TaskHandler var1, URL var2) {
        this.fieldV = var1.scheduleDataInputSteamTask(var2, -1663674587);
        this.fieldA = 0;
        this.fieldE = (classDz.getFancyTime(1928085869) + 30000L) * -18373522320093871L;
    }

    static void method166(Component var0, ReferenceTable var1, ReferenceTable var2, boolean var3, int var4, int var5) {
        try {
            if (classJ.fieldA) {
                if (var5 < 1852137444) {
                    if (var4 == 4) {
                        if (var5 >= 1852137444) {
                            return;
                        }

                        ClientData.fieldAl = -904529348;
                    }

                }
            } else {
                ClientData.fieldAl = var4 * -226132337;
                RSGraphics.method244();
                byte[] var6 = var1.j("title.jpg", "", (byte) 25);
                UtilClass7.fieldL = new Sprite(var6, var0);
                ClientData.fieldM = UtilClass7.fieldL.a();
                ClientData.fieldW = DynamicObject.method137(var2, "logo", "", 1080668542);
                Client.fieldV = DynamicObject.method137(var2, "titlebox", "", 1556436314);
                ClientData.fieldI = DynamicObject.method137(var2, "titlebutton", "", -417350574);
                ItemTable.fieldB = classDs.method82(var2, "runes", "", 383993922);
                Client.cfieldE = classDs.method82(var2, "title_mute", "", 383993922);
                UtilClass5.fieldN = DynamicObject.method137(var2, "options_radio_buttons,0", "", 282455750);
                ClientData.fieldS = DynamicObject.method137(var2, "options_radio_buttons,2", "", -155077428);
                BoundaryDecoration.fieldH = new int[256];

                int var7;
                for (var7 = 0; var7 < 64; ++var7) {
                    if (var5 >= 1852137444) {
                        return;
                    }

                    BoundaryDecoration.fieldH[var7] = 262144 * var7;
                }

                for (var7 = 0; var7 < 64; ++var7) {
                    if (var5 >= 1852137444) {
                        throw new IllegalStateException();
                    }

                    BoundaryDecoration.fieldH[64 + var7] = 16711680 + var7 * 1024;
                }

                for (var7 = 0; var7 < 64; ++var7) {
                    if (var5 >= 1852137444) {
                        throw new IllegalStateException();
                    }

                    BoundaryDecoration.fieldH[128 + var7] = var7 * 4 + 16776960;
                }

                for (var7 = 0; var7 < 64; ++var7) {
                    if (var5 >= 1852137444) {
                        throw new IllegalStateException();
                    }

                    BoundaryDecoration.fieldH[192 + var7] = 16777215;
                }

                classDp.fieldU = new int[256];

                for (var7 = 0; var7 < 64; ++var7) {
                    if (var5 >= 1852137444) {
                        return;
                    }

                    classDp.fieldU[var7] = 1024 * var7;
                }

                for (var7 = 0; var7 < 64; ++var7) {
                    if (var5 >= 1852137444) {
                        throw new IllegalStateException();
                    }

                    classDp.fieldU[64 + var7] = 4 * var7 + '\uff00';
                }

                for (var7 = 0; var7 < 64; ++var7) {
                    if (var5 >= 1852137444) {
                        return;
                    }

                    classDp.fieldU[var7 + 128] = '\uffff' + 262144 * var7;
                }

                for (var7 = 0; var7 < 64; ++var7) {
                    if (var5 >= 1852137444) {
                        throw new IllegalStateException();
                    }

                    classDp.fieldU[192 + var7] = 16777215;
                }

                classBy.fieldJ = new int[256];

                for (var7 = 0; var7 < 64; ++var7) {
                    if (var5 >= 1852137444) {
                        return;
                    }

                    classBy.fieldJ[var7] = 4 * var7;
                }

                for (var7 = 0; var7 < 64; ++var7) {
                    if (var5 >= 1852137444) {
                        throw new IllegalStateException();
                    }

                    classBy.fieldJ[64 + var7] = 255 + 262144 * var7;
                }

                for (var7 = 0; var7 < 64; ++var7) {
                    if (var5 >= 1852137444) {
                        throw new IllegalStateException();
                    }

                    classBy.fieldJ[var7 + 128] = 1024 * var7 + 16711935;
                }

                for (var7 = 0; var7 < 64; ++var7) {
                    if (var5 >= 1852137444) {
                        throw new IllegalStateException();
                    }

                    classBy.fieldJ[192 + var7] = 16777215;
                }

                UtilClass41.fieldT = new int[256];
                IgnoredPlayer.fieldP = new int['\u8000'];
                UtilClass35.fieldR = new int['\u8000'];
                RuneScript.method163((CompressedImage) null, (byte) 81);
                classJ.fieldZ = new int['\u8000'];
                ClientData.fieldC = new int['\u8000'];
                if (var3) {
                    ClientData.username = "faggot";
                    ClientData.password = "ok";
                }

                LandscapeTile.fieldAt = 0;
                classAi.fieldAw = "";
                ClientData.fieldAo = true;
                ClientData.isWorldSelectorOpen = false;
                if (!Projectile.preferences.audioEnabled) {
                    if (var5 >= 1852137444) {
                        return;
                    }

                    TilePaint.method335(2, fieldBs, "scape main", "", 255, false, 699052734);
                } else {
                    UtilClass21.fieldL = -561749511;
                    UtilClass21.fieldM = null;
                    UtilClass35.fieldW = -1158645973;
                    classDz.fieldE = 1105453967;
                    ItemTable.fieldN = 0;
                    UtilClass21.fieldK = false;
                    UtilClass21.fieldS = 971689226;
                }

                classCn.method327(false, 597707829);
                classJ.fieldA = true;
                UtilClass7.fieldL.s(0, 0);
                ClientData.fieldM.s(382, 0);
                ClientData.fieldW.i(382 - ClientData.fieldW.fieldI / 2, 18);
            }
        } catch (RuntimeException var8) {
            throw ClanMate.error(var8, "t.a(" + ')');
        }
    }

    static void method167(ScriptEvent var0, byte var1) {
        try {
            Preferences.bigdickscripthandler(var0, 200000, 1798312401);
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "t.a(" + ')');
        }
    }

    public static int method168(CharSequence var0, CharSequence var1, int var2, int var3) {
        try {
            int var4 = var0.length();
            int var5 = var1.length();
            int var6 = 0;
            int var7 = 0;
            char var8 = 0;
            char var9 = 0;

            while (true) {
                if (var6 - var8 >= var4) {
                    if (var3 <= -1988291599) {
                        throw new IllegalStateException();
                    }

                    if (var7 - var9 >= var5) {
                        if (var3 <= -1988291599) {
                            throw new IllegalStateException();
                        }

                        int var18 = Math.min(var4, var5);

                        char var13;
                        int var19;
                        for (var19 = 0; var19 < var18; ++var19) {
                            char var12 = var0.charAt(var19);
                            var13 = var1.charAt(var19);
                            if (var12 != var13) {
                                if (var3 <= -1988291599) {
                                    throw new IllegalStateException();
                                }

                                if (java.lang.Character.toUpperCase(var12) != java.lang.Character.toUpperCase(var13)) {
                                    var12 = java.lang.Character.toLowerCase(var12);
                                    var13 = java.lang.Character.toLowerCase(var13);
                                    if (var12 != var13) {
                                        if (var3 <= -1988291599) {
                                            throw new IllegalStateException();
                                        }

                                        return UtilClass19.method170(var12, var2, (byte) -15) - UtilClass19.method170(var13, var2, (byte) -68);
                                    }
                                }
                            }
                        }

                        var19 = var4 - var5;
                        if (var19 != 0) {
                            if (var3 <= -1988291599) {
                                throw new IllegalStateException();
                            }

                            return var19;
                        }

                        for (int var20 = 0; var20 < var18; ++var20) {
                            if (var3 <= -1988291599) {
                                throw new IllegalStateException();
                            }

                            var13 = var0.charAt(var20);
                            char var14 = var1.charAt(var20);
                            if (var14 != var13) {
                                if (var3 <= -1988291599) {
                                    throw new IllegalStateException();
                                }

                                return UtilClass19.method170(var13, var2, (byte) -89) - UtilClass19.method170(var14, var2, (byte) -125);
                            }
                        }

                        return 0;
                    }
                }

                if (var6 - var8 >= var4) {
                    return -1;
                }

                if (var7 - var9 >= var5) {
                    return 1;
                }

                char var10;
                if (var8 != 0) {
                    var10 = var8;
                    boolean var16 = false;
                } else {
                    var10 = var0.charAt(var6++);
                }

                char var11;
                if (0 != var9) {
                    var11 = var9;
                    boolean var17 = false;
                } else {
                    var11 = var1.charAt(var7++);
                }

                var8 = UtilClass22.method8(var10, 1171842915);
                var9 = UtilClass22.method8(var11, -218576152);
                var10 = classFl.method13(var10, var2, (byte) -80);
                var11 = classFl.method13(var11, var2, (byte) -76);
                if (var10 != var11 && java.lang.Character.toUpperCase(var10) != java.lang.Character.toUpperCase(var11)) {
                    if (var3 <= -1988291599) {
                        throw new IllegalStateException();
                    }

                    var10 = java.lang.Character.toLowerCase(var10);
                    var11 = java.lang.Character.toLowerCase(var11);
                    if (var11 != var10) {
                        if (var3 <= -1988291599) {
                            throw new IllegalStateException();
                        }

                        return UtilClass19.method170(var10, var2, (byte) -92) - UtilClass19.method170(var11, var2, (byte) -73);
                    }
                }
            }
        } catch (RuntimeException var15) {
            throw ClanMate.error(var15, "t.a(" + ')');
        }
    }

    byte[] a(byte var1) throws IOException {
        try {
            if (classDz.getFancyTime(536354310) > this.fieldE * 4777865982972844977L) {
                if (var1 == 8) {
                    throw new IllegalStateException();
                } else {
                    throw new IOException();
                }
            } else {
                if (0 == this.fieldA * -1861821183) {
                    if (var1 == 8) {
                        throw new IllegalStateException();
                    }

                    if (2 == this.fieldV.resultStatus) {
                        if (var1 == 8) {
                            throw new IllegalStateException();
                        }

                        throw new IOException();
                    }

                    if (this.fieldV.resultStatus == 1) {
                        if (var1 == 8) {
                            throw new IllegalStateException();
                        }

                        this.fieldB = (DataInputStream) this.fieldV.result;
                        this.fieldA = 79831809;
                    }
                }

                int var2;
                if (this.fieldA * -1861821183 == 1) {
                    if (var1 == 8) {
                        throw new IllegalStateException();
                    }

                    var2 = this.fieldB.available();
                    if (var2 > 0) {
                        if (var1 == 8) {
                            throw new IllegalStateException();
                        }

                        if (this.fieldL * -497096967 + var2 > 4) {
                            if (var1 == 8) {
                                throw new IllegalStateException();
                            }

                            var2 = 4 - this.fieldL * -497096967;
                        }

                        this.fieldL += this.fieldB.read(this.fieldI, this.fieldL * -497096967, var2) * -691340471;
                        if (4 == this.fieldL * -497096967) {
                            if (var1 == 8) {
                                throw new IllegalStateException();
                            }

                            int var3 = (new Buffer(this.fieldI)).readInt((byte) 68);
                            this.fieldM = new byte[var3];
                            this.fieldA = 159663618;
                        }
                    }
                }

                if (this.fieldA * -1861821183 == 2) {
                    if (var1 == 8) {
                        throw new IllegalStateException();
                    }

                    var2 = this.fieldB.available();
                    if (var2 > 0) {
                        if (var1 == 8) {
                            throw new IllegalStateException();
                        }

                        if (var2 + this.fieldW * 1366282715 > this.fieldM.length) {
                            var2 = this.fieldM.length - this.fieldW * 1366282715;
                        }

                        this.fieldW += this.fieldB.read(this.fieldM, this.fieldW * 1366282715, var2) * -363478445;
                        if (this.fieldW * 1366282715 == this.fieldM.length) {
                            return this.fieldM;
                        }
                    }
                }

                return null;
            }
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "t.a(" + ')');
        }
    }
}
