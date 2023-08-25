package com.tugas.tugas;

public class SwitchTanpaYield {
    public static void main(String[] args) {
        var nilai = "A";
        String ucapan;

        switch (nilai) {
            case "A" -> ucapan = "Wow Anda lulus dengan baik";
            case "B", "C" -> ucapan = "Anda Lulus";
            case "D" -> ucapan = "Anda Tidak Lulus";
            default -> ucapan = "Mungkin anda salah jurusan";
        }
        System.out.println(ucapan);
    }
}
