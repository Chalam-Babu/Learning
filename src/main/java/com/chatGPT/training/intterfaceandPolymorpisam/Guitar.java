package com.chatGPT.training.intterfaceandPolymorpisam;

public class Guitar implements Playable{
    @Override
    public void play() {
        System.out.println("guitar is playing");
    }
}
