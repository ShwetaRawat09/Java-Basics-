// interface
public class Implements {
    public static void main(String[] args){

        Books b1 = new LandOfFlowers(); // polymorphism
          b1.genre();
          b1.pages();
          b1.writer();
        Books b2 = new StoneLand();
       b2.genre();
       b2.writer();
       b1.writer();

       //multiple inheritance
        Demo d1 = new Demo();
         d1.name();
         d1.genre();

        Books b3 = new Demo();
        b3.pages();
        Movie m1 = new Demo();
        m1.name();

    }
}

interface Books{
    public void genre();
    public void pages();
    public void writer();
}

class LandOfFlowers implements Books{
   public void genre(){
        System.out.println("slice of life");
    }
    public void pages(){
        System.out.println(300);
    }
    public void writer(){
        System.out.println("Shweta");
    }
}

class StoneLand implements Books{
   public void genre(){
       System.out.println("comic");
   }
   public void pages(){
       System.out.println(100);
   }
   public void writer(){
       System.out.println("kageyama");
   }
}
// multiple inheritance in java can be achieve by interface

interface Movie{
    public void name();
}

class Demo implements Movie, Books{
    public void genre(){
        System.out.println("Comedy");
    }
    public void name() {
        System.out.println("Advantureoftintin");
    }
    public void writer(){
        System.out.println("JK");
    }
    public void pages(){
        System.out.println(434);
    }
}