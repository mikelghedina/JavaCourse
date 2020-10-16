package Practica11;

import java.util.ArrayList;

public class WeekDays {

    public static ArrayList<String> weekDaysNames(){
        ArrayList<String> weekdays = new ArrayList<>(6);

        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");
        weekdays.add("Saturday");
        weekdays.add("Sunday");
        return weekdays;
    }
}
