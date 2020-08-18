package Day36_Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class J_uniq {
    public static void main(String[] args) {


         /// swap
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");
        list2.add("E");

        System.out.println(list2);

        Collections.swap(list2, 1,  2); //{A, C, B, D, E};

        System.out.println(list2);


        Collections.swap(list2, 0, list2.size()-1); //{E, C, B, D, A};

        System.out.println(list2);

      //  frequency metot
        ArrayList<Character> charList = new ArrayList<>();
        charList.add('A');
        charList.add('B');
        charList.add('A');
        charList.add('A');
        charList.add('A');
        charList.add('C');


        int count = Collections.frequency(charList, 'B');
        System.out.println(count);



    }
}
