package Office_Hours.Practice_08_31_2020;

import org.w3c.dom.ls.LSOutput;

public class static_Instance {

    int instanceVeriable;
    static int Staticveriable;

    public static void main(String[] args) {
        System.out.println(Staticveriable);
       // System.out.println(instanceVerible); kabul etmez sadece objet cagirabilirsin.

       static_Instance obj = new static_Instance();

        System.out.println("=======================================================");

        static_Instance obj1= new static_Instance();
        obj1.instanceVeriable= 100;
        obj1.Staticveriable= 200;

        System.out.println(obj1.instanceVeriable);
        System.out.println(obj1.Staticveriable);


        static_Instance obj2= new static_Instance();
        System.out.println(obj2.instanceVeriable);
        System.out.println(obj1.Staticveriable);

    }


    public void method1 (){
        System.out.println(instanceVeriable);
        System.out.println((Staticveriable));
    }
}
