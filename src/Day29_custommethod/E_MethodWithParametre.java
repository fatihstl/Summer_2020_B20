package Day29_custommethod;

import java.util.Scanner;

public class E_MethodWithParametre {

    public static void main(String[] args) {

        printHello(2);
        cano( 4);

        System.out.println("============");

        Scanner input= new Scanner(System.in);
        System.out.println("Enter your birth year ");
        age (input.nextInt(), input.nextInt() );

     //   age(1979, 2020);

    }


    public static void printHello(int n){

        for (int i = 0; i<n; i++){ // dikkt kac kere oldugunu yazmadi yukarida parametrede yapti
            System.out.println("Hello World");

        }
    }

     public static void cano (int n){
        for (int i =0 ; i <=n ; i++){
            System.out.println("cano");
        }
     }

    public static void age(int birhYear, int currentYear){ // dogum yilini buluyoruz.
        if(currentYear<birhYear){
            System.out.println("Invalid Enter");
        } else {
            int age = currentYear- birhYear;
            System.out.println("You are "+ age+ " years old");
        }

    }




}
