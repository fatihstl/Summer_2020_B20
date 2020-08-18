package Day13_Scanner;

import java.util.Scanner;

public class F_Nextline_VSNestMethod_Karisacak {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double salary = scan.nextDouble();

        scan.nextLine();// bu isi cozuyor.

         System.out.println("Enter your full name: ");
        String fullName =  scan.nextLine();

       // System.out.println(" enter you mim salary");
     //   double momsalary = scan.nextDouble();

       // sout("babainin dadi");

        System.out.println("Salary: "+salary);
        System.out.println("full name: "+fullName);




    }

}
