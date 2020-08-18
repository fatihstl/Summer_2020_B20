package Day18_for_lpop;

public class A_warmupTask {
    public static void main(String[] args) {

       /* write a program that asks user's first and last name, then prints out the initials of the user
        input:
        cybertek   batch18
        output:
        your initial is: CB
        DO NOT use charAt methoh*/

 // /*substring ile
       String firstName = "cybertek";
        String lastName=  "batch18";

        String initial1 = firstName.substring(0, 1)+ "." + lastName.substring(0,1); // "jp"
        initial1 = initial1.toUpperCase();  // "JP"

        System.out.println(initial1);

        char ch1 = firstName.charAt(0);
        char ch2 = lastName.charAt(0);

        String initial2 ="" + ch1+ "." + ch2;
        initial2 =  initial2.toUpperCase();

        System.out.println(initial2);




    }

}
