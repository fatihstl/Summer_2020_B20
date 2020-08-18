package Day41_toStirngMethod;

public class Cat {

    String name;
    int age;
    char gender;
    String color;
    String breed;

    public void setInfo( String name, int age, char gender, String color, String breed) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.color = color;
        this.breed = breed;

    }

   public void eat (String catFood){
       System.out.println(name + " is eating "+catFood);
   }

   public void drink (String catdrink){
       System.out.println(name+ " is drinking "+catdrink);
   }

     public String toString(){
        return "Name: "+name+ " Breed: "+ breed+ " Gender: "+gender+ " Age: "+age+ " Color: "+color;
     }

}