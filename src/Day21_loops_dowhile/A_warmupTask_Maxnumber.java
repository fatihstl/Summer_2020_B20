package Day21_loops_dowhile;

import java.util.Scanner;

public class A_warmupTask_Maxnumber {
    public static void main(String[] args) {
       // 1. write a program that asks user to enter 5 numbers and retuns the maximum number
        Scanner input =  new Scanner(System.in);

        int max = -2147483648;
     for (int i = 10; i <= 50; i+= 10){// burada 5 kez soracak
         System.out.println("Enter a number :"); // 5 kez soracak
         int num=  input.nextInt(); // istedigimizi yazabiliriz // bes kere yazdiracak ve en buyuk noyu yazacak
         if (num> max){  // bu formul bunu ezberleme.
             max= num;
         }
     }
        System.out.println("Max number: "+ max);
    }
}
