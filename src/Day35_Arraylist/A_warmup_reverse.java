package Day35_Arraylist;

import java.util.ArrayList;

public class A_warmup_reverse {
    public static void main(String[] args) {

     /*  // 1. write a program that can print the list of integers in reversed order
        ex:
        list=> {1,2,3,4,5}
        output: 5 4 3 2 1  */

        ArrayList<Integer> list= new ArrayList<>();
        list.add(10);// outoboxing
        list.add(20);
        list.add(1,30); // bunu ozel olarak 1. indekse atadim.
        list.add(40);
        list.add(50);

        System.out.println(list);
        for (int i = list.size()-1; i>=0 ; i--){
            System.out.print(  list.get (i)+ " ");
        }


        }

    }

