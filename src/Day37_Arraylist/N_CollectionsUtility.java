package Day37_Arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class N_CollectionsUtility {
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(30,40,50,60,70,30, 20, -1, -3, 400, 500, 5000 ));



        // maximum number: max
        Integer max = Collections.max(list);

        // minimum number : min
        Integer min = Collections.min(list);


        System.out.println("Maximum number: "+ max);
        System.out.println(("Minumum number: " + min));


        System.out.println("========================");


        ArrayList<String> names = new ArrayList<>();
      //  names.addAll("Muhtar", "Saim");
        names.addAll(Arrays.asList("Ramazan", "Islem", "Muhtar", "Saim", "Muhtar", "Asiya"));

        // replaceAll
        Collections.replaceAll(names, "Muhtar", "Fatime");
        System.out.println(names);




    }
}
