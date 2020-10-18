package Day56_Abstraction;

import javax.imageio.stream.ImageInputStream;

public interface InterfacePractice {

    int a = 200;
    public static final int b = 300;


    static void method1 (){
        System.out.println(a);
        System.out.println(b);

    }

    public static void main(String[] args) {// static method olur

    }

    public default void method2(){ // default method olur.

    }

    public abstract void  method4(); // abstract method olur.

    void method(); // abstract method

    // satatic block olmazyaz
    // instance veriable olmaz


}


