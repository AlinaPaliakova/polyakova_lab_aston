package com.aston.lesson_3;

public class Task10 {
    public void replaceArrayElements(int[] args) {
        System.out.print("[ ");
        for (int i = 0; i < args.length; i++) {
            if (args[i] == 0) {
                args[i] = 1;
            } else if (args[i] == 1) {
                args[i] = 0;
            }
            System.out.print(args[i] + " ");
        }
        System.out.println("]");
    }
}
