package Day29_custommethod;

public class R_ {

     // 10. write a method that can remeove the duplicates from the string

     public static void main(String[] args) {

         removeDublicate("abab");
     }


    public static void removeDublicate (String str){
        String nonDup="";

        for (int i = 0; i <str.length()-1 ; i++) {
            String ch=""+str.charAt(i);
            if(!(nonDup.contains(ch))){
                nonDup+=ch;
            }
        }
        System.out.println(nonDup);
    }




}
