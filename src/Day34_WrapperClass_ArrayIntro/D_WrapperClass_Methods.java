package Day34_WrapperClass_ArrayIntro;

public class D_WrapperClass_Methods {

    public static void main(String[] args) {

        ///// PARSE mETHOD

        String str = "123";
                       // 123
        //ornek 1
        int a =  Integer.parseInt(str);
        System.out.println(str+1); // 1231 - string
        System.out.println(a+1); //  124 number. donusturdu.

        // ornek 2
         Double d1= Double.parseDouble("7.5");
         System.out.println(d1-1);

         // ornek 3
        String s1= "TRUE";
        boolean b1= Boolean.parseBoolean(s1);
        System.out.println(b1);



        ///VALUEOF MEthod

        String s2= "1000.5"; // bu string eger toplaraan toplamaz
        double d2= Double.valueOf(s2); // unboxing
        System.out.println(d2); // bu string degil artik


         String s3 = "FalSE";
         boolean r2 = Boolean.valueOf(s3); // unboxing
        System.out.println(r2);
    }
}
