package Day57_Polymorphism.EmployeeTask;

public class ScrumMaster  extends Employee{
    public ScrumMaster(String name, int id, String jobTitle, double salary, char gender) {
        super(name, id, jobTitle, salary, gender);
    }

    @Override
    public void work() {
        System.out.println("Scrum Master "+name+ " is working");

    }



}
