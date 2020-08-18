package Day21_loops_dowhile;

import java.util.Scanner;

public class F_DoWhile_practice {
    public static void main(String[] args) {

      /*  int num = 1;
        do {
           // num++; buraya koyarsak 2 ile baslar yanlis olur
            System.out.print(num+ " ");
            num++; // buradan baslamamiz lazim 1 -20 baslar.
        }while (num <= 20); // yanlis olsaydi sadece bir kez yacacakti.
        System.out.println();
        System.out.println(num);// 21 olacak.

        // 2. ornek
        char ch = 'Z';
        do{
            System.out.print(ch+ " ");
            ch--;
        }while (ch>= 'A');*/

        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        int under= email.indexOf("_");
        int at = email.indexOf("@");
        int dot = email.indexOf(".");

        String adi= email.substring(0 , under);
        adi= adi.substring(0,1).toUpperCase()+adi.substring(1);

        String soyadi = email.substring(under+1, at);
        soyadi= email.substring(0, 1).toUpperCase()+soyadi.substring(1);

        String domain = email.substring(at+1 , dot);

        String topCom= email.substring(dot+1);


        System.out.println("First name: "+ adi);
        System.out.println("Last name: " + soyadi);
        System.out.println("Domain: "+ domain);
        System.out.println("Top-Level Domain: "+ topCom);


    }

}
