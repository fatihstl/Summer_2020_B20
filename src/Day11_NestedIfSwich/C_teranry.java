package Day11_NestedIfSwich;

public class C_teranry {
    public static void main(String[] args) {

        // if in kisa yolu

        int num = 100;
        String  result = "";

        if (num %2== 0 ) {
            result = "even";
        } else {
            result = "odd";
        }
        System.out.println(result);

        ///// kisa yolu ? (if) : else

       String result2 =  (num %2 == 0) ? "even" : "odd";
        System.out.println(result2);

              // IKINCI ORNEK
        int numa = 100;
       int numb = 200;
       int  max = (numa> numb) ? numa : numb;
        System.out.println(max);
    }
}