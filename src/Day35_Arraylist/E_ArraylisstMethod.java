package Day35_Arraylist;

import java.util.ArrayList;

public class E_ArraylisstMethod {
    public static void main(String[] args) {

        ArrayList<String> earlyBirdList = new ArrayList<>();

        earlyBirdList.add("Ibrahim");
        earlyBirdList.add("Virginia");
        earlyBirdList.add("Ziyadin");// bunun yerine Aslan geldi.
        earlyBirdList.add("Erfan");
        earlyBirdList.add("Erfan");
        earlyBirdList.add("Alia");

        // set method
        earlyBirdList.set(2, "Aslan");
        earlyBirdList.set(0, "Lan");
        System.out.println(earlyBirdList);


        //clear
        earlyBirdList.clear();
        System.out.println(earlyBirdList);


        // romove (int inx) istedigin elementin endeksini yaziyorsun kaldiriyor. I. sekil
        ArrayList<Integer>list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3); // bu remove olacak
        list.add(4);
        list.add(5);

        list.remove(2); // 3un indexini yazdik
        list.remove(2); // bu kea yeni 4 indesinsi oluyor
        System.out.println(list);


        System.out.println("==================================");;

        // remove metodun ikincisi  elementi silecek
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);

    Integer a = 1; // biri silecek
    list2.remove(a);
        System.out.println(list2);


        // ornek remove icin

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Hamid");
        list3.add("Lilia");
        list3.add("Bulnet");
        list3.add("Viroel");
        list3.add("Musa");

        list3.remove(2);// bulneti silecek.primitive stili
        list3.remove("Hamid"); // elementi silecek. hamidi silecek.
        System.out.println(list3);


    }
}
