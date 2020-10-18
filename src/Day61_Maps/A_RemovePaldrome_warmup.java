package Day61_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
// 1. write a program that can remove the palindrome string from a list of String
//            DO NOT use Lambda expressions

public class A_RemovePaldrome_warmup {
    public static void main(String[] args) {//  pelindramlari sildik


     String[]  words = {"Java","Payton", "Level",  "Kayak", "Cyertek", "Zaman","Ana", "Batch20"};

     List<String>list = new ArrayList<>();
     list.addAll(Arrays.asList(words));


      System.out.println(list);
      list.iterator();


      Iterator<String> it = list.iterator();

       while( it.hasNext() ){
          String each =  it.next();
          String   reverse =  "";

          for (int i = each.length()-1; i>= 0; i--) {
              reverse += each.charAt(i);

          }

          if (each.equalsIgnoreCase(reverse)){
              it.remove();
          }

       }
        System.out.println(list);

    }
}
