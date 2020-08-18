package Day16_String;

import java.util.Scanner;

public class G_EqualIgnore {
    public static void main(String[] args) {

       // BUTUN YESLERE DOGRU DIYECEK.
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you employed");
        String answer = scan.next();

        if (answer.equalsIgnoreCase("yes") ){

            System.out.println("Employed");
        }else {
            System.out.println(" Not Employed");
        }

             // contains
            String a = " I like Java";
            boolean b= a.contains("Java");
            System.out.println(b);

    }
}
