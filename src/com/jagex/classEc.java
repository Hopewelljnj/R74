package com.jagex;

public class classEc extends classDa {

    long fieldA = System.nanoTime() * 6599965990863570959L;


    @Override
    public void v(byte var1) {
        try {
            this.fieldA = System.nanoTime() * 6599965990863570959L;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "ec.v(" + ')');
        }
    }

    @Override
    int i(int var1, int var2, int var3) {
        try {
            long var4 = 1000000L * (long) var2;
            long var6 = -8891642293000280337L * this.fieldA - System.nanoTime();
            if (var6 < var4) {
                if (var3 <= -1507413030) {
                    throw new IllegalStateException();
                }

                var6 = var4;
            }

            classCs.fancySleep(var6 / 1000000L);
            long var8 = System.nanoTime();

            int var10;
            for (var10 = 0; var10 < 10; this.fieldA += (long) var1 * -2337548600965930560L) {
                if (var10 >= 1) {
                    if (-8891642293000280337L * this.fieldA >= var8) {
                        break;
                    }

                    if (var3 <= -1507413030) {
                        throw new IllegalStateException();
                    }
                }

                ++var10;
            }

            if (this.fieldA * -8891642293000280337L < var8) {
                if (var3 <= -1507413030) {
                    throw new IllegalStateException();
                }

                this.fieldA = var8 * 6599965990863570959L;
            }

            return var10;
        } catch (RuntimeException var11) {
            throw ClanMate.error(var11, "ec.i(" + ')');
        }
    }

}
