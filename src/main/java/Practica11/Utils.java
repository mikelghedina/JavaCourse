package Practica11;


import java.util.ArrayList;

public class Utils {


    public static void readDate(int  day, int  month, int year){

        int weekDay = calculateDays(day, month, year)% 7;
        System.out.println(weekDay);

        if(weekDay == year){
            System.out.println(WeekDays.weekDaysNames().get(6)+"/"+getMonthNames(month)+"/"+year);
        }else if (weekDay == 2){
            System.out.println(WeekDays.weekDaysNames().get(0)+"/"+getMonthNames(month)+"/"+year);
        }else if (weekDay == 3){
            System.out.println(WeekDays.weekDaysNames().get(1)+"/"+getMonthNames(month)+"/"+year);
        }else if (weekDay == 4){
            System.out.println(WeekDays.weekDaysNames().get(2)+"/"+getMonthNames(month)+"/"+year);
        }else if (weekDay == 5){
            System.out.println(WeekDays.weekDaysNames().get(3)+"/"+getMonthNames(month)+"/"+year);
        }else if (weekDay == 6){
            System.out.println(WeekDays.weekDaysNames().get(4)+"/"+getMonthNames(month)+"/"+year);
        }else{
            System.out.println(WeekDays.weekDaysNames().get(5)+"/"+getMonthNames(month)+"/"+year);
        }


    }
    public static int checkDate(int day, int month, int year){
        if(day>=InitialDate.day && day<=30 && month>=InitialDate.month && month<=12 && year>=InitialDate.year){
            return 1;
        }else{
            return 0;
        }
    }

    public static int calculateDays (int day, int month, int year){
        int totalYearsInDays = 0;
        int totalMonthsInDays = 0;
        int differenceDays = 0;
        if(checkDate(day, month, year)==1){
            int differenceYears = year-InitialDate.year;
            totalYearsInDays = differenceYears *365;
            int differenceMonth = month-InitialDate.month;
            totalMonthsInDays = differenceMonth*30;
            differenceDays = day-InitialDate.day;
        }
        if(checkDate(day, month, year)==1 && leapYear(year)==year){
            int differenceYears = year-InitialDate.year;
            totalYearsInDays = differenceYears *366;
        }
        return totalYearsInDays + totalMonthsInDays + differenceDays;
    }

    public static int leapYear(int year){

        if(year%2 == 0 && year%100!=0|| year%4 == 0){
            return year;
        }else{
            return 0;
        }
    }
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
