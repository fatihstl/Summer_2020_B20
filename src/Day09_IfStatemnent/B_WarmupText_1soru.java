package Day09_IfStatemnent;

public class B_WarmupText_1soru {
    public static void main(String[] args) {

        /*1. write a java program that accepts three numbers and return the maximum number
        (assume that none of them are equal)  MAKXIMUM SAYIYI BULUYORUZ*/


        double a = 500;
        double b = 200;
        double c = 1000; // bu rakamlari biz ortaya cikardik.

        boolean aIsMax= a > b && a>c; // masimum numberi buluyoruz.

        boolean bIsMax = b> a && b>c;
            //boolean bIsMax = aIsMax == false && b >c; // ikinci yol

        boolean cIsMax =  c >a && c> b;
                // boolean cIsMax = aIsMax==false && bIsMax== false; // ikinci yol

          double max  = 0;


              if (aIsMax){

                 // System.out.println(a);
                  max = a;
              }

              if (bIsMax){
                //  System.out.println(b);
                  max= b;
              }
              if (cIsMax){

                 // System.out.println(c);
                  max = c;
              }
              System.out.println(max+ " is maximum number.");


          }

    }



