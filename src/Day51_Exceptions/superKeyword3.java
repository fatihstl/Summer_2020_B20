package Day51_Exceptions;

class C {
    public C(int a){
        System.out.println("Super class int arg contructor");
    }
}

public class superKeyword3 extends C {//

    //  public void method (){
      //  super(300);

    public superKeyword3(int a){
        super(100);
        System.out.println("sub class constructor with int arg");
    }

    public static void main(String[] args) {
        new superKeyword3(100);
    }
    }



