package Day21_loops_dowhile;

import java.util.Scanner;

public class C_minAndMax {
    public static void main(String[] args) {

        // ennter 5 number max min number
        Scanner scan = new Scanner(System.in);

        int max = -999999999; // any user entered input WILL BE greater than  -999999999
        int min = 999999999; // any user entered input WILL BE less than  999999999

        for(int i=1; i<= 5; i++){

            System.out.println("Enter a number");
            int num = scan.nextInt();

            if(num > max){
                max =num;
            }

            if(num < min){
                min =num;
            }

        }

        System.out.println("Maximum number is: "+max);
        System.out.println("minimum number is: "+min);
    }
}