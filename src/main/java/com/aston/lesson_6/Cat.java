package com.aston.lesson_6;

public class Cat extends Animal {
    public static Cat[] catArray;
    private String name;
    private static int countCat = 0;
    private int food;
    int countFoodEatCat;
    private boolean satiety;
    private static int addFood;

    public Cat() {
        super();
    }

    public Cat(String name) {
        super();
        this.name = name;
        countCat++;
    }

    public Cat(String name, int countFoodEatCat) {
        super();
        this.name = name;
        this.countFoodEatCat = countFoodEatCat;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    @Override
    public void run(int lengthObstacle) {
        if (lengthObstacle > 200) {
            System.out.println(name + " не может бежать более 200м");
        } else {
            System.out.println(name + " пробежал дистанцию - " + lengthObstacle + "м");
        }

    }

    @Override
    public void swim(int lengthObstacle) {
        System.out.println("Кот не умеет плавать");
    }

    public static int getCountCat() {
        return countCat;
    }

    public void getFoodCat() {
        if (food < countFoodEatCat) {
            System.out.println("Кот не может съесть больше, чем есть в миске");
        } else if (food == countFoodEatCat) {
            satiety = true;
            System.out.println("Кот сыт");
        } else {
            satiety = false;
            System.out.println("Коту мало еды, нужно добавить");
        }
    }

}