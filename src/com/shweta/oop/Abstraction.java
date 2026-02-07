
package com.shweta.oop;

public class Abstraction {
    public static void main(String[] args){
        Animal c = new Cat();
        c.sleep();
        c.sound();

    }
}
abstract class Animal{
    void sleep(){

        System.out.println("zzzz");
    }
    abstract void sound();

}

class Cat extends Animal{
    void sound(){
        System.out.println("meow" );
    }
}