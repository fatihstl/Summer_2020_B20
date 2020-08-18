package Day36_Arraylist;

import java.util.ArrayList;

public class A_warmup1 {
    public static void main(String[] args) {

      //  1. write a program that can set the last element of the Integer arraylist to zero
      //  ex:
     //   list = [1,2,3,4,5];
       // output: [1,2,3,4,0];
        ArrayList<Integer>list1 = new ArrayList<>();
        list1.add(10); // 0
        list1.add(10); // 1
        list1.add(10); // 2
        list1.add(10); // 3
        list1.add(10); // 4

        list1.set(2, 0);  // iikince  indexe 0  verdik.
        list1.set(list1.size()-1, 0); // son indese sifir degeri verdik.

        System.out.println(list1);



    }
}
