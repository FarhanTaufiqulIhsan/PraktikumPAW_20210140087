package com.tugas.tugas;

public class SwitchDenganYield {
    public static void main(String[] args) {
        var nilai = "A";
        String ucapan = switch (nilai) {
            case "A":
                yield "Wow anda lulus dengan baik";
            case "B", "C":
                yield "Anda Lulus";
            case "D":
                yield "Anda Tidak Lulus";
            default:
                yield "mungkin anda salah jurusan";
        };
        System.out.println(ucapan);
    }
}
