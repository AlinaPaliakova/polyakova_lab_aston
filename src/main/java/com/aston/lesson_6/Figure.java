package com.aston.lesson_6;

public interface Figure {
    double getPerimeter();
    double getSquare();
    String getFillColor();
    String getBorderColor();

    default void printCharacteristics() {
        System.out.println("Периметр: " + getPerimeter());
        System.out.println("Площадь: " + getSquare());
        System.out.println("Цвет фона: " + getFillColor());
        System.out.println("Цвет границы: " + getBorderColor());
    }
}
