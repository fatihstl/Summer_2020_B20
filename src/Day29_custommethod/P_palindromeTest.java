package Day29_custommethod;

public class P_palindromeTest {

    // pelendram buluyoruz.

    public static void main(String[] args) {

        palindrome("Level");

    }

    public static void palindrome (String word){

        String reverse = "";
        for (int i = word.length()-1; i>=0 ; i--){
            reverse+= word.charAt(i);

        }
        System.out.println(reverse.equalsIgnoreCase(word));
    }











}
