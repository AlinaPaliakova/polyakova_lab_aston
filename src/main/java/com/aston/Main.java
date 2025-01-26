package com.aston;
import com.aston.lesson_6.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Марсик");
        cat.run(250);
        cat.swim(500);
        System.out.println("-----------------------------------------");

        Cat cat1 = new Cat("Дженни");
        cat1.run(150);
        cat1.swim(100);
        System.out.println("-----------------------------------------");

        Dog dog = new Dog("Шарик");
        dog.run(255);
        dog.swim(90);
        System.out.println("-----------------------------------------");

        System.out.println("Количество животных: " + Animal.getCountAnimal());
        System.out.println("Количество котов: " + Cat.getCountCat());
        System.out.println("Количество собак: " + Dog.getCountDog());

        System.out.println("-----------------------------------------");

        Cat[] catArray = new Cat[3];
        catArray[0] = new Cat("Мура", 10);
        catArray[1] = new Cat("Тишка", 11);
        catArray[2] = new Cat("Фрося", 10);

        System.out.println();

        System.out.println("Введите количество еды в тарелке: ");
        Scanner scanner = new Scanner(System.in);
        int foodPlate = scanner.nextInt();
        Plate plate = new Plate();
        if (plate.leftoverFood(catArray, foodPlate) < 0) {
            System.out.println("В тарелке недостаточно еды, чтобы накормить всех котов. Не хватает - " + -(plate.getLeftoverFood()));
            System.out.println("Добавляем еду в тарелку");
            while (plate.getLeftoverFood() < 0) {
                plate.addFood();
            }
            System.out.println("Теперь коты сыты!!!");
        } else {
            System.out.println("Остаток еды в тарелке: " + plate.leftoverFood(catArray, foodPlate) + ". Коты сыты.");
        }

        System.out.println("Фигуры");
        Figure circle = new Circle(4, "White", "Black");
        Figure rectangle = new Rectangle(3, 7, "Pink", "Green");
        Figure triangle = new Triangle(3, 4, 5, "Yellow", "Blue");

        System.out.println("Круг:");
        circle.printCharacteristics();

        System.out.println("\nПрямоугольник:");
        rectangle.printCharacteristics();

        System.out.println("\nТреугольник:");
        triangle.printCharacteristics();
    }
}