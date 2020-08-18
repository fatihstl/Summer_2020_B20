package Day14_Recap;

import java.util.Scanner;

public class F_NestedIf {
    public static void main(String[] args) {

      /*  write a program that can caluclate the garade of the student based on the given score
        90 <= score <= 100 ==> Excellent
        80 <= score <= 89 ==> Great
        70 <= score <= 79 ==> Good
        60 <= score <= 69 ==> Passed
        0 <= score <= 59 ==> Failed
        other == > Invalid Entry*/

        Scanner input = new Scanner(System.in);

        System.out.println("write your score");
        double score = input.nextDouble();
        input.close();  // kapattim

        String result = " ";

        if (score >= 0 && score <= 100){
            if ( score >= 90){
                result = "Excellnt";
              } else if (score >=80) {
                result = "Great";
            } else if (score >= 70){
                result = "Good";

            } else if (score >= 60){
                result= "Passed";
            } else {
                result = "Failed";
            }

        } else {

            result = "Invalid Entry";
        }

        System.out.println(" your Score : "+ result);






    }
}
