package Day34_WrapperClass_ArrayIntro;

import java.util.ArrayList;


public class J_AList_Inro_ADD_GET {
    public static void main(String[] args) {

       // Array list sentaksi
        ArrayList<Integer> scores = new ArrayList<Integer>();
        //1.tip
        scores.add(95); // autoboxing // 0 indeksi     simdi tek tek ekleyecegiz.
        scores.add(100); //              1  index
        scores.add(85); //               2 index
        scores.add(75); //               3 index

        scores.add(1, 80); // 2.tip

        System.out.println(scores); // [95, 100, 85, 75] verecek.


        // get(); method ChaAt metoduna aynisi
        System.out.println(scores.get(1)); // 1 indexi yazinca 100 verecek.

    ArrayList<Integer> name= new ArrayList<Integer>();


    }


}
