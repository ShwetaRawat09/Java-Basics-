package com.shweta.oop;

//Encapsulation is data hiding and data binding with mehtods to prevent direct acces.

public class Encapsulation {
   private String password = "huntbox";
    public String getPassword(){
        return password;
    }

    public void setPassword(String password) {
        if (password.length() >= 8) {
            this.password = password;
        }
        else{
            System.out.print("Length of password cannot be less than 8");
        }
    }
}

class main{
    public static void main(String[] args){

        Encapsulation obj = new Encapsulation();
                System.out.println(obj.getPassword());
        obj.setPassword("randox");
        System.out.println(obj.getPassword());
    }
}
