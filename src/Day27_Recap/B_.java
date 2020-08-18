package Day27_Recap;

import java.util.Arrays;
import java.util.Scanner;

public class B_ {
    public static void main(String[] args) {

        int [] numbers = new int [5];
        numbers [0]= 25;

        System.out.println(Arrays.toString(numbers));


        System.out.println("=========================");

        Scanner input = new Scanner(System.in);
        String [] students = new String[3];

       /* System.out.println("Enter a name");
        students[0] = input.nextLine();

        System.out.println("Enter a name");
        students[1] = input.nextLine();

        System.out.println("Enter a name");
        students[2] = input.nextLine();

        System.out.println("Enter a name");
        students[3] = input.nextLine();

        System.out.println("Enter a name");
        students[4] = input.nextLine(); */

        Scanner scan = new Scanner(System.in);
        System.out.println("How many names do you want to enter"); // uc kez assing ettik

       // String[] students = new String[ scan.nextInt() ]; //3Enter

        scan.nextLine(); // take out the Enter in scanner
        for(int i = students.length-1 ; i >= 0; i--){ //i: 0,1,2,3...students.length-1
            System.out.println("Enter a name");
            students[i]  = scan.nextLine();
        }


        System.out.println(Arrays.toString(students));


    }
}
