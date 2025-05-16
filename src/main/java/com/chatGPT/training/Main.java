package com.chatGPT.training;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

interface Playable{
    void play();
}

class Guitar implements Playable{
    @Override
    public void play() {
        System.out.println("Playing Guitar");
    }
}

class Piano implements Playable{
    @Override
    public void play() {
        System.out.println("playing PIano");
    }
}


public class Main {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);

        System.out.println("give name : ");
        String name = s.nextLine().toLowerCase();

        Playable playable = null;

        if (name.equals("piano")) {
            playable = new Piano();
        } else if (name.equals("guitar")) {
            playable = new Guitar();
        } else {
            System.out.println("Give correct one.");
        }


        if (playable != null) {
            playable.play();
        }


        s.close();
    }
}
