package com.zufrost.learn;

public class DisplayMessage {

    public static void showMatchesQuantity() {
        System.out.println("На столе осталось " + Matches.getMatchesQuantity() + " спичек.");
    }

    public static void showTurnCounter() {
        System.out.println("Ход номер "+TurnPriority.getTurnCounter());
    }

    public static void showIsPcPlayerTurn() {
        System.out.println("Ход компьютера? "+TurnPriority.isPcPlayerTurn());
    }





}
