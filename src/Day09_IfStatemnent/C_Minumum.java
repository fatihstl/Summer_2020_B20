package Day09_IfStatemnent;

public class C_Minumum {

    public static void main(String[] args) {

     /*   // Minumum sayiyi bulacagix

        double a = 100;
        double b = 200;
        double c = 300;

        boolean aIsMin =  a < b && a < c;
        boolean bIsMin =  aIsMin == false && b <c;
        boolean cIsMin =  aIsMin==false && bIsMin == false;

        double min = 0;

        if (aIsMin){
            min = a;

        }

        if (bIsMin){

            min = b;

        }

        if (cIsMin){

            min= c;

        }

        System.out.println(min+ " is the minumum number.");*/

     // minumum sayiyi bulacagiz.
       double a = 100;
       double b = 200;
       double c = 300;

       boolean aIsMin = a< b && a < c;
       boolean bIsMin = aIsMin == false && b<c;
       boolean CIsMin =  aIsMin== false && bIsMin== false;
                       // !aIsMin && !bIsMin

       double min = 0;

       if (aIsMin){
           min = a;
       }
       if (bIsMin){
           min = b;
       }
       if (CIsMin){
           min = c;
       }
        System.out.println(min+ " is MINUMUM NUMBER");

    }
}
