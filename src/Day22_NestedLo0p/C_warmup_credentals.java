package Day22_NestedLo0p;

import java.util.Scanner;

public class C_warmup_credentals {

    public static void main(String[] args) {
        // username cyber  pasword tek123
        // uc kere soracak eger yanlis yazarsa blok yapacak.

       Scanner scan = new Scanner(System.in);
       System.out.println("Enter your user name: ");
       String u =  scan.nextLine();

        System.out.println("Enter your pasword: ");
        String p =  scan.nextLine();

         int attempt = 0;
        while ( ! (u.equals("Cyber") && p.equals("tek123"))){

            if (attempt > 3 ){
                System.out.println(" your account is locked");
                System.exit(0);
            }

            System.out.println(" Invalid user name or pasword, please re-enter: ");


            System.out.println("Enter your user name: ");
            String u1 =  scan.nextLine();

            System.out.println("Enter your pasword: ");
            String p1 =  scan.nextLine();

            attempt++;
        }

    }
}
