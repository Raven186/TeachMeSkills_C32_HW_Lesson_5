package com.teachmeskills.lesson5;

import java.util.Arrays;

public class Task_3 {
    public static void task_3() {
        int[][] matrix = new int[4][4];

        for (int i = 0; i < matrix.length; i++) {
            Arrays.setAll(matrix[i], j -> (int) Math.round(Math.random() * 10));
        }

        System.out.println(Arrays.deepToString(matrix));

        int sum = Arrays.stream(matrix).mapToInt(el -> Arrays.stream(el).sum()).sum();

        System.out.println(sum);
    }
}
