package com.tugas.tugas;

public class Overloading {
    public static void main(String[] args) {
        System.out.println(tambah("Lima", "Enam"));
        System.out.println(tambah(5, 4));
        System.out.println(sayHello("Eko", "Purwanto"));
        System.out.println(sayHello("Eko"));
    }

    static int tambah(int var1, int var2) {
        return var1 + var2;
    }

    static String tambah(String var1, String var2) {
        return var1 + " tambah " + var2;
    }

    static String sayHello(String firstname) {
        return firstname;
    }

    static String sayHello(String firstname, String lastname) {
        return firstname + lastname;
    }
}
