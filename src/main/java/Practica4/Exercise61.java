package Practica4;

import java.util.ArrayList;

public class Exercise61 {
    public static int countItems (ArrayList<String> list){
        int sizeArray = list.size();
        return sizeArray;
    }
    public static void removeFirst(ArrayList<String> list) {
        list.remove(0);
        // removes the first item (indexed 0)
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hallo");
        list.add("Ciao");
        list.add("Hello");
        //removeFirst(list);
        System.out.println("There are this many items in the list:");   System.out.println(countItems(list));
    }
}
