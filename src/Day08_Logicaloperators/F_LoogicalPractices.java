package Day08_Logicaloperators;

public class F_LoogicalPractices {
    public static void main(String[] args) {


        int age = 18;
        String citizenship = "USA";

        boolean eligableVote = age>= 18 && citizenship==  "USA";
        System.out.println(eligableVote);


        // Ikinci ornek // ornek bitmedi.
        String  lastName  = "Fatih";
        String firstName =  "Iyiyol";
        String fullName= firstName + " " + lastName;

        int age1 = 42;
        String citizenship1 = "Turkey";

        boolean eligableVote1 = age1>= 18 && citizenship1==  "USA";
        System.out.println(fullName+ " is eligible ");


        boolean r8 = true == !false || false == true;
        System.out.println(r8);



        // Ornek oy icin
        int yas = 43;
        String Id1 = "Turkey1";
        boolean vote1 =  yas >= 18 && Id1 == "USA";
        System.out.println(vote1);



            }


}
