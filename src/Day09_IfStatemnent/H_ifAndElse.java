package Day09_IfStatemnent;

public class H_ifAndElse {
    public static void main(String[] args) {
         // Alkol ornegi uzerinden else if ornegi

      /*  int age = 26;


        if (age >= 21){
            System.out.println("You are eligible");


        }
        else {
            System.out.println("you are not aligible ");
        }*/


      int  age = 21;
      boolean IsID = true;

      boolean  eligible =  age >= 21 && IsID == true;

      String result = "";

      if (eligible){
          result = " You are eligible";
          }

          else {
        result = "You are not eligible";
          }
    }


}
