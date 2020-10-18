package Day62_MapDevam_Garbage_Ennum_Stringuilder;

public class Test {

    public static void main(String[] args) {

     //   String favoriteColor = "Pink";

        Color favoriteColor = Color.Blue;
        System.out.println(favoriteColor);


       // Browser browserName = Browser.opera; ( Borwser- enam  Classininin parcasi olmadigi icin kabul etmedi)

        Browser browserName = Browser.chrome;

        switch (browserName){
            case chrome:
                System.out.println("Chrome browser is set");
                break;

            case firefox:
                System.out.println("Firefow browser is set");
                break;

            case edge:
                System.out.println("edge browser is set");
                break;

            case safari:
                System.out.println("safari borwser is set");
                break;

        }

    }
}
