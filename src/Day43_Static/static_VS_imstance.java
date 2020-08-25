package Day43_Static;

public class static_VS_imstance {

    static int staticVariable;
    int instanceVarible;


    public static void main(String[] args){
      //  Normalde static method instance veriableleri kabul etmez. AMA
        //  1-costom metodu yazarak object create ediyorum.
        //  2 - instance veriablelari obj ile kulaniyorum.
        // simdi print alabilerim.
        static_VS_imstance obj1= new static_VS_imstance();
        obj1.instanceVarible=100;
        obj1.staticVariable= 500;


        static_VS_imstance obj2= new static_VS_imstance();
        obj2.instanceVarible= 200;


        System.out.println(obj1.instanceVarible); // 100
        System.out.println(obj2.instanceVarible); // 200

        System.out.println("=============================================");
        System.out.println(obj1.staticVariable); // 500 verir
        System.out.println(obj2.staticVariable); // 500 verir cunku static deger sadece 1 aded kabul eder.

        System.out.println(static_VS_imstance.staticVariable);//  bu tercih edilir.

    }
}
