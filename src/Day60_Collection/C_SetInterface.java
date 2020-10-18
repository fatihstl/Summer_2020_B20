package Day60_Collection;

import java.util.*;

public class C_SetInterface {

    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        s1.addAll(Arrays.asList(8,7,6,2,3,10,1)); // kucukten buyuge siralacak
        s1.addAll(Arrays.asList(8,8,8,8,8,8,8,8,8));// dublavate kabuletmez

        System.out.println("HashSet :"+ s1);


        Set<Integer> s2 = new LinkedHashSet<>();
        s2.addAll(Arrays.asList(8,7,6,2,3,10,1));
        s2.addAll(Arrays.asList(8, 8, 8, 8, 8 ,8 ,8 ));

        System.out.println("Linked Hashset"+ s2);



        Set<Integer> s3 = new TreeSet<>();
        s3.addAll(Arrays.asList(8,5,4,3,2,10, 7, 1));
        System.out.println("TreeSet: "+s3);




    }
}
