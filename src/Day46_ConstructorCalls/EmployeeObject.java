package Day46_ConstructorCalls;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee empoyee1 =  new Employee("Cristina");
        System.out.println(empoyee1);

        System.out.println("====================================================");

        Employee employee2 = new Employee("Cano", "QA");
        System.out.println(employee2);


        System.out.println("===============================================");
        Employee employee3 = new Employee("Hakan", "SDET", 123456);
        System.out.println(employee3);


        System.out.println("=================================================");
        Employee employee4 = new Employee("Hakan", "SDET", 123456, 120_000);
        System.out.println(employee4);


        System.out.println("========================================================");

        ArrayList<Integer> list1 = new ArrayList<>();

        ArrayList<Integer> list2 = new ArrayList<>(list1);
        ArrayList<Integer> list3 = new ArrayList<>(  Arrays.asList(1,2,3,4,5)   );

    }
}
