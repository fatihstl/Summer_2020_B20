package Day37_Arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class P_Dublicate {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,1, 2,3,3, 4,4, 5, 6,7,8));


        list.removeIf(p-> Collections.frequency(list, p)==1);
        System.out.println(list);


        System.out.println("========================================");

     // first ve last carekter ayni oldugunda kaldirir.
        ArrayList<String> name = new ArrayList<>();

        name.addAll(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida"));

        name.removeIf(p->p.toLowerCase().charAt(0)==p.charAt(p.length()-1));

        System.out.println(name);



        System.out.println("===================================================");



    }
}
