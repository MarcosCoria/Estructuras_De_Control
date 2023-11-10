/* Ejercicio_14: Escriba un programa que pida la cantidad de
familias, y para cada familia la cantidad de hijos, y averiguar la media
de edad de los hijos de todas las familias. */
package java_extra_014;

import java.util.Scanner;

/* @author G96xyFast */
public class Java_Extra_014 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias: ");
        int cant= leer.nextInt();
        int edadGeneral= 0;
        int cont= 0;
        while (cant<=0) {
            System.out.println("Error. Ingrese la cantidad de familias: ");
            cant= leer.nextInt();
        }
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese la cantidad de hijos de la familia Nº" + (i+1) +": ");
            int hijos= leer.nextInt();
            while (hijos<=0) {
                System.out.println("Error. Ingrese la cantidad de hijos de la familia Nº" + (i+1) +": ");
                hijos= leer.nextInt();
            }
            for (int j = 0; j < hijos; j++) {
                System.out.println("Ingrese la edad del hijo Nº" + (j+1) + ": ");
                int edad= leer.nextInt();
                while (edad<=0) {
                    System.out.println("Error. Ingrese la edad del hijo Nº" + (j+1) + ": ");
                    edad= leer.nextInt();
                }
                edadGeneral= edadGeneral + edad;
                cont++;
            }
        }
        System.out.println("Total de hijos: " + cont);
        System.out.println("Suma de las edades: " + edadGeneral);
        System.out.println("El promedio de la edad de todos los hijos es: " + edadGeneral/cont);
    }   
}