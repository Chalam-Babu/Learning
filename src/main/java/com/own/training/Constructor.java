package com.own.training;
class Person{
    Person(){
        System.out.println("Person is creatwed");
    }

}
class Employee extends Person{
    Employee(){
        super();
        System.out.println("Employee is created");
    }
}
public class Constructor {
    public static void main(String [] args){
        Employee e = new Employee();
    }
}
