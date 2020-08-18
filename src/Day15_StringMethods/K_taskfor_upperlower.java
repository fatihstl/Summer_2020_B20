package Day15_StringMethods;

import java.util.Scanner;

public class K_taskfor_upperlower {

    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);
      System.out.println("Enter your first and Name");
        String fullName = input.nextLine();
           fullName=  fullName.toUpperCase();

        System.out.println(fullName);

        System.out.println("write fist: ");
        String birinci= input.nextLine();
        int birinsonuc = birinci.length();
        System.out.println();

        System.out.println("write second: ");
        String ikinci = input.nextLine();







    }
}
