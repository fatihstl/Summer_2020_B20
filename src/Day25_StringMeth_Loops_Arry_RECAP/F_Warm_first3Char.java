package Day25_StringMeth_Loops_Arry_RECAP;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class F_Warm_first3Char {
    public static void main(String[] args) {
// 5. Write a program that will take five Strings and save them into an array called arr.
//// and  Use for loop to print out the first three letter of each element of arr, one per line.
////  You can assume that every element of arr is at least 3 letters long.
////  Example: arr -> ["apple", "banana"]
//  prints:  appban
        String [] words= {"apple", "banana", "strawbery", "java", "Pyton"}; // tum kelimelerin ilk 3 harfini bul.
     /*   System.out.println(words[0].substring(0, 3 ));
        System.out.println(words[1].substring(0, 3 ));
        System.out.println(words[2].substring(0, 3 ));
        System.out.println(words[3].substring(0, 3 ));  */

      // klasik for ile yukaridaki ornrgi ile yapiyoruz.
     for (int i = 0; i <= words.length-1; i++){
         System.out.println(words[i].substring(0,3));
     }
        System.out.println();

        // for each ile ayni seyi yapacagiz
        for (String each : words){
            System.out.println(each.substring(0,3));
        }

    }

}
