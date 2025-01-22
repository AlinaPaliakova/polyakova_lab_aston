package com.aston.lesson_3;

public class Task3 {
    int value = 70;

    public void printColor() {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }

    }
}
