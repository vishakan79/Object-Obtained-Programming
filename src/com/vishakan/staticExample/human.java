package com.vishakan.staticExample;

public class human {
    String name;
    int age;
    int salary;
    boolean married;
    static long population;
    human(String name,int age,int salary,boolean married)
    {
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.married=married;
        human.population+=1;
    }
}
