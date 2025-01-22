package com.aston.lesson_3;

public class Task14 {
    public int[] createArray(int len, int initianValue) {
        int args[] = new int[len];
        for (int i = 0; i < args.length; i++) {
            args[i] = initianValue;
            System.out.print(args[i]+ " ");
        }
        return args;
    }

}
