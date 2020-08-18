package Day37_Arraylist;

import Library.Util;

import java.util.ArrayList;
import java.util.Collections;

public class B_frequncyOfChars {
    public static void main(String[] args) {
 //2. write a program that can find the frequency of character from a String
        //                        DO NOT use nested loop
        //                        "AABBCCDDEE"  ==> "ABCDE"
        //                        output: A2B2C2D2E2

        String str = "AAABBC";

        ArrayList<String> list = new ArrayList<>();

        for(String each  : str.split("") ){
            list.add(each);
        }

        System.out.println(list);

        String nonDup = Util.removeDup(str); //"ABC"   to avoid duplication

        for(String each : nonDup.split("")){  // each: A, B, C
            int count =  Collections.frequency(list, each);
            System.out.print(each+count);
        }




    }
}
