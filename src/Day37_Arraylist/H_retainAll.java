package Day37_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class H_retainAll {
    public static void main(String[] args) {

        ArrayList<Integer> num1 = new ArrayList<>();
        num1.addAll(Arrays.asList(1,1,2,2,3,3,4,4,5,6,6,7,7,7,9,9,13,14));

        num1.retainAll(Arrays.asList(1,2,3,9)); // bunlari tut digerlerini sil.
        System.out.println(num1);


    }
}
