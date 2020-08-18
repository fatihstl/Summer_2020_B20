package Day38_Recap_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class A_gradeReport {

    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(100, 96, 95, 43,  86, 87, 88, 76, 45, 63, 73, 78, 98,53, 65));

        System.out.println(list);

        ArrayList<Integer> gradeA= new ArrayList<>(); // 90-100
        gradeA.addAll(list); // tum rakamlar
        gradeA.removeIf(each-> each <90); // A da olmayanlar gidiyor
        System.out.println("Grade A: "+gradeA); // sadece a denk gelenler.



        ArrayList<Integer> gradeB = new ArrayList<>();
        gradeB.addAll(list); // once listeyi aldik
        gradeB.removeIf(each-> each<80 ||  each>89); // sartimizi koyduk b OLMAYANLARI KALDIRIYOR.
        System.out.println("Grade B: "+ gradeB);// notumuzu verdik.


        ArrayList<Integer> gradeC = new ArrayList<>(); //70 ~ 79
        gradeC.addAll(list); // first store all the grades
        gradeC.removeIf( p -> p < 70 || p > 79 ); // second remove the grades that are not C  ( F, D, B, A)
        System.out.println("Grade C: "+gradeC);

        ArrayList<Integer> gradeD = new ArrayList<>(); // 60 ~ 69
        gradeD.addAll(list);
        gradeD.removeIf( p -> p <60 || p > 69);
        System.out.println("Grade D: "+gradeD);

        ArrayList<Integer> gradeF = new ArrayList<>(); // 0 ~ 59
        gradeF.addAll(list);
        gradeF.removeIf( p -> p > 59);

        /*
        gradeF.removeAll( gradeA );
        gradeF.removeAll( gradeB );
        gradeF.removeAll( gradeC );
        gradeF.removeAll( gradeD );
        */

        System.out.println("Grade F: "+gradeF);


        System.out.println("===========================================");

        System.out.println((gradeA.size()+ " student made A"));
        System.out.println((gradeB.size()+ " student made b"));
        System.out.println((gradeC.size()+ " student made c"));
        System.out.println((gradeD.size()+ " student made D"));
        System.out.println((gradeF.size()+ " student made failed"));




    }

          }
