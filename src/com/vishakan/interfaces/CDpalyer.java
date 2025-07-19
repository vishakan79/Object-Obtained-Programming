package com.vishakan.interfaces;

public class CDpalyer implements music{

    @Override
    public void startmusic() {
        System.out.println("Rock music player can started");
    }

    @Override
    public void stopmusic() {
        System.out.println("the music player can be stoped");
    }
}
