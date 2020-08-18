package Day14_Recap;

import java.util.Scanner;

public class B_NexlLine_DikkatEt {

    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        input.nextLine();// bu cok onemli
        System.out.println("Enter your full name");
        String fullName = input.nextLine();




    }
}
