package com.tugas.tugas;

public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Mancing", "bolo");
    }

    static void sayHello(String firstname, String lastname) {
        System.out.println("Hello " + firstname + " " + lastname);
    }
}
