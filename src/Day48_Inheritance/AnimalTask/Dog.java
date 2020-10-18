package Day48_Inheritance.AnimalTask;

public class Dog extends Animal{
      // kopek child/sub class  animal super/parent class oluyor.


    /*
    Animal class 4 verible vae ve 5 metodum var.
    method:3
     */


    public Dog (String name, String size, int age, char gender, String breed,  double lb){
        setInfo(name, size, age, gender, breed, lb);
    }

    public void bark (){
        System.out.println((name+ " is barking"));
    }



}
