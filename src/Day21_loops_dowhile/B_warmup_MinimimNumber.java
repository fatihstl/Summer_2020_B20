package Day21_loops_dowhile;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class B_warmup_MinimimNumber {
    public static void main(String[] args) {
        //2. write a program that asks user to enter 5 numbers and returns the minimum number

        Scanner input = new Scanner(System.in);

        int min= 21748364; // max num yazdik.

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


