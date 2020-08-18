package Day06_CompretionOperator;

import org.w3c.dom.ls.LSOutput;

public class C_SWap_Task {

    public static void main(String[] args) {

       // ORNEK: Swap yapamadigimiz ornek.
        /*int a = 10;
        int b = 15;

          b = a;
          a = b;
        System.out.println(a); //
        System.out.println(b); // bu sekilde her ikisi de sonuc 10 verir.swap olmaz. */

        // ORNEK 2 SWAPLI

       /* int a = 10;
        int b = 15;

        int c = b; // 15

         b = a;     // 10
         a = c;
        System.out.println(a);  // 15
        System.out.println(b); //  10 */


        // ORNEK 3 (a = 20, mehmet  = 15)

      /*  int Ahmet = 20;
        int Mehmet = 25;

        int Muhtar = Mehmet;

        Mehmet = Ahmet;
        Ahmet = Muhtar;

        System.out.println(Ahmet);
        System.out.println(Mehmet);*/

      //ORNEK - swap

         int a = 40;
         int b = 50;

         int c = b;

         b = a;
         a = c;

        System.out.println(a);
        System.out.println(b);


    }



}
