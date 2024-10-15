package com.teachmeskills.lesson5;

import java.util.Arrays;

public class Task_2 {
    public static void task_2() {
        int[][] firstMatrix = {{1,0,0,0},{0,1,0,0},{0,0,0,0}};
        int[][] secondMatrix = {{1,2,3},{1,1,1},{0,0,0},{2,1,0}};
        int[][] resultMatrix = new int[firstMatrix.length][secondMatrix[0].length];

        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < secondMatrix[0].length; j++) {
                for (int k = 0; k < secondMatrix.length; k++) {
                    resultMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        System.out.println(Arrays.deepToString(resultMatrix));
    }
}
