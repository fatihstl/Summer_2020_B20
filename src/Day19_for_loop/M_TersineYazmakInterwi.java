package Day19_for_loop;

import java.util.Scanner;

public class M_TersineYazmakInterwi {
    public static void main(String[] args) {
                  // tersinden yazmak interwiew
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
          String str=  input.nextLine();  // loop ile

       // String str = "Fatih"; /// hitaF pool ile
        String result = "";
        for (int i = str.length()-1 ; i >= 0 ; i--){
         result += str.charAt(i);

        }
        System.out.println(result);

    }


}
