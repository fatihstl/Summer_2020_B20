package Office_Hours.Practice_10_07_2020_Collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class IteratorPractice {
    public static void main(String[] args) {


        Set<Integer> st =  new LinkedHashSet<>();
        st.addAll(Arrays.asList(1,2,3,4,5,6,7,8, 9, 10));

        Iterator<Integer> it =st.iterator();// iterator  metodu


       while(it.hasNext()){
         Integer each  =   it.next();

         if(each <5 ){
            it.remove();
         }
       }

        System.out.println(st);

    }


}
