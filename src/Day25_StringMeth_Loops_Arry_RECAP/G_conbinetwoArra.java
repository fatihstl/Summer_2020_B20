package Day25_StringMeth_Loops_Arry_RECAP;

import java.util.Arrays;

public class G_conbinetwoArra {

    public static void main(String[] args) {
        //        6. write a program that can combine two arrays of integers and then
        //        print out the maximum number
       // Ex:
        //arr1 = { 1,2,3,4}
        //arr2 = {5,6,7,8}
       // output:
        //arr3 = {1,2,3,4,5,6,7,8}
      //  max: 8

        int [] arr1 = {1,2 ,3};
        int [] arr2 = {4,5};

        int size = arr1.length + arr2.length;

        int [] arr3= new int[size]; // 5 elementi karsilastiracak. maximum numberi bulacak.
      /*  arr3[0] = arr1[0];
        arr3[1] = arr1[1];
        arr3[2] = arr1[2];

        arr3[3] = arr2[0];
        arr3[4] = arr2[1];  */

      int index = 0;
      for (int each : arr1){
          arr3[index] = each;
          index+= 1;
      }
      for (int each : arr2){
          arr3[index] = each;
          index++;
      }
        System.out.println(index);

        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));


    }
}
