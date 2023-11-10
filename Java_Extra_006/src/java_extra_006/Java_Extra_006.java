/* Ejercicio_06: Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general. */
package java_extra_006;

import java.util.Scanner;

/* @author G96xyFast */
public class Java_Extra_006 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cont1 = 0;
        int cont2 = 0;
        float sum = 0;
        float menores = 0;
        float mayores = 0;
        System.out.println("Ingrese la cantidad de personas: ");
        int cant = leer.nextInt();
        while (cant <= 0) {
            System.out.println("Error. Ingrese una cantidad de personas mayor a 0: ");
            cant = leer.nextInt();
        }
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese altura de la persona Nº" + (i+1)+ ":");
            float altura = leer.nextFloat();
            while (altura<=0) {
                System.out.println("Error. Ingrese la altura de la persona Nº" + (i+1) + ": ");
                altura= leer.nextFloat();
            }
            sum= sum+ altura; // Suma de todas las alturas
            if (altura<1.6) {
                cont1++;
                menores= menores+ altura; // Suma de alturas menores a 1,60
            } else {
                cont2++; 
                mayores= mayores+ altura; // Suma de alturas mayores a 1,60
            }
        }
        System.out.println("Promedio general: " + sum/cant);
        System.out.println("Total menores de 1,60m: " + cont1);
        System.out.println("Total mayores de 1,60m: " + cont2);
        if (cont1>=1) {
            System.out.println("Promedio menores de 1,60m: " + menores/cont1);
        } 
        if(cont2>=1){
            System.out.println("Promedio mayores de 1,60m: " + mayores/cont2);
        }
    }
}
