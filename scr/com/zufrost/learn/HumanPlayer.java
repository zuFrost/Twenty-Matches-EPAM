package com.zufrost.learn;

import java.util.Scanner;

public class HumanPlayer {

    public static void Action() {
        System.out.println("Человек ходит");
        System.out.print("Ход человека. Введите количество спичек: ");
        Scanner scanner = new Scanner(System.in);
//        int count = scanner.nextInt();
        int count = 0;

        if (scanner.hasNextInt()) {
            count = scanner.nextInt();
        }

        if (count == 1) {
            Matches.takeOneMatch();
            TurnPriority.nextTurnCounter();
        } else if (count == 2) {
            Matches.takeTwoMatches();
            TurnPriority.nextTurnCounter();
        } else if (count == 3) {
            Matches.takeThreeMatches();
            TurnPriority.nextTurnCounter();
        } else {
            System.out.println("Некорректное значение спичек, выберете 1, 2 или 3 спички");;
        }
    }
}
