package Day16_String;

import java.util.Scanner;

public class B_taskOrnekChar {
    public static void main(String[] args) {

   /* 2. Ask user to enter a word. Print true is the first and last characters of the string are same characters,
   print false otherwise. Input:  abba  Output:   true*/

       /* Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();

        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length()-1);

        System.out.println(firstChar == lastChar); // level kelimesini ilk harfi ve son harfinin dogru*/


         Scanner input =  new Scanner(System.in);
         System.out.println("Enter your father full name: ");
         String fatherFullName= input.nextLine();
         char hesapla1 = fatherFullName.charAt(0);
         char hesapla2 = fatherFullName.charAt(7);
         System.out.println(hesapla1 +"" +hesapla2);

    }

}
