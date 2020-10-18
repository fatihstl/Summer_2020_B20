package Day50_Inheritance_Overriding.CarTask;

public class CarObject {
    public static void main(String[] args) {

        Honda honda= new Honda();
        Mercedes mercedes = new Mercedes();
        Tesla tesla = new Tesla();
        Jeep jeep = new Jeep();


        honda.Start();
        System.out.println("===================================================");
        mercedes.Start();
        System.out.println("====================================================");
        tesla.Start();
        System.out.println("=====================================================");
        jeep.Start();
    }
}
