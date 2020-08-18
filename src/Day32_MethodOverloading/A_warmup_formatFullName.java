package Day32_MethodOverloading;

import Library.Util;

import java.util.Scanner;

public class A_warmup_formatFullName {

//1. write a method that can retunr the full name of a person in reugral format
 //   ex:
 //   fullName("cYbErTeK", "SCHOOL"); ==> "Cybertek School"

    public static void main(String[] args) {
        // scanner ile
      //  Scanner scan = new Scanner(System.in);
      //  System.out.println("Write your full name");
       // String first = scan.nextLine();
       // String last = scan.nextLine();

/*
        first = first.substring(0, 1).toUpperCase() +  first.substring(1).toLowerCase();
            // Convert first char to upper case         // convert rest of the chars to lowers
        last = last.substring(0, 1).toUpperCase() + last.substring(1).toLowerCase();
        String fullName = first + " " +last;
*/
         // scanner yolu
      //  String fullName =  formatFullName(first, last);
      //   System.out.println(fullName);

        // 1. yol
        String name = adiniDegistir("fatih", "iyiyol");
        System.out.println(name);

        //2.yol
        System.out.println(adiniDegistir("fatih","iyiyol"));

        String adiniz = Util.formatFullName("busra", "iyiyol");
        System.out.println(adiniz);

    }


    public static  String  formatFullName(String first , String last){
        first = first.substring(0, 1).toUpperCase() +  first.substring(1).toLowerCase();
        last = last.substring(0, 1).toUpperCase() + last.substring(1).toLowerCase();
        String fullName = first + " " +last;

        return fullName;


    }
    public static String adiniDegistir (String adi, String soyadi){
         adi=   adi.substring(0,1).toUpperCase()+ adi.substring(1).toLowerCase();
         soyadi= soyadi.substring(0,1).toUpperCase()+ soyadi.substring(1).toLowerCase();
         String tamIsim= adi+ " "+ soyadi;
         return tamIsim;

    }


}
