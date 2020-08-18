package Day10_IfStatement;

public class A_warpupTask {


    public static void main(String[] args) {

     /*   1. write a program that can identify if the given character character is Alphabetic*/
     // 2. sooru
        char character = 'A';
        //                        65 <= character <= 90             ||   97 <= character <= 122
        boolean isAlphabetic = (character >= 65 && character <= 90) || (character >= 97 && character <= 122);
                                       //upper case letters     ||  lower Case letter
        String alphabet = "";

        if(isAlphabetic == true) {
            //    System.out.println(character + " is Alphabetic character");
            alphabet = character + " is Alphabetic character";

        }else {
            //   System.out.println(character + " is not Alphabetic character");
            alphabet = character + " is not Alphabetic character";
        }
        System.out.println(alphabet);

        String digit = "";

        //  IkInci ornek 48 <= CHARACTER <= 57 birincisiyle baglantili. cunku chari kullandik.
        boolean isDigit = character >= 48  && character <= 57;

        if(isDigit == true ){
            digit = character+" is a digit";
        }else{
            digit =  character+" is not a digit";
        }
        System.out.println(digit);
    }
}
