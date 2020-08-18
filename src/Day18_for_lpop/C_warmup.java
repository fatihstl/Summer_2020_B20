package Day18_for_lpop;

import java.util.Scanner;

public class C_warmup {

    public static void main(String[] args) {
 /* 4. write a program that will return the domain of an email address:
            Ex:
                input: test@gmail.com
                output: the domain of the email is: gmail
                inputL: Cybertek@yahoo.com
                output: the domain of the email is: yahoo*/
        Scanner input = new Scanner(System.in); // =====> scanner ile.
        String email= input.next();

   // String email = "cybertek@gmail.com"; /// ====> scanner kullanmadan.
    int index1= email.indexOf("@");
    int index2 = email.lastIndexOf(".");

    String domain= email.substring(index1+1 , index2);
            System.out.println(domain);


    }
}
