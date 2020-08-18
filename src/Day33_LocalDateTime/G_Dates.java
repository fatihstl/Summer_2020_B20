package Day33_LocalDateTime;

import java.time.LocalDate;
import java.util.Scanner;

public class G_Dates {
    public static void main(String[] args) {

        // of method
        LocalDate DOB=  LocalDate.of(2020, 7, 24);
        System.out.println(DOB);


        // now method su ansaat.
        LocalDate today=   LocalDate.now();
        System.out.println(today);

        //
        boolean result = today.isLeapYear();
        System.out.println(result);

        // scannerli ornek
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year");
        int year= scan.nextInt();

        boolean result2 = LocalDate.of(year, 1, 1).isLeapYear();
        System.out.println(result2);

        // tum tarihleri alacagiz scanner ile
        System.out.println("Enter birtyear, month, day");
       LocalDate d=  LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());
        System.out.println(d);



    }
}
