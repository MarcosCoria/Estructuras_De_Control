/* Ejercicio_01: Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas. */
package java_extra_001;

import java.util.Scanner;

/* @author G96xyFast */
public class Java_Extra_001 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de minutos: ");
        int min= leer.nextInt();
        while (min<=0) {
            System.out.println("Error. Ingrese una cantidad de minutos mayor a 0: ");
            min= leer.nextInt();
        }
        int aux=0;
        int horas;
        int dias=0;        
        if (min>=1440) {
            horas= min/60;
            if (horas>=24) {
               dias= horas/24; 
               horas= horas-(24*dias);
            }
        } else {
            horas= min/60;
            aux= min-(60*horas);
        }
        System.out.println("La cantidad de días es: " + dias);
        System.out.println("La cantidad de horas es: " + horas);
        System.out.println("La cantidad de minutos restantes es: " + aux);
    }   
}
