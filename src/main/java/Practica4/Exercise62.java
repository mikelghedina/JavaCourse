package Practica4;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise62 {
    public static void removeLast(ArrayList<String> list){
        int lastPositionList = list.size() -1;
        list.remove(lastPositionList);
    }
    public static void main(String[] args) {
        ArrayList<String> brothers = new ArrayList<>();
        brothers.add("Dick");
        brothers.add("Henry");
        brothers.add("Michael");
        brothers.add("Bob");
        System.out.println("brothers:");
        System.out.println(brothers);

        Collections.sort(brothers);
        removeLast(brothers);

        System.out.println(brothers);

    }
}
