package Day60_Collection;

import java.util.*;

public class TaskDerste_COKNEMLI_INTV_SIRALAMA_DUBLICATE_KALDIR {



    public static void main(String[] args) {
/*
task:
    1. write a program that can identify if two strings are build out of same characters
        ex:
           str1 = "abcabc"
            str2 = "cab"
            output:
                true
            str1 = "cabccccccaaaaaa";
            str2 = "bca";
            output:
                true
 */


        String a1 = "abcabc";
        String a2 = "cab";

        HashSet<String> b1 = new HashSet<>();
        b1.addAll(Arrays.asList(a1.split("")));

        System.out.println(b1);

        HashSet<String> b2 = new HashSet<>();
        b2.addAll(Arrays.asList(a2.split("")));
        System.out.println(b2);

        a1 = b1.toString();
        a2 = b2.toString();


        System.out.println(b1.equals(b2));

        System.out.println("================================================");

        // cok guzel bir yol dublicate kaldirmak ve siralamak icin.
        String x1 = "cacacabb";
        String x2 = "bbcaaaa";

         x1 =   new TreeSet<>(Arrays.asList(x1.split(""))).toString();// a b c    verecek dub kaldiracak ve siralayacak.
         x2 =   new HashSet<>(Arrays.asList(x2.split(""))).toString(); // a b c   verecek.

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x1.equals(x2));

        System.out.println("====================================================================");
        // Arraydeki dublicateleri kaldiriyor.
        String [] names = {"Aalia", "Mustafa", "Elkem", "Aalia", "Aalia", "Viginia"}; // tum aliyalari kaldiracak.
        LinkedHashSet<String> set1 = new LinkedHashSet<>();

        set1.addAll(Arrays.asList(names));

        System.out.println(set1);

        // BUrada cok ilginc birsey yaptim. Arraylisti arraye cevirdim.
       names = set1.toArray(new String[0]);// converting collection type to array.
       System.out.println(Arrays.toString(names)); // dublicateler kaldirilmadi.

        System.out.println("=============================================================");
              // DUBLICATE KALDIRMANIN COK KOLAY YOLU
        //   Arrayi bir data kullandim
        //Sonra onu arraylist ile dublicatelerini kaldirip tekrar array yaptim.
        // [0] herhaingi bir rakam olabilir onemli degil sadece bos kalmasin

        String [] names2 = {"Roman", "Abzal", "Nurbiye", "Roman", "Roman", "Roman", "Roman"};

        new LinkedHashSet<>(Arrays.asList(names)).toArray(new String[0]);


        System.out.println(Arrays.toString(names));


        System.out.println("=============================================================");

        // HEM DUBLICATE kaldirilacak hem siralayacak. COK GUZEL KULLAN
        Integer[] numbers = {1,1,2,2,2,2, 0 , 0, 0, 0, 3, 3, 4, 5, 6, 7, 8, 9 };

        numbers=   new TreeSet<>(Arrays.asList(numbers)).toArray(new Integer[0]);

        System.out.println(Arrays.toString(numbers));





    }

}
