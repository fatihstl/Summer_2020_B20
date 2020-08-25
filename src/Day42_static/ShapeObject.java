package Day42_static;

public class ShapeObject {
    public static void main(String[] args) { // cirle icin main metodumuzu olusturduk.

        Circle c1 = new Circle();
        c1.setInfo(25);

        System.out.println(c1.calArea());
        System.out.println(c1.calcPerimetre());

        System.out.println("=====================================");
        System.out.println(c1);

        System.out.println("=================================");
        Circle c2 = new Circle ();
        System.out.println(c2);

        System.out.println("======================================");
        Circle c3 = new Circle();
        System.out.println(c3);





    }
}
