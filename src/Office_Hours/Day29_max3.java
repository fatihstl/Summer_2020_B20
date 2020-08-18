package Office_Hours;

import java.util.Arrays;

public class Day29_max3 {
    public static void main(String[] args) {


        //                 0 1 2     0 1 2 3    0 1 2  3   4
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}, {13, 14, 15, 20, 16, 17}};
        //                      0          1             2                  3

        int max = arr2D[0][0];

        for (int [] each1D : arr2D){
            System.out.println(Arrays.toString(each1D));

            for (int eachnum : each1D){
                if(eachnum> max){
                    max= eachnum;
                }
            }

        }
        System.out.println("maximum"+ max);

    }
}
