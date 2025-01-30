package com.aston.lesson_9;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class App9 {
    public static void main(String[] args) {
        List<String> wordArray = new ArrayList<String>();
        System.out.println(App9.fillArray(wordArray));
        App9.printUniqueArray(wordArray);
    }

    public static List<String> fillArray(List<String> array) {
        array.add("привет");
        array.add("хорошо");
        array.add("получилось");
        array.add("получилось");
        array.add("сделала");
        array.add("Астон");
        array.add("привет");
        array.add("лаборатория");
        array.add("утро");
        array.add("стажировка");
        array.add("весна");
        array.add("лаборатория");
        return array;
    }

    public static void printUniqueArray(List<String> array) {
        Set<String> uniqueArray = new LinkedHashSet<>();
        for (String arr : array) {
            String a = arr.toLowerCase();
            uniqueArray.add(a);
        }
        for (String tempArr : uniqueArray) {
            int count = 0;
            for (String arr : array) {
                String a = arr.toLowerCase();
                if (tempArr.equals(a)) count++;
            }
            System.out.println("\"" + tempArr + "\"" + " повторяется в списке - " + count);
        }
        System.out.println("Список без повторений: " + uniqueArray);
    }
}