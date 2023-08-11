package com.tugas.tugas;

public class Komentar {
    /**
     * Menghitung jumlah a + b
     * 
     * @param a nilai a
     * @param b nilai b
     * @return a + b
     */

    static int sum(int a, int b) {
        // jumlahkan a + b
        return a + b;
    }

    public static void main(String[] args) {
        int result = sum(5, 7);
        System.out.println("Hasil penjumlahan: " + result);
    }
}
