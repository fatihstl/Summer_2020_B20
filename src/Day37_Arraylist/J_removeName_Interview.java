package Day37_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class J_removeName_Interview {
    public static void main(String[] args) {

        // listedeki Tum Ahmetleri kaldiriyoruz
        ArrayList<String> employeeName = new ArrayList<>();
        employeeName.addAll(Arrays.asList("Ahmet", "Muhtar", "Ahmet",  "Virginia", "Beslan", "Ibrahik"));
        System.out.println(employeeName);

        employeeName.removeAll((Arrays.asList("Ahmet", "Muhtar"))); // // listedeki Tum Ahmetleri kaldiriyoruz
        System.out.println(employeeName);


        employeeName.retainAll(Arrays.asList("Ahmet")); // Ahmeti birak digerlerini sil
        System.out.println(employeeName);

        employeeName.removeAll(Arrays.asList("Beslan"));
        System.out.println(employeeName);

    }
}
