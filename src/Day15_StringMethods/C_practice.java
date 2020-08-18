package Day15_StringMethods;

import java.util.Scanner;

public class C_practice {

    public static void main(String[] args) {

        // charAt() ile initial buluyoruz.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String name =  input.next();
        char firstName = name.charAt(0);


        System.out.println("Enter your last name: ");
        String name2 = input.next();
        char lastName = name2.charAt(0);

        System.out.println(" your initial : "  +firstName + ""+ lastName);





    }

}
