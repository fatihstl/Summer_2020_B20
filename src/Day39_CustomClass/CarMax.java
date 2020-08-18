package Day39_CustomClass;

public class CarMax {
    public static void main(String[] args) {

        Car car1 =new Car();
        Car car2 =new Car();
        Car car3 =new Car();
        Car car4 =new Car();
        Car car5 =new Car();

        car1.setCarInfo("Lexus", "RX350", 2019, "White", 1400, 45000);

        car2.setCarInfo("Lexus", "RX450", 2020, "Black", 1000, 50000);


        car3.setCarInfo("Bugatti", "RX-0", 2019, "blue", 1200, 55000);

        car4.setCarInfo("Nissan", "GT", 2019, "white", 12200, 43000);

        car5.setCarInfo("Honda", "Accord", 2009, "Grey", 97000, 9000);


        car1.getCarInfo(); /// bunlarla yaziyoruz
        car2.getCarInfo();
        car3.getCarInfo();
        car4.getCarInfo();

        car3.start(); // bunlarla yaziyoruz cunku buna print ozelligi verdik.
        car4.start();
    }
}
