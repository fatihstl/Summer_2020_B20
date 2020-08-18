package Day11_NestedIfSwich;

public class F_ternarypractiseMulti {
    public static void main(String[] args) {

        int num = 100;
        String result = "";

        if(num > 0){
            result = "Positive";
        } else if(num < 0){
            result = "Negative";
        }else{
            result = "Zero";
        }

        // kisa yolu
        String result1 = (num > 0) ? "positive " :(num < 0) ? "negative" : "zero";
        System.out.println(result1);


        // ornek
        int a = 10;
        int b = 20;

        //String result6 = "";
        boolean result6 = (b>a) ? true : false;
        System.out.println(result6 + " is greater");


        // ornek

      //  int  a1 = 30, b1 = 10;


        //boolean result7 = (a> b) ? true : false;
       // System.out.println(result7+ " is greater.");



      // Hangisi buyuk ternary multibranch
      int a1 = 10;
      int b1 = 20;

      String big = (a1>b1) ? " a is greater" : (b1>a1) ? " b is greater" : "equal";
        System.out.println(big);


    }

}
