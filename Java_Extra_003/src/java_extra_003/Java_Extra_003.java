/* Ejercicio_03: Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
la función equals() de la clase String. */
package java_extra_003;

import java.util.Scanner;

/* @author G96xyFast */
public class Java_Extra_003 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un carácter: ");
        String letra= leer.nextLine();
        while (letra.length()>1 || letra.equals("") |letra.equals(" ")) {
            System.out.println("Error. Ingrese un carácter: ");
            letra=leer.nextLine();
        }
        char caracter= letra.toLowerCase().charAt(0);
        if (caracter=='a' || caracter=='e' || caracter=='i' || caracter=='o' || caracter=='u') {
            System.out.println(letra + " es una vocal");
        } else {
            System.out.println(letra + " no es una vocal");
        }
    }    
}
