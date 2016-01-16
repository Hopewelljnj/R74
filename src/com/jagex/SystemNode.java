package com.jagex;

import java.awt.*;

public class SystemNode extends Node {

    int memory;
    int fieldBu;
    int operatingSystem;
    boolean processor64;
    int fieldAb;
    int operatingSystemVersion;
    int javaVendor;
    int minorJavaVersion; //1.8 -> 8, 1.7 -> 7 etc
    int minorJavaVersion0;
    int minorJavaVersion1;
    boolean fieldAm;
    int processors;
    int fieldAt;
    String fieldAc;
    String fieldAg;
    String fieldAd;
    String fieldAu;
    int fieldAk;
    int fieldAj;
    int fieldAf;
    int fieldAw;
    String fieldAp;
    int[] fieldAy = new int[3];
    String fieldAo;

    static int fieldNu;

    public SystemNode(boolean var1) {
        if (var1) {
            if (UtilClass39.fieldJ.startsWith("win")) {
                this.operatingSystem = -1181220709;
            } else if (UtilClass39.fieldJ.startsWith("mac")) {
                this.operatingSystem = 1932525878;
            } else if (UtilClass39.fieldJ.startsWith("linux")) {
                this.operatingSystem = 751305169;
            } else {
                this.operatingSystem = -429915540;
            }

            String var2;
            try {
                var2 = System.getProperty("os.arch").toLowerCase();
            } catch (Exception var11) {
                var2 = "";
            }

            String var3;
            try {
                var3 = System.getProperty("os.version").toLowerCase();
            } catch (Exception var10) {
                var3 = "";
            }

            String javaVendor = "Unknown";
            String javaVersion = "1.1";

            try {
                javaVendor = System.getProperty("java.vendor");
                javaVersion = System.getProperty("java.version");
            } catch (Exception var9) {
                ;
            }

            if (!var2.startsWith("amd64") && !var2.startsWith("x86_64")) {
                this.processor64 = false;
            } else {
                this.processor64 = true;
            }

            if (1 == this.operatingSystem * -1982339693) {
                if (var3.indexOf("4.0") != -1) {
                    this.operatingSystemVersion = -497840801;
                } else if (var3.indexOf("4.1") != -1) {
                    this.operatingSystemVersion = -995681602;
                } else if (var3.indexOf("4.9") != -1) {
                    this.operatingSystemVersion = -1493522403;
                } else if (var3.indexOf("5.0") != -1) {
                    this.operatingSystemVersion = -1991363204;
                } else if (var3.indexOf("5.1") != -1) {
                    this.operatingSystemVersion = 1805763291;
                } else if (var3.indexOf("5.2") != -1) {
                    this.operatingSystemVersion = 312240888;
                } else if (var3.indexOf("6.0") != -1) {
                    this.operatingSystemVersion = 1307922490;
                } else if (var3.indexOf("6.1") != -1) {
                    this.operatingSystemVersion = 810081689;
                } else if (var3.indexOf("6.2") != -1) {
                    this.operatingSystemVersion = -185599913;
                } else if (var3.indexOf("6.3") != -1) {
                    this.operatingSystemVersion = -683440714;
                }
            } else if (this.operatingSystem * -1982339693 == 2) {
                if (var3.indexOf("10.4") != -1) {
                    this.operatingSystemVersion = -1366881428;
                } else if (var3.indexOf("10.5") != -1) {
                    this.operatingSystemVersion = -1864722229;
                } else if (var3.indexOf("10.6") != -1) {
                    this.operatingSystemVersion = 1932404266;
                } else if (var3.indexOf("10.7") != -1) {
                    this.operatingSystemVersion = 1434563465;
                } else if (var3.indexOf("10.8") != -1) {
                    this.operatingSystemVersion = 936722664;
                } else if (var3.indexOf("10.9") != -1) {
                    this.operatingSystemVersion = 438881863;
                } else if (var3.indexOf("10.10") != -1) {
                    this.operatingSystemVersion = -58958938;
                }
            }

            if (javaVendor.toLowerCase().indexOf("sun") != -1) {
                this.javaVendor = 1871311385;
            } else if (javaVendor.toLowerCase().indexOf("microsoft") != -1) {
                this.javaVendor = -552344526;
            } else if (javaVendor.toLowerCase().indexOf("apple") != -1) {
                this.javaVendor = 1318966859;
            } else if (javaVendor.toLowerCase().indexOf("oracle") != -1) {
                this.javaVendor = 766622333;
            } else {
                this.javaVendor = -1104689052;
            }

            int var6 = 2;
            int var7 = 0;

            char var8;
            try {
                while (var6 < javaVersion.length()) {
                    var8 = javaVersion.charAt(var6);
                    if (var8 < 48 || var8 > 57) {
                        break;
                    }

                    var7 = 10 * var7 + (var8 - 48);
                    ++var6;
                }
            } catch (Exception var14) {
                ;
            }

            this.minorJavaVersion = var7 * 2103536303;
            var6 = javaVersion.indexOf(46, 2) + 1;
            var7 = 0;

            try {
                while (var6 < javaVersion.length()) {
                    var8 = javaVersion.charAt(var6);
                    if (var8 < 48 || var8 > 57) {
                        break;
                    }
                    var7 = var7 * 10 + (var8 - 48);
                    ++var6;
                }
            } catch (Exception var13) {
                ;
            }

            this.minorJavaVersion0 = var7 * -2020632401;
            var6 = javaVersion.indexOf(95, 4) + 1;
            var7 = 0;

            try {
                while (var6 < javaVersion.length()) {
                    var8 = javaVersion.charAt(var6);
                    if (var8 < 48 || var8 > 57) {
                        break;
                    }
                    var7 = var8 - 48 + 10 * var7;
                    ++var6;
                }
            } catch (Exception var12) {
                ;
            }

            this.minorJavaVersion1 = -462640879 * var7;
            this.fieldAm = false;
            this.memory = ((int) (Runtime.getRuntime().maxMemory() / 0x100000L) + 1) * -2036097195;
            if (this.minorJavaVersion * 394669135 > 3) {
                this.processors = Runtime.getRuntime().availableProcessors() * 1848405033;
            } else {
                this.processors = 0;
            }

            this.fieldAt = 0;
        }

        if (null == this.fieldAo) {
            this.fieldAo = "";
        }

        if (this.fieldAg == null) {
            this.fieldAg = "";
        }

        if (this.fieldAd == null) {
            this.fieldAd = "";
        }

        if (null == this.fieldAu) {
            this.fieldAu = "";
        }

        if (null == this.fieldAc) {
            this.fieldAc = "";
        }

        if (null == this.fieldAp) {
            this.fieldAp = "";
        }

        this.shortenStrings(-1335213838); //sets all strings to substring max 40 char
    }

