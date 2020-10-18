package Day47_Encapsulations;

import java.util.ArrayList;

public class StaticBlock {

    static String campanyName= "Bank Of Amerika";

    static ArrayList<Integer> list= new ArrayList<>();

     static {
         campanyName= "Bank Of America";
         list= new ArrayList<>();
         list.add(10);
         list.add(20);
         list.add(30);
     }

    public static void main(String[] args) {
        System.out.println(campanyName);
        System.out.println(list);
    }

}
