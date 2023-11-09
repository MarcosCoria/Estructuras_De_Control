/* Ejercicio_01: Crear un programa que dado un número determine si es par o impar. */
package java_001;

import java.util.Scanner;

/* @author G96xyFast */
public class Java_001 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num= leer.nextInt();
        if (num%2==0) {
            System.out.println("EL número ingresado es par");
        } else {
            System.out.println("El número ingresado es impar");
        }
    }   
}
