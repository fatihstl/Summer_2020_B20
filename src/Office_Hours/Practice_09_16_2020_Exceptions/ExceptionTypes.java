package Office_Hours.Practice_09_16_2020_Exceptions;

import org.w3c.dom.ls.LSOutput;

public class ExceptionTypes {

    public static void main(String[] args) {

        try {
            System.out.println(9 / 0);
        } catch (ArithmeticException e){
            System.out.println("Aritmetic Exception");
        } finally {
            System.out.println("gecti");
        }

        System.out.println("Test is passed");

    }
}
