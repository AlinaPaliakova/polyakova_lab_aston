package com.aston;

import com.aston.lesson_5.Park;
import com.aston.lesson_5.Person;
import com.aston.lesson_5.Park.Attraction;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Полякова Алина Юрьевна", "Developer", "alina@inbox.com", "+375441732494", 300000, 32);
        person1.printPerson();

        Person[] person = new Person[5];
        person[0] = new Person("Иванов Иван Иванович", "Engineer", "ivanov@inbox.com", "+375445674774", 30000, 30);
        person[1] = new Person("Петров Петр Петрович", "Developer", "petrov@inbox.com", "+375445674440", 50000, 45);
        person[2] = new Person("Сидоров Олег Олегович", "Developer", "sidorov@inbox.com", "+3754489773428", 70000, 50);
        person[3] = new Person("Федоров Федор Федорович", "Developer", "fedorov@inbox.com", "+375446444420", 60000, 25);
        person[4] = new Person("Смирнов Максим Максимович", "Analyst", "smirnov@inbox.com", "+375445444485", 40000, 42);

        System.out.println("-------------------------------------");

        Park park = new Park("Гомельский парк", "Гомельский парк атракционов");
        Attraction rollerCoaster = park.new Attraction("Американские горки", "09:00 AM - 9:00 PM", 15.0);
        Attraction ferrisWheel = park.new Attraction("Колесо обозрения", "9:00 AM - 09:00 PM", 10.0);
        Attraction littleTrain = park.new Attraction("Паравозик", "09:00 AM - 09:00 PM", 4.0);

        rollerCoaster.printInfo();
        ferrisWheel.printInfo();
        littleTrain.printInfo();
    }
}