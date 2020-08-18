package Day16_String;

public class F_String_Method2_withBoolean {

    public static void main(String[] args) {

    /*   // isEmpty();
        String name = "name";
      boolean result=   name.isEmpty();
        System.out.println(result);  */


        // egual
        String a= "Ali";
        String b = new String("Ali");
        System.out.println(a.equals(b));

        // EQUAL/ ignore
        String a1= "Fatih";
        String a2=  new String("FATIH");
        boolean a3=  a1.equalsIgnoreCase(a2);
        System.out.println(a3);

        // contains(); iceriyor mu  icermiyor mu?
        String str =  " I like to learn Java programming language";
        System.out.println(str.contains("Cucumber"));

       // System.out.println(str.contains("Java"));// burada dogru
     //  System.out.println(str.contains("JAVA")); // yanlis cunku java buyuk.


        // startWith();
       String name1 =  "Fatih";
       System.out.println(name1.startsWith("F"));

       String name2=  "Serpil";
        System.out.println(name2.startsWith("S"));


        //endsWith();
        String name4 = "Iyiyol";
        System.out.println(name4.endsWith("o"));

    }
}
