package Day42_static;

import Office_Hours.Quisstirng;
import org.w3c.dom.ls.LSOutput;

public class Car {
    String brand;
    String model;
    int year;
    String VIN;
    String color;
    double price;


     static boolean hasWheel= true;
     static int  numberofTires= 4;
     static boolean hasEngine = true;
     static boolean hasDoors= true;
     static boolean hasAirBag= true;
     static boolean hasSeatbelt= true;
     static boolean hasHorn = true;

       public void start (){ /// instens method
         System.out.println("Starting "+brand+ " "+model);
     }
        public static void PrintTires(){// static method
            System.out.println(numberofTires+ " Tires");
        }
    public String toString(){// hem staticleri hem instance kullanabiliriz.
        return "Brand: "+brand+", Model: "+model+", Year: "+year+", Color: "+color
                +"\nNumber of tires: "+numberofTires+"\nHas Engine: "+hasEngine
                +"\nHas Wheel: "+hasWheel+"\nHas Airbags: "+hasAirBag;
    }



}
