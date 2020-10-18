package Office_Hours.Practice_09_16_2020_Exceptions;

public class ThrowsKeywords2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(9/0);// unchecked
        Thread.sleep(3000); // checked
        System.out.println("Completed");

    }
}
