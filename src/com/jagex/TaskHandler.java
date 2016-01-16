package com.jagex;

import java.applet.Applet;
import java.awt.*;
import java.io.DataInputStream;
import java.net.*;
import java.util.Arrays;

public class TaskHandler implements Runnable {

    public static final int TASK_SOCKET = 1;
    public static final int TASK_THREAD = 2;
    public static final int TASK_INET = 3;
    public static final int TASK_DISTREAM = 4;

    public static String JAVA_VENDOR;
    static String JAVA_VERSION;
    static CompressedImage[] scollbars;
    static Sprite mapedge;

    classAf fieldI;

    Thread thisThreadWorker;
    boolean shuttingDown = false;
    EventQueue sysEventQueue;
    Task fieldB = null;
    Task currentTask = null;


    static {
        JAVA_VENDOR = "Unknown";
        JAVA_VERSION = "1.1";
        try {
            JAVA_VENDOR = System.getProperty("java.vendor");
            JAVA_VERSION = System.getProperty("java.version");
        } catch (Exception ignored) {
        }
    }

    TaskHandler() {
        try {
            this.sysEventQueue = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable ignored) {
        }

        this.shuttingDown = false;
        this.thisThreadWorker = new Thread(this);
        this.thisThreadWorker.setPriority(Thread.MAX_PRIORITY);
        this.thisThreadWorker.setDaemon(true);
        this.thisThreadWorker.start();

    }

