package Day19_for_loop;

import java.util.Scanner;

public class D_warmUp {
    public static void main(String[] args) {

       // 7. write a program that can calculate the sum of all numbers between 1 to any given number
        //ex:         input: 100         output: 5050         input: 50         output: 127

       Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        int sum = 0;
        if (num > 1) {
            for (int i= 1 ; i<= num ; i++){
                sum += i;
            }
            System.out.println(sum);
        } else{
            System.out.println("Invalid Entry"); // - kullanisak invalid verecek.
        }

        }

}
