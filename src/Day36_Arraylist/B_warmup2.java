package Day36_Arraylist;

import java.util.ArrayList;

public class B_warmup2 {

    public static void main(String[] args) {

        //    2. write a program that can multiply each odd number by 2
        //            ex: list = [1,2,3,4,5];
        //                output: [2,2,6,4,10]

        ArrayList<Integer>list2 = new ArrayList<>();
         for (int i  = 0; i<= 20; i++) {
             list2.add(i);

         }
        System.out.println(list2);

         for (int i = 0 ; i<= list2.size()-1;i++) {
             Integer each = list2.get(i); // unboxing


             if (each %2 != 0){
                 list2.set(i,each*2);

             } else {
                 list2.set(i, list2.get(i)* 3);
             }
         }
        System.out.println(list2);
    }
}
