package Day51_Exceptions;

import Library.Util;

public class ExceptionHandlings2 {

    public static void main(String[] args) {

        String excetionResult = "";

        try{
            System.out.println(10/0); // exception

        }catch (ArithmeticException e){
            e.getMessage();
            System.out.println("AritmeticException is detected");

        }

        System.out.println(excetionResult);

        Util.sleep(10);
        System.out.println("Good Bye");

    }
}
