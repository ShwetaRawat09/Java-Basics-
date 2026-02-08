package com.shweta.oop;

import java.awt.desktop.SystemEventListener;

//One thing having many form.
public class Polymorphism {

    static int sum(int a, int b){
       return a+b;
    }

     static int sum(int a, int b, int c){
        return (a + b + c);
    }

public static void main(String args[]){

    Animal2 a1 = new Dog();
    //runtime polymorphism
    a1.sound();
    Dog d1 = new Dog();
    d1.sound();

    //compile time polymorphism
    System.out.println(sum(1, 2, 3));
    System.out.println(sum(3, 4));
}
}

//Runtime Polymorphism
class Animal2{
    void sound(){
        System.out.println("....");
    }
}
class Dog extends Animal2{
    void sound(){
        System.out.println("bark");
        super.sound(); // super is use to refer to parent class
    }
}