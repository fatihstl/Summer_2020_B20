package Day49_Inheritance.ScrumTeamTask;
/*
 create a class called Person
                attributes:  name, age, gender
                methods: eat, walk, sleep, setPersonInfo

 */
public class Person {

   public String name;
   public String age;
   public char gender;

   private long ssn;

   public void setInfo(String name, String age, char gender){
       this.name= name;
       this.age= age;
       this.gender= gender;

         }

   public long getSsn(){
       return ssn;
   }

   public void setSsn(long ssn){
      this.ssn = ssn;
   }

    public void eat(){ // we dont want this to be inherited to the sub classes
       System.out.println(name +" is eating");
    }

    public void walk(){// we dont want this to be inherited to the sub classes
        System.out.println(name +" is walking");
    }

    public void sleep(){ // bu method sublara GIDECEK
        System.out.println(name +" is sleeping");
    }



}
