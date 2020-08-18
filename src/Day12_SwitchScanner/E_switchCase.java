package Day12_SwitchScanner;

public class E_switchCase {
    public static void main(String[] args) {


        // stringle yapilan ve caselere tek statament ornegi
        String productName = "glaxy";

        switch (productName) {

            case "glaxy" :
                System.out.println("Samsung");
               break;

            case "Iphone":
            case "Macbook":
            case "iphad" :
                System.out.println("apple");
                break;



        }

    }
}
