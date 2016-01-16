package com.jagex;

public final class UtilClass7 {

    static Sprite fieldL;
    static int fieldT;


    UtilClass7() throws Throwable {
        throw new Error();
    }

    public static void method70(int var0) {
        try {
            try {
                if (1 == UtilClass21.fieldL * 1195675721) {
                    if (var0 >= 752187957) {
                        return;
                    }

                    int var1 = UtilClass37.fieldB.v(-1095909065);
                    if (var1 > 0) {
                        if (var0 >= 752187957) {
                            throw new IllegalStateException();
                        }

                        if (UtilClass37.fieldB.d(1116000307)) {
                            if (var0 >= 752187957) {
                                throw new IllegalStateException();
                            }

                            var1 -= UtilClass21.fieldS * 1796252237;
                            if (var1 < 0) {
                                if (var0 >= 752187957) {
                                    return;
                                }

                                var1 = 0;
                            }

                            UtilClass37.fieldB.a(var1, 1377353231);
                            return;
                        }
                    }

                    UtilClass37.fieldB.f(-2006658166);
                    UtilClass37.fieldB.l((byte) 8);
                    if (null != UtilClass21.fieldM) {
                        if (var0 >= 752187957) {
                            return;
                        }

                        UtilClass21.fieldL = -1123499022;
                    } else {
                        UtilClass21.fieldL = 0;
                    }

                    UtilClass21.fieldF = null;
                    LandscapeMod.fieldD = null;
                }
            } catch (Exception var2) {
                var2.printStackTrace();
                UtilClass37.fieldB.f(-2084483479);
                UtilClass21.fieldL = 0;
                UtilClass21.fieldF = null;
                LandscapeMod.fieldD = null;
                UtilClass21.fieldM = null;
            }

        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "dl.m(" + ')');
        }
    }

    static final void method71(String name) {
        try {
            if (null != name) {
                label154:
                {
                    if (Client.chosenFriendIndex * 1960973713 >= 200 && Client.fieldHq * 961198955 != 1) {
                        break label154;
                    }

                    if (Client.chosenFriendIndex * 1960973713 < 400) {
                        String var2 = CalendarUtil.method297(name, UtilClass38.fieldS, -2133560365);
                        int var3;
                        String var5;
                        String var6;
                        for (var3 = 0; var3 < Client.chosenFriendIndex * 1960973713; ++var3) {
                            FriendedPlayer var4 = Client.friendedPlayers[var3];
                            var5 = CalendarUtil.method297(var4.displayName, UtilClass38.fieldS, -1139024645);
                            if (var5 != null) {
                                if (var5.equals(var2)) {
                                    JagSocket.addMessage(30, "", name + StringConstants.alreadyOnFL, (byte) 16);
                                    return;
                                }
                            }

                            if (null != var4.previousName) {
                                var6 = CalendarUtil.method297(var4.previousName, UtilClass38.fieldS, -312350461);
                                if (null != var6) {
                                    if (var6.equals(var2)) {
                                        JagSocket.addMessage(30, "", name + StringConstants.alreadyOnFL, (byte) 16);
                                        return;
                                    }
                                }
                            }
                        }

                        for (var3 = 0; var3 < Client.ignoreListSize * 697443259; ++var3) {
                            IgnoredPlayer var9 = Client.ignoredPlayers[var3];
                            var5 = CalendarUtil.method297(var9.previousName, UtilClass38.fieldS, 628867469);
                            if (null != var5) {
                                if (var5.equals(var2)) {
                                    JagSocket.addMessage(30, "", StringConstants.remove + name + StringConstants.fromIggyList, (byte) 16);
                                    return;
                                }
                            }

                            if (var9.displayName != null) {
                                var6 = CalendarUtil.method297(var9.displayName, UtilClass38.fieldS, -131164519);
                                if (var6 != null) {
                                    if (var6.equals(var2)) {
                                        JagSocket.addMessage(30, "", StringConstants.remove + name + StringConstants.fromIggyList, (byte) 16);
                                        return;
                                    }
                                }
                            }
                        }

                        if (CalendarUtil.method297(Client.myPlayer.name, UtilClass38.fieldS, 1001369569).equals(var2)) {
                            JagSocket.addMessage(30, "", StringConstants.cantAddSelfToFL, (byte) 16);
                            return;
                        }

                        Client.fieldCo.writePacketHeader(156, (byte) 0);
                        Packet var8 = Client.fieldCo;
                        int var10 = name.length() + 1;
                        var8.writeByte(var10);
                        Client.fieldCo.w(name, (byte) 0);
                        return;
                    }
                }
                JagSocket.addMessage(30, "", StringConstants.fullFL, (byte) 16);
            }
        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "dl.dh(" + ')');
        }
    }

    public static String method72(int var0, boolean var1, int var2) {
        try {
            if (var1) {
                if (var2 <= -63980445) {
                    throw new IllegalStateException();
                }

                if (var0 >= 0) {
                    int var4 = var0;
                    String var3;
                    if (var1) {
                        if (var0 >= 0) {
                            int var5 = 2;

                            for (int var6 = var0 / 10; 0 != var6; ++var5) {
                                if (var2 <= -63980445) {
                                    throw new IllegalStateException();
                                }

                                var6 /= 10;
                            }

                            char[] var7 = new char[var5];
                            var7[0] = 43;

                            for (int var8 = var5 - 1; var8 > 0; --var8) {
                                if (var2 <= -63980445) {
                                    throw new IllegalStateException();
                                }

                                int var9 = var4;
                                var4 /= 10;
                                int var10 = var9 - var4 * 10;
                                if (var10 >= 10) {
                                    var7[var8] = (char) (87 + var10);
                                } else {
                                    var7[var8] = (char) (var10 + 48);
                                }
                            }

                            var3 = new String(var7);
                            return var3;
                        }

                        if (var2 <= -63980445) {
                            throw new IllegalStateException();
                        }
                    }

                    var3 = Integer.toString(var0, 10);
                    return var3;
                }

                if (var2 <= -63980445) {
                    throw new IllegalStateException();
                }
            }

            return Integer.toString(var0);
        } catch (RuntimeException var11) {
            throw ClanMate.error(var11, "dl.m(" + ')');
        }
    }
}
