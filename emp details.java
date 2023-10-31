package com.tap;

class Employee{
    String name;
    int age;
    String dept;
    int salary;

    public Employee(String name, int age, String dept, int salary) {
        this.name = name;
        this.age = age;
        this .dept = dept;
        this.salary = salary;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("prathyu", 22, "IT", 45000);
        System.out.println(e.name);
        System.out.println(e.age);
        System.out.println(e.dept);
        System.out.println(e.salary);
    }
}
