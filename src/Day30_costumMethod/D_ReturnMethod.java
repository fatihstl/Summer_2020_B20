package Day30_costumMethod;

public class D_ReturnMethod {
    public static void main(String[] args) {

        revStr1("Fatih");

        String name = "Level";

         revStr1(name);
        // System.out.println(name.equalsIgnoreCase( revStr1(name) )); // bunu yapamazsin voidde

        String reservedName= revStr2(name);
        System.out.println( name.equalsIgnoreCase( revStr2(name) ) ); // nunu returm metodda yapabilirsin.

    }


    public  static void revStr1(String str){
        String result = "";
        for(int i = str.length()-1; i >=0; i--){
            result += str.charAt(i);
        }
        System.out.println(result);
    }


    public  static String revStr2(String str){
        String result = "";
        for(int i = str.length()-1; i >=0; i--){
            result += str.charAt(i);
        }

        return  result;
    }



}