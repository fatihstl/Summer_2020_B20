package Day31_Recap;

public class A_methods_practices {

    public static void main(String[] args) {
        // int a = 3000000;
         max(10,20);
         max(20, 30);
        //    System.out.println( max(10,20) * 30  );

        int b = max2(10, 20);

        System.out.println( max2(10, 20)  );

        System.out.println( max2(10, 20) * 30);


    }


    public static void max(int a, int b){
        int max = (a > b) ? a : b;
        System.out.println(max);
    }


    public static int max2(int a, int b){
        return (a > b) ? a : b;
    }



}
