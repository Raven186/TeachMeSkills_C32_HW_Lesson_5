package com.teachmeskills.lesson5;

import java.util.Arrays;

public class Task_1 {
    public static void task_1() {
        String[][] chessDesk = new String[1][8];

        for (int i = 0; i < chessDesk.length; i++) {
            for (int j = 0; j < chessDesk[i].length; j++) {
                chessDesk[i][j] = (i + j) %2 == 0 ? "W" : "B";
            }
        }

        for (int i = 0; i < chessDesk.length; i++) {
            for (int j = 0; j < chessDesk[i].length; j++) {
                System.out.print(Arrays.toString(chessDesk[i]));
                System.out.println();
            }
        }
    }
}
