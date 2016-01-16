package com.jagex;

public class IgnoredPlayer {

    static int[] fieldB;
    static int[] fieldP;
    String previousName;
    String displayName;


    static final void method94(int var0, short var1) {
        try {
            EntityMarker.method330(1803308586);
            UtilClass10.method78(1598248184);
            int var2 = UtilClass10.getVarp(var0, -1789321632).fieldB * -1395656497;
            if (0 == var2) {
                if (var1 > 128) {
                    ;
                }
            } else {
                int var3 = UtilClass27.vars[var0];
                if (1 == var2) {
                    if (var1 <= 128) {
                        throw new IllegalStateException();
                    }

                    if (1 == var3) {
                        if (var1 <= 128) {
                            throw new IllegalStateException();
                        }

                        RSGraphics2D.method308(0.9D);
                        ((TextureManagerImpl) RSGraphics2D.fieldAs).x(0.9D);
                    }

                    if (2 == var3) {
                        if (var1 <= 128) {
                            return;
                        }

                        RSGraphics2D.method308(0.8D);
                        ((TextureManagerImpl) RSGraphics2D.fieldAs).x(0.8D);
                    }

                    if (3 == var3) {
                        RSGraphics2D.method308(0.7D);
                        ((TextureManagerImpl) RSGraphics2D.fieldAs).x(0.7D);
                    }

                    if (4 == var3) {
                        if (var1 <= 128) {
                            return;
                        }

                        RSGraphics2D.method308(0.6D);
                        ((TextureManagerImpl) RSGraphics2D.fieldAs).x(0.6D);
                    }

                    ItemDefinition.spriteCache.clear();
                }

                if (var2 == 3) {
                    if (var1 <= 128) {
                        throw new IllegalStateException();
                    }

                    short var4 = 0;
                    if (var3 == 0) {
                        if (var1 <= 128) {
                            throw new IllegalStateException();
                        }

                        var4 = 255;
                    }

                    if (var3 == 1) {
                        if (var1 <= 128) {
                            throw new IllegalStateException();
                        }

                        var4 = 192;
                    }

                    if (2 == var3) {
                        var4 = 128;
                    }

                    if (3 == var3) {
                        if (var1 <= 128) {
                            return;
                        }

                        var4 = 64;
                    }

                    if (var3 == 4) {
                        if (var1 <= 128) {
                            throw new IllegalStateException();
                        }

                        var4 = 0;
                    }

                    if (Client.fieldMh * 895565207 != var4) {
                        label266:
                        {
                            if (0 == Client.fieldMh * 895565207) {
                                if (var1 <= 128) {
                                    throw new IllegalStateException();
                                }

                                if (-1 != Client.fieldMx * -1477729045) {
                                    if (var1 <= 128) {
                                        throw new IllegalStateException();
                                    }

                                    UtilClass40.method171(classT.fieldBs, Client.fieldMx * -1477729045, 0, var4, false, -911580244);
                                    Client.fieldMv = false;
                                    break label266;
                                }
                            }

                            if (0 == var4) {
                                if (var1 <= 128) {
                                    throw new IllegalStateException();
                                }

                                ScriptEvent.method109(1698296025);
                                Client.fieldMv = false;
                            } else if (UtilClass21.fieldL * 1195675721 != 0) {
                                if (var1 <= 128) {
                                    return;
                                }

                                ItemTable.fieldN = var4 * -703074975;
                            } else {
                                UtilClass37.fieldB.a(var4, 666442913);
                            }
                        }

                        Client.fieldMh = -1738730969 * var4;
                    }
                }

                if (4 == var2) {
                    if (var1 <= 128) {
                        throw new IllegalStateException();
                    }

                    if (0 == var3) {
                        Client.fieldNe = 1432963689;
                    }

                    if (var3 == 1) {
                        if (var1 <= 128) {
                            throw new IllegalStateException();
                        }

                        Client.fieldNe = 1421371552;
                    }

                    if (var3 == 2) {
                        if (var1 <= 128) {
                            throw new IllegalStateException();
                        }

                        Client.fieldNe = -1915730496;
                    }

                    if (var3 == 3) {
                        if (var1 <= 128) {
                            throw new IllegalStateException();
                        }

                        Client.fieldNe = -957865248;
                    }

                    if (4 == var3) {
                        if (var1 <= 128) {
                            throw new IllegalStateException();
                        }

                        Client.fieldNe = 0;
                    }
                }

                if (var2 == 5) {
                    if (var1 <= 128) {
                        throw new IllegalStateException();
                    }

                    Client.fieldHc = var3 * -2074954639;
                }

                if (var2 == 6) {
                    Client.fieldJg = var3 * -935194497;
                }

                if (var2 == 9) {
                    if (var1 <= 128) {
                        throw new IllegalStateException();
                    }

                    Client.fieldJt = 171232567 * var3;
                }

                if (var2 == 10) {
                    if (var1 <= 128) {
                        throw new IllegalStateException();
                    }

                    if (var3 == 0) {
                        if (var1 <= 128) {
                            throw new IllegalStateException();
                        }

                        Client.fieldNm = -1701791009;
                    }

                    if (1 == var3) {
                        if (var1 <= 128) {
                            return;
                        }

                        Client.fieldNm = -305652640;
                    }

                    if (2 == var3) {
                        if (var1 <= 128) {
                            throw new IllegalStateException();
                        }

                        Client.fieldNm = -1635424192;
                    }

                    if (3 == var3) {
                        if (var1 <= 128) {
                            return;
                        }

                        Client.fieldNm = 1329771552;
                    }

                    if (var3 == 4) {
                        if (var1 <= 128) {
                            throw new IllegalStateException();
                        }

                        Client.fieldNm = 0;
                    }
                }

                if (var2 == 17) {
                    Client.fieldJx = (var3 & '\uffff') * -539922407;
                }

                if (var2 == 18) {
                    if (var1 <= 128) {
                        throw new IllegalStateException();
                    }

                    Client.fieldAo =  Preferences.ValueOf(Message.getEnum3Values((byte) -32), var3, -926340715);
                    if (null == Client.fieldAo) {
                        if (var1 <= 128) {
                            throw new IllegalStateException();
                        }

                        Client.fieldAo = UnknownEnum3.UNKNOWN0;
                    }
                }

                if (19 == var2) {
                    if (var1 <= 128) {
                        throw new IllegalStateException();
                    }

                    if (var3 == -1) {
                        if (var1 <= 128) {
                            return;
                        }

                        Client.fieldHy = 1856459235;
                    } else {
                        Client.fieldHy = (var3 & 2047) * -1856459235;
                    }
                }

            }
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "e.cs(" + ')');
        }
    }

    static final boolean method95(Widget var0, int var1) {
        try {
            int var2 = var0.contentType * 481950881;
            if (var2 == 205) {
                if (var1 == -834592258) {
                    throw new IllegalStateException();
                } else {
                    Client.socketRelatedInt = 2061374738;
                    return true;
                }
            } else {
                boolean var10002;
                int var3;
                int var4;
                if (var2 >= 300) {
                    if (var1 == -834592258) {
                        throw new IllegalStateException();
                    }

                    if (var2 <= 313) {
                        if (var1 == -834592258) {
                            throw new IllegalStateException();
                        }

                        var3 = (var2 - 300) / 2;
                        var4 = var2 & 1;
                        if (var4 == 1) {
                            if (var1 == -834592258) {
                                throw new IllegalStateException();
                            }

                            var10002 = true;
                        } else {
                            var10002 = false;
                        }

                        Client.aPlayerConfig.v(var3, var10002, -2073213341);
                    }
                }

                if (var2 >= 314) {
                    if (var1 == -834592258) {
                        throw new IllegalStateException();
                    }

                    if (var2 <= 323) {
                        if (var1 == -834592258) {
                            throw new IllegalStateException();
                        }

                        var3 = (var2 - 314) / 2;
                        var4 = var2 & 1;
                        if (var4 == 1) {
                            if (var1 == -834592258) {
                                throw new IllegalStateException();
                            }

                            var10002 = true;
                        } else {
                            var10002 = false;
                        }

                        Client.aPlayerConfig.i(var3, var10002, 879414933);
                    }
                }

                if (324 == var2) {
                    if (var1 == -834592258) {
                        throw new IllegalStateException();
                    }

                    Client.aPlayerConfig.b(false, (byte) 76);
                }

                if (325 == var2) {
                    if (var1 == -834592258) {
                        throw new IllegalStateException();
                    }

                    Client.aPlayerConfig.b(true, (byte) -33);
                }

                if (326 == var2) {
                    if (var1 == -834592258) {
                        throw new IllegalStateException();
                    } else {
                        Client.fieldCo.writePacketHeader(177, (byte) 0);
                        Client.aPlayerConfig.l(Client.fieldCo, 1924021695);
                        return true;
                    }
                } else {
                    return false;
                }
            }
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "e.du(" + ')');
        }
    }
}
