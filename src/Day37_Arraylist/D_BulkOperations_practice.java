package Day37_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class D_BulkOperations_practice {
    public static void main(String[] args) {

        ArrayList<String>student= new ArrayList<>();
        student.add("sayem");
        student.add("Wagar");
        student.add("Beslan");
        student.add("Davud");
        student.add("Ramazan");
        student.add("Mehary");

        // Busra, ulku,

      boolean r1=   student.containsAll(Arrays.asList("Ulku", "Busra", "Muhtar"));
        System.out.println(r1);





    }
}
