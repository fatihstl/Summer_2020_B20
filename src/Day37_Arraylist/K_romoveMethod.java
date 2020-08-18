package Day37_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class K_romoveMethod {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3,4,5,6,7,8));

        // romeve all numbers that are less than 5-- REMOVE Method looplarda kullanma.

        for (int i = 0; i<= list.size()-1; i++){
            if (list.get(i)<5){
                list.remove(i);
            }
        }
        System.out.println(list);



    }
}
