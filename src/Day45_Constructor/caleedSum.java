package Day45_Constructor;

public class caleedSum {

    public caleedSum (int a, int b){
        System.out.println(a+b);

    }
    public caleedSum (double a, double b){
        System.out.println(a+b);
    }

    public caleedSum (int a, int b, int c){
        System.out.println(a+b+c);

    }
    public caleedSum (double a, double b, double c ){
        System.out.println(a+b+c);

    }

    public static void main(String[] args) {
        new caleedSum(10.5, 20);

        new caleedSum(10, 20, 30);
        new caleedSum(10.5, 20.5 );
        new caleedSum(10.5, 20.5, 40.5);
    }


}
