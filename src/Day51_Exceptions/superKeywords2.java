package Day51_Exceptions;
class B{
    public B (){
        System.out.println("Super class default constructor");
    }
}


public class superKeywords2 extends B {

    public superKeywords2(){
        System.out.println("sub class default costructor");
    }

    public static void main(String[] args) {
        new superKeywords2();
    }




}
