package com.jagex;

import java.awt.*;
import java.awt.image.ImageObserver;

public final class classM {

    static final int[] fieldJ = new int[]{16, 32, 64, 128};
    static final int[] fieldU = new int[]{1, 2, 4, 8};
    static final int[] XScalar = new int[]{1, 0, -1, 0};
    static final int[] YScalar = new int[]{0, -1, 0, 1};
    static final int[] DiagXScalar = new int[]{1, -1, -1, 1};
    static final int[] DiagYScalar = new int[]{-1, -1, 1, 1};
    static int fieldZ = ((int) (Math.random() * 17.0D) - 8) * 13476519;
    static byte[][][] renderRules = new byte[4][104][104];
    static int fieldC = ((int) (Math.random() * 33.0D) - 16) * -791528103;
    static byte[][][] fieldM;
    static byte[][][] fieldW;
    static int[] fieldS;
    static int[] fieldK;
    static JagSocket fieldAk;
    static int[] fieldD;
    static int fieldI = -1080110107;
    static byte[][][] fieldB;
    static int[][][] tileHeights = new int[4][105][105];
    public static ReferenceTableSub fieldBe;
    static int[] fieldF;


    classM() throws Throwable {
        throw new Error();
    }

    static boolean method128(String var0, boolean var1, int var2) {
        try {
            if (null == var0) {
                return false;
            } else {
                String var3 = CalendarUtil.method297(var0, UtilClass38.fieldS, -203123161);
                int var4 = 0;

                while (true) {
                    if (var4 >= Client.chosenFriendIndex * 1960973713) {
                        return var3.equalsIgnoreCase(CalendarUtil.method297(Client.myPlayer.name, UtilClass38.fieldS, -1100902738));
                    }
                    if (var3.equalsIgnoreCase(CalendarUtil.method297(Client.friendedPlayers[var4].displayName, UtilClass38.fieldS, -224691237))) {
                        if (!var1 || -1774843337 * Client.friendedPlayers[var4].world != 0) {
                            break;
                        }
                    }

                    ++var4;
                }

                return true;
            }
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "m.do(" + ')');
        }
    }

    static final void method129(int var0, byte var1) {
        try {
            if (!Widget.loadWidget(var0, 477596194)) {
                if (var1 != 0) {
                    ;
                }
            } else {
                Widget[] var2 = Widget.widgets[var0];

                for (int var3 = 0; var3 < var2.length; ++var3) {
                    if (var1 == 0) {
                        throw new IllegalStateException();
                    }

                    Widget var4 = var2[var3];
                    if (null == var4) {
                        if (var1 == 0) {
                            throw new IllegalStateException();
                        }
                    } else {
                        var4.fieldDs = 0;
                        var4.fieldDc = 0;
                    }
                }

            }
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "m.cm(" + ')');
        }
    }

    static final int method130(int var0, int var1, int var2) {
        try {
            if (var0 == -2) {
                if (var2 <= -680182985) {
                    throw new IllegalStateException();
                } else {
                    return 12345678;
                }
            } else if (-1 == var0) {
                if (var2 <= -680182985) {
                    throw new IllegalStateException();
                } else {
                    if (var1 < 2) {
                        if (var2 <= -680182985) {
                            throw new IllegalStateException();
                        }

                        var1 = 2;
                    } else if (var1 > 126) {
                        if (var2 <= -680182985) {
                            throw new IllegalStateException();
                        }

                        var1 = 126;
                    }

                    return var1;
                }
            } else {
                var1 = var1 * (var0 & 127) / 128;
                if (var1 < 2) {
                    var1 = 2;
                } else if (var1 > 126) {
                    var1 = 126;
                }

                return var1 + (var0 & '\uff80');
            }
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "m.o(" + ')');
        }
    }

    protected static final void method131(int var0, String var1, Color var2, int var3) {
        try {
            try {
                Graphics var4 = UtilClass22.canvas.getGraphics();
                if (null == GraphicsStub.fieldPg) {
                    GraphicsStub.fieldPg = new Font("Helvetica", 1, 13);
                    classEv.fieldBf = UtilClass22.canvas.getFontMetrics(GraphicsStub.fieldPg);
                }

                if (GameEngine.fieldPp) {
                    if (var3 == 445599935) {
                        throw new IllegalStateException();
                    }

                    GameEngine.fieldPp = false;
                    var4.setColor(Color.black);
                    var4.fillRect(0, 0, AnimationSequence.appletWidth * -1001124729, JagSocket.appletHeight * -1084304327);
                }

                if (null == var2) {
                    if (var3 == 445599935) {
                        return;
                    }

                    var2 = new Color(140, 17, 17);
                }

                try {
                    if (null == Player.fieldPq) {
                        Player.fieldPq = UtilClass22.canvas.createImage(304, 34);
                    }

                    Graphics var5 = Player.fieldPq.getGraphics();
                    var5.setColor(var2);
                    var5.drawRect(0, 0, 303, 33);
                    var5.fillRect(2, 2, var0 * 3, 30);
                    var5.setColor(Color.black);
                    var5.drawRect(1, 1, 301, 31);
                    var5.fillRect(2 + var0 * 3, 2, 300 - 3 * var0, 30);
                    var5.setFont(GraphicsStub.fieldPg);
                    var5.setColor(Color.white);
                    var5.drawString(var1, (304 - classEv.fieldBf.stringWidth(var1)) / 2, 22);
                    var4.drawImage(Player.fieldPq, AnimationSequence.appletWidth * -1001124729 / 2 - 152, JagSocket.appletHeight * -1084304327 / 2 - 18, (ImageObserver) null);
                } catch (Exception var8) {
                    int var6 = AnimationSequence.appletWidth * -1001124729 / 2 - 152;
                    int var7 = JagSocket.appletHeight * -1084304327 / 2 - 18;
                    var4.setColor(var2);
                    var4.drawRect(var6, var7, 303, 33);
                    var4.fillRect(var6 + 2, 2 + var7, 3 * var0, 30);
                    var4.setColor(Color.black);
                    var4.drawRect(var6 + 1, 1 + var7, 301, 31);
                    var4.fillRect(3 * var0 + var6 + 2, 2 + var7, 300 - var0 * 3, 30);
                    var4.setFont(GraphicsStub.fieldPg);
                    var4.setColor(Color.white);
                    var4.drawString(var1, var6 + (304 - classEv.fieldBf.stringWidth(var1)) / 2, 22 + var7);
                }
            } catch (Exception var9) {
                UtilClass22.canvas.repaint();
            }

        } catch (RuntimeException var10) {
            throw ClanMate.error(var10, "m.pi(" + ')');
        }
    }

    public static int method132(byte[] var0, int var1, CharSequence var2, byte var3) {
        try {
            int var4 = var2.length();
            int var5 = var1;

            for (int var6 = 0; var6 < var4; ++var6) {
                char var7 = var2.charAt(var6);
                if (var7 <= 127) {
                    if (var3 >= 122) {
                        throw new IllegalStateException();
                    }

                    var0[var5++] = (byte) var7;
                } else if (var7 <= 2047) {
                    if (var3 >= 122) {
                        throw new IllegalStateException();
                    }

                    var0[var5++] = (byte) (192 | var7 >> 6);
                    var0[var5++] = (byte) (128 | var7 & 63);
                } else {
                    var0[var5++] = (byte) (224 | var7 >> 12);
                    var0[var5++] = (byte) (128 | var7 >> 6 & 63);
                    var0[var5++] = (byte) (128 | var7 & 63);
                }
            }

            return var5 - var1;
        } catch (RuntimeException var8) {
            throw ClanMate.error(var8, "m.a(" + ')');
        }
    }

    public static Sprite method133(ReferenceTable var0, String var1, String var2, byte var3) {
        try {
            int var4 = var0.h(var1, 1999374313);
            int var5 = var0.u(var4, var2, -1798482263);
            return classBt.method256(var0, var4, var5, 1324682867);
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "m.e(" + ')');
        }
    }
}
