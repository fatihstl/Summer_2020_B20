package Day42_static;

public class StaticMethod {
    int a = 200;
    static int b= 400;

    public static void main(String[] args) {

        System.out.println(b);
        //  System.out.println(a); bu haliyle kabul etmez. sadece instance veriable ancak object ile staticin icine
        //   yazabiliriz.

        StaticMethod object = new StaticMethod();
        System.out.println(object.a);// ancak boyle yazabilirsin.


        staticMethod();
       // instanceMethod(); bunu kabul etmez.
        object.instanceMethod();
    }

       public static void  staticMethod (){

        }

        public void instanceMethod (){

        }
    }

