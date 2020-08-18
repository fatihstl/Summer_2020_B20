package Day13_Scanner;

import java.util.Scanner;

public class H_Nextline_ {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your bulding number");
        int buildingNumber =  input.nextInt();

        input.nextLine();
        System.out.println("Enter your street name");
        String streetname = input.nextLine();

        System.out.println(buildingNumber+ " " + streetname);
      input.close();
    }
}
