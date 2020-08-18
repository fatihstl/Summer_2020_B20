package Day29_custommethod;

public class S_max_min {
   // 11. wirte a method that can print out the maximum number from any array of integers
   // 12. wirte a method that can print out the minimum number from any array of integers

    public static void main(String[] args) {
        int [] numbers = {10, 9, 20000 , 11 ,300, -200};

        maxNum(numbers); // maximim bulduk


    }

    public static void maxNum (int[] arr){

        int max = arr[0];

        for (int  each : arr){
            if (each>max){
                max=each;
            }
        }
        System.out.println("max: "+ max);
    }



}
