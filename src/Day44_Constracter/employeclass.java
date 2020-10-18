package Day44_Constracter;

import Day39_CustomClass.Employee;

public class employeclass<gender> {

    /*    warmup task:
            1. Create a class called Employee
            instance variables:
    name, id, ssn, jobTitle, salary, gender
    static variables:
    isEmployeed, hasSalary

    actions:
    setEmployeeInfo(): can initialize all the instance variables
    toString(): can return the info of the employee as string

   */


    String name;
     int id;
     int ssn;
     String jobTitle;
     double salary;
     char gender;

     static boolean  isEmployeed;
     static boolean hasSalary;

     static { // sadece bir kez calisir.
         isEmployeed= true;
         hasSalary= true;
     }


    public void setEmployeeInfo( String name, int id, int ssn , String jobTitle, double salary, char gender){
        this.name= name;
        this.id= id;
        this. ssn= ssn;
        this. jobTitle= jobTitle;
        this. salary=  salary;
        this. gender=  gender;

        isEmployeed= true;
        hasSalary= true;


    }

    public String toSting(){
         return "Name: "+ name+"\n Gender: "+gender+ "\n ID: "+id+ " \n ssn: "+ssn+  "\n Jobtitle: "+jobTitle+"\n Salary: "+salary;
    }

}
