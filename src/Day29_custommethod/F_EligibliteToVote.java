package Day29_custommethod;

public class F_EligibliteToVote {

      //4. check eligibility to vote
          // age, citizen, name
      public static void main(String[] args) {

          vote("John,", 28, true, "Biden");
          vote("Daniel,", 16, true, "Biden");


          eligibleToBuyAlkol(true, 25);
          calculator(100, '+', 20);

      }


              // Birinci ornek
    public static void vote (String name, int age,  boolean citizenship, String candidateName){

        boolean eligibleToVote= age>=18 && citizenship==true;

        if (eligibleToVote){
            System.out.println(name+ "is eligible to Vote to " +candidateName);
        } else {
            System.out.println(name+ " is not eligible to vote");
        }
    }

            // ikinci ornek
    public static void eligibleToBuyAlkol (boolean HasId, int age){
          if (HasId && age>= 21){
              System.out.println("You are eligible to alkol");

          } else {
              System.out.println("You are eligible to buy milk");
          }
             }


          // ucuncu ornek
    public static void calculator (double num1, char operator, double num2 ){
          // bunlar operator + * - / %

        switch(operator){
            case '+':
                System.out.println("addition "+ (num1+num2));
                break;

            case '-':
                System.out.println("Substraction "+ (num1-num2));
                break;

            case '/':
                System.out.println("Devision"+ (num1/ num2));
                break;

            case '%':
                System.out.println("Reminder"+ (num1 % num2));
                break;

            default:
                System.out.println("Invalid operator");

        }

    }



}
