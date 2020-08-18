package Day30_costumMethod;

import java.util.Arrays;

public class B_WarmUpTaks {
  //1. create a function that can print out the maximum number between two numbers
    //2. create a function that can print out the array of integers in descending order
    //3. create a function that can print out the combination of two integer arrays
  //  4.     step1: create a function that can check if the given integer is positive, negative or zero
    //step2: Use the above method to  write a program that can check every single elements of an array of Integers
    //MUST use for each loop
   // Collapse
////:blue_heart:
//            4
 //           :100:

    public static void main(String[] args) {

      maxNum(5, 5);


      int arr [] = { 5,3, 67,43,98,34567,12,65,78};
       printDesc(arr);


        int[] a1 = {1,2,3,4,5};
        int[] a2 = {6,7,8,9,10,11,12,13,14};
        combine2Arrays(a1, a2);

        posNegZero(100);

        int [] a3= {100, -100, 300, 0, 0 , 900};
        for(int each : a3){
            posNegZero(each);
        }

    }
        // 1. soru
    public static void maxNum (int a, int b ){
      if (a==b){
          System.out.println("equal");
           return;
      }
         if (a>= b){
             System.out.println(a+ " is maximum");
         }        else {
             System.out.println(b+ "  is maximim");
         }

    }

    //2. Soru
    public static void printDesc(int[] arr){  //{10,9,20,30,5,6,7};
            Arrays.sort(arr); // {5, 6, 7, 9, 10, 20, 30};

            for(int i=arr.length-1; i >= 0; i-- ){
                System.out.print(  arr[i]+" " );  // 30 20 10 9 7 6 5
            }

            System.out.println();
        }

    //Task03: {1,2,3] {4,5,6}  ==> {1, 2, 3, 4, 5, 6}
    public static void combine2Arrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0;
        for(int each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(int each : arr2){
            arr3[i]= each;
            i++;
        }

        System.out.println( Arrays.toString(arr3));

    }



    // 4.soru
    public static void posNegZero (int num){
        if (num>0){
            System.out.println(num+ " is pozitif");
        } else if (num<0) {
            System.out.println(num+ " is negative");
        } else {
            System.out.println(num + " zero");
        }
    }



}




