package com.vishakan.interfaces;

public class Main {
    public static void main(String[] args) {
        /*custom_car car = new custom_car();
        car.start();
        car.startmusic();
         */
        //Electricengine normal = new Electricengine();
        Nice_car car = new Nice_car();
        car.start();
        car.upgrade();
        car.start();
    }
}
