package Day44_Constracter;

public class student {

    String name;
    int age;
    char gender;

    static String schoolName= "Cybertek University";

    public student (String name, int age, char gender){ // comstructor method
       this.name= name;
       this.age = age;
       this. gender= gender;
    }

  /*  public void setInfo (String name, int age, char gender){
        this. name= name;
        this.age= age;
        this.gender= gender;*/

  //  }

    public String toString (){
        return name+ age+ gender+schoolName;
    }
}
