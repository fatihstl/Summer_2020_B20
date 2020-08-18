package Day22_NestedLo0p;

import java.util.Scanner;

public class B_Warmup_OccurancasChar {
    public static void main(String[] args) {
      /*  2. Write a program that can asks user to enter one string and one char
       and then returns the frequency of str2 in str1
        Ex  Input: AABAAC
                   A
            Output: 4

        Input: ABCC
        C
        Output: 2*/

        String str = "ababcabcabd";
        char ch = 'a'; // burada 4 kez tekrarliyor. Anin kac kez tekrarladigini buluyoruz.
        int count = 0;

        for (int i = 0; i <= str.length()-1; i++) {
            char each = str.charAt(i); // a b a b c seklinde tekrar edecek.

            if (each == ch) {
                count += 1;

            }

        }
        System.out.println(count);
    }
}
