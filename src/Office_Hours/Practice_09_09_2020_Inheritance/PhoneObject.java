package Office_Hours.Practice_09_09_2020_Inheritance;

import org.w3c.dom.ls.LSOutput;

public class PhoneObject {
    public static void main(String[] args) {

 // Iphone
        Iphone iphone = new Iphone("11pro", 1000);
        iphone.call(911); // call metod ile Iphone clasi print yaptim.
        iphone.text(12345); // text method ile Iphone print aldim

        System.out.println(iphone);

// Samsung
        System.out.println("========================================================");
        Samsung samsung =  new Samsung("7s", 499);
        samsung.call(313);
        samsung.text(412_312432);


        System.out.println("==========================================");
// Nokia
        Nokia nokia = new Nokia("Brick", 25);
        nokia.call(3124);
        nokia.text(45666);
        System.out.println(nokia);
    }




}
