package Day34_WrapperClass_ArrayIntro;

import java.util.Scanner;

public class F_WrapperClass_practice2_MAX_MIN {

    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;

        System.out.println(a); // int max verir.


        byte b = Byte.MAX_VALUE;
        System.out.println(b);

        // int min number buluyoruz.
        int a2 = Integer.MIN_VALUE;
        System.out.println(a2);

        System.out.println("=============================");

        Scanner input = new Scanner(System.in);
        int max= Integer.MIN_VALUE;
        int min =  Integer.MAX_VALUE;

        for (int i = 1; i<= 5; i++){
            System.out.println("Enter a number ");
            int n = input.nextInt();

            if (n>max){
                max= n;
            }
            if (n<min){
                min= n;
            }
        }
        System.out.println("Max: "+ max);
        System.out.println("Min:"+ min);




    }
}
