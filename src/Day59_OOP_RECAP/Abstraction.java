package Day59_OOP_RECAP;

interface X{ // interface

    public abstract void  method1(); // ABSTACT METHOD
    void  method(); // ABSTRACT METHOD, INTERFACE ICONDE ABSTRACT METHOD ICIN "ABSTRACT" KEYWORD ZORUNLU degil

    int a = 10; //public static final
    static  int b = 20; //

   // int c; : Interfacede  deger vermez isen olmaz
   // static  int e; interfacede deger vermez isen olmaz.

   // X(){} constructor kabul etmez.

  //  static {} statik bloku kabul etmez


}


 abstract class  Y { // abstact class

    public abstract  void method1();// ABSTACT METHOD

int a =100; // instance veriable olur
static int b = 200; // static veriable olur


     Y(){} // constuctor kabul eder.


     static {}// static bloku kabul eder.




}

public class Abstraction {
    public static void main(String[] args) {

      //  Y obj = new Y(); // abstracta obje kuramazsin.
       // X obj2 = new X();



    }

}
