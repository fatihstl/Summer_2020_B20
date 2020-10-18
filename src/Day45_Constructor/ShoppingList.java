package Day45_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {

    public static void main(String[] args) {

        Item  item1 = new Item("Apple", 1,5);
        Item item2 = new Item("Orange", 2,8);
        Item item3 = new Item("Banana", 0.5,10);
        Item item4 = new Item("Lamb",5,10);
        Item item5 = new Item("IceCream",10,1);


        ArrayList<Item> list = new ArrayList<>();
        list.addAll(Arrays.asList(item1, item2, item3, item4, item5 ));

        System.out.println("Items: "+list.size());
        double totalCost = 0;

        for (Item each :list){
            totalCost+= each.calcost();
        }

        System.out.println("Total Price: "+totalCost);

        System.out.println("=========================================================");
        Item [] items = {item1, item2, item3, item4, item5};
        double totalCost2 = 0;

        for (int i = 0; i <= items.length-1; i++){
            items[i].calcost();
            totalCost += items[i].calcost();

        }
        System.out.println(totalCost);



    }

}
