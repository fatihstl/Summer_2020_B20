package Day55_Abstraction.ShapeTask;
/*
  warmup task:
  1. create an abstract class called Shape
          attributes:
              name(static), area, perimeter, hasVolume(static), volume
          abstract methods: calculateArea(), calculatePerimeter(), calculateVolume()
                              return-types: double

  4. create a sub class of shape called Cylinder
          attributes: radius, height, name(static), area, perimeter, hasVolume(static), volume
          override the abstrat methods
          add a constructor that takes two arguments for r & h of the cylinder  and initialize the instance variables: radius, height, perimeter, area, and volume
          add a static block that can initialize the static variables of the cylinder
  5. create a class called shape objects:
          create objects of each shapes and calculate thier area, perimeter, and volume
  HINT: Math.PI will give you the actual value of PI

   */
public abstract class Shape { // bu abstract class

    public String name;
    public boolean hasVolume;
    public double area;
    public double perimeter;
    public double volume;

    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    public abstract double calculateVolume();




}
