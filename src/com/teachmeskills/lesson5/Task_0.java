package com.teachmeskills.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Task_0 {
    public static void task_0(int[][][] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for sum of 3D array: ");
        int n = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    arr[i][j][k] += n;
                }
            }
        }
        System.out.println("Sum of 3D array: " + Arrays.deepToString(arr));
    }
}
