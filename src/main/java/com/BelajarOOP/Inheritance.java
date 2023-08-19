package com.BelajarOOP;

public class Inheritance {
    class Employee {
        String name;

        Employee(String name) {
            this.name = name;
        }

        void sayHello(String name) {
            System.out.println("Hello " + name + ", My Name is Employee " + this.name);
        }
    }

    class Manager extends Employee {
        Manager(String name) {
            super(name);
        }

        void sayHello(String name) {
            System.out.println("Hello " + name + ", My Name is Employee " + this.name);
        }
    }

    class VicePresident extends Employee {
        VicePresident(String name) {
            super(name);
        }

        void sayHello(String name) {
            System.out.println("Hello " + name + ", My Name is Employee " + this.name);
        }
    }
}
