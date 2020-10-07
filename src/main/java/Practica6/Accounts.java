package Practica6;

public class Accounts {
    public static void main(String[] args) {
        Account account1 = new Account("Joana", 1500);
        Account account2 = new Account("Sascha", 3000);

        transfer(account1, 600.8, account2);
        personalCredit(account1);
        getCredit(account1, 500.5);
        personalCredit(account1);
        payCredit(account1);
        personalCredit(account1);
    }

    public static void transfer (Account yourAccount, double amount, Account account2Transfer) {
        yourAccount.withdrawal(amount);
        account2Transfer.deposit(amount);
        System.out.println("You transferred " + amount + " to " + account2Transfer + " successfully!");
    }

    public static void personalCredit  (Account yourAccount) {
        System.out.println("Your balance is: " + yourAccount.getBalance());
    }
    public static void getCredit(Account yourAccount, double creditAmount){
        yourAccount.setCreditAmount(creditAmount);
        yourAccount.deposit(creditAmount);
        yourAccount.setHasCredit(true);
    }

    public static void payCredit (Account yourAccount) {

        if(yourAccount.getBalance() <=0){
            System.out.println("Your balance is: " + yourAccount.getBalance());
            System.out.println("You need to pay!");
        }else{
            yourAccount.withdrawal(yourAccount.getCreditAmount());
        }
    }

}
