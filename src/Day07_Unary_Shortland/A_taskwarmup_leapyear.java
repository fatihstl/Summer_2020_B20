package Day07_Unary_Shortland;

public class A_taskwarmup_leapyear {

    public static void main(String[] args) {

        // ORNEK-  lEAP YEAR.
        /*Create a class called LeapYear, and write a program that can identify if the given is Leap Year,
         print true if it's leap year, otherwise print false
        Ex: year = 2020  ==> short;
        LeapYear =true/false;*/

      int year1 = 2020;
      boolean result =  year1 % 4 == 0;
        System.out.println( year1 + " is a leap year: " + result);

       // ornek 2  leap year
        int year = 1980;
        boolean result2 = year % 4 == 0;
        System.out.println(year+ " is a leap year: "+ result2);

       // ornek 3 leap year olmayan
        int dogumGunum = 1979;
        boolean sonuc = dogumGunum % 4==0;
        System.out.println(dogumGunum + "is a leap year : " + sonuc);



    }

}
