package Day32_MethodOverloading;

public class methodOverloading2 {

   /* 1. create a method that can find the addition of two numbers
            addition2Numbers
    2. create a method that can find the addition of three numbers
            addition3Numbers
    3. create a method that can find the addition of four numbers
            addition4Numbers */

   public static void addition2Numbers(int num1, int num2){
             System.out.println(num1+num2);
         }
         public static void addition3Numbers(int num1, int num2, int num3){
        System.out.println(num1+num2+num3);
    }

      public static void addition3Numbers(int num1, int num2, int num3, int num4){
        System.out.println(num1+num2+num3+num4);
    }

        // =========================================================

    public static void main(String[] args) {
       addition(10,20);
       addition(10,20,30);
       addition(10,20,30,40);
        System.out.println(addition(10,20));

    }

    public static int addition (int num1, int num2){
        return num1+num2;
    }
    public static void addition (int num1, int num2, int num3){
        System.out.println(num1+num2+num3);
    }
    public static void addition (int num1, int num2, int num3, int num4){
        System.out.println(num1+num2+num3+ num4);
    }

}
