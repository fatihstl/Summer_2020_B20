package Day19_for_loop;

public class T_FINRA {

    public static void main(String[] args) {
     /*   1. Write a method which prints out the numbers from 1 to 50 butfor numbers which are a multiple of
     both 3 and 5, print "FINRA" instead of the number,  for numbers which are a multiple of 3,
     print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number.
      */

      for (int i = 1 ; i <=50 ; i++){
          if (i %3 ==0 && i %5== 0){ // 3 ve 5 bolundugu takdirde
              System.out.print("FINRA ");
          }else if (i %3 ==0){ // sadece 3 bolunurse
              System.out.print("FIN ");
          }else if (i %5==0){ // sadece bolunurse
              System.out.print("RA ");
          } else {
              System.out.print(i+ " ");
          }
      }

    }
}
