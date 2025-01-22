package com.aston.lesson_3;

public class Task12 {
    public void replaceArrayElements() {
        int[] args = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < args.length; i++) {
            if (args[i] < 6) {
                args[i] *= 2;
                System.out.print(args[i] + " ");
            } else {
                System.out.print(args[i] + " ");
            }

        }
    }
}
