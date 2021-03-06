package Office_Hours;

public class Day29_Nested_Array_Max_Min {
    public static void main(String[] args) {
      //  write a program that can find the maximum number from any given two dimensional array

                    //                 0 1 2     0 1 2 3    0 1 2  3   4
            int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}, {13, 14, 15, 20, 16, 17}};
            //                      0          1             2                  3

            int max = arr2D[0][0];

            for (int j = 0; j <= arr2D.length - 1; j++) { // j: index numbers of arrays

                int[] eachArray = arr2D[j];

                for (int i = 0; i <= eachArray.length - 1; i++) { // i: index numbers of elements
                    int eachNum = eachArray[i];
                    if (eachNum > max) {
                        max = eachNum;
                    }
                }
            }
            System.out.println("Maximum: " + max);
        }
    }
