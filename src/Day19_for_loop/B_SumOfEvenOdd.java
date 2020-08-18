package Day19_for_loop;

public class B_SumOfEvenOdd {
    public static void main(String[] args) {

        //3. write a program that can calculate the sum of all the even numbers between 1 ~ 100

        //  3 soru // 0-100 e kadarki tum even numberlari topluyoruz.
        int sum= 0;
        for ( int i = 0 ; i <= 100; i +=2){
            sum += i;
        }
        System.out.print(sum);

        System.out.println();
        // 4. soru
        // 4. write a program that can calculate the sum of all the odd numbers between 1 ~ 100
         int sumOfOdd= 0;
        for (int i = 1; i<=100; i += 2){
            sumOfOdd += i;
        }
         System.out.println(sumOfOdd);


            }
}
