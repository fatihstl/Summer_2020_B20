package Day62_MapDevam_Garbage_Ennum_Stringuilder;

import Day55_Abstraction.ShapeTask.Circle;
import Day55_Abstraction.ShapeTask.Ractangle;

import java.util.concurrent.Callable;

public class GarageCollectionReview {

    public static void main(String[] args) {


        String str1 = "Cybertek"; // GC
        str1 = null;

        System.out.println(str1);



        String s1 = new String("John");
        String s2 = new String("Aaron");

        s1= s2; // "John is eligibble for Garbege Collection
        System.out.println(s1+ " : "+s2);

        System.out.println("=============================================");


        Circle c1 = new Circle(3);
        c1= null;

        System.out.println(c1);


        Ractangle r1 = new Ractangle(10, 20);
        Ractangle r2 = new Ractangle(2,5);

        r1=r2;


        System.out.println(r1);
        System.out.println(r2);

        System.out.println("===================================================================");

        String a1 ="Cybertek";
        a1= null; // Cybertek is eligeble for garbage collection.

        System.out.println(a1);

        String a2= "MIT";
        String a3 = "Harvard";
        a2= a3;

        System.out.println(a2);
        System.out.println(a3);

        System.out.println("==================================");



            }
        }





