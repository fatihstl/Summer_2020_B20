package Day23_Nestedloops_Arrays;

public class J_min_max {
    public static void main(String[] args) { // max sayiyi buluyoruz.

   int [] arr = {5 , 5, 4, 3, 4, 1};
   int  max = arr[0];  //  ilki ile karsilastirip enbuyugunu buluyoruz

   int min = arr[0]; // ilk sayiyi ile karsilistirip en kucugunu buluyoruz.

        for (int i = 1; i <= arr.length-1; i++) {

            if(arr[i]> max){ // compare array element and
                max= arr[i];
            }
            if (arr[i]< min){
                min= arr[i];
            }

        }
        System.out.println("max number is: "+max);
        System.out.println((" min number is: "+ min));

    }

}
