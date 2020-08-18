package Day13_Scanner;

import java.util.Scanner;

public class A_WarmupTask {
    public static void main(String[] args) {
  // Salary after tax ornegi scanner.

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        int salary = input.nextInt();

        System.out.println("Enter your state tax rate");
        double stateTaxRate = input.nextDouble();

        double stateTax = salary * stateTaxRate;

        System.out.println("Enter your fedaral tax rate");
        double fedaralTaxRate =  input.nextDouble();

        double fedaralTax = salary * fedaralTaxRate;

        double salaryAfterTax = salary- stateTax-fedaralTax;

        System.out.println("Your salary : $"+salary);
        System.out.println("your state tax: $" +stateTax);
        System.out.println("your federal tax $" + fedaralTax);
        System.out.println(" your salaray after tax $"+ salaryAfterTax);







    }
}
