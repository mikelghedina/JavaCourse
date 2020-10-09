package Practica8;

import java.util.ArrayList;
import java.util.HashMap;

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

        System.out.println("____________________________________________________________________________");

        HashMap<String, ArrayList<String>> monday = new HashMap<>();
        Menu menu1 = new Menu(monday);

        ArrayList<String> firsts = new ArrayList<>();
        ArrayList<String> seconds = new ArrayList<>();
        ArrayList<String> desserts = new ArrayList<>();


        menu1.getWeekDays().put(menu1.getFirsts(),firsts);
        menu1.getWeekDays().put(menu1.getSeconds(), seconds);
        menu1.getWeekDays().put(menu1.getDesserts(), desserts);

        firsts.add("Fish and Chips");
        seconds.add("Entrecot");
        desserts.add("Arroz con leche");
        System.out.println(menu1);
        payMenu1(unicafeExactum, card1, menu1);

    }
    public static void payMenu1 (CashRegister cashRegister, LyraCard lyraCard, Menu menu1){
        if(cashRegister.payEconomical(lyraCard)){
            System.out.println("This id: " + lyraCard + " bought " + menu1.getWeekDays());
        }
    }

}




