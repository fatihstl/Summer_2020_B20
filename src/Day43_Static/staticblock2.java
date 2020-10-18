package Day43_Static;

import Day41_toStirngMethod.Tester;
import org.w3c.dom.ls.LSOutput;

public class staticblock2 {

    static int a;
    static String b;
    static Tester tester1;

    static{
        a = 100;
        b = "Cybertek";
        tester1= new Tester();
        tester1.setInfo("Muhtar", 120000, "M", 34);
        System.out.println(tester1);
        System.out.println(a);
        //System.out.println(b)

    }

  public static void main(String[] args) {
        //System.out.println(a);
        //System.out.println(b);
   }

}
