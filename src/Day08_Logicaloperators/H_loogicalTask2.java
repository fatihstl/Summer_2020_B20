package Day08_Logicaloperators;

public class H_loogicalTask2 {
    public static void main(String[] args) {

        String firstName= "Conor";
        String LastName = "McNugget";
        String fullName = firstName+ " "+ LastName;


        int age = 42;
        String citizenship1 = "USA";
        String Citizenship2 = "Turkey";


        boolean eligibleAge = age >= 18;
        boolean usCitizenship = citizenship1== "USA" || Citizenship2 == "USA";

        boolean eligableToVote = eligibleAge && usCitizenship;


        System.out.println( fullName+ " is aligable to vote "+ eligableToVote);

           System.out.println(eligableToVote);




    }




}
