package Day14_Recap;

import java.util.Scanner;

public class D_adress {
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

        System.out.println("Enter your bulding number: ");
        int buldingNumber = input.nextInt();

        input.nextLine();

        System.out.println(" Enter Your Street Adrees:");
        String streetAdress = input.nextLine();

        System.out.println("Enter your city name");
        String yourCity = input.nextLine();

        System.out.println("Enter your state name");
        String stateName =  input.nextLine();

        System.out.println("Enter your zip code");
        int  zipCode=  input.nextInt();

        input.nextLine();

        System.out.println("Enter Your full Name");
        String fullName = input.nextLine();

        System.out.println(fullName+ "\n"+ buldingNumber+ " "+ streetAdress +"\n"+yourCity+ ", "+ stateName+ " "+ zipCode);





    }
}
