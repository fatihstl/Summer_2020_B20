package Day06_CompretionOperator;

public class F_Realatinal_operator {

    public static void main(String[] args) {

        boolean  re = 10 > 9;
        System.out.println(re);


        boolean ce = 100 < 9900;
        System.out.println(ce);

        boolean r2 = 100 < 9000;
        System.out.println(r2);

        boolean  cano  = 87>= 85;
        System.out.println(cano);

        boolean tels  =  87 >= 85;
        System.out.println(tels);

        boolean hayderi =  88 >= 88;
        System.out.println(hayderi);


        boolean cano1 =  87>= 98;
        System.out.println(cano1);

        boolean halo = 877 >= 878;
        System.out.println(halo);

        boolean r5 = 200 <= 300;
        System.out.println(r5);

        boolean r6  = 100== 100;// true
        System.out.println(r6);

        boolean ali = 18 == 17; //  false
        System.out.println(ali);


        boolean y3 = "muhtar" == "muhtar"; // true
        boolean y98 = "muhtar" == "Muhtar"; // false because biri buyuk.

        boolean re1 = "muhtar" != "fatih";
        System.out.println(re1);

        boolean result1 = 'A' ==65;  //  ascii table
        System.out.println(result1);

        boolean result2 = 100== 100.0;
        System.out.println(result2); // true  $100 = $100.0 esittir

        boolean result3 = 10== (int)10.90;
        System.out.println(result3);// true verecek cunku int atiyor

        int number = 100;
        boolean even = number%2 ==0;
        System.out.println(even);


        boolean alice = 100 == (int)100.999;
        System.out.println(alice);

        int alit = 18;
        alit = 2;
        System.out.println(alit);

           }


}
