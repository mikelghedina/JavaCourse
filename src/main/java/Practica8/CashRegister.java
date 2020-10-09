package Practica8;

public class CashRegister {

    private double cashInRegister;   // the amount of cash in the register
    private int economicalSold;   // the amount of economical lunches sold
    private int gourmetSold;       // the amount of gourmet lunches sold
    private final double economicalLunch = 2.50;
    private final double gourmetLunch = 4.00;


    public CashRegister() {
        // at start the register has 1000 euros
        this.cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        // the price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of the sold lunches is incremented by one
        //    the method returns cashGiven - lunch price
        // if not enough money is given, all is returned and nothing else happens

        if(cashGiven >= this.economicalLunch){
            this.cashInRegister+= this.economicalLunch;
            this.economicalSold+=1;
            return cashGiven - this.economicalLunch;
        }else{
            return cashGiven;
        }
    }

    public double payGourmet(double cashGiven) {
        // the price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to the register
        //    the amount of the sold lunches is incremented by one
        //    the method returns cashGiven - lunch price
        // if not enough money is given, all is returned and nothing else happens
        if(cashGiven>= gourmetLunch){
            this.cashInRegister +=cashGiven;
            this.gourmetSold += 1;
            return cashGiven - this.gourmetLunch;
        }else{
            return cashGiven;
        }
    }

    public boolean payEconomical(LyraCard card) {
        // the price of the economical lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        if(card.balance()>= this.economicalLunch){
            this.economicalSold +=1;
            loadMoneyToCard(card, economicalLunch);
            return true;
        }else{
            return false;
        }
    }


    public boolean payGourmet(LyraCard card) {
        // the price of the gourmet lunch is 4.00 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        if(card.balance()>= this.gourmetLunch){
            this.gourmetSold += 1;
            loadMoneyToCard(card, this.gourmetLunch);
            return true;
        }else{
            return false;
        }
    }

    public void loadMoneyToCard(LyraCard card, double sum) {
        // ...
        card.pay(sum);
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
