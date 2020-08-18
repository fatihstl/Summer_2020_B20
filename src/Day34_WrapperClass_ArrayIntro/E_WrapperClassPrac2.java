package Day34_WrapperClass_ArrayIntro;

import javax.swing.*;
import java.util.Arrays;

public class E_WrapperClassPrac2 {
    public static void main(String[] args) {
        //int [] arr= {1,24,3, 2};

        Integer[] arr2= {1,2,4,3};
        for (int each : arr2){
            System.out.print(each);
    }
      //
        double [] arr3 = {1,2,3,45,6};
       // Double [] arr4 = {1,3,4,5,6}; compaoler verir cunku 1.0, 2,0, 45.0 vermek lazim
        Double [] arr4 = {1.0, 2.0, 3.0};
        for (Double each : arr4){ // dikkat D wrapper yaptik.
            System.out.println(each);
        }

         char [] arr =  {65, 67, 68, 69};
        System.out.println(Arrays.toString(arr));

        char ch = 79;
        Character ch2 = 79;
        System.out.println(ch2);


        String[] nums1 = {"12.5", "13.5", "14.5", "15.5"};

        double[] nums2 = new double[nums1.length];

        for( int i = 0; i <= nums1.length-1; i++){
            nums2[i] = Double.parseDouble(nums1[i]) ;
        }
        System.out.println(Arrays.toString(nums2));



    }
}
