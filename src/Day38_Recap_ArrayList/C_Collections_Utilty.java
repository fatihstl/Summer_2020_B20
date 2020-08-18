package Day38_Recap_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C_Collections_Utilty {
    public static void main(String[] args) {

        ArrayList<Character> chars= new ArrayList<>();
        chars.addAll(Arrays.asList('R', 'S', 'O','P', 'D','A','C', 'B'));


        // sort
        System.out.println(chars);
        Collections.sort(chars);
        System.out.println(chars);


        ArrayList<String >students = new ArrayList<>();
        students.addAll(Arrays.asList("Aslan", "Cristina", "Zeliha", "Fatima", "Mohammed"));
                                       // 0       1           2         3          4
         // swap
        Collections.swap(students, 1, 4);// cristina ile mohammedin yerine degistirdim index ile
        Collections.swap(students, 1, 4);// tekrar geri aldik
        Collections.swap(students, 0, students.size()-1);// en bastaki ile en sondakini yer degistirdik.
        System.out.println(students);



        // frequency
        ArrayList<String> items = new ArrayList<>();
        items.addAll( Arrays.asList("Coffee", "Coffee", "Egg", "Battery", "Battery", "Battery", "Battery"));

        int count = Collections.frequency(items, "Battery");

        System.out.println(count);


        ArrayList<String> unique = new ArrayList<>();

        for(String each : items ){
            int  i = Collections.frequency(items, each);
            if(i == 1){
                unique.add(each);
            }
        }

        System.out.println(unique);


        ArrayList<String> unique2 = new ArrayList<>();
        unique2.addAll(items);
        unique2.removeIf( p -> Collections.frequency(unique2, p) > 1 );
        System.out.println(unique2);


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,9, 89, 1000, 2000, 3000, 30, 40, -50, 1000, 1000, 1000, 1000));

        Integer max = Collections.max(list);
        Integer min = Collections.min(list);

        System.out.println("max: "+max);
        System.out.println("min: "+min);

        Collections.replaceAll(list, 1000, 100000 );

        System.out.println(list); //

    }
}
