package Day47_Encapsulations;

public class Test2_StaticAndConstuctorReview {

    static int a =200;
    static {
        a=300;
    }
    public Test2_StaticAndConstuctorReview(){
        a = 400;
    }

    public static void main(String[] args) {
        new Test2_StaticAndConstuctorReview();
        a= 600;
        System.out.println(a);
    }
}
