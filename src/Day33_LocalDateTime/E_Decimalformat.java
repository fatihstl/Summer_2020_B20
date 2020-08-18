package Day33_LocalDateTime;

import java.text.DecimalFormat;

public class E_Decimalformat {
    public static void main(String[] args) {

        DecimalFormat m = new DecimalFormat("0.000");


        double a = 22/7.0;
        System.out.println(a);
        System.out.println(m.format(a));


       // ikinci ornek
        // 6.6757632457
        System.out.println(m.format(6.4374048));

    }
}
