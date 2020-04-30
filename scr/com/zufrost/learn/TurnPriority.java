package com.zufrost.learn;

public class TurnPriority {
    private static int turnCounter = 0;

    public static int getTurnCounter() {
        return turnCounter;
    }

    private static void setTurnCounter(int turnCounter) {
        TurnPriority.turnCounter = turnCounter;
    }

    public static void nextTurnCounter() {
        setTurnCounter(++turnCounter);
    }

    public static boolean isPcPlayerTurn() {
        return turnCounter % 2 == 0;
    }
}
