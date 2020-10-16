package Practica10;



public class Main {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        //BirdsDatabase db = new BirdsDatabase();
        Menu menu = new Menu();

        menu.getDatabase().setBirds(ListInitialBirds.initialBirds());

        menu.loop();
    }

}
