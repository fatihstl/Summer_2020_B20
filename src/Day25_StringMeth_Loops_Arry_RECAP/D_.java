package Day25_StringMeth_Loops_Arry_RECAP;

import java.util.Arrays;

public class D_ {

    public static void main(String[] args) {
        //3. Create an int array called numbers that has length of 100
        // and Assign 1-100 to each index of the array.  then print out all the even numbers.
        // MUST use continue statement

          int [] number = new int [100];
         /* number [0] = 1;
          number [1] = 2;
          number [2] = 3;
          number [3] = 4;*/
         for (int i = 0; i<= number.length-1; i++) {
            number[i] = i+1;
         }
        System.out.print(Arrays.toString(number));

        System.out.println();

         for (int each  : number){
             if (each % 2 != 0){
                 continue;
             }
             System.out.print(each+ " ");
         }

    }
}
