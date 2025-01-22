package com.aston.lesson_3;

public class Task13 {
    int[][] array = new int[4][4];

    public void printArray() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j]);

            }
            System.out.println();
        }
    }
}
