package Day56_Abstraction;

public abstract class AbstractClass_VS_Interface { //  abstract class

    int a ;
    static int b;

    public void  method1(){} // instance method
    public static void mehhod2(){} // static method
    public abstract void method3(); // abstract method
    static {b=100;} // static block
                     // instance block
}

interface A { // interface

    int a = 10; // public static final


    static void method2(){}// static method
    abstract  void method3();// public
    default void method4 (){} // default method




}