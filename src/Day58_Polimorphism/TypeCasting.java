package Day58_Polimorphism;

import Day57_Polymorphism.PhoneTask.Iphone;
import Day57_Polymorphism.PhoneTask.Phone;
import Day57_Polymorphism.PhoneTask.Samsung;
import Day58_Polimorphism.AnimalTask.Animal;
import Day58_Polimorphism.AnimalTask.Cat;
import Day58_Polimorphism.AnimalTask.Dog;

public class TypeCasting {
    public static void main(String[] args) {


        Dog dog1 = new Dog ("A", 2, 'F');
        Animal animal = dog1; // implicitly done kendiligindein olur


        Cat cat1 = new Cat("A", 2, 'F'); // kendiliginden olur.
        Animal animal1 = cat1;

        System.out.println("====================================================================");

        int x = 100;
        byte y = (byte) x; //manual yapmaz isen explicitly olur.

        Animal animal3 = new Dog ("A", 2, 'F');

       // Dog dog2 = animal3; // yapammazsin. down casting yapmalisin.

        Dog dog2 = (Dog) animal3; // boyle olur.

        dog2.bark();


        System.out.println("================================================");

        // upcasting -  dogal olarak
        Phone phone1 = new Iphone("12", "6", 1200);
        Phone phone2 = phone1;// implicitly dogal.


        // downcasting

        Phone phone3 = new Samsung("s20", "9", 1100);
        Samsung phone= (Samsung) phone3;// downcasting yaptik. manual olarak yaptik.


        Phone phone5 = (Iphone) phone3;











    }

}
