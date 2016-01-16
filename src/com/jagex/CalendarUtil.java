package com.jagex;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Calendar;
import java.util.TimeZone;

public class CalendarUtil {

    static final String[][] MONTHS = new String[][]{
            {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"},
            {"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}
    };

    static final String[] DAYS = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    static Calendar GTM_CALENDAR;
    static boolean fieldAw;
    static int baseY;


    CalendarUtil() throws Throwable {
        throw new Error();
    }

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        GTM_CALENDAR = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public static int updateMouseIdle(int var0) {
        try {
            return (Mouse.mouseIdleTime += -103175145) * 517622695 - 1;
        } catch (RuntimeException var1) {
            throw ClanMate.error(var1, "cu.i(" + ')');
        }
    }

    static void method294(int var0) {
        try {
            UtilClass41.fieldEk = new int[33];
            ClanMate.fieldEz = new int[33];
            Packet.fieldEv = new int[151];
            classBo.fieldEs = new int[151];
            int var1 = 0;

            int var2;
            int var3;
            int var4;
            while (var1 < 33) {
                if (var0 != 40311488) {
                    throw new IllegalStateException();
                }

                var2 = 999;
                var3 = 0;
                var4 = 0;

                while (true) {
                    if (var4 < 34) {
                        label123:
                        {
                            if (var0 != 40311488) {
                                return;
                            }

                            if (0 == ClanMate.mapback.fieldA[var1 * ClanMate.mapback.fieldI + var4]) {
                                if (999 == var2) {
                                    var2 = var4;
                                }
                            } else if (var2 != 999) {
                                if (var0 != 40311488) {
                                    throw new IllegalStateException();
                                }

                                var3 = var4;
                                break label123;
                            }

                            ++var4;
                            continue;
                        }
                    }

                    UtilClass41.fieldEk[var1] = var2;
                    ClanMate.fieldEz[var1] = var3 - var2;
                    ++var1;
                    break;
                }
            }

            var1 = 5;

            while (var1 < 156) {
                if (var0 != 40311488) {
                    throw new IllegalStateException();
                }

                var2 = 999;
                var3 = 0;
                var4 = 25;

                while (true) {
                    if (var4 < 172) {
                        label120:
                        {
                            if (var0 != 40311488) {
                                throw new IllegalStateException();
                            }

                            label94:
                            {
                                if (ClanMate.mapback.fieldA[var4 + var1 * ClanMate.mapback.fieldI] == 0) {
                                    label121:
                                    {
                                        if (var0 != 40311488) {
                                            throw new IllegalStateException();
                                        }

                                        if (var4 <= 34) {
                                            if (var0 != 40311488) {
                                                throw new IllegalStateException();
                                            }

                                            if (var1 <= 34) {
                                                break label121;
                                            }

                                            if (var0 != 40311488) {
                                                throw new IllegalStateException();
                                            }
                                        }

                                        if (var2 == 999) {
                                            if (var0 != 40311488) {
                                                throw new IllegalStateException();
                                            }

                                            var2 = var4;
                                        }
                                        break label94;
                                    }
                                }

                                if (var2 != 999) {
                                    if (var0 != 40311488) {
                                        throw new IllegalStateException();
                                    }

                                    var3 = var4;
                                    break label120;
                                }
                            }

                            ++var4;
                            continue;
                        }
                    }

                    Packet.fieldEv[var1 - 5] = var2 - 25;
                    classBo.fieldEs[var1 - 5] = var3 - var2;
                    ++var1;
                    break;
                }
            }

        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "cu.x(" + ')');
        }
    }

    static void method295(int var0, int var1) {
        try {
            ItemTable var2 = (ItemTable) ItemTable.cache.get((long) var0);
            if (var2 == null) {
                if (var1 > -24032697) {
                    ;
                }
            } else {
                var2.delete();
            }
        } catch (RuntimeException var3) {
            throw ClanMate.error(var3, "cu.l(" + ')');
        }
    }

    static boolean method296(File var0, boolean var1, int var2) {
        try {
            try {
                RandomAccessFile var3 = new RandomAccessFile(var0, "rw");
                int var4 = var3.read();
                var3.seek(0L);
                var3.write(var4);
                var3.seek(0L);
                var3.close();
                if (var1) {
                    if (var2 >= -1892090976) {
                        throw new IllegalStateException();
                    }

                    var0.delete();
                }

                return true;
            } catch (Exception var5) {
                return false;
            }
        } catch (RuntimeException var6) {
            throw ClanMate.error(var6, "cu.i(" + ')');
        }
    }

    public static String method297(CharSequence var0, classGn var1, int var2) {
        try {
            if (null == var0) {
                if (var2 == 233600054) {
                    throw new IllegalStateException();
                } else {
                    return null;
                }
            } else {
                int var3 = 0;

                int var4;
                for (var4 = var0.length(); var3 < var4 && UtilClass13.method48(var0.charAt(var3), -1799916942); ++var3) {
                    if (var2 == 233600054) {
                        throw new IllegalStateException();
                    }
                }

                while (var4 > var3 && UtilClass13.method48(var0.charAt(var4 - 1), -1979663374)) {
                    if (var2 == 233600054) {
                        throw new IllegalStateException();
                    }

                    --var4;
                }

                int var5 = var4 - var3;
                if (var5 >= 1) {
                    if (var2 == 233600054) {
                        throw new IllegalStateException();
                    }

                    if (var5 <= FriendedPlayer.method177(var1, (short) -14142)) {
                        StringBuilder var6 = new StringBuilder(var5);
                        for (int var7 = var3; var7 < var4; ++var7) {
                            char var8 = var0.charAt(var7);
                            if (GraphicsStub.method405(var8, -1857596927)) {
                                char var9;
                                switch (var8) {
                                    case 32:
                                    case 45:
                                    case 95:
                                    case 160:
                                        var9 = 95;
                                        break;
                                    case 35:
                                    case 91:
                                    case 93:
                                        var9 = var8;
                                        break;
                                    case 192:
                                    case 193:
                                    case 194:
                                    case 195:
                                    case 196:
                                    case 224:
                                    case 225:
                                    case 226:
                                    case 227:
                                    case 228:
                                        var9 = 97;
                                        break;
                                    case 199:
                                    case 231:
                                        var9 = 99;
                                        break;
                                    case 200:
                                    case 201:
                                    case 202:
                                    case 203:
                                    case 232:
                                    case 233:
                                    case 234:
                                    case 235:
                                        var9 = 101;
                                        break;
                                    case 205:
                                    case 206:
                                    case 207:
                                    case 237:
                                    case 238:
                                    case 239:
                                        var9 = 105;
                                        break;
                                    case 209:
                                    case 241:
                                        var9 = 110;
                                        break;
                                    case 210:
                                    case 211:
                                    case 212:
                                    case 213:
                                    case 214:
                                    case 242:
                                    case 243:
                                    case 244:
                                    case 245:
                                    case 246:
                                        var9 = 111;
                                        break;
                                    case 217:
                                    case 218:
                                    case 219:
                                    case 220:
                                    case 249:
                                    case 250:
                                    case 251:
                                    case 252:
                                        var9 = 117;
                                        break;
                                    case 223:
                                        var9 = 98;
                                        break;
                                    case 255:
                                    case 376:
                                        var9 = 121;
                                        break;
                                    default:
                                        var9 = java.lang.Character.toLowerCase(var8);
                                }

                                if (0 != var9) {
                                    var6.append(var9);
                                }
                            }
                        }

                        if (var6.length() == 0) {
                            return null;
                        }

                        return var6.toString();
                    }

                    if (var2 == 233600054) {
                        throw new IllegalStateException();
                    }
                }

                return null;
            }
        } catch (RuntimeException var11) {
            throw ClanMate.error(var11, "cu.b(" + ')');
        }
    }
}
