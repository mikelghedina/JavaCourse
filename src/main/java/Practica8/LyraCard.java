package Practica8;

public class LyraCard {

    private Person person;
    private MyDate myDate;
    private double balance;

    public LyraCard(double balance, int day, int month, int year, String name, int age){
        this.balance= balance;
        this.myDate = new MyDate(day, month, year);
        this.person = new Person(name, age);
    }
    public LyraCard (double balance, MyDate myDate, int day, int month, int year){
        this.balance = balance;
        this.myDate = new MyDate(day, month, year);
    }
    public LyraCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void loadMoney(double amount) {
        this.balance += amount;
    }

    public boolean pay(double amount){
        // the method checks if the balance of the card is at least the amount given as parameter if not,
        // the method returns false meaning that the card could not be used for the payment if the balance is enough,
        // the given amount is taken from the balance and true is returned
        if(this.balance <amount){
            return false;
        }else{
            this.balance -= amount;
            return true;
        }
    }

    @Override
    public String toString() {
        return "LyraCard{" +
                "person=" + person +
                ", myDate=" + myDate +
                ", balance=" + balance +
                '}';
    }
}
