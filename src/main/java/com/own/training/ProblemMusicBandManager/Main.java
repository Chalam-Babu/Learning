package com.own.training.ProblemMusicBandManager;

import com.own.training.ProblemMusicBandManager.Drums;
import com.own.training.ProblemMusicBandManager.Guitar;
import com.own.training.ProblemMusicBandManager.Piano;
import com.own.training.ProblemMusicBandManager.Playable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Playable> band = new ArrayList<>();


        System.out.print("How many instruments do you want to add to your band? ");
        int n = sc.nextInt();
        sc.nextLine();


        for (int i = 1; i <= n; i++) {
            System.out.print("Enter instrument " + i + " (guitar/piano/drums): ");
            String input = sc.nextLine().toLowerCase();

            switch (input) {
                case "guitar":
                    band.add(new Guitar());
                    break;
                case "piano":
                    band.add(new Piano());
                    break;
                case "drums":
                    band.add(new Drums());
                    break;
                default:
                    System.out.println("Invalid instrument, skipping...");
                    i--;
                    break;
            }
        }


        System.out.println("\nBand is playing...");
        for (Playable instrument : band) {
            instrument.play();
        }

        sc.close();
    }
}
