package Day58_Polimorphism.AnimalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Winston",4, 'M');
        dog1.sleep();
        dog1.eat();
        dog1.bark();

        System.out.println(dog1.dogName);
        System.out.println(dog1.age);
        System.out.println(dog1.gender);


        // polimorfisim
        System.out.println("==================================================================");
        Animal animal1 = new  Dog("Gizy", 4, 'M');
        animal1.sleep();
        animal1.eat();
       // animal1.bark();

       // System.out.println(animal1.dogName);
        System.out.println(animal1.age);
        System.out.println(animal1.gender);

        System.out.println(animal1);


    }


}
