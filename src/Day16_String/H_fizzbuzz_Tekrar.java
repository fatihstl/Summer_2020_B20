package Day16_String;

import java.util.Scanner;

public class H_fizzbuzz_Tekrar {

    public static void main(String[] args) {

      /*  wririte a program StartEndWords:
        you have 2 words that must be 5 characters, and check if last letter of first word and first letter of second work are same.
        if either one not 5 chars length:    print "need to be exactly 5 chars length"
        if last letter of 1st word and first letter of 2nd word match:  print "Fizz"
        if they do not match:  print "Buzz - did not match"
        NOTE: you will need nested If*/

       Scanner input =  new Scanner(System.in);
        System.out.println(" Enter first word");
        String word1 = input.next();

        System.out.println(" Enter second word");
        String word2 = input.next();

        boolean result = word1.length()== 5 && word2.length() ==5;

        if (result){
        char ch1= word1.charAt(word1.length()-1); // ilk kelimenin son harfi.
        char ch2= word2.charAt(0); // ikinci kelimenin ilk harfi.

            if (ch1==ch2){
                System.out.println("fizz");
                } else {
                System.out.println("Buzz");
            }
        }else {
            System.out.println("need to be exactly 5 chars lenght");
        }
        
            }
}
