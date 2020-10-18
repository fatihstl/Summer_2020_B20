package Office_Hours.Practice_09_09_2020_Inheritance;

public class Iphone extends Phone {

    public Iphone (String model, double price){
        super (model, price);

    }
    static {
        brand = "Iphone";
        MadeIn = "China";
    }

    public void call (long PhoneNumber){
        System.out.println("Iphone "+model+ " is calling: "+PhoneNumber);
    }

    public void text (long PhoneNumber){
        System.out.println("Iphone "+model+ " is texting: "+PhoneNumber);
    }
}
