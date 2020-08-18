package Day29_custommethod;

public class H_Return_Prac2 {
    // alkol almayi retun yapacagiz.

    public static void main(String[] args) {

        eligibleToBuyAlkol(45);

    }
     public static void eligibleToBuyAlkol (int age){
        if (age >= 21){
            System.out.println("Eligible");
            return; // eger tamamsa koniyi kapatiyor
        }

         System.out.println(" not eligible");
     }

}
