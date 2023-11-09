/* Ejercicio_05: Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial. */
package java_005;

import java.util.Scanner;

/* @author G96xyFast */
public class Java_005 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un límite positivo mayor a 0: ");
        int limite = leer.nextInt();
        while (limite <= 0) {
            System.out.println("Error. Ingrese un límite positivo mayor a 0: ");
            limite = leer.nextInt();
        }
        int sumatoria = 0;
        while (sumatoria <= limite) {
            System.out.println("Ingrese números para la sumatoria: ");
            int num = leer.nextInt();
            sumatoria = sumatoria + num;
        }
        System.out.println("Límite original: " + limite + "\nResultado suatoria: " + sumatoria);
    }
}
