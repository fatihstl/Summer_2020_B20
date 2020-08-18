package Day25_StringMeth_Loops_Arry_RECAP;

public class E_warmup_ {
    public static void main(String[] args) {
  // Write a program that can count the even and odd number from an array of integers.

        int [] nums = {1,2,3,4,5,6,7,8,9,10,11, 100 , -10 , -60, 600};

        int countEven = 0;
        int countOdd= 0;

        for (long each : nums){
           if (each %2==0){
               countEven +=1;
           } else {
               countOdd++;
           }
        }
        System.out.println("Even Numbers: "+countEven);
        System.out.println(("Odd Numbers: "+ countOdd));
        System.out.println(countEven);
        System.out.println(countOdd);
    }
}
