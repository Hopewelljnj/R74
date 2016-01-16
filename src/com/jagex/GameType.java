package com.jagex;

public enum GameType implements Identifiable {

    RUNESCAPE("runescape", "RuneScape", 0),
    STELLARDAWN("stellardawn", "Stellar Dawn", 1),
    GAME3("game3", "Game 3", 2),
    GAME4("game4", "Game 4", 3),
    GAME5("game5", "Game 5", 4),
    OLDSCAPE("oldscape", "RuneScape 2007", 5);


    public final String privateName;
    final int id;


    GameType(String privateName, String fullName, int id) {
        this.privateName = privateName;
        this.id = id * 537275191;
    }

    public int getId(int dummy) {
        try {
            return this.id * -560891257;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "em.v(" + ')');
        }
    }
}
