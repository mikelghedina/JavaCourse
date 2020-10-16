package Practica11;


public class Utils {


    public static void readDate(int  day, int  month, int year){

        int weekDay = calculateDays(day, month, year)% 7;
        System.out.println(weekDay);
        if(weekDay == 1){
            System.out.println(WeekDays.weekDaysNames().get(6)+"/"+Months.monthNames().get(0)+"/"+year);
        }else if (weekDay == 2){
            System.out.println(WeekDays.weekDaysNames().get(0)+"/"+Months.monthNames().get(1)+"/"+year);
        }else if (weekDay == 3){
            System.out.println(WeekDays.weekDaysNames().get(1)+"/"+Months.monthNames().get(2)+"/"+year);
        }else if (weekDay == 4){
            System.out.println(WeekDays.weekDaysNames().get(2)+"/"+Months.monthNames().get(3)+"/"+year);
        }else if (weekDay == 5){
            System.out.println(WeekDays.weekDaysNames().get(3)+"/"+Months.monthNames().get(4)+"/"+year);
        }else if (weekDay == 6){
            System.out.println(WeekDays.weekDaysNames().get(4)+"/"+Months.monthNames().get(5)+"/"+year);
        }else{
            System.out.println(WeekDays.weekDaysNames().get(5)+"/"+Months.monthNames().get(6)+"/"+year);
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
        if(year>=InitialDate.year){
            int differenceYears = year-InitialDate.year;
            totalYearsInDays = differenceYears *365;
        }
        if(month>=InitialDate.month){
            int differenceMonth = month-InitialDate.month;
            totalMonthsInDays = differenceMonth*30;
        }
        if(day>= InitialDate.day){
            differenceDays = day-InitialDate.day;
        }
        return totalYearsInDays + totalMonthsInDays + differenceDays;
    }
    public static int leapYear(int year){

        if(year%2 == 0 && year%100==0|| year%4 == 0){
            return year;
        }else{
            return 0;
        }
    }

}
