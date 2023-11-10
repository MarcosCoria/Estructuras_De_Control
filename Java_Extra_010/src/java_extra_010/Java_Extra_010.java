/* Ejercicio_10: Realice un programa para que el usuario adivine el resultado de una
multiplicación entre dos números generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta. En
caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java. */
package java_extra_010;

import java.util.Scanner;

/* @author G96xyFast */
public class Java_Extra_010 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // Random tiene un rango de 0-9, pero le sumamos 1 al final y queda rango 1-10
        int a = (int) (Math.random() * 10) + 1;
        int b = (int) (Math.random() * 10) + 1;
        int mult = a * b;
        boolean var = false;
        do {
            System.out.println("Ingrese el resultado de una multiplicación aleatoria: ");
            int resultado = leer.nextInt();
            if (resultado == mult) {
                System.out.println("¡Ganaste! Números originales: " + a + " y " + b);
                var= true;
            } else {
                if (resultado<mult) {
                    System.out.println("El resultado es mayor");
                } else {
                    System.out.println("Es resultado es menor");
                }
            }
        } while (var == false);
    }
}
