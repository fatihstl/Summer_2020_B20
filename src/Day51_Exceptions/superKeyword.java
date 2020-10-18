package Day51_Exceptions;

class  Test {
    int a;


    public void method(){
        System.out.println("Hello");
    }
}

public class superKeyword extends Test{

    public void print1(){
        System.out.println(a);
    }
    public void print2(){
        System.out.println(super.a);// Test class 2000
    }

    public void method2(){
        super.method();// Hello print eder.
        System.out.println("Hola");

    }

    public void method3(){
        this.method2();
        super.method();
    }

    public static void main(String[] args) {
        Test obj1= new Test ();
        obj1.a= 200;

        superKeyword obj2 = new superKeyword();
        obj2.a= 300;

        obj2.print1();
        obj2.print2();

    }
}
