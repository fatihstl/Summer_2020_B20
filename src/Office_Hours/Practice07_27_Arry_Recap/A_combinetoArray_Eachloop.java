package Office_Hours.Practice07_27_Arry_Recap;

import java.util.Arrays;

public class A_combinetoArray_Eachloop {
    public static void main(String[] args) {

              char [] a1= {'A' , 'B', 'C', 'D'};// 4 tane
        char [] a2= {'D', 'E', 'F'}; // 3 aded


        char [] a3= new char[a1.length+a2.length]; // yukaridakilerden hepsi


        // index   index
    /*     a3[0]= a1[0]; // A
        a3[1] = a1[1]; // B
        a3[2] = a1[2]; // c

        a3[3] = a2[0]; // d
        a3[4] = a2[1]; // E
        a3[5] = a2[2]; // F   */

        int index = 0;
        for (char each: a1){  // a1 conbine yapiyor.
            a3[index] = each;
            index++;
        }

        for (char each: a2){  // a2 cinbine yapiyor
            a3 [index] = each;
            index++;
        }

        System.out.println((Arrays.toString(a3))); // ikisini a3 ile birlestirdik.





    }




}
