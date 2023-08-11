package com.tugas.tugas;

public class Scope {
    static void sayHello(String name) {
        String hello = "Hello " + name;
        if (!name.isBlank()) {
            String hi = "Hi " + name;
            System.out.println(hi);
        }

        System.out.println(hello);
        // System.out.println(hi); // error
    }

    public static void main(String[] args) {
        sayHello("John");
    }
}
