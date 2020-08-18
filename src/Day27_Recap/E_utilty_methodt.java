package Day27_Recap;

import java.util.Arrays;

public class E_utilty_methodt {
    public static void main(String[] args) {

int [] score = {80, 75, 65, 110, 45, 56, 78};

        Arrays.sort(score);
        System.out.println(Arrays.toString(score));


        System.out.println("maximum: "+ score[score.length-1]);
        System.out.println("minumum: "+ score[0]);


        System.out.println("================================");

         // esit mi
        String [] s1 = {"A", "B", "C"};
        String [] s2= {"A" , "B", "C"};  /// true

        System.out.println(Arrays.equals(s1, s2));

        String [] a1 = {"A", "B", "C"};
        String [] a2= {"C" , "B", "C"};  /// bunlar esit degil once sort yapacagiz.

        Arrays.sort(a1);
        Arrays.sort(a2);

        System.out.println(Arrays.equals(a1,a2));





    }
}
