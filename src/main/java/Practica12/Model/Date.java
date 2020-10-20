package Practica12.Model;
import java.time.LocalDate;
public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public static void getBirthday(Person person){

        LocalDate currentDate= LocalDate.now();
        System.out.println(person.getBirthDate().day+ person.getBirthDate().month+currentDate.getYear());
    }
    public static int calculateAge(int year){
        int age = LocalDate.now().getYear()-year;
        return age;
    }

    public String printDate(){
        return getDay() + "/" + getMonth() + "/"+ getYear();
    }
    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
