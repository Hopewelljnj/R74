package com.jagex;

import java.awt.*;
import java.awt.event.*;

public class Mouse implements MouseListener, MouseMotionListener, FocusListener {

    public static int fieldX = 0;
    public static volatile int mouseIdleTime = 0;
    public static int fieldO = 0;
    public static int fieldM = 0;
    public static int fieldW = 0;
    public static int fieldE = 0;
    public static int fieldD = 0;
    public static long fieldQ = 0L;
    public static Mouse instance = new Mouse();
    public static volatile int fieldI = 0;
    protected static Frame fieldPu;
    static volatile int fieldB = 147509921;
    static volatile int fieldL = 1747067427;
    static volatile int fieldN = 0;
    static volatile int fieldS = 0;
    static volatile long fieldF = 0L;
    static volatile int fieldK = 0;

    @Override
    public final synchronized void focusLost(FocusEvent var1) {
        try {
            if (instance != null) {
                fieldI = 0;
            }

        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "et.focusLost(" + ')');
        }
    }

    @Override
    public final synchronized void mousePressed(MouseEvent var1) {
        try {
            if (null != instance) {
                mouseIdleTime = 0;
                fieldS = var1.getX() * -1902126289;
                fieldK = var1.getY() * 356298379;
                fieldF = classDz.getFancyTime(851776456) * 3067764641978535125L;
                if (var1.isAltDown()) {
                    fieldN = -825347156;
                    fieldI = 1205220292;
                } else if (var1.isMetaDown()) {
                    fieldN = 1734810070;
                    fieldI = 602610146;
                } else {
                    fieldN = -1280078613;
                    fieldI = -1846178575;
                }
            }

            if (var1.isPopupTrigger()) {
                var1.consume();
            }

        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "et.mousePressed(" + ')');
        }
    }

    @Override
    public final synchronized void mouseReleased(MouseEvent var1) {
        try {
            if (instance != null) {
                mouseIdleTime = 0;
                fieldI = 0;
            }

            if (var1.isPopupTrigger()) {
                var1.consume();
            }

        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "et.mouseReleased(" + ')');
        }
    }

    @Override
    public final synchronized void mouseEntered(MouseEvent var1) {
        try {
            if (null != instance) {
                mouseIdleTime = 0;
                fieldB = var1.getX() * -147509921;
                fieldL = var1.getY() * -1747067427;
            }

        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "et.mouseEntered(" + ')');
        }
    }

    @Override
    public final synchronized void mouseDragged(MouseEvent var1) {
        try {
            if (null != instance) {
                mouseIdleTime = 0;
                fieldB = var1.getX() * -147509921;
                fieldL = var1.getY() * -1747067427;
            }

        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "et.mouseDragged(" + ')');
        }
    }

    @Override
    public final synchronized void mouseMoved(MouseEvent var1) {
        try {
            if (instance != null) {
                mouseIdleTime = 0;
                fieldB = var1.getX() * -147509921;
                fieldL = var1.getY() * -1747067427;
            }

        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "et.mouseMoved(" + ')');
        }
    }

    @Override
    public final void focusGained(FocusEvent var1) {
        try {
            ;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "et.focusGained(" + ')');
        }
    }

    @Override
    public final void mouseClicked(MouseEvent var1) {
        try {
            if (var1.isPopupTrigger()) {
                var1.consume();
            }

        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "et.mouseClicked(" + ')');
        }
    }

    @Override
    public final synchronized void mouseExited(MouseEvent var1) {
        try {
            if (null != instance) {
                mouseIdleTime = 0;
                fieldB = 147509921;
                fieldL = 1747067427;
            }

        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "et.mouseExited(" + ')');
        }
    }
}
