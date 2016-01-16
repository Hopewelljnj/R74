package com.jagex;

public class UtilClass34 {

    static final char[] fieldI = new char[]{' ', '\u00a0', '_', '-', '\u00e0', '\u00e1', '\u00e2', '\u00e4', '\u00e3', '\u00c0', '\u00c1', '\u00c2', '\u00c4', '\u00c3', '\u00e8', '\u00e9', '\u00ea', '\u00eb', '\u00c8', '\u00c9', '\u00ca', '\u00cb', '\u00ed', '\u00ee', '\u00ef', '\u00cd', '\u00ce', '\u00cf', '\u00f2', '\u00f3', '\u00f4', '\u00f6', '\u00f5', '\u00d2', '\u00d3', '\u00d4', '\u00d6', '\u00d5', '\u00f9', '\u00fa', '\u00fb', '\u00fc', '\u00d9', '\u00da', '\u00db', '\u00dc', '\u00e7', '\u00c7', '\u00ff', '\u0178', '\u00f1', '\u00d1', '\u00df'};
    static final char[] fieldB = new char[]{'[', ']', '#'};


    UtilClass34() throws Throwable {
        throw new Error();
    }

    static final void method355(int var0) {
        try {
            int var1 = ItemTable.fieldNt * 705453952 + 64;
            int var2 = StringConstants.fieldNz * -1492084608 + 64;
            int var3 = Landscape.getTileHeight(var1, var2, Client.floorLevel * 87713183) - Message.fieldNh * 1397128785;
            if (GraphicsStub.cameraX * 1659667383 < var1) {
                GraphicsStub.cameraX += (UtilClass18.fieldNs * -910874615 + UtilClass1.fieldNo * 45103113 * (var1 - GraphicsStub.cameraX * 1659667383) / 1000) * 892783111;
                if (GraphicsStub.cameraX * 1659667383 > var1) {
                    GraphicsStub.cameraX = var1 * 892783111;
                }
            }

            if (GraphicsStub.cameraX * 1659667383 > var1) {
                GraphicsStub.cameraX -= (UtilClass1.fieldNo * 45103113 * (GraphicsStub.cameraX * 1659667383 - var1) / 1000 + UtilClass18.fieldNs * -910874615) * 892783111;
                if (GraphicsStub.cameraX * 1659667383 < var1) {
                    GraphicsStub.cameraX = var1 * 892783111;
                }
            }

            if (Preferences.cameraZ * 820898407 < var3) {
                Preferences.cameraZ += (UtilClass1.fieldNo * 45103113 * (var3 - Preferences.cameraZ * 820898407) / 1000 + UtilClass18.fieldNs * -910874615) * 1828163927;
                if (Preferences.cameraZ * 820898407 > var3) {
                    Preferences.cameraZ = var3 * 1828163927;
                }
            }

            if (Preferences.cameraZ * 820898407 > var3) {
                Preferences.cameraZ -= (UtilClass18.fieldNs * -910874615 + (Preferences.cameraZ * 820898407 - var3) * UtilClass1.fieldNo * 45103113 / 1000) * 1828163927;
                if (Preferences.cameraZ * 820898407 < var3) {
                    Preferences.cameraZ = var3 * 1828163927;
                }
            }

            if (classEr.cameraY * -875394883 < var2) {
                classEr.cameraY += 648000149 * (UtilClass1.fieldNo * 45103113 * (var2 - classEr.cameraY * -875394883) / 1000 + UtilClass18.fieldNs * -910874615);
                if (classEr.cameraY * -875394883 > var2) {
                    classEr.cameraY = 648000149 * var2;
                }
            }

            if (classEr.cameraY * -875394883 > var2) {
                classEr.cameraY -= 648000149 * (UtilClass18.fieldNs * -910874615 + (classEr.cameraY * -875394883 - var2) * UtilClass1.fieldNo * 45103113 / 1000);
                if (classEr.cameraY * -875394883 < var2) {
                    classEr.cameraY = var2 * 648000149;
                }
            }

            var1 = SystemNode.fieldNu * 1574169984 + 64;
            var2 = 64 + ClassStructure.fieldNg * 708100224;
            var3 = Landscape.getTileHeight(var1, var2, Client.floorLevel * 87713183) - Keyboard.fieldNb * -620202035;
            int var4 = var1 - GraphicsStub.cameraX * 1659667383;
            int var5 = var3 - Preferences.cameraZ * 820898407;
            int var6 = var2 - classEr.cameraY * -875394883;
            int var7 = (int) Math.sqrt((double) (var6 * var6 + var4 * var4));
            int var8 = (int) (Math.atan2((double) var5, (double) var7) * 325.949D) & 2047;
            int var9 = (int) (Math.atan2((double) var4, (double) var6) * -325.949D) & 2047;
            if (var8 < 128) {
                if (var0 == -2026601936) {
                    throw new IllegalStateException();
                }

                var8 = 128;
            }

            if (var8 > 383) {
                if (var0 == -2026601936) {
                    return;
                }

                var8 = 383;
            }

            if (classAo.pitch * 362746213 < var8) {
                if (var0 == -2026601936) {
                    return;
                }

                classAo.pitch += 702658669 * (Preferences.fieldNv * 818198465 * (var8 - classAo.pitch * 362746213) / 1000 + GroundItem.fieldNr * -30833013);
                if (classAo.pitch * 362746213 > var8) {
                    if (var0 == -2026601936) {
                        return;
                    }

                    classAo.pitch = 702658669 * var8;
                }
            }

            if (classAo.pitch * 362746213 > var8) {
                classAo.pitch -= (Preferences.fieldNv * 818198465 * (classAo.pitch * 362746213 - var8) / 1000 + GroundItem.fieldNr * -30833013) * 702658669;
                if (classAo.pitch * 362746213 < var8) {
                    if (var0 == -2026601936) {
                        throw new IllegalStateException();
                    }

                    classAo.pitch = var8 * 702658669;
                }
            }

            int var10 = var9 - UtilClass11.yaw * -1758149661;
            if (var10 > 1024) {
                if (var0 == -2026601936) {
                    throw new IllegalStateException();
                }

                var10 -= 2048;
            }

            if (var10 < -1024) {
                if (var0 == -2026601936) {
                    throw new IllegalStateException();
                }

                var10 += 2048;
            }

            if (var10 > 0) {
                if (var0 == -2026601936) {
                    throw new IllegalStateException();
                }

                UtilClass11.yaw += 1735563723 * (Preferences.fieldNv * 818198465 * var10 / 1000 + GroundItem.fieldNr * -30833013);
                UtilClass11.yaw = (UtilClass11.yaw * -1758149661 & 2047) * 1735563723;
            }

            if (var10 < 0) {
                if (var0 == -2026601936) {
                    throw new IllegalStateException();
                }

                UtilClass11.yaw -= 1735563723 * (GroundItem.fieldNr * -30833013 + -var10 * Preferences.fieldNv * 818198465 / 1000);
                UtilClass11.yaw = (UtilClass11.yaw * -1758149661 & 2047) * 1735563723;
            }

            int var11 = var9 - UtilClass11.yaw * -1758149661;
            if (var11 > 1024) {
                var11 -= 2048;
            }

            if (var11 < -1024) {
                if (var0 == -2026601936) {
                    throw new IllegalStateException();
                }

                var11 += 2048;
            }

            label208:
            {
                if (var11 < 0) {
                    if (var0 == -2026601936) {
                        throw new IllegalStateException();
                    }

                    if (var10 > 0) {
                        break label208;
                    }

                    if (var0 == -2026601936) {
                        throw new IllegalStateException();
                    }
                }

                if (var11 <= 0) {
                    return;
                }

                if (var0 == -2026601936) {
                    throw new IllegalStateException();
                }

                if (var10 >= 0) {
                    return;
                }
            }

            UtilClass11.yaw = var9 * 1735563723;
        } catch (RuntimeException var12) {
            throw ClanMate.error(var12, "hk.ah(" + ')');
        }
    }

