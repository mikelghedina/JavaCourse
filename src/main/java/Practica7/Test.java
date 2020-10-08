package Practica7;

public class Test {
    public static void main(String[] args) {

        Apartment twoRoomsBarcelona = new Apartment(2, 70, 30);
        Apartment oneRoomBarcelona = new Apartment(1, 50, 20);

        System.out.println(oneRoomBarcelona.larger(twoRoomsBarcelona));
        System.out.println(twoRoomsBarcelona.priceDifference(oneRoomBarcelona));
        System.out.println(twoRoomsBarcelona.moreExpensiveThan(oneRoomBarcelona));
    }
}
