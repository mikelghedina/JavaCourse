package Practica3;

public class Exercise44 {
    public static int least(int number1, int number2) {

// write program code here
// do not print anything inside the method
// method needs a return in the end
        if(number1 < number2){
           return number1;
        }else if(number1 < number2){
            return number2;
        }else{
            return number1;
        }
    }

    public static void main(String[] args) {

        int answer = least(2, 7);

        System.out.println("Least: " + answer);

    }

}
