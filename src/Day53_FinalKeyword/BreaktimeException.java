package Day53_FinalKeyword;

import org.w3c.dom.ls.LSOutput;

public class BreaktimeException extends  RuntimeException {// custom unchecked exception
    public   BreaktimeException () {
    super("It is time to go home");
        System.err.println(" Time to take 15 min break");

}
public BreaktimeException (String str){
        super(str);
    System.err.println("Time to take 15 min break");
}
}




class Test{
    public static void main(String[] args) {
         throw  new RuntimeException();
       // throw  new BreaktimeException();

        // throw new Test();


    }

}
