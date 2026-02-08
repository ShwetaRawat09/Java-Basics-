package com.shweta.oop;

public class InnerClass {
    public static void main(String args[]){
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        System.out.println(inner.innerClassMethod());
    }
}

class Outer{
    int x = 10;
    class Inner{
        public int innerClassMethod(){
            return x;
        }
        }
        }
