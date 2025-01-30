package com.aston.lesson_9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    Map<String, List<String>> phoneBook = new HashMap<>();

    public void add(String surname, String number) {
        List<String> numbers = phoneBook.get(surname);
        if (numbers == null) {
            numbers = new ArrayList<>();
            phoneBook.put(surname, numbers);
        }
        numbers.add(number);

    }

    public List<String> get(String surname) {
        List<String> numbers = phoneBook.get(surname);
        if (numbers == null) {
            return new ArrayList<>();
        }
        return numbers;
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Полякова", "+375291732494");
        phoneBook.add("Сидоров", "+375291112233");
        phoneBook.add("Иванова", "+375292223333");
        phoneBook.add("Полякова", "+375293385333");
        System.out.println(phoneBook);

        System.out.println("Номер Поляковой: " + phoneBook.get("Полякова"));
        System.out.println("Номер Сидорова: " + phoneBook.get("Сидоров"));
        System.out.println("Номер Иванова: " + phoneBook.get("Иванова"));
        System.out.println("Номер Корнейчук: " + phoneBook.get("Корнейчук"));
    }
}
