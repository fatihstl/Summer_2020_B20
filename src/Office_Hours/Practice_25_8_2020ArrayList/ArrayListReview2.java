package Office_Hours.Practice_25_8_2020ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListReview2 {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10,20, 30 ,40, 50, 60, 70, 80 ,90));

        Collections.swap(list1, 0, 1);
        Collections.swap(list1, list1.size()-2, list1.size()-1);

        System.out.println(list1);

        Collections.sort(list1);
        System.out.println(list1);

        Integer max = Collections.max(list1);
        Integer min = Collections.min(list1);

        System.out.println("Maximum number "+max);
        System.out.println("Mininum Number "+min);


        System.out.println("=============================================");

        String [] arr = {"egg","Toiletpeper",  "Orange", "Milk", "Toiletpeper", "Avocado"};


        ArrayList<String> items= new ArrayList<>();
        items.addAll(Arrays.asList(arr));
        System.out.println(items);

        int count = Collections.frequency(items, "Toiletpeper");
        System.out.println(count);

        items.removeIf(p->Collections.frequency(items, p) != 1);

        System.out.println(items);
    }
}
