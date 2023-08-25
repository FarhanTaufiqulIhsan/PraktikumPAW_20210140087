package com.tugas.tugas;

public class Boolean {
    public static void main(String[] args) {
        var absen = 80;
        var nilaiAkhir = 80;

        var lulusanAbsen = absen >= 75;
        var lulusanNilaiAkhir = nilaiAkhir >= 75;

        var lulus = lulusanAbsen && lulusanNilaiAkhir;

        System.out.print(lulus);

    }
}
