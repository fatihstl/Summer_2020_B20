package Day09_IfStatemnent;

public class D_Task_MidumumNumber {

    public static void main(String[] args) {

        // middum bulacagiz
       double a = 150;
        double b = 50;
        double c = 100;

        boolean aIsMid =  (a > b && a < c) || (a>c && a < b);
        boolean bIsMid =   (b >c && b<a)  || (b < c && b > a);
        boolean cIsMid = aIsMid== false && bIsMid ==false;
                           // !aIsMid && !bIsMid

        double mid = 0;

        if (aIsMid) {
            mid = a;
        }
        if (bIsMid) {
            mid = b;

                    }
         if (cIsMid) {
            mid = c;

         }
        System.out.println(mid+ " is Midium number.");

    }

}
