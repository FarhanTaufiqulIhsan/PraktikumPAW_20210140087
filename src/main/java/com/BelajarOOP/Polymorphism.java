package com.BelajarOOP;

public class Polymorphism {
    public static void main(String[] args) {
        Employee employee = new Employee("Farhan");
        employee.sayHello("Budi");

        employee = new Manager_satu("Ehzand");
        employee.sayHello("Budi");

        employee = new VicePresident_satu("Joko");
        employee.sayHello("Budi");

        sayHello(new Employee("Eko"));
        sayHello(new Manager_satu("Eko "));
        sayHello(new VicePresident_satu("Eko"));
    }

    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident_satu) {
            VicePresident_satu vicePresident1 = (VicePresident_satu) employee;
            System.out.println("Hello VP " + vicePresident1.name);
        } else if (employee instanceof Manager_satu) {
            Manager_satu manager1 = (Manager_satu) employee;
            System.out.println("Hello Manager " + manager1.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}
