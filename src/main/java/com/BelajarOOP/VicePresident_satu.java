package com.BelajarOOP;

public class VicePresident_satu extends Manager_satu {
    VicePresident_satu(String name) {
        super(name);
    }

    void sayHello(String name) {
        System.out.println("Hi " + name + ", My name is VP " + this.name);
    }
}
