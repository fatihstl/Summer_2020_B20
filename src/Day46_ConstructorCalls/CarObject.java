package Day46_ConstructorCalls;

public class CarObject {
    public static void main(String[] args) {

        System.out.println((new Car("Toyota")));

        System.out.println("=======================================");

        System.out.println(( new Car("Audi", "Q7", "White")));

        System.out.println("==================================================");

        System.out.println(new Car ("Jeep", "Compas", "Black", 2010));

        System.out.println("================================================================");
        System.out.println(new Car("Honda", "Accord", "Red", 2017, 130_000));



    }
}
