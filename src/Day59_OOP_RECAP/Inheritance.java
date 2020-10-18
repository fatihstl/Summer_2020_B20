package Day59_OOP_RECAP;

class  A{
    private  int a = 100;
    int b = 200;
    protected int c =300;
    public int d = 400;

    private void  method1(){}
    void method2(){}
    protected void method3(){}
    public void method4(){}

}

public class Inheritance extends  A {

    public void method3() {// method 3 override yaptim. sadece yeniden yazdirdim.
        System.out.println("merhaba");

    }

    public static void main(String[] args) {
        Inheritance obj = new Inheritance();
     //  System.out.println(obj.a); // private kabul etmez
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);

      obj.method2();
      obj.method3();
      obj.method4();
     // obj.method1(); private kabul etmez.


    }

}
