package Office_Hours.Practice_09_09_2020_Inheritance;

public class Nokia extends Phone {

    public Nokia (String model, double price) {
        super(model, price);
    }

    static {
        brand= "Nokia";
        MadeIn = "Finland";
    }
    public void call (long PhoneNumber){
        System.out.println("Nokia "+model+ " is calling: "+PhoneNumber);
    }

    public void text (long PhoneNumber){
        System.out.println("Nokia "+model+ " is texting: "+PhoneNumber);
    }

}
