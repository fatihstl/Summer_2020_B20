package Day40_CustomMethod_recap;
//BankAccount
//        attributes/data that can have are:
//                1. AccountHolder, 2. AccountNumber, 3. Balance
//
//        Actions:
//            1. CheckBalance,   2. deposit,  3. withdraw
//
//          requiremnts:
//            1. user should be able to deposit money into their account
//            2. user should be able to withdraw money from their account
//                2.1 if the withdrawing account is greater than available balance, 35$ penalty charge will be added
//                2.2 if the balance is less than or equal to 0, user should not be able to withdraw money
//            3. user should be able to see their balance

public class BankAccount {
    // instens verianble ve atribut ousturduk.
    String accountType;
    String accountHolder;
    String accountNumber;
    double balance;


    public void SetAccountInfo(String accountType, String accountHolder, String accountNumber, double balance ){

        this.accountType = accountType;
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    public void getAccountInfo(){
        System.out.println("==============================================");
        System.out.println(("Acounnt holder: "+ accountHolder));
        System.out.println("Acounnt Number: "+ accountNumber);
        System.out.println("Acounnt balance: "+balance);
        System.out.println("=========================================");
    }
   public void checkBalance(){
       System.out.println("Available balance: "+balance);
   }
   public void depozit (double amount){
       System.out.println("Depoziting $"+amount+ " to "+accountNumber);
        balance+= amount;
   }

    public void withdraw (double amount){
        if (amount> balance){
            System.out.println("not enough balanca");
            return;//
        }
        System.out.println("Withdrawing  $"+amount+ " from "+accountNumber);
        balance-= amount;
    }
}
