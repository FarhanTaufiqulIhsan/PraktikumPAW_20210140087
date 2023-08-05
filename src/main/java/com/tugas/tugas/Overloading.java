package com.tugas.tugas;

public class Overloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("purwanto");
        sayHello("Eko", "Purwanto");
    }

    static void sayHello() {
        System.out.println("Hello");
    }

    static void sayHello(String firstname) {
        System.out.println("Hello " + firstname);
    }

    static void sayHello(String firstname, String lastname) {
        System.out.println("Hello " + firstname + " " + lastname);
    }
}
