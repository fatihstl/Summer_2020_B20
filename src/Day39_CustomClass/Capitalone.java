package Day39_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Capitalone {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();



    employee1.setEmpleyeeName("Ali",'F', "QA",250000);
    employee2.setEmpleyeeName("Veli", 'M',"QA",120000);
    employee3.setEmpleyeeName("Deli",'F', "QA",12000);
    employee4.setEmpleyeeName("Hali", 'M',"QA",100000);
    employee5.setEmpleyeeName("MOli", 'M',"QA",95000);

         // Array ile iss kolaylastiriyoruz.
        ArrayList<Employee>employeeList = new ArrayList<>();
        employeeList.addAll(Arrays.asList(employee1, employee2, employee3, employee4, employee5));

        for (Employee each : employeeList){
            each.getEmployeeInfo();
        }

        // max maas alanlari buluyoruz. Bu kismi luks
      /*double max = Integer.MIN_VALUE;
        String name = "";
        for (Employee each : employeeList){
            double  eachSalary = each.salary;
            if(eachSalary>max) {
                max = eachSalary;

            }
        }
        System.out.println(max); */

        System.out.println("========================================================");

        // 100.000 den asagisini sil
        employeeList.removeIf(p->p.salary<100000);// employler oluyor.
        employeeList.removeIf(p->p.jobTitle.equals("QA")); // QaLERI SIL
        employeeList.removeIf(p->p.Name.toLowerCase().contains("m")); // isms m ile baslayani sil

              for (Employee each: employeeList){
                 each.getEmployeeInfo(); // 100 binin altini sildi.

              }








    }
}