    final void stop(byte var1) {
        try {
            synchronized (this) {
                this.shuttingDown = true;
                this.notifyAll();
            }

            try {
                this.thisThreadWorker.join();
            } catch (InterruptedException var4) {
                ;
            }

        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "db.v(" + ')');
        }
    }

    @Override
    public final void run() {
        try {
            while (true) {
                Task var1;
                synchronized (this) {
                    while (true) {
                        if (this.shuttingDown) {
                            return;
                        }
                        if (this.fieldB != null) {
                            var1 = this.fieldB;
                            this.fieldB = this.fieldB.next;
                            if (null == this.fieldB) {
                                this.currentTask = null;
                            }
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException ignored) {
                        }
                    }
                }

                try {
                    int taskId = var1.taskId * -487620789;
                    if (1 == taskId) {
                        var1.result = new Socket(InetAddress.getByName((String) var1.target), var1.intArg);
                    } else if (2 == taskId) {
                        Thread var3 = new Thread((Runnable) var1.target);
                        var3.setDaemon(true);
                        var3.start();
                        var3.setPriority(var1.intArg);
                        var1.result = var3;
                    } else if (4 == taskId) {
                        var1.result = new DataInputStream(((URL) var1.target).openStream());
                    } else if (3 == taskId) {
                        String var10 = (var1.intArg >> 24 & 255) + "." + (var1.intArg >> 16 & 255) + "." + (var1.intArg >> 8 & 255) + "." + (var1.intArg & 255);
                        var1.result = InetAddress.getByName(var10).getHostName();
                    }

                    var1.resultStatus = 1;
                } catch (ThreadDeath var5) {
                    throw var5;
                } catch (Throwable var6) {
                    var1.resultStatus = 2;
                }

            }
        } catch (RuntimeException var9) {
            throw ClanMate.error(var9, "db.run(" + ')');
        }
    }

    public final classAf e(int var1) {
        try {
            return this.fieldI;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "db.e(" + ')');
        }
    }

    final Task schedule(int taskId, int intArg, int var3, Object target, int var5) {
        try {
            Task var6 = new Task();
            var6.taskId = 565940835 * taskId;
            var6.intArg = intArg;
            var6.target = target;
            synchronized (this) {
                if (null != this.currentTask) {
                    this.currentTask.next = var6;
                    this.currentTask = var6;
                } else {
                    this.currentTask = this.fieldB = var6;
                }
                this.notify();
                return var6;

            }
        } catch (RuntimeException var10) {
            throw ClanMate.error(var10, "db.i(" + ')');
        }
    }

    public final Task scheduleSocketTask(String host, int port, byte var3) {
        try {
            return this.schedule(1, port, 0, host, 2142817354);
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "db.b(" + ')');
        }
    }

    public final Task scheduleThreadTask(Runnable targetRunnable, int priority, int var3) {
        try {
            return this.schedule(2, priority, 0, targetRunnable, 1874720215);
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "db.l(" + ')');
        }
    }

    public final Task scheduleINetTask(int targetIp, byte var2) {
        try {
            return this.schedule(3, targetIp, 0, (Object) null, -700962918);
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "db.m(" + ')');
        }
    }

    public final Task scheduleDataInputSteamTask(URL targetUrl, int var2) {
        try {
            return this.schedule(4, 0, 0, targetUrl, 811096045);
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "db.w(" + ')');
        }
    }

    static boolean method277(String var0, int var1, String var2, byte var3) {
        try {
            if (var1 == 0) {
                try {
                    if (!UtilClass5.fieldV.startsWith("win")) {
                        throw new Exception();
                    } else {
                        if (!var0.startsWith("http://")) {
                            if (!var0.startsWith("https://")) {
                                throw new Exception();
                            }
                        }
                        String var14 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        for (int var15 = 0; var15 < var0.length(); ++var15) {
                            if (var14.indexOf(var0.charAt(var15)) == -1) {
                                throw new Exception();
                            }
                        }

                        Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
                        return true;
                    }
                } catch (Throwable var8) {
                    return false;
                }
            } else if (1 == var1) {
                try {
                    Applet var5 = UtilClass5.fieldA;
                    Object[] var6 = new Object[]{(new URL(UtilClass5.fieldA.getCodeBase(), var0)).toString()};
                    if (true) throw new Error(var2 + "," + Arrays.toString(var6));
                    Object var4 = null;// JSObject.getWindow(var5).call(var2, var6);
                    return var4 != null;
                } catch (Throwable var9) {
                    return false;
                }
            } else if (2 == var1) {
                try {
                    UtilClass5.fieldA.getAppletContext().showDocument(new URL(UtilClass5.fieldA.getCodeBase(), var0), "_blank");
                    return true;
                } catch (Exception var10) {
                    return false;
                }
            } else if (var1 == 3) {
                try {
                    JSObjectUtil.call(UtilClass5.fieldA, "loggedout", (byte) 1);
                } catch (Throwable var12) {
                    var12.printStackTrace();
                    ;
                }
                try {
                    UtilClass5.fieldA.getAppletContext().showDocument(new URL(UtilClass5.fieldA.getCodeBase(), var0), "_top");
                    return true;
                } catch (Exception var11) {
                    return false;
                }
            } else {
                throw new IllegalArgumentException();
            }
        } catch (RuntimeException var13) {
            throw ClanMate.error(var13, "db.l(" + ')');
        }
    }

    static void method278(int var0) {
        try {
            for (classG var1 = (classG) classG.fieldA.next(); null != var1; var1 = (classG) classG.fieldA.tail()) {
                if (var1.fieldN != null) {
                    Client.fieldNn.v(var1.fieldN);
                    var1.fieldN = null;
                }
                if (var1.fieldX != null) {
                    Client.fieldNn.v(var1.fieldX);
                    var1.fieldX = null;
                }
            }
            classG.fieldA.clear();
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "db.a(" + ')');
        }
    }

    public static boolean method279(char var0, byte var1) {
        try {
            if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) {
                return true;
            }
            if (0 != var0) {
                char[] var2 = UtilClass33.fieldA;
                for (int var3 = 0; var3 < var2.length; ++var3) {
                    char var4 = var2[var3];
                    if (var0 == var4) {
                        return true;
                    }
                }
            }
            return false;
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "db.v(" + ')');
        }
    }
}
