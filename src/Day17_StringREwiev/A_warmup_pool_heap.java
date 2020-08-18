package Day17_StringREwiev;

import jdk.swing.interop.SwingInterOpUtils;

public class A_warmup_pool_heap {
    public static void main(String[] args) {

        String  s1= "Cybertek";
        String s2 = "Cybertek";
        String s3= new String("Cybertek");
        String s4= new String ("Cybertek");


        System.out.println(s1== s2);
        System.out.println(s2== s3);


    }

}
