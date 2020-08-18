package Day37_Arraylist;

import java.beans.IntrospectionException;
import java.util.ArrayList;

import java.util.Arrays;

public class E_AddAll_method {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        // add: 30, 25, 40, 15, 55, 65, 75, 85, 95, 100
        /*
        Integer[] nums = {30, 25, 40, 15, 55, 65, 75, 85, 95, 100};
        numbers.addAll(  Arrays.asList(nums) );
         */

        numbers.addAll(  Arrays.asList(30, 25, 40, 15, 55, 65, 75, 85, 95, 100) );

        System.out.println(numbers);


    }
}
