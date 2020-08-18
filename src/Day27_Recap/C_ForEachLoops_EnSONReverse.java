package Day27_Recap;

import java.util.Arrays;

public class C_ForEachLoops_EnSONReverse {
    public static void main(String[] args) {

       int [] arr = {1, 2, 3, 4, 5};

       for (int i = 0; i<= arr.length-1; i++){
           System.out.print(arr[i]+ ", ");
       }

        System.out.println();

    // for each ile yapiyoruz ayni seti
       for (int each : arr ) {
           System.out.print(each+ ", ");
       }
        System.out.println("=======================");

      // reverse yapalim
        for (int i = arr.length-1; i>= 0 ;  i--) {
            System.out.print(arr[i] + ", ");

        }










    }

}
