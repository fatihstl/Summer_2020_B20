package Day06_CompretionOperator;

public class D_SalaryCalculator {

    public static void main(String[] args) {
        /* if: rate = 55;  stateTaxRate = 0.04; federalTaxRate =0.22;
        weeklyHours = 40;  then output will be: your salary is: 105600 USD
        your total tax is: 27456 USD your income after tax is:*/

        double rate = 45; // saati
        double stateRate = 0.08;
        double fedaralTaxRate = 0.22;
        int weeklHours = 40; // kac saat calisiyosun.

        double salary = rate * weeklHours * 48; // salary formul  yillik 48 hafta oluyor. maas* saat * hafta
        double totalTax = salary * (stateRate + fedaralTaxRate); // formull
        double salaryAfterTax = salary - totalTax;  // formull

        System.out.println("$"+salary);
        System.out.println(totalTax);
        System.out.println(salaryAfterTax);





    }


}
