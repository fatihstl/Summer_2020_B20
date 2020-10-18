package Day55_Abstraction.ShapeTask;

import Day50_Inheritance_Overriding.ShapeTask.Rectangle;

public class Ractangle extends Shape {

    public double width;
    public double length;

    public Ractangle(double width, double length) {

        if(width<=0 || length<=0){
            throw new RuntimeException("width and length of rectangle cannot be negative or 0");
        }
        this.width = width;
        this.length = length;
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();
        name = "Rectangle";
        hasVolume = false;
    }

    @Override
    public double calculateArea() {
        return width*length;
    }

    @Override
    public double calculatePerimeter() {
        return (width+length)*2;
    }

    @Override
    public double calculateVolume() {
        return 0;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }

}
