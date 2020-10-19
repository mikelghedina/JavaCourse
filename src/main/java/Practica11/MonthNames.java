package Practica11;

import java.util.ArrayList;

public class MonthNames {
    public static ArrayList<String> monthNames(){
        ArrayList<String> monthNames = new ArrayList<>(11);

        monthNames.add("January");
        monthNames.add("February");
        monthNames.add("March");
        monthNames.add("April");
        monthNames.add("May");
        monthNames.add("June");
        monthNames.add("July");
        monthNames.add("August");
        monthNames.add("September");
        monthNames.add("October");
        monthNames.add("November");
        monthNames.add("December");
        return monthNames;
    }
    public static String getMonthNames(int month){
        int m = monthNames().size();
        for(int i = 0; i <= m; i++){
            if(month == i){
                return monthNames().get(month);
            }
        }
        return "this month doesn't even exist.";
    }
}
