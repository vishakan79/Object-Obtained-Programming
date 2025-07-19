package com.vishakan.interfaces;

public class Electricengine implements engine{

    @Override
    public void start() {
        System.out.println("it is a electric car will be started");
    }

    @Override
    public void stop() {
        System.out.println("it is a electric  car can be stopped");
    }

    @Override
    public void acc() {
        System.out.println("it has electric car very power full acculator");
    }
}
