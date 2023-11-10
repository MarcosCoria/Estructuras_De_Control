/* Ejercicio-11: Escribir un programa que lea un número entero y devuelva el número de
dígitos que componen ese número. Por ejemplo, si introducimos el
número 12345, el programa deberá devolver 5. Calcular la cantidad de
dígitos matemáticamente utilizando el operador de división. Nota:
recordar que las variables de tipo entero truncan los números o
resultados. */
package java_extra_011;

import java.util.Scanner;

/* @author G96xyFast */
public class Java_Extra_011 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número mayor a 0: ");
        int num = leer.nextInt();
        while (num <= 0) {
            System.out.println("Error. Ingrese un número mayor a 0: ");
            num = leer.nextInt();
        }
        int cont = 1; // Mínimamente hay números de 1 dígito
        if (num > 9) {
            do {
                num = (int) num / 10;
                cont++;
            } while (num > 9);
            System.out.println("El número ingresado tiene " + cont + " dígitos");
        } else {
            System.out.println("El número ingresado tiene " + cont + " dígito");
        }
    }
}
