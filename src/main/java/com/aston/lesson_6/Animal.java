package com.aston.lesson_6;

public class Animal {
    private static int countAnimal = 0;

    public Animal() {
        countAnimal++;
    }

    public void run(int lengthObstacle) {
        System.out.println("Животное пробежало" + lengthObstacle);
    }

    public void swim(int lengthObstacle) {
        System.out.println("Животное проплыло" + lengthObstacle);
    }

    public static int getCountAnimal() {
        return countAnimal;

    }
}
