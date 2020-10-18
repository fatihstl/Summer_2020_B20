package Day60_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ItarablePractice {
    public static void main(String[] args) {
// for loop ile kaldirma
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3 ,3, 4));

       /* for (int i = 0; i<list1.size(); i++){
            if(list1.get(i)<5 ){
                list1.remove(i);
            }
        }

        System.out.println(list1);
*/

        System.out.println("====================================================================");
   // lamda ile kaldirma
     ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4, 5, 6, 7 ,8, 9, 10, 1 ,2 ,2, 3, 3, 4));

        list3.removeIf(p -> p<5); // internally uses
        System.out.println(list3); //

    System.out.println("====================================================================");
    ArrayList<Integer> List4= new ArrayList<>(Arrays.asList(1,2,3,4, 5, 6, 8 ,9, 10, 1 ,2, 3, 4  ));
    Iterator<Integer> it = List4.iterator();

    while(it.hasNext()){
           if(it.next()<5){
               it.remove();
           }
        }
        System.out.println(List4);


        System.out.println("==========================================================");
        ArrayList<Integer> List5= new ArrayList<>(Arrays.asList(1,2,3,4, 5, 6, 8 ,9, 10, 1 ,2, 3, 4  ));
        for (Iterator<Integer>i= list1.iterator(); i.hasNext(); i.hasNext()  ){
            if (it.next()<5){
                it.remove();
            }
        }
        System.out.println(List5);
    }

}
