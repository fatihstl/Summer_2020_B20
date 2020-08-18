package Day39_CustomClass;

public class Dog {

    String name;
    String breed;
    String size;
    int age;
    String color;



    public void setDogInfo (String dogName, String dogBreed, String dogSize, int dogAge, String dogColor){
        // simdi dort argumantemiz var. set info ile kopegin bilgilerini kurduk.

        name= dogName;
        breed= dogBreed;
        size = dogSize;
        age = dogAge;
        color = dogColor;

        /*
        dog1 : husky
        dog2: pitbull
        dog3: golden retriever.        // bunlar icin simdi metod kuracagiz.
         */


    }

    public void getDogInfo(){
        System.out.println("Name: "+ name+ ", Breed:  "+ breed+ ", size:  "+size+ ", color:  "+color+ ", age: "+age);
    }

     public void eat (String food){
         System.out.println(name+ "  is eating "+food );
     }

     public void drink (String drink){
         System.out.println(name+ " is drinking "+drink);
     }
       public void sleep (String sleep){

           System.out.println(name+ " is sleeping  "+ sleep);
       }

    public void play (String play){
        System.out.println(name+ " is " + play);
    }

}
