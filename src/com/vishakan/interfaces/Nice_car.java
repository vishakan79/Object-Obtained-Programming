package com.vishakan.interfaces;

public class Nice_car {
    private engine Engine;
    private music media = new CDpalyer();


    Nice_car()
    {
        Engine = new Powerengine();
    }
    Nice_car(engine Engine)
    {
        this.Engine =Engine;
    }
    public void start()
    {
        Engine.start();
    }
    public void stop()
    {
        Engine.stop();
    }
    public void acc()
    {
        Engine.acc();
    }
    public void startmusic ()
    {
       media.startmusic();
    }
    public void stopmusic()
    {
        media.stopmusic();
    }
    public void upgrade()
    {
        Engine = new Electricengine();
    }
}
