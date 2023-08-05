package com.tugas.tugas;

public class FactorialRecurcive {
    static int factorialRecurcive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecurcive(value - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5;
        int result = factorialRecurcive(number);
        System.out.println("Faktorial dari " + number + " adalah " + result);
    }
}
