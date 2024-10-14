//Una tienda desea registrar las ventas realizadas cada día durante una semana. El programa debe calcular el total
// de ventas al final de la semana

import java.util.Scanner;

public class ventas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total=0,venta=0;
        int i = 0;
        do {
            System.out.println("Ingrese las ventas del dia "+(i+1));
            venta = sc.nextDouble();
            total += venta;
            i += 1;
        }while(i<7);
        System.out.println("Total de ventas: "+total);
    }
}


