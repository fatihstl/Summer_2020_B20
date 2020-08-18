package Day40_CustomMethod_recap;

import java.util.ArrayList;
import java.util.Arrays;

public class Capital {
    public static void main(String[] args) {

            BankAccount Ahmet = new BankAccount();
            BankAccount Beslan = new BankAccount();
            BankAccount Viorel = new BankAccount();
            BankAccount Wagar = new BankAccount();
            BankAccount Fatih = new BankAccount();

            Beslan.SetAccountInfo("Ceking", "Beslan", "345", 12345);
            Ahmet.SetAccountInfo("Checking", "Ahmet", "543", 876405);
            Viorel.SetAccountInfo("Checking", "Viorel", "567", 67830);
            Wagar.SetAccountInfo("Checking", "Wagar", "456", 9863426);
            Fatih.SetAccountInfo("Checking", "Fatih", "456", 1863);

            ArrayList<BankAccount> accounts = new ArrayList<>();
            accounts.addAll(Arrays.asList(Beslan, Ahmet, Viorel, Fatih, Wagar));
                        // index        0      1      2        3     4

            for (BankAccount each : accounts) {
                each.depozit(500);
                each.getAccountInfo();
            }
            // Fatihe  para ekliyecegiz.
            accounts.get(3).depozit(863);
            accounts.get(3).checkBalance();
            accounts.get(3).withdraw(9000);

        System.out.println("============================================");

        accounts.removeIf(  each -> each.balance < 1000 );
        System.out.println(accounts.size());


        }
        }
