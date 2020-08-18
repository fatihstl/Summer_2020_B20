package Office_Hours;

import java.util.Scanner;

public class Day21_maximumnumber_loop {

    public static void main(String[] args) {
       // 1. write a program that asks user to enter 5 numbers and retuns the maximum number
       Scanner input =  new Scanner(System.in);

        int max = -2147483648;
        for (int i = 1; i <= 5; i++){// burada 5 kez soracak
            System.out.println("Enter a number :"); // 5 kez soracak
            int n=  input.nextInt(); // istedigimizi yazabiliriz // bes kere yazdiracak ve en buyuk noyu yazacak
            if (n> max){  // bu formul bunu ezberlemek lazim.
                max= n;
            }
        }
        System.out.println("Max number: "+ max);

    }
}
