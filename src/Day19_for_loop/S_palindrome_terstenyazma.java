package Day19_for_loop;

import java.util.Scanner;

public class S_palindrome_terstenyazma {

    public static void main(String[] args) {
        String str = "kayak";
        String reversedStr = "";
        for (int i = str.length()-1 ; i>= 0 ; i--){
           reversedStr +=  str.charAt(i);
        }
        System.out.println(reversedStr);

/// tersten yazma.
        String str1= " Busra";
        String result = "";
        for (int i = str1.length()-1; i>= 0; i--){
            result += str1.charAt(i);
        }
        System.out.println(result+ " ");


        Scanner input =  new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String adi= input.nextLine();

        String result3= "";
        for (int i =adi.length()-1; i>= 0; i--){
            result3 += adi.charAt(i);
        }
        System.out.println("Adimin tersi: "+ result3);

    }
}
