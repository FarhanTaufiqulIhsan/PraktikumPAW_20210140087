package com.tugas.tugas;

public class TanpaVariableArgument {
    static void main(String name, int[] values) {
        int total = 0;
        for (var value : values) {
            total += value;
        }

        int finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat" + name + "Anda Lulus");
        } else {
            System.out.println("Maaf" + name + ", Anda Tidak Lulus");
        }
    }
}