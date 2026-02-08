package com.shweta.oop;
// use anonymous classes to override methods of an existing class or interface, without writing a separate class file
public class Anonymous{
public static void main(String[] arg){

    Plants p1 = new Plants();
    p1.leafType();

    Plants p2 = new Plants(){
        //here I am using anonymouse class to make the changes
        void leafType(){
            System.out.println("needle-like");
        }
    };
    p2.leafType();
}}

class Plants{
    void leafType(){
        System.out.println("Broadleaf");
    }}

