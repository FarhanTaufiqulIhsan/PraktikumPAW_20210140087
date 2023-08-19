package com.BelajarOOP;

public class Manager_satu extends Employee {
    String company;

    Manager_satu(String name) {
        super(name);
    }

    Manager_satu(String name, String company) {
        super(name);
        this.company = company;
    }

    void sayHello(String name) {
        System.out.println("Hi " + name + ", My name is Manager " + this.name);
    }
}
