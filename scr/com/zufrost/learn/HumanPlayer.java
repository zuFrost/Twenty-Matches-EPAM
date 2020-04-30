package com.zufrost.learn;

public class HumanPlayer {

    public static void Action(){
        System.out.println("Человек ходит");
        Matches.takeOneMatch();
        TurnPriority.nextTurnCounter();

    }
}
