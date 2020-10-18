package Day54_Abstraction.CarsTask;

import Day50_Inheritance_Overriding.CarTask.Jeep;

public class ParkingLot {
    public static void main(String[] args) {
        // Car car1 = new Car() objecti creat edemezsin
        BMW bmw = new BMW();  // subdan objeyi kurabilirsin.
       Toyota toyota = new Toyota(); //subdanobjeyi kurabilirsin.
         Jeep jeep = new Jeep();  // subdan obj kurabilirsin
        Tesla tesla = new Tesla(); //subdan obj kurabilirsin

        bmw.start(); // override metodu simdi yazdiriyorum.
        tesla.start();
        toyota.start();
        jeep.Start();




    }
}