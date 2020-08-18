package Day37_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class F_RemoveAll {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,1, 2,2,3,4,5,5,6,7,8,9,10,12));
        System.out.println(nums);

        // bunlarin  1, 2 5 10  kaldiracagiz
        nums.removeAll(Arrays.asList(1, 2 , 5, 10)); // tum 1 2 5 10 kaldirir.
        System.out.println(nums);


    }
}
