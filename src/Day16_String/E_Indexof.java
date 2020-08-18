package Day16_String;

public class E_Indexof {

    public static void main(String[] args) {

        String str = "Cybertek";
       int rharfi=  str.indexOf("ek");

        System.out.println(rharfi);

        // index ornek
        String s5 =  " I like to stay in cybertek, we are learning java";
        int r1= s5.indexOf("rn");
        System.out.println(r1);// r in indeksini verir. bir sonraki ile yazarsak.


        // indexOf
        String adimSoyadim ="Fatih Iyiyol";
        int soyadiminindex = adimSoyadim.lastIndexOf("i");
        System.out.println(soyadiminindex);

        // lastIndexOf();
        String s6= "Java is a proggaming language, and Java is Fun";
        int I1= s6.indexOf("J");
        int I2= s6.lastIndexOf("J");

        System.out.println(I1);
        System.out.println(I2);

    }
}
