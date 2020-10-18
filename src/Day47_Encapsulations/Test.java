package Day47_Encapsulations;

public class Test {
    public static void main(String[] args) {

        // public
        System.out.println(AccessModifiers.publicVeriable);
        AccessModifiers.publicMethod();



        // default veriable ayni packagede kullanilabilir.
        System.out.println(AccessModifiers.defaultVeriable);


        // private class disinda kullanilamaz.
     //   System.out.println(AccessModifiers.privateVeriable);
      //  AccessModifiers.privateMethod();


        // getSsn
        Encapsulation obj1= new Encapsulation();
       // System.out.println(obj1.ssn); boyle olmaz.

        System.out.println(obj1.getSsn());


        // setSsn
        obj1.setSsn(65342); // yeni deger verdim.

        System.out.println(obj1.getSsn());


    }



}
