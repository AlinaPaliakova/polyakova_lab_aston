package com.aston.lesson_6;

public class Plate {
    private int food;

    public int getLeftoverFood() {
        return leftoverFood;
    }

    public void setLeftoverFood(int leftoverFood) {
        this.leftoverFood = leftoverFood;
    }

    private int leftoverFood;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int leftoverFood(Cat[] catArray, int food) {
        for (int i = 0; i < catArray.length; i++) {
            leftoverFood = food - catArray[i].countFoodEatCat;
            food = leftoverFood;
        }
        return leftoverFood;

    }

    public void addFood() {
        Plate plate = new Plate();
        food = leftoverFood + 10;
        leftoverFood = food;
        System.out.println("Добавляем 10 еды:  " + leftoverFood + " + 10 = " + food);
    }
}
