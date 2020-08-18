package Day16_String;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class A_warmp_Task_Sub {
    public static void main(String[] args) {

      /*  1. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
    Input:    apple     banana    Output:    ppleanana*/

           Scanner input = new Scanner(System.in);

      System.out.println("Enter first word");// apple
       String str1 = input.next();

       System.out.println("enter Second word");// banana
       String str2= input.next();

       String result =  str1.substring(1) + str2.substring(1);

      System.out.println(result);


       // Ornek: ikinci ornek pepsi yazdirmak istiyoruz.

        String  str = "I like to drink pepsi";
                       // 012345678910111213
        String drink = str.substring(16); // pepsiyi yazdiriyoruz.
        String  dafarkli = str.substring(10 ,15+1);

        System.out.println(drink);
        System.out.println(dafarkli);

    }
}
