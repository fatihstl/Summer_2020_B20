package Day52_Exceptions_Continue;

import org.w3c.dom.ls.LSOutput;

public class Practice {
    public static void main(String[] args) {

       try {
           System.out.println(9 / 0);
       }catch(ArithmeticException e ) {
           System.out.println(e.getMessage());
    }
        System.out.println("Test Copleted");
    }

}
