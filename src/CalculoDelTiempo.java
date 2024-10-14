//Un alumno quiere medir el tiempo total que dedica a sus actividades académicas y personales durante el día.
//Instrucciones:
//Pide al usuario que ingrese las horas dedicadas a cada actividad: estudiar, hacer ejercicios, leer, y tiempo libre.
//Usa un bucle para registrar las horas y luego calcula el tiempo total dedicado.

import java.util.Scanner;

public class CalculoDelTiempo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
double horasTotal, horas;
        horasTotal=0;
        horas=0;
        System.out.println("Ingrese la cantidad de horas dedicada a cada actividad (estudiar, hacer ejercicios, leer, y tiempo libre): ");
        for (int i = 0; i < 3; i++){
            System.out .println("Ingrese la cantidad de horas de la actividad n°"+(i+1)+": en formato (1,5) ");
            horas = sc.nextDouble();
            horasTotal= horasTotal+horas;
        }
        System.out.println("la cantidad de horas dedicada a sus actividades es: "+horasTotal);
    }
}
