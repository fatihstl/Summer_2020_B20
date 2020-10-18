package Day61_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class C_RemoveDuplicates_WARMUP {

    public static void main(String[] args) {
       //  3. write a program that can remove the duplicated Integers from a List of Integer
        //            Do Not change the insertion order

            List<Integer> list = new ArrayList<>();
            list.addAll(Arrays.asList(1,2,3,4,5,6,1,2,3,4,5,6));

            LinkedHashSet<Integer> set = new LinkedHashSet<>(list); // contains the unique objects
            list.clear();
            list.addAll( set );

            System.out.println(list);






    }
}
