package Day47_Encapsulations;

import Day42_static.CapitalOne;

public class CapitalOneEmployees {

  /*
 2. create a class called CapitalOneEmployees
                instance variables:
                        employeeName
                        employeeAge
                        jobTitle
                    private ID
                    private salary
                    private address
                    company name = "Capital One"
                    generate getters & setters for private variables
​
 */
    String employeeName;
    int age;
    String employeeJobTitle;

    private int ID;
    private double salary;
    private String address;



  public CapitalOneEmployees(String employeeName, int age, String employeeJobTitle){

      this.employeeName= employeeName;
      this.age= age;
      this.employeeJobTitle= employeeJobTitle;


    }

    public static String campanyName;

   static{
       campanyName= "Capital One";
   }


    // privateler icin setterler
    public void setId(int ID){
        this.ID= ID;
    }
    public void setSalary( double salary){
        this.salary= salary;
    }
    public void setAddress (String address){
        this.salary= salary;
    }

    // privateler icin getter
    public int getID(){
        return ID;
    }
    public double getSalary(){
        return salary;
            }
    public String getAddress(){
        return  address;
    }

    // string metodu koyduk.
    public String toString (){
        return "Name: "+employeeName+ ", Age: "+age+", Job Title:  "+employeeJobTitle+ ", ID "+getID()+", Salary: "+getSalary();
    }



}
