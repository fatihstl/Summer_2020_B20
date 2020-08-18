package Day20_whileLoop;

import java.util.Scanner;

public class G_whileLoop3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String pasword = "Cybertek123";
        System.out.println("Enter your password: ");
        String giris = input.nextLine();
        while (!giris.equals(pasword)){
            System.out.println("Please re-enter your pasword: ");
            giris = input.nextLine();
        }
        System.out.println("logged in");
    }
}
