package Office_Hours;

import java.util.Scanner;

public class day21_minAndMax {
    public static void main(String[] args) {

        int max = -999999999; // any user entered input WILL BE greater than  -999999999
        int min = 999999999; // any user entered input WILL BE less than  999999999

        for(int i=1; i<= 5; i++){
            Scanner scan = new Scanner(System.in);
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