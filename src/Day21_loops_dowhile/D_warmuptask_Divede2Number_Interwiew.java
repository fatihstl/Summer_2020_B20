package Day21_loops_dowhile;

import java.util.Scanner;

public class D_warmuptask_Divede2Number_Interwiew {

    public static void main(String[] args) {

     /*  write a program that can divide two numbers
      without using / & % operators and retuns the devision and remainder
        ex:
        input:  10  3
        0utput: 3 with a remainder of 1  */

     int a = 10;
     int b = 3;

     int count= 0;

     while (a>= b){
         a-=b;
         count++;
         }
        System.out.println(count+ " with a remainder of " +a);


    }
}
