package com.aston.lesson_6;

public class Dog extends Animal {
    private String name;
    private static int countDog = 0;

    public Dog(String name) {
        super();
        this.name = name;
        countDog++;
    }

    @Override
    public void run(int lengthObstacle) {
        if (lengthObstacle > 500) {
            System.out.println(name + " не может бежать более 500м");
        } else {
            System.out.println(name + " пробежал дистанцию - " + lengthObstacle + "м");
        }
    }

    @Override
    public void swim(int lengthObstacle) {
        if (lengthObstacle > 10) {
            System.out.println(name + " не может проплыть более 10м");
        } else {
            System.out.println(name + " проплыл дистанцию - " + lengthObstacle + "м");
        }
    }

    public static int getCountDog() {
        return countDog;
    }
}
