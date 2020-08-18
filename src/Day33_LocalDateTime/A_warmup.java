package Day33_LocalDateTime;

public class A_warmup {

  //  1. create a method that can calculate the addition of two integers
  //      2. create a method that can calculate the addition of two decimals
   //     3. create a method that can calculate the multiplication of two integers
     //   4. create a method that can calculate the multiplication of two decimals

    public static void main(String[] args) {
        int a = 10;
        double b= 20;

        System.out.println(addition(a,b));// burada integer istedik
        System.out.println(addition(90, 5.5));
        System.out.println(addition(10, 20));
    }

         public static int addition (int a, int b){
             return a+b;
         }

         public static double addition (double a, double b){
             return a+b;
      }

    public static int multiplication (int a, int b){
        return a*b;

    }
    public static double multiplacatin (double a, double b){
        return a*b;
}



}
