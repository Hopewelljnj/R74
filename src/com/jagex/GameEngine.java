package com.jagex;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {

    protected static long[] fieldPx = new long[32];
    protected static long[] fieldPw = new long[32];
    protected static volatile boolean fieldPp = true;
    protected static int fps = 0;
    protected static volatile boolean fieldPm = false;
    static int fieldPo = 1981225964;
    static int loadingState = 0;
    static long fieldPj = 0L;
    static GameEngine engine = null;
    static int fieldPy = -493716948;
    static volatile long fieldQj = 0L;
    static int fieldPn = 1650718483;
    static boolean fieldPf = false;
    static volatile boolean focused = true;
    boolean fieldPs = false;

    static RuneScript getRuneScript(int var0, int var1) {
        try {
            RuneScript var2 = (RuneScript) RuneScript.cache.get((long) var0);
            if (var2 != null) {
                return var2;
            } else {
                byte[] var3 = Client.runescripts.getFile(var0, 0, (short) 2377);
                if (null == var3) {
                    return null;
                } else {
                    var2 = new RuneScript();
                    Buffer var4 = new Buffer(var3);
                    var4.caret = -99503879 * (var4.payload.length - 12);
                    int var5 = var4.readInt((byte) -46);
                    var2.intStackMax = var4.readUShort() * 1792272365;
                    var2.stringStackMax = var4.readUShort() * -2097078149;
                    var2.intArgGround = var4.readUShort() * -681983851;
                    var2.stringArgCount = var4.readUShort() * 1560408467;
                    var4.caret = 0;
                    var4.r((short) -8686);
                    var2.opcodes = new int[var5];
                    var2.intOperands = new int[var5];
                    var2.stringOperands = new String[var5];

                    int var7;
                    for (int var6 = 0; var4.caret * 651432265 < var4.payload.length - 12; var2.opcodes[var6++] = var7) {
                        var7 = var4.readUShort();
                        if (3 == var7) {
                            var2.stringOperands[var6] = var4.readString(1983471721);
                        } else {
                            if (var7 < 100 && var7 != 21 && var7 != 38 && 39 != var7) {
                                var2.intOperands[var6] = var4.readInt((byte) -5);
                                continue;
                            }
                            var2.intOperands[var6] = var4.readUByte();
                        }
                    }
                    RuneScript.cache.put(var2, (long) var0);
                    return var2;
                }
            }
        } catch (RuntimeException var8) {
            throw ClanMate.error(var8, "eq.a(" + ')');
        }
    }

    public static void method197(ReferenceTable var0, byte var1) {
        try {
            classAi.fieldA = var0;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "eq.a(" + ')');
        }
    }

    protected final void load(int width, int height, int revision, int dummy) {
        try {
            try {
                if (null != engine) {
                    loadingState += 903255843;
                    if (loadingState * -1169469301 >= 3) {
                        this.criticalError("alreadyloaded", 1062454508);
                        return;
                    }
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                    return;
                }
                engine = this;
                AnimationSequence.appletWidth = width * -2102462153;
                JagSocket.appletHeight = height * -1065166327;
                AbstractByteBuffer.revision = revision * -596360029;
                RSException.applet = this;
                if (classBq.globalTaskSchedular == null) {
                    classBq.globalTaskSchedular = new TaskHandler();
                }
                classBq.globalTaskSchedular.scheduleThreadTask(this, 1, 1538254441);
            } catch (Exception var6) {
                UtilClass5.method61(null, var6, -765030861);
                this.criticalError("crash", 1062454508);
            }

        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "eq.pc(" + ')');
        }
    }

    protected final synchronized void pb(byte var1) {
        try {
            Object var2 = Mouse.fieldPu;
            if (UtilClass22.canvas != null) {
                UtilClass22.canvas.removeFocusListener(this);
                ((Container) var2).remove(UtilClass22.canvas);
            }

            UtilClass22.canvas = new classDm(this);
            ((Container) var2).add(UtilClass22.canvas);
            UtilClass22.canvas.setSize(AnimationSequence.appletWidth * -1001124729, JagSocket.appletHeight * -1084304327);
            UtilClass22.canvas.setVisible(true);
            if (null != Mouse.fieldPu) {
                Insets var3 = Mouse.fieldPu.getInsets();
                UtilClass22.canvas.setLocation(var3.left, var3.top);
            } else {
                UtilClass22.canvas.setLocation(0, 0);
            }

            UtilClass22.canvas.addFocusListener(this);
            UtilClass22.canvas.requestFocus();
            fieldPp = true;
            fieldPm = false;
            fieldQj = classDz.getFancyTime(1568277496) * -3515616362347705043L;
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "eq.pb(" + ')');
        }
    }

    @Override
    public void run() {
        try {
            try {
                int var3;
                if (TaskHandler.JAVA_VENDOR != null) {
                    String var1 = TaskHandler.JAVA_VENDOR.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = TaskHandler.JAVA_VERSION;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                            this.criticalError("wrongjava", 1062454508);
                            return;
                        }

                        if (var2.startsWith("1.6.0_")) {
                            for (var3 = 6; var3 < var2.length() && classFm.method10(var2.charAt(var3), (byte) -26); ++var3) {
                                ;
                            }

                            String var4 = var2.substring(6, var3);
                            if (ClanMate.method195(var4, -1029379895) && classCs.method305(var4, 618397045) < 10) {
                                this.criticalError("wrongjava", 1062454508);
                                return;
                            }
                        }

                        fieldPn = -336342177;
                    }
                }

                this.setFocusCycleRoot(true);
                this.pb((byte) 103);
                int var11 = AnimationSequence.appletWidth * -1001124729;
                var3 = JagSocket.appletHeight * -1084304327;
                Canvas var12 = UtilClass22.canvas;

                Object var10;
                try {
                    classBh var5 = new classBh();
                    var5.a(var11, var3, var12, (byte) -25);
                    var10 = var5;
                } catch (Throwable var7) {
                    classBx var6 = new classBx();
                    var6.a(var11, var3, var12, (byte) -47);
                    var10 = var6;
                }

                Projectile.fieldPt = (classBq) var10;
                this.b((short) -5915);
                UtilClass5.fieldPk = ItemTable.method202(-1584250371);

                while (8671186395570307547L * fieldPj == 0L || classDz.getFancyTime(595504927) < fieldPj * 8671186395570307547L) {
                    classDz.fieldPe = UtilClass5.fieldPk.i(fieldPo * 837985535, fieldPn * -1039111397, 1070321901) * 1182188545;

                    for (int var13 = 0; var13 < classDz.fieldPe * -1080476671; ++var13) {
                        this.pg((byte) -72);
                    }

                    this.pt((byte) 8);
                    classCs.method302(classBq.globalTaskSchedular, UtilClass22.canvas, 1367256486);
                }
            } catch (Exception var8) {
                UtilClass5.method61((String) null, var8, -765030861);
                this.criticalError("crash", 1062454508);
            }

            this.pu(-1945379912);
        } catch (RuntimeException var9) {
            throw ClanMate.error(var9, "eq.run(" + ')');
        }
    }

    void pt(byte var1) {
        try {
            long var2 = classDz.getFancyTime(2016645803);
            long var4 = fieldPx[GroundItem.fieldPr * 302335189];
            fieldPx[GroundItem.fieldPr * 302335189] = var2;
            GroundItem.fieldPr = -147204995 * (1 + GroundItem.fieldPr * 302335189 & 31);
            if (0L != var4) {
                if (var1 != 8) {
                    throw new IllegalStateException();
                }

                if (var2 > var4) {
                    int var6 = (int) (var2 - var4);
                    fps = ((var6 >> 1) + 32000) / var6 * 1122794927;
                }
            }

            if ((fieldPy += -104066649) * 315328023 - 1 > 50) {
                if (var1 != 8) {
                    return;
                }

                fieldPy -= -908365154;
                fieldPp = true;
                UtilClass22.canvas.setSize(AnimationSequence.appletWidth * -1001124729, JagSocket.appletHeight * -1084304327);
                UtilClass22.canvas.setVisible(true);
                if (Mouse.fieldPu != null) {
                    Insets var8 = Mouse.fieldPu.getInsets();
                    UtilClass22.canvas.setLocation(var8.left, var8.top);
                } else {
                    UtilClass22.canvas.setLocation(0, 0);
                }
            }

            this.m((byte) -18);
        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "eq.pt(" + ')');
        }
    }

    final synchronized void pu(int var1) {
        try {
            if (!fieldPf) {

                fieldPf = true;

                try {
                    UtilClass22.canvas.removeFocusListener(this);
                } catch (Exception var6) {
                }

                try {
                    this.w(2121872480);
                } catch (Exception var5) {
                }

                if (Mouse.fieldPu != null) {
                    try {
                        System.exit(0);
                    } catch (Throwable var4) {
                    }
                }

                if (classBq.globalTaskSchedular != null) {
                    try {
                        classBq.globalTaskSchedular.stop((byte) 104);
                    } catch (Exception var3) {
                    }
                }

                this.v(162971387);
            }
        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "eq.pu(" + ')');
        }
    }

    @Override
    public void start() {
        try {
            if (this == engine && !fieldPf) {
                fieldPj = 0L;
            }
        } catch (RuntimeException var1) {
            throw ClanMate.error(var1, "eq.start(" + ')');
        }
    }

    @Override
    public void destroy() {
        try {
            if (this == engine && !fieldPf) {
                fieldPj = classDz.getFancyTime(513566945) * -2650360929898261933L;
                classCs.fancySleep(5000L);
                this.pu(-1941167212);
            }
        } catch (RuntimeException var1) {
            throw ClanMate.error(var1, "eq.destroy(" + ')');
        }
    }

    @Override
    public final void focusGained(FocusEvent var1) {
        try {
            focused = true;
            fieldPp = true;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "eq.focusGained(" + ')');
        }
    }

    @Override
    public final void focusLost(FocusEvent var1) {
        try {
            focused = false;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "eq.focusLost(" + ')');
        }
    }

    @Override
    public final void windowActivated(WindowEvent var1) {
        try {
            ;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "eq.windowActivated(" + ')');
        }
    }

    protected abstract void w(int var1);

    @Override
    public final void windowClosing(WindowEvent var1) {
        try {
            this.destroy();
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "eq.windowClosing(" + ')');
        }
    }

    @Override
    public final void windowDeiconified(WindowEvent var1) {
        try {
            ;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "eq.windowDeiconified(" + ')');
        }
    }

    @Override
    public final void windowIconified(WindowEvent var1) {
        try {
            ;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "eq.windowIconified(" + ')');
        }
    }

    protected abstract void l(int var1);

    protected abstract void m(byte var1);

    @Override
    public void stop() {
        try {
            if (this == engine && !fieldPf) {
                fieldPj = (classDz.getFancyTime(723159667) + 4000L) * -2650360929898261933L;
            }
        } catch (RuntimeException var1) {
            throw ClanMate.error(var1, "eq.stop(" + ')');
        }
    }

    protected void criticalError(String message, int dummy) {
        try {
            if (!this.fieldPs) {
                this.fieldPs = true;
                System.out.println("error_game_" + message);
                try {
                    this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + message + ".ws"), "_self");
                } catch (Exception var4) {
                }
            }
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "eq.pq(" + ')');
        }
    }

    protected abstract void v(int var1);

    protected abstract void b(short var1);

    protected final boolean pz(int var1) {
        try {
            String var2 = this.getDocumentBase().getHost().toLowerCase();
            if (var2.equals("127.0.0.1"))
                return true;
            if (!var2.equals("jagex.com") && !var2.endsWith(".jagex.com")) {
                if (!var2.equals("runescape.com") && !var2.endsWith(".runescape.com")) {
                    if (!var2.equals("mechscape.com") && !var2.endsWith(".mechscape.com")) {
                        while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= 48 && var2.charAt(var2.length() - 1) <= 57) {
                            var2 = var2.substring(0, var2.length() - 1);
                        }
                        if (var2.endsWith("192.168.1.")) {
                            return true;
                        }
                        this.criticalError("invalidhost", 1062454508);
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return false;
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "eq.pz(" + ')');
        }
    }

    @Override
    public final synchronized void paint(Graphics var1) {
        try {
            if (this == engine && !fieldPf) {
                fieldPp = true;
                if (TaskHandler.JAVA_VERSION != null && TaskHandler.JAVA_VERSION.startsWith("1.5") && classDz.getFancyTime(2015136842) - fieldQj * 3073004849006250661L > 1000L) {
                    Rectangle var2 = var1.getClipBounds();
                    if (null == var2 || var2.width >= AnimationSequence.appletWidth * -1001124729 && var2.height >= JagSocket.appletHeight * -1084304327) {
                        fieldPm = true;
                    }
                }

            }
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "eq.paint(" + ')');
        }
    }

    @Override
    public abstract void init();

    @Override
    public final void windowClosed(WindowEvent var1) {
        try {
            ;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "eq.windowClosed(" + ')');
        }
    }

    @Override
    public final void windowDeactivated(WindowEvent var1) {
        try {
            ;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "eq.windowDeactivated(" + ')');
        }
    }

    @Override
    public final void windowOpened(WindowEvent var1) {
        try {
            ;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "eq.windowOpened(" + ')');
        }
    }

    @Override
    public final void update(Graphics var1) {
        try {
            this.paint(var1);
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "eq.update(" + ')');
        }
    }

    void pg(byte var1) {
        try {
            long var2 = classDz.getFancyTime(1851870336);
            long var4 = fieldPw[com.jagex.MenuItem.fieldPc * 1703828073];
            fieldPw[com.jagex.MenuItem.fieldPc * 1703828073] = var2;
            com.jagex.MenuItem.fieldPc = -188951079 * (1 + com.jagex.MenuItem.fieldPc * 1703828073 & 31);
            if (0L != var4 && var2 > var4 && var1 == 0) {
                throw new IllegalStateException();
            }
            synchronized (this) {
                ScriptStackElement.fieldQg = focused;
            }

            this.l(-31902509);
        } catch (RuntimeException var9) {
            throw ClanMate.error(var9, "eq.pg(" + ')');
        }
    }
}
