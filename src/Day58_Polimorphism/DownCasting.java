package Day58_Polimorphism;

import Day57_Polymorphism.PhoneTask.Huawei;
import Day57_Polymorphism.PhoneTask.Iphone;
import Day57_Polymorphism.PhoneTask.Phone;
import Day57_Polymorphism.PhoneTask.Samsung;

public class DownCasting {
    public static void main(String[] args) {

        Phone phone1= new Iphone("11", "6", 1000);
        Iphone iphone = (Iphone) phone1;

        System.out.println(phone1);
        System.out.println(iphone);

        // birinci yol
       // phone1.faceTiming(12345);
        iphone.faceTiming(123456);

        //ikinci yol
        ( (Iphone)phone1).faceTiming(123456);

        System.out.println("===========================================");

        Phone phone2 =new Samsung("S20", "7", 1000);
        ((Samsung)phone2).freezing();

       // ((Iphone)phone2).faceTiming(123456);

        System.out.println("=============================================");

        Phone phone3 = new Huawei("spy", "7", 10);

        ((Huawei)phone3).stealInfo();




    }
}
