package Day10_IfStatement;

public class D_GradeCalculator {
    public static void main(String[] args) {

      /*  int  score = 85;
        String grade = "";
        if (score >= 90 && score <= 100){ //
            grade = "A";
        }else if (score >=80 && score <= 89){
            grade = "B";
        } else if (score>= 70 && score<= 79 ){
            grade = "C";
        } else if (score >= 60 && score <= 69){
            grade = "D";
        } else {
            grade= "F";
        }
        System.out.println("Notunuz " + grade);*/

        int grade = 100;
        String result = "";

        if (grade >= 90) {
            result = "Your Grade A";
        } else if (grade < 89 && grade >= 80) {
            result = "Your Grade B";
        } else if (grade < 80 && grade >= 70)
            result = "Your Grade C";
        else if (grade < 70 && grade >= 60) {
            result = "Your Grade D";
        } else {
            result = "Your grade is F";
        }
                System.out.println(result);
            }
        }

