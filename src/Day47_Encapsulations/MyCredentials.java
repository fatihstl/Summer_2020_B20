package Day47_Encapsulations;

public class MyCredentials {
    public static void main(String[] args) {

        Credentials obj = new Credentials("Mike", 34);

        obj.setUsername("Cybertek");
        obj.setPassword("12345");

        System.out.println(obj.getPassword());
        System.out.println(obj.getUserName());

        System.out.println(obj.age);
        System.out.println(obj.name);
        System.out.println(obj. campanyName);




    }
}
