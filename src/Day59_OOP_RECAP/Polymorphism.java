package Day59_OOP_RECAP;

import Day50_Inheritance_Overriding.ShapeTask.Rectangle;
import Day55_Abstraction.ShapeTask.Circle;
import Day55_Abstraction.ShapeTask.Ractangle;
import Day55_Abstraction.ShapeTask.Shape;
import Day56_Abstraction.AnimalTask.Animal;

public class Polymorphism {
    public static void main(String[] args) {


       Shape shape1 = new Circle(3);


        System.out.println(((Circle)shape1).radius);

       // shape1.length ==> yapamazsin casting yapman lazim
        System.out.println(((Ractangle)shape1).length); // down casting yaptik ki kullanabiliriz.


        Ractangle r1 = new Ractangle(3, 5);
        Shape shape2 = (Shape) r1; // upcasting

        
    }
}
