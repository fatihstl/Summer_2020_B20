package Day36_Arraylist;

import java.util.ArrayList;

public class D_ArrayMethod {
    public static void main(String[] args) {


      /*
    indexOf()
    lastIndexOf()
    contains()
    equals()
    isEmpty()
 */
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); //0
        list.add(20); //1
        list.add(30); //2
        list.add(40); //3
        list.add(50); //4
        list.add(40); //5
        int a = list.indexOf(40);
        System.out.println(a); // 3
        System.out.println(list.indexOf(60)); // -1  object 60 is not exist in the list
        System.out.println(list.lastIndexOf(40)); // 5
        boolean r1 = list.contains(100);
        System.out.println(r1); // falsel

    }
}
