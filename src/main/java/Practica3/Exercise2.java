package Practica3;

import java.util.Scanner;

public class Exercise2 {

    public static int triangle (int lado1, int lado2, int lado3){
        int result = lado1 + lado2 + lado3;
        return result;
    }
    public static int rectangle (int base, int alt){
        int result = 2 * base + 2 * alt;
        return result;
    }
    public static int quadrat( int alt){
        int result = 4 * alt;
        return result;
    }
    public static int resultatQuadrat(int altura){
        int resultQuadrat = quadrat(altura);
        System.out.println("El perímetre del triangle és: " + resultQuadrat);
        return resultQuadrat;
    }
    public static int resultatRectangle(int base, int altura){
        int resultRectangle = rectangle(base, altura);
        System.out.println("El perímetre del rectangle és: " + resultRectangle);
        return resultRectangle;
    }
    public static int resultatTriangle(int lado1,int lado2,int lado3){
        int resultTriangle = triangle(lado1,lado2,lado3);
        System.out.println("El perímetre d'aquest triangle és: " + resultTriangle);
        return resultTriangle;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Tria i escriu la forma geomètrica que vulguis calcular el seu perímetre: quadrat, rectangle, triangle");
        System.out.println("Si vols marxar, escriu: quit");

        String form = scan.nextLine();

        while(true){
            if(form.equals("quadrat")){
                //P= 4a
                System.out.println("Introdueix l'altura del quadrat: ");
                int altura = Integer.parseInt(scan.nextLine());
                resultatQuadrat(altura);
                break;

            }else if(form.equals("rectangle")){
                //P = 2b + 2h
                System.out.println("Introduiex la base del rectangle: ");
                int base = Integer.parseInt(scan.nextLine());
                System.out.println("Introdueix l'altura del rectangle: ");
                int altura = Integer.parseInt(scan.nextLine());

                resultatRectangle(base, altura);
                break;

            }else if(form.equals("triangle")){
                //P = l + m + n
                System.out.println("Introdueix els costats del triangle: ");
                int lado1 = Integer.parseInt(scan.nextLine());
                int lado2 = Integer.parseInt(scan.nextLine());
                int lado3 = Integer.parseInt(scan.nextLine());

                resultatTriangle(lado1, lado2, lado3);
                break;

            }else if(form.equals("quit")){
                System.out.println("Adeu");
                break;

            }else{
                System.out.println("Escriu correctament la forma geomètrica");
            }
        }

    }
}
