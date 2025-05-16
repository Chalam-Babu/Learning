package com.chatGPT.training;
class Animal{
    void makeSound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("dog barks");
    }
}

public class Inheritance {
    public static void main(String [] args){
        Dog d = new Dog();
        d.makeSound();
    }
}
