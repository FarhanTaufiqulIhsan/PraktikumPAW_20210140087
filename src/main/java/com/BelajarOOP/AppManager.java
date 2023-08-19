package com.BelajarOOP;

public class AppManager {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Eko";
        manager.sayHello("Farhan");

        var vicePresident = new VicePresident();
        vicePresident.name = "Kurniawan";
        vicePresident.sayHello("Ohlins");
    }
}
