package Day48_Inheritance.AnimalTask;

public class Cat extends  Animal {
    /*
    Animalki tum metod ve veriablelari kullanabiliriz.
     */
    public Cat (String name, String size, int age, char gender,String breed, double lb ){
        setInfo(name, size, age, gender, breed, lb);
    }
    public void meow(){
        System.out.println(name + " meowing");
    }
}
