package Day46_ConstructorCalls;

import org.w3c.dom.ls.LSOutput;

public class ConstructorCall2 {

    public ConstructorCall2(){
        System.out.println("A");

    }

    public ConstructorCall2(int a){ // A B
         this();           // A
        System.out.println("B");// B
    }

    public ConstructorCall2(String str){
        this(4); // A B
        System.out.println("C"); // C

    }

    public ConstructorCall2 (char a){
        this();
        System.out.println("D");

    }
 public ConstructorCall2(double a){
     System.out.println("E");

 }
    public static void main(String[] args) {
        new ConstructorCall2('A');
    }
}
