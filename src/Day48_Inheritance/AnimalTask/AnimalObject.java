package Day48_Inheritance.AnimalTask;

public class AnimalObject {
    public static void main(String[] args) {

        Dog dog1= new Dog("Winston","Medium",3, 'M', "Golden", 13.5);
        System.out.println(dog1.name);
        System.out.println(dog1.size);
        System.out.println(dog1.age);
        System.out.println(dog1.gender);

        dog1.bark();
        dog1.sleep();
        dog1.eat();
        System.out.println("Dog1: "+dog1); // bunu almak icin mutlaka toString metodu olusturmak lazim.


        // bunlarin hepsi super classtan geldi. Biz icini doldurduk.
        Cat cat1= new Cat("Altun", "Small", 1, 'M', "Van Kedisi", 5.0);
        System.out.println(cat1);
    }
}
