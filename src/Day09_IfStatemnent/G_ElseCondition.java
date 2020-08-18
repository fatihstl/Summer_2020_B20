package Day09_IfStatemnent;

public class G_ElseCondition {

    public static void main(String[] args) {

 // Oy kullanma ornegi

     int age = 18;
     boolean IsCitizen = true;

     boolean eligiblaToVote = age >= 18 && IsCitizen == true;

    String eligible = "";

     if (eligiblaToVote){
          eligible = "You are eligeble to vote.";
     }
     else {
         eligible = "You are not eligible to vote";
     }
        System.out.println(eligible);
    }

}
