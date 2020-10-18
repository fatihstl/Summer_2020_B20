package Office_Hours.Practice_25_8_2020ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListReview {
    public static void main(String[] args) {

        ArrayList<Integer> list1= new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        System.out.println(list1); // add metodu tek tek kullandim


        int [] num1 =  {80, 90, 100};
        Integer [] num2=  {80, 90 ,100};

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(list1); // add all hepsinis aldim

        list2.addAll(Arrays.asList( 80 ,90));
        System.out.println(list2);

        list2.addAll(Arrays.asList(num2));


        // remove merthod removeall, removeif

        list2.remove(8);// index ile
        Integer a= 90;
       list2.remove(a);// obj ile sildim

    /*    list2.remove(new Integer(90));
        list2.remove(new Integer(70)); */

      list2.removeAll(Arrays.asList(30,70,90));

      list2.removeIf(p->p>50); // eger objelerin degeri 50 fazla ise

      list2.addAll(Arrays.asList(100, 200, 300, 100, 100, 100));

      /// retain
       list2.removeAll(Arrays.asList(100,200, 300));  // bunlari sil gerisini birak.

        System.out.println(list2);

        // size
        System.out.println("Size: "+list2.size()); // kac element var ise

        // clear
        list2.clear();


        // set

        System.out.println("===========================================================");
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5, 6,7,8,9,10, 11, 12, 13,14,15));

       //  list3.set(list3.size()-1, 30);
        for (int i = 0; i <= list3.size()-1; i++) {
            Integer each = list3.get(i);
           if (each %2 != 0){
               list3.set(i, each*2);
           } else {
               list3.set(i, each*3);
           }
        }
        System.out.println(list3);


        System.out.println("============================================================================");

        // removeif metodu

        ArrayList<String> countries = new ArrayList<>();
        countries.addAll(Arrays.asList("America", "Engleand", "Austuralia", "New Zeleand", "Canada"));

       // countries.removeIf(p->p.endsWith("a")); // a ile baslayanlari sildim
       // countries.removeIf(p->p.charAt(p.length()-1)== 'd'); // d ile olanlari sildim.


        System.out.println(countries);



    }
}
