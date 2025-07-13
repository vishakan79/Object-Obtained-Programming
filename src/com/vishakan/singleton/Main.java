package com.vishakan.singleton;

public class Main {
    public static void main(String[] args) {
        //System.out.println(singleton.num);
        singleton obj = singleton.getInstance();
        singleton obj2 = singleton.getInstance();
    }
}
