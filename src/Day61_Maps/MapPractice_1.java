package Day61_Maps;

import java.util.Map;
import java.util.TreeMap;

public class MapPractice_1 {
    public static void main(String[] args) {

        // 1-  put method
        Map<String,Double> emloyee=  new TreeMap<>();
        emloyee.put("Ziiadin", 120_000.0);
        emloyee.put("coco ", 130_000.0);
        emloyee.put("cihan", 150_000.0);
        emloyee.put("Nurbiye", 120_000.0);
        emloyee.put("Roman", 80000.0);
        emloyee.put("Ali",  100_000.0);

        System.out.println("employee: "+ emloyee);

        System.out.println(emloyee.size()); // kac cift data var ise onu verir.


        // 2- GET();

        System.out.println("salary of Ziiadin: $"+ emloyee.get("Ziiadin"));

        //   3 - REMOVE
        emloyee.remove("Ziiadin");
        System.out.println(emloyee); // Ziiaadin de maasi da gitti.
        System.out.println(emloyee.size());


        // 4    ContainsKey
        boolean r1 = emloyee.containsKey("Roman");
        System.out.println(r1);

        // ContainsValue
        boolean r2 = emloyee.containsValue(120000.0);
        System.out.println(r2);

        // clear
        emloyee.clear(); // hepsini siler
        System.out.println(emloyee);

        // Empty();
        System.out.println(emloyee.isEmpty());

    }





}

