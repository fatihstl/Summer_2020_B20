package Day61_Maps;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class IteratingKeysValues {
    public static void main(String[] args) {

        Map<String, LocalDate> students = new TreeMap<>();
        students.put("Hasan", LocalDate.of(1985, 4, 4));
        students.put("Jesus", LocalDate.of(1985, 8, 19));
        students.put("Muhtar", LocalDate.of(1985, 5, 8));
        students.put("Muhtar", LocalDate.of(1965, 3, 4));

        System.out.println(students.keySet());

        //  LOOPS KEYE NASIL APPLY EDILIR
        for (String each : students.keySet()) {
            System.out.println(each);
        }
        System.out.println("=========================================================================");

        // applying loops to the values

        for (LocalDate each : students.values()) {
            System.out.println(each);
        }
        System.out.println("====================================================================");







    }
}








