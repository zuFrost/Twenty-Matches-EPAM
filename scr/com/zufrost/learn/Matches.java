package com.zufrost.learn;

public class Matches {
    private static int matchesQuantity = 20;

    public static int getMatchesQuantity() {
        return matchesQuantity;
    }

    public static void setMatchesQuantity(int matchesQuantity) {
        matchesQuantity = matchesQuantity;
    }

    public static void takeOneMatch() {
        matchesQuantity -= 1;
    }

    public static void takeTwoMatches() {
        matchesQuantity -= 2;
    }

    public static void takeThreeMatches() {
        matchesQuantity -= 3;
    }

}
