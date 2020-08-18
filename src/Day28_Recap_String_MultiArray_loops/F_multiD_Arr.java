package Day28_Recap_String_MultiArray_loops;

import java.util.Arrays;

public class F_multiD_Arr {
    public static void main(String[] args) {


        int[] arr1D = {1, 2, 3, 4, 5};


        // 0 1 2    0 1 2 3 4             0 1 2 3
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7, 8}, {9, 10, 11, 12, 13}};
        // 0             1                    0

        //arr2D [1];  // basit array da yazdirmak icin Arrays.toString kullan

        System.out.println(Arrays.toString(arr2D[1])); // 4 , 5, 6 , 8  yazdiriyor.
        System.out.println(Arrays.deepToString(arr2D));

        System.out.println(arr2D[1][3]); // 7 yazdiriyoruz.

        System.out.println("=====================================");

        for (int i = 0; i <= arr2D.length - 1; i++) {
            int[] each1 = arr2D[i];

            // System.out.println(Arrays.toString(each1));


            for (int j = 0; j <= each1.length - 1; j++) {
             int eachNum= each1[j];
               System.out.print(eachNum+ " ");
            }
            System.out.println();

        }


        System.out.println("===============================");

        //// for each ile yapacak.

                for (int[] each1D : arr2D) {

                    for (int eachElement : each1D){
                        System.out.print(eachElement+ " ");
                    }
                    System.out.println();
                }


            }
        }
