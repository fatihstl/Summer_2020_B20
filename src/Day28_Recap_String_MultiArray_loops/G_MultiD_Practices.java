package Day28_Recap_String_MultiArray_loops;

import java.util.Arrays;

public class G_MultiD_Practices {
    public static void main(String[] args) {

   String [] [] cybertek = {{"ali", "veli ", "Deli"}, {"Kal", "cal", "lal"}, {"erik", "uzum" , "kiraz"}};


     for (int i = 0 ;  i<= cybertek.length-1; i++){

         String eachone [] = cybertek[i];
         for (int j=0 ; j<= eachone.length-1; j++){

             System.out.print(eachone[j]+"  ");
         }
        System.out.println();
        }


    }

}
