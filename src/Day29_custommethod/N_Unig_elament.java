package Day29_custommethod;

import java.util.Scanner;

public class N_Unig_elament {
    //8. write a method that can print out the unique elements from an array of string

    public static void main(String[] args) {
      String[] arr = {"A", "B", "B", "C", "C", "F", "F"};
      uniques(arr);


        System.out.println();
        System.out.println("Hello");

        String [] arr2= {"D", "C", "E", "F"};
        uniques(arr2);
    }

    public static void uniques(String[] arr) {

        for (String a : arr) { // gets each of the element

            int count = 0;
            for (String each : arr) { // gets the frequency of the element
                if (a.equals(each)) {
                    count++;
                }
            }

            if (count == 1) { // unique
                System.out.print(a + " ");
            }
        }

    }


}









