package com.aston;
import com.aston.lesson_3.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        Task1 task1 = new Task1();
        task1.printThreeWords();

        System.out.println("Задание 2:");
        Task2 task2 = new Task2();
        task2.checkSumSign();

        System.out.println("Задание 3:");
        Task3 task3 = new Task3();
        task3.printColor();

        System.out.println("Задание 4");
        Task4 task4 = new Task4();
        task4.compareNumber();

        System.out.println("Задание 5");
        Task5 task5 = new Task5();
        System.out.println(task5.withinRange(10, 20));

        System.out.println("Задание 6");
        Task6 task6 = new Task6();
        task6.printIsPositive(-20);

        System.out.println("Задание 7");
        Task7 task7 = new Task7();
        System.out.println(task7.isNegative(-20));

        System.out.println("Задание 8");
        Task8 task8 = new Task8();
        task8.printString("Сегодня 16 января 2025", 3);

        System.out.println("Задание 9");
        Task9 task9 = new Task9();
        System.out.println(task9.isLeapYear(2100));

        System.out.println("Задание 10");
        Task10 task10 = new Task10();
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1};
        task10.replaceArrayElements(array);

        System.out.println("Задание 11");
        Task11 task11 = new Task11();
        task11.fillArray();

        System.out.println("Задание 12");
        Task12 task12 = new Task12();
        task12.replaceArrayElements();

        System.out.println();
        System.out.println("Задание 13");
        Task13 task13 = new Task13();
        task13.printArray();

        System.out.println("Задание 14");
        Task14 task14 = new Task14();
        task14.createArray(4, 25);
    }

}