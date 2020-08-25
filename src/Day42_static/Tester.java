package Day42_static;
// Create a class called Testers
// atribute : name, employed Id, JobTitle, Salary
// Actions: setInfo, smokeTestind(), creatingTicket(), toString();

public class Tester {
    String name;
    char gender;
    long employeeID;
    String jobTitle;
    double salary;

    public void setInfo(String name, char gender,long employeeID, String jobTitle, double salary){
        this.name=name;
        this.employeeID=employeeID;
        this.jobTitle=jobTitle;
        this.salary=salary;
        this.gender = gender;
    }

    public void smokeTesting(){
        System.out.println(name+" smoke testing");
    }

    public void creatingTicket(){
        System.out.println(name+" is creating ticket");
    }

    public String toString(){
        return "Name: "+name+", Gender: "+gender+", Job Title: "+jobTitle+", Salary: "+salary+", Employee ID: "+employeeID;
         }

         }
