package Day41_toStirngMethod;

public class Tester {

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

    public String toString(){
        return "Name: "+name+", Gender: "+gender+", Age: "+age+", Salary: "+salary;
    }



}
 // public class  burada baslamali 0 curlybrace olmale

class testerObject{
    public static void main(String[] args) {

        Tester[] tester = {new Tester(), new Tester(), new Tester(), new Tester(), new Tester()};

        tester[0].setInfo("ALiya", 150000, "Fqmel", 18);
        tester[1].setInfo("Veiya", 150000, "Fqmel", 18);
        tester[2].setInfo("DEiya", 150000, "Fqmel", 18);
        tester[3].setInfo("Zeliya", 150000, "Fqmel", 18);

        for(Tester each  : tester ){
            System.out.println(each);
        }

    }
}