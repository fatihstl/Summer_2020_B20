package Day12_SwitchScanner;

public class A_WarmupIfAndTernery {

    public static void main(String[] args) {

        /* write a program that checks for the bigger of 3 numbers.
                you get 3 int variables: n1 , n2 and n3 (none of them are equal)
        if n1 is biggest output: "n1 is bigger"
        if n2 is biggest output: "n2 is bigger"
        if n3 is biggest output: "n3 is bigger"
        example:
        n1 = 100
        n2  = 2000
        n3  = 300
        output: "n2 is bigger"
        NOTE: DO NOT USE IF STATEMENT*/

// ayni ornegi ternary ile ve if statemnt ile yapiyoruz.
        double n1 = 100;
        double n2 = 2000;
        double n3 = 300;

        boolean n1isbigger = n1>n2 && n2>n3;
        boolean n2isbiger = n2>n1 && n2 >n3; // soyle de olur n1isbigger== false &&n2>n3
        boolean n3isbiger = n1isbigger == false && n2isbiger== false;
                            // !n1IsBigger && !n2IsBiger (boyle de yapabolirdik.

       String result = (n1>n2 && n2>n3) ? "N1 is bigger" :(n1isbigger== false &&n2>n3) ? "n2 is bigger " : "n3 is bigger";

      System.out.println(result);

     /*  String result = "";
        if (n1isbigger){
           result = "n1 is bigger";
        } else if (n2isbiger){
            result = "n2 is bigger";
        } else {
            result = "n3 is bigger";
        }
      System.out.println(result);*/
    }
}
