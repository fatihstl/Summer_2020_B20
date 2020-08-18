package Office_Hours;

import java.util.Scanner;

public class day21_minNum_Loop {

    public static void main(String[] args) {

        //2. write a program that asks user to enter 5 numbers and returns the minimum number

        Scanner input = new Scanner(System.in);

        int min= 21748364; // max num yazdik. min num bulmak icin

        for ( int i = 1 ; i <= 5; i++ ){

            System.out.println("Enter a number: "); /// istedigimiz 5 tane sayi yaziyoruz
            int num = input.nextInt();
            if (num <min){
                min=num;
        }
        }
        System.out.println("minumum number: "+ min);// statementi loopun disinda yazuyoruz.

    }
}