    public static int method356(CharSequence var0, int var1, int var2, byte[] var3, int var4, int var5) {
        try {
            int var6 = var2 - var1;

            for (int var7 = 0; var7 < var6; ++var7) {
                if (var5 >= -222863657) {
                    throw new IllegalStateException();
                }

                char var8;
                label224:
                {
                    var8 = var0.charAt(var1 + var7);
                    if (var8 > 0) {
                        if (var5 >= -222863657) {
                            throw new IllegalStateException();
                        }

                        if (var8 < 128) {
                            break label224;
                        }

                        if (var5 >= -222863657) {
                            throw new IllegalStateException();
                        }
                    }

                    if (var8 >= 160) {
                        if (var5 >= -222863657) {
                            throw new IllegalStateException();
                        }

                        if (var8 <= 255) {
                            if (var5 >= -222863657) {
                                throw new IllegalStateException();
                            }
                            break label224;
                        }
                    }

                    if (8364 == var8) {
                        if (var5 >= -222863657) {
                            throw new IllegalStateException();
                        }

                        var3[var4 + var7] = -128;
                    } else if (8218 == var8) {
                        if (var5 >= -222863657) {
                            throw new IllegalStateException();
                        }

                        var3[var7 + var4] = -126;
                    } else if (var8 == 402) {
                        var3[var4 + var7] = -125;
                    } else if (8222 == var8) {
                        if (var5 >= -222863657) {
                            throw new IllegalStateException();
                        }

                        var3[var4 + var7] = -124;
                    } else if (var8 == 8230) {
                        var3[var7 + var4] = -123;
                    } else if (var8 == 8224) {
                        if (var5 >= -222863657) {
                            throw new IllegalStateException();
                        }

                        var3[var4 + var7] = -122;
                    } else if (var8 == 8225) {
                        if (var5 >= -222863657) {
                            throw new IllegalStateException();
                        }

                        var3[var7 + var4] = -121;
                    } else if (var8 == 710) {
                        if (var5 >= -222863657) {
                            throw new IllegalStateException();
                        }

                        var3[var7 + var4] = -120;
                    } else if (8240 == var8) {
                        if (var5 >= -222863657) {
                            throw new IllegalStateException();
                        }

                        var3[var4 + var7] = -119;
                    } else if (var8 == 352) {
                        var3[var7 + var4] = -118;
                    } else if (var8 == 8249) {
                        var3[var4 + var7] = -117;
                    } else if (var8 == 338) {
                        if (var5 >= -222863657) {
                            throw new IllegalStateException();
                        }

                        var3[var4 + var7] = -116;
                    } else if (381 == var8) {
                        if (var5 >= -222863657) {
                            throw new IllegalStateException();
                        }

                        var3[var4 + var7] = -114;
                    } else if (var8 == 8216) {
                        var3[var4 + var7] = -111;
                    } else if (8217 == var8) {
                        if (var5 >= -222863657) {
                            throw new IllegalStateException();
                        }

                        var3[var4 + var7] = -110;
                    } else if (8220 == var8) {
                        if (var5 >= -222863657) {
                            throw new IllegalStateException();
                        }

                        var3[var7 + var4] = -109;
                    } else if (8221 == var8) {
                        var3[var4 + var7] = -108;
                    } else if (8226 == var8) {
                        if (var5 >= -222863657) {
                            throw new IllegalStateException();
                        }

                        var3[var7 + var4] = -107;
                    } else if (var8 == 8211) {
                        if (var5 >= -222863657) {
                            throw new IllegalStateException();
                        }

                        var3[var7 + var4] = -106;
                    } else if (var8 == 8212) {
                        if (var5 >= -222863657) {
                            throw new IllegalStateException();
                        }

                        var3[var4 + var7] = -105;
                    } else if (var8 == 732) {
                        var3[var7 + var4] = -104;
                    } else if (var8 == 8482) {
                        if (var5 >= -222863657) {
                            throw new IllegalStateException();
                        }

                        var3[var4 + var7] = -103;
                    } else if (353 == var8) {
                        if (var5 >= -222863657) {
                            throw new IllegalStateException();
                        }

                        var3[var4 + var7] = -102;
                    } else if (8250 == var8) {
                        var3[var7 + var4] = -101;
                    } else if (var8 == 339) {
                        if (var5 >= -222863657) {
                            throw new IllegalStateException();
                        }

                        var3[var4 + var7] = -100;
                    } else if (var8 == 382) {
                        if (var5 >= -222863657) {
                            throw new IllegalStateException();
                        }

                        var3[var4 + var7] = -98;
                    } else if (var8 == 376) {
                        if (var5 >= -222863657) {
                            throw new IllegalStateException();
                        }

                        var3[var7 + var4] = -97;
                    } else {
                        var3[var7 + var4] = 63;
                    }
                    continue;
                }

                var3[var4 + var7] = (byte) var8;
            }

            return var6;
        } catch (RuntimeException var9) {
            throw ClanMate.error(var9, "hk.b(" + ')');
        }
    }

}
