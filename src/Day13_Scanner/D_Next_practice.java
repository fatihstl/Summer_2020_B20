package Day13_Scanner;

import java.util.Scanner;

public class D_Next_practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.next();

        System.out.println("Enter your last name: ");
        String lastName = input.next();

        String fullName = firstName+ " "+ lastName;
        System.out.println(" Your full  name: " +fullName);

    }
}
