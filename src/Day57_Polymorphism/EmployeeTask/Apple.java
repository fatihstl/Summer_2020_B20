package Day57_Polymorphism.EmployeeTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Apple {

    public static void main(String[] args) {

        Employee tester1 = new Tester("Andrii", 12456, "QA", 120000, 'M');
        Employee tester2 = new Tester("Deli", 12456, "QA", 140000, 'F');



        Employee developer1 = new Developer("Nihal", 12456, "QA", 140000, 'F');
        Employee developer2 = new Developer("Veli", 12456, "QA", 140000, 'F');


       // Employee scremmaste1= new ScrumMaster("Veli", 12456, "QA", 140000, 'F);

        // scrum team
        ArrayList<Employee> scrumTeam = new ArrayList<>();
        scrumTeam.addAll(Arrays.asList(tester1, tester2, developer1, developer2));


        for(Employee each : scrumTeam){
            System.out.println(each);
        }



    }

}
