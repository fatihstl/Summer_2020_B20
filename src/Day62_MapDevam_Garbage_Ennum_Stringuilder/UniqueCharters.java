package Day62_MapDevam_Garbage_Ennum_Stringuilder;

import java.util.*;

public class UniqueCharters {

    public static void main(String[] args) {
        String str = "abacbdeefgghijklmmnn";
        Map<String, Integer> map = new LinkedHashMap<>();  // {c=1, d=1, f=1}

        List<String> list = Arrays.asList(str.split(""));

        for (String each : list) {   //each: abacbdeef
            if (Collections.frequency(list, each) == 1) {
                map.put(each, 1);
            }
        }

        System.out.println(map);

        // verify that J is unique
        System.out.println(map.containsKey("j"));

    }
}