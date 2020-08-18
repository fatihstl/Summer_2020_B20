package Day13_Scanner;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class E_nextLine {
    public static void main(String[] args) {

   /*Scanner input = new Scan-ner(System.in);
        System.out.println("Enter your salary");
        double salary = input.nextDouble();
        System.out.println(salary);

       input.nextLine();
        System.out.println("Enter your full Name");
        String fullName = input.nextLine();
        System.out.println(fullName);*/

  /* int a= 100;
  a=  a++ + a-- + a++;

        System.out.println(a);*/

int b1 =  100;
int b2 = 15;
int b3 = 92;

        int max = (b3 >b2) ? b3 +2 : (b2 >b1 ) ? b2-4 : b1 * -1;
        System.out.println(max);

    }
}
