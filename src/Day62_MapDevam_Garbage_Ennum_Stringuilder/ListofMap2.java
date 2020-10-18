package Day62_MapDevam_Garbage_Ennum_Stringuilder;

import java.time.LocalDate;
import java.util.*;

public class ListofMap2 {

    public static void main(String[] args) {

            String[] friends = {};
            LocalDate[] DOBFriends = {};

            String[] classMates = {};
            LocalDate[] DOBClassMates = {};

            String[] family = {};
            LocalDate[] DOBFamily = {};


            List<Map<String, LocalDate>> list = new ArrayList<>();
            list.addAll(Arrays.asList(
                    new LinkedHashMap<>(),
                    new LinkedHashMap<>(),
                    new LinkedHashMap<>()
            ));


            System.out.println(list);


        }
    }
