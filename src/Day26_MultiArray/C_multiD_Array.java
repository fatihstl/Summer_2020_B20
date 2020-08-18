package Day26_MultiArray;

import java.util.Arrays;

public class C_multiD_Array {
    public static void main(String[] args) {

        char[] ch = {'A', 'B'};
        char[] ch1 = {'C', 'D', 'E'};
        char[] ch2 = {'F', 'G', 'H'};
        // 0   1       0    1    2      0    1    2
        char[][] ch2D = {{'A', 'B'}, {'C', 'D', 'E'}, {'F', 'G', 'H'}};
        //   0             1                 2

        System.out.println(Arrays.toString(ch2D[1])); // cde verecek
        System.out.println(Arrays.toString(ch2D[2])); // fgh yazacak

        // h nasil yazacak

        //  ch2D[2] [2]

        System.out.println(ch2D[2][2]);


        // c alacak
        System.out.println(ch2D[1][0]); // once kumenin sonra kumenin icini

        //  G B
        System.out.println(ch2D[2][1] + " " + ch2D[0][1]);

        System.out.println("======================================");

        // { 1,2,3} , {4} , {5, 6} , {7,8 9 ,10}

        int[][] num = {{1, 2, 3}, {4}, {5, 6}, {7, 8, 9, 10}};
        //                   0      1        2            3

        // System.out.println(Arrays.toString(num[3])); // 7 8 9 10 hepsini verecek.

        //  { 1,2,3},
        //  {4} ,
        //  {5, 6},
        //  {7,8, 9 ,10}  bunlari yazdiracagiz.

        // normal for ile
        for (int i = 0; i <= num.length-1; i++){
           System.out.println(Arrays.toString(num[i]));
          //  System.out.println( Arrays.deepToString(num));
        }


}
}
