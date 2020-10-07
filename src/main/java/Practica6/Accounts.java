package Practica6;

public class Accounts {
    public static void main(String[] args) {
        Account account1 = new Account("Joana", 1500);
        Account account2 = new Account("Sascha", 3000);

        transfer(account1, 500, account2);
        personalCredit(account1);
    }

    public static void transfer (Account yourAccount, int amount, Account account2Transfer) {
        yourAccount.withdrawal(amount);
        account2Transfer.deposit(amount);
        System.out.println("You transferred " + amount + " to " + account2Transfer + " successfully!");
    }


    public static void personalCredit  (Account yourAccount) {
        System.out.println("Your balance is: " + yourAccount.getBalance());
    }
    public void getCredit(Account yourAccount, int creditAmount){
        yourAccount.deposit(creditAmount);
        yourAccount.setHasCredit(true);
    }

    public static void payCredit (Account yourAccount) {

        while(yourAccount.isHasCredit()){
            yourAccount.withdrawal(50);
        }

    }

}
