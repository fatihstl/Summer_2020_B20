package Day20_whileLoop;

import java.util.Scanner;

public class D_Romove_Duplicate {
    public static void main(String[] args) {
      /* . write a program that can remove the duplicates from any given String
            Ex:
                input: aabb
                output: ab      */
        Scanner input = new Scanner(System.in);
        String str= input.nextLine();
                            //  String str = "aabb"; // ==> ab olur scanner yazmadigimizda.
        String result = "";
        for (int i = 0; i <= str.length()-1; i++){
           String s = ""+ str.charAt((i)); // a, a, b, b // "" bununla concat yaptik
           if (!result.contains(s)){
               result += s;
           }
        }
        System.out.println(result);
    }
}
