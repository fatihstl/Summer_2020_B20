package Day28_Recap_String_MultiArray_loops;

import java.util.Scanner;

public class B_warm_frequency_Word2_Kolay {

    public static void main(String[] args) {

        // bu da baska bir metod bir kelimenin kac kara tekrar ediliyor.

        Scanner input =  new Scanner(System.in);
        String str = input.nextLine();

      //String str =  "catcatcatdogdog"; // cat icin 0-3

        int count = 0;// cat
        for (int i = 0; i<= str.length()-3; i++){
            if(str.substring(i, i+3).equalsIgnoreCase(("cat"))) {
                count++;

            }
        }
        System.out.println(count); // 3 kere tekrar ediyor.

    }
}
