package com.tugas.tugas;

public class ErrorStackOverflow {
    static void loop(int value) {
        if (value == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println("Loop-" + value);
            loop(value - 1);
        }
    }

    public static void main(String[] args) {
        int value = 5;
        loop(value);
    }
}
