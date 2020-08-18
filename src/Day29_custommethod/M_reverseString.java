package Day29_custommethod;

public class M_reverseString {

     // 7. create a method that can reverse any String // ters cevirdik.
     public static void main(String[] args) {
         reverse("Muhtar");

         ben("fatih");
         ben("fatih");
         reverse("Serpil");
     }


    public static void reverse (String str){

        String result= "";
        for (int i = str.length()-1; i >=0 ; i--){
            result += str.charAt(i);
        }
        System.out.println(result);
    }


    public static void ben (String str){

         String result= "";
         for (int i = str.length()-1; i>= 0; i--){
             result+= str.charAt(i);

         }
        System.out.println(result);
    }





}
