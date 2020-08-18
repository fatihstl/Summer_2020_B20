package Day11_NestedIfSwich;

import jdk.swing.interop.SwingInterOpUtils;

public class D_ternaryIkinci {

    public static void main(String[] args) {



      /* int age = 18;
       boolean Id = true;

       String eligible = (age > 18 && Id== true ) ? "eligble" : "not eligible";
        System.out.println(eligible);*/


        // uzun yolu

        int age =  18;
        boolean Id = true;
        String eligible = "";

        if (age > 18 && Id== true ) {
            eligible = "eligible";
        }else {
            eligible = "not eligible";
        }
        System.out.println(eligible);
    }

}
