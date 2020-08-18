package Office_Hours;

public class Day24_uniqe_Arr {

    public static void main(String[] args) {

        int[] arr = {1,1,2,3,3, 1 , 4 , 4, 6, 7, 7, 9};

        for(int b: arr){

            int count = 0; // for the frequency of num in the arr
            for( int each : arr ){ // for counting the frequency of num
                if(each == b){
                    count++;
                }
            }

            if(count == 1){
                System.out.println(b);
            }

        }
    }

}
