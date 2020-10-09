package Practica8;

import java.util.ArrayList;
import java.util.HashMap;


public class Menu {


    private HashMap <String, ArrayList<String>> weekDays;
    private final String firsts = "Firsts";
    private final String seconds = "Seconds";
    private final String desserts = "Desserts";

    public Menu(HashMap<String, ArrayList<String>> weekDays) {
        this.weekDays = weekDays;
    }


    public HashMap<String, ArrayList<String>> getWeekDays() {
        return weekDays;
    }

    public String getFirsts() {
        return firsts;
    }

    public String getSeconds() {
        return seconds;
    }

    public String getDesserts() {
        return desserts;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "weekDays=" + weekDays +
                '}';
    }
}
