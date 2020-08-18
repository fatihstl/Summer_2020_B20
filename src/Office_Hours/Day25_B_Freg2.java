package Office_Hours;

import java.util.Scanner;

public class Day25_B_Freg2 {

    public static void main(String[] args) {

       // Scanner scan= new Scanner(System.in);
      //  String str = scan.nextLine().toLowerCase();

        String str = "JavaJavaJavaJava".toLowerCase();

        int count = 0;

        while (str.contains("java")) { // her defasinda
            count++;
            str = str.replaceFirst("java", "");

        }
        System.out.println(count);

    }
}
