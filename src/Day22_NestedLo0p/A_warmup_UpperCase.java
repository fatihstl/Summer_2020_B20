package Day22_NestedLo0p;

import java.util.Scanner;

public class A_warmup_UpperCase {
    public static void main(String[] args) {
        /*1. Write a program that asks user to enter a string.
        If string started with uppercase and ends with lowercase letter then print true,
         otherwise print false
        Ex:
        Input: Cybertek
        output: true
        Input: CyberteK
        output: false*/
     /// bir kelime giriyoruz ilk harfi buyuk ve digerleri kucuk ise true oteki turlu false.
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a string: ");
        String word = input.next();

        char ch1=  word.charAt(0); // ilk inseks
        char ch2= word.charAt((word.length()-1)); // son indeksi

        boolean start = ch1 >= 'A' && ch1<='Z'; // upper case
        boolean end = ch2 >= 'a' &&  ch2 <='z'; //lower case

        System.out.println( start && end);


    }
}

