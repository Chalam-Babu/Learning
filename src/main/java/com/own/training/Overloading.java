package com.own.training;

class Printer{
    String print(String str){
        return str;
    }
    int print(int number){
        return number;
    }

     void print(String str, int number){
        for(int i =0; i<number;i++){
            System.out.println(i + " " + str);
        }

     }
}

public class Overloading {
    public static void main(String [] args){

        Printer p = new Printer();
        System.out.println(p.print("Hello"));
        System.out.println(p.print(2456565));
        p.print("i am chalam", 3);

    }

}
