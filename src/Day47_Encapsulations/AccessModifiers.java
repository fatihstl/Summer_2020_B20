package Day47_Encapsulations;

public class AccessModifiers {
        //1- public ornegi
    public static int publicVeriable= 100;

    public static void publicMethod(){
        System.out.println("public Method");

    }


    // 2-default access modifayir ornrgi
    static int defaultVeriable = 200;

    static void defaultMrthod(){
        System.out.println("default method");
    }

    // 3- private
    private static int privateVeriable= 300;

    private static void privateMethod(){
        System.out.println("Private Method");
    }

    public static void main(String[] args) {
        System.out.println(publicVeriable);
        System.out.println(defaultVeriable);
        System.out.println(privateVeriable);

        publicMethod();
        defaultMrthod();
        privateMethod();


    }

}
