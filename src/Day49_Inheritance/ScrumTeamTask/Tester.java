package Day49_Inheritance.ScrumTeamTask;
/*
 create a subclass of Employee called Testers
                    Attributes:
                        name, age, gender, Salary, ID, jobTitle
                    Actions:
                        setInfo(), smokeTesting(),  creatingTicket(), toString()

 */
public class Tester extends Employee {

    public Tester (String name, String age, char gender,double salary, int ID, String jobTitle){
        setInfo(name, age, gender, salary, ID, jobTitle); // bunlari employeeden cektim.
    }

    public void smokeTesting(){
        System.out.println("Tester "+name+" is performing, while drinking cofee");
    }
    public void creatingTicket(){
        System.out.println(name+ "is creating ticket on JIRA");
    }

}
