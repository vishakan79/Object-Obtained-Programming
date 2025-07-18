package com.vishakan.abstractclass;

public class Main {
    public static void main(String[] args) {
        son  Son = new son(50);
        Son.career();
        Son.partner();
        int sonage=Son.age;
        System.out.println(sonage);

        Daughter daughter = new Daughter(30);
        daughter.career();
        daughter.partner();
        int daughterage = daughter.age;
        System.out.println(daughterage);
    }
}
