package Day60_Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {

        String str = "aaabbbcccddddeeee"; /// butun dublicateleri kaldircagiz

       String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));

        // {a, b,c,d,e}; // butun dublicateleri kaldiracak.

        Set<String> s1 = new HashSet<>();
        s1.addAll(Arrays.asList(arr));

        System.out.println(s1);

        System.out.println("===================================================");


        // ikinci yol zor yol
        String str2 = "ttttyyyyyuuuuuuuiiiiiiaaaaaaaaa";

        str2 = new LinkedHashSet<>( Arrays.asList(str2.split(""))).toString() ;

        System.out.println(str2);

        str2 = str2.replace("[", "").replace(", ", "").replace("]","");

        System.out.println(str2);
    }
}
