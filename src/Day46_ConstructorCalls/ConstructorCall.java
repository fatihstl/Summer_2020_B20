package Day46_ConstructorCalls;

import java.util.concurrent.Callable;

public class ConstructorCall {

    public ConstructorCall(){
        method1();
        method2();
        method3();

    }

     public static void method1(){
         method2();
        // ConstructorCall();

     }

     public static void method2(){
         method1();
     }

     public  static void method3(){
        method2();
     }

}
