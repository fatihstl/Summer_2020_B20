package Day53_FinalKeyword;

import java.time.LocalDate;

public class FinalVeriable {

    final  static String eyecolor = "Brown";
    final String bloodType = "A";

    final int x; // constructor kurmasaydik complierror verirdi.
    final static int y; // static blok vermeseydi complier verirdi.

    static {
        y=300;
    }

    public FinalVeriable(){
        x= 700;
    }

    public static void main(String[] args) {

        LocalDate dateOfBirth = LocalDate.of(1990, 5, 7);

        //dateOfBirth = LocalDate.of(1990, 6 , 25); // cannot be reassinged.
        System.out.println(dateOfBirth);



        final long ssn= 123456;
        //ssn= 98764  yenidin atayamasin
        System.out.println(ssn);

        final double PI = 3.14;
       // PI= 2.14; degistiremezsin.
        System.out.println(PI);


        final char gender = 'M';
        //gender = 'F'; degistiremezsin.





    }
}
