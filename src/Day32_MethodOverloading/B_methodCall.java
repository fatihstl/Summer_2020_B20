package Day32_MethodOverloading;
import Library.Util;

import java.util.Arrays;

public class B_methodCall {
    public static void main(String[] args) {

       String firstName= "elkem";
       String lastName= "emet";

       String fullName;

        fullName= Util.formatFullName(firstName, lastName); // ilk harfleri buyuk yapiyor.
        System.out.println(fullName);

        String name= Util.formatFullName("cano", "kano"); //ilk harfleri buyuk yapiyor.
        System.out.println(name);

        String uniqes = Util.uniques(fullName.toLowerCase());
        System.out.println(uniqes);

        String reversedName = Util.reverse(fullName);
        System.out.println(reversedName);

        String  bus= Util.reverse("Busra");// birinci yol
        System.out.println(bus);
        System.out.println(Util.reverse("Busra")); // ikinci yol

        System.out.println("=============================");
        int [] a= {200, 400, 500, 200, 1000, 50, 40, 30, 400, 60, 78};
        int n= 2500;

        Util.addElement(a,n);
        System.out.println(Arrays.toString(a));


    }
}
