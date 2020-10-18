package Day47_Encapsulations;

import Day42_static.CapitalOne;

public class EmployeeObject {
    public static void main(String[] args) {

        CapitalOneEmployees employee1 =  new CapitalOneEmployees("Fatih", 42, "QA");


        employee1.setId(123);
        employee1.setAddress("St. LOUIS");
        employee1.setSalary(100_000);

        System.out.println(employee1.employeeName);
        System.out.println(employee1.age);
        System.out.println(employee1.employeeJobTitle);
        System.out.println(employee1.campanyName);


        System.out.println(employee1.getID());
        System.out.println(employee1.getAddress());
        System.out.println(employee1.getSalary());

        System.out.println(employee1);

    }
}
