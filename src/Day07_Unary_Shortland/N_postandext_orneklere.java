package Day07_Unary_Shortland;

public class N_postandext_orneklere {


    public static void main(String[] args) {
              // ornek 1
        int b = 10;
        System.out.println(b--);

      // ornek 2
        int c = 25;
        int d = c++;
        System.out.println(d);
        System.out.println(c);


        // ornek 3
        int e = 25;
        e++;
        System.out.println(e);


        // ornek 4
        int x = 2;
        int y = x++; // burada hala 2 yazinca yine 2 cikacacak ama burada x 2 oldu.
        System.out.println(y); //  hala 2


        // ornek- 5
        int x1 = 2;
        System.out.println(x1++); // hala 2

        // ornek - 6
        int x2 = 2;
        System.out.println(--x); // hala 2 cunku bir sonrakinde azalacak.

        // ornek - 7
        int x4 = 8;
        y = x4--;// burada x4 = bir azaltildi eger x4 yazdirirsak -7 olacak ama yi yazdirirsak hala 8

        System.out.println(y);
        System.out.println(x4);

        // ornek 8
        int x0= 8;
        x0--; // burada degistirdi  ama yazdirirsak sonraki adim 7 olacak.
        System.out.println(x0);

        // ornek -9
        int ak = 8;
        int bak = ak--;
        System.out.println(ak); // 7 oldu
        System.out.println(bak); // hala 8

        // ornek -10
        int A = 1;
        A = -A--  +  A++ / -A--  * --A;
      //  -1--   +   1++ /  -1--  * --1;
        // -1    + 0      / -1     * 1
        System.out.println(A);


        // ornek 11
        int xa = 4;
        int ya= xa * 4 - xa++;
        System.out.println(ya); // sonuc 12


        // ornek 12
        int ac= 50;
        ac= --ac + ac++ + ac-- + ac++;
        //   49 +   49 +   50 +  49;
        System.out.println(ac);




    }


}
