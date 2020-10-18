package Day54_Abstraction.CarsTask;

import java.util.concurrent.CancellationException;

/*
   Car: abstract
       start();
   BMW
       start(): push start button
   Tesla
       start(): voice control
   Toyota
       start(): Insert the key
   Jeep
       start(): jump start

    */
public  abstract class Car { // abstract class

    public Car(){

    }

    public abstract void start();

}

final class A{  // can be final
}
class B{
    public static void main(String[] args) {
        A obj1 = new A();
        // Car obj2 = new Car();
    }
}
