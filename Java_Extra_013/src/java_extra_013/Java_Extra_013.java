/* Ejercicio_13: Crear un programa que dibuje una escalera de números, donde cada
línea de números comience en uno y termine en el número de la línea.
Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se
ingresa el número 3:
1
12
123 */
package java_extra_013;

import java.util.Scanner;

/* @author G96xyFast */
public class Java_Extra_013 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num= leer.nextInt();
        while (num<=0) {
            System.out.println("Error. Ingrese un número: ");
            num= leer.nextInt();
        }
        String aux= "";
        for (int i = 1; i < (num+1); i++) {
            aux= aux+ i;
            System.out.println(aux);
        }
    }    
}
