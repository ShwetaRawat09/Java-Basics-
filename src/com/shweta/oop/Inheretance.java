package com.shweta.oop;

public class Inheretance {
     void A(){
        System.out.println("parent class ");
    }


}

class Child extends Inheretance{

     void A(){
        System.out.println("child class");
    }
    void B(){
         System.out.println("only in child");
    }

    public static void main(String arg[]){

        Inheretance obj = new Inheretance();
        obj.A();

        Inheretance obj1 = new Child();
        obj1.A();

        Child obj2 = new Child();
        obj2.B();
    }

    
}


