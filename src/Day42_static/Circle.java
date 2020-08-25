package Day42_static;

public class Circle { // custom metodumuzu olusturduk.
    double radius;// bunun kpppyalari olur
    double dimametre; //bunun kpppyalari olur
    static double pi = 3.14; // bu heryerde bir o zama staticdir

    public void setInfo (double radius){
        this.radius= radius;
        dimametre= radius*2;
    }

    public double calArea (){ // return metodumuzu olusturduk.
        return radius*radius*pi;
    }
    public double calcPerimetre(){ // return metodumuzu olusturduk.
        return dimametre*pi;
    }
    public String toString (){ // to String metodumuz olusturduk.

        return "Radius: "+radius+"\nDiameter: "+dimametre+"\n PI: "+pi+"\nArea: "+calArea()+"\nPerimeter: "+calcPerimetre();
    }
}
