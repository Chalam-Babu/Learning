package com.chatGPT.training.intterfaceandPolymorpisam;

public class Drum implements Playable{
    @Override
    public void play() {
        System.out.println("drums is playing");
    }
}
