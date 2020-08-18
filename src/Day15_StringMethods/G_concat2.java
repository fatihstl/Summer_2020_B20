package Day15_StringMethods;

import java.util.Scanner;

public class G_concat2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" Enter your first name");
        String firstName =  input.next();


        System.out.println(" Enter your first name");
        String lastName =  input.next();

       String fullName=   firstName.concat(" " +lastName);
      //String fullName = firstName+ " " + lastName; // boyle de yapa

        System.out.println(fullName);





    }
}
