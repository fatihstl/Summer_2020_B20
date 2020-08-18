package Day38_Recap_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class B_ArrayList_Methods {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.addAll(Arrays.asList("BMW", "Mercedes", "Infinity", "Mazda", "Tesla", "WV","Lambordini", "Lexus", "Tesla"));


        cars.remove(1);// Mersedesi kaldirdik kaldirdik.
        cars.remove("WV");// simdi de element ile kaldirdik.
        cars.removeAll(Arrays.asList("Tesla"));// tum teslalari silecek. aslist ile yapilir All metodlar
        cars.removeIf(p->p.toLowerCase().contains("m"));// icinde me olanlarin hepsini cikar.
        cars.retainAll(Arrays.asList("Tesla"));
        System.out.println(cars);

        System.out.println("=====================================");

        ArrayList<String>groceryList= new ArrayList<>();
        groceryList.addAll(Arrays.asList("Eggs","Milk", "Paper Towels", "Mango","Orange", "Avacodo"));

        // pepsi var mi yok mu kontrol ediyoruz.
        boolean r1= groceryList.contains("Pepsi");
        System.out.println(r1);// false verir cunku pepsi yok.

        // Eggs, Milk, Oronge
        boolean r2= groceryList.containsAll(Arrays.asList("Eggs", "Orange", "Milk"));
        System.out.println(r2); // cunku hepsi var bir tane bile olmasaydi false olurdu.

        System.out.println("Total Number of Items: "+ groceryList);

        // set dragon fruot

        groceryList.set(groceryList.size()-1, "Apple");
        groceryList.set( groceryList.indexOf("Paper Towels") ,  "Dish Washer");

        System.out.println(groceryList);

        groceryList.clear();
        System.out.println(groceryList);



    }
}
