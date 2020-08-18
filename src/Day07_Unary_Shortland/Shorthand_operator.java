package Day07_Unary_Shortland;

public class Shorthand_operator {

    public static void main(String[] args) {

           // ORNEK 1
        int a = 100; // uzun yol
        a = a +100;
        System.out.println(a);

       int a1 =  100; // kisa yol
        a1 += 100;
        System.out.println(a);


        // ORNEK 2 kisa yol shorthand
        int c = 300;
        c -= 100;
        System.out.println(c);


         //  onemli ornek HER IKI ORNEGI DE GOSTERIYOR.

        int z = 300;

        // z = z+ 200; // boyle de olur. // UZUN YOL
        z += 200;  // KISA YOL
        System.out.println(z); // 500


            // ORNEK STRING ORNEGI Normal yol

        String OkulunAdi = "Cybertek";
         OkulunAdi   = OkulunAdi+ " School";
        System.out.println(OkulunAdi);

 // Ornek-  okulun adi shorthand ile

     String okulunAdi1 = "Cybertek";
     okulunAdi1 = " School";
     System.out.println(okulunAdi1);

         // ORNEK- String ornegi
         String fullname = "Fatih";
         fullname += " Iyiyol";
        System.out.println(fullname);

        // ORNEK - String Ornegi
        String fullname12 = "Mickey";
        fullname12 += " Mouse";
        System.out.println(fullname12);


        // Ornek
     String firstName2 =  "Mary";
            firstName2 += " Canli";
     System.out.println(firstName2);

        int budget = 100_000;
        budget /= 2;
        System.out.println(budget);

//         cok guzel ornek
        int q = 100;
        System.out.println(q/2); //  50
        System.out.println(q); // 100


        // % ornegi
         int aylik = 10;
         aylik %= 2;
        System.out.println(aylik); // 0 kalir.


        int num = 100;
        num %= 3;
        System.out.println(num); /// 1 kalir cunku int

        double num2 = 100;
        num2 %= 3;
        System.out.println(num2);

        System.out.println( 10.0/3);





    }

}
