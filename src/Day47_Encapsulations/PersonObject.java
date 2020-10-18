package Day47_Encapsulations;

public class PersonObject {
    public static void main(String[] args) {

        Person person1= new Person("JAke",34, 'M' );

        System.out.println(person1);


        // person.ssn= 4321;
        person1.setSsn(98764);
        person1.setID(98);
        person1.setAddress("MO");

        System.out.println("SSN: "+person1.getSsn());
        System.out.println("ID: "+person1.getID());
        System.out.println("Adress: "+person1.getAddress());

    }
}
