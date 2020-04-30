package com.zufrost.learn;

public class PcPlayer {
    private static int lastMatchesQuantity;

    public static void Action() {
        System.out.println("Компьютер ходит");
        if (lastMatchesQuantity == 0 || lastMatchesQuantity - Matches.getMatchesQuantity() == 1) {
            Matches.takeThreeMatches();
        } else if (lastMatchesQuantity - Matches.getMatchesQuantity() == 2) {
            Matches.takeTwoMatches();
        } else {
            Matches.takeOneMatch();
        }

        lastMatchesQuantity = Matches.getMatchesQuantity();
        TurnPriority.nextTurnCounter();
    }
}
