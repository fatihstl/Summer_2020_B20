package Office_Hours.practice_08_26_Classs;

public class Palindrome1 {
    public static void main(String[] args) {

        String name = "Level";
                  // 01234
        String reverseName= "";
        for (int i = name.length()-1; i>=0; i--){
         reverseName +=   name.charAt(i);
        }
        System.out.println(name.equalsIgnoreCase(reverseName));

        String word = "Elmira";
        String reversedWord= "";
        for(int i = word.length()-1; i>=0; i--){
            reversedWord += word.charAt(i);
        }
        System.out.println(reversedWord);
    }
}