    public void writeTo(Buffer var1) {
        try {
            var1.writeByte(6); //???
            var1.writeByte(this.operatingSystem * -1982339693); //write what operating system u have
            var1.writeByte(this.processor64 ? 1 : 0); //write byte telling if 64 bit or not
            var1.writeByte(this.operatingSystemVersion * 530583199); //version
            var1.writeByte(this.javaVendor * 972376617); //java vendor
            var1.writeByte(this.minorJavaVersion * 394669135); //minor java version info, 1.8 -> 8, 1.7 -> 7 etc
            var1.writeByte(this.minorJavaVersion0 * 2047000143); //seems like same thing idk, cbf to check
            var1.writeByte(this.minorJavaVersion1 * 2059364337); //^
            var1.writeByte(this.fieldAm ? 1 : 0); //this boolean is always false
            var1.writeShort(this.memory * 313746941); //(Runtime.getRuntime().maxMemory() / 0x100000L) + 1
            var1.writeByte(this.processors * -1366560743); //num of available processors
            var1.i(this.fieldAt * 1506319163); //always 0, irrelevant
            var1.writeShort(this.fieldAw * 1807625411); //never set
            var1.writeStringSpecial(this.fieldAo); //always ""
            var1.writeStringSpecial(this.fieldAg); //always ""
            var1.writeStringSpecial(this.fieldAd); //always ""
            var1.writeStringSpecial(this.fieldAu); //always ""
            var1.writeByte(this.fieldAj * 309362231); //never set
            var1.writeShort(this.fieldAk * -2079383941); //never set
            var1.writeStringSpecial(this.fieldAc); //always ""
            var1.writeStringSpecial(this.fieldAp); //always ""
            var1.writeByte(this.fieldAf * -1883764267); //never set
            var1.writeByte(this.fieldAb * -2070556971); //never set
            for (int var3 = 0; var3 < this.fieldAy.length; ++var3) { //the values in fieldAy array are never set?
                var1.writeInt(this.fieldAy[var3]);
            }
            var1.writeInt(this.fieldBu * -755055041); //never set
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "ed.v(" + ')');
        }
    }

    public int getBufferSize() {
        try {
            byte thirtyEightWOW = 38;
            int var4 = thirtyEightWOW + Renderable.getStringLengthPlusTwo(this.fieldAo);
            var4 += Renderable.getStringLengthPlusTwo(this.fieldAg);
            var4 += Renderable.getStringLengthPlusTwo(this.fieldAd);
            var4 += Renderable.getStringLengthPlusTwo(this.fieldAu);
            var4 += Renderable.getStringLengthPlusTwo(this.fieldAc);
            var4 += Renderable.getStringLengthPlusTwo(this.fieldAp);
            return var4;
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "ed.i(" + ')');
        }
    }

    void shortenStrings(int var1) {
        try {
            if (this.fieldAo.length() > 40) {
                this.fieldAo = this.fieldAo.substring(0, 40);
            }
            if (this.fieldAg.length() > 40) {
                this.fieldAg = this.fieldAg.substring(0, 40);
            }
            if (this.fieldAd.length() > 10) {
                this.fieldAd = this.fieldAd.substring(0, 10);
            }
            if (this.fieldAu.length() > 10) {
                this.fieldAu = this.fieldAu.substring(0, 10);
            }
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "ed.a(" + ')');
        }
    }

    static final void method60(int var0) {
        try {
            int var1 = WidgetStrings.fieldIf * -856693505;
            int var2 = UtilClass27.fieldIw * -1766645199;
            int var3 = UtilClass41.fieldIs * 55630027;
            int var4 = BoundaryDecoration.fieldIv * 183606305;
            int var5 = 6116423;
            RSGraphics.method235(var1, var2, var3, var4, var5);
            RSGraphics.method235(var1 + 1, 1 + var2, var3 - 2, 16, 0);
            RSGraphics.drawRectangle(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
            com.jagex.MenuItem.font_b12full.n(StringConstants.CHOOSE_OPTION, 3 + var1, 14 + var2, var5, -1);
            int var6 = Mouse.fieldW * 518596439;
            int var7 = Mouse.fieldE * 1747296693;

            for (int var8 = 0; var8 < Client.menuRowCount * 445599935; ++var8) {
                if (var0 <= 979665049) {
                    throw new IllegalStateException();
                }

                int var9 = (Client.menuRowCount * 445599935 - 1 - var8) * 15 + 31 + var2;
                int var10 = 16777215;
                if (var6 > var1) {
                    if (var0 <= 979665049) {
                        throw new IllegalStateException();
                    }

                    if (var6 < var1 + var3) {
                        if (var0 <= 979665049) {
                            throw new IllegalStateException();
                        }

                        if (var7 > var9 - 13 && var7 < 3 + var9) {
                            if (var0 <= 979665049) {
                                throw new IllegalStateException();
                            }

                            var10 = 16776960;
                        }
                    }
                }

                classGm var11 = com.jagex.MenuItem.font_b12full;
                String var12;
                if (Client.menuNouns[var8].length() > 0) {
                    if (var0 <= 979665049) {
                        throw new IllegalStateException();
                    }

                    var12 = Client.menuOptions[var8] + StringConstants.fieldFo + Client.menuNouns[var8];
                } else {
                    var12 = Client.menuOptions[var8];
                }

                var11.n(var12, var1 + 3, var9, var10, 0);

                com.jagex.MenuItem.font_b12full.n("<shad=" + Color.RED.getRGB() + "><col=ffff00>yoloswag123", 50, 50, Color.RED.getRGB(), -1);
                com.jagex.MenuItem.font_b12full.x("Testingswag123", 50, 95, Color.GREEN.getRGB(), 20, 0);
                com.jagex.MenuItem.font_b12full.n("Hiiiiii", 50, 65, Color.RED.getRGB(), -2);
                com.jagex.MenuItem.font_b12full.n("Hiiiiii", 50, 80, Color.RED.getRGB(), -30);
            }

            classCs.method303(WidgetStrings.fieldIf * -856693505, UtilClass27.fieldIw * -1766645199, UtilClass41.fieldIs * 55630027, BoundaryDecoration.fieldIv * 183606305, -1368822743);
        } catch (RuntimeException var13) {
            throw ClanMate.error(var13, "ed.bb(" + ')');
        }
    }
}
