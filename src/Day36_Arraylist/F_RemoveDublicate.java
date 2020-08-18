package Day36_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class F_RemoveDublicate {
    public static void main(String[] args) {
        ArrayList<Character>list= new ArrayList<>();

        list.addAll(Arrays.asList('A', 'B','B','A', 'C', 'C'));
        System.out.println(list);

        ArrayList<Character>nonDup = new ArrayList<>(); // 'A', 'B','B','A', 'C', 'C
        for (Character each : list){
            if (!nonDup.contains(each)){

            }
        }




    }
}
