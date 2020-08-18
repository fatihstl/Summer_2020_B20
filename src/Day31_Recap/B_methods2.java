package Day31_Recap;

import Library.Util;

public class B_methods2 {
  //1. create a method that can reverse a string
    //2. identify if a string is palindrome
  public static void main(String[] args) {

           Reverse1("Ahmet"); /// limitli kullanabilirz cunku voidli

      String name= "Madam";

    /*  String rev = Reverse2(name);
      System.out.println(Reverse2(name));
      System.out.println(name.equalsIgnoreCase(Reverse2(name))); */


      System.out.println(Reverse2("Fatih"));;


      String stryeni= Util.reverse("Hamid");
      System.out.println(stryeni);
  }


         public static void Reverse1(String str){ // voidli

             String result= "";
             for (int i= str.length()-1; i>= 0; i--){
                 result+= str.charAt(i);

             }
             System.out.println(result);
         }

    public static String Reverse2(String str){ //  return

        String result= "";
        for (int i= str.length()-1; i>= 0; i--){
            result+= str.charAt(i);

        }
        return result;
    }




}
