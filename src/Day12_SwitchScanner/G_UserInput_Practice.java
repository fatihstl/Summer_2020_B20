package Day12_SwitchScanner;

import java.util.Scanner;

public class G_UserInput_Practice {


    public static void main(String[] args) {

        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        double num = input.nextDouble();

       // burada ternery yapti.
        String result =  num %2==0 ? " is even" : " is odd";

        System.out.println(result);*/

        Scanner input = new Scanner(System.in);
        System.out.println("Please write a number: ");
        double num =  input.nextDouble();

        String result =  (num  %2== 0) ? " Even " : "odd";
        System.out.println(result);
    }
}
