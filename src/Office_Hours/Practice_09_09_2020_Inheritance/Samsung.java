package Office_Hours.Practice_09_09_2020_Inheritance;

public class Samsung  extends Phone{
    public Samsung (String model, double price){
        super (model, price);

    }
    static {
        brand = "Samsung";
        MadeIn = "Korea";
    }

    public void call (long PhoneNumber){
        System.out.println("Samsung "+model+ " is calling: "+PhoneNumber);
    }

    public void text (long PhoneNumber){
        System.out.println("Samsung "+model+ " is texting: "+PhoneNumber);
    }

}
