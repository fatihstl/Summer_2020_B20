package Day47_Encapsulations;

import Day45_Constructor.Constructor;

public class ContructorReview {

    static {
        System.out.println("Static Block");
    }

    public ContructorReview(int a){
        // buraya this  yazamayiz kendini kagiramaz.
        System.out.println("int arg");
    }

    public ContructorReview(double a){
        this(10); // int
        System.out.println("double arg"); // double
    }

    public ContructorReview(String a){
        this(5.5); // int double
        System.out.println("String arg"); // String
    }


    public static void main(String[] args) {


        new ContructorReview(10.0);

    }
}
