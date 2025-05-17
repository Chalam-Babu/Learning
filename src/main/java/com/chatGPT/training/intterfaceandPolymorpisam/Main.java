package com.chatGPT.training.intterfaceandPolymorpisam;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine().toLowerCase();
        Playable p;

        if(name.equals("drums")){
            p = new Drum();

        } else if (name.equals("guitar")) {
            p = new Guitar();


        }else {
            System.out.println("s os i");
            return;
        }
        p.play();
        sc.close();
    }
}
