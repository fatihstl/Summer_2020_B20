package Day37_Arraylist;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;

public class M_Remove_Digit_Letters {
    public static void main(String[] args) {

        ArrayList<Character>chars = new ArrayList<>();
        chars.addAll(Arrays.asList('a', '1', 'b', '2', 'c','d', '#', '@', '?', '*'));

        chars.removeIf(p-> Character.isDigit(p) || Character.isLetter(p));
        System.out.println(chars);



        System.out.println("===========================");
        ArrayList<Character> list = new ArrayList<>();

        list.addAll(Arrays.asList('a', 'b', 'c', 'd', '$', '@', '?'));

        ArrayList<Character> digit = new ArrayList<>();
        digit.addAll(list);
        digit.removeIf(p->!Character.isDigit(p));
        System.out.println("Digit:"+ digit);


        ArrayList<Character> letter = new ArrayList<>();
        digit.addAll(list);
        digit.removeIf(p->!Character.isLetter(p));
        System.out.println(("letter: "+letter  ));

        ArrayList<Character> specialChar = new ArrayList<>();
        specialChar.addAll(list);

        specialChar.removeAll(letter);
        specialChar.removeAll(digit);
        System.out.println("Special Character: "+ specialChar);





    }
}
