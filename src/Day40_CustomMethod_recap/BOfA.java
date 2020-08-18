package Day40_CustomMethod_recap;

public class BOfA {
    public static void main(String[] args) {

        BankAccount Fatih = new BankAccount();
        Fatih.SetAccountInfo("Saving", "Fatih Iyiyol", "324", 122000);

        Fatih.getAccountInfo();

        Fatih.depozit(1000);
         Fatih.checkBalance();

         Fatih.withdraw(400);
         Fatih.checkBalance();

         Fatih.withdraw(10000);

    }
}
