package Office_Hours.Pratice_09_08_2020_Encapsulations;

public class TestCases {
    public static void main(String[] args) {

        Credentials c1= new Credentials();
        System.out.println("Username "+c1.getUserName());
        System.out.println();


        c1.setUserName("Batch20");
               System.out.println("New User Name Entered: "+ c1.getUserName());


        System.out.println("===================================================");
        System.out.println("Paswrod enteres: "+c1.getPassword());

        c1.setPassword("JavaTuttles");










    }
}
