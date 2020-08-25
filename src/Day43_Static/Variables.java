package Day43_Static;

public class Variables {

    int d; // instance veriable
    static int s; // static veriable


    public void method2(){
        System.out.println(d);
        System.out.println(s);
    }

    public static void main(String[] args) {

        System.out.println(s);

        Variables obj = new Variables();
        System.out.println(obj.d); // d instance variabledir.
        // Bu sebeple yanlizca object create edilerek static metod ile kullanilir.


    }

    public static void method1 (){
        int a; // local veriable
        int b= 1; // local veriable


        System.out.println(b);
       // System.out.println(a);
    }






}
