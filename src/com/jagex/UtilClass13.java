package com.jagex;

public class UtilClass13 {

    UtilClass13() throws Throwable {
        throw new Error();
    }

    public static long method46(CharSequence var0, byte var1) {
        try {
            long var2 = 0L;
            int var4 = var0.length();

            for (int var5 = 0; var5 < var4; ++var5) {
                if (var1 >= 0) {
                    throw new IllegalStateException();
                }

                label90:
                {
                    var2 *= 37L;
                    char var6 = var0.charAt(var5);
                    if (var6 >= 65) {
                        if (var1 >= 0) {
                            throw new IllegalStateException();
                        }

                        if (var6 <= 90) {
                            var2 += (long) (1 + var6 - 65);
                            break label90;
                        }
                    }

                    if (var6 >= 97) {
                        if (var1 >= 0) {
                            throw new IllegalStateException();
                        }

                        if (var6 <= 122) {
                            if (var1 >= 0) {
                                throw new IllegalStateException();
                            }

                            var2 += (long) (1 + var6 - 97);
                            break label90;
                        }
                    }

                    if (var6 >= 48) {
                        if (var1 >= 0) {
                            throw new IllegalStateException();
                        }

                        if (var6 <= 57) {
                            if (var1 >= 0) {
                                throw new IllegalStateException();
                            }

                            var2 += (long) (27 + var6 - 48);
                        }
                    }
                }

                if (var2 >= 177917621779460413L) {
                    break;
                }
            }

            while (0L == var2 % 37L) {
                if (var1 >= 0) {
                    throw new IllegalStateException();
                }

                if (var2 == 0L) {
                    break;
                }

                if (var1 >= 0) {
                    throw new IllegalStateException();
                }

                var2 /= 37L;
            }

            return var2;
        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "dv.a(" + ')');
        }
    }

    static final void method47(String var0, byte var1) {
        try {
            if (var0 == null) {
                if (var1 != 9) {
                    ;
                }
            } else {
                String var2 = CalendarUtil.method297(var0, UtilClass38.fieldS, -1777752636);
                if (null == var2) {
                    if (var1 == 9) {
                        throw new IllegalStateException();
                    }
                } else {
                    for (int var3 = 0; var3 < Client.chosenFriendIndex * 1960973713; ++var3) {
                        boolean var7;
                        label82:
                        {
                            FriendedPlayer var4 = Client.friendedPlayers[var3];
                            String var5 = var4.displayName;
                            String var6 = CalendarUtil.method297(var5, UtilClass38.fieldS, -863416150);
                            if (var0 != null) {
                                if (null != var5) {
                                    if (!var0.startsWith("#")) {
                                        if (var1 == 9) {
                                            return;
                                        }

                                        if (!var5.startsWith("#")) {
                                            var7 = var2.equals(var6);
                                            break label82;
                                        }
                                    }

                                    var7 = var0.equals(var5);
                                    break label82;
                                }

                                if (var1 == 9) {
                                    throw new IllegalStateException();
                                }
                            }

                            var7 = false;
                        }

                        if (var7) {
                            if (var1 == 9) {
                                throw new IllegalStateException();
                            }

                            Client.chosenFriendIndex -= -533509263;

                            for (int var8 = var3; var8 < Client.chosenFriendIndex * 1960973713; ++var8) {
                                if (var1 == 9) {
                                    throw new IllegalStateException();
                                }

                                Client.friendedPlayers[var8] = Client.friendedPlayers[1 + var8];
                            }

                            Client.fieldKt = Client.fieldKe * -709004739;
                            Client.fieldCo.writePacketHeader(232, (byte) 0);
                            Packet var11 = Client.fieldCo;
                            int var9 = var0.length() + 1;
                            var11.writeByte(var9);
                            Client.fieldCo.w(var0, (byte) 0);
                            break;
                        }
                    }

                }
            }
        } catch (RuntimeException var10) {
            throw ClanMate.error(var10, "dv.df(" + ')');
        }
    }

    static final boolean method48(char var0, int var1) {
        try {
            boolean var10000;
            if (160 != var0) {
                if (var1 >= -1655669173) {
                    throw new IllegalStateException();
                }

                if (32 != var0) {
                    if (var1 >= -1655669173) {
                        throw new IllegalStateException();
                    }

                    if (95 != var0) {
                        if (var1 >= -1655669173) {
                            throw new IllegalStateException();
                        }

                        if (var0 != 45) {
                            var10000 = false;
                            return var10000;
                        }

                        if (var1 >= -1655669173) {
                            throw new IllegalStateException();
                        }
                    }
                }
            }

            var10000 = true;
            return var10000;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "dv.i(" + ')');
        }
    }
}
