package Day24_ArrayUtility;

public class H_forEachloop {
    public static void main(String[] args) {

      int [] arr = {1, 2, 3, 4, 5, 6 ,7, 8, 9, -1, -2, -3};
      for (int i = 0; i<= arr.length-1; i++){
          System.out.print(arr[i] +" "); // buarda yazdirdik tum rakamlari for ile
      }
        System.out.println();

      for (int each : arr){ // o rakamlari verecek. ve ne sart ne de iterior var.
          System.out.print(each+ " ");
      }




    }
}
