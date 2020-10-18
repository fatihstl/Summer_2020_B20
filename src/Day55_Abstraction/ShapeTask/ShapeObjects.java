package Day55_Abstraction.ShapeTask;

import java.io.OutputStream;

public class ShapeObjects {
    public static void main(String[] args) {
        //  Shape shape1 = new Shape();

        Circle circle1 = new Circle(100);

        System.out.println(circle1);
        System.out.println("Circle Has Volume: "+ circle1);

        Circle circle2 = new Circle(100);
        System.out.println(circle2);

        System.out.println(circle1);
        System.out.println(circle2);

        System.out.println("=======================================");

        Ractangle rectangle1 = new Ractangle(10, 5);
        System.out.println(rectangle1);

        System.out.println( new Ractangle(20, 30) );

        System.out.println("========================================");

        Cylinder cylinder1 = new Cylinder(5, 10);
        System.out.println(cylinder1);

        System.out.println(circle1);

        System.out.println("========================================");

        // Circle circle3 = new Circle(-10);
        //   System.out.println(circle3);

        //   Rectangle rectangle2 = new Rectangle(-2, 0);

        Cylinder cylinder2 = new Cylinder(0,0);



    }




    }

