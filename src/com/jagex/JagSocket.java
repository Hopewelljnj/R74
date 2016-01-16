package com.jagex;

import java.io.*;
import java.net.Socket;

public final class JagSocket implements Runnable {

    static int appletHeight;
    public static ReferenceTableSub wordpack;
    static String fieldY;

    int fieldN = 0;
    int fieldE = 0;

    boolean shuttingDown = false;
    TaskHandler handler;
    Task thisTask;
    byte[] fieldW;

    boolean writeError = false;

    Socket socket;
    InputStream in;
    OutputStream out;


    public JagSocket(Socket var1, TaskHandler var2) throws IOException {
        this.handler = var2;
        this.socket = var1;
        this.socket.setSoTimeout(30000);
        this.socket.setTcpNoDelay(true);
        this.in  = this.socket.getInputStream();
        this.out = this.socket.getOutputStream();
    }

    static void addMessage(int var0, String var1, String var2, byte var3) {
        try {
            Client.method27(var0, var1, var2, null, (short) 4096);
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "ee.v(" + ')');
        }
    }

    public void stop(int DUMMY) {
        try {
            if (!this.shuttingDown) {

                synchronized (this) {
                    this.shuttingDown = true;
                    this.notifyAll();
                }

                if (this.thisTask != null) {

                    while (this.thisTask.resultStatus == 0) {
                        classCs.fancySleep(1L);
                    }

                    if (this.thisTask.resultStatus == 1) {

                        try {
                            ((Thread) this.thisTask.result).join();
                        } catch (InterruptedException ignored) {
                        }

                    }
                }

                this.thisTask = null;
            }
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "ee.v(" + ')');
        }
    }

    @Override
    protected void finalize() {
        try {
            this.stop(163844948);
        } catch (RuntimeException var1) {
            throw ClanMate.error(var1, "ee.finalize(" + ')');
        }
    }

    public int read(int DUMMY) throws IOException {
        try {
            if (this.shuttingDown) {
                return 0;
            } else {
                return this.in.read();
            }
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "ee.i(" + ')');
        }
    }

    public int available(int DUMMY) throws IOException {
        try {
            if (this.shuttingDown) {
                return 0;
            } else {
                return this.in.available();
            }
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "ee.b(" + ')');
        }
    }

    public void read(byte[] dest, int off, int len, int DUMMY) throws IOException {
        try {
            if (!this.shuttingDown) {

                while (len > 0) {

                    int var5 = this.in.read(dest, off, len);

                    if (var5 <= 0) {
                        throw new EOFException();
                    }

                    off += var5;
                    len -= var5;

                }

            }
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "ee.l(" + ')');
        }
    }

    public void writeLater(byte[] src, int off, int len, byte DUMMY) throws IOException {
        try {
            if (!this.shuttingDown) {
                if (this.writeError) {

                        this.writeError = false;
                        throw new IOException();

                } else {

                    if (this.fieldW == null) {
                        this.fieldW = new byte[5000];
                    }

                    synchronized (this) {

                        for (int var6 = 0; var6 < len; ++var6) {
                            this.fieldW[this.fieldN * -790989777] = src[off + var6];
                            this.fieldN = (1 + this.fieldN * -790989777) % 5000 * -1309977905;
                            if (this.fieldN * -790989777 == (4900 + this.fieldE * 306288559) % 5000) {
                                throw new IOException();
                            }
                        }

                        if (this.thisTask == null) {
                            this.thisTask = this.handler.scheduleThreadTask(this, 3, 394540051);
                        }

                        this.notifyAll();
                    }
                }
            }
        } catch (RuntimeException var9) {
            throw ClanMate.error(var9, "ee.m(" + ')');
        }
    }

    @Override
    public void run() {
        try {
            while (true) {
                try {
                    int outLength;
                    int outOff;
                    label94:
                    {
                        synchronized (this) {
                            label88:
                            {
                                if (this.fieldN * -790989777 == this.fieldE * 306288559) {
                                    if (this.shuttingDown) {
                                        break label88;
                                    }

                                    try {
                                        this.wait();
                                    } catch (InterruptedException var9) {
                                        ;
                                    }
                                }

                                outOff = this.fieldE * 306288559;
                                if (this.fieldN * -790989777 >= this.fieldE * 306288559) {
                                    outLength = this.fieldN * -790989777 - this.fieldE * 306288559;
                                } else {
                                    outLength = 5000 - this.fieldE * 306288559;
                                }
                                break label94;
                            }
                        }

                        try {
                            if (this.in != null) {
                                this.in.close();
                            }

                            if (this.out != null) {
                                this.out.close();
                            }

                            if (this.socket != null) {
                                this.socket.close();
                            }
                        } catch (IOException ignored) {
                        }

                        this.fieldW = null;
                        return;
                    }

                    if (outLength > 0) {
                        try {
                            this.out.write(this.fieldW, outOff, outLength);
                        } catch (IOException var8) {
                            this.writeError = true;
                        }

                        this.fieldE = -1898176689 * ((outLength + this.fieldE * 306288559) % 5000);

                        try {
                            if (this.fieldN * -790989777 == this.fieldE * 306288559) {
                                this.out.flush();
                            }
                        } catch (IOException var7) {
                            this.writeError = true;
                        }
                    }
                } catch (Exception var11) {
                    UtilClass5.method61((String) null, var11, -765030861);
                    return;
                }
            }
        } catch (RuntimeException var12) {
            throw ClanMate.error(var12, "ee.run(" + ')');
        }
    }
}
