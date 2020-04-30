package com.zufrost.learn;

public class PcPlayer {
    public static void Action(){
        System.out.println("Компьютер ходит");
        Matches.takeOneMatch();
        TurnPriority.nextTurnCounter();

    }
}
