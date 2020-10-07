package Practica3;

public class Exercise46 {

    public static double average(int number1, int number2, int number3, int number4)
    { // write your code here }

        double resultSum = sum(number1, number2, number3, number4) / 4.0;

        return resultSum;

    }
    public static int sum(int number1, int number2, int number3, int number4) {

        int result = number1 + number2 + number3 + number4;
        return result;
    }
    public static void main (String[]args){

        double answer = average(4, 3, 6, 1);
        System.out.println("average: " + answer);

    }
}