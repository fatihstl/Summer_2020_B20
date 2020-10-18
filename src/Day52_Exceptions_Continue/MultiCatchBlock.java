package Day52_Exceptions_Continue;

import org.w3c.dom.ls.LSOutput;

public class MultiCatchBlock {

    public static void main(String[] args) {
        int [] arr =  {10, 20};

        try{
            System.out.println(arr [20]);
        } catch (ArithmeticException e ){
            System.out.println("Aritmetic Exception is Handled");
        }catch (ClassCastException e){
            System.out.println("Class Cast exception");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Index out of Bound Exception"); // bu parent
        }

        System.out.println("==================================");
        String str = "Cybertek";
        try{
            System.out.println(str.charAt(200));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("==========================================");
     try {
         Thread.sleep(1000);
     } catch (Exception e ) {

     }


        System.out.println("======================================================");
     try {
         System.out.println(8/0); // Aritmetic execption
         System.out.println("Try Block");
     } catch (ArrayIndexOutOfBoundsException e ){
         System.out.println("catch Block");
     } finally {
         System.out.println("Finally block");
     }

        System.out.println("completed");


    }
}
