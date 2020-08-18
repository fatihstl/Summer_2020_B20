package Day34_WrapperClass_ArrayIntro;

import java.util.ArrayList;

public class K_AList_size {

    public static void main(String[] args) {
       ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();

        for (int i = 0; i<= 100; i++){
            if (i%2== 0){
                evenList.add(i);
            } else {
                oddList.add(i);
            }
        }

        System.out.print(oddList.toString());
        System.out.println();
        System.out.print(evenList.toString());



        System.out.println("===================================");

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("milk");
        groceryList.add("apple");
        groceryList.add("egg");
        groceryList.add("mango");
        groceryList.add("Ice Cream");

        System.out.println(groceryList.size());

          // for ile yaptik.  size
        for (int i = groceryList.size()-1; i>= 0; i--){
            System.out.print(groceryList.get(i)+ ", ");
        }
        System.out.println();

              // for each ile yapabiliriz.
          for (String each : groceryList){
              System.out.println(each);
          }








    }
}
