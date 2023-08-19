package com.BelajarOOP;

public class AppPerson {
    public static void main(String[] args) {
        var person = new Person(null, null);
        // Person person2 = new Person();

        // Person person3;
        // person3 = new Person();

        person.name = "Farhan Ohlins";
        person.address = "Yogya";
        // person1.country = "Tidak bisa diubah";

        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.country);

        person.sayHello("Kung Lao");

    }
}
