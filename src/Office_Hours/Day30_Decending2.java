package Office_Hours;

import java.util.Arrays;

public class Day30_Decending2 {
    public static void main(String[] args) {

        int [] arr= { 98, 97, 100, 200, 55, 68};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] descArr= new int [arr.length];
        int k= arr.length-1;
        for (int each : arr){
          descArr[k]= each;
          k--;
        }
        System.out.println(Arrays.toString(descArr));

    }

}
