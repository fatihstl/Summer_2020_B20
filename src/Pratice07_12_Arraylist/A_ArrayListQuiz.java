package Pratice07_12_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class A_ArrayListQuiz {

    public static void main(String[] args) {

        // 3 soru yanlis yapmistim.
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.addAll(Arrays.asList(1,2,3));

        int a = 1;
        list1. remove(a);// 1. index oldigu icin yanlis yapmisim
        System.out.println(list1);

        System.out.println("============================");
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));

        list.set(0, list.get(4));
        list.set(4, list.get(0));
        System.out.println(list);


    }
}
