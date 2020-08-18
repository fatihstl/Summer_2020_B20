package Day24_ArrayUtility;

import java.util.Arrays;
import java.util.Scanner;

public class F_StringMethods {
    public static void main(String[] args) {

 String str = "ABCDLmIN";
  char [] ch = str.toCharArray();

        System.out.println(Arrays.toString(ch));


        /// 2 ornek

        String str1 = "DECBA";
        String str2  = "ABCDE";

        char [] ch1= str1.toCharArray(); // bu ikinde arraye cevirdik.
        char[] ch2 = str2.toCharArray(); // array cevirdik.


        Arrays.sort(ch1); // A B C D E yapacak   esitlemek icin yaptik
        Arrays.sort(ch2); // A B C D E yapacak

       boolean r1=  Arrays.equals(ch1, ch2);   // esit mi degil mi ona baktik esit
        System.out.println(r1);


        // split metodi
        String sentence = "I love programming Language";
               // tresten alacagiz. bu metdla
       String[] words=  sentence.split(" ");
        System.out.println(Arrays.toString(words));
        //for( int i = words.length-1; i >=0 ; i--){
          // System.out.print(words[i]+ " ");
       // }
       System.out.println();

        // splitin ikinci metodu
        String s = "Java";
       String [] arr=  s.split(""); // bosluksuz yazinca metni verir.
       System.out.println(Arrays.toString(arr));


        char [] c = s.toCharArray();
       System.out.println(Arrays.toString(c)); // char ile ayni degeri verir. yukaridaki ile




    }
}
