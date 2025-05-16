package com.chatGPT.training;

import java.util.Scanner;

class Vehicle{
    void startEngine(){
        System.out.println("engine started");
    }

}
class Car extends Vehicle{
    @Override
    void startEngine() {
        System.out.println("car engine started");
    }
}

class Bike extends Vehicle{
    @Override
    void startEngine() {
        System.out.println("bike engine started");
    }
}

public class Inheritance2 {
    public static void main(String [] args){
        Vehicle v;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter vehical car / bike");
        String veh = sc.nextLine().toLowerCase();

        if(veh.equals("car")){
            v = new Car();
        }else if(veh.equals("bike")){
            v = new Bike();

        }else{
            System.out.println("give correct input");
            sc.close();
            return;
        }

        v.startEngine();

    }
}
