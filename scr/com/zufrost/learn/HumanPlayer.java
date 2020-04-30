package com.zufrost.learn;

import java.util.Scanner;

public class HumanPlayer {

    public static void Action() {
        System.out.println("Человек ходит");
        System.out.print("Ход человека. Введите количество спичек: ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        if (count == 1) {
            Matches.takeOneMatch();
        } else if (count == 2) {
            Matches.takeTwoMatches();
        } else {
            Matches.takeThreeMatches();
        }

        TurnPriority.nextTurnCounter();
    }
}
