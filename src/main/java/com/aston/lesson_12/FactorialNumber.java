package com.aston.lesson_12;

public class FactorialNumber {
    long factorial;

    //lesson12 junit, testng

    public long getFactorial(int number) {
        if (number < 0)
            throw new IllegalArgumentException();

        factorial = 1;

        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
        }
        return factorial;
    }

    public static void main(String[] args) {
        FactorialNumber factorialNumber = new FactorialNumber();
        System.out.println(factorialNumber.getFactorial(6));
    }
}
