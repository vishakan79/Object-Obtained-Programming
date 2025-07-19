package com.vishakan.interfaces;

public class Powerengine implements engine{

    @Override
    public void start() {
        System.out.println("the power engine has been started");
    }

    @Override
    public void stop() {
        System.out.println("the power engine has been stopped");
    }

    @Override
    public void acc() {
        System.out.println("it has more acctutor the engine");
    }
}
