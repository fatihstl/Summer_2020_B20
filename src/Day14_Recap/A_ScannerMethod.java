package Day14_Recap;

import java.util.Scanner;

public class A_ScannerMethod {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
        System.out.println(" Adini soyadini yaziniz.");
         //  boolean num=  input .nextBoolean();
        // int num = input.nextInt();
       // double num = input.nextDouble();
      //  String num = input.next();  ==> sadece bir kelime yazar.
        String num =  input.nextLine();

        System.out.println("You have entered: " + num);
    }

}
