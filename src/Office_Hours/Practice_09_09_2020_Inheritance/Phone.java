package Office_Hours.Practice_09_09_2020_Inheritance;
/*
Phone: brand, model, price, madeIn, call(), text()
    static: brand, madeIn
    insatnce: model, price, call(), text(), toString()

Samsung: brand, model, price, madeIn, call(), text(), toString()
Iphone: brand, model, price, madeIn, call(), text(), toString()
Nokia: brand, model, price, madeIn, call(), text(), toString()
overriding: one method with different implemntations

 */
public class Phone {


    public static String brand;
    public static String MadeIn;

    public String model;
    public double price;

    public Phone (String model, double price){
        this.model= model;
        this.price= price;
    }

    public void call (long PhoneNumber){
        System.out.println("Phone is calling :"+PhoneNumber);
            }

      public void text (long phoneNumber){
        System.out.println("Phone is texting to: "+phoneNumber);
            }


       public String toString () {
           return "Brand: " + brand + "\nModel: " + model + "\nPrice: $" + price + "\nMade in: " + MadeIn;
       }
}
