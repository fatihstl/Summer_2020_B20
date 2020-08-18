package Day11_NestedIfSwich;

import javax.swing.*;

public class E_ternary {

    public static void main(String[] args) {

        int age = 23;
        String citizenship = "USA";

        String  result = "";

        if (age>= 18 && citizenship =="USA"){

            result = "Can Vote";
        } else {
            result = "can not vote";
        }
        System.out.println(result);

        // Ayni ornegin kisa yolu
        String  result1 =  (age>= 18 && citizenship =="USA") ? "can vote " : "Can not vote";
        System.out.println(result);



        // ORNEK-2 iki sayi esit mi degil mi ternary ile.
        int n1= 100;
        int n2 = 200;
        String res1 = (n1==n2) ? "equal" : "not equal";
        System.out.println(res1);





    }

}
