package com.zufrost.learn;

public class Play {
    public static void main(String[] args) {

        DisplayMessage.showGameStart();

        while (Matches.getMatchesQuantity() > 1) {
            if (TurnPriority.isPcPlayerTurn()) {
                PcPlayer.Action();
                DisplayMessage.showMatchesQuantity();
            } else {
                HumanPlayer.Action();
                DisplayMessage.showMatchesQuantity();
            }
        }

        if (Matches.getMatchesQuantity() == 1) {
            if (TurnPriority.isPcPlayerTurn()) {
                System.out.println("победитель - человек");
            } else {
                System.out.println("победитель - компьютер");
            }
        }
    }
}
