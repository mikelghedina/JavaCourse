package Practica8;

public class Test {
    public static void main(String[] args) {

        CashRegister unicafeExactum = new CashRegister();


        double theChange = unicafeExactum.payEconomical(10);
        System.out.println("the change was " + theChange );

        theChange = unicafeExactum.payEconomical(5);
        System.out.println("the change was " + theChange );
        theChange = unicafeExactum.payGourmet(4);
        System.out.println("the change was " + theChange );
        System.out.println( unicafeExactum );

        System.out.println("-----------------------------------------------------------------------");


        LyraCard card1 = new LyraCard (500, 20, 06,2010, "Mikel", 24);
        System.out.println(card1);




    }

}




