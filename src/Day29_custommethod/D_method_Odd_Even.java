package Day29_custommethod;

public class D_method_Odd_Even {

           // 1. create a method that can print odd numbers between 1~100
           // 2. create a method that can print even numbers between 1~100
           public static void main(String[] args) {

               odd();
               System.out.println("Hello");
               evenNumbers();
               evenNumbers();
               odd();
           }

    public static void odd() {

        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " ");

        }
       System.out.println();// print yazdigimiz icin yapiyoruz.
    }

    public static void evenNumbers(){
               for (int i = 0; i<= 100; i+=2){
                   System.out.print(i +" ");
               }
        System.out.println();
    }
}
