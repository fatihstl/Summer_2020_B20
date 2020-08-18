package Day11_NestedIfSwich;

public class G_Nested {
    public static void main(String[] args) {

           int grade = 90;
       String result =  "";

       if (grade <= 100 && 0 <= grade ) {

           if (grade >=90){
           result = "A";
       } else if (grade >= 80){
           result = "B";
           }else if (grade >= 70){
               result = "C";
               } else if (grade >= 60){
               result = "D";
           } else {
               result = "F";
           }
              }
          else {
              result = "Invalid";
       }
        System.out.println(" Your score is : " +result);
    }
}
