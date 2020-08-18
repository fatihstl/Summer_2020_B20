package Day29_custommethod;

import java.util.function.Function;

public class G_ReturnKeyword {

   // 6. calculate the garde of the student based on the score

    public static void main(String[] args) {

        grade(110);

    }

           public static  void grade(int score) {

               if (score <0 || score >100){
                   System.out.println("Invalid Score");
                   return;

               }
               char grade = (score>= 90) ? 'A':(score >= 80) ? 'B' :(score >= 70) ? 'C': (score >= 60) ? 'D' : 'F';
               System.out.println("Grade is: "+ grade);
    }

}
