package com.zufrost.learn;

public class Play {
    public static void main(String[] args) {

        while (Matches.getMatchesQuantity() > 1) {
            DisplayMessage.showMatchesQuantity();
            DisplayMessage.showTurnCounter();
            DisplayMessage.showIsPcPlayerTurn();
            if (TurnPriority.isPcPlayerTurn()) {
                PcPlayer.Action();
            } else {
                HumanPlayer.Action();
            }
        }

        //определение победителя
        if (Matches.getMatchesQuantity() == 1) {
            if (TurnPriority.isPcPlayerTurn()) {

            }
        }

    }
}
