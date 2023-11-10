/* Ejercicio_07: Realice un programa que calcule y visualice el valor máximo, el valor
mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra
con el bucle “do - while”. */
package java_extra_007;

import java.util.Scanner;

/* @author G96xyFast */
public class Java_Extra_007 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean var= false;
        int cant=0;
        do {
            System.out.println("Ingrese una cantidad de números mayor a 0: ");
            cant= leer.nextInt();
            if (cant>0) {
                var=true;
            } else {
                System.out.print("Error. "); // Se pegar al mensaje siguiente usando sólo 'print'
            }
        } while (var==false);
        int sum= 0;
        int min= 0;
        int max= 0;
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese valor Nº" + (i+1) + ": ");
            int num= leer.nextInt();
            while (num<=0) {
                System.out.println("Error. Ingrese valor Nº" + (i+1) + ": ");
                num= leer.nextInt();
            }
            if (i==0) { // El máximo y el mínimo toman el valor del primer número
                min= num; 
                max= num;
            } else if(num<min) {
                min=num;
            } else if(num>max) {
                max= num;
            }
            sum= sum + num; // Sumatoria
        }
        float general= sum;
        System.out.println("Sumatoria: " + sum);
        System.out.println("Cantidad: " + cant);
        System.out.println("El promedio general es: " + general/cant);
        System.out.println("El mayor de los números es: " + max);
        System.out.println("El menor de los números es: " + min);
    }
}
