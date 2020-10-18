package Day47_Encapsulations;

import java.time.LocalDate;

/*
 name
* */
public class Person {


    public String name;
    public int age;
    public char gender;


    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    private int ID;
    private long ssn;
    private  String address;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String toString(){
        return "Name: "+name+ ", Age: "+age;
    }
}
