package Day24_ArrayUtility;

public class A_warmup_uniques {
    public static void main(String[] args) {

       /* 1. write a program that can find the unique characters from a String
        Ex:
        input: aabccd
        output: bd*/

                /// String icindeki sadece tek olan harfi  bulacagiz. kolay metod

         String str = "aabcc";
         String unigues = ""; // b
        for (int i = 0 ; i <= str.length()-1; i++){
           char ch =  str.charAt(i); //       a a b c c
           int first = str.indexOf(ch);//     0 0 2 3 3
           int last = str.lastIndexOf(ch); // 1 1 2 4  4

            if (first == last){
                unigues+=ch;
            }

        }
        System.out.println(unigues);

        // ikinci metod*/

    }
}
