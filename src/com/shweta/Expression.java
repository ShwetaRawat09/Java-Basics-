package com.shweta;
import java.util.regex.*;
public class Expression {

    public static void main(String[] args){

    String input = "23984";
    boolean result = input.matches("\\d+");
    System.out.println(result);
    }
}
