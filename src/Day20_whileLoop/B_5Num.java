package Day20_whileLoop;

import java.util.Scanner;

public class B_5Num {
    public static void main(String[] args) {

    //    2. write a program that can ask the user enter a number for five times and the returns
        //    the sum of those five numbers

        Scanner input =  new Scanner(System.in);

           int sum = 0;
        for (int  i = 10 ; i <= 50 ; i+= 10){
            System.out.println("Enter a number: ");
            int num = input.nextInt();
            sum += num;

        }
        System.out.println(sum);

    }

}
