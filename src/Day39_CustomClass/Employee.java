package Day39_CustomClass;

public class Employee {
    // attributeleri  employename,  gender, ssn, jobtitle, salary


    String Name;
    char gender;
    String jobTitle;
    double salary;

    public void setEmpleyeeName(String Name, char gender,  String jobTitle, double salary) {

        this.Name= Name;
        this.gender= gender;
        this.jobTitle= jobTitle;
        this.salary= salary;

    }
 public void getEmployeeInfo(){
     System.out.println("Name: "+Name+ ", Gender: "+ gender+ ", Job Title"+ jobTitle+ ",  Salary: "+ salary);


 }

}


