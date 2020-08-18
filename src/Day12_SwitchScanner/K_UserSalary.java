package Day12_SwitchScanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class K_UserSalary {

    public static void main(String[] args) {

        // aylik maas
        // hourRate = salaray / (weeklyHouur *52)

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        double salary = input.nextDouble();

        System.out.println("How many hours you work in a week");
        int weeklyOur = input.nextInt();
        int totalHours = weeklyOur * 52;

        double hourlyRate = salary /totalHours;

        System.out.println("Your hourly rate is: $" +hourlyRate  );


        System.out.println();







    }
}


