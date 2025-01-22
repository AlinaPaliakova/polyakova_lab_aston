package com.aston.lesson_3;

public class Task11 {
    public void fillArray() {

        int[] args = new int[100];
        System.out.print("[ ");
        for (int i = 0; i < args.length; i++) {
            args[i] = i + 1;
            System.out.print(args[i] + " ");
        }
        System.out.println("]");

    }
}
