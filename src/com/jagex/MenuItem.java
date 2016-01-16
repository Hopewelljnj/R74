package com.jagex;

public class MenuItem {

    static int fieldPc;
    static classGm font_b12full;

    String option;
    int opcode;
    int arg2;
    int arg0;
    int arg1;

    static final int method370(int var0, int var1, int var2, int var3) {
        try {
            int var4 = 256 - var2;
            return ((var1 & 16711935) * var2 + (var0 & 16711935) * var4 & -16711936) + ((var0 & '\uff00') * var4 + (var1 & '\uff00') * var2 & 16711680) >> 8;
        } catch (RuntimeException var5) {
            throw ClanMate.error(var5, "as.m(" + ')');
        }
    }

    static final void loadNpcsIntoLandscape(boolean var0, byte dummy) {
        for (int i = 0; i < Client.npcCount * 1825497683; ++i) {
            Npc npc = Client.npcs[Client.npcIndices[i]];
            int uid = (Client.npcIndices[i] << 14) + 0x20000000;
            if (npc != null && npc.isValid(724565036)) {
                if (npc.definition.fieldC == var0 && npc.definition.canTransform((byte) 35)) {
                    int regionX = npc.strictX * 404428603 >> 7;
                    int regionY = npc.strictY * -1490664571 >> 7;
                    if (regionX >= 0 && regionX < 104 && regionY >= 0 && regionY < 104) {
                        if (npc.fieldZ * 2086274723 == 1 && 64 == (npc.strictX * 404428603 & 127) && 64 == (npc.strictY * -1490664571 & 127)) {
                            if (Client.fieldGf * 1276134057 == Client.fieldGe[regionX][regionY]) {
                                continue;
                            }
                            Client.fieldGe[regionX][regionY] = Client.fieldGf * 1276134057;
                        }
                        if (!npc.definition.interactable) {
                            uid -= Integer.MIN_VALUE;
                        }
                        Client.landscape.addNpcEntityMarker(Client.floorLevel * 87713183, npc.strictX * 404428603, npc.strictY * -1490664571, Landscape.getTileHeight(npc.strictX * 404428603 + (npc.fieldZ * 377596096 - 64), npc.fieldZ * 377596096 - 64 + npc.strictY * -1490664571, Client.floorLevel * 87713183), 60 + (npc.fieldZ * 377596096 - 64), npc, npc.orientation * -422817855, uid, npc.fieldR);
                    }
                }
            }
        }
    }

    static byte[] cloneBuffer(byte[] var0, byte var1) {
        try {
            int var2 = var0.length;
            byte[] var3 = new byte[var2];
            System.arraycopy(var0, 0, var3, 0, var2);
            return var3;
        } catch (RuntimeException var4) {
            throw ClanMate.error(var4, "as.k(" + ')');
        }
    }
}
