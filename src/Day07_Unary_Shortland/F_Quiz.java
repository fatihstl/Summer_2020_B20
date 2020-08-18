package Day07_Unary_Shortland;

public class F_Quiz {

    public static void main(String[] args) {
         // ornek1
        int iNum=  100;
        double dNum = 200;
        float fNum = 300;

        dNum= iNum;
        iNum = (int) dNum;


        // soru-2
        System.out.println("result " + 0 + 1);
        System.out.println("result " + (1) + (2));

        // soru -3
        System.out.println(" 5 + 2 " +  3 + 4 ); //  5+2 34
        System.out.println(" 5 +2 " + (3+4)); // 5+2 7


        //soru - 4
        long a = 30l;
        long b = (short) a;
        System.out.println(b);

        // s-5
        float ali= 100.987_65f;
        short ba = (byte) ali;
        byte cey = (byte) ba;
        System.out.println(cey);


     // soru-6
        int a1 = 3;
        int b1 = 2;
        long c1 = (a + b ) * 2 / 3 % 2;
        System.out.println(c1);




    }


}
