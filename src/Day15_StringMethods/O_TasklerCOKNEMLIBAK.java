package Day15_StringMethods;

public class O_TasklerCOKNEMLIBAK {
    public static void main(String[] args) {
        // 1 S- buyuk digerlerini kucuk yazacagiz.
        String lastname = "school";
        String firstChar = lastname.substring(0,1);
        String remaining =  lastname.substring(1); // soyle yaparsak 1 den sonra hepsini yazar.

        lastname= firstChar.toUpperCase() + remaining.toLowerCase();

              System.out.println(lastname);


    // ikinci ornek
       String okul=  "cybertek";
       String ilki= okul.substring(0 ,1);
       String gerisi = okul.substring(1);

       String sonuc =  ilki.toUpperCase() + gerisi.toLowerCase();
        System.out.println(sonuc);


        // ucuncu ornek

        String s = "I like Game of Thorones";

        String series = s.substring(7);//  7 harften sonra game of trone yazar.
        System.out.println(series);


         // dorduncu ornek
        String s2 = " I like java Programming Language"; // java ve sinrasini yazdiracagiz
        String language = s2.substring(7);
        System.out.println(language);

    }

}
