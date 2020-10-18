package Day58_Polimorphism.AnimalTask;

public class Dog extends Animal{

public String dogName;

    public Dog(String dogName, int age, char gender) {
        super(age, gender);
        this.dogName= dogName;
    }

    public void bark(){
        System.out.println("Dog "+dogName+" is barking");
    }

    public void eat(){
        System.out.println("Dog "+ dogName+ " is eating");
    }

    public void sleep(){
        System.out.println("Dog "+ dogName+ " sleeping");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", age=" + age +
                '}';
    }



}
