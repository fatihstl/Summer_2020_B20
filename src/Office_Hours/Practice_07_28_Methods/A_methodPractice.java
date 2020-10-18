package Office_Hours.Practice_07_28_Methods;

import java.util.ArrayList;

public class A_methodPractice {

    public static void main(String[] args) {

      // ilk yol
       String name= reverseName("Fatih");
        System.out.println(name);

        // ikinci yol
        System.out.println(reverseName("Fatih"));

        System.out.println("===============");

        isPlandromr("Fatih");


        System.out.println("========================");

        String [] names= {"Aslan","Ramazan", "Erfan", "Ali"};

        ArrayList<String>nameList = new ArrayList<>();

        for (String each : names){ // reverse de yaptik
           // System.out.println(reverseName(each));

           // isPlandromr(each); // plandrome yapiyoruz.


            nameList.add(reverseName(each));

        }
        System.out.println(nameList);
    }

    public static String reverseName(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
            return result;

        }

        public static void isPlandromr(String str){

         String adim = reverseName(str);
         boolean palindromr= str.equalsIgnoreCase(adim);
            System.out.println( palindromr? "Is palindrome" : "Is not palindrome");
        }




        }
