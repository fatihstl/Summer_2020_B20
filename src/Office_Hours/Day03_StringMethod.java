package Office_Hours;

import java.util.Scanner;

public class Day03_StringMethod {

    public static void main(String[] args) {

       /* Ask user to enter two words. Then add them together and print.
       But if the last letter if the first word and the first letter of the last letter is the same,
        print that character once. input one , eight output : oneight
        */

       String str1 = "one";
       String str2 = "eight";
       char ch1 = str1.charAt(str1.length()-1);
      char ch2= str2.charAt(0);

     if (ch1== ch2){
           System.out.println(str1+ str2.substring(1));
       } else{
           System.out.println(str1+ str2);
       }


    }
}
