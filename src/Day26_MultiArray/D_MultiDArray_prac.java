package Day26_MultiArray;

import java.util.Arrays;

public class D_MultiDArray_prac {
    public static void main(String[] args) {

        String [] Testers = {"Liliia" , "Odina" , "Cristina", "Elkem"};

         String [] Develepors = { "Ahmet" , "Ali" , "Veli", "Deli"};
         String [] SM = {"Fatih"};
         String [] PO = {"Nadir"};
         String [] BA= {" Alex"};

         String [] [] Scrumteam=  {Testers, Develepors, SM, PO, BA };
                                   // 0        1          2  3   4
/*
        Scrumteam [4] [0]= "ADAM"; // Alexi Adem ile degistirdik.
        Scrumteam [1] [2]= "EMINE"; // Aliyi Emine ile degistirdik

        String[] testers2 = {"Can", " Kan", "Dan"};

        Scrumteam [0] = testers2;  // birinci tester ile yeni tester degistirdik.
        System.out.println(Arrays.deepToString(Scrumteam)); */

        // for each yapacagiz.

        for (String [] each : Scrumteam){
            //System.out.println(Arrays.toString(each));
            for (String name : each){
                System.out.println(name);
            }


        }


    }

}
