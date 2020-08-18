package Day12_SwitchScanner;

import java.util.Scanner;

public class H_someOfTwoNumber {

    public static void main(String[] args) {

        /*write a program that can ask youser to enter two number, and the prints the sum of those two number
        Enter your first number
        10
        Enter your second number
        20 */


        Scanner input = new Scanner(System.in);
                System.out.println(" write 1 number please");
        int number1 = input .nextInt();

        System.out.println(" write 2 number please");
        int number2 = input .nextInt();

        System.out.println("your number: " +(number1 + number2));


    }
}
