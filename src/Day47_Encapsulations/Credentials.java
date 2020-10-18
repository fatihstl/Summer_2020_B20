package Day47_Encapsulations;

 /*1. create class Credentials
            instance variables:
public name
public age
private username
private password
        getter & setter
        add a constructor to set name & age */



public class Credentials {

    public String name;
    public int  age;


    private String userName  ="123456";
    private String password = "Cybertek";


    public static String campanyName;
    static {
        campanyName= "Facebook";
    }

    public Credentials(String name, int age) {
        this.name = name;
        this.age = age;
            }

public void setUsername(String userName){
       this.userName= userName;
}
public void setPassword(String password){
         this.password= password;
}
public String getUserName(){
        return userName;
}
public String getPassword(){
        return password;
}

}