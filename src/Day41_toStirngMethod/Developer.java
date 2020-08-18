package Day41_toStirngMethod;

public class Developer {
    String name;
    double salary;
    String gender;
    int age;
    public void setInfo(String name, double salary, String gender, int age){
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.age = age;
    }

    public void coding(){
        System.out.println(name+" is coding");
    }

    public void fixBugs(){
        System.out.println(name+" is crying");
    }

    public String toString(){
        return "Name: "+name+", Gender: "+gender+", Age: "+age+", Salary: "+salary;
    }
    }

class DeveloperObject{
    public static void main(String[] args) {
        Developer[] developers ={new Developer(), new Developer(), new Developer(), new Developer(), new Developer()};
        developers[0].setInfo("Ahmet", 125000, "Male", 30);
        System.out.println( developers[0] );
    }
}









