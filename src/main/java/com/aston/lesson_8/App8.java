package com.aston.lesson_8;

import com.aston.lesson_8.ArrayExceptions.*;

public class App8 {
    public static void main(String[] args) {
        String[][] arr = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };

        String[][] arr2 = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };

        String[][] arr3 = {
                {"1", "2", "3", "4"},
                {"1", "2", "Hello", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };

        ArrayExceptions exc = new ArrayExceptions();
        try {
            exc.checkAndSumArray(arr);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            exc.checkAndSumArray(arr2);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            exc.checkAndSumArray(arr3);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}